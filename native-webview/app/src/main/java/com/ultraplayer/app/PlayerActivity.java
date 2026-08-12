package com.ultraplayer.app;

import android.app.Activity;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import org.json.JSONObject;

public final class PlayerActivity extends Activity {
    private VideoView video;
    private TextView title;
    private TextView error;
    private String url = "";
    private long resumeMs = 0L;

    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        getWindow().setNavigationBarColor(Color.BLACK);

        parsePayload(getIntent().getStringExtra("payload"));
        if (url.isEmpty()) { finish(); return; }

        FrameLayout root = new FrameLayout(this);
        root.setBackgroundColor(Color.BLACK);
        video = new VideoView(this);
        video.setBackgroundColor(Color.BLACK);
        root.addView(video, new FrameLayout.LayoutParams(-1, -1));

        title = new TextView(this);
        title.setTextColor(Color.WHITE);
        title.setTextSize(15);
        title.setMaxLines(2);
        title.setPadding(22, 18, 22, 10);
        title.setBackgroundColor(0x88000000);
        FrameLayout.LayoutParams titleParams = new FrameLayout.LayoutParams(-1, -2, Gravity.TOP);
        root.addView(title, titleParams);

        error = new TextView(this);
        error.setTextColor(Color.WHITE);
        error.setTextSize(16);
        error.setGravity(Gravity.CENTER);
        error.setPadding(36, 20, 36, 20);
        error.setVisibility(View.GONE);
        FrameLayout.LayoutParams errorParams = new FrameLayout.LayoutParams(-1, -2, Gravity.CENTER);
        root.addView(error, errorParams);

        setContentView(root);
        title.setText(getIntentTitle());
        MediaController controls = new MediaController(this);
        controls.setAnchorView(video);
        video.setMediaController(controls);
        video.setVideoURI(Uri.parse(url));
        video.setOnPreparedListener(mp -> {
            if (resumeMs > 0) {
                try { mp.seekTo((int) Math.min(resumeMs, Integer.MAX_VALUE)); } catch (Throwable ignored) { }
            }
            video.start();
        });
        video.setOnCompletionListener(mp -> finish());
        video.setOnErrorListener((mp, what, extra) -> {
            error.setText("Não foi possível reproduzir este conteúdo.\nVerifique a lista ou tente novamente.");
            error.setVisibility(View.VISIBLE);
            return true;
        });
        video.requestFocus();
    }

    private void parsePayload(String payload) {
        try {
            JSONObject json = new JSONObject(payload == null ? "{}" : payload);
            url = json.optString("url", "").trim();
            long resume = json.optLong("resume", 0L);
            // O WebView trabalha em segundos; VideoView/MediaPlayer usa milissegundos.
            resumeMs = resume > 0 && resume < 10_000_000 ? resume * 1000L : resume;
        } catch (Throwable ignored) { }
    }

    private String getIntentTitle() {
        try {
            JSONObject json = new JSONObject(getIntent().getStringExtra("payload") == null ? "{}" : getIntent().getStringExtra("payload"));
            return json.optString("title", "UltraPlayer");
        } catch (Throwable ignored) { return "UltraPlayer"; }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK || keyCode == KeyEvent.KEYCODE_ESCAPE) {
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onPause() {
        if (video != null && video.isPlaying()) video.pause();
        super.onPause();
    }
}

package com.ultraplayer.app;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.ui.PlayerView;

import org.json.JSONObject;

import java.util.Locale;

public final class PlayerActivity extends Activity {
    private ExoPlayer player;
    private PlayerView playerView;
    private TextView title;
    private TextView error;
    private String url = "";
    private String mediaTitle = "Fusion";
    private long resumeMs = 0L;
    private boolean liveContent = false;

    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        getWindow().setNavigationBarColor(Color.BLACK);
        applySavedOrientation();
        hideSystemUi();

        parsePayload(getIntent().getStringExtra("payload"));
        if (url.isEmpty()) { finish(); return; }

        FrameLayout root = new FrameLayout(this);
        root.setBackgroundColor(Color.BLACK);

        playerView = new PlayerView(this);
        playerView.setUseController(true);
        playerView.setControllerShowTimeoutMs(4500);
        playerView.setControllerHideOnTouch(true);
        playerView.setShowBuffering(PlayerView.SHOW_BUFFERING_ALWAYS);
        playerView.setResizeMode(androidx.media3.ui.AspectRatioFrameLayout.RESIZE_MODE_FIT);
        root.addView(playerView, new FrameLayout.LayoutParams(-1, -1));

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
        error.setBackgroundColor(0xCC07110D);
        error.setVisibility(View.GONE);
        FrameLayout.LayoutParams errorParams = new FrameLayout.LayoutParams(-1, -2, Gravity.CENTER);
        errorParams.leftMargin = 32;
        errorParams.rightMargin = 32;
        root.addView(error, errorParams);

        setContentView(root);
        title.setText(mediaTitle);
        preparePlayer();
    }

    private void applySavedOrientation() {
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        } catch (Throwable ignored) { }
    }

    private void preparePlayer() {
        DefaultHttpDataSource.Factory http = new DefaultHttpDataSource.Factory()
                .setUserAgent("Fusion/1.4")
                .setAllowCrossProtocolRedirects(true)
                .setConnectTimeoutMs(12000)
                .setReadTimeoutMs(25000);
        DefaultDataSource.Factory data = new DefaultDataSource.Factory(this, http);
        player = new ExoPlayer.Builder(this)
                .setLoadControl(new FusionLoadControl(liveContent))
                .setMediaSourceFactory(new DefaultMediaSourceFactory(data))
                .build();
        playerView.setPlayer(player);
        player.addListener(new Player.Listener() {
            @Override
            public void onPlaybackStateChanged(int playbackState) {
                if (playbackState == Player.STATE_READY) {
                    error.setVisibility(View.GONE);
                    if (resumeMs > 0) player.seekTo(resumeMs);
                    player.play();
                } else if (playbackState == Player.STATE_ENDED) {
                    finish();
                }
            }

            @Override
            public void onPlayerError(PlaybackException playbackException) {
                String detail = playbackException.getMessage();
                if (detail == null || detail.length() == 0) detail = "Formato ou servidor não suportado.";
                error.setText("Não foi possível reproduzir este conteúdo.\n" + detail + "\n\nVolte e tente outro canal.");
                error.setVisibility(View.VISIBLE);
            }
        });

        MediaItem.Builder item = new MediaItem.Builder().setUri(Uri.parse(url));
        String low = url.toLowerCase(Locale.US);
        if (low.contains(".m3u8") || low.contains("m3u8")) item.setMimeType(MimeTypes.APPLICATION_M3U8);
        else if (low.contains(".mpd") || low.contains("manifest")) item.setMimeType(MimeTypes.APPLICATION_MPD);
        player.setMediaItem(item.build());
        player.prepare();
    }

    private void hideSystemUi() {
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
    }

    private void parsePayload(String payload) {
        try {
            JSONObject json = new JSONObject(payload == null ? "{}" : payload);
            url = json.optString("url", "").trim();
            mediaTitle = json.optString("title", "Fusion");
            liveContent = "live".equalsIgnoreCase(json.optString("kind", ""))
                    || "live".equalsIgnoreCase(json.optString("zxKind", ""));
            long resume = json.optLong("resume", 0L);
            resumeMs = resume > 0 && resume < 10_000_000 ? resume * 1000L : resume;
        } catch (Throwable ignored) { }
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
    protected void onDestroy() {
        if (player != null) {
            player.release();
            player = null;
        }
        super.onDestroy();
    }
}

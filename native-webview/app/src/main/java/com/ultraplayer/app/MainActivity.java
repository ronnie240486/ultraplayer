package com.ultraplayer.app;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.speech.RecognizerIntent;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ImageButton;
import android.graphics.drawable.GradientDrawable;

import androidx.core.content.FileProvider;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.common.PlaybackException;
import androidx.media3.ui.PlayerView;

import org.json.JSONObject;

public final class MainActivity extends Activity {
    private WebView webView;
    private FrameLayout root;
    private View splash;
    private boolean isTv;
    private FrameLayout miniContainer;
    private PlayerView miniPlayerView;
    private ExoPlayer miniPlayer;
    private TextView miniTitle;
    private ImageButton miniCloseButton;
    private View miniExpandHit;
    private android.widget.LinearLayout fullControls;
    private android.widget.Button fullMenuButton;
    private FrameLayout fullChannelMenu;
    private android.widget.LinearLayout fullCategoryBar;
    private android.widget.LinearLayout fullChannelList;
    private final java.util.ArrayList<JSONObject> fullChannelItems = new java.util.ArrayList<>();
    private TextView fullZoomLabel;
    private String fullSelectedCategory = "Todos";
    private float fullZoom = 1.0f;
    private String miniPayload = "";
    private boolean miniExpanded = false;
    private boolean keepMiniAfterFull = true;
    private long lastRootBackAt = 0L;
    private String miniSourceUrl = "";
    private boolean miniTsRetryUsed = false;
    private float miniVolume = 1.0f;
    private boolean miniMuted = false;
    private FrameLayout.LayoutParams miniLayoutBeforeExpand;
    private static final int VOICE_REQUEST = 7412;
    private static final int VOICE_PERMISSION_REQUEST = 7413;
    private static final int UPDATE_INSTALL_REQUEST = 7414;
    private java.io.File pendingInstallApk;

    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setStatusBarColor(android.graphics.Color.rgb(11, 15, 26));
        getWindow().setNavigationBarColor(android.graphics.Color.rgb(11, 15, 26));
        getWindow().setSoftInputMode(android.view.WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE);

        isTv = detectTv();
        applySavedOrientation();
        root = new FrameLayout(this);
        root.setBackgroundColor(android.graphics.Color.rgb(11, 15, 26));

        webView = new WebView(this);
        webView.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        configureWebView(webView);
        root.addView(webView);
        setupMiniPlayer();

        splash = createSplash();
        root.addView(splash, new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        setContentView(root);

        if (state != null) {
            webView.restoreState(state);
        } else {
            webView.loadUrl("file:///android_asset/webui/index.html");
        }
    }

    private void applySavedOrientation() {
        // Os dois modos usam sempre paisagem. O form_factor controla apenas a escala visual.
        applyOrientation("landscape");
    }

    private void applyOrientation(String mode) {
        try {
            setRequestedOrientation(android.content.pm.ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        } catch (Throwable ignored) { }
    }

    private boolean detectTv() {
        try {
            int mode = getResources().getConfiguration().uiMode & Configuration.UI_MODE_TYPE_MASK;
            return mode == Configuration.UI_MODE_TYPE_TELEVISION
                    || getPackageManager().hasSystemFeature("android.software.leanback")
                    || getPackageManager().hasSystemFeature("android.hardware.type.television");
        } catch (Throwable ignored) {
            return false;
        }
    }

    private void configureWebView(WebView view) {
        WebSettings s = view.getSettings();
        s.setJavaScriptEnabled(true);
        s.setDomStorageEnabled(true);
        s.setDatabaseEnabled(true);
        s.setAllowFileAccess(true);
        s.setAllowContentAccess(true);
        s.setAllowFileAccessFromFileURLs(true);
        s.setAllowUniversalAccessFromFileURLs(true);
        s.setMediaPlaybackRequiresUserGesture(false);
        s.setLoadWithOverviewMode(true);
        s.setUseWideViewPort(true);
        s.setBuiltInZoomControls(false);
        s.setDisplayZoomControls(false);
        s.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        s.setCacheMode(WebSettings.LOAD_DEFAULT);
        s.setUserAgentString("Fusion/1.3 (FusionWebView)");
        view.setBackgroundColor(android.graphics.Color.rgb(11, 15, 26));
        view.setWebChromeClient(new WebChromeClient());
        view.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView v, String url) {
                v.evaluateJavascript("try{window.__ULTRAPLAYER_NATIVE=true;window.__FUSION_NATIVE=true}catch(e){}", null);
                if (splash != null) {
                    splash.animate().alpha(0f).setDuration(300).withEndAction(() -> {
                        if (root != null && splash != null) root.removeView(splash);
                        splash = null;
                    }).start();
                }
            }

            @Override
            public void onReceivedError(WebView v, WebResourceRequest request, WebResourceError error) {
                if (request != null && request.isForMainFrame()) {
                    v.loadUrl("file:///android_asset/webui/index.html");
                }
            }
        });
        WebBridge bridge = new WebBridge(this);
        view.addJavascriptInterface(bridge, "Android");
        view.addJavascriptInterface(bridge, "HdxNative");
    }

    private View createSplash() {
        FrameLayout overlay = new FrameLayout(this);
        overlay.setBackgroundColor(android.graphics.Color.rgb(11, 15, 26));
        android.widget.LinearLayout box = new android.widget.LinearLayout(this);
        box.setOrientation(android.widget.LinearLayout.VERTICAL);
        box.setGravity(android.view.Gravity.CENTER_HORIZONTAL);
        android.widget.ImageView logo = new android.widget.ImageView(this);
        logo.setImageResource(R.drawable.fusion_logo);
        logo.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        android.widget.LinearLayout.LayoutParams lp = new android.widget.LinearLayout.LayoutParams(dp(150), dp(150));
        lp.bottomMargin = 18;
        box.addView(logo, lp);
        TextView title = new TextView(this);
        title.setText("Fusion");
        title.setTextColor(android.graphics.Color.rgb(245, 248, 247));
        title.setTextSize(28);
        title.setTypeface(android.graphics.Typeface.DEFAULT, android.graphics.Typeface.BOLD);
        title.setGravity(android.view.Gravity.CENTER);
        box.addView(title, new android.widget.LinearLayout.LayoutParams(-2, -2));
        ProgressBar progress = new ProgressBar(this);
        android.widget.LinearLayout.LayoutParams pp = new android.widget.LinearLayout.LayoutParams(42, 42);
        pp.topMargin = 22;
        box.addView(progress, pp);
        FrameLayout.LayoutParams bp = new FrameLayout.LayoutParams(-2, -2, android.view.Gravity.CENTER);
        overlay.addView(box, bp);
        return overlay;
    }

    public final class WebBridge {
        private final Context context;
        WebBridge(Context context) { this.context = context; }

        @JavascriptInterface
        public String deviceId() {
            try {
                String id = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);
                return id == null ? "" : id;
            } catch (Throwable ignored) { return ""; }
        }

        @JavascriptInterface
        public String appMac() {
            try {
                String seed = deviceId();
                java.security.MessageDigest digest = java.security.MessageDigest.getInstance("SHA-256");
                byte[] hash = digest.digest(seed.getBytes(java.nio.charset.StandardCharsets.UTF_8));
                hash[0] = (byte) ((hash[0] | 0x02) & 0xFE);
                StringBuilder mac = new StringBuilder(17);
                for (int i = 0; i < 6; i++) {
                    if (i > 0) mac.append(':');
                    mac.append(String.format(java.util.Locale.US, "%02X", hash[i] & 0xFF));
                }
                return mac.toString();
            } catch (Throwable ignored) { return "02:00:00:00:00:01"; }
        }

        @JavascriptInterface
        public boolean isTv() { return isTv; }

        @JavascriptInterface
        public String getTmdbApiKey() { return BuildConfig.TMDB_API_KEY == null ? "" : BuildConfig.TMDB_API_KEY; }

        @JavascriptInterface
        public void startVoice() {
            runOnUiThread(() -> {
                try {
                    if (android.os.Build.VERSION.SDK_INT >= 23 && checkSelfPermission(Manifest.permission.RECORD_AUDIO) != android.content.pm.PackageManager.PERMISSION_GRANTED) {
                        requestPermissions(new String[]{Manifest.permission.RECORD_AUDIO}, VOICE_PERMISSION_REQUEST);
                    } else {
                        launchVoiceRecognizer();
                    }
                } catch (Throwable ignored) { sendVoiceError(); }
            });
        }

        @JavascriptInterface
        public void retry() {
            runOnUiThread(() -> { if (webView != null) webView.reload(); });
        }

        @JavascriptInterface
        public void miniPlay(String payload) {
            runOnUiThread(() -> showMiniPlayer(payload, true));
        }

        @JavascriptInterface
        public void miniStop() {
            runOnUiThread(() -> hideMiniPlayer());
        }

        @JavascriptInterface
        public void miniPause() {
            runOnUiThread(() -> { if (miniPlayer != null) miniPlayer.pause(); });
        }

        @JavascriptInterface
        public void miniResume() {
            runOnUiThread(() -> { if (miniPlayer != null) miniPlayer.play(); });
        }

        @JavascriptInterface
        public void miniMute() {
            runOnUiThread(() -> {
                if (miniPlayer == null) return;
                if (!miniMuted) {
                    float current = miniPlayer.getVolume();
                    if (current > 0.01f) miniVolume = current;
                    miniMuted = true;
                    miniPlayer.setVolume(0.0f);
                } else {
                    miniMuted = false;
                    miniPlayer.setVolume(Math.max(0.05f, Math.min(1.0f, miniVolume)));
                }
            });
        }

        @JavascriptInterface
        public void miniVolumeUp() {
            runOnUiThread(() -> {
                if (miniPlayer == null) return;
                miniMuted = false;
                miniVolume = Math.min(1.0f, Math.max(0.05f, miniPlayer.getVolume() + 0.10f));
                miniPlayer.setVolume(miniVolume);
            });
        }

        @JavascriptInterface
        public void miniVolumeDown() {
            runOnUiThread(() -> {
                if (miniPlayer == null) return;
                miniMuted = false;
                miniVolume = Math.max(0.0f, miniPlayer.getVolume() - 0.10f);
                miniPlayer.setVolume(miniVolume);
            });
        }

        @JavascriptInterface
        public void miniFullscreen() {
            runOnUiThread(() -> { if (miniPlayer != null && miniContainer != null && miniContainer.getVisibility() == View.VISIBLE) openFullMiniPlayer(); });
        }

        @JavascriptInterface
        public void setFormFactor(String mode) {
            runOnUiThread(() -> {
                String normalized = "tv".equalsIgnoreCase(mode) ? "tv" : "mobile";
                try { getSharedPreferences("ultraplayer", MODE_PRIVATE).edit().putString("form_factor", normalized).apply(); } catch (Throwable ignored) { }
                        applyOrientation(normalized);
                        resizeMiniPlayer("tv".equalsIgnoreCase(normalized));
            });
        }

        @JavascriptInterface
        public void setMiniBounds(String payload) {
            runOnUiThread(() -> {
                try {
                    JSONObject json = new JSONObject(payload == null ? "{}" : payload);
                    resizeMiniPlayerBounds(
                            json.optDouble("left", 0),
                            json.optDouble("top", 0),
                            json.optDouble("width", 0),
                            json.optDouble("height", 0),
                            json.optDouble("scale", 1.0)
                    );
                } catch (Throwable ignored) { }
            });
        }

        @JavascriptInterface
        public void fetchText(String url, String requestId) {
            final String target = url == null ? "" : url;
            final String id = requestId == null ? "" : requestId;
            new Thread(() -> {
                boolean ok = false;
                String body = "";
                java.net.HttpURLConnection connection = null;
                try {
                    java.net.URL parsed = new java.net.URL(target);
                    java.net.URLConnection raw = parsed.openConnection();
                    if (!(raw instanceof java.net.HttpURLConnection)) throw new java.io.IOException("unsupported_protocol");
                    connection = (java.net.HttpURLConnection) raw;
                    connection.setInstanceFollowRedirects(true);
                    connection.setConnectTimeout(12000);
                    connection.setReadTimeout(20000);
                    connection.setRequestProperty("User-Agent", "Fusion/1.3");
                    connection.setRequestProperty("Accept", "application/vnd.apple.mpegurl,text/plain,*/*");
                    int status = connection.getResponseCode();
                    java.io.InputStream stream = status >= 400 ? connection.getErrorStream() : connection.getInputStream();
                    if (stream == null) throw new java.io.IOException("empty_response");
                    java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
                    byte[] buffer = new byte[8192];
                    int read; long total = 0;
                    while ((read = stream.read(buffer)) != -1 && total < 12L * 1024L * 1024L) { out.write(buffer, 0, read); total += read; }
                    stream.close();
                    body = out.toString("UTF-8");
                    ok = status >= 200 && status < 300 && body.indexOf("#EXTINF") >= 0;
                } catch (Throwable ignored) {
                    ok = false;
                } finally {
                    if (connection != null) connection.disconnect();
                }
                final boolean result = ok;
                final String resultBody = body;
                runOnUiThread(() -> {
                    if (webView == null) return;
                    String script = "try{window.__zxPlaylistResult(" + JSONObject.quote(id) + "," + result + "," + JSONObject.quote(resultBody) + ")}catch(e){}";
                    webView.evaluateJavascript(script, null);
                });
            }, "Fusion-M3U").start();
        }

        @JavascriptInterface
        public void openTrailer(String url, String title) {
            final String target = url == null ? "" : url.trim();
            if (target.isEmpty() || !(target.startsWith("https://") || target.startsWith("http://"))) return;
            runOnUiThread(() -> {
                try {
                    Intent intent = new Intent(MainActivity.this, TrailerActivity.class);
                    intent.putExtra("url", target);
                    intent.putExtra("title", title == null ? "" : title);
                    startActivity(intent);
                } catch (Throwable ignored) { }
            });
        }

        @JavascriptInterface
        public void updateApp(String url) {
            final String target = url == null ? "" : url.trim();
            runOnUiThread(() -> beginApkUpdate(target));
        }

        @JavascriptInterface
        public void openUrl(String url) {
            final String target = url == null ? "" : url.trim();
            if (target.isEmpty() || !(target.startsWith("https://") || target.startsWith("http://"))) return;
            runOnUiThread(() -> {
                try {
                    Intent intent = new Intent(MainActivity.this, TrailerActivity.class);
                    intent.putExtra("url", target);
                    startActivity(intent);
                } catch (Throwable ignored) { }
            });
        }

        @JavascriptInterface
        public void play(String payload) {
            runOnUiThread(() -> {
                try {
                    JSONObject json = new JSONObject(payload == null ? "{}" : payload);
                    if (!json.optString("url", "").isEmpty()) {
                        showMiniPlayer(json.toString(), false);
                        openFullMiniPlayer();
                    }
                } catch (Throwable ignored) { }
            });
        }
    }

    private void setupMiniPlayer() {
        miniContainer = new FrameLayout(this);
        miniContainer.setVisibility(View.GONE);
        miniContainer.setBackgroundColor(android.graphics.Color.rgb(4, 12, 9));
        miniContainer.setElevation(24f);
        miniContainer.setClickable(true);
        miniContainer.setOnClickListener(v -> openFullMiniPlayer());

        miniPlayerView = new PlayerView(this);
        miniPlayerView.setUseController(false);
        miniPlayerView.setShowBuffering(PlayerView.SHOW_BUFFERING_WHEN_PLAYING);
        miniPlayerView.setBackgroundColor(android.graphics.Color.BLACK);
        miniPlayerView.setContentDescription("Abrir player em tela cheia");
        miniPlayerView.setClickable(true);
        miniPlayerView.setOnClickListener(v -> openFullMiniPlayer());
        miniContainer.addView(miniPlayerView, new FrameLayout.LayoutParams(-1, -1));

        miniExpandHit = new View(this);
        miniExpandHit.setContentDescription("Abrir player em tela cheia");
        miniExpandHit.setBackgroundColor(android.graphics.Color.TRANSPARENT);
        miniExpandHit.setOnClickListener(v -> openFullMiniPlayer());
        miniContainer.addView(miniExpandHit, new FrameLayout.LayoutParams(-1, -1));
        createFullPlayerOverlays();

        miniTitle = new TextView(this);
        miniTitle.setTextColor(android.graphics.Color.WHITE);
        miniTitle.setTextSize(12f);
        miniTitle.setTypeface(android.graphics.Typeface.DEFAULT, android.graphics.Typeface.BOLD);
        miniTitle.setSingleLine(true);
        miniTitle.setEllipsize(android.text.TextUtils.TruncateAt.END);
        miniTitle.setPadding(12, 6, 44, 6);
        miniTitle.setBackgroundColor(0x99000000);
        FrameLayout.LayoutParams titleParams = new FrameLayout.LayoutParams(-1, -2, android.view.Gravity.TOP);
        miniContainer.addView(miniTitle, titleParams);

        ImageButton close = new ImageButton(this);
        miniCloseButton = close;
        close.setImageDrawable(new android.graphics.drawable.ColorDrawable(android.graphics.Color.TRANSPARENT));
        close.setContentDescription("Fechar mini player");
        close.setOnClickListener(v -> hideMiniPlayer());
        close.setBackground(makeRoundBackground(0xAA000000, 0x99FFFFFF, 1, 18));
        close.setImageResource(android.R.drawable.ic_menu_close_clear_cancel);
        close.setColorFilter(android.graphics.Color.WHITE);
        FrameLayout.LayoutParams closeParams = new FrameLayout.LayoutParams(42, 42, android.view.Gravity.TOP | android.view.Gravity.RIGHT);
        closeParams.topMargin = 4; closeParams.rightMargin = 4;
        miniContainer.addView(close, closeParams);

        root.addView(miniContainer);
        resizeMiniPlayer(isTv);
    }

    private int dp(int value) {
        return Math.round(value * getResources().getDisplayMetrics().density);
    }

    private android.widget.Button fullButton(String label, String description) {
        android.widget.Button b = new android.widget.Button(this);
        b.setText(label);
        b.setContentDescription(description);
        b.setTextColor(android.graphics.Color.WHITE);
        b.setTextSize(12f);
        b.setAllCaps(false);
        b.setMinHeight(dp(42));
        b.setMinWidth(dp(48));
        b.setPadding(dp(8), 0, dp(8), 0);
        b.setBackground(makeRoundBackground(0xCC183329, 0xAA6EE7B7, 1, dp(8)));
        b.setFocusable(true);
        b.setFocusableInTouchMode(true);
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            android.graphics.drawable.StateListDrawable states = new android.graphics.drawable.StateListDrawable();
            states.addState(new int[]{android.R.attr.state_focused}, makeRoundBackground(0xEE10B981, 0xFFFFFFFF, 2, dp(8)));
            states.addState(new int[]{}, makeRoundBackground(0xCC183329, 0xAA6EE7B7, 1, dp(8)));
            b.setBackground(states);
        }
        return b;
    }

    private void createFullPlayerOverlays() {
        fullControls = new android.widget.LinearLayout(this);
        fullControls.setOrientation(android.widget.LinearLayout.HORIZONTAL);
        fullControls.setGravity(android.view.Gravity.CENTER_VERTICAL);
        fullControls.setPadding(dp(8), dp(5), dp(8), dp(5));
        fullControls.setBackgroundColor(0xCC06100B);
        fullControls.setVisibility(View.GONE);
        FrameLayout.LayoutParams cp = new FrameLayout.LayoutParams(-1, dp(58), android.view.Gravity.TOP | android.view.Gravity.LEFT);
        cp.leftMargin = dp(8); cp.rightMargin = dp(8); cp.topMargin = dp(6);
        miniContainer.addView(fullControls, cp);

        android.widget.Button menu = fullButton("☰", "Abrir menu de canais");
        fullMenuButton = menu;
        menu.setFocusable(true);
        menu.setFocusableInTouchMode(true);
        menu.setOnClickListener(v -> toggleFullChannelMenu());
        fullControls.addView(menu, new android.widget.LinearLayout.LayoutParams(dp(54), -1));

        android.widget.Button stretch = fullButton("↔", "Esticar ou ajustar a imagem");
        stretch.setOnClickListener(v -> {
            int mode = miniPlayerView.getResizeMode();
            miniPlayerView.setResizeMode(mode == androidx.media3.ui.AspectRatioFrameLayout.RESIZE_MODE_FIT
                    ? androidx.media3.ui.AspectRatioFrameLayout.RESIZE_MODE_FILL
                    : androidx.media3.ui.AspectRatioFrameLayout.RESIZE_MODE_FIT);
        });
        fullControls.addView(stretch, new android.widget.LinearLayout.LayoutParams(dp(54), -1));

        android.widget.Button minus = fullButton("−", "Diminuir zoom");
        minus.setOnClickListener(v -> changeFullZoom(-0.1f));
        fullControls.addView(minus, new android.widget.LinearLayout.LayoutParams(dp(48), -1));

        android.widget.Button plus = fullButton("+", "Aumentar zoom");
        plus.setOnClickListener(v -> changeFullZoom(0.1f));
        fullControls.addView(plus, new android.widget.LinearLayout.LayoutParams(dp(48), -1));

        fullZoomLabel = new TextView(this);
        fullZoomLabel.setTextColor(android.graphics.Color.WHITE);
        fullZoomLabel.setTextSize(12f);
        fullZoomLabel.setGravity(android.view.Gravity.CENTER);
        fullZoomLabel.setText("100%");
        fullControls.addView(fullZoomLabel, new android.widget.LinearLayout.LayoutParams(dp(58), -1));

        android.widget.Button reset = fullButton("1×", "Voltar ao tamanho original");
        reset.setOnClickListener(v -> { fullZoom = 1.0f; applyFullZoom(); });
        fullControls.addView(reset, new android.widget.LinearLayout.LayoutParams(dp(52), -1));

        fullChannelMenu = new FrameLayout(this);
        fullChannelMenu.setVisibility(View.GONE);
        fullChannelMenu.setPadding(dp(8), dp(8), dp(8), dp(8));
        fullChannelMenu.setBackgroundColor(0x6607130F);
        android.widget.LinearLayout menuShell = new android.widget.LinearLayout(this);
        menuShell.setOrientation(android.widget.LinearLayout.VERTICAL);
        menuShell.setPadding(dp(4), dp(4), dp(4), dp(4));
        menuShell.setBackgroundColor(0x66050B08);

        android.widget.HorizontalScrollView categoryScroll = new android.widget.HorizontalScrollView(this);
        categoryScroll.setHorizontalScrollBarEnabled(false);
        fullCategoryBar = new android.widget.LinearLayout(this);
        fullCategoryBar.setOrientation(android.widget.LinearLayout.HORIZONTAL);
        categoryScroll.addView(fullCategoryBar, new android.widget.HorizontalScrollView.LayoutParams(-2, -1));
        menuShell.addView(categoryScroll, new android.widget.LinearLayout.LayoutParams(-1, dp(54)));

        android.widget.ScrollView scroll = new android.widget.ScrollView(this);
        scroll.setVerticalScrollBarEnabled(true);
        fullChannelList = new android.widget.LinearLayout(this);
        fullChannelList.setOrientation(android.widget.LinearLayout.VERTICAL);
        fullChannelList.setPadding(dp(8), dp(8), dp(8), dp(8));
        scroll.addView(fullChannelList, new android.widget.ScrollView.LayoutParams(-1, -2));
        menuShell.addView(scroll, new android.widget.LinearLayout.LayoutParams(-1, 0, 1f));
        fullChannelMenu.addView(menuShell, new FrameLayout.LayoutParams(-1, -1));
        miniContainer.addView(fullChannelMenu);
    }

    private void changeFullZoom(float delta) {
        fullZoom = Math.max(0.8f, Math.min(1.6f, fullZoom + delta));
        applyFullZoom();
    }

    private void applyFullZoom() {
        if (miniPlayerView == null) return;
        miniPlayerView.setScaleX(fullZoom);
        miniPlayerView.setScaleY(fullZoom);
        if (fullZoomLabel != null) fullZoomLabel.setText(Math.round(fullZoom * 100f) + "%");
    }

    private void toggleFullChannelMenu() {
        if (fullChannelMenu == null) return;
        if (fullChannelMenu.getVisibility() == View.VISIBLE) {
            fullChannelMenu.setVisibility(View.GONE);
            return;
        }
        populateFullChannelMenu();
            fullChannelMenu.bringToFront();
            fullChannelMenu.setVisibility(View.VISIBLE);
            if (fullCategoryBar != null && fullCategoryBar.getChildCount() > 0) {
                View firstCategory = fullCategoryBar.getChildAt(0);
                firstCategory.setFocusable(true);
                firstCategory.requestFocus();
            }
    }

    private void populateFullChannelMenu() {
        if (fullChannelList == null || fullCategoryBar == null) return;
        fullChannelItems.clear();
        fullCategoryBar.removeAllViews();
        fullChannelList.removeAllViews();
        try {
            JSONObject current = new JSONObject(miniPayload == null ? "{}" : miniPayload);
            org.json.JSONArray zap = current.optJSONArray("zap");
            if (zap == null || zap.length() == 0) {
                TextView empty = new TextView(this);
                empty.setText("Nenhum canal disponível nesta lista");
                empty.setTextColor(android.graphics.Color.WHITE);
                empty.setTextSize(15f);
                empty.setPadding(dp(12), dp(16), dp(12), dp(16));
                fullChannelList.addView(empty);
                return;
            }
            java.util.LinkedHashSet<String> cats = new java.util.LinkedHashSet<>();
            org.json.JSONArray zapCategories = current.optJSONArray("zap_categories");
            if (zapCategories != null) {
                for (int i = 0; i < zapCategories.length(); i++) {
                    String listedCategory = zapCategories.optString(i, "").trim();
                    if (!listedCategory.isEmpty()) cats.add(listedCategory);
                }
            }
            for (int i = 0; i < zap.length(); i++) {
                JSONObject item = zap.optJSONObject(i);
                if (item == null || item.optString("u", "").isEmpty()) continue;
                fullChannelItems.add(item);
                String cat = item.optString("c", "").trim();
                if (!cat.isEmpty()) cats.add(cat);
            }
            cats.add("Todos");
            fullSelectedCategory = "Todos";
            java.util.ArrayList<String> ordered = new java.util.ArrayList<>();
            ordered.add("Todos");
            for (String cat : cats) if (!"Todos".equals(cat)) ordered.add(cat);
            for (String cat : ordered) {
                android.widget.Button tab = fullButton(cat, "Categoria " + cat);
                tab.setTextSize(13f);
                tab.setSingleLine(true);
                tab.setPadding(dp(12), 0, dp(12), 0);
                android.widget.LinearLayout.LayoutParams tp = new android.widget.LinearLayout.LayoutParams(-2, dp(42));
                tp.rightMargin = dp(6);
                fullCategoryBar.addView(tab, tp);
                final String selected = cat;
                tab.setOnClickListener(v -> {
                    fullSelectedCategory = selected;
                    renderFullChannelCategory(selected);
                });
            }
            renderFullChannelCategory("Todos");
        } catch (Throwable ignored) { }
        FrameLayout.LayoutParams mp = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, android.view.Gravity.TOP | android.view.Gravity.LEFT);
        mp.leftMargin = dp(8); mp.rightMargin = dp(8); mp.topMargin = dp(70); mp.bottomMargin = dp(8);
        fullChannelMenu.setLayoutParams(mp);
    }

    private void renderFullChannelCategory(String category) {
        if (fullChannelList == null) return;
        fullChannelList.removeAllViews();
        TextView head = new TextView(this);
        head.setText(category);
        head.setTextColor(android.graphics.Color.WHITE);
        head.setTextSize(16f);
        head.setTypeface(android.graphics.Typeface.DEFAULT, android.graphics.Typeface.BOLD);
        head.setPadding(dp(8), dp(4), dp(8), dp(8));
        fullChannelList.addView(head);
        int shown = 0;
        for (JSONObject item : fullChannelItems) {
            String itemCat = item.optString("c", "").trim();
            if (!"Todos".equals(category) && !category.equals(itemCat)) continue;
            String name = item.optString("t", "Canal");
            String url = item.optString("u", "");
            if (url.isEmpty()) continue;
            android.widget.Button row = fullButton(name, "Trocar para " + name);
            row.setGravity(android.view.Gravity.LEFT | android.view.Gravity.CENTER_VERTICAL);
            row.setTextSize(14f);
            row.setBackground(makeRoundBackground(0x66162D24, 0x996EE7B7, 1, dp(8)));
            android.widget.LinearLayout.LayoutParams rp = new android.widget.LinearLayout.LayoutParams(-1, dp(44));
            rp.bottomMargin = dp(5);
            fullChannelList.addView(row, rp);
            final String nextUrl = url;
            final String nextName = name;
            row.setOnClickListener(v -> {
                try {
                    JSONObject next = new JSONObject(miniPayload == null ? "{}" : miniPayload);
                    next.put("url", nextUrl);
                    next.put("title", nextName);
                    next.put("zap", new org.json.JSONArray(fullChannelItems));
                    showMiniPlayer(next.toString(), true);
                    fullChannelMenu.setVisibility(View.GONE);
                } catch (Throwable ignored) { }
            });
            shown++;
        }
        if (shown == 0) {
            TextView empty = new TextView(this);
            empty.setText("Nenhum canal nesta categoria");
            empty.setTextColor(0xDDFFFFFF);
            empty.setTextSize(14f);
            empty.setPadding(dp(8), dp(12), dp(8), dp(12));
            fullChannelList.addView(empty);
        }
    }

    private void resizeMiniPlayer(boolean tvMode) {
        if (miniContainer == null || root == null || miniExpanded) return;
        boolean large = tvMode;
        int screenWidth = getResources().getDisplayMetrics().widthPixels;
        int width = large ? Math.max(dp(360), Math.round(screenWidth * 0.32f)) : dp(300);
        int height = large ? Math.round(width * 0.84f) : dp(285);
        FrameLayout.LayoutParams p = new FrameLayout.LayoutParams(width, height, android.view.Gravity.TOP | android.view.Gravity.RIGHT);
        p.rightMargin = large ? dp(16) : dp(12);
        p.topMargin = large ? dp(76) : dp(78);
        miniContainer.setLayoutParams(p);
    }

    private void resizeMiniPlayerBounds(double leftCss, double topCss, double widthCss, double heightCss, double scale) {
        // O WebView atualiza os limites do quadro em vários callbacks. Nunca deixe
        // esse callback reduzir o player depois que ele já foi ampliado.
        if (miniExpanded) return;
        if (miniContainer == null || root == null || widthCss <= 0 || heightCss <= 0) return;
        if (scale <= 0.1 || scale > 8.0) scale = 1.0;
        int left = Math.max(0, (int) Math.round(leftCss * scale));
        int top = Math.max(0, (int) Math.round(topCss * scale));
        int width = Math.max(dp(180), (int) Math.round(widthCss * scale));
        int height = Math.max(dp(100), (int) Math.round(heightCss * scale));
        int maxW = Math.max(dp(180), root.getWidth() - left - dp(4));
        int maxH = Math.max(dp(100), root.getHeight() - top - dp(4));
        // Mantém a largura medida pelo WebView, mas dá mais altura vertical ao
        // quadro nativo nos dois modos, conforme o ajuste visual solicitado.
        int extraHeight = isTv ? dp(72) : dp(70);
        height = Math.min(maxH, height + extraHeight);
        width = Math.min(width, maxW);
        height = Math.min(height, maxH);
        FrameLayout.LayoutParams p = new FrameLayout.LayoutParams(width, height, android.view.Gravity.TOP | android.view.Gravity.LEFT);
        p.leftMargin = left;
        p.topMargin = top;
        miniContainer.setLayoutParams(p);
    }

    private android.graphics.drawable.Drawable makeRoundBackground(int fill, int stroke, int strokeWidth, int radius) {
        GradientDrawable bg = new GradientDrawable();
        bg.setColor(fill);
        bg.setCornerRadius(radius);
        bg.setStroke(strokeWidth, stroke);
        return bg;
    }

    private void showMiniPlayer(String payload) {
        showMiniPlayer(payload, true);
    }

    private void showMiniPlayer(String payload, boolean keepAfterFull) {
        if (miniContainer == null || miniPlayerView == null) return;
        keepMiniAfterFull = keepAfterFull;
        try {
            JSONObject json = new JSONObject(payload == null ? "{}" : payload);
            String url = json.optString("url", "");
            String title = json.optString("title", "Canal selecionado");
            if (url.isEmpty()) return;
            miniPayload = json.toString();
            notifyWebPlaybackStarted(miniPayload);
            if (miniPlayer == null) {
                DefaultHttpDataSource.Factory http = new DefaultHttpDataSource.Factory()
                        .setUserAgent("Mozilla/5.0 (Linux; Android 10) AppleWebKit/537.36 Fusion/4.31")
                        .setAllowCrossProtocolRedirects(true);
                miniPlayer = new ExoPlayer.Builder(this)
                        .setMediaSourceFactory(new DefaultMediaSourceFactory(http))
                        .build();
                miniPlayer.addListener(new androidx.media3.common.Player.Listener() {
                    @Override public void onPlayerError(PlaybackException error) {
                        if (!retryLiveAsTs()) notifyWebPlaybackFailure(miniPayload);
                    }
                });
                miniPlayerView.setPlayer(miniPlayer);
            }
            if (!url.equals(miniContainer.getTag())) {
                miniSourceUrl = url;
                miniTsRetryUsed = false;
                miniPlayer.setMediaItem(MediaItem.fromUri(url));
                miniPlayer.prepare();
                miniPlayer.setVolume(miniMuted ? 0.0f : miniVolume);
                miniPlayer.play();
                miniContainer.setTag(url);
            } else if (!miniPlayer.isPlaying()) {
                miniPlayer.play();
            }
            if (miniTitle != null) miniTitle.setText("Mini player • " + title + " • toque novamente para abrir");
            miniContainer.setVisibility(View.VISIBLE);
        } catch (Throwable ignored) { }
    }

    private void notifyWebPlaybackStarted(String payload) {
        if (webView == null) return;
        try {
            JSONObject json = new JSONObject(payload == null ? "{}" : payload);
            String title = json.optString("title", "");
            String js = "try{if(window.__zxNativePlaybackStarted)window.__zxNativePlaybackStarted(" + JSONObject.quote(title) + ");}catch(e){}";
            webView.post(() -> webView.evaluateJavascript(js, null));
        } catch (Throwable ignored) { }
    }

    private void notifyWebPlaybackFailure(String payload) {
        if (webView == null) return;
        try {
            JSONObject json = new JSONObject(payload == null ? "{}" : payload);
            String kind = json.optString("kind", "");
            String title = json.optString("title", "");
            String js = "try{if(window.__zxNativePlaybackFailure)window.__zxNativePlaybackFailure(" + JSONObject.quote(kind) + "," + JSONObject.quote(title) + ");}catch(e){}";
            webView.post(() -> webView.evaluateJavascript(js, null));
        } catch (Throwable ignored) { }
    }

    private boolean retryLiveAsTs() {
        if (miniPlayer == null || miniTsRetryUsed || miniSourceUrl == null || miniSourceUrl.isEmpty()) return false;
        boolean livePayload = miniPayload != null && miniPayload.contains("\"kind\":\"live\"");
        if (!livePayload) return false;
        String lower = miniSourceUrl.toLowerCase(java.util.Locale.US);
        String fallback;
        if (lower.matches(".*\\.(m3u8|m3u)(\\?.*)?$")) {
            fallback = miniSourceUrl.replaceFirst("(?i)\\.(m3u8|m3u)(\\?.*)?$", ".ts$2");
        } else if (lower.matches(".*\\.ts(\\?.*)?$")) {
            fallback = miniSourceUrl.replaceFirst("(?i)\\.ts(\\?.*)?$", ".m3u8$1");
        } else {
            fallback = miniSourceUrl + (miniSourceUrl.indexOf('?') >= 0 ? "&" : "?") + "format=ts";
        }
        if (fallback.equals(miniSourceUrl)) return false;
        miniTsRetryUsed = true;
        try {
            miniPlayer.setMediaItem(MediaItem.fromUri(fallback));
            miniPlayer.prepare();
            miniPlayer.play();
            return true;
        } catch (Throwable ignored) { return false; }
    }

    private void openFullMiniPlayer() {
        if (miniPayload == null || miniPayload.isEmpty() || miniContainer == null || miniPlayerView == null) return;
        try {
            if (miniExpanded) return;
            ViewGroup.LayoutParams current = miniContainer.getLayoutParams();
            if (current instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams old = (FrameLayout.LayoutParams) current;
                miniLayoutBeforeExpand = new FrameLayout.LayoutParams(old);
            }
            miniExpanded = true;
            miniContainer.setBackgroundColor(android.graphics.Color.BLACK);
            miniContainer.setElevation(1000f);
            miniContainer.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            miniContainer.setVisibility(View.VISIBLE);
            miniContainer.bringToFront();
            miniContainer.requestLayout();
            if (root != null) root.requestLayout();
            if (miniTitle != null) miniTitle.setVisibility(View.GONE);
            if (miniExpandHit != null) miniExpandHit.setVisibility(View.GONE);
            if (fullControls != null) fullControls.setVisibility(View.VISIBLE);
            if (fullChannelMenu != null) fullChannelMenu.setVisibility(View.GONE);
            fullZoom = 1.0f;
            miniPlayerView.setResizeMode(androidx.media3.ui.AspectRatioFrameLayout.RESIZE_MODE_FIT);
            applyFullZoom();
            miniPlayerView.setUseController(true);
            miniPlayerView.setControllerAutoShow(true);
            if (miniCloseButton != null) {
                miniCloseButton.setContentDescription("Voltar para o mini player");
                miniCloseButton.setImageResource(android.R.drawable.ic_menu_revert);
                miniCloseButton.setOnClickListener(v -> collapseFullMiniPlayer());
            }
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            if (miniPlayer != null && !miniPlayer.isPlaying()) miniPlayer.play();
            if (fullMenuButton != null) fullMenuButton.postDelayed(() -> fullMenuButton.requestFocus(), 120);
        } catch (Throwable ignored) { }
    }

    private void collapseFullMiniPlayer() {
        if (!miniExpanded || miniContainer == null) return;
        miniExpanded = false;
        if (miniLayoutBeforeExpand != null) {
            miniContainer.setLayoutParams(miniLayoutBeforeExpand);
            miniLayoutBeforeExpand = null;
        } else {
            resizeMiniPlayer(isTv);
        }
        miniContainer.setBackgroundColor(android.graphics.Color.rgb(4, 12, 9));
        miniContainer.setElevation(24f);
        miniContainer.setVisibility(View.VISIBLE);
        miniContainer.bringToFront();
        miniContainer.requestLayout();
        if (miniTitle != null) miniTitle.setVisibility(View.VISIBLE);
        if (miniExpandHit != null) miniExpandHit.setVisibility(View.VISIBLE);
        if (fullControls != null) fullControls.setVisibility(View.GONE);
        if (fullChannelMenu != null) fullChannelMenu.setVisibility(View.GONE);
        fullZoom = 1.0f;
        miniPlayerView.setScaleX(1.0f);
        miniPlayerView.setScaleY(1.0f);
        miniPlayerView.setResizeMode(androidx.media3.ui.AspectRatioFrameLayout.RESIZE_MODE_FIT);
        miniPlayerView.setUseController(false);
        if (miniCloseButton != null) {
            miniCloseButton.setContentDescription("Fechar mini player");
            miniCloseButton.setImageResource(android.R.drawable.ic_menu_close_clear_cancel);
            miniCloseButton.setOnClickListener(v -> hideMiniPlayer());
        }
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
        if (!keepMiniAfterFull) {
            if (miniPlayer != null) miniPlayer.pause();
            miniContainer.setVisibility(View.GONE);
            miniContainer.setTag(null);
            miniPayload = "";
            return;
        }
        if (miniPlayer != null && !miniPlayer.isPlaying()) miniPlayer.play();
    }

    private void hideMiniPlayer() {
        if (miniExpanded) collapseFullMiniPlayer();
        if (miniPlayer != null) miniPlayer.pause();
        if (miniContainer != null) {
            miniContainer.setVisibility(View.GONE);
            miniContainer.setTag(null);
            miniPayload = "";
            miniSourceUrl = "";
            miniTsRetryUsed = false;
        }
    }

    private void beginApkUpdate(String url) {
        if (url.isEmpty() || !url.toLowerCase(java.util.Locale.US).startsWith("https://")) {
            notifyWebUpdate("error", "O painel não forneceu um link HTTPS direto para o APK.", -1);
            return;
        }
        notifyWebUpdate("starting", "Baixando atualização segura…", 0);
        ApkUpdateManager.download(this, url, new ApkUpdateManager.Callback() {
            @Override public void onProgress(int percent) { notifyWebUpdate("progress", percent >= 0 ? "Baixando atualização…" : "Baixando atualização…", percent); }
            @Override public void onDownloaded(java.io.File apk) { notifyWebUpdate("ready", "APK validado. Abrindo o instalador do Android…", 100); startApkInstall(apk); }
            @Override public void onAlreadyLatest(String message) { notifyWebUpdate("latest", message, 100); }
            @Override public void onPermissionRequired(java.io.File apk) { startApkInstall(apk); }
            @Override public void onError(String message) { notifyWebUpdate("error", message, -1); }
        });
    }

    private void notifyWebUpdate(String state, String message, int percent) {
        if (webView == null) return;
        String js = "try{if(window.__zxNativeUpdateState)window.__zxNativeUpdateState(" + JSONObject.quote(state == null ? "" : state) + "," + JSONObject.quote(message == null ? "" : message) + "," + percent + ");}catch(e){}";
        webView.post(() -> webView.evaluateJavascript(js, null));
    }

    private void startApkInstall(java.io.File apk) {
        if (apk == null || !apk.isFile()) { notifyWebUpdate("error", "O APK baixado não está disponível.", -1); return; }
        try {
            if (android.os.Build.VERSION.SDK_INT >= 26 && !getPackageManager().canRequestPackageInstalls()) {
                pendingInstallApk = apk;
                notifyWebUpdate("permission", "Autorize a instalação desta fonte e volte ao Fusion para continuar.", -1);
                Intent permission = new Intent(Settings.ACTION_MANAGE_UNKNOWN_APP_SOURCES, Uri.parse("package:" + getPackageName()));
                startActivity(permission);
                return;
            }
            Uri uri = FileProvider.getUriForFile(this, getPackageName() + ".provider", apk);
            Intent install = new Intent(Intent.ACTION_VIEW);
            install.setDataAndType(uri, "application/vnd.android.package-archive");
            install.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_GRANT_READ_URI_PERMISSION);
            startActivityForResult(install, UPDATE_INSTALL_REQUEST);
        } catch (Throwable error) {
            notifyWebUpdate("error", error.getMessage() == null ? "Não foi possível abrir o instalador do Android." : error.getMessage(), -1);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (pendingInstallApk != null && (android.os.Build.VERSION.SDK_INT < 26 || getPackageManager().canRequestPackageInstalls())) {
            java.io.File apk = pendingInstallApk;
            pendingInstallApk = null;
            startApkInstall(apk);
        }
    }

    private void launchVoiceRecognizer() {
        try {
            Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "pt-BR");
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_PREFERENCE, "pt-BR");
            intent.putExtra(RecognizerIntent.EXTRA_MAX_RESULTS, 1);
            intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Diga o nome do canal, filme ou série");
            startActivityForResult(intent, VOICE_REQUEST);
        } catch (Throwable ignored) { sendVoiceError(); }
    }

    private void sendVoiceResult(String text) {
        if (webView == null) return;
        webView.evaluateJavascript("try{window.__voiceResult(" + JSONObject.quote(text == null ? "" : text) + ")}catch(e){}", null);
    }

    private void sendVoiceError() {
        if (webView == null) return;
        webView.evaluateJavascript("try{window.__voiceError()}catch(e){}", null);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == VOICE_PERMISSION_REQUEST) {
            if (grantResults.length > 0 && grantResults[0] == android.content.pm.PackageManager.PERMISSION_GRANTED) launchVoiceRecognizer();
            else sendVoiceError();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != VOICE_REQUEST) return;
        if (resultCode == RESULT_OK && data != null) {
            java.util.ArrayList<String> results = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
            if (results != null && !results.isEmpty()) { sendVoiceResult(results.get(0)); return; }
        }
        sendVoiceError();
    }

    private void showExitConfirm() {
        if (isFinishing() || isDestroyed()) return;
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("Sair ou continuar?")
                .setMessage("Você deseja sair do Fusion ou continuar assistindo?")
                .setNegativeButton("Continuar", null)
                .setPositiveButton("Sair", (d, w) -> {
                    try { finishAndRemoveTask(); } catch (Throwable ignored) { finishAffinity(); }
                })
                .setOnCancelListener(d -> { lastRootBackAt = 0L; })
                .show();
    }

    private void handleRootBack() {
        long now = android.os.SystemClock.elapsedRealtime();
        if (now - lastRootBackAt <= 1800L) {
            lastRootBackAt = 0L;
            showExitConfirm();
            return;
        }
        lastRootBackAt = now;
        android.widget.Toast.makeText(MainActivity.this, "Pressione voltar novamente para sair", android.widget.Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        if (miniExpanded) {
            if (fullChannelMenu != null && fullChannelMenu.getVisibility() == View.VISIBLE) {
                fullChannelMenu.setVisibility(View.GONE);
                return;
            }
            collapseFullMiniPlayer();
            return;
        }
        if (webView == null) { handleRootBack(); return; }
        webView.evaluateJavascript("window.__zxBackAction ? window.__zxBackAction() : 'na'", value -> {
            // evaluateJavascript devolve strings JS com aspas: `"exit"`.
            // Esse retorno precisa cair no contador de dois toques do Java,
            // não ser consumido como uma navegação já tratada.
            boolean wantsExit = value != null && (value.contains("exit") || value.contains("EXIT"));
            if (wantsExit) { handleRootBack(); return; }
            boolean handled = value != null && !value.contains("na") && !value.contains("null");
            if (handled) { lastRootBackAt = 0L; return; }
            handleRootBack();
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // Controles Android/Google TV podem enviar teclas diferentes para o
        // botão físico de microfone. Todas abrem o mesmo reconhecimento em PT-BR.
        if (keyCode == KeyEvent.KEYCODE_VOICE_ASSIST
                || keyCode == KeyEvent.KEYCODE_ASSIST
                || keyCode == KeyEvent.KEYCODE_SEARCH) {
            launchVoiceRecognizer();
            return true;
        }
        if (webView != null && keyCode == KeyEvent.KEYCODE_MENU) {
            webView.evaluateJavascript("try{document.dispatchEvent(new KeyboardEvent('keydown',{key:'ContextMenu',bubbles:true,cancelable:true}))}catch(e){}", null);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        if (webView != null) webView.saveState(outState);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onDestroy() {
        if (miniPlayer != null) { miniPlayer.release(); miniPlayer = null; }
        if (webView != null) {
            webView.stopLoading();
            webView.loadUrl("about:blank");
            webView.destroy();
            webView = null;
        }
        super.onDestroy();
    }
}

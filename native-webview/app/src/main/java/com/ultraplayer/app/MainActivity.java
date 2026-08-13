package com.ultraplayer.app;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
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

import org.json.JSONObject;

public final class MainActivity extends Activity {
    private WebView webView;
    private FrameLayout root;
    private View splash;
    private boolean isTv;
    private static final int VOICE_REQUEST = 7412;
    private static final int VOICE_PERMISSION_REQUEST = 7413;

    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setStatusBarColor(android.graphics.Color.rgb(11, 15, 26));
        getWindow().setNavigationBarColor(android.graphics.Color.rgb(11, 15, 26));
        getWindow().setSoftInputMode(android.view.WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE);

        isTv = detectTv();
        root = new FrameLayout(this);
        root.setBackgroundColor(android.graphics.Color.rgb(11, 15, 26));

        webView = new WebView(this);
        webView.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        configureWebView(webView);
        root.addView(webView);

        splash = createSplash();
        root.addView(splash, new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        setContentView(root);

        if (state != null) {
            webView.restoreState(state);
        } else {
            webView.loadUrl("file:///android_asset/webui/index.html");
        }
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
        s.setUserAgentString("UltraPlayer/1.3 (UltraPlayerWebView)");
        view.setBackgroundColor(android.graphics.Color.rgb(11, 15, 26));
        view.setWebChromeClient(new WebChromeClient());
        view.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView v, String url) {
                v.evaluateJavascript("try{window.__ULTRAPLAYER_NATIVE=true}catch(e){}", null);
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
        TextView title = new TextView(this);
        title.setText("UltraPlayer");
        title.setTextColor(android.graphics.Color.rgb(76, 232, 240));
        title.setTextSize(32);
        title.setTypeface(android.graphics.Typeface.DEFAULT, android.graphics.Typeface.BOLD);
        title.setGravity(android.view.Gravity.CENTER);
        box.addView(title, new android.widget.LinearLayout.LayoutParams(-2, -2));
        ProgressBar progress = new ProgressBar(this);
        android.widget.LinearLayout.LayoutParams pp = new android.widget.LinearLayout.LayoutParams(48, 48);
        pp.topMargin = 28;
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
                    connection.setRequestProperty("User-Agent", "UltraPlayer/1.3");
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
            }, "UltraPlayer-M3U").start();
        }

        @JavascriptInterface
        public void play(String payload) {
            runOnUiThread(() -> {
                try {
                    JSONObject json = new JSONObject(payload == null ? "{}" : payload);
                    if (!json.optString("url", "").isEmpty()) {
                        Intent intent = new Intent(MainActivity.this, PlayerActivity.class);
                        intent.putExtra("payload", json.toString());
                        startActivity(intent);
                    }
                } catch (Throwable ignored) { }
            });
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

    @Override
    public void onBackPressed() {
        if (webView == null) { finish(); return; }
        webView.evaluateJavascript("window.__zxBackAction ? window.__zxBackAction() : 'na'", value -> {
            if (value == null || value.contains("na") || value.contains("null")) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Sair do UltraPlayer?")
                        .setMessage("Deseja fechar o aplicativo?")
                        .setNegativeButton("Cancelar", null)
                        .setPositiveButton("Sair", (d, w) -> finish())
                        .show();
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
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
        if (webView != null) {
            webView.stopLoading();
            webView.loadUrl("about:blank");
            webView.destroy();
            webView = null;
        }
        super.onDestroy();
    }
}

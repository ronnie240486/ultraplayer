package com.ultraplayer.app;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.provider.Settings;
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
        s.setUserAgentString("UltraPlayer/1.2 (ZuxoWebView)");
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
        public boolean isTv() { return isTv; }

        @JavascriptInterface
        public void retry() {
            runOnUiThread(() -> { if (webView != null) webView.reload(); });
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

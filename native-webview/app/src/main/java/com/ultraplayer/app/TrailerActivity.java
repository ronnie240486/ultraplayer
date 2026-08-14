package com.ultraplayer.app;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

/** Tela interna do UltraPlayer para trailers do YouTube. */
public final class TrailerActivity extends Activity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);
        setRequestedOrientation(android.content.pm.ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        getWindow().setStatusBarColor(Color.rgb(11, 15, 26));
        getWindow().setNavigationBarColor(Color.rgb(11, 15, 26));

        String url = getIntent().getStringExtra("url");
        String title = getIntent().getStringExtra("title");
        if (url == null || !(url.startsWith("https://") || url.startsWith("http://"))) {
            finish();
            return;
        }

        FrameLayout root = new FrameLayout(this);
        root.setBackgroundColor(Color.rgb(5, 8, 12));

        webView = new WebView(this);
        webView.setBackgroundColor(Color.rgb(5, 8, 12));
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return false;
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String requestUrl) {
                return false;
            }
        });
        android.webkit.WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(true);
        settings.setSupportMultipleWindows(false);
        settings.setUserAgentString("UltraPlayer-Trailer/1.0 " + settings.getUserAgentString());
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
        webView.setFocusable(true);
        webView.setFocusableInTouchMode(true);
        root.addView(webView, new FrameLayout.LayoutParams(-1, -1));
        webView.requestFocus(View.FOCUS_DOWN);

        ProgressBar loading = new ProgressBar(this);
        FrameLayout.LayoutParams loadingLp = new FrameLayout.LayoutParams(54, 54, Gravity.CENTER);
        root.addView(loading, loadingLp);

        Button back = new Button(this);
        back.setText("← Voltar");
        back.setTextColor(Color.WHITE);
        back.setTextSize(14);
        back.setAllCaps(false);
        back.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        back.setBackgroundColor(Color.argb(205, 6, 19, 15));
        back.setFocusable(true);
        back.setOnFocusChangeListener((v, focused) -> v.setBackgroundColor(focused ? Color.argb(235, 16, 185, 129) : Color.argb(205, 6, 19, 15)));
        back.setOnClickListener(v -> finish());
        FrameLayout.LayoutParams backLp = new FrameLayout.LayoutParams(-2, 54, Gravity.TOP | Gravity.START);
        backLp.leftMargin = 18;
        backLp.topMargin = 14;
        root.addView(back, backLp);

        TextView label = new TextView(this);
        label.setText(title == null || title.trim().isEmpty() ? "Trailer" : "Trailer · " + title);
        label.setTextColor(Color.WHITE);
        label.setTextSize(15);
        label.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        label.setGravity(Gravity.CENTER_VERTICAL);
        label.setSingleLine(true);
        label.setEllipsize(android.text.TextUtils.TruncateAt.END);
        label.setBackgroundColor(Color.argb(170, 6, 19, 15));
        FrameLayout.LayoutParams labelLp = new FrameLayout.LayoutParams(-1, 54, Gravity.TOP | Gravity.CENTER_HORIZONTAL);
        labelLp.leftMargin = 150;
        labelLp.rightMargin = 18;
        labelLp.topMargin = 14;
        root.addView(label, labelLp);

        setContentView(root);
        webView.loadUrl(url);
    }

    @Override
    public void onBackPressed() {
        if (webView != null && webView.canGoBack()) webView.goBack();
        else super.onBackPressed();
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

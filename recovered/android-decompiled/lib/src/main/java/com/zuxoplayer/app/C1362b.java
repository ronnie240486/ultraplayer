package com.zuxoplayer.app;

import android.net.Uri;
import android.net.http.SslError;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: renamed from: com.zuxoplayer.app.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1362b extends WebViewClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MainActivity f6074a;

    public C1362b(MainActivity mainActivity) {
        this.f6074a = mainActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        MainActivity mainActivity = this.f6074a;
        if (str != null && !str.contains("offline.html")) {
            mainActivity.f6009h = false;
        }
        mainActivity.f6014m = true;
        mainActivity.m3448c();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webResourceRequest.isForMainFrame()) {
            Log.e("HDXWeb", "MAIN-FRAME ERROR " + webResourceRequest.getUrl() + " -> " + webResourceError.getErrorCode() + " " + ((Object) webResourceError.getDescription()));
            this.f6074a.f6009h = true;
            webView.loadUrl("file:///android_asset/offline.html");
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Log.d("HDXWeb", "HTTP " + webResourceResponse.getStatusCode() + " " + webResourceRequest.getUrl());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0012  */
    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String url;
        sslErrorHandler.cancel();
        String str = "";
        if (sslError != null) {
            try {
                if (sslError.getUrl() != null) {
                    url = sslError.getUrl();
                } else {
                    url = "";
                }
            } catch (Throwable unused) {
            }
        } else {
            url = "";
        }
        try {
            String host = Uri.parse(url).getHost();
            if (host != null) {
                str = host;
            }
        } catch (Throwable unused2) {
        }
        boolean zEndsWith = str.endsWith("zuxoplayer.com");
        StringBuilder sb = new StringBuilder("SSL ERROR (");
        sb.append(zEndsWith ? "NOSSO" : "externo/logo — ignorado");
        sb.append(") host=");
        sb.append(str);
        Log.e("HDXWeb", sb.toString());
        if (zEndsWith) {
            this.f6074a.f6009h = true;
            webView.loadUrl("file:///android_asset/offline.html#ssl");
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Log.e("HDXWeb", "WebView renderer morreu — recriando a tela");
        try {
            ViewGroup viewGroup = (ViewGroup) webView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(webView);
            }
            webView.destroy();
        } catch (Throwable unused) {
        }
        this.f6074a.recreate();
        return true;
    }
}

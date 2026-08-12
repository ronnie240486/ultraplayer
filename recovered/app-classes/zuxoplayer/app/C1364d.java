package com.zuxoplayer.app;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* JADX INFO: renamed from: com.zuxoplayer.app.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1364d implements ValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MainActivity f6075a;

    public C1364d(MainActivity mainActivity) {
        this.f6075a = mainActivity;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String str = (String) obj;
        String strTrim = str != null ? str.replace("\"", "").trim() : "";
        if ("ok".equals(strTrim)) {
            return;
        }
        boolean zEquals = "exit".equals(strTrim);
        MainActivity mainActivity = this.f6075a;
        if (zEquals) {
            String str2 = MainActivity.f6006q;
            mainActivity.m3446a();
            return;
        }
        WebView webView = mainActivity.f6008g;
        if (webView == null || !webView.canGoBack()) {
            mainActivity.m3446a();
        } else {
            mainActivity.f6008g.goBack();
        }
    }
}

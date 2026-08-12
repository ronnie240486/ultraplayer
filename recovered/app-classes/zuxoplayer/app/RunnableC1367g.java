package com.zuxoplayer.app;

/* JADX INFO: renamed from: com.zuxoplayer.app.g */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1367g implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ MainActivity.WebBridge f6082g;

    public RunnableC1367g(MainActivity.WebBridge webBridge) {
        this.f6082g = webBridge;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity mainActivity = MainActivity.this;
        mainActivity.f6009h = false;
        mainActivity.f6008g.loadUrl("file:///android_asset/webui/index.html");
    }
}

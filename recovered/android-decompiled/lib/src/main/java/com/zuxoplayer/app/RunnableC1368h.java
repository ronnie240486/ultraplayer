package com.zuxoplayer.app;

import android.content.Intent;
import android.util.Log;

/* JADX INFO: renamed from: com.zuxoplayer.app.h */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1368h implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f6083g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ MainActivity.WebBridge f6084h;

    public RunnableC1368h(MainActivity.WebBridge webBridge, String str) {
        this.f6084h = webBridge;
        this.f6083g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity.WebBridge webBridge = this.f6084h;
        try {
            Intent intent = new Intent(MainActivity.this, (Class<?>) PlayerActivity.class);
            intent.putExtra("payload", this.f6083g);
            MainActivity.this.startActivity(intent);
        } catch (Throwable th) {
            Log.e("HDXWeb", "play nativo falhou: " + th);
        }
    }
}

package com.zuxoplayer.app;

/* JADX INFO: renamed from: com.zuxoplayer.app.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1361a implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6072g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ MainActivity f6073h;

    public /* synthetic */ RunnableC1361a(MainActivity mainActivity, int i3) {
        this.f6072g = i3;
        this.f6073h = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6072g) {
            case 0:
                String str = MainActivity.f6006q;
                this.f6073h.m3448c();
                break;
            case 1:
                String str2 = MainActivity.f6006q;
                this.f6073h.m3449d(false);
                break;
            case 2:
                String str3 = MainActivity.f6006q;
                this.f6073h.m3447b();
                break;
            default:
                String str4 = MainActivity.f6006q;
                this.f6073h.m3449d(true);
                break;
        }
    }
}

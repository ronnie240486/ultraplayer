package p077a0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: renamed from: a0.a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0815a extends BroadcastReceiver implements Runnable {

    /* JADX INFO: renamed from: g */
    public final SurfaceHolderCallbackC0850z f3412g;

    /* JADX INFO: renamed from: h */
    public final Handler f3413h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0817b f3414i;

    public RunnableC0815a(C0817b c0817b, Handler handler, SurfaceHolderCallbackC0850z surfaceHolderCallbackC0850z) {
        this.f3414i = c0817b;
        this.f3413h = handler;
        this.f3412g = surfaceHolderCallbackC0850z;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f3413h.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3414i.f3427a) {
            this.f3412g.f3610g.m1928w0(-1, 3, false);
        }
    }
}

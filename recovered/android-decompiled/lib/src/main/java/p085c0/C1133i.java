package p085c0;

import android.os.Handler;
import p055T.C0574f0;
import p064W.RunnableC0647o;
import p077a0.C0829h;
import p077a0.SurfaceHolderCallbackC0850z;

/* JADX INFO: renamed from: c0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1133i {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5251a;

    /* JADX INFO: renamed from: b */
    public final Handler f5252b;

    /* JADX INFO: renamed from: c */
    public final SurfaceHolderCallbackC0850z f5253c;

    public /* synthetic */ C1133i(Handler handler, SurfaceHolderCallbackC0850z surfaceHolderCallbackC0850z, int i3) {
        this.f5251a = i3;
        this.f5252b = handler;
        this.f5253c = surfaceHolderCallbackC0850z;
    }

    /* JADX INFO: renamed from: b */
    private final void m3011b(C0829h c0829h) {
        synchronized (c0829h) {
        }
        Handler handler = this.f5252b;
        if (handler != null) {
            handler.post(new RunnableC0647o(this, 4, c0829h));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3012a(C0829h c0829h) {
        switch (this.f5251a) {
            case 0:
                m3011b(c0829h);
                break;
            default:
                synchronized (c0829h) {
                }
                Handler handler = this.f5252b;
                if (handler != null) {
                    handler.post(new RunnableC0647o(this, 15, c0829h));
                }
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m3013c(C0574f0 c0574f0) {
        Handler handler = this.f5252b;
        if (handler != null) {
            handler.post(new RunnableC0647o(this, 14, c0574f0));
        }
    }
}

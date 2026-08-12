package p137q0;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: q0.s */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC2158s implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: k */
    public static final ChoreographerFrameCallbackC2158s f9322k = new ChoreographerFrameCallbackC2158s();

    /* JADX INFO: renamed from: g */
    public volatile long f9323g = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public final Handler f9324h;

    /* JADX INFO: renamed from: i */
    public Choreographer f9325i;

    /* JADX INFO: renamed from: j */
    public int f9326j;

    public ChoreographerFrameCallbackC2158s() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i3 = AbstractC0632A.f2454a;
        Handler handler = new Handler(looper, this);
        this.f9324h = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        this.f9323g = j3;
        Choreographer choreographer = this.f9325i;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i3 = message.what;
        if (i3 == 1) {
            try {
                this.f9325i = Choreographer.getInstance();
            } catch (RuntimeException e3) {
                AbstractC0646n.m1648z("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e3);
            }
            return true;
        }
        if (i3 == 2) {
            Choreographer choreographer = this.f9325i;
            if (choreographer != null) {
                int i4 = this.f9326j + 1;
                this.f9326j = i4;
                if (i4 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i3 != 3) {
            return false;
        }
        Choreographer choreographer2 = this.f9325i;
        if (choreographer2 != null) {
            int i5 = this.f9326j - 1;
            this.f9326j = i5;
            if (i5 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f9323g = -9223372036854775807L;
            }
        }
        return true;
    }
}

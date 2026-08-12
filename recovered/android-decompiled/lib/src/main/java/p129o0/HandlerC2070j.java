package p129o0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import p064W.AbstractC0646n;
import p074Z0.C0778e;
import p133p0.ExecutorC2087a;

/* JADX INFO: renamed from: o0.j */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC2070j extends Handler implements Runnable {

    /* JADX INFO: renamed from: g */
    public final int f8996g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2071k f8997h;

    /* JADX INFO: renamed from: i */
    public final long f8998i;

    /* JADX INFO: renamed from: j */
    public InterfaceC2069i f8999j;

    /* JADX INFO: renamed from: k */
    public IOException f9000k;

    /* JADX INFO: renamed from: l */
    public int f9001l;

    /* JADX INFO: renamed from: m */
    public Thread f9002m;

    /* JADX INFO: renamed from: n */
    public boolean f9003n;

    /* JADX INFO: renamed from: o */
    public volatile boolean f9004o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C2074n f9005p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2070j(C2074n c2074n, Looper looper, InterfaceC2071k interfaceC2071k, InterfaceC2069i interfaceC2069i, int i3, long j3) {
        super(looper);
        this.f9005p = c2074n;
        this.f8997h = interfaceC2071k;
        this.f8999j = interfaceC2069i;
        this.f8996g = i3;
        this.f8998i = j3;
    }

    /* JADX INFO: renamed from: a */
    public final void m4634a(boolean z3) {
        this.f9004o = z3;
        this.f9000k = null;
        if (hasMessages(1)) {
            this.f9003n = true;
            removeMessages(1);
            if (!z3) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f9003n = true;
                    this.f8997h.mo3743b();
                    Thread thread = this.f9002m;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z3) {
            this.f9005p.f9010b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            InterfaceC2069i interfaceC2069i = this.f8999j;
            interfaceC2069i.getClass();
            interfaceC2069i.mo3804m(this.f8997h, jElapsedRealtime, jElapsedRealtime - this.f8998i, true);
            this.f8999j = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4635b() {
        SystemClock.elapsedRealtime();
        this.f8999j.getClass();
        this.f9000k = null;
        C2074n c2074n = this.f9005p;
        ExecutorC2087a executorC2087a = c2074n.f9009a;
        HandlerC2070j handlerC2070j = c2074n.f9010b;
        handlerC2070j.getClass();
        executorC2087a.execute(handlerC2070j);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f9004o) {
            return;
        }
        int i3 = message.what;
        if (i3 == 1) {
            m4635b();
            return;
        }
        if (i3 == 4) {
            throw ((Error) message.obj);
        }
        this.f9005p.f9010b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = jElapsedRealtime - this.f8998i;
        InterfaceC2069i interfaceC2069i = this.f8999j;
        interfaceC2069i.getClass();
        if (this.f9003n) {
            interfaceC2069i.mo3804m(this.f8997h, jElapsedRealtime, j3, false);
            return;
        }
        int i4 = message.what;
        if (i4 == 2) {
            try {
                interfaceC2069i.mo3805t(this.f8997h, jElapsedRealtime, j3);
                return;
            } catch (RuntimeException e3) {
                AbstractC0646n.m1636n("LoadTask", "Unexpected exception handling load completed", e3);
                this.f9005p.f9011c = new C2073m(e3);
                return;
            }
        }
        if (i4 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f9000k = iOException;
        int i5 = this.f9001l + 1;
        this.f9001l = i5;
        C0778e c0778eMo3803k = interfaceC2069i.mo3803k(this.f8997h, jElapsedRealtime, j3, iOException, i5);
        int i6 = c0778eMo3803k.f3181a;
        if (i6 == 3) {
            this.f9005p.f9011c = this.f9000k;
            return;
        }
        if (i6 != 2) {
            if (i6 == 1) {
                this.f9001l = 1;
            }
            long jMin = c0778eMo3803k.f3182b;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.f9001l - 1) * 1000, 5000);
            }
            C2074n c2074n = this.f9005p;
            AbstractC0646n.m1630h(c2074n.f9010b == null);
            c2074n.f9010b = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(1, jMin);
            } else {
                m4635b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        try {
            synchronized (this) {
                z3 = this.f9003n;
                this.f9002m = Thread.currentThread();
            }
            if (!z3) {
                Trace.beginSection("load:".concat(this.f8997h.getClass().getSimpleName()));
                try {
                    this.f8997h.mo3742a();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f9002m = null;
                Thread.interrupted();
            }
            if (this.f9004o) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e3) {
            if (this.f9004o) {
                return;
            }
            obtainMessage(3, e3).sendToTarget();
        } catch (Exception e4) {
            if (this.f9004o) {
                return;
            }
            AbstractC0646n.m1636n("LoadTask", "Unexpected exception loading stream", e4);
            obtainMessage(3, new C2073m(e4)).sendToTarget();
        } catch (OutOfMemoryError e5) {
            if (this.f9004o) {
                return;
            }
            AbstractC0646n.m1636n("LoadTask", "OutOfMemory error loading stream", e5);
            obtainMessage(3, new C2073m(e5)).sendToTarget();
        } catch (Error e6) {
            if (!this.f9004o) {
                AbstractC0646n.m1636n("LoadTask", "Unexpected error loading stream", e6);
                obtainMessage(4, e6).sendToTarget();
            }
            throw e6;
        }
    }
}

package p129o0;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.Executors;
import p014F.RunnableC0153b;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.ThreadFactoryC0658z;
import p074Z0.C0778e;
import p082b0.C1063d;
import p133p0.ExecutorC2087a;

/* JADX INFO: renamed from: o0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C2074n {

    /* JADX INFO: renamed from: d */
    public static final C0778e f9006d = new C0778e(0, -9223372036854775807L, false);

    /* JADX INFO: renamed from: e */
    public static final C0778e f9007e = new C0778e(2, -9223372036854775807L, false);

    /* JADX INFO: renamed from: f */
    public static final C0778e f9008f = new C0778e(3, -9223372036854775807L, false);

    /* JADX INFO: renamed from: a */
    public final ExecutorC2087a f9009a;

    /* JADX INFO: renamed from: b */
    public HandlerC2070j f9010b;

    /* JADX INFO: renamed from: c */
    public IOException f9011c;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2074n(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        int i3 = AbstractC0632A.f2454a;
        this(new ExecutorC2087a(Executors.newSingleThreadExecutor(new ThreadFactoryC0658z(0, strConcat)), new C1063d(19)));
    }

    /* JADX INFO: renamed from: a */
    public final void m4636a() {
        HandlerC2070j handlerC2070j = this.f9010b;
        AbstractC0646n.m1631i(handlerC2070j);
        handlerC2070j.m4634a(false);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4637b() {
        return this.f9010b != null;
    }

    /* JADX INFO: renamed from: c */
    public final void m4638c(InterfaceC2072l interfaceC2072l) {
        HandlerC2070j handlerC2070j = this.f9010b;
        if (handlerC2070j != null) {
            handlerC2070j.m4634a(true);
        }
        ExecutorC2087a executorC2087a = this.f9009a;
        if (interfaceC2072l != null) {
            executorC2087a.execute(new RunnableC0153b(20, interfaceC2072l));
        }
        C1063d c1063d = executorC2087a.f9065h;
        executorC2087a.f9064g.shutdown();
    }

    /* JADX INFO: renamed from: d */
    public final long m4639d(InterfaceC2071k interfaceC2071k, InterfaceC2069i interfaceC2069i, int i3) {
        Looper looperMyLooper = Looper.myLooper();
        AbstractC0646n.m1631i(looperMyLooper);
        this.f9011c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HandlerC2070j handlerC2070j = new HandlerC2070j(this, looperMyLooper, interfaceC2071k, interfaceC2069i, i3, jElapsedRealtime);
        AbstractC0646n.m1630h(this.f9010b == null);
        this.f9010b = handlerC2070j;
        handlerC2070j.m4635b();
        return jElapsedRealtime;
    }

    public C2074n(ExecutorC2087a executorC2087a) {
        this.f9009a = executorC2087a;
    }
}

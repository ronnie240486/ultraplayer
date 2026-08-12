package p137q0;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import p055T.C0574f0;
import p064W.AbstractC0632A;
import p077a0.C0839o;
import p085c0.C1133i;
import p103h0.InterfaceC1603l;

/* JADX INFO: renamed from: q0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2143d implements Handler.Callback {

    /* JADX INFO: renamed from: g */
    public final Handler f9217g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2144e f9218h;

    public C2143d(C2144e c2144e, InterfaceC1603l interfaceC1603l) {
        this.f9218h = c2144e;
        Handler handlerM1594m = AbstractC0632A.m1594m(this);
        this.f9217g = handlerM1594m;
        interfaceC1603l.mo3382p(this, handlerM1594m);
    }

    /* JADX INFO: renamed from: a */
    public final void m4715a(long j3) {
        Surface surface;
        C2144e c2144e = this.f9218h;
        if (this != c2144e.f9253n1 || c2144e.f7294Q == null) {
            return;
        }
        if (j3 == Long.MAX_VALUE) {
            c2144e.f7274B0 = true;
            return;
        }
        try {
            c2144e.m3973u0(j3);
            C0574f0 c0574f0 = c2144e.f9248i1;
            boolean zEquals = c0574f0.equals(C0574f0.f2070d);
            C1133i c1133i = c2144e.f9224K0;
            if (!zEquals && !c0574f0.equals(c2144e.f9249j1)) {
                c2144e.f9249j1 = c0574f0;
                c1133i.m3013c(c0574f0);
            }
            c2144e.f7278D0.f3508e++;
            C2156q c2156q = c2144e.f9227N0;
            boolean z3 = c2156q.f9312d != 3;
            c2156q.f9312d = 3;
            c2156q.f9319k.getClass();
            c2156q.f9314f = AbstractC0632A.m1571L(SystemClock.elapsedRealtime());
            if (z3 && (surface = c2144e.f9235V0) != null) {
                Handler handler = c1133i.f5252b;
                if (handler != null) {
                    handler.post(new RunnableC2162w(c1133i, surface, SystemClock.elapsedRealtime()));
                }
                c2144e.f9238Y0 = true;
            }
            c2144e.mo3959b0(j3);
        } catch (C0839o e3) {
            c2144e.f7276C0 = e3;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i3 = message.arg1;
        int i4 = message.arg2;
        int i5 = AbstractC0632A.f2454a;
        m4715a(((((long) i3) & 4294967295L) << 32) | (4294967295L & ((long) i4)));
        return true;
    }
}

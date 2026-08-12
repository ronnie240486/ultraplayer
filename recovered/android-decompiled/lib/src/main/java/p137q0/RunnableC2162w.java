package p137q0;

import p000A.C0041i;
import p011E.C0111d;
import p064W.AbstractC0632A;
import p077a0.C0792C;
import p082b0.C1060a;
import p082b0.C1064e;
import p085c0.C1133i;

/* JADX INFO: renamed from: q0.w */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2162w implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1133i f9356g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f9357h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ long f9358i;

    public /* synthetic */ RunnableC2162w(C1133i c1133i, Object obj, long j3) {
        this.f9356g = c1133i;
        this.f9357h = obj;
        this.f9358i = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1133i c1133i = this.f9356g;
        c1133i.getClass();
        int i3 = AbstractC0632A.f2454a;
        C0792C c0792c = c1133i.f5253c.f3610g;
        C1064e c1064e = c0792c.f3257r;
        C1060a c1060aM2835Q = c1064e.m2835Q();
        long j3 = this.f9358i;
        Object obj = this.f9357h;
        c1064e.m2836R(c1060aM2835Q, 26, new C0111d(c1060aM2835Q, obj, j3));
        if (c0792c.f3220N == obj) {
            c0792c.f3251l.m1621f(26, new C0041i(13));
        }
    }
}

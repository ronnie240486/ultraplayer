package p137q0;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import p000A.C0041i;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p077a0.C0792C;
import p077a0.C0831i;
import p082b0.C1062c;
import p082b0.C1064e;
import p085c0.C1133i;
import p114k0.C1907A;

/* JADX INFO: renamed from: q0.v */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2161v implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f9354g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1133i f9355h;

    public /* synthetic */ RunnableC2161v(C1133i c1133i, int i3, long j3) {
        this.f9354g = 1;
        this.f9355h = c1133i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1133i c1133i = this.f9355h;
        int i3 = this.f9354g;
        c1133i.getClass();
        switch (i3) {
            case 0:
                int i4 = AbstractC0632A.f2454a;
                C1064e c1064e = c1133i.f5253c.f3610g.f3257r;
                c1064e.m2836R(c1064e.m2835Q(), 1016, new C1062c(10));
                break;
            case 1:
                int i5 = AbstractC0632A.f2454a;
                C1064e c1064e2 = c1133i.f5253c.f3610g.f3257r;
                c1064e2.m2836R(c1064e2.m2833O((C1907A) c1064e2.f4829j.f1572e), 1018, new C0041i(26));
                break;
            case 2:
                int i6 = AbstractC0632A.f2454a;
                C1064e c1064e3 = c1133i.f5253c.f3610g.f3257r;
                c1064e3.m2836R(c1064e3.m2833O((C1907A) c1064e3.f4829j.f1572e), 1021, new C1062c(2));
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                int i7 = AbstractC0632A.f2454a;
                C1064e c1064e4 = c1133i.f5253c.f3610g.f3257r;
                c1064e4.m2836R(c1064e4.m2835Q(), 1030, new C0041i(16));
                break;
            case 4:
                int i8 = AbstractC0632A.f2454a;
                C0792C c0792c = c1133i.f5253c.f3610g;
                c0792c.getClass();
                C1064e c1064e5 = c0792c.f3257r;
                c1064e5.m2836R(c1064e5.m2835Q(), 1015, new C1062c(8));
                break;
            case 5:
                int i9 = AbstractC0632A.f2454a;
                C0792C c0792c2 = c1133i.f5253c.f3610g;
                c0792c2.getClass();
                C1064e c1064e6 = c0792c2.f3257r;
                c1064e6.m2836R(c1064e6.m2835Q(), 1017, new C1062c(5));
                break;
            default:
                int i10 = AbstractC0632A.f2454a;
                C1064e c1064e7 = c1133i.f5253c.f3610g.f3257r;
                c1064e7.m2836R(c1064e7.m2835Q(), 1019, new C0041i(25));
                break;
        }
    }

    public /* synthetic */ RunnableC2161v(C1133i c1133i, long j3, int i3) {
        this.f9354g = 2;
        this.f9355h = c1133i;
    }

    public /* synthetic */ RunnableC2161v(C1133i c1133i, C0583o c0583o, C0831i c0831i) {
        this.f9354g = 5;
        this.f9355h = c1133i;
    }

    public /* synthetic */ RunnableC2161v(C1133i c1133i, Object obj, int i3) {
        this.f9354g = i3;
        this.f9355h = c1133i;
    }

    public /* synthetic */ RunnableC2161v(C1133i c1133i, String str, long j3, long j4) {
        this.f9354g = 0;
        this.f9355h = c1133i;
    }
}

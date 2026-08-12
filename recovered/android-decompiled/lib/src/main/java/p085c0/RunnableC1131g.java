package p085c0;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import p000A.C0041i;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p077a0.C0792C;
import p077a0.C0831i;
import p082b0.C1062c;
import p082b0.C1063d;
import p082b0.C1064e;

/* JADX INFO: renamed from: c0.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1131g implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5247g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1133i f5248h;

    public /* synthetic */ RunnableC1131g(C1133i c1133i, int i3, long j3, long j4) {
        this.f5247g = 9;
        this.f5248h = c1133i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1133i c1133i = this.f5248h;
        int i3 = this.f5247g;
        c1133i.getClass();
        switch (i3) {
            case 0:
                int i4 = AbstractC0632A.f2454a;
                C0792C c0792c = c1133i.f5253c.f3610g;
                c0792c.getClass();
                C1064e c1064e = c0792c.f3257r;
                c1064e.m2836R(c1064e.m2835Q(), 1007, new C1062c(29));
                break;
            case 1:
                int i5 = AbstractC0632A.f2454a;
                C1064e c1064e2 = c1133i.f5253c.f3610g.f3257r;
                c1064e2.m2836R(c1064e2.m2835Q(), 1031, new C1062c(26));
                break;
            case 2:
                int i6 = AbstractC0632A.f2454a;
                C1064e c1064e3 = c1133i.f5253c.f3610g.f3257r;
                c1064e3.m2836R(c1064e3.m2835Q(), 1032, new C1063d(0));
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                int i7 = AbstractC0632A.f2454a;
                C1064e c1064e4 = c1133i.f5253c.f3610g.f3257r;
                c1064e4.m2836R(c1064e4.m2835Q(), 1029, new C1062c(9));
                break;
            case 4:
                int i8 = AbstractC0632A.f2454a;
                C1064e c1064e5 = c1133i.f5253c.f3610g.f3257r;
                c1064e5.m2836R(c1064e5.m2835Q(), 1014, new C1062c(11));
                break;
            case 5:
                int i9 = AbstractC0632A.f2454a;
                C0792C c0792c2 = c1133i.f5253c.f3610g;
                c0792c2.getClass();
                C1064e c1064e6 = c0792c2.f3257r;
                c1064e6.m2836R(c1064e6.m2835Q(), 1009, new C1062c(7));
                break;
            case 6:
                int i10 = AbstractC0632A.f2454a;
                C1064e c1064e7 = c1133i.f5253c.f3610g.f3257r;
                c1064e7.m2836R(c1064e7.m2835Q(), 1008, new C0041i(22));
                break;
            case 7:
                int i11 = AbstractC0632A.f2454a;
                C1064e c1064e8 = c1133i.f5253c.f3610g.f3257r;
                c1064e8.m2836R(c1064e8.m2835Q(), 1012, new C1063d(4));
                break;
            case 8:
                int i12 = AbstractC0632A.f2454a;
                C1064e c1064e9 = c1133i.f5253c.f3610g.f3257r;
                c1064e9.m2836R(c1064e9.m2835Q(), 1010, new C0041i(20));
                break;
            default:
                int i13 = AbstractC0632A.f2454a;
                C1064e c1064e10 = c1133i.f5253c.f3610g.f3257r;
                c1064e10.m2836R(c1064e10.m2835Q(), 1011, new C1062c(16));
                break;
        }
    }

    public /* synthetic */ RunnableC1131g(C1133i c1133i, long j3) {
        this.f5247g = 8;
        this.f5248h = c1133i;
    }

    public /* synthetic */ RunnableC1131g(C1133i c1133i, C0583o c0583o, C0831i c0831i) {
        this.f5247g = 5;
        this.f5248h = c1133i;
    }

    public /* synthetic */ RunnableC1131g(C1133i c1133i, Object obj, int i3) {
        this.f5247g = i3;
        this.f5248h = c1133i;
    }

    public /* synthetic */ RunnableC1131g(C1133i c1133i, String str, long j3, long j4) {
        this.f5247g = 6;
        this.f5248h = c1133i;
    }
}

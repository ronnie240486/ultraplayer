package p145s0;

import java.util.List;
import p055T.AbstractC0545H;
import p055T.C0582n;
import p055T.C0583o;
import p055T.C0587s;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1692X;

/* JADX INFO: renamed from: s0.A */
/* JADX INFO: loaded from: classes.dex */
public final class C2222A implements InterfaceC2240m {

    /* JADX INFO: renamed from: a */
    public final int f9544a;

    /* JADX INFO: renamed from: b */
    public final int f9545b;

    /* JADX INFO: renamed from: c */
    public final String f9546c;

    /* JADX INFO: renamed from: d */
    public int f9547d;

    /* JADX INFO: renamed from: e */
    public int f9548e;

    /* JADX INFO: renamed from: f */
    public InterfaceC2242o f9549f;

    /* JADX INFO: renamed from: g */
    public InterfaceC2226E f9550g;

    public C2222A(String str, int i3, int i4) {
        this.f9544a = i3;
        this.f9545b = i4;
        this.f9546c = str;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: c */
    public final InterfaceC2240m mo327c() {
        return this;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: e */
    public final int mo328e(InterfaceC2241n interfaceC2241n, C0587s c0587s) {
        int i3 = this.f9548e;
        if (i3 != 1) {
            if (i3 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        InterfaceC2226E interfaceC2226E = this.f9550g;
        interfaceC2226E.getClass();
        int iMo1174c = interfaceC2226E.mo1174c(interfaceC2241n, 1024, true);
        if (iMo1174c != -1) {
            this.f9547d += iMo1174c;
            return 0;
        }
        this.f9548e = 2;
        this.f9550g.mo1172a(0L, 1, this.f9547d, 0, null);
        this.f9547d = 0;
        return 0;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: f */
    public final boolean mo329f(InterfaceC2241n interfaceC2241n) {
        int i3 = this.f9545b;
        int i4 = this.f9544a;
        AbstractC0646n.m1630h((i4 == -1 || i3 == -1) ? false : true);
        C0651s c0651s = new C0651s(i3);
        ((C2237j) interfaceC2241n).mo338i(c0651s.f2520a, 0, i3, false);
        return c0651s.m1659A() == i4;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: h */
    public final void mo330h(InterfaceC2242o interfaceC2242o) {
        this.f9549f = interfaceC2242o;
        InterfaceC2226E interfaceC2226EMo344p = interfaceC2242o.mo344p(1024, 4);
        this.f9550g = interfaceC2226EMo344p;
        C0582n c0582n = new C0582n();
        c0582n.f2114m = AbstractC0545H.m1364l(this.f9546c);
        interfaceC2226EMo344p.mo1176e(new C0583o(c0582n));
        this.f9549f.mo341l();
        this.f9549f.mo333b(new C2223B());
        this.f9548e = 1;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: j */
    public final void mo331j(long j3, long j4) {
        if (j3 == 0 || this.f9548e == 1) {
            this.f9548e = 1;
            this.f9547d = 0;
        }
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: m */
    public final List mo332m() {
        C1674E c1674e = AbstractC1676G.f7601h;
        return C1692X.f7629k;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: a */
    public final void mo325a() {
    }
}

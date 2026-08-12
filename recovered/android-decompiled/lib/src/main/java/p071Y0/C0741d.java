package p071Y0;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import p048Q0.C0508g;
import p055T.C0546I;
import p055T.C0587s;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1692X;
import p145s0.C2237j;
import p145s0.C2244q;
import p145s0.InterfaceC2240m;
import p145s0.InterfaceC2241n;
import p145s0.InterfaceC2242o;

/* JADX INFO: renamed from: Y0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0741d implements InterfaceC2240m {

    /* JADX INFO: renamed from: c */
    public final C0651s f2859c;

    /* JADX INFO: renamed from: d */
    public final C0508g f2860d;

    /* JADX INFO: renamed from: e */
    public InterfaceC2242o f2861e;

    /* JADX INFO: renamed from: f */
    public long f2862f;

    /* JADX INFO: renamed from: h */
    public boolean f2864h;

    /* JADX INFO: renamed from: i */
    public boolean f2865i;

    /* JADX INFO: renamed from: a */
    public final C0742e f2857a = new C0742e(null, true, 0);

    /* JADX INFO: renamed from: b */
    public final C0651s f2858b = new C0651s(2048);

    /* JADX INFO: renamed from: g */
    public long f2863g = -1;

    public C0741d() {
        C0651s c0651s = new C0651s(10);
        this.f2859c = c0651s;
        byte[] bArr = c0651s.f2520a;
        this.f2860d = new C0508g(bArr, bArr.length);
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: c */
    public final InterfaceC2240m mo327c() {
        return this;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: e */
    public final int mo328e(InterfaceC2241n interfaceC2241n, C0587s c0587s) throws EOFException, InterruptedIOException, C0546I {
        AbstractC0646n.m1631i(this.f2861e);
        long j3 = ((C2237j) interfaceC2241n).f9628i;
        C0651s c0651s = this.f2858b;
        int iMo345q = ((C2237j) interfaceC2241n).mo345q(c0651s.f2520a, 0, 2048);
        boolean z3 = iMo345q == -1;
        if (!this.f2865i) {
            this.f2861e.mo333b(new C2244q(-9223372036854775807L));
            this.f2865i = true;
        }
        if (z3) {
            return -1;
        }
        c0651s.m1665G(0);
        c0651s.m1664F(iMo345q);
        boolean z4 = this.f2864h;
        C0742e c0742e = this.f2857a;
        if (!z4) {
            c0742e.f2886t = this.f2862f;
            this.f2864h = true;
        }
        c0742e.mo1853c(c0651s);
        return 0;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: f */
    public final boolean mo329f(InterfaceC2241n interfaceC2241n) throws EOFException, InterruptedIOException {
        C2237j c2237j = (C2237j) interfaceC2241n;
        int i3 = 0;
        while (true) {
            C0651s c0651s = this.f2859c;
            c2237j.mo338i(c0651s.f2520a, 0, 10, false);
            c0651s.m1665G(0);
            if (c0651s.m1690x() != 4801587) {
                break;
            }
            c0651s.m1666H(3);
            int iM1686t = c0651s.m1686t();
            i3 += iM1686t + 10;
            c2237j.m4831b(iM1686t, false);
        }
        c2237j.f9631l = 0;
        c2237j.m4831b(i3, false);
        if (this.f2863g == -1) {
            this.f2863g = i3;
        }
        int i4 = i3;
        int i5 = 0;
        int i6 = 0;
        do {
            C0651s c0651s2 = this.f2859c;
            c2237j.mo338i(c0651s2.f2520a, 0, 2, false);
            c0651s2.m1665G(0);
            if ((c0651s2.m1659A() & 65526) == 65520) {
                i5++;
                if (i5 >= 4 && i6 > 188) {
                    return true;
                }
                c2237j.mo338i(c0651s2.f2520a, 0, 4, false);
                C0508g c0508g = this.f2860d;
                c0508g.m1260q(14);
                int iM1252i = c0508g.m1252i(13);
                if (iM1252i <= 6) {
                    i4++;
                    c2237j.f9631l = 0;
                    c2237j.m4831b(i4, false);
                } else {
                    c2237j.m4831b(iM1252i - 6, false);
                    i6 += iM1252i;
                }
            } else {
                i4++;
                c2237j.f9631l = 0;
                c2237j.m4831b(i4, false);
            }
            i5 = 0;
            i6 = 0;
        } while (i4 - i3 < 8192);
        return false;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: h */
    public final void mo330h(InterfaceC2242o interfaceC2242o) {
        this.f2861e = interfaceC2242o;
        this.f2857a.mo1855e(interfaceC2242o, new C0736G(0, 1));
        interfaceC2242o.mo341l();
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: j */
    public final void mo331j(long j3, long j4) {
        this.f2864h = false;
        this.f2857a.mo1852b();
        this.f2862f = j4;
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

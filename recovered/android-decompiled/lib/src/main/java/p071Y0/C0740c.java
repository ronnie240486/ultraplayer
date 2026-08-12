package p071Y0;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import p055T.C0587s;
import p064W.C0651s;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1692X;
import p145s0.C2237j;
import p145s0.C2244q;
import p145s0.InterfaceC2240m;
import p145s0.InterfaceC2241n;
import p145s0.InterfaceC2242o;

/* JADX INFO: renamed from: Y0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0740c implements InterfaceC2240m {

    /* JADX INFO: renamed from: a */
    public final C0739b f2854a = new C0739b(null, 0, 1);

    /* JADX INFO: renamed from: b */
    public final C0651s f2855b = new C0651s(16384);

    /* JADX INFO: renamed from: c */
    public boolean f2856c;

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: c */
    public final InterfaceC2240m mo327c() {
        return this;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: e */
    public final int mo328e(InterfaceC2241n interfaceC2241n, C0587s c0587s) throws EOFException, InterruptedIOException {
        C0651s c0651s = this.f2855b;
        int iMo345q = ((C2237j) interfaceC2241n).mo345q(c0651s.f2520a, 0, 16384);
        if (iMo345q == -1) {
            return -1;
        }
        c0651s.m1665G(0);
        c0651s.m1664F(iMo345q);
        boolean z3 = this.f2856c;
        C0739b c0739b = this.f2854a;
        if (!z3) {
            c0739b.f2853n = 0L;
            this.f2856c = true;
        }
        c0739b.mo1853c(c0651s);
        return 0;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: f */
    public final boolean mo329f(InterfaceC2241n interfaceC2241n) throws EOFException, InterruptedIOException {
        C2237j c2237j;
        int i3;
        C0651s c0651s = new C0651s(10);
        int i4 = 0;
        while (true) {
            c2237j = (C2237j) interfaceC2241n;
            c2237j.mo338i(c0651s.f2520a, 0, 10, false);
            c0651s.m1665G(0);
            if (c0651s.m1690x() != 4801587) {
                break;
            }
            c0651s.m1666H(3);
            int iM1686t = c0651s.m1686t();
            i4 += iM1686t + 10;
            c2237j.m4831b(iM1686t, false);
        }
        c2237j.f9631l = 0;
        c2237j.m4831b(i4, false);
        int i5 = i4;
        loop1: while (true) {
            int i6 = 0;
            while (true) {
                int i7 = 7;
                c2237j.mo338i(c0651s.f2520a, 0, 7, false);
                c0651s.m1665G(0);
                int iM1659A = c0651s.m1659A();
                if (iM1659A == 44096 || iM1659A == 44097) {
                    i6++;
                    if (i6 >= 4) {
                        return true;
                    }
                    byte[] bArr = c0651s.f2520a;
                    if (bArr.length < 7) {
                        i3 = -1;
                    } else {
                        int i8 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                        if (i8 == 65535) {
                            i8 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                        } else {
                            i7 = 4;
                        }
                        if (iM1659A == 44097) {
                            i7 += 2;
                        }
                        i3 = i8 + i7;
                    }
                    if (i3 == -1) {
                        break loop1;
                    }
                    c2237j.m4831b(i3 - 7, false);
                }
            }
            c2237j.f9631l = 0;
            i5++;
            if (i5 - i4 >= 8192) {
                break;
            }
            c2237j.m4831b(i5, false);
        }
        return false;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: h */
    public final void mo330h(InterfaceC2242o interfaceC2242o) {
        this.f2854a.mo1855e(interfaceC2242o, new C0736G(0, 1));
        interfaceC2242o.mo341l();
        interfaceC2242o.mo333b(new C2244q(-9223372036854775807L));
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: j */
    public final void mo331j(long j3, long j4) {
        this.f2856c = false;
        this.f2854a.mo1852b();
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

package p045P0;

import java.io.EOFException;
import p055T.AbstractC0545H;
import p055T.C0582n;
import p055T.C0583o;
import p055T.InterfaceC0575g;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p145s0.C2225D;
import p145s0.InterfaceC2226E;

/* JADX INFO: renamed from: P0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0467m implements InterfaceC2226E {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2226E f1539a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0463i f1540b;

    /* JADX INFO: renamed from: g */
    public InterfaceC0465k f1545g;

    /* JADX INFO: renamed from: h */
    public C0583o f1546h;

    /* JADX INFO: renamed from: d */
    public int f1542d = 0;

    /* JADX INFO: renamed from: e */
    public int f1543e = 0;

    /* JADX INFO: renamed from: f */
    public byte[] f1544f = AbstractC0632A.f2459f;

    /* JADX INFO: renamed from: c */
    public final C0651s f1541c = new C0651s();

    public C0467m(InterfaceC2226E interfaceC2226E, InterfaceC0463i interfaceC0463i) {
        this.f1539a = interfaceC2226E;
        this.f1540b = interfaceC0463i;
    }

    @Override // p145s0.InterfaceC2226E
    /* JADX INFO: renamed from: a */
    public final void mo1172a(long j3, int i3, int i4, int i5, C2225D c2225d) {
        if (this.f1545g == null) {
            this.f1539a.mo1172a(j3, i3, i4, i5, c2225d);
            return;
        }
        AbstractC0646n.m1624b("DRM on subtitles is not supported", c2225d == null);
        int i6 = (this.f1543e - i5) - i4;
        this.f1545g.mo520h(this.f1544f, i6, i4, C0464j.f1533c, new C0466l(this, j3, i3));
        int i7 = i6 + i4;
        this.f1542d = i7;
        if (i7 == this.f1543e) {
            this.f1542d = 0;
            this.f1543e = 0;
        }
    }

    @Override // p145s0.InterfaceC2226E
    /* JADX INFO: renamed from: b */
    public final void mo1173b(int i3, C0651s c0651s) {
        mo1175d(c0651s, i3, 0);
    }

    @Override // p145s0.InterfaceC2226E
    /* JADX INFO: renamed from: c */
    public final int mo1174c(InterfaceC0575g interfaceC0575g, int i3, boolean z3) {
        return mo1177f(interfaceC0575g, i3, z3);
    }

    @Override // p145s0.InterfaceC2226E
    /* JADX INFO: renamed from: d */
    public final void mo1175d(C0651s c0651s, int i3, int i4) {
        if (this.f1545g == null) {
            this.f1539a.mo1175d(c0651s, i3, i4);
            return;
        }
        m1178g(i3);
        c0651s.m1671e(this.f1544f, this.f1543e, i3);
        this.f1543e += i3;
    }

    @Override // p145s0.InterfaceC2226E
    /* JADX INFO: renamed from: e */
    public final void mo1176e(C0583o c0583o) {
        c0583o.f2154n.getClass();
        String str = c0583o.f2154n;
        AbstractC0646n.m1625c(AbstractC0545H.m1359g(str) == 3);
        boolean zEquals = c0583o.equals(this.f1546h);
        InterfaceC0463i interfaceC0463i = this.f1540b;
        if (!zEquals) {
            this.f1546h = c0583o;
            this.f1545g = interfaceC0463i.mo996y(c0583o) ? interfaceC0463i.mo976e(c0583o) : null;
        }
        InterfaceC0465k interfaceC0465k = this.f1545g;
        InterfaceC2226E interfaceC2226E = this.f1539a;
        if (interfaceC0465k == null) {
            interfaceC2226E.mo1176e(c0583o);
            return;
        }
        C0582n c0582nM1447a = c0583o.m1447a();
        c0582nM1447a.f2114m = AbstractC0545H.m1364l("application/x-media3-cues");
        c0582nM1447a.f2111j = str;
        c0582nM1447a.f2119r = Long.MAX_VALUE;
        c0582nM1447a.f2098H = interfaceC0463i.mo978g(c0583o);
        interfaceC2226E.mo1176e(new C0583o(c0582nM1447a));
    }

    @Override // p145s0.InterfaceC2226E
    /* JADX INFO: renamed from: f */
    public final int mo1177f(InterfaceC0575g interfaceC0575g, int i3, boolean z3) throws EOFException {
        if (this.f1545g == null) {
            return this.f1539a.mo1177f(interfaceC0575g, i3, z3);
        }
        m1178g(i3);
        int iMo345q = interfaceC0575g.mo345q(this.f1544f, this.f1543e, i3);
        if (iMo345q != -1) {
            this.f1543e += iMo345q;
            return iMo345q;
        }
        if (z3) {
            return -1;
        }
        throw new EOFException();
    }

    /* JADX INFO: renamed from: g */
    public final void m1178g(int i3) {
        int length = this.f1544f.length;
        int i4 = this.f1543e;
        if (length - i4 >= i3) {
            return;
        }
        int i5 = i4 - this.f1542d;
        int iMax = Math.max(i5 * 2, i3 + i5);
        byte[] bArr = this.f1544f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f1542d, bArr2, 0, i5);
        this.f1542d = 0;
        this.f1543e = i5;
        this.f1544f = bArr2;
    }
}

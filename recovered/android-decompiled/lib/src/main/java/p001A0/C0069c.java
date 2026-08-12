package p001A0;

import android.support.v4.media.session.C0858A;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Iterator;
import p019G1.C0233h;
import p028J1.C0309o;
import p037M1.C0391d;
import p064W.AbstractC0646n;
import p097f2.InterfaceC1558b;
import p145s0.C2237j;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2241n;
import p145s0.InterfaceC2242o;
import p145s0.InterfaceC2252y;

/* JADX INFO: renamed from: A0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0069c implements InterfaceC2241n, InterfaceC2242o, InterfaceC1558b {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f105g;

    /* JADX INFO: renamed from: h */
    public long f106h;

    /* JADX INFO: renamed from: i */
    public Object f107i;

    public /* synthetic */ C0069c(int i3, long j3, Object obj) {
        this.f105g = i3;
        this.f106h = j3;
        this.f107i = obj;
    }

    @Override // p145s0.InterfaceC2242o
    /* JADX INFO: renamed from: b */
    public void mo333b(InterfaceC2252y interfaceC2252y) {
        ((InterfaceC2242o) this.f107i).mo333b(new C0070d(this, interfaceC2252y, interfaceC2252y));
    }

    @Override // p145s0.InterfaceC2241n
    /* JADX INFO: renamed from: c */
    public void mo334c() {
        ((C2237j) this.f107i).f9631l = 0;
    }

    @Override // p145s0.InterfaceC2241n
    /* JADX INFO: renamed from: d */
    public void mo335d(int i3) {
        ((C2237j) this.f107i).mo335d(i3);
    }

    @Override // p145s0.InterfaceC2241n
    /* JADX INFO: renamed from: f */
    public boolean mo336f(byte[] bArr, int i3, int i4, boolean z3) {
        return ((C2237j) this.f107i).mo336f(bArr, 0, i4, z3);
    }

    @Override // p145s0.InterfaceC2241n
    /* JADX INFO: renamed from: g */
    public long mo337g() {
        return ((C2237j) this.f107i).f9628i - this.f106h;
    }

    @Override // p145s0.InterfaceC2241n
    /* JADX INFO: renamed from: i */
    public boolean mo338i(byte[] bArr, int i3, int i4, boolean z3) {
        return ((C2237j) this.f107i).mo338i(bArr, i3, i4, z3);
    }

    @Override // p145s0.InterfaceC2241n
    /* JADX INFO: renamed from: j */
    public long mo339j() {
        return ((C2237j) this.f107i).mo339j() - this.f106h;
    }

    @Override // p097f2.InterfaceC1558b
    /* JADX INFO: renamed from: k */
    public void mo340k(Exception exc) {
        int i3 = exc instanceof C0391d ? ((C0391d) exc).f1345g.f5497g : 13;
        Iterator it = ((C0233h) ((C0858A) this.f107i).f3641j).f604c.f835d.iterator();
        while (it.hasNext()) {
            ((C0309o) it.next()).m850b(this.f106h, i3, null);
        }
    }

    @Override // p145s0.InterfaceC2242o
    /* JADX INFO: renamed from: l */
    public void mo341l() {
        ((InterfaceC2242o) this.f107i).mo341l();
    }

    @Override // p145s0.InterfaceC2241n
    /* JADX INFO: renamed from: n */
    public void mo342n(byte[] bArr, int i3, int i4) {
        ((C2237j) this.f107i).mo338i(bArr, i3, i4, false);
    }

    @Override // p145s0.InterfaceC2241n
    /* JADX INFO: renamed from: o */
    public void mo343o(int i3) throws EOFException, InterruptedIOException {
        ((C2237j) this.f107i).m4831b(i3, false);
    }

    @Override // p145s0.InterfaceC2242o
    /* JADX INFO: renamed from: p */
    public InterfaceC2226E mo344p(int i3, int i4) {
        return ((InterfaceC2242o) this.f107i).mo344p(i3, i4);
    }

    @Override // p055T.InterfaceC0575g
    /* JADX INFO: renamed from: q */
    public int mo345q(byte[] bArr, int i3, int i4) {
        return ((C2237j) this.f107i).mo345q(bArr, i3, i4);
    }

    @Override // p145s0.InterfaceC2241n
    /* JADX INFO: renamed from: r */
    public long mo346r() {
        return ((C2237j) this.f107i).f9629j - this.f106h;
    }

    @Override // p145s0.InterfaceC2241n
    public void readFully(byte[] bArr, int i3, int i4) {
        ((C2237j) this.f107i).mo336f(bArr, i3, i4, false);
    }

    /* JADX INFO: renamed from: s */
    public void m347s(int i3) {
        if (i3 < 64) {
            this.f106h &= ~(1 << i3);
            return;
        }
        C0069c c0069c = (C0069c) this.f107i;
        if (c0069c != null) {
            c0069c.m347s(i3 - 64);
        }
    }

    /* JADX INFO: renamed from: t */
    public int m348t(int i3) {
        C0069c c0069c = (C0069c) this.f107i;
        if (c0069c == null) {
            return i3 >= 64 ? Long.bitCount(this.f106h) : Long.bitCount(this.f106h & ((1 << i3) - 1));
        }
        if (i3 < 64) {
            return Long.bitCount(this.f106h & ((1 << i3) - 1));
        }
        return Long.bitCount(this.f106h) + c0069c.m348t(i3 - 64);
    }

    public String toString() {
        switch (this.f105g) {
            case 4:
                if (((C0069c) this.f107i) == null) {
                    return Long.toBinaryString(this.f106h);
                }
                return ((C0069c) this.f107i).toString() + "xx" + Long.toBinaryString(this.f106h);
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m349u() {
        if (((C0069c) this.f107i) == null) {
            this.f107i = new C0069c();
        }
    }

    /* JADX INFO: renamed from: v */
    public boolean m350v(int i3) {
        if (i3 < 64) {
            return (this.f106h & (1 << i3)) != 0;
        }
        m349u();
        return ((C0069c) this.f107i).m350v(i3 - 64);
    }

    /* JADX INFO: renamed from: w */
    public void m351w(int i3, boolean z3) {
        if (i3 >= 64) {
            m349u();
            ((C0069c) this.f107i).m351w(i3 - 64, z3);
            return;
        }
        long j3 = this.f106h;
        boolean z4 = (Long.MIN_VALUE & j3) != 0;
        long j4 = (1 << i3) - 1;
        this.f106h = ((j3 & (~j4)) << 1) | (j3 & j4);
        if (z3) {
            m354z(i3);
        } else {
            m347s(i3);
        }
        if (z4 || ((C0069c) this.f107i) != null) {
            m349u();
            ((C0069c) this.f107i).m351w(0, z4);
        }
    }

    /* JADX INFO: renamed from: x */
    public boolean m352x(int i3) {
        if (i3 >= 64) {
            m349u();
            return ((C0069c) this.f107i).m352x(i3 - 64);
        }
        long j3 = 1 << i3;
        long j4 = this.f106h;
        boolean z3 = (j4 & j3) != 0;
        long j5 = j4 & (~j3);
        this.f106h = j5;
        long j6 = j3 - 1;
        this.f106h = (j5 & j6) | Long.rotateRight((~j6) & j5, 1);
        C0069c c0069c = (C0069c) this.f107i;
        if (c0069c != null) {
            if (c0069c.m350v(0)) {
                m354z(63);
            }
            ((C0069c) this.f107i).m352x(0);
        }
        return z3;
    }

    /* JADX INFO: renamed from: y */
    public void m353y() {
        this.f106h = 0L;
        C0069c c0069c = (C0069c) this.f107i;
        if (c0069c != null) {
            c0069c.m353y();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m354z(int i3) {
        if (i3 < 64) {
            this.f106h |= 1 << i3;
        } else {
            m349u();
            ((C0069c) this.f107i).m354z(i3 - 64);
        }
    }

    public /* synthetic */ C0069c(C0858A c0858a, long j3) {
        this.f105g = 3;
        this.f107i = c0858a;
        this.f106h = j3;
    }

    public C0069c(C2237j c2237j, long j3) {
        this.f105g = 1;
        this.f107i = c2237j;
        AbstractC0646n.m1625c(c2237j.f9629j >= j3);
        this.f106h = j3;
    }

    public C0069c() {
        this.f105g = 4;
        this.f106h = 0L;
    }
}

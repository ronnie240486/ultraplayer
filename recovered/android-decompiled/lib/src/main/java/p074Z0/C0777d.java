package p074Z0;

import android.util.Pair;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import p019G1.AbstractC0230e;
import p036M0.C0370g;
import p055T.C0546I;
import p055T.C0587s;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1692X;
import p145s0.C2237j;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2240m;
import p145s0.InterfaceC2241n;
import p145s0.InterfaceC2242o;

/* JADX INFO: renamed from: Z0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0777d implements InterfaceC2240m {

    /* JADX INFO: renamed from: a */
    public InterfaceC2242o f3174a;

    /* JADX INFO: renamed from: b */
    public InterfaceC2226E f3175b;

    /* JADX INFO: renamed from: c */
    public int f3176c;

    /* JADX INFO: renamed from: d */
    public long f3177d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0775b f3178e;

    /* JADX INFO: renamed from: f */
    public int f3179f;

    /* JADX INFO: renamed from: g */
    public long f3180g;

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: c */
    public final InterfaceC2240m mo327c() {
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0197  */
    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: e */
    public final int mo328e(InterfaceC2241n interfaceC2241n, C0587s c0587s) throws EOFException, InterruptedIOException, C0546I {
        byte[] bArr;
        int iM1605x;
        AbstractC0646n.m1631i(this.f3175b);
        int i3 = AbstractC0632A.f2454a;
        int i4 = this.f3176c;
        if (i4 == 0) {
            AbstractC0646n.m1630h(((C2237j) interfaceC2241n).f9629j == 0);
            int i5 = this.f3179f;
            if (i5 != -1) {
                ((C2237j) interfaceC2241n).mo335d(i5);
                this.f3176c = 4;
                return 0;
            }
            C2237j c2237j = (C2237j) interfaceC2241n;
            if (!AbstractC0230e.m730h(c2237j)) {
                throw C0546I.m1365a(null, "Unsupported or unrecognized wav file type.");
            }
            c2237j.mo335d((int) (c2237j.mo339j() - c2237j.f9629j));
            this.f3176c = 1;
            return 0;
        }
        long jM1676j = -1;
        if (i4 == 1) {
            C0651s c0651s = new C0651s(8);
            C2237j c2237j2 = (C2237j) interfaceC2241n;
            C0778e c0778eM1891a = C0778e.m1891a(c2237j2, c0651s);
            if (c0778eM1891a.f3181a != 1685272116) {
                c2237j2.f9631l = 0;
            } else {
                c2237j2.m4831b(8, false);
                c0651s.m1665G(0);
                C2237j c2237j3 = (C2237j) interfaceC2241n;
                c2237j3.mo338i(c0651s.f2520a, 0, 8, false);
                jM1676j = c0651s.m1676j();
                c2237j3.mo335d(((int) c0778eM1891a.f3182b) + 8);
            }
            this.f3177d = jM1676j;
            this.f3176c = 2;
            return 0;
        }
        if (i4 != 2) {
            if (i4 != 3) {
                if (i4 != 4) {
                    throw new IllegalStateException();
                }
                AbstractC0646n.m1630h(this.f3180g != -1);
                long j3 = this.f3180g - ((C2237j) interfaceC2241n).f9629j;
                InterfaceC0775b interfaceC0775b = this.f3178e;
                interfaceC0775b.getClass();
                return interfaceC0775b.mo1887a((C2237j) interfaceC2241n, j3) ? -1 : 0;
            }
            ((C2237j) interfaceC2241n).f9631l = 0;
            C2237j c2237j4 = (C2237j) interfaceC2241n;
            C0778e c0778eM744x = AbstractC0230e.m744x(1684108385, c2237j4, new C0651s(8));
            c2237j4.mo335d(8);
            Pair pairCreate = Pair.create(Long.valueOf(c2237j4.f9629j), Long.valueOf(c0778eM744x.f3182b));
            this.f3179f = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j4 = this.f3177d;
            if (j4 != -1 && jLongValue == 4294967295L) {
                jLongValue = j4;
            }
            long j5 = ((long) this.f3179f) + jLongValue;
            this.f3180g = j5;
            long j6 = c2237j4.f9628i;
            if (j6 != -1 && j5 > j6) {
                AbstractC0646n.m1647y("WavExtractor", "Data exceeds input length: " + this.f3180g + ", " + j6);
                this.f3180g = j6;
            }
            InterfaceC0775b interfaceC0775b2 = this.f3178e;
            interfaceC0775b2.getClass();
            interfaceC0775b2.mo1888b(this.f3179f, this.f3180g);
            this.f3176c = 4;
            return 0;
        }
        C0651s c0651s2 = new C0651s(16);
        C2237j c2237j5 = (C2237j) interfaceC2241n;
        long j7 = AbstractC0230e.m744x(1718449184, c2237j5, c0651s2).f3182b;
        AbstractC0646n.m1630h(j7 >= 16);
        c2237j5.mo338i(c0651s2.f2520a, 0, 16, false);
        c0651s2.m1665G(0);
        int iM1680n = c0651s2.m1680n();
        int iM1680n2 = c0651s2.m1680n();
        int iM1679m = c0651s2.m1679m();
        c0651s2.m1679m();
        int iM1680n3 = c0651s2.m1680n();
        int iM1680n4 = c0651s2.m1680n();
        int i6 = ((int) j7) - 16;
        if (i6 > 0) {
            bArr = new byte[i6];
            ((C2237j) interfaceC2241n).mo338i(bArr, 0, i6, false);
        } else {
            bArr = AbstractC0632A.f2459f;
        }
        byte[] bArr2 = bArr;
        C2237j c2237j6 = (C2237j) interfaceC2241n;
        c2237j6.mo335d((int) (c2237j6.mo339j() - c2237j6.f9629j));
        C0370g c0370g = new C0370g(iM1680n, iM1680n2, iM1679m, iM1680n3, iM1680n4, bArr2);
        if (iM1680n == 17) {
            this.f3178e = new C0774a(this.f3174a, this.f3175b, c0370g);
        } else if (iM1680n == 6) {
            this.f3178e = new C0776c(this.f3174a, this.f3175b, c0370g, "audio/g711-alaw", -1);
        } else if (iM1680n == 7) {
            this.f3178e = new C0776c(this.f3174a, this.f3175b, c0370g, "audio/g711-mlaw", -1);
        } else {
            if (iM1680n == 1) {
                iM1605x = AbstractC0632A.m1605x(iM1680n4);
            } else {
                if (iM1680n != 3) {
                    if (iM1680n == 65534) {
                        iM1605x = AbstractC0632A.m1605x(iM1680n4);
                    }
                } else if (iM1680n4 == 32) {
                    iM1605x = 4;
                }
                iM1605x = 0;
            }
            if (iM1605x == 0) {
                throw C0546I.m1367c("Unsupported WAV format type: " + iM1680n);
            }
            this.f3178e = new C0776c(this.f3174a, this.f3175b, c0370g, "audio/raw", iM1605x);
        }
        this.f3176c = 3;
        return 0;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: f */
    public final boolean mo329f(InterfaceC2241n interfaceC2241n) {
        return AbstractC0230e.m730h((C2237j) interfaceC2241n);
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: h */
    public final void mo330h(InterfaceC2242o interfaceC2242o) {
        this.f3174a = interfaceC2242o;
        this.f3175b = interfaceC2242o.mo344p(0, 1);
        interfaceC2242o.mo341l();
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: j */
    public final void mo331j(long j3, long j4) {
        this.f3176c = j3 == 0 ? 0 : 4;
        InterfaceC0775b interfaceC0775b = this.f3178e;
        if (interfaceC0775b != null) {
            interfaceC0775b.mo1889c(j4);
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

package p149t0;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import p030K0.C0334e;
import p033L0.C0338a;
import p055T.AbstractC0545H;
import p055T.C0546I;
import p055T.C0582n;
import p055T.C0583o;
import p055T.C0587s;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1692X;
import p145s0.C2237j;
import p145s0.C2239l;
import p145s0.C2244q;
import p145s0.C2249v;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2240m;
import p145s0.InterfaceC2241n;
import p145s0.InterfaceC2242o;
import p145s0.InterfaceC2252y;

/* JADX INFO: renamed from: t0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2274a implements InterfaceC2240m {

    /* JADX INFO: renamed from: q */
    public static final int[] f9723q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: r */
    public static final int[] f9724r = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: s */
    public static final byte[] f9725s;

    /* JADX INFO: renamed from: t */
    public static final byte[] f9726t;

    /* JADX INFO: renamed from: b */
    public final C2239l f9728b;

    /* JADX INFO: renamed from: c */
    public boolean f9729c;

    /* JADX INFO: renamed from: d */
    public long f9730d;

    /* JADX INFO: renamed from: e */
    public int f9731e;

    /* JADX INFO: renamed from: f */
    public int f9732f;

    /* JADX INFO: renamed from: h */
    public int f9734h;

    /* JADX INFO: renamed from: i */
    public long f9735i;

    /* JADX INFO: renamed from: j */
    public InterfaceC2242o f9736j;

    /* JADX INFO: renamed from: k */
    public InterfaceC2226E f9737k;

    /* JADX INFO: renamed from: l */
    public InterfaceC2226E f9738l;

    /* JADX INFO: renamed from: m */
    public InterfaceC2252y f9739m;

    /* JADX INFO: renamed from: n */
    public boolean f9740n;

    /* JADX INFO: renamed from: o */
    public long f9741o;

    /* JADX INFO: renamed from: p */
    public boolean f9742p;

    /* JADX INFO: renamed from: a */
    public final byte[] f9727a = new byte[1];

    /* JADX INFO: renamed from: g */
    public int f9733g = -1;

    static {
        int i3 = AbstractC0632A.f2454a;
        Charset charset = StandardCharsets.UTF_8;
        f9725s = "#!AMR\n".getBytes(charset);
        f9726t = "#!AMR-WB\n".getBytes(charset);
    }

    public C2274a() {
        C2239l c2239l = new C2239l();
        this.f9728b = c2239l;
        this.f9738l = c2239l;
    }

    /* JADX INFO: renamed from: b */
    public final int m4882b(C2237j c2237j) throws C0546I {
        boolean z3;
        c2237j.f9631l = 0;
        byte[] bArr = this.f9727a;
        c2237j.mo338i(bArr, 0, 1, false);
        byte b3 = bArr[0];
        if ((b3 & 131) > 0) {
            throw C0546I.m1365a(null, "Invalid padding bits for frame header " + ((int) b3));
        }
        int i3 = (b3 >> 3) & 15;
        if (i3 >= 0 && i3 <= 15 && (((z3 = this.f9729c) && (i3 < 10 || i3 > 13)) || (!z3 && (i3 < 12 || i3 > 14)))) {
            return z3 ? f9724r[i3] : f9723q[i3];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.f9729c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i3);
        throw C0546I.m1365a(null, sb.toString());
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: c */
    public final InterfaceC2240m mo327c() {
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4883d(C2237j c2237j) {
        c2237j.f9631l = 0;
        byte[] bArr = f9725s;
        byte[] bArr2 = new byte[bArr.length];
        c2237j.mo338i(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f9729c = false;
            c2237j.mo335d(bArr.length);
            return true;
        }
        c2237j.f9631l = 0;
        byte[] bArr3 = f9726t;
        byte[] bArr4 = new byte[bArr3.length];
        c2237j.mo338i(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f9729c = true;
        c2237j.mo335d(bArr3.length);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00e9  */
    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: e */
    public final int mo328e(InterfaceC2241n interfaceC2241n, C0587s c0587s) throws C0546I {
        long j3;
        AbstractC0646n.m1631i(this.f9737k);
        int i3 = AbstractC0632A.f2454a;
        if (((C2237j) interfaceC2241n).f9629j == 0 && !m4883d((C2237j) interfaceC2241n)) {
            throw C0546I.m1365a(null, "Could not find AMR header.");
        }
        if (!this.f9742p) {
            this.f9742p = true;
            boolean z3 = this.f9729c;
            String str = z3 ? "audio/amr-wb" : "audio/3gpp";
            int i4 = z3 ? 16000 : 8000;
            int i5 = z3 ? f9724r[8] : f9723q[7];
            InterfaceC2226E interfaceC2226E = this.f9738l;
            C0582n c0582n = new C0582n();
            c0582n.f2114m = AbstractC0545H.m1364l(str);
            c0582n.f2115n = i5;
            c0582n.f2092B = 1;
            c0582n.f2093C = i4;
            interfaceC2226E.mo1176e(new C0583o(c0582n));
        }
        int i6 = 0;
        if (this.f9732f == 0) {
            try {
                int iM4882b = m4882b((C2237j) interfaceC2241n);
                this.f9731e = iM4882b;
                this.f9732f = iM4882b;
                if (this.f9733g == -1) {
                    long j4 = ((C2237j) interfaceC2241n).f9629j;
                    this.f9733g = iM4882b;
                }
                if (this.f9733g == iM4882b) {
                    this.f9734h++;
                }
                InterfaceC2252y interfaceC2252y = this.f9739m;
                if (interfaceC2252y instanceof C2249v) {
                    C2249v c2249v = (C2249v) interfaceC2252y;
                    long j5 = this.f9735i + this.f9730d + 20000;
                    j3 = 20000;
                    long j6 = ((C2237j) interfaceC2241n).f9629j + ((long) iM4882b);
                    C0334e c0334e = c2249v.f9674b;
                    int i7 = c0334e.f1062g;
                    if (i7 == 0 || j5 - c0334e.m927g(i7 - 1) >= 100000) {
                        C0334e c0334e2 = c2249v.f9674b;
                        int i8 = c0334e2.f1062g;
                        C0334e c0334e3 = c2249v.f9673a;
                        if (i8 == 0 && j5 > 0) {
                            c0334e3.m922b(0L);
                            c0334e2.m922b(0L);
                        }
                        c0334e3.m922b(j6);
                        c0334e2.m922b(j5);
                    }
                    if (this.f9740n && Math.abs(this.f9741o - j5) < 20000) {
                        this.f9740n = false;
                        this.f9738l = this.f9737k;
                    }
                } else {
                    j3 = 20000;
                }
            } catch (EOFException unused) {
            }
        } else {
            j3 = 20000;
        }
        int iMo1174c = this.f9738l.mo1174c(interfaceC2241n, this.f9732f, true);
        if (iMo1174c == -1) {
            i6 = -1;
        } else {
            int i9 = this.f9732f - iMo1174c;
            this.f9732f = i9;
            if (i9 <= 0) {
                this.f9738l.mo1172a(this.f9735i + this.f9730d, 1, this.f9731e, 0, null);
                this.f9730d += j3;
            }
        }
        if (this.f9739m == null) {
            C2244q c2244q = new C2244q(-9223372036854775807L);
            this.f9739m = c2244q;
            this.f9736j.mo333b(c2244q);
        }
        if (i6 == -1) {
            InterfaceC2252y interfaceC2252y2 = this.f9739m;
            if (interfaceC2252y2 instanceof C2249v) {
                ((C2249v) interfaceC2252y2).f9675c = this.f9735i + this.f9730d;
                this.f9736j.mo333b(interfaceC2252y2);
            }
        }
        return i6;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: f */
    public final boolean mo329f(InterfaceC2241n interfaceC2241n) {
        return m4883d((C2237j) interfaceC2241n);
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: h */
    public final void mo330h(InterfaceC2242o interfaceC2242o) {
        this.f9736j = interfaceC2242o;
        InterfaceC2226E interfaceC2226EMo344p = interfaceC2242o.mo344p(0, 1);
        this.f9737k = interfaceC2226EMo344p;
        this.f9738l = interfaceC2226EMo344p;
        interfaceC2242o.mo341l();
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: j */
    public final void mo331j(long j3, long j4) {
        this.f9730d = 0L;
        this.f9731e = 0;
        this.f9732f = 0;
        this.f9741o = j4;
        InterfaceC2252y interfaceC2252y = this.f9739m;
        if (!(interfaceC2252y instanceof C2249v)) {
            if (j3 == 0 || !(interfaceC2252y instanceof C0338a)) {
                this.f9735i = 0L;
                return;
            } else {
                C0338a c0338a = (C0338a) interfaceC2252y;
                this.f9735i = (Math.max(0L, j3 - c0338a.f1074b) * 8000000) / ((long) c0338a.f1077e);
                return;
            }
        }
        C2249v c2249v = (C2249v) interfaceC2252y;
        C0334e c0334e = c2249v.f9674b;
        long jM927g = c0334e.f1062g == 0 ? -9223372036854775807L : c0334e.m927g(AbstractC0632A.m1583b(c2249v.f9673a, j3));
        this.f9735i = jM927g;
        if (Math.abs(this.f9741o - jM927g) < 20000) {
            return;
        }
        this.f9740n = true;
        this.f9738l = this.f9728b;
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

package p036M0;

import android.os.Parcelable;
import android.support.v4.media.session.C0858A;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p000A.C0041i;
import p018G0.AbstractC0220j;
import p018G0.C0221k;
import p018G0.C0224n;
import p021H0.C0253a;
import p021H0.C0254b;
import p021H0.C0255c;
import p021H0.C0256d;
import p045P0.AbstractC0462h;
import p045P0.InterfaceC0463i;
import p055T.C0544G;
import p055T.C0546I;
import p055T.C0582n;
import p055T.C0583o;
import p055T.C0587s;
import p055T.InterfaceC0543F;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p067X.AbstractC0672d;
import p067X.AbstractC0684p;
import p067X.C0669a;
import p067X.C0670b;
import p067X.C0671c;
import p067X.C0673e;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1692X;
import p145s0.AbstractC2229b;
import p145s0.C2227F;
import p145s0.C2244q;
import p145s0.C2247t;
import p145s0.C2251x;
import p145s0.C2253z;
import p145s0.InterfaceC2224C;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2240m;
import p145s0.InterfaceC2241n;
import p145s0.InterfaceC2242o;
import p145s0.InterfaceC2252y;

/* JADX INFO: renamed from: M0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0379p implements InterfaceC2240m, InterfaceC2252y {

    /* JADX INFO: renamed from: A */
    public C0378o[] f1258A;

    /* JADX INFO: renamed from: B */
    public long[][] f1259B;

    /* JADX INFO: renamed from: C */
    public int f1260C;

    /* JADX INFO: renamed from: D */
    public long f1261D;

    /* JADX INFO: renamed from: E */
    public int f1262E;

    /* JADX INFO: renamed from: F */
    public C0253a f1263F;

    /* JADX INFO: renamed from: a */
    public final InterfaceC0463i f1264a;

    /* JADX INFO: renamed from: b */
    public final int f1265b;

    /* JADX INFO: renamed from: c */
    public final C0651s f1266c;

    /* JADX INFO: renamed from: d */
    public final C0651s f1267d;

    /* JADX INFO: renamed from: e */
    public final C0651s f1268e;

    /* JADX INFO: renamed from: f */
    public final C0651s f1269f;

    /* JADX INFO: renamed from: g */
    public final ArrayDeque f1270g;

    /* JADX INFO: renamed from: h */
    public final C0382s f1271h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f1272i;

    /* JADX INFO: renamed from: j */
    public C1692X f1273j;

    /* JADX INFO: renamed from: k */
    public int f1274k;

    /* JADX INFO: renamed from: l */
    public int f1275l;

    /* JADX INFO: renamed from: m */
    public long f1276m;

    /* JADX INFO: renamed from: n */
    public int f1277n;

    /* JADX INFO: renamed from: o */
    public C0651s f1278o;

    /* JADX INFO: renamed from: p */
    public int f1279p;

    /* JADX INFO: renamed from: q */
    public int f1280q;

    /* JADX INFO: renamed from: r */
    public int f1281r;

    /* JADX INFO: renamed from: s */
    public int f1282s;

    /* JADX INFO: renamed from: t */
    public boolean f1283t;

    /* JADX INFO: renamed from: u */
    public boolean f1284u;

    /* JADX INFO: renamed from: v */
    public boolean f1285v;

    /* JADX INFO: renamed from: w */
    public long f1286w;

    /* JADX INFO: renamed from: x */
    public boolean f1287x;

    /* JADX INFO: renamed from: y */
    public long f1288y;

    /* JADX INFO: renamed from: z */
    public InterfaceC2242o f1289z;

    public C0379p(InterfaceC0463i interfaceC0463i, int i3) {
        this.f1264a = interfaceC0463i;
        this.f1265b = i3;
        C1674E c1674e = AbstractC1676G.f7601h;
        this.f1273j = C1692X.f7629k;
        this.f1274k = (i3 & 4) != 0 ? 3 : 0;
        this.f1271h = new C0382s();
        this.f1272i = new ArrayList();
        this.f1269f = new C0651s(16);
        this.f1270g = new ArrayDeque();
        this.f1266c = new C0651s(AbstractC0684p.f2629a);
        this.f1267d = new C0651s(5);
        this.f1268e = new C0651s();
        this.f1279p = -1;
        this.f1289z = InterfaceC2242o.f9641f;
        this.f1258A = new C0378o[0];
        this.f1283t = (i3 & 32) == 0;
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: b */
    public final boolean mo941b() {
        return true;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: c */
    public final InterfaceC2240m mo327c() {
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:253:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:258:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c4  */
    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: e */
    public final int mo328e(InterfaceC2241n interfaceC2241n, C0587s c0587s) throws C0546I {
        C0670b c0670b;
        boolean z3;
        int i3;
        int i4;
        long j3;
        char c;
        boolean z4;
        boolean z5;
        do {
            do {
                int i5 = 4;
                int i6 = this.f1274k;
                ArrayDeque arrayDeque = this.f1270g;
                int i7 = this.f1265b;
                C0651s c0651s = this.f1268e;
                if (i6 == 0) {
                    int i8 = this.f1277n;
                    C0651s c0651s2 = this.f1269f;
                    if (i8 == 0) {
                        if (interfaceC2241n.mo336f(c0651s2.f2520a, 0, 8, true)) {
                            this.f1277n = 8;
                            c0651s2.m1665G(0);
                            this.f1276m = c0651s2.m1689w();
                            this.f1275l = c0651s2.m1673g();
                        } else {
                            if (this.f1262E == 2 && (i7 & 2) != 0) {
                                InterfaceC2226E interfaceC2226EMo344p = this.f1289z.mo344p(0, 4);
                                C0253a c0253a = this.f1263F;
                                C0544G c0544g = c0253a == null ? null : new C0544G(c0253a);
                                C0582n c0582n = new C0582n();
                                c0582n.f2112k = c0544g;
                                interfaceC2226EMo344p.mo1176e(new C0583o(c0582n));
                                this.f1289z.mo341l();
                                this.f1289z.mo333b(new C2244q(-9223372036854775807L));
                            }
                            z3 = false;
                        }
                    }
                    long j4 = this.f1276m;
                    if (j4 == 1) {
                        interfaceC2241n.readFully(c0651s2.f2520a, 8, 8);
                        this.f1277n += 8;
                        this.f1276m = c0651s2.m1692z();
                    } else if (j4 == 0) {
                        long jMo337g = interfaceC2241n.mo337g();
                        if (jMo337g == -1 && (c0670b = (C0670b) arrayDeque.peek()) != null) {
                            jMo337g = c0670b.f2568i;
                        }
                        if (jMo337g != -1) {
                            this.f1276m = (jMo337g - interfaceC2241n.mo346r()) + ((long) this.f1277n);
                        }
                    }
                    long j5 = this.f1276m;
                    int i9 = this.f1277n;
                    if (j5 < i9) {
                        throw C0546I.m1367c("Atom size less than header length (unsupported).");
                    }
                    int i10 = this.f1275l;
                    if (i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473 || i10 == 1701082724) {
                        long jMo346r = interfaceC2241n.mo346r();
                        long j6 = this.f1276m;
                        long j7 = this.f1277n;
                        long j8 = (jMo346r + j6) - j7;
                        if (j6 != j7 && this.f1275l == 1835365473) {
                            c0651s.m1662D(8);
                            interfaceC2241n.mo342n(c0651s.f2520a, 0, 8);
                            byte[] bArr = AbstractC0371h.f1191a;
                            int i11 = c0651s.f2521b;
                            c0651s.m1666H(4);
                            if (c0651s.m1673g() != 1751411826) {
                                i11 += 4;
                            }
                            c0651s.m1665G(i11);
                            interfaceC2241n.mo335d(c0651s.f2521b);
                            interfaceC2241n.mo334c();
                        }
                        arrayDeque.push(new C0670b(this.f1275l, j8));
                        if (this.f1276m == this.f1277n) {
                            m1039n(j8);
                        } else {
                            this.f1274k = 0;
                            this.f1277n = 0;
                        }
                        z3 = true;
                    } else if (i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124) {
                        AbstractC0646n.m1630h(i9 == 8);
                        AbstractC0646n.m1630h(this.f1276m <= 2147483647L);
                        C0651s c0651s3 = new C0651s((int) this.f1276m);
                        System.arraycopy(c0651s2.f2520a, 0, c0651s3.f2520a, 0, 8);
                        this.f1278o = c0651s3;
                        this.f1274k = 1;
                    } else {
                        long jMo346r2 = interfaceC2241n.mo346r();
                        long j9 = this.f1277n;
                        long j10 = jMo346r2 - j9;
                        if (this.f1275l == 1836086884) {
                            this.f1263F = new C0253a(0L, j10, -9223372036854775807L, j10 + j9, this.f1276m - j9);
                        }
                        this.f1278o = null;
                        this.f1274k = 1;
                    }
                    z3 = true;
                } else {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            long jMo346r3 = interfaceC2241n.mo346r();
                            if (this.f1279p == -1) {
                                int i12 = -1;
                                int i13 = -1;
                                boolean z6 = true;
                                boolean z7 = true;
                                int i14 = 0;
                                long j11 = Long.MAX_VALUE;
                                long j12 = Long.MAX_VALUE;
                                long j13 = Long.MAX_VALUE;
                                while (true) {
                                    C0378o[] c0378oArr = this.f1258A;
                                    if (i14 >= c0378oArr.length) {
                                        break;
                                    }
                                    C0378o c0378o = c0378oArr[i14];
                                    int i15 = c0378o.f1257e;
                                    C0387x c0387x = c0378o.f1254b;
                                    if (i15 != c0387x.f1337b) {
                                        long j14 = c0387x.f1338c[i15];
                                        long[][] jArr = this.f1259B;
                                        int i16 = AbstractC0632A.f2454a;
                                        long j15 = jArr[i14][i15];
                                        long j16 = j14 - jMo346r3;
                                        boolean z8 = j16 < 0 || j16 >= 262144;
                                        if ((!z8 && z7) || (z8 == z7 && j16 < j13)) {
                                            z7 = z8;
                                            j12 = j15;
                                            i13 = i14;
                                            j13 = j16;
                                        }
                                        if (j15 < j11) {
                                            z6 = z8;
                                            j11 = j15;
                                            i12 = i14;
                                        }
                                    }
                                    i14++;
                                }
                                if (j11 == Long.MAX_VALUE || !z6 || j12 < j11 + 10485760) {
                                    i12 = i13;
                                }
                                this.f1279p = i12;
                                if (i12 == -1) {
                                    return -1;
                                }
                            }
                            C0378o c0378o2 = this.f1258A[this.f1279p];
                            InterfaceC2226E interfaceC2226E = c0378o2.f1255c;
                            int i17 = c0378o2.f1257e;
                            C0387x c0387x2 = c0378o2.f1254b;
                            long j17 = c0387x2.f1338c[i17] + this.f1288y;
                            int i18 = c0387x2.f1339d[i17];
                            long j18 = (j17 - jMo346r3) + ((long) this.f1280q);
                            if (j18 < 0 || j18 >= 262144) {
                                c0587s.f2181a = j17;
                                return 1;
                            }
                            C0384u c0384u = c0378o2.f1253a;
                            if (c0384u.f1309h == 1) {
                                j18 += 8;
                                i18 -= 8;
                            }
                            interfaceC2241n.mo335d((int) j18);
                            C0583o c0583o = c0384u.f1308g;
                            if (!Objects.equals(c0583o.f2154n, "video/avc")) {
                                this.f1283t = true;
                            }
                            int i19 = c0384u.f1312k;
                            C2227F c2227f = c0378o2.f1256d;
                            if (i19 == 0) {
                                if ("audio/ac4".equals(c0583o.f2154n)) {
                                    if (this.f1281r == 0) {
                                        AbstractC2229b.m4812g(i18, c0651s);
                                        i3 = 7;
                                        interfaceC2226E.mo1173b(7, c0651s);
                                        this.f1281r += 7;
                                    } else {
                                        i3 = 7;
                                    }
                                    i18 += i3;
                                } else if (c2227f != null) {
                                    c2227f.m4805c(interfaceC2241n);
                                }
                                while (true) {
                                    int i20 = this.f1281r;
                                    if (i20 >= i18) {
                                        break;
                                    }
                                    int iMo1174c = interfaceC2226E.mo1174c(interfaceC2241n, i18 - i20, false);
                                    this.f1280q += iMo1174c;
                                    this.f1281r += iMo1174c;
                                    this.f1282s -= iMo1174c;
                                }
                            } else {
                                C0651s c0651s4 = this.f1267d;
                                byte[] bArr2 = c0651s4.f2520a;
                                bArr2[0] = 0;
                                bArr2[1] = 0;
                                bArr2[2] = 0;
                                int i21 = i19 + 1;
                                int i22 = 4 - i19;
                                while (this.f1281r < i18) {
                                    int i23 = this.f1282s;
                                    if (i23 == 0) {
                                        interfaceC2241n.readFully(bArr2, i22, i21);
                                        this.f1280q += i21;
                                        c0651s4.m1665G(0);
                                        int iM1673g = c0651s4.m1673g();
                                        if (iM1673g < 1) {
                                            throw C0546I.m1365a(null, "Invalid NAL length");
                                        }
                                        this.f1282s = iM1673g - 1;
                                        C0651s c0651s5 = this.f1266c;
                                        c0651s5.m1665G(0);
                                        interfaceC2226E.mo1173b(4, c0651s5);
                                        interfaceC2226E.mo1173b(1, c0651s4);
                                        this.f1281r += 5;
                                        i18 += i22;
                                        if (!this.f1283t && AbstractC0684p.m1790c(bArr2[4])) {
                                            this.f1283t = true;
                                        }
                                    } else {
                                        int iMo1174c2 = interfaceC2226E.mo1174c(interfaceC2241n, i23, false);
                                        this.f1280q += iMo1174c2;
                                        this.f1281r += iMo1174c2;
                                        this.f1282s -= iMo1174c2;
                                    }
                                }
                            }
                            int i24 = i18;
                            long j19 = c0387x2.f1341f[i17];
                            int i25 = c0387x2.f1342g[i17];
                            if (!this.f1283t) {
                                i25 |= 67108864;
                            }
                            int i26 = i25;
                            if (c2227f != null) {
                                c2227f.m4804b(interfaceC2226E, j19, i26, i24, 0, null);
                                if (i17 + 1 == c0387x2.f1337b) {
                                    c2227f.m4803a(interfaceC2226E, null);
                                }
                            } else {
                                interfaceC2226E.mo1172a(j19, i26, i24, 0, null);
                            }
                            c0378o2.f1257e++;
                            this.f1279p = -1;
                            this.f1280q = 0;
                            this.f1281r = 0;
                            this.f1282s = 0;
                            this.f1283t = (i7 & 32) == 0;
                            return 0;
                        }
                        if (i6 != 3) {
                            throw new IllegalStateException();
                        }
                        ArrayList arrayList = this.f1272i;
                        C0382s c0382s = this.f1271h;
                        int i27 = c0382s.f1299b;
                        if (i27 != 0) {
                            if (i27 != 1) {
                                ArrayList arrayList2 = c0382s.f1298a;
                                short s3 = 2192;
                                if (i27 == 2) {
                                    long jMo337g2 = interfaceC2241n.mo337g();
                                    int i28 = c0382s.f1300c - 20;
                                    C0651s c0651s6 = new C0651s(i28);
                                    interfaceC2241n.readFully(c0651s6.f2520a, 0, i28);
                                    int i29 = 0;
                                    while (i29 < i28 / 12) {
                                        c0651s6.m1666H(2);
                                        short sM1677k = c0651s6.m1677k();
                                        if (sM1677k != s3 && sM1677k != 2816 && sM1677k != 2817 && sM1677k != 2819) {
                                            if (sM1677k != 2820) {
                                                c0651s6.m1666H(8);
                                                j3 = jMo337g2;
                                            }
                                            i29++;
                                            jMo337g2 = j3;
                                            s3 = 2192;
                                        }
                                        j3 = jMo337g2;
                                        arrayList2.add(new C0381r(c0651s6.m1675i(), (j3 - ((long) c0382s.f1300c)) - ((long) c0651s6.m1675i())));
                                        i29++;
                                        jMo337g2 = j3;
                                        s3 = 2192;
                                    }
                                    if (arrayList2.isEmpty()) {
                                        c0587s.f2181a = 0L;
                                    } else {
                                        c0382s.f1299b = 3;
                                        c0587s.f2181a = ((C0381r) arrayList2.get(0)).f1294a;
                                    }
                                } else {
                                    if (i27 != 3) {
                                        throw new IllegalStateException();
                                    }
                                    long jMo346r4 = interfaceC2241n.mo346r();
                                    int iMo337g = (int) ((interfaceC2241n.mo337g() - interfaceC2241n.mo346r()) - ((long) c0382s.f1300c));
                                    C0651s c0651s7 = new C0651s(iMo337g);
                                    interfaceC2241n.readFully(c0651s7.f2520a, 0, iMo337g);
                                    int i30 = 0;
                                    while (i30 < arrayList2.size()) {
                                        C0381r c0381r = (C0381r) arrayList2.get(i30);
                                        c0651s7.m1665G((int) (c0381r.f1294a - jMo346r4));
                                        c0651s7.m1666H(i5);
                                        int iM1675i = c0651s7.m1675i();
                                        Charset charset = StandardCharsets.UTF_8;
                                        switch (c0651s7.m1685s(iM1675i, charset)) {
                                            case "SlowMotion_Data":
                                                c = 2192;
                                                break;
                                            case "Super_SlowMotion_Edit_Data":
                                                c = 2819;
                                                break;
                                            case "Super_SlowMotion_Data":
                                                c = 2816;
                                                break;
                                            case "Super_SlowMotion_Deflickering_On":
                                                c = 2820;
                                                break;
                                            case "Super_SlowMotion_BGM":
                                                c = 2817;
                                                break;
                                            default:
                                                throw C0546I.m1365a(null, "Invalid SEF name");
                                        }
                                        int i31 = c0381r.f1295b - (iM1675i + 8);
                                        if (c == 2192) {
                                            ArrayList arrayList3 = new ArrayList();
                                            List listM1052o = C0382s.f1297e.m1052o(c0651s7.m1685s(i31, charset));
                                            for (int i32 = 0; i32 < listM1052o.size(); i32++) {
                                                List listM1052o2 = C0382s.f1296d.m1052o((CharSequence) listM1052o.get(i32));
                                                if (listM1052o2.size() != 3) {
                                                    throw C0546I.m1365a(null, null);
                                                }
                                                try {
                                                    arrayList3.add(new C0254b(1 << (Integer.parseInt((String) listM1052o2.get(2)) - 1), Long.parseLong((String) listM1052o2.get(0)), Long.parseLong((String) listM1052o2.get(1))));
                                                } catch (NumberFormatException e3) {
                                                    throw C0546I.m1365a(e3, null);
                                                }
                                            }
                                            arrayList.add(new C0255c(arrayList3));
                                        } else if (c != 2816 && c != 2817 && c != 2819 && c != 2820) {
                                            throw new IllegalStateException();
                                        }
                                        i30++;
                                        i5 = 4;
                                    }
                                    c0587s.f2181a = 0L;
                                }
                            } else {
                                C0651s c0651s8 = new C0651s(8);
                                interfaceC2241n.readFully(c0651s8.f2520a, 0, 8);
                                c0382s.f1300c = c0651s8.m1675i() + 8;
                                if (c0651s8.m1673g() != 1397048916) {
                                    c0587s.f2181a = 0L;
                                } else {
                                    c0587s.f2181a = interfaceC2241n.mo346r() - ((long) (c0382s.f1300c - 12));
                                    c0382s.f1299b = 2;
                                }
                            }
                            i4 = 1;
                        } else {
                            long jMo337g3 = interfaceC2241n.mo337g();
                            c0587s.f2181a = (jMo337g3 == -1 || jMo337g3 < 8) ? 0L : jMo337g3 - 8;
                            i4 = 1;
                            c0382s.f1299b = 1;
                        }
                        if (c0587s.f2181a != 0) {
                            return 1;
                        }
                        this.f1274k = 0;
                        this.f1277n = 0;
                        return i4;
                    }
                    long j20 = this.f1276m - ((long) this.f1277n);
                    long jMo346r5 = interfaceC2241n.mo346r() + j20;
                    C0651s c0651s9 = this.f1278o;
                    if (c0651s9 != null) {
                        interfaceC2241n.readFully(c0651s9.f2520a, this.f1277n, (int) j20);
                        if (this.f1275l == 1718909296) {
                            this.f1284u = true;
                            c0651s9.m1665G(8);
                            int iM1673g2 = c0651s9.m1673g();
                            int i33 = iM1673g2 != 1751476579 ? iM1673g2 != 1903435808 ? 0 : 1 : 2;
                            if (i33 == 0) {
                                c0651s9.m1666H(4);
                                do {
                                    if (c0651s9.m1667a() <= 0) {
                                        i33 = 0;
                                        break;
                                    }
                                    int iM1673g3 = c0651s9.m1673g();
                                    i33 = iM1673g3 != 1751476579 ? iM1673g3 != 1903435808 ? 0 : 1 : 2;
                                } while (i33 == 0);
                            }
                            this.f1262E = i33;
                        } else if (!arrayDeque.isEmpty()) {
                            ((C0670b) arrayDeque.peek()).f2569j.add(new C0671c(this.f1275l, c0651s9));
                        }
                    } else {
                        if (!this.f1284u && this.f1275l == 1835295092) {
                            this.f1262E = 1;
                        }
                        if (j20 < 262144) {
                            interfaceC2241n.mo335d((int) j20);
                        } else {
                            c0587s.f2181a = interfaceC2241n.mo346r() + j20;
                            z4 = true;
                        }
                        m1039n(jMo346r5);
                        if (this.f1285v) {
                            this.f1287x = true;
                            c0587s.f2181a = this.f1286w;
                            this.f1285v = false;
                            z4 = true;
                        }
                        if (z4 || this.f1274k == 2) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                    }
                    z4 = false;
                    m1039n(jMo346r5);
                    if (this.f1285v) {
                        this.f1287x = true;
                        c0587s.f2181a = this.f1286w;
                        this.f1285v = false;
                        z4 = true;
                    }
                    if (z4) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                }
            } while (!z5);
            return 1;
        } while (z3);
        return -1;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: f */
    public final boolean mo329f(InterfaceC2241n interfaceC2241n) {
        C1692X c1692xM4120r;
        InterfaceC2224C interfaceC2224CM1064l = AbstractC0383t.m1064l(interfaceC2241n, false, (this.f1265b & 2) != 0);
        if (interfaceC2224CM1064l != null) {
            c1692xM4120r = AbstractC1676G.m4120r(interfaceC2224CM1064l);
        } else {
            C1674E c1674e = AbstractC1676G.f7601h;
            c1692xM4120r = C1692X.f7629k;
        }
        this.f1273j = c1692xM4120r;
        return interfaceC2224CM1064l == null;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: h */
    public final void mo330h(InterfaceC2242o interfaceC2242o) {
        if ((this.f1265b & 16) == 0) {
            interfaceC2242o = new C0858A(interfaceC2242o, this.f1264a);
        }
        this.f1289z = interfaceC2242o;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0080  */
    /* JADX WARN: Code duplicated, block: B:39:0x008e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0095 A[LOOP:2: B:37:0x008a->B:42:0x0095, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x009b  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c1 A[LOOP:3: B:53:0x00b7->B:57:0x00c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d8 A[PHI: r4
      0x00d8: PHI (r4v6 long) = (r4v3 long), (r4v9 long) binds: [B:35:0x007e, B:51:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:74:0x00de A[EDGE_INSN: B:74:0x00de->B:66:0x00de BREAK  A[LOOP:1: B:32:0x0077->B:65:0x00d9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0099 A[EDGE_INSN: B:79:0x0099->B:44:0x0099 BREAK  A[LOOP:2: B:37:0x008a->B:42:0x0095], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00bf A[EDGE_INSN: B:81:0x00bf->B:56:0x00bf BREAK  A[LOOP:3: B:53:0x00b7->B:57:0x00c1], SYNTHETIC] */
    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: i */
    public final C2251x mo355i(long j3) {
        long j4;
        long j5;
        long j6;
        long j7;
        long jMin;
        int i3;
        C0378o[] c0378oArr;
        C0387x c0387x;
        long[] jArr;
        int iM1586e;
        int[] iArr;
        long[] jArr2;
        int iM1586e2;
        int iM1065a;
        C0378o[] c0378oArr2 = this.f1258A;
        int length = c0378oArr2.length;
        C2253z c2253z = C2253z.f9685c;
        if (length == 0) {
            return new C2251x(c2253z, c2253z);
        }
        int i4 = this.f1260C;
        boolean z3 = false;
        int i5 = -1;
        long jMin2 = -1;
        if (i4 != -1) {
            C0387x c0387x2 = c0378oArr2[i4].f1254b;
            long[] jArr3 = c0387x2.f1341f;
            int iM1586e3 = AbstractC0632A.m1586e(jArr3, j3, false);
            while (true) {
                if (iM1586e3 < 0) {
                    iM1586e3 = -1;
                    break;
                }
                if ((c0387x2.f1342g[iM1586e3] & 1) != 0) {
                    break;
                }
                iM1586e3--;
            }
            if (iM1586e3 == -1) {
                iM1586e3 = c0387x2.m1065a(j3);
            }
            if (iM1586e3 == -1) {
                return new C2251x(c2253z, c2253z);
            }
            j6 = jArr3[iM1586e3];
            long[] jArr4 = c0387x2.f1338c;
            j5 = jArr4[iM1586e3];
            if (j6 < j3) {
                j4 = -9223372036854775807L;
                if (iM1586e3 < c0387x2.f1337b - 1 && (iM1065a = c0387x2.m1065a(j3)) != -1 && iM1065a != iM1586e3) {
                    j7 = jArr3[iM1065a];
                    jMin2 = jArr4[iM1065a];
                }
                jMin = j5;
                i3 = 0;
                while (true) {
                    c0378oArr = this.f1258A;
                    if (i3 < c0378oArr.length) {
                        break;
                    }
                    if (i3 != this.f1260C) {
                        c0387x = c0378oArr[i3].f1254b;
                        jArr = c0387x.f1341f;
                        iM1586e = AbstractC0632A.m1586e(jArr, j6, z3);
                        while (true) {
                            iArr = c0387x.f1342g;
                            if (iM1586e >= 0) {
                                iM1586e = -1;
                                break;
                            }
                            if ((iArr[iM1586e] & 1) != 0) {
                                break;
                            }
                            iM1586e--;
                        }
                        if (iM1586e == i5) {
                            iM1586e = c0387x.m1065a(j6);
                        }
                        jArr2 = c0387x.f1338c;
                        if (iM1586e == i5) {
                            jMin = Math.min(jArr2[iM1586e], jMin);
                        }
                        if (j7 != j4) {
                            iM1586e2 = AbstractC0632A.m1586e(jArr, j7, false);
                            while (true) {
                                if (iM1586e2 >= 0) {
                                    iM1586e2 = -1;
                                    break;
                                }
                                if ((iArr[iM1586e2] & 1) != 0) {
                                    break;
                                }
                                iM1586e2--;
                            }
                            if (iM1586e2 == -1) {
                                iM1586e2 = c0387x.m1065a(j7);
                            }
                            if (iM1586e2 == -1) {
                                jMin2 = Math.min(jArr2[iM1586e2], jMin2);
                            }
                        }
                    }
                    i3++;
                    z3 = false;
                    i5 = -1;
                }
                C2253z c2253z2 = new C2253z(j6, jMin);
                return j7 == j4 ? new C2251x(c2253z2, c2253z2) : new C2251x(c2253z2, new C2253z(j7, jMin2));
            }
            j4 = -9223372036854775807L;
        } else {
            j4 = -9223372036854775807L;
            j5 = Long.MAX_VALUE;
            j6 = j3;
        }
        j7 = j4;
        jMin = j5;
        i3 = 0;
        while (true) {
            c0378oArr = this.f1258A;
            if (i3 < c0378oArr.length) {
                break;
                break;
            }
            if (i3 != this.f1260C) {
                c0387x = c0378oArr[i3].f1254b;
                jArr = c0387x.f1341f;
                iM1586e = AbstractC0632A.m1586e(jArr, j6, z3);
                while (true) {
                    iArr = c0387x.f1342g;
                    if (iM1586e >= 0) {
                        iM1586e = -1;
                        break;
                    }
                    if ((iArr[iM1586e] & 1) != 0) {
                        break;
                        break;
                    }
                    iM1586e--;
                }
                if (iM1586e == i5) {
                    iM1586e = c0387x.m1065a(j6);
                }
                jArr2 = c0387x.f1338c;
                if (iM1586e == i5) {
                    jMin = Math.min(jArr2[iM1586e], jMin);
                }
                if (j7 != j4) {
                    iM1586e2 = AbstractC0632A.m1586e(jArr, j7, false);
                    while (true) {
                        if (iM1586e2 >= 0) {
                            iM1586e2 = -1;
                            break;
                        }
                        if ((iArr[iM1586e2] & 1) != 0) {
                            break;
                            break;
                        }
                        iM1586e2--;
                    }
                    if (iM1586e2 == -1) {
                        iM1586e2 = c0387x.m1065a(j7);
                    }
                    if (iM1586e2 == -1) {
                        jMin2 = Math.min(jArr2[iM1586e2], jMin2);
                    }
                }
            }
            i3++;
            z3 = false;
            i5 = -1;
        }
        C2253z c2253z3 = new C2253z(j6, jMin);
        if (j7 == j4) {
        }
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: j */
    public final void mo331j(long j3, long j4) {
        this.f1270g.clear();
        this.f1277n = 0;
        this.f1279p = -1;
        this.f1280q = 0;
        this.f1281r = 0;
        this.f1282s = 0;
        this.f1283t = (this.f1265b & 32) == 0;
        if (j3 == 0) {
            if (this.f1274k != 3) {
                this.f1274k = 0;
                this.f1277n = 0;
                return;
            } else {
                C0382s c0382s = this.f1271h;
                c0382s.f1298a.clear();
                c0382s.f1299b = 0;
                this.f1272i.clear();
                return;
            }
        }
        for (C0378o c0378o : this.f1258A) {
            C0387x c0387x = c0378o.f1254b;
            int iM1586e = AbstractC0632A.m1586e(c0387x.f1341f, j4, false);
            while (true) {
                if (iM1586e < 0) {
                    iM1586e = -1;
                    break;
                } else if ((c0387x.f1342g[iM1586e] & 1) != 0) {
                    break;
                } else {
                    iM1586e--;
                }
            }
            if (iM1586e == -1) {
                iM1586e = c0387x.m1065a(j4);
            }
            c0378o.f1257e = iM1586e;
            C2227F c2227f = c0378o.f1256d;
            if (c2227f != null) {
                c2227f.f9556b = false;
                c2227f.f9557c = 0;
            }
        }
    }

    @Override // p145s0.InterfaceC2252y
    /* JADX INFO: renamed from: l */
    public final long mo945l() {
        return this.f1261D;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: m */
    public final List mo332m() {
        return this.f1273j;
    }

    /* JADX WARN: Code duplicated, block: B:220:0x0430 A[Catch: all -> 0x028f, TRY_LEAVE, TryCatch #1 {all -> 0x028f, blocks: (B:108:0x025f, B:110:0x026b, B:111:0x0276, B:116:0x0288, B:121:0x0297, B:124:0x02a3, B:127:0x02b1, B:130:0x02be, B:133:0x02c8, B:136:0x02d4, B:139:0x02e0, B:142:0x02ec, B:145:0x02f8, B:148:0x0305, B:151:0x0312, B:154:0x0320, B:157:0x032f, B:160:0x033c, B:164:0x034d, B:166:0x0351, B:168:0x0364, B:172:0x0373, B:176:0x0382, B:184:0x0398, B:220:0x0430, B:186:0x03b0, B:188:0x03b9, B:201:0x03dc, B:204:0x03e9, B:207:0x03f6, B:210:0x0403, B:213:0x0410, B:216:0x041d, B:219:0x0428, B:222:0x0448, B:223:0x0450), top: B:418:0x025f }] */
    /* JADX WARN: Code duplicated, block: B:282:0x0549 A[EDGE_INSN: B:282:0x0549->B:285:0x0567 BREAK  A[LOOP:6: B:241:0x04c9->B:283:0x055c]] */
    /* JADX WARN: Code duplicated, block: B:423:0x0876 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:429:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x011b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0126  */
    /* JADX WARN: Code duplicated, block: B:54:0x0150  */
    /* JADX WARN: Code duplicated, block: B:56:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x015e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0161  */
    /* JADX WARN: Code duplicated, block: B:61:0x0164  */
    /* JADX WARN: Code duplicated, block: B:62:0x0166  */
    /* JADX WARN: Code duplicated, block: B:63:0x0168  */
    /* JADX WARN: Code duplicated, block: B:64:0x016a  */
    /* JADX WARN: Code duplicated, block: B:65:0x016c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0178  */
    /* JADX WARN: Code duplicated, block: B:70:0x017b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0196  */
    /* JADX WARN: Instruction removed from duplicated block: B:220:0x0430, please report this as an issue */
    /* JADX INFO: renamed from: n */
    public final void m1039n(long j3) {
        ArrayList arrayList;
        C0544G c0544g;
        ArrayDeque arrayDeque;
        ArrayList arrayList2;
        C0544G c0544g2;
        C0544G c0544g3;
        int i3;
        int i4;
        C0544G c0544g4;
        C0544G c0544g5;
        ArrayList arrayList3;
        C0544G c0544g6;
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList4;
        ArrayDeque arrayDeque2;
        int i9;
        C0544G c0544g7;
        C0544G c0544gM1352e;
        C0544G c0544g8;
        int iM1688v;
        int i10;
        C0544G c0544g9;
        Parcelable parcelableM1063k;
        Parcelable c0221k;
        C0669a c0669aM1054b;
        long jM1692z;
        C0669a c0669aM1054b2;
        ArrayList arrayListM1782d;
        ArrayList arrayList5;
        int i11;
        int iIntValue;
        int i12;
        C0669a c0669a;
        while (true) {
            int i13 = 8;
            int i14 = 4;
            ArrayDeque arrayDeque3 = this.f1270g;
            if (arrayDeque3.isEmpty() || ((C0670b) arrayDeque3.peek()).f2568i != j3) {
                break;
            }
            C0670b c0670b = (C0670b) arrayDeque3.pop();
            if (c0670b.f2573h == 1836019574) {
                C0670b c0670bM1783e = c0670b.m1783e(1835365473);
                ArrayList arrayList6 = new ArrayList();
                int i15 = 1684108385;
                long j4 = 0;
                int i16 = this.f1265b;
                if (c0670bM1783e != null) {
                    byte[] bArr = AbstractC0371h.f1191a;
                    C0671c c0671cM1784f = c0670bM1783e.m1784f(1751411826);
                    C0671c c0671cM1784f2 = c0670bM1783e.m1784f(1801812339);
                    C0671c c0671cM1784f3 = c0670bM1783e.m1784f(1768715124);
                    if (c0671cM1784f != null && c0671cM1784f2 != null && c0671cM1784f3 != null) {
                        C0651s c0651s = c0671cM1784f.f2571i;
                        c0651s.m1665G(16);
                        if (c0651s.m1673g() == 1835299937) {
                            C0651s c0651s2 = c0671cM1784f2.f2571i;
                            c0651s2.m1665G(12);
                            int iM1673g = c0651s2.m1673g();
                            String[] strArr = new String[iM1673g];
                            int i17 = 0;
                            while (i17 < iM1673g) {
                                int iM1673g2 = c0651s2.m1673g();
                                c0651s2.m1666H(i14);
                                strArr[i17] = c0651s2.m1685s(iM1673g2 - 8, StandardCharsets.UTF_8);
                                i17++;
                                i14 = 4;
                            }
                            C0651s c0651s3 = c0671cM1784f3.f2571i;
                            c0651s3.m1665G(8);
                            ArrayList arrayList7 = new ArrayList();
                            while (c0651s3.m1667a() > i13) {
                                int i18 = c0651s3.f2521b;
                                int iM1673g3 = c0651s3.m1673g();
                                int iM1673g4 = c0651s3.m1673g() - 1;
                                if (iM1673g4 < 0 || iM1673g4 >= iM1673g) {
                                    AbstractC0462h.m1170j("Skipped metadata with unknown key index: ", "BoxParsers", iM1673g4);
                                } else {
                                    String str = strArr[iM1673g4];
                                    int i19 = i18 + iM1673g3;
                                    while (true) {
                                        int i20 = c0651s3.f2521b;
                                        if (i20 >= i19) {
                                            c0669a = null;
                                            break;
                                        }
                                        int iM1673g5 = c0651s3.m1673g();
                                        if (c0651s3.m1673g() == i15) {
                                            int iM1673g6 = c0651s3.m1673g();
                                            int iM1673g7 = c0651s3.m1673g();
                                            int i21 = iM1673g5 - 16;
                                            byte[] bArr2 = new byte[i21];
                                            c0651s3.m1671e(bArr2, 0, i21);
                                            c0669a = new C0669a(str, bArr2, iM1673g7, iM1673g6);
                                            break;
                                        }
                                        c0651s3.m1665G(i20 + iM1673g5);
                                        i15 = 1684108385;
                                    }
                                    if (c0669a != null) {
                                        arrayList7.add(c0669a);
                                    }
                                }
                                c0651s3.m1665G(i18 + iM1673g3);
                                i13 = 8;
                                i15 = 1684108385;
                            }
                            if (!arrayList7.isEmpty()) {
                                c0544g = new C0544G(arrayList7);
                            }
                            if (this.f1287x) {
                                AbstractC0646n.m1631i(c0544g);
                                c0669aM1054b2 = AbstractC0383t.m1054b(c0544g, "editable.tracks.samples.location");
                                if (c0669aM1054b2 != null && c0669aM1054b2.f2565h[0] == 0) {
                                    this.f1288y = this.f1286w + 16;
                                }
                                C0669a c0669aM1054b3 = AbstractC0383t.m1054b(c0544g, "editable.tracks.map");
                                AbstractC0646n.m1631i(c0669aM1054b3);
                                arrayListM1782d = c0669aM1054b3.m1782d();
                                arrayList5 = new ArrayList(arrayListM1782d.size());
                                for (i11 = 0; i11 < arrayListM1782d.size(); i11++) {
                                    iIntValue = ((Integer) arrayListM1782d.get(i11)).intValue();
                                    if (iIntValue == 0) {
                                        i12 = 1;
                                    } else if (iIntValue == 1) {
                                        i12 = 2;
                                    } else if (iIntValue == 2) {
                                        i12 = 3;
                                    } else if (iIntValue != 3) {
                                        i12 = 0;
                                    } else {
                                        i12 = 4;
                                    }
                                    arrayList5.add(Integer.valueOf(i12));
                                }
                                arrayList = arrayList5;
                            } else {
                                if (c0544g != null && (i16 & 64) != 0 && (c0669aM1054b = AbstractC0383t.m1054b(c0544g, "editable.tracks.offset")) != null) {
                                    jM1692z = new C0651s(c0669aM1054b.f2565h).m1692z();
                                    if (jM1692z > 0) {
                                        this.f1286w = jM1692z;
                                        this.f1285v = true;
                                        arrayDeque = arrayDeque3;
                                    }
                                    arrayDeque.clear();
                                    if (!this.f1285v) {
                                        this.f1274k = 2;
                                    }
                                }
                                arrayList = arrayList6;
                            }
                        }
                        c0544g = null;
                        if (this.f1287x) {
                            AbstractC0646n.m1631i(c0544g);
                            c0669aM1054b2 = AbstractC0383t.m1054b(c0544g, "editable.tracks.samples.location");
                            if (c0669aM1054b2 != null) {
                                this.f1288y = this.f1286w + 16;
                            }
                            C0669a c0669aM1054b4 = AbstractC0383t.m1054b(c0544g, "editable.tracks.map");
                            AbstractC0646n.m1631i(c0669aM1054b4);
                            arrayListM1782d = c0669aM1054b4.m1782d();
                            arrayList5 = new ArrayList(arrayListM1782d.size());
                            while (i11 < arrayListM1782d.size()) {
                                iIntValue = ((Integer) arrayListM1782d.get(i11)).intValue();
                                if (iIntValue == 0) {
                                    i12 = 1;
                                } else if (iIntValue == 1) {
                                    i12 = 2;
                                } else if (iIntValue == 2) {
                                    i12 = 3;
                                } else if (iIntValue != 3) {
                                    i12 = 0;
                                } else {
                                    i12 = 4;
                                }
                                arrayList5.add(Integer.valueOf(i12));
                            }
                            arrayList = arrayList5;
                        } else {
                            if (c0544g != null) {
                                jM1692z = new C0651s(c0669aM1054b.f2565h).m1692z();
                                if (jM1692z > 0) {
                                    this.f1286w = jM1692z;
                                    this.f1285v = true;
                                    arrayDeque = arrayDeque3;
                                }
                                arrayDeque.clear();
                                if (!this.f1285v) {
                                    this.f1274k = 2;
                                }
                            }
                            arrayList = arrayList6;
                        }
                    }
                    c0544g = null;
                    if (this.f1287x) {
                        AbstractC0646n.m1631i(c0544g);
                        c0669aM1054b2 = AbstractC0383t.m1054b(c0544g, "editable.tracks.samples.location");
                        if (c0669aM1054b2 != null) {
                            this.f1288y = this.f1286w + 16;
                        }
                        C0669a c0669aM1054b5 = AbstractC0383t.m1054b(c0544g, "editable.tracks.map");
                        AbstractC0646n.m1631i(c0669aM1054b5);
                        arrayListM1782d = c0669aM1054b5.m1782d();
                        arrayList5 = new ArrayList(arrayListM1782d.size());
                        while (i11 < arrayListM1782d.size()) {
                            iIntValue = ((Integer) arrayListM1782d.get(i11)).intValue();
                            if (iIntValue == 0) {
                                i12 = 1;
                            } else if (iIntValue == 1) {
                                i12 = 2;
                            } else if (iIntValue == 2) {
                                i12 = 3;
                            } else if (iIntValue != 3) {
                                i12 = 0;
                            } else {
                                i12 = 4;
                            }
                            arrayList5.add(Integer.valueOf(i12));
                        }
                        arrayList = arrayList5;
                    } else {
                        if (c0544g != null) {
                            jM1692z = new C0651s(c0669aM1054b.f2565h).m1692z();
                            if (jM1692z > 0) {
                                this.f1286w = jM1692z;
                                this.f1285v = true;
                                arrayDeque = arrayDeque3;
                            }
                            arrayDeque.clear();
                            if (!this.f1285v) {
                                this.f1274k = 2;
                            }
                        }
                        arrayList = arrayList6;
                    }
                } else {
                    arrayList = arrayList6;
                    c0544g = null;
                }
                ArrayList arrayList8 = new ArrayList();
                boolean z3 = this.f1262E == 1;
                C2247t c2247t = new C2247t();
                C0671c c0671cM1784f4 = c0670b.m1784f(1969517665);
                if (c0671cM1784f4 != null) {
                    byte[] bArr3 = AbstractC0371h.f1191a;
                    C0651s c0651s4 = c0671cM1784f4.f2571i;
                    c0651s4.m1665G(8);
                    c0544g2 = new C0544G(new InterfaceC0543F[0]);
                    for (int i22 = 8; c0651s4.m1667a() >= i22; i22 = 8) {
                        int i23 = c0651s4.f2521b;
                        int iM1673g8 = c0651s4.m1673g();
                        int iM1673g9 = c0651s4.m1673g();
                        if (iM1673g9 == 1835365473) {
                            c0651s4.m1665G(i23);
                            int i24 = i23 + iM1673g8;
                            c0651s4.m1666H(i22);
                            int i25 = c0651s4.f2521b;
                            c0651s4.m1666H(4);
                            if (c0651s4.m1673g() != 1751411826) {
                                i25 += 4;
                            }
                            c0651s4.m1665G(i25);
                            while (true) {
                                int i26 = c0651s4.f2521b;
                                if (i26 >= i24) {
                                    arrayList4 = arrayList8;
                                    arrayDeque2 = arrayDeque3;
                                    i9 = iM1673g8;
                                    c0544g9 = null;
                                    break;
                                }
                                int iM1673g10 = c0651s4.m1673g();
                                if (c0651s4.m1673g() == 1768715124) {
                                    c0651s4.m1665G(i26);
                                    int i27 = i26 + iM1673g10;
                                    c0651s4.m1666H(8);
                                    ArrayList arrayList9 = new ArrayList();
                                    while (true) {
                                        int i28 = c0651s4.f2521b;
                                        if (i28 >= i27) {
                                            break;
                                        }
                                        int iM1673g11 = c0651s4.m1673g() + i28;
                                        int iM1673g12 = c0651s4.m1673g();
                                        int i29 = i27;
                                        int i30 = (iM1673g12 >> 24) & 255;
                                        ArrayDeque arrayDeque4 = arrayDeque3;
                                        int i31 = iM1673g8;
                                        ArrayList arrayList10 = arrayList8;
                                        if (i30 == 169 || i30 == 253) {
                                            int i32 = 16777215 & iM1673g12;
                                            if (i32 == 6516084) {
                                                parcelableM1063k = AbstractC0383t.m1056d(iM1673g12, c0651s4);
                                            } else if (i32 == 7233901 || i32 == 7631467) {
                                                parcelableM1063k = AbstractC0383t.m1063k(iM1673g12, c0651s4, "TIT2");
                                            } else if (i32 == 6516589 || i32 == 7828084) {
                                                parcelableM1063k = AbstractC0383t.m1063k(iM1673g12, c0651s4, "TCOM");
                                            } else if (i32 == 6578553) {
                                                parcelableM1063k = AbstractC0383t.m1063k(iM1673g12, c0651s4, "TDRC");
                                            } else if (i32 == 4280916) {
                                                parcelableM1063k = AbstractC0383t.m1063k(iM1673g12, c0651s4, "TPE1");
                                            } else if (i32 == 7630703) {
                                                parcelableM1063k = AbstractC0383t.m1063k(iM1673g12, c0651s4, "TSSE");
                                            } else if (i32 == 6384738) {
                                                parcelableM1063k = AbstractC0383t.m1063k(iM1673g12, c0651s4, "TALB");
                                            } else if (i32 == 7108978) {
                                                parcelableM1063k = AbstractC0383t.m1063k(iM1673g12, c0651s4, "USLT");
                                            } else if (i32 == 6776174) {
                                                parcelableM1063k = AbstractC0383t.m1063k(iM1673g12, c0651s4, "TCON");
                                            } else if (i32 == 6779504) {
                                                parcelableM1063k = AbstractC0383t.m1063k(iM1673g12, c0651s4, "TIT1");
                                            } else {
                                                AbstractC0646n.m1634l("MetadataUtil", "Skipped unknown metadata entry: " + AbstractC0672d.m1785b(iM1673g12));
                                                c0651s4.m1665G(iM1673g11);
                                                parcelableM1063k = null;
                                            }
                                            c0651s4.m1665G(iM1673g11);
                                        } else {
                                            if (iM1673g12 == 1735291493) {
                                                try {
                                                    String strM713a = AbstractC0220j.m713a(AbstractC0383t.m1059g(c0651s4) - 1);
                                                    if (strM713a != null) {
                                                        parcelableM1063k = new C0224n("TCON", null, AbstractC1676G.m4120r(strM713a));
                                                    } else {
                                                        c0221k = null;
                                                        AbstractC0646n.m1647y("MetadataUtil", "Failed to parse standard genre code");
                                                        parcelableM1063k = c0221k;
                                                    }
                                                } catch (Throwable th) {
                                                    c0651s4.m1665G(iM1673g11);
                                                    throw th;
                                                }
                                            } else if (iM1673g12 == 1684632427) {
                                                parcelableM1063k = AbstractC0383t.m1058f(iM1673g12, c0651s4, "TPOS");
                                            } else if (iM1673g12 == 1953655662) {
                                                parcelableM1063k = AbstractC0383t.m1058f(iM1673g12, c0651s4, "TRCK");
                                            } else if (iM1673g12 == 1953329263) {
                                                parcelableM1063k = AbstractC0383t.m1060h(iM1673g12, "TBPM", c0651s4, true, false);
                                            } else if (iM1673g12 == 1668311404) {
                                                parcelableM1063k = AbstractC0383t.m1060h(iM1673g12, "TCMP", c0651s4, true, true);
                                            } else if (iM1673g12 == 1668249202) {
                                                parcelableM1063k = AbstractC0383t.m1057e(c0651s4);
                                            } else if (iM1673g12 == 1631670868) {
                                                parcelableM1063k = AbstractC0383t.m1063k(iM1673g12, c0651s4, "TPE2");
                                            } else if (iM1673g12 == 1936682605) {
                                                parcelableM1063k = AbstractC0383t.m1063k(iM1673g12, c0651s4, "TSOT");
                                            } else if (iM1673g12 == 1936679276) {
                                                parcelableM1063k = AbstractC0383t.m1063k(iM1673g12, c0651s4, "TSOA");
                                            } else if (iM1673g12 == 1936679282) {
                                                parcelableM1063k = AbstractC0383t.m1063k(iM1673g12, c0651s4, "TSOP");
                                            } else if (iM1673g12 == 1936679265) {
                                                parcelableM1063k = AbstractC0383t.m1063k(iM1673g12, c0651s4, "TSO2");
                                            } else if (iM1673g12 == 1936679791) {
                                                parcelableM1063k = AbstractC0383t.m1063k(iM1673g12, c0651s4, "TSOC");
                                            } else if (iM1673g12 == 1920233063) {
                                                parcelableM1063k = AbstractC0383t.m1060h(iM1673g12, "ITUNESADVISORY", c0651s4, false, false);
                                            } else if (iM1673g12 == 1885823344) {
                                                parcelableM1063k = AbstractC0383t.m1060h(iM1673g12, "ITUNESGAPLESS", c0651s4, false, true);
                                            } else if (iM1673g12 == 1936683886) {
                                                parcelableM1063k = AbstractC0383t.m1063k(iM1673g12, c0651s4, "TVSHOWSORT");
                                            } else if (iM1673g12 == 1953919848) {
                                                parcelableM1063k = AbstractC0383t.m1063k(iM1673g12, c0651s4, "TVSHOW");
                                            } else if (iM1673g12 == 757935405) {
                                                String strM1683q = null;
                                                String strM1683q2 = null;
                                                int i33 = -1;
                                                int i34 = -1;
                                                while (true) {
                                                    int i35 = c0651s4.f2521b;
                                                    if (i35 >= iM1673g11) {
                                                        break;
                                                    }
                                                    int iM1673g13 = c0651s4.m1673g();
                                                    int iM1673g14 = c0651s4.m1673g();
                                                    int i36 = i34;
                                                    c0651s4.m1666H(4);
                                                    if (iM1673g14 == 1835360622) {
                                                        strM1683q = c0651s4.m1683q(iM1673g13 - 12);
                                                    } else {
                                                        if (iM1673g14 == 1851878757) {
                                                            strM1683q2 = c0651s4.m1683q(iM1673g13 - 12);
                                                        } else {
                                                            if (iM1673g14 == 1684108385) {
                                                                i33 = i35;
                                                                i36 = iM1673g13;
                                                            }
                                                            c0651s4.m1666H(iM1673g13 - 12);
                                                        }
                                                        i34 = i36;
                                                    }
                                                    i34 = i36;
                                                }
                                                int i37 = i34;
                                                if (strM1683q == null || strM1683q2 == null || i33 == -1) {
                                                    parcelableM1063k = null;
                                                } else {
                                                    c0651s4.m1665G(i33);
                                                    c0651s4.m1666H(16);
                                                    c0221k = new C0221k(strM1683q, strM1683q2, c0651s4.m1683q(i37 - 16));
                                                    parcelableM1063k = c0221k;
                                                }
                                            } else {
                                                AbstractC0646n.m1634l("MetadataUtil", "Skipped unknown metadata entry: " + AbstractC0672d.m1785b(iM1673g12));
                                                c0651s4.m1665G(iM1673g11);
                                                parcelableM1063k = null;
                                            }
                                            c0651s4.m1665G(iM1673g11);
                                        }
                                        if (parcelableM1063k != null) {
                                            arrayList9.add(parcelableM1063k);
                                        }
                                        i27 = i29;
                                        arrayDeque3 = arrayDeque4;
                                        iM1673g8 = i31;
                                        arrayList8 = arrayList10;
                                    }
                                    arrayList4 = arrayList8;
                                    arrayDeque2 = arrayDeque3;
                                    i9 = iM1673g8;
                                    c0544g9 = arrayList9.isEmpty() ? null : new C0544G(arrayList9);
                                    break;
                                }
                                c0651s4.m1665G(i26 + iM1673g10);
                            }
                            c0544g2 = c0544g2.m1352e(c0544g9);
                        } else {
                            arrayList4 = arrayList8;
                            arrayDeque2 = arrayDeque3;
                            i9 = iM1673g8;
                            if (iM1673g9 == 1936553057) {
                                c0651s4.m1665G(i23);
                                int i38 = i23 + i9;
                                c0651s4.m1666H(12);
                                while (true) {
                                    int i39 = c0651s4.f2521b;
                                    if (i39 < i38) {
                                        int iM1673g15 = c0651s4.m1673g();
                                        if (c0651s4.m1673g() == 1935766900) {
                                            if (iM1673g15 >= 16) {
                                                c0651s4.m1666H(4);
                                                int i40 = -1;
                                                int i41 = 0;
                                                int i42 = 0;
                                                while (i41 < 2) {
                                                    int iM1687u = c0651s4.m1687u();
                                                    int iM1687u2 = c0651s4.m1687u();
                                                    if (iM1687u == 0) {
                                                        i40 = iM1687u2;
                                                        i10 = 1;
                                                    } else {
                                                        i10 = 1;
                                                        if (iM1687u == 1) {
                                                            i42 = iM1687u2;
                                                        }
                                                    }
                                                    i41 += i10;
                                                }
                                                if (i40 != 12) {
                                                    if (i40 != 13) {
                                                        if (i40 != 21) {
                                                            iM1688v = -2147483647;
                                                        } else {
                                                            if (c0651s4.m1667a() >= 8 && c0651s4.f2521b + 8 <= i38) {
                                                                int iM1673g16 = c0651s4.m1673g();
                                                                int iM1673g17 = c0651s4.m1673g();
                                                                if (iM1673g16 >= 12 && iM1673g17 == 1936877170) {
                                                                    iM1688v = c0651s4.m1688v();
                                                                }
                                                            }
                                                            iM1688v = -2147483647;
                                                        }
                                                        if (iM1688v == -2147483647) {
                                                            c0544g8 = new C0544G(new C0256d(i42, iM1688v));
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    iM1688v = 120;
                                                } else {
                                                    iM1688v = 240;
                                                }
                                                if (iM1688v == -2147483647) {
                                                    c0544g8 = new C0544G(new C0256d(i42, iM1688v));
                                                    break;
                                                }
                                                break;
                                            }
                                            c0544g8 = null;
                                            break;
                                        }
                                        c0651s4.m1665G(i39 + iM1673g15);
                                    }
                                    c0544g8 = null;
                                    break;
                                }
                                c0544gM1352e = c0544g2.m1352e(c0544g8);
                            } else if (iM1673g9 == -1451722374) {
                                short sM1684r = c0651s4.m1684r();
                                c0651s4.m1666H(2);
                                String strM1685s = c0651s4.m1685s(sM1684r, StandardCharsets.UTF_8);
                                int iMax = Math.max(strM1685s.lastIndexOf(43), strM1685s.lastIndexOf(45));
                                try {
                                    c0544g7 = new C0544G(new C0673e(Float.parseFloat(strM1685s.substring(0, iMax)), Float.parseFloat(strM1685s.substring(iMax, strM1685s.length() - 1))));
                                } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                    c0544g7 = null;
                                }
                                c0544gM1352e = c0544g2.m1352e(c0544g7);
                            }
                            c0544g2 = c0544gM1352e;
                        }
                        c0651s4.m1665G(i23 + i9);
                        arrayDeque3 = arrayDeque2;
                        arrayList8 = arrayList4;
                    }
                    arrayList2 = arrayList8;
                    arrayDeque = arrayDeque3;
                    c2247t.m4843b(c0544g2);
                } else {
                    arrayList2 = arrayList8;
                    arrayDeque = arrayDeque3;
                    c0544g2 = null;
                }
                C0671c c0671cM1784f5 = c0670b.m1784f(1836476516);
                c0671cM1784f5.getClass();
                C0544G c0544g10 = new C0544G(AbstractC0371h.m1026d(c0671cM1784f5.f2571i));
                int i43 = i16;
                ArrayList arrayListM1029g = AbstractC0371h.m1029g(c0670b, c2247t, -9223372036854775807L, null, (i16 & 1) != 0, z3, new C0041i(4));
                if (this.f1287x) {
                    boolean z4 = arrayList.size() == arrayListM1029g.size();
                    Locale locale = Locale.US;
                    AbstractC0646n.m1629g("The number of auxiliary track types from metadata (" + arrayList.size() + ") is not same as the number of editable video tracks (" + arrayListM1029g.size() + ")", z4);
                }
                int i44 = 0;
                int size = -1;
                int i45 = 0;
                long jMax = -9223372036854775807L;
                while (i44 < arrayListM1029g.size()) {
                    C0387x c0387x = (C0387x) arrayListM1029g.get(i44);
                    if (c0387x.f1337b == 0) {
                        c0544g5 = c0544g;
                        c0544g3 = c0544g10;
                        i3 = i43;
                        c0544g4 = c0544g2;
                        i4 = i45;
                        arrayList3 = arrayList2;
                    } else {
                        C0384u c0384u = c0387x.f1336a;
                        c0544g3 = c0544g10;
                        i3 = i43;
                        long j5 = c0384u.f1306e;
                        if (j5 == -9223372036854775807L) {
                            j5 = c0387x.f1343h;
                        }
                        jMax = Math.max(jMax, j5);
                        InterfaceC2242o interfaceC2242o = this.f1289z;
                        i4 = i45 + 1;
                        c0544g4 = c0544g2;
                        int i46 = c0384u.f1303b;
                        C0378o c0378o = new C0378o(c0384u, c0387x, interfaceC2242o.mo344p(i45, i46));
                        C0583o c0583o = c0384u.f1308g;
                        boolean zEquals = "audio/true-hd".equals(c0583o.f2154n);
                        int i47 = c0387x.f1340e;
                        int i48 = zEquals ? i47 * 16 : i47 + 30;
                        C0582n c0582nM1447a = c0583o.m1447a();
                        c0582nM1447a.f2115n = i48;
                        if (i46 == 2) {
                            int i49 = i3 & 8;
                            int i50 = c0583o.f2146f;
                            if (i49 != 0) {
                                i50 |= size == -1 ? 1 : 2;
                            }
                            if (c0583o.f2163w == -1.0f && j5 > 0 && (i8 = c0387x.f1337b) > 0) {
                                c0582nM1447a.f2123v = i8 / (j5 / 1000000.0f);
                            }
                            if (this.f1287x) {
                                i50 |= 32768;
                                c0582nM1447a.f2108g = ((Integer) arrayList.get(i44)).intValue();
                            }
                            c0582nM1447a.f2107f = i50;
                        }
                        if (i46 == 1 && (i6 = c2247t.f9659a) != -1 && (i7 = c2247t.f9660b) != -1) {
                            c0582nM1447a.f2095E = i6;
                            c0582nM1447a.f2096F = i7;
                        }
                        ArrayList arrayList11 = this.f1272i;
                        C0544G[] c0544gArr = {arrayList11.isEmpty() ? null : new C0544G(arrayList11), c0544g4, c0544g3};
                        C0544G c0544g11 = new C0544G(new InterfaceC0543F[0]);
                        if (c0544g != null) {
                            int i51 = 0;
                            while (true) {
                                InterfaceC0543F[] interfaceC0543FArr = c0544g.f1940g;
                                if (i51 >= interfaceC0543FArr.length) {
                                    break;
                                }
                                InterfaceC0543F interfaceC0543F = interfaceC0543FArr[i51];
                                if (interfaceC0543F instanceof C0669a) {
                                    C0669a c0669a2 = (C0669a) interfaceC0543F;
                                    c0544g6 = c0544g;
                                    if (!c0669a2.f2564g.equals("com.android.capture.fps")) {
                                        i5 = 1;
                                        c0544g11 = c0544g11.m1351d(c0669a2);
                                    } else if (i46 == 2) {
                                        i5 = 1;
                                        c0544g11 = c0544g11.m1351d(c0669a2);
                                    }
                                    i51 += i5;
                                    c0544g = c0544g6;
                                } else {
                                    c0544g6 = c0544g;
                                }
                                i5 = 1;
                                i51 += i5;
                                c0544g = c0544g6;
                            }
                        }
                        c0544g5 = c0544g;
                        for (int i52 = 0; i52 < 3; i52++) {
                            c0544g11 = c0544g11.m1352e(c0544gArr[i52]);
                        }
                        if (c0544g11.f1940g.length > 0) {
                            c0582nM1447a.f2112k = c0544g11;
                        }
                        c0378o.f1255c.mo1176e(new C0583o(c0582nM1447a));
                        if (i46 == 2 && size == -1) {
                            size = arrayList2.size();
                        }
                        arrayList3 = arrayList2;
                        arrayList3.add(c0378o);
                    }
                    i44++;
                    arrayList2 = arrayList3;
                    arrayListM1029g = arrayListM1029g;
                    c0544g10 = c0544g3;
                    i43 = i3;
                    i45 = i4;
                    c0544g2 = c0544g4;
                    c0544g = c0544g5;
                }
                this.f1260C = size;
                this.f1261D = jMax;
                C0378o[] c0378oArr = (C0378o[]) arrayList2.toArray(new C0378o[0]);
                this.f1258A = c0378oArr;
                long[][] jArr = new long[c0378oArr.length][];
                int[] iArr = new int[c0378oArr.length];
                long[] jArr2 = new long[c0378oArr.length];
                boolean[] zArr = new boolean[c0378oArr.length];
                for (int i53 = 0; i53 < c0378oArr.length; i53++) {
                    jArr[i53] = new long[c0378oArr[i53].f1254b.f1337b];
                    jArr2[i53] = c0378oArr[i53].f1254b.f1341f[0];
                }
                int i54 = 0;
                while (i54 < c0378oArr.length) {
                    long j6 = Long.MAX_VALUE;
                    int i55 = -1;
                    for (int i56 = 0; i56 < c0378oArr.length; i56++) {
                        if (!zArr[i56]) {
                            long j7 = jArr2[i56];
                            if (j7 <= j6) {
                                i55 = i56;
                                j6 = j7;
                            }
                        }
                    }
                    int i57 = iArr[i55];
                    long[] jArr3 = jArr[i55];
                    jArr3[i57] = j4;
                    C0387x c0387x2 = c0378oArr[i55].f1254b;
                    j4 += (long) c0387x2.f1339d[i57];
                    int i58 = i57 + 1;
                    iArr[i55] = i58;
                    if (i58 < jArr3.length) {
                        jArr2[i55] = c0387x2.f1341f[i58];
                    } else {
                        zArr[i55] = true;
                        i54++;
                    }
                }
                this.f1259B = jArr;
                this.f1289z.mo341l();
                this.f1289z.mo333b(this);
                arrayDeque.clear();
                if (!this.f1285v) {
                    this.f1274k = 2;
                }
            } else if (!arrayDeque3.isEmpty()) {
                ((C0670b) arrayDeque3.peek()).f2570k.add(c0670b);
            }
        }
        if (this.f1274k != 2) {
            this.f1274k = 0;
            this.f1277n = 0;
        }
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: a */
    public final void mo325a() {
    }
}

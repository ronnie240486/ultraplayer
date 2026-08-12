package p092e0;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.activity.RunnableC0892b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p000A.C0058r;
import p018G0.C0218h;
import p030K0.C0334e;
import p036M0.C0365b;
import p036M0.C0380q;
import p055T.AbstractC0545H;
import p055T.C0544G;
import p055T.C0559W;
import p055T.C0579k;
import p055T.C0582n;
import p055T.C0583o;
import p060U1.AbstractC0610a;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p064W.C0656x;
import p070Y.C0715l;
import p070Y.C0725v;
import p070Y.InterfaceC0711h;
import p074Z0.C0778e;
import p077a0.C0799J;
import p077a0.C0800K;
import p077a0.C0817b;
import p088d0.C1387k;
import p088d0.InterfaceC1384h;
import p088d0.InterfaceC1390n;
import p089d1.C1447t;
import p095f0.AbstractC1535h;
import p095f0.C1528a;
import p095f0.C1530c;
import p095f0.C1531d;
import p095f0.C1532e;
import p095f0.C1534g;
import p095f0.C1537j;
import p105h2.AbstractC1676G;
import p105h2.AbstractC1723q;
import p105h2.C1673D;
import p105h2.C1692X;
import p114k0.C1907A;
import p114k0.C1911E;
import p114k0.C1927V;
import p114k0.C1934b;
import p114k0.C1945g0;
import p114k0.C1958r;
import p114k0.C1963w;
import p114k0.InterfaceC1929X;
import p114k0.InterfaceC1935b0;
import p117l0.AbstractC1972a;
import p117l0.InterfaceC1974c;
import p125n0.InterfaceC2042s;
import p129o0.C2065e;
import p129o0.C2074n;
import p129o0.HandlerC2070j;
import p129o0.InterfaceC2069i;
import p129o0.InterfaceC2071k;
import p129o0.InterfaceC2072l;
import p145s0.C2239l;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2242o;
import p145s0.InterfaceC2252y;

/* JADX INFO: renamed from: e0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1512q implements InterfaceC2069i, InterfaceC2072l, InterfaceC1935b0, InterfaceC2242o, InterfaceC1929X {

    /* JADX INFO: renamed from: e0 */
    public static final Set f6766e0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* JADX INFO: renamed from: A */
    public AbstractC1972a f6767A;

    /* JADX INFO: renamed from: B */
    public C1511p[] f6768B;

    /* JADX INFO: renamed from: C */
    public int[] f6769C;

    /* JADX INFO: renamed from: D */
    public final HashSet f6770D;

    /* JADX INFO: renamed from: E */
    public final SparseIntArray f6771E;

    /* JADX INFO: renamed from: F */
    public C1510o f6772F;

    /* JADX INFO: renamed from: G */
    public int f6773G;

    /* JADX INFO: renamed from: H */
    public int f6774H;

    /* JADX INFO: renamed from: I */
    public boolean f6775I;

    /* JADX INFO: renamed from: J */
    public boolean f6776J;

    /* JADX INFO: renamed from: K */
    public int f6777K;

    /* JADX INFO: renamed from: L */
    public C0583o f6778L;

    /* JADX INFO: renamed from: M */
    public C0583o f6779M;

    /* JADX INFO: renamed from: N */
    public boolean f6780N;

    /* JADX INFO: renamed from: O */
    public C1945g0 f6781O;

    /* JADX INFO: renamed from: P */
    public Set f6782P;

    /* JADX INFO: renamed from: Q */
    public int[] f6783Q;

    /* JADX INFO: renamed from: R */
    public int f6784R;

    /* JADX INFO: renamed from: S */
    public boolean f6785S;

    /* JADX INFO: renamed from: T */
    public boolean[] f6786T;

    /* JADX INFO: renamed from: U */
    public boolean[] f6787U;

    /* JADX INFO: renamed from: V */
    public long f6788V;

    /* JADX INFO: renamed from: W */
    public long f6789W;

    /* JADX INFO: renamed from: X */
    public boolean f6790X;

    /* JADX INFO: renamed from: Y */
    public boolean f6791Y;

    /* JADX INFO: renamed from: Z */
    public boolean f6792Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f6793a0;

    /* JADX INFO: renamed from: b0 */
    public long f6794b0;

    /* JADX INFO: renamed from: c0 */
    public C0579k f6795c0;

    /* JADX INFO: renamed from: d0 */
    public C1505j f6796d0;

    /* JADX INFO: renamed from: g */
    public final String f6797g;

    /* JADX INFO: renamed from: h */
    public final int f6798h;

    /* JADX INFO: renamed from: i */
    public final C1447t f6799i;

    /* JADX INFO: renamed from: j */
    public final C1504i f6800j;

    /* JADX INFO: renamed from: k */
    public final C2065e f6801k;

    /* JADX INFO: renamed from: l */
    public final C0583o f6802l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC1390n f6803m;

    /* JADX INFO: renamed from: n */
    public final C1387k f6804n;

    /* JADX INFO: renamed from: o */
    public final C1528a f6805o;

    /* JADX INFO: renamed from: p */
    public final C2074n f6806p = new C2074n("Loader:HlsSampleStreamWrapper");

    /* JADX INFO: renamed from: q */
    public final C0380q f6807q;

    /* JADX INFO: renamed from: r */
    public final int f6808r;

    /* JADX INFO: renamed from: s */
    public final C0817b f6809s;

    /* JADX INFO: renamed from: t */
    public final ArrayList f6810t;

    /* JADX INFO: renamed from: u */
    public final List f6811u;

    /* JADX INFO: renamed from: v */
    public final RunnableC1509n f6812v;

    /* JADX INFO: renamed from: w */
    public final RunnableC1509n f6813w;

    /* JADX INFO: renamed from: x */
    public final Handler f6814x;

    /* JADX INFO: renamed from: y */
    public final ArrayList f6815y;

    /* JADX INFO: renamed from: z */
    public final Map f6816z;

    /* JADX WARN: Type inference failed for: r1v12, types: [e0.n] */
    /* JADX WARN: Type inference failed for: r1v13, types: [e0.n] */
    public C1512q(String str, int i3, C1447t c1447t, C1504i c1504i, Map map, C2065e c2065e, long j3, C0583o c0583o, InterfaceC1390n interfaceC1390n, C1387k c1387k, C1528a c1528a, C0380q c0380q, int i4) {
        this.f6797g = str;
        this.f6798h = i3;
        this.f6799i = c1447t;
        this.f6800j = c1504i;
        this.f6816z = map;
        this.f6801k = c2065e;
        this.f6802l = c0583o;
        this.f6803m = interfaceC1390n;
        this.f6804n = c1387k;
        this.f6805o = c1528a;
        this.f6807q = c0380q;
        this.f6808r = i4;
        C0817b c0817b = new C0817b();
        c0817b.f3428b = null;
        c0817b.f3427a = false;
        c0817b.f3429c = null;
        this.f6809s = c0817b;
        this.f6769C = new int[0];
        Set set = f6766e0;
        this.f6770D = new HashSet(set.size());
        this.f6771E = new SparseIntArray(set.size());
        this.f6768B = new C1511p[0];
        this.f6787U = new boolean[0];
        this.f6786T = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f6810t = arrayList;
        this.f6811u = Collections.unmodifiableList(arrayList);
        this.f6815y = new ArrayList();
        final int i5 = 0;
        this.f6812v = new Runnable(this) { // from class: e0.n

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C1512q f6756h;

            {
                this.f6756h = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i5) {
                    case 0:
                        this.f6756h.m3796D();
                        break;
                    default:
                        C1512q c1512q = this.f6756h;
                        c1512q.f6775I = true;
                        c1512q.m3796D();
                        break;
                }
            }
        };
        final int i6 = 1;
        this.f6813w = new Runnable(this) { // from class: e0.n

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C1512q f6756h;

            {
                this.f6756h = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i6) {
                    case 0:
                        this.f6756h.m3796D();
                        break;
                    default:
                        C1512q c1512q = this.f6756h;
                        c1512q.f6775I = true;
                        c1512q.m3796D();
                        break;
                }
            }
        };
        this.f6814x = AbstractC0632A.m1594m(null);
        this.f6788V = j3;
        this.f6789W = j3;
    }

    /* JADX INFO: renamed from: B */
    public static int m3791B(int i3) {
        if (i3 == 1) {
            return 2;
        }
        if (i3 != 2) {
            return i3 != 3 ? 0 : 1;
        }
        return 3;
    }

    /* JADX INFO: renamed from: w */
    public static C2239l m3792w(int i3, int i4) {
        AbstractC0646n.m1647y("HlsSampleStreamWrapper", "Unmapped track with id " + i3 + " of type " + i4);
        return new C2239l();
    }

    /* JADX INFO: renamed from: y */
    public static C0583o m3793y(C0583o c0583o, C0583o c0583o2, boolean z3) {
        String strM1355c;
        String strM1601t;
        if (c0583o == null) {
            return c0583o2;
        }
        String str = c0583o2.f2154n;
        int iM1359g = AbstractC0545H.m1359g(str);
        String str2 = c0583o.f2151k;
        if (AbstractC0632A.m1600s(iM1359g, str2) == 1) {
            strM1601t = AbstractC0632A.m1601t(iM1359g, str2);
            strM1355c = AbstractC0545H.m1355c(strM1601t);
        } else {
            String strM1353a = AbstractC0545H.m1353a(str2, str);
            strM1355c = str;
            strM1601t = strM1353a;
        }
        C0582n c0582nM1447a = c0583o2.m1447a();
        c0582nM1447a.f2102a = c0583o.f2141a;
        c0582nM1447a.f2103b = c0583o.f2142b;
        c0582nM1447a.f2104c = AbstractC1676G.m4117n(c0583o.f2143c);
        c0582nM1447a.f2105d = c0583o.f2144d;
        c0582nM1447a.f2106e = c0583o.f2145e;
        c0582nM1447a.f2107f = c0583o.f2146f;
        c0582nM1447a.f2109h = z3 ? c0583o.f2148h : -1;
        c0582nM1447a.f2110i = z3 ? c0583o.f2149i : -1;
        c0582nM1447a.f2111j = strM1601t;
        if (iM1359g == 2) {
            c0582nM1447a.f2121t = c0583o.f2161u;
            c0582nM1447a.f2122u = c0583o.f2162v;
            c0582nM1447a.f2123v = c0583o.f2163w;
        }
        if (strM1355c != null) {
            c0582nM1447a.f2114m = AbstractC0545H.m1364l(strM1355c);
        }
        int i3 = c0583o.f2130C;
        if (i3 != -1 && iM1359g == 1) {
            c0582nM1447a.f2092B = i3;
        }
        C0544G c0544gM1352e = c0583o.f2152l;
        if (c0544gM1352e != null) {
            C0544G c0544g = c0583o2.f2152l;
            if (c0544g != null) {
                c0544gM1352e = c0544g.m1352e(c0544gM1352e);
            }
            c0582nM1447a.f2112k = c0544gM1352e;
        }
        return new C0583o(c0582nM1447a);
    }

    /* JADX INFO: renamed from: A */
    public final C1505j m3794A() {
        ArrayList arrayList = this.f6810t;
        return (C1505j) arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: C */
    public final boolean m3795C() {
        return this.f6789W != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: D */
    public final void m3796D() {
        int i3 = 0;
        if (!this.f6780N && this.f6783Q == null && this.f6775I) {
            for (C1511p c1511p : this.f6768B) {
                if (c1511p.m4477t() == null) {
                    return;
                }
            }
            C1945g0 c1945g0 = this.f6781O;
            if (c1945g0 != null) {
                int i4 = c1945g0.f8526a;
                int[] iArr = new int[i4];
                this.f6783Q = iArr;
                Arrays.fill(iArr, -1);
                for (int i5 = 0; i5 < i4; i5++) {
                    int i6 = 0;
                    while (true) {
                        C1511p[] c1511pArr = this.f6768B;
                        if (i6 >= c1511pArr.length) {
                            break;
                        }
                        C0583o c0583oM4477t = c1511pArr[i6].m4477t();
                        AbstractC0646n.m1631i(c0583oM4477t);
                        C0583o c0583o = this.f6781O.m4499a(i5).f1995d[0];
                        String str = c0583o.f2154n;
                        String str2 = c0583oM4477t.f2154n;
                        int iM1359g = AbstractC0545H.m1359g(str2);
                        if (iM1359g == 3) {
                            int i7 = AbstractC0632A.f2454a;
                            if (Objects.equals(str2, str) && (!("application/cea-608".equals(str2) || "application/cea-708".equals(str2)) || c0583oM4477t.f2135H == c0583o.f2135H)) {
                                this.f6783Q[i5] = i6;
                                break;
                                break;
                            }
                            i6++;
                        } else {
                            if (iM1359g == AbstractC0545H.m1359g(str)) {
                                this.f6783Q[i5] = i6;
                                break;
                            }
                            i6++;
                        }
                    }
                }
                ArrayList arrayList = this.f6815y;
                int size = arrayList.size();
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((C1508m) obj).m3784a();
                }
                return;
            }
            int length = this.f6768B.length;
            int i8 = 0;
            int i9 = -2;
            int i10 = -1;
            while (true) {
                int i11 = 2;
                if (i8 >= length) {
                    break;
                }
                C0583o c0583oM4477t2 = this.f6768B[i8].m4477t();
                AbstractC0646n.m1631i(c0583oM4477t2);
                String str3 = c0583oM4477t2.f2154n;
                if (!AbstractC0545H.m1363k(str3)) {
                    i11 = AbstractC0545H.m1360h(str3) ? 1 : AbstractC0545H.m1362j(str3) ? 3 : -2;
                }
                if (m3791B(i11) > m3791B(i9)) {
                    i10 = i8;
                    i9 = i11;
                } else if (i11 == i9 && i10 != -1) {
                    i10 = -1;
                }
                i8++;
            }
            C0559W c0559w = this.f6800j.f6677h;
            int i12 = c0559w.f1992a;
            this.f6784R = -1;
            this.f6783Q = new int[length];
            for (int i13 = 0; i13 < length; i13++) {
                this.f6783Q[i13] = i13;
            }
            C0559W[] c0559wArr = new C0559W[length];
            int i14 = 0;
            while (i14 < length) {
                C0583o c0583oM4477t3 = this.f6768B[i14].m4477t();
                AbstractC0646n.m1631i(c0583oM4477t3);
                String str4 = this.f6797g;
                C0583o c0583o2 = this.f6802l;
                if (i14 == i10) {
                    C0583o[] c0583oArr = new C0583o[i12];
                    for (int i15 = 0; i15 < i12; i15++) {
                        C0583o c0583oM1449d = c0559w.f1995d[i15];
                        if (i9 == 1 && c0583o2 != null) {
                            c0583oM1449d = c0583oM1449d.m1449d(c0583o2);
                        }
                        c0583oArr[i15] = i12 == 1 ? c0583oM4477t3.m1449d(c0583oM1449d) : m3793y(c0583oM1449d, c0583oM4477t3, true);
                    }
                    c0559wArr[i14] = new C0559W(str4, c0583oArr);
                    this.f6784R = i14;
                } else {
                    if (i9 != 2 || !AbstractC0545H.m1360h(c0583oM4477t3.f2154n)) {
                        c0583o2 = null;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(str4);
                    sb.append(":muxed:");
                    sb.append(i14 < i10 ? i14 : i14 - 1);
                    c0559wArr[i14] = new C0559W(sb.toString(), m3793y(c0583o2, c0583oM4477t3, false));
                }
                i14++;
            }
            this.f6781O = m3807x(c0559wArr);
            AbstractC0646n.m1630h(this.f6782P == null);
            this.f6782P = Collections.EMPTY_SET;
            this.f6776J = true;
            this.f6799i.m3626n();
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m3797E() throws IOException {
        IOException iOException;
        IOException iOException2;
        C2074n c2074n = this.f6806p;
        IOException iOException3 = c2074n.f9011c;
        if (iOException3 != null) {
            throw iOException3;
        }
        HandlerC2070j handlerC2070j = c2074n.f9010b;
        if (handlerC2070j != null && (iOException2 = handlerC2070j.f9000k) != null && handlerC2070j.f9001l > handlerC2070j.f8996g) {
            throw iOException2;
        }
        C1504i c1504i = this.f6800j;
        C1934b c1934b = c1504i.f6683n;
        if (c1934b != null) {
            throw c1934b;
        }
        Uri uri = c1504i.f6684o;
        if (uri == null || !c1504i.f6688s) {
            return;
        }
        C1530c c1530c = (C1530c) c1504i.f6676g.f6906j.get(uri);
        C2074n c2074n2 = c1530c.f6891h;
        IOException iOException4 = c2074n2.f9011c;
        if (iOException4 != null) {
            throw iOException4;
        }
        HandlerC2070j handlerC2070j2 = c2074n2.f9010b;
        if (handlerC2070j2 != null && (iOException = handlerC2070j2.f9000k) != null && handlerC2070j2.f9001l > handlerC2070j2.f8996g) {
            throw iOException;
        }
        IOException iOException5 = c1530c.f6899p;
        if (iOException5 != null) {
            throw iOException5;
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m3798F(C0559W[] c0559wArr, int... iArr) {
        this.f6781O = m3807x(c0559wArr);
        this.f6782P = new HashSet();
        for (int i3 : iArr) {
            this.f6782P.add(this.f6781O.m4499a(i3));
        }
        this.f6784R = 0;
        this.f6814x.post(new RunnableC0892b(16, this.f6799i));
        this.f6776J = true;
    }

    /* JADX INFO: renamed from: G */
    public final void m3799G() {
        for (C1511p c1511p : this.f6768B) {
            c1511p.m4483z(this.f6790X);
        }
        this.f6790X = false;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m3800H(long j3, boolean z3) {
        C1505j c1505j;
        boolean z4;
        this.f6788V = j3;
        if (m3795C()) {
            this.f6789W = j3;
            return true;
        }
        boolean z5 = this.f6800j.f6685p;
        ArrayList arrayList = this.f6810t;
        if (!z5) {
            c1505j = null;
            break;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= arrayList.size()) {
                c1505j = null;
                break;
            }
            c1505j = (C1505j) arrayList.get(i3);
            if (c1505j.f8607g == j3) {
                break;
            }
            i3++;
        }
        if (this.f6775I && !z3) {
            int length = this.f6768B.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    z4 = true;
                    break;
                }
                C1511p c1511p = this.f6768B[i4];
                if (!(c1505j != null ? c1511p.m4462B(c1505j.m3756e(i4)) : c1511p.m4463C(j3, false)) && (this.f6787U[i4] || !this.f6785S)) {
                    z4 = false;
                    break;
                }
                i4++;
            }
            if (z4) {
                return false;
            }
        }
        this.f6789W = j3;
        this.f6792Z = false;
        arrayList.clear();
        C2074n c2074n = this.f6806p;
        if (!c2074n.m4637b()) {
            c2074n.f9011c = null;
            m3799G();
            return true;
        }
        if (this.f6775I) {
            for (C1511p c1511p2 : this.f6768B) {
                c1511p2.m4468j();
            }
        }
        c2074n.m4636a();
        return true;
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: a */
    public final boolean mo3759a() {
        return this.f6806p.m4637b();
    }

    @Override // p129o0.InterfaceC2072l
    /* JADX INFO: renamed from: e */
    public final void mo3801e() {
        for (C1511p c1511p : this.f6768B) {
            c1511p.m4483z(true);
            InterfaceC1384h interfaceC1384h = c1511p.f8456h;
            if (interfaceC1384h != null) {
                interfaceC1384h.mo3463d(c1511p.f8453e);
                c1511p.f8456h = null;
                c1511p.f8455g = null;
            }
        }
    }

    @Override // p114k0.InterfaceC1929X
    /* JADX INFO: renamed from: g */
    public final void mo3802g() {
        this.f6814x.post(this.f6812v);
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: h */
    public final long mo3766h() {
        if (this.f6792Z) {
            return Long.MIN_VALUE;
        }
        if (m3795C()) {
            return this.f6789W;
        }
        long jMax = this.f6788V;
        C1505j c1505jM3794A = m3794A();
        if (!c1505jM3794A.f6697H) {
            ArrayList arrayList = this.f6810t;
            c1505jM3794A = arrayList.size() > 1 ? (C1505j) arrayList.get(arrayList.size() - 2) : null;
        }
        if (c1505jM3794A != null) {
            jMax = Math.max(jMax, c1505jM3794A.f8608h);
        }
        if (this.f6775I) {
            for (C1511p c1511p : this.f6768B) {
                jMax = Math.max(jMax, c1511p.m4471n());
            }
        }
        return jMax;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0277  */
    /* JADX WARN: Code duplicated, block: B:120:0x0283  */
    /* JADX WARN: Code duplicated, block: B:122:0x0287  */
    /* JADX WARN: Code duplicated, block: B:124:0x028a  */
    /* JADX WARN: Code duplicated, block: B:128:0x0299  */
    /* JADX WARN: Code duplicated, block: B:130:0x029d  */
    /* JADX WARN: Code duplicated, block: B:133:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:140:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:147:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:148:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:150:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:153:0x02de  */
    /* JADX WARN: Code duplicated, block: B:157:0x02e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:161:0x0300  */
    /* JADX WARN: Code duplicated, block: B:162:0x0307  */
    /* JADX WARN: Code duplicated, block: B:164:0x0315  */
    /* JADX WARN: Code duplicated, block: B:165:0x0317  */
    /* JADX WARN: Code duplicated, block: B:168:0x032d  */
    /* JADX WARN: Code duplicated, block: B:169:0x0332  */
    /* JADX WARN: Code duplicated, block: B:172:0x0352  */
    /* JADX WARN: Code duplicated, block: B:173:0x0355  */
    /* JADX WARN: Code duplicated, block: B:175:0x0359  */
    /* JADX WARN: Code duplicated, block: B:176:0x0363  */
    /* JADX WARN: Code duplicated, block: B:179:0x0368  */
    /* JADX WARN: Code duplicated, block: B:180:0x0375  */
    /* JADX WARN: Code duplicated, block: B:183:0x037d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x037f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0381  */
    /* JADX WARN: Code duplicated, block: B:187:0x0384  */
    /* JADX WARN: Code duplicated, block: B:188:0x038e  */
    /* JADX WARN: Code duplicated, block: B:191:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:192:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:194:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:197:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:199:0x03d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:207:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:210:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:213:0x0400  */
    /* JADX WARN: Code duplicated, block: B:215:0x0403 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:221:0x0410  */
    /* JADX WARN: Code duplicated, block: B:224:0x041c  */
    /* JADX WARN: Code duplicated, block: B:227:0x0442  */
    /* JADX WARN: Code duplicated, block: B:97:0x0220  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: i */
    public final boolean mo3767i(C0800K c0800k) {
        long jMax;
        List list;
        long j3;
        C0817b c0817b;
        long j4;
        C0817b c0817b2;
        int iIntValue;
        long j5;
        int i3;
        int i4;
        C1503h c1503h;
        C1503h c1503h2;
        AbstractC1535h abstractC1535h;
        C1534g c1534g;
        String str;
        Uri uriM1645w;
        C1500e c1500eM3753d;
        String str2;
        Uri uriM1645w2;
        C1500e c1500eM3753d2;
        long j6;
        long j7;
        boolean z3;
        boolean z4;
        boolean z5;
        int i5;
        boolean z6;
        boolean z7;
        C1447t c1447t;
        byte[] bArr;
        byte[] bArr2;
        Map map;
        int i6;
        boolean z8;
        byte[] bArrM3754d;
        InterfaceC0711h interfaceC0711h;
        InterfaceC0711h c1496a;
        C1534g c1534g2;
        C0715l c0715l;
        InterfaceC0711h interfaceC0711h2;
        boolean z9;
        int i7;
        C0218h c0218h;
        C1497b c1497b;
        C0651s c0651s;
        SparseArray sparseArray;
        C0656x c0656x;
        C0715l c0715l2;
        boolean z10;
        boolean z11;
        C1497b c1497b2;
        boolean z12;
        byte[] bArrM3754d2;
        InterfaceC0711h c1496a2;
        String str3;
        if (this.f6792Z) {
            return false;
        }
        C2074n c2074n = this.f6806p;
        if (c2074n.m4637b() || c2074n.f9011c != null) {
            return false;
        }
        if (m3795C()) {
            list = Collections.EMPTY_LIST;
            jMax = this.f6789W;
            for (C1511p c1511p : this.f6768B) {
                c1511p.f8468t = this.f6789W;
            }
        } else {
            C1505j c1505jM3794A = m3794A();
            jMax = c1505jM3794A.f6697H ? c1505jM3794A.f8608h : Math.max(this.f6788V, c1505jM3794A.f8607g);
            list = this.f6811u;
        }
        List list2 = list;
        C0817b c0817b3 = this.f6809s;
        c0817b3.f3428b = null;
        c0817b3.f3427a = false;
        c0817b3.f3429c = null;
        boolean z13 = this.f6776J || !list2.isEmpty();
        C1504i c1504i = this.f6800j;
        C1505j c1505j = list2.isEmpty() ? null : (C1505j) AbstractC1723q.m4158g(list2);
        int iM1417a = c1505j == null ? -1 : c1504i.f6677h.m1417a(c1505j.f8604d);
        long j8 = c0800k.f3335a;
        long jMax2 = jMax - j8;
        int i8 = iM1417a;
        long j9 = c1504i.f6687r;
        long jMax3 = j9 != -9223372036854775807L ? j9 - j8 : -9223372036854775807L;
        if (c1505j == null || c1504i.f6685p) {
            j3 = -9223372036854775807L;
            c0817b = c0817b3;
        } else {
            j3 = -9223372036854775807L;
            c0817b = c0817b3;
            long j10 = c1505j.f8608h - c1505j.f8607g;
            jMax2 = Math.max(0L, jMax2 - j10);
            if (jMax3 != -9223372036854775807L) {
                jMax3 = Math.max(0L, jMax3 - j10);
            }
        }
        InterfaceC1974c[] interfaceC1974cArrM3750a = c1504i.m3750a(c1505j, jMax);
        C1504i c1504i2 = c1504i;
        long j11 = jMax;
        C1505j c1505j2 = c1505j;
        c1504i.f6686q.mo3746c(j8, jMax2, jMax3, list2, interfaceC1974cArrM3750a);
        int iMo4423a = c1504i2.f6686q.mo4423a();
        boolean z14 = i8 != iMo4423a;
        Uri[] uriArr = c1504i2.f6674e;
        Uri uri = uriArr[iMo4423a];
        C1531d c1531d = c1504i2.f6676g;
        if (c1531d.m3833c(uri)) {
            C1537j c1537jM3831a = c1531d.m3831a(uri, true);
            c1537jM3831a.getClass();
            c1504i2.f6685p = c1537jM3831a.f6979c;
            boolean z15 = c1537jM3831a.f6951o;
            long j12 = c1537jM3831a.f6944h;
            if (z15) {
                j4 = j3;
            } else {
                j4 = (c1537jM3831a.f6957u + j12) - c1531d.f6916t;
                c1504i2 = c1504i2;
            }
            c1504i2.f6687r = j4;
            long j13 = j12 - c1531d.f6916t;
            c0817b2 = c0817b;
            Pair pairM3752c = c1504i2.m3752c(c1505j2, z14, c1537jM3831a, j13, j11);
            long jLongValue = ((Long) pairM3752c.first).longValue();
            int iIntValue2 = ((Integer) pairM3752c.second).intValue();
            if (jLongValue >= c1537jM3831a.f6947k || c1505j2 == null || !z14) {
                iIntValue = iIntValue2;
                j5 = j13;
                i3 = iMo4423a;
                i4 = r2;
            } else {
                uri = uriArr[r2];
                c1537jM3831a = c1531d.m3831a(uri, true);
                c1537jM3831a.getClass();
                long j14 = c1537jM3831a.f6944h - c1531d.f6916t;
                Pair pairM3752c2 = c1504i2.m3752c(c1505j2, false, c1537jM3831a, j14, j11);
                jLongValue = ((Long) pairM3752c2.first).longValue();
                iIntValue = ((Integer) pairM3752c2.second).intValue();
                j5 = j14;
                i4 = i8;
                i3 = i4;
            }
            long j15 = jLongValue;
            if (i3 != i4 && i4 != -1) {
                C1530c c1530c = (C1530c) c1531d.f6906j.get(uriArr[i4]);
                if (c1530c != null) {
                    c1530c.f6900q = false;
                }
            }
            long j16 = c1537jM3831a.f6947k;
            if (j15 < j16) {
                c1504i2.f6683n = new C1934b();
            } else {
                long j17 = j5;
                int i9 = (int) (j15 - j16);
                AbstractC1676G abstractC1676G = c1537jM3831a.f6954r;
                int size = abstractC1676G.size();
                AbstractC1676G abstractC1676G2 = c1537jM3831a.f6955s;
                if (i9 == size) {
                    if (iIntValue == -1) {
                        iIntValue = 0;
                    }
                    if (iIntValue < abstractC1676G2.size()) {
                        c1503h2 = new C1503h((AbstractC1535h) abstractC1676G2.get(iIntValue), j15, iIntValue);
                        c1503h = c1503h2;
                    } else {
                        c1503h = null;
                    }
                } else {
                    C1534g c1534g3 = (C1534g) abstractC1676G.get(i9);
                    if (iIntValue == -1) {
                        c1503h = new C1503h(c1534g3, j15, -1);
                    } else if (iIntValue < c1534g3.f6923s.size()) {
                        c1503h2 = new C1503h((AbstractC1535h) c1534g3.f6923s.get(iIntValue), j15, iIntValue);
                        c1503h = c1503h2;
                    } else {
                        int i10 = i9 + 1;
                        if (i10 < abstractC1676G.size()) {
                            c1503h = new C1503h((AbstractC1535h) abstractC1676G.get(i10), j15 + 1, -1);
                        } else if (abstractC1676G2.isEmpty()) {
                            c1503h = null;
                        } else {
                            c1503h = new C1503h((AbstractC1535h) abstractC1676G2.get(0), j15 + 1, 0);
                        }
                    }
                }
                if (c1503h != null) {
                    c1504i2.f6688s = false;
                    c1504i2.f6684o = null;
                    SystemClock.elapsedRealtime();
                    abstractC1535h = c1503h.f6666a;
                    c1534g = abstractC1535h.f6925h;
                    str = c1537jM3831a.f6977a;
                    if (c1534g != null || (str3 = c1534g.f6930m) == null) {
                        uriM1645w = null;
                    } else {
                        uriM1645w = AbstractC0646n.m1645w(str, str3);
                    }
                    c1500eM3753d = c1504i2.m3753d(uriM1645w, i3, true);
                    c0817b2.f3428b = c1500eM3753d;
                    if (c1500eM3753d == null) {
                        str2 = abstractC1535h.f6930m;
                        if (str2 == null) {
                            uriM1645w2 = null;
                        } else {
                            uriM1645w2 = AbstractC0646n.m1645w(str, str2);
                        }
                        c1500eM3753d2 = c1504i2.m3753d(uriM1645w2, i3, false);
                        c0817b2.f3428b = c1500eM3753d2;
                        if (c1500eM3753d2 == null) {
                            j6 = abstractC1535h.f6928k;
                            if (c1505j2 == null) {
                                AtomicInteger atomicInteger = C1505j.f6689L;
                            } else {
                                if (uri.equals(c1505j2.f6703m) || !c1505j2.f6697H) {
                                    j7 = j17 + j6;
                                    z3 = abstractC1535h instanceof C1532e;
                                    z4 = c1537jM3831a.f6979c;
                                    if (z3) {
                                        z5 = z4;
                                    } else if (!((C1532e) abstractC1535h).f6917r || (c1503h.f6668c == 0 && z4)) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z5) {
                                        i5 = i3;
                                        if (j7 >= c1505j2.f8608h) {
                                        }
                                        z7 = c1503h.f6669d;
                                        if (z6 || !z7) {
                                            C0583o c0583o = c1504i2.f6675f[i5];
                                            int iMo3747g = c1504i2.f6686q.mo3747g();
                                            Object objMo3749n = c1504i2.f6686q.mo3749n();
                                            boolean z16 = c1504i2.f6681l;
                                            c1447t = c1504i2.f6679j;
                                            if (uriM1645w2 == null) {
                                                c1447t.getClass();
                                                bArr = null;
                                            } else {
                                                bArr = (byte[]) ((C1499d) c1447t.f6406h).get(uriM1645w2);
                                            }
                                            if (uriM1645w == null) {
                                                bArr2 = null;
                                            } else {
                                                bArr2 = (byte[]) ((C1499d) c1447t.f6406h).get(uriM1645w);
                                            }
                                            AtomicInteger atomicInteger2 = C1505j.f6689L;
                                            map = Collections.EMPTY_MAP;
                                            Uri uriM1645w3 = AbstractC0646n.m1645w(str, abstractC1535h.f6924g);
                                            if (z7 != 0) {
                                                i6 = 8;
                                            } else {
                                                i6 = 0;
                                            }
                                            AbstractC0646n.m1632j(uriM1645w3, "The uri must be set.");
                                            C0715l c0715l3 = new C0715l(uriM1645w3, 1, null, map, abstractC1535h.f6932o, abstractC1535h.f6933p, i6);
                                            if (bArr != null) {
                                                z8 = true;
                                            } else {
                                                z8 = false;
                                            }
                                            if (z8) {
                                                String str4 = abstractC1535h.f6931n;
                                                str4.getClass();
                                                bArrM3754d = C1505j.m3754d(str4);
                                            } else {
                                                bArrM3754d = null;
                                            }
                                            interfaceC0711h = c1504i2.f6671b;
                                            if (bArr != null) {
                                                bArrM3754d.getClass();
                                                c1496a = new C1496a(interfaceC0711h, bArr, bArrM3754d);
                                            } else {
                                                c1496a = interfaceC0711h;
                                            }
                                            c1534g2 = abstractC1535h.f6925h;
                                            if (c1534g2 != null) {
                                                if (bArr2 != null) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                                if (z12) {
                                                    String str5 = c1534g2.f6931n;
                                                    str5.getClass();
                                                    bArrM3754d2 = C1505j.m3754d(str5);
                                                } else {
                                                    bArrM3754d2 = null;
                                                }
                                                Uri uriM1645w4 = AbstractC0646n.m1645w(str, c1534g2.f6924g);
                                                AbstractC0646n.m1632j(uriM1645w4, "The uri must be set.");
                                                C0715l c0715l4 = new C0715l(uriM1645w4, 1, null, map, c1534g2.f6932o, c1534g2.f6933p, 0);
                                                if (bArr2 != null) {
                                                    bArrM3754d2.getClass();
                                                    c1496a2 = new C1496a(interfaceC0711h, bArr2, bArrM3754d2);
                                                } else {
                                                    c1496a2 = interfaceC0711h;
                                                }
                                                interfaceC0711h2 = c1496a2;
                                                z9 = z12;
                                                c0715l = c0715l4;
                                            } else {
                                                c0715l = null;
                                                interfaceC0711h2 = null;
                                                z9 = false;
                                            }
                                            long j18 = j17 + j6;
                                            long j19 = j18 + abstractC1535h.f6926i;
                                            i7 = c1537jM3831a.f6946j + abstractC1535h.f6927j;
                                            if (c1505j2 != null) {
                                                c0715l2 = c1505j2.f6707q;
                                                if (c0715l != c0715l2 || (c0715l != null && c0715l2 != null && c0715l.f2735a.equals(c0715l2.f2735a) && c0715l.f2739e == c0715l2.f2739e)) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (uri.equals(c1505j2.f6703m) || !c1505j2.f6697H) {
                                                    z11 = false;
                                                } else {
                                                    z11 = true;
                                                }
                                                if (z10 || !z11 || c1505j2.f6699J || c1505j2.f6702l != i7) {
                                                    c1497b2 = null;
                                                } else {
                                                    c1497b2 = c1505j2.f6692C;
                                                }
                                                c0218h = c1505j2.f6715y;
                                                c0651s = c1505j2.f6716z;
                                                c1497b = c1497b2;
                                            } else {
                                                c0218h = new C0218h(null);
                                                c1497b = null;
                                                c0651s = new C0651s(10);
                                            }
                                            C0218h c0218h2 = c0218h;
                                            boolean z17 = !z7;
                                            sparseArray = (SparseArray) c1504i2.f6673d.f6406h;
                                            c0656x = (C0656x) sparseArray.get(i7);
                                            if (c0656x == null) {
                                                c0656x = new C0656x(9223372036854775806L);
                                                sparseArray.put(i7, c0656x);
                                            }
                                            C1505j c1505j3 = new C1505j(c1504i2.f6670a, c1496a, c0715l3, c0583o, z8, interfaceC0711h2, c0715l, z9, uri, c1504i2.f6678i, iMo3747g, objMo3749n, j18, j19, c1503h.f6667b, c1503h.f6668c, z17, i7, abstractC1535h.f6934q, z16, c0656x, abstractC1535h.f6929l, c1497b, c0218h2, c0651s, z6, c1504i2.f6680k);
                                            c0817b2 = c0817b2;
                                            c0817b2.f3428b = c1505j3;
                                        }
                                    } else {
                                        i5 = i3;
                                    }
                                    z6 = true;
                                    z7 = c1503h.f6669d;
                                    if (z6) {
                                        C0583o c0583o2 = c1504i2.f6675f[i5];
                                        int iMo3747g2 = c1504i2.f6686q.mo3747g();
                                        Object objMo3749n2 = c1504i2.f6686q.mo3749n();
                                        boolean z18 = c1504i2.f6681l;
                                        c1447t = c1504i2.f6679j;
                                        if (uriM1645w2 == null) {
                                            c1447t.getClass();
                                            bArr = null;
                                        } else {
                                            bArr = (byte[]) ((C1499d) c1447t.f6406h).get(uriM1645w2);
                                        }
                                        if (uriM1645w == null) {
                                            bArr2 = null;
                                        } else {
                                            bArr2 = (byte[]) ((C1499d) c1447t.f6406h).get(uriM1645w);
                                        }
                                        AtomicInteger atomicInteger3 = C1505j.f6689L;
                                        map = Collections.EMPTY_MAP;
                                        Uri uriM1645w5 = AbstractC0646n.m1645w(str, abstractC1535h.f6924g);
                                        if (z7 != 0) {
                                            i6 = 8;
                                        } else {
                                            i6 = 0;
                                        }
                                        AbstractC0646n.m1632j(uriM1645w5, "The uri must be set.");
                                        C0715l c0715l5 = new C0715l(uriM1645w5, 1, null, map, abstractC1535h.f6932o, abstractC1535h.f6933p, i6);
                                        if (bArr != null) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        if (z8) {
                                            String str6 = abstractC1535h.f6931n;
                                            str6.getClass();
                                            bArrM3754d = C1505j.m3754d(str6);
                                        } else {
                                            bArrM3754d = null;
                                        }
                                        interfaceC0711h = c1504i2.f6671b;
                                        if (bArr != null) {
                                            bArrM3754d.getClass();
                                            c1496a = new C1496a(interfaceC0711h, bArr, bArrM3754d);
                                        } else {
                                            c1496a = interfaceC0711h;
                                        }
                                        c1534g2 = abstractC1535h.f6925h;
                                        if (c1534g2 != null) {
                                            if (bArr2 != null) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            if (z12) {
                                                String str7 = c1534g2.f6931n;
                                                str7.getClass();
                                                bArrM3754d2 = C1505j.m3754d(str7);
                                            } else {
                                                bArrM3754d2 = null;
                                            }
                                            Uri uriM1645w6 = AbstractC0646n.m1645w(str, c1534g2.f6924g);
                                            AbstractC0646n.m1632j(uriM1645w6, "The uri must be set.");
                                            C0715l c0715l6 = new C0715l(uriM1645w6, 1, null, map, c1534g2.f6932o, c1534g2.f6933p, 0);
                                            if (bArr2 != null) {
                                                bArrM3754d2.getClass();
                                                c1496a2 = new C1496a(interfaceC0711h, bArr2, bArrM3754d2);
                                            } else {
                                                c1496a2 = interfaceC0711h;
                                            }
                                            interfaceC0711h2 = c1496a2;
                                            z9 = z12;
                                            c0715l = c0715l6;
                                        } else {
                                            c0715l = null;
                                            interfaceC0711h2 = null;
                                            z9 = false;
                                        }
                                        long j110 = j17 + j6;
                                        long j111 = j110 + abstractC1535h.f6926i;
                                        i7 = c1537jM3831a.f6946j + abstractC1535h.f6927j;
                                        if (c1505j2 != null) {
                                            c0715l2 = c1505j2.f6707q;
                                            if (c0715l != c0715l2) {
                                                z10 = true;
                                            } else {
                                                z10 = true;
                                            }
                                            if (uri.equals(c1505j2.f6703m)) {
                                                z11 = false;
                                            } else {
                                                z11 = false;
                                            }
                                            if (z10) {
                                                c1497b2 = null;
                                            } else {
                                                c1497b2 = null;
                                            }
                                            c0218h = c1505j2.f6715y;
                                            c0651s = c1505j2.f6716z;
                                            c1497b = c1497b2;
                                        } else {
                                            c0218h = new C0218h(null);
                                            c1497b = null;
                                            c0651s = new C0651s(10);
                                        }
                                        C0218h c0218h3 = c0218h;
                                        boolean z19 = !z7;
                                        sparseArray = (SparseArray) c1504i2.f6673d.f6406h;
                                        c0656x = (C0656x) sparseArray.get(i7);
                                        if (c0656x == null) {
                                            c0656x = new C0656x(9223372036854775806L);
                                            sparseArray.put(i7, c0656x);
                                        }
                                        C1505j c1505j4 = new C1505j(c1504i2.f6670a, c1496a, c0715l5, c0583o2, z8, interfaceC0711h2, c0715l, z9, uri, c1504i2.f6678i, iMo3747g2, objMo3749n2, j110, j111, c1503h.f6667b, c1503h.f6668c, z19, i7, abstractC1535h.f6934q, z18, c0656x, abstractC1535h.f6929l, c1497b, c0218h3, c0651s, z6, c1504i2.f6680k);
                                        c0817b2 = c0817b2;
                                        c0817b2.f3428b = c1505j4;
                                    } else {
                                        C0583o c0583o3 = c1504i2.f6675f[i5];
                                        int iMo3747g3 = c1504i2.f6686q.mo3747g();
                                        Object objMo3749n3 = c1504i2.f6686q.mo3749n();
                                        boolean z110 = c1504i2.f6681l;
                                        c1447t = c1504i2.f6679j;
                                        if (uriM1645w2 == null) {
                                            c1447t.getClass();
                                            bArr = null;
                                        } else {
                                            bArr = (byte[]) ((C1499d) c1447t.f6406h).get(uriM1645w2);
                                        }
                                        if (uriM1645w == null) {
                                            bArr2 = null;
                                        } else {
                                            bArr2 = (byte[]) ((C1499d) c1447t.f6406h).get(uriM1645w);
                                        }
                                        AtomicInteger atomicInteger4 = C1505j.f6689L;
                                        map = Collections.EMPTY_MAP;
                                        Uri uriM1645w7 = AbstractC0646n.m1645w(str, abstractC1535h.f6924g);
                                        if (z7 != 0) {
                                            i6 = 8;
                                        } else {
                                            i6 = 0;
                                        }
                                        AbstractC0646n.m1632j(uriM1645w7, "The uri must be set.");
                                        C0715l c0715l7 = new C0715l(uriM1645w7, 1, null, map, abstractC1535h.f6932o, abstractC1535h.f6933p, i6);
                                        if (bArr != null) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        if (z8) {
                                            String str8 = abstractC1535h.f6931n;
                                            str8.getClass();
                                            bArrM3754d = C1505j.m3754d(str8);
                                        } else {
                                            bArrM3754d = null;
                                        }
                                        interfaceC0711h = c1504i2.f6671b;
                                        if (bArr != null) {
                                            bArrM3754d.getClass();
                                            c1496a = new C1496a(interfaceC0711h, bArr, bArrM3754d);
                                        } else {
                                            c1496a = interfaceC0711h;
                                        }
                                        c1534g2 = abstractC1535h.f6925h;
                                        if (c1534g2 != null) {
                                            if (bArr2 != null) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            if (z12) {
                                                String str9 = c1534g2.f6931n;
                                                str9.getClass();
                                                bArrM3754d2 = C1505j.m3754d(str9);
                                            } else {
                                                bArrM3754d2 = null;
                                            }
                                            Uri uriM1645w8 = AbstractC0646n.m1645w(str, c1534g2.f6924g);
                                            AbstractC0646n.m1632j(uriM1645w8, "The uri must be set.");
                                            C0715l c0715l8 = new C0715l(uriM1645w8, 1, null, map, c1534g2.f6932o, c1534g2.f6933p, 0);
                                            if (bArr2 != null) {
                                                bArrM3754d2.getClass();
                                                c1496a2 = new C1496a(interfaceC0711h, bArr2, bArrM3754d2);
                                            } else {
                                                c1496a2 = interfaceC0711h;
                                            }
                                            interfaceC0711h2 = c1496a2;
                                            z9 = z12;
                                            c0715l = c0715l8;
                                        } else {
                                            c0715l = null;
                                            interfaceC0711h2 = null;
                                            z9 = false;
                                        }
                                        long j112 = j17 + j6;
                                        long j113 = j112 + abstractC1535h.f6926i;
                                        i7 = c1537jM3831a.f6946j + abstractC1535h.f6927j;
                                        if (c1505j2 != null) {
                                            c0715l2 = c1505j2.f6707q;
                                            if (c0715l != c0715l2) {
                                                z10 = true;
                                            } else {
                                                z10 = true;
                                            }
                                            if (uri.equals(c1505j2.f6703m)) {
                                                z11 = false;
                                            } else {
                                                z11 = false;
                                            }
                                            if (z10) {
                                                c1497b2 = null;
                                            } else {
                                                c1497b2 = null;
                                            }
                                            c0218h = c1505j2.f6715y;
                                            c0651s = c1505j2.f6716z;
                                            c1497b = c1497b2;
                                        } else {
                                            c0218h = new C0218h(null);
                                            c1497b = null;
                                            c0651s = new C0651s(10);
                                        }
                                        C0218h c0218h4 = c0218h;
                                        boolean z111 = !z7;
                                        sparseArray = (SparseArray) c1504i2.f6673d.f6406h;
                                        c0656x = (C0656x) sparseArray.get(i7);
                                        if (c0656x == null) {
                                            c0656x = new C0656x(9223372036854775806L);
                                            sparseArray.put(i7, c0656x);
                                        }
                                        C1505j c1505j5 = new C1505j(c1504i2.f6670a, c1496a, c0715l7, c0583o3, z8, interfaceC0711h2, c0715l, z9, uri, c1504i2.f6678i, iMo3747g3, objMo3749n3, j112, j113, c1503h.f6667b, c1503h.f6668c, z111, i7, abstractC1535h.f6934q, z110, c0656x, abstractC1535h.f6929l, c1497b, c0218h4, c0651s, z6, c1504i2.f6680k);
                                        c0817b2 = c0817b2;
                                        c0817b2.f3428b = c1505j5;
                                    }
                                }
                                z6 = false;
                                z7 = c1503h.f6669d;
                                if (z6) {
                                    C0583o c0583o4 = c1504i2.f6675f[i5];
                                    int iMo3747g4 = c1504i2.f6686q.mo3747g();
                                    Object objMo3749n4 = c1504i2.f6686q.mo3749n();
                                    boolean z112 = c1504i2.f6681l;
                                    c1447t = c1504i2.f6679j;
                                    if (uriM1645w2 == null) {
                                        c1447t.getClass();
                                        bArr = null;
                                    } else {
                                        bArr = (byte[]) ((C1499d) c1447t.f6406h).get(uriM1645w2);
                                    }
                                    if (uriM1645w == null) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = (byte[]) ((C1499d) c1447t.f6406h).get(uriM1645w);
                                    }
                                    AtomicInteger atomicInteger5 = C1505j.f6689L;
                                    map = Collections.EMPTY_MAP;
                                    Uri uriM1645w9 = AbstractC0646n.m1645w(str, abstractC1535h.f6924g);
                                    if (z7 != 0) {
                                        i6 = 8;
                                    } else {
                                        i6 = 0;
                                    }
                                    AbstractC0646n.m1632j(uriM1645w9, "The uri must be set.");
                                    C0715l c0715l9 = new C0715l(uriM1645w9, 1, null, map, abstractC1535h.f6932o, abstractC1535h.f6933p, i6);
                                    if (bArr != null) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    if (z8) {
                                        String str10 = abstractC1535h.f6931n;
                                        str10.getClass();
                                        bArrM3754d = C1505j.m3754d(str10);
                                    } else {
                                        bArrM3754d = null;
                                    }
                                    interfaceC0711h = c1504i2.f6671b;
                                    if (bArr != null) {
                                        bArrM3754d.getClass();
                                        c1496a = new C1496a(interfaceC0711h, bArr, bArrM3754d);
                                    } else {
                                        c1496a = interfaceC0711h;
                                    }
                                    c1534g2 = abstractC1535h.f6925h;
                                    if (c1534g2 != null) {
                                        if (bArr2 != null) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (z12) {
                                            String str11 = c1534g2.f6931n;
                                            str11.getClass();
                                            bArrM3754d2 = C1505j.m3754d(str11);
                                        } else {
                                            bArrM3754d2 = null;
                                        }
                                        Uri uriM1645w10 = AbstractC0646n.m1645w(str, c1534g2.f6924g);
                                        AbstractC0646n.m1632j(uriM1645w10, "The uri must be set.");
                                        C0715l c0715l10 = new C0715l(uriM1645w10, 1, null, map, c1534g2.f6932o, c1534g2.f6933p, 0);
                                        if (bArr2 != null) {
                                            bArrM3754d2.getClass();
                                            c1496a2 = new C1496a(interfaceC0711h, bArr2, bArrM3754d2);
                                        } else {
                                            c1496a2 = interfaceC0711h;
                                        }
                                        interfaceC0711h2 = c1496a2;
                                        z9 = z12;
                                        c0715l = c0715l10;
                                    } else {
                                        c0715l = null;
                                        interfaceC0711h2 = null;
                                        z9 = false;
                                    }
                                    long j114 = j17 + j6;
                                    long j115 = j114 + abstractC1535h.f6926i;
                                    i7 = c1537jM3831a.f6946j + abstractC1535h.f6927j;
                                    if (c1505j2 != null) {
                                        c0715l2 = c1505j2.f6707q;
                                        if (c0715l != c0715l2) {
                                            z10 = true;
                                        } else {
                                            z10 = true;
                                        }
                                        if (uri.equals(c1505j2.f6703m)) {
                                            z11 = false;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z10) {
                                            c1497b2 = null;
                                        } else {
                                            c1497b2 = null;
                                        }
                                        c0218h = c1505j2.f6715y;
                                        c0651s = c1505j2.f6716z;
                                        c1497b = c1497b2;
                                    } else {
                                        c0218h = new C0218h(null);
                                        c1497b = null;
                                        c0651s = new C0651s(10);
                                    }
                                    C0218h c0218h5 = c0218h;
                                    boolean z113 = !z7;
                                    sparseArray = (SparseArray) c1504i2.f6673d.f6406h;
                                    c0656x = (C0656x) sparseArray.get(i7);
                                    if (c0656x == null) {
                                        c0656x = new C0656x(9223372036854775806L);
                                        sparseArray.put(i7, c0656x);
                                    }
                                    C1505j c1505j6 = new C1505j(c1504i2.f6670a, c1496a, c0715l9, c0583o4, z8, interfaceC0711h2, c0715l, z9, uri, c1504i2.f6678i, iMo3747g4, objMo3749n4, j114, j115, c1503h.f6667b, c1503h.f6668c, z113, i7, abstractC1535h.f6934q, z112, c0656x, abstractC1535h.f6929l, c1497b, c0218h5, c0651s, z6, c1504i2.f6680k);
                                    c0817b2 = c0817b2;
                                    c0817b2.f3428b = c1505j6;
                                } else {
                                    C0583o c0583o5 = c1504i2.f6675f[i5];
                                    int iMo3747g5 = c1504i2.f6686q.mo3747g();
                                    Object objMo3749n5 = c1504i2.f6686q.mo3749n();
                                    boolean z114 = c1504i2.f6681l;
                                    c1447t = c1504i2.f6679j;
                                    if (uriM1645w2 == null) {
                                        c1447t.getClass();
                                        bArr = null;
                                    } else {
                                        bArr = (byte[]) ((C1499d) c1447t.f6406h).get(uriM1645w2);
                                    }
                                    if (uriM1645w == null) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = (byte[]) ((C1499d) c1447t.f6406h).get(uriM1645w);
                                    }
                                    AtomicInteger atomicInteger6 = C1505j.f6689L;
                                    map = Collections.EMPTY_MAP;
                                    Uri uriM1645w11 = AbstractC0646n.m1645w(str, abstractC1535h.f6924g);
                                    if (z7 != 0) {
                                        i6 = 8;
                                    } else {
                                        i6 = 0;
                                    }
                                    AbstractC0646n.m1632j(uriM1645w11, "The uri must be set.");
                                    C0715l c0715l11 = new C0715l(uriM1645w11, 1, null, map, abstractC1535h.f6932o, abstractC1535h.f6933p, i6);
                                    if (bArr != null) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    if (z8) {
                                        String str12 = abstractC1535h.f6931n;
                                        str12.getClass();
                                        bArrM3754d = C1505j.m3754d(str12);
                                    } else {
                                        bArrM3754d = null;
                                    }
                                    interfaceC0711h = c1504i2.f6671b;
                                    if (bArr != null) {
                                        bArrM3754d.getClass();
                                        c1496a = new C1496a(interfaceC0711h, bArr, bArrM3754d);
                                    } else {
                                        c1496a = interfaceC0711h;
                                    }
                                    c1534g2 = abstractC1535h.f6925h;
                                    if (c1534g2 != null) {
                                        if (bArr2 != null) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (z12) {
                                            String str13 = c1534g2.f6931n;
                                            str13.getClass();
                                            bArrM3754d2 = C1505j.m3754d(str13);
                                        } else {
                                            bArrM3754d2 = null;
                                        }
                                        Uri uriM1645w12 = AbstractC0646n.m1645w(str, c1534g2.f6924g);
                                        AbstractC0646n.m1632j(uriM1645w12, "The uri must be set.");
                                        C0715l c0715l12 = new C0715l(uriM1645w12, 1, null, map, c1534g2.f6932o, c1534g2.f6933p, 0);
                                        if (bArr2 != null) {
                                            bArrM3754d2.getClass();
                                            c1496a2 = new C1496a(interfaceC0711h, bArr2, bArrM3754d2);
                                        } else {
                                            c1496a2 = interfaceC0711h;
                                        }
                                        interfaceC0711h2 = c1496a2;
                                        z9 = z12;
                                        c0715l = c0715l12;
                                    } else {
                                        c0715l = null;
                                        interfaceC0711h2 = null;
                                        z9 = false;
                                    }
                                    long j116 = j17 + j6;
                                    long j117 = j116 + abstractC1535h.f6926i;
                                    i7 = c1537jM3831a.f6946j + abstractC1535h.f6927j;
                                    if (c1505j2 != null) {
                                        c0715l2 = c1505j2.f6707q;
                                        if (c0715l != c0715l2) {
                                            z10 = true;
                                        } else {
                                            z10 = true;
                                        }
                                        if (uri.equals(c1505j2.f6703m)) {
                                            z11 = false;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z10) {
                                            c1497b2 = null;
                                        } else {
                                            c1497b2 = null;
                                        }
                                        c0218h = c1505j2.f6715y;
                                        c0651s = c1505j2.f6716z;
                                        c1497b = c1497b2;
                                    } else {
                                        c0218h = new C0218h(null);
                                        c1497b = null;
                                        c0651s = new C0651s(10);
                                    }
                                    C0218h c0218h6 = c0218h;
                                    boolean z115 = !z7;
                                    sparseArray = (SparseArray) c1504i2.f6673d.f6406h;
                                    c0656x = (C0656x) sparseArray.get(i7);
                                    if (c0656x == null) {
                                        c0656x = new C0656x(9223372036854775806L);
                                        sparseArray.put(i7, c0656x);
                                    }
                                    C1505j c1505j7 = new C1505j(c1504i2.f6670a, c1496a, c0715l11, c0583o5, z8, interfaceC0711h2, c0715l, z9, uri, c1504i2.f6678i, iMo3747g5, objMo3749n5, j116, j117, c1503h.f6667b, c1503h.f6668c, z115, i7, abstractC1535h.f6934q, z114, c0656x, abstractC1535h.f6929l, c1497b, c0218h6, c0651s, z6, c1504i2.f6680k);
                                    c0817b2 = c0817b2;
                                    c0817b2.f3428b = c1505j7;
                                }
                            }
                            i5 = i3;
                            z6 = false;
                            z7 = c1503h.f6669d;
                            if (z6) {
                                C0583o c0583o6 = c1504i2.f6675f[i5];
                                int iMo3747g6 = c1504i2.f6686q.mo3747g();
                                Object objMo3749n6 = c1504i2.f6686q.mo3749n();
                                boolean z116 = c1504i2.f6681l;
                                c1447t = c1504i2.f6679j;
                                if (uriM1645w2 == null) {
                                    c1447t.getClass();
                                    bArr = null;
                                } else {
                                    bArr = (byte[]) ((C1499d) c1447t.f6406h).get(uriM1645w2);
                                }
                                if (uriM1645w == null) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = (byte[]) ((C1499d) c1447t.f6406h).get(uriM1645w);
                                }
                                AtomicInteger atomicInteger7 = C1505j.f6689L;
                                map = Collections.EMPTY_MAP;
                                Uri uriM1645w13 = AbstractC0646n.m1645w(str, abstractC1535h.f6924g);
                                if (z7 != 0) {
                                    i6 = 8;
                                } else {
                                    i6 = 0;
                                }
                                AbstractC0646n.m1632j(uriM1645w13, "The uri must be set.");
                                C0715l c0715l13 = new C0715l(uriM1645w13, 1, null, map, abstractC1535h.f6932o, abstractC1535h.f6933p, i6);
                                if (bArr != null) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                if (z8) {
                                    String str14 = abstractC1535h.f6931n;
                                    str14.getClass();
                                    bArrM3754d = C1505j.m3754d(str14);
                                } else {
                                    bArrM3754d = null;
                                }
                                interfaceC0711h = c1504i2.f6671b;
                                if (bArr != null) {
                                    bArrM3754d.getClass();
                                    c1496a = new C1496a(interfaceC0711h, bArr, bArrM3754d);
                                } else {
                                    c1496a = interfaceC0711h;
                                }
                                c1534g2 = abstractC1535h.f6925h;
                                if (c1534g2 != null) {
                                    if (bArr2 != null) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        String str15 = c1534g2.f6931n;
                                        str15.getClass();
                                        bArrM3754d2 = C1505j.m3754d(str15);
                                    } else {
                                        bArrM3754d2 = null;
                                    }
                                    Uri uriM1645w14 = AbstractC0646n.m1645w(str, c1534g2.f6924g);
                                    AbstractC0646n.m1632j(uriM1645w14, "The uri must be set.");
                                    C0715l c0715l14 = new C0715l(uriM1645w14, 1, null, map, c1534g2.f6932o, c1534g2.f6933p, 0);
                                    if (bArr2 != null) {
                                        bArrM3754d2.getClass();
                                        c1496a2 = new C1496a(interfaceC0711h, bArr2, bArrM3754d2);
                                    } else {
                                        c1496a2 = interfaceC0711h;
                                    }
                                    interfaceC0711h2 = c1496a2;
                                    z9 = z12;
                                    c0715l = c0715l14;
                                } else {
                                    c0715l = null;
                                    interfaceC0711h2 = null;
                                    z9 = false;
                                }
                                long j118 = j17 + j6;
                                long j119 = j118 + abstractC1535h.f6926i;
                                i7 = c1537jM3831a.f6946j + abstractC1535h.f6927j;
                                if (c1505j2 != null) {
                                    c0715l2 = c1505j2.f6707q;
                                    if (c0715l != c0715l2) {
                                        z10 = true;
                                    } else {
                                        z10 = true;
                                    }
                                    if (uri.equals(c1505j2.f6703m)) {
                                        z11 = false;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z10) {
                                        c1497b2 = null;
                                    } else {
                                        c1497b2 = null;
                                    }
                                    c0218h = c1505j2.f6715y;
                                    c0651s = c1505j2.f6716z;
                                    c1497b = c1497b2;
                                } else {
                                    c0218h = new C0218h(null);
                                    c1497b = null;
                                    c0651s = new C0651s(10);
                                }
                                C0218h c0218h7 = c0218h;
                                boolean z117 = !z7;
                                sparseArray = (SparseArray) c1504i2.f6673d.f6406h;
                                c0656x = (C0656x) sparseArray.get(i7);
                                if (c0656x == null) {
                                    c0656x = new C0656x(9223372036854775806L);
                                    sparseArray.put(i7, c0656x);
                                }
                                C1505j c1505j8 = new C1505j(c1504i2.f6670a, c1496a, c0715l13, c0583o6, z8, interfaceC0711h2, c0715l, z9, uri, c1504i2.f6678i, iMo3747g6, objMo3749n6, j118, j119, c1503h.f6667b, c1503h.f6668c, z117, i7, abstractC1535h.f6934q, z116, c0656x, abstractC1535h.f6929l, c1497b, c0218h7, c0651s, z6, c1504i2.f6680k);
                                c0817b2 = c0817b2;
                                c0817b2.f3428b = c1505j8;
                            } else {
                                C0583o c0583o7 = c1504i2.f6675f[i5];
                                int iMo3747g7 = c1504i2.f6686q.mo3747g();
                                Object objMo3749n7 = c1504i2.f6686q.mo3749n();
                                boolean z118 = c1504i2.f6681l;
                                c1447t = c1504i2.f6679j;
                                if (uriM1645w2 == null) {
                                    c1447t.getClass();
                                    bArr = null;
                                } else {
                                    bArr = (byte[]) ((C1499d) c1447t.f6406h).get(uriM1645w2);
                                }
                                if (uriM1645w == null) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = (byte[]) ((C1499d) c1447t.f6406h).get(uriM1645w);
                                }
                                AtomicInteger atomicInteger8 = C1505j.f6689L;
                                map = Collections.EMPTY_MAP;
                                Uri uriM1645w15 = AbstractC0646n.m1645w(str, abstractC1535h.f6924g);
                                if (z7 != 0) {
                                    i6 = 8;
                                } else {
                                    i6 = 0;
                                }
                                AbstractC0646n.m1632j(uriM1645w15, "The uri must be set.");
                                C0715l c0715l15 = new C0715l(uriM1645w15, 1, null, map, abstractC1535h.f6932o, abstractC1535h.f6933p, i6);
                                if (bArr != null) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                if (z8) {
                                    String str16 = abstractC1535h.f6931n;
                                    str16.getClass();
                                    bArrM3754d = C1505j.m3754d(str16);
                                } else {
                                    bArrM3754d = null;
                                }
                                interfaceC0711h = c1504i2.f6671b;
                                if (bArr != null) {
                                    bArrM3754d.getClass();
                                    c1496a = new C1496a(interfaceC0711h, bArr, bArrM3754d);
                                } else {
                                    c1496a = interfaceC0711h;
                                }
                                c1534g2 = abstractC1535h.f6925h;
                                if (c1534g2 != null) {
                                    if (bArr2 != null) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        String str17 = c1534g2.f6931n;
                                        str17.getClass();
                                        bArrM3754d2 = C1505j.m3754d(str17);
                                    } else {
                                        bArrM3754d2 = null;
                                    }
                                    Uri uriM1645w16 = AbstractC0646n.m1645w(str, c1534g2.f6924g);
                                    AbstractC0646n.m1632j(uriM1645w16, "The uri must be set.");
                                    C0715l c0715l16 = new C0715l(uriM1645w16, 1, null, map, c1534g2.f6932o, c1534g2.f6933p, 0);
                                    if (bArr2 != null) {
                                        bArrM3754d2.getClass();
                                        c1496a2 = new C1496a(interfaceC0711h, bArr2, bArrM3754d2);
                                    } else {
                                        c1496a2 = interfaceC0711h;
                                    }
                                    interfaceC0711h2 = c1496a2;
                                    z9 = z12;
                                    c0715l = c0715l16;
                                } else {
                                    c0715l = null;
                                    interfaceC0711h2 = null;
                                    z9 = false;
                                }
                                long j1110 = j17 + j6;
                                long j1111 = j1110 + abstractC1535h.f6926i;
                                i7 = c1537jM3831a.f6946j + abstractC1535h.f6927j;
                                if (c1505j2 != null) {
                                    c0715l2 = c1505j2.f6707q;
                                    if (c0715l != c0715l2) {
                                        z10 = true;
                                    } else {
                                        z10 = true;
                                    }
                                    if (uri.equals(c1505j2.f6703m)) {
                                        z11 = false;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z10) {
                                        c1497b2 = null;
                                    } else {
                                        c1497b2 = null;
                                    }
                                    c0218h = c1505j2.f6715y;
                                    c0651s = c1505j2.f6716z;
                                    c1497b = c1497b2;
                                } else {
                                    c0218h = new C0218h(null);
                                    c1497b = null;
                                    c0651s = new C0651s(10);
                                }
                                C0218h c0218h8 = c0218h;
                                boolean z119 = !z7;
                                sparseArray = (SparseArray) c1504i2.f6673d.f6406h;
                                c0656x = (C0656x) sparseArray.get(i7);
                                if (c0656x == null) {
                                    c0656x = new C0656x(9223372036854775806L);
                                    sparseArray.put(i7, c0656x);
                                }
                                C1505j c1505j9 = new C1505j(c1504i2.f6670a, c1496a, c0715l15, c0583o7, z8, interfaceC0711h2, c0715l, z9, uri, c1504i2.f6678i, iMo3747g7, objMo3749n7, j1110, j1111, c1503h.f6667b, c1503h.f6668c, z119, i7, abstractC1535h.f6934q, z118, c0656x, abstractC1535h.f6929l, c1497b, c0218h8, c0651s, z6, c1504i2.f6680k);
                                c0817b2 = c0817b2;
                                c0817b2.f3428b = c1505j9;
                            }
                        }
                    }
                } else if (!c1537jM3831a.f6951o) {
                    c0817b2.f3429c = uri;
                    c1504i2.f6688s &= uri.equals(c1504i2.f6684o);
                    c1504i2.f6684o = uri;
                } else if (z13 || abstractC1676G.isEmpty()) {
                    c0817b2.f3427a = true;
                } else {
                    c1503h = new C1503h((AbstractC1535h) AbstractC1723q.m4158g(abstractC1676G), (j16 + ((long) abstractC1676G.size())) - 1, -1);
                    c1504i2.f6688s = false;
                    c1504i2.f6684o = null;
                    SystemClock.elapsedRealtime();
                    abstractC1535h = c1503h.f6666a;
                    c1534g = abstractC1535h.f6925h;
                    str = c1537jM3831a.f6977a;
                    if (c1534g != null) {
                        uriM1645w = null;
                    } else {
                        uriM1645w = null;
                    }
                    c1500eM3753d = c1504i2.m3753d(uriM1645w, i3, true);
                    c0817b2.f3428b = c1500eM3753d;
                    if (c1500eM3753d == null) {
                        str2 = abstractC1535h.f6930m;
                        if (str2 == null) {
                            uriM1645w2 = null;
                        } else {
                            uriM1645w2 = AbstractC0646n.m1645w(str, str2);
                        }
                        c1500eM3753d2 = c1504i2.m3753d(uriM1645w2, i3, false);
                        c0817b2.f3428b = c1500eM3753d2;
                        if (c1500eM3753d2 == null) {
                            j6 = abstractC1535h.f6928k;
                            if (c1505j2 == null) {
                                AtomicInteger atomicInteger9 = C1505j.f6689L;
                            } else {
                                if (uri.equals(c1505j2.f6703m)) {
                                }
                                j7 = j17 + j6;
                                z3 = abstractC1535h instanceof C1532e;
                                z4 = c1537jM3831a.f6979c;
                                if (z3) {
                                    z5 = z4;
                                } else if (((C1532e) abstractC1535h).f6917r) {
                                    z5 = true;
                                } else {
                                    z5 = true;
                                }
                                if (z5) {
                                    i5 = i3;
                                    if (j7 >= c1505j2.f8608h) {
                                        z6 = false;
                                    }
                                    z7 = c1503h.f6669d;
                                    if (z6) {
                                        C0583o c0583o8 = c1504i2.f6675f[i5];
                                        int iMo3747g8 = c1504i2.f6686q.mo3747g();
                                        Object objMo3749n8 = c1504i2.f6686q.mo3749n();
                                        boolean z1110 = c1504i2.f6681l;
                                        c1447t = c1504i2.f6679j;
                                        if (uriM1645w2 == null) {
                                            c1447t.getClass();
                                            bArr = null;
                                        } else {
                                            bArr = (byte[]) ((C1499d) c1447t.f6406h).get(uriM1645w2);
                                        }
                                        if (uriM1645w == null) {
                                            bArr2 = null;
                                        } else {
                                            bArr2 = (byte[]) ((C1499d) c1447t.f6406h).get(uriM1645w);
                                        }
                                        AtomicInteger atomicInteger10 = C1505j.f6689L;
                                        map = Collections.EMPTY_MAP;
                                        Uri uriM1645w17 = AbstractC0646n.m1645w(str, abstractC1535h.f6924g);
                                        if (z7 != 0) {
                                            i6 = 8;
                                        } else {
                                            i6 = 0;
                                        }
                                        AbstractC0646n.m1632j(uriM1645w17, "The uri must be set.");
                                        C0715l c0715l17 = new C0715l(uriM1645w17, 1, null, map, abstractC1535h.f6932o, abstractC1535h.f6933p, i6);
                                        if (bArr != null) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        if (z8) {
                                            String str18 = abstractC1535h.f6931n;
                                            str18.getClass();
                                            bArrM3754d = C1505j.m3754d(str18);
                                        } else {
                                            bArrM3754d = null;
                                        }
                                        interfaceC0711h = c1504i2.f6671b;
                                        if (bArr != null) {
                                            bArrM3754d.getClass();
                                            c1496a = new C1496a(interfaceC0711h, bArr, bArrM3754d);
                                        } else {
                                            c1496a = interfaceC0711h;
                                        }
                                        c1534g2 = abstractC1535h.f6925h;
                                        if (c1534g2 != null) {
                                            if (bArr2 != null) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            if (z12) {
                                                String str19 = c1534g2.f6931n;
                                                str19.getClass();
                                                bArrM3754d2 = C1505j.m3754d(str19);
                                            } else {
                                                bArrM3754d2 = null;
                                            }
                                            Uri uriM1645w18 = AbstractC0646n.m1645w(str, c1534g2.f6924g);
                                            AbstractC0646n.m1632j(uriM1645w18, "The uri must be set.");
                                            C0715l c0715l18 = new C0715l(uriM1645w18, 1, null, map, c1534g2.f6932o, c1534g2.f6933p, 0);
                                            if (bArr2 != null) {
                                                bArrM3754d2.getClass();
                                                c1496a2 = new C1496a(interfaceC0711h, bArr2, bArrM3754d2);
                                            } else {
                                                c1496a2 = interfaceC0711h;
                                            }
                                            interfaceC0711h2 = c1496a2;
                                            z9 = z12;
                                            c0715l = c0715l18;
                                        } else {
                                            c0715l = null;
                                            interfaceC0711h2 = null;
                                            z9 = false;
                                        }
                                        long j1112 = j17 + j6;
                                        long j1113 = j1112 + abstractC1535h.f6926i;
                                        i7 = c1537jM3831a.f6946j + abstractC1535h.f6927j;
                                        if (c1505j2 != null) {
                                            c0715l2 = c1505j2.f6707q;
                                            if (c0715l != c0715l2) {
                                                z10 = true;
                                            } else {
                                                z10 = true;
                                            }
                                            if (uri.equals(c1505j2.f6703m)) {
                                                z11 = false;
                                            } else {
                                                z11 = false;
                                            }
                                            if (z10) {
                                                c1497b2 = null;
                                            } else {
                                                c1497b2 = null;
                                            }
                                            c0218h = c1505j2.f6715y;
                                            c0651s = c1505j2.f6716z;
                                            c1497b = c1497b2;
                                        } else {
                                            c0218h = new C0218h(null);
                                            c1497b = null;
                                            c0651s = new C0651s(10);
                                        }
                                        C0218h c0218h9 = c0218h;
                                        boolean z1111 = !z7;
                                        sparseArray = (SparseArray) c1504i2.f6673d.f6406h;
                                        c0656x = (C0656x) sparseArray.get(i7);
                                        if (c0656x == null) {
                                            c0656x = new C0656x(9223372036854775806L);
                                            sparseArray.put(i7, c0656x);
                                        }
                                        C1505j c1505j10 = new C1505j(c1504i2.f6670a, c1496a, c0715l17, c0583o8, z8, interfaceC0711h2, c0715l, z9, uri, c1504i2.f6678i, iMo3747g8, objMo3749n8, j1112, j1113, c1503h.f6667b, c1503h.f6668c, z1111, i7, abstractC1535h.f6934q, z1110, c0656x, abstractC1535h.f6929l, c1497b, c0218h9, c0651s, z6, c1504i2.f6680k);
                                        c0817b2 = c0817b2;
                                        c0817b2.f3428b = c1505j10;
                                    } else {
                                        C0583o c0583o9 = c1504i2.f6675f[i5];
                                        int iMo3747g9 = c1504i2.f6686q.mo3747g();
                                        Object objMo3749n9 = c1504i2.f6686q.mo3749n();
                                        boolean z1112 = c1504i2.f6681l;
                                        c1447t = c1504i2.f6679j;
                                        if (uriM1645w2 == null) {
                                            c1447t.getClass();
                                            bArr = null;
                                        } else {
                                            bArr = (byte[]) ((C1499d) c1447t.f6406h).get(uriM1645w2);
                                        }
                                        if (uriM1645w == null) {
                                            bArr2 = null;
                                        } else {
                                            bArr2 = (byte[]) ((C1499d) c1447t.f6406h).get(uriM1645w);
                                        }
                                        AtomicInteger atomicInteger11 = C1505j.f6689L;
                                        map = Collections.EMPTY_MAP;
                                        Uri uriM1645w19 = AbstractC0646n.m1645w(str, abstractC1535h.f6924g);
                                        if (z7 != 0) {
                                            i6 = 8;
                                        } else {
                                            i6 = 0;
                                        }
                                        AbstractC0646n.m1632j(uriM1645w19, "The uri must be set.");
                                        C0715l c0715l19 = new C0715l(uriM1645w19, 1, null, map, abstractC1535h.f6932o, abstractC1535h.f6933p, i6);
                                        if (bArr != null) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        if (z8) {
                                            String str110 = abstractC1535h.f6931n;
                                            str110.getClass();
                                            bArrM3754d = C1505j.m3754d(str110);
                                        } else {
                                            bArrM3754d = null;
                                        }
                                        interfaceC0711h = c1504i2.f6671b;
                                        if (bArr != null) {
                                            bArrM3754d.getClass();
                                            c1496a = new C1496a(interfaceC0711h, bArr, bArrM3754d);
                                        } else {
                                            c1496a = interfaceC0711h;
                                        }
                                        c1534g2 = abstractC1535h.f6925h;
                                        if (c1534g2 != null) {
                                            if (bArr2 != null) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            if (z12) {
                                                String str111 = c1534g2.f6931n;
                                                str111.getClass();
                                                bArrM3754d2 = C1505j.m3754d(str111);
                                            } else {
                                                bArrM3754d2 = null;
                                            }
                                            Uri uriM1645w110 = AbstractC0646n.m1645w(str, c1534g2.f6924g);
                                            AbstractC0646n.m1632j(uriM1645w110, "The uri must be set.");
                                            C0715l c0715l110 = new C0715l(uriM1645w110, 1, null, map, c1534g2.f6932o, c1534g2.f6933p, 0);
                                            if (bArr2 != null) {
                                                bArrM3754d2.getClass();
                                                c1496a2 = new C1496a(interfaceC0711h, bArr2, bArrM3754d2);
                                            } else {
                                                c1496a2 = interfaceC0711h;
                                            }
                                            interfaceC0711h2 = c1496a2;
                                            z9 = z12;
                                            c0715l = c0715l110;
                                        } else {
                                            c0715l = null;
                                            interfaceC0711h2 = null;
                                            z9 = false;
                                        }
                                        long j1114 = j17 + j6;
                                        long j1115 = j1114 + abstractC1535h.f6926i;
                                        i7 = c1537jM3831a.f6946j + abstractC1535h.f6927j;
                                        if (c1505j2 != null) {
                                            c0715l2 = c1505j2.f6707q;
                                            if (c0715l != c0715l2) {
                                                z10 = true;
                                            } else {
                                                z10 = true;
                                            }
                                            if (uri.equals(c1505j2.f6703m)) {
                                                z11 = false;
                                            } else {
                                                z11 = false;
                                            }
                                            if (z10) {
                                                c1497b2 = null;
                                            } else {
                                                c1497b2 = null;
                                            }
                                            c0218h = c1505j2.f6715y;
                                            c0651s = c1505j2.f6716z;
                                            c1497b = c1497b2;
                                        } else {
                                            c0218h = new C0218h(null);
                                            c1497b = null;
                                            c0651s = new C0651s(10);
                                        }
                                        C0218h c0218h10 = c0218h;
                                        boolean z1113 = !z7;
                                        sparseArray = (SparseArray) c1504i2.f6673d.f6406h;
                                        c0656x = (C0656x) sparseArray.get(i7);
                                        if (c0656x == null) {
                                            c0656x = new C0656x(9223372036854775806L);
                                            sparseArray.put(i7, c0656x);
                                        }
                                        C1505j c1505j11 = new C1505j(c1504i2.f6670a, c1496a, c0715l19, c0583o9, z8, interfaceC0711h2, c0715l, z9, uri, c1504i2.f6678i, iMo3747g9, objMo3749n9, j1114, j1115, c1503h.f6667b, c1503h.f6668c, z1113, i7, abstractC1535h.f6934q, z1112, c0656x, abstractC1535h.f6929l, c1497b, c0218h10, c0651s, z6, c1504i2.f6680k);
                                        c0817b2 = c0817b2;
                                        c0817b2.f3428b = c1505j11;
                                    }
                                } else {
                                    i5 = i3;
                                }
                                z6 = true;
                                z7 = c1503h.f6669d;
                                if (z6) {
                                    C0583o c0583o10 = c1504i2.f6675f[i5];
                                    int iMo3747g10 = c1504i2.f6686q.mo3747g();
                                    Object objMo3749n10 = c1504i2.f6686q.mo3749n();
                                    boolean z1114 = c1504i2.f6681l;
                                    c1447t = c1504i2.f6679j;
                                    if (uriM1645w2 == null) {
                                        c1447t.getClass();
                                        bArr = null;
                                    } else {
                                        bArr = (byte[]) ((C1499d) c1447t.f6406h).get(uriM1645w2);
                                    }
                                    if (uriM1645w == null) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = (byte[]) ((C1499d) c1447t.f6406h).get(uriM1645w);
                                    }
                                    AtomicInteger atomicInteger12 = C1505j.f6689L;
                                    map = Collections.EMPTY_MAP;
                                    Uri uriM1645w111 = AbstractC0646n.m1645w(str, abstractC1535h.f6924g);
                                    if (z7 != 0) {
                                        i6 = 8;
                                    } else {
                                        i6 = 0;
                                    }
                                    AbstractC0646n.m1632j(uriM1645w111, "The uri must be set.");
                                    C0715l c0715l111 = new C0715l(uriM1645w111, 1, null, map, abstractC1535h.f6932o, abstractC1535h.f6933p, i6);
                                    if (bArr != null) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    if (z8) {
                                        String str112 = abstractC1535h.f6931n;
                                        str112.getClass();
                                        bArrM3754d = C1505j.m3754d(str112);
                                    } else {
                                        bArrM3754d = null;
                                    }
                                    interfaceC0711h = c1504i2.f6671b;
                                    if (bArr != null) {
                                        bArrM3754d.getClass();
                                        c1496a = new C1496a(interfaceC0711h, bArr, bArrM3754d);
                                    } else {
                                        c1496a = interfaceC0711h;
                                    }
                                    c1534g2 = abstractC1535h.f6925h;
                                    if (c1534g2 != null) {
                                        if (bArr2 != null) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (z12) {
                                            String str113 = c1534g2.f6931n;
                                            str113.getClass();
                                            bArrM3754d2 = C1505j.m3754d(str113);
                                        } else {
                                            bArrM3754d2 = null;
                                        }
                                        Uri uriM1645w112 = AbstractC0646n.m1645w(str, c1534g2.f6924g);
                                        AbstractC0646n.m1632j(uriM1645w112, "The uri must be set.");
                                        C0715l c0715l112 = new C0715l(uriM1645w112, 1, null, map, c1534g2.f6932o, c1534g2.f6933p, 0);
                                        if (bArr2 != null) {
                                            bArrM3754d2.getClass();
                                            c1496a2 = new C1496a(interfaceC0711h, bArr2, bArrM3754d2);
                                        } else {
                                            c1496a2 = interfaceC0711h;
                                        }
                                        interfaceC0711h2 = c1496a2;
                                        z9 = z12;
                                        c0715l = c0715l112;
                                    } else {
                                        c0715l = null;
                                        interfaceC0711h2 = null;
                                        z9 = false;
                                    }
                                    long j1116 = j17 + j6;
                                    long j1117 = j1116 + abstractC1535h.f6926i;
                                    i7 = c1537jM3831a.f6946j + abstractC1535h.f6927j;
                                    if (c1505j2 != null) {
                                        c0715l2 = c1505j2.f6707q;
                                        if (c0715l != c0715l2) {
                                            z10 = true;
                                        } else {
                                            z10 = true;
                                        }
                                        if (uri.equals(c1505j2.f6703m)) {
                                            z11 = false;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z10) {
                                            c1497b2 = null;
                                        } else {
                                            c1497b2 = null;
                                        }
                                        c0218h = c1505j2.f6715y;
                                        c0651s = c1505j2.f6716z;
                                        c1497b = c1497b2;
                                    } else {
                                        c0218h = new C0218h(null);
                                        c1497b = null;
                                        c0651s = new C0651s(10);
                                    }
                                    C0218h c0218h11 = c0218h;
                                    boolean z1115 = !z7;
                                    sparseArray = (SparseArray) c1504i2.f6673d.f6406h;
                                    c0656x = (C0656x) sparseArray.get(i7);
                                    if (c0656x == null) {
                                        c0656x = new C0656x(9223372036854775806L);
                                        sparseArray.put(i7, c0656x);
                                    }
                                    C1505j c1505j12 = new C1505j(c1504i2.f6670a, c1496a, c0715l111, c0583o10, z8, interfaceC0711h2, c0715l, z9, uri, c1504i2.f6678i, iMo3747g10, objMo3749n10, j1116, j1117, c1503h.f6667b, c1503h.f6668c, z1115, i7, abstractC1535h.f6934q, z1114, c0656x, abstractC1535h.f6929l, c1497b, c0218h11, c0651s, z6, c1504i2.f6680k);
                                    c0817b2 = c0817b2;
                                    c0817b2.f3428b = c1505j12;
                                } else {
                                    C0583o c0583o11 = c1504i2.f6675f[i5];
                                    int iMo3747g11 = c1504i2.f6686q.mo3747g();
                                    Object objMo3749n11 = c1504i2.f6686q.mo3749n();
                                    boolean z1116 = c1504i2.f6681l;
                                    c1447t = c1504i2.f6679j;
                                    if (uriM1645w2 == null) {
                                        c1447t.getClass();
                                        bArr = null;
                                    } else {
                                        bArr = (byte[]) ((C1499d) c1447t.f6406h).get(uriM1645w2);
                                    }
                                    if (uriM1645w == null) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = (byte[]) ((C1499d) c1447t.f6406h).get(uriM1645w);
                                    }
                                    AtomicInteger atomicInteger13 = C1505j.f6689L;
                                    map = Collections.EMPTY_MAP;
                                    Uri uriM1645w113 = AbstractC0646n.m1645w(str, abstractC1535h.f6924g);
                                    if (z7 != 0) {
                                        i6 = 8;
                                    } else {
                                        i6 = 0;
                                    }
                                    AbstractC0646n.m1632j(uriM1645w113, "The uri must be set.");
                                    C0715l c0715l113 = new C0715l(uriM1645w113, 1, null, map, abstractC1535h.f6932o, abstractC1535h.f6933p, i6);
                                    if (bArr != null) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    if (z8) {
                                        String str114 = abstractC1535h.f6931n;
                                        str114.getClass();
                                        bArrM3754d = C1505j.m3754d(str114);
                                    } else {
                                        bArrM3754d = null;
                                    }
                                    interfaceC0711h = c1504i2.f6671b;
                                    if (bArr != null) {
                                        bArrM3754d.getClass();
                                        c1496a = new C1496a(interfaceC0711h, bArr, bArrM3754d);
                                    } else {
                                        c1496a = interfaceC0711h;
                                    }
                                    c1534g2 = abstractC1535h.f6925h;
                                    if (c1534g2 != null) {
                                        if (bArr2 != null) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (z12) {
                                            String str115 = c1534g2.f6931n;
                                            str115.getClass();
                                            bArrM3754d2 = C1505j.m3754d(str115);
                                        } else {
                                            bArrM3754d2 = null;
                                        }
                                        Uri uriM1645w114 = AbstractC0646n.m1645w(str, c1534g2.f6924g);
                                        AbstractC0646n.m1632j(uriM1645w114, "The uri must be set.");
                                        C0715l c0715l114 = new C0715l(uriM1645w114, 1, null, map, c1534g2.f6932o, c1534g2.f6933p, 0);
                                        if (bArr2 != null) {
                                            bArrM3754d2.getClass();
                                            c1496a2 = new C1496a(interfaceC0711h, bArr2, bArrM3754d2);
                                        } else {
                                            c1496a2 = interfaceC0711h;
                                        }
                                        interfaceC0711h2 = c1496a2;
                                        z9 = z12;
                                        c0715l = c0715l114;
                                    } else {
                                        c0715l = null;
                                        interfaceC0711h2 = null;
                                        z9 = false;
                                    }
                                    long j1118 = j17 + j6;
                                    long j1119 = j1118 + abstractC1535h.f6926i;
                                    i7 = c1537jM3831a.f6946j + abstractC1535h.f6927j;
                                    if (c1505j2 != null) {
                                        c0715l2 = c1505j2.f6707q;
                                        if (c0715l != c0715l2) {
                                            z10 = true;
                                        } else {
                                            z10 = true;
                                        }
                                        if (uri.equals(c1505j2.f6703m)) {
                                            z11 = false;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z10) {
                                            c1497b2 = null;
                                        } else {
                                            c1497b2 = null;
                                        }
                                        c0218h = c1505j2.f6715y;
                                        c0651s = c1505j2.f6716z;
                                        c1497b = c1497b2;
                                    } else {
                                        c0218h = new C0218h(null);
                                        c1497b = null;
                                        c0651s = new C0651s(10);
                                    }
                                    C0218h c0218h12 = c0218h;
                                    boolean z1117 = !z7;
                                    sparseArray = (SparseArray) c1504i2.f6673d.f6406h;
                                    c0656x = (C0656x) sparseArray.get(i7);
                                    if (c0656x == null) {
                                        c0656x = new C0656x(9223372036854775806L);
                                        sparseArray.put(i7, c0656x);
                                    }
                                    C1505j c1505j13 = new C1505j(c1504i2.f6670a, c1496a, c0715l113, c0583o11, z8, interfaceC0711h2, c0715l, z9, uri, c1504i2.f6678i, iMo3747g11, objMo3749n11, j1118, j1119, c1503h.f6667b, c1503h.f6668c, z1117, i7, abstractC1535h.f6934q, z1116, c0656x, abstractC1535h.f6929l, c1497b, c0218h12, c0651s, z6, c1504i2.f6680k);
                                    c0817b2 = c0817b2;
                                    c0817b2.f3428b = c1505j13;
                                }
                            }
                            i5 = i3;
                            z6 = false;
                            z7 = c1503h.f6669d;
                            if (z6) {
                                C0583o c0583o12 = c1504i2.f6675f[i5];
                                int iMo3747g12 = c1504i2.f6686q.mo3747g();
                                Object objMo3749n12 = c1504i2.f6686q.mo3749n();
                                boolean z1118 = c1504i2.f6681l;
                                c1447t = c1504i2.f6679j;
                                if (uriM1645w2 == null) {
                                    c1447t.getClass();
                                    bArr = null;
                                } else {
                                    bArr = (byte[]) ((C1499d) c1447t.f6406h).get(uriM1645w2);
                                }
                                if (uriM1645w == null) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = (byte[]) ((C1499d) c1447t.f6406h).get(uriM1645w);
                                }
                                AtomicInteger atomicInteger14 = C1505j.f6689L;
                                map = Collections.EMPTY_MAP;
                                Uri uriM1645w115 = AbstractC0646n.m1645w(str, abstractC1535h.f6924g);
                                if (z7 != 0) {
                                    i6 = 8;
                                } else {
                                    i6 = 0;
                                }
                                AbstractC0646n.m1632j(uriM1645w115, "The uri must be set.");
                                C0715l c0715l115 = new C0715l(uriM1645w115, 1, null, map, abstractC1535h.f6932o, abstractC1535h.f6933p, i6);
                                if (bArr != null) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                if (z8) {
                                    String str116 = abstractC1535h.f6931n;
                                    str116.getClass();
                                    bArrM3754d = C1505j.m3754d(str116);
                                } else {
                                    bArrM3754d = null;
                                }
                                interfaceC0711h = c1504i2.f6671b;
                                if (bArr != null) {
                                    bArrM3754d.getClass();
                                    c1496a = new C1496a(interfaceC0711h, bArr, bArrM3754d);
                                } else {
                                    c1496a = interfaceC0711h;
                                }
                                c1534g2 = abstractC1535h.f6925h;
                                if (c1534g2 != null) {
                                    if (bArr2 != null) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        String str117 = c1534g2.f6931n;
                                        str117.getClass();
                                        bArrM3754d2 = C1505j.m3754d(str117);
                                    } else {
                                        bArrM3754d2 = null;
                                    }
                                    Uri uriM1645w116 = AbstractC0646n.m1645w(str, c1534g2.f6924g);
                                    AbstractC0646n.m1632j(uriM1645w116, "The uri must be set.");
                                    C0715l c0715l116 = new C0715l(uriM1645w116, 1, null, map, c1534g2.f6932o, c1534g2.f6933p, 0);
                                    if (bArr2 != null) {
                                        bArrM3754d2.getClass();
                                        c1496a2 = new C1496a(interfaceC0711h, bArr2, bArrM3754d2);
                                    } else {
                                        c1496a2 = interfaceC0711h;
                                    }
                                    interfaceC0711h2 = c1496a2;
                                    z9 = z12;
                                    c0715l = c0715l116;
                                } else {
                                    c0715l = null;
                                    interfaceC0711h2 = null;
                                    z9 = false;
                                }
                                long j11110 = j17 + j6;
                                long j11111 = j11110 + abstractC1535h.f6926i;
                                i7 = c1537jM3831a.f6946j + abstractC1535h.f6927j;
                                if (c1505j2 != null) {
                                    c0715l2 = c1505j2.f6707q;
                                    if (c0715l != c0715l2) {
                                        z10 = true;
                                    } else {
                                        z10 = true;
                                    }
                                    if (uri.equals(c1505j2.f6703m)) {
                                        z11 = false;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z10) {
                                        c1497b2 = null;
                                    } else {
                                        c1497b2 = null;
                                    }
                                    c0218h = c1505j2.f6715y;
                                    c0651s = c1505j2.f6716z;
                                    c1497b = c1497b2;
                                } else {
                                    c0218h = new C0218h(null);
                                    c1497b = null;
                                    c0651s = new C0651s(10);
                                }
                                C0218h c0218h13 = c0218h;
                                boolean z1119 = !z7;
                                sparseArray = (SparseArray) c1504i2.f6673d.f6406h;
                                c0656x = (C0656x) sparseArray.get(i7);
                                if (c0656x == null) {
                                    c0656x = new C0656x(9223372036854775806L);
                                    sparseArray.put(i7, c0656x);
                                }
                                C1505j c1505j14 = new C1505j(c1504i2.f6670a, c1496a, c0715l115, c0583o12, z8, interfaceC0711h2, c0715l, z9, uri, c1504i2.f6678i, iMo3747g12, objMo3749n12, j11110, j11111, c1503h.f6667b, c1503h.f6668c, z1119, i7, abstractC1535h.f6934q, z1118, c0656x, abstractC1535h.f6929l, c1497b, c0218h13, c0651s, z6, c1504i2.f6680k);
                                c0817b2 = c0817b2;
                                c0817b2.f3428b = c1505j14;
                            } else {
                                C0583o c0583o13 = c1504i2.f6675f[i5];
                                int iMo3747g13 = c1504i2.f6686q.mo3747g();
                                Object objMo3749n13 = c1504i2.f6686q.mo3749n();
                                boolean z11110 = c1504i2.f6681l;
                                c1447t = c1504i2.f6679j;
                                if (uriM1645w2 == null) {
                                    c1447t.getClass();
                                    bArr = null;
                                } else {
                                    bArr = (byte[]) ((C1499d) c1447t.f6406h).get(uriM1645w2);
                                }
                                if (uriM1645w == null) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = (byte[]) ((C1499d) c1447t.f6406h).get(uriM1645w);
                                }
                                AtomicInteger atomicInteger15 = C1505j.f6689L;
                                map = Collections.EMPTY_MAP;
                                Uri uriM1645w117 = AbstractC0646n.m1645w(str, abstractC1535h.f6924g);
                                if (z7 != 0) {
                                    i6 = 8;
                                } else {
                                    i6 = 0;
                                }
                                AbstractC0646n.m1632j(uriM1645w117, "The uri must be set.");
                                C0715l c0715l117 = new C0715l(uriM1645w117, 1, null, map, abstractC1535h.f6932o, abstractC1535h.f6933p, i6);
                                if (bArr != null) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                if (z8) {
                                    String str118 = abstractC1535h.f6931n;
                                    str118.getClass();
                                    bArrM3754d = C1505j.m3754d(str118);
                                } else {
                                    bArrM3754d = null;
                                }
                                interfaceC0711h = c1504i2.f6671b;
                                if (bArr != null) {
                                    bArrM3754d.getClass();
                                    c1496a = new C1496a(interfaceC0711h, bArr, bArrM3754d);
                                } else {
                                    c1496a = interfaceC0711h;
                                }
                                c1534g2 = abstractC1535h.f6925h;
                                if (c1534g2 != null) {
                                    if (bArr2 != null) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        String str119 = c1534g2.f6931n;
                                        str119.getClass();
                                        bArrM3754d2 = C1505j.m3754d(str119);
                                    } else {
                                        bArrM3754d2 = null;
                                    }
                                    Uri uriM1645w118 = AbstractC0646n.m1645w(str, c1534g2.f6924g);
                                    AbstractC0646n.m1632j(uriM1645w118, "The uri must be set.");
                                    C0715l c0715l118 = new C0715l(uriM1645w118, 1, null, map, c1534g2.f6932o, c1534g2.f6933p, 0);
                                    if (bArr2 != null) {
                                        bArrM3754d2.getClass();
                                        c1496a2 = new C1496a(interfaceC0711h, bArr2, bArrM3754d2);
                                    } else {
                                        c1496a2 = interfaceC0711h;
                                    }
                                    interfaceC0711h2 = c1496a2;
                                    z9 = z12;
                                    c0715l = c0715l118;
                                } else {
                                    c0715l = null;
                                    interfaceC0711h2 = null;
                                    z9 = false;
                                }
                                long j11112 = j17 + j6;
                                long j11113 = j11112 + abstractC1535h.f6926i;
                                i7 = c1537jM3831a.f6946j + abstractC1535h.f6927j;
                                if (c1505j2 != null) {
                                    c0715l2 = c1505j2.f6707q;
                                    if (c0715l != c0715l2) {
                                        z10 = true;
                                    } else {
                                        z10 = true;
                                    }
                                    if (uri.equals(c1505j2.f6703m)) {
                                        z11 = false;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z10) {
                                        c1497b2 = null;
                                    } else {
                                        c1497b2 = null;
                                    }
                                    c0218h = c1505j2.f6715y;
                                    c0651s = c1505j2.f6716z;
                                    c1497b = c1497b2;
                                } else {
                                    c0218h = new C0218h(null);
                                    c1497b = null;
                                    c0651s = new C0651s(10);
                                }
                                C0218h c0218h14 = c0218h;
                                boolean z11111 = !z7;
                                sparseArray = (SparseArray) c1504i2.f6673d.f6406h;
                                c0656x = (C0656x) sparseArray.get(i7);
                                if (c0656x == null) {
                                    c0656x = new C0656x(9223372036854775806L);
                                    sparseArray.put(i7, c0656x);
                                }
                                C1505j c1505j15 = new C1505j(c1504i2.f6670a, c1496a, c0715l117, c0583o13, z8, interfaceC0711h2, c0715l, z9, uri, c1504i2.f6678i, iMo3747g13, objMo3749n13, j11112, j11113, c1503h.f6667b, c1503h.f6668c, z11111, i7, abstractC1535h.f6934q, z11110, c0656x, abstractC1535h.f6929l, c1497b, c0218h14, c0651s, z6, c1504i2.f6680k);
                                c0817b2 = c0817b2;
                                c0817b2.f3428b = c1505j15;
                            }
                        }
                    }
                }
            }
        } else {
            C0817b c0817b4 = c0817b;
            c0817b4.f3429c = uri;
            c1504i2.f6688s &= uri.equals(c1504i2.f6684o);
            c1504i2.f6684o = uri;
            c0817b2 = c0817b4;
        }
        boolean z20 = c0817b2.f3427a;
        AbstractC1972a abstractC1972a = (AbstractC1972a) c0817b2.f3428b;
        Uri uri2 = (Uri) c0817b2.f3429c;
        if (z20) {
            this.f6789W = j3;
            this.f6792Z = true;
            return true;
        }
        if (abstractC1972a == null) {
            if (uri2 == null) {
                return false;
            }
            ((C1530c) ((C1506k) this.f6799i.f6406h).f6721h.f6906j.get(uri2)).m3827c(true);
            return false;
        }
        if (abstractC1972a instanceof C1505j) {
            C1505j c1505j16 = (C1505j) abstractC1972a;
            this.f6796d0 = c1505j16;
            this.f6778L = c1505j16.f8604d;
            this.f6789W = -9223372036854775807L;
            this.f6810t.add(c1505j16);
            C1673D c1673dM4116m = AbstractC1676G.m4116m();
            for (C1511p c1511p2 : this.f6768B) {
                c1673dM4116m.m4102a(Integer.valueOf(c1511p2.f8465q + c1511p2.f8464p));
            }
            C1692X c1692xM4112f = c1673dM4116m.m4112f();
            c1505j16.f6693D = this;
            c1505j16.f6698I = c1692xM4112f;
            for (C1511p c1511p3 : this.f6768B) {
                c1511p3.getClass();
                c1511p3.f8444C = c1505j16.f6701k;
                if (c1505j16.f6704n) {
                    c1511p3.f8448G = true;
                }
            }
        }
        this.f6767A = abstractC1972a;
        c2074n.m4639d(abstractC1972a, this, this.f6805o.m3824B(abstractC1972a.f8603c));
        this.f6807q.m1050l(new C1958r(abstractC1972a.f8602b), abstractC1972a.f8603c, this.f6798h, abstractC1972a.f8604d, abstractC1972a.f8605e, abstractC1972a.f8606f, abstractC1972a.f8607g, abstractC1972a.f8608h);
        return true;
    }

    @Override // p129o0.InterfaceC2069i
    /* JADX INFO: renamed from: k */
    public final C0778e mo3803k(InterfaceC2071k interfaceC2071k, long j3, long j4, IOException iOException, int i3) {
        boolean zMo4429j;
        C0778e c0778e;
        int i4;
        AbstractC1972a abstractC1972a = (AbstractC1972a) interfaceC2071k;
        boolean z3 = abstractC1972a instanceof C1505j;
        if (z3 && !((C1505j) abstractC1972a).f6700K && (iOException instanceof C0725v) && ((i4 = ((C0725v) iOException).f2773j) == 410 || i4 == 404)) {
            return C2074n.f9006d;
        }
        long j5 = abstractC1972a.f8609i.f2784h;
        Uri uri = abstractC1972a.f8609i.f2785i;
        C1958r c1958r = new C1958r(j4);
        AbstractC0632A.m1581V(abstractC1972a.f8607g);
        AbstractC0632A.m1581V(abstractC1972a.f8608h);
        C0334e c0334e = new C0334e(iOException, i3);
        C1504i c1504i = this.f6800j;
        C0058r c0058rM1506h = AbstractC0610a.m1506h(c1504i.f6686q);
        this.f6805o.getClass();
        C0778e c0778eM3817A = C1528a.m3817A(c0058rM1506h, c0334e);
        if (c0778eM3817A == null || c0778eM3817A.f3181a != 2) {
            zMo4429j = false;
        } else {
            InterfaceC2042s interfaceC2042s = c1504i.f6686q;
            zMo4429j = interfaceC2042s.mo4429j(interfaceC2042s.mo4438t(c1504i.f6677h.m1417a(abstractC1972a.f8604d)), c0778eM3817A.f3182b);
        }
        if (zMo4429j) {
            if (z3 && j5 == 0) {
                ArrayList arrayList = this.f6810t;
                AbstractC0646n.m1630h(((C1505j) arrayList.remove(arrayList.size() - 1)) == abstractC1972a);
                if (arrayList.isEmpty()) {
                    this.f6789W = this.f6788V;
                } else {
                    ((C1505j) AbstractC1723q.m4158g(arrayList)).f6699J = true;
                }
            }
            c0778e = C2074n.f9007e;
        } else {
            long jM3818C = C1528a.m3818C(c0334e);
            c0778e = jM3818C != -9223372036854775807L ? new C0778e(0, jM3818C, false) : C2074n.f9008f;
        }
        C0778e c0778e2 = c0778e;
        int i5 = c0778e2.f3181a;
        boolean z4 = i5 == 0 || i5 == 1;
        this.f6807q.m1049k(c1958r, abstractC1972a.f8603c, this.f6798h, abstractC1972a.f8604d, abstractC1972a.f8605e, abstractC1972a.f8606f, abstractC1972a.f8607g, abstractC1972a.f8608h, iOException, !z4);
        if (!z4) {
            this.f6767A = null;
        }
        if (zMo4429j) {
            if (!this.f6776J) {
                C0799J c0799j = new C0799J();
                c0799j.f3332a = this.f6788V;
                mo3767i(new C0800K(c0799j));
                return c0778e2;
            }
            this.f6799i.mo1973g(this);
        }
        return c0778e2;
    }

    @Override // p145s0.InterfaceC2242o
    /* JADX INFO: renamed from: l */
    public final void mo341l() {
        this.f6793a0 = true;
        this.f6814x.post(this.f6813w);
    }

    @Override // p129o0.InterfaceC2069i
    /* JADX INFO: renamed from: m */
    public final void mo3804m(InterfaceC2071k interfaceC2071k, long j3, long j4, boolean z3) {
        AbstractC1972a abstractC1972a = (AbstractC1972a) interfaceC2071k;
        this.f6767A = null;
        long j5 = abstractC1972a.f8601a;
        Uri uri = abstractC1972a.f8609i.f2785i;
        C1958r c1958r = new C1958r(j4);
        this.f6805o.getClass();
        this.f6807q.m1047h(c1958r, abstractC1972a.f8603c, this.f6798h, abstractC1972a.f8604d, abstractC1972a.f8605e, abstractC1972a.f8606f, abstractC1972a.f8607g, abstractC1972a.f8608h);
        if (z3) {
            return;
        }
        if (m3795C() || this.f6777K == 0) {
            m3799G();
        }
        if (this.f6777K > 0) {
            this.f6799i.mo1973g(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v15, types: [e0.p[]] */
    /* JADX WARN: Type inference failed for: r2v1, types: [e0.p[]] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [s0.E] */
    /* JADX WARN: Type inference failed for: r6v4, types: [e0.p, k0.Y] */
    /* JADX WARN: Type inference failed for: r6v5, types: [s0.l] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // p145s0.InterfaceC2242o
    /* JADX INFO: renamed from: p */
    public final InterfaceC2226E mo344p(int i3, int i4) {
        Integer numValueOf = Integer.valueOf(i4);
        Set set = f6766e0;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.f6770D;
        SparseIntArray sparseIntArray = this.f6771E;
        ?? c1511p = 0;
        c1511p = 0;
        if (zContains) {
            AbstractC0646n.m1625c(set.contains(Integer.valueOf(i4)));
            int i5 = sparseIntArray.get(i4, -1);
            if (i5 != -1) {
                if (hashSet.add(Integer.valueOf(i4))) {
                    this.f6769C[i5] = i3;
                }
                c1511p = this.f6769C[i5] == i3 ? this.f6768B[i5] : m3792w(i3, i4);
            }
        } else {
            int i6 = 0;
            while (true) {
                ?? r3 = this.f6768B;
                if (i6 >= r3.length) {
                    break;
                }
                if (this.f6769C[i6] == i3) {
                    c1511p = r3[i6];
                    break;
                }
                i6++;
            }
        }
        if (c1511p == 0) {
            if (this.f6793a0) {
                return m3792w(i3, i4);
            }
            int length = this.f6768B.length;
            boolean z3 = i4 == 1 || i4 == 2;
            c1511p = new C1511p(this.f6801k, this.f6803m, this.f6804n, this.f6816z);
            c1511p.f8468t = this.f6788V;
            if (z3) {
                c1511p.f6765I = this.f6795c0;
                c1511p.f8474z = true;
            }
            long j3 = this.f6794b0;
            if (c1511p.f8447F != j3) {
                c1511p.f8447F = j3;
                c1511p.f8474z = true;
            }
            C1505j c1505j = this.f6796d0;
            if (c1505j != null) {
                c1511p.f8444C = c1505j.f6701k;
            }
            c1511p.f8454f = this;
            int i7 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.f6769C, i7);
            this.f6769C = iArrCopyOf;
            iArrCopyOf[length] = i3;
            C1511p[] c1511pArr = this.f6768B;
            int i8 = AbstractC0632A.f2454a;
            ?? CopyOf = Arrays.copyOf(c1511pArr, c1511pArr.length + 1);
            CopyOf[c1511pArr.length] = c1511p;
            this.f6768B = (C1511p[]) CopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.f6787U, i7);
            this.f6787U = zArrCopyOf;
            zArrCopyOf[length] = z3;
            this.f6785S |= z3;
            hashSet.add(Integer.valueOf(i4));
            sparseIntArray.append(i4, length);
            if (m3791B(i4) > m3791B(this.f6773G)) {
                this.f6774H = length;
                this.f6773G = i4;
            }
            this.f6786T = Arrays.copyOf(this.f6786T, i7);
        }
        if (i4 != 5) {
            return c1511p;
        }
        if (this.f6772F == null) {
            this.f6772F = new C1510o(c1511p, this.f6808r);
        }
        return this.f6772F;
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: r */
    public final long mo3772r() {
        if (m3795C()) {
            return this.f6789W;
        }
        if (this.f6792Z) {
            return Long.MIN_VALUE;
        }
        return m3794A().f8608h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p129o0.InterfaceC2069i
    /* JADX INFO: renamed from: t */
    public final void mo3805t(InterfaceC2071k interfaceC2071k, long j3, long j4) {
        AbstractC1972a abstractC1972a = (AbstractC1972a) interfaceC2071k;
        this.f6767A = null;
        C1504i c1504i = this.f6800j;
        if (abstractC1972a instanceof C1500e) {
            C1500e c1500e = (C1500e) abstractC1972a;
            c1504i.f6682m = c1500e.f6658j;
            Uri uri = c1500e.f8602b.f2735a;
            byte[] bArr = c1500e.f6660l;
            bArr.getClass();
            C1447t c1447t = c1504i.f6679j;
            c1447t.getClass();
            uri.getClass();
        }
        long j5 = abstractC1972a.f8601a;
        Uri uri2 = abstractC1972a.f8609i.f2785i;
        C1958r c1958r = new C1958r(j4);
        this.f6805o.getClass();
        this.f6807q.m1048i(c1958r, abstractC1972a.f8603c, this.f6798h, abstractC1972a.f8604d, abstractC1972a.f8605e, abstractC1972a.f8606f, abstractC1972a.f8607g, abstractC1972a.f8608h);
        if (this.f6776J) {
            this.f6799i.mo1973g(this);
            return;
        }
        C0799J c0799j = new C0799J();
        c0799j.f3332a = this.f6788V;
        mo3767i(new C0800K(c0799j));
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: u */
    public final void mo3774u(long j3) {
        C2074n c2074n = this.f6806p;
        if (c2074n.f9011c == null && !m3795C()) {
            boolean zM4637b = c2074n.m4637b();
            C1504i c1504i = this.f6800j;
            List list = this.f6811u;
            if (zM4637b) {
                this.f6767A.getClass();
                if (c1504i.f6683n != null ? false : c1504i.f6686q.mo4437s(j3, this.f6767A, list)) {
                    c2074n.m4636a();
                    return;
                }
                return;
            }
            int size = list.size();
            while (size > 0 && c1504i.m3751b((C1505j) list.get(size - 1)) == 2) {
                size--;
            }
            if (size < list.size()) {
                m3808z(size);
            }
            int size2 = (c1504i.f6683n != null || c1504i.f6686q.length() < 2) ? list.size() : c1504i.f6686q.mo4434p(j3, list);
            if (size2 < this.f6810t.size()) {
                m3808z(size2);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m3806v() {
        AbstractC0646n.m1630h(this.f6776J);
        this.f6781O.getClass();
        this.f6782P.getClass();
    }

    /* JADX INFO: renamed from: x */
    public final C1945g0 m3807x(C0559W[] c0559wArr) {
        for (int i3 = 0; i3 < c0559wArr.length; i3++) {
            C0559W c0559w = c0559wArr[i3];
            C0583o[] c0583oArr = new C0583o[c0559w.f1992a];
            for (int i4 = 0; i4 < c0559w.f1992a; i4++) {
                C0583o c0583o = c0559w.f1995d[i4];
                int iMo993v = this.f6803m.mo993v(c0583o);
                C0582n c0582nM1447a = c0583o.m1447a();
                c0582nM1447a.f2101K = iMo993v;
                c0583oArr[i4] = new C0583o(c0582nM1447a);
            }
            c0559wArr[i3] = new C0559W(c0559w.f1993b, c0583oArr);
        }
        return new C1945g0(c0559wArr);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a5  */
    /* JADX INFO: renamed from: z */
    public final void m3808z(int i3) {
        ArrayList arrayList;
        AbstractC0646n.m1630h(!this.f6806p.m4637b());
        int i4 = i3;
        loop0: while (true) {
            arrayList = this.f6810t;
            if (i4 >= arrayList.size()) {
                i4 = -1;
                break;
            }
            int i5 = i4;
            while (true) {
                if (i5 >= arrayList.size()) {
                    C1505j c1505j = (C1505j) arrayList.get(i4);
                    int i6 = 0;
                    while (true) {
                        if (i6 >= this.f6768B.length) {
                            break loop0;
                        }
                        if (this.f6768B[i6].m4474q() > c1505j.m3756e(i6)) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                } else if (((C1505j) arrayList.get(i5)).f6704n) {
                    break;
                } else {
                    i5++;
                }
            }
            i4++;
        }
        if (i4 == -1) {
            return;
        }
        long j3 = m3794A().f8608h;
        C1505j c1505j2 = (C1505j) arrayList.get(i4);
        int size = arrayList.size();
        int i7 = AbstractC0632A.f2454a;
        if (i4 < 0 || size > arrayList.size() || i4 > size) {
            throw new IllegalArgumentException();
        }
        if (i4 != size) {
            arrayList.subList(i4, size).clear();
        }
        for (int i8 = 0; i8 < this.f6768B.length; i8++) {
            int iM3756e = c1505j2.m3756e(i8);
            C1511p c1511p = this.f6768B[i8];
            long jM4469k = c1511p.m4469k(iM3756e);
            C1927V c1927v = c1511p.f8449a;
            AbstractC0646n.m1625c(jM4469k <= c1927v.f8439g);
            c1927v.f8439g = jM4469k;
            int i9 = c1927v.f8434b;
            if (jM4469k != 0) {
                C0365b c0365b = c1927v.f8436d;
                if (jM4469k == c0365b.f1171c) {
                    c1927v.m4458a(c1927v.f8436d);
                    C0365b c0365b2 = new C0365b(i9, c1927v.f8439g);
                    c1927v.f8436d = c0365b2;
                    c1927v.f8437e = c0365b2;
                    c1927v.f8438f = c0365b2;
                } else {
                    while (c1927v.f8439g > c0365b.f1172d) {
                        c0365b = (C0365b) c0365b.f1174f;
                    }
                    C0365b c0365b3 = (C0365b) c0365b.f1174f;
                    c0365b3.getClass();
                    c1927v.m4458a(c0365b3);
                    C0365b c0365b4 = new C0365b(i9, c0365b.f1172d);
                    c0365b.f1174f = c0365b4;
                    if (c1927v.f8439g == c0365b.f1172d) {
                        c0365b = c0365b4;
                    }
                    c1927v.f8438f = c0365b;
                    if (c1927v.f8437e == c0365b3) {
                        c1927v.f8437e = c0365b4;
                    }
                }
            } else {
                c1927v.m4458a(c1927v.f8436d);
                C0365b c0365b5 = new C0365b(i9, c1927v.f8439g);
                c1927v.f8436d = c0365b5;
                c1927v.f8437e = c0365b5;
                c1927v.f8438f = c0365b5;
            }
        }
        if (arrayList.isEmpty()) {
            this.f6789W = this.f6788V;
        } else {
            ((C1505j) AbstractC1723q.m4158g(arrayList)).f6699J = true;
        }
        this.f6792Z = false;
        int i10 = this.f6773G;
        long j4 = c1505j2.f8607g;
        C0380q c0380q = this.f6807q;
        C1963w c1963w = new C1963w(1, i10, null, 3, null, AbstractC0632A.m1581V(j4), AbstractC0632A.m1581V(j3));
        C1907A c1907a = (C1907A) c0380q.f1292i;
        c1907a.getClass();
        c0380q.m1043c(new C1911E(c0380q, c1907a, c1963w, 0));
    }

    @Override // p145s0.InterfaceC2242o
    /* JADX INFO: renamed from: b */
    public final void mo333b(InterfaceC2252y interfaceC2252y) {
    }
}

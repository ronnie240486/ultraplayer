package p114k0;

import android.net.Uri;
import android.os.Handler;
import android.support.v4.media.session.C0858A;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p015F0.C0173b;
import p036M0.C0380q;
import p053S0.C0536b;
import p055T.AbstractC0545H;
import p055T.C0544G;
import p055T.C0546I;
import p055T.C0559W;
import p055T.C0582n;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0635c;
import p064W.RunnableC0647o;
import p070Y.C0712i;
import p070Y.C0722s;
import p070Y.InterfaceC0711h;
import p074Z0.C0778e;
import p077a0.C0800K;
import p077a0.C0832i0;
import p082b0.C1061b;
import p088d0.C1387k;
import p088d0.InterfaceC1384h;
import p088d0.InterfaceC1390n;
import p095f0.C1528a;
import p125n0.InterfaceC2042s;
import p129o0.C2065e;
import p129o0.C2073m;
import p129o0.C2074n;
import p129o0.HandlerC2070j;
import p129o0.InterfaceC2069i;
import p129o0.InterfaceC2071k;
import p129o0.InterfaceC2072l;
import p133p0.ExecutorC2087a;
import p145s0.C2239l;
import p145s0.C2244q;
import p145s0.C2251x;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2240m;
import p145s0.InterfaceC2242o;
import p145s0.InterfaceC2252y;

/* JADX INFO: renamed from: k0.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C1923Q implements InterfaceC1965y, InterfaceC2242o, InterfaceC2069i, InterfaceC2072l, InterfaceC1929X {

    /* JADX INFO: renamed from: V */
    public static final Map f8373V;

    /* JADX INFO: renamed from: W */
    public static final C0583o f8374W;

    /* JADX INFO: renamed from: A */
    public C1922P[] f8375A;

    /* JADX INFO: renamed from: B */
    public boolean f8376B;

    /* JADX INFO: renamed from: C */
    public boolean f8377C;

    /* JADX INFO: renamed from: D */
    public boolean f8378D;

    /* JADX INFO: renamed from: E */
    public boolean f8379E;

    /* JADX INFO: renamed from: F */
    public C0536b f8380F;

    /* JADX INFO: renamed from: G */
    public InterfaceC2252y f8381G;

    /* JADX INFO: renamed from: H */
    public long f8382H;

    /* JADX INFO: renamed from: I */
    public boolean f8383I;

    /* JADX INFO: renamed from: J */
    public int f8384J;

    /* JADX INFO: renamed from: K */
    public boolean f8385K;

    /* JADX INFO: renamed from: L */
    public boolean f8386L;

    /* JADX INFO: renamed from: M */
    public boolean f8387M;

    /* JADX INFO: renamed from: N */
    public int f8388N;

    /* JADX INFO: renamed from: O */
    public boolean f8389O;

    /* JADX INFO: renamed from: P */
    public long f8390P;

    /* JADX INFO: renamed from: Q */
    public long f8391Q;

    /* JADX INFO: renamed from: R */
    public boolean f8392R;

    /* JADX INFO: renamed from: S */
    public int f8393S;

    /* JADX INFO: renamed from: T */
    public boolean f8394T;

    /* JADX INFO: renamed from: U */
    public boolean f8395U;

    /* JADX INFO: renamed from: g */
    public final Uri f8396g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC0711h f8397h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC1390n f8398i;

    /* JADX INFO: renamed from: j */
    public final C1528a f8399j;

    /* JADX INFO: renamed from: k */
    public final C0380q f8400k;

    /* JADX INFO: renamed from: l */
    public final C1387k f8401l;

    /* JADX INFO: renamed from: m */
    public final C1926U f8402m;

    /* JADX INFO: renamed from: n */
    public final C2065e f8403n;

    /* JADX INFO: renamed from: o */
    public final long f8404o;

    /* JADX INFO: renamed from: p */
    public final boolean f8405p;

    /* JADX INFO: renamed from: q */
    public final long f8406q;

    /* JADX INFO: renamed from: r */
    public final C2074n f8407r;

    /* JADX INFO: renamed from: s */
    public final C0858A f8408s;

    /* JADX INFO: renamed from: t */
    public final C0635c f8409t;

    /* JADX INFO: renamed from: u */
    public final RunnableC1918L f8410u;

    /* JADX INFO: renamed from: v */
    public final RunnableC1918L f8411v;

    /* JADX INFO: renamed from: w */
    public final Handler f8412w;

    /* JADX INFO: renamed from: x */
    public InterfaceC1964x f8413x;

    /* JADX INFO: renamed from: y */
    public C0173b f8414y;

    /* JADX INFO: renamed from: z */
    public C1930Y[] f8415z;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f8373V = Collections.unmodifiableMap(map);
        C0582n c0582n = new C0582n();
        c0582n.f2102a = "icy";
        c0582n.f2114m = AbstractC0545H.m1364l("application/x-icy");
        f8374W = new C0583o(c0582n);
    }

    public C1923Q(Uri uri, InterfaceC0711h interfaceC0711h, C0858A c0858a, InterfaceC1390n interfaceC1390n, C1387k c1387k, C1528a c1528a, C0380q c0380q, C1926U c1926u, C2065e c2065e, int i3, boolean z3, long j3, ExecutorC2087a executorC2087a) {
        this.f8396g = uri;
        this.f8397h = interfaceC0711h;
        this.f8398i = interfaceC1390n;
        this.f8401l = c1387k;
        this.f8399j = c1528a;
        this.f8400k = c0380q;
        this.f8402m = c1926u;
        this.f8403n = c2065e;
        this.f8404o = i3;
        this.f8405p = z3;
        this.f8407r = executorC2087a != null ? new C2074n(executorC2087a) : new C2074n("ProgressiveMediaPeriod");
        this.f8408s = c0858a;
        this.f8406q = j3;
        this.f8409t = new C0635c();
        this.f8410u = new RunnableC1918L(this, 1);
        this.f8411v = new RunnableC1918L(this, 2);
        this.f8412w = AbstractC0632A.m1594m(null);
        this.f8375A = new C1922P[0];
        this.f8415z = new C1930Y[0];
        this.f8391Q = -9223372036854775807L;
        this.f8384J = 1;
    }

    /* JADX INFO: renamed from: A */
    public final void m4442A(int i3) {
        m4448v();
        C0536b c0536b = this.f8380F;
        boolean[] zArr = (boolean[]) c0536b.f1870j;
        if (zArr[i3]) {
            return;
        }
        C0583o c0583o = ((C1945g0) c0536b.f1867g).m4499a(i3).f1995d[0];
        int iM1359g = AbstractC0545H.m1359g(c0583o.f2154n);
        long j3 = this.f8390P;
        C0380q c0380q = this.f8400k;
        c0380q.m1043c(new C1061b(c0380q, 2, new C1963w(1, iM1359g, c0583o, 0, null, AbstractC0632A.m1581V(j3), -9223372036854775807L)));
        zArr[i3] = true;
    }

    /* JADX INFO: renamed from: B */
    public final void m4443B(int i3) {
        m4448v();
        boolean[] zArr = (boolean[]) this.f8380F.f1868h;
        if (this.f8392R && zArr[i3] && !this.f8415z[i3].m4478u(false)) {
            this.f8391Q = 0L;
            this.f8392R = false;
            this.f8386L = true;
            this.f8390P = 0L;
            this.f8393S = 0;
            for (C1930Y c1930y : this.f8415z) {
                c1930y.m4483z(false);
            }
            InterfaceC1964x interfaceC1964x = this.f8413x;
            interfaceC1964x.getClass();
            interfaceC1964x.mo1973g(this);
        }
    }

    /* JADX INFO: renamed from: C */
    public final InterfaceC2226E m4444C(C1922P c1922p) {
        int length = this.f8415z.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (c1922p.equals(this.f8375A[i3])) {
                return this.f8415z[i3];
            }
        }
        if (this.f8376B) {
            AbstractC0646n.m1647y("ProgressiveMediaPeriod", "Extractor added new track (id=" + c1922p.f8371a + ") after finishing tracks.");
            return new C2239l();
        }
        InterfaceC1390n interfaceC1390n = this.f8398i;
        interfaceC1390n.getClass();
        C1930Y c1930y = new C1930Y(this.f8403n, interfaceC1390n, this.f8401l);
        c1930y.f8454f = this;
        int i4 = length + 1;
        C1922P[] c1922pArr = (C1922P[]) Arrays.copyOf(this.f8375A, i4);
        c1922pArr[length] = c1922p;
        int i5 = AbstractC0632A.f2454a;
        this.f8375A = c1922pArr;
        C1930Y[] c1930yArr = (C1930Y[]) Arrays.copyOf(this.f8415z, i4);
        c1930yArr[length] = c1930y;
        this.f8415z = c1930yArr;
        return c1930y;
    }

    /* JADX INFO: renamed from: D */
    public final void m4445D(InterfaceC2252y interfaceC2252y) {
        this.f8381G = this.f8414y == null ? interfaceC2252y : new C2244q(-9223372036854775807L);
        this.f8382H = interfaceC2252y.mo945l();
        boolean z3 = !this.f8389O && interfaceC2252y.mo945l() == -9223372036854775807L;
        this.f8383I = z3;
        this.f8384J = z3 ? 7 : 1;
        if (this.f8377C) {
            this.f8402m.m4454t(this.f8382H, interfaceC2252y.mo941b(), this.f8383I);
        } else {
            m4452z();
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m4446E() {
        C1920N c1920n = new C1920N(this, this.f8396g, this.f8397h, this.f8408s, this, this.f8409t);
        if (this.f8377C) {
            AbstractC0646n.m1630h(m4451y());
            long j3 = this.f8382H;
            if (j3 != -9223372036854775807L && this.f8391Q > j3) {
                this.f8394T = true;
                this.f8391Q = -9223372036854775807L;
                return;
            }
            InterfaceC2252y interfaceC2252y = this.f8381G;
            interfaceC2252y.getClass();
            long j4 = interfaceC2252y.mo355i(this.f8391Q).f9683a.f9687b;
            long j5 = this.f8391Q;
            c1920n.f8361f.f2181a = j4;
            c1920n.f8364i = j5;
            c1920n.f8363h = true;
            c1920n.f8367l = false;
            for (C1930Y c1930y : this.f8415z) {
                c1930y.f8468t = this.f8391Q;
            }
            this.f8391Q = -9223372036854775807L;
        }
        this.f8393S = m4449w();
        this.f8407r.m4639d(c1920n, this, this.f8399j.m3824B(this.f8384J));
        this.f8400k.m1050l(new C1958r(c1920n.f8365j), 1, -1, null, 0, null, c1920n.f8364i, this.f8382H);
    }

    /* JADX INFO: renamed from: F */
    public final boolean m4447F() {
        return this.f8386L || m4451y();
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: a */
    public final boolean mo3759a() {
        boolean z3;
        if (!this.f8407r.m4637b()) {
            return false;
        }
        C0635c c0635c = this.f8409t;
        synchronized (c0635c) {
            z3 = c0635c.f2475a;
        }
        return z3;
    }

    @Override // p145s0.InterfaceC2242o
    /* JADX INFO: renamed from: b */
    public final void mo333b(InterfaceC2252y interfaceC2252y) {
        this.f8412w.post(new RunnableC0647o(this, 13, interfaceC2252y));
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: c */
    public final long mo3761c(long j3, C0832i0 c0832i0) {
        m4448v();
        if (!this.f8381G.mo941b()) {
            return 0L;
        }
        C2251x c2251xMo355i = this.f8381G.mo355i(j3);
        return c0832i0.m2102a(j3, c2251xMo355i.f9683a.f9686a, c2251xMo355i.f9684b.f9686a);
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: d */
    public final C1945g0 mo3762d() {
        m4448v();
        return (C1945g0) this.f8380F.f1867g;
    }

    @Override // p129o0.InterfaceC2072l
    /* JADX INFO: renamed from: e */
    public final void mo3801e() {
        for (C1930Y c1930y : this.f8415z) {
            c1930y.m4483z(true);
            InterfaceC1384h interfaceC1384h = c1930y.f8456h;
            if (interfaceC1384h != null) {
                interfaceC1384h.mo3463d(c1930y.f8453e);
                c1930y.f8456h = null;
                c1930y.f8455g = null;
            }
        }
        C0858A c0858a = this.f8408s;
        InterfaceC2240m interfaceC2240m = (InterfaceC2240m) c0858a.f3640i;
        if (interfaceC2240m != null) {
            interfaceC2240m.mo325a();
            c0858a.f3640i = null;
        }
        c0858a.f3641j = null;
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: f */
    public final long mo3764f(InterfaceC2042s[] interfaceC2042sArr, boolean[] zArr, InterfaceC1931Z[] interfaceC1931ZArr, boolean[] zArr2, long j3) {
        InterfaceC2042s interfaceC2042s;
        m4448v();
        C0536b c0536b = this.f8380F;
        C1945g0 c1945g0 = (C1945g0) c0536b.f1867g;
        boolean[] zArr3 = (boolean[]) c0536b.f1869i;
        int i3 = this.f8388N;
        int i4 = 0;
        for (int i5 = 0; i5 < interfaceC2042sArr.length; i5++) {
            InterfaceC1931Z interfaceC1931Z = interfaceC1931ZArr[i5];
            if (interfaceC1931Z != null && (interfaceC2042sArr[i5] == null || !zArr[i5])) {
                int i6 = ((C1921O) interfaceC1931Z).f8369g;
                AbstractC0646n.m1630h(zArr3[i6]);
                this.f8388N--;
                zArr3[i6] = false;
                interfaceC1931ZArr[i5] = null;
            }
        }
        boolean z3 = !this.f8385K ? j3 == 0 || this.f8379E : i3 != 0;
        for (int i7 = 0; i7 < interfaceC2042sArr.length; i7++) {
            if (interfaceC1931ZArr[i7] == null && (interfaceC2042s = interfaceC2042sArr[i7]) != null) {
                AbstractC0646n.m1630h(interfaceC2042s.length() == 1);
                AbstractC0646n.m1630h(interfaceC2042s.mo4432m(0) == 0);
                int iIndexOf = c1945g0.f8527b.indexOf(interfaceC2042s.mo4424b());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                AbstractC0646n.m1630h(!zArr3[iIndexOf]);
                this.f8388N++;
                zArr3[iIndexOf] = true;
                this.f8387M = interfaceC2042s.mo4426e().f2160t | this.f8387M;
                interfaceC1931ZArr[i7] = new C1921O(this, iIndexOf);
                zArr2[i7] = true;
                if (!z3) {
                    C1930Y c1930y = this.f8415z[iIndexOf];
                    z3 = (c1930y.m4474q() == 0 || c1930y.m4463C(j3, true)) ? false : true;
                }
            }
        }
        if (this.f8388N == 0) {
            this.f8392R = false;
            this.f8386L = false;
            this.f8387M = false;
            C2074n c2074n = this.f8407r;
            if (c2074n.m4637b()) {
                C1930Y[] c1930yArr = this.f8415z;
                int length = c1930yArr.length;
                while (i4 < length) {
                    c1930yArr[i4].m4468j();
                    i4++;
                }
                c2074n.m4636a();
            } else {
                this.f8394T = false;
                for (C1930Y c1930y2 : this.f8415z) {
                    c1930y2.m4483z(false);
                }
            }
        } else if (z3) {
            j3 = mo3769n(j3);
            while (i4 < interfaceC1931ZArr.length) {
                if (interfaceC1931ZArr[i4] != null) {
                    zArr2[i4] = true;
                }
                i4++;
            }
        }
        this.f8385K = true;
        return j3;
    }

    @Override // p114k0.InterfaceC1929X
    /* JADX INFO: renamed from: g */
    public final void mo3802g() {
        this.f8412w.post(this.f8410u);
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: h */
    public final long mo3766h() {
        long jM4450x;
        boolean z3;
        m4448v();
        if (this.f8394T || this.f8388N == 0) {
            return Long.MIN_VALUE;
        }
        if (m4451y()) {
            return this.f8391Q;
        }
        if (this.f8378D) {
            int length = this.f8415z.length;
            jM4450x = Long.MAX_VALUE;
            for (int i3 = 0; i3 < length; i3++) {
                C0536b c0536b = this.f8380F;
                if (((boolean[]) c0536b.f1868h)[i3] && ((boolean[]) c0536b.f1869i)[i3]) {
                    C1930Y c1930y = this.f8415z[i3];
                    synchronized (c1930y) {
                        z3 = c1930y.f8471w;
                    }
                    if (!z3) {
                        jM4450x = Math.min(jM4450x, this.f8415z[i3].m4471n());
                    }
                }
            }
        } else {
            jM4450x = Long.MAX_VALUE;
        }
        if (jM4450x == Long.MAX_VALUE) {
            jM4450x = m4450x(false);
        }
        return jM4450x == Long.MIN_VALUE ? this.f8390P : jM4450x;
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: i */
    public final boolean mo3767i(C0800K c0800k) {
        if (this.f8394T) {
            return false;
        }
        C2074n c2074n = this.f8407r;
        if (c2074n.f9011c != null || this.f8392R) {
            return false;
        }
        if (this.f8377C && this.f8388N == 0) {
            return false;
        }
        boolean zM1613c = this.f8409t.m1613c();
        if (c2074n.m4637b()) {
            return zM1613c;
        }
        m4446E();
        return true;
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: j */
    public final void mo3768j() throws IOException {
        try {
            int iM3824B = this.f8399j.m3824B(this.f8384J);
            C2074n c2074n = this.f8407r;
            IOException iOException = c2074n.f9011c;
            if (iOException != null) {
                throw iOException;
            }
            HandlerC2070j handlerC2070j = c2074n.f9010b;
            if (handlerC2070j != null) {
                if (iM3824B == Integer.MIN_VALUE) {
                    iM3824B = handlerC2070j.f8996g;
                }
                IOException iOException2 = handlerC2070j.f9000k;
                if (iOException2 != null && handlerC2070j.f9001l > iM3824B) {
                    throw iOException2;
                }
            }
            if (this.f8394T && !this.f8377C) {
                throw C0546I.m1365a(null, "Loading finished before preparation is complete.");
            }
        } catch (IOException e3) {
            if (!this.f8405p) {
                throw e3;
            }
            AbstractC0646n.m1636n("ProgressiveMediaPeriod", "Suppressing preparation error because suppressPrepareError=true", e3);
            this.f8376B = true;
            m4445D(new C2244q(-9223372036854775807L));
        }
    }

    @Override // p129o0.InterfaceC2069i
    /* JADX INFO: renamed from: k */
    public final C0778e mo3803k(InterfaceC2071k interfaceC2071k, long j3, long j4, IOException iOException, int i3) {
        long jMin;
        C0778e c0778e;
        InterfaceC2252y interfaceC2252y;
        C1920N c1920n = (C1920N) interfaceC2071k;
        Uri uri = c1920n.f8357b.f2785i;
        C1958r c1958r = new C1958r(j4);
        int i4 = AbstractC0632A.f2454a;
        this.f8399j.getClass();
        if ((iOException instanceof C0546I) || (iOException instanceof FileNotFoundException) || (iOException instanceof C0722s) || (iOException instanceof C2073m)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i5 = C0712i.f2720h;
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i3 - 1) * 1000, 5000);
                break;
            }
            if ((cause instanceof C0712i) && ((C0712i) cause).f2721g == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == -9223372036854775807L) {
            c0778e = C2074n.f9008f;
        } else {
            int iM4449w = m4449w();
            int i6 = iM4449w > this.f8393S ? 1 : 0;
            if (this.f8389O || !((interfaceC2252y = this.f8381G) == null || interfaceC2252y.mo945l() == -9223372036854775807L)) {
                this.f8393S = iM4449w;
            } else if (!this.f8377C || m4447F()) {
                this.f8386L = this.f8377C;
                this.f8390P = 0L;
                this.f8393S = 0;
                for (C1930Y c1930y : this.f8415z) {
                    c1930y.m4483z(false);
                }
                c1920n.f8361f.f2181a = 0L;
                c1920n.f8364i = 0L;
                c1920n.f8363h = true;
                c1920n.f8367l = false;
            } else {
                this.f8392R = true;
                c0778e = C2074n.f9007e;
            }
            c0778e = new C0778e(i6, jMin, false);
        }
        C0778e c0778e2 = c0778e;
        int i7 = c0778e2.f3181a;
        this.f8400k.m1049k(c1958r, 1, -1, null, 0, null, c1920n.f8364i, this.f8382H, iOException, !(i7 == 0 || i7 == 1));
        return c0778e2;
    }

    @Override // p145s0.InterfaceC2242o
    /* JADX INFO: renamed from: l */
    public final void mo341l() {
        this.f8376B = true;
        this.f8412w.post(this.f8410u);
    }

    @Override // p129o0.InterfaceC2069i
    /* JADX INFO: renamed from: m */
    public final void mo3804m(InterfaceC2071k interfaceC2071k, long j3, long j4, boolean z3) {
        C1920N c1920n = (C1920N) interfaceC2071k;
        Uri uri = c1920n.f8357b.f2785i;
        C1958r c1958r = new C1958r(j4);
        this.f8399j.getClass();
        this.f8400k.m1047h(c1958r, 1, -1, null, 0, null, c1920n.f8364i, this.f8382H);
        if (z3) {
            return;
        }
        for (C1930Y c1930y : this.f8415z) {
            c1930y.m4483z(false);
        }
        if (this.f8388N > 0) {
            InterfaceC1964x interfaceC1964x = this.f8413x;
            interfaceC1964x.getClass();
            interfaceC1964x.mo1973g(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084 A[LOOP:1: B:42:0x0082->B:43:0x0084, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099 A[LOOP:2: B:47:0x0097->B:48:0x0099, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x007f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x0090, please report this as an issue */
    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: n */
    public final long mo3769n(long j3) {
        int i3;
        m4448v();
        boolean[] zArr = (boolean[]) this.f8380F.f1868h;
        if (!this.f8381G.mo941b()) {
            j3 = 0;
        }
        this.f8386L = false;
        boolean z3 = true;
        boolean z4 = this.f8390P == j3;
        this.f8390P = j3;
        if (m4451y()) {
            this.f8391Q = j3;
            return j3;
        }
        int i4 = this.f8384J;
        C2074n c2074n = this.f8407r;
        if (i4 == 7 || !(this.f8394T || c2074n.m4637b())) {
            this.f8392R = false;
            this.f8391Q = j3;
            this.f8394T = false;
            this.f8387M = false;
            if (c2074n.m4637b()) {
                for (C1930Y c1930y : this.f8415z) {
                    c1930y.m4468j();
                }
                c2074n.m4636a();
                return j3;
            }
            c2074n.f9011c = null;
            for (C1930Y c1930y2 : this.f8415z) {
                c1930y2.m4483z(false);
            }
        } else {
            int length = this.f8415z.length;
            for (int i5 = 0; i5 < length; i5++) {
                C1930Y c1930y3 = this.f8415z[i5];
                if (c1930y3.m4474q() != 0 || !z4) {
                    if (!(this.f8379E ? c1930y3.m4462B(c1930y3.f8465q) : c1930y3.m4463C(j3, false)) && (zArr[i5] || !this.f8378D)) {
                        z3 = false;
                        break;
                    }
                }
            }
            if (!z3) {
                this.f8392R = false;
                this.f8391Q = j3;
                this.f8394T = false;
                this.f8387M = false;
                if (c2074n.m4637b()) {
                    while (i < r2) {
                        c1930y.m4468j();
                    }
                    c2074n.m4636a();
                    return j3;
                }
                c2074n.f9011c = null;
                while (i3 < r2) {
                    c1930y2.m4483z(false);
                }
            }
        }
        return j3;
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: o */
    public final void mo3770o(long j3) throws Throwable {
        if (this.f8379E) {
            return;
        }
        m4448v();
        if (m4451y()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.f8380F.f1869i;
        int length = this.f8415z.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f8415z[i3].m4467i(j3, zArr[i3]);
        }
    }

    @Override // p145s0.InterfaceC2242o
    /* JADX INFO: renamed from: p */
    public final InterfaceC2226E mo344p(int i3, int i4) {
        return m4444C(new C1922P(i3, false));
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: q */
    public final void mo3771q(InterfaceC1964x interfaceC1964x, long j3) {
        this.f8413x = interfaceC1964x;
        this.f8409t.m1613c();
        m4446E();
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: r */
    public final long mo3772r() {
        return mo3766h();
    }

    @Override // p114k0.InterfaceC1965y
    /* JADX INFO: renamed from: s */
    public final long mo3773s() {
        if (this.f8387M) {
            this.f8387M = false;
            return this.f8390P;
        }
        if (!this.f8386L) {
            return -9223372036854775807L;
        }
        if (!this.f8394T && m4449w() <= this.f8393S) {
            return -9223372036854775807L;
        }
        this.f8386L = false;
        return this.f8390P;
    }

    @Override // p129o0.InterfaceC2069i
    /* JADX INFO: renamed from: t */
    public final void mo3805t(InterfaceC2071k interfaceC2071k, long j3, long j4) {
        InterfaceC2252y interfaceC2252y;
        C1920N c1920n = (C1920N) interfaceC2071k;
        if (this.f8382H == -9223372036854775807L && (interfaceC2252y = this.f8381G) != null) {
            boolean zMo941b = interfaceC2252y.mo941b();
            long jM4450x = m4450x(true);
            long j5 = jM4450x == Long.MIN_VALUE ? 0L : jM4450x + 10000;
            this.f8382H = j5;
            this.f8402m.m4454t(j5, zMo941b, this.f8383I);
        }
        Uri uri = c1920n.f8357b.f2785i;
        C1958r c1958r = new C1958r(j4);
        this.f8399j.getClass();
        this.f8400k.m1048i(c1958r, 1, -1, null, 0, null, c1920n.f8364i, this.f8382H);
        this.f8394T = true;
        InterfaceC1964x interfaceC1964x = this.f8413x;
        interfaceC1964x.getClass();
        interfaceC1964x.mo1973g(this);
    }

    /* JADX INFO: renamed from: v */
    public final void m4448v() {
        AbstractC0646n.m1630h(this.f8377C);
        this.f8380F.getClass();
        this.f8381G.getClass();
    }

    /* JADX INFO: renamed from: w */
    public final int m4449w() {
        int i3 = 0;
        for (C1930Y c1930y : this.f8415z) {
            i3 += c1930y.f8465q + c1930y.f8464p;
        }
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX INFO: renamed from: x */
    public final long m4450x(boolean z3) {
        long jMax = Long.MIN_VALUE;
        for (int i3 = 0; i3 < this.f8415z.length; i3++) {
            if (z3) {
                jMax = Math.max(jMax, this.f8415z[i3].m4471n());
            } else {
                C0536b c0536b = this.f8380F;
                c0536b.getClass();
                if (((boolean[]) c0536b.f1869i)[i3]) {
                    jMax = Math.max(jMax, this.f8415z[i3].m4471n());
                }
            }
        }
        return jMax;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m4451y() {
        return this.f8391Q != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: z */
    public final void m4452z() {
        long j3;
        int i3;
        if (this.f8395U || this.f8377C || !this.f8376B || this.f8381G == null) {
            return;
        }
        for (C1930Y c1930y : this.f8415z) {
            if (c1930y.m4477t() == null) {
                return;
            }
        }
        C0635c c0635c = this.f8409t;
        synchronized (c0635c) {
            c0635c.f2475a = false;
        }
        int length = this.f8415z.length;
        C0559W[] c0559wArr = new C0559W[length];
        boolean[] zArr = new boolean[length];
        int i4 = 0;
        while (true) {
            j3 = this.f8406q;
            if (i4 >= length) {
                break;
            }
            C0583o c0583oM4477t = this.f8415z[i4].m4477t();
            c0583oM4477t.getClass();
            String str = c0583oM4477t.f2154n;
            boolean zM1360h = AbstractC0545H.m1360h(str);
            boolean z3 = zM1360h || AbstractC0545H.m1363k(str);
            zArr[i4] = z3;
            this.f8378D = z3 | this.f8378D;
            this.f8379E = j3 != -9223372036854775807L && length == 1 && AbstractC0545H.m1361i(str);
            C0173b c0173b = this.f8414y;
            if (c0173b != null) {
                if (zM1360h || this.f8375A[i4].f8372b) {
                    C0544G c0544g = c0583oM4477t.f2152l;
                    C0544G c0544g2 = c0544g == null ? new C0544G(c0173b) : c0544g.m1351d(c0173b);
                    C0582n c0582nM1447a = c0583oM4477t.m1447a();
                    c0582nM1447a.f2112k = c0544g2;
                    c0583oM4477t = new C0583o(c0582nM1447a);
                }
                if (zM1360h && c0583oM4477t.f2148h == -1 && c0583oM4477t.f2149i == -1 && (i3 = c0173b.f399g) != -1) {
                    C0582n c0582nM1447a2 = c0583oM4477t.m1447a();
                    c0582nM1447a2.f2109h = i3;
                    c0583oM4477t = new C0583o(c0582nM1447a2);
                }
            }
            int iMo993v = this.f8398i.mo993v(c0583oM4477t);
            C0582n c0582nM1447a3 = c0583oM4477t.m1447a();
            c0582nM1447a3.f2101K = iMo993v;
            C0583o c0583o = new C0583o(c0582nM1447a3);
            c0559wArr[i4] = new C0559W(Integer.toString(i4), c0583o);
            this.f8387M = c0583o.f2160t | this.f8387M;
            i4++;
        }
        C1945g0 c1945g0 = new C1945g0(c0559wArr);
        C0536b c0536b = new C0536b();
        c0536b.f1867g = c1945g0;
        c0536b.f1868h = zArr;
        int i5 = c1945g0.f8526a;
        c0536b.f1869i = new boolean[i5];
        c0536b.f1870j = new boolean[i5];
        this.f8380F = c0536b;
        if (this.f8379E && this.f8382H == -9223372036854775807L) {
            this.f8382H = j3;
            this.f8381G = new C1919M(this, this.f8381G);
        }
        this.f8402m.m4454t(this.f8382H, this.f8381G.mo941b(), this.f8383I);
        this.f8377C = true;
        InterfaceC1964x interfaceC1964x = this.f8413x;
        interfaceC1964x.getClass();
        interfaceC1964x.mo1969e(this);
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: u */
    public final void mo3774u(long j3) {
    }
}

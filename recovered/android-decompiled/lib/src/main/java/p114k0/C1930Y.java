package p114k0;

import android.util.SparseArray;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Objects;
import p000A.C0058r;
import p009D0.C0106b;
import p036M0.C0365b;
import p036M0.C0380q;
import p055T.AbstractC0545H;
import p055T.C0579k;
import p055T.C0582n;
import p055T.C0583o;
import p055T.InterfaceC0575g;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p073Z.C0771f;
import p082b0.C1063d;
import p088d0.C1387k;
import p088d0.InterfaceC1384h;
import p088d0.InterfaceC1389m;
import p088d0.InterfaceC1390n;
import p099g0.C1577g;
import p129o0.C2061a;
import p129o0.C2065e;
import p145s0.C2225D;
import p145s0.InterfaceC2226E;

/* JADX INFO: renamed from: k0.Y */
/* JADX INFO: loaded from: classes.dex */
public class C1930Y implements InterfaceC2226E {

    /* JADX INFO: renamed from: A */
    public C0583o f8442A;

    /* JADX INFO: renamed from: B */
    public C0583o f8443B;

    /* JADX INFO: renamed from: C */
    public long f8444C;

    /* JADX INFO: renamed from: E */
    public boolean f8446E;

    /* JADX INFO: renamed from: F */
    public long f8447F;

    /* JADX INFO: renamed from: G */
    public boolean f8448G;

    /* JADX INFO: renamed from: a */
    public final C1927V f8449a;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1390n f8452d;

    /* JADX INFO: renamed from: e */
    public final C1387k f8453e;

    /* JADX INFO: renamed from: f */
    public Object f8454f;

    /* JADX INFO: renamed from: g */
    public C0583o f8455g;

    /* JADX INFO: renamed from: h */
    public InterfaceC1384h f8456h;

    /* JADX INFO: renamed from: p */
    public int f8464p;

    /* JADX INFO: renamed from: q */
    public int f8465q;

    /* JADX INFO: renamed from: r */
    public int f8466r;

    /* JADX INFO: renamed from: s */
    public int f8467s;

    /* JADX INFO: renamed from: w */
    public boolean f8471w;

    /* JADX INFO: renamed from: z */
    public boolean f8474z;

    /* JADX INFO: renamed from: b */
    public final C1577g f8450b = new C1577g();

    /* JADX INFO: renamed from: i */
    public int f8457i = 1000;

    /* JADX INFO: renamed from: j */
    public long[] f8458j = new long[1000];

    /* JADX INFO: renamed from: k */
    public long[] f8459k = new long[1000];

    /* JADX INFO: renamed from: n */
    public long[] f8462n = new long[1000];

    /* JADX INFO: renamed from: m */
    public int[] f8461m = new int[1000];

    /* JADX INFO: renamed from: l */
    public int[] f8460l = new int[1000];

    /* JADX INFO: renamed from: o */
    public C2225D[] f8463o = new C2225D[1000];

    /* JADX INFO: renamed from: c */
    public final C0380q f8451c = new C0380q(new C1063d(15));

    /* JADX INFO: renamed from: t */
    public long f8468t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u */
    public long f8469u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v */
    public long f8470v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y */
    public boolean f8473y = true;

    /* JADX INFO: renamed from: x */
    public boolean f8472x = true;

    /* JADX INFO: renamed from: D */
    public boolean f8445D = true;

    public C1930Y(C2065e c2065e, InterfaceC1390n interfaceC1390n, C1387k c1387k) {
        this.f8452d = interfaceC1390n;
        this.f8453e = c1387k;
        this.f8449a = new C1927V(c2065e);
    }

    /* JADX INFO: renamed from: A */
    public final synchronized void m4461A() {
        this.f8467s = 0;
        C1927V c1927v = this.f8449a;
        c1927v.f8437e = c1927v.f8436d;
    }

    /* JADX INFO: renamed from: B */
    public final synchronized boolean m4462B(int i3) {
        m4461A();
        int i4 = this.f8465q;
        if (i3 >= i4 && i3 <= this.f8464p + i4) {
            this.f8468t = Long.MIN_VALUE;
            this.f8467s = i3 - i4;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    public final synchronized boolean m4463C(long j3, boolean z3) throws Throwable {
        Throwable th;
        C1930Y c1930y;
        long j4;
        int iM4470l;
        try {
            try {
                m4461A();
                int iM4475r = m4475r(this.f8467s);
                int i3 = this.f8467s;
                int i4 = this.f8464p;
                if (!(i3 != i4) || j3 < this.f8462n[iM4475r] || (j3 > this.f8470v && !z3)) {
                    return false;
                }
                if (this.f8445D) {
                    int i5 = i4 - i3;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            if (!z3) {
                                i5 = -1;
                                break;
                            }
                            break;
                        }
                        try {
                            if (this.f8462n[iM4475r] >= j3) {
                                i5 = i6;
                                break;
                            }
                            iM4475r++;
                            if (iM4475r == this.f8457i) {
                                iM4475r = 0;
                            }
                            i6++;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    j4 = j3;
                    iM4470l = i5;
                    c1930y = this;
                } else {
                    int i7 = i4 - i3;
                    c1930y = this;
                    j4 = j3;
                    iM4470l = c1930y.m4470l(iM4475r, i7, j4, true);
                }
                if (iM4470l == -1) {
                    return false;
                }
                c1930y.f8468t = j4;
                c1930y.f8467s += iM4470l;
                return true;
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    /* JADX INFO: renamed from: D */
    public final synchronized void m4464D(int i3) {
        boolean z3;
        if (i3 >= 0) {
            try {
                if (this.f8467s + i3 <= this.f8464p) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z3 = false;
        }
        AbstractC0646n.m1625c(z3);
        this.f8467s += i3;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    @Override // p145s0.InterfaceC2226E
    /* JADX INFO: renamed from: a */
    public void mo1172a(long j3, int i3, int i4, int i5, C2225D c2225d) {
        int i6;
        if (this.f8474z) {
            C0583o c0583o = this.f8442A;
            AbstractC0646n.m1631i(c0583o);
            mo1176e(c0583o);
        }
        int i7 = i3 & 1;
        boolean z3 = true;
        boolean z4 = i7 != 0;
        if (this.f8472x) {
            if (!z4) {
                return;
            } else {
                this.f8472x = false;
            }
        }
        long j4 = this.f8447F + j3;
        if (!this.f8445D) {
            i6 = i3;
        } else {
            if (j4 < this.f8468t) {
                return;
            }
            if (i7 == 0) {
                if (!this.f8446E) {
                    AbstractC0646n.m1647y("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.f8443B);
                    this.f8446E = true;
                }
                i6 = i3 | 1;
            } else {
                i6 = i3;
            }
        }
        if (this.f8448G) {
            if (!z4) {
                return;
            }
            synchronized (this) {
                if (this.f8464p == 0) {
                    z3 = j4 > this.f8469u;
                } else if (m4472o() >= j4) {
                    z3 = false;
                } else {
                    int i8 = this.f8464p;
                    int iM4475r = m4475r(i8 - 1);
                    while (i8 > this.f8467s && this.f8462n[iM4475r] >= j4) {
                        i8--;
                        iM4475r--;
                        if (iM4475r == -1) {
                            iM4475r = this.f8457i - 1;
                        }
                    }
                    m4469k(this.f8465q + i8);
                }
            }
            if (!z3) {
                return;
            } else {
                this.f8448G = false;
            }
        }
        m4465g(j4, i6, (this.f8449a.f8439g - ((long) i4)) - ((long) i5), i4, c2225d);
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
        while (true) {
            C1927V c1927v = this.f8449a;
            if (i3 <= 0) {
                c1927v.getClass();
                return;
            }
            int iM4460c = c1927v.m4460c(i3);
            C0365b c0365b = c1927v.f8438f;
            C2061a c2061a = (C2061a) c0365b.f1173e;
            c0651s.m1671e(c2061a.f8955a, ((int) (c1927v.f8439g - c0365b.f1171c)) + c2061a.f8956b, iM4460c);
            i3 -= iM4460c;
            long j3 = c1927v.f8439g + ((long) iM4460c);
            c1927v.f8439g = j3;
            C0365b c0365b2 = c1927v.f8438f;
            if (j3 == c0365b2.f1172d) {
                c1927v.f8438f = (C0365b) c0365b2.f1174f;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005e A[Catch: all -> 0x005b, TryCatch #0 {all -> 0x005b, blocks: (B:4:0x000b, B:8:0x001b, B:13:0x002c, B:15:0x0045, B:19:0x0060, B:81:0x0116, B:73:0x0103, B:76:0x010b, B:18:0x005e), top: B:90:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:21:0x006c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0115  */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, k0.X] */
    @Override // p145s0.InterfaceC2226E
    /* JADX INFO: renamed from: e */
    public final void mo1176e(C0583o c0583o) {
        boolean z3;
        C0058r c0058rM1357e;
        int iM319a;
        boolean z4 = true;
        C0583o c0583oMo3790m = mo3790m(c0583o);
        this.f8474z = false;
        this.f8442A = c0583o;
        synchronized (this) {
            try {
                this.f8473y = false;
                C0583o c0583o2 = this.f8443B;
                int i3 = AbstractC0632A.f2454a;
                if (Objects.equals(c0583oMo3790m, c0583o2)) {
                    z4 = false;
                } else {
                    if (((SparseArray) this.f8451c.f1292i).size() == 0) {
                        this.f8443B = c0583oMo3790m;
                    } else {
                        SparseArray sparseArray = (SparseArray) this.f8451c.f1292i;
                        if (((C1928W) sparseArray.valueAt(sparseArray.size() - 1)).f8440a.equals(c0583oMo3790m)) {
                            SparseArray sparseArray2 = (SparseArray) this.f8451c.f1292i;
                            this.f8443B = ((C1928W) sparseArray2.valueAt(sparseArray2.size() - 1)).f8440a;
                        } else {
                            this.f8443B = c0583oMo3790m;
                        }
                    }
                    boolean z5 = this.f8445D;
                    C0583o c0583o3 = this.f8443B;
                    String str = c0583o3.f2154n;
                    String str2 = c0583o3.f2151k;
                    ArrayList arrayList = AbstractC0545H.f1942a;
                    if (str != null) {
                        switch (str) {
                            case "audio/eac3-joc":
                            case "audio/mpeg-L1":
                            case "audio/mpeg-L2":
                            case "audio/ac3":
                            case "audio/raw":
                            case "audio/eac3":
                            case "audio/flac":
                            case "audio/mpeg":
                            case "audio/g711-alaw":
                            case "audio/g711-mlaw":
                                z3 = true;
                                break;
                            case "audio/mp4a-latm":
                                if (str2 != null && (c0058rM1357e = AbstractC0545H.m1357e(str2)) != null && (iM319a = c0058rM1357e.m319a()) != 0 && iM319a != 16) {
                                    z3 = true;
                                    break;
                                } else {
                                    z3 = false;
                                    break;
                                }
                                break;
                            default:
                                z3 = false;
                                break;
                        }
                    } else {
                        z3 = false;
                    }
                    this.f8445D = z5 & z3;
                    this.f8446E = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ?? r7 = this.f8454f;
        if (r7 == 0 || !z4) {
            return;
        }
        r7.mo3802g();
    }

    @Override // p145s0.InterfaceC2226E
    /* JADX INFO: renamed from: f */
    public final int mo1177f(InterfaceC0575g interfaceC0575g, int i3, boolean z3) throws EOFException {
        C1927V c1927v = this.f8449a;
        int iM4460c = c1927v.m4460c(i3);
        C0365b c0365b = c1927v.f8438f;
        C2061a c2061a = (C2061a) c0365b.f1173e;
        int iMo345q = interfaceC0575g.mo345q(c2061a.f8955a, ((int) (c1927v.f8439g - c0365b.f1171c)) + c2061a.f8956b, iM4460c);
        if (iMo345q == -1) {
            if (z3) {
                return -1;
            }
            throw new EOFException();
        }
        long j3 = c1927v.f8439g + ((long) iMo345q);
        c1927v.f8439g = j3;
        C0365b c0365b2 = c1927v.f8438f;
        if (j3 == c0365b2.f1172d) {
            c1927v.f8438f = (C0365b) c0365b2.f1174f;
        }
        return iMo345q;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0082 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x001d, B:12:0x0024, B:16:0x002c, B:21:0x0067, B:44:0x00e3, B:46:0x00ec, B:23:0x0082, B:25:0x008b, B:27:0x0094, B:29:0x00a9, B:33:0x00b2, B:34:0x00b7, B:36:0x00bd, B:40:0x00cb, B:42:0x00d0, B:43:0x00e0, B:26:0x0092), top: B:51:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x008b A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x001d, B:12:0x0024, B:16:0x002c, B:21:0x0067, B:44:0x00e3, B:46:0x00ec, B:23:0x0082, B:25:0x008b, B:27:0x0094, B:29:0x00a9, B:33:0x00b2, B:34:0x00b7, B:36:0x00bd, B:40:0x00cb, B:42:0x00d0, B:43:0x00e0, B:26:0x0092), top: B:51:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0092 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x001d, B:12:0x0024, B:16:0x002c, B:21:0x0067, B:44:0x00e3, B:46:0x00ec, B:23:0x0082, B:25:0x008b, B:27:0x0094, B:29:0x00a9, B:33:0x00b2, B:34:0x00b7, B:36:0x00bd, B:40:0x00cb, B:42:0x00d0, B:43:0x00e0, B:26:0x0092), top: B:51:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a9 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x001d, B:12:0x0024, B:16:0x002c, B:21:0x0067, B:44:0x00e3, B:46:0x00ec, B:23:0x0082, B:25:0x008b, B:27:0x0094, B:29:0x00a9, B:33:0x00b2, B:34:0x00b7, B:36:0x00bd, B:40:0x00cb, B:42:0x00d0, B:43:0x00e0, B:26:0x0092), top: B:51:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00af  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bd A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x001d, B:12:0x0024, B:16:0x002c, B:21:0x0067, B:44:0x00e3, B:46:0x00ec, B:23:0x0082, B:25:0x008b, B:27:0x0094, B:29:0x00a9, B:33:0x00b2, B:34:0x00b7, B:36:0x00bd, B:40:0x00cb, B:42:0x00d0, B:43:0x00e0, B:26:0x0092), top: B:51:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d0 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x001d, B:12:0x0024, B:16:0x002c, B:21:0x0067, B:44:0x00e3, B:46:0x00ec, B:23:0x0082, B:25:0x008b, B:27:0x0094, B:29:0x00a9, B:33:0x00b2, B:34:0x00b7, B:36:0x00bd, B:40:0x00cb, B:42:0x00d0, B:43:0x00e0, B:26:0x0092), top: B:51:0x0001 }] */
    /* JADX INFO: renamed from: g */
    public final synchronized void m4465g(long j3, int i3, long j4, int i4, C2225D c2225d) {
        C0583o c0583o;
        InterfaceC1390n interfaceC1390n;
        InterfaceC1389m interfaceC1389mMo979h;
        C0380q c0380q;
        int i5;
        int i6;
        SparseArray sparseArray;
        int iKeyAt;
        boolean z3;
        boolean z4;
        try {
            int i7 = this.f8464p;
            if (i7 > 0) {
                int iM4475r = m4475r(i7 - 1);
                AbstractC0646n.m1625c(this.f8459k[iM4475r] + ((long) this.f8460l[iM4475r]) <= j4);
            }
            this.f8471w = (536870912 & i3) != 0;
            this.f8470v = Math.max(this.f8470v, j3);
            int iM4475r2 = m4475r(this.f8464p);
            this.f8462n[iM4475r2] = j3;
            this.f8459k[iM4475r2] = j4;
            this.f8460l[iM4475r2] = i4;
            this.f8461m[iM4475r2] = i3;
            this.f8463o[iM4475r2] = c2225d;
            this.f8458j[iM4475r2] = this.f8444C;
            if (((SparseArray) this.f8451c.f1292i).size() == 0) {
                c0583o = this.f8443B;
                c0583o.getClass();
                interfaceC1390n = this.f8452d;
                if (interfaceC1390n != null) {
                    interfaceC1389mMo979h = interfaceC1390n.mo979h(this.f8453e, c0583o);
                } else {
                    interfaceC1389mMo979h = InterfaceC1389m.f6185a;
                }
                c0380q = this.f8451c;
                i5 = this.f8465q + this.f8464p;
                C1928W c1928w = new C1928W(c0583o, interfaceC1389mMo979h);
                i6 = c0380q.f1291h;
                sparseArray = (SparseArray) c0380q.f1292i;
                if (i6 == -1) {
                    if (sparseArray.size() == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    AbstractC0646n.m1630h(z4);
                    c0380q.f1291h = 0;
                }
                if (sparseArray.size() > 0) {
                    iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                    if (i5 >= iKeyAt) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    AbstractC0646n.m1625c(z3);
                    if (iKeyAt == i5) {
                        ((C1063d) c0380q.f1293j).mo545b(sparseArray.valueAt(sparseArray.size() - 1));
                    }
                }
                sparseArray.append(i5, c1928w);
            } else {
                SparseArray sparseArray2 = (SparseArray) this.f8451c.f1292i;
                if (!((C1928W) sparseArray2.valueAt(sparseArray2.size() - 1)).f8440a.equals(this.f8443B)) {
                    c0583o = this.f8443B;
                    c0583o.getClass();
                    interfaceC1390n = this.f8452d;
                    if (interfaceC1390n != null) {
                        interfaceC1389mMo979h = interfaceC1390n.mo979h(this.f8453e, c0583o);
                    } else {
                        interfaceC1389mMo979h = InterfaceC1389m.f6185a;
                    }
                    c0380q = this.f8451c;
                    i5 = this.f8465q + this.f8464p;
                    C1928W c1928w2 = new C1928W(c0583o, interfaceC1389mMo979h);
                    i6 = c0380q.f1291h;
                    sparseArray = (SparseArray) c0380q.f1292i;
                    if (i6 == -1) {
                        if (sparseArray.size() == 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        AbstractC0646n.m1630h(z4);
                        c0380q.f1291h = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (i5 >= iKeyAt) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        AbstractC0646n.m1625c(z3);
                        if (iKeyAt == i5) {
                            ((C1063d) c0380q.f1293j).mo545b(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(i5, c1928w2);
                }
            }
            int i8 = this.f8464p + 1;
            this.f8464p = i8;
            int i9 = this.f8457i;
            if (i8 == i9) {
                int i10 = i9 + 1000;
                long[] jArr = new long[i10];
                long[] jArr2 = new long[i10];
                long[] jArr3 = new long[i10];
                int[] iArr = new int[i10];
                int[] iArr2 = new int[i10];
                C2225D[] c2225dArr = new C2225D[i10];
                int i11 = this.f8466r;
                int i12 = i9 - i11;
                System.arraycopy(this.f8459k, i11, jArr2, 0, i12);
                System.arraycopy(this.f8462n, this.f8466r, jArr3, 0, i12);
                System.arraycopy(this.f8461m, this.f8466r, iArr, 0, i12);
                System.arraycopy(this.f8460l, this.f8466r, iArr2, 0, i12);
                System.arraycopy(this.f8463o, this.f8466r, c2225dArr, 0, i12);
                System.arraycopy(this.f8458j, this.f8466r, jArr, 0, i12);
                int i13 = this.f8466r;
                System.arraycopy(this.f8459k, 0, jArr2, i12, i13);
                System.arraycopy(this.f8462n, 0, jArr3, i12, i13);
                System.arraycopy(this.f8461m, 0, iArr, i12, i13);
                System.arraycopy(this.f8460l, 0, iArr2, i12, i13);
                System.arraycopy(this.f8463o, 0, c2225dArr, i12, i13);
                System.arraycopy(this.f8458j, 0, jArr, i12, i13);
                this.f8459k = jArr2;
                this.f8462n = jArr3;
                this.f8461m = iArr;
                this.f8460l = iArr2;
                this.f8463o = c2225dArr;
                this.f8458j = jArr;
                this.f8466r = 0;
                this.f8457i = i10;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public final long m4466h(int i3) {
        this.f8469u = Math.max(this.f8469u, m4473p(i3));
        this.f8464p -= i3;
        int i4 = this.f8465q + i3;
        this.f8465q = i4;
        int i5 = this.f8466r + i3;
        this.f8466r = i5;
        int i6 = this.f8457i;
        if (i5 >= i6) {
            this.f8466r = i5 - i6;
        }
        int i7 = this.f8467s - i3;
        this.f8467s = i7;
        int i8 = 0;
        if (i7 < 0) {
            this.f8467s = 0;
        }
        while (true) {
            C0380q c0380q = this.f8451c;
            SparseArray sparseArray = (SparseArray) c0380q.f1292i;
            if (i8 >= sparseArray.size() - 1) {
                break;
            }
            int i9 = i8 + 1;
            if (i4 < sparseArray.keyAt(i9)) {
                break;
            }
            ((C1063d) c0380q.f1293j).mo545b(sparseArray.valueAt(i8));
            sparseArray.removeAt(i8);
            int i10 = c0380q.f1291h;
            if (i10 > 0) {
                c0380q.f1291h = i10 - 1;
            }
            i8 = i9;
        }
        if (this.f8464p != 0) {
            return this.f8459k[this.f8466r];
        }
        int i11 = this.f8466r;
        if (i11 == 0) {
            i11 = this.f8457i;
        }
        int i12 = i11 - 1;
        return this.f8459k[i12] + ((long) this.f8460l[i12]);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    /* JADX INFO: renamed from: i */
    public final void m4467i(long j3, boolean z3) throws Throwable {
        Throwable th;
        C1927V c1927v = this.f8449a;
        synchronized (this) {
            try {
                try {
                    int i3 = this.f8464p;
                    long jM4466h = -1;
                    if (i3 != 0) {
                        long[] jArr = this.f8462n;
                        int i4 = this.f8466r;
                        if (j3 >= jArr[i4]) {
                            if (z3) {
                                try {
                                    int i5 = this.f8467s;
                                    if (i5 != i3) {
                                        i3 = i5 + 1;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            int iM4470l = m4470l(i4, i3, j3, false);
                            if (iM4470l != -1) {
                                jM4466h = m4466h(iM4470l);
                            }
                        }
                    }
                    c1927v.m4459b(jM4466h);
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m4468j() {
        long jM4466h;
        C1927V c1927v = this.f8449a;
        synchronized (this) {
            int i3 = this.f8464p;
            jM4466h = i3 == 0 ? -1L : m4466h(i3);
        }
        c1927v.m4459b(jM4466h);
    }

    /* JADX INFO: renamed from: k */
    public final long m4469k(int i3) {
        int i4 = this.f8465q;
        int i5 = this.f8464p;
        int i6 = (i4 + i5) - i3;
        boolean z3 = false;
        AbstractC0646n.m1625c(i6 >= 0 && i6 <= i5 - this.f8467s);
        int i7 = this.f8464p - i6;
        this.f8464p = i7;
        this.f8470v = Math.max(this.f8469u, m4473p(i7));
        if (i6 == 0 && this.f8471w) {
            z3 = true;
        }
        this.f8471w = z3;
        C0380q c0380q = this.f8451c;
        SparseArray sparseArray = (SparseArray) c0380q.f1292i;
        for (int size = sparseArray.size() - 1; size >= 0 && i3 < sparseArray.keyAt(size); size--) {
            ((C1063d) c0380q.f1293j).mo545b(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        c0380q.f1291h = sparseArray.size() > 0 ? Math.min(c0380q.f1291h, sparseArray.size() - 1) : -1;
        int i8 = this.f8464p;
        if (i8 == 0) {
            return 0L;
        }
        int iM4475r = m4475r(i8 - 1);
        return this.f8459k[iM4475r] + ((long) this.f8460l[iM4475r]);
    }

    /* JADX INFO: renamed from: l */
    public final int m4470l(int i3, int i4, long j3, boolean z3) {
        int i5 = -1;
        for (int i6 = 0; i6 < i4; i6++) {
            long j4 = this.f8462n[i3];
            if (j4 > j3) {
                break;
            }
            if (!z3 || (this.f8461m[i3] & 1) != 0) {
                if (j4 == j3) {
                    return i6;
                }
                i5 = i6;
            }
            i3++;
            if (i3 == this.f8457i) {
                i3 = 0;
            }
        }
        return i5;
    }

    /* JADX INFO: renamed from: m */
    public C0583o mo3790m(C0583o c0583o) {
        if (this.f8447F == 0 || c0583o.f2159s == Long.MAX_VALUE) {
            return c0583o;
        }
        C0582n c0582nM1447a = c0583o.m1447a();
        c0582nM1447a.f2119r = c0583o.f2159s + this.f8447F;
        return new C0583o(c0582nM1447a);
    }

    /* JADX INFO: renamed from: n */
    public final synchronized long m4471n() {
        return this.f8470v;
    }

    /* JADX INFO: renamed from: o */
    public final synchronized long m4472o() {
        return Math.max(this.f8469u, m4473p(this.f8467s));
    }

    /* JADX INFO: renamed from: p */
    public final long m4473p(int i3) {
        long jMax = Long.MIN_VALUE;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int iM4475r = m4475r(i3 - 1);
        for (int i4 = 0; i4 < i3; i4++) {
            jMax = Math.max(jMax, this.f8462n[iM4475r]);
            if ((this.f8461m[iM4475r] & 1) != 0) {
                return jMax;
            }
            iM4475r--;
            if (iM4475r == -1) {
                iM4475r = this.f8457i - 1;
            }
        }
        return jMax;
    }

    /* JADX INFO: renamed from: q */
    public final int m4474q() {
        return this.f8465q + this.f8467s;
    }

    /* JADX INFO: renamed from: r */
    public final int m4475r(int i3) {
        int i4 = this.f8466r + i3;
        int i5 = this.f8457i;
        return i4 < i5 ? i4 : i4 - i5;
    }

    /* JADX INFO: renamed from: s */
    public final synchronized int m4476s(long j3, boolean z3) {
        try {
            try {
                int iM4475r = m4475r(this.f8467s);
                int i3 = this.f8467s;
                int i4 = this.f8464p;
                if (!(i3 != i4) || j3 < this.f8462n[iM4475r]) {
                    return 0;
                }
                if (j3 > this.f8470v && z3) {
                    return i4 - i3;
                }
                int iM4470l = m4470l(iM4475r, i4 - i3, j3, true);
                if (iM4470l == -1) {
                    return 0;
                }
                return iM4470l;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX INFO: renamed from: t */
    public final synchronized C0583o m4477t() {
        return this.f8473y ? null : this.f8443B;
    }

    /* JADX INFO: renamed from: u */
    public final synchronized boolean m4478u(boolean z3) {
        C0583o c0583o;
        boolean z4 = false;
        if (this.f8467s != this.f8464p) {
            if (((C1928W) this.f8451c.m1045f(m4474q())).f8440a != this.f8455g) {
                return true;
            }
            return m4479v(m4475r(this.f8467s));
        }
        if (z3 || this.f8471w || ((c0583o = this.f8443B) != null && c0583o != this.f8455g)) {
            z4 = true;
        }
        return z4;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m4479v(int i3) {
        InterfaceC1384h interfaceC1384h = this.f8456h;
        if (interfaceC1384h == null || interfaceC1384h.mo3460a() == 4) {
            return true;
        }
        return (this.f8461m[i3] & 1073741824) == 0 && this.f8456h.mo3461b();
    }

    /* JADX INFO: renamed from: w */
    public final void m4480w(C0583o c0583o, C0106b c0106b) {
        C0583o c0583o2;
        C0583o c0583o3 = this.f8455g;
        boolean z3 = c0583o3 == null;
        C0579k c0579k = c0583o3 == null ? null : c0583o3.f2158r;
        this.f8455g = c0583o;
        C0579k c0579k2 = c0583o.f2158r;
        InterfaceC1390n interfaceC1390n = this.f8452d;
        if (interfaceC1390n != null) {
            int iMo993v = interfaceC1390n.mo993v(c0583o);
            C0582n c0582nM1447a = c0583o.m1447a();
            c0582nM1447a.f2101K = iMo993v;
            c0583o2 = new C0583o(c0582nM1447a);
        } else {
            c0583o2 = c0583o;
        }
        c0106b.f141i = c0583o2;
        c0106b.f140h = this.f8456h;
        if (interfaceC1390n == null) {
            return;
        }
        if (z3 || !Objects.equals(c0579k, c0579k2)) {
            InterfaceC1384h interfaceC1384h = this.f8456h;
            C1387k c1387k = this.f8453e;
            InterfaceC1384h interfaceC1384hMo995x = interfaceC1390n.mo995x(c1387k, c0583o);
            this.f8456h = interfaceC1384hMo995x;
            c0106b.f140h = interfaceC1384hMo995x;
            if (interfaceC1384h != null) {
                interfaceC1384h.mo3463d(c1387k);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final synchronized long m4481x() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.f8467s != this.f8464p ? this.f8458j[m4475r(this.f8467s)] : this.f8444C;
    }

    /* JADX INFO: renamed from: y */
    public final int m4482y(C0106b c0106b, C0771f c0771f, int i3, boolean z3) {
        int i4;
        boolean z4 = (i3 & 2) != 0;
        C1577g c1577g = this.f8450b;
        synchronized (this) {
            try {
                c0771f.f3145l = false;
                i4 = -3;
                if (this.f8467s != this.f8464p) {
                    C0583o c0583o = ((C1928W) this.f8451c.m1045f(m4474q())).f8440a;
                    if (z4 || c0583o != this.f8455g) {
                        m4480w(c0583o, c0106b);
                        i4 = -5;
                    } else {
                        int iM4475r = m4475r(this.f8467s);
                        if (m4479v(iM4475r)) {
                            c0771f.f2573h = this.f8461m[iM4475r];
                            if (this.f8467s == this.f8464p - 1 && (z3 || this.f8471w)) {
                                c0771f.m1786a(536870912);
                            }
                            c0771f.f3146m = this.f8462n[iM4475r];
                            c1577g.f7162a = this.f8460l[iM4475r];
                            c1577g.f7163b = this.f8459k[iM4475r];
                            c1577g.f7164c = this.f8463o[iM4475r];
                            i4 = -4;
                        } else {
                            c0771f.f3145l = true;
                        }
                    }
                } else if (z3 || this.f8471w) {
                    c0771f.f2573h = 4;
                    c0771f.f3146m = Long.MIN_VALUE;
                    i4 = -4;
                } else {
                    C0583o c0583o2 = this.f8443B;
                    if (c0583o2 != null && (z4 || c0583o2 != this.f8455g)) {
                        m4480w(c0583o2, c0106b);
                        i4 = -5;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i4 == -4 && !c0771f.m1787c(4)) {
            boolean z5 = (i3 & 1) != 0;
            if ((i3 & 4) == 0) {
                if (z5) {
                    C1927V c1927v = this.f8449a;
                    C1927V.m4457f(c1927v.f8437e, c0771f, this.f8450b, c1927v.f8435c);
                } else {
                    C1927V c1927v2 = this.f8449a;
                    c1927v2.f8437e = C1927V.m4457f(c1927v2.f8437e, c0771f, this.f8450b, c1927v2.f8435c);
                }
            }
            if (!z5) {
                this.f8467s++;
            }
        }
        return i4;
    }

    /* JADX INFO: renamed from: z */
    public final void m4483z(boolean z3) {
        C0380q c0380q;
        SparseArray sparseArray;
        C1927V c1927v = this.f8449a;
        c1927v.m4458a(c1927v.f8436d);
        C0365b c0365b = c1927v.f8436d;
        int i3 = 0;
        AbstractC0646n.m1630h(((C2061a) c0365b.f1173e) == null);
        c0365b.f1171c = 0L;
        c0365b.f1172d = c1927v.f8434b;
        C0365b c0365b2 = c1927v.f8436d;
        c1927v.f8437e = c0365b2;
        c1927v.f8438f = c0365b2;
        c1927v.f8439g = 0L;
        c1927v.f8433a.m4630b();
        this.f8464p = 0;
        this.f8465q = 0;
        this.f8466r = 0;
        this.f8467s = 0;
        this.f8472x = true;
        this.f8468t = Long.MIN_VALUE;
        this.f8469u = Long.MIN_VALUE;
        this.f8470v = Long.MIN_VALUE;
        this.f8471w = false;
        while (true) {
            c0380q = this.f8451c;
            sparseArray = (SparseArray) c0380q.f1292i;
            if (i3 >= sparseArray.size()) {
                break;
            }
            ((C1063d) c0380q.f1293j).mo545b(sparseArray.valueAt(i3));
            i3++;
        }
        c0380q.f1291h = -1;
        sparseArray.clear();
        if (z3) {
            this.f8442A = null;
            this.f8443B = null;
            this.f8473y = true;
            this.f8445D = true;
        }
    }
}

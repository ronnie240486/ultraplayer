package p092e0;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import p018G0.C0218h;
import p018G0.C0223m;
import p019G1.AbstractC0230e;
import p030K0.C0334e;
import p033L0.C0341d;
import p034L1.C0352g;
import p036M0.C0376m;
import p045P0.InterfaceC0463i;
import p055T.AbstractC0545H;
import p055T.C0544G;
import p055T.C0579k;
import p055T.C0582n;
import p055T.C0583o;
import p055T.InterfaceC0543F;
import p060U1.AbstractC0610a;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p064W.C0656x;
import p070Y.C0715l;
import p070Y.InterfaceC0711h;
import p071Y0.C0734E;
import p071Y0.C0738a;
import p071Y0.C0740c;
import p071Y0.C0741d;
import p082b0.C1071l;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1692X;
import p117l0.AbstractC1973b;
import p145s0.C2237j;
import p145s0.InterfaceC2240m;

/* JADX INFO: renamed from: e0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1505j extends AbstractC1973b {

    /* JADX INFO: renamed from: L */
    public static final AtomicInteger f6689L = new AtomicInteger();

    /* JADX INFO: renamed from: A */
    public final boolean f6690A;

    /* JADX INFO: renamed from: B */
    public final boolean f6691B;

    /* JADX INFO: renamed from: C */
    public C1497b f6692C;

    /* JADX INFO: renamed from: D */
    public C1512q f6693D;

    /* JADX INFO: renamed from: E */
    public int f6694E;

    /* JADX INFO: renamed from: F */
    public boolean f6695F;

    /* JADX INFO: renamed from: G */
    public volatile boolean f6696G;

    /* JADX INFO: renamed from: H */
    public boolean f6697H;

    /* JADX INFO: renamed from: I */
    public C1692X f6698I;

    /* JADX INFO: renamed from: J */
    public boolean f6699J;

    /* JADX INFO: renamed from: K */
    public boolean f6700K;

    /* JADX INFO: renamed from: k */
    public final int f6701k;

    /* JADX INFO: renamed from: l */
    public final int f6702l;

    /* JADX INFO: renamed from: m */
    public final Uri f6703m;

    /* JADX INFO: renamed from: n */
    public final boolean f6704n;

    /* JADX INFO: renamed from: o */
    public final int f6705o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC0711h f6706p;

    /* JADX INFO: renamed from: q */
    public final C0715l f6707q;

    /* JADX INFO: renamed from: r */
    public final C1497b f6708r;

    /* JADX INFO: renamed from: s */
    public final boolean f6709s;

    /* JADX INFO: renamed from: t */
    public final boolean f6710t;

    /* JADX INFO: renamed from: u */
    public final C0656x f6711u;

    /* JADX INFO: renamed from: v */
    public final C1498c f6712v;

    /* JADX INFO: renamed from: w */
    public final List f6713w;

    /* JADX INFO: renamed from: x */
    public final C0579k f6714x;

    /* JADX INFO: renamed from: y */
    public final C0218h f6715y;

    /* JADX INFO: renamed from: z */
    public final C0651s f6716z;

    public C1505j(C1498c c1498c, InterfaceC0711h interfaceC0711h, C0715l c0715l, C0583o c0583o, boolean z3, InterfaceC0711h interfaceC0711h2, C0715l c0715l2, boolean z4, Uri uri, List list, int i3, Object obj, long j3, long j4, long j5, int i4, boolean z5, int i5, boolean z6, boolean z7, C0656x c0656x, C0579k c0579k, C1497b c1497b, C0218h c0218h, C0651s c0651s, boolean z8, C1071l c1071l) {
        super(interfaceC0711h, c0715l, c0583o, i3, obj, j3, j4, j5);
        this.f6690A = z3;
        this.f6705o = i4;
        this.f6700K = z5;
        this.f6702l = i5;
        this.f6707q = c0715l2;
        this.f6706p = interfaceC0711h2;
        this.f6695F = c0715l2 != null;
        this.f6691B = z4;
        this.f6703m = uri;
        this.f6709s = z7;
        this.f6711u = c0656x;
        this.f6710t = z6;
        this.f6712v = c1498c;
        this.f6713w = list;
        this.f6714x = c0579k;
        this.f6708r = c1497b;
        this.f6715y = c0218h;
        this.f6716z = c0651s;
        this.f6704n = z8;
        C1674E c1674e = AbstractC1676G.f7601h;
        this.f6698I = C1692X.f7629k;
        this.f6701k = f6689L.getAndIncrement();
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m3754d(String str) {
        if (AbstractC1303m.m3288K(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // p129o0.InterfaceC2071k
    /* JADX INFO: renamed from: a */
    public final void mo3742a() {
        C1497b c1497b;
        this.f6693D.getClass();
        if (this.f6692C == null && (c1497b = this.f6708r) != null) {
            InterfaceC2240m interfaceC2240mMo327c = c1497b.f6650a.mo327c();
            if ((interfaceC2240mMo327c instanceof C0734E) || (interfaceC2240mMo327c instanceof C0376m)) {
                this.f6692C = this.f6708r;
                this.f6695F = false;
            }
        }
        if (this.f6695F) {
            InterfaceC0711h interfaceC0711h = this.f6706p;
            interfaceC0711h.getClass();
            C0715l c0715l = this.f6707q;
            c0715l.getClass();
            m3755c(interfaceC0711h, c0715l, this.f6691B, false);
            this.f6694E = 0;
            this.f6695F = false;
        }
        if (this.f6696G) {
            return;
        }
        if (!this.f6710t) {
            m3755c(this.f8609i, this.f8602b, this.f6690A, true);
        }
        this.f6697H = !this.f6696G;
    }

    @Override // p129o0.InterfaceC2071k
    /* JADX INFO: renamed from: b */
    public final void mo3743b() {
        this.f6696G = true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:19:0x0044, B:21:0x004a, B:34:0x0067, B:35:0x006b, B:45:0x0089, B:46:0x0091, B:40:0x007f, B:25:0x0052, B:27:0x0056, B:37:0x0070, B:39:0x0078, B:44:0x0088), top: B:49:0x0044, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0056 A[Catch: all -> 0x0063, EOFException -> 0x0065, TRY_LEAVE, TryCatch #1 {all -> 0x0063, blocks: (B:25:0x0052, B:27:0x0056, B:37:0x0070, B:39:0x0078, B:44:0x0088), top: B:50:0x0052, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0067 A[EDGE_INSN: B:53:0x0067->B:34:0x0067 BREAK  A[LOOP:0: B:50:0x0052->B:55:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[LOOP:0: B:50:0x0052->B:55:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public final void m3755c(InterfaceC0711h interfaceC0711h, C0715l c0715l, boolean z3, boolean z4) {
        C0715l c0715l2;
        C2237j c2237jM3757f;
        long j3;
        long j4;
        boolean z5 = false;
        try {
            if (!z3) {
                long j5 = this.f6694E;
                long j6 = c0715l.f2740f;
                long j7 = j6 != -1 ? j6 - j5 : -1L;
                if (j5 != 0 || j6 != j7) {
                    c0715l2 = new C0715l(c0715l.f2735a, c0715l.f2736b, c0715l.f2737c, c0715l.f2738d, c0715l.f2739e + j5, j7, c0715l.f2741g);
                }
                c2237jM3757f = m3757f(interfaceC0711h, c0715l2, z4);
                if (z5) {
                    c2237jM3757f.mo335d(this.f6694E);
                }
                while (!this.f6696G) {
                    try {
                        try {
                            if (this.f6692C.f6650a.mo328e(c2237jM3757f, C1497b.f6649f) == 0) {
                                break;
                            }
                        } catch (Throwable th) {
                            this.f6694E = (int) (c2237jM3757f.f9629j - c0715l.f2739e);
                            throw th;
                        }
                    } catch (EOFException e3) {
                        if ((this.f8604d.f2146f & 16384) == 0) {
                            throw e3;
                        }
                        this.f6692C.f6650a.mo331j(0L, 0L);
                        j3 = c2237jM3757f.f9629j;
                        j4 = c0715l.f2739e;
                    }
                }
                j3 = c2237jM3757f.f9629j;
                j4 = c0715l.f2739e;
                this.f6694E = (int) (j3 - j4);
                AbstractC0610a.m1504f(interfaceC0711h);
                return;
            }
            if (this.f6694E != 0) {
                z5 = true;
            }
            c2237jM3757f = m3757f(interfaceC0711h, c0715l2, z4);
            if (z5) {
                c2237jM3757f.mo335d(this.f6694E);
            }
            while (!this.f6696G) {
                if (this.f6692C.f6650a.mo328e(c2237jM3757f, C1497b.f6649f) == 0) {
                    break;
                    break;
                }
            }
            j3 = c2237jM3757f.f9629j;
            j4 = c0715l.f2739e;
            this.f6694E = (int) (j3 - j4);
            AbstractC0610a.m1504f(interfaceC0711h);
            return;
        } catch (Throwable th2) {
            AbstractC0610a.m1504f(interfaceC0711h);
            throw th2;
        }
        c0715l2 = c0715l;
    }

    /* JADX INFO: renamed from: e */
    public final int m3756e(int i3) {
        AbstractC0646n.m1630h(!this.f6704n);
        C1692X c1692x = this.f6698I;
        if (i3 >= c1692x.f7631j) {
            return 0;
        }
        return ((Integer) c1692x.get(i3)).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:129:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:132:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:133:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:136:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:137:0x02d5  */
    /* JADX INFO: renamed from: f */
    public final C2237j m3757f(InterfaceC0711h interfaceC0711h, C0715l c0715l, boolean z3) throws IOException {
        int i3;
        long j3;
        long jM1681o;
        C1497b c1497b;
        C0656x c0656x;
        InterfaceC2240m c0738a;
        boolean zMo329f;
        C0352g c0352g;
        boolean z4;
        int i4;
        C0352g c0352g2;
        List list;
        List listSingletonList;
        int i5;
        int i6;
        int i7;
        InterfaceC2240m c0341d;
        long jMo1827a = interfaceC0711h.mo1827a(c0715l);
        long j4 = this.f8607g;
        C0656x c0656x2 = this.f6711u;
        if (z3) {
            try {
                c0656x2.m1708h(j4, this.f6709s);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e3) {
                throw new IOException(e3);
            }
        }
        C2237j c2237j = new C2237j(interfaceC0711h, c0715l.f2739e, jMo1827a);
        if (this.f6692C == null) {
            C0651s c0651s = this.f6716z;
            c2237j.f9631l = 0;
            try {
                c0651s.m1662D(10);
                c2237j.mo338i(c0651s.f2520a, 0, 10, false);
                if (c0651s.m1690x() == 4801587) {
                    c0651s.m1666H(3);
                    int iM1686t = c0651s.m1686t();
                    int i8 = iM1686t + 10;
                    j3 = -9223372036854775807L;
                    byte[] bArr = c0651s.f2520a;
                    if (i8 > bArr.length) {
                        c0651s.m1662D(i8);
                        System.arraycopy(bArr, 0, c0651s.f2520a, 0, 10);
                    }
                    c2237j.mo338i(c0651s.f2520a, 10, iM1686t, false);
                    C0544G c0544gM712y = this.f6715y.m712y(c0651s.f2520a, iM1686t);
                    if (c0544gM712y == null) {
                        jM1681o = j3;
                        break;
                    }
                    InterfaceC0543F[] interfaceC0543FArr = c0544gM712y.f1940g;
                    int length = interfaceC0543FArr.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= length) {
                            jM1681o = j3;
                            break;
                        }
                        InterfaceC0543F interfaceC0543F = interfaceC0543FArr[i9];
                        if (interfaceC0543F instanceof C0223m) {
                            C0223m c0223m = (C0223m) interfaceC0543F;
                            if ("com.apple.streaming.transportStreamTimestamp".equals(c0223m.f519h)) {
                                System.arraycopy(c0223m.f520i, 0, c0651s.f2520a, 0, 8);
                                c0651s.m1665G(0);
                                c0651s.m1664F(8);
                                jM1681o = c0651s.m1681o() & 8589934591L;
                                break;
                            }
                        }
                        i9++;
                    }
                } else {
                    jM1681o = -9223372036854775807L;
                    j3 = -9223372036854775807L;
                }
            } catch (EOFException unused2) {
                j3 = -9223372036854775807L;
            }
            c2237j.f9631l = 0;
            C1497b c1497b2 = this.f6708r;
            if (c1497b2 == null) {
                Map mapMo1833m = interfaceC0711h.mo1833m();
                C1498c c1498c = this.f6712v;
                c1498c.getClass();
                C0583o c0583o = this.f8604d;
                int iM740r = AbstractC0230e.m740r(c0583o.f2154n);
                List list2 = (List) mapMo1833m.get("Content-Type");
                int iM740r2 = AbstractC0230e.m740r((list2 == null || list2.isEmpty()) ? null : (String) list2.get(0));
                int iM741s = AbstractC0230e.m741s(c0715l.f2735a);
                ArrayList arrayList = new ArrayList(7);
                C1498c.m3740a(iM740r, arrayList);
                C1498c.m3740a(iM740r2, arrayList);
                C1498c.m3740a(iM741s, arrayList);
                int[] iArr = C1498c.f6655c;
                int i10 = 0;
                for (int i11 = 7; i10 < i11; i11 = 7) {
                    C1498c.m3740a(iArr[i10], arrayList);
                    i10++;
                }
                c2237j.f9631l = 0;
                int i12 = 0;
                InterfaceC2240m interfaceC2240m = null;
                while (true) {
                    int size = arrayList.size();
                    C0656x c0656x3 = this.f6711u;
                    if (i12 >= size) {
                        j4 = j4;
                        interfaceC2240m.getClass();
                        c1497b = new C1497b(interfaceC2240m, c0583o, c0656x3, c1498c.f6656a, c1498c.f6657b);
                        break;
                    }
                    int iIntValue = ((Integer) arrayList.get(i12)).intValue();
                    int i13 = i12;
                    if (iIntValue == 0) {
                        c0656x = c0656x3;
                        c0583o = c0583o;
                        j4 = j4;
                        arrayList = arrayList;
                        c0738a = new C0738a();
                    } else if (iIntValue == 1) {
                        c0656x = c0656x3;
                        c0583o = c0583o;
                        j4 = j4;
                        arrayList = arrayList;
                        c0738a = new C0740c();
                    } else if (iIntValue == 2) {
                        c0656x = c0656x3;
                        c0583o = c0583o;
                        j4 = j4;
                        arrayList = arrayList;
                        c0738a = new C0741d();
                    } else if (iIntValue != 7) {
                        C0352g c0352g3 = InterfaceC0463i.f1532a;
                        List list3 = this.f6713w;
                        if (iIntValue == 8) {
                            c0656x = c0656x3;
                            j4 = j4;
                            arrayList = arrayList;
                            C0352g c0352g4 = c1498c.f6656a;
                            boolean z5 = c1498c.f6657b;
                            C0544G c0544g = c0583o.f2152l;
                            if (c0544g == null) {
                                c0352g = c0352g4;
                                c0583o = c0583o;
                            } else {
                                c0352g = c0352g4;
                                int i14 = 0;
                                while (true) {
                                    InterfaceC0543F[] interfaceC0543FArr2 = c0544g.f1940g;
                                    c0583o = c0583o;
                                    if (i14 < interfaceC0543FArr2.length) {
                                        InterfaceC0543F interfaceC0543F2 = interfaceC0543FArr2[i14];
                                        if (interfaceC0543F2 instanceof C1514s) {
                                            z4 = !((C1514s) interfaceC0543F2).f6825i.isEmpty();
                                            break;
                                        }
                                        i14++;
                                        c0583o = c0583o;
                                    }
                                }
                                if (z4) {
                                    i4 = 4;
                                } else {
                                    i4 = 0;
                                }
                                if (z5) {
                                    c0352g2 = c0352g;
                                } else {
                                    i4 |= 32;
                                    c0352g2 = c0352g3;
                                }
                                if (list3 != null) {
                                    list = list3;
                                } else {
                                    list = C1692X.f7629k;
                                }
                                c0738a = new C0376m(c0352g2, i4, c0656x, list);
                            }
                            z4 = false;
                            if (z4) {
                                i4 = 4;
                            } else {
                                i4 = 0;
                            }
                            if (z5) {
                                i4 |= 32;
                                c0352g2 = c0352g3;
                            } else {
                                c0352g2 = c0352g;
                            }
                            if (list3 != null) {
                                list = list3;
                            } else {
                                list = C1692X.f7629k;
                            }
                            c0738a = new C0376m(c0352g2, i4, c0656x, list);
                        } else if (iIntValue == 11) {
                            j4 = j4;
                            arrayList = arrayList;
                            C0352g c0352g5 = c1498c.f6656a;
                            boolean z6 = c1498c.f6657b;
                            if (list3 != null) {
                                listSingletonList = list3;
                                i5 = 48;
                            } else {
                                C0582n c0582n = new C0582n();
                                c0582n.f2114m = AbstractC0545H.m1364l("application/cea-608");
                                listSingletonList = Collections.singletonList(new C0583o(c0582n));
                                i5 = 16;
                            }
                            String str = c0583o.f2151k;
                            if (!TextUtils.isEmpty(str)) {
                                if (AbstractC0545H.m1353a(str, "audio/mp4a-latm") == null) {
                                    i5 |= 2;
                                }
                                if (AbstractC0545H.m1353a(str, "video/avc") == null) {
                                    i5 |= 4;
                                }
                            }
                            c0656x = c0656x3;
                            c0583o = c0583o;
                            c0738a = new C0734E(2, !z6 ? 1 : 0, !z6 ? c0352g3 : c0352g5, c0656x3, new C0334e(i5, listSingletonList));
                        } else if (iIntValue != 13) {
                            c0656x = c0656x3;
                            c0738a = null;
                        } else {
                            c0738a = new C1515t(c0583o.f2144d, c0656x3, c1498c.f6656a, c1498c.f6657b);
                            c0656x = c0656x3;
                        }
                    } else {
                        c0656x = c0656x3;
                        c0583o = c0583o;
                        j4 = j4;
                        arrayList = arrayList;
                        c0738a = new C0341d(0L);
                    }
                    c0738a.getClass();
                    try {
                        zMo329f = c0738a.mo329f(c2237j);
                        c2237j.f9631l = 0;
                    } catch (EOFException unused3) {
                        c2237j.f9631l = 0;
                        zMo329f = false;
                    } catch (Throwable th) {
                        c2237j.f9631l = 0;
                        throw th;
                    }
                    if (zMo329f) {
                        c1497b = new C1497b(c0738a, c0583o, c0656x, c1498c.f6656a, c1498c.f6657b);
                        break;
                    }
                    if (interfaceC2240m == null && (iIntValue == iM740r || iIntValue == iM740r2 || iIntValue == iM741s || iIntValue == 11)) {
                        interfaceC2240m = c0738a;
                    }
                    i12 = i13 + 1;
                    arrayList = arrayList;
                    c0583o = c0583o;
                    j4 = j4;
                }
            } else {
                InterfaceC2240m interfaceC2240m2 = c1497b2.f6650a;
                InterfaceC2240m interfaceC2240mMo327c = interfaceC2240m2.mo327c();
                AbstractC0646n.m1630h(!((interfaceC2240mMo327c instanceof C0734E) || (interfaceC2240mMo327c instanceof C0376m)));
                AbstractC0646n.m1629g("Can't recreate wrapped extractors. Outer type: " + interfaceC2240m2.getClass(), interfaceC2240m2.mo327c() == interfaceC2240m2);
                if (interfaceC2240m2 instanceof C1515t) {
                    c0341d = new C1515t(c1497b2.f6651b.f2144d, c1497b2.f6652c, c1497b2.f6653d, c1497b2.f6654e);
                } else if (interfaceC2240m2 instanceof C0741d) {
                    c0341d = new C0741d();
                } else if (interfaceC2240m2 instanceof C0738a) {
                    c0341d = new C0738a();
                } else if (interfaceC2240m2 instanceof C0740c) {
                    c0341d = new C0740c();
                } else {
                    if (!(interfaceC2240m2 instanceof C0341d)) {
                        throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(interfaceC2240m2.getClass().getSimpleName()));
                    }
                    c0341d = new C0341d();
                }
                c1497b = new C1497b(c0341d, c1497b2.f6651b, c1497b2.f6652c, c1497b2.f6653d, c1497b2.f6654e);
                j4 = j4;
            }
            C1497b c1497b3 = c1497b;
            this.f6692C = c1497b3;
            InterfaceC2240m interfaceC2240mMo327c2 = c1497b3.f6650a.mo327c();
            if ((interfaceC2240mMo327c2 instanceof C0741d) || (interfaceC2240mMo327c2 instanceof C0738a) || (interfaceC2240mMo327c2 instanceof C0740c) || (interfaceC2240mMo327c2 instanceof C0341d)) {
                C1512q c1512q = this.f6693D;
                long jM1702b = jM1681o != j3 ? c0656x2.m1702b(jM1681o) : j4;
                if (c1512q.f6794b0 != jM1702b) {
                    c1512q.f6794b0 = jM1702b;
                    C1511p[] c1511pArr = c1512q.f6768B;
                    int length2 = c1511pArr.length;
                    int i15 = 0;
                    while (i15 < length2) {
                        C1511p c1511p = c1511pArr[i15];
                        if (c1511p.f8447F != jM1702b) {
                            c1511p.f8447F = jM1702b;
                            i7 = 1;
                            c1511p.f8474z = true;
                        } else {
                            i7 = 1;
                        }
                        i15 += i7;
                    }
                }
            } else {
                C1512q c1512q2 = this.f6693D;
                if (c1512q2.f6794b0 != 0) {
                    c1512q2.f6794b0 = 0L;
                    C1511p[] c1511pArr2 = c1512q2.f6768B;
                    int length3 = c1511pArr2.length;
                    int i16 = 0;
                    while (i16 < length3) {
                        C1511p c1511p2 = c1511pArr2[i16];
                        if (c1511p2.f8447F != 0) {
                            c1511p2.f8447F = 0L;
                            i6 = 1;
                            c1511p2.f8474z = true;
                        } else {
                            i6 = 1;
                        }
                        i16 += i6;
                    }
                }
            }
            this.f6693D.f6770D.clear();
            this.f6692C.f6650a.mo330h(this.f6693D);
        }
        C1512q c1512q3 = this.f6693D;
        C0579k c0579k = c1512q3.f6795c0;
        int i17 = AbstractC0632A.f2454a;
        C0579k c0579k2 = this.f6714x;
        if (!Objects.equals(c0579k, c0579k2)) {
            c1512q3.f6795c0 = c0579k2;
            int i18 = 0;
            while (true) {
                C1511p[] c1511pArr3 = c1512q3.f6768B;
                if (i18 >= c1511pArr3.length) {
                    break;
                }
                if (c1512q3.f6787U[i18]) {
                    C1511p c1511p3 = c1511pArr3[i18];
                    c1511p3.f6765I = c0579k2;
                    i3 = 1;
                    c1511p3.f8474z = true;
                } else {
                    i3 = 1;
                }
                i18 += i3;
            }
        }
        return c2237j;
    }
}

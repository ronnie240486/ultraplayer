package p092e0;

import android.net.Uri;
import android.util.Pair;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p055T.C0559W;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p070Y.C0715l;
import p070Y.InterfaceC0701A;
import p070Y.InterfaceC0710g;
import p070Y.InterfaceC0711h;
import p082b0.C1071l;
import p089d1.C1447t;
import p095f0.C1531d;
import p095f0.C1532e;
import p095f0.C1534g;
import p095f0.C1537j;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1692X;
import p114k0.C1934b;
import p117l0.InterfaceC1974c;
import p125n0.InterfaceC2042s;

/* JADX INFO: renamed from: e0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1504i {

    /* JADX INFO: renamed from: a */
    public final C1498c f6670a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0711h f6671b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0711h f6672c;

    /* JADX INFO: renamed from: d */
    public final C1447t f6673d;

    /* JADX INFO: renamed from: e */
    public final Uri[] f6674e;

    /* JADX INFO: renamed from: f */
    public final C0583o[] f6675f;

    /* JADX INFO: renamed from: g */
    public final C1531d f6676g;

    /* JADX INFO: renamed from: h */
    public final C0559W f6677h;

    /* JADX INFO: renamed from: i */
    public final List f6678i;

    /* JADX INFO: renamed from: k */
    public final C1071l f6680k;

    /* JADX INFO: renamed from: l */
    public boolean f6681l;

    /* JADX INFO: renamed from: n */
    public C1934b f6683n;

    /* JADX INFO: renamed from: o */
    public Uri f6684o;

    /* JADX INFO: renamed from: p */
    public boolean f6685p;

    /* JADX INFO: renamed from: q */
    public InterfaceC2042s f6686q;

    /* JADX INFO: renamed from: s */
    public boolean f6688s;

    /* JADX INFO: renamed from: j */
    public final C1447t f6679j = new C1447t(4);

    /* JADX INFO: renamed from: m */
    public byte[] f6682m = AbstractC0632A.f2459f;

    /* JADX INFO: renamed from: r */
    public long f6687r = -9223372036854775807L;

    public C1504i(C1498c c1498c, C1531d c1531d, Uri[] uriArr, C0583o[] c0583oArr, C1447t c1447t, InterfaceC0701A interfaceC0701A, C1447t c1447t2, List list, C1071l c1071l) {
        this.f6670a = c1498c;
        this.f6676g = c1531d;
        this.f6674e = uriArr;
        this.f6675f = c0583oArr;
        this.f6673d = c1447t2;
        this.f6678i = list;
        this.f6680k = c1071l;
        InterfaceC0711h interfaceC0711hMo518f = ((InterfaceC0710g) c1447t.f6406h).mo518f();
        this.f6671b = interfaceC0711hMo518f;
        if (interfaceC0701A != null) {
            interfaceC0711hMo518f.mo1830e(interfaceC0701A);
        }
        this.f6672c = ((InterfaceC0710g) c1447t.f6406h).mo518f();
        this.f6677h = new C0559W("", c0583oArr);
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (int i4 = 0; i4 < uriArr.length; i4++) {
            if ((c0583oArr[i4].f2146f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i4));
            }
        }
        C0559W c0559w = this.f6677h;
        int[] iArrM3287J = AbstractC1303m.m3287J(arrayList);
        C1502g c1502g = new C1502g(c0559w, iArrM3287J);
        C0583o c0583o = c0559w.f1995d[iArrM3287J[0]];
        while (i3 < c1502g.f8814b) {
            if (c1502g.f8816d[i3] == c0583o) {
                c1502g.f6665g = i3;
                this.f6686q = c1502g;
            }
            i3++;
        }
        i3 = -1;
        c1502g.f6665g = i3;
        this.f6686q = c1502g;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    /* JADX INFO: renamed from: a */
    public final InterfaceC1974c[] m3750a(C1505j c1505j, long j3) {
        int i3;
        List listUnmodifiableList;
        C1504i c1504i = this;
        C1505j c1505j2 = c1505j;
        int iM1417a = c1505j2 == null ? -1 : c1504i.f6677h.m1417a(c1505j2.f8604d);
        int length = c1504i.f6686q.length();
        InterfaceC1974c[] interfaceC1974cArr = new InterfaceC1974c[length];
        boolean z3 = false;
        int i4 = 0;
        while (i4 < length) {
            int iMo4432m = c1504i.f6686q.mo4432m(i4);
            Uri uri = c1504i.f6674e[iMo4432m];
            C1531d c1531d = c1504i.f6676g;
            if (c1531d.m3833c(uri)) {
                C1537j c1537jM3831a = c1531d.m3831a(uri, z3);
                c1537jM3831a.getClass();
                long j4 = c1537jM3831a.f6944h - c1531d.f6916t;
                Pair pairM3752c = c1504i.m3752c(c1505j2, iMo4432m != iM1417a, c1537jM3831a, j4, j3);
                long jLongValue = ((Long) pairM3752c.first).longValue();
                int iIntValue = ((Integer) pairM3752c.second).intValue();
                i3 = i4;
                int i5 = (int) (jLongValue - c1537jM3831a.f6947k);
                if (i5 >= 0) {
                    AbstractC1676G abstractC1676G = c1537jM3831a.f6954r;
                    if (abstractC1676G.size() < i5) {
                        C1674E c1674e = AbstractC1676G.f7601h;
                        listUnmodifiableList = C1692X.f7629k;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        if (i5 < abstractC1676G.size()) {
                            if (iIntValue != -1) {
                                C1534g c1534g = (C1534g) abstractC1676G.get(i5);
                                if (iIntValue == 0) {
                                    arrayList.add(c1534g);
                                } else if (iIntValue < c1534g.f6923s.size()) {
                                    AbstractC1676G abstractC1676G2 = c1534g.f6923s;
                                    arrayList.addAll(abstractC1676G2.subList(iIntValue, abstractC1676G2.size()));
                                }
                                i5++;
                            }
                            arrayList.addAll(abstractC1676G.subList(i5, abstractC1676G.size()));
                            iIntValue = 0;
                        }
                        if (c1537jM3831a.f6950n != -9223372036854775807L) {
                            if (iIntValue == -1) {
                                iIntValue = 0;
                            }
                            AbstractC1676G abstractC1676G3 = c1537jM3831a.f6955s;
                            if (iIntValue < abstractC1676G3.size()) {
                                arrayList.addAll(abstractC1676G3.subList(iIntValue, abstractC1676G3.size()));
                            }
                        }
                        listUnmodifiableList = Collections.unmodifiableList(arrayList);
                    }
                } else {
                    C1674E c1674e2 = AbstractC1676G.f7601h;
                    listUnmodifiableList = C1692X.f7629k;
                }
                interfaceC1974cArr[i3] = new C1501f(j4, listUnmodifiableList);
            } else {
                interfaceC1974cArr[i4] = InterfaceC1974c.f8611c;
                i3 = i4;
            }
            i4 = i3 + 1;
            c1504i = this;
            c1505j2 = c1505j;
            z3 = false;
        }
        return interfaceC1974cArr;
    }

    /* JADX INFO: renamed from: b */
    public final int m3751b(C1505j c1505j) {
        if (c1505j.f6705o == -1) {
            return 1;
        }
        C1537j c1537jM3831a = this.f6676g.m3831a(this.f6674e[this.f6677h.m1417a(c1505j.f8604d)], false);
        c1537jM3831a.getClass();
        int i3 = (int) (c1505j.f8610j - c1537jM3831a.f6947k);
        if (i3 < 0) {
            return 1;
        }
        AbstractC1676G abstractC1676G = c1537jM3831a.f6954r;
        AbstractC1676G abstractC1676G2 = i3 < abstractC1676G.size() ? ((C1534g) abstractC1676G.get(i3)).f6923s : c1537jM3831a.f6955s;
        int size = abstractC1676G2.size();
        int i4 = c1505j.f6705o;
        if (i4 >= size) {
            return 2;
        }
        C1532e c1532e = (C1532e) abstractC1676G2.get(i4);
        if (c1532e.f6918s) {
            return 0;
        }
        return Objects.equals(Uri.parse(AbstractC0646n.m1644v(c1537jM3831a.f6977a, c1532e.f6924g)), c1505j.f8602b.f2735a) ? 1 : 2;
    }

    /* JADX INFO: renamed from: c */
    public final Pair m3752c(C1505j c1505j, boolean z3, C1537j c1537j, long j3, long j4) {
        boolean z4 = true;
        int i3 = -1;
        if (c1505j != null && !z3) {
            boolean z5 = c1505j.f6697H;
            long j5 = c1505j.f8610j;
            int i4 = c1505j.f6705o;
            if (!z5) {
                return new Pair(Long.valueOf(j5), Integer.valueOf(i4));
            }
            if (i4 == -1) {
                j5 = j5 != -1 ? j5 + 1 : -1L;
            }
            return new Pair(Long.valueOf(j5), Integer.valueOf(i4 != -1 ? i4 + 1 : -1));
        }
        long j6 = j3 + c1537j.f6957u;
        long j7 = (c1505j == null || this.f6685p) ? j4 : c1505j.f8607g;
        boolean z6 = c1537j.f6951o;
        long j8 = c1537j.f6947k;
        AbstractC1676G abstractC1676G = c1537j.f6954r;
        if (!z6 && j7 >= j6) {
            return new Pair(Long.valueOf(j8 + ((long) abstractC1676G.size())), -1);
        }
        long j9 = j7 - j3;
        Long lValueOf = Long.valueOf(j9);
        if (this.f6676g.f6915s && c1505j != null) {
            z4 = false;
        }
        int iM1584c = AbstractC0632A.m1584c(abstractC1676G, lValueOf, z4);
        long j10 = ((long) iM1584c) + j8;
        if (iM1584c >= 0) {
            C1534g c1534g = (C1534g) abstractC1676G.get(iM1584c);
            long j11 = c1534g.f6928k + c1534g.f6926i;
            AbstractC1676G abstractC1676G2 = c1537j.f6955s;
            AbstractC1676G abstractC1676G3 = j9 < j11 ? c1534g.f6923s : abstractC1676G2;
            for (int i5 = 0; i5 < abstractC1676G3.size(); i5++) {
                C1532e c1532e = (C1532e) abstractC1676G3.get(i5);
                if (j9 < c1532e.f6928k + c1532e.f6926i) {
                    if (!c1532e.f6917r) {
                        break;
                    }
                    j10 += abstractC1676G3 != abstractC1676G2 ? 0L : 1L;
                    i3 = i5;
                    break;
                }
            }
        }
        return new Pair(Long.valueOf(j10), Integer.valueOf(i3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final C1500e m3753d(Uri uri, int i3, boolean z3) {
        if (uri == null) {
            return null;
        }
        C1447t c1447t = this.f6679j;
        byte[] bArr = (byte[]) ((C1499d) c1447t.f6406h).remove(uri);
        if (bArr != null) {
            return null;
        }
        C0715l c0715l = new C0715l(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, 1);
        C0583o c0583o = this.f6675f[i3];
        int iMo3747g = this.f6686q.mo3747g();
        Object objMo3749n = this.f6686q.mo3749n();
        byte[] bArr2 = this.f6682m;
        C1500e c1500e = new C1500e(this.f6672c, c0715l, 3, c0583o, iMo3747g, objMo3749n, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = AbstractC0632A.f2459f;
        }
        c1500e.f6658j = bArr2;
        return c1500e;
    }
}

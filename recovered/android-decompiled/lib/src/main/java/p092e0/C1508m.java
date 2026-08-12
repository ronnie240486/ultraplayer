package p092e0;

import com.google.android.gms.internal.cast.AbstractC1303m;
import com.google.android.gms.internal.cast.C1258a2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import p009D0.C0106b;
import p036M0.C0380q;
import p045P0.AbstractC0462h;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p073Z.C0771f;
import p082b0.C1061b;
import p088d0.C1383g;
import p088d0.InterfaceC1384h;
import p114k0.C1963w;
import p114k0.InterfaceC1931Z;

/* JADX INFO: renamed from: e0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1508m implements InterfaceC1931Z {

    /* JADX INFO: renamed from: g */
    public final int f6752g;

    /* JADX INFO: renamed from: h */
    public final C1512q f6753h;

    /* JADX INFO: renamed from: i */
    public int f6754i = -1;

    public C1508m(C1512q c1512q, int i3) {
        this.f6753h = c1512q;
        this.f6752g = i3;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    /* JADX INFO: renamed from: a */
    public final void m3784a() {
        AbstractC0646n.m1625c(this.f6754i == -1);
        C1512q c1512q = this.f6753h;
        c1512q.m3806v();
        c1512q.f6783Q.getClass();
        int[] iArr = c1512q.f6783Q;
        int i3 = this.f6752g;
        int i4 = iArr[i3];
        if (i4 != -1) {
            boolean[] zArr = c1512q.f6786T;
            if (zArr[i4]) {
                i4 = -2;
            } else {
                zArr[i4] = true;
            }
        } else if (c1512q.f6782P.contains(c1512q.f6781O.m4499a(i3))) {
            i4 = -3;
        } else {
            i4 = -2;
        }
        this.f6754i = i4;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3785b() {
        int i3 = this.f6754i;
        return (i3 == -1 || i3 == -3 || i3 == -2) ? false : true;
    }

    @Override // p114k0.InterfaceC1931Z
    /* JADX INFO: renamed from: h */
    public final boolean mo3786h() {
        if (this.f6754i == -3) {
            return true;
        }
        if (!m3785b()) {
            return false;
        }
        int i3 = this.f6754i;
        C1512q c1512q = this.f6753h;
        return !c1512q.m3795C() && c1512q.f6768B[i3].m4478u(c1512q.f6792Z);
    }

    @Override // p114k0.InterfaceC1931Z
    /* JADX INFO: renamed from: n */
    public final int mo3787n(C0106b c0106b, C0771f c0771f, int i3) {
        C0583o c0583o;
        if (this.f6754i == -3) {
            c0771f.m1786a(4);
            return -4;
        }
        if (m3785b()) {
            int i4 = this.f6754i;
            C1512q c1512q = this.f6753h;
            if (!c1512q.m3795C()) {
                ArrayList arrayList = c1512q.f6810t;
                int i5 = 0;
                if (!arrayList.isEmpty()) {
                    int i6 = 0;
                    loop0: while (i6 < arrayList.size() - 1) {
                        int i7 = ((C1505j) arrayList.get(i6)).f6701k;
                        int length = c1512q.f6768B.length;
                        for (int i8 = 0; i8 < length; i8++) {
                            if (c1512q.f6786T[i8] && c1512q.f6768B[i8].m4481x() == i7) {
                                break loop0;
                            }
                        }
                        i6++;
                    }
                    int i9 = AbstractC0632A.f2454a;
                    if (i6 > arrayList.size() || i6 < 0) {
                        throw new IllegalArgumentException();
                    }
                    if (i6 != 0) {
                        arrayList.subList(0, i6).clear();
                    }
                    C1505j c1505j = (C1505j) arrayList.get(0);
                    C0583o c0583o2 = c1505j.f8604d;
                    if (!c0583o2.equals(c1512q.f6779M)) {
                        C0380q c0380q = c1512q.f6807q;
                        c0380q.m1043c(new C1061b(c0380q, 2, new C1963w(1, c1512q.f6798h, c0583o2, c1505j.f8605e, c1505j.f8606f, AbstractC0632A.m1581V(c1505j.f8607g), -9223372036854775807L)));
                    }
                    c1512q.f6779M = c0583o2;
                }
                if (arrayList.isEmpty() || ((C1505j) arrayList.get(0)).f6700K) {
                    int iM4482y = c1512q.f6768B[i4].m4482y(c0106b, c0771f, i3, c1512q.f6792Z);
                    if (iM4482y == -5) {
                        C0583o c0583oM1449d = (C0583o) c0106b.f141i;
                        c0583oM1449d.getClass();
                        if (i4 == c1512q.f6774H) {
                            int iM3312e = AbstractC1303m.m3312e(c1512q.f6768B[i4].m4481x());
                            while (i5 < arrayList.size() && ((C1505j) arrayList.get(i5)).f6701k != iM3312e) {
                                i5++;
                            }
                            if (i5 < arrayList.size()) {
                                c0583o = ((C1505j) arrayList.get(i5)).f8604d;
                            } else {
                                c0583o = c1512q.f6778L;
                                c0583o.getClass();
                            }
                            c0583oM1449d = c0583oM1449d.m1449d(c0583o);
                        }
                        c0106b.f141i = c0583oM1449d;
                    }
                    return iM4482y;
                }
            }
        }
        return -3;
    }

    @Override // p114k0.InterfaceC1931Z
    /* JADX INFO: renamed from: u */
    public final void mo3788u() throws IOException {
        int i3 = this.f6754i;
        C1512q c1512q = this.f6753h;
        if (i3 == -2) {
            c1512q.m3806v();
            throw new C1258a2(AbstractC0462h.m1166f("Unable to bind a sample queue to TrackGroup with MIME type ", c1512q.f6781O.m4499a(this.f6752g).f1995d[0].f2154n, "."));
        }
        if (i3 == -1) {
            c1512q.m3797E();
            return;
        }
        if (i3 != -3) {
            c1512q.m3797E();
            C1511p c1511p = c1512q.f6768B[i3];
            InterfaceC1384h interfaceC1384h = c1511p.f8456h;
            if (interfaceC1384h == null || interfaceC1384h.mo3460a() != 1) {
                return;
            }
            C1383g c1383gMo3466g = c1511p.f8456h.mo3466g();
            c1383gMo3466g.getClass();
            throw c1383gMo3466g;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    @Override // p114k0.InterfaceC1931Z
    /* JADX INFO: renamed from: v */
    public final int mo3789v(long j3) {
        Object next;
        Object obj;
        if (!m3785b()) {
            return 0;
        }
        int i3 = this.f6754i;
        C1512q c1512q = this.f6753h;
        if (c1512q.m3795C()) {
            return 0;
        }
        C1511p c1511p = c1512q.f6768B[i3];
        int iM4476s = c1511p.m4476s(j3, c1512q.f6792Z);
        ArrayList arrayList = c1512q.f6810t;
        if (arrayList == null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
                obj = next;
            } else {
                obj = null;
            }
        } else if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(arrayList.size() - 1);
        }
        C1505j c1505j = (C1505j) obj;
        if (c1505j != null && !c1505j.f6700K) {
            iM4476s = Math.min(iM4476s, c1505j.m3756e(i3) - c1511p.m4474q());
        }
        c1511p.m4464D(iM4476s);
        return iM4476s;
    }
}

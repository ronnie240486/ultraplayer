package p077a0;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import p055T.AbstractC0558V;
import p055T.C0556T;
import p055T.C0557U;
import p064W.AbstractC0632A;
import p114k0.C1937c0;

/* JADX INFO: renamed from: a0.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0828g0 extends AbstractC0558V {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f3494k = 0;

    /* JADX INFO: renamed from: b */
    public final int f3495b;

    /* JADX INFO: renamed from: c */
    public final C1937c0 f3496c;

    /* JADX INFO: renamed from: d */
    public final int f3497d;

    /* JADX INFO: renamed from: e */
    public final int f3498e;

    /* JADX INFO: renamed from: f */
    public final int[] f3499f;

    /* JADX INFO: renamed from: g */
    public final int[] f3500g;

    /* JADX INFO: renamed from: h */
    public final AbstractC0558V[] f3501h;

    /* JADX INFO: renamed from: i */
    public final Object[] f3502i;

    /* JADX INFO: renamed from: j */
    public final HashMap f3503j;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0828g0(ArrayList arrayList, C1937c0 c1937c0) {
        AbstractC0558V[] abstractC0558VArr = new AbstractC0558V[arrayList.size()];
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            abstractC0558VArr[i4] = ((InterfaceC0806Q) obj).mo1906b();
            i4++;
        }
        Object[] objArr = new Object[arrayList.size()];
        int size2 = arrayList.size();
        int i6 = 0;
        while (i6 < size2) {
            Object obj2 = arrayList.get(i6);
            i6++;
            objArr[i3] = ((InterfaceC0806Q) obj2).mo1905a();
            i3++;
        }
        this(abstractC0558VArr, objArr, c1937c0);
    }

    @Override // p055T.AbstractC0558V
    /* JADX INFO: renamed from: a */
    public final int mo1406a(boolean z3) {
        if (this.f3495b != 0) {
            int iM2100q = 0;
            if (z3) {
                int[] iArr = this.f3496c.f8486b;
                iM2100q = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                AbstractC0558V[] abstractC0558VArr = this.f3501h;
                if (!abstractC0558VArr[iM2100q].m1415p()) {
                    return abstractC0558VArr[iM2100q].mo1406a(z3) + this.f3500g[iM2100q];
                }
                iM2100q = m2100q(iM2100q, z3);
            } while (iM2100q != -1);
        }
        return -1;
    }

    @Override // p055T.AbstractC0558V
    /* JADX INFO: renamed from: b */
    public final int mo1328b(Object obj) {
        int iMo1328b;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.f3503j.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iMo1328b = this.f3501h[iIntValue].mo1328b(obj3)) != -1) {
                return this.f3499f[iIntValue] + iMo1328b;
            }
        }
        return -1;
    }

    @Override // p055T.AbstractC0558V
    /* JADX INFO: renamed from: c */
    public final int mo1407c(boolean z3) {
        int iM2101r;
        int i3 = this.f3495b;
        if (i3 != 0) {
            if (z3) {
                int[] iArr = this.f3496c.f8486b;
                iM2101r = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iM2101r = i3 - 1;
            }
            do {
                AbstractC0558V[] abstractC0558VArr = this.f3501h;
                if (!abstractC0558VArr[iM2101r].m1415p()) {
                    return abstractC0558VArr[iM2101r].mo1407c(z3) + this.f3500g[iM2101r];
                }
                iM2101r = m2101r(iM2101r, z3);
            } while (iM2101r != -1);
        }
        return -1;
    }

    @Override // p055T.AbstractC0558V
    /* JADX INFO: renamed from: e */
    public final int mo1409e(int i3, int i4, boolean z3) {
        int[] iArr = this.f3500g;
        int iM1585d = AbstractC0632A.m1585d(iArr, i3 + 1, false, false);
        int i5 = iArr[iM1585d];
        AbstractC0558V[] abstractC0558VArr = this.f3501h;
        int iMo1409e = abstractC0558VArr[iM1585d].mo1409e(i3 - i5, i4 != 2 ? i4 : 0, z3);
        if (iMo1409e != -1) {
            return i5 + iMo1409e;
        }
        int iM2100q = m2100q(iM1585d, z3);
        while (iM2100q != -1 && abstractC0558VArr[iM2100q].m1415p()) {
            iM2100q = m2100q(iM2100q, z3);
        }
        if (iM2100q != -1) {
            return abstractC0558VArr[iM2100q].mo1406a(z3) + iArr[iM2100q];
        }
        if (i4 == 2) {
            return mo1406a(z3);
        }
        return -1;
    }

    @Override // p055T.AbstractC0558V
    /* JADX INFO: renamed from: f */
    public final C0556T mo1329f(int i3, C0556T c0556t, boolean z3) {
        int[] iArr = this.f3499f;
        int iM1585d = AbstractC0632A.m1585d(iArr, i3 + 1, false, false);
        int i4 = this.f3500g[iM1585d];
        this.f3501h[iM1585d].mo1329f(i3 - iArr[iM1585d], c0556t, z3);
        c0556t.f1968c += i4;
        if (z3) {
            Object obj = this.f3502i[iM1585d];
            Object obj2 = c0556t.f1967b;
            obj2.getClass();
            c0556t.f1967b = Pair.create(obj, obj2);
        }
        return c0556t;
    }

    @Override // p055T.AbstractC0558V
    /* JADX INFO: renamed from: g */
    public final C0556T mo1410g(Object obj, C0556T c0556t) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f3503j.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i3 = this.f3500g[iIntValue];
        this.f3501h[iIntValue].mo1410g(obj3, c0556t);
        c0556t.f1968c += i3;
        c0556t.f1967b = obj;
        return c0556t;
    }

    @Override // p055T.AbstractC0558V
    /* JADX INFO: renamed from: h */
    public final int mo1330h() {
        return this.f3498e;
    }

    @Override // p055T.AbstractC0558V
    /* JADX INFO: renamed from: k */
    public final int mo1413k(int i3, int i4, boolean z3) {
        int[] iArr = this.f3500g;
        int iM1585d = AbstractC0632A.m1585d(iArr, i3 + 1, false, false);
        int i5 = iArr[iM1585d];
        AbstractC0558V[] abstractC0558VArr = this.f3501h;
        int iMo1413k = abstractC0558VArr[iM1585d].mo1413k(i3 - i5, i4 != 2 ? i4 : 0, z3);
        if (iMo1413k != -1) {
            return i5 + iMo1413k;
        }
        int iM2101r = m2101r(iM1585d, z3);
        while (iM2101r != -1 && abstractC0558VArr[iM2101r].m1415p()) {
            iM2101r = m2101r(iM2101r, z3);
        }
        if (iM2101r != -1) {
            return abstractC0558VArr[iM2101r].mo1407c(z3) + iArr[iM2101r];
        }
        if (i4 == 2) {
            return mo1407c(z3);
        }
        return -1;
    }

    @Override // p055T.AbstractC0558V
    /* JADX INFO: renamed from: l */
    public final Object mo1331l(int i3) {
        int[] iArr = this.f3499f;
        int iM1585d = AbstractC0632A.m1585d(iArr, i3 + 1, false, false);
        return Pair.create(this.f3502i[iM1585d], this.f3501h[iM1585d].mo1331l(i3 - iArr[iM1585d]));
    }

    @Override // p055T.AbstractC0558V
    /* JADX INFO: renamed from: m */
    public final C0557U mo1332m(int i3, C0557U c0557u, long j3) {
        int[] iArr = this.f3500g;
        int iM1585d = AbstractC0632A.m1585d(iArr, i3 + 1, false, false);
        int i4 = iArr[iM1585d];
        int i5 = this.f3499f[iM1585d];
        this.f3501h[iM1585d].mo1332m(i3 - i4, c0557u, j3);
        Object objCreate = this.f3502i[iM1585d];
        if (!C0557U.f1973q.equals(c0557u.f1975a)) {
            objCreate = Pair.create(objCreate, c0557u.f1975a);
        }
        c0557u.f1975a = objCreate;
        c0557u.f1988n += i5;
        c0557u.f1989o += i5;
        return c0557u;
    }

    @Override // p055T.AbstractC0558V
    /* JADX INFO: renamed from: o */
    public final int mo1333o() {
        return this.f3497d;
    }

    /* JADX INFO: renamed from: q */
    public final int m2100q(int i3, boolean z3) {
        if (!z3) {
            if (i3 < this.f3495b - 1) {
                return i3 + 1;
            }
            return -1;
        }
        C1937c0 c1937c0 = this.f3496c;
        int i4 = c1937c0.f8487c[i3] + 1;
        int[] iArr = c1937c0.f8486b;
        if (i4 < iArr.length) {
            return iArr[i4];
        }
        return -1;
    }

    /* JADX INFO: renamed from: r */
    public final int m2101r(int i3, boolean z3) {
        if (!z3) {
            if (i3 > 0) {
                return i3 - 1;
            }
            return -1;
        }
        C1937c0 c1937c0 = this.f3496c;
        int i4 = c1937c0.f8487c[i3] - 1;
        if (i4 >= 0) {
            return c1937c0.f8486b[i4];
        }
        return -1;
    }

    public C0828g0(AbstractC0558V[] abstractC0558VArr, Object[] objArr, C1937c0 c1937c0) {
        this.f3496c = c1937c0;
        this.f3495b = c1937c0.f8486b.length;
        int length = abstractC0558VArr.length;
        this.f3501h = abstractC0558VArr;
        this.f3499f = new int[length];
        this.f3500g = new int[length];
        this.f3502i = objArr;
        this.f3503j = new HashMap();
        int length2 = abstractC0558VArr.length;
        int i3 = 0;
        int iMo1333o = 0;
        int iMo1330h = 0;
        int i4 = 0;
        while (i3 < length2) {
            AbstractC0558V abstractC0558V = abstractC0558VArr[i3];
            this.f3501h[i4] = abstractC0558V;
            this.f3500g[i4] = iMo1333o;
            this.f3499f[i4] = iMo1330h;
            iMo1333o += abstractC0558V.mo1333o();
            iMo1330h += this.f3501h[i4].mo1330h();
            this.f3503j.put(objArr[i4], Integer.valueOf(i4));
            i3++;
            i4++;
        }
        this.f3497d = iMo1333o;
        this.f3498e = iMo1330h;
    }
}

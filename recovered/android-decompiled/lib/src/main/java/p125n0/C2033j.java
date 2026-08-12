package p125n0;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import java.util.Objects;
import p045P0.AbstractC0462h;
import p055T.C0562Z;
import p055T.C0564a0;
import p064W.AbstractC0632A;
import p114k0.C1945g0;

/* JADX INFO: renamed from: n0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2033j extends C0564a0 {

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ int f8857C = 0;

    /* JADX INFO: renamed from: A */
    public final SparseArray f8858A;

    /* JADX INFO: renamed from: B */
    public final SparseBooleanArray f8859B;

    /* JADX INFO: renamed from: t */
    public final boolean f8860t;

    /* JADX INFO: renamed from: u */
    public final boolean f8861u;

    /* JADX INFO: renamed from: v */
    public final boolean f8862v;

    /* JADX INFO: renamed from: w */
    public final boolean f8863w;

    /* JADX INFO: renamed from: x */
    public final boolean f8864x;

    /* JADX INFO: renamed from: y */
    public final boolean f8865y;

    /* JADX INFO: renamed from: z */
    public final boolean f8866z;

    static {
        new C2033j(new C2032i());
        AbstractC0632A.m1566G(1000);
        AbstractC0632A.m1566G(1001);
        AbstractC0632A.m1566G(1002);
        AbstractC0632A.m1566G(1003);
        AbstractC0462h.m1167g(1004, 1005, 1006, 1007, 1008);
        AbstractC0462h.m1167g(1009, 1010, 1011, 1012, 1013);
        AbstractC0462h.m1167g(1014, 1015, 1016, 1017, 1018);
    }

    public C2033j(C2032i c2032i) {
        super(c2032i);
        this.f8860t = c2032i.f8849s;
        this.f8861u = c2032i.f8850t;
        this.f8862v = c2032i.f8851u;
        this.f8863w = c2032i.f8852v;
        this.f8864x = c2032i.f8853w;
        this.f8865y = c2032i.f8854x;
        this.f8866z = c2032i.f8855y;
        this.f8858A = c2032i.f8856z;
        this.f8859B = c2032i.f8848A;
    }

    @Override // p055T.C0564a0
    /* JADX INFO: renamed from: a */
    public final C0562Z mo1429a() {
        return new C2032i(this);
    }

    @Override // p055T.C0564a0
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && C2033j.class == obj.getClass()) {
                C2033j c2033j = (C2033j) obj;
                if (super.equals(c2033j) && this.f8860t == c2033j.f8860t && this.f8861u == c2033j.f8861u && this.f8862v == c2033j.f8862v && this.f8863w == c2033j.f8863w && this.f8864x == c2033j.f8864x && this.f8865y == c2033j.f8865y && this.f8866z == c2033j.f8866z) {
                    SparseBooleanArray sparseBooleanArray = this.f8859B;
                    int size = sparseBooleanArray.size();
                    SparseBooleanArray sparseBooleanArray2 = c2033j.f8859B;
                    if (sparseBooleanArray2.size() == size) {
                        for (int i3 = 0; i3 < size; i3++) {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i3)) >= 0) {
                            }
                        }
                        SparseArray sparseArray = this.f8858A;
                        int size2 = sparseArray.size();
                        SparseArray sparseArray2 = c2033j.f8858A;
                        if (sparseArray2.size() == size2) {
                            for (int i4 = 0; i4 < size2; i4++) {
                                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i4));
                                if (iIndexOfKey >= 0) {
                                    Map map = (Map) sparseArray.valueAt(i4);
                                    Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                    if (map2.size() == map.size()) {
                                        for (Map.Entry entry : map.entrySet()) {
                                            C1945g0 c1945g0 = (C1945g0) entry.getKey();
                                            if (map2.containsKey(c1945g0)) {
                                                Object value = entry.getValue();
                                                Object obj2 = map2.get(c1945g0);
                                                int i5 = AbstractC0632A.f2454a;
                                                if (!Objects.equals(value, obj2)) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // p055T.C0564a0
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f8860t ? 1 : 0)) * 961) + (this.f8861u ? 1 : 0)) * 961) + (this.f8862v ? 1 : 0)) * 28629151) + (this.f8863w ? 1 : 0)) * 31) + (this.f8864x ? 1 : 0)) * 31) + (this.f8865y ? 1 : 0)) * 961) + (this.f8866z ? 1 : 0)) * 31;
    }
}

package p055T;

import android.util.SparseBooleanArray;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: T.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0581m {

    /* JADX INFO: renamed from: a */
    public final SparseBooleanArray f2090a;

    public C0581m(SparseBooleanArray sparseBooleanArray) {
        this.f2090a = sparseBooleanArray;
    }

    /* JADX INFO: renamed from: a */
    public final int m1445a(int i3) {
        SparseBooleanArray sparseBooleanArray = this.f2090a;
        AbstractC0646n.m1628f(i3, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0581m)) {
            return false;
        }
        C0581m c0581m = (C0581m) obj;
        int i3 = AbstractC0632A.f2454a;
        SparseBooleanArray sparseBooleanArray = this.f2090a;
        if (i3 >= 24) {
            return sparseBooleanArray.equals(c0581m.f2090a);
        }
        if (sparseBooleanArray.size() != c0581m.f2090a.size()) {
            return false;
        }
        for (int i4 = 0; i4 < sparseBooleanArray.size(); i4++) {
            if (m1445a(i4) != c0581m.m1445a(i4)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i3 = AbstractC0632A.f2454a;
        SparseBooleanArray sparseBooleanArray = this.f2090a;
        if (i3 >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i4 = 0; i4 < sparseBooleanArray.size(); i4++) {
            size = (size * 31) + m1445a(i4);
        }
        return size;
    }
}

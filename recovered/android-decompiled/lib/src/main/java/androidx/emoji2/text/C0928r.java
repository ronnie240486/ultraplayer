package androidx.emoji2.text;

import android.util.SparseArray;

/* JADX INFO: renamed from: androidx.emoji2.text.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0928r {

    /* JADX INFO: renamed from: a */
    public final SparseArray f4032a;

    /* JADX INFO: renamed from: b */
    public C0931u f4033b;

    public C0928r(int i3) {
        this.f4032a = new SparseArray(i3);
    }

    /* JADX INFO: renamed from: a */
    public final void m2420a(C0931u c0931u, int i3, int i4) {
        int iM2426a = c0931u.m2426a(i3);
        SparseArray sparseArray = this.f4032a;
        C0928r c0928r = sparseArray == null ? null : (C0928r) sparseArray.get(iM2426a);
        if (c0928r == null) {
            c0928r = new C0928r(1);
            sparseArray.put(c0931u.m2426a(i3), c0928r);
        }
        if (i4 > i3) {
            c0928r.m2420a(c0931u, i3 + 1, i4);
        } else {
            c0928r.f4033b = c0931u;
        }
    }
}

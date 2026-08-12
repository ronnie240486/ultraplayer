package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.L2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1200L2 {

    /* JADX INFO: renamed from: e */
    public static final C1200L2 f5654e = new C1200L2(new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public final int[] f5655a;

    /* JADX INFO: renamed from: b */
    public final Object[] f5656b;

    /* JADX INFO: renamed from: c */
    public int f5657c = -1;

    /* JADX INFO: renamed from: d */
    public boolean f5658d;

    public C1200L2(int[] iArr, Object[] objArr, boolean z3) {
        this.f5655a = iArr;
        this.f5656b = objArr;
        this.f5658d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1200L2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 506991;
    }
}

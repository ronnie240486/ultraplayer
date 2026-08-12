package p147s2;

import com.google.android.gms.internal.cast.AbstractC1303m;
import p163x2.AbstractC2364c;

/* JADX INFO: renamed from: s2.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2256b extends AbstractC1303m {
    /* JADX INFO: renamed from: e0 */
    public static final void m4850e0(int i3, int i4, int i5, Object[] objArr, Object[] objArr2) {
        AbstractC2364c.m4954e(objArr, "<this>");
        AbstractC2364c.m4954e(objArr2, "destination");
        System.arraycopy(objArr, i4, objArr2, i3, i5 - i4);
    }
}

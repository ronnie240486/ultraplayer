package p104h1;

import android.util.SparseArray;
import java.util.Set;

/* JADX INFO: renamed from: h1.J */
/* JADX INFO: loaded from: classes.dex */
public final class C1626J {

    /* JADX INFO: renamed from: a */
    public SparseArray f7372a;

    /* JADX INFO: renamed from: b */
    public int f7373b;

    /* JADX INFO: renamed from: c */
    public Set f7374c;

    /* JADX INFO: renamed from: a */
    public final C1625I m4030a(int i3) {
        SparseArray sparseArray = this.f7372a;
        C1625I c1625i = (C1625I) sparseArray.get(i3);
        if (c1625i != null) {
            return c1625i;
        }
        C1625I c1625i2 = new C1625I();
        sparseArray.put(i3, c1625i2);
        return c1625i2;
    }
}

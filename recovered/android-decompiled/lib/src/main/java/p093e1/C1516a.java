package p093e1;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import p104h1.C1657n;

/* JADX INFO: renamed from: e1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1516a implements Comparator {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6836g;

    public /* synthetic */ C1516a(int i3) {
        this.f6836g = i3;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0026 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0028 A[RETURN, SYNTHETIC] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f6836g) {
            case 0:
                return ((C1517b) obj2).m3811b() - ((C1517b) obj).m3811b();
            default:
                C1657n c1657n = (C1657n) obj;
                C1657n c1657n2 = (C1657n) obj2;
                RecyclerView recyclerView = c1657n.f7547d;
                if ((recyclerView == null) != (c1657n2.f7547d == null)) {
                    if (recyclerView == null) {
                        return 1;
                    }
                    return -1;
                }
                boolean z3 = c1657n.f7544a;
                if (z3 != c1657n2.f7544a) {
                    if (z3) {
                        return -1;
                    }
                    return 1;
                }
                int i3 = c1657n2.f7545b - c1657n.f7545b;
                if (i3 != 0) {
                    return i3;
                }
                int i4 = c1657n.f7546c - c1657n2.f7546c;
                if (i4 != 0) {
                    return i4;
                }
                return 0;
        }
    }
}

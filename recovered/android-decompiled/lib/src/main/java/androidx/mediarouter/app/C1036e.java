package androidx.mediarouter.app;

import java.util.Comparator;
import p089d1.C1403C;

/* JADX INFO: renamed from: androidx.mediarouter.app.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1036e implements Comparator {

    /* JADX INFO: renamed from: h */
    public static final C1036e f4552h = new C1036e(0);

    /* JADX INFO: renamed from: i */
    public static final C1036e f4553i = new C1036e(1);

    /* JADX INFO: renamed from: j */
    public static final C1036e f4554j = new C1036e(2);

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4555g;

    public /* synthetic */ C1036e(int i3) {
        this.f4555g = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f4555g) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C1403C) obj).f6219d.compareToIgnoreCase(((C1403C) obj2).f6219d);
    }
}

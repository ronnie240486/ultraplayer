package p089d1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: d1.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1451x {

    /* JADX INFO: renamed from: c */
    public static final C1451x f6416c = new C1451x(new Bundle(), null);

    /* JADX INFO: renamed from: a */
    public final Bundle f6417a;

    /* JADX INFO: renamed from: b */
    public List f6418b;

    public C1451x(Bundle bundle, ArrayList arrayList) {
        this.f6417a = bundle;
        this.f6418b = arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static C1451x m3639b(Bundle bundle) {
        if (bundle != null) {
            return new C1451x(bundle, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m3640a() {
        if (this.f6418b == null) {
            ArrayList<String> stringArrayList = this.f6417a.getStringArrayList("controlCategories");
            this.f6418b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f6418b = Collections.EMPTY_LIST;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m3641c() {
        m3640a();
        return new ArrayList(this.f6418b);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3642d() {
        m3640a();
        return this.f6418b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1451x)) {
            return false;
        }
        C1451x c1451x = (C1451x) obj;
        m3640a();
        c1451x.m3640a();
        return this.f6418b.equals(c1451x.f6418b);
    }

    public final int hashCode() {
        m3640a();
        return this.f6418b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(m3641c().toArray()) + " }";
    }
}

package p089d1;

import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: d1.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1441n {

    /* JADX INFO: renamed from: a */
    public final Bundle f6383a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f6384b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f6385c;

    /* JADX INFO: renamed from: d */
    public final HashSet f6386d;

    public C1441n(String str, String str2) {
        this.f6384b = new ArrayList();
        this.f6385c = new ArrayList();
        this.f6386d = new HashSet();
        Bundle bundle = new Bundle();
        this.f6383a = bundle;
        if (str == null) {
            throw new NullPointerException("id must not be null");
        }
        bundle.putString("id", str);
        if (str2 == null) {
            throw new NullPointerException("name must not be null");
        }
        bundle.putString("name", str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m3605a(ArrayList arrayList) {
        if (arrayList == null) {
            throw new IllegalArgumentException("filters must not be null");
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            IntentFilter intentFilter = (IntentFilter) obj;
            if (intentFilter != null) {
                ArrayList arrayList2 = this.f6385c;
                if (!arrayList2.contains(intentFilter)) {
                    arrayList2.add(intentFilter);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final C1442o m3606b() {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f6385c);
        Bundle bundle = this.f6383a;
        bundle.putParcelableArrayList("controlFilters", arrayList);
        bundle.putStringArrayList("groupMemberIds", new ArrayList<>(this.f6384b));
        bundle.putStringArrayList("allowedPackages", new ArrayList<>(this.f6386d));
        return new C1442o(bundle);
    }

    public C1441n(C1442o c1442o) {
        this.f6384b = new ArrayList();
        this.f6385c = new ArrayList();
        this.f6386d = new HashSet();
        this.f6383a = new Bundle(c1442o.f6387a);
        this.f6384b = c1442o.m3609c();
        this.f6385c = c1442o.m3608b();
        this.f6386d = c1442o.m3607a();
    }
}

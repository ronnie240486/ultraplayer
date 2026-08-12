package p046P1;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p055T.C0581m;
import p064W.AbstractC0646n;
import p089d1.C1442o;

/* JADX INFO: renamed from: P1.D */
/* JADX INFO: loaded from: classes.dex */
public final class C0471D {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1564a;

    /* JADX INFO: renamed from: b */
    public boolean f1565b;

    /* JADX INFO: renamed from: c */
    public final Object f1566c;

    public C0471D(String str, boolean z3) {
        this.f1564a = 0;
        this.f1566c = str;
        this.f1565b = z3;
    }

    /* JADX INFO: renamed from: c */
    public static C0471D m1183c(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i3 = 0; i3 < parcelableArrayList.size(); i3++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i3);
                arrayList.add(bundle2 != null ? new C1442o(bundle2) : null);
            }
        }
        return new C0471D(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    /* JADX INFO: renamed from: a */
    public void m1184a(int i3) {
        AbstractC0646n.m1630h(!this.f1565b);
        ((SparseBooleanArray) this.f1566c).append(i3, true);
    }

    /* JADX INFO: renamed from: b */
    public C0581m m1185b() {
        AbstractC0646n.m1630h(!this.f1565b);
        this.f1565b = true;
        return new C0581m((SparseBooleanArray) this.f1566c);
    }

    public String toString() {
        switch (this.f1564a) {
            case 2:
                StringBuilder sb = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = (List) this.f1566c;
                sb.append(Arrays.toString(list.toArray()));
                sb.append(", isValid=");
                int size = list.size();
                boolean z3 = false;
                for (int i3 = 0; i3 < size; i3++) {
                    C1442o c1442o = (C1442o) list.get(i3);
                    if (c1442o == null || !c1442o.m3611e()) {
                        sb.append(z3);
                        sb.append(" }");
                        return sb.toString();
                    }
                }
                z3 = true;
                sb.append(z3);
                sb.append(" }");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C0471D() {
        this.f1564a = 1;
        this.f1566c = new SparseBooleanArray();
    }

    public C0471D(ArrayList arrayList, boolean z3) {
        this.f1564a = 2;
        if (arrayList.isEmpty()) {
            this.f1566c = Collections.EMPTY_LIST;
        } else {
            this.f1566c = Collections.unmodifiableList(new ArrayList(arrayList));
        }
        this.f1565b = z3;
    }
}

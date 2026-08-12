package p089d1;

import android.content.ComponentName;
import java.util.ArrayList;
import p046P1.C0471D;

/* JADX INFO: renamed from: d1.B */
/* JADX INFO: loaded from: classes.dex */
public final class C1402B {

    /* JADX INFO: renamed from: a */
    public final AbstractC1449v f6211a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f6212b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final boolean f6213c;

    /* JADX INFO: renamed from: d */
    public final C1447t f6214d;

    /* JADX INFO: renamed from: e */
    public C0471D f6215e;

    public C1402B(AbstractC1449v abstractC1449v, boolean z3) {
        this.f6211a = abstractC1449v;
        this.f6214d = abstractC1449v.f6408b;
        this.f6213c = z3;
    }

    /* JADX INFO: renamed from: a */
    public final C1403C m3490a(String str) {
        ArrayList arrayList = this.f6212b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            C1403C c1403c = (C1403C) obj;
            if (c1403c.f6217b.equals(str)) {
                return c1403c;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.f6214d.f6406h).getPackageName() + " }";
    }
}

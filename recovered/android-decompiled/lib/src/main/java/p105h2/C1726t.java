package p105h2;

import java.util.Map;
import p122m1.AbstractC2003a;

/* JADX INFO: renamed from: h2.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1726t extends AbstractC1719m {

    /* JADX INFO: renamed from: g */
    public final Object f7705g;

    /* JADX INFO: renamed from: h */
    public int f7706h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1727u f7707i;

    public C1726t(C1727u c1727u, int i3) {
        this.f7707i = c1727u;
        Object obj = C1727u.f7708p;
        this.f7705g = c1727u.m4178i()[i3];
        this.f7706h = i3;
    }

    /* JADX INFO: renamed from: a */
    public final void m4169a() {
        int i3 = this.f7706h;
        Object obj = this.f7705g;
        C1727u c1727u = this.f7707i;
        if (i3 != -1 && i3 < c1727u.size()) {
            if (AbstractC2003a.m4538k(obj, c1727u.m4178i()[this.f7706h])) {
                return;
            }
        }
        Object obj2 = C1727u.f7708p;
        this.f7706h = c1727u.m4173d(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f7705g;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C1727u c1727u = this.f7707i;
        Map mapM4171b = c1727u.m4171b();
        if (mapM4171b != null) {
            return mapM4171b.get(this.f7705g);
        }
        m4169a();
        int i3 = this.f7706h;
        if (i3 == -1) {
            return null;
        }
        return c1727u.m4179j()[i3];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C1727u c1727u = this.f7707i;
        Map mapM4171b = c1727u.m4171b();
        Object obj2 = this.f7705g;
        if (mapM4171b != null) {
            return mapM4171b.put(obj2, obj);
        }
        m4169a();
        int i3 = this.f7706h;
        if (i3 == -1) {
            c1727u.put(obj2, obj);
            return null;
        }
        Object obj3 = c1727u.m4179j()[i3];
        c1727u.m4179j()[this.f7706h] = obj;
        return obj3;
    }
}

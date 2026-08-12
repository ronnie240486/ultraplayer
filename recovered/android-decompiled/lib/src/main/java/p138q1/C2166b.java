package p138q1;

import java.util.Collections;
import java.util.HashMap;
import p123m2.C2009c;
import p123m2.InterfaceC2010d;
import p123m2.InterfaceC2011e;
import p135p2.C2111a;
import p135p2.InterfaceC2114d;
import p154u1.C2298b;

/* JADX INFO: renamed from: q1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2166b implements InterfaceC2010d {

    /* JADX INFO: renamed from: a */
    public static final C2166b f9366a = new C2166b();

    /* JADX INFO: renamed from: b */
    public static final C2009c f9367b;

    static {
        C2111a c2111a = new C2111a(1);
        HashMap map = new HashMap();
        map.put(InterfaceC2114d.class, c2111a);
        f9367b = new C2009c("storageMetrics", Collections.unmodifiableMap(new HashMap(map)));
    }

    @Override // p123m2.InterfaceC2007a
    /* JADX INFO: renamed from: a */
    public final void mo4565a(Object obj, Object obj2) {
        ((InterfaceC2011e) obj2).mo4568d(f9367b, ((C2298b) obj).f9807a);
    }
}

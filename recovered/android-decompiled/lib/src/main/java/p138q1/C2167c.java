package p138q1;

import java.util.Collections;
import java.util.HashMap;
import p123m2.C2009c;
import p123m2.InterfaceC2010d;
import p123m2.InterfaceC2011e;
import p135p2.C2111a;
import p135p2.InterfaceC2114d;
import p154u1.C2300d;

/* JADX INFO: renamed from: q1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2167c implements InterfaceC2010d {

    /* JADX INFO: renamed from: a */
    public static final C2167c f9368a = new C2167c();

    /* JADX INFO: renamed from: b */
    public static final C2009c f9369b;

    /* JADX INFO: renamed from: c */
    public static final C2009c f9370c;

    static {
        C2111a c2111a = new C2111a(1);
        HashMap map = new HashMap();
        map.put(InterfaceC2114d.class, c2111a);
        f9369b = new C2009c("eventsDroppedCount", Collections.unmodifiableMap(new HashMap(map)));
        C2111a c2111a2 = new C2111a(3);
        HashMap map2 = new HashMap();
        map2.put(InterfaceC2114d.class, c2111a2);
        f9370c = new C2009c("reason", Collections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // p123m2.InterfaceC2007a
    /* JADX INFO: renamed from: a */
    public final void mo4565a(Object obj, Object obj2) {
        C2300d c2300d = (C2300d) obj;
        InterfaceC2011e interfaceC2011e = (InterfaceC2011e) obj2;
        interfaceC2011e.mo4567c(f9369b, c2300d.f9817a);
        interfaceC2011e.mo4568d(f9370c, c2300d.f9818b);
    }
}

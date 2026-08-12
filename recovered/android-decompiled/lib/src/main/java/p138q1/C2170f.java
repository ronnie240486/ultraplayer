package p138q1;

import java.util.Collections;
import java.util.HashMap;
import p123m2.C2009c;
import p123m2.InterfaceC2010d;
import p123m2.InterfaceC2011e;
import p135p2.C2111a;
import p135p2.InterfaceC2114d;
import p154u1.C2302f;

/* JADX INFO: renamed from: q1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2170f implements InterfaceC2010d {

    /* JADX INFO: renamed from: a */
    public static final C2170f f9375a = new C2170f();

    /* JADX INFO: renamed from: b */
    public static final C2009c f9376b;

    /* JADX INFO: renamed from: c */
    public static final C2009c f9377c;

    static {
        C2111a c2111a = new C2111a(1);
        HashMap map = new HashMap();
        map.put(InterfaceC2114d.class, c2111a);
        f9376b = new C2009c("currentCacheSizeBytes", Collections.unmodifiableMap(new HashMap(map)));
        C2111a c2111a2 = new C2111a(2);
        HashMap map2 = new HashMap();
        map2.put(InterfaceC2114d.class, c2111a2);
        f9377c = new C2009c("maxCacheSizeBytes", Collections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // p123m2.InterfaceC2007a
    /* JADX INFO: renamed from: a */
    public final void mo4565a(Object obj, Object obj2) {
        C2302f c2302f = (C2302f) obj;
        InterfaceC2011e interfaceC2011e = (InterfaceC2011e) obj2;
        interfaceC2011e.mo4567c(f9376b, c2302f.f9822a);
        interfaceC2011e.mo4567c(f9377c, c2302f.f9823b);
    }
}

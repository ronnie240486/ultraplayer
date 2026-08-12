package p138q1;

import java.util.Collections;
import java.util.HashMap;
import p123m2.C2009c;
import p123m2.InterfaceC2010d;
import p123m2.InterfaceC2011e;
import p135p2.C2111a;
import p135p2.InterfaceC2114d;
import p154u1.C2303g;

/* JADX INFO: renamed from: q1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2171g implements InterfaceC2010d {

    /* JADX INFO: renamed from: a */
    public static final C2171g f9378a = new C2171g();

    /* JADX INFO: renamed from: b */
    public static final C2009c f9379b;

    /* JADX INFO: renamed from: c */
    public static final C2009c f9380c;

    static {
        C2111a c2111a = new C2111a(1);
        HashMap map = new HashMap();
        map.put(InterfaceC2114d.class, c2111a);
        f9379b = new C2009c("startMs", Collections.unmodifiableMap(new HashMap(map)));
        C2111a c2111a2 = new C2111a(2);
        HashMap map2 = new HashMap();
        map2.put(InterfaceC2114d.class, c2111a2);
        f9380c = new C2009c("endMs", Collections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // p123m2.InterfaceC2007a
    /* JADX INFO: renamed from: a */
    public final void mo4565a(Object obj, Object obj2) {
        C2303g c2303g = (C2303g) obj;
        InterfaceC2011e interfaceC2011e = (InterfaceC2011e) obj2;
        interfaceC2011e.mo4567c(f9379b, c2303g.f9824a);
        interfaceC2011e.mo4567c(f9380c, c2303g.f9825b);
    }
}

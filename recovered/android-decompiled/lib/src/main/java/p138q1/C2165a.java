package p138q1;

import java.util.Collections;
import java.util.HashMap;
import p123m2.C2009c;
import p123m2.InterfaceC2010d;
import p123m2.InterfaceC2011e;
import p135p2.C2111a;
import p135p2.InterfaceC2114d;
import p154u1.C2297a;

/* JADX INFO: renamed from: q1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2165a implements InterfaceC2010d {

    /* JADX INFO: renamed from: a */
    public static final C2165a f9361a = new C2165a();

    /* JADX INFO: renamed from: b */
    public static final C2009c f9362b;

    /* JADX INFO: renamed from: c */
    public static final C2009c f9363c;

    /* JADX INFO: renamed from: d */
    public static final C2009c f9364d;

    /* JADX INFO: renamed from: e */
    public static final C2009c f9365e;

    static {
        C2111a c2111a = new C2111a(1);
        HashMap map = new HashMap();
        map.put(InterfaceC2114d.class, c2111a);
        f9362b = new C2009c("window", Collections.unmodifiableMap(new HashMap(map)));
        C2111a c2111a2 = new C2111a(2);
        HashMap map2 = new HashMap();
        map2.put(InterfaceC2114d.class, c2111a2);
        f9363c = new C2009c("logSourceMetrics", Collections.unmodifiableMap(new HashMap(map2)));
        C2111a c2111a3 = new C2111a(3);
        HashMap map3 = new HashMap();
        map3.put(InterfaceC2114d.class, c2111a3);
        f9364d = new C2009c("globalMetrics", Collections.unmodifiableMap(new HashMap(map3)));
        C2111a c2111a4 = new C2111a(4);
        HashMap map4 = new HashMap();
        map4.put(InterfaceC2114d.class, c2111a4);
        f9365e = new C2009c("appNamespace", Collections.unmodifiableMap(new HashMap(map4)));
    }

    @Override // p123m2.InterfaceC2007a
    /* JADX INFO: renamed from: a */
    public final void mo4565a(Object obj, Object obj2) {
        C2297a c2297a = (C2297a) obj;
        InterfaceC2011e interfaceC2011e = (InterfaceC2011e) obj2;
        interfaceC2011e.mo4568d(f9362b, c2297a.f9803a);
        interfaceC2011e.mo4568d(f9363c, c2297a.f9804b);
        interfaceC2011e.mo4568d(f9364d, c2297a.f9805c);
        interfaceC2011e.mo4568d(f9365e, c2297a.f9806d);
    }
}

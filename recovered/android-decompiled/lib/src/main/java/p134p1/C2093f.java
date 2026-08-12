package p134p1;

import p123m2.C2009c;
import p123m2.InterfaceC2010d;
import p123m2.InterfaceC2011e;

/* JADX INFO: renamed from: p1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2093f implements InterfaceC2010d {

    /* JADX INFO: renamed from: a */
    public static final C2093f f9092a = new C2093f();

    /* JADX INFO: renamed from: b */
    public static final C2009c f9093b = C2009c.m4566a("requestTimeMs");

    /* JADX INFO: renamed from: c */
    public static final C2009c f9094c = C2009c.m4566a("requestUptimeMs");

    /* JADX INFO: renamed from: d */
    public static final C2009c f9095d = C2009c.m4566a("clientInfo");

    /* JADX INFO: renamed from: e */
    public static final C2009c f9096e = C2009c.m4566a("logSource");

    /* JADX INFO: renamed from: f */
    public static final C2009c f9097f = C2009c.m4566a("logSourceName");

    /* JADX INFO: renamed from: g */
    public static final C2009c f9098g = C2009c.m4566a("logEvent");

    /* JADX INFO: renamed from: h */
    public static final C2009c f9099h = C2009c.m4566a("qosTier");

    @Override // p123m2.InterfaceC2007a
    /* JADX INFO: renamed from: a */
    public final void mo4565a(Object obj, Object obj2) {
        InterfaceC2011e interfaceC2011e = (InterfaceC2011e) obj2;
        C2099l c2099l = (C2099l) ((AbstractC2106s) obj);
        interfaceC2011e.mo4567c(f9093b, c2099l.f9124a);
        interfaceC2011e.mo4567c(f9094c, c2099l.f9125b);
        interfaceC2011e.mo4568d(f9095d, c2099l.f9126c);
        interfaceC2011e.mo4568d(f9096e, c2099l.f9127d);
        interfaceC2011e.mo4568d(f9097f, c2099l.f9128e);
        interfaceC2011e.mo4568d(f9098g, c2099l.f9129f);
        interfaceC2011e.mo4568d(f9099h, EnumC2110w.f9139g);
    }
}

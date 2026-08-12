package p134p1;

import p123m2.C2009c;
import p123m2.InterfaceC2010d;
import p123m2.InterfaceC2011e;

/* JADX INFO: renamed from: p1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2092e implements InterfaceC2010d {

    /* JADX INFO: renamed from: a */
    public static final C2092e f9084a = new C2092e();

    /* JADX INFO: renamed from: b */
    public static final C2009c f9085b = C2009c.m4566a("eventTimeMs");

    /* JADX INFO: renamed from: c */
    public static final C2009c f9086c = C2009c.m4566a("eventCode");

    /* JADX INFO: renamed from: d */
    public static final C2009c f9087d = C2009c.m4566a("eventUptimeMs");

    /* JADX INFO: renamed from: e */
    public static final C2009c f9088e = C2009c.m4566a("sourceExtension");

    /* JADX INFO: renamed from: f */
    public static final C2009c f9089f = C2009c.m4566a("sourceExtensionJsonProto3");

    /* JADX INFO: renamed from: g */
    public static final C2009c f9090g = C2009c.m4566a("timezoneOffsetSeconds");

    /* JADX INFO: renamed from: h */
    public static final C2009c f9091h = C2009c.m4566a("networkConnectionInfo");

    @Override // p123m2.InterfaceC2007a
    /* JADX INFO: renamed from: a */
    public final void mo4565a(Object obj, Object obj2) {
        InterfaceC2011e interfaceC2011e = (InterfaceC2011e) obj2;
        C2098k c2098k = (C2098k) ((AbstractC2105r) obj);
        interfaceC2011e.mo4567c(f9085b, c2098k.f9117a);
        interfaceC2011e.mo4568d(f9086c, c2098k.f9118b);
        interfaceC2011e.mo4567c(f9087d, c2098k.f9119c);
        interfaceC2011e.mo4568d(f9088e, c2098k.f9120d);
        interfaceC2011e.mo4568d(f9089f, c2098k.f9121e);
        interfaceC2011e.mo4567c(f9090g, c2098k.f9122f);
        interfaceC2011e.mo4568d(f9091h, c2098k.f9123g);
    }
}

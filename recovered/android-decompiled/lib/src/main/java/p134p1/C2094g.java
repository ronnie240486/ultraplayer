package p134p1;

import p123m2.C2009c;
import p123m2.InterfaceC2010d;
import p123m2.InterfaceC2011e;

/* JADX INFO: renamed from: p1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2094g implements InterfaceC2010d {

    /* JADX INFO: renamed from: a */
    public static final C2094g f9100a = new C2094g();

    /* JADX INFO: renamed from: b */
    public static final C2009c f9101b = C2009c.m4566a("networkType");

    /* JADX INFO: renamed from: c */
    public static final C2009c f9102c = C2009c.m4566a("mobileSubtype");

    @Override // p123m2.InterfaceC2007a
    /* JADX INFO: renamed from: a */
    public final void mo4565a(Object obj, Object obj2) {
        InterfaceC2011e interfaceC2011e = (InterfaceC2011e) obj2;
        C2101n c2101n = (C2101n) ((AbstractC2109v) obj);
        interfaceC2011e.mo4568d(f9101b, c2101n.f9131a);
        interfaceC2011e.mo4568d(f9102c, c2101n.f9132b);
    }
}

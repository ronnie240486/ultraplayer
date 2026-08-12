package p134p1;

import p123m2.C2009c;
import p123m2.InterfaceC2010d;
import p123m2.InterfaceC2011e;

/* JADX INFO: renamed from: p1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2091d implements InterfaceC2010d {

    /* JADX INFO: renamed from: a */
    public static final C2091d f9081a = new C2091d();

    /* JADX INFO: renamed from: b */
    public static final C2009c f9082b = C2009c.m4566a("clientType");

    /* JADX INFO: renamed from: c */
    public static final C2009c f9083c = C2009c.m4566a("androidClientInfo");

    @Override // p123m2.InterfaceC2007a
    /* JADX INFO: renamed from: a */
    public final void mo4565a(Object obj, Object obj2) {
        InterfaceC2011e interfaceC2011e = (InterfaceC2011e) obj2;
        C2097j c2097j = (C2097j) ((AbstractC2104q) obj);
        c2097j.getClass();
        interfaceC2011e.mo4568d(f9082b, EnumC2103p.f9133g);
        interfaceC2011e.mo4568d(f9083c, c2097j.f9116a);
    }
}

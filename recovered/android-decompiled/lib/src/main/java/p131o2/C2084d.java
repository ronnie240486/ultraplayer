package p131o2;

import java.util.Date;
import java.util.HashMap;
import p123m2.InterfaceC2010d;
import p123m2.InterfaceC2012f;
import p123m2.InterfaceC2013g;
import p127n2.InterfaceC2049a;

/* JADX INFO: renamed from: o2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2084d implements InterfaceC2049a {

    /* JADX INFO: renamed from: f */
    public static final C2082b f9046f;

    /* JADX INFO: renamed from: g */
    public static final C2082b f9047g;

    /* JADX INFO: renamed from: a */
    public final HashMap f9049a;

    /* JADX INFO: renamed from: b */
    public final HashMap f9050b;

    /* JADX INFO: renamed from: c */
    public final C2081a f9051c;

    /* JADX INFO: renamed from: d */
    public boolean f9052d;

    /* JADX INFO: renamed from: e */
    public static final C2081a f9045e = new C2081a(0);

    /* JADX INFO: renamed from: h */
    public static final C2083c f9048h = new C2083c();

    /* JADX WARN: Type inference failed for: r0v1, types: [o2.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [o2.b] */
    static {
        final int i3 = 0;
        f9046f = new InterfaceC2012f() { // from class: o2.b
            @Override // p123m2.InterfaceC2007a
            /* JADX INFO: renamed from: a */
            public final void mo4565a(Object obj, Object obj2) {
                switch (i3) {
                    case 0:
                        ((InterfaceC2013g) obj2).mo4569a((String) obj);
                        break;
                    default:
                        ((InterfaceC2013g) obj2).mo4570b(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i4 = 1;
        f9047g = new InterfaceC2012f() { // from class: o2.b
            @Override // p123m2.InterfaceC2007a
            /* JADX INFO: renamed from: a */
            public final void mo4565a(Object obj, Object obj2) {
                switch (i4) {
                    case 0:
                        ((InterfaceC2013g) obj2).mo4569a((String) obj);
                        break;
                    default:
                        ((InterfaceC2013g) obj2).mo4570b(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public C2084d() {
        HashMap map = new HashMap();
        this.f9049a = map;
        HashMap map2 = new HashMap();
        this.f9050b = map2;
        this.f9051c = f9045e;
        this.f9052d = false;
        map2.put(String.class, f9046f);
        map.remove(String.class);
        map2.put(Boolean.class, f9047g);
        map.remove(Boolean.class);
        map2.put(Date.class, f9048h);
        map.remove(Date.class);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC2049a m4645a(Class cls, InterfaceC2010d interfaceC2010d) {
        this.f9049a.put(cls, interfaceC2010d);
        this.f9050b.remove(cls);
        return this;
    }
}

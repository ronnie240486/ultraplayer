package p131o2;

import java.util.Map;
import p123m2.C2008b;
import p123m2.InterfaceC2010d;
import p123m2.InterfaceC2011e;
import p135p2.C2115e;

/* JADX INFO: renamed from: o2.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2081a implements InterfaceC2010d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9042a;

    @Override // p123m2.InterfaceC2007a
    /* JADX INFO: renamed from: a */
    public final void mo4565a(Object obj, Object obj2) {
        switch (this.f9042a) {
            case 0:
                throw new C2008b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC2011e interfaceC2011e = (InterfaceC2011e) obj2;
                interfaceC2011e.mo4568d(C2115e.f9146g, entry.getKey());
                interfaceC2011e.mo4568d(C2115e.f9147h, entry.getValue());
                return;
            default:
                throw new C2008b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}

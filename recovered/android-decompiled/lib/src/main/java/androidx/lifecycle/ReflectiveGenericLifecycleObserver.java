package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements InterfaceC1003p {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1004q f4300a;

    /* JADX INFO: renamed from: b */
    public final C0988a f4301b;

    public ReflectiveGenericLifecycleObserver(InterfaceC1004q interfaceC1004q) {
        this.f4300a = interfaceC1004q;
        C0990c c0990c = C0990c.f4308c;
        Class<?> cls = interfaceC1004q.getClass();
        C0988a c0988a = (C0988a) c0990c.f4309a.get(cls);
        this.f4301b = c0988a == null ? c0990c.m2562a(cls, null) : c0988a;
    }

    @Override // androidx.lifecycle.InterfaceC1003p
    /* JADX INFO: renamed from: b */
    public final void mo2288b(InterfaceC1005r interfaceC1005r, EnumC0999l enumC0999l) {
        HashMap map = this.f4301b.f4304a;
        List list = (List) map.get(enumC0999l);
        InterfaceC1004q interfaceC1004q = this.f4300a;
        C0988a.m2560a(list, interfaceC1005r, enumC0999l, interfaceC1004q);
        C0988a.m2560a((List) map.get(EnumC0999l.ON_ANY), interfaceC1005r, enumC0999l, interfaceC1004q);
    }
}

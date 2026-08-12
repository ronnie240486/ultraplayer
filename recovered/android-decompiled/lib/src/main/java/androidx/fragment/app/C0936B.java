package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0936B implements InterfaceC0935A {

    /* JADX INFO: renamed from: a */
    public final int f4049a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0937C f4050b;

    public C0936B(AbstractC0937C abstractC0937C, int i3) {
        this.f4050b = abstractC0937C;
        this.f4049a = i3;
    }

    @Override // androidx.fragment.app.InterfaceC0935A
    /* JADX INFO: renamed from: a */
    public final boolean mo2429a(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC0937C abstractC0937C = this.f4050b;
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = abstractC0937C.f4086w;
        int i3 = this.f4049a;
        if (abstractComponentCallbacksC0963n == null || i3 >= 0 || !abstractComponentCallbacksC0963n.m2533g().m2443M()) {
            return abstractC0937C.m2444N(arrayList, arrayList2, i3, 1);
        }
        return false;
    }
}

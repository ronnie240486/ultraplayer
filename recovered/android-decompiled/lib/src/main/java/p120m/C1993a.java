package p120m;

import java.util.HashMap;

/* JADX INFO: renamed from: m.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1993a extends C1998f {

    /* JADX INFO: renamed from: k */
    public final HashMap f8699k = new HashMap();

    @Override // p120m.C1998f
    /* JADX INFO: renamed from: e */
    public final C1995c mo4522e(Object obj) {
        return (C1995c) this.f8699k.get(obj);
    }

    @Override // p120m.C1998f
    /* JADX INFO: renamed from: g */
    public final Object mo4523g(Object obj) {
        Object objMo4523g = super.mo4523g(obj);
        this.f8699k.remove(obj);
        return objMo4523g;
    }
}

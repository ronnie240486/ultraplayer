package androidx.lifecycle;

import android.os.Bundle;
import androidx.activity.C0902l;
import java.util.Iterator;
import java.util.Map;
import p108i1.C1751d;
import p108i1.InterfaceC1750c;
import p143r2.C2205c;
import p163x2.AbstractC2364c;

/* JADX INFO: renamed from: androidx.lifecycle.G */
/* JADX INFO: loaded from: classes.dex */
public final class C0982G implements InterfaceC1750c {

    /* JADX INFO: renamed from: a */
    public final C1751d f4290a;

    /* JADX INFO: renamed from: b */
    public boolean f4291b;

    /* JADX INFO: renamed from: c */
    public Bundle f4292c;

    /* JADX INFO: renamed from: d */
    public final C2205c f4293d;

    public C0982G(C1751d c1751d, InterfaceC0987L interfaceC0987L) {
        AbstractC2364c.m4954e(c1751d, "savedStateRegistry");
        this.f4290a = c1751d;
        this.f4293d = new C2205c(new C0902l(2, interfaceC0987L));
    }

    @Override // p108i1.InterfaceC1750c
    /* JADX INFO: renamed from: a */
    public final Bundle mo2291a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4292c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = m2556b().f4294c.entrySet().iterator();
        if (!it.hasNext()) {
            this.f4291b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getValue().getClass();
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: b */
    public final C0983H m2556b() {
        return (C0983H) this.f4293d.m4778a();
    }
}

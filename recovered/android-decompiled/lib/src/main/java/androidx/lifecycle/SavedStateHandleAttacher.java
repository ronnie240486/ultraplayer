package androidx.lifecycle;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC1003p {

    /* JADX INFO: renamed from: a */
    public final C0982G f4302a;

    public SavedStateHandleAttacher(C0982G c0982g) {
        this.f4302a = c0982g;
    }

    @Override // androidx.lifecycle.InterfaceC1003p
    /* JADX INFO: renamed from: b */
    public final void mo2288b(InterfaceC1005r interfaceC1005r, EnumC0999l enumC0999l) {
        if (enumC0999l != EnumC0999l.ON_CREATE) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0999l).toString());
        }
        interfaceC1005r.mo2300e().m2570f(this);
        C0982G c0982g = this.f4302a;
        if (c0982g.f4291b) {
            return;
        }
        Bundle bundleM4206c = c0982g.f4290a.m4206c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = c0982g.f4292c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleM4206c != null) {
            bundle.putAll(bundleM4206c);
        }
        c0982g.f4292c = bundle;
        c0982g.f4291b = true;
        c0982g.m2556b();
    }
}

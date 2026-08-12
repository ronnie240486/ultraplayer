package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import p159w2.InterfaceC2320a;
import p163x2.AbstractC2364c;

/* JADX INFO: renamed from: androidx.activity.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0904n {

    /* JADX INFO: renamed from: a */
    public static final C0904n f3767a = new C0904n();

    /* JADX INFO: renamed from: a */
    public final OnBackInvokedCallback m2305a(InterfaceC2320a interfaceC2320a) {
        AbstractC2364c.m4954e(interfaceC2320a, "onBackInvoked");
        return new C0903m(0, interfaceC2320a);
    }

    /* JADX INFO: renamed from: b */
    public final void m2306b(Object obj, int i3, Object obj2) {
        AbstractC2364c.m4954e(obj, "dispatcher");
        AbstractC2364c.m4954e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i3, (OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: c */
    public final void m2307c(Object obj, Object obj2) {
        AbstractC2364c.m4954e(obj, "dispatcher");
        AbstractC2364c.m4954e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}

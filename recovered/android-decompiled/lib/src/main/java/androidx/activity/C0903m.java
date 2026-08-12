package androidx.activity;

import android.window.OnBackInvokedCallback;
import p091e.LayoutInflaterFactory2C1458C;
import p159w2.InterfaceC2320a;
import p163x2.AbstractC2364c;

/* JADX INFO: renamed from: androidx.activity.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0903m implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3765a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3766b;

    public /* synthetic */ C0903m(int i3, Object obj) {
        this.f3765a = i3;
        this.f3766b = obj;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        switch (this.f3765a) {
            case 0:
                InterfaceC2320a interfaceC2320a = (InterfaceC2320a) this.f3766b;
                AbstractC2364c.m4954e(interfaceC2320a, "$onBackInvoked");
                interfaceC2320a.mo2290a();
                break;
            case 1:
                ((LayoutInflaterFactory2C1458C) this.f3766b).m3649D();
                break;
            default:
                ((Runnable) this.f3766b).run();
                break;
        }
    }
}

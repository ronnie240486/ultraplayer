package androidx.activity;

import android.os.Build;
import androidx.fragment.app.C0970u;
import androidx.lifecycle.C1007t;
import androidx.lifecycle.EnumC0999l;
import androidx.lifecycle.InterfaceC1003p;
import androidx.lifecycle.InterfaceC1005r;
import p163x2.AbstractC2364c;

/* JADX INFO: loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements InterfaceC1003p, InterfaceC0891a {

    /* JADX INFO: renamed from: a */
    public final C1007t f3720a;

    /* JADX INFO: renamed from: b */
    public final C0970u f3721b;

    /* JADX INFO: renamed from: c */
    public C0905o f3722c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0906p f3723d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(C0906p c0906p, C1007t c1007t, C0970u c0970u) {
        AbstractC2364c.m4954e(c0970u, "onBackPressedCallback");
        this.f3723d = c0906p;
        this.f3720a = c1007t;
        this.f3721b = c0970u;
        c1007t.m2565a(this);
    }

    @Override // androidx.lifecycle.InterfaceC1003p
    /* JADX INFO: renamed from: b */
    public final void mo2288b(InterfaceC1005r interfaceC1005r, EnumC0999l enumC0999l) {
        if (enumC0999l != EnumC0999l.ON_START) {
            if (enumC0999l != EnumC0999l.ON_STOP) {
                if (enumC0999l == EnumC0999l.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                C0905o c0905o = this.f3722c;
                if (c0905o != null) {
                    c0905o.cancel();
                    return;
                }
                return;
            }
        }
        C0906p c0906p = this.f3723d;
        c0906p.getClass();
        C0970u c0970u = this.f3721b;
        AbstractC2364c.m4954e(c0970u, "onBackPressedCallback");
        c0906p.f3771b.addLast(c0970u);
        C0905o c0905o2 = new C0905o(c0906p, c0970u);
        c0970u.f4263b.add(c0905o2);
        if (Build.VERSION.SDK_INT >= 33) {
            c0906p.m2310c();
            c0970u.f4264c = c0906p.f3772c;
        }
        this.f3722c = c0905o2;
    }

    @Override // androidx.activity.InterfaceC0891a
    public final void cancel() {
        this.f3720a.m2570f(this);
        this.f3721b.f4263b.remove(this);
        C0905o c0905o = this.f3722c;
        if (c0905o != null) {
            c0905o.cancel();
        }
        this.f3722c = null;
    }
}

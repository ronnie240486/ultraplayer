package androidx.activity;

import android.os.Build;
import androidx.fragment.app.C0970u;
import p147s2.C2255a;
import p163x2.AbstractC2364c;

/* JADX INFO: renamed from: androidx.activity.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0905o implements InterfaceC0891a {

    /* JADX INFO: renamed from: a */
    public final C0970u f3768a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0906p f3769b;

    public C0905o(C0906p c0906p, C0970u c0970u) {
        AbstractC2364c.m4954e(c0970u, "onBackPressedCallback");
        this.f3769b = c0906p;
        this.f3768a = c0970u;
    }

    @Override // androidx.activity.InterfaceC0891a
    public final void cancel() {
        C0906p c0906p = this.f3769b;
        C2255a c2255a = c0906p.f3771b;
        C0970u c0970u = this.f3768a;
        c2255a.remove(c0970u);
        c0970u.f4263b.remove(this);
        if (Build.VERSION.SDK_INT >= 33) {
            c0970u.f4264c = null;
            c0906p.m2310c();
        }
    }
}

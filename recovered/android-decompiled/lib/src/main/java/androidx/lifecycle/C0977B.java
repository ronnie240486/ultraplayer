package androidx.lifecycle;

import android.os.Handler;
import androidx.activity.RunnableC0892b;
import p000A.C0031d;
import p163x2.AbstractC2364c;

/* JADX INFO: renamed from: androidx.lifecycle.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0977B implements InterfaceC1005r {

    /* JADX INFO: renamed from: o */
    public static final C0977B f4273o = new C0977B();

    /* JADX INFO: renamed from: g */
    public int f4274g;

    /* JADX INFO: renamed from: h */
    public int f4275h;

    /* JADX INFO: renamed from: k */
    public Handler f4278k;

    /* JADX INFO: renamed from: i */
    public boolean f4276i = true;

    /* JADX INFO: renamed from: j */
    public boolean f4277j = true;

    /* JADX INFO: renamed from: l */
    public final C1007t f4279l = new C1007t(this);

    /* JADX INFO: renamed from: m */
    public final RunnableC0892b f4280m = new RunnableC0892b(4, this);

    /* JADX INFO: renamed from: n */
    public final C0031d f4281n = new C0031d(24, this);

    /* JADX INFO: renamed from: a */
    public final void m2550a() {
        int i3 = this.f4275h + 1;
        this.f4275h = i3;
        if (i3 == 1) {
            if (this.f4276i) {
                this.f4279l.m2568d(EnumC0999l.ON_RESUME);
                this.f4276i = false;
            } else {
                Handler handler = this.f4278k;
                AbstractC2364c.m4951b(handler);
                handler.removeCallbacks(this.f4280m);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC1005r
    /* JADX INFO: renamed from: e */
    public final C1007t mo2300e() {
        return this.f4279l;
    }
}

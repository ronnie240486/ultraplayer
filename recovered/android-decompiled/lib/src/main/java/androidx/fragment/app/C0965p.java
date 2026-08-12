package androidx.fragment.app;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.activity.InterfaceC0907q;
import androidx.lifecycle.C0986K;
import androidx.lifecycle.C1007t;
import androidx.lifecycle.InterfaceC0987L;
import p019G1.AbstractC0230e;
import p091e.AbstractActivityC1479j;
import p108i1.C1751d;
import p108i1.InterfaceC1752e;

/* JADX INFO: renamed from: androidx.fragment.app.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0965p extends AbstractC0230e implements InterfaceC0987L, InterfaceC0907q, InterfaceC1752e, InterfaceC0941G {

    /* JADX INFO: renamed from: u */
    public final AbstractActivityC1479j f4248u;

    /* JADX INFO: renamed from: v */
    public final AbstractActivityC1479j f4249v;

    /* JADX INFO: renamed from: w */
    public final Handler f4250w;

    /* JADX INFO: renamed from: x */
    public final C0938D f4251x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractActivityC1479j f4252y;

    public C0965p(AbstractActivityC1479j abstractActivityC1479j) {
        this.f4252y = abstractActivityC1479j;
        Handler handler = new Handler();
        this.f4251x = new C0938D();
        this.f4248u = abstractActivityC1479j;
        this.f4249v = abstractActivityC1479j;
        this.f4250w = handler;
    }

    @Override // p108i1.InterfaceC1752e
    /* JADX INFO: renamed from: b */
    public final C1751d mo2298b() {
        return (C1751d) this.f4252y.f3747k.f3429c;
    }

    @Override // androidx.lifecycle.InterfaceC0987L
    /* JADX INFO: renamed from: d */
    public final C0986K mo2299d() {
        return this.f4252y.mo2299d();
    }

    @Override // androidx.lifecycle.InterfaceC1005r
    /* JADX INFO: renamed from: e */
    public final C1007t mo2300e() {
        return this.f4252y.f6612y;
    }

    @Override // p019G1.AbstractC0230e
    /* JADX INFO: renamed from: u */
    public final View mo747u(int i3) {
        return this.f4252y.findViewById(i3);
    }

    @Override // p019G1.AbstractC0230e
    /* JADX INFO: renamed from: v */
    public final boolean mo748v() {
        Window window = this.f4252y.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.fragment.app.InterfaceC0941G
    /* JADX INFO: renamed from: a */
    public final void mo2486a() {
    }
}

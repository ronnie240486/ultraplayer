package p106i;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.android.gms.internal.cast.C1323r;
import java.lang.ref.WeakReference;
import p053S0.C0536b;
import p110j.InterfaceC1770k;
import p110j.MenuC1772m;
import p113k.C1873k;

/* JADX INFO: renamed from: i.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1736d extends AbstractC1733a implements InterfaceC1770k {

    /* JADX INFO: renamed from: i */
    public Context f7732i;

    /* JADX INFO: renamed from: j */
    public ActionBarContextView f7733j;

    /* JADX INFO: renamed from: k */
    public C1323r f7734k;

    /* JADX INFO: renamed from: l */
    public WeakReference f7735l;

    /* JADX INFO: renamed from: m */
    public boolean f7736m;

    /* JADX INFO: renamed from: n */
    public MenuC1772m f7737n;

    @Override // p106i.AbstractC1733a
    /* JADX INFO: renamed from: a */
    public final void mo3680a() {
        if (this.f7736m) {
            return;
        }
        this.f7736m = true;
        this.f7734k.m3359G(this);
    }

    @Override // p110j.InterfaceC1770k
    /* JADX INFO: renamed from: b */
    public final void mo3616b(MenuC1772m menuC1772m) {
        mo3686i();
        C1873k c1873k = this.f7733j.f3824j;
        if (c1873k != null) {
            c1873k.m4394l();
        }
    }

    @Override // p106i.AbstractC1733a
    /* JADX INFO: renamed from: c */
    public final View mo3681c() {
        WeakReference weakReference = this.f7735l;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p106i.AbstractC1733a
    /* JADX INFO: renamed from: d */
    public final MenuC1772m mo3682d() {
        return this.f7737n;
    }

    @Override // p106i.AbstractC1733a
    /* JADX INFO: renamed from: e */
    public final MenuInflater mo3683e() {
        return new C1740h(this.f7733j.getContext());
    }

    @Override // p110j.InterfaceC1770k
    /* JADX INFO: renamed from: f */
    public final boolean mo3619f(MenuC1772m menuC1772m, MenuItem menuItem) {
        return ((C0536b) this.f7734k.f5961h).m1343m(this, menuItem);
    }

    @Override // p106i.AbstractC1733a
    /* JADX INFO: renamed from: g */
    public final CharSequence mo3684g() {
        return this.f7733j.getSubtitle();
    }

    @Override // p106i.AbstractC1733a
    /* JADX INFO: renamed from: h */
    public final CharSequence mo3685h() {
        return this.f7733j.getTitle();
    }

    @Override // p106i.AbstractC1733a
    /* JADX INFO: renamed from: i */
    public final void mo3686i() {
        this.f7734k.m3360H(this, this.f7737n);
    }

    @Override // p106i.AbstractC1733a
    /* JADX INFO: renamed from: j */
    public final boolean mo3687j() {
        return this.f7733j.f3839y;
    }

    @Override // p106i.AbstractC1733a
    /* JADX INFO: renamed from: k */
    public final void mo3688k(View view) {
        this.f7733j.setCustomView(view);
        this.f7735l = view != null ? new WeakReference(view) : null;
    }

    @Override // p106i.AbstractC1733a
    /* JADX INFO: renamed from: l */
    public final void mo3689l(int i3) {
        mo3690m(this.f7732i.getString(i3));
    }

    @Override // p106i.AbstractC1733a
    /* JADX INFO: renamed from: m */
    public final void mo3690m(CharSequence charSequence) {
        this.f7733j.setSubtitle(charSequence);
    }

    @Override // p106i.AbstractC1733a
    /* JADX INFO: renamed from: n */
    public final void mo3691n(int i3) {
        mo3692o(this.f7732i.getString(i3));
    }

    @Override // p106i.AbstractC1733a
    /* JADX INFO: renamed from: o */
    public final void mo3692o(CharSequence charSequence) {
        this.f7733j.setTitle(charSequence);
    }

    @Override // p106i.AbstractC1733a
    /* JADX INFO: renamed from: p */
    public final void mo3693p(boolean z3) {
        this.f7725h = z3;
        this.f7733j.setTitleOptional(z3);
    }
}

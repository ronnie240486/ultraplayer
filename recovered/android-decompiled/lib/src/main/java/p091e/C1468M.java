package p091e;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.android.gms.internal.cast.C1323r;
import java.lang.ref.WeakReference;
import p053S0.C0536b;
import p106i.AbstractC1733a;
import p106i.C1740h;
import p110j.InterfaceC1770k;
import p110j.MenuC1772m;
import p113k.C1873k;

/* JADX INFO: renamed from: e.M */
/* JADX INFO: loaded from: classes.dex */
public final class C1468M extends AbstractC1733a implements InterfaceC1770k {

    /* JADX INFO: renamed from: i */
    public final Context f6521i;

    /* JADX INFO: renamed from: j */
    public final MenuC1772m f6522j;

    /* JADX INFO: renamed from: k */
    public C1323r f6523k;

    /* JADX INFO: renamed from: l */
    public WeakReference f6524l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C1469N f6525m;

    public C1468M(C1469N c1469n, Context context, C1323r c1323r) {
        this.f6525m = c1469n;
        this.f6521i = context;
        this.f6523k = c1323r;
        MenuC1772m menuC1772m = new MenuC1772m(context);
        menuC1772m.f7906l = 1;
        this.f6522j = menuC1772m;
        menuC1772m.f7899e = this;
    }

    @Override // p106i.AbstractC1733a
    /* JADX INFO: renamed from: a */
    public final void mo3680a() {
        C1469N c1469n = this.f6525m;
        if (c1469n.f6542q != this) {
            return;
        }
        if (c1469n.f6549x) {
            c1469n.f6543r = this;
            c1469n.f6544s = this.f6523k;
        } else {
            this.f6523k.m3359G(this);
        }
        this.f6523k = null;
        c1469n.m3694e0(false);
        ActionBarContextView actionBarContextView = c1469n.f6539n;
        if (actionBarContextView.f3831q == null) {
            actionBarContextView.m2324e();
        }
        c1469n.f6536k.setHideOnContentScrollEnabled(c1469n.f6530C);
        c1469n.f6542q = null;
    }

    @Override // p110j.InterfaceC1770k
    /* JADX INFO: renamed from: b */
    public final void mo3616b(MenuC1772m menuC1772m) {
        if (this.f6523k == null) {
            return;
        }
        mo3686i();
        C1873k c1873k = this.f6525m.f6539n.f3824j;
        if (c1873k != null) {
            c1873k.m4394l();
        }
    }

    @Override // p106i.AbstractC1733a
    /* JADX INFO: renamed from: c */
    public final View mo3681c() {
        WeakReference weakReference = this.f6524l;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p106i.AbstractC1733a
    /* JADX INFO: renamed from: d */
    public final MenuC1772m mo3682d() {
        return this.f6522j;
    }

    @Override // p106i.AbstractC1733a
    /* JADX INFO: renamed from: e */
    public final MenuInflater mo3683e() {
        return new C1740h(this.f6521i);
    }

    @Override // p110j.InterfaceC1770k
    /* JADX INFO: renamed from: f */
    public final boolean mo3619f(MenuC1772m menuC1772m, MenuItem menuItem) {
        C1323r c1323r = this.f6523k;
        if (c1323r != null) {
            return ((C0536b) c1323r.f5961h).m1343m(this, menuItem);
        }
        return false;
    }

    @Override // p106i.AbstractC1733a
    /* JADX INFO: renamed from: g */
    public final CharSequence mo3684g() {
        return this.f6525m.f6539n.getSubtitle();
    }

    @Override // p106i.AbstractC1733a
    /* JADX INFO: renamed from: h */
    public final CharSequence mo3685h() {
        return this.f6525m.f6539n.getTitle();
    }

    @Override // p106i.AbstractC1733a
    /* JADX INFO: renamed from: i */
    public final void mo3686i() {
        if (this.f6525m.f6542q != this) {
            return;
        }
        MenuC1772m menuC1772m = this.f6522j;
        menuC1772m.m4265w();
        try {
            this.f6523k.m3360H(this, menuC1772m);
        } finally {
            menuC1772m.m4264v();
        }
    }

    @Override // p106i.AbstractC1733a
    /* JADX INFO: renamed from: j */
    public final boolean mo3687j() {
        return this.f6525m.f6539n.f3839y;
    }

    @Override // p106i.AbstractC1733a
    /* JADX INFO: renamed from: k */
    public final void mo3688k(View view) {
        this.f6525m.f6539n.setCustomView(view);
        this.f6524l = new WeakReference(view);
    }

    @Override // p106i.AbstractC1733a
    /* JADX INFO: renamed from: l */
    public final void mo3689l(int i3) {
        mo3690m(this.f6525m.f6534i.getResources().getString(i3));
    }

    @Override // p106i.AbstractC1733a
    /* JADX INFO: renamed from: m */
    public final void mo3690m(CharSequence charSequence) {
        this.f6525m.f6539n.setSubtitle(charSequence);
    }

    @Override // p106i.AbstractC1733a
    /* JADX INFO: renamed from: n */
    public final void mo3691n(int i3) {
        mo3692o(this.f6525m.f6534i.getResources().getString(i3));
    }

    @Override // p106i.AbstractC1733a
    /* JADX INFO: renamed from: o */
    public final void mo3692o(CharSequence charSequence) {
        this.f6525m.f6539n.setTitle(charSequence);
    }

    @Override // p106i.AbstractC1733a
    /* JADX INFO: renamed from: p */
    public final void mo3693p(boolean z3) {
        this.f7725h = z3;
        this.f6525m.f6539n.setTitleOptional(z3);
    }
}

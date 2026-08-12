package p110j;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p045P0.AbstractC0462h;

/* JADX INFO: renamed from: j.E */
/* JADX INFO: loaded from: classes.dex */
public final class SubMenuC1759E extends MenuC1772m implements SubMenu {

    /* JADX INFO: renamed from: A */
    public final C1774o f7828A;

    /* JADX INFO: renamed from: z */
    public final MenuC1772m f7829z;

    public SubMenuC1759E(Context context, MenuC1772m menuC1772m, C1774o c1774o) {
        super(context);
        this.f7829z = menuC1772m;
        this.f7828A = c1774o;
    }

    @Override // p110j.MenuC1772m
    /* JADX INFO: renamed from: d */
    public final boolean mo4227d(C1774o c1774o) {
        return this.f7829z.mo4227d(c1774o);
    }

    @Override // p110j.MenuC1772m
    /* JADX INFO: renamed from: e */
    public final boolean mo4228e(MenuC1772m menuC1772m, MenuItem menuItem) {
        return super.mo4228e(menuC1772m, menuItem) || this.f7829z.mo4228e(menuC1772m, menuItem);
    }

    @Override // p110j.MenuC1772m
    /* JADX INFO: renamed from: f */
    public final boolean mo4229f(C1774o c1774o) {
        return this.f7829z.mo4229f(c1774o);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f7828A;
    }

    @Override // p110j.MenuC1772m
    /* JADX INFO: renamed from: j */
    public final String mo4230j() {
        C1774o c1774o = this.f7828A;
        int i3 = c1774o != null ? c1774o.f7925a : 0;
        if (i3 == 0) {
            return null;
        }
        return AbstractC0462h.m1165e(i3, "android:menu:actionviewstates:");
    }

    @Override // p110j.MenuC1772m
    /* JADX INFO: renamed from: k */
    public final MenuC1772m mo4231k() {
        return this.f7829z.mo4231k();
    }

    @Override // p110j.MenuC1772m
    /* JADX INFO: renamed from: m */
    public final boolean mo4232m() {
        return this.f7829z.mo4232m();
    }

    @Override // p110j.MenuC1772m
    /* JADX INFO: renamed from: n */
    public final boolean mo4233n() {
        return this.f7829z.mo4233n();
    }

    @Override // p110j.MenuC1772m
    /* JADX INFO: renamed from: o */
    public final boolean mo4234o() {
        return this.f7829z.mo4234o();
    }

    @Override // p110j.MenuC1772m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z3) {
        this.f7829z.setGroupDividerEnabled(z3);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m4263u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m4263u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m4263u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f7828A.setIcon(drawable);
        return this;
    }

    @Override // p110j.MenuC1772m, android.view.Menu
    public final void setQwertyMode(boolean z3) {
        this.f7829z.setQwertyMode(z3);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i3) {
        m4263u(0, null, i3, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i3) {
        m4263u(i3, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i3) {
        this.f7828A.setIcon(i3);
        return this;
    }
}

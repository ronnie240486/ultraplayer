package p110j;

import android.view.MenuItem;

/* JADX INFO: renamed from: j.r */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC1777r implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a */
    public final MenuItem.OnActionExpandListener f7955a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MenuItemC1779t f7956b;

    public MenuItemOnActionExpandListenerC1777r(MenuItemC1779t menuItemC1779t, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f7956b = menuItemC1779t;
        this.f7955a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f7955a.onMenuItemActionCollapse(this.f7956b.m3738f(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f7955a.onMenuItemActionExpand(this.f7956b.m3738f(menuItem));
    }
}

package p110j;

import android.view.MenuItem;

/* JADX INFO: renamed from: j.s */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC1778s implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    public final MenuItem.OnMenuItemClickListener f7957a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MenuItemC1779t f7958b;

    public MenuItemOnMenuItemClickListenerC1778s(MenuItemC1779t menuItemC1779t, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f7958b = menuItemC1779t;
        this.f7957a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f7957a.onMenuItemClick(this.f7958b.m3738f(menuItem));
    }
}

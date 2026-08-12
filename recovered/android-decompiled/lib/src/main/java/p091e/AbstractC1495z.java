package p091e;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import p064W.C0649q;
import p110j.MenuItemC1779t;
import p124n.C2022i;
import p156v.InterfaceMenuItemC2306a;

/* JADX INFO: renamed from: e.z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1495z {

    /* JADX INFO: renamed from: a */
    public Object f6643a;

    /* JADX INFO: renamed from: b */
    public Object f6644b;

    public AbstractC1495z(Context context) {
        this.f6643a = context;
    }

    /* JADX INFO: renamed from: c */
    public void m3737c() {
        C0649q c0649q = (C0649q) this.f6643a;
        if (c0649q != null) {
            try {
                ((LayoutInflaterFactory2C1458C) this.f6644b).f6487q.unregisterReceiver(c0649q);
            } catch (IllegalArgumentException unused) {
            }
            this.f6643a = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract IntentFilter mo3734d();

    /* JADX INFO: renamed from: e */
    public abstract int mo3735e();

    /* JADX INFO: renamed from: f */
    public MenuItem m3738f(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC2306a)) {
            return menuItem;
        }
        InterfaceMenuItemC2306a interfaceMenuItemC2306a = (InterfaceMenuItemC2306a) menuItem;
        if (((C2022i) this.f6644b) == null) {
            this.f6644b = new C2022i();
        }
        MenuItem menuItem2 = (MenuItem) ((C2022i) this.f6644b).getOrDefault(interfaceMenuItemC2306a, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC1779t menuItemC1779t = new MenuItemC1779t((Context) this.f6643a, interfaceMenuItemC2306a);
        ((C2022i) this.f6644b).put(interfaceMenuItemC2306a, menuItemC1779t);
        return menuItemC1779t;
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo3736g();

    /* JADX INFO: renamed from: h */
    public void m3739h() {
        m3737c();
        IntentFilter intentFilterMo3734d = mo3734d();
        if (intentFilterMo3734d.countActions() == 0) {
            return;
        }
        if (((C0649q) this.f6643a) == null) {
            this.f6643a = new C0649q(4, this);
        }
        ((LayoutInflaterFactory2C1458C) this.f6644b).f6487q.registerReceiver((C0649q) this.f6643a, intentFilterMo3734d);
    }

    public AbstractC1495z(LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C) {
        this.f6644b = layoutInflaterFactory2C1458C;
    }
}

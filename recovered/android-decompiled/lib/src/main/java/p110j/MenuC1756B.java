package p110j;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p091e.AbstractC1495z;
import p124n.C2022i;
import p156v.InterfaceMenuItemC2306a;

/* JADX INFO: renamed from: j.B */
/* JADX INFO: loaded from: classes.dex */
public class MenuC1756B extends AbstractC1495z implements Menu {

    /* JADX INFO: renamed from: c */
    public final MenuC1772m f7808c;

    public MenuC1756B(Context context, MenuC1772m menuC1772m) {
        super(context);
        if (menuC1772m == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f7808c = menuC1772m;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m3738f(this.f7808c.m4251a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i3, int i4, int i5, ComponentName componentName, Intent[] intentArr, Intent intent, int i6, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f7808c.addIntentOptions(i3, i4, i5, componentName, intentArr, intent, i6, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i7 = 0; i7 < length; i7++) {
                menuItemArr[i7] = m3738f(menuItemArr2[i7]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f7808c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        C2022i c2022i = (C2022i) this.f6644b;
        if (c2022i != null) {
            c2022i.clear();
        }
        this.f7808c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f7808c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i3) {
        return m3738f(this.f7808c.findItem(i3));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i3) {
        return m3738f(this.f7808c.getItem(i3));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f7808c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i3, KeyEvent keyEvent) {
        return this.f7808c.isShortcutKey(i3, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i3, int i4) {
        return this.f7808c.performIdentifierAction(i3, i4);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i3, KeyEvent keyEvent, int i4) {
        return this.f7808c.performShortcut(i3, keyEvent, i4);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i3) {
        if (((C2022i) this.f6644b) != null) {
            int i4 = 0;
            while (true) {
                C2022i c2022i = (C2022i) this.f6644b;
                if (i4 >= c2022i.f8791i) {
                    break;
                }
                if (((InterfaceMenuItemC2306a) c2022i.m4590g(i4)).getGroupId() == i3) {
                    ((C2022i) this.f6644b).m4591h(i4);
                    i4--;
                }
                i4++;
            }
        }
        this.f7808c.removeGroup(i3);
    }

    @Override // android.view.Menu
    public final void removeItem(int i3) {
        if (((C2022i) this.f6644b) != null) {
            int i4 = 0;
            while (true) {
                C2022i c2022i = (C2022i) this.f6644b;
                if (i4 >= c2022i.f8791i) {
                    break;
                }
                if (((InterfaceMenuItemC2306a) c2022i.m4590g(i4)).getItemId() == i3) {
                    ((C2022i) this.f6644b).m4591h(i4);
                    break;
                }
                i4++;
            }
        }
        this.f7808c.removeItem(i3);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i3, boolean z3, boolean z4) {
        this.f7808c.setGroupCheckable(i3, z3, z4);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i3, boolean z3) {
        this.f7808c.setGroupEnabled(i3, z3);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i3, boolean z3) {
        this.f7808c.setGroupVisible(i3, z3);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z3) {
        this.f7808c.setQwertyMode(z3);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f7808c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3) {
        return this.f7808c.addSubMenu(i3);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3) {
        return m3738f(this.f7808c.add(i3));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i4, int i5, CharSequence charSequence) {
        return this.f7808c.addSubMenu(i3, i4, i5, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i4, int i5, CharSequence charSequence) {
        return m3738f(this.f7808c.m4251a(i3, i4, i5, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i4, int i5, int i6) {
        return this.f7808c.addSubMenu(i3, i4, i5, i6);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i4, int i5, int i6) {
        return m3738f(this.f7808c.add(i3, i4, i5, i6));
    }
}

package p106i;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import p000A.AbstractC0051n;
import p110j.ActionProviderVisibilityListenerC1775p;
import p110j.C1774o;
import p110j.MenuItemC1779t;
import p156v.InterfaceMenuItemC2306a;

/* JADX INFO: renamed from: i.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1739g {

    /* JADX INFO: renamed from: A */
    public CharSequence f7743A;

    /* JADX INFO: renamed from: B */
    public CharSequence f7744B;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C1740h f7747E;

    /* JADX INFO: renamed from: a */
    public final Menu f7748a;

    /* JADX INFO: renamed from: h */
    public boolean f7755h;

    /* JADX INFO: renamed from: i */
    public int f7756i;

    /* JADX INFO: renamed from: j */
    public int f7757j;

    /* JADX INFO: renamed from: k */
    public CharSequence f7758k;

    /* JADX INFO: renamed from: l */
    public CharSequence f7759l;

    /* JADX INFO: renamed from: m */
    public int f7760m;

    /* JADX INFO: renamed from: n */
    public char f7761n;

    /* JADX INFO: renamed from: o */
    public int f7762o;

    /* JADX INFO: renamed from: p */
    public char f7763p;

    /* JADX INFO: renamed from: q */
    public int f7764q;

    /* JADX INFO: renamed from: r */
    public int f7765r;

    /* JADX INFO: renamed from: s */
    public boolean f7766s;

    /* JADX INFO: renamed from: t */
    public boolean f7767t;

    /* JADX INFO: renamed from: u */
    public boolean f7768u;

    /* JADX INFO: renamed from: v */
    public int f7769v;

    /* JADX INFO: renamed from: w */
    public int f7770w;

    /* JADX INFO: renamed from: x */
    public String f7771x;

    /* JADX INFO: renamed from: y */
    public String f7772y;

    /* JADX INFO: renamed from: z */
    public ActionProviderVisibilityListenerC1775p f7773z;

    /* JADX INFO: renamed from: C */
    public ColorStateList f7745C = null;

    /* JADX INFO: renamed from: D */
    public PorterDuff.Mode f7746D = null;

    /* JADX INFO: renamed from: b */
    public int f7749b = 0;

    /* JADX INFO: renamed from: c */
    public int f7750c = 0;

    /* JADX INFO: renamed from: d */
    public int f7751d = 0;

    /* JADX INFO: renamed from: e */
    public int f7752e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f7753f = true;

    /* JADX INFO: renamed from: g */
    public boolean f7754g = true;

    public C1739g(C1740h c1740h, Menu menu) {
        this.f7747E = c1740h;
        this.f7748a = menu;
    }

    /* JADX INFO: renamed from: a */
    public final Object m4189a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f7747E.f7778c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e3) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4190b(MenuItem menuItem) {
        boolean z3 = false;
        menuItem.setChecked(this.f7766s).setVisible(this.f7767t).setEnabled(this.f7768u).setCheckable(this.f7765r >= 1).setTitleCondensed(this.f7759l).setIcon(this.f7760m);
        int i3 = this.f7769v;
        if (i3 >= 0) {
            menuItem.setShowAsAction(i3);
        }
        String str = this.f7772y;
        C1740h c1740h = this.f7747E;
        if (str != null) {
            if (c1740h.f7778c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c1740h.f7779d == null) {
                c1740h.f7779d = C1740h.m4191a(c1740h.f7778c);
            }
            Object obj = c1740h.f7779d;
            String str2 = this.f7772y;
            MenuItemOnMenuItemClickListenerC1738f menuItemOnMenuItemClickListenerC1738f = new MenuItemOnMenuItemClickListenerC1738f();
            menuItemOnMenuItemClickListenerC1738f.f7741a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC1738f.f7742b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC1738f.f7740c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC1738f);
            } catch (Exception e3) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e3);
                throw inflateException;
            }
        }
        if (this.f7765r >= 2) {
            if (menuItem instanceof C1774o) {
                C1774o c1774o = (C1774o) menuItem;
                c1774o.f7948x = (c1774o.f7948x & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC1779t) {
                MenuItemC1779t menuItemC1779t = (MenuItemC1779t) menuItem;
                try {
                    Method method = menuItemC1779t.f7960d;
                    InterfaceMenuItemC2306a interfaceMenuItemC2306a = menuItemC1779t.f7959c;
                    if (method == null) {
                        menuItemC1779t.f7960d = interfaceMenuItemC2306a.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC1779t.f7960d.invoke(interfaceMenuItemC2306a, Boolean.TRUE);
                } catch (Exception e4) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e4);
                }
            }
        }
        String str3 = this.f7771x;
        if (str3 != null) {
            menuItem.setActionView((View) m4189a(str3, C1740h.f7774e, c1740h.f7776a));
            z3 = true;
        }
        int i4 = this.f7770w;
        if (i4 > 0) {
            if (z3) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i4);
            }
        }
        ActionProviderVisibilityListenerC1775p actionProviderVisibilityListenerC1775p = this.f7773z;
        if (actionProviderVisibilityListenerC1775p != null) {
            if (menuItem instanceof InterfaceMenuItemC2306a) {
                ((InterfaceMenuItemC2306a) menuItem).mo4235a(actionProviderVisibilityListenerC1775p);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f7743A;
        boolean z4 = menuItem instanceof InterfaceMenuItemC2306a;
        if (z4) {
            ((InterfaceMenuItemC2306a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0051n.m296h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f7744B;
        if (z4) {
            ((InterfaceMenuItemC2306a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0051n.m301m(menuItem, charSequence2);
        }
        char c = this.f7761n;
        int i5 = this.f7762o;
        if (z4) {
            ((InterfaceMenuItemC2306a) menuItem).setAlphabeticShortcut(c, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0051n.m295g(menuItem, c, i5);
        }
        char c2 = this.f7763p;
        int i6 = this.f7764q;
        if (z4) {
            ((InterfaceMenuItemC2306a) menuItem).setNumericShortcut(c2, i6);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0051n.m299k(menuItem, c2, i6);
        }
        PorterDuff.Mode mode = this.f7746D;
        if (mode != null) {
            if (z4) {
                ((InterfaceMenuItemC2306a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0051n.m298j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f7745C;
        if (colorStateList != null) {
            if (z4) {
                ((InterfaceMenuItemC2306a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0051n.m297i(menuItem, colorStateList);
            }
        }
    }
}

package p110j;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000A.AbstractC0018T;
import p000A.AbstractC0020V;
import p140r.AbstractC2181a;

/* JADX INFO: renamed from: j.m */
/* JADX INFO: loaded from: classes.dex */
public class MenuC1772m implements Menu {

    /* JADX INFO: renamed from: y */
    public static final int[] f7894y = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a */
    public final Context f7895a;

    /* JADX INFO: renamed from: b */
    public final Resources f7896b;

    /* JADX INFO: renamed from: c */
    public boolean f7897c;

    /* JADX INFO: renamed from: d */
    public final boolean f7898d;

    /* JADX INFO: renamed from: e */
    public InterfaceC1770k f7899e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f7900f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f7901g;

    /* JADX INFO: renamed from: h */
    public boolean f7902h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f7903i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f7904j;

    /* JADX INFO: renamed from: k */
    public boolean f7905k;

    /* JADX INFO: renamed from: m */
    public CharSequence f7907m;

    /* JADX INFO: renamed from: n */
    public Drawable f7908n;

    /* JADX INFO: renamed from: o */
    public View f7909o;

    /* JADX INFO: renamed from: v */
    public C1774o f7916v;

    /* JADX INFO: renamed from: x */
    public boolean f7918x;

    /* JADX INFO: renamed from: l */
    public int f7906l = 0;

    /* JADX INFO: renamed from: p */
    public boolean f7910p = false;

    /* JADX INFO: renamed from: q */
    public boolean f7911q = false;

    /* JADX INFO: renamed from: r */
    public boolean f7912r = false;

    /* JADX INFO: renamed from: s */
    public boolean f7913s = false;

    /* JADX INFO: renamed from: t */
    public final ArrayList f7914t = new ArrayList();

    /* JADX INFO: renamed from: u */
    public final CopyOnWriteArrayList f7915u = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: w */
    public boolean f7917w = false;

    public MenuC1772m(Context context) {
        boolean zM91b;
        boolean z3 = false;
        this.f7895a = context;
        Resources resources = context.getResources();
        this.f7896b = resources;
        this.f7900f = new ArrayList();
        this.f7901g = new ArrayList();
        this.f7902h = true;
        this.f7903i = new ArrayList();
        this.f7904j = new ArrayList();
        this.f7905k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = AbstractC0020V.f19a;
            if (Build.VERSION.SDK_INT >= 28) {
                zM91b = AbstractC0018T.m91b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zM91b = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zM91b) {
                z3 = true;
            }
        }
        this.f7898d = z3;
    }

    /* JADX INFO: renamed from: a */
    public final C1774o m4251a(int i3, int i4, int i5, CharSequence charSequence) {
        int i6;
        int i7 = ((-65536) & i5) >> 16;
        if (i7 < 0 || i7 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i8 = (f7894y[i7] << 16) | (65535 & i5);
        C1774o c1774o = new C1774o(this, i3, i4, i5, i8, charSequence, this.f7906l);
        ArrayList arrayList = this.f7900f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C1774o) arrayList.get(size)).f7928d <= i8) {
                i6 = size + 1;
                arrayList.add(i6, c1774o);
                m4258p(true);
                return c1774o;
            }
        }
        i6 = 0;
        arrayList.add(i6, c1774o);
        m4258p(true);
        return c1774o;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m4251a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i3, int i4, int i5, ComponentName componentName, Intent[] intentArr, Intent intent, int i6, MenuItem[] menuItemArr) {
        int i7;
        PackageManager packageManager = this.f7895a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i6 & 1) == 0) {
            removeGroup(i3);
        }
        for (int i8 = 0; i8 < size; i8++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i8);
            int i9 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i9 < 0 ? intent : intentArr[i9]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C1774o c1774oM4251a = m4251a(i3, i4, i5, resolveInfo.loadLabel(packageManager));
            c1774oM4251a.setIcon(resolveInfo.loadIcon(packageManager));
            c1774oM4251a.f7931g = intent2;
            if (menuItemArr != null && (i7 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i7] = c1774oM4251a;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* JADX INFO: renamed from: b */
    public final void m4252b(InterfaceC1784y interfaceC1784y, Context context) {
        this.f7915u.add(new WeakReference(interfaceC1784y));
        interfaceC1784y.mo4246c(context, this);
        this.f7905k = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m4253c(boolean z3) {
        if (this.f7913s) {
            return;
        }
        this.f7913s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f7915u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC1784y interfaceC1784y = (InterfaceC1784y) weakReference.get();
            if (interfaceC1784y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC1784y.mo4214a(this, z3);
            }
        }
        this.f7913s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C1774o c1774o = this.f7916v;
        if (c1774o != null) {
            mo4227d(c1774o);
        }
        this.f7900f.clear();
        m4258p(true);
    }

    public final void clearHeader() {
        this.f7908n = null;
        this.f7907m = null;
        this.f7909o = null;
        m4258p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m4253c(true);
    }

    /* JADX INFO: renamed from: d */
    public boolean mo4227d(C1774o c1774o) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f7915u;
        boolean zMo4248h = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f7916v == c1774o) {
            m4265w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC1784y interfaceC1784y = (InterfaceC1784y) weakReference.get();
                if (interfaceC1784y != null) {
                    zMo4248h = interfaceC1784y.mo4248h(c1774o);
                    if (zMo4248h) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            m4264v();
            if (zMo4248h) {
                this.f7916v = null;
            }
        }
        return zMo4248h;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo4228e(MenuC1772m menuC1772m, MenuItem menuItem) {
        InterfaceC1770k interfaceC1770k = this.f7899e;
        return interfaceC1770k != null && interfaceC1770k.mo3619f(menuC1772m, menuItem);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo4229f(C1774o c1774o) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f7915u;
        boolean zMo4247e = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m4265w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC1784y interfaceC1784y = (InterfaceC1784y) weakReference.get();
            if (interfaceC1784y != null) {
                zMo4247e = interfaceC1784y.mo4247e(c1774o);
                if (zMo4247e) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        m4264v();
        if (zMo4247e) {
            this.f7916v = c1774o;
        }
        return zMo4247e;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i3) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f7900f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C1774o c1774o = (C1774o) arrayList.get(i4);
            if (c1774o.f7925a == i3) {
                return c1774o;
            }
            if (c1774o.hasSubMenu() && (menuItemFindItem = c1774o.f7939o.findItem(i3)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final C1774o m4254g(int i3, KeyEvent keyEvent) {
        ArrayList arrayList = this.f7914t;
        arrayList.clear();
        m4255h(arrayList, i3, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C1774o) arrayList.get(0);
        }
        boolean zMo4233n = mo4233n();
        for (int i4 = 0; i4 < size; i4++) {
            C1774o c1774o = (C1774o) arrayList.get(i4);
            char c = zMo4233n ? c1774o.f7934j : c1774o.f7932h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zMo4233n && c == '\b' && i3 == 67))) {
                return c1774o;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i3) {
        return (MenuItem) this.f7900f.get(i3);
    }

    /* JADX INFO: renamed from: h */
    public final void m4255h(ArrayList arrayList, int i3, KeyEvent keyEvent) {
        boolean zMo4233n = mo4233n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i3 == 67) {
            ArrayList arrayList2 = this.f7900f;
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                C1774o c1774o = (C1774o) arrayList2.get(i4);
                if (c1774o.hasSubMenu()) {
                    c1774o.f7939o.m4255h(arrayList, i3, keyEvent);
                }
                char c = zMo4233n ? c1774o.f7934j : c1774o.f7932h;
                if ((modifiers & 69647) == ((zMo4233n ? c1774o.f7935k : c1774o.f7933i) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zMo4233n && c == '\b' && i3 == 67)) && c1774o.isEnabled()) {
                        arrayList.add(c1774o);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f7918x) {
            return true;
        }
        ArrayList arrayList = this.f7900f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((C1774o) arrayList.get(i3)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m4256i() {
        ArrayList arrayListM4257l = m4257l();
        if (this.f7905k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f7915u;
            boolean zMo4215d = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC1784y interfaceC1784y = (InterfaceC1784y) weakReference.get();
                if (interfaceC1784y == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo4215d |= interfaceC1784y.mo4215d();
                }
            }
            ArrayList arrayList = this.f7903i;
            ArrayList arrayList2 = this.f7904j;
            if (zMo4215d) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM4257l.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C1774o c1774o = (C1774o) arrayListM4257l.get(i3);
                    if ((c1774o.f7948x & 32) == 32) {
                        arrayList.add(c1774o);
                    } else {
                        arrayList2.add(c1774o);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m4257l());
            }
            this.f7905k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i3, KeyEvent keyEvent) {
        return m4254g(i3, keyEvent) != null;
    }

    /* JADX INFO: renamed from: j */
    public String mo4230j() {
        return "android:menu:actionviewstates";
    }

    /* JADX INFO: renamed from: l */
    public final ArrayList m4257l() {
        boolean z3 = this.f7902h;
        ArrayList arrayList = this.f7901g;
        if (!z3) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f7900f;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            C1774o c1774o = (C1774o) arrayList2.get(i3);
            if (c1774o.isVisible()) {
                arrayList.add(c1774o);
            }
        }
        this.f7902h = false;
        this.f7905k = true;
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo4232m() {
        return this.f7917w;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo4233n() {
        return this.f7897c;
    }

    /* JADX INFO: renamed from: o */
    public boolean mo4234o() {
        return this.f7898d;
    }

    /* JADX INFO: renamed from: p */
    public final void m4258p(boolean z3) {
        if (this.f7910p) {
            this.f7911q = true;
            if (z3) {
                this.f7912r = true;
                return;
            }
            return;
        }
        if (z3) {
            this.f7902h = true;
            this.f7905k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f7915u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m4265w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC1784y interfaceC1784y = (InterfaceC1784y) weakReference.get();
            if (interfaceC1784y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC1784y.mo4216g();
            }
        }
        m4264v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i3, int i4) {
        return m4259q(findItem(i3), null, i4);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i3, KeyEvent keyEvent, int i4) {
        C1774o c1774oM4254g = m4254g(i3, keyEvent);
        boolean zM4259q = c1774oM4254g != null ? m4259q(c1774oM4254g, null, i4) : false;
        if ((i4 & 2) != 0) {
            m4253c(true);
        }
        return zM4259q;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ae A[SYNTHETIC] */
    /* JADX INFO: renamed from: q */
    public final boolean m4259q(MenuItem menuItem, InterfaceC1784y interfaceC1784y, int i3) {
        ActionProviderVisibilityListenerC1775p actionProviderVisibilityListenerC1775p;
        boolean zExpandActionView;
        ActionProviderVisibilityListenerC1775p actionProviderVisibilityListenerC1775p2;
        boolean z3;
        SubMenuC1759E subMenuC1759E;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        InterfaceC1784y interfaceC1784y2;
        C1774o c1774o = (C1774o) menuItem;
        boolean zMo4218k = false;
        if (c1774o == null || !c1774o.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c1774o.f7940p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(c1774o)) {
            MenuC1772m menuC1772m = c1774o.f7938n;
            if (menuC1772m.mo4228e(menuC1772m, c1774o)) {
                zExpandActionView = true;
            } else {
                Intent intent = c1774o.f7931g;
                if (intent != null) {
                    try {
                        menuC1772m.f7895a.startActivity(intent);
                    } catch (ActivityNotFoundException e3) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e3);
                        actionProviderVisibilityListenerC1775p = c1774o.f7922A;
                        if (actionProviderVisibilityListenerC1775p == null) {
                        }
                        zExpandActionView = false;
                        actionProviderVisibilityListenerC1775p2 = c1774o.f7922A;
                        if (actionProviderVisibilityListenerC1775p2 == null) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (c1774o.m4268e()) {
                            zExpandActionView |= c1774o.expandActionView();
                            if (zExpandActionView) {
                                m4253c(true);
                            }
                        } else if (c1774o.hasSubMenu()) {
                            if ((i3 & 4) == 0) {
                                m4253c(false);
                            }
                            if (!c1774o.hasSubMenu()) {
                                SubMenuC1759E subMenuC1759E2 = new SubMenuC1759E(this.f7895a, this, c1774o);
                                c1774o.f7939o = subMenuC1759E2;
                                subMenuC1759E2.setHeaderTitle(c1774o.f7929e);
                            }
                            subMenuC1759E = c1774o.f7939o;
                            if (z3) {
                                MenuItemC1779t menuItemC1779t = actionProviderVisibilityListenerC1775p2.f7953c;
                                actionProviderVisibilityListenerC1775p2.f7952b.onPrepareSubMenu(subMenuC1759E);
                            }
                            copyOnWriteArrayList = this.f7915u;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                if (interfaceC1784y != null) {
                                }
                                for (WeakReference weakReference : copyOnWriteArrayList) {
                                    interfaceC1784y2 = (InterfaceC1784y) weakReference.get();
                                    if (interfaceC1784y2 == null) {
                                        copyOnWriteArrayList.remove(weakReference);
                                    } else if (!zMo4218k) {
                                        zMo4218k = interfaceC1784y2.mo4218k(subMenuC1759E);
                                    }
                                }
                            }
                            zExpandActionView |= zMo4218k;
                            if (!zExpandActionView) {
                                m4253c(true);
                            }
                        } else {
                            if ((i3 & 4) == 0) {
                                m4253c(false);
                            }
                            if (!c1774o.hasSubMenu()) {
                                SubMenuC1759E subMenuC1759E3 = new SubMenuC1759E(this.f7895a, this, c1774o);
                                c1774o.f7939o = subMenuC1759E3;
                                subMenuC1759E3.setHeaderTitle(c1774o.f7929e);
                            }
                            subMenuC1759E = c1774o.f7939o;
                            if (z3) {
                                MenuItemC1779t menuItemC1779t2 = actionProviderVisibilityListenerC1775p2.f7953c;
                                actionProviderVisibilityListenerC1775p2.f7952b.onPrepareSubMenu(subMenuC1759E);
                            }
                            copyOnWriteArrayList = this.f7915u;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                zMo4218k = interfaceC1784y != null ? interfaceC1784y.mo4218k(subMenuC1759E) : false;
                                while (r8.hasNext()) {
                                    interfaceC1784y2 = (InterfaceC1784y) weakReference.get();
                                    if (interfaceC1784y2 == null) {
                                        copyOnWriteArrayList.remove(weakReference);
                                    } else if (!zMo4218k) {
                                        zMo4218k = interfaceC1784y2.mo4218k(subMenuC1759E);
                                    }
                                }
                            }
                            zExpandActionView |= zMo4218k;
                            if (!zExpandActionView) {
                                m4253c(true);
                            }
                        }
                        return zExpandActionView;
                    }
                    zExpandActionView = true;
                } else {
                    actionProviderVisibilityListenerC1775p = c1774o.f7922A;
                    if (actionProviderVisibilityListenerC1775p == null && actionProviderVisibilityListenerC1775p.f7952b.onPerformDefaultAction()) {
                        zExpandActionView = true;
                    } else {
                        zExpandActionView = false;
                    }
                }
            }
        } else {
            zExpandActionView = true;
        }
        actionProviderVisibilityListenerC1775p2 = c1774o.f7922A;
        if (actionProviderVisibilityListenerC1775p2 == null && actionProviderVisibilityListenerC1775p2.f7952b.hasSubMenu()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (c1774o.m4268e()) {
            zExpandActionView |= c1774o.expandActionView();
            if (zExpandActionView) {
                m4253c(true);
            }
        } else if (c1774o.hasSubMenu() || z3) {
            if ((i3 & 4) == 0) {
                m4253c(false);
            }
            if (!c1774o.hasSubMenu()) {
                SubMenuC1759E subMenuC1759E4 = new SubMenuC1759E(this.f7895a, this, c1774o);
                c1774o.f7939o = subMenuC1759E4;
                subMenuC1759E4.setHeaderTitle(c1774o.f7929e);
            }
            subMenuC1759E = c1774o.f7939o;
            if (z3) {
                MenuItemC1779t menuItemC1779t3 = actionProviderVisibilityListenerC1775p2.f7953c;
                actionProviderVisibilityListenerC1775p2.f7952b.onPrepareSubMenu(subMenuC1759E);
            }
            copyOnWriteArrayList = this.f7915u;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (interfaceC1784y != null) {
                }
                while (r8.hasNext()) {
                    interfaceC1784y2 = (InterfaceC1784y) weakReference.get();
                    if (interfaceC1784y2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zMo4218k) {
                        zMo4218k = interfaceC1784y2.mo4218k(subMenuC1759E);
                    }
                }
            }
            zExpandActionView |= zMo4218k;
            if (!zExpandActionView) {
                m4253c(true);
            }
        } else if ((i3 & 1) == 0) {
            m4253c(true);
        }
        return zExpandActionView;
    }

    /* JADX INFO: renamed from: r */
    public final void m4260r(InterfaceC1784y interfaceC1784y) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f7915u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC1784y interfaceC1784y2 = (InterfaceC1784y) weakReference.get();
            if (interfaceC1784y2 == null || interfaceC1784y2 == interfaceC1784y) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i3) {
        ArrayList arrayList = this.f7900f;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            } else if (((C1774o) arrayList.get(i5)).f7926b == i3) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 >= 0) {
            int size2 = arrayList.size() - i5;
            while (true) {
                int i6 = i4 + 1;
                if (i4 >= size2 || ((C1774o) arrayList.get(i5)).f7926b != i3) {
                    break;
                }
                if (i5 >= 0) {
                    ArrayList arrayList2 = this.f7900f;
                    if (i5 < arrayList2.size()) {
                        arrayList2.remove(i5);
                    }
                }
                i4 = i6;
            }
            m4258p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i3) {
        ArrayList arrayList = this.f7900f;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (((C1774o) arrayList.get(i4)).f7925a == i3) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            ArrayList arrayList2 = this.f7900f;
            if (i4 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i4);
            m4258p(true);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m4261s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo4230j());
        int size = this.f7900f.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = getItem(i3);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1759E) item.getSubMenu()).m4261s(bundle);
            }
        }
        int i4 = bundle.getInt("android:menu:expandedactionview");
        if (i4 <= 0 || (menuItemFindItem = findItem(i4)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i3, boolean z3, boolean z4) {
        ArrayList arrayList = this.f7900f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C1774o c1774o = (C1774o) arrayList.get(i4);
            if (c1774o.f7926b == i3) {
                c1774o.f7948x = (c1774o.f7948x & (-5)) | (z4 ? 4 : 0);
                c1774o.setCheckable(z3);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z3) {
        this.f7917w = z3;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i3, boolean z3) {
        ArrayList arrayList = this.f7900f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C1774o c1774o = (C1774o) arrayList.get(i4);
            if (c1774o.f7926b == i3) {
                c1774o.setEnabled(z3);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i3, boolean z3) {
        ArrayList arrayList = this.f7900f;
        int size = arrayList.size();
        boolean z4 = false;
        for (int i4 = 0; i4 < size; i4++) {
            C1774o c1774o = (C1774o) arrayList.get(i4);
            if (c1774o.f7926b == i3) {
                int i5 = c1774o.f7948x;
                int i6 = (i5 & (-9)) | (z3 ? 0 : 8);
                c1774o.f7948x = i6;
                if (i5 != i6) {
                    z4 = true;
                }
            }
        }
        if (z4) {
            m4258p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z3) {
        this.f7897c = z3;
        m4258p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f7900f.size();
    }

    /* JADX INFO: renamed from: t */
    public final void m4262t(Bundle bundle) {
        int size = this.f7900f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = getItem(i3);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1759E) item.getSubMenu()).m4262t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo4230j(), sparseArray);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m4263u(int i3, CharSequence charSequence, int i4, Drawable drawable, View view) {
        if (view != null) {
            this.f7909o = view;
            this.f7907m = null;
            this.f7908n = null;
        } else {
            if (i3 > 0) {
                this.f7907m = this.f7896b.getText(i3);
            } else if (charSequence != null) {
                this.f7907m = charSequence;
            }
            if (i4 > 0) {
                this.f7908n = AbstractC2181a.m4765b(this.f7895a, i4);
            } else if (drawable != null) {
                this.f7908n = drawable;
            }
            this.f7909o = null;
        }
        m4258p(false);
    }

    /* JADX INFO: renamed from: v */
    public final void m4264v() {
        this.f7910p = false;
        if (this.f7911q) {
            this.f7911q = false;
            m4258p(this.f7912r);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m4265w() {
        if (this.f7910p) {
            return;
        }
        this.f7910p = true;
        this.f7911q = false;
        this.f7912r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3) {
        return m4251a(0, 0, 0, this.f7896b.getString(i3));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3) {
        return addSubMenu(0, 0, 0, this.f7896b.getString(i3));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i4, int i5, CharSequence charSequence) {
        return m4251a(i3, i4, i5, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i4, int i5, CharSequence charSequence) {
        C1774o c1774oM4251a = m4251a(i3, i4, i5, charSequence);
        SubMenuC1759E subMenuC1759E = new SubMenuC1759E(this.f7895a, this, c1774oM4251a);
        c1774oM4251a.f7939o = subMenuC1759E;
        subMenuC1759E.setHeaderTitle(c1774oM4251a.f7929e);
        return subMenuC1759E;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i4, int i5, int i6) {
        return m4251a(i3, i4, i5, this.f7896b.getString(i6));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i4, int i5, int i6) {
        return addSubMenu(i3, i4, i5, this.f7896b.getString(i6));
    }

    /* JADX INFO: renamed from: k */
    public MenuC1772m mo4231k() {
        return this;
    }
}

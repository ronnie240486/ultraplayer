package p091e;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.google.android.gms.internal.cast.C1323r;
import com.zuxoplayer.app.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p000A.AbstractC0003D;
import p000A.AbstractC0016Q;
import p000A.C0026a0;
import p053S0.C0536b;
import p066W1.AbstractC0664e;
import p106i.AbstractC1733a;
import p106i.AbstractC1743k;
import p106i.AbstractC1744l;
import p106i.AbstractC1745m;
import p106i.C1735c;
import p106i.C1736d;
import p106i.C1737e;
import p110j.MenuC1772m;
import p124n.C2022i;

/* JADX INFO: renamed from: e.x */
/* JADX INFO: loaded from: classes.dex */
public final class WindowCallbackC1493x implements Window.Callback {

    /* JADX INFO: renamed from: g */
    public final Window.Callback f6635g;

    /* JADX INFO: renamed from: h */
    public boolean f6636h;

    /* JADX INFO: renamed from: i */
    public boolean f6637i;

    /* JADX INFO: renamed from: j */
    public boolean f6638j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ LayoutInflaterFactory2C1458C f6639k;

    public WindowCallbackC1493x(LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C, Window.Callback callback) {
        this.f6639k = layoutInflaterFactory2C1458C;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f6635g = callback;
    }

    /* JADX INFO: renamed from: a */
    public final void m3729a(Window.Callback callback) {
        try {
            this.f6636h = true;
            callback.onContentChanged();
        } finally {
            this.f6636h = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3730b(int i3, Menu menu) {
        return this.f6635g.onMenuOpened(i3, menu);
    }

    /* JADX INFO: renamed from: c */
    public final void m3731c(int i3, Menu menu) {
        this.f6635g.onPanelClosed(i3, menu);
    }

    /* JADX INFO: renamed from: d */
    public final void m3732d(List list, Menu menu, int i3) {
        AbstractC1744l.m4197a(this.f6635g, list, menu, i3);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f6635g.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z3 = this.f6637i;
        Window.Callback callback = this.f6635g;
        if (z3) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.f6639k.m3668t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        C1457B c1457b;
        boolean z3;
        MenuC1772m menuC1772m;
        boolean zPerformShortcut;
        if (!this.f6635g.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C = this.f6639k;
            layoutInflaterFactory2C1458C.m3646A();
            C1469N c1469n = layoutInflaterFactory2C1458C.f6491u;
            if (c1469n == null) {
                c1457b = layoutInflaterFactory2C1458C.f6465T;
                if (c1457b == null && layoutInflaterFactory2C1458C.m3651F(c1457b, keyEvent.getKeyCode(), keyEvent)) {
                    C1457B c1457b2 = layoutInflaterFactory2C1458C.f6465T;
                    if (c1457b2 != null) {
                        c1457b2.f6438l = true;
                    }
                } else {
                    if (layoutInflaterFactory2C1458C.f6465T == null) {
                        C1457B c1457bM3673z = layoutInflaterFactory2C1458C.m3673z(0);
                        layoutInflaterFactory2C1458C.m3652G(c1457bM3673z, keyEvent);
                        boolean zM3651F = layoutInflaterFactory2C1458C.m3651F(c1457bM3673z, keyEvent.getKeyCode(), keyEvent);
                        c1457bM3673z.f6437k = false;
                        if (zM3651F) {
                        }
                    }
                }
            } else {
                C1468M c1468m = c1469n.f6542q;
                if (c1468m == null || (menuC1772m = c1468m.f6522j) == null) {
                    zPerformShortcut = false;
                } else {
                    menuC1772m.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    zPerformShortcut = menuC1772m.performShortcut(keyCode, keyEvent, 0);
                }
                if (!zPerformShortcut) {
                    c1457b = layoutInflaterFactory2C1458C.f6465T;
                    if (c1457b == null) {
                        if (layoutInflaterFactory2C1458C.f6465T == null) {
                            C1457B c1457bM3673z2 = layoutInflaterFactory2C1458C.m3673z(0);
                            layoutInflaterFactory2C1458C.m3652G(c1457bM3673z2, keyEvent);
                            boolean zM3651F2 = layoutInflaterFactory2C1458C.m3651F(c1457bM3673z2, keyEvent.getKeyCode(), keyEvent);
                            c1457bM3673z2.f6437k = false;
                            z3 = zM3651F2;
                        }
                    } else {
                        if (layoutInflaterFactory2C1458C.f6465T == null) {
                            C1457B c1457bM3673z3 = layoutInflaterFactory2C1458C.m3673z(0);
                            layoutInflaterFactory2C1458C.m3652G(c1457bM3673z3, keyEvent);
                            boolean zM3651F3 = layoutInflaterFactory2C1458C.m3651F(c1457bM3673z3, keyEvent.getKeyCode(), keyEvent);
                            c1457bM3673z3.f6437k = false;
                            if (zM3651F3) {
                            }
                        }
                    }
                }
            }
            if (!z3) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f6635g.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f6635g.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f6635g.dispatchTrackballEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e */
    public final C1737e m3733e(ActionMode.Callback callback) {
        ViewGroup viewGroup;
        int i3 = 1;
        LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C = this.f6639k;
        Context context = layoutInflaterFactory2C1458C.f6487q;
        C0536b c0536b = new C0536b();
        c0536b.f1868h = context;
        c0536b.f1867g = callback;
        c0536b.f1869i = new ArrayList();
        c0536b.f1870j = new C2022i();
        AbstractC1733a abstractC1733a = layoutInflaterFactory2C1458C.f6446A;
        if (abstractC1733a != null) {
            abstractC1733a.mo3680a();
        }
        C1323r c1323r = new C1323r(layoutInflaterFactory2C1458C, c0536b);
        layoutInflaterFactory2C1458C.m3646A();
        C1469N c1469n = layoutInflaterFactory2C1458C.f6491u;
        if (c1469n != null) {
            C1468M c1468m = c1469n.f6542q;
            if (c1468m != null) {
                c1468m.mo3680a();
            }
            c1469n.f6536k.setHideOnContentScrollEnabled(false);
            c1469n.f6539n.m2324e();
            C1468M c1468m2 = new C1468M(c1469n, c1469n.f6539n.getContext(), c1323r);
            MenuC1772m menuC1772m = c1468m2.f6522j;
            menuC1772m.m4265w();
            try {
                boolean zM1344n = ((C0536b) c1468m2.f6523k.f5961h).m1344n(c1468m2, menuC1772m);
                menuC1772m.m4264v();
                if (zM1344n) {
                    c1469n.f6542q = c1468m2;
                    c1468m2.mo3686i();
                    c1469n.f6539n.m2322c(c1468m2);
                    c1469n.m3694e0(true);
                } else {
                    c1468m2 = null;
                }
                layoutInflaterFactory2C1458C.f6446A = c1468m2;
            } catch (Throwable th) {
                menuC1772m.m4264v();
                throw th;
            }
        }
        if (layoutInflaterFactory2C1458C.f6446A == null) {
            C0026a0 c0026a0 = layoutInflaterFactory2C1458C.f6450E;
            if (c0026a0 != null) {
                c0026a0.m105b();
            }
            AbstractC1733a abstractC1733a2 = layoutInflaterFactory2C1458C.f6446A;
            if (abstractC1733a2 != null) {
                abstractC1733a2.mo3680a();
            }
            if (layoutInflaterFactory2C1458C.f6447B == null) {
                boolean z3 = layoutInflaterFactory2C1458C.f6461P;
                Context context2 = layoutInflaterFactory2C1458C.f6487q;
                if (z3) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context2.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        C1735c c1735c = new C1735c(context2, 0);
                        c1735c.getTheme().setTo(themeNewTheme);
                        context2 = c1735c;
                    }
                    layoutInflaterFactory2C1458C.f6447B = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    layoutInflaterFactory2C1458C.f6448C = popupWindow;
                    AbstractC0664e.m1732R(popupWindow, 2);
                    layoutInflaterFactory2C1458C.f6448C.setContentView(layoutInflaterFactory2C1458C.f6447B);
                    layoutInflaterFactory2C1458C.f6448C.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    layoutInflaterFactory2C1458C.f6447B.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    layoutInflaterFactory2C1458C.f6448C.setHeight(-2);
                    layoutInflaterFactory2C1458C.f6449D = new RunnableC1487r(layoutInflaterFactory2C1458C, i3);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C1458C.f6453H.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        layoutInflaterFactory2C1458C.m3646A();
                        C1469N c1469n2 = layoutInflaterFactory2C1458C.f6491u;
                        Context contextM3695f0 = c1469n2 != null ? c1469n2.m3695f0() : null;
                        if (contextM3695f0 != null) {
                            context2 = contextM3695f0;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        layoutInflaterFactory2C1458C.f6447B = (ActionBarContextView) viewStubCompat.m2360a();
                    }
                }
            }
            if (layoutInflaterFactory2C1458C.f6447B != null) {
                C0026a0 c0026a1 = layoutInflaterFactory2C1458C.f6450E;
                if (c0026a1 != null) {
                    c0026a1.m105b();
                }
                layoutInflaterFactory2C1458C.f6447B.m2324e();
                Context context3 = layoutInflaterFactory2C1458C.f6447B.getContext();
                ActionBarContextView actionBarContextView = layoutInflaterFactory2C1458C.f6447B;
                C1736d c1736d = new C1736d();
                c1736d.f7732i = context3;
                c1736d.f7733j = actionBarContextView;
                c1736d.f7734k = c1323r;
                MenuC1772m menuC1772m2 = new MenuC1772m(actionBarContextView.getContext());
                menuC1772m2.f7906l = 1;
                c1736d.f7737n = menuC1772m2;
                menuC1772m2.f7899e = c1736d;
                if (((C0536b) c1323r.f5961h).m1344n(c1736d, menuC1772m2)) {
                    c1736d.mo3686i();
                    layoutInflaterFactory2C1458C.f6447B.m2322c(c1736d);
                    layoutInflaterFactory2C1458C.f6446A = c1736d;
                    if (layoutInflaterFactory2C1458C.f6452G && (viewGroup = layoutInflaterFactory2C1458C.f6453H) != null && viewGroup.isLaidOut()) {
                        layoutInflaterFactory2C1458C.f6447B.setAlpha(0.0f);
                        C0026a0 c0026a0M79a = AbstractC0016Q.m79a(layoutInflaterFactory2C1458C.f6447B);
                        c0026a0M79a.m104a(1.0f);
                        layoutInflaterFactory2C1458C.f6450E = c0026a0M79a;
                        c0026a0M79a.m107d(new C1489t(i3, layoutInflaterFactory2C1458C));
                    } else {
                        layoutInflaterFactory2C1458C.f6447B.setAlpha(1.0f);
                        layoutInflaterFactory2C1458C.f6447B.setVisibility(0);
                        if (layoutInflaterFactory2C1458C.f6447B.getParent() instanceof View) {
                            View view = (View) layoutInflaterFactory2C1458C.f6447B.getParent();
                            WeakHashMap weakHashMap = AbstractC0016Q.f14a;
                            AbstractC0003D.m7c(view);
                        }
                    }
                    if (layoutInflaterFactory2C1458C.f6448C != null) {
                        layoutInflaterFactory2C1458C.f6488r.getDecorView().post(layoutInflaterFactory2C1458C.f6449D);
                    }
                } else {
                    layoutInflaterFactory2C1458C.f6446A = null;
                }
            }
            layoutInflaterFactory2C1458C.m3654I();
            layoutInflaterFactory2C1458C.f6446A = layoutInflaterFactory2C1458C.f6446A;
        }
        layoutInflaterFactory2C1458C.m3654I();
        AbstractC1733a abstractC1733a3 = layoutInflaterFactory2C1458C.f6446A;
        if (abstractC1733a3 != null) {
            return c0536b.m1337e(abstractC1733a3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f6635g.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f6635g.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f6635g.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f6636h) {
            this.f6635g.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i3, Menu menu) {
        if (i3 != 0 || (menu instanceof MenuC1772m)) {
            return this.f6635g.onCreatePanelMenu(i3, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i3) {
        return this.f6635g.onCreatePanelView(i3);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f6635g.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        return this.f6635g.onMenuItemSelected(i3, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i3, Menu menu) {
        m3730b(i3, menu);
        LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C = this.f6639k;
        if (i3 != 108) {
            layoutInflaterFactory2C1458C.getClass();
            return true;
        }
        layoutInflaterFactory2C1458C.m3646A();
        C1469N c1469n = layoutInflaterFactory2C1458C.f6491u;
        if (c1469n != null && true != c1469n.f6545t) {
            c1469n.f6545t = true;
            ArrayList arrayList = c1469n.f6546u;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i3, Menu menu) {
        if (this.f6638j) {
            this.f6635g.onPanelClosed(i3, menu);
            return;
        }
        m3731c(i3, menu);
        LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C = this.f6639k;
        if (i3 != 108) {
            if (i3 != 0) {
                layoutInflaterFactory2C1458C.getClass();
                return;
            }
            C1457B c1457bM3673z = layoutInflaterFactory2C1458C.m3673z(i3);
            if (c1457bM3673z.f6439m) {
                layoutInflaterFactory2C1458C.m3667r(c1457bM3673z, false);
                return;
            }
            return;
        }
        layoutInflaterFactory2C1458C.m3646A();
        C1469N c1469n = layoutInflaterFactory2C1458C.f6491u;
        if (c1469n == null || !c1469n.f6545t) {
            return;
        }
        c1469n.f6545t = false;
        ArrayList arrayList = c1469n.f6546u;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z3) {
        AbstractC1745m.m4198a(this.f6635g, z3);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i3, View view, Menu menu) {
        MenuC1772m menuC1772m = menu instanceof MenuC1772m ? (MenuC1772m) menu : null;
        if (i3 == 0 && menuC1772m == null) {
            return false;
        }
        if (menuC1772m != null) {
            menuC1772m.f7918x = true;
        }
        boolean zOnPreparePanel = this.f6635g.onPreparePanel(i3, view, menu);
        if (menuC1772m != null) {
            menuC1772m.f7918x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i3) {
        MenuC1772m menuC1772m = this.f6639k.m3673z(0).f6434h;
        if (menuC1772m != null) {
            m3732d(list, menuC1772m, i3);
        } else {
            m3732d(list, menu, i3);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return AbstractC1743k.m4195a(this.f6635g, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f6635g.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z3) {
        this.f6635g.onWindowFocusChanged(z3);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i3) {
        return (this.f6639k.f6451F && i3 == 0) ? m3733e(callback) : AbstractC1743k.m4196b(this.f6635g, callback, i3);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f6635g.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        if (this.f6639k.f6451F) {
            return m3733e(callback);
        }
        return this.f6635g.onWindowStartingActionMode(callback);
    }
}

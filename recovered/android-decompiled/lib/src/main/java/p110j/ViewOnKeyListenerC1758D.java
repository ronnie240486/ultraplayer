package p110j;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.zuxoplayer.app.R;
import p113k.C1811J0;
import p113k.C1890r0;

/* JADX INFO: renamed from: j.D */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC1758D extends AbstractC1780u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: h */
    public final Context f7809h;

    /* JADX INFO: renamed from: i */
    public final MenuC1772m f7810i;

    /* JADX INFO: renamed from: j */
    public final C1769j f7811j;

    /* JADX INFO: renamed from: k */
    public final boolean f7812k;

    /* JADX INFO: renamed from: l */
    public final int f7813l;

    /* JADX INFO: renamed from: m */
    public final int f7814m;

    /* JADX INFO: renamed from: n */
    public final C1811J0 f7815n;

    /* JADX INFO: renamed from: o */
    public final ViewTreeObserverOnGlobalLayoutListenerC1763d f7816o;

    /* JADX INFO: renamed from: p */
    public final ViewOnAttachStateChangeListenerC1764e f7817p;

    /* JADX INFO: renamed from: q */
    public C1781v f7818q;

    /* JADX INFO: renamed from: r */
    public View f7819r;

    /* JADX INFO: renamed from: s */
    public View f7820s;

    /* JADX INFO: renamed from: t */
    public InterfaceC1783x f7821t;

    /* JADX INFO: renamed from: u */
    public ViewTreeObserver f7822u;

    /* JADX INFO: renamed from: v */
    public boolean f7823v;

    /* JADX INFO: renamed from: w */
    public boolean f7824w;

    /* JADX INFO: renamed from: x */
    public int f7825x;

    /* JADX INFO: renamed from: y */
    public int f7826y = 0;

    /* JADX INFO: renamed from: z */
    public boolean f7827z;

    public ViewOnKeyListenerC1758D(int i3, Context context, View view, MenuC1772m menuC1772m, boolean z3) {
        int i4 = 1;
        this.f7816o = new ViewTreeObserverOnGlobalLayoutListenerC1763d(i4, this);
        this.f7817p = new ViewOnAttachStateChangeListenerC1764e(this, i4);
        this.f7809h = context;
        this.f7810i = menuC1772m;
        this.f7812k = z3;
        this.f7811j = new C1769j(menuC1772m, LayoutInflater.from(context), z3, R.layout.abc_popup_menu_item_layout);
        this.f7814m = i3;
        Resources resources = context.getResources();
        this.f7813l = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f7819r = view;
        this.f7815n = new C1811J0(context, null, i3);
        menuC1772m.m4252b(this, context);
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: a */
    public final void mo4214a(MenuC1772m menuC1772m, boolean z3) {
        if (menuC1772m != this.f7810i) {
            return;
        }
        dismiss();
        InterfaceC1783x interfaceC1783x = this.f7821t;
        if (interfaceC1783x != null) {
            interfaceC1783x.mo3615a(menuC1772m, z3);
        }
    }

    @Override // p110j.InterfaceC1757C
    /* JADX INFO: renamed from: b */
    public final boolean mo4211b() {
        return !this.f7823v && this.f7815n.f8004E.isShowing();
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: d */
    public final boolean mo4215d() {
        return false;
    }

    @Override // p110j.InterfaceC1757C
    public final void dismiss() {
        if (mo4211b()) {
            this.f7815n.dismiss();
        }
    }

    @Override // p110j.InterfaceC1757C
    /* JADX INFO: renamed from: f */
    public final void mo4212f() {
        View view;
        if (mo4211b()) {
            return;
        }
        if (this.f7823v || (view = this.f7819r) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f7820s = view;
        C1811J0 c1811j0 = this.f7815n;
        c1811j0.f8004E.setOnDismissListener(this);
        c1811j0.f8020v = this;
        c1811j0.f8003D = true;
        c1811j0.f8004E.setFocusable(true);
        View view2 = this.f7820s;
        boolean z3 = this.f7822u == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f7822u = viewTreeObserver;
        if (z3) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f7816o);
        }
        view2.addOnAttachStateChangeListener(this.f7817p);
        c1811j0.f8019u = view2;
        c1811j0.f8016r = this.f7826y;
        boolean z4 = this.f7824w;
        Context context = this.f7809h;
        C1769j c1769j = this.f7811j;
        if (!z4) {
            this.f7825x = AbstractC1780u.m4270m(c1769j, context, this.f7813l);
            this.f7824w = true;
        }
        c1811j0.m4298r(this.f7825x);
        c1811j0.f8004E.setInputMethodMode(2);
        Rect rect = this.f7961g;
        c1811j0.f8002C = rect != null ? new Rect(rect) : null;
        c1811j0.mo4212f();
        C1890r0 c1890r0 = c1811j0.f8007i;
        c1890r0.setOnKeyListener(this);
        if (this.f7827z) {
            MenuC1772m menuC1772m = this.f7810i;
            if (menuC1772m.f7907m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c1890r0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC1772m.f7907m);
                }
                frameLayout.setEnabled(false);
                c1890r0.addHeaderView(frameLayout, null, false);
            }
        }
        c1811j0.mo4296o(c1769j);
        c1811j0.mo4212f();
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: g */
    public final void mo4216g() {
        this.f7824w = false;
        C1769j c1769j = this.f7811j;
        if (c1769j != null) {
            c1769j.notifyDataSetChanged();
        }
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: i */
    public final void mo4217i(InterfaceC1783x interfaceC1783x) {
        this.f7821t = interfaceC1783x;
    }

    @Override // p110j.InterfaceC1757C
    /* JADX INFO: renamed from: j */
    public final C1890r0 mo4213j() {
        return this.f7815n.f8007i;
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: k */
    public final boolean mo4218k(SubMenuC1759E subMenuC1759E) {
        if (subMenuC1759E.hasVisibleItems()) {
            View view = this.f7820s;
            C1782w c1782w = new C1782w(this.f7814m, this.f7809h, view, subMenuC1759E, this.f7812k);
            InterfaceC1783x interfaceC1783x = this.f7821t;
            c1782w.f7970h = interfaceC1783x;
            AbstractC1780u abstractC1780u = c1782w.f7971i;
            if (abstractC1780u != null) {
                abstractC1780u.mo4217i(interfaceC1783x);
            }
            boolean zM4271u = AbstractC1780u.m4271u(subMenuC1759E);
            c1782w.f7969g = zM4271u;
            AbstractC1780u abstractC1780u2 = c1782w.f7971i;
            if (abstractC1780u2 != null) {
                abstractC1780u2.mo4221o(zM4271u);
            }
            c1782w.f7972j = this.f7818q;
            this.f7818q = null;
            this.f7810i.m4253c(false);
            C1811J0 c1811j0 = this.f7815n;
            int width = c1811j0.f8010l;
            int iM4292g = c1811j0.m4292g();
            if ((Gravity.getAbsoluteGravity(this.f7826y, this.f7819r.getLayoutDirection()) & 7) == 5) {
                width += this.f7819r.getWidth();
            }
            if (!c1782w.m4273b()) {
                if (c1782w.f7967e != null) {
                    c1782w.m4275d(width, iM4292g, true, true);
                }
            }
            InterfaceC1783x interfaceC1783x2 = this.f7821t;
            if (interfaceC1783x2 != null) {
                interfaceC1783x2.mo3617c(subMenuC1759E);
            }
            return true;
        }
        return false;
    }

    @Override // p110j.AbstractC1780u
    /* JADX INFO: renamed from: n */
    public final void mo4220n(View view) {
        this.f7819r = view;
    }

    @Override // p110j.AbstractC1780u
    /* JADX INFO: renamed from: o */
    public final void mo4221o(boolean z3) {
        this.f7811j.f7890i = z3;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f7823v = true;
        this.f7810i.m4253c(true);
        ViewTreeObserver viewTreeObserver = this.f7822u;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f7822u = this.f7820s.getViewTreeObserver();
            }
            this.f7822u.removeGlobalOnLayoutListener(this.f7816o);
            this.f7822u = null;
        }
        this.f7820s.removeOnAttachStateChangeListener(this.f7817p);
        C1781v c1781v = this.f7818q;
        if (c1781v != null) {
            c1781v.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i3 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p110j.AbstractC1780u
    /* JADX INFO: renamed from: p */
    public final void mo4222p(int i3) {
        this.f7826y = i3;
    }

    @Override // p110j.AbstractC1780u
    /* JADX INFO: renamed from: q */
    public final void mo4223q(int i3) {
        this.f7815n.f8010l = i3;
    }

    @Override // p110j.AbstractC1780u
    /* JADX INFO: renamed from: r */
    public final void mo4224r(PopupWindow.OnDismissListener onDismissListener) {
        this.f7818q = (C1781v) onDismissListener;
    }

    @Override // p110j.AbstractC1780u
    /* JADX INFO: renamed from: s */
    public final void mo4225s(boolean z3) {
        this.f7827z = z3;
    }

    @Override // p110j.AbstractC1780u
    /* JADX INFO: renamed from: t */
    public final void mo4226t(int i3) {
        this.f7815n.m4295n(i3);
    }

    @Override // p110j.AbstractC1780u
    /* JADX INFO: renamed from: l */
    public final void mo4219l(MenuC1772m menuC1772m) {
    }
}

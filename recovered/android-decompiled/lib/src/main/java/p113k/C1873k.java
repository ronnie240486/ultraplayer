package p113k;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.zuxoplayer.app.R;
import java.util.ArrayList;
import p089d1.C1447t;
import p110j.AbstractC1780u;
import p110j.ActionProviderVisibilityListenerC1775p;
import p110j.C1774o;
import p110j.InterfaceC1755A;
import p110j.InterfaceC1783x;
import p110j.InterfaceC1784y;
import p110j.InterfaceC1785z;
import p110j.MenuC1772m;
import p110j.SubMenuC1759E;

/* JADX INFO: renamed from: k.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1873k implements InterfaceC1784y {

    /* JADX INFO: renamed from: A */
    public RunnableC1867i f8194A;

    /* JADX INFO: renamed from: B */
    public C1864h f8195B;

    /* JADX INFO: renamed from: g */
    public final Context f8197g;

    /* JADX INFO: renamed from: h */
    public Context f8198h;

    /* JADX INFO: renamed from: i */
    public MenuC1772m f8199i;

    /* JADX INFO: renamed from: j */
    public final LayoutInflater f8200j;

    /* JADX INFO: renamed from: k */
    public InterfaceC1783x f8201k;

    /* JADX INFO: renamed from: n */
    public InterfaceC1755A f8204n;

    /* JADX INFO: renamed from: o */
    public C1870j f8205o;

    /* JADX INFO: renamed from: p */
    public Drawable f8206p;

    /* JADX INFO: renamed from: q */
    public boolean f8207q;

    /* JADX INFO: renamed from: r */
    public boolean f8208r;

    /* JADX INFO: renamed from: s */
    public boolean f8209s;

    /* JADX INFO: renamed from: t */
    public int f8210t;

    /* JADX INFO: renamed from: u */
    public int f8211u;

    /* JADX INFO: renamed from: v */
    public int f8212v;

    /* JADX INFO: renamed from: w */
    public boolean f8213w;

    /* JADX INFO: renamed from: y */
    public C1861g f8215y;

    /* JADX INFO: renamed from: z */
    public C1861g f8216z;

    /* JADX INFO: renamed from: l */
    public final int f8202l = R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: m */
    public final int f8203m = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: x */
    public final SparseBooleanArray f8214x = new SparseBooleanArray();

    /* JADX INFO: renamed from: C */
    public final C1447t f8196C = new C1447t(14, this);

    public C1873k(Context context) {
        this.f8197g = context;
        this.f8200j = LayoutInflater.from(context);
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: a */
    public final void mo4214a(MenuC1772m menuC1772m, boolean z3) {
        m4392f();
        C1861g c1861g = this.f8216z;
        if (c1861g != null && c1861g.m4273b()) {
            c1861g.f7971i.dismiss();
        }
        InterfaceC1783x interfaceC1783x = this.f8201k;
        if (interfaceC1783x != null) {
            interfaceC1783x.mo3615a(menuC1772m, z3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final View m4391b(C1774o c1774o, View view, ViewGroup viewGroup) {
        InterfaceC1785z interfaceC1785z;
        View actionView = c1774o.getActionView();
        if (actionView == null || c1774o.m4268e()) {
            if (view instanceof InterfaceC1785z) {
                interfaceC1785z = (InterfaceC1785z) view;
            } else {
                interfaceC1785z = (InterfaceC1785z) this.f8200j.inflate(this.f8203m, viewGroup, false);
            }
            interfaceC1785z.mo2313c(c1774o);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC1785z;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f8204n);
            if (this.f8195B == null) {
                this.f8195B = new C1864h(this);
            }
            actionMenuItemView.setPopupCallback(this.f8195B);
            actionView = (View) interfaceC1785z;
        }
        actionView.setVisibility(c1774o.f7924C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C1879m)) {
            actionView.setLayoutParams(ActionMenuView.m2334j(layoutParams));
        }
        return actionView;
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: c */
    public final void mo4246c(Context context, MenuC1772m menuC1772m) {
        this.f8198h = context;
        LayoutInflater.from(context);
        this.f8199i = menuC1772m;
        Resources resources = context.getResources();
        if (!this.f8209s) {
            this.f8208r = true;
        }
        int i3 = 2;
        this.f8210t = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i4 > 600 || ((i4 > 960 && i5 > 720) || (i4 > 720 && i5 > 960))) {
            i3 = 5;
        } else if (i4 >= 500 || ((i4 > 640 && i5 > 480) || (i4 > 480 && i5 > 640))) {
            i3 = 4;
        } else if (i4 >= 360) {
            i3 = 3;
        }
        this.f8212v = i3;
        int measuredWidth = this.f8210t;
        if (this.f8208r) {
            if (this.f8205o == null) {
                C1870j c1870j = new C1870j(this, this.f8197g);
                this.f8205o = c1870j;
                if (this.f8207q) {
                    c1870j.setImageDrawable(this.f8206p);
                    this.f8206p = null;
                    this.f8207q = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f8205o.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f8205o.getMeasuredWidth();
        } else {
            this.f8205o = null;
        }
        this.f8211u = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: d */
    public final boolean mo4215d() {
        ArrayList arrayListM4257l;
        int size;
        int i3;
        boolean z3;
        C1873k c1873k = this;
        MenuC1772m menuC1772m = c1873k.f8199i;
        if (menuC1772m != null) {
            arrayListM4257l = menuC1772m.m4257l();
            size = arrayListM4257l.size();
        } else {
            arrayListM4257l = null;
            size = 0;
        }
        int i4 = c1873k.f8212v;
        int i5 = c1873k.f8211u;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c1873k.f8204n;
        int i6 = 0;
        boolean z4 = false;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i3 = 2;
            z3 = true;
            if (i6 >= size) {
                break;
            }
            C1774o c1774o = (C1774o) arrayListM4257l.get(i6);
            int i9 = c1774o.f7949y;
            if ((i9 & 2) == 2) {
                i7++;
            } else if ((i9 & 1) == 1) {
                i8++;
            } else {
                z4 = true;
            }
            if (c1873k.f8213w && c1774o.f7924C) {
                i4 = 0;
            }
            i6++;
        }
        if (c1873k.f8208r && (z4 || i8 + i7 > i4)) {
            i4--;
        }
        int i10 = i4 - i7;
        SparseBooleanArray sparseBooleanArray = c1873k.f8214x;
        sparseBooleanArray.clear();
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            C1774o c1774o2 = (C1774o) arrayListM4257l.get(i11);
            int i13 = c1774o2.f7949y;
            boolean z5 = (i13 & 2) == i3;
            int i14 = c1774o2.f7926b;
            if (z5) {
                View viewM4391b = c1873k.m4391b(c1774o2, null, viewGroup);
                viewM4391b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewM4391b.getMeasuredWidth();
                i5 -= measuredWidth;
                if (i12 == 0) {
                    i12 = measuredWidth;
                }
                if (i14 != 0) {
                    sparseBooleanArray.put(i14, z3);
                }
                c1774o2.m4269f(z3);
            } else {
                if ((i13 & 1) == z3) {
                    boolean z6 = sparseBooleanArray.get(i14);
                    boolean z7 = (i10 > 0 || z6) && i5 > 0;
                    if (z7) {
                        View viewM4391b2 = c1873k.m4391b(c1774o2, null, viewGroup);
                        viewM4391b2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewM4391b2.getMeasuredWidth();
                        i5 -= measuredWidth2;
                        if (i12 == 0) {
                            i12 = measuredWidth2;
                        }
                        z7 &= i5 + i12 > 0;
                    }
                    if (z7 && i14 != 0) {
                        sparseBooleanArray.put(i14, true);
                    } else if (z6) {
                        sparseBooleanArray.put(i14, false);
                        for (int i15 = 0; i15 < i11; i15++) {
                            C1774o c1774o3 = (C1774o) arrayListM4257l.get(i15);
                            if (c1774o3.f7926b == i14) {
                                if ((c1774o3.f7948x & 32) == 32) {
                                    i10++;
                                }
                                c1774o3.m4269f(false);
                            }
                        }
                    }
                    if (z7) {
                        i10--;
                    }
                    c1774o2.m4269f(z7);
                } else {
                    c1774o2.m4269f(false);
                }
                i11++;
                i3 = 2;
                c1873k = this;
                z3 = true;
            }
            i11++;
            i3 = 2;
            c1873k = this;
            z3 = true;
        }
        return true;
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: e */
    public final boolean mo4247e(C1774o c1774o) {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4392f() {
        Object obj;
        RunnableC1867i runnableC1867i = this.f8194A;
        if (runnableC1867i != null && (obj = this.f8204n) != null) {
            ((View) obj).removeCallbacks(runnableC1867i);
            this.f8194A = null;
            return true;
        }
        C1861g c1861g = this.f8215y;
        if (c1861g == null) {
            return false;
        }
        if (c1861g.m4273b()) {
            c1861g.f7971i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: g */
    public final void mo4216g() {
        int i3;
        ViewGroup viewGroup = (ViewGroup) this.f8204n;
        ArrayList arrayList = null;
        boolean z3 = false;
        if (viewGroup != null) {
            MenuC1772m menuC1772m = this.f8199i;
            if (menuC1772m != null) {
                menuC1772m.m4256i();
                ArrayList arrayListM4257l = this.f8199i.m4257l();
                int size = arrayListM4257l.size();
                i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    C1774o c1774o = (C1774o) arrayListM4257l.get(i4);
                    if ((c1774o.f7948x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i3);
                        C1774o itemData = childAt instanceof InterfaceC1785z ? ((InterfaceC1785z) childAt).getItemData() : null;
                        View viewM4391b = m4391b(c1774o, childAt, viewGroup);
                        if (c1774o != itemData) {
                            viewM4391b.setPressed(false);
                            viewM4391b.jumpDrawablesToCurrentState();
                        }
                        if (viewM4391b != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewM4391b.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewM4391b);
                            }
                            ((ViewGroup) this.f8204n).addView(viewM4391b, i3);
                        }
                        i3++;
                    }
                }
            } else {
                i3 = 0;
            }
            while (i3 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i3) == this.f8205o) {
                    i3++;
                } else {
                    viewGroup.removeViewAt(i3);
                }
            }
        }
        ((View) this.f8204n).requestLayout();
        MenuC1772m menuC1772m2 = this.f8199i;
        if (menuC1772m2 != null) {
            menuC1772m2.m4256i();
            ArrayList arrayList2 = menuC1772m2.f7903i;
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                ActionProviderVisibilityListenerC1775p actionProviderVisibilityListenerC1775p = ((C1774o) arrayList2.get(i5)).f7922A;
            }
        }
        MenuC1772m menuC1772m3 = this.f8199i;
        if (menuC1772m3 != null) {
            menuC1772m3.m4256i();
            arrayList = menuC1772m3.f7904j;
        }
        if (this.f8208r && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !((C1774o) arrayList.get(0)).f7924C;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.f8205o == null) {
                this.f8205o = new C1870j(this, this.f8197g);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f8205o.getParent();
            if (viewGroup3 != this.f8204n) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f8205o);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f8204n;
                C1870j c1870j = this.f8205o;
                actionMenuView.getClass();
                C1879m c1879mM2333i = ActionMenuView.m2333i();
                c1879mM2333i.f8222a = true;
                actionMenuView.addView(c1870j, c1879mM2333i);
            }
        } else {
            C1870j c1870j2 = this.f8205o;
            if (c1870j2 != null) {
                Object parent = c1870j2.getParent();
                Object obj = this.f8204n;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f8205o);
                }
            }
        }
        ((ActionMenuView) this.f8204n).setOverflowReserved(this.f8208r);
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: h */
    public final boolean mo4248h(C1774o c1774o) {
        return false;
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: i */
    public final void mo4217i(InterfaceC1783x interfaceC1783x) {
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m4393j() {
        C1861g c1861g = this.f8215y;
        return c1861g != null && c1861g.m4273b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: k */
    public final boolean mo4218k(SubMenuC1759E subMenuC1759E) {
        boolean z3;
        if (subMenuC1759E.hasVisibleItems()) {
            SubMenuC1759E subMenuC1759E2 = subMenuC1759E;
            while (true) {
                MenuC1772m menuC1772m = subMenuC1759E2.f7829z;
                if (menuC1772m == this.f8199i) {
                    break;
                }
                subMenuC1759E2 = (SubMenuC1759E) menuC1772m;
            }
            ViewGroup viewGroup = (ViewGroup) this.f8204n;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    if ((childAt instanceof InterfaceC1785z) && ((InterfaceC1785z) childAt).getItemData() == subMenuC1759E2.f7828A) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                subMenuC1759E.f7828A.getClass();
                int size = subMenuC1759E.f7900f.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        z3 = false;
                        break;
                    }
                    MenuItem item = subMenuC1759E.getItem(i4);
                    if (item.isVisible() && item.getIcon() != null) {
                        z3 = true;
                        break;
                    }
                    i4++;
                }
                C1861g c1861g = new C1861g(this, this.f8198h, subMenuC1759E, view);
                this.f8216z = c1861g;
                c1861g.f7969g = z3;
                AbstractC1780u abstractC1780u = c1861g.f7971i;
                if (abstractC1780u != null) {
                    abstractC1780u.mo4221o(z3);
                }
                C1861g c1861g2 = this.f8216z;
                if (!c1861g2.m4273b()) {
                    if (c1861g2.f7967e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c1861g2.m4275d(0, 0, false, false);
                }
                InterfaceC1783x interfaceC1783x = this.f8201k;
                if (interfaceC1783x != null) {
                    interfaceC1783x.mo3617c(subMenuC1759E);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m4394l() {
        MenuC1772m menuC1772m;
        if (!this.f8208r || m4393j() || (menuC1772m = this.f8199i) == null || this.f8204n == null || this.f8194A != null) {
            return false;
        }
        menuC1772m.m4256i();
        if (menuC1772m.f7904j.isEmpty()) {
            return false;
        }
        RunnableC1867i runnableC1867i = new RunnableC1867i(this, new C1861g(this, this.f8198h, this.f8199i, this.f8205o));
        this.f8194A = runnableC1867i;
        ((View) this.f8204n).post(runnableC1867i);
        return true;
    }
}

package p113k;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p106i.InterfaceC1734b;
import p110j.C1774o;
import p110j.C1776q;
import p110j.InterfaceC1784y;
import p110j.MenuC1772m;
import p110j.SubMenuC1759E;

/* JADX INFO: renamed from: k.Y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1840Y0 implements InterfaceC1784y {

    /* JADX INFO: renamed from: g */
    public MenuC1772m f8111g;

    /* JADX INFO: renamed from: h */
    public C1774o f8112h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Toolbar f8113i;

    public C1840Y0(Toolbar toolbar) {
        this.f8113i = toolbar;
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: c */
    public final void mo4246c(Context context, MenuC1772m menuC1772m) {
        C1774o c1774o;
        MenuC1772m menuC1772m2 = this.f8111g;
        if (menuC1772m2 != null && (c1774o = this.f8112h) != null) {
            menuC1772m2.mo4227d(c1774o);
        }
        this.f8111g = menuC1772m;
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: d */
    public final boolean mo4215d() {
        return false;
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: e */
    public final boolean mo4247e(C1774o c1774o) {
        Toolbar toolbar = this.f8113i;
        toolbar.m2346c();
        ViewParent parent = toolbar.f3928n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f3928n);
            }
            toolbar.addView(toolbar.f3928n);
        }
        View actionView = c1774o.getActionView();
        toolbar.f3929o = actionView;
        this.f8112h = c1774o;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f3929o);
            }
            C1842Z0 c1842z0M2340h = Toolbar.m2340h();
            c1842z0M2340h.f8115a = (toolbar.f3934t & 112) | 8388611;
            c1842z0M2340h.f8116b = 2;
            toolbar.f3929o.setLayoutParams(c1842z0M2340h);
            toolbar.addView(toolbar.f3929o);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C1842Z0) childAt.getLayoutParams()).f8116b != 2 && childAt != toolbar.f3921g) {
                toolbar.removeViewAt(childCount);
                toolbar.f3908K.add(childAt);
            }
        }
        toolbar.requestLayout();
        c1774o.f7924C = true;
        c1774o.f7938n.m4258p(false);
        KeyEvent.Callback callback = toolbar.f3929o;
        if (callback instanceof InterfaceC1734b) {
            ((C1776q) ((InterfaceC1734b) callback)).f7954g.onActionViewExpanded();
        }
        toolbar.m2359t();
        return true;
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: g */
    public final void mo4216g() {
        if (this.f8112h != null) {
            MenuC1772m menuC1772m = this.f8111g;
            if (menuC1772m != null) {
                int size = menuC1772m.f7900f.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (this.f8111g.getItem(i3) == this.f8112h) {
                        return;
                    }
                }
            }
            mo4248h(this.f8112h);
        }
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: h */
    public final boolean mo4248h(C1774o c1774o) {
        Toolbar toolbar = this.f8113i;
        KeyEvent.Callback callback = toolbar.f3929o;
        if (callback instanceof InterfaceC1734b) {
            ((C1776q) ((InterfaceC1734b) callback)).f7954g.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f3929o);
        toolbar.removeView(toolbar.f3928n);
        toolbar.f3929o = null;
        ArrayList arrayList = toolbar.f3908K;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f8112h = null;
        toolbar.requestLayout();
        c1774o.f7924C = false;
        c1774o.f7938n.m4258p(false);
        toolbar.m2359t();
        return true;
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: k */
    public final boolean mo4218k(SubMenuC1759E subMenuC1759E) {
        return false;
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: a */
    public final void mo4214a(MenuC1772m menuC1772m, boolean z3) {
    }
}

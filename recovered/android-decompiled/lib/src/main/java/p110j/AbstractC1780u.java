package p110j;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: j.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1780u implements InterfaceC1757C, InterfaceC1784y, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: g */
    public Rect f7961g;

    /* JADX INFO: renamed from: m */
    public static int m4270m(ListAdapter listAdapter, Context context, int i3) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < count; i6++) {
            int itemViewType = listAdapter.getItemViewType(i6);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i6, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i3) {
                return i3;
            }
            if (measuredWidth > i4) {
                i4 = measuredWidth;
            }
        }
        return i4;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m4271u(MenuC1772m menuC1772m) {
        int size = menuC1772m.f7900f.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = menuC1772m.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: e */
    public final boolean mo4247e(C1774o c1774o) {
        return false;
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: h */
    public final boolean mo4248h(C1774o c1774o) {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo4219l(MenuC1772m menuC1772m);

    /* JADX INFO: renamed from: n */
    public abstract void mo4220n(View view);

    /* JADX INFO: renamed from: o */
    public abstract void mo4221o(boolean z3);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C1769j) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C1769j) listAdapter).f7888g.m4259q((MenuItem) listAdapter.getItem(i3), this, !(this instanceof ViewOnKeyListenerC1766g) ? 0 : 4);
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo4222p(int i3);

    /* JADX INFO: renamed from: q */
    public abstract void mo4223q(int i3);

    /* JADX INFO: renamed from: r */
    public abstract void mo4224r(PopupWindow.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: s */
    public abstract void mo4225s(boolean z3);

    /* JADX INFO: renamed from: t */
    public abstract void mo4226t(int i3);

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: c */
    public final void mo4246c(Context context, MenuC1772m menuC1772m) {
    }
}

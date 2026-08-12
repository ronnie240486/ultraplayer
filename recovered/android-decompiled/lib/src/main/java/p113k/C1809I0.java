package p113k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import p110j.C1769j;
import p110j.C1774o;
import p110j.MenuC1772m;

/* JADX INFO: renamed from: k.I0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1809I0 extends C1890r0 {

    /* JADX INFO: renamed from: s */
    public final int f8034s;

    /* JADX INFO: renamed from: t */
    public final int f8035t;

    /* JADX INFO: renamed from: u */
    public InterfaceC1803F0 f8036u;

    /* JADX INFO: renamed from: v */
    public C1774o f8037v;

    public C1809I0(Context context, boolean z3) {
        super(context, z3);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f8034s = 21;
            this.f8035t = 22;
        } else {
            this.f8034s = 22;
            this.f8035t = 21;
        }
    }

    @Override // p113k.C1890r0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C1769j c1769j;
        int headersCount;
        int iPointToPosition;
        int i3;
        if (this.f8036u != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c1769j = (C1769j) headerViewListAdapter.getWrappedAdapter();
            } else {
                c1769j = (C1769j) adapter;
                headersCount = 0;
            }
            C1774o item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i3 = iPointToPosition - headersCount) < 0 || i3 >= c1769j.getCount()) ? null : c1769j.getItem(i3);
            C1774o c1774o = this.f8037v;
            if (c1774o != item) {
                MenuC1772m menuC1772m = c1769j.f7888g;
                if (c1774o != null) {
                    this.f8036u.mo3624l(menuC1772m, c1774o);
                }
                this.f8037v = item;
                if (item != null) {
                    this.f8036u.mo3618d(menuC1772m, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i3 == this.f8034s) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i3 != this.f8035t) {
            return super.onKeyDown(i3, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C1769j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C1769j) adapter).f7888g.m4253c(false);
        return true;
    }

    public void setHoverListener(InterfaceC1803F0 interfaceC1803F0) {
        this.f8036u = interfaceC1803F0;
    }

    @Override // p113k.C1890r0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}

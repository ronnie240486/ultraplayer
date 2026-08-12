package p110j;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: renamed from: j.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1769j extends BaseAdapter {

    /* JADX INFO: renamed from: g */
    public final MenuC1772m f7888g;

    /* JADX INFO: renamed from: h */
    public int f7889h = -1;

    /* JADX INFO: renamed from: i */
    public boolean f7890i;

    /* JADX INFO: renamed from: j */
    public final boolean f7891j;

    /* JADX INFO: renamed from: k */
    public final LayoutInflater f7892k;

    /* JADX INFO: renamed from: l */
    public final int f7893l;

    public C1769j(MenuC1772m menuC1772m, LayoutInflater layoutInflater, boolean z3, int i3) {
        this.f7891j = z3;
        this.f7892k = layoutInflater;
        this.f7888g = menuC1772m;
        this.f7893l = i3;
        m4249a();
    }

    /* JADX INFO: renamed from: a */
    public final void m4249a() {
        MenuC1772m menuC1772m = this.f7888g;
        C1774o c1774o = menuC1772m.f7916v;
        if (c1774o != null) {
            menuC1772m.m4256i();
            ArrayList arrayList = menuC1772m.f7904j;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((C1774o) arrayList.get(i3)) == c1774o) {
                    this.f7889h = i3;
                    return;
                }
            }
        }
        this.f7889h = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1774o getItem(int i3) {
        ArrayList arrayListM4257l;
        MenuC1772m menuC1772m = this.f7888g;
        if (this.f7891j) {
            menuC1772m.m4256i();
            arrayListM4257l = menuC1772m.f7904j;
        } else {
            arrayListM4257l = menuC1772m.m4257l();
        }
        int i4 = this.f7889h;
        if (i4 >= 0 && i3 >= i4) {
            i3++;
        }
        return (C1774o) arrayListM4257l.get(i3);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListM4257l;
        MenuC1772m menuC1772m = this.f7888g;
        if (this.f7891j) {
            menuC1772m.m4256i();
            arrayListM4257l = menuC1772m.f7904j;
        } else {
            arrayListM4257l = menuC1772m.m4257l();
        }
        return this.f7889h < 0 ? arrayListM4257l.size() : arrayListM4257l.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        return i3;
    }

    @Override // android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        boolean z3 = false;
        if (view == null) {
            view = this.f7892k.inflate(this.f7893l, viewGroup, false);
        }
        int i4 = getItem(i3).f7926b;
        int i5 = i3 - 1;
        int i6 = i5 >= 0 ? getItem(i5).f7926b : i4;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f7888g.mo4232m() && i4 != i6) {
            z3 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z3);
        InterfaceC1785z interfaceC1785z = (InterfaceC1785z) view;
        if (this.f7890i) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC1785z.mo2313c(getItem(i3));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m4249a();
        super.notifyDataSetChanged();
    }
}

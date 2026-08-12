package p110j;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.zuxoplayer.app.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: j.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1767h extends BaseAdapter {

    /* JADX INFO: renamed from: g */
    public int f7880g = -1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1768i f7881h;

    public C1767h(C1768i c1768i) {
        this.f7881h = c1768i;
        m4244a();
    }

    /* JADX INFO: renamed from: a */
    public final void m4244a() {
        MenuC1772m menuC1772m = this.f7881h.f7884i;
        C1774o c1774o = menuC1772m.f7916v;
        if (c1774o != null) {
            menuC1772m.m4256i();
            ArrayList arrayList = menuC1772m.f7904j;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((C1774o) arrayList.get(i3)) == c1774o) {
                    this.f7880g = i3;
                    return;
                }
            }
        }
        this.f7880g = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1774o getItem(int i3) {
        C1768i c1768i = this.f7881h;
        MenuC1772m menuC1772m = c1768i.f7884i;
        menuC1772m.m4256i();
        ArrayList arrayList = menuC1772m.f7904j;
        c1768i.getClass();
        int i4 = this.f7880g;
        if (i4 >= 0 && i3 >= i4) {
            i3++;
        }
        return (C1774o) arrayList.get(i3);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C1768i c1768i = this.f7881h;
        MenuC1772m menuC1772m = c1768i.f7884i;
        menuC1772m.m4256i();
        int size = menuC1772m.f7904j.size();
        c1768i.getClass();
        return this.f7880g < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        return i3;
    }

    @Override // android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f7881h.f7883h.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC1785z) view).mo2313c(getItem(i3));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m4244a();
        super.notifyDataSetChanged();
    }
}

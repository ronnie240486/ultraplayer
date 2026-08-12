package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.media.session.C0858A;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p110j.C1774o;
import p110j.InterfaceC1755A;
import p110j.InterfaceC1771l;
import p110j.MenuC1772m;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC1771l, InterfaceC1755A, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: h */
    public static final int[] f3793h = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: g */
    public MenuC1772m f3794g;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0858A c0858aM2148Q = C0858A.m2148Q(context, attributeSet, f3793h, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) c0858aM2148Q.f3640i;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c0858aM2148Q.m2158F(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c0858aM2148Q.m2158F(1));
        }
        c0858aM2148Q.m2170S();
    }

    @Override // p110j.InterfaceC1755A
    /* JADX INFO: renamed from: a */
    public final void mo2316a(MenuC1772m menuC1772m) {
        this.f3794g = menuC1772m;
    }

    @Override // p110j.InterfaceC1771l
    /* JADX INFO: renamed from: b */
    public final boolean mo2317b(C1774o c1774o) {
        return this.f3794g.m4259q(c1774o, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        mo2317b((C1774o) getAdapter().getItem(i3));
    }
}

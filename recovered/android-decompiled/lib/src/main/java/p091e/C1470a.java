package p091e;

import android.view.View;
import android.widget.AbsListView;

/* JADX INFO: renamed from: e.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1470a implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f6552a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f6553b;

    public C1470a(View view, View view2) {
        this.f6552a = view;
        this.f6553b = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i3, int i4, int i5) {
        C1474e.m3701b(absListView, this.f6552a, this.f6553b);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i3) {
    }
}

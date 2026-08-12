package p104h1;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import p000A.C0027b;
import p003B.C0090l;

/* JADX INFO: renamed from: h1.V */
/* JADX INFO: loaded from: classes.dex */
public final class C1637V extends C0027b {

    /* JADX INFO: renamed from: d */
    public final RecyclerView f7426d;

    /* JADX INFO: renamed from: e */
    public final C1636U f7427e;

    public C1637V(RecyclerView recyclerView) {
        this.f7426d = recyclerView;
        C1636U c1636u = this.f7427e;
        if (c1636u != null) {
            this.f7427e = c1636u;
        } else {
            this.f7427e = new C1636U(this);
        }
    }

    @Override // p000A.C0027b
    /* JADX INFO: renamed from: c */
    public final void mo111c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo111c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f7426d.m2753H()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo2716O(accessibilityEvent);
        }
    }

    @Override // p000A.C0027b
    /* JADX INFO: renamed from: d */
    public final void mo112d(View view, C0090l c0090l) {
        this.f31a.onInitializeAccessibilityNodeInfo(view, c0090l.f123a);
        RecyclerView recyclerView = this.f7426d;
        if (recyclerView.m2753H() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC1621E layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f7351b;
        layoutManager.mo2671P(recyclerView2.f4748i, recyclerView2.f4751j0, c0090l);
    }

    @Override // p000A.C0027b
    /* JADX INFO: renamed from: g */
    public final boolean mo115g(View view, int i3, Bundle bundle) {
        int iM4008B;
        int iM4028z;
        if (super.mo115g(view, i3, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f7426d;
        if (!recyclerView.m2753H() && recyclerView.getLayoutManager() != null) {
            AbstractC1621E layoutManager = recyclerView.getLayoutManager();
            C1627K c1627k = layoutManager.f7351b.f4748i;
            int iHeight = layoutManager.f7363n;
            int iWidth = layoutManager.f7362m;
            Rect rect = new Rect();
            if (layoutManager.f7351b.getMatrix().isIdentity() && layoutManager.f7351b.getGlobalVisibleRect(rect)) {
                iHeight = rect.height();
                iWidth = rect.width();
            }
            if (i3 != 4096) {
                if (i3 != 8192) {
                    iM4008B = 0;
                } else {
                    iM4008B = layoutManager.f7351b.canScrollVertically(-1) ? -((iHeight - layoutManager.m4008B()) - layoutManager.m4027y()) : 0;
                    if (layoutManager.f7351b.canScrollHorizontally(-1)) {
                        iM4028z = -((iWidth - layoutManager.m4028z()) - layoutManager.m4007A());
                    }
                }
            } else {
                iM4008B = layoutManager.f7351b.canScrollVertically(1) ? (iHeight - layoutManager.m4008B()) - layoutManager.m4027y() : 0;
                iM4028z = layoutManager.f7351b.canScrollHorizontally(1) ? (iWidth - layoutManager.m4028z()) - layoutManager.m4007A() : 0;
            }
            if (iM4008B != 0 || iM4028z != 0) {
                layoutManager.f7351b.m2770Y(iM4028z, iM4008B, true);
                return true;
            }
        }
        return false;
    }
}

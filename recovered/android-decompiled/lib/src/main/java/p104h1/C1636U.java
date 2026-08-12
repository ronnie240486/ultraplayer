package p104h1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import p000A.C0027b;
import p000A.C0031d;
import p003B.C0090l;

/* JADX INFO: renamed from: h1.U */
/* JADX INFO: loaded from: classes.dex */
public final class C1636U extends C0027b {

    /* JADX INFO: renamed from: d */
    public final C1637V f7424d;

    /* JADX INFO: renamed from: e */
    public final WeakHashMap f7425e = new WeakHashMap();

    public C1636U(C1637V c1637v) {
        this.f7424d = c1637v;
    }

    @Override // p000A.C0027b
    /* JADX INFO: renamed from: a */
    public final boolean mo109a(View view, AccessibilityEvent accessibilityEvent) {
        C0027b c0027b = (C0027b) this.f7425e.get(view);
        return c0027b != null ? c0027b.mo109a(view, accessibilityEvent) : this.f31a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // p000A.C0027b
    /* JADX INFO: renamed from: b */
    public final C0031d mo110b(View view) {
        C0027b c0027b = (C0027b) this.f7425e.get(view);
        return c0027b != null ? c0027b.mo110b(view) : super.mo110b(view);
    }

    @Override // p000A.C0027b
    /* JADX INFO: renamed from: c */
    public final void mo111c(View view, AccessibilityEvent accessibilityEvent) {
        C0027b c0027b = (C0027b) this.f7425e.get(view);
        if (c0027b != null) {
            c0027b.mo111c(view, accessibilityEvent);
        } else {
            super.mo111c(view, accessibilityEvent);
        }
    }

    @Override // p000A.C0027b
    /* JADX INFO: renamed from: d */
    public final void mo112d(View view, C0090l c0090l) {
        C1637V c1637v = this.f7424d;
        boolean zM2753H = c1637v.f7426d.m2753H();
        View.AccessibilityDelegate accessibilityDelegate = this.f31a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0090l.f123a;
        if (!zM2753H) {
            RecyclerView recyclerView = c1637v.f7426d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().m4010Q(view, c0090l);
                C0027b c0027b = (C0027b) this.f7425e.get(view);
                if (c0027b != null) {
                    c0027b.mo112d(view, c0090l);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // p000A.C0027b
    /* JADX INFO: renamed from: e */
    public final void mo113e(View view, AccessibilityEvent accessibilityEvent) {
        C0027b c0027b = (C0027b) this.f7425e.get(view);
        if (c0027b != null) {
            c0027b.mo113e(view, accessibilityEvent);
        } else {
            super.mo113e(view, accessibilityEvent);
        }
    }

    @Override // p000A.C0027b
    /* JADX INFO: renamed from: f */
    public final boolean mo114f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0027b c0027b = (C0027b) this.f7425e.get(viewGroup);
        return c0027b != null ? c0027b.mo114f(viewGroup, view, accessibilityEvent) : this.f31a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // p000A.C0027b
    /* JADX INFO: renamed from: g */
    public final boolean mo115g(View view, int i3, Bundle bundle) {
        C1637V c1637v = this.f7424d;
        if (!c1637v.f7426d.m2753H()) {
            RecyclerView recyclerView = c1637v.f7426d;
            if (recyclerView.getLayoutManager() != null) {
                C0027b c0027b = (C0027b) this.f7425e.get(view);
                if (c0027b != null) {
                    if (c0027b.mo115g(view, i3, bundle)) {
                        return true;
                    }
                } else if (super.mo115g(view, i3, bundle)) {
                    return true;
                }
                C1627K c1627k = recyclerView.getLayoutManager().f7351b.f4748i;
                return false;
            }
        }
        return super.mo115g(view, i3, bundle);
    }

    @Override // p000A.C0027b
    /* JADX INFO: renamed from: h */
    public final void mo116h(View view, int i3) {
        C0027b c0027b = (C0027b) this.f7425e.get(view);
        if (c0027b != null) {
            c0027b.mo116h(view, i3);
        } else {
            super.mo116h(view, i3);
        }
    }

    @Override // p000A.C0027b
    /* JADX INFO: renamed from: i */
    public final void mo117i(View view, AccessibilityEvent accessibilityEvent) {
        C0027b c0027b = (C0027b) this.f7425e.get(view);
        if (c0027b != null) {
            c0027b.mo117i(view, accessibilityEvent);
        } else {
            super.mo117i(view, accessibilityEvent);
        }
    }
}

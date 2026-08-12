package p104h1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p000A.C0058r;

/* JADX INFO: renamed from: h1.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1666w {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView f7586a;

    public /* synthetic */ C1666w(RecyclerView recyclerView) {
        this.f7586a = recyclerView;
    }

    /* JADX INFO: renamed from: a */
    public void m4092a(C1642a c1642a) {
        int i3 = c1642a.f7450a;
        RecyclerView recyclerView = this.f7586a;
        if (i3 == 1) {
            recyclerView.f4768s.mo2674S(c1642a.f7451b, c1642a.f7452c);
            return;
        }
        if (i3 == 2) {
            recyclerView.f4768s.mo2677V(c1642a.f7451b, c1642a.f7452c);
        } else if (i3 == 4) {
            recyclerView.f4768s.mo2679W(c1642a.f7451b, c1642a.f7452c);
        } else {
            if (i3 != 8) {
                return;
            }
            recyclerView.f4768s.mo2676U(c1642a.f7451b, c1642a.f7452c);
        }
    }

    /* JADX INFO: renamed from: b */
    public AbstractC1635T m4093b(int i3) {
        RecyclerView recyclerView = this.f7586a;
        int iM2163K = recyclerView.f4754l.m2163K();
        AbstractC1635T abstractC1635T = null;
        for (int i4 = 0; i4 < iM2163K; i4++) {
            AbstractC1635T abstractC1635TM2741F = RecyclerView.m2741F(recyclerView.f4754l.m2162J(i4));
            if (abstractC1635TM2741F != null && !abstractC1635TM2741F.m4053g() && abstractC1635TM2741F.f7408c == i3) {
                if (!((ArrayList) recyclerView.f4754l.f3641j).contains(abstractC1635TM2741F.f7406a)) {
                    abstractC1635T = abstractC1635TM2741F;
                    break;
                }
                abstractC1635T = abstractC1635TM2741F;
            }
        }
        if (abstractC1635T == null || ((ArrayList) recyclerView.f4754l.f3641j).contains(abstractC1635T.f7406a)) {
            return null;
        }
        return abstractC1635T;
    }

    /* JADX INFO: renamed from: c */
    public void m4094c(int i3, int i4) {
        int i5;
        int i6;
        RecyclerView recyclerView = this.f7586a;
        int iM2163K = recyclerView.f4754l.m2163K();
        int i7 = i4 + i3;
        for (int i8 = 0; i8 < iM2163K; i8++) {
            View viewM2162J = recyclerView.f4754l.m2162J(i8);
            AbstractC1635T abstractC1635TM2741F = RecyclerView.m2741F(viewM2162J);
            if (abstractC1635TM2741F != null && !abstractC1635TM2741F.m4060n() && (i6 = abstractC1635TM2741F.f7408c) >= i3 && i6 < i7) {
                abstractC1635TM2741F.m4047a(2);
                abstractC1635TM2741F.m4047a(1024);
                ((C1622F) viewM2162J.getLayoutParams()).f7366c = true;
            }
        }
        C1627K c1627k = recyclerView.f4748i;
        ArrayList arrayList = c1627k.f7377c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC1635T abstractC1635T = (AbstractC1635T) arrayList.get(size);
            if (abstractC1635T != null && (i5 = abstractC1635T.f7408c) >= i3 && i5 < i7) {
                abstractC1635T.m4047a(2);
                c1627k.m4037g(size);
            }
        }
        recyclerView.f4759n0 = true;
    }

    /* JADX INFO: renamed from: d */
    public void m4095d(int i3, int i4) {
        RecyclerView recyclerView = this.f7586a;
        int iM2163K = recyclerView.f4754l.m2163K();
        for (int i5 = 0; i5 < iM2163K; i5++) {
            AbstractC1635T abstractC1635TM2741F = RecyclerView.m2741F(recyclerView.f4754l.m2162J(i5));
            if (abstractC1635TM2741F != null && !abstractC1635TM2741F.m4060n() && abstractC1635TM2741F.f7408c >= i3) {
                abstractC1635TM2741F.m4057k(i4, false);
                recyclerView.f4751j0.f7389e = true;
            }
        }
        ArrayList arrayList = recyclerView.f4748i.f7377c;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            AbstractC1635T abstractC1635T = (AbstractC1635T) arrayList.get(i6);
            if (abstractC1635T != null && abstractC1635T.f7408c >= i3) {
                abstractC1635T.m4057k(i4, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f4757m0 = true;
    }

    /* JADX INFO: renamed from: e */
    public void m4096e(int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        RecyclerView recyclerView = this.f7586a;
        int iM2163K = recyclerView.f4754l.m2163K();
        int i12 = -1;
        if (i3 < i4) {
            i6 = i3;
            i5 = i4;
            i7 = -1;
        } else {
            i5 = i3;
            i6 = i4;
            i7 = 1;
        }
        for (int i13 = 0; i13 < iM2163K; i13++) {
            AbstractC1635T abstractC1635TM2741F = RecyclerView.m2741F(recyclerView.f4754l.m2162J(i13));
            if (abstractC1635TM2741F != null && (i11 = abstractC1635TM2741F.f7408c) >= i6 && i11 <= i5) {
                if (i11 == i3) {
                    abstractC1635TM2741F.m4057k(i4 - i3, false);
                } else {
                    abstractC1635TM2741F.m4057k(i7, false);
                }
                recyclerView.f4751j0.f7389e = true;
            }
        }
        C1627K c1627k = recyclerView.f4748i;
        c1627k.getClass();
        if (i3 < i4) {
            i9 = i3;
            i8 = i4;
        } else {
            i8 = i3;
            i9 = i4;
            i12 = 1;
        }
        ArrayList arrayList = c1627k.f7377c;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            AbstractC1635T abstractC1635T = (AbstractC1635T) arrayList.get(i14);
            if (abstractC1635T != null && (i10 = abstractC1635T.f7408c) >= i9 && i10 <= i8) {
                if (i10 == i3) {
                    abstractC1635T.m4057k(i4 - i3, false);
                } else {
                    abstractC1635T.m4057k(i12, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f4757m0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    /* JADX INFO: renamed from: f */
    public void m4097f(AbstractC1635T abstractC1635T, C0058r c0058r, C0058r c0058r2) {
        boolean zM4073g;
        RecyclerView recyclerView = this.f7586a;
        recyclerView.getClass();
        abstractC1635T.m4059m(false);
        C1651h c1651h = (C1651h) recyclerView.f4730P;
        if (c0058r != null) {
            c1651h.getClass();
            int i3 = c0058r.f82a;
            int i4 = c0058r2.f82a;
            if (i3 == i4 && c0058r.f83b == c0058r2.f83b) {
                c1651h.m4077l(abstractC1635T);
                abstractC1635T.f7406a.setAlpha(0.0f);
                c1651h.f7496i.add(abstractC1635T);
                zM4073g = true;
            } else {
                zM4073g = c1651h.m4073g(abstractC1635T, i3, c0058r.f83b, i4, c0058r2.f83b);
            }
        } else {
            c1651h.m4077l(abstractC1635T);
            abstractC1635T.f7406a.setAlpha(0.0f);
            c1651h.f7496i.add(abstractC1635T);
            zM4073g = true;
        }
        if (zM4073g) {
            recyclerView.m2760O();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m4098g(AbstractC1635T abstractC1635T, C0058r c0058r, C0058r c0058r2) {
        boolean zM4073g;
        RecyclerView recyclerView = this.f7586a;
        recyclerView.f4748i.m4042l(abstractC1635T);
        recyclerView.m2774e(abstractC1635T);
        abstractC1635T.m4059m(false);
        C1651h c1651h = (C1651h) recyclerView.f4730P;
        c1651h.getClass();
        int i3 = c0058r.f82a;
        int i4 = c0058r.f83b;
        View view = abstractC1635T.f7406a;
        int left = c0058r2 == null ? view.getLeft() : c0058r2.f82a;
        int top = c0058r2 == null ? view.getTop() : c0058r2.f83b;
        if (abstractC1635T.m4053g() || (i3 == left && i4 == top)) {
            c1651h.m4077l(abstractC1635T);
            c1651h.f7495h.add(abstractC1635T);
            zM4073g = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zM4073g = c1651h.m4073g(abstractC1635T, i3, i4, left, top);
        }
        if (zM4073g) {
            recyclerView.m2760O();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m4099h(int i3) {
        RecyclerView recyclerView = this.f7586a;
        View childAt = recyclerView.getChildAt(i3);
        if (childAt != null) {
            RecyclerView.m2741F(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i3);
    }
}

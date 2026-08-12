package p104h1;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* JADX INFO: renamed from: h1.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1643a0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f7453a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public int f7454b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c */
    public int f7455c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d */
    public int f7456d = 0;

    /* JADX INFO: renamed from: e */
    public final int f7457e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ StaggeredGridLayoutManager f7458f;

    public C1643a0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i3) {
        this.f7458f = staggeredGridLayoutManager;
        this.f7457e = i3;
    }

    /* JADX INFO: renamed from: a */
    public final void m4063a() {
        ArrayList arrayList = this.f7453a;
        View view = (View) arrayList.get(arrayList.size() - 1);
        C1639X c1639x = (C1639X) view.getLayoutParams();
        this.f7455c = this.f7458f.f4796q.mo2390b(view);
        c1639x.getClass();
    }

    /* JADX INFO: renamed from: b */
    public final void m4064b() {
        this.f7453a.clear();
        this.f7454b = Integer.MIN_VALUE;
        this.f7455c = Integer.MIN_VALUE;
        this.f7456d = 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m4065c() {
        boolean z3 = this.f7458f.f4801v;
        ArrayList arrayList = this.f7453a;
        return z3 ? m4067e(arrayList.size() - 1, -1) : m4067e(0, arrayList.size());
    }

    /* JADX INFO: renamed from: d */
    public final int m4066d() {
        boolean z3 = this.f7458f.f4801v;
        ArrayList arrayList = this.f7453a;
        return z3 ? m4067e(0, arrayList.size()) : m4067e(arrayList.size() - 1, -1);
    }

    /* JADX INFO: renamed from: e */
    public final int m4067e(int i3, int i4) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f7458f;
        int iMo2399k = staggeredGridLayoutManager.f4796q.mo2399k();
        int iMo2395g = staggeredGridLayoutManager.f4796q.mo2395g();
        int i5 = i4 > i3 ? 1 : -1;
        while (i3 != i4) {
            View view = (View) this.f7453a.get(i3);
            int iMo2393e = staggeredGridLayoutManager.f4796q.mo2393e(view);
            int iMo2390b = staggeredGridLayoutManager.f4796q.mo2390b(view);
            boolean z3 = iMo2393e <= iMo2395g;
            boolean z4 = iMo2390b >= iMo2399k;
            if (z3 && z4 && (iMo2393e < iMo2399k || iMo2390b > iMo2395g)) {
                return AbstractC1621E.m4000C(view);
            }
            i3 += i5;
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public final int m4068f(int i3) {
        int i4 = this.f7455c;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        if (this.f7453a.size() == 0) {
            return i3;
        }
        m4063a();
        return this.f7455c;
    }

    /* JADX INFO: renamed from: g */
    public final View m4069g(int i3, int i4) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f7458f;
        ArrayList arrayList = this.f7453a;
        View view = null;
        if (i4 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f4801v && AbstractC1621E.m4000C(view2) >= i3) || ((!staggeredGridLayoutManager.f4801v && AbstractC1621E.m4000C(view2) <= i3) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i5 = 0;
        while (i5 < size2) {
            View view3 = (View) arrayList.get(i5);
            if ((staggeredGridLayoutManager.f4801v && AbstractC1621E.m4000C(view3) <= i3) || ((!staggeredGridLayoutManager.f4801v && AbstractC1621E.m4000C(view3) >= i3) || !view3.hasFocusable())) {
                break;
            }
            i5++;
            view = view3;
        }
        return view;
    }

    /* JADX INFO: renamed from: h */
    public final int m4070h(int i3) {
        int i4 = this.f7454b;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        if (this.f7453a.size() == 0) {
            return i3;
        }
        View view = (View) this.f7453a.get(0);
        C1639X c1639x = (C1639X) view.getLayoutParams();
        this.f7454b = this.f7458f.f4796q.mo2393e(view);
        c1639x.getClass();
        return this.f7454b;
    }
}

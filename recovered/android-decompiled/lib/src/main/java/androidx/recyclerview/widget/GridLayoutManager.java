package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.internal.cast.C1323r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import p000A.AbstractC0016Q;
import p003B.C0090l;
import p045P0.AbstractC0462h;
import p071Y0.C0760w;
import p104h1.AbstractC1621E;
import p104h1.C1622F;
import p104h1.C1627K;
import p104h1.C1631O;
import p104h1.C1656m;
import p104h1.C1659p;
import p104h1.C1661r;
import p104h1.C1662s;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: D */
    public boolean f4683D;

    /* JADX INFO: renamed from: E */
    public final int f4684E;

    /* JADX INFO: renamed from: F */
    public int[] f4685F;

    /* JADX INFO: renamed from: G */
    public View[] f4686G;

    /* JADX INFO: renamed from: H */
    public final SparseIntArray f4687H;

    /* JADX INFO: renamed from: I */
    public final SparseIntArray f4688I;

    /* JADX INFO: renamed from: J */
    public final C1323r f4689J;

    /* JADX INFO: renamed from: K */
    public final Rect f4690K;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        this.f4683D = false;
        this.f4684E = -1;
        this.f4687H = new SparseIntArray();
        this.f4688I = new SparseIntArray();
        C1323r c1323r = new C1323r(6, (byte) 0);
        this.f4689J = c1323r;
        this.f4690K = new Rect();
        int i5 = AbstractC1621E.m4001D(context, attributeSet, i3, i4).f7347b;
        if (i5 == this.f4684E) {
            return;
        }
        this.f4683D = true;
        if (i5 < 1) {
            throw new IllegalArgumentException(AbstractC0462h.m1165e(i5, "Span count should be at least 1. Provided "));
        }
        this.f4684E = i5;
        c1323r.m3355C();
        m4017h0();
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: E */
    public final int mo2666E(C1627K c1627k, C1631O c1631o) {
        if (this.f4694o == 0) {
            return this.f4684E;
        }
        if (c1631o.m4045b() < 1) {
            return 0;
        }
        return m2684Y0(c1631o.m4045b() - 1, c1627k, c1631o) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: E0 */
    public final View mo2667E0(C1627K c1627k, C1631O c1631o, boolean z3, boolean z4) {
        int i3;
        int iM4026u;
        int iM4026u2 = m4026u();
        int i4 = 1;
        if (z4) {
            iM4026u = m4026u() - 1;
            i3 = -1;
            i4 = -1;
        } else {
            i3 = iM4026u2;
            iM4026u = 0;
        }
        int iM4045b = c1631o.m4045b();
        m2738y0();
        int iMo2399k = this.f4696q.mo2399k();
        int iMo2395g = this.f4696q.mo2395g();
        View view = null;
        View view2 = null;
        while (iM4026u != i3) {
            View viewM4025t = m4025t(iM4026u);
            int iM4000C = AbstractC1621E.m4000C(viewM4025t);
            if (iM4000C >= 0 && iM4000C < iM4045b && m2685Z0(iM4000C, c1627k, c1631o) == 0) {
                if (((C1622F) viewM4025t.getLayoutParams()).f7364a.m4053g()) {
                    if (view2 == null) {
                        view2 = viewM4025t;
                    }
                } else {
                    if (this.f4696q.mo2393e(viewM4025t) < iMo2395g && this.f4696q.mo2390b(viewM4025t) >= iMo2399k) {
                        return viewM4025t;
                    }
                    if (view == null) {
                        view = viewM4025t;
                    }
                }
            }
            iM4026u += i4;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v37 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: K0 */
    public final void mo2668K0(C1627K c1627k, C1631O c1631o, C1662s c1662s, C1661r c1661r) {
        int i3;
        int i4;
        int i5;
        int iMo2392d;
        int iM4028z;
        int iM4008B;
        int iMo2392d2;
        int iM4005v;
        int iM4005v2;
        ?? r8;
        int i6;
        View viewM4091b;
        int iMo2398j = this.f4696q.mo2398j();
        boolean z3 = iMo2398j != 1073741824;
        int i7 = m4026u() > 0 ? this.f4685F[this.f4684E] : 0;
        if (z3) {
            m2688c1();
        }
        boolean z4 = c1662s.f7574e == 1;
        int iM2685Z0 = this.f4684E;
        if (!z4) {
            iM2685Z0 = m2685Z0(c1662s.f7573d, c1627k, c1631o) + m2686a1(c1662s.f7573d, c1627k, c1631o);
        }
        int i8 = 0;
        while (i8 < this.f4684E && (i6 = c1662s.f7573d) >= 0 && i6 < c1631o.m4045b() && iM2685Z0 > 0) {
            int i9 = c1662s.f7573d;
            int iM2686a1 = m2686a1(i9, c1627k, c1631o);
            if (iM2686a1 > this.f4684E) {
                throw new IllegalArgumentException("Item at position " + i9 + " requires " + iM2686a1 + " spans but GridLayoutManager has only " + this.f4684E + " spans.");
            }
            iM2685Z0 -= iM2686a1;
            if (iM2685Z0 < 0 || (viewM4091b = c1662s.m4091b(c1627k)) == null) {
                break;
            }
            this.f4686G[i8] = viewM4091b;
            i8++;
        }
        if (i8 == 0) {
            c1661r.f7567b = true;
            return;
        }
        if (z4) {
            i4 = i8;
            i3 = 0;
            i5 = 1;
        } else {
            i3 = i8 - 1;
            i4 = -1;
            i5 = -1;
        }
        int i10 = 0;
        while (i3 != i4) {
            View view = this.f4686G[i3];
            C1659p c1659p = (C1659p) view.getLayoutParams();
            int iM2686a2 = m2686a1(AbstractC1621E.m4000C(view), c1627k, c1631o);
            c1659p.f7556f = iM2686a2;
            c1659p.f7555e = i10;
            i10 += iM2686a2;
            i3 += i5;
        }
        float f = 0.0f;
        int i11 = 0;
        for (int i12 = 0; i12 < i8; i12++) {
            View view2 = this.f4686G[i12];
            if (c1662s.f7580k != null) {
                r8 = 0;
                r8 = 0;
                if (z4) {
                    m4011a(view2, -1, true);
                } else {
                    m4011a(view2, 0, true);
                }
            } else if (z4) {
                r8 = 0;
                m4011a(view2, -1, false);
            } else {
                r8 = 0;
                m4011a(view2, 0, false);
            }
            RecyclerView recyclerView = this.f7351b;
            Rect rect = this.f4690K;
            if (recyclerView == null) {
                rect.set(r8, r8, r8, r8);
            } else {
                rect.set(recyclerView.m2752G(view2));
            }
            m2687b1(view2, iMo2398j, r8);
            int iMo2391c = this.f4696q.mo2391c(view2);
            if (iMo2391c > i11) {
                i11 = iMo2391c;
            }
            float fMo2392d = (this.f4696q.mo2392d(view2) * 1.0f) / ((C1659p) view2.getLayoutParams()).f7556f;
            if (fMo2392d > f) {
                f = fMo2392d;
            }
        }
        if (z3) {
            m2678V0(Math.max(Math.round(f * this.f4684E), i7));
            i11 = 0;
            for (int i13 = 0; i13 < i8; i13++) {
                View view3 = this.f4686G[i13];
                m2687b1(view3, 1073741824, true);
                int iMo2391c2 = this.f4696q.mo2391c(view3);
                if (iMo2391c2 > i11) {
                    i11 = iMo2391c2;
                }
            }
        }
        for (int i14 = 0; i14 < i8; i14++) {
            View view4 = this.f4686G[i14];
            if (this.f4696q.mo2391c(view4) != i11) {
                C1659p c1659p2 = (C1659p) view4.getLayoutParams();
                Rect rect2 = c1659p2.f7365b;
                int i15 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c1659p2).topMargin + ((ViewGroup.MarginLayoutParams) c1659p2).bottomMargin;
                int i16 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c1659p2).leftMargin + ((ViewGroup.MarginLayoutParams) c1659p2).rightMargin;
                int iM2682X0 = m2682X0(c1659p2.f7555e, c1659p2.f7556f);
                if (this.f4694o == 1) {
                    iM4005v2 = AbstractC1621E.m4005v(false, iM2682X0, 1073741824, i16, ((ViewGroup.MarginLayoutParams) c1659p2).width);
                    iM4005v = View.MeasureSpec.makeMeasureSpec(i11 - i15, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11 - i16, 1073741824);
                    iM4005v = AbstractC1621E.m4005v(false, iM2682X0, 1073741824, i15, ((ViewGroup.MarginLayoutParams) c1659p2).height);
                    iM4005v2 = iMakeMeasureSpec;
                }
                if (m4024r0(view4, iM4005v2, iM4005v, (C1622F) view4.getLayoutParams())) {
                    view4.measure(iM4005v2, iM4005v);
                }
            }
        }
        c1661r.f7566a = i11;
        if (this.f4694o != 1) {
            if (c1662s.f7575f == -1) {
                int i17 = c1662s.f7571b;
                iM4028z = i17 - i11;
                iMo2392d = i17;
            } else {
                int i18 = c1662s.f7571b;
                iMo2392d = i18 + i11;
                iM4028z = i18;
            }
            iM4008B = 0;
            iMo2392d2 = 0;
        } else if (c1662s.f7575f == -1) {
            iMo2392d2 = c1662s.f7571b;
            iM4008B = iMo2392d2 - i11;
            iM4028z = 0;
            iMo2392d = 0;
        } else {
            int i19 = c1662s.f7571b;
            iM4008B = i19;
            iMo2392d = 0;
            iMo2392d2 = i19 + i11;
            iM4028z = 0;
        }
        for (int i20 = 0; i20 < i8; i20++) {
            View view5 = this.f4686G[i20];
            C1659p c1659p3 = (C1659p) view5.getLayoutParams();
            if (this.f4694o != 1) {
                iM4008B = m4008B() + this.f4685F[c1659p3.f7555e];
                iMo2392d2 = this.f4696q.mo2392d(view5) + iM4008B;
            } else if (m2712J0()) {
                int iM4028z2 = m4028z() + this.f4685F[this.f4684E - c1659p3.f7555e];
                iMo2392d = iM4028z2;
                iM4028z = iM4028z2 - this.f4696q.mo2392d(view5);
            } else {
                iM4028z = m4028z() + this.f4685F[c1659p3.f7555e];
                iMo2392d = this.f4696q.mo2392d(view5) + iM4028z;
            }
            AbstractC1621E.m4003I(view5, iM4028z, iM4008B, iMo2392d, iMo2392d2);
            if (c1659p3.f7364a.m4053g() || c1659p3.f7364a.m4056j()) {
                c1661r.f7568c = true;
            }
            c1661r.f7569d = view5.hasFocusable() | c1661r.f7569d;
        }
        Arrays.fill(this.f4686G, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: L0 */
    public final void mo2669L0(C1627K c1627k, C1631O c1631o, C0760w c0760w, int i3) {
        m2688c1();
        if (c1631o.m4045b() > 0 && !c1631o.f7390f) {
            boolean z3 = i3 == 1;
            int iM2685Z0 = m2685Z0(c0760w.f3098c, c1627k, c1631o);
            if (z3) {
                while (iM2685Z0 > 0) {
                    int i4 = c0760w.f3098c;
                    if (i4 <= 0) {
                        break;
                    }
                    int i5 = i4 - 1;
                    c0760w.f3098c = i5;
                    iM2685Z0 = m2685Z0(i5, c1627k, c1631o);
                }
            } else {
                int iM4045b = c1631o.m4045b() - 1;
                int i6 = c0760w.f3098c;
                while (i6 < iM4045b) {
                    int i7 = i6 + 1;
                    int iM2685Z1 = m2685Z0(i7, c1627k, c1631o);
                    if (iM2685Z1 <= iM2685Z0) {
                        break;
                    }
                    i6 = i7;
                    iM2685Z0 = iM2685Z1;
                }
                c0760w.f3098c = i6;
            }
        }
        m2680W0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, p104h1.AbstractC1621E
    /* JADX INFO: renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo2670N(View view, int i3, C1627K c1627k, C1631O c1631o) {
        View viewM2792y;
        int iM4026u;
        int iM4026u2;
        int i4;
        View view2;
        View view3;
        int i5;
        int i6;
        C1627K c1627k2 = c1627k;
        C1631O c1631o2 = c1631o;
        RecyclerView recyclerView = this.f7351b;
        if (recyclerView == null || (viewM2792y = recyclerView.m2792y(view)) == null || ((ArrayList) this.f7350a.f3641j).contains(viewM2792y)) {
            viewM2792y = null;
        }
        if (viewM2792y != null) {
            C1659p c1659p = (C1659p) viewM2792y.getLayoutParams();
            int i7 = c1659p.f7555e;
            int i8 = c1659p.f7556f + i7;
            if (super.mo2670N(view, i3, c1627k, c1631o) != null) {
                if ((m2737x0(i3) == 1) != this.f4699t) {
                    iM4026u2 = m4026u() - 1;
                    iM4026u = -1;
                    i4 = -1;
                } else {
                    iM4026u = m4026u();
                    iM4026u2 = 0;
                    i4 = 1;
                }
                boolean z3 = this.f4694o == 1 && m2712J0();
                int iM2684Y0 = m2684Y0(iM4026u2, c1627k2, c1631o2);
                View view4 = null;
                int i9 = iM4026u2;
                int i10 = -1;
                int iMin = 0;
                int i11 = -1;
                View view5 = null;
                int iMin2 = 0;
                while (true) {
                    view2 = view5;
                    if (i9 == iM4026u) {
                        break;
                    }
                    int iM2684Y1 = m2684Y0(i9, c1627k2, c1631o2);
                    View viewM4025t = m4025t(i9);
                    if (viewM4025t == viewM2792y) {
                        break;
                    }
                    if (!viewM4025t.hasFocusable() || iM2684Y1 == iM2684Y0) {
                        C1659p c1659p2 = (C1659p) viewM4025t.getLayoutParams();
                        int i12 = c1659p2.f7555e;
                        view3 = viewM2792y;
                        int i13 = c1659p2.f7556f + i12;
                        if (viewM4025t.hasFocusable() && i12 == i7 && i13 == i8) {
                            return viewM4025t;
                        }
                        if (!(viewM4025t.hasFocusable() && view4 == null) && (viewM4025t.hasFocusable() || view2 != null)) {
                            i5 = iM4026u;
                            int iMin3 = Math.min(i13, i8) - Math.max(i12, i7);
                            if (viewM4025t.hasFocusable()) {
                                if (iMin3 <= iMin) {
                                    if (iMin3 == iMin) {
                                    }
                                    i6 = iMin;
                                }
                                i6 = iMin;
                            } else if (view4 == null) {
                                i6 = iMin;
                                if (!this.f7352c.m3356D(viewM4025t) || !this.f7353d.m3356D(viewM4025t)) {
                                    if (iMin3 <= iMin2) {
                                        if (iMin3 == iMin2) {
                                            if (z3 == (i12 > i10)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                i6 = iMin;
                            }
                            i9 += i4;
                            c1627k2 = c1627k;
                            c1631o2 = c1631o;
                            viewM2792y = view3;
                            iM4026u = i5;
                        } else {
                            i6 = iMin;
                            i5 = iM4026u;
                        }
                        if (viewM4025t.hasFocusable()) {
                            int i14 = c1659p2.f7555e;
                            iMin = Math.min(i13, i8) - Math.max(i12, i7);
                            view4 = viewM4025t;
                            i11 = i14;
                            view5 = view2;
                        } else {
                            int i15 = c1659p2.f7555e;
                            view5 = viewM4025t;
                            i10 = i15;
                            iMin = i6;
                            iMin2 = Math.min(i13, i8) - Math.max(i12, i7);
                        }
                        i9 += i4;
                        c1627k2 = c1627k;
                        c1631o2 = c1631o;
                        viewM2792y = view3;
                        iM4026u = i5;
                    } else {
                        if (view4 != null) {
                            break;
                        }
                        view3 = viewM2792y;
                        i6 = iMin;
                        i5 = iM4026u;
                    }
                    view5 = view2;
                    iMin = i6;
                    i9 += i4;
                    c1627k2 = c1627k;
                    c1631o2 = c1631o;
                    viewM2792y = view3;
                    iM4026u = i5;
                }
                return view4 != null ? view4 : view2;
            }
        }
        return null;
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: P */
    public final void mo2671P(C1627K c1627k, C1631O c1631o, C0090l c0090l) {
        super.mo2671P(c1627k, c1631o, c0090l);
        c0090l.f123a.setClassName("android.widget.GridView");
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: R */
    public final void mo2672R(C1627K c1627k, C1631O c1631o, View view, C0090l c0090l) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1659p)) {
            m4010Q(view, c0090l);
            return;
        }
        C1659p c1659p = (C1659p) layoutParams;
        int iM2684Y0 = m2684Y0(c1659p.f7364a.m4048b(), c1627k, c1631o);
        int i3 = this.f4694o;
        AccessibilityNodeInfo accessibilityNodeInfo = c0090l.f123a;
        if (i3 == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(c1659p.f7555e, c1659p.f7556f, iM2684Y0, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(iM2684Y0, 1, c1659p.f7555e, c1659p.f7556f, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: R0 */
    public final void mo2673R0(boolean z3) {
        if (z3) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo2673R0(false);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: S */
    public final void mo2674S(int i3, int i4) {
        C1323r c1323r = this.f4689J;
        c1323r.m3355C();
        ((SparseIntArray) c1323r.f5962i).clear();
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: T */
    public final void mo2675T() {
        C1323r c1323r = this.f4689J;
        c1323r.m3355C();
        ((SparseIntArray) c1323r.f5962i).clear();
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: U */
    public final void mo2676U(int i3, int i4) {
        C1323r c1323r = this.f4689J;
        c1323r.m3355C();
        ((SparseIntArray) c1323r.f5962i).clear();
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: V */
    public final void mo2677V(int i3, int i4) {
        C1323r c1323r = this.f4689J;
        c1323r.m3355C();
        ((SparseIntArray) c1323r.f5962i).clear();
    }

    /* JADX INFO: renamed from: V0 */
    public final void m2678V0(int i3) {
        int i4;
        int[] iArr = this.f4685F;
        int i5 = this.f4684E;
        if (iArr == null || iArr.length != i5 + 1 || iArr[iArr.length - 1] != i3) {
            iArr = new int[i5 + 1];
        }
        int i6 = 0;
        iArr[0] = 0;
        int i7 = i3 / i5;
        int i8 = i3 % i5;
        int i9 = 0;
        for (int i10 = 1; i10 <= i5; i10++) {
            i6 += i8;
            if (i6 <= 0 || i5 - i6 >= i8) {
                i4 = i7;
            } else {
                i4 = i7 + 1;
                i6 -= i5;
            }
            i9 += i4;
            iArr[i10] = i9;
        }
        this.f4685F = iArr;
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: W */
    public final void mo2679W(int i3, int i4) {
        C1323r c1323r = this.f4689J;
        c1323r.m3355C();
        ((SparseIntArray) c1323r.f5962i).clear();
    }

    /* JADX INFO: renamed from: W0 */
    public final void m2680W0() {
        View[] viewArr = this.f4686G;
        if (viewArr == null || viewArr.length != this.f4684E) {
            this.f4686G = new View[this.f4684E];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p104h1.AbstractC1621E
    /* JADX INFO: renamed from: X */
    public final void mo2681X(C1627K c1627k, C1631O c1631o) {
        boolean z3 = c1631o.f7390f;
        SparseIntArray sparseIntArray = this.f4688I;
        SparseIntArray sparseIntArray2 = this.f4687H;
        if (z3) {
            int iM4026u = m4026u();
            for (int i3 = 0; i3 < iM4026u; i3++) {
                C1659p c1659p = (C1659p) m4025t(i3).getLayoutParams();
                int iM4048b = c1659p.f7364a.m4048b();
                sparseIntArray2.put(iM4048b, c1659p.f7556f);
                sparseIntArray.put(iM4048b, c1659p.f7555e);
            }
        }
        super.mo2681X(c1627k, c1631o);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    /* JADX INFO: renamed from: X0 */
    public final int m2682X0(int i3, int i4) {
        if (this.f4694o != 1 || !m2712J0()) {
            int[] iArr = this.f4685F;
            return iArr[i4 + i3] - iArr[i3];
        }
        int[] iArr2 = this.f4685F;
        int i5 = this.f4684E;
        return iArr2[i5 - i3] - iArr2[(i5 - i3) - i4];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p104h1.AbstractC1621E
    /* JADX INFO: renamed from: Y */
    public final void mo2683Y(C1631O c1631o) {
        super.mo2683Y(c1631o);
        this.f4683D = false;
    }

    /* JADX INFO: renamed from: Y0 */
    public final int m2684Y0(int i3, C1627K c1627k, C1631O c1631o) {
        boolean z3 = c1631o.f7390f;
        C1323r c1323r = this.f4689J;
        if (!z3) {
            int i4 = this.f4684E;
            c1323r.getClass();
            return C1323r.m3353B(i3, i4);
        }
        int iM4032b = c1627k.m4032b(i3);
        if (iM4032b != -1) {
            int i5 = this.f4684E;
            c1323r.getClass();
            return C1323r.m3353B(iM4032b, i5);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i3);
        return 0;
    }

    /* JADX INFO: renamed from: Z0 */
    public final int m2685Z0(int i3, C1627K c1627k, C1631O c1631o) {
        boolean z3 = c1631o.f7390f;
        C1323r c1323r = this.f4689J;
        if (!z3) {
            int i4 = this.f4684E;
            c1323r.getClass();
            return i3 % i4;
        }
        int i5 = this.f4688I.get(i3, -1);
        if (i5 != -1) {
            return i5;
        }
        int iM4032b = c1627k.m4032b(i3);
        if (iM4032b != -1) {
            int i6 = this.f4684E;
            c1323r.getClass();
            return iM4032b % i6;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i3);
        return 0;
    }

    /* JADX INFO: renamed from: a1 */
    public final int m2686a1(int i3, C1627K c1627k, C1631O c1631o) {
        boolean z3 = c1631o.f7390f;
        C1323r c1323r = this.f4689J;
        if (!z3) {
            c1323r.getClass();
            return 1;
        }
        int i4 = this.f4687H.get(i3, -1);
        if (i4 != -1) {
            return i4;
        }
        if (c1627k.m4032b(i3) != -1) {
            c1323r.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i3);
        return 1;
    }

    /* JADX INFO: renamed from: b1 */
    public final void m2687b1(View view, int i3, boolean z3) {
        int iM4005v;
        int iM4005v2;
        C1659p c1659p = (C1659p) view.getLayoutParams();
        Rect rect = c1659p.f7365b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1659p).topMargin + ((ViewGroup.MarginLayoutParams) c1659p).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1659p).leftMargin + ((ViewGroup.MarginLayoutParams) c1659p).rightMargin;
        int iM2682X0 = m2682X0(c1659p.f7555e, c1659p.f7556f);
        if (this.f4694o == 1) {
            iM4005v2 = AbstractC1621E.m4005v(false, iM2682X0, i3, i5, ((ViewGroup.MarginLayoutParams) c1659p).width);
            iM4005v = AbstractC1621E.m4005v(true, this.f4696q.mo2400l(), this.f7361l, i4, ((ViewGroup.MarginLayoutParams) c1659p).height);
        } else {
            int iM4005v3 = AbstractC1621E.m4005v(false, iM2682X0, i3, i4, ((ViewGroup.MarginLayoutParams) c1659p).height);
            int iM4005v4 = AbstractC1621E.m4005v(true, this.f4696q.mo2400l(), this.f7360k, i5, ((ViewGroup.MarginLayoutParams) c1659p).width);
            iM4005v = iM4005v3;
            iM4005v2 = iM4005v4;
        }
        C1622F c1622f = (C1622F) view.getLayoutParams();
        if (z3 ? m4024r0(view, iM4005v2, iM4005v, c1622f) : m4023p0(view, iM4005v2, iM4005v, c1622f)) {
            view.measure(iM4005v2, iM4005v);
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final void m2688c1() {
        int iM4027y;
        int iM4008B;
        if (this.f4694o == 1) {
            iM4027y = this.f7362m - m4007A();
            iM4008B = m4028z();
        } else {
            iM4027y = this.f7363n - m4027y();
            iM4008B = m4008B();
        }
        m2678V0(iM4027y - iM4008B);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: e */
    public final boolean mo2689e(C1622F c1622f) {
        return c1622f instanceof C1659p;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p104h1.AbstractC1621E
    /* JADX INFO: renamed from: i0 */
    public final int mo2690i0(int i3, C1627K c1627k, C1631O c1631o) {
        m2688c1();
        m2680W0();
        return super.mo2690i0(i3, c1627k, c1631o);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p104h1.AbstractC1621E
    /* JADX INFO: renamed from: j */
    public final int mo2691j(C1631O c1631o) {
        return m2735v0(c1631o);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p104h1.AbstractC1621E
    /* JADX INFO: renamed from: j0 */
    public final int mo2692j0(int i3, C1627K c1627k, C1631O c1631o) {
        m2688c1();
        m2680W0();
        return super.mo2692j0(i3, c1627k, c1631o);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p104h1.AbstractC1621E
    /* JADX INFO: renamed from: k */
    public final int mo2693k(C1631O c1631o) {
        return m2736w0(c1631o);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p104h1.AbstractC1621E
    /* JADX INFO: renamed from: m */
    public final int mo2694m(C1631O c1631o) {
        return m2735v0(c1631o);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: m0 */
    public final void mo2695m0(Rect rect, int i3, int i4) {
        int iM4004f;
        int iM4004f2;
        if (this.f4685F == null) {
            super.mo2695m0(rect, i3, i4);
        }
        int iM4007A = m4007A() + m4028z();
        int iM4027y = m4027y() + m4008B();
        if (this.f4694o == 1) {
            int iHeight = rect.height() + iM4027y;
            RecyclerView recyclerView = this.f7351b;
            WeakHashMap weakHashMap = AbstractC0016Q.f14a;
            iM4004f2 = AbstractC1621E.m4004f(i4, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.f4685F;
            iM4004f = AbstractC1621E.m4004f(i3, iArr[iArr.length - 1] + iM4007A, this.f7351b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM4007A;
            RecyclerView recyclerView2 = this.f7351b;
            WeakHashMap weakHashMap2 = AbstractC0016Q.f14a;
            iM4004f = AbstractC1621E.m4004f(i3, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f4685F;
            iM4004f2 = AbstractC1621E.m4004f(i4, iArr2[iArr2.length - 1] + iM4027y, this.f7351b.getMinimumHeight());
        }
        this.f7351b.setMeasuredDimension(iM4004f, iM4004f2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p104h1.AbstractC1621E
    /* JADX INFO: renamed from: n */
    public final int mo2696n(C1631O c1631o) {
        return m2736w0(c1631o);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p104h1.AbstractC1621E
    /* JADX INFO: renamed from: q */
    public final C1622F mo2697q() {
        return this.f4694o == 0 ? new C1659p(-2, -1) : new C1659p(-1, -2);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: r */
    public final C1622F mo2698r(Context context, AttributeSet attributeSet) {
        C1659p c1659p = new C1659p(context, attributeSet);
        c1659p.f7555e = -1;
        c1659p.f7556f = 0;
        return c1659p;
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: s */
    public final C1622F mo2699s(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C1659p c1659p = new C1659p((ViewGroup.MarginLayoutParams) layoutParams);
            c1659p.f7555e = -1;
            c1659p.f7556f = 0;
            return c1659p;
        }
        C1659p c1659p2 = new C1659p(layoutParams);
        c1659p2.f7555e = -1;
        c1659p2.f7556f = 0;
        return c1659p2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p104h1.AbstractC1621E
    /* JADX INFO: renamed from: s0 */
    public final boolean mo2700s0() {
        return this.f4704y == null && !this.f4683D;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: t0 */
    public final void mo2701t0(C1631O c1631o, C1662s c1662s, C1656m c1656m) {
        int i3;
        int i4 = this.f4684E;
        for (int i5 = 0; i5 < this.f4684E && (i3 = c1662s.f7573d) >= 0 && i3 < c1631o.m4045b() && i4 > 0; i5++) {
            c1656m.m4084b(c1662s.f7573d, Math.max(0, c1662s.f7576g));
            this.f4689J.getClass();
            i4--;
            c1662s.f7573d += c1662s.f7574e;
        }
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: w */
    public final int mo2702w(C1627K c1627k, C1631O c1631o) {
        if (this.f4694o == 1) {
            return this.f4684E;
        }
        if (c1631o.m4045b() < 1) {
            return 0;
        }
        return m2684Y0(c1631o.m4045b() - 1, c1627k, c1631o) + 1;
    }
}

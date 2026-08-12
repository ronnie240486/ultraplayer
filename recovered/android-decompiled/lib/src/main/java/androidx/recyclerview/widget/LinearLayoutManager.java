package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.emoji2.text.AbstractC0916f;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p000A.AbstractC0016Q;
import p045P0.AbstractC0462h;
import p071Y0.C0760w;
import p104h1.AbstractC1621E;
import p104h1.AbstractC1635T;
import p104h1.C1620D;
import p104h1.C1622F;
import p104h1.C1627K;
import p104h1.C1631O;
import p104h1.C1656m;
import p104h1.C1661r;
import p104h1.C1662s;
import p104h1.C1663t;
import p122m1.AbstractC2003a;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC1621E {

    /* JADX INFO: renamed from: A */
    public final C1661r f4691A;

    /* JADX INFO: renamed from: B */
    public final int f4692B;

    /* JADX INFO: renamed from: C */
    public final int[] f4693C;

    /* JADX INFO: renamed from: o */
    public int f4694o;

    /* JADX INFO: renamed from: p */
    public C1662s f4695p;

    /* JADX INFO: renamed from: q */
    public AbstractC0916f f4696q;

    /* JADX INFO: renamed from: r */
    public boolean f4697r;

    /* JADX INFO: renamed from: s */
    public final boolean f4698s;

    /* JADX INFO: renamed from: t */
    public boolean f4699t;

    /* JADX INFO: renamed from: u */
    public boolean f4700u;

    /* JADX INFO: renamed from: v */
    public final boolean f4701v;

    /* JADX INFO: renamed from: w */
    public int f4702w;

    /* JADX INFO: renamed from: x */
    public int f4703x;

    /* JADX INFO: renamed from: y */
    public C1663t f4704y;

    /* JADX INFO: renamed from: z */
    public final C0760w f4705z;

    public LinearLayoutManager() {
        this.f4694o = 1;
        this.f4698s = false;
        this.f4699t = false;
        this.f4700u = false;
        this.f4701v = true;
        this.f4702w = -1;
        this.f4703x = Integer.MIN_VALUE;
        this.f4704y = null;
        this.f4705z = new C0760w();
        this.f4691A = new C1661r();
        this.f4692B = 2;
        this.f4693C = new int[2];
        m2719Q0(1);
        mo2725b(null);
        if (this.f4698s) {
            this.f4698s = false;
            m4017h0();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final View m2703A0(boolean z3) {
        return this.f4699t ? m2706D0(0, m4026u(), z3) : m2706D0(m4026u() - 1, -1, z3);
    }

    /* JADX INFO: renamed from: B0 */
    public final View m2704B0(boolean z3) {
        return this.f4699t ? m2706D0(m4026u() - 1, -1, z3) : m2706D0(0, m4026u(), z3);
    }

    /* JADX INFO: renamed from: C0 */
    public final View m2705C0(int i3, int i4) {
        int i5;
        int i6;
        m2738y0();
        if (i4 <= i3 && i4 >= i3) {
            return m4025t(i3);
        }
        if (this.f4696q.mo2393e(m4025t(i3)) < this.f4696q.mo2399k()) {
            i5 = 16644;
            i6 = 16388;
        } else {
            i5 = 4161;
            i6 = 4097;
        }
        return this.f4694o == 0 ? this.f7352c.m3391y(i3, i4, i5, i6) : this.f7353d.m3391y(i3, i4, i5, i6);
    }

    /* JADX INFO: renamed from: D0 */
    public final View m2706D0(int i3, int i4, boolean z3) {
        m2738y0();
        int i5 = z3 ? 24579 : 320;
        return this.f4694o == 0 ? this.f7352c.m3391y(i3, i4, i5, 320) : this.f7353d.m3391y(i3, i4, i5, 320);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX INFO: renamed from: E0 */
    public View mo2667E0(C1627K c1627k, C1631O c1631o, boolean z3, boolean z4) {
        int i3;
        int iM4026u;
        int i4;
        m2738y0();
        int iM4026u2 = m4026u();
        if (z4) {
            iM4026u = m4026u() - 1;
            i3 = -1;
            i4 = -1;
        } else {
            i3 = iM4026u2;
            iM4026u = 0;
            i4 = 1;
        }
        int iM4045b = c1631o.m4045b();
        int iMo2399k = this.f4696q.mo2399k();
        int iMo2395g = this.f4696q.mo2395g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iM4026u != i3) {
            View viewM4025t = m4025t(iM4026u);
            int iM4000C = AbstractC1621E.m4000C(viewM4025t);
            int iMo2393e = this.f4696q.mo2393e(viewM4025t);
            int iMo2390b = this.f4696q.mo2390b(viewM4025t);
            if (iM4000C >= 0 && iM4000C < iM4045b) {
                if (!((C1622F) viewM4025t.getLayoutParams()).f7364a.m4053g()) {
                    boolean z5 = iMo2390b <= iMo2399k && iMo2393e < iMo2399k;
                    boolean z6 = iMo2393e >= iMo2395g && iMo2390b > iMo2395g;
                    if (!z5 && !z6) {
                        return viewM4025t;
                    }
                    if (z3) {
                        if (z6) {
                            view2 = viewM4025t;
                        } else if (view == null) {
                            view = viewM4025t;
                        }
                    } else if (z5) {
                        view2 = viewM4025t;
                    } else if (view == null) {
                        view = viewM4025t;
                    }
                } else if (view3 == null) {
                    view3 = viewM4025t;
                }
            }
            iM4026u += i4;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    /* JADX INFO: renamed from: F0 */
    public final int m2707F0(int i3, C1627K c1627k, C1631O c1631o, boolean z3) {
        int iMo2395g;
        int iMo2395g2 = this.f4696q.mo2395g() - i3;
        if (iMo2395g2 <= 0) {
            return 0;
        }
        int i4 = -m2718P0(-iMo2395g2, c1627k, c1631o);
        int i5 = i3 + i4;
        if (!z3 || (iMo2395g = this.f4696q.mo2395g() - i5) <= 0) {
            return i4;
        }
        this.f4696q.mo2403o(iMo2395g);
        return iMo2395g + i4;
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: G */
    public final boolean mo2708G() {
        return true;
    }

    /* JADX INFO: renamed from: G0 */
    public final int m2709G0(int i3, C1627K c1627k, C1631O c1631o, boolean z3) {
        int iMo2399k;
        int iMo2399k2 = i3 - this.f4696q.mo2399k();
        if (iMo2399k2 <= 0) {
            return 0;
        }
        int i4 = -m2718P0(iMo2399k2, c1627k, c1631o);
        int i5 = i3 + i4;
        if (!z3 || (iMo2399k = i5 - this.f4696q.mo2399k()) <= 0) {
            return i4;
        }
        this.f4696q.mo2403o(-iMo2399k);
        return i4 - iMo2399k;
    }

    /* JADX INFO: renamed from: H0 */
    public final View m2710H0() {
        return m4025t(this.f4699t ? 0 : m4026u() - 1);
    }

    /* JADX INFO: renamed from: I0 */
    public final View m2711I0() {
        return m4025t(this.f4699t ? m4026u() - 1 : 0);
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m2712J0() {
        RecyclerView recyclerView = this.f7351b;
        WeakHashMap weakHashMap = AbstractC0016Q.f14a;
        return recyclerView.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: K0 */
    public void mo2668K0(C1627K c1627k, C1631O c1631o, C1662s c1662s, C1661r c1661r) {
        int iM4028z;
        int i3;
        int i4;
        int iMo2392d;
        View viewM4091b = c1662s.m4091b(c1627k);
        if (viewM4091b == null) {
            c1661r.f7567b = true;
            return;
        }
        C1622F c1622f = (C1622F) viewM4091b.getLayoutParams();
        if (c1662s.f7580k == null) {
            if (this.f4699t == (c1662s.f7575f == -1)) {
                m4011a(viewM4091b, -1, false);
            } else {
                m4011a(viewM4091b, 0, false);
            }
        } else {
            if (this.f4699t == (c1662s.f7575f == -1)) {
                m4011a(viewM4091b, -1, true);
            } else {
                m4011a(viewM4091b, 0, true);
            }
        }
        C1622F c1622f2 = (C1622F) viewM4091b.getLayoutParams();
        Rect rectM2752G = this.f7351b.m2752G(viewM4091b);
        int i5 = rectM2752G.left + rectM2752G.right;
        int i6 = rectM2752G.top + rectM2752G.bottom;
        int iM4005v = AbstractC1621E.m4005v(mo2726c(), this.f7362m, this.f7360k, m4007A() + m4028z() + ((ViewGroup.MarginLayoutParams) c1622f2).leftMargin + ((ViewGroup.MarginLayoutParams) c1622f2).rightMargin + i5, ((ViewGroup.MarginLayoutParams) c1622f2).width);
        int iM4005v2 = AbstractC1621E.m4005v(mo2727d(), this.f7363n, this.f7361l, m4027y() + m4008B() + ((ViewGroup.MarginLayoutParams) c1622f2).topMargin + ((ViewGroup.MarginLayoutParams) c1622f2).bottomMargin + i6, ((ViewGroup.MarginLayoutParams) c1622f2).height);
        if (m4023p0(viewM4091b, iM4005v, iM4005v2, c1622f2)) {
            viewM4091b.measure(iM4005v, iM4005v2);
        }
        c1661r.f7566a = this.f4696q.mo2391c(viewM4091b);
        if (this.f4694o == 1) {
            if (m2712J0()) {
                iMo2392d = this.f7362m - m4007A();
                iM4028z = iMo2392d - this.f4696q.mo2392d(viewM4091b);
            } else {
                iM4028z = m4028z();
                iMo2392d = this.f4696q.mo2392d(viewM4091b) + iM4028z;
            }
            if (c1662s.f7575f == -1) {
                i3 = c1662s.f7571b;
                i4 = i3 - c1661r.f7566a;
            } else {
                i4 = c1662s.f7571b;
                i3 = c1661r.f7566a + i4;
            }
        } else {
            int iM4008B = m4008B();
            int iMo2392d2 = this.f4696q.mo2392d(viewM4091b) + iM4008B;
            if (c1662s.f7575f == -1) {
                int i7 = c1662s.f7571b;
                int i8 = i7 - c1661r.f7566a;
                iMo2392d = i7;
                i3 = iMo2392d2;
                iM4028z = i8;
                i4 = iM4008B;
            } else {
                int i9 = c1662s.f7571b;
                int i10 = c1661r.f7566a + i9;
                iM4028z = i9;
                i3 = iMo2392d2;
                i4 = iM4008B;
                iMo2392d = i10;
            }
        }
        AbstractC1621E.m4003I(viewM4091b, iM4028z, i4, iMo2392d, i3);
        if (c1622f.f7364a.m4053g() || c1622f.f7364a.m4056j()) {
            c1661r.f7568c = true;
        }
        c1661r.f7569d = viewM4091b.hasFocusable();
    }

    /* JADX INFO: renamed from: M0 */
    public final void m2714M0(C1627K c1627k, C1662s c1662s) {
        if (!c1662s.f7570a || c1662s.f7581l) {
            return;
        }
        int i3 = c1662s.f7576g;
        int i4 = c1662s.f7578i;
        if (c1662s.f7575f == -1) {
            int iM4026u = m4026u();
            if (i3 < 0) {
                return;
            }
            int iMo2394f = (this.f4696q.mo2394f() - i3) + i4;
            if (this.f4699t) {
                for (int i5 = 0; i5 < iM4026u; i5++) {
                    View viewM4025t = m4025t(i5);
                    if (this.f4696q.mo2393e(viewM4025t) < iMo2394f || this.f4696q.mo2402n(viewM4025t) < iMo2394f) {
                        m2715N0(c1627k, 0, i5);
                        return;
                    }
                }
                return;
            }
            int i6 = iM4026u - 1;
            for (int i7 = i6; i7 >= 0; i7--) {
                View viewM4025t2 = m4025t(i7);
                if (this.f4696q.mo2393e(viewM4025t2) < iMo2394f || this.f4696q.mo2402n(viewM4025t2) < iMo2394f) {
                    m2715N0(c1627k, i6, i7);
                    return;
                }
            }
            return;
        }
        if (i3 < 0) {
            return;
        }
        int i8 = i3 - i4;
        int iM4026u2 = m4026u();
        if (!this.f4699t) {
            for (int i9 = 0; i9 < iM4026u2; i9++) {
                View viewM4025t3 = m4025t(i9);
                if (this.f4696q.mo2390b(viewM4025t3) > i8 || this.f4696q.mo2401m(viewM4025t3) > i8) {
                    m2715N0(c1627k, 0, i9);
                    return;
                }
            }
            return;
        }
        int i10 = iM4026u2 - 1;
        for (int i11 = i10; i11 >= 0; i11--) {
            View viewM4025t4 = m4025t(i11);
            if (this.f4696q.mo2390b(viewM4025t4) > i8 || this.f4696q.mo2401m(viewM4025t4) > i8) {
                m2715N0(c1627k, i10, i11);
                return;
            }
        }
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: N */
    public View mo2670N(View view, int i3, C1627K c1627k, C1631O c1631o) {
        int iM2737x0;
        View viewM2705C0;
        m2717O0();
        if (m4026u() != 0 && (iM2737x0 = m2737x0(i3)) != Integer.MIN_VALUE) {
            m2738y0();
            m2720S0(iM2737x0, (int) (this.f4696q.mo2400l() * 0.33333334f), false, c1631o);
            C1662s c1662s = this.f4695p;
            c1662s.f7576g = Integer.MIN_VALUE;
            c1662s.f7570a = false;
            m2739z0(c1627k, c1662s, c1631o, true);
            if (iM2737x0 == -1) {
                viewM2705C0 = this.f4699t ? m2705C0(m4026u() - 1, -1) : m2705C0(0, m4026u());
            } else {
                viewM2705C0 = this.f4699t ? m2705C0(0, m4026u()) : m2705C0(m4026u() - 1, -1);
            }
            View viewM2711I0 = iM2737x0 == -1 ? m2711I0() : m2710H0();
            if (!viewM2711I0.hasFocusable()) {
                return viewM2705C0;
            }
            if (viewM2705C0 != null) {
                return viewM2711I0;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: N0 */
    public final void m2715N0(C1627K c1627k, int i3, int i4) {
        if (i3 == i4) {
            return;
        }
        if (i4 <= i3) {
            while (i3 > i4) {
                View viewM4025t = m4025t(i3);
                m4015f0(i3);
                c1627k.m4038h(viewM4025t);
                i3--;
            }
            return;
        }
        for (int i5 = i4 - 1; i5 >= i3; i5--) {
            View viewM4025t2 = m4025t(i5);
            m4015f0(i5);
            c1627k.m4038h(viewM4025t2);
        }
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: O */
    public final void mo2716O(AccessibilityEvent accessibilityEvent) {
        super.mo2716O(accessibilityEvent);
        if (m4026u() > 0) {
            View viewM2706D0 = m2706D0(0, m4026u(), false);
            accessibilityEvent.setFromIndex(viewM2706D0 == null ? -1 : AbstractC1621E.m4000C(viewM2706D0));
            View viewM2706D1 = m2706D0(m4026u() - 1, -1, false);
            accessibilityEvent.setToIndex(viewM2706D1 != null ? AbstractC1621E.m4000C(viewM2706D1) : -1);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final void m2717O0() {
        if (this.f4694o == 1 || !m2712J0()) {
            this.f4699t = this.f4698s;
        } else {
            this.f4699t = !this.f4698s;
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final int m2718P0(int i3, C1627K c1627k, C1631O c1631o) {
        if (m4026u() != 0 && i3 != 0) {
            m2738y0();
            this.f4695p.f7570a = true;
            int i4 = i3 > 0 ? 1 : -1;
            int iAbs = Math.abs(i3);
            m2720S0(i4, iAbs, true, c1631o);
            C1662s c1662s = this.f4695p;
            int iM2739z0 = m2739z0(c1627k, c1662s, c1631o, false) + c1662s.f7576g;
            if (iM2739z0 >= 0) {
                if (iAbs > iM2739z0) {
                    i3 = i4 * iM2739z0;
                }
                this.f4696q.mo2403o(-i3);
                this.f4695p.f7579j = i3;
                return i3;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m2719Q0(int i3) {
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException(AbstractC0462h.m1165e(i3, "invalid orientation:"));
        }
        mo2725b(null);
        if (i3 != this.f4694o || this.f4696q == null) {
            AbstractC0916f abstractC0916fM2389a = AbstractC0916f.m2389a(this, i3);
            this.f4696q = abstractC0916fM2389a;
            this.f4705z.f3101f = abstractC0916fM2389a;
            this.f4694o = i3;
            m4017h0();
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void mo2673R0(boolean z3) {
        mo2725b(null);
        if (this.f4700u == z3) {
            return;
        }
        this.f4700u = z3;
        m4017h0();
    }

    /* JADX INFO: renamed from: S0 */
    public final void m2720S0(int i3, int i4, boolean z3, C1631O c1631o) {
        int iMo2399k;
        this.f4695p.f7581l = this.f4696q.mo2397i() == 0 && this.f4696q.mo2394f() == 0;
        this.f4695p.f7575f = i3;
        int[] iArr = this.f4693C;
        iArr[0] = 0;
        iArr[1] = 0;
        c1631o.getClass();
        int i5 = this.f4695p.f7575f;
        iArr[0] = 0;
        iArr[1] = 0;
        int iMax = Math.max(0, 0);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z4 = i3 == 1;
        C1662s c1662s = this.f4695p;
        int i6 = z4 ? iMax2 : iMax;
        c1662s.f7577h = i6;
        if (!z4) {
            iMax = iMax2;
        }
        c1662s.f7578i = iMax;
        if (z4) {
            c1662s.f7577h = this.f4696q.mo2396h() + i6;
            View viewM2710H0 = m2710H0();
            C1662s c1662s2 = this.f4695p;
            c1662s2.f7574e = this.f4699t ? -1 : 1;
            int iM4000C = AbstractC1621E.m4000C(viewM2710H0);
            C1662s c1662s3 = this.f4695p;
            c1662s2.f7573d = iM4000C + c1662s3.f7574e;
            c1662s3.f7571b = this.f4696q.mo2390b(viewM2710H0);
            iMo2399k = this.f4696q.mo2390b(viewM2710H0) - this.f4696q.mo2395g();
        } else {
            View viewM2711I0 = m2711I0();
            C1662s c1662s4 = this.f4695p;
            c1662s4.f7577h = this.f4696q.mo2399k() + c1662s4.f7577h;
            C1662s c1662s5 = this.f4695p;
            c1662s5.f7574e = this.f4699t ? 1 : -1;
            int iM4000C2 = AbstractC1621E.m4000C(viewM2711I0);
            C1662s c1662s6 = this.f4695p;
            c1662s5.f7573d = iM4000C2 + c1662s6.f7574e;
            c1662s6.f7571b = this.f4696q.mo2393e(viewM2711I0);
            iMo2399k = (-this.f4696q.mo2393e(viewM2711I0)) + this.f4696q.mo2399k();
        }
        C1662s c1662s7 = this.f4695p;
        c1662s7.f7572c = i4;
        if (z3) {
            c1662s7.f7572c = i4 - iMo2399k;
        }
        c1662s7.f7576g = iMo2399k;
    }

    /* JADX INFO: renamed from: T0 */
    public final void m2721T0(int i3, int i4) {
        this.f4695p.f7572c = this.f4696q.mo2395g() - i4;
        C1662s c1662s = this.f4695p;
        c1662s.f7574e = this.f4699t ? -1 : 1;
        c1662s.f7573d = i3;
        c1662s.f7575f = 1;
        c1662s.f7571b = i4;
        c1662s.f7576g = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: U0 */
    public final void m2722U0(int i3, int i4) {
        this.f4695p.f7572c = i4 - this.f4696q.mo2399k();
        C1662s c1662s = this.f4695p;
        c1662s.f7573d = i3;
        c1662s.f7574e = this.f4699t ? 1 : -1;
        c1662s.f7575f = -1;
        c1662s.f7571b = i4;
        c1662s.f7576g = Integer.MIN_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:114:0x01df  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:122:0x0212 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x0216  */
    /* JADX WARN: Code duplicated, block: B:126:0x0219 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x021d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0220 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x0222  */
    /* JADX WARN: Code duplicated, block: B:133:0x0226  */
    /* JADX WARN: Code duplicated, block: B:135:0x022a  */
    /* JADX WARN: Code duplicated, block: B:137:0x0231  */
    /* JADX WARN: Code duplicated, block: B:138:0x0237  */
    /* JADX WARN: Code duplicated, block: B:95:0x0194  */
    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: X */
    public void mo2681X(C1627K c1627k, C1631O c1631o) {
        View focusedChild;
        int iM4045b;
        RecyclerView recyclerView;
        View focusedChild2;
        boolean z3;
        boolean z4;
        View viewMo2667E0;
        int iMo2393e;
        int iMo2390b;
        int iMo2399k;
        int iMo2395g;
        boolean z5;
        boolean z6;
        C1622F c1622f;
        int i3;
        int iMo2393e2;
        int i4;
        int i5;
        List list;
        int i6;
        int i7;
        int iM2707F0;
        int i8;
        View viewMo2732p;
        int iMo2393e3;
        int iMo2395g2;
        int i9;
        int i10 = -1;
        if (!(this.f4704y == null && this.f4702w == -1) && c1631o.m4045b() == 0) {
            m4012c0(c1627k);
            return;
        }
        C1663t c1663t = this.f4704y;
        if (c1663t != null && (i9 = c1663t.f7582g) >= 0) {
            this.f4702w = i9;
        }
        m2738y0();
        this.f4695p.f7570a = false;
        m2717O0();
        RecyclerView recyclerView2 = this.f7351b;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.f7350a.f3641j).contains(focusedChild)) {
            focusedChild = null;
        }
        C0760w c0760w = this.f4705z;
        if (!c0760w.f3099d || this.f4702w != -1 || this.f4704y != null) {
            c0760w.m1873g();
            c0760w.f3097b = this.f4699t ^ this.f4700u;
            if (c1631o.f7390f || (i3 = this.f4702w) == -1) {
                if (m4026u() != 0) {
                    recyclerView = this.f7351b;
                    if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || ((ArrayList) this.f7350a.f3641j).contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        c1622f = (C1622F) focusedChild2.getLayoutParams();
                        if (!c1622f.f7364a.m4053g() || c1622f.f7364a.m4048b() < 0 || c1622f.f7364a.m4048b() >= c1631o.m4045b()) {
                            z3 = this.f4697r;
                            z4 = this.f4700u;
                            if (z3 == z4 || (viewMo2667E0 = mo2667E0(c1627k, c1631o, c0760w.f3097b, z4)) == null) {
                                c0760w.m1868b();
                                if (this.f4700u) {
                                    iM4045b = c1631o.m4045b() - 1;
                                } else {
                                    iM4045b = 0;
                                }
                                c0760w.f3098c = iM4045b;
                            } else {
                                c0760w.m1869c(viewMo2667E0, AbstractC1621E.m4000C(viewMo2667E0));
                                if (!c1631o.f7390f && mo2700s0()) {
                                    iMo2393e = this.f4696q.mo2393e(viewMo2667E0);
                                    iMo2390b = this.f4696q.mo2390b(viewMo2667E0);
                                    iMo2399k = this.f4696q.mo2399k();
                                    iMo2395g = this.f4696q.mo2395g();
                                    if (iMo2390b <= iMo2399k || iMo2393e >= iMo2399k) {
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    if (iMo2393e >= iMo2395g || iMo2390b <= iMo2395g) {
                                        z6 = false;
                                    } else {
                                        z6 = true;
                                    }
                                    if (z5 || z6) {
                                        if (c0760w.f3097b) {
                                            iMo2399k = iMo2395g;
                                        }
                                        c0760w.f3100e = iMo2399k;
                                    }
                                }
                            }
                        } else {
                            c0760w.m1870d(focusedChild2, AbstractC1621E.m4000C(focusedChild2));
                        }
                    } else {
                        z3 = this.f4697r;
                        z4 = this.f4700u;
                        if (z3 == z4) {
                            c0760w.m1868b();
                            if (this.f4700u) {
                                iM4045b = c1631o.m4045b() - 1;
                            } else {
                                iM4045b = 0;
                            }
                            c0760w.f3098c = iM4045b;
                        } else {
                            c0760w.m1869c(viewMo2667E0, AbstractC1621E.m4000C(viewMo2667E0));
                            if (!c1631o.f7390f) {
                                iMo2393e = this.f4696q.mo2393e(viewMo2667E0);
                                iMo2390b = this.f4696q.mo2390b(viewMo2667E0);
                                iMo2399k = this.f4696q.mo2399k();
                                iMo2395g = this.f4696q.mo2395g();
                                if (iMo2390b <= iMo2399k) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (iMo2393e >= iMo2395g) {
                                    z6 = false;
                                } else {
                                    z6 = false;
                                }
                                if (z5) {
                                    if (c0760w.f3097b) {
                                        iMo2399k = iMo2395g;
                                    }
                                    c0760w.f3100e = iMo2399k;
                                } else {
                                    if (c0760w.f3097b) {
                                        iMo2399k = iMo2395g;
                                    }
                                    c0760w.f3100e = iMo2399k;
                                }
                            }
                        }
                    }
                } else {
                    c0760w.m1868b();
                    if (this.f4700u) {
                        iM4045b = c1631o.m4045b() - 1;
                    } else {
                        iM4045b = 0;
                    }
                    c0760w.f3098c = iM4045b;
                }
            } else if (i3 < 0 || i3 >= c1631o.m4045b()) {
                this.f4702w = -1;
                this.f4703x = Integer.MIN_VALUE;
                if (m4026u() != 0) {
                    recyclerView = this.f7351b;
                    if (recyclerView != null) {
                        focusedChild2 = null;
                    } else {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        c1622f = (C1622F) focusedChild2.getLayoutParams();
                        if (c1622f.f7364a.m4053g()) {
                            z3 = this.f4697r;
                            z4 = this.f4700u;
                            if (z3 == z4) {
                                c0760w.m1868b();
                                if (this.f4700u) {
                                    iM4045b = c1631o.m4045b() - 1;
                                } else {
                                    iM4045b = 0;
                                }
                                c0760w.f3098c = iM4045b;
                            } else {
                                c0760w.m1869c(viewMo2667E0, AbstractC1621E.m4000C(viewMo2667E0));
                                if (!c1631o.f7390f) {
                                    iMo2393e = this.f4696q.mo2393e(viewMo2667E0);
                                    iMo2390b = this.f4696q.mo2390b(viewMo2667E0);
                                    iMo2399k = this.f4696q.mo2399k();
                                    iMo2395g = this.f4696q.mo2395g();
                                    if (iMo2390b <= iMo2399k) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (iMo2393e >= iMo2395g) {
                                        z6 = false;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z5) {
                                        if (c0760w.f3097b) {
                                            iMo2399k = iMo2395g;
                                        }
                                        c0760w.f3100e = iMo2399k;
                                    } else {
                                        if (c0760w.f3097b) {
                                            iMo2399k = iMo2395g;
                                        }
                                        c0760w.f3100e = iMo2399k;
                                    }
                                }
                            }
                        } else {
                            z3 = this.f4697r;
                            z4 = this.f4700u;
                            if (z3 == z4) {
                                c0760w.m1868b();
                                if (this.f4700u) {
                                    iM4045b = c1631o.m4045b() - 1;
                                } else {
                                    iM4045b = 0;
                                }
                                c0760w.f3098c = iM4045b;
                            } else {
                                c0760w.m1869c(viewMo2667E0, AbstractC1621E.m4000C(viewMo2667E0));
                                if (!c1631o.f7390f) {
                                    iMo2393e = this.f4696q.mo2393e(viewMo2667E0);
                                    iMo2390b = this.f4696q.mo2390b(viewMo2667E0);
                                    iMo2399k = this.f4696q.mo2399k();
                                    iMo2395g = this.f4696q.mo2395g();
                                    if (iMo2390b <= iMo2399k) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (iMo2393e >= iMo2395g) {
                                        z6 = false;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z5) {
                                        if (c0760w.f3097b) {
                                            iMo2399k = iMo2395g;
                                        }
                                        c0760w.f3100e = iMo2399k;
                                    } else {
                                        if (c0760w.f3097b) {
                                            iMo2399k = iMo2395g;
                                        }
                                        c0760w.f3100e = iMo2399k;
                                    }
                                }
                            }
                        }
                    } else {
                        z3 = this.f4697r;
                        z4 = this.f4700u;
                        if (z3 == z4) {
                            c0760w.m1868b();
                            if (this.f4700u) {
                                iM4045b = c1631o.m4045b() - 1;
                            } else {
                                iM4045b = 0;
                            }
                            c0760w.f3098c = iM4045b;
                        } else {
                            c0760w.m1869c(viewMo2667E0, AbstractC1621E.m4000C(viewMo2667E0));
                            if (!c1631o.f7390f) {
                                iMo2393e = this.f4696q.mo2393e(viewMo2667E0);
                                iMo2390b = this.f4696q.mo2390b(viewMo2667E0);
                                iMo2399k = this.f4696q.mo2399k();
                                iMo2395g = this.f4696q.mo2395g();
                                if (iMo2390b <= iMo2399k) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (iMo2393e >= iMo2395g) {
                                    z6 = false;
                                } else {
                                    z6 = false;
                                }
                                if (z5) {
                                    if (c0760w.f3097b) {
                                        iMo2399k = iMo2395g;
                                    }
                                    c0760w.f3100e = iMo2399k;
                                } else {
                                    if (c0760w.f3097b) {
                                        iMo2399k = iMo2395g;
                                    }
                                    c0760w.f3100e = iMo2399k;
                                }
                            }
                        }
                    }
                } else {
                    c0760w.m1868b();
                    if (this.f4700u) {
                        iM4045b = c1631o.m4045b() - 1;
                    } else {
                        iM4045b = 0;
                    }
                    c0760w.f3098c = iM4045b;
                }
            } else {
                int i11 = this.f4702w;
                c0760w.f3098c = i11;
                C1663t c1663t2 = this.f4704y;
                if (c1663t2 != null && c1663t2.f7582g >= 0) {
                    boolean z7 = c1663t2.f7584i;
                    c0760w.f3097b = z7;
                    if (z7) {
                        c0760w.f3100e = this.f4696q.mo2395g() - this.f4704y.f7583h;
                    } else {
                        c0760w.f3100e = this.f4696q.mo2399k() + this.f4704y.f7583h;
                    }
                } else if (this.f4703x == Integer.MIN_VALUE) {
                    View viewMo2732p2 = mo2732p(i11);
                    if (viewMo2732p2 == null) {
                        if (m4026u() > 0) {
                            c0760w.f3097b = (this.f4702w < AbstractC1621E.m4000C(m4025t(0))) == this.f4699t;
                        }
                        c0760w.m1868b();
                    } else if (this.f4696q.mo2391c(viewMo2732p2) > this.f4696q.mo2400l()) {
                        c0760w.m1868b();
                    } else if (this.f4696q.mo2393e(viewMo2732p2) - this.f4696q.mo2399k() < 0) {
                        c0760w.f3100e = this.f4696q.mo2399k();
                        c0760w.f3097b = false;
                    } else if (this.f4696q.mo2395g() - this.f4696q.mo2390b(viewMo2732p2) < 0) {
                        c0760w.f3100e = this.f4696q.mo2395g();
                        c0760w.f3097b = true;
                    } else {
                        if (c0760w.f3097b) {
                            int iMo2390b2 = this.f4696q.mo2390b(viewMo2732p2);
                            AbstractC0916f abstractC0916f = this.f4696q;
                            iMo2393e2 = (Integer.MIN_VALUE == abstractC0916f.f4000a ? 0 : abstractC0916f.mo2400l() - abstractC0916f.f4000a) + iMo2390b2;
                        } else {
                            iMo2393e2 = this.f4696q.mo2393e(viewMo2732p2);
                        }
                        c0760w.f3100e = iMo2393e2;
                    }
                } else {
                    boolean z8 = this.f4699t;
                    c0760w.f3097b = z8;
                    if (z8) {
                        c0760w.f3100e = this.f4696q.mo2395g() - this.f4703x;
                    } else {
                        c0760w.f3100e = this.f4696q.mo2399k() + this.f4703x;
                    }
                }
            }
            c0760w.f3099d = true;
        } else if (focusedChild != null && (this.f4696q.mo2393e(focusedChild) >= this.f4696q.mo2395g() || this.f4696q.mo2390b(focusedChild) <= this.f4696q.mo2399k())) {
            c0760w.m1870d(focusedChild, AbstractC1621E.m4000C(focusedChild));
        }
        C1662s c1662s = this.f4695p;
        c1662s.f7575f = c1662s.f7579j >= 0 ? 1 : -1;
        int[] iArr = this.f4693C;
        iArr[0] = 0;
        iArr[1] = 0;
        c1631o.getClass();
        int i12 = this.f4695p.f7575f;
        iArr[0] = 0;
        iArr[1] = 0;
        int iMo2399k2 = this.f4696q.mo2399k() + Math.max(0, 0);
        int iMo2396h = this.f4696q.mo2396h() + Math.max(0, iArr[1]);
        if (c1631o.f7390f && (i8 = this.f4702w) != -1 && this.f4703x != Integer.MIN_VALUE && (viewMo2732p = mo2732p(i8)) != null) {
            if (this.f4699t) {
                iMo2395g2 = this.f4696q.mo2395g() - this.f4696q.mo2390b(viewMo2732p);
                iMo2393e3 = this.f4703x;
            } else {
                iMo2393e3 = this.f4696q.mo2393e(viewMo2732p) - this.f4696q.mo2399k();
                iMo2395g2 = this.f4703x;
            }
            int i13 = iMo2395g2 - iMo2393e3;
            if (i13 > 0) {
                iMo2399k2 += i13;
            } else {
                iMo2396h -= i13;
            }
        }
        if (!c0760w.f3097b ? !this.f4699t : this.f4699t) {
            i10 = 1;
        }
        mo2669L0(c1627k, c1631o, c0760w, i10);
        m4021o(c1627k);
        this.f4695p.f7581l = this.f4696q.mo2397i() == 0 && this.f4696q.mo2394f() == 0;
        this.f4695p.getClass();
        this.f4695p.f7578i = 0;
        if (c0760w.f3097b) {
            m2722U0(c0760w.f3098c, c0760w.f3100e);
            C1662s c1662s2 = this.f4695p;
            c1662s2.f7577h = iMo2399k2;
            m2739z0(c1627k, c1662s2, c1631o, false);
            C1662s c1662s3 = this.f4695p;
            i5 = c1662s3.f7571b;
            int i14 = c1662s3.f7573d;
            int i15 = c1662s3.f7572c;
            if (i15 > 0) {
                iMo2396h += i15;
            }
            m2721T0(c0760w.f3098c, c0760w.f3100e);
            C1662s c1662s4 = this.f4695p;
            c1662s4.f7577h = iMo2396h;
            c1662s4.f7573d += c1662s4.f7574e;
            m2739z0(c1627k, c1662s4, c1631o, false);
            C1662s c1662s5 = this.f4695p;
            i4 = c1662s5.f7571b;
            int i16 = c1662s5.f7572c;
            if (i16 > 0) {
                m2722U0(i14, i5);
                C1662s c1662s6 = this.f4695p;
                c1662s6.f7577h = i16;
                m2739z0(c1627k, c1662s6, c1631o, false);
                i5 = this.f4695p.f7571b;
            }
        } else {
            m2721T0(c0760w.f3098c, c0760w.f3100e);
            C1662s c1662s7 = this.f4695p;
            c1662s7.f7577h = iMo2396h;
            m2739z0(c1627k, c1662s7, c1631o, false);
            C1662s c1662s8 = this.f4695p;
            i4 = c1662s8.f7571b;
            int i17 = c1662s8.f7573d;
            int i18 = c1662s8.f7572c;
            if (i18 > 0) {
                iMo2399k2 += i18;
            }
            m2722U0(c0760w.f3098c, c0760w.f3100e);
            C1662s c1662s9 = this.f4695p;
            c1662s9.f7577h = iMo2399k2;
            c1662s9.f7573d += c1662s9.f7574e;
            m2739z0(c1627k, c1662s9, c1631o, false);
            C1662s c1662s10 = this.f4695p;
            int i19 = c1662s10.f7571b;
            int i20 = c1662s10.f7572c;
            if (i20 > 0) {
                m2721T0(i17, i4);
                C1662s c1662s11 = this.f4695p;
                c1662s11.f7577h = i20;
                m2739z0(c1627k, c1662s11, c1631o, false);
                i4 = this.f4695p.f7571b;
            }
            i5 = i19;
        }
        if (m4026u() > 0) {
            if (this.f4699t ^ this.f4700u) {
                int iM2707F1 = m2707F0(i4, c1627k, c1631o, true);
                i6 = i5 + iM2707F1;
                i7 = i4 + iM2707F1;
                iM2707F0 = m2709G0(i6, c1627k, c1631o, false);
            } else {
                int iM2709G0 = m2709G0(i5, c1627k, c1631o, true);
                i6 = i5 + iM2709G0;
                i7 = i4 + iM2709G0;
                iM2707F0 = m2707F0(i7, c1627k, c1631o, false);
            }
            i5 = i6 + iM2707F0;
            i4 = i7 + iM2707F0;
        }
        if (c1631o.f7394j && m4026u() != 0 && !c1631o.f7390f && mo2700s0()) {
            List list2 = c1627k.f7378d;
            int size = list2.size();
            int iM4000C = AbstractC1621E.m4000C(m4025t(0));
            int iMo2391c = 0;
            int iMo2391c2 = 0;
            for (int i21 = 0; i21 < size; i21++) {
                AbstractC1635T abstractC1635T = (AbstractC1635T) list2.get(i21);
                if (!abstractC1635T.m4053g()) {
                    boolean z9 = abstractC1635T.m4048b() < iM4000C;
                    boolean z10 = this.f4699t;
                    View view = abstractC1635T.f7406a;
                    if (z9 != z10) {
                        iMo2391c += this.f4696q.mo2391c(view);
                    } else {
                        iMo2391c2 += this.f4696q.mo2391c(view);
                    }
                }
            }
            this.f4695p.f7580k = list2;
            if (iMo2391c > 0) {
                m2722U0(AbstractC1621E.m4000C(m2711I0()), i5);
                C1662s c1662s12 = this.f4695p;
                c1662s12.f7577h = iMo2391c;
                c1662s12.f7572c = 0;
                c1662s12.m4090a(null);
                m2739z0(c1627k, this.f4695p, c1631o, false);
            }
            if (iMo2391c2 > 0) {
                m2721T0(AbstractC1621E.m4000C(m2710H0()), i4);
                C1662s c1662s13 = this.f4695p;
                c1662s13.f7577h = iMo2391c2;
                c1662s13.f7572c = 0;
                list = null;
                c1662s13.m4090a(null);
                m2739z0(c1627k, this.f4695p, c1631o, false);
            } else {
                list = null;
            }
            this.f4695p.f7580k = list;
        }
        if (c1631o.f7390f) {
            c0760w.m1873g();
        } else {
            AbstractC0916f abstractC0916f2 = this.f4696q;
            abstractC0916f2.f4000a = abstractC0916f2.mo2400l();
        }
        this.f4697r = this.f4700u;
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: Y */
    public void mo2683Y(C1631O c1631o) {
        this.f4704y = null;
        this.f4702w = -1;
        this.f4703x = Integer.MIN_VALUE;
        this.f4705z.m1873g();
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: Z */
    public final void mo2723Z(Parcelable parcelable) {
        if (parcelable instanceof C1663t) {
            C1663t c1663t = (C1663t) parcelable;
            this.f4704y = c1663t;
            if (this.f4702w != -1) {
                c1663t.f7582g = -1;
            }
            m4017h0();
        }
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: a0 */
    public final Parcelable mo2724a0() {
        C1663t c1663t = this.f4704y;
        if (c1663t != null) {
            C1663t c1663t2 = new C1663t();
            c1663t2.f7582g = c1663t.f7582g;
            c1663t2.f7583h = c1663t.f7583h;
            c1663t2.f7584i = c1663t.f7584i;
            return c1663t2;
        }
        C1663t c1663t3 = new C1663t();
        if (m4026u() <= 0) {
            c1663t3.f7582g = -1;
            return c1663t3;
        }
        m2738y0();
        boolean z3 = this.f4697r ^ this.f4699t;
        c1663t3.f7584i = z3;
        if (z3) {
            View viewM2710H0 = m2710H0();
            c1663t3.f7583h = this.f4696q.mo2395g() - this.f4696q.mo2390b(viewM2710H0);
            c1663t3.f7582g = AbstractC1621E.m4000C(viewM2710H0);
            return c1663t3;
        }
        View viewM2711I0 = m2711I0();
        c1663t3.f7582g = AbstractC1621E.m4000C(viewM2711I0);
        c1663t3.f7583h = this.f4696q.mo2393e(viewM2711I0) - this.f4696q.mo2399k();
        return c1663t3;
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: b */
    public final void mo2725b(String str) {
        RecyclerView recyclerView;
        if (this.f4704y != null || (recyclerView = this.f7351b) == null) {
            return;
        }
        recyclerView.m2775f(str);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: c */
    public final boolean mo2726c() {
        return this.f4694o == 0;
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: d */
    public final boolean mo2727d() {
        return this.f4694o == 1;
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: g */
    public final void mo2728g(int i3, int i4, C1631O c1631o, C1656m c1656m) {
        if (this.f4694o != 0) {
            i3 = i4;
        }
        if (m4026u() == 0 || i3 == 0) {
            return;
        }
        m2738y0();
        m2720S0(i3 > 0 ? 1 : -1, Math.abs(i3), true, c1631o);
        mo2701t0(c1631o, this.f4695p, c1656m);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: h */
    public final void mo2729h(int i3, C1656m c1656m) {
        boolean z3;
        int i4;
        C1663t c1663t = this.f4704y;
        if (c1663t == null || (i4 = c1663t.f7582g) < 0) {
            m2717O0();
            z3 = this.f4699t;
            i4 = this.f4702w;
            if (i4 == -1) {
                i4 = z3 ? i3 - 1 : 0;
            }
        } else {
            z3 = c1663t.f7584i;
        }
        int i5 = z3 ? -1 : 1;
        for (int i6 = 0; i6 < this.f4692B && i4 >= 0 && i4 < i3; i6++) {
            c1656m.m4084b(i4, 0);
            i4 += i5;
        }
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: i */
    public final int mo2730i(C1631O c1631o) {
        return m2734u0(c1631o);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: i0 */
    public int mo2690i0(int i3, C1627K c1627k, C1631O c1631o) {
        if (this.f4694o == 1) {
            return 0;
        }
        return m2718P0(i3, c1627k, c1631o);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: j */
    public int mo2691j(C1631O c1631o) {
        return m2735v0(c1631o);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: j0 */
    public int mo2692j0(int i3, C1627K c1627k, C1631O c1631o) {
        if (this.f4694o == 0) {
            return 0;
        }
        return m2718P0(i3, c1627k, c1631o);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: k */
    public int mo2693k(C1631O c1631o) {
        return m2736w0(c1631o);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: l */
    public final int mo2731l(C1631O c1631o) {
        return m2734u0(c1631o);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: m */
    public int mo2694m(C1631O c1631o) {
        return m2735v0(c1631o);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: n */
    public int mo2696n(C1631O c1631o) {
        return m2736w0(c1631o);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: p */
    public final View mo2732p(int i3) {
        int iM4026u = m4026u();
        if (iM4026u == 0) {
            return null;
        }
        int iM4000C = i3 - AbstractC1621E.m4000C(m4025t(0));
        if (iM4000C >= 0 && iM4000C < iM4026u) {
            View viewM4025t = m4025t(iM4000C);
            if (AbstractC1621E.m4000C(viewM4025t) == i3) {
                return viewM4025t;
            }
        }
        return super.mo2732p(i3);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: q */
    public C1622F mo2697q() {
        return new C1622F(-2, -2);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: q0 */
    public final boolean mo2733q0() {
        if (this.f7361l != 1073741824 && this.f7360k != 1073741824) {
            int iM4026u = m4026u();
            for (int i3 = 0; i3 < iM4026u; i3++) {
                ViewGroup.LayoutParams layoutParams = m4025t(i3).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: s0 */
    public boolean mo2700s0() {
        return this.f4704y == null && this.f4697r == this.f4700u;
    }

    /* JADX INFO: renamed from: t0 */
    public void mo2701t0(C1631O c1631o, C1662s c1662s, C1656m c1656m) {
        int i3 = c1662s.f7573d;
        if (i3 < 0 || i3 >= c1631o.m4045b()) {
            return;
        }
        c1656m.m4084b(i3, Math.max(0, c1662s.f7576g));
    }

    /* JADX INFO: renamed from: u0 */
    public final int m2734u0(C1631O c1631o) {
        if (m4026u() == 0) {
            return 0;
        }
        m2738y0();
        AbstractC0916f abstractC0916f = this.f4696q;
        boolean z3 = !this.f4701v;
        return AbstractC2003a.m4534e(c1631o, abstractC0916f, m2704B0(z3), m2703A0(z3), this, this.f4701v);
    }

    /* JADX INFO: renamed from: v0 */
    public final int m2735v0(C1631O c1631o) {
        if (m4026u() == 0) {
            return 0;
        }
        m2738y0();
        AbstractC0916f abstractC0916f = this.f4696q;
        boolean z3 = !this.f4701v;
        return AbstractC2003a.m4535f(c1631o, abstractC0916f, m2704B0(z3), m2703A0(z3), this, this.f4701v, this.f4699t);
    }

    /* JADX INFO: renamed from: w0 */
    public final int m2736w0(C1631O c1631o) {
        if (m4026u() == 0) {
            return 0;
        }
        m2738y0();
        AbstractC0916f abstractC0916f = this.f4696q;
        boolean z3 = !this.f4701v;
        return AbstractC2003a.m4536g(c1631o, abstractC0916f, m2704B0(z3), m2703A0(z3), this, this.f4701v);
    }

    /* JADX INFO: renamed from: x0 */
    public final int m2737x0(int i3) {
        if (i3 == 1) {
            return (this.f4694o != 1 && m2712J0()) ? 1 : -1;
        }
        if (i3 == 2) {
            return (this.f4694o != 1 && m2712J0()) ? -1 : 1;
        }
        if (i3 == 17) {
            return this.f4694o == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i3 == 33) {
            return this.f4694o == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i3 != 66) {
            return (i3 == 130 && this.f4694o == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f4694o == 0 ? 1 : Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m2738y0() {
        if (this.f4695p == null) {
            C1662s c1662s = new C1662s();
            c1662s.f7570a = true;
            c1662s.f7577h = 0;
            c1662s.f7578i = 0;
            c1662s.f7580k = null;
            this.f4695p = c1662s;
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final int m2739z0(C1627K c1627k, C1662s c1662s, C1631O c1631o, boolean z3) {
        int i3;
        int i4 = c1662s.f7572c;
        int i5 = c1662s.f7576g;
        if (i5 != Integer.MIN_VALUE) {
            if (i4 < 0) {
                c1662s.f7576g = i5 + i4;
            }
            m2714M0(c1627k, c1662s);
        }
        int i6 = c1662s.f7572c + c1662s.f7577h;
        while (true) {
            if ((!c1662s.f7581l && i6 <= 0) || (i3 = c1662s.f7573d) < 0 || i3 >= c1631o.m4045b()) {
                break;
            }
            C1661r c1661r = this.f4691A;
            c1661r.f7566a = 0;
            c1661r.f7567b = false;
            c1661r.f7568c = false;
            c1661r.f7569d = false;
            mo2668K0(c1627k, c1631o, c1662s, c1661r);
            if (!c1661r.f7567b) {
                int i7 = c1662s.f7571b;
                int i8 = c1661r.f7566a;
                c1662s.f7571b = (c1662s.f7575f * i8) + i7;
                if (!c1661r.f7568c || c1662s.f7580k != null || !c1631o.f7390f) {
                    c1662s.f7572c -= i8;
                    i6 -= i8;
                }
                int i9 = c1662s.f7576g;
                if (i9 != Integer.MIN_VALUE) {
                    int i10 = i9 + i8;
                    c1662s.f7576g = i10;
                    int i11 = c1662s.f7572c;
                    if (i11 < 0) {
                        c1662s.f7576g = i10 + i11;
                    }
                    m2714M0(c1627k, c1662s);
                }
                if (z3 && c1661r.f7569d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i4 - c1662s.f7572c;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        this.f4694o = 1;
        this.f4698s = false;
        this.f4699t = false;
        this.f4700u = false;
        this.f4701v = true;
        this.f4702w = -1;
        this.f4703x = Integer.MIN_VALUE;
        this.f4704y = null;
        this.f4705z = new C0760w();
        this.f4691A = new C1661r();
        this.f4692B = 2;
        this.f4693C = new int[2];
        C1620D c1620dM4001D = AbstractC1621E.m4001D(context, attributeSet, i3, i4);
        m2719Q0(c1620dM4001D.f7346a);
        boolean z3 = c1620dM4001D.f7348c;
        mo2725b(null);
        if (z3 != this.f4698s) {
            this.f4698s = z3;
            m4017h0();
        }
        mo2673R0(c1620dM4001D.f7349d);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: M */
    public final void mo2713M(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: L0 */
    public void mo2669L0(C1627K c1627k, C1631O c1631o, C0760w c0760w, int i3) {
    }
}

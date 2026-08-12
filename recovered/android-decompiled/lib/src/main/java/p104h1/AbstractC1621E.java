package p104h1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.support.v4.media.session.C0858A;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.cast.C1323r;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000A.AbstractC0016Q;
import p001A0.C0069c;
import p003B.C0090l;
import p100g1.AbstractC1579a;
import p124n.C2022i;

/* JADX INFO: renamed from: h1.E */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1621E {

    /* JADX INFO: renamed from: a */
    public C0858A f7350a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f7351b;

    /* JADX INFO: renamed from: c */
    public final C1323r f7352c;

    /* JADX INFO: renamed from: d */
    public final C1323r f7353d;

    /* JADX INFO: renamed from: e */
    public boolean f7354e;

    /* JADX INFO: renamed from: f */
    public boolean f7355f;

    /* JADX INFO: renamed from: g */
    public final boolean f7356g;

    /* JADX INFO: renamed from: h */
    public final boolean f7357h;

    /* JADX INFO: renamed from: i */
    public int f7358i;

    /* JADX INFO: renamed from: j */
    public boolean f7359j;

    /* JADX INFO: renamed from: k */
    public int f7360k;

    /* JADX INFO: renamed from: l */
    public int f7361l;

    /* JADX INFO: renamed from: m */
    public int f7362m;

    /* JADX INFO: renamed from: n */
    public int f7363n;

    public AbstractC1621E() {
        C1619C c1619c = new C1619C(this, 0);
        C1619C c1619c2 = new C1619C(this, 1);
        this.f7352c = new C1323r(c1619c);
        this.f7353d = new C1323r(c1619c2);
        this.f7354e = false;
        this.f7355f = false;
        this.f7356g = true;
        this.f7357h = true;
    }

    /* JADX INFO: renamed from: C */
    public static int m4000C(View view) {
        return ((C1622F) view.getLayoutParams()).f7364a.m4048b();
    }

    /* JADX INFO: renamed from: D */
    public static C1620D m4001D(Context context, AttributeSet attributeSet, int i3, int i4) {
        C1620D c1620d = new C1620D();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1579a.f7184a, i3, i4);
        c1620d.f7346a = typedArrayObtainStyledAttributes.getInt(0, 1);
        c1620d.f7347b = typedArrayObtainStyledAttributes.getInt(10, 1);
        c1620d.f7348c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c1620d.f7349d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c1620d;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m4002H(int i3, int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (i5 > 0 && i3 != i5) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i3;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i3;
        }
        return true;
    }

    /* JADX INFO: renamed from: I */
    public static void m4003I(View view, int i3, int i4, int i5, int i6) {
        C1622F c1622f = (C1622F) view.getLayoutParams();
        Rect rect = c1622f.f7365b;
        view.layout(i3 + rect.left + ((ViewGroup.MarginLayoutParams) c1622f).leftMargin, i4 + rect.top + ((ViewGroup.MarginLayoutParams) c1622f).topMargin, (i5 - rect.right) - ((ViewGroup.MarginLayoutParams) c1622f).rightMargin, (i6 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c1622f).bottomMargin);
    }

    /* JADX INFO: renamed from: f */
    public static int m4004f(int i3, int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i4, i5) : size;
        }
        return Math.min(size, Math.max(i4, i5));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0023  */
    /* JADX WARN: Code duplicated, block: B:5:0x0010  */
    /* JADX INFO: renamed from: v */
    public static int m4005v(boolean z3, int i3, int i4, int i5, int i6) {
        int iMax = Math.max(0, i3 - i5);
        if (z3) {
            if (i6 >= 0) {
                i4 = 1073741824;
            } else if (i6 != -1 || (i4 != Integer.MIN_VALUE && (i4 == 0 || i4 != 1073741824))) {
                i4 = 0;
                i6 = 0;
            } else {
                i6 = iMax;
            }
        } else if (i6 >= 0) {
            i4 = 1073741824;
        } else if (i6 == -1) {
            i6 = iMax;
        } else if (i6 != -2) {
            i4 = 0;
            i6 = 0;
        } else if (i4 == Integer.MIN_VALUE || i4 == 1073741824) {
            i6 = iMax;
            i4 = Integer.MIN_VALUE;
        } else {
            i6 = iMax;
            i4 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i6, i4);
    }

    /* JADX INFO: renamed from: x */
    public static void m4006x(View view, Rect rect) {
        int[] iArr = RecyclerView.f4706C0;
        C1622F c1622f = (C1622F) view.getLayoutParams();
        Rect rect2 = c1622f.f7365b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c1622f).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c1622f).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c1622f).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c1622f).bottomMargin);
    }

    /* JADX INFO: renamed from: A */
    public final int m4007A() {
        RecyclerView recyclerView = this.f7351b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: B */
    public final int m4008B() {
        RecyclerView recyclerView = this.f7351b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: E */
    public int mo2666E(C1627K c1627k, C1631O c1631o) {
        return -1;
    }

    /* JADX INFO: renamed from: F */
    public final void m4009F(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((C1622F) view.getLayoutParams()).f7365b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f7351b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f7351b.f4764q;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    /* JADX INFO: renamed from: G */
    public abstract boolean mo2708G();

    /* JADX INFO: renamed from: J */
    public void mo2804J(int i3) {
        RecyclerView recyclerView = this.f7351b;
        if (recyclerView != null) {
            int iM2155C = recyclerView.f4754l.m2155C();
            for (int i4 = 0; i4 < iM2155C; i4++) {
                recyclerView.f4754l.m2154B(i4).offsetLeftAndRight(i3);
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public void mo2806K(int i3) {
        RecyclerView recyclerView = this.f7351b;
        if (recyclerView != null) {
            int iM2155C = recyclerView.f4754l.m2155C();
            for (int i4 = 0; i4 < iM2155C; i4++) {
                recyclerView.f4754l.m2154B(i4).offsetTopAndBottom(i3);
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public abstract void mo2713M(RecyclerView recyclerView);

    /* JADX INFO: renamed from: N */
    public abstract View mo2670N(View view, int i3, C1627K c1627k, C1631O c1631o);

    /* JADX INFO: renamed from: O */
    public void mo2716O(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f7351b;
        C1627K c1627k = recyclerView.f4748i;
        C1631O c1631o = recyclerView.f4751j0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z3 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f7351b.canScrollVertically(-1) && !this.f7351b.canScrollHorizontally(-1) && !this.f7351b.canScrollHorizontally(1)) {
            z3 = false;
        }
        accessibilityEvent.setScrollable(z3);
        AbstractC1667x abstractC1667x = this.f7351b.f4766r;
        if (abstractC1667x != null) {
            accessibilityEvent.setItemCount(abstractC1667x.mo2591a());
        }
    }

    /* JADX INFO: renamed from: P */
    public void mo2671P(C1627K c1627k, C1631O c1631o, C0090l c0090l) {
        boolean zCanScrollVertically = this.f7351b.canScrollVertically(-1);
        AccessibilityNodeInfo accessibilityNodeInfo = c0090l.f123a;
        if (zCanScrollVertically || this.f7351b.canScrollHorizontally(-1)) {
            accessibilityNodeInfo.addAction(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f7351b.canScrollVertically(1) || this.f7351b.canScrollHorizontally(1)) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(mo2666E(c1627k, c1631o), mo2702w(c1627k, c1631o), false, 0));
    }

    /* JADX INFO: renamed from: Q */
    public final void m4010Q(View view, C0090l c0090l) {
        AbstractC1635T abstractC1635TM2741F = RecyclerView.m2741F(view);
        if (abstractC1635TM2741F == null || abstractC1635TM2741F.m4053g() || ((ArrayList) this.f7350a.f3641j).contains(abstractC1635TM2741F.f7406a)) {
            return;
        }
        RecyclerView recyclerView = this.f7351b;
        mo2672R(recyclerView.f4748i, recyclerView.f4751j0, view, c0090l);
    }

    /* JADX INFO: renamed from: X */
    public abstract void mo2681X(C1627K c1627k, C1631O c1631o);

    /* JADX INFO: renamed from: Y */
    public abstract void mo2683Y(C1631O c1631o);

    /* JADX INFO: renamed from: Z */
    public abstract void mo2723Z(Parcelable parcelable);

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX INFO: renamed from: a */
    public final void m4011a(View view, int i3, boolean z3) {
        int iM348t;
        AbstractC1635T abstractC1635TM2741F = RecyclerView.m2741F(view);
        if (z3 || abstractC1635TM2741F.m4053g()) {
            C2022i c2022i = (C2022i) this.f7351b.f4756m.f5961h;
            C1645b0 c1645b0M4071a = (C1645b0) c2022i.getOrDefault(abstractC1635TM2741F, null);
            if (c1645b0M4071a == null) {
                c1645b0M4071a = C1645b0.m4071a();
                c2022i.put(abstractC1635TM2741F, c1645b0M4071a);
            }
            c1645b0M4071a.f7463a |= 1;
        } else {
            this.f7351b.f4756m.m3365M(abstractC1635TM2741F);
        }
        C1622F c1622f = (C1622F) view.getLayoutParams();
        if (abstractC1635TM2741F.m4061o() || abstractC1635TM2741F.m4054h()) {
            if (abstractC1635TM2741F.m4054h()) {
                abstractC1635TM2741F.f7418m.m4042l(abstractC1635TM2741F);
            } else {
                abstractC1635TM2741F.f7414i &= -33;
            }
            this.f7350a.m2178q(view, i3, view.getLayoutParams(), false);
        } else if (view.getParent() == this.f7351b) {
            C0858A c0858a = this.f7350a;
            int iIndexOfChild = ((C1666w) c0858a.f3639h).f7586a.indexOfChild(view);
            if (iIndexOfChild == -1) {
                iM348t = -1;
            } else {
                C0069c c0069c = (C0069c) c0858a.f3640i;
                if (c0069c.m350v(iIndexOfChild)) {
                    iM348t = -1;
                } else {
                    iM348t = iIndexOfChild - c0069c.m348t(iIndexOfChild);
                }
            }
            if (i3 == -1) {
                i3 = this.f7350a.m2155C();
            }
            if (iM348t == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f7351b.indexOfChild(view) + this.f7351b.m2790w());
            }
            if (iM348t != i3) {
                AbstractC1621E abstractC1621E = this.f7351b.f4768s;
                View viewM4025t = abstractC1621E.m4025t(iM348t);
                if (viewM4025t == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iM348t + abstractC1621E.f7351b.toString());
                }
                abstractC1621E.m4025t(iM348t);
                abstractC1621E.f7350a.m2181v(iM348t);
                C1622F c1622f2 = (C1622F) viewM4025t.getLayoutParams();
                AbstractC1635T abstractC1635TM2741F2 = RecyclerView.m2741F(viewM4025t);
                if (abstractC1635TM2741F2.m4053g()) {
                    C2022i c2022i2 = (C2022i) abstractC1621E.f7351b.f4756m.f5961h;
                    C1645b0 c1645b0M4071a2 = (C1645b0) c2022i2.getOrDefault(abstractC1635TM2741F2, null);
                    if (c1645b0M4071a2 == null) {
                        c1645b0M4071a2 = C1645b0.m4071a();
                        c2022i2.put(abstractC1635TM2741F2, c1645b0M4071a2);
                    }
                    c1645b0M4071a2.f7463a = 1 | c1645b0M4071a2.f7463a;
                } else {
                    abstractC1621E.f7351b.f4756m.m3365M(abstractC1635TM2741F2);
                }
                abstractC1621E.f7350a.m2178q(viewM4025t, i3, c1622f2, abstractC1635TM2741F2.m4053g());
            }
        } else {
            this.f7350a.m2177o(view, i3, false);
            c1622f.f7366c = true;
        }
        if (c1622f.f7367d) {
            abstractC1635TM2741F.f7406a.invalidate();
            c1622f.f7367d = false;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public abstract Parcelable mo2724a0();

    /* JADX INFO: renamed from: b */
    public abstract void mo2725b(String str);

    /* JADX INFO: renamed from: c */
    public abstract boolean mo2726c();

    /* JADX INFO: renamed from: c0 */
    public final void m4012c0(C1627K c1627k) {
        for (int iM4026u = m4026u() - 1; iM4026u >= 0; iM4026u--) {
            if (!RecyclerView.m2741F(m4025t(iM4026u)).m4060n()) {
                View viewM4025t = m4025t(iM4026u);
                m4015f0(iM4026u);
                c1627k.m4038h(viewM4025t);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo2727d();

    /* JADX INFO: renamed from: d0 */
    public final void m4013d0(C1627K c1627k) {
        ArrayList arrayList;
        int size = c1627k.f7375a.size();
        int i3 = size - 1;
        while (true) {
            arrayList = c1627k.f7375a;
            if (i3 < 0) {
                break;
            }
            View view = ((AbstractC1635T) arrayList.get(i3)).f7406a;
            AbstractC1635T abstractC1635TM2741F = RecyclerView.m2741F(view);
            if (!abstractC1635TM2741F.m4060n()) {
                abstractC1635TM2741F.m4059m(false);
                if (abstractC1635TM2741F.m4055i()) {
                    this.f7351b.removeDetachedView(view, false);
                }
                AbstractC1618B abstractC1618B = this.f7351b.f4730P;
                if (abstractC1618B != null) {
                    abstractC1618B.mo3993d(abstractC1635TM2741F);
                }
                abstractC1635TM2741F.m4059m(true);
                AbstractC1635T abstractC1635TM2741F2 = RecyclerView.m2741F(view);
                abstractC1635TM2741F2.f7418m = null;
                abstractC1635TM2741F2.f7419n = false;
                abstractC1635TM2741F2.f7414i &= -33;
                c1627k.m4039i(abstractC1635TM2741F2);
            }
            i3--;
        }
        arrayList.clear();
        ArrayList arrayList2 = c1627k.f7376b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f7351b.invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean mo2689e(C1622F c1622f) {
        return c1622f != null;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m4014e0(View view, C1627K c1627k) {
        C0858A c0858a = this.f7350a;
        C1666w c1666w = (C1666w) c0858a.f3639h;
        int iIndexOfChild = c1666w.f7586a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (((C0069c) c0858a.f3640i).m352x(iIndexOfChild)) {
                c0858a.m2175X(view);
            }
            c1666w.m4099h(iIndexOfChild);
        }
        c1627k.m4038h(view);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m4015f0(int i3) {
        if (m4025t(i3) != null) {
            C0858A c0858a = this.f7350a;
            int iM2161I = c0858a.m2161I(i3);
            C1666w c1666w = (C1666w) c0858a.f3639h;
            View childAt = c1666w.f7586a.getChildAt(iM2161I);
            if (childAt == null) {
                return;
            }
            if (((C0069c) c0858a.f3640i).m352x(iM2161I)) {
                c0858a.m2175X(childAt);
            }
            c1666w.m4099h(iM2161I);
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo2728g(int i3, int i4, C1631O c1631o, C1656m c1656m);

    /* JADX WARN: Code duplicated, block: B:28:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX INFO: renamed from: g0 */
    public final boolean m4016g0(RecyclerView recyclerView, View view, Rect rect, boolean z3, boolean z4) {
        int iM4028z = m4028z();
        int iM4008B = m4008B();
        int iM4007A = this.f7362m - m4007A();
        int iM4027y = this.f7363n - m4027y();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i3 = left - iM4028z;
        int iMin = Math.min(0, i3);
        int i4 = top - iM4008B;
        int iMin2 = Math.min(0, i4);
        int i5 = iWidth - iM4007A;
        int iMax = Math.max(0, i5);
        int iMax2 = Math.max(0, iHeight - iM4027y);
        RecyclerView recyclerView2 = this.f7351b;
        WeakHashMap weakHashMap = AbstractC0016Q.f14a;
        if (recyclerView2.getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i3, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i5);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i4, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i6 = iArr[0];
        int i7 = iArr[1];
        if (z4) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int iM4028z2 = m4028z();
                int iM4008B2 = m4008B();
                int iM4007A2 = this.f7362m - m4007A();
                int iM4027y2 = this.f7363n - m4027y();
                Rect rect2 = this.f7351b.f4760o;
                m4006x(focusedChild, rect2);
                if (rect2.left - i6 < iM4007A2 && rect2.right - i6 > iM4028z2 && rect2.top - i7 < iM4027y2 && rect2.bottom - i7 > iM4008B2) {
                    if (i6 == 0) {
                    }
                    if (z3) {
                        recyclerView.scrollBy(i6, i7);
                        return true;
                    }
                    recyclerView.m2770Y(i6, i7, false);
                    return true;
                }
            }
        } else if (i6 == 0 || i7 != 0) {
            if (z3) {
                recyclerView.scrollBy(i6, i7);
                return true;
            }
            recyclerView.m2770Y(i6, i7, false);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m4017h0() {
        RecyclerView recyclerView = this.f7351b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract int mo2730i(C1631O c1631o);

    /* JADX INFO: renamed from: i0 */
    public abstract int mo2690i0(int i3, C1627K c1627k, C1631O c1631o);

    /* JADX INFO: renamed from: j */
    public abstract int mo2691j(C1631O c1631o);

    /* JADX INFO: renamed from: j0 */
    public abstract int mo2692j0(int i3, C1627K c1627k, C1631O c1631o);

    /* JADX INFO: renamed from: k */
    public abstract int mo2693k(C1631O c1631o);

    /* JADX INFO: renamed from: k0 */
    public final void m4018k0(RecyclerView recyclerView) {
        m4019l0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    /* JADX INFO: renamed from: l */
    public abstract int mo2731l(C1631O c1631o);

    /* JADX INFO: renamed from: l0 */
    public final void m4019l0(int i3, int i4) {
        this.f7362m = View.MeasureSpec.getSize(i3);
        int mode = View.MeasureSpec.getMode(i3);
        this.f7360k = mode;
        if (mode == 0 && !RecyclerView.f4708E0) {
            this.f7362m = 0;
        }
        this.f7363n = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i4);
        this.f7361l = mode2;
        if (mode2 != 0 || RecyclerView.f4708E0) {
            return;
        }
        this.f7363n = 0;
    }

    /* JADX INFO: renamed from: m */
    public abstract int mo2694m(C1631O c1631o);

    /* JADX INFO: renamed from: m0 */
    public void mo2695m0(Rect rect, int i3, int i4) {
        int iM4007A = m4007A() + m4028z() + rect.width();
        int iM4027y = m4027y() + m4008B() + rect.height();
        RecyclerView recyclerView = this.f7351b;
        WeakHashMap weakHashMap = AbstractC0016Q.f14a;
        this.f7351b.setMeasuredDimension(m4004f(i3, iM4007A, recyclerView.getMinimumWidth()), m4004f(i4, iM4027y, this.f7351b.getMinimumHeight()));
    }

    /* JADX INFO: renamed from: n */
    public abstract int mo2696n(C1631O c1631o);

    /* JADX INFO: renamed from: n0 */
    public final void m4020n0(int i3, int i4) {
        int iM4026u = m4026u();
        if (iM4026u == 0) {
            this.f7351b.m2779l(i3, i4);
            return;
        }
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MIN_VALUE;
        int i7 = Integer.MAX_VALUE;
        int i8 = Integer.MAX_VALUE;
        for (int i9 = 0; i9 < iM4026u; i9++) {
            View viewM4025t = m4025t(i9);
            Rect rect = this.f7351b.f4760o;
            m4006x(viewM4025t, rect);
            int i10 = rect.left;
            if (i10 < i7) {
                i7 = i10;
            }
            int i11 = rect.right;
            if (i11 > i5) {
                i5 = i11;
            }
            int i12 = rect.top;
            if (i12 < i8) {
                i8 = i12;
            }
            int i13 = rect.bottom;
            if (i13 > i6) {
                i6 = i13;
            }
        }
        this.f7351b.f4760o.set(i7, i8, i5, i6);
        mo2695m0(this.f7351b.f4760o, i3, i4);
    }

    /* JADX INFO: renamed from: o */
    public final void m4021o(C1627K c1627k) {
        for (int iM4026u = m4026u() - 1; iM4026u >= 0; iM4026u--) {
            View viewM4025t = m4025t(iM4026u);
            AbstractC1635T abstractC1635TM2741F = RecyclerView.m2741F(viewM4025t);
            if (!abstractC1635TM2741F.m4060n()) {
                if (!abstractC1635TM2741F.m4051e() || abstractC1635TM2741F.m4053g()) {
                    m4025t(iM4026u);
                    this.f7350a.m2181v(iM4026u);
                    c1627k.m4040j(viewM4025t);
                    this.f7351b.f4756m.m3365M(abstractC1635TM2741F);
                } else {
                    this.f7351b.f4766r.getClass();
                    m4015f0(iM4026u);
                    c1627k.m4039i(abstractC1635TM2741F);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m4022o0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f7351b = null;
            this.f7350a = null;
            this.f7362m = 0;
            this.f7363n = 0;
        } else {
            this.f7351b = recyclerView;
            this.f7350a = recyclerView.f4754l;
            this.f7362m = recyclerView.getWidth();
            this.f7363n = recyclerView.getHeight();
        }
        this.f7360k = 1073741824;
        this.f7361l = 1073741824;
    }

    /* JADX INFO: renamed from: p */
    public View mo2732p(int i3) {
        int iM4026u = m4026u();
        for (int i4 = 0; i4 < iM4026u; i4++) {
            View viewM4025t = m4025t(i4);
            AbstractC1635T abstractC1635TM2741F = RecyclerView.m2741F(viewM4025t);
            if (abstractC1635TM2741F != null && abstractC1635TM2741F.m4048b() == i3 && !abstractC1635TM2741F.m4060n() && (this.f7351b.f4751j0.f7390f || !abstractC1635TM2741F.m4053g())) {
                return viewM4025t;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m4023p0(View view, int i3, int i4, C1622F c1622f) {
        return (!view.isLayoutRequested() && this.f7356g && m4002H(view.getWidth(), i3, ((ViewGroup.MarginLayoutParams) c1622f).width) && m4002H(view.getHeight(), i4, ((ViewGroup.MarginLayoutParams) c1622f).height)) ? false : true;
    }

    /* JADX INFO: renamed from: q */
    public abstract C1622F mo2697q();

    /* JADX INFO: renamed from: q0 */
    public boolean mo2733q0() {
        return false;
    }

    /* JADX INFO: renamed from: r */
    public C1622F mo2698r(Context context, AttributeSet attributeSet) {
        return new C1622F(context, attributeSet);
    }

    /* JADX INFO: renamed from: r0 */
    public final boolean m4024r0(View view, int i3, int i4, C1622F c1622f) {
        return (this.f7356g && m4002H(view.getMeasuredWidth(), i3, ((ViewGroup.MarginLayoutParams) c1622f).width) && m4002H(view.getMeasuredHeight(), i4, ((ViewGroup.MarginLayoutParams) c1622f).height)) ? false : true;
    }

    /* JADX INFO: renamed from: s */
    public C1622F mo2699s(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C1622F) {
            return new C1622F((C1622F) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1622F((ViewGroup.MarginLayoutParams) layoutParams) : new C1622F(layoutParams);
    }

    /* JADX INFO: renamed from: s0 */
    public abstract boolean mo2700s0();

    /* JADX INFO: renamed from: t */
    public final View m4025t(int i3) {
        C0858A c0858a = this.f7350a;
        if (c0858a != null) {
            return c0858a.m2154B(i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public final int m4026u() {
        C0858A c0858a = this.f7350a;
        if (c0858a != null) {
            return c0858a.m2155C();
        }
        return 0;
    }

    /* JADX INFO: renamed from: w */
    public int mo2702w(C1627K c1627k, C1631O c1631o) {
        return -1;
    }

    /* JADX INFO: renamed from: y */
    public final int m4027y() {
        RecyclerView recyclerView = this.f7351b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    /* JADX INFO: renamed from: z */
    public final int m4028z() {
        RecyclerView recyclerView = this.f7351b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    /* JADX INFO: renamed from: L */
    public void mo2808L() {
    }

    /* JADX INFO: renamed from: T */
    public void mo2675T() {
    }

    /* JADX INFO: renamed from: b0 */
    public void mo2819b0(int i3) {
    }

    /* JADX INFO: renamed from: S */
    public void mo2674S(int i3, int i4) {
    }

    /* JADX INFO: renamed from: U */
    public void mo2676U(int i3, int i4) {
    }

    /* JADX INFO: renamed from: V */
    public void mo2677V(int i3, int i4) {
    }

    /* JADX INFO: renamed from: W */
    public void mo2679W(int i3, int i4) {
    }

    /* JADX INFO: renamed from: h */
    public void mo2729h(int i3, C1656m c1656m) {
    }

    /* JADX INFO: renamed from: R */
    public void mo2672R(C1627K c1627k, C1631O c1631o, View view, C0090l c0090l) {
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p089d1.C1447t;
import p095f0.C1528a;
import p110j.C1774o;
import p110j.InterfaceC1755A;
import p110j.InterfaceC1771l;
import p110j.MenuC1772m;
import p113k.AbstractC1878l1;
import p113k.AbstractC1900w0;
import p113k.C1836W0;
import p113k.C1861g;
import p113k.C1870j;
import p113k.C1873k;
import p113k.C1879m;
import p113k.C1898v0;
import p113k.InterfaceC1876l;
import p113k.InterfaceC1881n;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends AbstractC1900w0 implements InterfaceC1771l, InterfaceC1755A {

    /* JADX INFO: renamed from: A */
    public C1836W0 f3872A;

    /* JADX INFO: renamed from: B */
    public boolean f3873B;

    /* JADX INFO: renamed from: C */
    public int f3874C;

    /* JADX INFO: renamed from: D */
    public final int f3875D;

    /* JADX INFO: renamed from: E */
    public final int f3876E;

    /* JADX INFO: renamed from: F */
    public InterfaceC1881n f3877F;

    /* JADX INFO: renamed from: v */
    public MenuC1772m f3878v;

    /* JADX INFO: renamed from: w */
    public Context f3879w;

    /* JADX INFO: renamed from: x */
    public int f3880x;

    /* JADX INFO: renamed from: y */
    public boolean f3881y;

    /* JADX INFO: renamed from: z */
    public C1873k f3882z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f3875D = (int) (56.0f * f);
        this.f3876E = (int) (f * 4.0f);
        this.f3879w = context;
        this.f3880x = 0;
    }

    /* JADX INFO: renamed from: i */
    public static C1879m m2333i() {
        C1879m c1879m = new C1879m(-2, -2);
        c1879m.f8222a = false;
        ((LinearLayout.LayoutParams) c1879m).gravity = 16;
        return c1879m;
    }

    /* JADX INFO: renamed from: j */
    public static C1879m m2334j(ViewGroup.LayoutParams layoutParams) {
        C1879m c1879m;
        if (layoutParams == null) {
            return m2333i();
        }
        if (layoutParams instanceof C1879m) {
            C1879m c1879m2 = (C1879m) layoutParams;
            c1879m = new C1879m(c1879m2);
            c1879m.f8222a = c1879m2.f8222a;
        } else {
            c1879m = new C1879m(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c1879m).gravity <= 0) {
            ((LinearLayout.LayoutParams) c1879m).gravity = 16;
        }
        return c1879m;
    }

    @Override // p110j.InterfaceC1755A
    /* JADX INFO: renamed from: a */
    public final void mo2316a(MenuC1772m menuC1772m) {
        this.f3878v = menuC1772m;
    }

    @Override // p110j.InterfaceC1771l
    /* JADX INFO: renamed from: b */
    public final boolean mo2317b(C1774o c1774o) {
        return this.f3878v.m4259q(c1774o, null, 0);
    }

    @Override // p113k.AbstractC1900w0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1879m;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p113k.AbstractC1900w0
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ C1898v0 generateDefaultLayoutParams() {
        return m2333i();
    }

    @Override // p113k.AbstractC1900w0
    /* JADX INFO: renamed from: f */
    public final C1898v0 generateLayoutParams(AttributeSet attributeSet) {
        return new C1879m(getContext(), attributeSet);
    }

    @Override // p113k.AbstractC1900w0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ C1898v0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m2334j(layoutParams);
    }

    @Override // p113k.AbstractC1900w0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m2333i();
    }

    @Override // p113k.AbstractC1900w0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m2334j(layoutParams);
    }

    public Menu getMenu() {
        if (this.f3878v == null) {
            Context context = getContext();
            MenuC1772m menuC1772m = new MenuC1772m(context);
            this.f3878v = menuC1772m;
            menuC1772m.f7899e = new C1447t(15, this);
            C1873k c1873k = new C1873k(context);
            this.f3882z = c1873k;
            c1873k.f8208r = true;
            c1873k.f8209s = true;
            c1873k.f8201k = new C1528a(7);
            this.f3878v.m4252b(c1873k, this.f3879w);
            C1873k c1873k2 = this.f3882z;
            c1873k2.f8204n = this;
            this.f3878v = c1873k2.f8199i;
        }
        return this.f3878v;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C1873k c1873k = this.f3882z;
        C1870j c1870j = c1873k.f8205o;
        if (c1870j != null) {
            return c1870j.getDrawable();
        }
        if (c1873k.f8207q) {
            return c1873k.f8206p;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f3880x;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2338k(int i3) {
        boolean zMo2311a = false;
        if (i3 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i3 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i3);
        if (i3 < getChildCount() && (childAt instanceof InterfaceC1876l)) {
            zMo2311a = ((InterfaceC1876l) childAt).mo2311a();
        }
        return (i3 <= 0 || !(childAt2 instanceof InterfaceC1876l)) ? zMo2311a : ((InterfaceC1876l) childAt2).mo2312b() | zMo2311a;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1873k c1873k = this.f3882z;
        if (c1873k != null) {
            c1873k.mo4216g();
            if (this.f3882z.m4393j()) {
                this.f3882z.m4392f();
                this.f3882z.m4394l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1873k c1873k = this.f3882z;
        if (c1873k != null) {
            c1873k.m4392f();
            C1861g c1861g = c1873k.f8216z;
            if (c1861g == null || !c1861g.m4273b()) {
                return;
            }
            c1861g.f7971i.dismiss();
        }
    }

    @Override // p113k.AbstractC1900w0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int width;
        int paddingLeft;
        if (!this.f3873B) {
            super.onLayout(z3, i3, i4, i5, i6);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i6 - i4) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i5 - i3;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean z4 = AbstractC1878l1.f8219a;
        boolean z5 = getLayoutDirection() == 1;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C1879m c1879m = (C1879m) childAt.getLayoutParams();
                if (c1879m.f8222a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m2338k(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z5) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c1879m).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c1879m).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c1879m).leftMargin) + ((LinearLayout.LayoutParams) c1879m).rightMargin;
                    m2338k(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int iMax = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (z5) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                C1879m c1879m2 = (C1879m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c1879m2.f8222a) {
                    int i17 = width2 - ((LinearLayout.LayoutParams) c1879m2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c1879m2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            C1879m c1879m3 = (C1879m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c1879m3.f8222a) {
                int i20 = paddingLeft2 + ((LinearLayout.LayoutParams) c1879m3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c1879m3).rightMargin + iMax + i20;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // p113k.AbstractC1900w0, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        int i6;
        ?? r11;
        int i7;
        int i8;
        MenuC1772m menuC1772m;
        boolean z3 = this.f3873B;
        boolean z4 = View.MeasureSpec.getMode(i3) == 1073741824;
        this.f3873B = z4;
        if (z3 != z4) {
            this.f3874C = 0;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (this.f3873B && (menuC1772m = this.f3878v) != null && size != this.f3874C) {
            this.f3874C = size;
            menuC1772m.m4258p(true);
        }
        int childCount = getChildCount();
        if (!this.f3873B || childCount <= 0) {
            for (int i9 = 0; i9 < childCount; i9++) {
                C1879m c1879m = (C1879m) getChildAt(i9).getLayoutParams();
                ((LinearLayout.LayoutParams) c1879m).rightMargin = 0;
                ((LinearLayout.LayoutParams) c1879m).leftMargin = 0;
            }
            super.onMeasure(i3, i4);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i3);
        int size3 = View.MeasureSpec.getSize(i4);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, paddingBottom, -2);
        int i10 = size2 - paddingRight;
        int i11 = this.f3875D;
        int i12 = i10 / i11;
        int i13 = i10 % i11;
        if (i12 == 0) {
            setMeasuredDimension(i10, 0);
            return;
        }
        int i14 = (i13 / i12) + i11;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i15 = 0;
        int iMax2 = 0;
        int i16 = 0;
        boolean z5 = false;
        int i17 = 0;
        long j3 = 0;
        while (true) {
            i5 = this.f3876E;
            if (i16 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i16);
            int i18 = size3;
            int i19 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i7 = i14;
            } else {
                boolean z6 = childAt instanceof ActionMenuItemView;
                i15++;
                if (z6) {
                    childAt.setPadding(i5, 0, i5, 0);
                }
                C1879m c1879m2 = (C1879m) childAt.getLayoutParams();
                c1879m2.f8227f = false;
                c1879m2.f8224c = 0;
                c1879m2.f8223b = 0;
                c1879m2.f8225d = false;
                ((LinearLayout.LayoutParams) c1879m2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c1879m2).rightMargin = 0;
                c1879m2.f8226e = z6 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i20 = c1879m2.f8222a ? 1 : i12;
                C1879m c1879m3 = (C1879m) childAt.getLayoutParams();
                int i21 = i12;
                i7 = i14;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i19, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z6 ? (ActionMenuItemView) childAt : null;
                boolean z7 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z8 = z7;
                if (i20 <= 0 || (z7 && i20 < 2)) {
                    i8 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i7 * i20, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i8 = measuredWidth / i7;
                    if (measuredWidth % i7 != 0) {
                        i8++;
                    }
                    if (z8 && i8 < 2) {
                        i8 = 2;
                    }
                }
                c1879m3.f8225d = !c1879m3.f8222a && z8;
                c1879m3.f8223b = i8;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i8 * i7, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i8);
                if (c1879m2.f8225d) {
                    i17++;
                }
                if (c1879m2.f8222a) {
                    z5 = true;
                }
                i12 = i21 - i8;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i8 == 1) {
                    j3 |= (long) (1 << i16);
                }
            }
            i16++;
            size3 = i18;
            paddingBottom = i19;
            i14 = i7;
        }
        int i22 = size3;
        int i23 = i12;
        int i24 = i14;
        boolean z9 = z5 && i15 == 2;
        int i25 = i23;
        boolean z10 = false;
        while (true) {
            if (i17 <= 0 || i25 <= 0) {
                i6 = iMax;
                break;
            }
            int i26 = Integer.MAX_VALUE;
            long j4 = 0;
            int i27 = 0;
            int i28 = 0;
            while (i28 < childCount2) {
                boolean z11 = z9;
                C1879m c1879m4 = (C1879m) getChildAt(i28).getLayoutParams();
                int i29 = iMax;
                if (c1879m4.f8225d) {
                    int i30 = c1879m4.f8223b;
                    if (i30 < i26) {
                        j4 = 1 << i28;
                        i26 = i30;
                        i27 = 1;
                    } else if (i30 == i26) {
                        j4 |= 1 << i28;
                        i27++;
                    }
                }
                i28++;
                iMax = i29;
                z9 = z11;
            }
            boolean z12 = z9;
            i6 = iMax;
            j3 |= j4;
            if (i27 > i25) {
                break;
            }
            int i31 = i26 + 1;
            int i32 = 0;
            while (i32 < childCount2) {
                View childAt2 = getChildAt(i32);
                C1879m c1879m5 = (C1879m) childAt2.getLayoutParams();
                boolean z13 = z5;
                long j5 = 1 << i32;
                if ((j4 & j5) != 0) {
                    if (z12 && c1879m5.f8226e) {
                        r11 = 1;
                        r11 = 1;
                        if (i25 == 1) {
                            childAt2.setPadding(i5 + i24, 0, i5, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c1879m5.f8223b += r11;
                    c1879m5.f8227f = r11;
                    i25--;
                } else if (c1879m5.f8223b == i31) {
                    j3 |= j5;
                }
                i32++;
                z5 = z13;
            }
            iMax = i6;
            z9 = z12;
            z10 = true;
        }
        boolean z14 = !z5 && i15 == 1;
        if (i25 > 0 && j3 != 0 && (i25 < i15 - 1 || z14 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j3);
            if (!z14) {
                if ((j3 & 1) != 0 && !((C1879m) getChildAt(0).getLayoutParams()).f8226e) {
                    fBitCount -= 0.5f;
                }
                int i33 = childCount2 - 1;
                if ((j3 & ((long) (1 << i33))) != 0 && !((C1879m) getChildAt(i33).getLayoutParams()).f8226e) {
                    fBitCount -= 0.5f;
                }
            }
            int i34 = fBitCount > 0.0f ? (int) ((i25 * i24) / fBitCount) : 0;
            boolean z15 = z10;
            for (int i35 = 0; i35 < childCount2; i35++) {
                if ((j3 & ((long) (1 << i35))) != 0) {
                    View childAt3 = getChildAt(i35);
                    C1879m c1879m6 = (C1879m) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c1879m6.f8224c = i34;
                        c1879m6.f8227f = true;
                        if (i35 == 0 && !c1879m6.f8226e) {
                            ((LinearLayout.LayoutParams) c1879m6).leftMargin = (-i34) / 2;
                        }
                        z15 = true;
                    } else if (c1879m6.f8222a) {
                        c1879m6.f8224c = i34;
                        c1879m6.f8227f = true;
                        ((LinearLayout.LayoutParams) c1879m6).rightMargin = (-i34) / 2;
                        z15 = true;
                    } else {
                        if (i35 != 0) {
                            ((LinearLayout.LayoutParams) c1879m6).leftMargin = i34 / 2;
                        }
                        if (i35 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c1879m6).rightMargin = i34 / 2;
                        }
                    }
                }
            }
            z10 = z15;
        }
        if (z10) {
            for (int i36 = 0; i36 < childCount2; i36++) {
                View childAt4 = getChildAt(i36);
                C1879m c1879m7 = (C1879m) childAt4.getLayoutParams();
                if (c1879m7.f8227f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c1879m7.f8223b * i24) + c1879m7.f8224c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i10, mode != 1073741824 ? i6 : i22);
    }

    public void setExpandedActionViewsExclusive(boolean z3) {
        this.f3882z.f8213w = z3;
    }

    public void setOnMenuItemClickListener(InterfaceC1881n interfaceC1881n) {
        this.f3877F = interfaceC1881n;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C1873k c1873k = this.f3882z;
        C1870j c1870j = c1873k.f8205o;
        if (c1870j != null) {
            c1870j.setImageDrawable(drawable);
        } else {
            c1873k.f8207q = true;
            c1873k.f8206p = drawable;
        }
    }

    public void setOverflowReserved(boolean z3) {
        this.f3881y = z3;
    }

    public void setPopupTheme(int i3) {
        if (this.f3880x != i3) {
            this.f3880x = i3;
            if (i3 == 0) {
                this.f3879w = getContext();
            } else {
                this.f3879w = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setPresenter(C1873k c1873k) {
        this.f3882z = c1873k;
        c1873k.f8204n = this;
        this.f3878v = c1873k.f8199i;
    }

    @Override // p113k.AbstractC1900w0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1879m(getContext(), attributeSet);
    }
}

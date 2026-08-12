package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import p000A.C0026a0;
import p091e.C1488s;
import p091e.LayoutInflaterFactory2C1458C;
import p110j.MenuC1772m;
import p113k.C1854d1;
import p113k.C1861g;
import p113k.C1873k;
import p113k.InterfaceC1868i0;
import p113k.InterfaceC1871j0;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: g */
    public TypedValue f3887g;

    /* JADX INFO: renamed from: h */
    public TypedValue f3888h;

    /* JADX INFO: renamed from: i */
    public TypedValue f3889i;

    /* JADX INFO: renamed from: j */
    public TypedValue f3890j;

    /* JADX INFO: renamed from: k */
    public TypedValue f3891k;

    /* JADX INFO: renamed from: l */
    public TypedValue f3892l;

    /* JADX INFO: renamed from: m */
    public final Rect f3893m;

    /* JADX INFO: renamed from: n */
    public InterfaceC1868i0 f3894n;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3893m = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f3891k == null) {
            this.f3891k = new TypedValue();
        }
        return this.f3891k;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f3892l == null) {
            this.f3892l = new TypedValue();
        }
        return this.f3892l;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f3889i == null) {
            this.f3889i = new TypedValue();
        }
        return this.f3889i;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f3890j == null) {
            this.f3890j = new TypedValue();
        }
        return this.f3890j;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f3887g == null) {
            this.f3887g = new TypedValue();
        }
        return this.f3887g;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f3888h == null) {
            this.f3888h = new TypedValue();
        }
        return this.f3888h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC1868i0 interfaceC1868i0 = this.f3894n;
        if (interfaceC1868i0 != null) {
            interfaceC1868i0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C1873k c1873k;
        super.onDetachedFromWindow();
        InterfaceC1868i0 interfaceC1868i0 = this.f3894n;
        if (interfaceC1868i0 != null) {
            LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C = ((C1488s) interfaceC1868i0).f6632h;
            InterfaceC1871j0 interfaceC1871j0 = layoutInflaterFactory2C1458C.f6494x;
            if (interfaceC1871j0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1871j0;
                actionBarOverlayLayout.m2331k();
                ActionMenuView actionMenuView = ((C1854d1) actionBarOverlayLayout.f3856k).f8135a.f3921g;
                if (actionMenuView != null && (c1873k = actionMenuView.f3882z) != null) {
                    c1873k.m4392f();
                    C1861g c1861g = c1873k.f8216z;
                    if (c1861g != null && c1861g.m4273b()) {
                        c1861g.f7971i.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C1458C.f6448C != null) {
                layoutInflaterFactory2C1458C.f6488r.getDecorView().removeCallbacks(layoutInflaterFactory2C1458C.f6449D);
                if (layoutInflaterFactory2C1458C.f6448C.isShowing()) {
                    try {
                        layoutInflaterFactory2C1458C.f6448C.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C1458C.f6448C = null;
            }
            C0026a0 c0026a0 = layoutInflaterFactory2C1458C.f6450E;
            if (c0026a0 != null) {
                c0026a0.m105b();
            }
            MenuC1772m menuC1772m = layoutInflaterFactory2C1458C.m3673z(0).f6434h;
            if (menuC1772m != null) {
                menuC1772m.m4253c(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        int iMakeMeasureSpec;
        boolean z3;
        int iMakeMeasureSpec2;
        int i5;
        int i6;
        float fraction;
        int i7;
        int i8;
        float fraction2;
        int i9;
        int i10;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z4 = true;
        boolean z5 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        Rect rect = this.f3893m;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i3;
            z3 = false;
        } else {
            TypedValue typedValue = z5 ? this.f3890j : this.f3889i;
            if (typedValue == null || (i9 = typedValue.type) == 0) {
                iMakeMeasureSpec = i3;
                z3 = false;
            } else {
                if (i9 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i9 == 6) {
                        int i11 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i11, i11);
                    } else {
                        i10 = 0;
                    }
                    if (i10 > 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i10 - (rect.left + rect.right), View.MeasureSpec.getSize(i3)), 1073741824);
                        z3 = true;
                    } else {
                        iMakeMeasureSpec = i3;
                        z3 = false;
                    }
                }
                i10 = (int) fraction3;
                if (i10 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i10 - (rect.left + rect.right), View.MeasureSpec.getSize(i3)), 1073741824);
                    z3 = true;
                } else {
                    iMakeMeasureSpec = i3;
                    z3 = false;
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i4;
        } else {
            TypedValue typedValue2 = z5 ? this.f3891k : this.f3892l;
            if (typedValue2 == null || (i7 = typedValue2.type) == 0) {
                iMakeMeasureSpec2 = i4;
            } else {
                if (i7 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i7 == 6) {
                        int i12 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i12, i12);
                    } else {
                        i8 = 0;
                    }
                    if (i8 > 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i4)), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = i4;
                    }
                }
                i8 = (int) fraction2;
                if (i8 > 0) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i4)), 1073741824);
                } else {
                    iMakeMeasureSpec2 = i4;
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z3 || mode != Integer.MIN_VALUE) {
            z4 = false;
        } else {
            TypedValue typedValue3 = z5 ? this.f3888h : this.f3887g;
            if (typedValue3 == null || (i5 = typedValue3.type) == 0) {
                z4 = false;
            } else {
                if (i5 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i5 == 6) {
                        int i13 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i13, i13);
                    } else {
                        i6 = 0;
                    }
                    if (i6 > 0) {
                        i6 -= rect.left + rect.right;
                    }
                    if (measuredWidth < i6) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                    } else {
                        z4 = false;
                    }
                }
                i6 = (int) fraction;
                if (i6 > 0) {
                    i6 -= rect.left + rect.right;
                }
                if (measuredWidth < i6) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                } else {
                    z4 = false;
                }
            }
        }
        if (z4) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(InterfaceC1868i0 interfaceC1868i0) {
        this.f3894n = interfaceC1868i0;
    }
}

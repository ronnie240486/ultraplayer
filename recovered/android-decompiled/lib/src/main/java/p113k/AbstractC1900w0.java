package p113k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.C0858A;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import p000A.AbstractC0016Q;
import p087d.AbstractC1376a;

/* JADX INFO: renamed from: k.w0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1900w0 extends ViewGroup {

    /* JADX INFO: renamed from: g */
    public boolean f8288g;

    /* JADX INFO: renamed from: h */
    public int f8289h;

    /* JADX INFO: renamed from: i */
    public int f8290i;

    /* JADX INFO: renamed from: j */
    public int f8291j;

    /* JADX INFO: renamed from: k */
    public int f8292k;

    /* JADX INFO: renamed from: l */
    public int f8293l;

    /* JADX INFO: renamed from: m */
    public float f8294m;

    /* JADX INFO: renamed from: n */
    public boolean f8295n;

    /* JADX INFO: renamed from: o */
    public int[] f8296o;

    /* JADX INFO: renamed from: p */
    public int[] f8297p;

    /* JADX INFO: renamed from: q */
    public Drawable f8298q;

    /* JADX INFO: renamed from: r */
    public int f8299r;

    /* JADX INFO: renamed from: s */
    public int f8300s;

    /* JADX INFO: renamed from: t */
    public int f8301t;

    /* JADX INFO: renamed from: u */
    public int f8302u;

    public AbstractC1900w0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f8288g = true;
        this.f8289h = -1;
        this.f8290i = 0;
        this.f8292k = 8388659;
        int[] iArr = AbstractC1376a.f6108n;
        C0858A c0858aM2148Q = C0858A.m2148Q(context, attributeSet, iArr, 0);
        AbstractC0016Q.m85g(this, context, iArr, attributeSet, (TypedArray) c0858aM2148Q.f3640i, 0);
        TypedArray typedArray = (TypedArray) c0858aM2148Q.f3640i;
        int i3 = typedArray.getInt(1, -1);
        if (i3 >= 0) {
            setOrientation(i3);
        }
        int i4 = typedArray.getInt(0, -1);
        if (i4 >= 0) {
            setGravity(i4);
        }
        boolean z3 = typedArray.getBoolean(2, true);
        if (!z3) {
            setBaselineAligned(z3);
        }
        this.f8294m = typedArray.getFloat(4, -1.0f);
        this.f8289h = typedArray.getInt(3, -1);
        this.f8295n = typedArray.getBoolean(7, false);
        setDividerDrawable(c0858aM2148Q.m2158F(5));
        this.f8301t = typedArray.getInt(8, 0);
        this.f8302u = typedArray.getDimensionPixelSize(6, 0);
        c0858aM2148Q.m2170S();
    }

    /* JADX INFO: renamed from: c */
    public final void m4415c(Canvas canvas, int i3) {
        this.f8298q.setBounds(getPaddingLeft() + this.f8302u, i3, (getWidth() - getPaddingRight()) - this.f8302u, this.f8300s + i3);
        this.f8298q.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1898v0;
    }

    /* JADX INFO: renamed from: d */
    public final void m4416d(Canvas canvas, int i3) {
        this.f8298q.setBounds(i3, getPaddingTop() + this.f8302u, this.f8299r + i3, (getHeight() - getPaddingBottom()) - this.f8302u);
        this.f8298q.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public C1898v0 generateDefaultLayoutParams() {
        int i3 = this.f8291j;
        if (i3 == 0) {
            return new C1898v0(-2, -2);
        }
        if (i3 == 1) {
            return new C1898v0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C1898v0 generateLayoutParams(AttributeSet attributeSet) {
        return new C1898v0(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C1898v0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C1898v0) {
            return new C1898v0((C1898v0) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1898v0((ViewGroup.MarginLayoutParams) layoutParams) : new C1898v0(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i3;
        if (this.f8289h < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i4 = this.f8289h;
        if (childCount <= i4) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i4);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f8289h == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f8290i;
        if (this.f8291j == 1 && (i3 = this.f8292k & 112) != 48) {
            if (i3 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f8293l) / 2;
            } else if (i3 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f8293l;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((C1898v0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f8289h;
    }

    public Drawable getDividerDrawable() {
        return this.f8298q;
    }

    public int getDividerPadding() {
        return this.f8302u;
    }

    public int getDividerWidth() {
        return this.f8299r;
    }

    public int getGravity() {
        return this.f8292k;
    }

    public int getOrientation() {
        return this.f8291j;
    }

    public int getShowDividers() {
        return this.f8301t;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f8294m;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m4417h(int i3) {
        if (i3 == 0) {
            return (this.f8301t & 1) != 0;
        }
        if (i3 == getChildCount()) {
            return (this.f8301t & 4) != 0;
        }
        if ((this.f8301t & 2) != 0) {
            for (int i4 = i3 - 1; i4 >= 0; i4--) {
                if (getChildAt(i4).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i3;
        int bottom;
        if (this.f8298q == null) {
            return;
        }
        int i4 = 0;
        if (this.f8291j == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i4 < virtualChildCount) {
                View childAt = getChildAt(i4);
                if (childAt != null && childAt.getVisibility() != 8 && m4417h(i4)) {
                    m4415c(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C1898v0) childAt.getLayoutParams())).topMargin) - this.f8300s);
                }
                i4++;
            }
            if (m4417h(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f8300s;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C1898v0) childAt2.getLayoutParams())).bottomMargin;
                }
                m4415c(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z3 = AbstractC1878l1.f8219a;
        boolean z4 = getLayoutDirection() == 1;
        while (i4 < virtualChildCount2) {
            View childAt3 = getChildAt(i4);
            if (childAt3 != null && childAt3.getVisibility() != 8 && m4417h(i4)) {
                C1898v0 c1898v0 = (C1898v0) childAt3.getLayoutParams();
                m4416d(canvas, z4 ? childAt3.getRight() + ((LinearLayout.LayoutParams) c1898v0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c1898v0).leftMargin) - this.f8299r);
            }
            i4++;
        }
        if (m4417h(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C1898v0 c1898v1 = (C1898v0) childAt4.getLayoutParams();
                if (z4) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c1898v1).leftMargin;
                    i3 = this.f8299r;
                    right = left - i3;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c1898v1).rightMargin;
                }
            } else if (z4) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i3 = this.f8299r;
                right = left - i3;
            }
            m4416d(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0158  */
    /* JADX WARN: Code duplicated, block: B:65:0x0161  */
    /* JADX WARN: Code duplicated, block: B:67:0x0165  */
    /* JADX WARN: Code duplicated, block: B:69:0x0169  */
    /* JADX WARN: Code duplicated, block: B:70:0x016d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0175  */
    /* JADX WARN: Code duplicated, block: B:74:0x0181  */
    /* JADX WARN: Code duplicated, block: B:76:0x0188  */
    /* JADX WARN: Code duplicated, block: B:77:0x018f  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a7  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int paddingLeft;
        int i7;
        int i8;
        int i9;
        int i10;
        int baseline;
        int i11;
        int i12;
        int i13;
        int measuredHeight;
        int i14;
        int paddingTop;
        int i15;
        int i16;
        int i17;
        int i18 = 8;
        if (this.f8291j == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i19 = i5 - i3;
            int paddingRight = i19 - getPaddingRight();
            int paddingRight2 = (i19 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i20 = this.f8292k;
            int i21 = i20 & 112;
            int i22 = 8388615 & i20;
            if (i21 != 16) {
                paddingTop = i21 != 80 ? getPaddingTop() : ((getPaddingTop() + i6) - i4) - this.f8293l;
            } else {
                paddingTop = getPaddingTop() + (((i6 - i4) - this.f8293l) / 2);
            }
            int i23 = 0;
            while (i23 < virtualChildCount) {
                View childAt = getChildAt(i23);
                if (childAt != null && childAt.getVisibility() != i18) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    C1898v0 c1898v0 = (C1898v0) childAt.getLayoutParams();
                    int i24 = ((LinearLayout.LayoutParams) c1898v0).gravity;
                    if (i24 < 0) {
                        i24 = i22;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i24, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i17 = ((LinearLayout.LayoutParams) c1898v0).leftMargin + paddingLeft2;
                        } else {
                            i15 = paddingRight - measuredWidth;
                            i16 = ((LinearLayout.LayoutParams) c1898v0).rightMargin;
                        }
                        if (m4417h(i23)) {
                            paddingTop += this.f8300s;
                        }
                        int i25 = paddingTop + ((LinearLayout.LayoutParams) c1898v0).topMargin;
                        childAt.layout(i17, i25, measuredWidth + i17, i25 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c1898v0).bottomMargin + i25;
                    } else {
                        i15 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((LinearLayout.LayoutParams) c1898v0).leftMargin;
                        i16 = ((LinearLayout.LayoutParams) c1898v0).rightMargin;
                    }
                    i17 = i15 - i16;
                    if (m4417h(i23)) {
                        paddingTop += this.f8300s;
                    }
                    int i26 = paddingTop + ((LinearLayout.LayoutParams) c1898v0).topMargin;
                    childAt.layout(i17, i26, measuredWidth + i17, i26 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c1898v0).bottomMargin + i26;
                }
                i23++;
                i18 = 8;
            }
            return;
        }
        boolean z4 = AbstractC1878l1.f8219a;
        boolean z5 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i27 = i6 - i4;
        int paddingBottom = i27 - getPaddingBottom();
        int paddingBottom2 = (i27 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i28 = this.f8292k;
        int i29 = 8388615 & i28;
        int i30 = i28 & 112;
        boolean z6 = this.f8288g;
        int[] iArr = this.f8296o;
        int[] iArr2 = this.f8297p;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i29, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            paddingLeft = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i5) - i3) - this.f8293l;
        } else {
            paddingLeft = getPaddingLeft() + (((i5 - i3) - this.f8293l) / 2);
        }
        if (z5) {
            i7 = virtualChildCount2 - 1;
            i8 = -1;
        } else {
            i7 = 0;
            i8 = 1;
        }
        int i31 = 0;
        while (i31 < virtualChildCount2) {
            int i32 = (i8 * i31) + i7;
            View childAt2 = getChildAt(i32);
            if (childAt2 == null) {
                i9 = i7;
            } else {
                i9 = i7;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    C1898v0 c1898v1 = (C1898v0) childAt2.getLayoutParams();
                    int i33 = paddingLeft;
                    if (z6) {
                        i10 = paddingTop2;
                        baseline = ((LinearLayout.LayoutParams) c1898v1).height != -1 ? childAt2.getBaseline() : -1;
                        i11 = ((LinearLayout.LayoutParams) c1898v1).gravity;
                        if (i11 < 0) {
                            i11 = i30;
                        }
                        i12 = i11 & 112;
                        if (i12 != 16) {
                            if (i12 != 48) {
                                i13 = i10 + ((LinearLayout.LayoutParams) c1898v1).topMargin;
                                if (baseline != -1) {
                                    i13 = (iArr[1] - baseline) + i13;
                                }
                            } else if (i12 != 80) {
                                i13 = i10;
                            } else {
                                i13 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) c1898v1).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                }
                            }
                            if (m4417h(i32)) {
                                i14 = i33 + this.f8299r;
                            } else {
                                i14 = i33;
                            }
                            int i34 = i14 + ((LinearLayout.LayoutParams) c1898v1).leftMargin;
                            childAt2.layout(i34, i13, i34 + measuredWidth2, i13 + measuredHeight3);
                            paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) c1898v1).rightMargin + i34;
                        } else {
                            i13 = ((paddingBottom2 - measuredHeight3) / 2) + i10 + ((LinearLayout.LayoutParams) c1898v1).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) c1898v1).bottomMargin;
                        }
                        i13 -= measuredHeight;
                        if (m4417h(i32)) {
                            i14 = i33 + this.f8299r;
                        } else {
                            i14 = i33;
                        }
                        int i35 = i14 + ((LinearLayout.LayoutParams) c1898v1).leftMargin;
                        childAt2.layout(i35, i13, i35 + measuredWidth2, i13 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) c1898v1).rightMargin + i35;
                    } else {
                        i10 = paddingTop2;
                    }
                    i11 = ((LinearLayout.LayoutParams) c1898v1).gravity;
                    if (i11 < 0) {
                        i11 = i30;
                    }
                    i12 = i11 & 112;
                    if (i12 != 16) {
                        if (i12 != 48) {
                            i13 = i10 + ((LinearLayout.LayoutParams) c1898v1).topMargin;
                            if (baseline != -1) {
                                i13 = (iArr[1] - baseline) + i13;
                            }
                        } else if (i12 != 80) {
                            i13 = i10;
                        } else {
                            i13 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) c1898v1).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (m4417h(i32)) {
                            i14 = i33 + this.f8299r;
                        } else {
                            i14 = i33;
                        }
                        int i36 = i14 + ((LinearLayout.LayoutParams) c1898v1).leftMargin;
                        childAt2.layout(i36, i13, i36 + measuredWidth2, i13 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) c1898v1).rightMargin + i36;
                    } else {
                        i13 = ((paddingBottom2 - measuredHeight3) / 2) + i10 + ((LinearLayout.LayoutParams) c1898v1).topMargin;
                        measuredHeight = ((LinearLayout.LayoutParams) c1898v1).bottomMargin;
                    }
                    i13 -= measuredHeight;
                    if (m4417h(i32)) {
                        i14 = i33 + this.f8299r;
                    } else {
                        i14 = i33;
                    }
                    int i37 = i14 + ((LinearLayout.LayoutParams) c1898v1).leftMargin;
                    childAt2.layout(i37, i13, i37 + measuredWidth2, i13 + measuredHeight3);
                    paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) c1898v1).rightMargin + i37;
                }
                i31++;
                i7 = i9;
                paddingTop2 = i10;
            }
            i10 = paddingTop2;
            i31++;
            i7 = i9;
            paddingTop2 = i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:228:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:231:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:233:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:235:0x0502  */
    /* JADX WARN: Code duplicated, block: B:237:0x0523  */
    /* JADX WARN: Code duplicated, block: B:243:0x0532  */
    /* JADX WARN: Code duplicated, block: B:246:0x0539 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:248:0x053c  */
    /* JADX WARN: Code duplicated, block: B:250:0x0543 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:252:0x0546  */
    /* JADX WARN: Code duplicated, block: B:366:0x0796  */
    /* JADX WARN: Code duplicated, block: B:64:0x013c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x013f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0148  */
    @Override // android.view.View
    public void onMeasure(int i3, int i4) {
        int i5;
        int i6;
        int iMax;
        int i7;
        int baseline;
        int i8;
        int i9;
        int[] iArr;
        int i10;
        int i11;
        boolean z3;
        boolean z4;
        C1898v0 c1898v0;
        View view;
        int i12;
        int[] iArr2;
        int i13;
        int i14;
        boolean z5;
        int i15;
        int measuredHeight;
        boolean z6;
        boolean z7;
        int iMax2;
        int i16;
        int baseline2;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z8;
        int i22;
        int i23;
        int i24;
        View view2;
        boolean z9;
        AbstractC1900w0 abstractC1900w0 = this;
        int i25 = -2;
        int i26 = 1073741824;
        int i27 = 8;
        int iMax3 = 0;
        if (abstractC1900w0.f8291j == 1) {
            abstractC1900w0.f8293l = 0;
            int virtualChildCount = abstractC1900w0.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i3);
            int mode2 = View.MeasureSpec.getMode(i4);
            int i28 = abstractC1900w0.f8289h;
            boolean z10 = abstractC1900w0.f8295n;
            int i29 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            int iMax6 = 0;
            float f = 0.0f;
            boolean z11 = false;
            int i30 = 0;
            boolean z12 = false;
            boolean z13 = true;
            while (i29 < virtualChildCount) {
                int i31 = mode;
                View childAt = abstractC1900w0.getChildAt(i29);
                if (childAt == null) {
                    abstractC1900w0.f8293l = abstractC1900w0.f8293l;
                } else {
                    if (childAt.getVisibility() != i27) {
                        if (abstractC1900w0.m4417h(i29)) {
                            abstractC1900w0.f8293l += abstractC1900w0.f8300s;
                        }
                        C1898v0 c1898v1 = (C1898v0) childAt.getLayoutParams();
                        float f3 = ((LinearLayout.LayoutParams) c1898v1).weight;
                        f += f3;
                        if (mode2 == i26 && ((LinearLayout.LayoutParams) c1898v1).height == 0 && f3 > 0.0f) {
                            int i32 = abstractC1900w0.f8293l;
                            abstractC1900w0.f8293l = Math.max(i32, ((LinearLayout.LayoutParams) c1898v1).topMargin + i32 + ((LinearLayout.LayoutParams) c1898v1).bottomMargin);
                            view2 = childAt;
                            i21 = mode2;
                            i22 = i28;
                            z8 = z10;
                            i23 = i29;
                            i24 = i31;
                            z11 = true;
                        } else {
                            if (((LinearLayout.LayoutParams) c1898v1).height != 0 || f3 <= 0.0f) {
                                i20 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) c1898v1).height = i25;
                                i20 = 0;
                            }
                            i21 = mode2;
                            z8 = z10;
                            i22 = i28;
                            i23 = i29;
                            i24 = i31;
                            abstractC1900w0.measureChildWithMargins(childAt, i3, 0, i4, f == 0.0f ? abstractC1900w0.f8293l : 0);
                            if (i20 != Integer.MIN_VALUE) {
                                ((LinearLayout.LayoutParams) c1898v1).height = i20;
                            }
                            int measuredHeight2 = childAt.getMeasuredHeight();
                            int i33 = abstractC1900w0.f8293l;
                            view2 = childAt;
                            abstractC1900w0.f8293l = Math.max(i33, i33 + measuredHeight2 + ((LinearLayout.LayoutParams) c1898v1).topMargin + ((LinearLayout.LayoutParams) c1898v1).bottomMargin);
                            if (z8) {
                                iMax6 = Math.max(measuredHeight2, iMax6);
                            }
                        }
                        if (i22 >= 0 && i22 == i23 + 1) {
                            abstractC1900w0.f8290i = abstractC1900w0.f8293l;
                        }
                        if (i23 < i22 && ((LinearLayout.LayoutParams) c1898v1).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (i24 == 1073741824 || ((LinearLayout.LayoutParams) c1898v1).width != -1) {
                            z9 = false;
                        } else {
                            z9 = true;
                            z12 = true;
                        }
                        int i34 = ((LinearLayout.LayoutParams) c1898v1).leftMargin + ((LinearLayout.LayoutParams) c1898v1).rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i34;
                        int iMax7 = Math.max(iMax3, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z14 = z9;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i30, measuredState);
                        if (z13) {
                            i30 = iCombineMeasuredStates;
                            boolean z15 = ((LinearLayout.LayoutParams) c1898v1).width == -1;
                            if (((LinearLayout.LayoutParams) c1898v1).weight > 0.0f) {
                                if (!z14) {
                                    i34 = measuredWidth;
                                }
                                iMax5 = Math.max(iMax5, i34);
                            } else {
                                if (!z14) {
                                    i34 = measuredWidth;
                                }
                                iMax4 = Math.max(iMax4, i34);
                            }
                            z13 = z15;
                            iMax3 = iMax7;
                        } else {
                            i30 = iCombineMeasuredStates;
                        }
                        if (((LinearLayout.LayoutParams) c1898v1).weight > 0.0f) {
                            if (!z14) {
                                i34 = measuredWidth;
                            }
                            iMax5 = Math.max(iMax5, i34);
                        } else {
                            if (!z14) {
                                i34 = measuredWidth;
                            }
                            iMax4 = Math.max(iMax4, i34);
                        }
                        z13 = z15;
                        iMax3 = iMax7;
                    }
                    i29 = i23 + 1;
                    i28 = i22;
                    mode = i24;
                    z10 = z8;
                    mode2 = i21;
                    i25 = -2;
                    i26 = 1073741824;
                    i27 = 8;
                }
                i21 = mode2;
                i22 = i28;
                z8 = z10;
                i23 = i29;
                i24 = i31;
                i29 = i23 + 1;
                i28 = i22;
                mode = i24;
                z10 = z8;
                mode2 = i21;
                i25 = -2;
                i26 = 1073741824;
                i27 = 8;
            }
            int i35 = mode;
            int i36 = mode2;
            boolean z16 = z10;
            int i37 = i30;
            int i38 = i4;
            if (abstractC1900w0.f8293l > 0 && abstractC1900w0.m4417h(virtualChildCount)) {
                abstractC1900w0.f8293l += abstractC1900w0.f8300s;
            }
            if (z16 && (i36 == Integer.MIN_VALUE || i36 == 0)) {
                abstractC1900w0.f8293l = 0;
                for (int i39 = 0; i39 < virtualChildCount; i39++) {
                    View childAt2 = abstractC1900w0.getChildAt(i39);
                    if (childAt2 == null) {
                        abstractC1900w0.f8293l = abstractC1900w0.f8293l;
                    } else if (childAt2.getVisibility() != 8) {
                        C1898v0 c1898v2 = (C1898v0) childAt2.getLayoutParams();
                        int i40 = abstractC1900w0.f8293l;
                        abstractC1900w0.f8293l = Math.max(i40, i40 + iMax6 + ((LinearLayout.LayoutParams) c1898v2).topMargin + ((LinearLayout.LayoutParams) c1898v2).bottomMargin);
                    }
                }
            }
            int paddingBottom = abstractC1900w0.getPaddingBottom() + abstractC1900w0.getPaddingTop() + abstractC1900w0.f8293l;
            abstractC1900w0.f8293l = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, abstractC1900w0.getSuggestedMinimumHeight()), i38, 0);
            int i41 = (iResolveSizeAndState & 16777215) - abstractC1900w0.f8293l;
            if (z11 || (i41 != 0 && f > 0.0f)) {
                float f4 = abstractC1900w0.f8294m;
                if (f4 > 0.0f) {
                    f = f4;
                }
                abstractC1900w0.f8293l = 0;
                int iCombineMeasuredStates2 = i37;
                int i42 = 0;
                while (i42 < virtualChildCount) {
                    View childAt3 = abstractC1900w0.getChildAt(i42);
                    if (childAt3.getVisibility() == 8) {
                        i42 = i42;
                    } else {
                        C1898v0 c1898v3 = (C1898v0) childAt3.getLayoutParams();
                        float f5 = ((LinearLayout.LayoutParams) c1898v3).weight;
                        if (f5 > 0.0f) {
                            int i43 = (int) ((i41 * f5) / f);
                            f -= f5;
                            i41 -= i43;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, abstractC1900w0.getPaddingRight() + abstractC1900w0.getPaddingLeft() + ((LinearLayout.LayoutParams) c1898v3).leftMargin + ((LinearLayout.LayoutParams) c1898v3).rightMargin, ((LinearLayout.LayoutParams) c1898v3).width);
                            if (((LinearLayout.LayoutParams) c1898v3).height == 0) {
                                i19 = 1073741824;
                                if (i36 == 1073741824) {
                                    if (i43 <= 0) {
                                        i43 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i43, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                            } else {
                                i19 = 1073741824;
                            }
                            int measuredHeight3 = childAt3.getMeasuredHeight() + i43;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i19));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                        }
                        int i44 = ((LinearLayout.LayoutParams) c1898v3).leftMargin + ((LinearLayout.LayoutParams) c1898v3).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i44;
                        iMax3 = Math.max(iMax3, measuredWidth2);
                        if (i35 != 1073741824) {
                            i18 = -1;
                            if (((LinearLayout.LayoutParams) c1898v3).width == -1) {
                                measuredWidth2 = i44;
                            }
                        } else {
                            i18 = -1;
                        }
                        iMax4 = Math.max(iMax4, measuredWidth2);
                        boolean z17 = z13 && ((LinearLayout.LayoutParams) c1898v3).width == i18;
                        int i45 = abstractC1900w0.f8293l;
                        abstractC1900w0.f8293l = Math.max(i45, childAt3.getMeasuredHeight() + i45 + ((LinearLayout.LayoutParams) c1898v3).topMargin + ((LinearLayout.LayoutParams) c1898v3).bottomMargin);
                        z13 = z17;
                    }
                    i42++;
                }
                abstractC1900w0.f8293l = abstractC1900w0.getPaddingBottom() + abstractC1900w0.getPaddingTop() + abstractC1900w0.f8293l;
                i37 = iCombineMeasuredStates2;
            } else {
                iMax4 = Math.max(iMax4, iMax5);
                if (z16 && i36 != 1073741824) {
                    for (int i46 = 0; i46 < virtualChildCount; i46++) {
                        View childAt4 = abstractC1900w0.getChildAt(i46);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C1898v0) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        }
                    }
                }
            }
            if (z13 || i35 == 1073741824) {
                iMax4 = iMax3;
            }
            abstractC1900w0.setMeasuredDimension(View.resolveSizeAndState(Math.max(abstractC1900w0.getPaddingRight() + abstractC1900w0.getPaddingLeft() + iMax4, abstractC1900w0.getSuggestedMinimumWidth()), i3, i37), iResolveSizeAndState);
            if (z12) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(abstractC1900w0.getMeasuredWidth(), 1073741824);
                int i47 = 0;
                while (i47 < virtualChildCount) {
                    View childAt5 = abstractC1900w0.getChildAt(i47);
                    if (childAt5.getVisibility() != 8) {
                        C1898v0 c1898v4 = (C1898v0) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) c1898v4).width == -1) {
                            int i48 = ((LinearLayout.LayoutParams) c1898v4).height;
                            ((LinearLayout.LayoutParams) c1898v4).height = childAt5.getMeasuredHeight();
                            abstractC1900w0.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i38, 0);
                            ((LinearLayout.LayoutParams) c1898v4).height = i48;
                        }
                    }
                    i47++;
                    i38 = i4;
                }
                return;
            }
            return;
        }
        int i49 = i3;
        abstractC1900w0.f8293l = 0;
        int virtualChildCount2 = abstractC1900w0.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i49);
        int mode4 = View.MeasureSpec.getMode(i4);
        if (abstractC1900w0.f8296o == null || abstractC1900w0.f8297p == null) {
            abstractC1900w0.f8296o = new int[4];
            abstractC1900w0.f8297p = new int[4];
        }
        int[] iArr3 = abstractC1900w0.f8296o;
        int[] iArr4 = abstractC1900w0.f8297p;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z18 = abstractC1900w0.f8288g;
        boolean z19 = abstractC1900w0.f8295n;
        boolean z20 = mode3 == 1073741824;
        int i50 = 0;
        int i51 = 0;
        int i52 = 0;
        int iMax8 = 0;
        int iMax9 = 0;
        int iCombineMeasuredStates3 = 0;
        boolean z21 = false;
        boolean z22 = false;
        float f6 = 0.0f;
        boolean z23 = true;
        while (i50 < virtualChildCount2) {
            View childAt6 = abstractC1900w0.getChildAt(i50);
            if (childAt6 == null) {
                abstractC1900w0.f8293l = abstractC1900w0.f8293l;
                i11 = i50;
                i16 = i52;
                iArr2 = iArr3;
                iArr = iArr4;
                z3 = z18;
                z4 = z19;
            } else {
                int i53 = i51;
                if (childAt6.getVisibility() == 8) {
                    i49 = i3;
                    i11 = i50;
                    i16 = i52;
                    iArr = iArr4;
                    z3 = z18;
                    z4 = z19;
                    i51 = i53;
                    iArr2 = iArr3;
                } else {
                    if (abstractC1900w0.m4417h(i50)) {
                        abstractC1900w0.f8293l += abstractC1900w0.f8299r;
                    }
                    C1898v0 c1898v5 = (C1898v0) childAt6.getLayoutParams();
                    float f7 = ((LinearLayout.LayoutParams) c1898v5).weight;
                    f6 += f7;
                    int i54 = i50;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) c1898v5).width == 0 && f7 > 0.0f) {
                        if (z20) {
                            abstractC1900w0.f8293l = ((LinearLayout.LayoutParams) c1898v5).leftMargin + ((LinearLayout.LayoutParams) c1898v5).rightMargin + abstractC1900w0.f8293l;
                        } else {
                            int i55 = abstractC1900w0.f8293l;
                            abstractC1900w0.f8293l = Math.max(i55, ((LinearLayout.LayoutParams) c1898v5).leftMargin + i55 + ((LinearLayout.LayoutParams) c1898v5).rightMargin);
                        }
                        if (z18) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            view = childAt6;
                            z3 = z18;
                            z4 = z19;
                            i12 = i53;
                            i11 = i54;
                            c1898v0 = c1898v5;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i49 = i3;
                            i13 = i52;
                            i10 = iMax8;
                        } else {
                            view = childAt6;
                            z3 = z18;
                            z4 = z19;
                            i12 = i53;
                            i11 = i54;
                            i14 = 1073741824;
                            z22 = true;
                            c1898v0 = c1898v5;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i49 = i3;
                            i13 = i52;
                            i10 = iMax8;
                        }
                        if (mode4 == i14 && ((LinearLayout.LayoutParams) c1898v0).height == -1) {
                            z5 = true;
                            z21 = true;
                        } else {
                            z5 = false;
                        }
                        i15 = ((LinearLayout.LayoutParams) c1898v0).topMargin + ((LinearLayout.LayoutParams) c1898v0).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i15;
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                        if (z3) {
                            baseline2 = view.getBaseline();
                            z6 = z5;
                            if (baseline2 != -1) {
                                i17 = ((LinearLayout.LayoutParams) c1898v0).gravity;
                                if (i17 < 0) {
                                    i17 = abstractC1900w0.f8292k;
                                }
                                int i56 = (((i17 & 112) >> 4) & (-2)) >> 1;
                                iArr2[i56] = Math.max(iArr2[i56], baseline2);
                                iArr[i56] = Math.max(iArr[i56], measuredHeight - baseline2);
                            }
                        } else {
                            z6 = z5;
                        }
                        int iMax10 = Math.max(i12, measuredHeight);
                        if (z23 || ((LinearLayout.LayoutParams) c1898v0).height != -1) {
                            z7 = false;
                        } else {
                            z7 = true;
                        }
                        if (((LinearLayout.LayoutParams) c1898v0).weight > 0.0f) {
                            if (!z6) {
                                i15 = measuredHeight;
                            }
                            iMax8 = Math.max(i10, i15);
                            iMax2 = i13;
                        } else {
                            if (!z6) {
                                i15 = measuredHeight;
                            }
                            iMax2 = Math.max(i13, i15);
                            iMax8 = i10;
                        }
                        int i57 = iMax2;
                        i51 = iMax10;
                        i16 = i57;
                        z23 = z7;
                    } else {
                        if (((LinearLayout.LayoutParams) c1898v5).width != 0 || f7 <= 0.0f) {
                            i9 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) c1898v5).width = -2;
                            i9 = 0;
                        }
                        iArr = iArr4;
                        i10 = iMax8;
                        i11 = i54;
                        z3 = z18;
                        z4 = z19;
                        int i58 = i9;
                        c1898v0 = c1898v5;
                        view = childAt6;
                        i12 = i53;
                        i49 = i3;
                        iArr2 = iArr3;
                        i13 = i52;
                        abstractC1900w0.measureChildWithMargins(view, i49, f6 == 0.0f ? abstractC1900w0.f8293l : 0, i4, 0);
                        if (i58 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) c1898v0).width = i58;
                        }
                        int measuredWidth3 = view.getMeasuredWidth();
                        if (z20) {
                            abstractC1900w0.f8293l = ((LinearLayout.LayoutParams) c1898v0).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) c1898v0).rightMargin + abstractC1900w0.f8293l;
                        } else {
                            int i59 = abstractC1900w0.f8293l;
                            abstractC1900w0.f8293l = Math.max(i59, i59 + measuredWidth3 + ((LinearLayout.LayoutParams) c1898v0).leftMargin + ((LinearLayout.LayoutParams) c1898v0).rightMargin);
                        }
                        if (z4) {
                            iMax9 = Math.max(measuredWidth3, iMax9);
                        }
                    }
                    i14 = 1073741824;
                    if (mode4 == i14) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    i15 = ((LinearLayout.LayoutParams) c1898v0).topMargin + ((LinearLayout.LayoutParams) c1898v0).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i15;
                    iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                    if (z3) {
                        baseline2 = view.getBaseline();
                        z6 = z5;
                        if (baseline2 != -1) {
                            i17 = ((LinearLayout.LayoutParams) c1898v0).gravity;
                            if (i17 < 0) {
                                i17 = abstractC1900w0.f8292k;
                            }
                            int i510 = (((i17 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i510] = Math.max(iArr2[i510], baseline2);
                            iArr[i510] = Math.max(iArr[i510], measuredHeight - baseline2);
                        }
                    } else {
                        z6 = z5;
                    }
                    int iMax11 = Math.max(i12, measuredHeight);
                    if (z23) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    if (((LinearLayout.LayoutParams) c1898v0).weight > 0.0f) {
                        if (!z6) {
                            i15 = measuredHeight;
                        }
                        iMax8 = Math.max(i10, i15);
                        iMax2 = i13;
                    } else {
                        if (!z6) {
                            i15 = measuredHeight;
                        }
                        iMax2 = Math.max(i13, i15);
                        iMax8 = i10;
                    }
                    int i511 = iMax2;
                    i51 = iMax11;
                    i16 = i511;
                    z23 = z7;
                }
            }
            i52 = i16;
            i50 = i11 + 1;
            iArr3 = iArr2;
            iArr4 = iArr;
            z18 = z3;
            z19 = z4;
        }
        int i60 = i51;
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        boolean z24 = z18;
        boolean z25 = z19;
        int i61 = i52;
        int i62 = iMax8;
        if (abstractC1900w0.f8293l > 0 && abstractC1900w0.m4417h(virtualChildCount2)) {
            abstractC1900w0.f8293l += abstractC1900w0.f8299r;
        }
        int i63 = iArr5[1];
        int iMax12 = (i63 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? i60 : Math.max(i60, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i63, iArr5[2]))));
        if (z25 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            abstractC1900w0.f8293l = 0;
            for (int i64 = 0; i64 < virtualChildCount2; i64++) {
                View childAt7 = abstractC1900w0.getChildAt(i64);
                if (childAt7 == null) {
                    abstractC1900w0.f8293l = abstractC1900w0.f8293l;
                } else if (childAt7.getVisibility() != 8) {
                    C1898v0 c1898v6 = (C1898v0) childAt7.getLayoutParams();
                    if (z20) {
                        abstractC1900w0.f8293l = ((LinearLayout.LayoutParams) c1898v6).leftMargin + iMax9 + ((LinearLayout.LayoutParams) c1898v6).rightMargin + abstractC1900w0.f8293l;
                    } else {
                        int i65 = abstractC1900w0.f8293l;
                        abstractC1900w0.f8293l = Math.max(i65, i65 + iMax9 + ((LinearLayout.LayoutParams) c1898v6).leftMargin + ((LinearLayout.LayoutParams) c1898v6).rightMargin);
                    }
                }
            }
        }
        int paddingRight = abstractC1900w0.getPaddingRight() + abstractC1900w0.getPaddingLeft() + abstractC1900w0.f8293l;
        abstractC1900w0.f8293l = paddingRight;
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, abstractC1900w0.getSuggestedMinimumWidth()), i49, 0);
        int i66 = (iResolveSizeAndState2 & 16777215) - abstractC1900w0.f8293l;
        if (z22 || (i66 != 0 && f6 > 0.0f)) {
            float f8 = abstractC1900w0.f8294m;
            if (f8 > 0.0f) {
                f6 = f8;
            }
            iArr5[3] = -1;
            iArr5[2] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[2] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            abstractC1900w0.f8293l = 0;
            iMax12 = -1;
            int i67 = 0;
            while (i67 < virtualChildCount2) {
                View childAt8 = abstractC1900w0.getChildAt(i67);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    iResolveSizeAndState2 = iResolveSizeAndState2;
                } else {
                    C1898v0 c1898v7 = (C1898v0) childAt8.getLayoutParams();
                    float f9 = ((LinearLayout.LayoutParams) c1898v7).weight;
                    if (f9 > 0.0f) {
                        int i68 = (int) ((i66 * f9) / f6);
                        f6 -= f9;
                        i66 -= i68;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, abstractC1900w0.getPaddingBottom() + abstractC1900w0.getPaddingTop() + ((LinearLayout.LayoutParams) c1898v7).topMargin + ((LinearLayout.LayoutParams) c1898v7).bottomMargin, ((LinearLayout.LayoutParams) c1898v7).height);
                        if (((LinearLayout.LayoutParams) c1898v7).width == 0) {
                            i8 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i68 <= 0) {
                                    i68 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i68, 1073741824), childMeasureSpec2);
                            }
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                        } else {
                            i8 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i68;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i8), childMeasureSpec2);
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                    }
                    if (z20) {
                        abstractC1900w0.f8293l = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) c1898v7).leftMargin + ((LinearLayout.LayoutParams) c1898v7).rightMargin + abstractC1900w0.f8293l;
                    } else {
                        int i69 = abstractC1900w0.f8293l;
                        abstractC1900w0.f8293l = Math.max(i69, childAt8.getMeasuredWidth() + i69 + ((LinearLayout.LayoutParams) c1898v7).leftMargin + ((LinearLayout.LayoutParams) c1898v7).rightMargin);
                    }
                    boolean z26 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) c1898v7).height == -1;
                    int i70 = ((LinearLayout.LayoutParams) c1898v7).topMargin + ((LinearLayout.LayoutParams) c1898v7).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i70;
                    iMax12 = Math.max(iMax12, measuredHeight4);
                    if (!z26) {
                        i70 = measuredHeight4;
                    }
                    int iMax13 = Math.max(i61, i70);
                    if (z23) {
                        i7 = -1;
                        boolean z27 = ((LinearLayout.LayoutParams) c1898v7).height == -1;
                        if (!z24 && (baseline = childAt8.getBaseline()) != i7) {
                            int i71 = ((LinearLayout.LayoutParams) c1898v7).gravity;
                            if (i71 < 0) {
                                i71 = abstractC1900w0.f8292k;
                            }
                            int i72 = (((i71 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i72] = Math.max(iArr5[i72], baseline);
                            iArr6[i72] = Math.max(iArr6[i72], measuredHeight4 - baseline);
                        }
                        z23 = z27;
                        i61 = iMax13;
                    } else {
                        i7 = -1;
                    }
                    if (!z24) {
                    }
                    z23 = z27;
                    i61 = iMax13;
                }
                i67++;
                iResolveSizeAndState2 = iResolveSizeAndState2;
            }
            i5 = iResolveSizeAndState2;
            i6 = -16777216;
            abstractC1900w0.f8293l = abstractC1900w0.getPaddingRight() + abstractC1900w0.getPaddingLeft() + abstractC1900w0.f8293l;
            int i73 = iArr5[1];
            if (i73 != -1 || iArr5[0] != -1 || iArr5[2] != -1 || iArr5[3] != -1) {
                iMax12 = Math.max(iMax12, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i73, iArr5[2]))));
            }
            iMax = i61;
        } else {
            iMax = Math.max(i61, i62);
            if (z25 && mode3 != 1073741824) {
                for (int i74 = 0; i74 < virtualChildCount2; i74++) {
                    View childAt9 = abstractC1900w0.getChildAt(i74);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C1898v0) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax9, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i5 = iResolveSizeAndState2;
            i6 = -16777216;
        }
        if (!z23 && mode4 != 1073741824) {
            iMax12 = iMax;
        }
        abstractC1900w0.setMeasuredDimension(i5 | (iCombineMeasuredStates3 & i6), View.resolveSizeAndState(Math.max(abstractC1900w0.getPaddingBottom() + abstractC1900w0.getPaddingTop() + iMax12, abstractC1900w0.getSuggestedMinimumHeight()), i4, iCombineMeasuredStates3 << 16));
        if (z21) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(abstractC1900w0.getMeasuredHeight(), 1073741824);
            int i75 = 0;
            while (i75 < virtualChildCount2) {
                View childAt10 = abstractC1900w0.getChildAt(i75);
                if (childAt10.getVisibility() != 8) {
                    C1898v0 c1898v8 = (C1898v0) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c1898v8).height == -1) {
                        int i76 = ((LinearLayout.LayoutParams) c1898v8).width;
                        ((LinearLayout.LayoutParams) c1898v8).width = childAt10.getMeasuredWidth();
                        abstractC1900w0.measureChildWithMargins(childAt10, i49, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) c1898v8).width = i76;
                    }
                }
                i75++;
                abstractC1900w0 = this;
                i49 = i3;
            }
        }
    }

    public void setBaselineAligned(boolean z3) {
        this.f8288g = z3;
    }

    public void setBaselineAlignedChildIndex(int i3) {
        if (i3 >= 0 && i3 < getChildCount()) {
            this.f8289h = i3;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f8298q) {
            return;
        }
        this.f8298q = drawable;
        if (drawable != null) {
            this.f8299r = drawable.getIntrinsicWidth();
            this.f8300s = drawable.getIntrinsicHeight();
        } else {
            this.f8299r = 0;
            this.f8300s = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i3) {
        this.f8302u = i3;
    }

    public void setGravity(int i3) {
        if (this.f8292k != i3) {
            if ((8388615 & i3) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            this.f8292k = i3;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i3) {
        int i4 = i3 & 8388615;
        int i5 = this.f8292k;
        if ((8388615 & i5) != i4) {
            this.f8292k = i4 | ((-8388616) & i5);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z3) {
        this.f8295n = z3;
    }

    public void setOrientation(int i3) {
        if (this.f8291j != i3) {
            this.f8291j = i3;
            requestLayout();
        }
    }

    public void setShowDividers(int i3) {
        if (i3 != this.f8301t) {
            requestLayout();
        }
        this.f8301t = i3;
    }

    public void setVerticalGravity(int i3) {
        int i4 = i3 & 112;
        int i5 = this.f8292k;
        if ((i5 & 112) != i4) {
            this.f8292k = i4 | (i5 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f8294m = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

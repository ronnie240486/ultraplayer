package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import p000A.AbstractC0005F;
import p000A.AbstractC0016Q;
import p000A.AbstractC0019U;
import p000A.AbstractC0020V;
import p000A.AbstractC0063w;
import p000A.AbstractC0064x;
import p000A.C0031d;
import p000A.C0043j;
import p000A.C0053o;
import p000A.C0058r;
import p000A.C0065y;
import p000A.InterfaceC0057q;
import p014F.AbstractC0157f;
import p014F.AbstractC0161j;
import p014F.C0160i;
import p014F.C0163l;
import p014F.InterfaceC0162k;
import p060U1.AbstractC0610a;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0057q {

    /* JADX INFO: renamed from: H */
    public static final float f3962H = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: I */
    public static final C0160i f3963I = new C0160i();

    /* JADX INFO: renamed from: J */
    public static final int[] f3964J = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A */
    public int f3965A;

    /* JADX INFO: renamed from: B */
    public int f3966B;

    /* JADX INFO: renamed from: C */
    public C0163l f3967C;

    /* JADX INFO: renamed from: D */
    public final C0058r f3968D;

    /* JADX INFO: renamed from: E */
    public final C0053o f3969E;

    /* JADX INFO: renamed from: F */
    public float f3970F;

    /* JADX INFO: renamed from: G */
    public final C0043j f3971G;

    /* JADX INFO: renamed from: g */
    public final float f3972g;

    /* JADX INFO: renamed from: h */
    public long f3973h;

    /* JADX INFO: renamed from: i */
    public final Rect f3974i;

    /* JADX INFO: renamed from: j */
    public final OverScroller f3975j;

    /* JADX INFO: renamed from: k */
    public final EdgeEffect f3976k;

    /* JADX INFO: renamed from: l */
    public final EdgeEffect f3977l;

    /* JADX INFO: renamed from: m */
    public int f3978m;

    /* JADX INFO: renamed from: n */
    public boolean f3979n;

    /* JADX INFO: renamed from: o */
    public boolean f3980o;

    /* JADX INFO: renamed from: p */
    public View f3981p;

    /* JADX INFO: renamed from: q */
    public boolean f3982q;

    /* JADX INFO: renamed from: r */
    public VelocityTracker f3983r;

    /* JADX INFO: renamed from: s */
    public boolean f3984s;

    /* JADX INFO: renamed from: t */
    public boolean f3985t;

    /* JADX INFO: renamed from: u */
    public final int f3986u;

    /* JADX INFO: renamed from: v */
    public final int f3987v;

    /* JADX INFO: renamed from: w */
    public final int f3988w;

    /* JADX INFO: renamed from: x */
    public int f3989x;

    /* JADX INFO: renamed from: y */
    public final int[] f3990y;

    /* JADX INFO: renamed from: z */
    public final int[] f3991z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.zuxoplayer.app.R.attr.nestedScrollViewStyle);
        this.f3974i = new Rect();
        this.f3979n = true;
        this.f3980o = false;
        this.f3981p = null;
        this.f3982q = false;
        this.f3985t = true;
        this.f3989x = -1;
        this.f3990y = new int[2];
        this.f3991z = new int[2];
        this.f3971G = new C0043j(getContext(), new C0031d(6, this));
        int i3 = Build.VERSION.SDK_INT;
        this.f3976k = i3 >= 31 ? AbstractC0157f.m615a(context, attributeSet) : new EdgeEffect(context);
        this.f3977l = i3 >= 31 ? AbstractC0157f.m615a(context, attributeSet) : new EdgeEffect(context);
        this.f3972g = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f3975j = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3986u = viewConfiguration.getScaledTouchSlop();
        this.f3987v = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3988w = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3964J, com.zuxoplayer.app.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f3968D = new C0058r();
        this.f3969E = new C0053o(this);
        setNestedScrollingEnabled(true);
        AbstractC0016Q.m86h(this, f3963I);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m2366l(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m2366l((View) parent, nestedScrollView);
    }

    @Override // p000A.InterfaceC0055p
    /* JADX INFO: renamed from: a */
    public final void mo310a(View view, View view2, int i3, int i4) {
        C0058r c0058r = this.f3968D;
        if (i4 == 1) {
            c0058r.f83b = i3;
        } else {
            c0058r.f82a = i3;
        }
        m2381v(2, i4);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // p000A.InterfaceC0055p
    /* JADX INFO: renamed from: b */
    public final void mo311b(ViewGroup viewGroup, int i3, int i4, int i5, int i6, int i7) {
        m2373n(i6, i7, null);
    }

    @Override // p000A.InterfaceC0055p
    /* JADX INFO: renamed from: c */
    public final void mo312c(View view, int i3) {
        C0058r c0058r = this.f3968D;
        if (i3 == 1) {
            c0058r.f83b = 0;
        } else {
            c0058r.f82a = 0;
        }
        m2383x(i3);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0087  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00be  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ed  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i3;
        int scrollRange;
        int overScrollMode;
        if (this.f3975j.isFinished()) {
            return;
        }
        this.f3975j.computeScrollOffset();
        int currY = this.f3975j.getCurrY();
        int i4 = currY - this.f3966B;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f3977l;
        EdgeEffect edgeEffect2 = this.f3976k;
        if (i4 <= 0 || AbstractC0610a.m1511m(edgeEffect2) == 0.0f) {
            if (i4 < 0 && AbstractC0610a.m1511m(edgeEffect) != 0.0f) {
                float f = height;
                iRound = Math.round(AbstractC0610a.m1491C(edgeEffect, (i4 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (iRound != i4) {
                    edgeEffect.finish();
                }
            }
            int i5 = i4;
            this.f3966B = currY;
            iArr = this.f3991z;
            iArr[1] = 0;
            this.f3969E.m304c(0, i5, 1, iArr, null);
            i3 = i5 - iArr[1];
            scrollRange = getScrollRange();
            if (i3 != 0) {
                int scrollY = getScrollY();
                m2375p(i3, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i6 = i3 - scrollY2;
                iArr[1] = 0;
                this.f3969E.m305d(0, scrollY2, 0, i6, this.f3990y, 1, iArr);
                i3 = i6 - iArr[1];
            }
            if (i3 != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i3 < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f3975j.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f3975j.getCurrVelocity());
                    }
                }
                this.f3975j.abortAnimation();
                m2383x(1);
            }
            if (this.f3975j.isFinished()) {
                m2383x(1);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = Math.round(AbstractC0610a.m1491C(edgeEffect2, ((-i4) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i4) {
            edgeEffect2.finish();
        }
        i4 -= iRound;
        int i7 = i4;
        this.f3966B = currY;
        iArr = this.f3991z;
        iArr[1] = 0;
        this.f3969E.m304c(0, i7, 1, iArr, null);
        i3 = i7 - iArr[1];
        scrollRange = getScrollRange();
        if (i3 != 0) {
            int scrollY3 = getScrollY();
            m2375p(i3, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i8 = i3 - scrollY4;
            iArr[1] = 0;
            this.f3969E.m305d(0, scrollY4, 0, i8, this.f3990y, 1, iArr);
            i3 = i8 - iArr[1];
        }
        if (i3 != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i3 < 0) {
                    if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f3975j.getCurrVelocity());
                    }
                } else if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) this.f3975j.getCurrVelocity());
                }
            } else if (i3 < 0) {
                if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) this.f3975j.getCurrVelocity());
                }
            } else if (edgeEffect.isFinished()) {
                edgeEffect.onAbsorb((int) this.f3975j.getCurrVelocity());
            }
            this.f3975j.abortAnimation();
            m2383x(1);
        }
        if (this.f3975j.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            m2383x(1);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    @Override // p000A.InterfaceC0057q
    /* JADX INFO: renamed from: d */
    public final void mo318d(ViewGroup viewGroup, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        m2373n(i6, i7, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m2369i(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f3, boolean z3) {
        return this.f3969E.m302a(f, f3, z3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f3) {
        return this.f3969E.m303b(f, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i3, int i4, int[] iArr, int[] iArr2) {
        return this.f3969E.m304c(i3, i4, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i3, int i4, int i5, int i6, int[] iArr) {
        return this.f3969E.m305d(i3, i4, i5, i6, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f3976k;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (AbstractC0161j.m627a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (AbstractC0161j.m627a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f3977l;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (AbstractC0161j.m627a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (AbstractC0161j.m627a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // p000A.InterfaceC0055p
    /* JADX INFO: renamed from: e */
    public final void mo313e(int i3, int i4, int i5, int[] iArr) {
        this.f3969E.m304c(i3, i4, i5, iArr, null);
    }

    @Override // p000A.InterfaceC0055p
    /* JADX INFO: renamed from: f */
    public final boolean mo314f(View view, View view2, int i3, int i4) {
        return (i3 & 2) != 0;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2367g(int i3) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i3);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m2372m(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i3 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i3 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i3 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m2378s(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f3974i;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            m2378s(m2368h(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i3);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && !m2372m(viewFindFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0058r c0058r = this.f3968D;
        return c0058r.f83b | c0058r.f82a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f3970F == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f3970F = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f3970F;
    }

    /* JADX INFO: renamed from: h */
    public final int m2368h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        int i5 = rect.bottom;
        if (i5 > i4 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i4, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        }
        if (rect.top >= scrollY || i5 >= i4) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i4 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f3969E.m307f(0);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ac  */
    /* JADX INFO: renamed from: i */
    public final boolean m2369i(KeyEvent keyEvent) {
        View viewFindFocus;
        View viewFindNextFocus;
        this.f3974i.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? m2371k(33) : m2367g(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? m2371k(130) : m2367g(130);
                    }
                    if (keyCode == 62) {
                        m2376q(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return m2371k(33);
                    }
                    if (keyCode == 93) {
                        return m2371k(130);
                    }
                    if (keyCode == 122) {
                        m2376q(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        m2376q(130);
                        return false;
                    }
                }
            } else if (isFocused() && keyEvent.getKeyCode() != 4) {
                viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus == null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
        } else if (isFocused()) {
            viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            if (viewFindNextFocus == null) {
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f3969E.f76d;
    }

    /* JADX INFO: renamed from: j */
    public final void m2370j(int i3) {
        if (getChildCount() > 0) {
            this.f3975j.fling(getScrollX(), getScrollY(), 0, i3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m2381v(2, 1);
            this.f3966B = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2371k(int i3) {
        int childCount;
        boolean z3 = i3 == 130;
        int height = getHeight();
        Rect rect = this.f3974i;
        rect.top = 0;
        rect.bottom = height;
        if (z3 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m2377r(i3, rect.top, rect.bottom);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m2372m(View view, int i3, int i4) {
        Rect rect = this.f3974i;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i3 >= getScrollY() && rect.top - i3 <= getScrollY() + i4;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* JADX INFO: renamed from: n */
    public final void m2373n(int i3, int i4, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i3);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f3969E.m305d(0, scrollY2, 0, i3 - scrollY2, null, i4, iArr);
    }

    /* JADX INFO: renamed from: o */
    public final void m2374o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3989x) {
            int i3 = actionIndex == 0 ? 1 : 0;
            this.f3978m = (int) motionEvent.getY(i3);
            this.f3989x = motionEvent.getPointerId(i3);
            VelocityTracker velocityTracker = this.f3983r;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3980o = false;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01da  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:65:0x010a  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i3;
        float axisValue;
        int width;
        char c;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z3;
        VelocityTracker velocityTracker;
        float yVelocity;
        float f;
        long j3;
        float f3;
        float fSqrt;
        int i4;
        if (motionEvent.getAction() != 8 || this.f3982q) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            i3 = 9;
            axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            axisValue = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            i3 = 26;
        } else {
            i3 = 0;
            axisValue = 0.0f;
            width = 0;
        }
        if (axisValue == 0.0f) {
            return false;
        }
        m2378s(-((int) (getVerticalScrollFactorCompat() * axisValue)), width, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i3 != 0) {
            C0043j c0043j = this.f3971G;
            c0043j.getClass();
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            int i5 = c0043j.f67f;
            int[] iArr = c0043j.f69h;
            if (i5 == source && c0043j.f68g == deviceId && c0043j.f66e == i3) {
                z3 = false;
                c = 0;
            } else {
                Context context = c0043j.f62a;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int deviceId2 = motionEvent.getDeviceId();
                int source2 = motionEvent.getSource();
                c = 0;
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 34) {
                    Method method = AbstractC0020V.f19a;
                    scaledMinimumFlingVelocity = AbstractC0019U.m93b(viewConfiguration, deviceId2, i3, source2);
                } else {
                    Method method2 = AbstractC0020V.f19a;
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device == null || device.getMotionRange(i3, source2) == null) {
                        scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                    } else {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i3 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier == -1) {
                            scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                        } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                            scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                        }
                    }
                }
                iArr[0] = scaledMinimumFlingVelocity;
                int deviceId3 = motionEvent.getDeviceId();
                int source3 = motionEvent.getSource();
                if (i6 >= 34) {
                    scaledMaximumFlingVelocity = AbstractC0019U.m92a(viewConfiguration, deviceId3, i3, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if ((device2 == null || device2.getMotionRange(i3, source3) == null) ? false : true) {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i3 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier2 == -1) {
                            scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                            scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                        }
                    } else {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    }
                }
                iArr[1] = scaledMaximumFlingVelocity;
                c0043j.f67f = source;
                c0043j.f68g = deviceId;
                c0043j.f66e = i3;
                z3 = true;
            }
            if (iArr[c] == Integer.MAX_VALUE) {
                VelocityTracker velocityTracker2 = c0043j.f64c;
                if (velocityTracker2 == null) {
                    return true;
                }
                velocityTracker2.recycle();
                c0043j.f64c = null;
                return true;
            }
            if (c0043j.f64c == null) {
                c0043j.f64c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker3 = c0043j.f64c;
            Map map = AbstractC0064x.f86a;
            velocityTracker3.addMovement(motionEvent);
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = AbstractC0064x.f86a;
                if (!map2.containsKey(velocityTracker3)) {
                    map2.put(velocityTracker3, new C0065y());
                }
                C0065y c0065y = (C0065y) map2.get(velocityTracker3);
                c0065y.getClass();
                long eventTime = motionEvent.getEventTime();
                int i7 = c0065y.f90d;
                long[] jArr = c0065y.f88b;
                if (i7 != 0 && eventTime - jArr[c0065y.f91e] > 40) {
                    c0065y.f90d = 0;
                    c0065y.f89c = 0.0f;
                }
                int i8 = (c0065y.f91e + 1) % 20;
                c0065y.f91e = i8;
                int i9 = c0065y.f90d;
                if (i9 != 20) {
                    c0065y.f90d = i9 + 1;
                }
                c0065y.f87a[i8] = motionEvent.getAxisValue(26);
                jArr[c0065y.f91e] = eventTime;
            }
            velocityTracker3.computeCurrentVelocity(1000, Float.MAX_VALUE);
            C0065y c0065y2 = (C0065y) AbstractC0064x.f86a.get(velocityTracker3);
            if (c0065y2 != null) {
                int i10 = c0065y2.f90d;
                if (i10 < 2) {
                    velocityTracker = velocityTracker3;
                    f3 = Float.MAX_VALUE;
                    fSqrt = 0.0f;
                } else {
                    int i11 = c0065y2.f91e;
                    int i12 = ((i11 + 20) - (i10 - 1)) % 20;
                    long[] jArr2 = c0065y2.f88b;
                    long j4 = jArr2[i11];
                    while (true) {
                        j3 = jArr2[i12];
                        if (j4 - j3 <= 100) {
                            break;
                        }
                        c0065y2.f90d--;
                        i12 = (i12 + 1) % 20;
                    }
                    int i13 = c0065y2.f90d;
                    if (i13 < 2) {
                        velocityTracker = velocityTracker3;
                        f3 = Float.MAX_VALUE;
                        fSqrt = 0.0f;
                    } else {
                        float[] fArr = c0065y2.f87a;
                        if (i13 == 2) {
                            int i14 = (i12 + 1) % 20;
                            long j5 = jArr2[i14];
                            if (j3 == j5) {
                                velocityTracker = velocityTracker3;
                                f3 = Float.MAX_VALUE;
                                fSqrt = 0.0f;
                            } else {
                                velocityTracker = velocityTracker3;
                                fSqrt = fArr[i14] / (j5 - j3);
                                f3 = Float.MAX_VALUE;
                            }
                        } else {
                            float f4 = 0.0f;
                            int i15 = 0;
                            int i16 = 0;
                            while (true) {
                                if (i15 >= c0065y2.f90d - 1) {
                                    break;
                                }
                                int i17 = i15 + i12;
                                long j6 = jArr2[i17 % 20];
                                int i18 = (i17 + 1) % 20;
                                if (jArr2[i18] == j6) {
                                    i4 = 1;
                                } else {
                                    i16++;
                                    float fSqrt2 = (f4 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f4) * 2.0f));
                                    float f5 = fArr[i18] / (jArr2[i18] - j6);
                                    float fAbs = (Math.abs(f5) * (f5 - fSqrt2)) + f4;
                                    i4 = 1;
                                    if (i16 == 1) {
                                        fAbs *= 0.5f;
                                    }
                                    f4 = fAbs;
                                }
                                i15 += i4;
                                velocityTracker3 = velocityTracker3;
                            }
                            velocityTracker = velocityTracker3;
                            f3 = Float.MAX_VALUE;
                            fSqrt = ((float) Math.sqrt(Math.abs(f4) * 2.0f)) * (f4 < 0.0f ? -1.0f : 1.0f);
                        }
                    }
                }
                float f6 = fSqrt * 1000;
                c0065y2.f89c = f6;
                if (f6 < (-Math.abs(f3))) {
                    c0065y2.f89c = -Math.abs(f3);
                } else if (c0065y2.f89c > Math.abs(f3)) {
                    c0065y2.f89c = Math.abs(f3);
                }
            } else {
                velocityTracker = velocityTracker3;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                yVelocity = AbstractC0063w.m322a(velocityTracker, i3);
            } else {
                VelocityTracker velocityTracker4 = velocityTracker;
                if (i3 == 0) {
                    yVelocity = velocityTracker4.getXVelocity();
                } else if (i3 == 1) {
                    yVelocity = velocityTracker4.getYVelocity();
                } else {
                    C0065y c0065y3 = (C0065y) AbstractC0064x.f86a.get(velocityTracker4);
                    yVelocity = (c0065y3 == null || i3 != 26) ? 0.0f : c0065y3.f89c;
                }
            }
            NestedScrollView nestedScrollView = (NestedScrollView) c0043j.f63b.f38h;
            float f7 = yVelocity * (-nestedScrollView.getVerticalScrollFactorCompat());
            float fSignum = Math.signum(f7);
            if (z3 || (fSignum != Math.signum(c0043j.f65d) && fSignum != 0.0f)) {
                nestedScrollView.f3975j.abortAnimation();
            }
            if (Math.abs(f7) >= iArr[0]) {
                int i19 = iArr[1];
                float fMax = Math.max(-i19, Math.min(f7, i19));
                if (fMax == 0.0f) {
                    f = 0.0f;
                } else {
                    nestedScrollView.f3975j.abortAnimation();
                    nestedScrollView.m2370j((int) fMax);
                    f = fMax;
                }
                c0043j.f65d = f;
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0117  */
    /* JADX WARN: Code duplicated, block: B:70:0x012d  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action == 2 && this.f3982q) {
            return true;
        }
        int i3 = action & 255;
        if (i3 == 0) {
            int y3 = (int) motionEvent.getY();
            int x3 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y3 < childAt.getTop() - scrollY || y3 >= childAt.getBottom() - scrollY || x3 < childAt.getLeft() || x3 >= childAt.getRight()) {
                    if (!m2382w(motionEvent) && this.f3975j.isFinished()) {
                        z3 = false;
                    }
                    this.f3982q = z3;
                    velocityTracker = this.f3983r;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f3983r = null;
                    }
                } else {
                    this.f3978m = y3;
                    this.f3989x = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.f3983r;
                    if (velocityTracker3 == null) {
                        this.f3983r = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.f3983r.addMovement(motionEvent);
                    this.f3975j.computeScrollOffset();
                    if (!m2382w(motionEvent) && this.f3975j.isFinished()) {
                        z3 = false;
                    }
                    this.f3982q = z3;
                    m2381v(2, 0);
                }
            } else {
                if (!m2382w(motionEvent)) {
                    z3 = false;
                }
                this.f3982q = z3;
                velocityTracker = this.f3983r;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f3983r = null;
                }
            }
        } else if (i3 == 1) {
            this.f3982q = false;
            this.f3989x = -1;
            velocityTracker2 = this.f3983r;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f3983r = null;
            }
            if (this.f3975j.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m2383x(0);
        } else if (i3 == 2) {
            int i4 = this.f3989x;
            if (i4 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i4);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i4 + " in onInterceptTouchEvent");
                } else {
                    int y4 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y4 - this.f3978m) > this.f3986u && (2 & getNestedScrollAxes()) == 0) {
                        this.f3982q = true;
                        this.f3978m = y4;
                        if (this.f3983r == null) {
                            this.f3983r = VelocityTracker.obtain();
                        }
                        this.f3983r.addMovement(motionEvent);
                        this.f3965A = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i3 == 3) {
            this.f3982q = false;
            this.f3989x = -1;
            velocityTracker2 = this.f3983r;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f3983r = null;
            }
            if (this.f3975j.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m2383x(0);
        } else if (i3 == 6) {
            m2374o(motionEvent);
        }
        return this.f3982q;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int measuredHeight;
        super.onLayout(z3, i3, i4, i5, i6);
        int i7 = 0;
        this.f3979n = false;
        View view = this.f3981p;
        if (view != null && m2366l(view, this)) {
            View view2 = this.f3981p;
            Rect rect = this.f3974i;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM2368h = m2368h(rect);
            if (iM2368h != 0) {
                scrollBy(0, iM2368h);
            }
        }
        this.f3981p = null;
        if (!this.f3980o) {
            if (this.f3967C != null) {
                scrollTo(getScrollX(), this.f3967C.f389g);
                this.f3967C = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i6 - i4) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i7 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i7 != scrollY) {
                scrollTo(getScrollX(), i7);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f3980o = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        if (this.f3984s && View.MeasureSpec.getMode(i4) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f3, boolean z3) {
        if (z3) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        m2370j((int) f3);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f3) {
        return this.f3969E.m303b(f, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i3, int i4, int[] iArr) {
        this.f3969E.m304c(i3, i4, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i3, int i4, int i5, int i6) {
        m2373n(i6, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        mo310a(view, view2, i3, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i3, int i4, boolean z3, boolean z4) {
        super.scrollTo(i3, i4);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i3, Rect rect) {
        if (i3 == 2) {
            i3 = 130;
        } else if (i3 == 1) {
            i3 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i3) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i3);
        if (viewFindNextFocus != null && m2372m(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i3, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0163l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0163l c0163l = (C0163l) parcelable;
        super.onRestoreInstanceState(c0163l.getSuperState());
        this.f3967C = c0163l;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0163l c0163l = new C0163l(super.onSaveInstanceState());
        c0163l.f389g = getScrollY();
        return c0163l;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i3, int i4, int i5, int i6) {
        super.onScrollChanged(i3, i4, i5, i6);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m2372m(viewFindFocus, 0, i6)) {
            return;
        }
        Rect rect = this.f3974i;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iM2368h = m2368h(rect);
        if (iM2368h != 0) {
            if (this.f3985t) {
                m2380u(0, iM2368h, false);
            } else {
                scrollBy(0, iM2368h);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        return mo314f(view, view2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo312c(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f3983r == null) {
            this.f3983r = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3965A = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f3965A);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f3977l;
            EdgeEffect edgeEffect2 = this.f3976k;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f3983r;
                velocityTracker.computeCurrentVelocity(1000, this.f3988w);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f3989x);
                if (Math.abs(yVelocity) >= this.f3987v) {
                    if (AbstractC0610a.m1511m(edgeEffect2) != 0.0f) {
                        if (m2379t(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            m2370j(-yVelocity);
                        }
                    } else if (AbstractC0610a.m1511m(edgeEffect) != 0.0f) {
                        int i3 = -yVelocity;
                        if (m2379t(edgeEffect, i3)) {
                            edgeEffect.onAbsorb(i3);
                        } else {
                            m2370j(i3);
                        }
                    } else {
                        int i4 = -yVelocity;
                        float f3 = i4;
                        if (!this.f3969E.m303b(0.0f, f3)) {
                            dispatchNestedFling(0.0f, f3, true);
                            m2370j(i4);
                        }
                    }
                } else if (this.f3975j.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f3989x = -1;
                this.f3982q = false;
                VelocityTracker velocityTracker2 = this.f3983r;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f3983r = null;
                }
                m2383x(0);
                this.f3976k.onRelease();
                this.f3977l.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f3989x);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f3989x + " in onTouchEvent");
                } else {
                    int y3 = (int) motionEvent.getY(iFindPointerIndex);
                    int i5 = this.f3978m - y3;
                    float x3 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i5 / getHeight();
                    if (AbstractC0610a.m1511m(edgeEffect2) != 0.0f) {
                        float f4 = -AbstractC0610a.m1491C(edgeEffect2, -height, x3);
                        if (AbstractC0610a.m1511m(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f = f4;
                    } else if (AbstractC0610a.m1511m(edgeEffect) != 0.0f) {
                        float fM1491C = AbstractC0610a.m1491C(edgeEffect, height, 1.0f - x3);
                        if (AbstractC0610a.m1511m(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f = fM1491C;
                    }
                    int iRound = Math.round(f * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    int i6 = i5 - iRound;
                    if (!this.f3982q && Math.abs(i6) > this.f3986u) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f3982q = true;
                        i6 = i6 > 0 ? i6 - this.f3986u : i6 + this.f3986u;
                    }
                    if (this.f3982q) {
                        int iM2378s = m2378s(i6, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f3978m = y3 - iM2378s;
                        this.f3965A += iM2378s;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f3982q && getChildCount() > 0 && this.f3975j.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f3989x = -1;
                this.f3982q = false;
                VelocityTracker velocityTracker3 = this.f3983r;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f3983r = null;
                }
                m2383x(0);
                this.f3976k.onRelease();
                this.f3977l.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f3978m = (int) motionEvent.getY(actionIndex);
                this.f3989x = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m2374o(motionEvent);
                this.f3978m = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f3989x));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f3982q && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f3975j.isFinished()) {
                this.f3975j.abortAnimation();
                m2383x(1);
            }
            int y4 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f3978m = y4;
            this.f3989x = pointerId;
            m2381v(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f3983r;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m2375p(int i3, int i4, int i5, int i6) {
        int i7;
        boolean z3;
        int i8;
        boolean z4;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i9 = i5 + i3;
        if (i4 <= 0 && i4 >= 0) {
            i7 = i4;
            z3 = false;
        } else {
            z3 = true;
            i7 = 0;
        }
        if (i9 > i6) {
            i8 = i6;
            z4 = true;
        } else if (i9 < 0) {
            z4 = true;
            i8 = 0;
        } else {
            i8 = i9;
            z4 = false;
        }
        if (z4 && !this.f3969E.m307f(1)) {
            this.f3975j.springBack(i7, i8, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i7, i8);
        return z3 || z4;
    }

    /* JADX INFO: renamed from: q */
    public final void m2376q(int i3) {
        boolean z3 = i3 == 130;
        int height = getHeight();
        Rect rect = this.f3974i;
        if (z3) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i4 = rect.top;
        int i5 = height + i4;
        rect.bottom = i5;
        m2377r(i3, i4, i5);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX INFO: renamed from: r */
    public final boolean m2377r(int i3, int i4, int i5) {
        boolean z3;
        int height = getHeight();
        int scrollY = getScrollY();
        int i6 = height + scrollY;
        boolean z4 = i3 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z5 = false;
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = focusables.get(i7);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i4 < bottom && top < i5) {
                boolean z6 = i4 < top && bottom < i5;
                if (view == null) {
                    view = view2;
                    z5 = z6;
                } else {
                    boolean z7 = (z4 && top < view.getTop()) || (!z4 && bottom > view.getBottom());
                    if (z5) {
                        if (z6 && z7) {
                            view = view2;
                        }
                    } else if (z6) {
                        view = view2;
                        z5 = true;
                    } else if (z7) {
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i4 < scrollY || i5 > i6) {
            m2378s(z4 ? i4 - scrollY : i5 - i6, 0, 1, true);
            z3 = true;
        } else {
            z3 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i3);
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f3979n) {
            this.f3981p = view2;
        } else {
            Rect rect = this.f3974i;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM2368h = m2368h(rect);
            if (iM2368h != 0) {
                scrollBy(0, iM2368h);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iM2368h = m2368h(rect);
        boolean z4 = iM2368h != 0;
        if (z4) {
            if (z3) {
                scrollBy(0, iM2368h);
                return z4;
            }
            m2380u(0, iM2368h, false);
        }
        return z4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        VelocityTracker velocityTracker;
        if (z3 && (velocityTracker = this.f3983r) != null) {
            velocityTracker.recycle();
            this.f3983r = null;
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f3979n = true;
        super.requestLayout();
    }

    /* JADX INFO: renamed from: s */
    public final int m2378s(int i3, int i4, int i5, boolean z3) {
        int i6;
        int i7;
        boolean z4;
        VelocityTracker velocityTracker;
        if (i5 == 1) {
            m2381v(2, i5);
        }
        boolean zM304c = this.f3969E.m304c(0, i3, i5, this.f3991z, this.f3990y);
        int[] iArr = this.f3991z;
        int[] iArr2 = this.f3990y;
        if (zM304c) {
            i6 = i3 - iArr[1];
            i7 = iArr2[1];
        } else {
            i6 = i3;
            i7 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z5 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z3;
        boolean z6 = m2375p(i6, 0, scrollY, scrollRange) && !this.f3969E.m307f(i5);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f3969E.m305d(0, scrollY2, 0, i6 - scrollY2, this.f3990y, i5, iArr);
        int i8 = i7 + iArr2[1];
        int i9 = i6 - iArr[1];
        int i10 = scrollY + i9;
        EdgeEffect edgeEffect = this.f3977l;
        EdgeEffect edgeEffect2 = this.f3976k;
        if (i10 < 0) {
            if (z5) {
                AbstractC0610a.m1491C(edgeEffect2, (-i9) / getHeight(), i4 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i10 > scrollRange && z5) {
            AbstractC0610a.m1491C(edgeEffect, i9 / getHeight(), 1.0f - (i4 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z4 = z6;
        } else {
            postInvalidateOnAnimation();
            z4 = false;
        }
        if (z4 && i5 == 0 && (velocityTracker = this.f3983r) != null) {
            velocityTracker.clear();
        }
        if (i5 == 1) {
            m2383x(i5);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i8;
    }

    @Override // android.view.View
    public final void scrollTo(int i3, int i4) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i3 < 0) {
                i3 = 0;
            } else if (width + i3 > width2) {
                i3 = width2 - width;
            }
            if (height >= height2 || i4 < 0) {
                i4 = 0;
            } else if (height + i4 > height2) {
                i4 = height2 - height;
            }
            if (i3 == getScrollX() && i4 == getScrollY()) {
                return;
            }
            super.scrollTo(i3, i4);
        }
    }

    public void setFillViewport(boolean z3) {
        if (z3 != this.f3984s) {
            this.f3984s = z3;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z3) {
        C0053o c0053o = this.f3969E;
        if (c0053o.f76d) {
            WeakHashMap weakHashMap = AbstractC0016Q.f14a;
            AbstractC0005F.m33z(c0053o.f75c);
        }
        c0053o.f76d = z3;
    }

    public void setSmoothScrollingEnabled(boolean z3) {
        this.f3985t = z3;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i3) {
        return this.f3969E.m308g(i3, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m2383x(0);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m2379t(EdgeEffect edgeEffect, int i3) {
        if (i3 > 0) {
            return true;
        }
        float fM1511m = AbstractC0610a.m1511m(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i3) * 0.35f;
        float f = this.f3972g * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d3 = f3962H;
        return ((float) (Math.exp((d3 / (d3 - 1.0d)) * dLog) * ((double) f))) < fM1511m;
    }

    /* JADX INFO: renamed from: u */
    public final void m2380u(int i3, int i4, boolean z3) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f3973h > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f3975j.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i4 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z3) {
                m2381v(2, 1);
            } else {
                m2383x(1);
            }
            this.f3966B = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f3975j.isFinished()) {
                this.f3975j.abortAnimation();
                m2383x(1);
            }
            scrollBy(i3, i4);
        }
        this.f3973h = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX INFO: renamed from: v */
    public final void m2381v(int i3, int i4) {
        this.f3969E.m308g(2, i4);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m2382w(MotionEvent motionEvent) {
        boolean z3;
        EdgeEffect edgeEffect = this.f3976k;
        if (AbstractC0610a.m1511m(edgeEffect) != 0.0f) {
            AbstractC0610a.m1491C(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z3 = true;
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect2 = this.f3977l;
        if (AbstractC0610a.m1511m(edgeEffect2) == 0.0f) {
            return z3;
        }
        AbstractC0610a.m1491C(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* JADX INFO: renamed from: x */
    public final void m2383x(int i3) {
        this.f3969E.m309h(i3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3) {
        if (getChildCount() <= 0) {
            super.addView(view, i3);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i3, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(InterfaceC0162k interfaceC0162k) {
    }
}

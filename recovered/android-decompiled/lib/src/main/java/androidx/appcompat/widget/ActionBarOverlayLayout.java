package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.zuxoplayer.app.R;
import java.util.WeakHashMap;
import p000A.AbstractC0003D;
import p000A.AbstractC0005F;
import p000A.AbstractC0016Q;
import p000A.AbstractC0040h0;
import p000A.C0032d0;
import p000A.C0036f0;
import p000A.C0038g0;
import p000A.C0054o0;
import p000A.C0056p0;
import p000A.C0058r;
import p000A.InterfaceC0055p;
import p000A.InterfaceC0057q;
import p060U1.AbstractC0610a;
import p083b1.C1112v;
import p091e.C1469N;
import p106i.C1742j;
import p110j.InterfaceC1783x;
import p110j.MenuC1772m;
import p113k.C1840Y0;
import p113k.C1854d1;
import p113k.C1855e;
import p113k.C1858f;
import p113k.C1873k;
import p113k.InterfaceC1852d;
import p113k.InterfaceC1871j0;
import p113k.InterfaceC1874k0;
import p113k.RunnableC1849c;
import p148t.C2264c;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC1871j0, InterfaceC0055p, InterfaceC0057q {

    /* JADX INFO: renamed from: I */
    public static final int[] f3841I = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: J */
    public static final C0056p0 f3842J;

    /* JADX INFO: renamed from: K */
    public static final Rect f3843K;

    /* JADX INFO: renamed from: A */
    public InterfaceC1852d f3844A;

    /* JADX INFO: renamed from: B */
    public OverScroller f3845B;

    /* JADX INFO: renamed from: C */
    public ViewPropertyAnimator f3846C;

    /* JADX INFO: renamed from: D */
    public final C1112v f3847D;

    /* JADX INFO: renamed from: E */
    public final RunnableC1849c f3848E;

    /* JADX INFO: renamed from: F */
    public final RunnableC1849c f3849F;

    /* JADX INFO: renamed from: G */
    public final C0058r f3850G;

    /* JADX INFO: renamed from: H */
    public final C1858f f3851H;

    /* JADX INFO: renamed from: g */
    public int f3852g;

    /* JADX INFO: renamed from: h */
    public int f3853h;

    /* JADX INFO: renamed from: i */
    public ContentFrameLayout f3854i;

    /* JADX INFO: renamed from: j */
    public ActionBarContainer f3855j;

    /* JADX INFO: renamed from: k */
    public InterfaceC1874k0 f3856k;

    /* JADX INFO: renamed from: l */
    public Drawable f3857l;

    /* JADX INFO: renamed from: m */
    public boolean f3858m;

    /* JADX INFO: renamed from: n */
    public boolean f3859n;

    /* JADX INFO: renamed from: o */
    public boolean f3860o;

    /* JADX INFO: renamed from: p */
    public boolean f3861p;

    /* JADX INFO: renamed from: q */
    public int f3862q;

    /* JADX INFO: renamed from: r */
    public int f3863r;

    /* JADX INFO: renamed from: s */
    public final Rect f3864s;

    /* JADX INFO: renamed from: t */
    public final Rect f3865t;

    /* JADX INFO: renamed from: u */
    public final Rect f3866u;

    /* JADX INFO: renamed from: v */
    public final Rect f3867v;

    /* JADX INFO: renamed from: w */
    public C0056p0 f3868w;

    /* JADX INFO: renamed from: x */
    public C0056p0 f3869x;

    /* JADX INFO: renamed from: y */
    public C0056p0 f3870y;

    /* JADX INFO: renamed from: z */
    public C0056p0 f3871z;

    static {
        AbstractC0040h0 c0036f0;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            c0036f0 = new C0038g0();
        } else {
            c0036f0 = i3 >= 29 ? new C0036f0() : new C0032d0();
        }
        c0036f0.mo182d(C2264c.m4862a(0, 1, 0, 1));
        f3842J = c0036f0.mo180b();
        f3843K = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3853h = 0;
        this.f3864s = new Rect();
        this.f3865t = new Rect();
        this.f3866u = new Rect();
        this.f3867v = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C0056p0 c0056p0 = C0056p0.f80b;
        this.f3868w = c0056p0;
        this.f3869x = c0056p0;
        this.f3870y = c0056p0;
        this.f3871z = c0056p0;
        this.f3847D = new C1112v(6, this);
        this.f3848E = new RunnableC1849c(this, 0);
        this.f3849F = new RunnableC1849c(this, 1);
        m2329i(context);
        this.f3850G = new C0058r();
        C1858f c1858f = new C1858f(context);
        c1858f.setWillNotDraw(true);
        this.f3851H = c1858f;
        addView(c1858f);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m2327g(View view, Rect rect, boolean z3) {
        boolean z4;
        C1855e c1855e = (C1855e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c1855e).leftMargin;
        int i4 = rect.left;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c1855e).leftMargin = i4;
            z4 = true;
        } else {
            z4 = false;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c1855e).topMargin;
        int i6 = rect.top;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c1855e).topMargin = i6;
            z4 = true;
        }
        int i7 = ((ViewGroup.MarginLayoutParams) c1855e).rightMargin;
        int i8 = rect.right;
        if (i7 != i8) {
            ((ViewGroup.MarginLayoutParams) c1855e).rightMargin = i8;
            z4 = true;
        }
        if (z3) {
            int i9 = ((ViewGroup.MarginLayoutParams) c1855e).bottomMargin;
            int i10 = rect.bottom;
            if (i9 != i10) {
                ((ViewGroup.MarginLayoutParams) c1855e).bottomMargin = i10;
                return true;
            }
        }
        return z4;
    }

    @Override // p000A.InterfaceC0055p
    /* JADX INFO: renamed from: a */
    public final void mo310a(View view, View view2, int i3, int i4) {
        if (i4 == 0) {
            onNestedScrollAccepted(view, view2, i3);
        }
    }

    @Override // p000A.InterfaceC0055p
    /* JADX INFO: renamed from: b */
    public final void mo311b(ViewGroup viewGroup, int i3, int i4, int i5, int i6, int i7) {
        if (i7 == 0) {
            onNestedScroll(viewGroup, i3, i4, i5, i6);
        }
    }

    @Override // p000A.InterfaceC0055p
    /* JADX INFO: renamed from: c */
    public final void mo312c(View view, int i3) {
        if (i3 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1855e;
    }

    @Override // p000A.InterfaceC0057q
    /* JADX INFO: renamed from: d */
    public final void mo318d(ViewGroup viewGroup, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        mo311b(viewGroup, i3, i4, i5, i6, i7);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f3857l != null) {
            if (this.f3855j.getVisibility() == 0) {
                translationY = (int) (this.f3855j.getTranslationY() + this.f3855j.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f3857l.setBounds(0, translationY, getWidth(), this.f3857l.getIntrinsicHeight() + translationY);
            this.f3857l.draw(canvas);
        }
    }

    @Override // p000A.InterfaceC0055p
    /* JADX INFO: renamed from: f */
    public final boolean mo314f(View view, View view2, int i3, int i4) {
        return i4 == 0 && onStartNestedScroll(view, view2, i3);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1855e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1855e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f3855j;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0058r c0058r = this.f3850G;
        return c0058r.f83b | c0058r.f82a;
    }

    public CharSequence getTitle() {
        m2331k();
        return ((C1854d1) this.f3856k).f8135a.getTitle();
    }

    /* JADX INFO: renamed from: h */
    public final void m2328h() {
        removeCallbacks(this.f3848E);
        removeCallbacks(this.f3849F);
        ViewPropertyAnimator viewPropertyAnimator = this.f3846C;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m2329i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f3841I);
        this.f3852g = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f3857l = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f3845B = new OverScroller(context);
    }

    /* JADX INFO: renamed from: j */
    public final void m2330j(int i3) {
        m2331k();
        if (i3 == 2) {
            ((C1854d1) this.f3856k).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i3 == 5) {
            ((C1854d1) this.f3856k).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i3 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m2331k() {
        InterfaceC1874k0 wrapper;
        if (this.f3854i == null) {
            this.f3854i = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f3855j = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC1874k0) {
                wrapper = (InterfaceC1874k0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f3856k = wrapper;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2332l(MenuC1772m menuC1772m, InterfaceC1783x interfaceC1783x) {
        m2331k();
        C1854d1 c1854d1 = (C1854d1) this.f3856k;
        C1873k c1873k = c1854d1.f8147m;
        Toolbar toolbar = c1854d1.f8135a;
        if (c1873k == null) {
            c1854d1.f8147m = new C1873k(toolbar.getContext());
        }
        C1873k c1873k2 = c1854d1.f8147m;
        c1873k2.f8201k = interfaceC1783x;
        if (menuC1772m == null && toolbar.f3921g == null) {
            return;
        }
        toolbar.m2349f();
        MenuC1772m menuC1772m2 = toolbar.f3921g.f3878v;
        if (menuC1772m2 == menuC1772m) {
            return;
        }
        if (menuC1772m2 != null) {
            menuC1772m2.m4260r(toolbar.f3914Q);
            menuC1772m2.m4260r(toolbar.f3915R);
        }
        if (toolbar.f3915R == null) {
            toolbar.f3915R = new C1840Y0(toolbar);
        }
        c1873k2.f8213w = true;
        if (menuC1772m != null) {
            menuC1772m.m4252b(c1873k2, toolbar.f3930p);
            menuC1772m.m4252b(toolbar.f3915R, toolbar.f3930p);
        } else {
            c1873k2.mo4246c(toolbar.f3930p, null);
            toolbar.f3915R.mo4246c(toolbar.f3930p, null);
            c1873k2.mo4216g();
            toolbar.f3915R.mo4216g();
        }
        toolbar.f3921g.setPopupTheme(toolbar.f3931q);
        toolbar.f3921g.setPresenter(c1873k2);
        toolbar.f3914Q = c1873k2;
        toolbar.m2359t();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m2331k();
        C0056p0 c0056p0M316c = C0056p0.m316c(windowInsets, this);
        C0054o0 c0054o0 = c0056p0M316c.f81a;
        boolean zM2327g = m2327g(this.f3855j, new Rect(c0054o0.mo218g().f9698a, c0054o0.mo218g().f9699b, c0054o0.mo218g().f9700c, c0054o0.mo218g().f9701d), false);
        WeakHashMap weakHashMap = AbstractC0016Q.f14a;
        Rect rect = this.f3864s;
        AbstractC0005F.m9b(this, c0056p0M316c, rect);
        C0056p0 c0056p0Mo219h = c0054o0.mo219h(rect.left, rect.top, rect.right, rect.bottom);
        this.f3868w = c0056p0Mo219h;
        boolean z3 = true;
        if (!this.f3869x.equals(c0056p0Mo219h)) {
            this.f3869x = this.f3868w;
            zM2327g = true;
        }
        Rect rect2 = this.f3865t;
        if (rect2.equals(rect)) {
            z3 = zM2327g;
        } else {
            rect2.set(rect);
        }
        if (z3) {
            requestLayout();
        }
        return c0054o0.mo256a().f81a.mo225c().f81a.mo224b().m317b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m2329i(getContext());
        WeakHashMap weakHashMap = AbstractC0016Q.f14a;
        AbstractC0003D.m7c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2328h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C1855e c1855e = (C1855e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i8 = ((ViewGroup.MarginLayoutParams) c1855e).leftMargin + paddingLeft;
                int i9 = ((ViewGroup.MarginLayoutParams) c1855e).topMargin + paddingTop;
                childAt.layout(i8, i9, measuredWidth + i8, measuredHeight + i9);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:24:0x00df  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ef  */
    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        int measuredHeight;
        C0056p0 c0056p0;
        int i5;
        AbstractC0040h0 c0032d0;
        m2331k();
        measureChildWithMargins(this.f3855j, i3, 0, i4, 0);
        C1855e c1855e = (C1855e) this.f3855j.getLayoutParams();
        int iMax = Math.max(0, this.f3855j.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1855e).leftMargin + ((ViewGroup.MarginLayoutParams) c1855e).rightMargin);
        int iMax2 = Math.max(0, this.f3855j.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1855e).topMargin + ((ViewGroup.MarginLayoutParams) c1855e).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f3855j.getMeasuredState());
        WeakHashMap weakHashMap = AbstractC0016Q.f14a;
        boolean z3 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z3) {
            measuredHeight = this.f3852g;
            if (this.f3859n && this.f3855j.getTabContainer() != null) {
                measuredHeight += this.f3852g;
            }
        } else {
            measuredHeight = this.f3855j.getVisibility() != 8 ? this.f3855j.getMeasuredHeight() : 0;
        }
        Rect rect = this.f3864s;
        Rect rect2 = this.f3866u;
        rect2.set(rect);
        this.f3870y = this.f3868w;
        if (this.f3858m || z3) {
            C2264c c2264cM4862a = C2264c.m4862a(this.f3870y.f81a.mo218g().f9698a, this.f3870y.f81a.mo218g().f9699b + measuredHeight, this.f3870y.f81a.mo218g().f9700c, this.f3870y.f81a.mo218g().f9701d);
            c0056p0 = this.f3870y;
            i5 = Build.VERSION.SDK_INT;
            if (i5 >= 30) {
                c0032d0 = new C0038g0(c0056p0);
            } else if (i5 >= 29) {
                c0032d0 = new C0036f0(c0056p0);
            } else {
                c0032d0 = new C0032d0(c0056p0);
            }
            c0032d0.mo182d(c2264cM4862a);
            this.f3870y = c0032d0.mo180b();
        } else {
            C1858f c1858f = this.f3851H;
            C0056p0 c0056p1 = f3842J;
            Rect rect3 = this.f3867v;
            AbstractC0005F.m9b(c1858f, c0056p1, rect3);
            if (rect3.equals(f3843K)) {
                C2264c c2264cM4862a2 = C2264c.m4862a(this.f3870y.f81a.mo218g().f9698a, this.f3870y.f81a.mo218g().f9699b + measuredHeight, this.f3870y.f81a.mo218g().f9700c, this.f3870y.f81a.mo218g().f9701d);
                c0056p0 = this.f3870y;
                i5 = Build.VERSION.SDK_INT;
                if (i5 >= 30) {
                    c0032d0 = new C0038g0(c0056p0);
                } else if (i5 >= 29) {
                    c0032d0 = new C0036f0(c0056p0);
                } else {
                    c0032d0 = new C0032d0(c0056p0);
                }
                c0032d0.mo182d(c2264cM4862a2);
                this.f3870y = c0032d0.mo180b();
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f3870y = this.f3870y.f81a.mo219h(0, measuredHeight, 0, 0);
            }
        }
        m2327g(this.f3854i, rect2, true);
        if (!this.f3871z.equals(this.f3870y)) {
            C0056p0 c0056p2 = this.f3870y;
            this.f3871z = c0056p2;
            ContentFrameLayout contentFrameLayout = this.f3854i;
            WindowInsets windowInsetsM317b = c0056p2.m317b();
            if (windowInsetsM317b != null) {
                WindowInsets windowInsetsM5a = AbstractC0003D.m5a(contentFrameLayout, windowInsetsM317b);
                if (!windowInsetsM5a.equals(windowInsetsM317b)) {
                    C0056p0.m316c(windowInsetsM5a, contentFrameLayout);
                }
            }
        }
        measureChildWithMargins(this.f3854i, i3, 0, i4, 0);
        C1855e c1855e2 = (C1855e) this.f3854i.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f3854i.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1855e2).leftMargin + ((ViewGroup.MarginLayoutParams) c1855e2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f3854i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1855e2).topMargin + ((ViewGroup.MarginLayoutParams) c1855e2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f3854i.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i3, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i4, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f3, boolean z3) {
        if (!this.f3860o || !z3) {
            return false;
        }
        this.f3845B.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f3845B.getFinalY() > this.f3855j.getHeight()) {
            m2328h();
            this.f3849F.run();
        } else {
            m2328h();
            this.f3848E.run();
        }
        this.f3861p = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i3, int i4, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i3, int i4, int i5, int i6) {
        int i7 = this.f3862q + i4;
        this.f3862q = i7;
        setActionBarHideOffset(i7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        C1469N c1469n;
        C1742j c1742j;
        this.f3850G.f82a = i3;
        this.f3862q = getActionBarHideOffset();
        m2328h();
        InterfaceC1852d interfaceC1852d = this.f3844A;
        if (interfaceC1852d == null || (c1742j = (c1469n = (C1469N) interfaceC1852d).f6528A) == null) {
            return;
        }
        c1742j.m4193a();
        c1469n.f6528A = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        if ((i3 & 2) == 0 || this.f3855j.getVisibility() != 0) {
            return false;
        }
        return this.f3860o;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f3860o || this.f3861p) {
            return;
        }
        if (this.f3862q <= this.f3855j.getHeight()) {
            m2328h();
            postDelayed(this.f3848E, 600L);
        } else {
            m2328h();
            postDelayed(this.f3849F, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i3) {
        super.onWindowSystemUiVisibilityChanged(i3);
        m2331k();
        int i4 = this.f3863r ^ i3;
        this.f3863r = i3;
        boolean z3 = (i3 & 4) == 0;
        boolean z4 = (i3 & 256) != 0;
        InterfaceC1852d interfaceC1852d = this.f3844A;
        if (interfaceC1852d != null) {
            C1469N c1469n = (C1469N) interfaceC1852d;
            c1469n.f6548w = !z4;
            if (z3 || !z4) {
                if (c1469n.f6549x) {
                    c1469n.f6549x = false;
                    c1469n.m3699j0(true);
                }
            } else if (!c1469n.f6549x) {
                c1469n.f6549x = true;
                c1469n.m3699j0(true);
            }
        }
        if ((i4 & 256) == 0 || this.f3844A == null) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC0016Q.f14a;
        AbstractC0003D.m7c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i3) {
        super.onWindowVisibilityChanged(i3);
        this.f3853h = i3;
        InterfaceC1852d interfaceC1852d = this.f3844A;
        if (interfaceC1852d != null) {
            ((C1469N) interfaceC1852d).f6547v = i3;
        }
    }

    public void setActionBarHideOffset(int i3) {
        m2328h();
        this.f3855j.setTranslationY(-Math.max(0, Math.min(i3, this.f3855j.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC1852d interfaceC1852d) {
        this.f3844A = interfaceC1852d;
        if (getWindowToken() != null) {
            ((C1469N) this.f3844A).f6547v = this.f3853h;
            int i3 = this.f3863r;
            if (i3 != 0) {
                onWindowSystemUiVisibilityChanged(i3);
                WeakHashMap weakHashMap = AbstractC0016Q.f14a;
                AbstractC0003D.m7c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z3) {
        this.f3859n = z3;
    }

    public void setHideOnContentScrollEnabled(boolean z3) {
        if (z3 != this.f3860o) {
            this.f3860o = z3;
            if (z3) {
                return;
            }
            m2328h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i3) {
        m2331k();
        C1854d1 c1854d1 = (C1854d1) this.f3856k;
        c1854d1.f8138d = i3 != 0 ? AbstractC0610a.m1512n(c1854d1.f8135a.getContext(), i3) : null;
        c1854d1.m4374c();
    }

    public void setLogo(int i3) {
        m2331k();
        C1854d1 c1854d1 = (C1854d1) this.f3856k;
        c1854d1.f8139e = i3 != 0 ? AbstractC0610a.m1512n(c1854d1.f8135a.getContext(), i3) : null;
        c1854d1.m4374c();
    }

    public void setOverlayMode(boolean z3) {
        this.f3858m = z3;
    }

    public void setShowingForActionMode(boolean z3) {
    }

    public void setUiOptions(int i3) {
    }

    @Override // p113k.InterfaceC1871j0
    public void setWindowCallback(Window.Callback callback) {
        m2331k();
        ((C1854d1) this.f3856k).f8145k = callback;
    }

    @Override // p113k.InterfaceC1871j0
    public void setWindowTitle(CharSequence charSequence) {
        m2331k();
        C1854d1 c1854d1 = (C1854d1) this.f3856k;
        if (c1854d1.f8141g) {
            return;
        }
        c1854d1.f8142h = charSequence;
        if ((c1854d1.f8136b & 8) != 0) {
            Toolbar toolbar = c1854d1.f8135a;
            toolbar.setTitle(charSequence);
            if (c1854d1.f8141g) {
                AbstractC0016Q.m87i(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1855e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m2331k();
        C1854d1 c1854d1 = (C1854d1) this.f3856k;
        c1854d1.f8138d = drawable;
        c1854d1.m4374c();
    }

    @Override // p000A.InterfaceC0055p
    /* JADX INFO: renamed from: e */
    public final void mo313e(int i3, int i4, int i5, int[] iArr) {
    }
}

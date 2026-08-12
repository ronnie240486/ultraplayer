package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.media.session.C0858A;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.C0971v;
import com.zuxoplayer.app.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p000A.AbstractC0016Q;
import p014F.RunnableC0153b;
import p060U1.AbstractC0610a;
import p083b1.ViewOnClickListenerC1086O;
import p087d.AbstractC1376a;
import p106i.C1740h;
import p110j.C1774o;
import p110j.MenuC1772m;
import p113k.AbstractC1838X0;
import p113k.AbstractC1878l1;
import p113k.C1821O0;
import p113k.C1836W0;
import p113k.C1840Y0;
import p113k.C1842Z0;
import p113k.C1847b0;
import p113k.C1848b1;
import p113k.C1854d1;
import p113k.C1873k;
import p113k.C1899w;
import p113k.C1901x;
import p113k.InterfaceC1845a1;
import p113k.InterfaceC1874k0;
import p113k.RunnableC1834V0;
import p113k.ViewOnClickListenerC1851c1;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* JADX INFO: renamed from: A */
    public int f3898A;

    /* JADX INFO: renamed from: B */
    public int f3899B;

    /* JADX INFO: renamed from: C */
    public final int f3900C;

    /* JADX INFO: renamed from: D */
    public CharSequence f3901D;

    /* JADX INFO: renamed from: E */
    public CharSequence f3902E;

    /* JADX INFO: renamed from: F */
    public ColorStateList f3903F;

    /* JADX INFO: renamed from: G */
    public ColorStateList f3904G;

    /* JADX INFO: renamed from: H */
    public boolean f3905H;

    /* JADX INFO: renamed from: I */
    public boolean f3906I;

    /* JADX INFO: renamed from: J */
    public final ArrayList f3907J;

    /* JADX INFO: renamed from: K */
    public final ArrayList f3908K;

    /* JADX INFO: renamed from: L */
    public final int[] f3909L;

    /* JADX INFO: renamed from: M */
    public final C0858A f3910M;

    /* JADX INFO: renamed from: N */
    public ArrayList f3911N;

    /* JADX INFO: renamed from: O */
    public final C1836W0 f3912O;

    /* JADX INFO: renamed from: P */
    public C1854d1 f3913P;

    /* JADX INFO: renamed from: Q */
    public C1873k f3914Q;

    /* JADX INFO: renamed from: R */
    public C1840Y0 f3915R;

    /* JADX INFO: renamed from: S */
    public boolean f3916S;

    /* JADX INFO: renamed from: T */
    public OnBackInvokedCallback f3917T;

    /* JADX INFO: renamed from: U */
    public OnBackInvokedDispatcher f3918U;

    /* JADX INFO: renamed from: V */
    public boolean f3919V;

    /* JADX INFO: renamed from: W */
    public final RunnableC0153b f3920W;

    /* JADX INFO: renamed from: g */
    public ActionMenuView f3921g;

    /* JADX INFO: renamed from: h */
    public C1847b0 f3922h;

    /* JADX INFO: renamed from: i */
    public C1847b0 f3923i;

    /* JADX INFO: renamed from: j */
    public C1899w f3924j;

    /* JADX INFO: renamed from: k */
    public C1901x f3925k;

    /* JADX INFO: renamed from: l */
    public final Drawable f3926l;

    /* JADX INFO: renamed from: m */
    public final CharSequence f3927m;

    /* JADX INFO: renamed from: n */
    public C1899w f3928n;

    /* JADX INFO: renamed from: o */
    public View f3929o;

    /* JADX INFO: renamed from: p */
    public Context f3930p;

    /* JADX INFO: renamed from: q */
    public int f3931q;

    /* JADX INFO: renamed from: r */
    public int f3932r;

    /* JADX INFO: renamed from: s */
    public int f3933s;

    /* JADX INFO: renamed from: t */
    public final int f3934t;

    /* JADX INFO: renamed from: u */
    public final int f3935u;

    /* JADX INFO: renamed from: v */
    public int f3936v;

    /* JADX INFO: renamed from: w */
    public int f3937w;

    /* JADX INFO: renamed from: x */
    public int f3938x;

    /* JADX INFO: renamed from: y */
    public int f3939y;

    /* JADX INFO: renamed from: z */
    public C1821O0 f3940z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f3900C = 8388627;
        this.f3907J = new ArrayList();
        this.f3908K = new ArrayList();
        this.f3909L = new int[2];
        this.f3910M = new C0858A(new RunnableC1834V0(this, 1));
        this.f3911N = new ArrayList();
        this.f3912O = new C1836W0(this);
        this.f3920W = new RunnableC0153b(19, this);
        Context context2 = getContext();
        int[] iArr = AbstractC1376a.f6117w;
        C0858A c0858aM2148Q = C0858A.m2148Q(context2, attributeSet, iArr, R.attr.toolbarStyle);
        AbstractC0016Q.m85g(this, context, iArr, attributeSet, (TypedArray) c0858aM2148Q.f3640i, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) c0858aM2148Q.f3640i;
        this.f3932r = typedArray.getResourceId(28, 0);
        this.f3933s = typedArray.getResourceId(19, 0);
        this.f3900C = typedArray.getInteger(0, 8388627);
        this.f3934t = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f3939y = dimensionPixelOffset;
        this.f3938x = dimensionPixelOffset;
        this.f3937w = dimensionPixelOffset;
        this.f3936v = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f3936v = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f3937w = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f3938x = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f3939y = dimensionPixelOffset5;
        }
        this.f3935u = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        m2347d();
        C1821O0 c1821o0 = this.f3940z;
        c1821o0.f8073h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c1821o0.f8070e = dimensionPixelSize;
            c1821o0.f8066a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c1821o0.f8071f = dimensionPixelSize2;
            c1821o0.f8067b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c1821o0.m4332a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f3898A = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f3899B = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f3926l = c0858aM2148Q.m2158F(4);
        this.f3927m = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f3930p = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableM2158F = c0858aM2148Q.m2158F(16);
        if (drawableM2158F != null) {
            setNavigationIcon(drawableM2158F);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableM2158F2 = c0858aM2148Q.m2158F(11);
        if (drawableM2158F2 != null) {
            setLogo(drawableM2158F2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(c0858aM2148Q.m2156D(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(c0858aM2148Q.m2156D(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        c0858aM2148Q.m2170S();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i3 = 0; i3 < menu.size(); i3++) {
            arrayList.add(menu.getItem(i3));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C1740h(getContext());
    }

    /* JADX INFO: renamed from: h */
    public static C1842Z0 m2340h() {
        C1842Z0 c1842z0 = new C1842Z0(-2, -2);
        c1842z0.f8116b = 0;
        c1842z0.f8115a = 8388627;
        return c1842z0;
    }

    /* JADX INFO: renamed from: i */
    public static C1842Z0 m2341i(ViewGroup.LayoutParams layoutParams) {
        boolean z3 = layoutParams instanceof C1842Z0;
        if (z3) {
            C1842Z0 c1842z0 = (C1842Z0) layoutParams;
            C1842Z0 c1842z1 = new C1842Z0(c1842z0);
            c1842z1.f8116b = 0;
            c1842z1.f8116b = c1842z0.f8116b;
            return c1842z1;
        }
        if (z3) {
            C1842Z0 c1842z2 = new C1842Z0((C1842Z0) layoutParams);
            c1842z2.f8116b = 0;
            return c1842z2;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C1842Z0 c1842z3 = new C1842Z0(layoutParams);
            c1842z3.f8116b = 0;
            return c1842z3;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C1842Z0 c1842z4 = new C1842Z0(marginLayoutParams);
        c1842z4.f8116b = 0;
        ((ViewGroup.MarginLayoutParams) c1842z4).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c1842z4).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c1842z4).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c1842z4).bottomMargin = marginLayoutParams.bottomMargin;
        return c1842z4;
    }

    /* JADX INFO: renamed from: k */
    public static int m2342k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* JADX INFO: renamed from: l */
    public static int m2343l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: a */
    public final void m2344a(int i3, ArrayList arrayList) {
        boolean z3 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i3, getLayoutDirection());
        arrayList.clear();
        if (!z3) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                C1842Z0 c1842z0 = (C1842Z0) childAt.getLayoutParams();
                if (c1842z0.f8116b == 0 && m2358s(childAt)) {
                    int i5 = c1842z0.f8115a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i6 = childCount - 1; i6 >= 0; i6--) {
            View childAt2 = getChildAt(i6);
            C1842Z0 c1842z1 = (C1842Z0) childAt2.getLayoutParams();
            if (c1842z1.f8116b == 0 && m2358s(childAt2)) {
                int i7 = c1842z1.f8115a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i7, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2345b(View view, boolean z3) {
        C1842Z0 c1842z0M2341i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c1842z0M2341i = m2340h();
        } else {
            c1842z0M2341i = !checkLayoutParams(layoutParams) ? m2341i(layoutParams) : (C1842Z0) layoutParams;
        }
        c1842z0M2341i.f8116b = 1;
        if (!z3 || this.f3929o == null) {
            addView(view, c1842z0M2341i);
        } else {
            view.setLayoutParams(c1842z0M2341i);
            this.f3908K.add(view);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2346c() {
        if (this.f3928n == null) {
            C1899w c1899w = new C1899w(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f3928n = c1899w;
            c1899w.setImageDrawable(this.f3926l);
            this.f3928n.setContentDescription(this.f3927m);
            C1842Z0 c1842z0M2340h = m2340h();
            c1842z0M2340h.f8115a = (this.f3934t & 112) | 8388611;
            c1842z0M2340h.f8116b = 2;
            this.f3928n.setLayoutParams(c1842z0M2340h);
            this.f3928n.setOnClickListener(new ViewOnClickListenerC1086O(3, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C1842Z0);
    }

    /* JADX INFO: renamed from: d */
    public final void m2347d() {
        if (this.f3940z == null) {
            C1821O0 c1821o0 = new C1821O0();
            c1821o0.f8066a = 0;
            c1821o0.f8067b = 0;
            c1821o0.f8068c = Integer.MIN_VALUE;
            c1821o0.f8069d = Integer.MIN_VALUE;
            c1821o0.f8070e = 0;
            c1821o0.f8071f = 0;
            c1821o0.f8072g = false;
            c1821o0.f8073h = false;
            this.f3940z = c1821o0;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2348e() {
        m2349f();
        ActionMenuView actionMenuView = this.f3921g;
        if (actionMenuView.f3878v == null) {
            MenuC1772m menuC1772m = (MenuC1772m) actionMenuView.getMenu();
            if (this.f3915R == null) {
                this.f3915R = new C1840Y0(this);
            }
            this.f3921g.setExpandedActionViewsExclusive(true);
            menuC1772m.m4252b(this.f3915R, this.f3930p);
            m2359t();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2349f() {
        if (this.f3921g == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f3921g = actionMenuView;
            actionMenuView.setPopupTheme(this.f3931q);
            this.f3921g.setOnMenuItemClickListener(this.f3912O);
            ActionMenuView actionMenuView2 = this.f3921g;
            C1836W0 c1836w0 = new C1836W0(this);
            actionMenuView2.getClass();
            actionMenuView2.f3872A = c1836w0;
            C1842Z0 c1842z0M2340h = m2340h();
            c1842z0M2340h.f8115a = (this.f3934t & 112) | 8388613;
            this.f3921g.setLayoutParams(c1842z0M2340h);
            m2345b(this.f3921g, false);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2350g() {
        if (this.f3924j == null) {
            this.f3924j = new C1899w(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C1842Z0 c1842z0M2340h = m2340h();
            c1842z0M2340h.f8115a = (this.f3934t & 112) | 8388611;
            this.f3924j.setLayoutParams(c1842z0M2340h);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m2340h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m2341i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C1899w c1899w = this.f3928n;
        if (c1899w != null) {
            return c1899w.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C1899w c1899w = this.f3928n;
        if (c1899w != null) {
            return c1899w.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C1821O0 c1821o0 = this.f3940z;
        if (c1821o0 != null) {
            return c1821o0.f8072g ? c1821o0.f8066a : c1821o0.f8067b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i3 = this.f3899B;
        return i3 != Integer.MIN_VALUE ? i3 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C1821O0 c1821o0 = this.f3940z;
        if (c1821o0 != null) {
            return c1821o0.f8066a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C1821O0 c1821o0 = this.f3940z;
        if (c1821o0 != null) {
            return c1821o0.f8067b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C1821O0 c1821o0 = this.f3940z;
        if (c1821o0 != null) {
            return c1821o0.f8072g ? c1821o0.f8067b : c1821o0.f8066a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i3 = this.f3898A;
        return i3 != Integer.MIN_VALUE ? i3 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC1772m menuC1772m;
        ActionMenuView actionMenuView = this.f3921g;
        return (actionMenuView == null || (menuC1772m = actionMenuView.f3878v) == null || !menuC1772m.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f3899B, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f3898A, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C1901x c1901x = this.f3925k;
        if (c1901x != null) {
            return c1901x.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C1901x c1901x = this.f3925k;
        if (c1901x != null) {
            return c1901x.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m2348e();
        return this.f3921g.getMenu();
    }

    public View getNavButtonView() {
        return this.f3924j;
    }

    public CharSequence getNavigationContentDescription() {
        C1899w c1899w = this.f3924j;
        if (c1899w != null) {
            return c1899w.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C1899w c1899w = this.f3924j;
        if (c1899w != null) {
            return c1899w.getDrawable();
        }
        return null;
    }

    public C1873k getOuterActionMenuPresenter() {
        return this.f3914Q;
    }

    public Drawable getOverflowIcon() {
        m2348e();
        return this.f3921g.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f3930p;
    }

    public int getPopupTheme() {
        return this.f3931q;
    }

    public CharSequence getSubtitle() {
        return this.f3902E;
    }

    public final TextView getSubtitleTextView() {
        return this.f3923i;
    }

    public CharSequence getTitle() {
        return this.f3901D;
    }

    public int getTitleMarginBottom() {
        return this.f3939y;
    }

    public int getTitleMarginEnd() {
        return this.f3937w;
    }

    public int getTitleMarginStart() {
        return this.f3936v;
    }

    public int getTitleMarginTop() {
        return this.f3938x;
    }

    public final TextView getTitleTextView() {
        return this.f3922h;
    }

    public InterfaceC1874k0 getWrapper() {
        Drawable drawable;
        if (this.f3913P == null) {
            C1854d1 c1854d1 = new C1854d1();
            c1854d1.f8148n = 0;
            c1854d1.f8135a = this;
            c1854d1.f8142h = getTitle();
            c1854d1.f8143i = getSubtitle();
            c1854d1.f8141g = c1854d1.f8142h != null;
            c1854d1.f8140f = getNavigationIcon();
            C0858A c0858aM2148Q = C0858A.m2148Q(getContext(), null, AbstractC1376a.f6095a, R.attr.actionBarStyle);
            c1854d1.f8149o = c0858aM2148Q.m2158F(15);
            TypedArray typedArray = (TypedArray) c0858aM2148Q.f3640i;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                c1854d1.f8141g = true;
                c1854d1.f8142h = text;
                if ((c1854d1.f8136b & 8) != 0) {
                    Toolbar toolbar = c1854d1.f8135a;
                    toolbar.setTitle(text);
                    if (c1854d1.f8141g) {
                        AbstractC0016Q.m87i(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                c1854d1.f8143i = text2;
                if ((c1854d1.f8136b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableM2158F = c0858aM2148Q.m2158F(20);
            if (drawableM2158F != null) {
                c1854d1.f8139e = drawableM2158F;
                c1854d1.m4374c();
            }
            Drawable drawableM2158F2 = c0858aM2148Q.m2158F(17);
            if (drawableM2158F2 != null) {
                c1854d1.f8138d = drawableM2158F2;
                c1854d1.m4374c();
            }
            if (c1854d1.f8140f == null && (drawable = c1854d1.f8149o) != null) {
                c1854d1.f8140f = drawable;
                int i3 = c1854d1.f8136b & 4;
                Toolbar toolbar2 = c1854d1.f8135a;
                if (i3 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            c1854d1.m4372a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = c1854d1.f8137c;
                if (view != null && (c1854d1.f8136b & 16) != 0) {
                    removeView(view);
                }
                c1854d1.f8137c = viewInflate;
                if (viewInflate != null && (c1854d1.f8136b & 16) != 0) {
                    addView(viewInflate);
                }
                c1854d1.m4372a(c1854d1.f8136b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                m2347d();
                this.f3940z.m4332a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f3932r = resourceId2;
                C1847b0 c1847b0 = this.f3922h;
                if (c1847b0 != null) {
                    c1847b0.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f3933s = resourceId3;
                C1847b0 c1847b1 = this.f3923i;
                if (c1847b1 != null) {
                    c1847b1.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            c0858aM2148Q.m2170S();
            if (R.string.abc_action_bar_up_description != c1854d1.f8148n) {
                c1854d1.f8148n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i4 = c1854d1.f8148n;
                    c1854d1.f8144j = i4 != 0 ? getContext().getString(i4) : null;
                    c1854d1.m4373b();
                }
            }
            c1854d1.f8144j = getNavigationContentDescription();
            setNavigationOnClickListener(new ViewOnClickListenerC1851c1(c1854d1));
            this.f3913P = c1854d1;
        }
        return this.f3913P;
    }

    /* JADX INFO: renamed from: j */
    public final int m2351j(View view, int i3) {
        C1842Z0 c1842z0 = (C1842Z0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i3 > 0 ? (measuredHeight - i3) / 2 : 0;
        int i5 = c1842z0.f8115a & 112;
        if (i5 != 16 && i5 != 48 && i5 != 80) {
            i5 = this.f3900C & 112;
        }
        if (i5 == 48) {
            return getPaddingTop() - i4;
        }
        if (i5 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c1842z0).bottomMargin) - i4;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i6 = ((ViewGroup.MarginLayoutParams) c1842z0).topMargin;
        if (iMax < i6) {
            iMax = i6;
        } else {
            int i7 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i8 = ((ViewGroup.MarginLayoutParams) c1842z0).bottomMargin;
            if (i7 < i8) {
                iMax = Math.max(0, iMax - (i8 - i7));
            }
        }
        return paddingTop + iMax;
    }

    /* JADX INFO: renamed from: m */
    public final void m2352m() {
        ArrayList arrayList = this.f3911N;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f3910M.f3640i).iterator();
        while (it.hasNext()) {
            ((C0971v) it.next()).f4266a.m2466j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f3911N = currentMenuItems2;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m2353n(View view) {
        return view.getParent() == this || this.f3908K.contains(view);
    }

    /* JADX INFO: renamed from: o */
    public final int m2354o(View view, int i3, int i4, int[] iArr) {
        C1842Z0 c1842z0 = (C1842Z0) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) c1842z0).leftMargin - iArr[0];
        int iMax = Math.max(0, i5) + i3;
        iArr[0] = Math.max(0, -i5);
        int iM2351j = m2351j(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM2351j, iMax + measuredWidth, view.getMeasuredHeight() + iM2351j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c1842z0).rightMargin + iMax;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2359t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f3920W);
        m2359t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3906I = false;
        }
        if (!this.f3906I) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f3906I = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f3906I = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x027d  */
    /* JADX WARN: Code duplicated, block: B:103:0x028f A[LOOP:0: B:102:0x028d->B:103:0x028f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x02a7 A[LOOP:1: B:105:0x02a5->B:106:0x02a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x02c7 A[LOOP:2: B:108:0x02c5->B:109:0x02c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x030a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x030c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0310  */
    /* JADX WARN: Code duplicated, block: B:118:0x0317 A[LOOP:3: B:117:0x0315->B:118:0x0317, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x011f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0127  */
    /* JADX WARN: Code duplicated, block: B:48:0x012a  */
    /* JADX WARN: Code duplicated, block: B:50:0x012e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0131  */
    /* JADX WARN: Code duplicated, block: B:54:0x0143  */
    /* JADX WARN: Code duplicated, block: B:56:0x014b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x0164  */
    /* JADX WARN: Code duplicated, block: B:65:0x0168  */
    /* JADX WARN: Code duplicated, block: B:67:0x0179  */
    /* JADX WARN: Code duplicated, block: B:68:0x017b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0187  */
    /* JADX WARN: Code duplicated, block: B:72:0x0193  */
    /* JADX WARN: Code duplicated, block: B:73:0x019d  */
    /* JADX WARN: Code duplicated, block: B:75:0x01aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:77:0x01af  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x020d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0210  */
    /* JADX WARN: Code duplicated, block: B:88:0x0218 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x021a  */
    /* JADX WARN: Code duplicated, block: B:91:0x021e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0232  */
    /* JADX WARN: Code duplicated, block: B:95:0x0255  */
    /* JADX WARN: Code duplicated, block: B:97:0x0258  */
    /* JADX WARN: Code duplicated, block: B:98:0x027a  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int iM2354o;
        int iM2355p;
        int iMax;
        int iMin;
        boolean zM2358s;
        boolean zM2358s2;
        int measuredHeight;
        C1847b0 c1847b0;
        C1847b0 c1847b1;
        C1842Z0 c1842z0;
        C1842Z0 c1842z1;
        int i7;
        boolean z4;
        int i8;
        int i9;
        int paddingTop;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int iMax2;
        int i16;
        int i17;
        int i18;
        int i19;
        ArrayList arrayList;
        int size;
        int iM2354o2;
        int i20;
        int size2;
        int i21;
        int size3;
        int i22;
        int i23;
        int i24;
        int measuredWidth;
        int i25;
        int i26;
        int i27;
        int size4;
        boolean z5 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i28 = width - paddingRight;
        int[] iArr = this.f3909L;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = AbstractC0016Q.f14a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i6 - i4) : 0;
        if (m2358s(this.f3924j)) {
            if (z5) {
                iM2355p = m2355p(this.f3924j, i28, iMin2, iArr);
                iM2354o = paddingLeft;
            } else {
                iM2354o = m2354o(this.f3924j, paddingLeft, iMin2, iArr);
            }
            if (m2358s(this.f3928n)) {
                if (z5) {
                    iM2355p = m2355p(this.f3928n, iM2355p, iMin2, iArr);
                } else {
                    iM2354o = m2354o(this.f3928n, iM2354o, iMin2, iArr);
                }
            }
            if (m2358s(this.f3921g)) {
                if (z5) {
                    iM2354o = m2354o(this.f3921g, iM2354o, iMin2, iArr);
                } else {
                    iM2355p = m2355p(this.f3921g, iM2355p, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iM2354o);
            iArr[1] = Math.max(0, currentContentInsetRight - (i28 - iM2355p));
            iMax = Math.max(iM2354o, currentContentInsetLeft);
            iMin = Math.min(iM2355p, i28 - currentContentInsetRight);
            if (m2358s(this.f3929o)) {
                if (z5) {
                    iMin = m2355p(this.f3929o, iMin, iMin2, iArr);
                } else {
                    iMax = m2354o(this.f3929o, iMax, iMin2, iArr);
                }
            }
            if (m2358s(this.f3925k)) {
                if (z5) {
                    iMin = m2355p(this.f3925k, iMin, iMin2, iArr);
                } else {
                    iMax = m2354o(this.f3925k, iMax, iMin2, iArr);
                }
            }
            zM2358s = m2358s(this.f3922h);
            zM2358s2 = m2358s(this.f3923i);
            if (zM2358s) {
                C1842Z0 c1842z2 = (C1842Z0) this.f3922h.getLayoutParams();
                measuredHeight = this.f3922h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1842z2).topMargin + ((ViewGroup.MarginLayoutParams) c1842z2).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zM2358s2) {
                C1842Z0 c1842z3 = (C1842Z0) this.f3923i.getLayoutParams();
                measuredHeight = this.f3923i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1842z3).topMargin + ((ViewGroup.MarginLayoutParams) c1842z3).bottomMargin + measuredHeight;
            }
            if (zM2358s || zM2358s2) {
                if (zM2358s) {
                    c1847b0 = this.f3922h;
                } else {
                    c1847b0 = this.f3923i;
                }
                if (zM2358s2) {
                    c1847b1 = this.f3923i;
                } else {
                    c1847b1 = this.f3922h;
                }
                c1842z0 = (C1842Z0) c1847b0.getLayoutParams();
                c1842z1 = (C1842Z0) c1847b1.getLayoutParams();
                i7 = measuredHeight;
                z4 = (!zM2358s && this.f3922h.getMeasuredWidth() > 0) || (zM2358s2 && this.f3923i.getMeasuredWidth() > 0);
                i8 = this.f3900C & 112;
                i9 = iMax;
                if (i8 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1842z0).topMargin + this.f3938x;
                } else if (i8 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i7) / 2;
                    i16 = ((ViewGroup.MarginLayoutParams) c1842z0).topMargin + this.f3938x;
                    if (iMax2 < i16) {
                        iMax2 = i16;
                    } else {
                        i17 = (((height - paddingBottom) - i7) - iMax2) - paddingTop2;
                        i18 = ((ViewGroup.MarginLayoutParams) c1842z0).bottomMargin;
                        i19 = this.f3939y;
                        if (i17 < i18 + i19) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c1842z1).bottomMargin + i19) - i17));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c1842z1).bottomMargin) - this.f3939y) - i7;
                }
                if (z5) {
                    if (z4) {
                        i13 = this.f3936v;
                    } else {
                        i13 = 0;
                    }
                    int i29 = i13 - iArr[1];
                    iMin -= Math.max(0, i29);
                    iArr[1] = Math.max(0, -i29);
                    if (zM2358s) {
                        C1842Z0 c1842z4 = (C1842Z0) this.f3922h.getLayoutParams();
                        int measuredWidth2 = iMin - this.f3922h.getMeasuredWidth();
                        int measuredHeight2 = this.f3922h.getMeasuredHeight() + paddingTop;
                        this.f3922h.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i14 = measuredWidth2 - this.f3937w;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c1842z4).bottomMargin;
                    } else {
                        i14 = iMin;
                    }
                    if (zM2358s2) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1842Z0) this.f3923i.getLayoutParams())).topMargin;
                        this.f3923i.layout(iMin - this.f3923i.getMeasuredWidth(), i30, iMin, this.f3923i.getMeasuredHeight() + i30);
                        i15 = iMin - this.f3937w;
                    } else {
                        i15 = iMin;
                    }
                    if (z4) {
                        iMin = Math.min(i14, i15);
                    }
                    iMax = i9;
                } else {
                    if (z4) {
                        i10 = this.f3936v;
                    } else {
                        i10 = 0;
                    }
                    int i31 = i10 - iArr[0];
                    iMax = Math.max(0, i31) + i9;
                    iArr[0] = Math.max(0, -i31);
                    if (zM2358s) {
                        C1842Z0 c1842z5 = (C1842Z0) this.f3922h.getLayoutParams();
                        int measuredWidth3 = this.f3922h.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f3922h.getMeasuredHeight() + paddingTop;
                        this.f3922h.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i11 = measuredWidth3 + this.f3937w;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c1842z5).bottomMargin;
                    } else {
                        i11 = iMax;
                    }
                    if (zM2358s2) {
                        int i32 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1842Z0) this.f3923i.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f3923i.getMeasuredWidth() + iMax;
                        this.f3923i.layout(iMax, i32, measuredWidth4, this.f3923i.getMeasuredHeight() + i32);
                        i12 = measuredWidth4 + this.f3937w;
                    } else {
                        i12 = iMax;
                    }
                    if (z4) {
                        iMax = Math.max(i11, i12);
                    }
                }
            }
            arrayList = this.f3907J;
            m2344a(3, arrayList);
            size = arrayList.size();
            iM2354o2 = iMax;
            for (i20 = 0; i20 < size; i20++) {
                iM2354o2 = m2354o((View) arrayList.get(i20), iM2354o2, iMin2, iArr);
            }
            m2344a(5, arrayList);
            size2 = arrayList.size();
            for (i21 = 0; i21 < size2; i21++) {
                iMin = m2355p((View) arrayList.get(i21), iMin, iMin2, iArr);
            }
            m2344a(1, arrayList);
            int i33 = iArr[0];
            int i34 = iArr[1];
            size3 = arrayList.size();
            i22 = i34;
            i23 = i33;
            i24 = 0;
            measuredWidth = 0;
            while (i24 < size3) {
                View view = (View) arrayList.get(i24);
                C1842Z0 c1842z6 = (C1842Z0) view.getLayoutParams();
                int i35 = i24;
                int i36 = ((ViewGroup.MarginLayoutParams) c1842z6).leftMargin - i23;
                int i37 = ((ViewGroup.MarginLayoutParams) c1842z6).rightMargin - i22;
                int iMax3 = Math.max(0, i36);
                int iMax4 = Math.max(0, i37);
                int iMax5 = Math.max(0, -i36);
                int iMax6 = Math.max(0, -i37);
                measuredWidth += view.getMeasuredWidth() + iMax3 + iMax4;
                i22 = iMax6;
                i23 = iMax5;
                i24 = i35 + 1;
            }
            i26 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i27 = measuredWidth + i26;
            if (i26 >= iM2354o2) {
                if (i27 > iMin) {
                    iM2354o2 = i26 - (i27 - iMin);
                } else {
                    iM2354o2 = i26;
                }
            }
            size4 = arrayList.size();
            for (i25 = 0; i25 < size4; i25++) {
                iM2354o2 = m2354o((View) arrayList.get(i25), iM2354o2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iM2354o = paddingLeft;
        iM2355p = i28;
        if (m2358s(this.f3928n)) {
            if (z5) {
                iM2355p = m2355p(this.f3928n, iM2355p, iMin2, iArr);
            } else {
                iM2354o = m2354o(this.f3928n, iM2354o, iMin2, iArr);
            }
        }
        if (m2358s(this.f3921g)) {
            if (z5) {
                iM2354o = m2354o(this.f3921g, iM2354o, iMin2, iArr);
            } else {
                iM2355p = m2355p(this.f3921g, iM2355p, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iM2354o);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i28 - iM2355p));
        iMax = Math.max(iM2354o, currentContentInsetLeft2);
        iMin = Math.min(iM2355p, i28 - currentContentInsetRight2);
        if (m2358s(this.f3929o)) {
            if (z5) {
                iMin = m2355p(this.f3929o, iMin, iMin2, iArr);
            } else {
                iMax = m2354o(this.f3929o, iMax, iMin2, iArr);
            }
        }
        if (m2358s(this.f3925k)) {
            if (z5) {
                iMin = m2355p(this.f3925k, iMin, iMin2, iArr);
            } else {
                iMax = m2354o(this.f3925k, iMax, iMin2, iArr);
            }
        }
        zM2358s = m2358s(this.f3922h);
        zM2358s2 = m2358s(this.f3923i);
        if (zM2358s) {
            C1842Z0 c1842z7 = (C1842Z0) this.f3922h.getLayoutParams();
            measuredHeight = this.f3922h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1842z7).topMargin + ((ViewGroup.MarginLayoutParams) c1842z7).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zM2358s2) {
            C1842Z0 c1842z8 = (C1842Z0) this.f3923i.getLayoutParams();
            measuredHeight = this.f3923i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1842z8).topMargin + ((ViewGroup.MarginLayoutParams) c1842z8).bottomMargin + measuredHeight;
        }
        if (zM2358s) {
            if (zM2358s) {
                c1847b0 = this.f3922h;
            } else {
                c1847b0 = this.f3923i;
            }
            if (zM2358s2) {
                c1847b1 = this.f3923i;
            } else {
                c1847b1 = this.f3922h;
            }
            c1842z0 = (C1842Z0) c1847b0.getLayoutParams();
            c1842z1 = (C1842Z0) c1847b1.getLayoutParams();
            i7 = measuredHeight;
            if (zM2358s) {
            }
            i8 = this.f3900C & 112;
            i9 = iMax;
            if (i8 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1842z0).topMargin + this.f3938x;
            } else if (i8 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i7) / 2;
                i16 = ((ViewGroup.MarginLayoutParams) c1842z0).topMargin + this.f3938x;
                if (iMax2 < i16) {
                    iMax2 = i16;
                } else {
                    i17 = (((height - paddingBottom) - i7) - iMax2) - paddingTop2;
                    i18 = ((ViewGroup.MarginLayoutParams) c1842z0).bottomMargin;
                    i19 = this.f3939y;
                    if (i17 < i18 + i19) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c1842z1).bottomMargin + i19) - i17));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c1842z1).bottomMargin) - this.f3939y) - i7;
            }
            if (z5) {
                if (z4) {
                    i13 = this.f3936v;
                } else {
                    i13 = 0;
                }
                int i210 = i13 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zM2358s) {
                    C1842Z0 c1842z9 = (C1842Z0) this.f3922h.getLayoutParams();
                    int measuredWidth5 = iMin - this.f3922h.getMeasuredWidth();
                    int measuredHeight4 = this.f3922h.getMeasuredHeight() + paddingTop;
                    this.f3922h.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i14 = measuredWidth5 - this.f3937w;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) c1842z9).bottomMargin;
                } else {
                    i14 = iMin;
                }
                if (zM2358s2) {
                    int i38 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1842Z0) this.f3923i.getLayoutParams())).topMargin;
                    this.f3923i.layout(iMin - this.f3923i.getMeasuredWidth(), i38, iMin, this.f3923i.getMeasuredHeight() + i38);
                    i15 = iMin - this.f3937w;
                } else {
                    i15 = iMin;
                }
                if (z4) {
                    iMin = Math.min(i14, i15);
                }
                iMax = i9;
            } else {
                if (z4) {
                    i10 = this.f3936v;
                } else {
                    i10 = 0;
                }
                int i39 = i10 - iArr[0];
                iMax = Math.max(0, i39) + i9;
                iArr[0] = Math.max(0, -i39);
                if (zM2358s) {
                    C1842Z0 c1842z10 = (C1842Z0) this.f3922h.getLayoutParams();
                    int measuredWidth6 = this.f3922h.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f3922h.getMeasuredHeight() + paddingTop;
                    this.f3922h.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i11 = measuredWidth6 + this.f3937w;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) c1842z10).bottomMargin;
                } else {
                    i11 = iMax;
                }
                if (zM2358s2) {
                    int i310 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1842Z0) this.f3923i.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f3923i.getMeasuredWidth() + iMax;
                    this.f3923i.layout(iMax, i310, measuredWidth7, this.f3923i.getMeasuredHeight() + i310);
                    i12 = measuredWidth7 + this.f3937w;
                } else {
                    i12 = iMax;
                }
                if (z4) {
                    iMax = Math.max(i11, i12);
                }
            }
        } else {
            if (zM2358s) {
                c1847b0 = this.f3922h;
            } else {
                c1847b0 = this.f3923i;
            }
            if (zM2358s2) {
                c1847b1 = this.f3923i;
            } else {
                c1847b1 = this.f3922h;
            }
            c1842z0 = (C1842Z0) c1847b0.getLayoutParams();
            c1842z1 = (C1842Z0) c1847b1.getLayoutParams();
            i7 = measuredHeight;
            if (zM2358s) {
            }
            i8 = this.f3900C & 112;
            i9 = iMax;
            if (i8 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1842z0).topMargin + this.f3938x;
            } else if (i8 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i7) / 2;
                i16 = ((ViewGroup.MarginLayoutParams) c1842z0).topMargin + this.f3938x;
                if (iMax2 < i16) {
                    iMax2 = i16;
                } else {
                    i17 = (((height - paddingBottom) - i7) - iMax2) - paddingTop2;
                    i18 = ((ViewGroup.MarginLayoutParams) c1842z0).bottomMargin;
                    i19 = this.f3939y;
                    if (i17 < i18 + i19) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c1842z1).bottomMargin + i19) - i17));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c1842z1).bottomMargin) - this.f3939y) - i7;
            }
            if (z5) {
                if (z4) {
                    i13 = this.f3936v;
                } else {
                    i13 = 0;
                }
                int i211 = i13 - iArr[1];
                iMin -= Math.max(0, i211);
                iArr[1] = Math.max(0, -i211);
                if (zM2358s) {
                    C1842Z0 c1842z11 = (C1842Z0) this.f3922h.getLayoutParams();
                    int measuredWidth8 = iMin - this.f3922h.getMeasuredWidth();
                    int measuredHeight6 = this.f3922h.getMeasuredHeight() + paddingTop;
                    this.f3922h.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i14 = measuredWidth8 - this.f3937w;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) c1842z11).bottomMargin;
                } else {
                    i14 = iMin;
                }
                if (zM2358s2) {
                    int i311 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1842Z0) this.f3923i.getLayoutParams())).topMargin;
                    this.f3923i.layout(iMin - this.f3923i.getMeasuredWidth(), i311, iMin, this.f3923i.getMeasuredHeight() + i311);
                    i15 = iMin - this.f3937w;
                } else {
                    i15 = iMin;
                }
                if (z4) {
                    iMin = Math.min(i14, i15);
                }
                iMax = i9;
            } else {
                if (z4) {
                    i10 = this.f3936v;
                } else {
                    i10 = 0;
                }
                int i312 = i10 - iArr[0];
                iMax = Math.max(0, i312) + i9;
                iArr[0] = Math.max(0, -i312);
                if (zM2358s) {
                    C1842Z0 c1842z12 = (C1842Z0) this.f3922h.getLayoutParams();
                    int measuredWidth9 = this.f3922h.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f3922h.getMeasuredHeight() + paddingTop;
                    this.f3922h.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i11 = measuredWidth9 + this.f3937w;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) c1842z12).bottomMargin;
                } else {
                    i11 = iMax;
                }
                if (zM2358s2) {
                    int i313 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1842Z0) this.f3923i.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f3923i.getMeasuredWidth() + iMax;
                    this.f3923i.layout(iMax, i313, measuredWidth10, this.f3923i.getMeasuredHeight() + i313);
                    i12 = measuredWidth10 + this.f3937w;
                } else {
                    i12 = iMax;
                }
                if (z4) {
                    iMax = Math.max(i11, i12);
                }
            }
        }
        arrayList = this.f3907J;
        m2344a(3, arrayList);
        size = arrayList.size();
        iM2354o2 = iMax;
        while (i20 < size) {
            iM2354o2 = m2354o((View) arrayList.get(i20), iM2354o2, iMin2, iArr);
        }
        m2344a(5, arrayList);
        size2 = arrayList.size();
        while (i21 < size2) {
            iMin = m2355p((View) arrayList.get(i21), iMin, iMin2, iArr);
        }
        m2344a(1, arrayList);
        int i314 = iArr[0];
        int i315 = iArr[1];
        size3 = arrayList.size();
        i22 = i315;
        i23 = i314;
        i24 = 0;
        measuredWidth = 0;
        while (i24 < size3) {
            View view2 = (View) arrayList.get(i24);
            C1842Z0 c1842z13 = (C1842Z0) view2.getLayoutParams();
            int i316 = i24;
            int i317 = ((ViewGroup.MarginLayoutParams) c1842z13).leftMargin - i23;
            int i318 = ((ViewGroup.MarginLayoutParams) c1842z13).rightMargin - i22;
            int iMax7 = Math.max(0, i317);
            int iMax8 = Math.max(0, i318);
            int iMax9 = Math.max(0, -i317);
            int iMax10 = Math.max(0, -i318);
            measuredWidth += view2.getMeasuredWidth() + iMax7 + iMax8;
            i22 = iMax10;
            i23 = iMax9;
            i24 = i316 + 1;
        }
        i26 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i27 = measuredWidth + i26;
        if (i26 >= iM2354o2) {
            if (i27 > iMin) {
                iM2354o2 = i26 - (i27 - iMin);
            } else {
                iM2354o2 = i26;
            }
        }
        size4 = arrayList.size();
        while (i25 < size4) {
            iM2354o2 = m2354o((View) arrayList.get(i25), iM2354o2, iMin2, iArr);
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        boolean z3;
        char c;
        int iM2342k;
        int iMax;
        int iCombineMeasuredStates;
        int iM2342k2;
        int iCombineMeasuredStates2;
        int iMax2;
        int iM2343l;
        boolean z4 = AbstractC1878l1.f8219a;
        int i5 = 0;
        if (getLayoutDirection() == 1) {
            z3 = true;
            c = 0;
        } else {
            z3 = false;
            c = 1;
        }
        if (m2358s(this.f3924j)) {
            m2357r(this.f3924j, i3, 0, i4, this.f3935u);
            iM2342k = m2342k(this.f3924j) + this.f3924j.getMeasuredWidth();
            iMax = Math.max(0, m2343l(this.f3924j) + this.f3924j.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f3924j.getMeasuredState());
        } else {
            iM2342k = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m2358s(this.f3928n)) {
            m2357r(this.f3928n, i3, 0, i4, this.f3935u);
            iM2342k = m2342k(this.f3928n) + this.f3928n.getMeasuredWidth();
            iMax = Math.max(iMax, m2343l(this.f3928n) + this.f3928n.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3928n.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM2342k);
        int iMax4 = Math.max(0, currentContentInsetStart - iM2342k);
        boolean z5 = z3;
        int[] iArr = this.f3909L;
        iArr[z5 ? 1 : 0] = iMax4;
        if (m2358s(this.f3921g)) {
            m2357r(this.f3921g, i3, iMax3, i4, this.f3935u);
            iM2342k2 = m2342k(this.f3921g) + this.f3921g.getMeasuredWidth();
            iMax = Math.max(iMax, m2343l(this.f3921g) + this.f3921g.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3921g.getMeasuredState());
        } else {
            iM2342k2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iM2342k2);
        iArr[c] = Math.max(0, currentContentInsetEnd - iM2342k2);
        if (m2358s(this.f3929o)) {
            iMax5 += m2356q(this.f3929o, i3, iMax5, i4, 0, iArr);
            iMax = Math.max(iMax, m2343l(this.f3929o) + this.f3929o.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3929o.getMeasuredState());
        }
        if (m2358s(this.f3925k)) {
            iMax5 += m2356q(this.f3925k, i3, iMax5, i4, 0, iArr);
            iMax = Math.max(iMax, m2343l(this.f3925k) + this.f3925k.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3925k.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (((C1842Z0) childAt.getLayoutParams()).f8116b == 0 && m2358s(childAt)) {
                iMax5 += m2356q(childAt, i3, iMax5, i4, 0, iArr);
                int iMax6 = Math.max(iMax, m2343l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i7 = iMax5;
        int i8 = this.f3938x + this.f3939y;
        int i9 = this.f3936v + this.f3937w;
        if (m2358s(this.f3922h)) {
            m2356q(this.f3922h, i3, i7 + i9, i4, i8, iArr);
            int iM2342k3 = m2342k(this.f3922h) + this.f3922h.getMeasuredWidth();
            iM2343l = m2343l(this.f3922h) + this.f3922h.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f3922h.getMeasuredState());
            iMax2 = iM2342k3;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
            iM2343l = 0;
        }
        if (m2358s(this.f3923i)) {
            iMax2 = Math.max(iMax2, m2356q(this.f3923i, i3, i7 + i9, i4, i8 + iM2343l, iArr));
            iM2343l += m2343l(this.f3923i) + this.f3923i.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f3923i.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iM2343l);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i7 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i3, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i4, iCombineMeasuredStates2 << 16);
        if (!this.f3916S) {
            i5 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i10 = 0; i10 < childCount2; i10++) {
            View childAt2 = getChildAt(i10);
            if (m2358s(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i5 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i5);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof C1848b1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1848b1 c1848b1 = (C1848b1) parcelable;
        super.onRestoreInstanceState(c1848b1.f650g);
        ActionMenuView actionMenuView = this.f3921g;
        MenuC1772m menuC1772m = actionMenuView != null ? actionMenuView.f3878v : null;
        int i3 = c1848b1.f8129i;
        if (i3 != 0 && this.f3915R != null && menuC1772m != null && (menuItemFindItem = menuC1772m.findItem(i3)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c1848b1.f8130j) {
            RunnableC0153b runnableC0153b = this.f3920W;
            removeCallbacks(runnableC0153b);
            post(runnableC0153b);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i3) {
        super.onRtlPropertiesChanged(i3);
        m2347d();
        C1821O0 c1821o0 = this.f3940z;
        boolean z3 = i3 == 1;
        if (z3 == c1821o0.f8072g) {
            return;
        }
        c1821o0.f8072g = z3;
        if (!c1821o0.f8073h) {
            c1821o0.f8066a = c1821o0.f8070e;
            c1821o0.f8067b = c1821o0.f8071f;
            return;
        }
        if (z3) {
            int i4 = c1821o0.f8069d;
            if (i4 == Integer.MIN_VALUE) {
                i4 = c1821o0.f8070e;
            }
            c1821o0.f8066a = i4;
            int i5 = c1821o0.f8068c;
            if (i5 == Integer.MIN_VALUE) {
                i5 = c1821o0.f8071f;
            }
            c1821o0.f8067b = i5;
            return;
        }
        int i6 = c1821o0.f8068c;
        if (i6 == Integer.MIN_VALUE) {
            i6 = c1821o0.f8070e;
        }
        c1821o0.f8066a = i6;
        int i7 = c1821o0.f8069d;
        if (i7 == Integer.MIN_VALUE) {
            i7 = c1821o0.f8071f;
        }
        c1821o0.f8067b = i7;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1873k c1873k;
        C1774o c1774o;
        C1848b1 c1848b1 = new C1848b1(super.onSaveInstanceState());
        C1840Y0 c1840y0 = this.f3915R;
        if (c1840y0 != null && (c1774o = c1840y0.f8112h) != null) {
            c1848b1.f8129i = c1774o.f7925a;
        }
        ActionMenuView actionMenuView = this.f3921g;
        c1848b1.f8130j = (actionMenuView == null || (c1873k = actionMenuView.f3882z) == null || !c1873k.m4393j()) ? false : true;
        return c1848b1;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3905H = false;
        }
        if (!this.f3905H) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f3905H = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f3905H = false;
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final int m2355p(View view, int i3, int i4, int[] iArr) {
        C1842Z0 c1842z0 = (C1842Z0) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) c1842z0).rightMargin - iArr[1];
        int iMax = i3 - Math.max(0, i5);
        iArr[1] = Math.max(0, -i5);
        int iM2351j = m2351j(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM2351j, iMax, view.getMeasuredHeight() + iM2351j);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c1842z0).leftMargin);
    }

    /* JADX INFO: renamed from: q */
    public final int m2356q(View view, int i3, int i4, int i5, int i6, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i7 = marginLayoutParams.leftMargin - iArr[0];
        int i8 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i8) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i7);
        iArr[1] = Math.max(0, -i8);
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + iMax + i4, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i5, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i6, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* JADX INFO: renamed from: r */
    public final void m2357r(View view, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i5, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m2358s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z3) {
        if (this.f3919V != z3) {
            this.f3919V = z3;
            m2359t();
        }
    }

    public void setCollapseContentDescription(int i3) {
        setCollapseContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setCollapseIcon(int i3) {
        setCollapseIcon(AbstractC0610a.m1512n(getContext(), i3));
    }

    public void setCollapsible(boolean z3) {
        this.f3916S = z3;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.f3899B) {
            this.f3899B = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.f3898A) {
            this.f3898A = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i3) {
        setLogo(AbstractC0610a.m1512n(getContext(), i3));
    }

    public void setLogoDescription(int i3) {
        setLogoDescription(getContext().getText(i3));
    }

    public void setNavigationContentDescription(int i3) {
        setNavigationContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setNavigationIcon(int i3) {
        setNavigationIcon(AbstractC0610a.m1512n(getContext(), i3));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m2350g();
        this.f3924j.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        m2348e();
        this.f3921g.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i3) {
        if (this.f3931q != i3) {
            this.f3931q = i3;
            if (i3 == 0) {
                this.f3930p = getContext();
            } else {
                this.f3930p = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setSubtitle(int i3) {
        setSubtitle(getContext().getText(i3));
    }

    public void setSubtitleTextColor(int i3) {
        setSubtitleTextColor(ColorStateList.valueOf(i3));
    }

    public void setTitle(int i3) {
        setTitle(getContext().getText(i3));
    }

    public void setTitleMarginBottom(int i3) {
        this.f3939y = i3;
        requestLayout();
    }

    public void setTitleMarginEnd(int i3) {
        this.f3937w = i3;
        requestLayout();
    }

    public void setTitleMarginStart(int i3) {
        this.f3936v = i3;
        requestLayout();
    }

    public void setTitleMarginTop(int i3) {
        this.f3938x = i3;
        requestLayout();
    }

    public void setTitleTextColor(int i3) {
        setTitleTextColor(ColorStateList.valueOf(i3));
    }

    /* JADX INFO: renamed from: t */
    public final void m2359t() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM4362a = AbstractC1838X0.m4362a(this);
            C1840Y0 c1840y0 = this.f3915R;
            boolean z3 = (c1840y0 == null || c1840y0.f8112h == null || onBackInvokedDispatcherM4362a == null || !isAttachedToWindow() || !this.f3919V) ? false : true;
            if (z3 && this.f3918U == null) {
                if (this.f3917T == null) {
                    this.f3917T = AbstractC1838X0.m4363b(new RunnableC1834V0(this, 0));
                }
                AbstractC1838X0.m4364c(onBackInvokedDispatcherM4362a, this.f3917T);
                this.f3918U = onBackInvokedDispatcherM4362a;
                return;
            }
            if (z3 || (onBackInvokedDispatcher = this.f3918U) == null) {
                return;
            }
            AbstractC1838X0.m4365d(onBackInvokedDispatcher, this.f3917T);
            this.f3918U = null;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C1842Z0 c1842z0 = new C1842Z0(context, attributeSet);
        c1842z0.f8115a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1376a.f6096b);
        c1842z0.f8115a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        c1842z0.f8116b = 0;
        return c1842z0;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m2346c();
        }
        C1899w c1899w = this.f3928n;
        if (c1899w != null) {
            c1899w.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m2346c();
            this.f3928n.setImageDrawable(drawable);
        } else {
            C1899w c1899w = this.f3928n;
            if (c1899w != null) {
                c1899w.setImageDrawable(this.f3926l);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f3925k == null) {
                this.f3925k = new C1901x(getContext(), null, 0);
            }
            if (!m2353n(this.f3925k)) {
                m2345b(this.f3925k, true);
            }
        } else {
            C1901x c1901x = this.f3925k;
            if (c1901x != null && m2353n(c1901x)) {
                removeView(this.f3925k);
                this.f3908K.remove(this.f3925k);
            }
        }
        C1901x c1901x2 = this.f3925k;
        if (c1901x2 != null) {
            c1901x2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f3925k == null) {
            this.f3925k = new C1901x(getContext(), null, 0);
        }
        C1901x c1901x = this.f3925k;
        if (c1901x != null) {
            c1901x.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m2350g();
        }
        C1899w c1899w = this.f3924j;
        if (c1899w != null) {
            c1899w.setContentDescription(charSequence);
            AbstractC0610a.m1496J(this.f3924j, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m2350g();
            if (!m2353n(this.f3924j)) {
                m2345b(this.f3924j, true);
            }
        } else {
            C1899w c1899w = this.f3924j;
            if (c1899w != null && m2353n(c1899w)) {
                removeView(this.f3924j);
                this.f3908K.remove(this.f3924j);
            }
        }
        C1899w c1899w2 = this.f3924j;
        if (c1899w2 != null) {
            c1899w2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C1847b0 c1847b0 = this.f3923i;
            if (c1847b0 != null && m2353n(c1847b0)) {
                removeView(this.f3923i);
                this.f3908K.remove(this.f3923i);
            }
        } else {
            if (this.f3923i == null) {
                Context context = getContext();
                C1847b0 c1847b1 = new C1847b0(context, null);
                this.f3923i = c1847b1;
                c1847b1.setSingleLine();
                this.f3923i.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.f3933s;
                if (i3 != 0) {
                    this.f3923i.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.f3904G;
                if (colorStateList != null) {
                    this.f3923i.setTextColor(colorStateList);
                }
            }
            if (!m2353n(this.f3923i)) {
                m2345b(this.f3923i, true);
            }
        }
        C1847b0 c1847b2 = this.f3923i;
        if (c1847b2 != null) {
            c1847b2.setText(charSequence);
        }
        this.f3902E = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f3904G = colorStateList;
        C1847b0 c1847b0 = this.f3923i;
        if (c1847b0 != null) {
            c1847b0.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C1847b0 c1847b0 = this.f3922h;
            if (c1847b0 != null && m2353n(c1847b0)) {
                removeView(this.f3922h);
                this.f3908K.remove(this.f3922h);
            }
        } else {
            if (this.f3922h == null) {
                Context context = getContext();
                C1847b0 c1847b1 = new C1847b0(context, null);
                this.f3922h = c1847b1;
                c1847b1.setSingleLine();
                this.f3922h.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.f3932r;
                if (i3 != 0) {
                    this.f3922h.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.f3903F;
                if (colorStateList != null) {
                    this.f3922h.setTextColor(colorStateList);
                }
            }
            if (!m2353n(this.f3922h)) {
                m2345b(this.f3922h, true);
            }
        }
        C1847b0 c1847b2 = this.f3922h;
        if (c1847b2 != null) {
            c1847b2.setText(charSequence);
        }
        this.f3901D = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f3903F = colorStateList;
        C1847b0 c1847b0 = this.f3922h;
        if (c1847b0 != null) {
            c1847b0.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(InterfaceC1845a1 interfaceC1845a1) {
    }
}

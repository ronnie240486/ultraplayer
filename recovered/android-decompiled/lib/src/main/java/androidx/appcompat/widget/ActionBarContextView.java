package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zuxoplayer.app.R;
import p000A.AbstractC0016Q;
import p000A.C0026a0;
import p060U1.AbstractC0610a;
import p083b1.ViewOnClickListenerC1086O;
import p087d.AbstractC1376a;
import p106i.AbstractC1733a;
import p110j.InterfaceC1755A;
import p110j.MenuC1772m;
import p113k.AbstractC1878l1;
import p113k.C1843a;
import p113k.C1861g;
import p113k.C1873k;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: g */
    public final C1843a f3821g;

    /* JADX INFO: renamed from: h */
    public final Context f3822h;

    /* JADX INFO: renamed from: i */
    public ActionMenuView f3823i;

    /* JADX INFO: renamed from: j */
    public C1873k f3824j;

    /* JADX INFO: renamed from: k */
    public int f3825k;

    /* JADX INFO: renamed from: l */
    public C0026a0 f3826l;

    /* JADX INFO: renamed from: m */
    public boolean f3827m;

    /* JADX INFO: renamed from: n */
    public boolean f3828n;

    /* JADX INFO: renamed from: o */
    public CharSequence f3829o;

    /* JADX INFO: renamed from: p */
    public CharSequence f3830p;

    /* JADX INFO: renamed from: q */
    public View f3831q;

    /* JADX INFO: renamed from: r */
    public View f3832r;

    /* JADX INFO: renamed from: s */
    public View f3833s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f3834t;

    /* JADX INFO: renamed from: u */
    public TextView f3835u;

    /* JADX INFO: renamed from: v */
    public TextView f3836v;

    /* JADX INFO: renamed from: w */
    public final int f3837w;

    /* JADX INFO: renamed from: x */
    public final int f3838x;

    /* JADX INFO: renamed from: y */
    public boolean f3839y;

    /* JADX INFO: renamed from: z */
    public final int f3840z;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        this.f3821g = new C1843a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f3822h = context;
        } else {
            this.f3822h = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1376a.f6098d, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : AbstractC0610a.m1512n(context, resourceId));
        this.f3837w = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f3838x = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f3825k = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f3840z = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: f */
    public static int m2320f(View view, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), i4);
        return Math.max(0, i3 - view.getMeasuredWidth());
    }

    /* JADX INFO: renamed from: g */
    public static int m2321g(View view, int i3, int i4, int i5, boolean z3) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i6 = ((i5 - measuredHeight) / 2) + i4;
        if (z3) {
            view.layout(i3 - measuredWidth, i6, i3, measuredHeight + i6);
        } else {
            view.layout(i3, i6, i3 + measuredWidth, measuredHeight + i6);
        }
        return z3 ? -measuredWidth : measuredWidth;
    }

    /* JADX INFO: renamed from: c */
    public final void m2322c(AbstractC1733a abstractC1733a) {
        View view = this.f3831q;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f3840z, (ViewGroup) this, false);
            this.f3831q = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f3831q);
        }
        View viewFindViewById = this.f3831q.findViewById(R.id.action_mode_close_button);
        this.f3832r = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC1086O(2, abstractC1733a));
        MenuC1772m menuC1772mMo3682d = abstractC1733a.mo3682d();
        C1873k c1873k = this.f3824j;
        if (c1873k != null) {
            c1873k.m4392f();
            C1861g c1861g = c1873k.f8216z;
            if (c1861g != null && c1861g.m4273b()) {
                c1861g.f7971i.dismiss();
            }
        }
        C1873k c1873k2 = new C1873k(getContext());
        this.f3824j = c1873k2;
        c1873k2.f8208r = true;
        c1873k2.f8209s = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menuC1772mMo3682d.m4252b(this.f3824j, this.f3822h);
        C1873k c1873k3 = this.f3824j;
        InterfaceC1755A interfaceC1755A = c1873k3.f8204n;
        if (interfaceC1755A == null) {
            InterfaceC1755A interfaceC1755A2 = (InterfaceC1755A) c1873k3.f8200j.inflate(c1873k3.f8202l, (ViewGroup) this, false);
            c1873k3.f8204n = interfaceC1755A2;
            interfaceC1755A2.mo2316a(c1873k3.f8199i);
            c1873k3.mo4216g();
        }
        InterfaceC1755A interfaceC1755A3 = c1873k3.f8204n;
        if (interfaceC1755A != interfaceC1755A3) {
            ((ActionMenuView) interfaceC1755A3).setPresenter(c1873k3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC1755A3;
        this.f3823i = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f3823i, layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public final void m2323d() {
        if (this.f3834t == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f3834t = linearLayout;
            this.f3835u = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f3836v = (TextView) this.f3834t.findViewById(R.id.action_bar_subtitle);
            int i3 = this.f3837w;
            if (i3 != 0) {
                this.f3835u.setTextAppearance(getContext(), i3);
            }
            int i4 = this.f3838x;
            if (i4 != 0) {
                this.f3836v.setTextAppearance(getContext(), i4);
            }
        }
        this.f3835u.setText(this.f3829o);
        this.f3836v.setText(this.f3830p);
        boolean zIsEmpty = TextUtils.isEmpty(this.f3829o);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f3830p);
        this.f3836v.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f3834t.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f3834t.getParent() == null) {
            addView(this.f3834t);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2324e() {
        removeAllViews();
        this.f3833s = null;
        this.f3823i = null;
        this.f3824j = null;
        View view = this.f3832r;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f3826l != null ? this.f3821g.f8118b : getVisibility();
    }

    public int getContentHeight() {
        return this.f3825k;
    }

    public CharSequence getSubtitle() {
        return this.f3830p;
    }

    public CharSequence getTitle() {
        return this.f3829o;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i3) {
        if (i3 != getVisibility()) {
            C0026a0 c0026a0 = this.f3826l;
            if (c0026a0 != null) {
                c0026a0.m105b();
            }
            super.setVisibility(i3);
        }
    }

    /* JADX INFO: renamed from: i */
    public final C0026a0 m2326i(int i3, long j3) {
        C0026a0 c0026a0 = this.f3826l;
        if (c0026a0 != null) {
            c0026a0.m105b();
        }
        C1843a c1843a = this.f3821g;
        if (i3 != 0) {
            C0026a0 c0026a0M79a = AbstractC0016Q.m79a(this);
            c0026a0M79a.m104a(0.0f);
            c0026a0M79a.m106c(j3);
            c1843a.f8119c.f3826l = c0026a0M79a;
            c1843a.f8118b = i3;
            c0026a0M79a.m107d(c1843a);
            return c0026a0M79a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C0026a0 c0026a0M79a2 = AbstractC0016Q.m79a(this);
        c0026a0M79a2.m104a(1.0f);
        c0026a0M79a2.m106c(j3);
        c1843a.f8119c.f3826l = c0026a0M79a2;
        c1843a.f8118b = i3;
        c0026a0M79a2.m107d(c1843a);
        return c0026a0M79a2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i3;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC1376a.f6095a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C1873k c1873k = this.f3824j;
        if (c1873k != null) {
            Configuration configuration2 = c1873k.f8198h.getResources().getConfiguration();
            int i4 = configuration2.screenWidthDp;
            int i5 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i4 > 600 || ((i4 > 960 && i5 > 720) || (i4 > 720 && i5 > 960))) {
                i3 = 5;
            } else if (i4 >= 500 || ((i4 > 640 && i5 > 480) || (i4 > 480 && i5 > 640))) {
                i3 = 4;
            } else {
                i3 = i4 >= 360 ? 3 : 2;
            }
            c1873k.f8212v = i3;
            MenuC1772m menuC1772m = c1873k.f8199i;
            if (menuC1772m != null) {
                menuC1772m.m4258p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1873k c1873k = this.f3824j;
        if (c1873k != null) {
            c1873k.m4392f();
            C1861g c1861g = this.f3824j.f8216z;
            if (c1861g == null || !c1861g.m4273b()) {
                return;
            }
            c1861g.f7971i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3828n = false;
        }
        if (!this.f3828n) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f3828n = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f3828n = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        boolean z4 = AbstractC1878l1.f8219a;
        boolean z5 = getLayoutDirection() == 1;
        int paddingRight = z5 ? (i5 - i3) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i6 - i4) - getPaddingTop()) - getPaddingBottom();
        View view = this.f3831q;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3831q.getLayoutParams();
            int i7 = z5 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i8 = z5 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i9 = z5 ? paddingRight - i7 : paddingRight + i7;
            int iM2321g = m2321g(this.f3831q, i9, paddingTop, paddingTop2, z5) + i9;
            paddingRight = z5 ? iM2321g - i8 : iM2321g + i8;
        }
        LinearLayout linearLayout = this.f3834t;
        if (linearLayout != null && this.f3833s == null && linearLayout.getVisibility() != 8) {
            paddingRight += m2321g(this.f3834t, paddingRight, paddingTop, paddingTop2, z5);
        }
        View view2 = this.f3833s;
        if (view2 != null) {
            m2321g(view2, paddingRight, paddingTop, paddingTop2, z5);
        }
        int paddingLeft = z5 ? getPaddingLeft() : (i5 - i3) - getPaddingRight();
        ActionMenuView actionMenuView = this.f3823i;
        if (actionMenuView != null) {
            m2321g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z5);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        if (View.MeasureSpec.getMode(i3) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i4) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i3);
        int size2 = this.f3825k;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i4);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f3831q;
        if (view != null) {
            int iM2320f = m2320f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3831q.getLayoutParams();
            paddingLeft = iM2320f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f3823i;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m2320f(this.f3823i, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f3834t;
        if (linearLayout != null && this.f3833s == null) {
            if (this.f3839y) {
                this.f3834t.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f3834t.getMeasuredWidth();
                boolean z3 = measuredWidth <= paddingLeft;
                if (z3) {
                    paddingLeft -= measuredWidth;
                }
                this.f3834t.setVisibility(z3 ? 0 : 8);
            } else {
                paddingLeft = m2320f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f3833s;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i5 = layoutParams.width;
            int i6 = i5 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i5 >= 0) {
                paddingLeft = Math.min(i5, paddingLeft);
            }
            int i7 = layoutParams.height;
            int i8 = i7 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i7 >= 0) {
                iMin = Math.min(i7, iMin);
            }
            this.f3833s.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(iMin, i8));
        }
        if (this.f3825k > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i9) {
                i9 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i9);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3827m = false;
        }
        if (!this.f3827m) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f3827m = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f3827m = false;
        return true;
    }

    public void setContentHeight(int i3) {
        this.f3825k = i3;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f3833s;
        if (view2 != null) {
            removeView(view2);
        }
        this.f3833s = view;
        if (view != null && (linearLayout = this.f3834t) != null) {
            removeView(linearLayout);
            this.f3834t = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f3830p = charSequence;
        m2323d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f3829o = charSequence;
        m2323d();
        AbstractC0016Q.m87i(this, charSequence);
    }

    public void setTitleOptional(boolean z3) {
        if (z3 != this.f3839y) {
            requestLayout();
        }
        this.f3839y = z3;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

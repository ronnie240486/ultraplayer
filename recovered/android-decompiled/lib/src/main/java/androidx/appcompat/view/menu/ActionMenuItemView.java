package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import p060U1.AbstractC0610a;
import p087d.AbstractC1376a;
import p110j.AbstractC1762c;
import p110j.C1761b;
import p110j.C1774o;
import p110j.InterfaceC1771l;
import p110j.InterfaceC1785z;
import p110j.MenuC1772m;
import p113k.C1847b0;
import p113k.InterfaceC1876l;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C1847b0 implements InterfaceC1785z, View.OnClickListener, InterfaceC1876l {

    /* JADX INFO: renamed from: n */
    public C1774o f3782n;

    /* JADX INFO: renamed from: o */
    public CharSequence f3783o;

    /* JADX INFO: renamed from: p */
    public Drawable f3784p;

    /* JADX INFO: renamed from: q */
    public InterfaceC1771l f3785q;

    /* JADX INFO: renamed from: r */
    public C1761b f3786r;

    /* JADX INFO: renamed from: s */
    public AbstractC1762c f3787s;

    /* JADX INFO: renamed from: t */
    public boolean f3788t;

    /* JADX INFO: renamed from: u */
    public boolean f3789u;

    /* JADX INFO: renamed from: v */
    public final int f3790v;

    /* JADX INFO: renamed from: w */
    public int f3791w;

    /* JADX INFO: renamed from: x */
    public final int f3792x;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f3788t = m2314h();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1376a.f6097c, 0, 0);
        this.f3790v = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f3792x = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f3791w = -1;
        setSaveEnabled(false);
    }

    @Override // p113k.InterfaceC1876l
    /* JADX INFO: renamed from: a */
    public final boolean mo2311a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p113k.InterfaceC1876l
    /* JADX INFO: renamed from: b */
    public final boolean mo2312b() {
        return !TextUtils.isEmpty(getText()) && this.f3782n.getIcon() == null;
    }

    @Override // p110j.InterfaceC1785z
    /* JADX INFO: renamed from: c */
    public final void mo2313c(C1774o c1774o) {
        this.f3782n = c1774o;
        setIcon(c1774o.getIcon());
        setTitle(c1774o.getTitleCondensed());
        setId(c1774o.f7925a);
        setVisibility(c1774o.isVisible() ? 0 : 8);
        setEnabled(c1774o.isEnabled());
        if (c1774o.hasSubMenu() && this.f3786r == null) {
            this.f3786r = new C1761b(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p110j.InterfaceC1785z
    public C1774o getItemData() {
        return this.f3782n;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2314h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (i3 < 480) {
            return (i3 >= 640 && i4 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m2315i() {
        boolean z3 = true;
        boolean z4 = !TextUtils.isEmpty(this.f3783o);
        if (this.f3784p != null && ((this.f3782n.f7949y & 4) != 4 || (!this.f3788t && !this.f3789u))) {
            z3 = false;
        }
        boolean z5 = z4 & z3;
        setText(z5 ? this.f3783o : null);
        CharSequence charSequence = this.f3782n.f7941q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z5 ? null : this.f3782n.f7929e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f3782n.f7942r;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC0610a.m1496J(this, z5 ? null : this.f3782n.f7929e);
        } else {
            AbstractC0610a.m1496J(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1771l interfaceC1771l = this.f3785q;
        if (interfaceC1771l != null) {
            interfaceC1771l.mo2317b(this.f3782n);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3788t = m2314h();
        m2315i();
    }

    @Override // p113k.C1847b0, android.widget.TextView, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i5 = this.f3791w) >= 0) {
            super.setPadding(i5, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i3, i4);
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int measuredWidth = getMeasuredWidth();
        int i6 = this.f3790v;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i6) : i6;
        if (mode != 1073741824 && i6 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i4);
        }
        if (!zIsEmpty || this.f3784p == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f3784p.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1761b c1761b;
        if (this.f3782n.hasSubMenu() && (c1761b = this.f3786r) != null && c1761b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z3) {
    }

    public void setChecked(boolean z3) {
    }

    public void setExpandedFormat(boolean z3) {
        if (this.f3789u != z3) {
            this.f3789u = z3;
            C1774o c1774o = this.f3782n;
            if (c1774o != null) {
                MenuC1772m menuC1772m = c1774o.f7938n;
                menuC1772m.f7905k = true;
                menuC1772m.m4258p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f3784p = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i3 = this.f3792x;
            if (intrinsicWidth > i3) {
                intrinsicHeight = (int) (intrinsicHeight * (i3 / intrinsicWidth));
                intrinsicWidth = i3;
            }
            if (intrinsicHeight > i3) {
                intrinsicWidth = (int) (intrinsicWidth * (i3 / intrinsicHeight));
            } else {
                i3 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i3);
        }
        setCompoundDrawables(drawable, null, null, null);
        m2315i();
    }

    public void setItemInvoker(InterfaceC1771l interfaceC1771l) {
        this.f3785q = interfaceC1771l;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i3, int i4, int i5, int i6) {
        this.f3791w = i3;
        super.setPadding(i3, i4, i5, i6);
    }

    public void setPopupCallback(AbstractC1762c abstractC1762c) {
        this.f3787s = abstractC1762c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f3783o = charSequence;
        m2315i();
    }
}

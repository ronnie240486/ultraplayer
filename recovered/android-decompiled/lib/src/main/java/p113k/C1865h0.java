package p113k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import p014F.InterfaceC0171t;
import p060U1.AbstractC0610a;
import p067X.C0687s;

/* JADX INFO: renamed from: k.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1865h0 extends ToggleButton implements InterfaceC0171t {

    /* JADX INFO: renamed from: g */
    public final C0687s f8180g;

    /* JADX INFO: renamed from: h */
    public final C1837X f8181h;

    /* JADX INFO: renamed from: i */
    public C1897v f8182i;

    public C1865h0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        AbstractC1826R0.m4334a(this, getContext());
        C0687s c0687s = new C0687s(this);
        this.f8180g = c0687s;
        c0687s.m1804f(attributeSet, R.attr.buttonStyleToggle);
        C1837X c1837x = new C1837X(this);
        this.f8181h = c1837x;
        c1837x.m4354f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().m4412a(attributeSet, R.attr.buttonStyleToggle);
    }

    private C1897v getEmojiTextViewHelper() {
        if (this.f8182i == null) {
            this.f8182i = new C1897v(this);
        }
        return this.f8182i;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0687s c0687s = this.f8180g;
        if (c0687s != null) {
            c0687s.m1800b();
        }
        C1837X c1837x = this.f8181h;
        if (c1837x != null) {
            c1837x.m4351b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0687s c0687s = this.f8180g;
        if (c0687s != null) {
            return c0687s.m1802d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0687s c0687s = this.f8180g;
        if (c0687s != null) {
            return c0687s.m1803e();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8181h.m4352d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8181h.m4353e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().m4413b(z3);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0687s c0687s = this.f8180g;
        if (c0687s != null) {
            c0687s.m1805g();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0687s c0687s = this.f8180g;
        if (c0687s != null) {
            c0687s.m1806h(i3);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1837X c1837x = this.f8181h;
        if (c1837x != null) {
            c1837x.m4351b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1837X c1837x = this.f8181h;
        if (c1837x != null) {
            c1837x.m4351b();
        }
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().m4414c(z3);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0610a) getEmojiTextViewHelper().f8284b.f38h).mo822o(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0687s c0687s = this.f8180g;
        if (c0687s != null) {
            c0687s.m1808j(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0687s c0687s = this.f8180g;
        if (c0687s != null) {
            c0687s.m1809k(mode);
        }
    }

    @Override // p014F.InterfaceC0171t
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1837X c1837x = this.f8181h;
        c1837x.m4359l(colorStateList);
        c1837x.m4351b();
    }

    @Override // p014F.InterfaceC0171t
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1837X c1837x = this.f8181h;
        c1837x.m4360m(mode);
        c1837x.m4351b();
    }
}

package p113k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.zuxoplayer.app.R;
import p014F.InterfaceC0171t;
import p060U1.AbstractC0610a;
import p067X.C0687s;
import p108i1.C1751d;

/* JADX INFO: renamed from: k.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1887q extends CheckBox implements InterfaceC0171t {

    /* JADX INFO: renamed from: g */
    public final C1751d f8241g;

    /* JADX INFO: renamed from: h */
    public final C0687s f8242h;

    /* JADX INFO: renamed from: i */
    public final C1837X f8243i;

    /* JADX INFO: renamed from: j */
    public C1897v f8244j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1887q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkboxStyle);
        AbstractC1828S0.m4339a(context);
        AbstractC1826R0.m4334a(this, getContext());
        C1751d c1751d = new C1751d(this);
        this.f8241g = c1751d;
        c1751d.m4207d(attributeSet, R.attr.checkboxStyle);
        C0687s c0687s = new C0687s(this);
        this.f8242h = c0687s;
        c0687s.m1804f(attributeSet, R.attr.checkboxStyle);
        C1837X c1837x = new C1837X(this);
        this.f8243i = c1837x;
        c1837x.m4354f(attributeSet, R.attr.checkboxStyle);
        getEmojiTextViewHelper().m4412a(attributeSet, R.attr.checkboxStyle);
    }

    private C1897v getEmojiTextViewHelper() {
        if (this.f8244j == null) {
            this.f8244j = new C1897v(this);
        }
        return this.f8244j;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0687s c0687s = this.f8242h;
        if (c0687s != null) {
            c0687s.m1800b();
        }
        C1837X c1837x = this.f8243i;
        if (c1837x != null) {
            c1837x.m4351b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0687s c0687s = this.f8242h;
        if (c0687s != null) {
            return c0687s.m1802d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0687s c0687s = this.f8242h;
        if (c0687s != null) {
            return c0687s.m1803e();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C1751d c1751d = this.f8241g;
        if (c1751d != null) {
            return (ColorStateList) c1751d.f7806e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C1751d c1751d = this.f8241g;
        if (c1751d != null) {
            return (PorterDuff.Mode) c1751d.f7807f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8243i.m4352d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8243i.m4353e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().m4413b(z3);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0687s c0687s = this.f8242h;
        if (c0687s != null) {
            c0687s.m1805g();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0687s c0687s = this.f8242h;
        if (c0687s != null) {
            c0687s.m1806h(i3);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C1751d c1751d = this.f8241g;
        if (c1751d != null) {
            if (c1751d.f7804c) {
                c1751d.f7804c = false;
            } else {
                c1751d.f7804c = true;
                c1751d.m4204a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1837X c1837x = this.f8243i;
        if (c1837x != null) {
            c1837x.m4351b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1837X c1837x = this.f8243i;
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
        C0687s c0687s = this.f8242h;
        if (c0687s != null) {
            c0687s.m1808j(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0687s c0687s = this.f8242h;
        if (c0687s != null) {
            c0687s.m1809k(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C1751d c1751d = this.f8241g;
        if (c1751d != null) {
            c1751d.f7806e = colorStateList;
            c1751d.f7802a = true;
            c1751d.m4204a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C1751d c1751d = this.f8241g;
        if (c1751d != null) {
            c1751d.f7807f = mode;
            c1751d.f7803b = true;
            c1751d.m4204a();
        }
    }

    @Override // p014F.InterfaceC0171t
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1837X c1837x = this.f8243i;
        c1837x.m4359l(colorStateList);
        c1837x.m4351b();
    }

    @Override // p014F.InterfaceC0171t
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1837X c1837x = this.f8243i;
        c1837x.m4360m(mode);
        c1837x.m4351b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i3) {
        setButtonDrawable(AbstractC0610a.m1512n(getContext(), i3));
    }
}

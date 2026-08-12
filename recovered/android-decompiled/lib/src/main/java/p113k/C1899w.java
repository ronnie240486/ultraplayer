package p113k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import p060U1.AbstractC0610a;
import p064W.C0650r;
import p067X.C0687s;

/* JADX INFO: renamed from: k.w */
/* JADX INFO: loaded from: classes.dex */
public class C1899w extends ImageButton {

    /* JADX INFO: renamed from: g */
    public final C0687s f8285g;

    /* JADX INFO: renamed from: h */
    public final C0650r f8286h;

    /* JADX INFO: renamed from: i */
    public boolean f8287i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1899w(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        AbstractC1828S0.m4339a(context);
        this.f8287i = false;
        AbstractC1826R0.m4334a(this, getContext());
        C0687s c0687s = new C0687s(this);
        this.f8285g = c0687s;
        c0687s.m1804f(attributeSet, i3);
        C0650r c0650r = new C0650r(this);
        this.f8286h = c0650r;
        c0650r.m1656f(attributeSet, i3);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0687s c0687s = this.f8285g;
        if (c0687s != null) {
            c0687s.m1800b();
        }
        C0650r c0650r = this.f8286h;
        if (c0650r != null) {
            c0650r.m1653b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0687s c0687s = this.f8285g;
        if (c0687s != null) {
            return c0687s.m1802d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0687s c0687s = this.f8285g;
        if (c0687s != null) {
            return c0687s.m1803e();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C1830T0 c1830t0;
        C0650r c0650r = this.f8286h;
        if (c0650r == null || (c1830t0 = (C1830T0) c0650r.f2515i) == null) {
            return null;
        }
        return c1830t0.f8091a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C1830T0 c1830t0;
        C0650r c0650r = this.f8286h;
        if (c0650r == null || (c1830t0 = (C1830T0) c0650r.f2515i) == null) {
            return null;
        }
        return c1830t0.f8092b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f8286h.f2514h).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0687s c0687s = this.f8285g;
        if (c0687s != null) {
            c0687s.m1805g();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0687s c0687s = this.f8285g;
        if (c0687s != null) {
            c0687s.m1806h(i3);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0650r c0650r = this.f8286h;
        if (c0650r != null) {
            c0650r.m1653b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0650r c0650r = this.f8286h;
        if (c0650r != null && drawable != null && !this.f8287i) {
            c0650r.f2513g = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0650r != null) {
            c0650r.m1653b();
            if (this.f8287i) {
                return;
            }
            ImageView imageView = (ImageView) c0650r.f2514h;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c0650r.f2513g);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i3) {
        super.setImageLevel(i3);
        this.f8287i = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i3) {
        C0650r c0650r = this.f8286h;
        ImageView imageView = (ImageView) c0650r.f2514h;
        if (i3 != 0) {
            Drawable drawableM1512n = AbstractC0610a.m1512n(imageView.getContext(), i3);
            if (drawableM1512n != null) {
                AbstractC1877l0.m4396a(drawableM1512n);
            }
            imageView.setImageDrawable(drawableM1512n);
        } else {
            imageView.setImageDrawable(null);
        }
        c0650r.m1653b();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0650r c0650r = this.f8286h;
        if (c0650r != null) {
            c0650r.m1653b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0687s c0687s = this.f8285g;
        if (c0687s != null) {
            c0687s.m1808j(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0687s c0687s = this.f8285g;
        if (c0687s != null) {
            c0687s.m1809k(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0650r c0650r = this.f8286h;
        if (c0650r != null) {
            if (((C1830T0) c0650r.f2515i) == null) {
                c0650r.f2515i = new C1830T0();
            }
            C1830T0 c1830t0 = (C1830T0) c0650r.f2515i;
            c1830t0.f8091a = colorStateList;
            c1830t0.f8094d = true;
            c0650r.m1653b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0650r c0650r = this.f8286h;
        if (c0650r != null) {
            if (((C1830T0) c0650r.f2515i) == null) {
                c0650r.f2515i = new C1830T0();
            }
            C1830T0 c1830t0 = (C1830T0) c0650r.f2515i;
            c1830t0.f8092b = mode;
            c1830t0.f8093c = true;
            c0650r.m1653b();
        }
    }
}

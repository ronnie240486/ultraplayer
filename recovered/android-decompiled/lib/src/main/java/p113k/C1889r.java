package p113k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.C0858A;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.google.android.gms.internal.cast.AbstractC1303m;
import com.zuxoplayer.app.R;
import p000A.AbstractC0016Q;
import p014F.InterfaceC0171t;
import p019G1.AbstractC0230e;
import p060U1.AbstractC0610a;
import p067X.C0687s;
import p087d.AbstractC1376a;
import p108i1.C1751d;

/* JADX INFO: renamed from: k.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1889r extends CheckedTextView implements InterfaceC0171t {

    /* JADX INFO: renamed from: g */
    public final C1751d f8246g;

    /* JADX INFO: renamed from: h */
    public final C0687s f8247h;

    /* JADX INFO: renamed from: i */
    public final C1837X f8248i;

    /* JADX INFO: renamed from: j */
    public C1897v f8249j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1889r(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        AbstractC1828S0.m4339a(context);
        AbstractC1826R0.m4334a(this, getContext());
        C1837X c1837x = new C1837X(this);
        this.f8248i = c1837x;
        c1837x.m4354f(attributeSet, R.attr.checkedTextViewStyle);
        c1837x.m4351b();
        C0687s c0687s = new C0687s(this);
        this.f8247h = c0687s;
        c0687s.m1804f(attributeSet, R.attr.checkedTextViewStyle);
        this.f8246g = new C1751d(this);
        Context context2 = getContext();
        int[] iArr = AbstractC1376a.f6106l;
        C0858A c0858aM2148Q = C0858A.m2148Q(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) c0858aM2148Q.f3640i;
        AbstractC0016Q.m85g(this, getContext(), iArr, attributeSet, (TypedArray) c0858aM2148Q.f3640i, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(AbstractC0610a.m1512n(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(AbstractC0610a.m1512n(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(AbstractC0610a.m1512n(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(c0858aM2148Q.m2156D(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC1877l0.m4397b(typedArray.getInt(3, -1), null));
            }
            c0858aM2148Q.m2170S();
            getEmojiTextViewHelper().m4412a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            c0858aM2148Q.m2170S();
            throw th;
        }
    }

    private C1897v getEmojiTextViewHelper() {
        if (this.f8249j == null) {
            this.f8249j = new C1897v(this);
        }
        return this.f8249j;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1837X c1837x = this.f8248i;
        if (c1837x != null) {
            c1837x.m4351b();
        }
        C0687s c0687s = this.f8247h;
        if (c0687s != null) {
            c0687s.m1800b();
        }
        C1751d c1751d = this.f8246g;
        if (c1751d != null) {
            c1751d.m4205b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC1303m.m3291N(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0687s c0687s = this.f8247h;
        if (c0687s != null) {
            return c0687s.m1802d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0687s c0687s = this.f8247h;
        if (c0687s != null) {
            return c0687s.m1803e();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C1751d c1751d = this.f8246g;
        if (c1751d != null) {
            return (ColorStateList) c1751d.f7806e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C1751d c1751d = this.f8246g;
        if (c1751d != null) {
            return (PorterDuff.Mode) c1751d.f7807f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8248i.m4352d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8248i.m4353e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0230e.m742t(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().m4413b(z3);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0687s c0687s = this.f8247h;
        if (c0687s != null) {
            c0687s.m1805g();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0687s c0687s = this.f8247h;
        if (c0687s != null) {
            c0687s.m1806h(i3);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C1751d c1751d = this.f8246g;
        if (c1751d != null) {
            if (c1751d.f7804c) {
                c1751d.f7804c = false;
            } else {
                c1751d.f7804c = true;
                c1751d.m4205b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1837X c1837x = this.f8248i;
        if (c1837x != null) {
            c1837x.m4351b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1837X c1837x = this.f8248i;
        if (c1837x != null) {
            c1837x.m4351b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1303m.m3292O(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().m4414c(z3);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0687s c0687s = this.f8247h;
        if (c0687s != null) {
            c0687s.m1808j(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0687s c0687s = this.f8247h;
        if (c0687s != null) {
            c0687s.m1809k(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C1751d c1751d = this.f8246g;
        if (c1751d != null) {
            c1751d.f7806e = colorStateList;
            c1751d.f7802a = true;
            c1751d.m4205b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C1751d c1751d = this.f8246g;
        if (c1751d != null) {
            c1751d.f7807f = mode;
            c1751d.f7803b = true;
            c1751d.m4205b();
        }
    }

    @Override // p014F.InterfaceC0171t
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1837X c1837x = this.f8248i;
        c1837x.m4359l(colorStateList);
        c1837x.m4351b();
    }

    @Override // p014F.InterfaceC0171t
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1837X c1837x = this.f8248i;
        c1837x.m4360m(mode);
        c1837x.m4351b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C1837X c1837x = this.f8248i;
        if (c1837x != null) {
            c1837x.m4355g(context, i3);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i3) {
        setCheckMarkDrawable(AbstractC0610a.m1512n(getContext(), i3));
    }
}

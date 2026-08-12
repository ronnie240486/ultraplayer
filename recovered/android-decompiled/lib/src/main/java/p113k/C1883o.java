package p113k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.C0858A;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import com.google.android.gms.internal.cast.AbstractC1303m;
import p014F.InterfaceC0171t;
import p019G1.AbstractC0230e;
import p060U1.AbstractC0610a;
import p067X.C0687s;

/* JADX INFO: renamed from: k.o */
/* JADX INFO: loaded from: classes.dex */
public class C1883o extends AutoCompleteTextView implements InterfaceC0171t {

    /* JADX INFO: renamed from: j */
    public static final int[] f8232j = {R.attr.popupBackground};

    /* JADX INFO: renamed from: g */
    public final C0687s f8233g;

    /* JADX INFO: renamed from: h */
    public final C1837X f8234h;

    /* JADX INFO: renamed from: i */
    public final C1794B f8235i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1883o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.zuxoplayer.app.R.attr.autoCompleteTextViewStyle);
        AbstractC1828S0.m4339a(context);
        AbstractC1826R0.m4334a(this, getContext());
        C0858A c0858aM2148Q = C0858A.m2148Q(getContext(), attributeSet, f8232j, com.zuxoplayer.app.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) c0858aM2148Q.f3640i).hasValue(0)) {
            setDropDownBackgroundDrawable(c0858aM2148Q.m2158F(0));
        }
        c0858aM2148Q.m2170S();
        C0687s c0687s = new C0687s(this);
        this.f8233g = c0687s;
        c0687s.m1804f(attributeSet, com.zuxoplayer.app.R.attr.autoCompleteTextViewStyle);
        C1837X c1837x = new C1837X(this);
        this.f8234h = c1837x;
        c1837x.m4354f(attributeSet, com.zuxoplayer.app.R.attr.autoCompleteTextViewStyle);
        c1837x.m4351b();
        C1794B c1794b = new C1794B(this);
        this.f8235i = c1794b;
        c1794b.mo4284b(attributeSet, com.zuxoplayer.app.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM4283a = c1794b.m4283a(keyListener);
        if (keyListenerM4283a == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM4283a);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0687s c0687s = this.f8233g;
        if (c0687s != null) {
            c0687s.m1800b();
        }
        C1837X c1837x = this.f8234h;
        if (c1837x != null) {
            c1837x.m4351b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC1303m.m3291N(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0687s c0687s = this.f8233g;
        if (c0687s != null) {
            return c0687s.m1802d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0687s c0687s = this.f8233g;
        if (c0687s != null) {
            return c0687s.m1803e();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8234h.m4352d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8234h.m4353e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0230e.m742t(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.f8235i.m4285c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0687s c0687s = this.f8233g;
        if (c0687s != null) {
            c0687s.m1805g();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0687s c0687s = this.f8233g;
        if (c0687s != null) {
            c0687s.m1806h(i3);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1837X c1837x = this.f8234h;
        if (c1837x != null) {
            c1837x.m4351b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1837X c1837x = this.f8234h;
        if (c1837x != null) {
            c1837x.m4351b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1303m.m3292O(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i3) {
        setDropDownBackgroundDrawable(AbstractC0610a.m1512n(getContext(), i3));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        this.f8235i.m4286d(z3);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f8235i.m4283a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0687s c0687s = this.f8233g;
        if (c0687s != null) {
            c0687s.m1808j(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0687s c0687s = this.f8233g;
        if (c0687s != null) {
            c0687s.m1809k(mode);
        }
    }

    @Override // p014F.InterfaceC0171t
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1837X c1837x = this.f8234h;
        c1837x.m4359l(colorStateList);
        c1837x.m4351b();
    }

    @Override // p014F.InterfaceC0171t
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1837X c1837x = this.f8234h;
        c1837x.m4360m(mode);
        c1837x.m4351b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C1837X c1837x = this.f8234h;
        if (c1837x != null) {
            c1837x.m4355g(context, i3);
        }
    }
}

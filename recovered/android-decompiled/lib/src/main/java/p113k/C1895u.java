package p113k;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.internal.cast.AbstractC1303m;
import com.zuxoplayer.app.R;
import p000A.AbstractC0016Q;
import p000A.C0031d;
import p000A.C0035f;
import p000A.C0039h;
import p000A.InterfaceC0033e;
import p000A.InterfaceC0061u;
import p011E.AbstractC0110c;
import p011E.C0111d;
import p011E.C0112e;
import p011E.C0113f;
import p014F.C0170s;
import p014F.InterfaceC0171t;
import p019G1.AbstractC0230e;
import p067X.C0687s;

/* JADX INFO: renamed from: k.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1895u extends EditText implements InterfaceC0061u, InterfaceC0171t {

    /* JADX INFO: renamed from: g */
    public final C0687s f8268g;

    /* JADX INFO: renamed from: h */
    public final C1837X f8269h;

    /* JADX INFO: renamed from: i */
    public final C1794B f8270i;

    /* JADX INFO: renamed from: j */
    public final C0170s f8271j;

    /* JADX INFO: renamed from: k */
    public final C1794B f8272k;

    /* JADX INFO: renamed from: l */
    public C1893t f8273l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1895u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        AbstractC1828S0.m4339a(context);
        AbstractC1826R0.m4334a(this, getContext());
        C0687s c0687s = new C0687s(this);
        this.f8268g = c0687s;
        c0687s.m1804f(attributeSet, R.attr.editTextStyle);
        C1837X c1837x = new C1837X(this);
        this.f8269h = c1837x;
        c1837x.m4354f(attributeSet, R.attr.editTextStyle);
        c1837x.m4351b();
        C1794B c1794b = new C1794B();
        c1794b.f7987b = this;
        this.f8270i = c1794b;
        this.f8271j = new C0170s();
        C1794B c1794b2 = new C1794B(this);
        this.f8272k = c1794b2;
        c1794b2.mo4284b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerM4283a = c1794b2.m4283a(keyListener);
        if (keyListenerM4283a == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM4283a);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    private C1893t getSuperCaller() {
        if (this.f8273l == null) {
            this.f8273l = new C1893t(this);
        }
        return this.f8273l;
    }

    @Override // p000A.InterfaceC0061u
    /* JADX INFO: renamed from: a */
    public final C0039h mo321a(C0039h c0039h) {
        return this.f8271j.m646a(this, c0039h);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0687s c0687s = this.f8268g;
        if (c0687s != null) {
            c0687s.m1800b();
        }
        C1837X c1837x = this.f8269h;
        if (c1837x != null) {
            c1837x.m4351b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC1303m.m3291N(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0687s c0687s = this.f8268g;
        if (c0687s != null) {
            return c0687s.m1802d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0687s c0687s = this.f8268g;
        if (c0687s != null) {
            return c0687s.m1803e();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8269h.m4352d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8269h.m4353e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C1794B c1794b;
        if (Build.VERSION.SDK_INT >= 28 || (c1794b = this.f8270i) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c1794b.f7988c;
        return textClassifier == null ? AbstractC1827S.m4338a((TextView) c1794b.f7987b) : textClassifier;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0057 A[PHI: r1
      0x0057: PHI (r1v10 java.lang.String[]) = (r1v5 java.lang.String[]), (r1v11 java.lang.String[]) binds: [B:30:0x006a, B:22:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i3;
        String[] strArrM82d;
        String[] stringArray;
        InputConnection c0113f;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f8269h.getClass();
        C1837X.m4349h(editorInfo, inputConnectionOnCreateInputConnection, this);
        AbstractC0230e.m742t(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && (i3 = Build.VERSION.SDK_INT) <= 30 && (strArrM82d = AbstractC0016Q.m82d(this)) != null) {
            if (i3 >= 25) {
                editorInfo.contentMimeTypes = strArrM82d;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrM82d);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrM82d);
            }
            C0111d c0111d = new C0111d(0, this);
            if (i3 >= 25) {
                c0113f = new C0112e(inputConnectionOnCreateInputConnection, c0111d);
            } else {
                String[] strArr = AbstractC0110c.f146a;
                if (i3 >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                    if (stringArray != null) {
                        strArr = stringArray;
                    }
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle != null) {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                        if (stringArray != null) {
                            strArr = stringArray;
                        }
                    }
                }
                if (strArr.length != 0) {
                    c0113f = new C0113f(inputConnectionOnCreateInputConnection, c0111d);
                }
            }
            inputConnectionOnCreateInputConnection = c0113f;
        }
        return this.f8272k.m4285c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30 || i3 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i3 = Build.VERSION.SDK_INT;
        boolean zM4288a = false;
        if (i3 < 31 && i3 >= 24 && dragEvent.getLocalState() == null && AbstractC0016Q.m82d(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zM4288a = AbstractC1800E.m4288a(dragEvent, this, activity);
            }
        }
        if (zM4288a) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i3) {
        C0035f c0035f;
        InterfaceC0033e interfaceC0033e;
        int i4;
        C0031d c0031d;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 31 || AbstractC0016Q.m82d(this) == null || !(i3 == 16908322 || i3 == 16908337)) {
            return super.onTextContextMenuItem(i3);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i5 >= 31) {
                c0031d = new C0031d(primaryClip, 1);
            } else {
                c0035f = new C0035f();
                c0035f.f46h = primaryClip;
                c0035f.f47i = 1;
            }
            if (i3 == 16908322) {
                interfaceC0033e = c0035f;
                interfaceC0033e = c0031d;
                i4 = 0;
            } else {
                interfaceC0033e = c0035f;
                interfaceC0033e = c0031d;
                i4 = 1;
            }
            interfaceC0033e.mo167o(i4);
            AbstractC0016Q.m84f(this, interfaceC0033e.mo157e());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0687s c0687s = this.f8268g;
        if (c0687s != null) {
            c0687s.m1805g();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0687s c0687s = this.f8268g;
        if (c0687s != null) {
            c0687s.m1806h(i3);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1837X c1837x = this.f8269h;
        if (c1837x != null) {
            c1837x.m4351b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1837X c1837x = this.f8269h;
        if (c1837x != null) {
            c1837x.m4351b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1303m.m3292O(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        this.f8272k.m4286d(z3);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f8272k.m4283a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0687s c0687s = this.f8268g;
        if (c0687s != null) {
            c0687s.m1808j(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0687s c0687s = this.f8268g;
        if (c0687s != null) {
            c0687s.m1809k(mode);
        }
    }

    @Override // p014F.InterfaceC0171t
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1837X c1837x = this.f8269h;
        c1837x.m4359l(colorStateList);
        c1837x.m4351b();
    }

    @Override // p014F.InterfaceC0171t
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1837X c1837x = this.f8269h;
        c1837x.m4360m(mode);
        c1837x.m4351b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C1837X c1837x = this.f8269h;
        if (c1837x != null) {
            c1837x.m4355g(context, i3);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1794B c1794b;
        if (Build.VERSION.SDK_INT >= 28 || (c1794b = this.f8270i) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c1794b.f7988c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : getEditableText();
    }
}

package p113k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p014F.AbstractC0165n;
import p014F.AbstractC0168q;
import p014F.InterfaceC0171t;
import p019G1.AbstractC0230e;
import p060U1.AbstractC0610a;
import p066W1.AbstractC0664e;
import p067X.C0687s;
import p089d1.C1447t;
import p148t.AbstractC2268g;
import p164y.AbstractC2371e;
import p164y.C2370d;

/* JADX INFO: renamed from: k.b0 */
/* JADX INFO: loaded from: classes.dex */
public class C1847b0 extends TextView implements InterfaceC0171t {

    /* JADX INFO: renamed from: g */
    public final C0687s f8122g;

    /* JADX INFO: renamed from: h */
    public final C1837X f8123h;

    /* JADX INFO: renamed from: i */
    public final C1794B f8124i;

    /* JADX INFO: renamed from: j */
    public C1897v f8125j;

    /* JADX INFO: renamed from: k */
    public boolean f8126k;

    /* JADX INFO: renamed from: l */
    public C1447t f8127l;

    /* JADX INFO: renamed from: m */
    public Future f8128m;

    public C1847b0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C1897v getEmojiTextViewHelper() {
        if (this.f8125j == null) {
            this.f8125j = new C1897v(this);
        }
        return this.f8125j;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0687s c0687s = this.f8122g;
        if (c0687s != null) {
            c0687s.m1800b();
        }
        C1837X c1837x = this.f8123h;
        if (c1837x != null) {
            c1837x.m4351b();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m4369g() {
        Future future = this.f8128m;
        if (future == null) {
            return;
        }
        try {
            this.f8128m = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            AbstractC1303m.m3326s(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC1878l1.f8221c) {
            return super.getAutoSizeMaxTextSize();
        }
        C1837X c1837x = this.f8123h;
        if (c1837x != null) {
            return Math.round(c1837x.f8106i.f8160e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (AbstractC1878l1.f8221c) {
            return super.getAutoSizeMinTextSize();
        }
        C1837X c1837x = this.f8123h;
        if (c1837x != null) {
            return Math.round(c1837x.f8106i.f8159d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (AbstractC1878l1.f8221c) {
            return super.getAutoSizeStepGranularity();
        }
        C1837X c1837x = this.f8123h;
        if (c1837x != null) {
            return Math.round(c1837x.f8106i.f8158c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC1878l1.f8221c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C1837X c1837x = this.f8123h;
        return c1837x != null ? c1837x.f8106i.f8161f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (AbstractC1878l1.f8221c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C1837X c1837x = this.f8123h;
        if (c1837x != null) {
            return c1837x.f8106i.f8156a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC1303m.m3291N(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC1839Y getSuperCaller() {
        if (this.f8127l == null) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 34) {
                this.f8127l = new C1844a0(this);
            } else if (i3 >= 28) {
                this.f8127l = new C1841Z(this);
            } else if (i3 >= 26) {
                this.f8127l = new C1447t(16, this);
            }
        }
        return this.f8127l;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0687s c0687s = this.f8122g;
        if (c0687s != null) {
            return c0687s.m1802d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0687s c0687s = this.f8122g;
        if (c0687s != null) {
            return c0687s.m1803e();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8123h.m4352d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8123h.m4353e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m4369g();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C1794B c1794b;
        if (Build.VERSION.SDK_INT >= 28 || (c1794b = this.f8124i) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c1794b.f7988c;
        return textClassifier == null ? AbstractC1827S.m4338a((TextView) c1794b.f7987b) : textClassifier;
    }

    public C2370d getTextMetricsParamsCompat() {
        return AbstractC1303m.m3326s(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f8123h.getClass();
        C1837X.m4349h(editorInfo, inputConnectionOnCreateInputConnection, this);
        AbstractC0230e.m742t(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30 || i3 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        C1837X c1837x = this.f8123h;
        if (c1837x == null || AbstractC1878l1.f8221c) {
            return;
        }
        c1837x.f8106i.m4380a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i3, int i4) {
        m4369g();
        super.onMeasure(i3, i4);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        super.onTextChanged(charSequence, i3, i4, i5);
        C1837X c1837x = this.f8123h;
        if (c1837x == null || AbstractC1878l1.f8221c) {
            return;
        }
        C1862g0 c1862g0 = c1837x.f8106i;
        if (c1862g0.m4382f()) {
            c1862g0.m4380a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().m4413b(z3);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i3, int i4, int i5, int i6) {
        if (AbstractC1878l1.f8221c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i3, i4, i5, i6);
            return;
        }
        C1837X c1837x = this.f8123h;
        if (c1837x != null) {
            c1837x.m4356i(i3, i4, i5, i6);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i3) {
        if (AbstractC1878l1.f8221c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i3);
            return;
        }
        C1837X c1837x = this.f8123h;
        if (c1837x != null) {
            c1837x.m4357j(iArr, i3);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i3) {
        if (AbstractC1878l1.f8221c) {
            super.setAutoSizeTextTypeWithDefaults(i3);
            return;
        }
        C1837X c1837x = this.f8123h;
        if (c1837x != null) {
            c1837x.m4358k(i3);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0687s c0687s = this.f8122g;
        if (c0687s != null) {
            c0687s.m1805g();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0687s c0687s = this.f8122g;
        if (c0687s != null) {
            c0687s.m1806h(i3);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1837X c1837x = this.f8123h;
        if (c1837x != null) {
            c1837x.m4351b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1837X c1837x = this.f8123h;
        if (c1837x != null) {
            c1837x.m4351b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1837X c1837x = this.f8123h;
        if (c1837x != null) {
            c1837x.m4351b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1837X c1837x = this.f8123h;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0610a) getEmojiTextViewHelper().f8284b.f38h).mo822o(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo3621i(i3);
        } else {
            AbstractC1303m.m3283F(this, i3);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo3620h(i3);
        } else {
            AbstractC1303m.m3285H(this, i3);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i3) {
        AbstractC1303m.m3286I(this, i3);
    }

    public void setPrecomputedText(AbstractC2371e abstractC2371e) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC1303m.m3326s(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0687s c0687s = this.f8122g;
        if (c0687s != null) {
            c0687s.m1808j(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0687s c0687s = this.f8122g;
        if (c0687s != null) {
            c0687s.m1809k(mode);
        }
    }

    @Override // p014F.InterfaceC0171t
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1837X c1837x = this.f8123h;
        c1837x.m4359l(colorStateList);
        c1837x.m4351b();
    }

    @Override // p014F.InterfaceC0171t
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1837X c1837x = this.f8123h;
        c1837x.m4360m(mode);
        c1837x.m4351b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C1837X c1837x = this.f8123h;
        if (c1837x != null) {
            c1837x.m4355g(context, i3);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1794B c1794b;
        if (Build.VERSION.SDK_INT >= 28 || (c1794b = this.f8124i) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c1794b.f7988c = textClassifier;
        }
    }

    public void setTextFuture(Future<AbstractC2371e> future) {
        this.f8128m = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C2370d c2370d) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c2370d.f9924b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i3 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i3 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i3 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i3 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i3 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i3 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i3 = 7;
            }
        }
        setTextDirection(i3);
        int i4 = Build.VERSION.SDK_INT;
        TextPaint textPaint = c2370d.f9923a;
        if (i4 >= 23) {
            getPaint().set(textPaint);
            AbstractC0165n.m636e(this, c2370d.f9925c);
            AbstractC0165n.m639h(this, c2370d.f9926d);
        } else {
            float textScaleX = textPaint.getTextScaleX();
            getPaint().set(textPaint);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i3, float f) {
        boolean z3 = AbstractC1878l1.f8221c;
        if (z3) {
            super.setTextSize(i3, f);
            return;
        }
        C1837X c1837x = this.f8123h;
        if (c1837x == null || z3) {
            return;
        }
        C1862g0 c1862g0 = c1837x.f8106i;
        if (c1862g0.m4382f()) {
            return;
        }
        c1862g0.m4383g(i3, f);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i3) {
        Typeface typefaceCreate;
        if (this.f8126k) {
            return;
        }
        if (typeface == null || i3 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            AbstractC0664e abstractC0664e = AbstractC2268g.f9705a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i3);
        }
        this.f8126k = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i3);
        } finally {
            this.f8126k = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1847b0(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        AbstractC1828S0.m4339a(context);
        this.f8126k = false;
        this.f8127l = null;
        AbstractC1826R0.m4334a(this, getContext());
        C0687s c0687s = new C0687s(this);
        this.f8122g = c0687s;
        c0687s.m1804f(attributeSet, i3);
        C1837X c1837x = new C1837X(this);
        this.f8123h = c1837x;
        c1837x.m4354f(attributeSet, i3);
        c1837x.m4351b();
        C1794B c1794b = new C1794B();
        c1794b.f7987b = this;
        this.f8124i = c1794b;
        getEmojiTextViewHelper().m4412a(attributeSet, i3);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i3, float f) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            getSuperCaller().mo3622j(i3, f);
        } else if (i4 >= 34) {
            AbstractC0168q.m645a(this, i3, f);
        } else {
            AbstractC1303m.m3286I(this, Math.round(TypedValue.applyDimension(i3, f, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i3 != 0 ? AbstractC0610a.m1512n(context, i3) : null, i4 != 0 ? AbstractC0610a.m1512n(context, i4) : null, i5 != 0 ? AbstractC0610a.m1512n(context, i5) : null, i6 != 0 ? AbstractC0610a.m1512n(context, i6) : null);
        C1837X c1837x = this.f8123h;
        if (c1837x != null) {
            c1837x.m4351b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i3 != 0 ? AbstractC0610a.m1512n(context, i3) : null, i4 != 0 ? AbstractC0610a.m1512n(context, i4) : null, i5 != 0 ? AbstractC0610a.m1512n(context, i5) : null, i6 != 0 ? AbstractC0610a.m1512n(context, i6) : null);
        C1837X c1837x = this.f8123h;
        if (c1837x != null) {
            c1837x.m4351b();
        }
    }
}

package p113k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.gms.internal.cast.AbstractC1303m;
import com.zuxoplayer.app.R;
import p014F.InterfaceC0171t;
import p060U1.AbstractC0610a;
import p067X.C0687s;

/* JADX INFO: renamed from: k.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1885p extends Button implements InterfaceC0171t {

    /* JADX INFO: renamed from: g */
    public final C0687s f8236g;

    /* JADX INFO: renamed from: h */
    public final C1837X f8237h;

    /* JADX INFO: renamed from: i */
    public C1897v f8238i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1885p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyle);
        AbstractC1828S0.m4339a(context);
        AbstractC1826R0.m4334a(this, getContext());
        C0687s c0687s = new C0687s(this);
        this.f8236g = c0687s;
        c0687s.m1804f(attributeSet, R.attr.buttonStyle);
        C1837X c1837x = new C1837X(this);
        this.f8237h = c1837x;
        c1837x.m4354f(attributeSet, R.attr.buttonStyle);
        c1837x.m4351b();
        getEmojiTextViewHelper().m4412a(attributeSet, R.attr.buttonStyle);
    }

    private C1897v getEmojiTextViewHelper() {
        if (this.f8238i == null) {
            this.f8238i = new C1897v(this);
        }
        return this.f8238i;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0687s c0687s = this.f8236g;
        if (c0687s != null) {
            c0687s.m1800b();
        }
        C1837X c1837x = this.f8237h;
        if (c1837x != null) {
            c1837x.m4351b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC1878l1.f8221c) {
            return super.getAutoSizeMaxTextSize();
        }
        C1837X c1837x = this.f8237h;
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
        C1837X c1837x = this.f8237h;
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
        C1837X c1837x = this.f8237h;
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
        C1837X c1837x = this.f8237h;
        return c1837x != null ? c1837x.f8106i.f8161f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (AbstractC1878l1.f8221c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C1837X c1837x = this.f8237h;
        if (c1837x != null) {
            return c1837x.f8106i.f8156a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC1303m.m3291N(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0687s c0687s = this.f8236g;
        if (c0687s != null) {
            return c0687s.m1802d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0687s c0687s = this.f8236g;
        if (c0687s != null) {
            return c0687s.m1803e();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8237h.m4352d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8237h.m4353e();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        C1837X c1837x = this.f8237h;
        if (c1837x == null || AbstractC1878l1.f8221c) {
            return;
        }
        c1837x.f8106i.m4380a();
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        super.onTextChanged(charSequence, i3, i4, i5);
        C1837X c1837x = this.f8237h;
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
        C1837X c1837x = this.f8237h;
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
        C1837X c1837x = this.f8237h;
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
        C1837X c1837x = this.f8237h;
        if (c1837x != null) {
            c1837x.m4358k(i3);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0687s c0687s = this.f8236g;
        if (c0687s != null) {
            c0687s.m1805g();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0687s c0687s = this.f8236g;
        if (c0687s != null) {
            c0687s.m1806h(i3);
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

    public void setSupportAllCaps(boolean z3) {
        C1837X c1837x = this.f8237h;
        if (c1837x != null) {
            c1837x.f8098a.setAllCaps(z3);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0687s c0687s = this.f8236g;
        if (c0687s != null) {
            c0687s.m1808j(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0687s c0687s = this.f8236g;
        if (c0687s != null) {
            c0687s.m1809k(mode);
        }
    }

    @Override // p014F.InterfaceC0171t
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1837X c1837x = this.f8237h;
        c1837x.m4359l(colorStateList);
        c1837x.m4351b();
    }

    @Override // p014F.InterfaceC0171t
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1837X c1837x = this.f8237h;
        c1837x.m4360m(mode);
        c1837x.m4351b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C1837X c1837x = this.f8237h;
        if (c1837x != null) {
            c1837x.m4355g(context, i3);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i3, float f) {
        boolean z3 = AbstractC1878l1.f8221c;
        if (z3) {
            super.setTextSize(i3, f);
            return;
        }
        C1837X c1837x = this.f8237h;
        if (c1837x == null || z3) {
            return;
        }
        C1862g0 c1862g0 = c1837x.f8106i;
        if (c1862g0.m4382f()) {
            return;
        }
        c1862g0.m4383g(i3, f);
    }
}

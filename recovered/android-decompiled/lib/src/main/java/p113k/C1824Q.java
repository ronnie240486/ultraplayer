package p113k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.media.session.C0858A;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import p060U1.AbstractC0610a;
import p067X.C0687s;
import p085c0.AbstractC1143s;
import p087d.AbstractC1376a;
import p106i.C1735c;
import p110j.ViewTreeObserverOnGlobalLayoutListenerC1763d;

/* JADX INFO: renamed from: k.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C1824Q extends Spinner {

    /* JADX INFO: renamed from: o */
    public static final int[] f8074o = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: g */
    public final C0687s f8075g;

    /* JADX INFO: renamed from: h */
    public final Context f8076h;

    /* JADX INFO: renamed from: i */
    public final C1806H f8077i;

    /* JADX INFO: renamed from: j */
    public SpinnerAdapter f8078j;

    /* JADX INFO: renamed from: k */
    public final boolean f8079k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC1822P f8080l;

    /* JADX INFO: renamed from: m */
    public int f8081m;

    /* JADX INFO: renamed from: n */
    public final Rect f8082n;

    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    public C1824Q(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, com.zuxoplayer.app.R.attr.spinnerStyle);
        this.f8082n = new Rect();
        AbstractC1826R0.m4334a(this, getContext());
        int[] iArr = AbstractC1376a.f6115u;
        C0858A c0858aM2148Q = C0858A.m2148Q(context, attributeSet, iArr, com.zuxoplayer.app.R.attr.spinnerStyle);
        this.f8075g = new C0687s(this);
        TypedArray typedArray = (TypedArray) c0858aM2148Q.f3640i;
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f8076h = new C1735c(context, resourceId);
        } else {
            this.f8076h = context;
        }
        int i3 = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8074o, com.zuxoplayer.app.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e3) {
                    e = e3;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i3 != 0) {
                        DialogInterfaceOnClickListenerC1810J dialogInterfaceOnClickListenerC1810J = new DialogInterfaceOnClickListenerC1810J(this);
                        this.f8080l = dialogInterfaceOnClickListenerC1810J;
                        dialogInterfaceOnClickListenerC1810J.f8040i = typedArray.getString(2);
                    } else if (i3 == 1) {
                        C1818N c1818n = new C1818N(this, this.f8076h, attributeSet);
                        C0858A c0858aM2148Q2 = C0858A.m2148Q(this.f8076h, attributeSet, iArr, com.zuxoplayer.app.R.attr.spinnerStyle);
                        this.f8081m = ((TypedArray) c0858aM2148Q2.f3640i).getLayoutDimension(3, -2);
                        c1818n.m4294m(c0858aM2148Q2.m2158F(1));
                        c1818n.f8060I = typedArray.getString(2);
                        c0858aM2148Q2.m2170S();
                        this.f8080l = c1818n;
                        this.f8077i = new C1806H(this, this, c1818n);
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                        arrayAdapter.setDropDownViewResource(com.zuxoplayer.app.R.layout.support_simple_spinner_dropdown_item);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    c0858aM2148Q.m2170S();
                    this.f8079k = true;
                    spinnerAdapter = this.f8078j;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.f8078j = null;
                    }
                    this.f8075g.m1804f(attributeSet, com.zuxoplayer.app.R.attr.spinnerStyle);
                }
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i3 != 0) {
            DialogInterfaceOnClickListenerC1810J dialogInterfaceOnClickListenerC1810J2 = new DialogInterfaceOnClickListenerC1810J(this);
            this.f8080l = dialogInterfaceOnClickListenerC1810J2;
            dialogInterfaceOnClickListenerC1810J2.f8040i = typedArray.getString(2);
        } else if (i3 == 1) {
            C1818N c1818n2 = new C1818N(this, this.f8076h, attributeSet);
            C0858A c0858aM2148Q3 = C0858A.m2148Q(this.f8076h, attributeSet, iArr, com.zuxoplayer.app.R.attr.spinnerStyle);
            this.f8081m = ((TypedArray) c0858aM2148Q3.f3640i).getLayoutDimension(3, -2);
            c1818n2.m4294m(c0858aM2148Q3.m2158F(1));
            c1818n2.f8060I = typedArray.getString(2);
            c0858aM2148Q3.m2170S();
            this.f8080l = c1818n2;
            this.f8077i = new C1806H(this, this, c1818n2);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(com.zuxoplayer.app.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        c0858aM2148Q.m2170S();
        this.f8079k = true;
        spinnerAdapter = this.f8078j;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f8078j = null;
        }
        this.f8075g.m1804f(attributeSet, com.zuxoplayer.app.R.attr.spinnerStyle);
    }

    /* JADX INFO: renamed from: a */
    public final int m4333a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i3 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f8082n;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0687s c0687s = this.f8075g;
        if (c0687s != null) {
            c0687s.m1800b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC1822P interfaceC1822P = this.f8080l;
        return interfaceC1822P != null ? interfaceC1822P.mo4307c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC1822P interfaceC1822P = this.f8080l;
        return interfaceC1822P != null ? interfaceC1822P.mo4309g() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f8080l != null ? this.f8081m : super.getDropDownWidth();
    }

    public final InterfaceC1822P getInternalPopup() {
        return this.f8080l;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC1822P interfaceC1822P = this.f8080l;
        return interfaceC1822P != null ? interfaceC1822P.mo4310h() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f8076h;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC1822P interfaceC1822P = this.f8080l;
        return interfaceC1822P != null ? interfaceC1822P.mo4311i() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0687s c0687s = this.f8075g;
        if (c0687s != null) {
            return c0687s.m1802d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0687s c0687s = this.f8075g;
        if (c0687s != null) {
            return c0687s.m1803e();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC1822P interfaceC1822P = this.f8080l;
        if (interfaceC1822P == null || !interfaceC1822P.mo4306b()) {
            return;
        }
        interfaceC1822P.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        if (this.f8080l == null || View.MeasureSpec.getMode(i3) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m4333a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i3)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C1820O c1820o = (C1820O) parcelable;
        super.onRestoreInstanceState(c1820o.getSuperState());
        if (!c1820o.f8065g || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1763d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C1820O c1820o = new C1820O(super.onSaveInstanceState());
        InterfaceC1822P interfaceC1822P = this.f8080l;
        c1820o.f8065g = interfaceC1822P != null && interfaceC1822P.mo4306b();
        return c1820o;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1806H c1806h = this.f8077i;
        if (c1806h == null || !c1806h.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC1822P interfaceC1822P = this.f8080l;
        if (interfaceC1822P == null) {
            return super.performClick();
        }
        if (interfaceC1822P.mo4306b()) {
            return true;
        }
        this.f8080l.mo4308e(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0687s c0687s = this.f8075g;
        if (c0687s != null) {
            c0687s.m1805g();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0687s c0687s = this.f8075g;
        if (c0687s != null) {
            c0687s.m1806h(i3);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i3) {
        InterfaceC1822P interfaceC1822P = this.f8080l;
        if (interfaceC1822P == null) {
            super.setDropDownHorizontalOffset(i3);
        } else {
            interfaceC1822P.mo4315p(i3);
            interfaceC1822P.mo4305a(i3);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i3) {
        InterfaceC1822P interfaceC1822P = this.f8080l;
        if (interfaceC1822P != null) {
            interfaceC1822P.mo4314n(i3);
        } else {
            super.setDropDownVerticalOffset(i3);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i3) {
        if (this.f8080l != null) {
            this.f8081m = i3;
        } else {
            super.setDropDownWidth(i3);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC1822P interfaceC1822P = this.f8080l;
        if (interfaceC1822P != null) {
            interfaceC1822P.mo4313m(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i3) {
        setPopupBackgroundDrawable(AbstractC0610a.m1512n(getPopupContext(), i3));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC1822P interfaceC1822P = this.f8080l;
        if (interfaceC1822P != null) {
            interfaceC1822P.mo4312k(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0687s c0687s = this.f8075g;
        if (c0687s != null) {
            c0687s.m1808j(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0687s c0687s = this.f8075g;
        if (c0687s != null) {
            c0687s.m1809k(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f8079k) {
            this.f8078j = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC1822P interfaceC1822P = this.f8080l;
        if (interfaceC1822P != null) {
            Context context = this.f8076h;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C1812K c1812k = new C1812K();
            c1812k.f8044g = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c1812k.f8045h = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && Build.VERSION.SDK_INT >= 23 && AbstractC1143s.m3040u(spinnerAdapter)) {
                AbstractC1808I.m4304a(AbstractC1143s.m3031l(spinnerAdapter), theme);
            }
            interfaceC1822P.mo4296o(c1812k);
        }
    }
}

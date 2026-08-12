package p113k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.session.C0858A;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p000A.AbstractC0016Q;
import p011E.AbstractC0109b;
import p011E.AbstractC0110c;
import p014F.AbstractC0165n;
import p014F.AbstractC0168q;
import p014F.InterfaceC0171t;
import p036M0.C0368e;
import p045P0.AbstractC0462h;
import p060U1.AbstractC0610a;
import p087d.AbstractC1376a;

/* JADX INFO: renamed from: k.X */
/* JADX INFO: loaded from: classes.dex */
public final class C1837X {

    /* JADX INFO: renamed from: a */
    public final TextView f8098a;

    /* JADX INFO: renamed from: b */
    public C1830T0 f8099b;

    /* JADX INFO: renamed from: c */
    public C1830T0 f8100c;

    /* JADX INFO: renamed from: d */
    public C1830T0 f8101d;

    /* JADX INFO: renamed from: e */
    public C1830T0 f8102e;

    /* JADX INFO: renamed from: f */
    public C1830T0 f8103f;

    /* JADX INFO: renamed from: g */
    public C1830T0 f8104g;

    /* JADX INFO: renamed from: h */
    public C1830T0 f8105h;

    /* JADX INFO: renamed from: i */
    public final C1862g0 f8106i;

    /* JADX INFO: renamed from: j */
    public int f8107j = 0;

    /* JADX INFO: renamed from: k */
    public int f8108k = -1;

    /* JADX INFO: renamed from: l */
    public Typeface f8109l;

    /* JADX INFO: renamed from: m */
    public boolean f8110m;

    public C1837X(TextView textView) {
        this.f8098a = textView;
        this.f8106i = new C1862g0(textView);
    }

    /* JADX INFO: renamed from: c */
    public static C1830T0 m4348c(Context context, C1891s c1891s, int i3) {
        ColorStateList colorStateListM4326i;
        synchronized (c1891s) {
            colorStateListM4326i = c1891s.f8264a.m4326i(context, i3);
        }
        if (colorStateListM4326i == null) {
            return null;
        }
        C1830T0 c1830t0 = new C1830T0();
        c1830t0.f8094d = true;
        c1830t0.f8091a = colorStateListM4326i;
        return c1830t0;
    }

    /* JADX INFO: renamed from: h */
    public static void m4349h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i3 >= 30) {
            AbstractC0109b.m542a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i3 >= 30) {
            AbstractC0109b.m542a(editorInfo, text);
            return;
        }
        int i4 = editorInfo.initialSelStart;
        int i5 = editorInfo.initialSelEnd;
        int i6 = i4 > i5 ? i5 : i4;
        if (i4 <= i5) {
            i4 = i5;
        }
        int length = text.length();
        if (i6 < 0 || i4 > length) {
            AbstractC0110c.m543a(editorInfo, null, 0, 0);
            return;
        }
        int i7 = editorInfo.inputType & 4095;
        if (i7 == 129 || i7 == 225 || i7 == 18) {
            AbstractC0110c.m543a(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            AbstractC0110c.m543a(editorInfo, text, i6, i4);
            return;
        }
        int i8 = i4 - i6;
        int i9 = i8 > 1024 ? 0 : i8;
        int i10 = 2048 - i9;
        int iMin = Math.min(text.length() - i4, i10 - Math.min(i6, (int) (((double) i10) * 0.8d)));
        int iMin2 = Math.min(i6, i10 - iMin);
        int i11 = i6 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i11))) {
            i11++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i4 + iMin) - 1))) {
            iMin--;
        }
        int i12 = iMin2 + i9;
        AbstractC0110c.m543a(editorInfo, i9 != i8 ? TextUtils.concat(text.subSequence(i11, i11 + iMin2), text.subSequence(i4, iMin + i4)) : text.subSequence(i11, i12 + iMin + i11), iMin2, i12);
    }

    /* JADX INFO: renamed from: a */
    public final void m4350a(Drawable drawable, C1830T0 c1830t0) {
        if (drawable == null || c1830t0 == null) {
            return;
        }
        C1891s.m4409d(drawable, c1830t0, this.f8098a.getDrawableState());
    }

    /* JADX INFO: renamed from: b */
    public final void m4351b() {
        C1830T0 c1830t0 = this.f8099b;
        TextView textView = this.f8098a;
        if (c1830t0 != null || this.f8100c != null || this.f8101d != null || this.f8102e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m4350a(compoundDrawables[0], this.f8099b);
            m4350a(compoundDrawables[1], this.f8100c);
            m4350a(compoundDrawables[2], this.f8101d);
            m4350a(compoundDrawables[3], this.f8102e);
        }
        if (this.f8103f == null && this.f8104g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        m4350a(compoundDrawablesRelative[0], this.f8103f);
        m4350a(compoundDrawablesRelative[2], this.f8104g);
    }

    /* JADX INFO: renamed from: d */
    public final ColorStateList m4352d() {
        C1830T0 c1830t0 = this.f8105h;
        if (c1830t0 != null) {
            return c1830t0.f8091a;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final PorterDuff.Mode m4353e() {
        C1830T0 c1830t0 = this.f8105h;
        if (c1830t0 != null) {
            return c1830t0.f8092b;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:279:0x0460  */
    /* JADX WARN: Code duplicated, block: B:281:0x0465  */
    /* JADX WARN: Code duplicated, block: B:284:0x046c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:285:0x046e  */
    /* JADX WARN: Code duplicated, block: B:287:0x0473  */
    /* JADX WARN: Code duplicated, block: B:289:0x0479  */
    /* JADX WARN: Code duplicated, block: B:291:0x047d  */
    /* JADX WARN: Code duplicated, block: B:294:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0103  */
    /* JADX WARN: Code duplicated, block: B:49:0x010a  */
    /* JADX WARN: Code duplicated, block: B:54:0x011c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final void m4354f(AttributeSet attributeSet, int i3) {
        String string;
        boolean z3;
        boolean z4;
        ColorStateList colorStateListM2156D;
        ColorStateList colorStateListM2156D2;
        ColorStateList colorStateListM2156D3;
        String string2;
        C1891s c1891s;
        int i4;
        int i5;
        float dimensionPixelSize;
        int i6;
        ColorStateList colorStateList;
        int resourceId;
        int resourceId2;
        int i7;
        TextView textView = this.f8098a;
        Context context = textView.getContext();
        C1891s c1891sM4407a = C1891s.m4407a();
        int[] iArr = AbstractC1376a.f6102h;
        C0858A c0858aM2148Q = C0858A.m2148Q(context, attributeSet, iArr, i3);
        AbstractC0016Q.m85g(textView, textView.getContext(), iArr, attributeSet, (TypedArray) c0858aM2148Q.f3640i, i3);
        TypedArray typedArray = (TypedArray) c0858aM2148Q.f3640i;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f8099b = m4348c(context, c1891sM4407a, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f8100c = m4348c(context, c1891sM4407a, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f8101d = m4348c(context, c1891sM4407a, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f8102e = m4348c(context, c1891sM4407a, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f8103f = m4348c(context, c1891sM4407a, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f8104g = m4348c(context, c1891sM4407a, typedArray.getResourceId(6, 0));
        }
        c0858aM2148Q.m2170S();
        boolean z5 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC1376a.f6116v;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C0858A c0858a = new C0858A(context, typedArrayObtainStyledAttributes);
            if (z5 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z3 = false;
                z4 = false;
            } else {
                z4 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z3 = true;
            }
            m4361n(context, c0858a);
            int i8 = Build.VERSION.SDK_INT;
            if (i8 < 23) {
                colorStateListM2156D = typedArrayObtainStyledAttributes.hasValue(3) ? c0858a.m2156D(3) : null;
                colorStateListM2156D2 = typedArrayObtainStyledAttributes.hasValue(4) ? c0858a.m2156D(4) : null;
                if (typedArrayObtainStyledAttributes.hasValue(5)) {
                    colorStateListM2156D3 = c0858a.m2156D(5);
                    i7 = 15;
                } else {
                    i7 = 15;
                }
                if (typedArrayObtainStyledAttributes.hasValue(i7)) {
                    string2 = typedArrayObtainStyledAttributes.getString(i7);
                } else {
                    string2 = null;
                }
                if (i8 >= 26 || !typedArrayObtainStyledAttributes.hasValue(13)) {
                    string = null;
                } else {
                    string = typedArrayObtainStyledAttributes.getString(13);
                }
                c0858a.m2170S();
            } else {
                i7 = 15;
                colorStateListM2156D = null;
                colorStateListM2156D2 = null;
            }
            colorStateListM2156D3 = null;
            if (typedArrayObtainStyledAttributes.hasValue(i7)) {
                string2 = typedArrayObtainStyledAttributes.getString(i7);
            } else {
                string2 = null;
            }
            if (i8 >= 26) {
                string = null;
            } else {
                string = null;
            }
            c0858a.m2170S();
        } else {
            string = null;
            z3 = false;
            z4 = false;
            colorStateListM2156D = null;
            colorStateListM2156D2 = null;
            colorStateListM2156D3 = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i3, 0);
        C0858A c0858a2 = new C0858A(context, typedArrayObtainStyledAttributes2);
        if (!z5 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z4 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z3 = true;
        }
        boolean z6 = z4;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 23) {
            if (typedArrayObtainStyledAttributes2.hasValue(3)) {
                colorStateListM2156D = c0858a2.m2156D(3);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(4)) {
                colorStateListM2156D2 = c0858a2.m2156D(4);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(5)) {
                colorStateListM2156D3 = c0858a2.m2156D(5);
            }
        }
        ColorStateList colorStateList2 = colorStateListM2156D;
        ColorStateList colorStateList3 = colorStateListM2156D2;
        ColorStateList colorStateList4 = colorStateListM2156D3;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        String str = string2;
        if (i9 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i9 < 28 || !typedArrayObtainStyledAttributes2.hasValue(0)) {
            c1891s = c1891sM4407a;
        } else {
            c1891s = c1891sM4407a;
            if (typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
                textView.setTextSize(0, 0.0f);
            }
        }
        m4361n(context, c0858a2);
        c0858a2.m2170S();
        if (colorStateList2 != null) {
            textView.setTextColor(colorStateList2);
        }
        if (colorStateList3 != null) {
            textView.setHintTextColor(colorStateList3);
        }
        if (colorStateList4 != null) {
            textView.setLinkTextColor(colorStateList4);
        }
        if (!z5 && z3) {
            textView.setAllCaps(z6);
        }
        Typeface typeface = this.f8109l;
        if (typeface != null) {
            if (this.f8108k == -1) {
                textView.setTypeface(typeface, this.f8107j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            AbstractC1833V.m4346d(textView, string);
        }
        if (str == null) {
            i4 = 0;
        } else if (i9 >= 24) {
            AbstractC1831U.m4342b(textView, AbstractC1831U.m4341a(str));
            i4 = 0;
        } else {
            i4 = 0;
            textView.setTextLocale(AbstractC1829T.m4340a(str.split(",")[0]));
        }
        int[] iArr3 = AbstractC1376a.f6103i;
        C1862g0 c1862g0 = this.f8106i;
        Context context2 = c1862g0.f8165j;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i3, i4);
        TextView textView2 = c1862g0.f8164i;
        AbstractC0016Q.m85g(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i3);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c1862g0.f8156a = typedArrayObtainStyledAttributes3.getInt(5, i4);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i10 = 0; i10 < length; i10++) {
                    iArr4[i10] = typedArrayObtainTypedArray.getDimensionPixelSize(i10, -1);
                }
                c1862g0.f8161f = C1862g0.m4377b(iArr4);
                c1862g0.m4385i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c1862g0.m4386j()) {
            c1862g0.f8156a = 0;
        } else if (c1862g0.f8156a == 1) {
            if (!c1862g0.f8162g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                float f = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c1862g0.m4387k(dimension2, f, dimension);
            }
            c1862g0.m4384h();
        }
        if (AbstractC1878l1.f8221c && c1862g0.f8156a != 0) {
            int[] iArr5 = c1862g0.f8161f;
            if (iArr5.length > 0) {
                if (AbstractC1833V.m4343a(textView) != -1.0f) {
                    AbstractC1833V.m4344b(textView, Math.round(c1862g0.f8159d), Math.round(c1862g0.f8160e), Math.round(c1862g0.f8158c), 0);
                } else {
                    AbstractC1833V.m4345c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        C1891s c1891s2 = c1891s;
        Drawable drawableM4410b = resourceId4 != -1 ? c1891s2.m4410b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableM4410b2 = resourceId5 != -1 ? c1891s2.m4410b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableM4410b3 = resourceId6 != -1 ? c1891s2.m4410b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableM4410b4 = resourceId7 != -1 ? c1891s2.m4410b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableM4410b5 = resourceId8 != -1 ? c1891s2.m4410b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableM4410b6 = resourceId9 != -1 ? c1891s2.m4410b(context, resourceId9) : null;
        if (drawableM4410b5 != null || drawableM4410b6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableM4410b5 == null) {
                drawableM4410b5 = compoundDrawablesRelative[0];
            }
            if (drawableM4410b2 == null) {
                drawableM4410b2 = compoundDrawablesRelative[1];
            }
            if (drawableM4410b6 == null) {
                drawableM4410b6 = compoundDrawablesRelative[2];
            }
            if (drawableM4410b4 == null) {
                drawableM4410b4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableM4410b5, drawableM4410b2, drawableM4410b6, drawableM4410b4);
        } else if (drawableM4410b != null || drawableM4410b2 != null || drawableM4410b3 != null || drawableM4410b4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableM4410b == null) {
                    drawableM4410b = compoundDrawables[0];
                }
                if (drawableM4410b2 == null) {
                    drawableM4410b2 = compoundDrawables[1];
                }
                if (drawableM4410b3 == null) {
                    drawableM4410b3 = compoundDrawables[2];
                }
                if (drawableM4410b4 == null) {
                    drawableM4410b4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableM4410b, drawableM4410b2, drawableM4410b3, drawableM4410b4);
            } else {
                if (drawableM4410b2 == null) {
                    drawableM4410b2 = compoundDrawablesRelative2[1];
                }
                if (drawableM4410b4 == null) {
                    drawableM4410b4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableM4410b2, compoundDrawablesRelative2[2], drawableM4410b4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC0610a.m1510l(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC0165n.m637f(textView, colorStateList);
            } else if (textView instanceof InterfaceC0171t) {
                ((InterfaceC0171t) textView).setSupportCompoundDrawablesTintList(colorStateList);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode modeM4397b = AbstractC1877l0.m4397b(typedArrayObtainStyledAttributes4.getInt(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC0165n.m638g(textView, modeM4397b);
            } else if (textView instanceof InterfaceC0171t) {
                ((InterfaceC0171t) textView).setSupportCompoundDrawablesTintMode(modeM4397b);
            }
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i5 = -1;
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
            } else {
                int i11 = typedValuePeekValue.data;
                int i12 = i11 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i11);
                i6 = i12;
                i5 = -1;
            }
            typedArrayObtainStyledAttributes4.recycle();
            if (dimensionPixelSize2 != i5) {
                AbstractC1303m.m3283F(textView, dimensionPixelSize2);
            }
            if (dimensionPixelSize3 != i5) {
                AbstractC1303m.m3285H(textView, dimensionPixelSize3);
            }
            if (dimensionPixelSize != -1.0f) {
                if (i6 == i5) {
                    AbstractC1303m.m3286I(textView, (int) dimensionPixelSize);
                } else if (Build.VERSION.SDK_INT >= 34) {
                    AbstractC0168q.m645a(textView, i6, dimensionPixelSize);
                } else {
                    AbstractC1303m.m3286I(textView, Math.round(TypedValue.applyDimension(i6, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                }
            }
        }
        i5 = -1;
        dimensionPixelSize = -1.0f;
        i6 = -1;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i5) {
            AbstractC1303m.m3283F(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i5) {
            AbstractC1303m.m3285H(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i6 == i5) {
                AbstractC1303m.m3286I(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                AbstractC0168q.m645a(textView, i6, dimensionPixelSize);
            } else {
                AbstractC1303m.m3286I(textView, Math.round(TypedValue.applyDimension(i6, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m4355g(Context context, int i3) {
        String string;
        ColorStateList colorStateListM2156D;
        ColorStateList colorStateListM2156D2;
        ColorStateList colorStateListM2156D3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i3, AbstractC1376a.f6116v);
        C0858A c0858a = new C0858A(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f8098a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 23) {
            if (typedArrayObtainStyledAttributes.hasValue(3) && (colorStateListM2156D3 = c0858a.m2156D(3)) != null) {
                textView.setTextColor(colorStateListM2156D3);
            }
            if (typedArrayObtainStyledAttributes.hasValue(5) && (colorStateListM2156D2 = c0858a.m2156D(5)) != null) {
                textView.setLinkTextColor(colorStateListM2156D2);
            }
            if (typedArrayObtainStyledAttributes.hasValue(4) && (colorStateListM2156D = c0858a.m2156D(4)) != null) {
                textView.setHintTextColor(colorStateListM2156D);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m4361n(context, c0858a);
        if (i4 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            AbstractC1833V.m4346d(textView, string);
        }
        c0858a.m2170S();
        Typeface typeface = this.f8109l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f8107j);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m4356i(int i3, int i4, int i5, int i6) {
        C1862g0 c1862g0 = this.f8106i;
        if (c1862g0.m4386j()) {
            DisplayMetrics displayMetrics = c1862g0.f8165j.getResources().getDisplayMetrics();
            c1862g0.m4387k(TypedValue.applyDimension(i6, i3, displayMetrics), TypedValue.applyDimension(i6, i4, displayMetrics), TypedValue.applyDimension(i6, i5, displayMetrics));
            if (c1862g0.m4384h()) {
                c1862g0.m4380a();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m4357j(int[] iArr, int i3) {
        C1862g0 c1862g0 = this.f8106i;
        if (c1862g0.m4386j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i3 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c1862g0.f8165j.getResources().getDisplayMetrics();
                    for (int i4 = 0; i4 < length; i4++) {
                        iArrCopyOf[i4] = Math.round(TypedValue.applyDimension(i3, iArr[i4], displayMetrics));
                    }
                }
                c1862g0.f8161f = C1862g0.m4377b(iArrCopyOf);
                if (!c1862g0.m4385i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c1862g0.f8162g = false;
            }
            if (c1862g0.m4384h()) {
                c1862g0.m4380a();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m4358k(int i3) {
        C1862g0 c1862g0 = this.f8106i;
        if (c1862g0.m4386j()) {
            if (i3 == 0) {
                c1862g0.f8156a = 0;
                c1862g0.f8159d = -1.0f;
                c1862g0.f8160e = -1.0f;
                c1862g0.f8158c = -1.0f;
                c1862g0.f8161f = new int[0];
                c1862g0.f8157b = false;
                return;
            }
            if (i3 != 1) {
                throw new IllegalArgumentException(AbstractC0462h.m1165e(i3, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c1862g0.f8165j.getResources().getDisplayMetrics();
            c1862g0.m4387k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c1862g0.m4384h()) {
                c1862g0.m4380a();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m4359l(ColorStateList colorStateList) {
        if (this.f8105h == null) {
            this.f8105h = new C1830T0();
        }
        C1830T0 c1830t0 = this.f8105h;
        c1830t0.f8091a = colorStateList;
        c1830t0.f8094d = colorStateList != null;
        this.f8099b = c1830t0;
        this.f8100c = c1830t0;
        this.f8101d = c1830t0;
        this.f8102e = c1830t0;
        this.f8103f = c1830t0;
        this.f8104g = c1830t0;
    }

    /* JADX INFO: renamed from: m */
    public final void m4360m(PorterDuff.Mode mode) {
        if (this.f8105h == null) {
            this.f8105h = new C1830T0();
        }
        C1830T0 c1830t0 = this.f8105h;
        c1830t0.f8092b = mode;
        c1830t0.f8093c = mode != null;
        this.f8099b = c1830t0;
        this.f8100c = c1830t0;
        this.f8101d = c1830t0;
        this.f8102e = c1830t0;
        this.f8103f = c1830t0;
        this.f8104g = c1830t0;
    }

    /* JADX INFO: renamed from: n */
    public final void m4361n(Context context, C0858A c0858a) {
        String string;
        int i3 = this.f8107j;
        TypedArray typedArray = (TypedArray) c0858a.f3640i;
        this.f8107j = typedArray.getInt(2, i3);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            int i5 = typedArray.getInt(11, -1);
            this.f8108k = i5;
            if (i5 != -1) {
                this.f8107j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f8110m = false;
                int i6 = typedArray.getInt(1, 1);
                if (i6 == 1) {
                    this.f8109l = Typeface.SANS_SERIF;
                    return;
                } else if (i6 == 2) {
                    this.f8109l = Typeface.SERIF;
                    return;
                } else {
                    if (i6 != 3) {
                        return;
                    }
                    this.f8109l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f8109l = null;
        int i7 = typedArray.hasValue(12) ? 12 : 10;
        int i8 = this.f8108k;
        int i9 = this.f8107j;
        if (!context.isRestricted()) {
            WeakReference weakReference = new WeakReference(this.f8098a);
            C0368e c0368e = new C0368e();
            c0368e.f1181d = this;
            c0368e.f1178a = i8;
            c0368e.f1179b = i9;
            c0368e.f1180c = weakReference;
            try {
                Typeface typefaceM2160H = c0858a.m2160H(i7, this.f8107j, c0368e);
                if (typefaceM2160H != null) {
                    if (i4 < 28 || this.f8108k == -1) {
                        this.f8109l = typefaceM2160H;
                    } else {
                        this.f8109l = AbstractC1835W.m4347a(Typeface.create(typefaceM2160H, 0), this.f8108k, (this.f8107j & 2) != 0);
                    }
                }
                this.f8110m = this.f8109l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f8109l != null || (string = typedArray.getString(i7)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f8108k == -1) {
            this.f8109l = Typeface.create(string, this.f8107j);
        } else {
            this.f8109l = AbstractC1835W.m4347a(Typeface.create(string, 0), this.f8108k, (this.f8107j & 2) != 0);
        }
    }
}

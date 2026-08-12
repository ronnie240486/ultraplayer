package p113k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import p060U1.AbstractC0610a;
import p087d.AbstractC1376a;
import p148t.AbstractC2262a;

/* JADX INFO: renamed from: k.R0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1826R0 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f8083a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final int[] f8084b = {-16842910};

    /* JADX INFO: renamed from: c */
    public static final int[] f8085c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d */
    public static final int[] f8086d = {R.attr.state_pressed};

    /* JADX INFO: renamed from: e */
    public static final int[] f8087e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f */
    public static final int[] f8088f = new int[0];

    /* JADX INFO: renamed from: g */
    public static final int[] f8089g = new int[1];

    /* JADX INFO: renamed from: a */
    public static void m4334a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC1376a.f6104j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m4335b(Context context, int i3) {
        ColorStateList colorStateListM4337d = m4337d(context, i3);
        if (colorStateListM4337d != null && colorStateListM4337d.isStateful()) {
            return colorStateListM4337d.getColorForState(f8084b, colorStateListM4337d.getDefaultColor());
        }
        ThreadLocal threadLocal = f8083a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        int iM4336c = m4336c(context, i3);
        return AbstractC2262a.m4860h(iM4336c, Math.round(Color.alpha(iM4336c) * f));
    }

    /* JADX INFO: renamed from: c */
    public static int m4336c(Context context, int i3) {
        int[] iArr = f8089g;
        iArr[0] = i3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m4337d(Context context, int i3) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f8089g;
        iArr[0] = i3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = AbstractC0610a.m1510l(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}

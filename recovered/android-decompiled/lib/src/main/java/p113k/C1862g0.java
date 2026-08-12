package p113k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: k.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1862g0 {

    /* JADX INFO: renamed from: l */
    public static final RectF f8154l = new RectF();

    /* JADX INFO: renamed from: m */
    public static final ConcurrentHashMap f8155m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public int f8156a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f8157b = false;

    /* JADX INFO: renamed from: c */
    public float f8158c = -1.0f;

    /* JADX INFO: renamed from: d */
    public float f8159d = -1.0f;

    /* JADX INFO: renamed from: e */
    public float f8160e = -1.0f;

    /* JADX INFO: renamed from: f */
    public int[] f8161f = new int[0];

    /* JADX INFO: renamed from: g */
    public boolean f8162g = false;

    /* JADX INFO: renamed from: h */
    public TextPaint f8163h;

    /* JADX INFO: renamed from: i */
    public final TextView f8164i;

    /* JADX INFO: renamed from: j */
    public final Context f8165j;

    /* JADX INFO: renamed from: k */
    public final C1859f0 f8166k;

    public C1862g0(TextView textView) {
        this.f8164i = textView;
        this.f8165j = textView.getContext();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            this.f8166k = new C1856e0();
        } else if (i3 >= 23) {
            this.f8166k = new C1853d0();
        } else {
            this.f8166k = new C1859f0();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int[] m4377b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i3 : iArr) {
                if (i3 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i3)) < 0) {
                    arrayList.add(Integer.valueOf(i3));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i4 = 0; i4 < size; i4++) {
                    iArr2[i4] = ((Integer) arrayList.get(i4)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: d */
    public static Method m4378d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f8155m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e3) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static Object m4379e(Object obj, String str, Object obj2) {
        try {
            return m4378d(str).invoke(obj, null);
        } catch (Exception e3) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e3);
            return obj2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4380a() {
        if (m4382f()) {
            if (this.f8157b) {
                if (this.f8164i.getMeasuredHeight() <= 0 || this.f8164i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f8166k.mo4375b(this.f8164i) ? 1048576 : (this.f8164i.getMeasuredWidth() - this.f8164i.getTotalPaddingLeft()) - this.f8164i.getTotalPaddingRight();
                int height = (this.f8164i.getHeight() - this.f8164i.getCompoundPaddingBottom()) - this.f8164i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f8154l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fM4381c = m4381c(rectF);
                        if (fM4381c != this.f8164i.getTextSize()) {
                            m4383g(0, fM4381c);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f8157b = true;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m4381c(RectF rectF) {
        CharSequence charSequence;
        StaticLayout staticLayout;
        CharSequence transformation;
        int length = this.f8161f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i3 = length - 1;
        int i4 = 1;
        int i5 = 0;
        while (i4 <= i3) {
            int i6 = (i4 + i3) / 2;
            int i7 = this.f8161f[i6];
            TextView textView = this.f8164i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence2 = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f8163h;
            if (textPaint == null) {
                this.f8163h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f8163h.set(textView.getPaint());
            this.f8163h.setTextSize(i7);
            Layout.Alignment alignment = (Layout.Alignment) m4379e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
            int iRound = Math.round(rectF.right);
            if (Build.VERSION.SDK_INT >= 23) {
                staticLayout = AbstractC1850c0.m4370a(charSequence2, alignment, iRound, maxLines, this.f8164i, this.f8163h, this.f8166k);
                charSequence = charSequence2;
            } else {
                charSequence = charSequence2;
                staticLayout = new StaticLayout(charSequence, this.f8163h, iRound, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
            }
            if ((maxLines == -1 || (staticLayout.getLineCount() <= maxLines && staticLayout.getLineEnd(staticLayout.getLineCount() - 1) == charSequence.length())) && staticLayout.getHeight() <= rectF.bottom) {
                int i8 = i6 + 1;
                i5 = i4;
                i4 = i8;
            } else {
                i5 = i6 - 1;
                i3 = i5;
            }
        }
        return this.f8161f[i5];
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4382f() {
        return m4386j() && this.f8156a != 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m4383g(int i3, float f) {
        Context context = this.f8165j;
        float fApplyDimension = TypedValue.applyDimension(i3, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f8164i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f8157b = false;
                try {
                    Method methodM4378d = m4378d("nullLayouts");
                    if (methodM4378d != null) {
                        methodM4378d.invoke(textView, null);
                    }
                } catch (Exception e3) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e3);
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m4384h() {
        if (m4386j() && this.f8156a == 1) {
            if (!this.f8162g || this.f8161f.length == 0) {
                int iFloor = ((int) Math.floor((this.f8160e - this.f8159d) / this.f8158c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i3 = 0; i3 < iFloor; i3++) {
                    iArr[i3] = Math.round((i3 * this.f8158c) + this.f8159d);
                }
                this.f8161f = m4377b(iArr);
            }
            this.f8157b = true;
        } else {
            this.f8157b = false;
        }
        return this.f8157b;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m4385i() {
        int[] iArr = this.f8161f;
        int length = iArr.length;
        boolean z3 = length > 0;
        this.f8162g = z3;
        if (z3) {
            this.f8156a = 1;
            this.f8159d = iArr[0];
            this.f8160e = iArr[length - 1];
            this.f8158c = -1.0f;
        }
        return z3;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m4386j() {
        return !(this.f8164i instanceof C1895u);
    }

    /* JADX INFO: renamed from: k */
    public final void m4387k(float f, float f3, float f4) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f3 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
        this.f8156a = 1;
        this.f8159d = f;
        this.f8160e = f3;
        this.f8158c = f4;
        this.f8162g = false;
    }
}

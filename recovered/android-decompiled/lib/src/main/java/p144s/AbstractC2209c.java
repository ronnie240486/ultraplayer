package p144s;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.zuxoplayer.app.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;
import p132p.AbstractC2086a;

/* JADX INFO: renamed from: s.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2209c {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f9513a = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static ColorStateList m4793a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m4794b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX INFO: renamed from: b */
    public static ColorStateList m4794b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        int i3;
        int iM4785d;
        TypedValue typedValue;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r4 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr = new int[20];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == r4 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr2 = AbstractC2086a.f9059a;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, i4, i4);
                int resourceId = typedArrayObtainAttributes.getResourceId(i4, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f9513a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, (boolean) r4);
                    int i6 = typedValue.type;
                    if (i6 < 28 || i6 > 31) {
                        try {
                            color = m4793a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = typedArrayObtainAttributes.getColor(i4, -65281);
                        }
                    } else {
                        color = typedArrayObtainAttributes.getColor(i4, -65281);
                    }
                } else {
                    color = typedArrayObtainAttributes.getColor(i4, -65281);
                }
                float f = typedArrayObtainAttributes.hasValue(r4) ? typedArrayObtainAttributes.getFloat(r4, 1.0f) : typedArrayObtainAttributes.hasValue(3) ? typedArrayObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                float f3 = (Build.VERSION.SDK_INT < 31 || !typedArrayObtainAttributes.hasValue(2)) ? typedArrayObtainAttributes.getFloat(4, -1.0f) : typedArrayObtainAttributes.getFloat(2, -1.0f);
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i7 = 0;
                for (int i8 = 0; i8 < attributeCount; i8++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i8);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i9 = i7 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i8, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i7] = attributeNameResource;
                        i7 = i9;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr3, i7);
                boolean z3 = f3 >= 0.0f && f3 <= 100.0f;
                if (f != 1.0f || z3) {
                    int iAlpha = (int) ((Color.alpha(color) * f) + 0.5f);
                    if (iAlpha < 0) {
                        i3 = 0;
                    } else {
                        i3 = 255;
                        if (iAlpha <= 255) {
                            i3 = iAlpha;
                        }
                    }
                    if (z3) {
                        C2207a c2207aM4779a = C2207a.m4779a(color);
                        C2221o c2221o = C2221o.f9533k;
                        float f4 = c2207aM4779a.f9501b;
                        if (f4 >= 1.0d && Math.round(f3) > 0.0d && Math.round(f3) < 100.0d) {
                            float f5 = c2207aM4779a.f9500a;
                            float fMin = f5 < 0.0f ? 0.0f : Math.min(360.0f, f5);
                            float f6 = f4;
                            C2207a c2207a = null;
                            boolean z4 = true;
                            float f7 = 0.0f;
                            while (true) {
                                if (Math.abs(f7 - f4) < 0.4f) {
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                    if (c2207a != null) {
                                        iM4785d = c2207a.m4781c(c2221o);
                                        break;
                                    }
                                    iM4785d = AbstractC2208b.m4785d(f3);
                                    break;
                                }
                                float f8 = 1000.0f;
                                float f9 = 1000.0f;
                                float f10 = 0.0f;
                                float f11 = 100.0f;
                                C2207a c2207a2 = null;
                                while (true) {
                                    if (Math.abs(f10 - f11) <= 0.01f) {
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        depth2 = depth2;
                                        break;
                                    }
                                    float f12 = ((f11 - f10) / 2.0f) + f10;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    int iM4781c = C2207a.m4780b(f12, f6, fMin).m4781c(C2221o.f9533k);
                                    float fM4786e = AbstractC2208b.m4786e(Color.red(iM4781c));
                                    float fM4786e2 = AbstractC2208b.m4786e(Color.green(iM4781c));
                                    float fM4786e3 = AbstractC2208b.m4786e(Color.blue(iM4781c));
                                    float[] fArr = AbstractC2208b.f9509d[1];
                                    float f13 = ((fM4786e3 * fArr[2]) + ((fM4786e2 * fArr[1]) + (fM4786e * fArr[0]))) / 100.0f;
                                    float fCbrt = f13 <= 0.008856452f ? f13 * 903.2963f : (((float) Math.cbrt(f13)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f3 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        C2207a c2207aM4779a2 = C2207a.m4779a(iM4781c);
                                        C2207a c2207aM4780b = C2207a.m4780b(c2207aM4779a2.f9502c, c2207aM4779a2.f9501b, fMin);
                                        float f14 = c2207aM4779a2.f9503d - c2207aM4780b.f9503d;
                                        float f15 = c2207aM4779a2.f9504e - c2207aM4780b.f9504e;
                                        float f16 = c2207aM4779a2.f9505f - c2207aM4780b.f9505f;
                                        depth2 = depth2;
                                        float fPow = (float) (Math.pow(Math.sqrt((f16 * f16) + (f15 * f15) + (f14 * f14)), 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            f9 = fPow;
                                            f8 = fAbs;
                                            c2207a2 = c2207aM4779a2;
                                        }
                                    } else {
                                        depth2 = depth2;
                                    }
                                    if (f8 == 0.0f && f9 == 0.0f) {
                                        break;
                                    }
                                    if (fCbrt < f3) {
                                        f10 = f12;
                                    } else {
                                        f11 = f12;
                                    }
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                }
                                C2207a c2207a3 = c2207a2;
                                if (!z4) {
                                    if (c2207a3 == null) {
                                        f4 = f6;
                                    } else {
                                        c2207a = c2207a3;
                                        f7 = f6;
                                    }
                                    f6 = ((f4 - f7) / 2.0f) + f7;
                                } else {
                                    if (c2207a3 != null) {
                                        iM4785d = c2207a3.m4781c(c2221o);
                                        break;
                                    }
                                    f6 = ((f4 - f7) / 2.0f) + f7;
                                    z4 = false;
                                }
                            }
                        } else {
                            iArrTrimStateSet = iArrTrimStateSet;
                            depth2 = depth2;
                            iM4785d = AbstractC2208b.m4785d(f3);
                        }
                        color = iM4785d;
                    } else {
                        iArrTrimStateSet = iArrTrimStateSet;
                        depth2 = depth2;
                    }
                    color = (16777215 & color) | (i3 << 24);
                } else {
                    iArrTrimStateSet = iArrTrimStateSet;
                    depth2 = depth2;
                }
                int i10 = i5 + 1;
                if (i10 > iArr.length) {
                    int[] iArr4 = new int[i5 <= 4 ? 8 : i5 * 2];
                    System.arraycopy(iArr, 0, iArr4, 0, i5);
                    iArr = iArr4;
                }
                iArr[i5] = color;
                if (i10 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i5 > 4 ? i5 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i5);
                    objArr = objArr2;
                }
                objArr[i5] = iArrTrimStateSet;
                objArr = (int[][]) objArr;
                i5 = i10;
                depth2 = depth2;
                r4 = 1;
                i4 = 0;
            } else {
                depth2 = depth2;
                r4 = 1;
                i4 = 0;
            }
        }
        int[] iArr5 = new int[i5];
        int[][] iArr6 = new int[i5][];
        System.arraycopy(iArr, 0, iArr5, 0, i5);
        System.arraycopy(objArr, 0, iArr6, 0, i5);
        return new ColorStateList(iArr6, iArr5);
    }
}

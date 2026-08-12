package p118l1;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;
import p060U1.AbstractC0610a;
import p144s.AbstractC2208b;
import p148t.C2267f;

/* JADX INFO: renamed from: l1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1975a {

    /* JADX INFO: renamed from: a */
    public static final int[] f8612a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* JADX INFO: renamed from: b */
    public static final int[] f8613b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* JADX INFO: renamed from: c */
    public static final int[] f8614c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* JADX INFO: renamed from: d */
    public static final int[] f8615d = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* JADX INFO: renamed from: e */
    public static final int[] f8616e = {R.attr.drawable};

    /* JADX INFO: renamed from: f */
    public static final int[] f8617f = {R.attr.name, R.attr.animation};

    /* JADX INFO: renamed from: g */
    public static final int[] f8618g = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};

    /* JADX INFO: renamed from: h */
    public static final int[] f8619h = {R.attr.ordering};

    /* JADX INFO: renamed from: i */
    public static final int[] f8620i = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};

    /* JADX INFO: renamed from: j */
    public static final int[] f8621j = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};

    /* JADX INFO: renamed from: k */
    public static final int[] f8622k = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};

    /* JADX WARN: Code duplicated, block: B:203:0x0379  */
    /* JADX INFO: renamed from: a */
    public static Animator m4513a(Context context, Resources resources, Resources.Theme theme, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i3) throws XmlPullParserException, IOException {
        int i4;
        PropertyValuesHolder[] propertyValuesHolderArr;
        int i5;
        String str;
        PropertyValuesHolder propertyValuesHolderM4514b;
        int size;
        int i6;
        Keyframe keyframeOfFloat;
        Animator animator;
        Animator animatorM4516d;
        int depth = xmlResourceParser.getDepth();
        Animator animator2 = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlResourceParser.next();
            boolean z3 = false;
            int i7 = 3;
            if (next == 3 && xmlResourceParser.getDepth() <= depth) {
                break;
            }
            int i8 = 1;
            if (next == 1) {
                break;
            }
            int i9 = 2;
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    m4516d(context, resources, theme, attributeSet, objectAnimator, xmlResourceParser);
                    animatorM4516d = objectAnimator;
                } else {
                    if (name.equals("animator")) {
                        animatorM4516d = m4516d(context, resources, theme, attributeSet, null, xmlResourceParser);
                    } else {
                        Resources resources2 = resources;
                        Resources.Theme theme2 = theme;
                        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
                        if (name.equals("set")) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            TypedArray typedArrayM4787f = AbstractC2208b.m4787f(resources2, theme2, attributeSet, f8619h);
                            m4513a(context, resources2, theme2, xmlResourceParser2, attributeSet, animatorSet2, xmlResourceParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "ordering") != null ? typedArrayM4787f.getInt(0, 0) : 0);
                            animator = animatorSet2;
                            typedArrayM4787f.recycle();
                            i4 = depth;
                            animator2 = animator;
                        } else {
                            String str2 = "propertyValuesHolder";
                            if (!name.equals("propertyValuesHolder")) {
                                throw new RuntimeException("Unknown animator name: " + xmlResourceParser.getName());
                            }
                            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser2);
                            ArrayList arrayList2 = null;
                            while (true) {
                                int eventType = xmlResourceParser2.getEventType();
                                if (eventType == i7 || eventType == i8) {
                                    break;
                                }
                                if (eventType != i9) {
                                    xmlResourceParser2.next();
                                } else {
                                    if (xmlResourceParser2.getName().equals(str2)) {
                                        TypedArray typedArrayM4787f2 = AbstractC2208b.m4787f(resources2, theme2, attributeSetAsAttributeSet, f8620i);
                                        String strM4783b = AbstractC2208b.m4783b(typedArrayM4787f2, xmlResourceParser2, "propertyName", i7);
                                        int i10 = !(xmlResourceParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null) ? 4 : typedArrayM4787f2.getInt(i9, 4);
                                        int i11 = i10;
                                        ArrayList arrayList3 = null;
                                        while (true) {
                                            int next2 = xmlResourceParser2.next();
                                            i5 = depth;
                                            if (next2 == 3 || next2 == 1) {
                                                break;
                                            }
                                            if (xmlResourceParser2.getName().equals("keyframe")) {
                                                int[] iArr = f8621j;
                                                if (i11 == 4) {
                                                    TypedArray typedArrayM4787f3 = AbstractC2208b.m4787f(resources2, theme2, Xml.asAttributeSet(xmlResourceParser2), iArr);
                                                    TypedValue typedValuePeekValue = !AbstractC2208b.m4784c(xmlResourceParser2, "value") ? null : typedArrayM4787f3.peekValue(0);
                                                    int i12 = (typedValuePeekValue == null || !m4515c(typedValuePeekValue.type)) ? 0 : 3;
                                                    typedArrayM4787f3.recycle();
                                                    i11 = i12;
                                                }
                                                TypedArray typedArrayM4787f4 = AbstractC2208b.m4787f(resources2, theme2, Xml.asAttributeSet(xmlResourceParser2), iArr);
                                                float f = AbstractC2208b.m4784c(xmlResourceParser2, "fraction") ? typedArrayM4787f4.getFloat(3, -1.0f) : -1.0f;
                                                TypedValue typedValuePeekValue2 = !AbstractC2208b.m4784c(xmlResourceParser2, "value") ? null : typedArrayM4787f4.peekValue(0);
                                                boolean z4 = typedValuePeekValue2 != null;
                                                int i13 = i11 == 4 ? (z4 && m4515c(typedValuePeekValue2.type)) ? 3 : 0 : i11;
                                                if (!z4) {
                                                    keyframeOfFloat = i13 == 0 ? Keyframe.ofFloat(f) : Keyframe.ofInt(f);
                                                } else if (i13 == 0) {
                                                    keyframeOfFloat = Keyframe.ofFloat(f, xmlResourceParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "value") != null ? typedArrayM4787f4.getFloat(0, 0.0f) : 0.0f);
                                                } else if (i13 == 1 || i13 == 3) {
                                                    keyframeOfFloat = Keyframe.ofInt(f, xmlResourceParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "value") != null ? typedArrayM4787f4.getInt(0, 0) : 0);
                                                } else {
                                                    keyframeOfFloat = null;
                                                }
                                                int resourceId = xmlResourceParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? typedArrayM4787f4.getResourceId(1, 0) : 0;
                                                if (resourceId > 0) {
                                                    keyframeOfFloat.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
                                                }
                                                typedArrayM4787f4.recycle();
                                                if (keyframeOfFloat != null) {
                                                    if (arrayList3 == null) {
                                                        arrayList3 = new ArrayList();
                                                    }
                                                    arrayList3.add(keyframeOfFloat);
                                                }
                                                xmlResourceParser2.next();
                                            }
                                            resources2 = resources;
                                            theme2 = theme;
                                            depth = i5;
                                            str2 = str2;
                                        }
                                        str = str2;
                                        if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                                            propertyValuesHolderM4514b = null;
                                        } else {
                                            Keyframe keyframe = (Keyframe) arrayList3.get(0);
                                            Keyframe keyframe2 = (Keyframe) arrayList3.get(size - 1);
                                            float fraction = keyframe2.getFraction();
                                            int i14 = size;
                                            Class cls = Integer.TYPE;
                                            Class cls2 = Float.TYPE;
                                            if (fraction < 1.0f) {
                                                if (fraction < 0.0f) {
                                                    keyframe2.setFraction(1.0f);
                                                } else {
                                                    arrayList3.add(arrayList3.size(), keyframe2.getType() == cls2 ? Keyframe.ofFloat(1.0f) : keyframe2.getType() == cls ? Keyframe.ofInt(1.0f) : Keyframe.ofObject(1.0f));
                                                    i14++;
                                                }
                                            }
                                            float fraction2 = keyframe.getFraction();
                                            if (fraction2 != 0.0f) {
                                                if (fraction2 < 0.0f) {
                                                    keyframe.setFraction(0.0f);
                                                } else {
                                                    arrayList3.add(0, keyframe.getType() == cls2 ? Keyframe.ofFloat(0.0f) : keyframe.getType() == cls ? Keyframe.ofInt(0.0f) : Keyframe.ofObject(0.0f));
                                                    i14++;
                                                }
                                            }
                                            int i15 = i14;
                                            Keyframe[] keyframeArr = new Keyframe[i15];
                                            arrayList3.toArray(keyframeArr);
                                            int i16 = 0;
                                            while (i16 < i15) {
                                                Keyframe keyframe3 = keyframeArr[i16];
                                                if (keyframe3.getFraction() >= 0.0f) {
                                                    i6 = i15;
                                                } else {
                                                    if (i16 == 0) {
                                                        keyframe3.setFraction(0.0f);
                                                    } else {
                                                        int i17 = i15 - 1;
                                                        if (i16 == i17) {
                                                            keyframe3.setFraction(1.0f);
                                                        } else {
                                                            int i18 = i16;
                                                            for (int i19 = i16 + 1; i19 < i17 && keyframeArr[i19].getFraction() < 0.0f; i19++) {
                                                                i18 = i19;
                                                            }
                                                            float fraction3 = (keyframeArr[i18 + 1].getFraction() - keyframeArr[i16 - 1].getFraction()) / ((i18 - i16) + 2);
                                                            int i20 = i16;
                                                            while (i20 <= i18) {
                                                                keyframeArr[i20].setFraction(keyframeArr[i20 - 1].getFraction() + fraction3);
                                                                i20++;
                                                                i15 = i15;
                                                            }
                                                            i6 = i15;
                                                        }
                                                    }
                                                    i6 = i15;
                                                }
                                                i16++;
                                                i15 = i6;
                                            }
                                            propertyValuesHolderM4514b = PropertyValuesHolder.ofKeyframe(strM4783b, keyframeArr);
                                            if (i11 == 3) {
                                                propertyValuesHolderM4514b.setEvaluator(C1980f.f8632a);
                                            }
                                        }
                                        if (propertyValuesHolderM4514b == null) {
                                            propertyValuesHolderM4514b = m4514b(typedArrayM4787f2, i10, 0, 1, strM4783b);
                                        }
                                        if (propertyValuesHolderM4514b != null) {
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            arrayList2.add(propertyValuesHolderM4514b);
                                        }
                                        typedArrayM4787f2.recycle();
                                    } else {
                                        i5 = depth;
                                        str = str2;
                                    }
                                    xmlResourceParser.next();
                                    resources2 = resources;
                                    theme2 = theme;
                                    xmlResourceParser2 = xmlResourceParser;
                                    attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                                    depth = i5;
                                    str2 = str;
                                    i7 = 3;
                                    i8 = 1;
                                    i9 = 2;
                                }
                            }
                            i4 = depth;
                            if (arrayList2 != null) {
                                int size2 = arrayList2.size();
                                propertyValuesHolderArr = new PropertyValuesHolder[size2];
                                for (int i21 = 0; i21 < size2; i21++) {
                                    propertyValuesHolderArr[i21] = (PropertyValuesHolder) arrayList2.get(i21);
                                }
                            } else {
                                propertyValuesHolderArr = null;
                            }
                            if (propertyValuesHolderArr != null && (animator2 instanceof ValueAnimator)) {
                                ((ValueAnimator) animator2).setValues(propertyValuesHolderArr);
                            }
                            z3 = true;
                            animator2 = animator2;
                        }
                    }
                    if (animatorSet != null && !z3) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(animator2);
                    }
                    depth = i4;
                }
                animator = animatorM4516d;
                i4 = depth;
                animator2 = animator;
                if (animatorSet != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(animator2);
                }
                depth = i4;
            }
        }
        int i22 = 0;
        if (animatorSet != null && arrayList != null) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            int size3 = arrayList.size();
            int i23 = 0;
            while (i22 < size3) {
                Object obj = arrayList.get(i22);
                i22++;
                animatorArr[i23] = (Animator) obj;
                i23++;
            }
            if (i3 == 0) {
                animatorSet.playTogether(animatorArr);
                return animator2;
            }
            animatorSet.playSequentially(animatorArr);
        }
        return animator2;
    }

    /* JADX INFO: renamed from: b */
    public static PropertyValuesHolder m4514b(TypedArray typedArray, int i3, int i4, int i5, String str) {
        int color;
        int color2;
        int color3;
        PropertyValuesHolder propertyValuesHolderOfFloat;
        TypedValue typedValuePeekValue = typedArray.peekValue(i4);
        boolean z3 = typedValuePeekValue != null;
        int i6 = z3 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i5);
        boolean z4 = typedValuePeekValue2 != null;
        int i7 = z4 ? typedValuePeekValue2.type : 0;
        if (i3 == 4) {
            i3 = ((z3 && m4515c(i6)) || (z4 && m4515c(i7))) ? 3 : 0;
        }
        boolean z5 = i3 == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i3 == 2) {
            String string = typedArray.getString(i4);
            String string2 = typedArray.getString(i5);
            C2267f[] c2267fArrM1507i = AbstractC0610a.m1507i(string);
            C2267f[] c2267fArrM1507i2 = AbstractC0610a.m1507i(string2);
            if (c2267fArrM1507i != null || c2267fArrM1507i2 != null) {
                if (c2267fArrM1507i != null) {
                    C1979e c1979e = new C1979e();
                    if (c2267fArrM1507i2 == null) {
                        return PropertyValuesHolder.ofObject(str, c1979e, c2267fArrM1507i);
                    }
                    if (AbstractC0610a.m1502d(c2267fArrM1507i, c2267fArrM1507i2)) {
                        return PropertyValuesHolder.ofObject(str, c1979e, c2267fArrM1507i, c2267fArrM1507i2);
                    }
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                if (c2267fArrM1507i2 != null) {
                    return PropertyValuesHolder.ofObject(str, new C1979e(), c2267fArrM1507i2);
                }
            }
            return null;
        }
        C1980f c1980f = i3 == 3 ? C1980f.f8632a : null;
        if (z5) {
            if (z3) {
                float dimension = i6 == 5 ? typedArray.getDimension(i4, 0.0f) : typedArray.getFloat(i4, 0.0f);
                if (z4) {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i7 == 5 ? typedArray.getDimension(i5, 0.0f) : typedArray.getFloat(i5, 0.0f));
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i7 == 5 ? typedArray.getDimension(i5, 0.0f) : typedArray.getFloat(i5, 0.0f));
            }
            propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
        } else if (z3) {
            if (i6 == 5) {
                color2 = (int) typedArray.getDimension(i4, 0.0f);
            } else {
                color2 = m4515c(i6) ? typedArray.getColor(i4, 0) : typedArray.getInt(i4, 0);
            }
            if (z4) {
                if (i7 == 5) {
                    color3 = (int) typedArray.getDimension(i5, 0.0f);
                } else {
                    color3 = m4515c(i7) ? typedArray.getColor(i5, 0) : typedArray.getInt(i5, 0);
                }
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2, color3);
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2);
            }
        } else if (z4) {
            if (i7 == 5) {
                color = (int) typedArray.getDimension(i5, 0.0f);
            } else {
                color = m4515c(i7) ? typedArray.getColor(i5, 0) : typedArray.getInt(i5, 0);
            }
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color);
        }
        if (propertyValuesHolderOfInt != null && c1980f != null) {
            propertyValuesHolderOfInt.setEvaluator(c1980f);
        }
        return propertyValuesHolderOfInt;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m4515c(int i3) {
        return i3 >= 28 && i3 <= 31;
    }

    /* JADX INFO: renamed from: d */
    public static ValueAnimator m4516d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        int resourceId = 0;
        TypedArray typedArrayM4787f = AbstractC2208b.m4787f(resources, theme, attributeSet, f8618g);
        TypedArray typedArrayM4787f2 = AbstractC2208b.m4787f(resources, theme, attributeSet, f8622k);
        ValueAnimator valueAnimator2 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long j3 = AbstractC2208b.m4784c(xmlResourceParser, "duration") ? typedArrayM4787f.getInt(1, 300) : 300;
        long j4 = !(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startOffset") != null) ? 0 : typedArrayM4787f.getInt(2, 0);
        int i3 = !(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null) ? 4 : typedArrayM4787f.getInt(7, 4);
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null && xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
            if (i3 == 4) {
                TypedValue typedValuePeekValue = typedArrayM4787f.peekValue(5);
                boolean z3 = typedValuePeekValue != null;
                int i4 = z3 ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayM4787f.peekValue(6);
                boolean z4 = typedValuePeekValue2 != null;
                i3 = ((z3 && m4515c(i4)) || (z4 && m4515c(z4 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderM4514b = m4514b(typedArrayM4787f, i3, 5, 6, "");
            if (propertyValuesHolderM4514b != null) {
                valueAnimator2.setValues(propertyValuesHolderM4514b);
            }
        }
        valueAnimator2.setDuration(j3);
        valueAnimator2.setStartDelay(j4);
        valueAnimator2.setRepeatCount(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatCount") != null ? typedArrayM4787f.getInt(3, 0) : 0);
        valueAnimator2.setRepeatMode(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatMode") != null ? typedArrayM4787f.getInt(4, 1) : 1);
        if (typedArrayM4787f2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator2;
            String strM4783b = AbstractC2208b.m4783b(typedArrayM4787f2, xmlResourceParser, "pathData", 1);
            if (strM4783b != null) {
                String strM4783b2 = AbstractC2208b.m4783b(typedArrayM4787f2, xmlResourceParser, "propertyXName", 2);
                String strM4783b3 = AbstractC2208b.m4783b(typedArrayM4787f2, xmlResourceParser, "propertyYName", 3);
                if (i3 != 2) {
                }
                if (strM4783b2 == null && strM4783b3 == null) {
                    throw new InflateException(typedArrayM4787f2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path path = new Path();
                try {
                    C2267f.m4866b(AbstractC0610a.m1507i(strM4783b), path);
                    PathMeasure pathMeasure = new PathMeasure(path, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Float.valueOf(0.0f));
                    float length = 0.0f;
                    do {
                        length += pathMeasure.getLength();
                        arrayList.add(Float.valueOf(length));
                    } while (pathMeasure.nextContour());
                    PathMeasure pathMeasure2 = new PathMeasure(path, false);
                    int iMin = Math.min(100, ((int) (length / 0.5f)) + 1);
                    float[] fArr = new float[iMin];
                    float[] fArr2 = new float[iMin];
                    float[] fArr3 = new float[2];
                    float f = length / (iMin - 1);
                    float f3 = 0.0f;
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        if (i5 >= iMin) {
                            break;
                        }
                        int i7 = i5;
                        pathMeasure2.getPosTan(f3 - ((Float) arrayList.get(i6)).floatValue(), fArr3, null);
                        fArr[i7] = fArr3[0];
                        fArr2[i7] = fArr3[1];
                        int i8 = i6 + 1;
                        f3 += f;
                        if (i8 < arrayList.size() && f3 > ((Float) arrayList.get(i8)).floatValue()) {
                            pathMeasure2.nextContour();
                            i6 = i8;
                        }
                        i5 = i7 + 1;
                    }
                    PropertyValuesHolder propertyValuesHolderOfFloat = strM4783b2 != null ? PropertyValuesHolder.ofFloat(strM4783b2, fArr) : null;
                    PropertyValuesHolder propertyValuesHolderOfFloat2 = strM4783b3 != null ? PropertyValuesHolder.ofFloat(strM4783b3, fArr2) : null;
                    if (propertyValuesHolderOfFloat == null) {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat2);
                    } else if (propertyValuesHolderOfFloat2 == null) {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat);
                    } else {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                    }
                    resourceId = 0;
                } catch (RuntimeException e3) {
                    throw new RuntimeException("Error in parsing ".concat(strM4783b), e3);
                }
            } else {
                resourceId = 0;
                objectAnimator2.setPropertyName(AbstractC2208b.m4783b(typedArrayM4787f2, xmlResourceParser, "propertyName", 0));
            }
        }
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null) {
            resourceId = typedArrayM4787f.getResourceId(resourceId, resourceId);
        }
        if (resourceId > 0) {
            valueAnimator = valueAnimator2;
            valueAnimator.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator = valueAnimator2;
        }
        typedArrayM4787f.recycle();
        if (typedArrayM4787f2 != null) {
            typedArrayM4787f2.recycle();
        }
        return valueAnimator;
    }
}

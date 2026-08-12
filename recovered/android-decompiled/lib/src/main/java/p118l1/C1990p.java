package p118l1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p060U1.AbstractC0610a;
import p122m1.AbstractC2003a;
import p124n.C2018e;
import p144s.AbstractC2208b;
import p144s.AbstractC2209c;
import p152u.AbstractC2279a;

/* JADX INFO: renamed from: l1.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1990p extends AbstractC1981g {

    /* JADX INFO: renamed from: p */
    public static final PorterDuff.Mode f8688p = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h */
    public C1988n f8689h;

    /* JADX INFO: renamed from: i */
    public PorterDuffColorFilter f8690i;

    /* JADX INFO: renamed from: j */
    public ColorFilter f8691j;

    /* JADX INFO: renamed from: k */
    public boolean f8692k;

    /* JADX INFO: renamed from: l */
    public boolean f8693l;

    /* JADX INFO: renamed from: m */
    public final float[] f8694m;

    /* JADX INFO: renamed from: n */
    public final Matrix f8695n;

    /* JADX INFO: renamed from: o */
    public final Rect f8696o;

    public C1990p() {
        this.f8693l = true;
        this.f8694m = new float[9];
        this.f8695n = new Matrix();
        this.f8696o = new Rect();
        C1988n c1988n = new C1988n();
        c1988n.f8677c = null;
        c1988n.f8678d = f8688p;
        c1988n.f8676b = new C1987m();
        this.f8689h = c1988n;
    }

    /* JADX INFO: renamed from: a */
    public final PorterDuffColorFilter m4521a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f8633g;
        if (drawable == null) {
            return false;
        }
        AbstractC2279a.m4886b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f8696o;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f8691j;
        if (colorFilter == null) {
            colorFilter = this.f8690i;
        }
        Matrix matrix = this.f8695n;
        canvas.getMatrix(matrix);
        float[] fArr = this.f8694m;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && AbstractC2003a.m4540m(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C1988n c1988n = this.f8689h;
        Bitmap bitmap = c1988n.f8680f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c1988n.f8680f.getHeight()) {
            c1988n.f8680f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c1988n.f8685k = true;
        }
        if (this.f8693l) {
            C1988n c1988n2 = this.f8689h;
            if (c1988n2.f8685k || c1988n2.f8681g != c1988n2.f8677c || c1988n2.f8682h != c1988n2.f8678d || c1988n2.f8684j != c1988n2.f8679e || c1988n2.f8683i != c1988n2.f8676b.getRootAlpha()) {
                C1988n c1988n3 = this.f8689h;
                c1988n3.f8680f.eraseColor(0);
                Canvas canvas2 = new Canvas(c1988n3.f8680f);
                C1987m c1987m = c1988n3.f8676b;
                c1987m.m4520a(c1987m.f8666g, C1987m.f8659p, canvas2, iMin, iMin2);
                C1988n c1988n4 = this.f8689h;
                c1988n4.f8681g = c1988n4.f8677c;
                c1988n4.f8682h = c1988n4.f8678d;
                c1988n4.f8683i = c1988n4.f8676b.getRootAlpha();
                c1988n4.f8684j = c1988n4.f8679e;
                c1988n4.f8685k = false;
            }
        } else {
            C1988n c1988n5 = this.f8689h;
            c1988n5.f8680f.eraseColor(0);
            Canvas canvas3 = new Canvas(c1988n5.f8680f);
            C1987m c1987m2 = c1988n5.f8676b;
            c1987m2.m4520a(c1987m2.f8666g, C1987m.f8659p, canvas3, iMin, iMin2);
        }
        C1988n c1988n6 = this.f8689h;
        if (c1988n6.f8676b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c1988n6.f8686l == null) {
                Paint paint2 = new Paint();
                c1988n6.f8686l = paint2;
                paint2.setFilterBitmap(true);
            }
            c1988n6.f8686l.setAlpha(c1988n6.f8676b.getRootAlpha());
            c1988n6.f8686l.setColorFilter(colorFilter);
            paint = c1988n6.f8686l;
        }
        canvas.drawBitmap(c1988n6.f8680f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f8633g;
        return drawable != null ? drawable.getAlpha() : this.f8689h.f8676b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f8633g;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f8689h.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f8633g;
        return drawable != null ? AbstractC2279a.m4887c(drawable) : this.f8691j;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f8633g != null && Build.VERSION.SDK_INT >= 24) {
            return new C1989o(this.f8633g.getConstantState());
        }
        this.f8689h.f8675a = getChangingConfigurations();
        return this.f8689h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f8633g;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f8689h.f8676b.f8668i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f8633g;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f8689h.f8676b.f8667h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f8633g;
        return drawable != null ? drawable.isAutoMirrored() : this.f8689h.f8679e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C1988n c1988n = this.f8689h;
        if (c1988n == null) {
            return false;
        }
        C1987m c1987m = c1988n.f8676b;
        if (c1987m.f8673n == null) {
            c1987m.f8673n = Boolean.valueOf(c1987m.f8666g.mo4517a());
        }
        if (c1987m.f8673n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f8689h.f8677c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f8692k && super.mutate() == this) {
            C1988n c1988n = this.f8689h;
            C1988n c1988n2 = new C1988n();
            c1988n2.f8677c = null;
            c1988n2.f8678d = f8688p;
            if (c1988n != null) {
                c1988n2.f8675a = c1988n.f8675a;
                C1987m c1987m = new C1987m(c1988n.f8676b);
                c1988n2.f8676b = c1987m;
                if (c1988n.f8676b.f8664e != null) {
                    c1987m.f8664e = new Paint(c1988n.f8676b.f8664e);
                }
                if (c1988n.f8676b.f8663d != null) {
                    c1988n2.f8676b.f8663d = new Paint(c1988n.f8676b.f8663d);
                }
                c1988n2.f8677c = c1988n.f8677c;
                c1988n2.f8678d = c1988n.f8678d;
                c1988n2.f8679e = c1988n.f8679e;
            }
            this.f8689h = c1988n2;
            this.f8692k = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z3;
        PorterDuff.Mode mode;
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C1988n c1988n = this.f8689h;
        ColorStateList colorStateList = c1988n.f8677c;
        if (colorStateList == null || (mode = c1988n.f8678d) == null) {
            z3 = false;
        } else {
            this.f8690i = m4521a(colorStateList, mode);
            invalidateSelf();
            z3 = true;
        }
        C1987m c1987m = c1988n.f8676b;
        if (c1987m.f8673n == null) {
            c1987m.f8673n = Boolean.valueOf(c1987m.f8666g.mo4517a());
        }
        if (c1987m.f8673n.booleanValue()) {
            boolean zMo4518b = c1988n.f8676b.f8666g.mo4518b(iArr);
            c1988n.f8685k |= zMo4518b;
            if (zMo4518b) {
                invalidateSelf();
                return true;
            }
        }
        return z3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j3) {
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j3);
        } else {
            super.scheduleSelf(runnable, j3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            drawable.setAlpha(i3);
        } else if (this.f8689h.f8676b.getRootAlpha() != i3) {
            this.f8689h.f8676b.setRootAlpha(i3);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            drawable.setAutoMirrored(z3);
        } else {
            this.f8689h.f8679e = z3;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f8691j = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i3) {
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            AbstractC2003a.m4546s(drawable, i3);
        } else {
            setTintList(ColorStateList.valueOf(i3));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            AbstractC2279a.m4892h(drawable, colorStateList);
            return;
        }
        C1988n c1988n = this.f8689h;
        if (c1988n.f8677c != colorStateList) {
            c1988n.f8677c = colorStateList;
            this.f8690i = m4521a(colorStateList, c1988n.f8678d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            AbstractC2279a.m4893i(drawable, mode);
            return;
        }
        C1988n c1988n = this.f8689h;
        if (c1988n.f8678d != mode) {
            c1988n.f8678d = mode;
            this.f8690i = m4521a(c1988n.f8677c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z4) {
        Drawable drawable = this.f8633g;
        return drawable != null ? drawable.setVisible(z3, z4) : super.setVisible(z3, z4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C1987m c1987m;
        int i3;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            AbstractC2279a.m4888d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C1988n c1988n = this.f8689h;
        c1988n.f8676b = new C1987m();
        TypedArray typedArrayM4787f = AbstractC2208b.m4787f(resources, theme, attributeSet, AbstractC1975a.f8612a);
        C1988n c1988n2 = this.f8689h;
        C1987m c1987m2 = c1988n2.f8676b;
        int i4 = !AbstractC2208b.m4784c(xmlPullParser, "tintMode") ? -1 : typedArrayM4787f.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i4 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i4 != 5) {
            if (i4 != 9) {
                switch (i4) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c1988n2.f8678d = mode;
        ColorStateList colorStateListM4793a = null;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayM4787f.getValue(1, typedValue);
            int i5 = typedValue.type;
            if (i5 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i5 >= 28 && i5 <= 31) {
                colorStateListM4793a = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayM4787f.getResources();
                int resourceId = typedArrayM4787f.getResourceId(1, 0);
                ThreadLocal threadLocal = AbstractC2209c.f9513a;
                try {
                    colorStateListM4793a = AbstractC2209c.m4793a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e3) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e3);
                }
            }
        }
        ColorStateList colorStateList = colorStateListM4793a;
        if (colorStateList != null) {
            c1988n2.f8677c = colorStateList;
        }
        boolean z3 = c1988n2.f8679e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z3 = typedArrayM4787f.getBoolean(5, z3);
        }
        c1988n2.f8679e = z3;
        float f = c1987m2.f8669j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayM4787f.getFloat(7, f);
        }
        c1987m2.f8669j = f;
        float f3 = c1987m2.f8670k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f3 = typedArrayM4787f.getFloat(8, f3);
        }
        c1987m2.f8670k = f3;
        if (c1987m2.f8669j <= 0.0f) {
            throw new XmlPullParserException(typedArrayM4787f.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f3 > 0.0f) {
            c1987m2.f8667h = typedArrayM4787f.getDimension(3, c1987m2.f8667h);
            float dimension = typedArrayM4787f.getDimension(2, c1987m2.f8668i);
            c1987m2.f8668i = dimension;
            if (c1987m2.f8667h <= 0.0f) {
                throw new XmlPullParserException(typedArrayM4787f.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = c1987m2.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayM4787f.getFloat(4, alpha);
                }
                c1987m2.setAlpha(alpha);
                String string = typedArrayM4787f.getString(0);
                if (string != null) {
                    c1987m2.f8672m = string;
                    c1987m2.f8674o.put(string, c1987m2);
                }
                typedArrayM4787f.recycle();
                c1988n.f8675a = getChangingConfigurations();
                c1988n.f8685k = true;
                C1988n c1988n3 = this.f8689h;
                C1987m c1987m3 = c1988n3.f8676b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(c1987m3.f8666g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z4 = true;
                for (int i6 = 1; eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != 3); i6 = 1) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C1984j c1984j = (C1984j) arrayDeque.peek();
                        boolean zEquals = "path".equals(name);
                        i3 = depth;
                        C2018e c2018e = c1987m3.f8674o;
                        if (zEquals) {
                            C1983i c1983i = new C1983i();
                            c1983i.f8635e = 0.0f;
                            c1983i.f8637g = 1.0f;
                            c1983i.f8638h = 1.0f;
                            c1987m = c1987m3;
                            c1983i.f8639i = 0.0f;
                            c1983i.f8640j = 1.0f;
                            c1983i.f8641k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            c1983i.f8642l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            c1983i.f8643m = join2;
                            c1983i.f8644n = 4.0f;
                            TypedArray typedArrayM4787f2 = AbstractC2208b.m4787f(resources, theme, attributeSet, AbstractC1975a.f8614c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = typedArrayM4787f2.getString(0);
                                if (string2 != null) {
                                    c1983i.f8657b = string2;
                                }
                                String string3 = typedArrayM4787f2.getString(2);
                                if (string3 != null) {
                                    c1983i.f8656a = AbstractC0610a.m1507i(string3);
                                }
                                c1983i.f8636f = AbstractC2208b.m4782a(typedArrayM4787f2, xmlPullParser, theme, "fillColor", 1);
                                float f4 = c1983i.f8638h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f4 = typedArrayM4787f2.getFloat(12, f4);
                                }
                                c1983i.f8638h = f4;
                                int i7 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayM4787f2.getInt(8, -1) : -1;
                                Paint.Cap cap3 = c1983i.f8642l;
                                if (i7 == 0) {
                                    cap = cap2;
                                } else if (i7 != 1) {
                                    cap = i7 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                c1983i.f8642l = cap;
                                int i8 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayM4787f2.getInt(9, -1) : -1;
                                Paint.Join join3 = c1983i.f8643m;
                                if (i8 == 0) {
                                    join = join2;
                                } else if (i8 != 1) {
                                    join = i8 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                c1983i.f8643m = join;
                                float f5 = c1983i.f8644n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f5 = typedArrayM4787f2.getFloat(10, f5);
                                }
                                c1983i.f8644n = f5;
                                c1983i.f8634d = AbstractC2208b.m4782a(typedArrayM4787f2, xmlPullParser, theme, "strokeColor", 3);
                                float f6 = c1983i.f8637g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f6 = typedArrayM4787f2.getFloat(11, f6);
                                }
                                c1983i.f8637g = f6;
                                float f7 = c1983i.f8635e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f7 = typedArrayM4787f2.getFloat(4, f7);
                                }
                                c1983i.f8635e = f7;
                                float f8 = c1983i.f8640j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f8 = typedArrayM4787f2.getFloat(6, f8);
                                }
                                c1983i.f8640j = f8;
                                float f9 = c1983i.f8641k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f9 = typedArrayM4787f2.getFloat(7, f9);
                                }
                                c1983i.f8641k = f9;
                                float f10 = c1983i.f8639i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f10 = typedArrayM4787f2.getFloat(5, f10);
                                }
                                c1983i.f8639i = f10;
                                int i9 = c1983i.f8658c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i9 = typedArrayM4787f2.getInt(13, i9);
                                }
                                c1983i.f8658c = i9;
                            }
                            typedArrayM4787f2.recycle();
                            c1984j.f8646b.add(c1983i);
                            if (c1983i.getPathName() != null) {
                                c2018e.put(c1983i.getPathName(), c1983i);
                            }
                            c1988n3.f8675a = c1988n3.f8675a;
                            z4 = false;
                        } else {
                            c1987m = c1987m3;
                            if ("clip-path".equals(name)) {
                                C1982h c1982h = new C1982h();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray typedArrayM4787f3 = AbstractC2208b.m4787f(resources, theme, attributeSet, AbstractC1975a.f8615d);
                                    String string4 = typedArrayM4787f3.getString(0);
                                    if (string4 != null) {
                                        c1982h.f8657b = string4;
                                    }
                                    String string5 = typedArrayM4787f3.getString(1);
                                    if (string5 != null) {
                                        c1982h.f8656a = AbstractC0610a.m1507i(string5);
                                    }
                                    c1982h.f8658c = !AbstractC2208b.m4784c(xmlPullParser, "fillType") ? 0 : typedArrayM4787f3.getInt(2, 0);
                                    typedArrayM4787f3.recycle();
                                }
                                c1984j.f8646b.add(c1982h);
                                if (c1982h.getPathName() != null) {
                                    c2018e.put(c1982h.getPathName(), c1982h);
                                }
                                c1988n3.f8675a = c1988n3.f8675a;
                            } else if ("group".equals(name)) {
                                C1984j c1984j2 = new C1984j();
                                TypedArray typedArrayM4787f4 = AbstractC2208b.m4787f(resources, theme, attributeSet, AbstractC1975a.f8613b);
                                float f11 = c1984j2.f8647c;
                                if (AbstractC2208b.m4784c(xmlPullParser, "rotation")) {
                                    f11 = typedArrayM4787f4.getFloat(5, f11);
                                }
                                c1984j2.f8647c = f11;
                                c1984j2.f8648d = typedArrayM4787f4.getFloat(1, c1984j2.f8648d);
                                c1984j2.f8649e = typedArrayM4787f4.getFloat(2, c1984j2.f8649e);
                                float f12 = c1984j2.f8650f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f12 = typedArrayM4787f4.getFloat(3, f12);
                                }
                                c1984j2.f8650f = f12;
                                float f13 = c1984j2.f8651g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f13 = typedArrayM4787f4.getFloat(4, f13);
                                }
                                c1984j2.f8651g = f13;
                                float f14 = c1984j2.f8652h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f14 = typedArrayM4787f4.getFloat(6, f14);
                                }
                                c1984j2.f8652h = f14;
                                float f15 = c1984j2.f8653i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f15 = typedArrayM4787f4.getFloat(7, f15);
                                }
                                c1984j2.f8653i = f15;
                                String string6 = typedArrayM4787f4.getString(0);
                                if (string6 != null) {
                                    c1984j2.f8655k = string6;
                                }
                                c1984j2.m4519c();
                                typedArrayM4787f4.recycle();
                                c1984j.f8646b.add(c1984j2);
                                arrayDeque.push(c1984j2);
                                if (c1984j2.getGroupName() != null) {
                                    c2018e.put(c1984j2.getGroupName(), c1984j2);
                                }
                                c1988n3.f8675a = c1988n3.f8675a;
                            }
                        }
                    } else {
                        c1987m = c1987m3;
                        i3 = depth;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    c1987m3 = c1987m;
                    depth = i3;
                }
                if (!z4) {
                    this.f8690i = m4521a(c1988n.f8677c, c1988n.f8678d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayM4787f.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayM4787f.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public C1990p(C1988n c1988n) {
        this.f8693l = true;
        this.f8694m = new float[9];
        this.f8695n = new Matrix();
        this.f8696o = new Rect();
        this.f8689h = c1988n;
        this.f8690i = m4521a(c1988n.f8677c, c1988n.f8678d);
    }
}

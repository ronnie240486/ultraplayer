package p118l1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;
import p036M0.C0380q;
import p124n.C2018e;
import p148t.C2267f;

/* JADX INFO: renamed from: l1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1987m {

    /* JADX INFO: renamed from: p */
    public static final Matrix f8659p = new Matrix();

    /* JADX INFO: renamed from: a */
    public final Path f8660a;

    /* JADX INFO: renamed from: b */
    public final Path f8661b;

    /* JADX INFO: renamed from: c */
    public final Matrix f8662c;

    /* JADX INFO: renamed from: d */
    public Paint f8663d;

    /* JADX INFO: renamed from: e */
    public Paint f8664e;

    /* JADX INFO: renamed from: f */
    public PathMeasure f8665f;

    /* JADX INFO: renamed from: g */
    public final C1984j f8666g;

    /* JADX INFO: renamed from: h */
    public float f8667h;

    /* JADX INFO: renamed from: i */
    public float f8668i;

    /* JADX INFO: renamed from: j */
    public float f8669j;

    /* JADX INFO: renamed from: k */
    public float f8670k;

    /* JADX INFO: renamed from: l */
    public int f8671l;

    /* JADX INFO: renamed from: m */
    public String f8672m;

    /* JADX INFO: renamed from: n */
    public Boolean f8673n;

    /* JADX INFO: renamed from: o */
    public final C2018e f8674o;

    public C1987m() {
        this.f8662c = new Matrix();
        this.f8667h = 0.0f;
        this.f8668i = 0.0f;
        this.f8669j = 0.0f;
        this.f8670k = 0.0f;
        this.f8671l = 255;
        this.f8672m = null;
        this.f8673n = null;
        this.f8674o = new C2018e();
        this.f8666g = new C1984j();
        this.f8660a = new Path();
        this.f8661b = new Path();
    }

    /* JADX INFO: renamed from: a */
    public final void m4520a(C1984j c1984j, Matrix matrix, Canvas canvas, int i3, int i4) {
        float f;
        int i5;
        float f3;
        C1984j c1984j2 = c1984j;
        char c = 1;
        c1984j2.f8645a.set(matrix);
        Matrix matrix2 = c1984j2.f8645a;
        matrix2.preConcat(c1984j2.f8654j);
        canvas.save();
        char c2 = 0;
        int i6 = 0;
        while (true) {
            ArrayList arrayList = c1984j2.f8646b;
            if (i6 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            AbstractC1985k abstractC1985k = (AbstractC1985k) arrayList.get(i6);
            if (abstractC1985k instanceof C1984j) {
                m4520a((C1984j) abstractC1985k, matrix2, canvas, i3, i4);
            } else {
                if (abstractC1985k instanceof AbstractC1986l) {
                    AbstractC1986l abstractC1986l = (AbstractC1986l) abstractC1985k;
                    float f4 = i3 / this.f8669j;
                    float f5 = i4 / this.f8670k;
                    float fMin = Math.min(f4, f5);
                    Matrix matrix3 = this.f8662c;
                    matrix3.set(matrix2);
                    matrix3.postScale(f4, f5);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c2], fArr[c]);
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f6 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f6) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        Path path = this.f8660a;
                        abstractC1986l.getClass();
                        path.reset();
                        C2267f[] c2267fArr = abstractC1986l.f8656a;
                        if (c2267fArr != null) {
                            C2267f.m4866b(c2267fArr, path);
                        }
                        Path path2 = this.f8661b;
                        path2.reset();
                        if (abstractC1986l instanceof C1982h) {
                            path2.setFillType(abstractC1986l.f8658c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix3);
                            canvas.clipPath(path2);
                        } else {
                            C1983i c1983i = (C1983i) abstractC1986l;
                            float f7 = c1983i.f8639i;
                            if (f7 != 0.0f || c1983i.f8640j != 1.0f) {
                                float f8 = c1983i.f8641k;
                                float f9 = (f7 + f8) % 1.0f;
                                float f10 = (c1983i.f8640j + f8) % 1.0f;
                                if (this.f8665f == null) {
                                    this.f8665f = new PathMeasure();
                                }
                                this.f8665f.setPath(path, false);
                                float length = this.f8665f.getLength();
                                float f11 = f9 * length;
                                float f12 = f10 * length;
                                path.reset();
                                if (f11 > f12) {
                                    this.f8665f.getSegment(f11, length, path, true);
                                    f = 0.0f;
                                    this.f8665f.getSegment(0.0f, f12, path, true);
                                } else {
                                    f = 0.0f;
                                    this.f8665f.getSegment(f11, f12, path, true);
                                }
                                path.rLineTo(f, f);
                            }
                            path2.addPath(path, matrix3);
                            C0380q c0380q = c1983i.f8636f;
                            if ((((Shader) c0380q.f1292i) == null && c0380q.f1291h == 0) ? false : true) {
                                if (this.f8664e == null) {
                                    i5 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.f8664e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i5 = 16777215;
                                }
                                Paint paint2 = this.f8664e;
                                Shader shader = (Shader) c0380q.f1292i;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix3);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(c1983i.f8638h * 255.0f));
                                    f3 = 255.0f;
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i7 = c0380q.f1291h;
                                    float f13 = c1983i.f8638h;
                                    PorterDuff.Mode mode = C1990p.f8688p;
                                    f3 = 255.0f;
                                    paint2.setColor((i7 & i5) | (((int) (Color.alpha(i7) * f13)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(c1983i.f8658c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            } else {
                                i5 = 16777215;
                                f3 = 255.0f;
                            }
                            C0380q c0380q2 = c1983i.f8634d;
                            if (((Shader) c0380q2.f1292i) != null || c0380q2.f1291h != 0) {
                                if (this.f8663d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f8663d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.f8663d;
                                Paint.Join join = c1983i.f8643m;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = c1983i.f8642l;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(c1983i.f8644n);
                                Shader shader2 = (Shader) c0380q2.f1292i;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix3);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(c1983i.f8637g * f3));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i8 = c0380q2.f1291h;
                                    float f14 = c1983i.f8637g;
                                    PorterDuff.Mode mode2 = C1990p.f8688p;
                                    paint4.setColor((i8 & i5) | (((int) (Color.alpha(i8) * f14)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(c1983i.f8635e * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i6++;
                c1984j2 = c1984j;
                c = 1;
                c2 = 0;
            }
            i6++;
            c1984j2 = c1984j;
            c = 1;
            c2 = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f8671l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i3) {
        this.f8671l = i3;
    }

    public C1987m(C1987m c1987m) {
        this.f8662c = new Matrix();
        this.f8667h = 0.0f;
        this.f8668i = 0.0f;
        this.f8669j = 0.0f;
        this.f8670k = 0.0f;
        this.f8671l = 255;
        this.f8672m = null;
        this.f8673n = null;
        C2018e c2018e = new C2018e();
        this.f8674o = c2018e;
        this.f8666g = new C1984j(c1987m.f8666g, c2018e);
        this.f8660a = new Path(c1987m.f8660a);
        this.f8661b = new Path(c1987m.f8661b);
        this.f8667h = c1987m.f8667h;
        this.f8668i = c1987m.f8668i;
        this.f8669j = c1987m.f8669j;
        this.f8670k = c1987m.f8670k;
        this.f8671l = c1987m.f8671l;
        this.f8672m = c1987m.f8672m;
        String str = c1987m.f8672m;
        if (str != null) {
            c2018e.put(str, this);
        }
        this.f8673n = c1987m.f8673n;
    }
}

package p144s;

/* JADX INFO: renamed from: s.o */
/* JADX INFO: loaded from: classes.dex */
public final class C2221o {

    /* JADX INFO: renamed from: k */
    public static final C2221o f9533k;

    /* JADX INFO: renamed from: a */
    public final float f9534a;

    /* JADX INFO: renamed from: b */
    public final float f9535b;

    /* JADX INFO: renamed from: c */
    public final float f9536c;

    /* JADX INFO: renamed from: d */
    public final float f9537d;

    /* JADX INFO: renamed from: e */
    public final float f9538e;

    /* JADX INFO: renamed from: f */
    public final float f9539f;

    /* JADX INFO: renamed from: g */
    public final float[] f9540g;

    /* JADX INFO: renamed from: h */
    public final float f9541h;

    /* JADX INFO: renamed from: i */
    public final float f9542i;

    /* JADX INFO: renamed from: j */
    public final float f9543j;

    static {
        float[] fArr = AbstractC2208b.f9508c;
        float fM4792k = (float) ((((double) AbstractC2208b.m4792k()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = AbstractC2208b.f9506a;
        float f = fArr[0];
        float[] fArr3 = fArr2[0];
        float f3 = fArr3[0] * f;
        float f4 = fArr[1];
        float f5 = (fArr3[1] * f4) + f3;
        float f6 = fArr[2];
        float f7 = (fArr3[2] * f6) + f5;
        float[] fArr4 = fArr2[1];
        float f8 = (fArr4[2] * f6) + (fArr4[1] * f4) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f9 = (f6 * fArr5[2]) + (f4 * fArr5[1]) + (f * fArr5[0]);
        float f10 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fM4792k) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d3 = fExp;
        if (d3 > 1.0d) {
            fExp = 1.0f;
        } else if (d3 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f7) * fExp) + 1.0f) - fExp, (((100.0f / f8) * fExp) + 1.0f) - fExp, (((100.0f / f9) * fExp) + 1.0f) - fExp};
        float f11 = 1.0f / ((5.0f * fM4792k) + 1.0f);
        float f12 = f11 * f11 * f11 * f11;
        float f13 = 1.0f - f12;
        float fCbrt = (0.1f * f13 * f13 * ((float) Math.cbrt(((double) fM4792k) * 5.0d))) + (f12 * fM4792k);
        float fM4792k2 = AbstractC2208b.m4792k() / fArr[1];
        double d4 = fM4792k2;
        float fSqrt = ((float) Math.sqrt(d4)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d4, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f7)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f8)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f9)) / 100.0d, 0.42d)};
        float f14 = fArr7[0];
        float f15 = (f14 * 400.0f) / (f14 + 27.13f);
        float f16 = fArr7[1];
        float f17 = (f16 * 400.0f) / (f16 + 27.13f);
        float f18 = fArr7[2];
        float[] fArr8 = {f15, f17, (400.0f * f18) / (f18 + 27.13f)};
        f9533k = new C2221o(fM4792k2, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow, fPow, fPow, f10, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public C2221o(float f, float f3, float f4, float f5, float f6, float f7, float[] fArr, float f8, float f9, float f10) {
        this.f9539f = f;
        this.f9534a = f3;
        this.f9535b = f4;
        this.f9536c = f5;
        this.f9537d = f6;
        this.f9538e = f7;
        this.f9540g = fArr;
        this.f9541h = f8;
        this.f9542i = f9;
        this.f9543j = f10;
    }
}

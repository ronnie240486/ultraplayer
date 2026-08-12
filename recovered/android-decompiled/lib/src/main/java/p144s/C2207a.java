package p144s;

import android.graphics.Color;
import p148t.AbstractC2262a;

/* JADX INFO: renamed from: s.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2207a {

    /* JADX INFO: renamed from: a */
    public final float f9500a;

    /* JADX INFO: renamed from: b */
    public final float f9501b;

    /* JADX INFO: renamed from: c */
    public final float f9502c;

    /* JADX INFO: renamed from: d */
    public final float f9503d;

    /* JADX INFO: renamed from: e */
    public final float f9504e;

    /* JADX INFO: renamed from: f */
    public final float f9505f;

    public C2207a(float f, float f3, float f4, float f5, float f6, float f7) {
        this.f9500a = f;
        this.f9501b = f3;
        this.f9502c = f4;
        this.f9503d = f5;
        this.f9504e = f6;
        this.f9505f = f7;
    }

    /* JADX INFO: renamed from: a */
    public static C2207a m4779a(int i3) {
        C2221o c2221o = C2221o.f9533k;
        float fM4786e = AbstractC2208b.m4786e(Color.red(i3));
        float fM4786e2 = AbstractC2208b.m4786e(Color.green(i3));
        float fM4786e3 = AbstractC2208b.m4786e(Color.blue(i3));
        float[][] fArr = AbstractC2208b.f9509d;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * fM4786e3) + (fArr2[1] * fM4786e2) + (fArr2[0] * fM4786e);
        float[] fArr3 = fArr[1];
        float f3 = (fArr3[2] * fM4786e3) + (fArr3[1] * fM4786e2) + (fArr3[0] * fM4786e);
        float[] fArr4 = fArr[2];
        float f4 = (fM4786e3 * fArr4[2]) + (fM4786e2 * fArr4[1]) + (fM4786e * fArr4[0]);
        float[][] fArr5 = AbstractC2208b.f9506a;
        float[] fArr6 = fArr5[0];
        float f5 = (fArr6[2] * f4) + (fArr6[1] * f3) + (fArr6[0] * f);
        float[] fArr7 = fArr5[1];
        float f6 = (fArr7[2] * f4) + (fArr7[1] * f3) + (fArr7[0] * f);
        float[] fArr8 = fArr5[2];
        float f7 = (f4 * fArr8[2]) + (f3 * fArr8[1]) + (f * fArr8[0]);
        float[] fArr9 = c2221o.f9540g;
        float f8 = fArr9[0] * f5;
        float f9 = fArr9[1] * f6;
        float f10 = fArr9[2] * f7;
        float fAbs = Math.abs(f8);
        float f11 = c2221o.f9541h;
        float fPow = (float) Math.pow(((double) (fAbs * f11)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f9) * f11)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f10) * f11)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f8) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f9) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f10) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d3 = fSignum3;
        float f12 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d3)) / 11.0f;
        float f13 = ((float) (((double) (fSignum + fSignum2)) - (d3 * 2.0d))) / 9.0f;
        float f14 = fSignum2 * 20.0f;
        float f15 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f14)) / 20.0f;
        float f16 = (((fSignum * 40.0f) + f14) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f13, f12)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f17 = fAtan2;
        float f18 = (3.1415927f * f17) / 180.0f;
        float f19 = f16 * c2221o.f9535b;
        float f20 = c2221o.f9534a;
        float f21 = c2221o.f9537d;
        float fPow4 = ((float) Math.pow(f19 / f20, c2221o.f9543j * f21)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f22 = f20 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c2221o.f9539f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) f17) < 20.14d ? f17 + 360.0f : f17)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c2221o.f9538e) * c2221o.f9536c) * ((float) Math.sqrt((f13 * f13) + (f12 * f12)))) / (f15 + 0.305f), 0.9d));
        float fSqrt = fPow5 * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        float f23 = c2221o.f9542i * fSqrt;
        Math.sqrt((fPow5 * f21) / f22);
        float f24 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f23 * 0.0228f) + 1.0f)) * 43.85965f;
        double d4 = f18;
        return new C2207a(f17, fSqrt, fPow4, f24, fLog * ((float) Math.cos(d4)), fLog * ((float) Math.sin(d4)));
    }

    /* JADX INFO: renamed from: b */
    public static C2207a m4780b(float f, float f3, float f4) {
        C2221o c2221o = C2221o.f9533k;
        float f5 = c2221o.f9537d;
        double d3 = ((double) f) / 100.0d;
        Math.sqrt(d3);
        float f6 = c2221o.f9534a + 4.0f;
        float f7 = c2221o.f9542i * f3;
        Math.sqrt(((f3 / ((float) Math.sqrt(d3))) * c2221o.f9537d) / f6);
        float f8 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) f7) * 0.0228d) + 1.0d)) * 43.85965f;
        double d4 = (3.1415927f * f4) / 180.0f;
        return new C2207a(f4, f3, f, f8, fLog * ((float) Math.cos(d4)), fLog * ((float) Math.sin(d4)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX INFO: renamed from: c */
    public final int m4781c(C2221o c2221o) {
        float fSqrt;
        float f = this.f9501b;
        double d3 = f;
        float f3 = this.f9502c;
        if (d3 != 0.0d) {
            double d4 = f3;
            if (d4 == 0.0d) {
                fSqrt = 0.0f;
            } else {
                fSqrt = f / ((float) Math.sqrt(d4 / 100.0d));
            }
        } else {
            fSqrt = 0.0f;
        }
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, c2221o.f9539f), 0.73d), 1.1111111111111112d);
        double d5 = (this.f9500a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d5) + 3.8d)) * 0.25f;
        float fPow2 = c2221o.f9534a * ((float) Math.pow(((double) f3) / 100.0d, (1.0d / ((double) c2221o.f9537d)) / ((double) c2221o.f9543j)));
        float f4 = fCos * 3846.1538f * c2221o.f9538e * c2221o.f9536c;
        float f5 = fPow2 / c2221o.f9535b;
        float fSin = (float) Math.sin(d5);
        float fCos2 = (float) Math.cos(d5);
        float f6 = (((0.305f + f5) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f4 * 23.0f)));
        float f7 = fCos2 * f6;
        float f8 = f6 * fSin;
        float f9 = f5 * 460.0f;
        float f10 = ((288.0f * f8) + ((451.0f * f7) + f9)) / 1403.0f;
        float f11 = ((f9 - (891.0f * f7)) - (261.0f * f8)) / 1403.0f;
        float f12 = ((f9 - (f7 * 220.0f)) - (f8 * 6300.0f)) / 1403.0f;
        float fMax = (float) Math.max(0.0d, (((double) Math.abs(f10)) * 27.13d) / (400.0d - ((double) Math.abs(f10))));
        float fSignum = Math.signum(f10);
        float f13 = 100.0f / c2221o.f9541h;
        float fPow3 = fSignum * f13 * ((float) Math.pow(fMax, 2.380952380952381d));
        float fSignum2 = Math.signum(f11) * f13 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f11)) * 27.13d) / (400.0d - ((double) Math.abs(f11)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f12) * f13 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f12)) * 27.13d) / (400.0d - ((double) Math.abs(f12)))), 2.380952380952381d));
        float[] fArr = c2221o.f9540g;
        float f14 = fPow3 / fArr[0];
        float f15 = fSignum2 / fArr[1];
        float f16 = fSignum3 / fArr[2];
        float[][] fArr2 = AbstractC2208b.f9507b;
        float[] fArr3 = fArr2[0];
        float f17 = (fArr3[2] * f16) + (fArr3[1] * f15) + (fArr3[0] * f14);
        float[] fArr4 = fArr2[1];
        float f18 = (fArr4[2] * f16) + (fArr4[1] * f15) + (fArr4[0] * f14);
        float[] fArr5 = fArr2[2];
        return AbstractC2262a.m4854b(f17, f18, (f16 * fArr5[2]) + (f15 * fArr5[1]) + (f14 * fArr5[0]));
    }
}

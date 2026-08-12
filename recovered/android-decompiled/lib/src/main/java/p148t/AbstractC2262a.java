package p148t;

import android.graphics.Color;

/* JADX INFO: renamed from: t.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2262a {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f9696a = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static void m4853a(int i3, int i4, int i5, float[] fArr) {
        float f;
        float fAbs;
        float f3 = i3 / 255.0f;
        float f4 = i4 / 255.0f;
        float f5 = i5 / 255.0f;
        float fMax = Math.max(f3, Math.max(f4, f5));
        float fMin = Math.min(f3, Math.min(f4, f5));
        float f6 = fMax - fMin;
        float f7 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            f = 0.0f;
            fAbs = 0.0f;
        } else {
            if (fMax == f3) {
                f = ((f4 - f5) / f6) % 6.0f;
            } else {
                f = fMax == f4 ? ((f5 - f3) / f6) + 2.0f : 4.0f + ((f3 - f4) / f6);
            }
            fAbs = f6 / (1.0f - Math.abs((2.0f * f7) - 1.0f));
        }
        float f8 = (f * 60.0f) % 360.0f;
        if (f8 < 0.0f) {
            f8 += 360.0f;
        }
        fArr[0] = f8 < 0.0f ? 0.0f : Math.min(f8, 360.0f);
        fArr[1] = fAbs < 0.0f ? 0.0f : Math.min(fAbs, 1.0f);
        fArr[2] = f7 >= 0.0f ? Math.min(f7, 1.0f) : 0.0f;
    }

    /* JADX INFO: renamed from: b */
    public static int m4854b(double d3, double d4, double d5) {
        double d6 = (((-0.4986d) * d5) + (((-1.5372d) * d4) + (3.2406d * d3))) / 100.0d;
        double d7 = ((0.0415d * d5) + ((1.8758d * d4) + ((-0.9689d) * d3))) / 100.0d;
        double d8 = ((1.057d * d5) + (((-0.204d) * d4) + (0.0557d * d3))) / 100.0d;
        double dPow = d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d;
        double dPow2 = d7 > 0.0031308d ? (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d : d7 * 12.92d;
        double dPow3 = d8 > 0.0031308d ? (Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d : 12.92d * d8;
        int iRound = (int) Math.round(dPow * 255.0d);
        int iMin = iRound < 0 ? 0 : Math.min(iRound, 255);
        int iRound2 = (int) Math.round(dPow2 * 255.0d);
        int iMin2 = iRound2 < 0 ? 0 : Math.min(iRound2, 255);
        int iRound3 = (int) Math.round(dPow3 * 255.0d);
        return Color.rgb(iMin, iMin2, iRound3 >= 0 ? Math.min(iRound3, 255) : 0);
    }

    /* JADX INFO: renamed from: c */
    public static double m4855c(int i3, int i4) {
        if (Color.alpha(i4) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i4));
        }
        if (Color.alpha(i3) < 255) {
            i3 = m4858f(i3, i4);
        }
        double dM4856d = m4856d(i3) + 0.05d;
        double dM4856d2 = m4856d(i4) + 0.05d;
        return Math.max(dM4856d, dM4856d2) / Math.min(dM4856d, dM4856d2);
    }

    /* JADX INFO: renamed from: d */
    public static double m4856d(int i3) {
        ThreadLocal threadLocal = f9696a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i3);
        int iGreen = Color.green(i3);
        int iBlue = Color.blue(i3);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d3 = ((double) iRed) / 255.0d;
        double dPow = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        double d4 = ((double) iGreen) / 255.0d;
        double dPow2 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
        double d5 = ((double) iBlue) / 255.0d;
        double dPow3 = d5 < 0.04045d ? d5 / 12.92d : Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d6 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d6;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d6 / 100.0d;
    }

    /* JADX INFO: renamed from: e */
    public static int m4857e(float f, int i3, int i4) {
        int i5 = 255;
        if (Color.alpha(i4) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i4));
        }
        double d3 = f;
        if (m4855c(m4860h(i3, 255), i4) < d3) {
            return -1;
        }
        int i6 = 0;
        for (int i7 = 0; i7 <= 10 && i5 - i6 > 1; i7++) {
            int i8 = (i6 + i5) / 2;
            if (m4855c(m4860h(i3, i8), i4) < d3) {
                i6 = i8;
            } else {
                i5 = i8;
            }
        }
        return i5;
    }

    /* JADX INFO: renamed from: f */
    public static int m4858f(int i3, int i4) {
        int iAlpha = Color.alpha(i4);
        int iAlpha2 = Color.alpha(i3);
        int i5 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return Color.argb(i5, m4859g(Color.red(i3), iAlpha2, Color.red(i4), iAlpha, i5), m4859g(Color.green(i3), iAlpha2, Color.green(i4), iAlpha, i5), m4859g(Color.blue(i3), iAlpha2, Color.blue(i4), iAlpha, i5));
    }

    /* JADX INFO: renamed from: g */
    public static int m4859g(int i3, int i4, int i5, int i6, int i7) {
        if (i7 == 0) {
            return 0;
        }
        return (((255 - i4) * (i5 * i6)) + ((i3 * 255) * i4)) / (i7 * 255);
    }

    /* JADX INFO: renamed from: h */
    public static int m4860h(int i3, int i4) {
        if (i4 < 0 || i4 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i3 & 16777215) | (i4 << 24);
    }
}

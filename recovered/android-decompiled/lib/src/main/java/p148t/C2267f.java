package p148t;

import android.graphics.Path;
import android.util.Log;
import p060U1.AbstractC0610a;

/* JADX INFO: renamed from: t.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2267f {

    /* JADX INFO: renamed from: a */
    public char f9703a;

    /* JADX INFO: renamed from: b */
    public final float[] f9704b;

    public C2267f(char c, float[] fArr) {
        this.f9703a = c;
        this.f9704b = fArr;
    }

    /* JADX INFO: renamed from: a */
    public static void m4865a(Path path, float f, float f3, float f4, float f5, float f6, float f7, float f8, boolean z3, boolean z4) {
        double d3;
        double d4;
        double radians = Math.toRadians(f8);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d5 = f;
        double d6 = f3;
        double d7 = f6;
        double d8 = ((d6 * dSin) + (d5 * dCos)) / d7;
        double d9 = f7;
        double d10 = ((d6 * dCos) + (((double) (-f)) * dSin)) / d9;
        double d11 = f5;
        double d12 = ((d11 * dSin) + (((double) f4) * dCos)) / d7;
        double d13 = ((d11 * dCos) + (((double) (-f4)) * dSin)) / d9;
        double d14 = d8 - d12;
        double d15 = d10 - d13;
        double d16 = (d8 + d12) / 2.0d;
        double d17 = (d10 + d13) / 2.0d;
        double d18 = (d15 * d15) + (d14 * d14);
        if (d18 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d19 = (1.0d / d18) - 0.25d;
        if (d19 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d18);
            float fSqrt = (float) (Math.sqrt(d18) / 1.99999d);
            m4865a(path, f, f3, f4, f5, f6 * fSqrt, fSqrt * f7, f8, z3, z4);
            return;
        }
        double dSqrt = Math.sqrt(d19);
        double d20 = dSqrt * d14;
        double d21 = dSqrt * d15;
        if (z3 == z4) {
            d3 = d16 - d21;
            d4 = d17 + d20;
        } else {
            d3 = d16 + d21;
            d4 = d17 - d20;
        }
        double dAtan2 = Math.atan2(d10 - d4, d8 - d3);
        double dAtan3 = Math.atan2(d13 - d4, d12 - d3) - dAtan2;
        if (z4 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d22 = d3 * d7;
        double d23 = d4 * d9;
        double d24 = (d22 * dCos) - (d23 * dSin);
        double d25 = (d23 * dCos) + (d22 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d26 = d6;
        double d27 = -d7;
        double d28 = d27 * dCos2;
        double d29 = d9 * dSin2;
        double d30 = (d28 * dSin3) - (d29 * dCos3);
        double d31 = d27 * dSin2;
        double d32 = d9 * dCos2;
        double d33 = (dCos3 * d32) + (dSin3 * d31);
        double d34 = dAtan3 / ((double) iCeil);
        double d35 = dAtan2;
        int i3 = 0;
        while (i3 < iCeil) {
            double d36 = d35 + d34;
            double dSin4 = Math.sin(d36);
            double dCos4 = Math.cos(d36);
            int i4 = iCeil;
            double d37 = (((d7 * dCos2) * dCos4) + d24) - (d29 * dSin4);
            double d38 = d31;
            double d39 = (d32 * dSin4) + (d7 * dSin2 * dCos4) + d25;
            double d40 = (d28 * dSin4) - (d29 * dCos4);
            double d41 = (dCos4 * d32) + (dSin4 * d38);
            double d42 = d36 - d35;
            double dTan = Math.tan(d42 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d42)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d30 * dSqrt2) + d5), (float) ((d33 * dSqrt2) + d26), (float) (d37 - (dSqrt2 * d40)), (float) (d39 - (dSqrt2 * d41)), (float) d37, (float) d39);
            i3++;
            d5 = d37;
            d26 = d39;
            d24 = d24;
            d35 = d36;
            dCos2 = dCos2;
            d33 = d41;
            d30 = d40;
            iCeil = i4;
            d34 = d34;
            d31 = d38;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m4866b(C2267f[] c2267fArr, Path path) {
        int i3;
        int i4;
        float f;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float[] fArr = new float[6];
        int length = c2267fArr.length;
        char c = 'm';
        char c2 = 0;
        char c3 = 'm';
        int i5 = 0;
        while (i5 < length) {
            C2267f c2267f = c2267fArr[i5];
            char c4 = c2267f.f9703a;
            float f14 = fArr[c2];
            float f15 = fArr[1];
            float f16 = fArr[2];
            float f17 = fArr[3];
            float f18 = fArr[4];
            float f19 = fArr[5];
            switch (c4) {
                case 'A':
                case 'a':
                    i3 = 7;
                    break;
                case 'C':
                case 'c':
                    i3 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i3 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i3 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f18, f19);
                    f14 = f18;
                    f16 = f14;
                    f15 = f19;
                    f17 = f15;
                default:
                    i3 = 2;
                    break;
            }
            float f20 = f15;
            float f21 = f18;
            float f22 = f19;
            float f23 = f14;
            int i6 = 0;
            while (true) {
                float[] fArr2 = c2267f.f9704b;
                if (i6 < fArr2.length) {
                    if (c4 == 'A') {
                        i4 = i6;
                        c2267f = c2267f;
                        float f24 = f23;
                        float f25 = f20;
                        i5 = i5;
                        c4 = c4;
                        int i7 = i4 + 5;
                        int i8 = i4 + 6;
                        m4865a(path, f24, f25, fArr2[i7], fArr2[i8], fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f, fArr2[i4 + 4] != 0.0f);
                        f16 = fArr2[i7];
                        f = fArr2[i8];
                        f17 = f;
                        f3 = f16;
                    } else if (c4 == 'C') {
                        i4 = i6;
                        i5 = i5;
                        c2267f = c2267f;
                        c4 = c4;
                        int i9 = i4 + 2;
                        int i10 = i4 + 3;
                        int i11 = i4 + 4;
                        int i12 = i4 + 5;
                        path.cubicTo(fArr2[i4], fArr2[i4 + 1], fArr2[i9], fArr2[i10], fArr2[i11], fArr2[i12]);
                        float f26 = fArr2[i11];
                        float f27 = fArr2[i12];
                        f16 = fArr2[i9];
                        f17 = fArr2[i10];
                        f = f27;
                        f3 = f26;
                    } else if (c4 != 'H') {
                        if (c4 == 'Q') {
                            i4 = i6;
                            int i13 = i4 + 1;
                            int i14 = i4 + 2;
                            int i15 = i4 + 3;
                            path.quadTo(fArr2[i4], fArr2[i13], fArr2[i14], fArr2[i15]);
                            f4 = fArr2[i4];
                            float f28 = fArr2[i13];
                            f5 = fArr2[i14];
                            f17 = f28;
                            f = fArr2[i15];
                        } else if (c4 == 'V') {
                            i4 = i6;
                            i5 = i5;
                            c2267f = c2267f;
                            f3 = f23;
                            c4 = c4;
                            path.lineTo(f3, fArr2[i4]);
                            f = fArr2[i4];
                        } else if (c4 != 'a') {
                            if (c4 == 'c') {
                                i4 = i6;
                                int i16 = i4 + 2;
                                int i17 = i4 + 3;
                                int i18 = i4 + 4;
                                int i19 = i4 + 5;
                                path.rCubicTo(fArr2[i4], fArr2[i4 + 1], fArr2[i16], fArr2[i17], fArr2[i18], fArr2[i19]);
                                float f29 = fArr2[i16] + f23;
                                float f30 = f20 + fArr2[i17];
                                f23 += fArr2[i18];
                                f20 += fArr2[i19];
                                f16 = f29;
                                f17 = f30;
                            } else if (c4 != 'h') {
                                if (c4 != 'q') {
                                    if (c4 != 'v') {
                                        if (c4 != 'L') {
                                            if (c4 == 'M') {
                                                i4 = i6;
                                                f3 = fArr2[i4];
                                                f = fArr2[i4 + 1];
                                                if (i4 > 0) {
                                                    path.lineTo(f3, f);
                                                } else {
                                                    path.moveTo(f3, f);
                                                    f21 = f3;
                                                    f22 = f;
                                                }
                                            } else if (c4 == 'S') {
                                                i4 = i6;
                                                if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                    f23 = (f23 * 2.0f) - f16;
                                                    f20 = (f20 * 2.0f) - f17;
                                                }
                                                float f31 = f23;
                                                float f32 = f20;
                                                int i20 = i4 + 1;
                                                int i21 = i4 + 2;
                                                int i22 = i4 + 3;
                                                path.cubicTo(f31, f32, fArr2[i4], fArr2[i20], fArr2[i21], fArr2[i22]);
                                                f4 = fArr2[i4];
                                                float f33 = fArr2[i20];
                                                f5 = fArr2[i21];
                                                f17 = f33;
                                                f = fArr2[i22];
                                            } else if (c4 == 'T') {
                                                i4 = i6;
                                                if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                    f23 = (f23 * 2.0f) - f16;
                                                    f20 = (f20 * 2.0f) - f17;
                                                }
                                                float f34 = f20;
                                                float f35 = fArr2[i4];
                                                int i23 = i4 + 1;
                                                path.quadTo(f23, f34, f35, fArr2[i23]);
                                                f17 = f34;
                                                f3 = fArr2[i4];
                                                f = fArr2[i23];
                                                c2267f = c2267f;
                                                f16 = f23;
                                            } else if (c4 == 'l') {
                                                i4 = i6;
                                                int i24 = i4 + 1;
                                                path.rLineTo(fArr2[i4], fArr2[i24]);
                                                f23 += fArr2[i4];
                                                f9 = fArr2[i24];
                                            } else if (c4 != c) {
                                                if (c4 == 's') {
                                                    if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                        f10 = f20 - f17;
                                                        f11 = f23 - f16;
                                                    } else {
                                                        f11 = 0.0f;
                                                        f10 = 0.0f;
                                                    }
                                                    int i25 = i6 + 1;
                                                    int i26 = i6 + 2;
                                                    int i27 = i6 + 3;
                                                    i4 = i6;
                                                    path.rCubicTo(f11, f10, fArr2[i6], fArr2[i25], fArr2[i26], fArr2[i27]);
                                                    f6 = fArr2[i4] + f23;
                                                    f7 = f20 + fArr2[i25];
                                                    f23 += fArr2[i26];
                                                    f8 = fArr2[i27];
                                                } else if (c4 != 't') {
                                                    i4 = i6;
                                                } else {
                                                    if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                        f12 = f23 - f16;
                                                        f13 = f20 - f17;
                                                    } else {
                                                        f13 = 0.0f;
                                                        f12 = 0.0f;
                                                    }
                                                    int i28 = i6 + 1;
                                                    path.rQuadTo(f12, f13, fArr2[i6], fArr2[i28]);
                                                    float f36 = f12 + f23;
                                                    float f37 = f20 + f13;
                                                    float f38 = f23 + fArr2[i6];
                                                    f20 += fArr2[i28];
                                                    f17 = f37;
                                                    i4 = i6;
                                                    f3 = f38;
                                                    f16 = f36;
                                                }
                                                f = f20;
                                            } else {
                                                i4 = i6;
                                                float f39 = fArr2[i4];
                                                f23 += f39;
                                                float f40 = fArr2[i4 + 1];
                                                f20 += f40;
                                                if (i4 > 0) {
                                                    path.rLineTo(f39, f40);
                                                } else {
                                                    path.rMoveTo(f39, f40);
                                                    c2267f = c2267f;
                                                    f3 = f23;
                                                    f21 = f3;
                                                    f = f20;
                                                    f22 = f;
                                                }
                                            }
                                            c4 = c4;
                                        } else {
                                            i4 = i6;
                                            int i29 = i4 + 1;
                                            path.lineTo(fArr2[i4], fArr2[i29]);
                                            f3 = fArr2[i4];
                                            f = fArr2[i29];
                                        }
                                        c2267f = c2267f;
                                        c4 = c4;
                                    } else {
                                        i4 = i6;
                                        path.rLineTo(0.0f, fArr2[i4]);
                                        f9 = fArr2[i4];
                                    }
                                    f20 += f9;
                                } else {
                                    i4 = i6;
                                    int i30 = i4 + 1;
                                    int i31 = i4 + 2;
                                    int i32 = i4 + 3;
                                    path.rQuadTo(fArr2[i4], fArr2[i30], fArr2[i31], fArr2[i32]);
                                    f6 = fArr2[i4] + f23;
                                    f7 = f20 + fArr2[i30];
                                    f23 += fArr2[i31];
                                    f8 = fArr2[i32];
                                }
                                f20 += f8;
                                f16 = f6;
                                f17 = f7;
                            } else {
                                i4 = i6;
                                path.rLineTo(fArr2[i4], 0.0f);
                                f23 += fArr2[i4];
                            }
                            f3 = f23;
                            f = f20;
                            c4 = c4;
                        } else {
                            i4 = i6;
                            int i33 = i4 + 5;
                            float f41 = fArr2[i33] + f23;
                            int i34 = i4 + 6;
                            float f42 = fArr2[i34] + f20;
                            c2267f = c2267f;
                            float f43 = f23;
                            c4 = c4;
                            float f44 = f20;
                            i5 = i5;
                            m4865a(path, f43, f44, f41, f42, fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f, fArr2[i4 + 4] != 0.0f);
                            f3 = f43 + fArr2[i33];
                            f = f44 + fArr2[i34];
                            f16 = f3;
                            f17 = f;
                        }
                        f16 = f4;
                        f3 = f5;
                    } else {
                        i4 = i6;
                        c2267f = c2267f;
                        c4 = c4;
                        f = f20;
                        i5 = i5;
                        path.lineTo(fArr2[i4], f);
                        f3 = fArr2[i4];
                    }
                    c4 = c4;
                    c2267f = c2267f;
                    i5 = i5;
                    c = 'm';
                    f23 = f3;
                    f20 = f;
                    c3 = c4;
                    i6 = i4 + i3;
                    path = path;
                }
            }
            fArr[0] = f23;
            fArr[1] = f20;
            fArr[2] = f16;
            fArr[3] = f17;
            fArr[4] = f21;
            fArr[5] = f22;
            c3 = c2267f.f9703a;
            i5++;
            c = 'm';
            c2 = 0;
        }
    }

    public C2267f(C2267f c2267f) {
        this.f9703a = c2267f.f9703a;
        float[] fArr = c2267f.f9704b;
        this.f9704b = AbstractC0610a.m1505g(fArr, fArr.length);
    }
}

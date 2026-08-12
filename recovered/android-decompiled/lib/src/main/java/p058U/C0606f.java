package p058U;

import java.util.Arrays;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: U.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0606f {

    /* JADX INFO: renamed from: a */
    public final int f2260a;

    /* JADX INFO: renamed from: b */
    public final int f2261b;

    /* JADX INFO: renamed from: c */
    public final float f2262c;

    /* JADX INFO: renamed from: d */
    public final float f2263d;

    /* JADX INFO: renamed from: e */
    public final float f2264e;

    /* JADX INFO: renamed from: f */
    public final int f2265f;

    /* JADX INFO: renamed from: g */
    public final int f2266g;

    /* JADX INFO: renamed from: h */
    public final int f2267h;

    /* JADX INFO: renamed from: i */
    public final short[] f2268i;

    /* JADX INFO: renamed from: j */
    public short[] f2269j;

    /* JADX INFO: renamed from: k */
    public int f2270k;

    /* JADX INFO: renamed from: l */
    public short[] f2271l;

    /* JADX INFO: renamed from: m */
    public int f2272m;

    /* JADX INFO: renamed from: n */
    public short[] f2273n;

    /* JADX INFO: renamed from: o */
    public int f2274o;

    /* JADX INFO: renamed from: p */
    public int f2275p;

    /* JADX INFO: renamed from: q */
    public int f2276q;

    /* JADX INFO: renamed from: r */
    public int f2277r;

    /* JADX INFO: renamed from: s */
    public int f2278s;

    /* JADX INFO: renamed from: t */
    public int f2279t;

    /* JADX INFO: renamed from: u */
    public int f2280u;

    /* JADX INFO: renamed from: v */
    public int f2281v;

    /* JADX INFO: renamed from: w */
    public double f2282w;

    public C0606f(int i3, int i4, float f, float f3, int i5) {
        this.f2260a = i3;
        this.f2261b = i4;
        this.f2262c = f;
        this.f2263d = f3;
        this.f2264e = i3 / i5;
        this.f2265f = i3 / 400;
        int i6 = i3 / 65;
        this.f2266g = i6;
        int i7 = i6 * 2;
        this.f2267h = i7;
        this.f2268i = new short[i7];
        this.f2269j = new short[i7 * i4];
        this.f2271l = new short[i7 * i4];
        this.f2273n = new short[i7 * i4];
    }

    /* JADX INFO: renamed from: e */
    public static void m1483e(int i3, int i4, short[] sArr, int i5, short[] sArr2, int i6, short[] sArr3, int i7) {
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = (i5 * i4) + i8;
            int i10 = (i7 * i4) + i8;
            int i11 = (i6 * i4) + i8;
            for (int i12 = 0; i12 < i3; i12++) {
                sArr[i9] = (short) (((sArr3[i10] * i12) + ((i3 - i12) * sArr2[i11])) / i3);
                i9 += i4;
                i11 += i4;
                i10 += i4;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1484a(short[] sArr, int i3, int i4) {
        short[] sArrM1486c = m1486c(this.f2271l, this.f2272m, i4);
        this.f2271l = sArrM1486c;
        int i5 = this.f2261b;
        System.arraycopy(sArr, i3 * i5, sArrM1486c, this.f2272m * i5, i5 * i4);
        this.f2272m += i4;
    }

    /* JADX INFO: renamed from: b */
    public final void m1485b(short[] sArr, int i3, int i4) {
        int i5 = this.f2267h / i4;
        int i6 = this.f2261b;
        int i7 = i4 * i6;
        int i8 = i3 * i6;
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = 0;
            for (int i11 = 0; i11 < i7; i11++) {
                i10 += sArr[(i9 * i7) + i8 + i11];
            }
            this.f2268i[i9] = (short) (i10 / i7);
        }
    }

    /* JADX INFO: renamed from: c */
    public final short[] m1486c(short[] sArr, int i3, int i4) {
        int length = sArr.length;
        int i5 = this.f2261b;
        int i6 = length / i5;
        return i3 + i4 <= i6 ? sArr : Arrays.copyOf(sArr, (((i6 * 3) / 2) + i4) * i5);
    }

    /* JADX INFO: renamed from: d */
    public final int m1487d(short[] sArr, int i3, int i4, int i5) {
        int i6 = i3 * this.f2261b;
        int i7 = 255;
        int i8 = 1;
        int i9 = 0;
        int i10 = 0;
        while (i4 <= i5) {
            int iAbs = 0;
            for (int i11 = 0; i11 < i4; i11++) {
                iAbs += Math.abs(sArr[i6 + i11] - sArr[(i6 + i4) + i11]);
            }
            if (iAbs * i9 < i8 * i4) {
                i9 = i4;
                i8 = iAbs;
            }
            if (iAbs * i7 > i10 * i4) {
                i7 = i4;
                i10 = iAbs;
            }
            i4++;
        }
        this.f2280u = i8 / i9;
        this.f2281v = i10 / i7;
        return i9;
    }

    /* JADX INFO: renamed from: f */
    public final void m1488f() {
        float f;
        double d3;
        int iM1487d;
        int i3;
        int i4;
        int iRound;
        int i5;
        int i6;
        int i7;
        long j3;
        long j4;
        int i8 = this.f2272m;
        float f3 = this.f2262c;
        float f4 = this.f2263d;
        double d4 = f3 / f4;
        float f5 = this.f2264e * f4;
        int i9 = this.f2260a;
        int i10 = this.f2261b;
        int i11 = 0;
        int i12 = 1;
        if (d4 > 1.00001d || d4 < 0.99999d) {
            int i13 = this.f2270k;
            int i14 = this.f2267h;
            if (i13 >= i14) {
                int i15 = 0;
                while (true) {
                    int i16 = this.f2277r;
                    if (i16 > 0) {
                        int iMin = Math.min(i14, i16);
                        m1484a(this.f2269j, i15, iMin);
                        this.f2277r -= iMin;
                        i15 += iMin;
                        f = f5;
                        d3 = d4;
                    } else {
                        short[] sArr = this.f2269j;
                        int i17 = i9 > 4000 ? i9 / 4000 : 1;
                        int i18 = this.f2266g;
                        int i19 = this.f2265f;
                        if (i10 == i12 && i17 == i12) {
                            iM1487d = m1487d(sArr, i15, i19, i18);
                            f = f5;
                            d3 = d4;
                        } else {
                            m1485b(sArr, i15, i17);
                            f = f5;
                            d3 = d4;
                            short[] sArr2 = this.f2268i;
                            int iM1487d2 = m1487d(sArr2, i11, i19 / i17, i18 / i17);
                            if (i17 != 1) {
                                int i20 = iM1487d2 * i17;
                                int i21 = i17 * 4;
                                int i22 = i20 - i21;
                                int i23 = i20 + i21;
                                if (i22 >= i19) {
                                    i19 = i22;
                                }
                                if (i23 <= i18) {
                                    i18 = i23;
                                }
                                if (i10 == 1) {
                                    iM1487d = m1487d(sArr, i15, i19, i18);
                                } else {
                                    m1485b(sArr, i15, 1);
                                    iM1487d = m1487d(sArr2, i11, i19, i18);
                                }
                            } else {
                                iM1487d = iM1487d2;
                            }
                        }
                        int i24 = this.f2280u;
                        int i25 = this.f2281v;
                        if (i24 == 0 || (i3 = this.f2278s) == 0 || i25 > i24 * 3 || i24 * 2 <= this.f2279t * 3) {
                            i3 = iM1487d;
                        }
                        this.f2279t = i24;
                        this.f2278s = iM1487d;
                        if (d3 > 1.0d) {
                            short[] sArr3 = this.f2269j;
                            if (d3 >= 2.0d) {
                                double d5 = (((double) i3) / (d3 - 1.0d)) + this.f2282w;
                                iRound = (int) Math.round(d5);
                                this.f2282w = d5 - ((double) iRound);
                            } else {
                                double d6 = (((2.0d - d3) * ((double) i3)) / (d3 - 1.0d)) + this.f2282w;
                                int iRound2 = (int) Math.round(d6);
                                this.f2277r = iRound2;
                                this.f2282w = d6 - ((double) iRound2);
                                iRound = i3;
                            }
                            short[] sArrM1486c = m1486c(this.f2271l, this.f2272m, iRound);
                            this.f2271l = sArrM1486c;
                            int i26 = i15 + i3;
                            int i27 = i15;
                            int i28 = iRound;
                            m1483e(i28, this.f2261b, sArrM1486c, this.f2272m, sArr3, i27, sArr3, i26);
                            this.f2272m += i28;
                            i15 = i3 + i28 + i27;
                        } else {
                            int i29 = i15;
                            short[] sArr4 = this.f2269j;
                            if (d3 < 0.5d) {
                                double d7 = ((((double) i3) * d3) / (1.0d - d3)) + this.f2282w;
                                int iRound3 = (int) Math.round(d7);
                                this.f2282w = d7 - ((double) iRound3);
                                i4 = iRound3;
                            } else {
                                double d8 = ((((d3 * 2.0d) - 1.0d) * ((double) i3)) / (1.0d - d3)) + this.f2282w;
                                int iRound4 = (int) Math.round(d8);
                                this.f2277r = iRound4;
                                this.f2282w = d8 - ((double) iRound4);
                                i4 = i3;
                            }
                            int i30 = i3 + i4;
                            short[] sArrM1486c2 = m1486c(this.f2271l, this.f2272m, i30);
                            this.f2271l = sArrM1486c2;
                            System.arraycopy(sArr4, i29 * i10, sArrM1486c2, this.f2272m * i10, i3 * i10);
                            m1483e(i4, this.f2261b, this.f2271l, this.f2272m + i3, sArr4, i29 + i3, sArr4, i29);
                            this.f2272m += i30;
                            i15 = i29 + i4;
                        }
                    }
                    if (i15 + i14 > i13) {
                        break;
                    }
                    f5 = f;
                    d4 = d3;
                    i11 = 0;
                    i12 = 1;
                }
                int i31 = this.f2270k - i15;
                short[] sArr5 = this.f2269j;
                System.arraycopy(sArr5, i15 * i10, sArr5, 0, i31 * i10);
                this.f2270k = i31;
            }
            if (f != 1.0f || this.f2272m == i8) {
            }
            long j5 = (long) (i9 / f);
            long j6 = i9;
            while (j5 != 0 && j6 != 0 && j5 % 2 == 0 && j6 % 2 == 0) {
                j5 /= 2;
                j6 /= 2;
            }
            int i32 = this.f2272m - i8;
            short[] sArrM1486c3 = m1486c(this.f2273n, this.f2274o, i32);
            this.f2273n = sArrM1486c3;
            System.arraycopy(this.f2271l, i8 * i10, sArrM1486c3, this.f2274o * i10, i32 * i10);
            this.f2272m = i8;
            this.f2274o += i32;
            int i33 = 0;
            while (true) {
                i5 = this.f2274o;
                i6 = i5 - 1;
                if (i33 >= i6) {
                    break;
                }
                while (true) {
                    i7 = this.f2275p + 1;
                    j3 = i7;
                    long j7 = j3 * j5;
                    j4 = this.f2276q;
                    if (j7 <= j4 * j6) {
                        break;
                    }
                    this.f2271l = m1486c(this.f2271l, this.f2272m, 1);
                    int i34 = 0;
                    while (i34 < i10) {
                        short[] sArr6 = this.f2271l;
                        int i35 = (this.f2272m * i10) + i34;
                        short[] sArr7 = this.f2273n;
                        int i36 = (i33 * i10) + i34;
                        short s3 = sArr7[i36];
                        short s4 = sArr7[i36 + i10];
                        long j8 = ((long) this.f2276q) * j6;
                        int i37 = this.f2275p;
                        int i38 = i33;
                        long j9 = ((long) (i37 + 1)) * j5;
                        long j10 = j9 - j8;
                        long j11 = j9 - (((long) i37) * j5);
                        sArr6[i35] = (short) ((((j11 - j10) * ((long) s4)) + (((long) s3) * j10)) / j11);
                        i34++;
                        i33 = i38;
                    }
                    this.f2276q++;
                    this.f2272m++;
                    i33 = i33;
                }
                int i39 = i33;
                this.f2275p = i7;
                if (j3 == j6) {
                    this.f2275p = 0;
                    AbstractC0646n.m1630h(j4 == j5);
                    this.f2276q = 0;
                }
                i33 = i39 + 1;
            }
            if (i6 == 0) {
                return;
            }
            short[] sArr8 = this.f2273n;
            System.arraycopy(sArr8, i6 * i10, sArr8, 0, (i5 - i6) * i10);
            this.f2274o -= i6;
            return;
        }
        m1484a(this.f2269j, 0, this.f2270k);
        this.f2270k = 0;
        f = f5;
        if (f != 1.0f) {
        }
    }
}

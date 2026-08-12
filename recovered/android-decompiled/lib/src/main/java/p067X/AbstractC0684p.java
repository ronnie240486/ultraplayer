package p067X;

import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import p000A.C0058r;
import p045P0.AbstractC0462h;
import p048Q0.C0508g;
import p053S0.C0536b;
import p055T.C0573f;
import p064W.AbstractC0646n;
import p105h2.AbstractC1670A;
import p105h2.AbstractC1676G;
import p105h2.AbstractC1723q;
import p105h2.C1673D;
import p105h2.C1692X;
import p112j2.AbstractC1789b;

/* JADX INFO: renamed from: X.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0684p {

    /* JADX INFO: renamed from: a */
    public static final byte[] f2629a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final float[] f2630b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c */
    public static final Object f2631c = new Object();

    /* JADX INFO: renamed from: d */
    public static int[] f2632d = new int[10];

    /* JADX INFO: renamed from: a */
    public static void m1788a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX INFO: renamed from: b */
    public static int m1789b(byte[] bArr, int i3, int i4, boolean[] zArr) {
        int i5 = i4 - i3;
        AbstractC0646n.m1630h(i5 >= 0);
        if (i5 == 0) {
            return i4;
        }
        if (zArr[0]) {
            m1788a(zArr);
            return i3 - 3;
        }
        if (i5 > 1 && zArr[1] && bArr[i3] == 1) {
            m1788a(zArr);
            return i3 - 2;
        }
        if (i5 > 2 && zArr[2] && bArr[i3] == 0 && bArr[i3 + 1] == 1) {
            m1788a(zArr);
            return i3 - 1;
        }
        int i6 = i4 - 1;
        int i7 = i3 + 2;
        while (i7 < i6) {
            byte b3 = bArr[i7];
            if ((b3 & 254) == 0) {
                int i8 = i7 - 2;
                if (bArr[i8] == 0 && bArr[i7 - 1] == 0 && b3 == 1) {
                    m1788a(zArr);
                    return i8;
                }
                i7 -= 2;
            }
            i7 += 3;
        }
        zArr[0] = i5 <= 2 ? !(i5 != 2 ? !(zArr[1] && bArr[i6] == 1) : !(zArr[2] && bArr[i4 + (-2)] == 0 && bArr[i6] == 1)) : bArr[i4 + (-3)] == 0 && bArr[i4 + (-2)] == 0 && bArr[i6] == 1;
        zArr[1] = i5 <= 1 ? zArr[2] && bArr[i6] == 0 : bArr[i4 + (-2)] == 0 && bArr[i6] == 0;
        zArr[2] = bArr[i6] == 0;
        return i4;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1790c(byte b3) {
        if (((b3 & 96) >> 5) != 0) {
            return true;
        }
        int i3 = b3 & 31;
        return (i3 == 1 || i3 == 9 || i3 == 14) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public static C0058r m1791d(C0508g c0508g) {
        c0508g.m1262s();
        int iM1252i = c0508g.m1252i(6);
        int iM1252i2 = c0508g.m1252i(6);
        c0508g.m1252i(3);
        return new C0058r(iM1252i, iM1252i2);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e A[SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static C0676h m1792e(C0508g c0508g, boolean z3, int i3, C0676h c0676h) {
        int[] iArr;
        int i4;
        boolean z4;
        int i5;
        int i6;
        boolean zM1251h;
        int iM1252i;
        int i7;
        int i8;
        int[] iArr2 = new int[6];
        if (!z3) {
            if (c0676h != null) {
                int i9 = c0676h.f2581a;
                zM1251h = c0676h.f2582b;
                iM1252i = c0676h.f2583c;
                i7 = c0676h.f2584d;
                iArr2 = c0676h.f2585e;
                i4 = i9;
            } else {
                iArr = iArr2;
                i4 = 0;
                z4 = false;
                i5 = 0;
                i6 = 0;
            }
            int iM1252i2 = c0508g.m1252i(8);
            i8 = 0;
            for (int i10 = 0; i10 < i3; i10++) {
                if (c0508g.m1251h()) {
                    i8 += 88;
                }
                if (c0508g.m1251h()) {
                    i8 += 8;
                }
            }
            c0508g.m1263t(i8);
            if (i3 > 0) {
                c0508g.m1263t((8 - i3) * 2);
            }
            return new C0676h(i4, z4, i5, i6, iArr, iM1252i2);
        }
        int iM1252i3 = c0508g.m1252i(2);
        zM1251h = c0508g.m1251h();
        iM1252i = c0508g.m1252i(5);
        i7 = 0;
        for (int i11 = 0; i11 < 32; i11++) {
            if (c0508g.m1251h()) {
                i7 |= 1 << i11;
            }
        }
        for (int i12 = 0; i12 < 6; i12++) {
            iArr2[i12] = c0508g.m1252i(8);
        }
        i4 = iM1252i3;
        iArr = iArr2;
        z4 = zM1251h;
        i5 = iM1252i;
        i6 = i7;
        int iM1252i4 = c0508g.m1252i(8);
        i8 = 0;
        while (i10 < i3) {
            if (c0508g.m1251h()) {
                i8 += 88;
            }
            if (c0508g.m1251h()) {
                i8 += 8;
            }
        }
        c0508g.m1263t(i8);
        if (i3 > 0) {
            c0508g.m1263t((8 - i3) * 2);
        }
        return new C0676h(i4, z4, i5, i6, iArr, iM1252i4);
    }

    /* JADX INFO: renamed from: f */
    public static C0679k m1793f(byte[] bArr, int i3, int i4) {
        byte b3;
        int i5 = i3 + 2;
        do {
            i4--;
            b3 = bArr[i4];
            if (b3 != 0) {
                break;
            }
        } while (i4 > i5);
        if (b3 == 0 || i4 <= i5) {
            return null;
        }
        C0508g c0508g = new C0508g(bArr, i5, i4 + 1);
        while (c0508g.m1247d(16)) {
            int iM1252i = c0508g.m1252i(8);
            int i6 = 0;
            while (iM1252i == 255) {
                i6 += 255;
                iM1252i = c0508g.m1252i(8);
            }
            int i7 = i6 + iM1252i;
            int iM1252i2 = c0508g.m1252i(8);
            int i8 = 0;
            while (iM1252i2 == 255) {
                i8 += 255;
                iM1252i2 = c0508g.m1252i(8);
            }
            int i9 = i8 + iM1252i2;
            if (i9 == 0 || !c0508g.m1247d(i9)) {
                return null;
            }
            if (i7 == 176) {
                int iM1256m = c0508g.m1256m();
                boolean zM1251h = c0508g.m1251h();
                int iM1256m2 = zM1251h ? c0508g.m1256m() : 0;
                int iM1256m3 = c0508g.m1256m();
                int iM1256m4 = -1;
                for (int i10 = 0; i10 <= iM1256m3; i10++) {
                    iM1256m4 = c0508g.m1256m();
                    c0508g.m1256m();
                    int iM1252i3 = c0508g.m1252i(6);
                    if (iM1252i3 == 63) {
                        return null;
                    }
                    c0508g.m1252i(iM1252i3 == 0 ? Math.max(0, iM1256m - 30) : Math.max(0, (iM1252i3 + iM1256m) - 31));
                    if (zM1251h) {
                        int iM1252i4 = c0508g.m1252i(6);
                        if (iM1252i4 == 63) {
                            return null;
                        }
                        c0508g.m1252i(iM1252i4 == 0 ? Math.max(0, iM1256m2 - 30) : Math.max(0, (iM1252i4 + iM1256m2) - 31));
                    }
                    if (c0508g.m1251h()) {
                        c0508g.m1263t(10);
                    }
                }
                return new C0679k(iM1256m4);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:101:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    /* JADX WARN: Code duplicated, block: B:151:0x0286  */
    /* JADX WARN: Code duplicated, block: B:153:0x0299 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:154:0x029b  */
    /* JADX WARN: Code duplicated, block: B:155:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:159:0x02b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:161:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:167:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:169:0x02eb A[LOOP:12: B:168:0x02e9->B:169:0x02eb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:172:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:174:0x0305  */
    /* JADX WARN: Code duplicated, block: B:176:0x030f  */
    /* JADX WARN: Code duplicated, block: B:178:0x031b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:180:0x0321  */
    /* JADX WARN: Code duplicated, block: B:182:0x0325  */
    /* JADX WARN: Code duplicated, block: B:183:0x032a  */
    /* JADX WARN: Code duplicated, block: B:186:0x0337  */
    /* JADX WARN: Code duplicated, block: B:189:0x0340  */
    /* JADX WARN: Code duplicated, block: B:191:0x034a  */
    /* JADX WARN: Code duplicated, block: B:192:0x034c  */
    /* JADX WARN: Code duplicated, block: B:195:0x0353  */
    /* JADX WARN: Code duplicated, block: B:196:0x0369  */
    /* JADX WARN: Code duplicated, block: B:197:0x036c  */
    /* JADX WARN: Code duplicated, block: B:198:0x036e  */
    /* JADX WARN: Code duplicated, block: B:203:0x0391  */
    /* JADX WARN: Code duplicated, block: B:206:0x039a  */
    /* JADX WARN: Code duplicated, block: B:209:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:211:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:57:0x010b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0111  */
    /* JADX WARN: Code duplicated, block: B:60:0x0114  */
    /* JADX WARN: Code duplicated, block: B:63:0x011b A[LOOP:0: B:62:0x0119->B:63:0x011b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x0130  */
    /* JADX WARN: Code duplicated, block: B:68:0x014a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x014c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0151  */
    /* JADX WARN: Code duplicated, block: B:73:0x0155  */
    /* JADX WARN: Code duplicated, block: B:75:0x015a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0160  */
    /* JADX WARN: Code duplicated, block: B:79:0x0163  */
    /* JADX WARN: Code duplicated, block: B:81:0x0166  */
    /* JADX WARN: Code duplicated, block: B:83:0x016c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0170  */
    /* JADX WARN: Code duplicated, block: B:86:0x017d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0183 A[LOOP:3: B:88:0x0181->B:89:0x0183, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x018b  */
    /* JADX WARN: Code duplicated, block: B:92:0x018d  */
    /* JADX WARN: Code duplicated, block: B:97:0x019c  */
    /* JADX INFO: renamed from: g */
    public static C0680l m1794g(byte[] bArr, int i3, int i4, C0536b c0536b) {
        int i5;
        int i6;
        int i7;
        int iM1256m;
        int iM1256m2;
        int i8;
        int i9;
        int i10;
        int i11;
        int iM1256m3;
        int i12;
        int iM1256m4;
        int[] iArr;
        int[] iArrCopyOf;
        int i13;
        int i14;
        int i15;
        float f;
        int i16;
        float f3;
        int i17;
        int i18;
        int i19;
        int iM1439f;
        int iM1440g;
        int i20;
        C0677i c0677i;
        int iM1252i;
        int iM1252i2;
        int iM1252i3;
        int iM1256m5;
        int i21;
        int iM1256m6;
        int iM1256m7;
        int[] iArr2;
        int i22;
        int[] iArr3;
        int i23;
        int i24;
        int i25;
        boolean zM1251h;
        int i26;
        int i27;
        int iMin;
        int i28;
        int i29;
        int i30;
        int i31;
        int iMax;
        C0677i c0677i2;
        C0058r c0058rM1791d = m1791d(new C0508g(bArr, i3, i4));
        C0508g c0508g = new C0508g(bArr, i3 + 2, i4);
        c0508g.m1263t(4);
        int iM1252i4 = c0508g.m1252i(3);
        int i32 = c0058rM1791d.f83b;
        boolean z3 = i32 != 0 && iM1252i4 == 7;
        if (c0536b != null) {
            AbstractC1676G abstractC1676G = (AbstractC1676G) c0536b.f1867g;
            if (abstractC1676G.isEmpty()) {
                i5 = 0;
            } else {
                i5 = ((C0675g) abstractC1676G.get(Math.min(i32, abstractC1676G.size() - 1))).f2579a;
            }
        } else {
            i5 = 0;
        }
        C0676h c0676hM1792e = null;
        if (!z3) {
            c0508g.m1262s();
            c0676hM1792e = m1792e(c0508g, true, iM1252i4, null);
        } else if (c0536b != null) {
            C0677i c0677i3 = (C0677i) c0536b.f1868h;
            int i33 = c0677i3.f2588b[i5];
            AbstractC1676G abstractC1676G2 = c0677i3.f2587a;
            if (abstractC1676G2.size() > i33) {
                c0676hM1792e = (C0676h) abstractC1676G2.get(i33);
            }
        }
        C0676h c0676h = c0676hM1792e;
        c0508g.m1256m();
        if (z3) {
            int iM1252i5 = c0508g.m1251h() ? c0508g.m1252i(8) : -1;
            if (c0536b != null && (c0677i2 = (C0677i) c0536b.f1869i) != null) {
                if (iM1252i5 == -1) {
                    iM1252i5 = c0677i2.f2588b[i5];
                }
                if (iM1252i5 != -1) {
                    AbstractC1676G abstractC1676G3 = c0677i2.f2587a;
                    if (abstractC1676G3.size() > iM1252i5) {
                        C0678j c0678j = (C0678j) abstractC1676G3.get(iM1252i5);
                        int i34 = c0678j.f2589a;
                        i7 = c0678j.f2592d;
                        i6 = c0678j.f2593e;
                        iM1256m = c0678j.f2590b;
                        iM1256m2 = c0678j.f2591c;
                    }
                    iM1256m3 = c0508g.m1256m();
                    if (z3) {
                        i12 = -1;
                    } else {
                        if (c0508g.m1251h()) {
                            i30 = 0;
                        } else {
                            i30 = iM1252i4;
                        }
                        iMax = -1;
                        for (i31 = i30; i31 <= iM1252i4; i31++) {
                            c0508g.m1256m();
                            iMax = Math.max(c0508g.m1256m(), iMax);
                            c0508g.m1256m();
                        }
                        i12 = iMax;
                    }
                    c0508g.m1256m();
                    c0508g.m1256m();
                    c0508g.m1256m();
                    c0508g.m1256m();
                    c0508g.m1256m();
                    c0508g.m1256m();
                    if (c0508g.m1251h()) {
                        if (z3) {
                            zM1251h = c0508g.m1251h();
                        } else {
                            zM1251h = false;
                        }
                        if (zM1251h) {
                            c0508g.m1263t(6);
                        } else if (c0508g.m1251h()) {
                            for (i26 = 0; i26 < 4; i26++) {
                                i27 = 0;
                                while (i27 < 6) {
                                    if (c0508g.m1251h()) {
                                        iMin = Math.min(64, 1 << ((i26 << 1) + 4));
                                        if (i26 > 1) {
                                            c0508g.m1257n();
                                        }
                                        for (i28 = 0; i28 < iMin; i28++) {
                                            c0508g.m1257n();
                                        }
                                    } else {
                                        c0508g.m1256m();
                                    }
                                    if (i26 == 3) {
                                        i29 = 3;
                                    } else {
                                        i29 = 1;
                                    }
                                    i27 += i29;
                                }
                            }
                        }
                    }
                    c0508g.m1263t(2);
                    if (c0508g.m1251h()) {
                        c0508g.m1263t(8);
                        c0508g.m1256m();
                        c0508g.m1256m();
                        c0508g.m1262s();
                    }
                    iM1256m4 = c0508g.m1256m();
                    iArr = new int[0];
                    iArrCopyOf = new int[0];
                    i13 = -1;
                    i14 = 0;
                    i15 = -1;
                    while (i14 < iM1256m4) {
                        if (i14 == 0 && c0508g.m1251h()) {
                            int i35 = i15 + i13;
                            int iM1256m8 = (1 - ((c0508g.m1251h() ? 1 : 0) * 2)) * (c0508g.m1256m() + 1);
                            int i36 = i35 + 1;
                            boolean[] zArr = new boolean[i36];
                            for (int i37 = 0; i37 <= i35; i37++) {
                                if (c0508g.m1251h()) {
                                    zArr[i37] = true;
                                } else {
                                    zArr[i37] = c0508g.m1251h();
                                }
                            }
                            int[] iArr4 = new int[i36];
                            int[] iArr5 = new int[i36];
                            int i38 = 0;
                            for (int i39 = i13 - 1; i39 >= 0; i39--) {
                                int i40 = iArrCopyOf[i39] + iM1256m8;
                                if (i40 < 0 && zArr[i15 + i39]) {
                                    iArr4[i38] = i40;
                                    i38++;
                                }
                            }
                            if (iM1256m8 < 0 && zArr[i35]) {
                                iArr4[i38] = iM1256m8;
                                i38++;
                            }
                            int i41 = i38;
                            int[] iArr6 = iArr;
                            for (int i42 = 0; i42 < i15; i42++) {
                                int i43 = iArr6[i42] + iM1256m8;
                                if (i43 < 0 && zArr[i42]) {
                                    iArr4[i41] = i43;
                                    i41++;
                                }
                            }
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i41);
                            int i44 = 0;
                            for (int i45 = i15 - 1; i45 >= 0; i45--) {
                                int i46 = iArr6[i45] + iM1256m8;
                                if (i46 > 0 && zArr[i45]) {
                                    iArr5[i44] = i46;
                                    i44++;
                                }
                            }
                            if (iM1256m8 > 0 && zArr[i35]) {
                                iArr5[i44] = iM1256m8;
                                i44++;
                            }
                            int i47 = i44;
                            for (int i48 = 0; i48 < i13; i48++) {
                                int i49 = iArrCopyOf[i48] + iM1256m8;
                                if (i49 > 0 && zArr[i15 + i48]) {
                                    iArr5[i47] = i49;
                                    i47++;
                                }
                            }
                            iArrCopyOf = Arrays.copyOf(iArr5, i47);
                            i15 = i41;
                            i13 = i47;
                            iArr = iArrCopyOf2;
                        } else {
                            iM1256m6 = c0508g.m1256m();
                            iM1256m7 = c0508g.m1256m();
                            iArr2 = new int[iM1256m6];
                            for (i22 = 0; i22 < iM1256m6; i22++) {
                                if (i22 > 0) {
                                    i25 = iArr2[i22 - 1];
                                } else {
                                    i25 = 0;
                                }
                                iArr2[i22] = i25 - (c0508g.m1256m() + 1);
                                c0508g.m1262s();
                            }
                            iArr3 = new int[iM1256m7];
                            for (i23 = 0; i23 < iM1256m7; i23++) {
                                if (i23 > 0) {
                                    i24 = iArr3[i23 - 1];
                                } else {
                                    i24 = 0;
                                }
                                iArr3[i23] = c0508g.m1256m() + 1 + i24;
                                c0508g.m1262s();
                            }
                            i15 = iM1256m6;
                            iArr = iArr2;
                            iArrCopyOf = iArr3;
                            i13 = iM1256m7;
                        }
                        i14++;
                        iM1256m4 = iM1256m4;
                        i5 = i5;
                    }
                    int i50 = i5;
                    if (c0508g.m1251h()) {
                        iM1256m5 = c0508g.m1256m();
                        for (i21 = 0; i21 < iM1256m5; i21++) {
                            c0508g.m1263t(iM1256m3 + 5);
                        }
                    }
                    c0508g.m1263t(2);
                    f = 1.0f;
                    if (c0508g.m1251h()) {
                        if (c0508g.m1251h()) {
                            iM1252i = c0508g.m1252i(8);
                            if (iM1252i == 255) {
                                iM1252i2 = c0508g.m1252i(16);
                                iM1252i3 = c0508g.m1252i(16);
                                if (iM1252i2 != 0 && iM1252i3 != 0) {
                                    f = iM1252i2 / iM1252i3;
                                }
                            } else if (iM1252i < 17) {
                                f = f2630b[iM1252i];
                            } else {
                                AbstractC0462h.m1170j("Unexpected aspect_ratio_idc value: ", "NalUnitUtil", iM1252i);
                            }
                        }
                        if (c0508g.m1251h()) {
                            c0508g.m1262s();
                        }
                        if (c0508g.m1251h()) {
                            c0508g.m1263t(3);
                            if (c0508g.m1251h()) {
                                i20 = 1;
                            } else {
                                i20 = 2;
                            }
                            if (c0508g.m1251h()) {
                                int iM1252i6 = c0508g.m1252i(8);
                                int iM1252i7 = c0508g.m1252i(8);
                                c0508g.m1263t(8);
                                iM1439f = C0573f.m1439f(iM1252i6);
                                iM1440g = C0573f.m1440g(iM1252i7);
                            } else {
                                iM1439f = -1;
                                iM1440g = -1;
                            }
                        } else if (c0536b != null || (c0677i = (C0677i) c0536b.f1870j) == null) {
                            iM1439f = -1;
                            iM1440g = -1;
                            i20 = -1;
                        } else {
                            int i51 = c0677i.f2588b[i50];
                            AbstractC1676G abstractC1676G4 = c0677i.f2587a;
                            if (abstractC1676G4.size() > i51) {
                                C0681m c0681m = (C0681m) abstractC1676G4.get(i51);
                                int i52 = c0681m.f2605a;
                                int i53 = c0681m.f2606b;
                                iM1440g = c0681m.f2607c;
                                iM1439f = i52;
                                i20 = i53;
                            } else {
                                iM1439f = -1;
                                iM1440g = -1;
                                i20 = -1;
                            }
                        }
                        if (c0508g.m1251h()) {
                            c0508g.m1256m();
                            c0508g.m1256m();
                        }
                        c0508g.m1262s();
                        if (c0508g.m1251h()) {
                            i11 *= 2;
                        }
                        i17 = iM1439f;
                        i19 = iM1440g;
                        f3 = f;
                        i18 = i20;
                        i16 = i11;
                    } else {
                        i16 = i11;
                        f3 = 1.0f;
                        i17 = -1;
                        i18 = -1;
                        i19 = -1;
                    }
                    return new C0680l(c0676h, i10, i9, i8, i16, f3, i12, i17, i18, i19);
                }
            }
            i11 = 0;
            i10 = 0;
            i9 = 0;
            i8 = 0;
            iM1256m3 = c0508g.m1256m();
            if (z3) {
                if (c0508g.m1251h()) {
                    i30 = 0;
                } else {
                    i30 = iM1252i4;
                }
                iMax = -1;
                while (i31 <= iM1252i4) {
                    c0508g.m1256m();
                    iMax = Math.max(c0508g.m1256m(), iMax);
                    c0508g.m1256m();
                }
                i12 = iMax;
            } else {
                i12 = -1;
            }
            c0508g.m1256m();
            c0508g.m1256m();
            c0508g.m1256m();
            c0508g.m1256m();
            c0508g.m1256m();
            c0508g.m1256m();
            if (c0508g.m1251h()) {
                if (z3) {
                    zM1251h = c0508g.m1251h();
                } else {
                    zM1251h = false;
                }
                if (zM1251h) {
                    c0508g.m1263t(6);
                } else if (c0508g.m1251h()) {
                    while (i26 < 4) {
                        i27 = 0;
                        while (i27 < 6) {
                            if (c0508g.m1251h()) {
                                c0508g.m1256m();
                            } else {
                                iMin = Math.min(64, 1 << ((i26 << 1) + 4));
                                if (i26 > 1) {
                                    c0508g.m1257n();
                                }
                                while (i28 < iMin) {
                                    c0508g.m1257n();
                                }
                            }
                            if (i26 == 3) {
                                i29 = 3;
                            } else {
                                i29 = 1;
                            }
                            i27 += i29;
                        }
                    }
                }
            }
            c0508g.m1263t(2);
            if (c0508g.m1251h()) {
                c0508g.m1263t(8);
                c0508g.m1256m();
                c0508g.m1256m();
                c0508g.m1262s();
            }
            iM1256m4 = c0508g.m1256m();
            iArr = new int[0];
            iArrCopyOf = new int[0];
            i13 = -1;
            i14 = 0;
            i15 = -1;
            while (i14 < iM1256m4) {
                if (i14 == 0) {
                    iM1256m6 = c0508g.m1256m();
                    iM1256m7 = c0508g.m1256m();
                    iArr2 = new int[iM1256m6];
                    while (i22 < iM1256m6) {
                        if (i22 > 0) {
                            i25 = iArr2[i22 - 1];
                        } else {
                            i25 = 0;
                        }
                        iArr2[i22] = i25 - (c0508g.m1256m() + 1);
                        c0508g.m1262s();
                    }
                    iArr3 = new int[iM1256m7];
                    while (i23 < iM1256m7) {
                        if (i23 > 0) {
                            i24 = iArr3[i23 - 1];
                        } else {
                            i24 = 0;
                        }
                        iArr3[i23] = c0508g.m1256m() + 1 + i24;
                        c0508g.m1262s();
                    }
                    i15 = iM1256m6;
                    iArr = iArr2;
                    iArrCopyOf = iArr3;
                    i13 = iM1256m7;
                } else {
                    iM1256m6 = c0508g.m1256m();
                    iM1256m7 = c0508g.m1256m();
                    iArr2 = new int[iM1256m6];
                    while (i22 < iM1256m6) {
                        if (i22 > 0) {
                            i25 = iArr2[i22 - 1];
                        } else {
                            i25 = 0;
                        }
                        iArr2[i22] = i25 - (c0508g.m1256m() + 1);
                        c0508g.m1262s();
                    }
                    iArr3 = new int[iM1256m7];
                    while (i23 < iM1256m7) {
                        if (i23 > 0) {
                            i24 = iArr3[i23 - 1];
                        } else {
                            i24 = 0;
                        }
                        iArr3[i23] = c0508g.m1256m() + 1 + i24;
                        c0508g.m1262s();
                    }
                    i15 = iM1256m6;
                    iArr = iArr2;
                    iArrCopyOf = iArr3;
                    i13 = iM1256m7;
                }
                i14++;
                iM1256m4 = iM1256m4;
                i5 = i5;
            }
            int i54 = i5;
            if (c0508g.m1251h()) {
                iM1256m5 = c0508g.m1256m();
                while (i21 < iM1256m5) {
                    c0508g.m1263t(iM1256m3 + 5);
                }
            }
            c0508g.m1263t(2);
            f = 1.0f;
            if (c0508g.m1251h()) {
                if (c0508g.m1251h()) {
                    iM1252i = c0508g.m1252i(8);
                    if (iM1252i == 255) {
                        iM1252i2 = c0508g.m1252i(16);
                        iM1252i3 = c0508g.m1252i(16);
                        if (iM1252i2 != 0) {
                            f = iM1252i2 / iM1252i3;
                        }
                    } else if (iM1252i < 17) {
                        f = f2630b[iM1252i];
                    } else {
                        AbstractC0462h.m1170j("Unexpected aspect_ratio_idc value: ", "NalUnitUtil", iM1252i);
                    }
                }
                if (c0508g.m1251h()) {
                    c0508g.m1262s();
                }
                if (c0508g.m1251h()) {
                    c0508g.m1263t(3);
                    if (c0508g.m1251h()) {
                        i20 = 1;
                    } else {
                        i20 = 2;
                    }
                    if (c0508g.m1251h()) {
                        int iM1252i8 = c0508g.m1252i(8);
                        int iM1252i9 = c0508g.m1252i(8);
                        c0508g.m1263t(8);
                        iM1439f = C0573f.m1439f(iM1252i8);
                        iM1440g = C0573f.m1440g(iM1252i9);
                    } else {
                        iM1439f = -1;
                        iM1440g = -1;
                    }
                } else if (c0536b != null) {
                    iM1439f = -1;
                    iM1440g = -1;
                    i20 = -1;
                } else {
                    iM1439f = -1;
                    iM1440g = -1;
                    i20 = -1;
                }
                if (c0508g.m1251h()) {
                    c0508g.m1256m();
                    c0508g.m1256m();
                }
                c0508g.m1262s();
                if (c0508g.m1251h()) {
                    i11 *= 2;
                }
                i17 = iM1439f;
                i19 = iM1440g;
                f3 = f;
                i18 = i20;
                i16 = i11;
            } else {
                i16 = i11;
                f3 = 1.0f;
                i17 = -1;
                i18 = -1;
                i19 = -1;
            }
            return new C0680l(c0676h, i10, i9, i8, i16, f3, i12, i17, i18, i19);
        }
        int iM1256m9 = c0508g.m1256m();
        if (iM1256m9 == 3) {
            c0508g.m1262s();
        }
        int iM1256m10 = c0508g.m1256m();
        int iM1256m11 = c0508g.m1256m();
        if (c0508g.m1251h()) {
            int iM1256m12 = c0508g.m1256m();
            int iM1256m13 = c0508g.m1256m();
            int iM1256m14 = c0508g.m1256m();
            int iM1256m15 = c0508g.m1256m();
            iM1256m10 -= (iM1256m12 + iM1256m13) * ((iM1256m9 == 1 || iM1256m9 == 2) ? 2 : 1);
            iM1256m11 -= (iM1256m14 + iM1256m15) * (iM1256m9 == 1 ? 2 : 1);
        }
        i6 = iM1256m11;
        i7 = iM1256m10;
        iM1256m = c0508g.m1256m();
        iM1256m2 = c0508g.m1256m();
        int i55 = iM1256m2;
        i10 = iM1256m;
        i11 = i6;
        i8 = i7;
        i9 = i55;
        iM1256m3 = c0508g.m1256m();
        if (z3) {
            if (c0508g.m1251h()) {
                i30 = 0;
            } else {
                i30 = iM1252i4;
            }
            iMax = -1;
            while (i31 <= iM1252i4) {
                c0508g.m1256m();
                iMax = Math.max(c0508g.m1256m(), iMax);
                c0508g.m1256m();
            }
            i12 = iMax;
        } else {
            i12 = -1;
        }
        c0508g.m1256m();
        c0508g.m1256m();
        c0508g.m1256m();
        c0508g.m1256m();
        c0508g.m1256m();
        c0508g.m1256m();
        if (c0508g.m1251h()) {
            if (z3) {
                zM1251h = c0508g.m1251h();
            } else {
                zM1251h = false;
            }
            if (zM1251h) {
                c0508g.m1263t(6);
            } else if (c0508g.m1251h()) {
                while (i26 < 4) {
                    i27 = 0;
                    while (i27 < 6) {
                        if (c0508g.m1251h()) {
                            c0508g.m1256m();
                        } else {
                            iMin = Math.min(64, 1 << ((i26 << 1) + 4));
                            if (i26 > 1) {
                                c0508g.m1257n();
                            }
                            while (i28 < iMin) {
                                c0508g.m1257n();
                            }
                        }
                        if (i26 == 3) {
                            i29 = 3;
                        } else {
                            i29 = 1;
                        }
                        i27 += i29;
                    }
                }
            }
        }
        c0508g.m1263t(2);
        if (c0508g.m1251h()) {
            c0508g.m1263t(8);
            c0508g.m1256m();
            c0508g.m1256m();
            c0508g.m1262s();
        }
        iM1256m4 = c0508g.m1256m();
        iArr = new int[0];
        iArrCopyOf = new int[0];
        i13 = -1;
        i14 = 0;
        i15 = -1;
        while (i14 < iM1256m4) {
            if (i14 == 0) {
                iM1256m6 = c0508g.m1256m();
                iM1256m7 = c0508g.m1256m();
                iArr2 = new int[iM1256m6];
                while (i22 < iM1256m6) {
                    if (i22 > 0) {
                        i25 = iArr2[i22 - 1];
                    } else {
                        i25 = 0;
                    }
                    iArr2[i22] = i25 - (c0508g.m1256m() + 1);
                    c0508g.m1262s();
                }
                iArr3 = new int[iM1256m7];
                while (i23 < iM1256m7) {
                    if (i23 > 0) {
                        i24 = iArr3[i23 - 1];
                    } else {
                        i24 = 0;
                    }
                    iArr3[i23] = c0508g.m1256m() + 1 + i24;
                    c0508g.m1262s();
                }
                i15 = iM1256m6;
                iArr = iArr2;
                iArrCopyOf = iArr3;
                i13 = iM1256m7;
            } else {
                iM1256m6 = c0508g.m1256m();
                iM1256m7 = c0508g.m1256m();
                iArr2 = new int[iM1256m6];
                while (i22 < iM1256m6) {
                    if (i22 > 0) {
                        i25 = iArr2[i22 - 1];
                    } else {
                        i25 = 0;
                    }
                    iArr2[i22] = i25 - (c0508g.m1256m() + 1);
                    c0508g.m1262s();
                }
                iArr3 = new int[iM1256m7];
                while (i23 < iM1256m7) {
                    if (i23 > 0) {
                        i24 = iArr3[i23 - 1];
                    } else {
                        i24 = 0;
                    }
                    iArr3[i23] = c0508g.m1256m() + 1 + i24;
                    c0508g.m1262s();
                }
                i15 = iM1256m6;
                iArr = iArr2;
                iArrCopyOf = iArr3;
                i13 = iM1256m7;
            }
            i14++;
            iM1256m4 = iM1256m4;
            i5 = i5;
        }
        int i56 = i5;
        if (c0508g.m1251h()) {
            iM1256m5 = c0508g.m1256m();
            while (i21 < iM1256m5) {
                c0508g.m1263t(iM1256m3 + 5);
            }
        }
        c0508g.m1263t(2);
        f = 1.0f;
        if (c0508g.m1251h()) {
            if (c0508g.m1251h()) {
                iM1252i = c0508g.m1252i(8);
                if (iM1252i == 255) {
                    iM1252i2 = c0508g.m1252i(16);
                    iM1252i3 = c0508g.m1252i(16);
                    if (iM1252i2 != 0) {
                        f = iM1252i2 / iM1252i3;
                    }
                } else if (iM1252i < 17) {
                    f = f2630b[iM1252i];
                } else {
                    AbstractC0462h.m1170j("Unexpected aspect_ratio_idc value: ", "NalUnitUtil", iM1252i);
                }
            }
            if (c0508g.m1251h()) {
                c0508g.m1262s();
            }
            if (c0508g.m1251h()) {
                c0508g.m1263t(3);
                if (c0508g.m1251h()) {
                    i20 = 1;
                } else {
                    i20 = 2;
                }
                if (c0508g.m1251h()) {
                    int iM1252i10 = c0508g.m1252i(8);
                    int iM1252i11 = c0508g.m1252i(8);
                    c0508g.m1263t(8);
                    iM1439f = C0573f.m1439f(iM1252i10);
                    iM1440g = C0573f.m1440g(iM1252i11);
                } else {
                    iM1439f = -1;
                    iM1440g = -1;
                }
            } else if (c0536b != null) {
                iM1439f = -1;
                iM1440g = -1;
                i20 = -1;
            } else {
                iM1439f = -1;
                iM1440g = -1;
                i20 = -1;
            }
            if (c0508g.m1251h()) {
                c0508g.m1256m();
                c0508g.m1256m();
            }
            c0508g.m1262s();
            if (c0508g.m1251h()) {
                i11 *= 2;
            }
            i17 = iM1439f;
            i19 = iM1440g;
            f3 = f;
            i18 = i20;
            i16 = i11;
        } else {
            i16 = i11;
            f3 = 1.0f;
            i17 = -1;
            i18 = -1;
            i19 = -1;
        }
        return new C0680l(c0676h, i10, i9, i8, i16, f3, i12, i17, i18, i19);
    }

    /* JADX WARN: Code duplicated, block: B:312:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:315:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:486:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x05d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0114  */
    /* JADX WARN: Code duplicated, block: B:62:0x011a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0120  */
    /* JADX WARN: Code duplicated, block: B:65:0x0126  */
    /* JADX WARN: Code duplicated, block: B:67:0x012c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0139  */
    /* JADX WARN: Code duplicated, block: B:72:0x0144  */
    /* JADX WARN: Code duplicated, block: B:74:0x0149  */
    /* JADX WARN: Code duplicated, block: B:76:0x0151  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static C0536b m1795h(byte[] bArr, int i3, int i4) {
        int[] iArr;
        C0677i c0677i;
        int iM1252i;
        int iM1252i2;
        int iM1252i3;
        C1692X c1692x;
        boolean[][] zArr;
        int i5;
        int i6;
        int i7;
        boolean[][] zArr2;
        int[] iArr2;
        int[] iArr3;
        boolean z3;
        int i8;
        boolean zM1251h;
        int i9;
        int i10;
        int i11;
        boolean zM1251h2;
        boolean zM1251h3;
        int iM1256m;
        int i12;
        int i13;
        int i14;
        boolean z4;
        boolean z5;
        C0508g c0508g = new C0508g(bArr, i3, i4);
        m1791d(c0508g);
        c0508g.m1263t(4);
        boolean zM1251h4 = c0508g.m1251h();
        boolean zM1251h5 = c0508g.m1251h();
        int iM1252i4 = c0508g.m1252i(6);
        int i15 = iM1252i4 + 1;
        int iM1252i5 = c0508g.m1252i(3);
        c0508g.m1263t(17);
        C0676h c0676hM1792e = m1792e(c0508g, true, iM1252i5, null);
        for (int i16 = c0508g.m1251h() ? 0 : iM1252i5; i16 <= iM1252i5; i16++) {
            c0508g.m1256m();
            c0508g.m1256m();
            c0508g.m1256m();
        }
        int iM1252i6 = c0508g.m1252i(6);
        int iM1256m2 = c0508g.m1256m() + 1;
        C0677i c0677i2 = new C0677i(AbstractC1676G.m4120r(c0676hM1792e), new int[1], 0);
        boolean z6 = i15 >= 2 && iM1256m2 >= 2;
        boolean z7 = zM1251h4 && zM1251h5;
        int i17 = iM1252i6 + 1;
        boolean z8 = i17 >= i15;
        if (!z6 || !z7 || !z8) {
            return new C0536b(null, c0677i2, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, iM1256m2, i17);
        int[] iArr5 = new int[iM1256m2];
        int[] iArr6 = new int[iM1256m2];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i18 = 1; i18 < iM1256m2; i18++) {
            int i19 = 0;
            for (int i20 = 0; i20 <= iM1252i6; i20++) {
                if (c0508g.m1251h()) {
                    iArr4[i18][i19] = i20;
                    iArr6[i18] = i20;
                    i19++;
                }
                iArr5[i18] = i19;
            }
        }
        if (c0508g.m1251h()) {
            c0508g.m1263t(64);
            if (c0508g.m1251h()) {
                c0508g.m1256m();
            }
            int iM1256m3 = c0508g.m1256m();
            int i21 = 0;
            while (i21 < iM1256m3) {
                c0508g.m1256m();
                if (i21 == 0 || c0508g.m1251h()) {
                    boolean zM1251h6 = c0508g.m1251h();
                    boolean zM1251h7 = c0508g.m1251h();
                    z5 = zM1251h6;
                    z4 = zM1251h7;
                    if (zM1251h6 || zM1251h7) {
                        zM1251h = c0508g.m1251h();
                        if (zM1251h) {
                            c0508g.m1263t(19);
                        }
                        c0508g.m1263t(8);
                        if (zM1251h) {
                            c0508g.m1263t(4);
                        }
                        c0508g.m1263t(15);
                        i10 = zM1251h6;
                        i9 = zM1251h7;
                    }
                    i11 = 0;
                    while (i11 <= iM1252i5) {
                        zM1251h2 = c0508g.m1251h();
                        if (!zM1251h2) {
                            zM1251h2 = c0508g.m1251h();
                        }
                        if (zM1251h2) {
                            c0508g.m1256m();
                            zM1251h3 = false;
                        } else {
                            zM1251h3 = c0508g.m1251h();
                        }
                        if (zM1251h3) {
                            iM1256m = 0;
                        } else {
                            iM1256m = c0508g.m1256m();
                        }
                        int[][] iArr7 = iArr4;
                        i12 = i10 + i9;
                        int[] iArr8 = iArr6;
                        i13 = 0;
                        while (i13 < i12) {
                            int i22 = i12;
                            for (i14 = 0; i14 <= iM1256m; i14++) {
                                c0508g.m1256m();
                                c0508g.m1256m();
                                if (zM1251h) {
                                    c0508g.m1256m();
                                    c0508g.m1256m();
                                }
                                c0508g.m1262s();
                            }
                            i13++;
                            i12 = i22;
                        }
                        i11++;
                        i21 = i21;
                        iArr4 = iArr7;
                        iArr6 = iArr8;
                    }
                    i21++;
                } else {
                    z5 = false;
                    z4 = false;
                }
                zM1251h = false;
                i10 = z5;
                i9 = z4;
                i11 = 0;
                while (i11 <= iM1252i5) {
                    zM1251h2 = c0508g.m1251h();
                    if (!zM1251h2) {
                        zM1251h2 = c0508g.m1251h();
                    }
                    if (zM1251h2) {
                        c0508g.m1256m();
                        zM1251h3 = false;
                    } else {
                        zM1251h3 = c0508g.m1251h();
                    }
                    if (zM1251h3) {
                        iM1256m = c0508g.m1256m();
                    } else {
                        iM1256m = 0;
                    }
                    int[][] iArr9 = iArr4;
                    i12 = i10 + i9;
                    int[] iArr10 = iArr6;
                    i13 = 0;
                    while (i13 < i12) {
                        int i23 = i12;
                        while (i14 <= iM1256m) {
                            c0508g.m1256m();
                            c0508g.m1256m();
                            if (zM1251h) {
                                c0508g.m1256m();
                                c0508g.m1256m();
                            }
                            c0508g.m1262s();
                        }
                        i13++;
                        i12 = i23;
                    }
                    i11++;
                    i21 = i21;
                    iArr4 = iArr9;
                    iArr6 = iArr10;
                }
                i21++;
            }
        }
        int[][] iArr11 = iArr4;
        int[] iArr12 = iArr6;
        if (!c0508g.m1251h()) {
            return new C0536b(null, c0677i2, null, null);
        }
        int i24 = c0508g.f1734e;
        if (i24 > 0) {
            c0508g.m1263t(8 - i24);
        }
        C0676h c0676hM1792e2 = m1792e(c0508g, false, iM1252i5, c0676hM1792e);
        boolean zM1251h8 = c0508g.m1251h();
        boolean[] zArr3 = new boolean[16];
        int i25 = 0;
        for (int i26 = 0; i26 < 16; i26++) {
            boolean zM1251h9 = c0508g.m1251h();
            zArr3[i26] = zM1251h9;
            if (zM1251h9) {
                i25++;
            }
        }
        if (i25 == 0 || !zArr3[1]) {
            return new C0536b(null, c0677i2, null, null);
        }
        int[] iArr13 = new int[i25];
        for (int i27 = 0; i27 < i25 - (zM1251h8 ? 1 : 0); i27++) {
            iArr13[i27] = c0508g.m1252i(3);
        }
        int[] iArr14 = new int[i25 + 1];
        if (zM1251h8) {
            int i28 = 1;
            while (i28 < i25) {
                int[] iArr15 = iArr14;
                for (int i29 = 0; i29 < i28; i29++) {
                    iArr15[i28] = iArr13[i29] + 1 + iArr15[i28];
                }
                i28++;
                iArr14 = iArr15;
            }
            iArr = iArr14;
            iArr[i25] = 6;
        } else {
            iArr = iArr14;
        }
        int[][] iArr16 = (int[][]) Array.newInstance((Class<?>) cls, i15, i25);
        int[] iArr17 = new int[i15];
        iArr17[0] = 0;
        boolean zM1251h10 = c0508g.m1251h();
        int i30 = 1;
        while (i30 < i15) {
            if (zM1251h10) {
                i8 = i30;
                iArr17[i8] = c0508g.m1252i(6);
            } else {
                i8 = i30;
                iArr17[i8] = i8;
            }
            if (zM1251h8) {
                int i31 = 0;
                while (i31 < i25) {
                    int i32 = i31 + 1;
                    iArr16[i8][i31] = (iArr17[i8] & ((1 << iArr[i32]) - 1)) >> iArr[i31];
                    i31 = i32;
                }
            } else {
                int i33 = 0;
                while (i33 < i25) {
                    int i34 = i33;
                    iArr16[i8][i34] = c0508g.m1252i(iArr13[i33] + 1);
                    i33 = i34 + 1;
                }
            }
            i30 = i8 + 1;
        }
        int[] iArr18 = new int[i17];
        int i35 = 1;
        int i36 = 0;
        while (i36 < i15) {
            iArr18[iArr17[i36]] = -1;
            int[] iArr19 = iArr18;
            int i37 = 0;
            for (int i38 = 0; i38 < 16; i38++) {
                if (zArr3[i38]) {
                    if (i38 == 1) {
                        iArr19[iArr17[i36]] = iArr16[i36][i37];
                    }
                    i37++;
                }
            }
            if (i36 > 0) {
                int i39 = 0;
                while (true) {
                    if (i39 >= i36) {
                        z3 = true;
                        break;
                    }
                    int i40 = i39;
                    if (iArr19[iArr17[i36]] == iArr19[iArr17[i39]]) {
                        z3 = false;
                        break;
                    }
                    i39 = i40 + 1;
                }
                if (z3) {
                    i35++;
                }
            }
            i36++;
            iArr18 = iArr19;
        }
        int[] iArr20 = iArr18;
        int iM1252i7 = c0508g.m1252i(4);
        if (i35 < 2 || iM1252i7 == 0) {
            return new C0536b(null, c0677i2, null, null);
        }
        int[] iArr21 = new int[i35];
        for (int i41 = 0; i41 < i35; i41++) {
            iArr21[i41] = c0508g.m1252i(iM1252i7);
        }
        int[] iArr22 = new int[i17];
        int i42 = 0;
        while (i42 < i15) {
            iArr22[Math.min(iArr17[i42], iM1252i6)] = i42;
            i42++;
            iArr21 = iArr21;
        }
        int[] iArr23 = iArr21;
        C1673D c1673dM4116m = AbstractC1676G.m4116m();
        int i43 = 0;
        while (i43 <= iM1252i6) {
            int i44 = i35;
            int[] iArr24 = iArr17;
            int iMin = Math.min(iArr20[i43], i44 - 1);
            int[] iArr25 = iArr22;
            c1673dM4116m.m4102a(new C0675g(iArr25[i43], iMin >= 0 ? iArr23[iMin] : -1));
            i43++;
            i35 = i44;
            iArr22 = iArr25;
            iArr17 = iArr24;
        }
        int[] iArr26 = iArr17;
        C1692X c1692xM4112f = c1673dM4116m.m4112f();
        if (((C0675g) c1692xM4112f.get(0)).f2580b == -1) {
            return new C0536b(null, c0677i2, null, null);
        }
        int i45 = 1;
        while (true) {
            if (i45 > iM1252i6) {
                i45 = -1;
                break;
            }
            if (((C0675g) c1692xM4112f.get(i45)).f2580b != -1) {
                break;
            }
            i45++;
        }
        if (i45 == -1) {
            return new C0536b(null, c0677i2, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i15, i15);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i15, i15);
        int i46 = 1;
        while (i46 < i15) {
            boolean[][] zArr6 = zArr5;
            for (int i47 = 0; i47 < i46; i47++) {
                boolean[] zArr7 = zArr4[i46];
                boolean[] zArr8 = zArr6[i46];
                boolean zM1251h11 = c0508g.m1251h();
                zArr8[i47] = zM1251h11;
                zArr7[i47] = zM1251h11;
            }
            i46++;
            zArr5 = zArr6;
        }
        boolean[][] zArr9 = zArr5;
        for (int i48 = 1; i48 < i15; i48++) {
            int i49 = 0;
            while (i49 < iM1252i4) {
                boolean[][] zArr10 = zArr4;
                for (int i50 = 0; i50 < i48; i50++) {
                    boolean[] zArr11 = zArr9[i48];
                    if (zArr11[i50] && zArr9[i50][i49]) {
                        zArr11[i49] = true;
                        break;
                    }
                }
                i49++;
                zArr4 = zArr10;
            }
        }
        boolean[][] zArr12 = zArr4;
        int[] iArr27 = new int[i17];
        for (int i51 = 0; i51 < i15; i51++) {
            int i52 = 0;
            for (int i53 = 0; i53 < i51; i53++) {
                i52 += zArr12[i51][i53] ? 1 : 0;
            }
            iArr27[iArr26[i51]] = i52;
        }
        int i54 = 0;
        for (int i55 = 0; i55 < i15; i55++) {
            if (iArr27[iArr26[i55]] == 0) {
                i54++;
            }
        }
        if (i54 > 1) {
            return new C0536b(null, c0677i2, null, null);
        }
        int[] iArr28 = new int[i15];
        int[] iArr29 = new int[iM1256m2];
        if (c0508g.m1251h()) {
            int i56 = 0;
            while (i56 < i15) {
                int i57 = i56;
                iArr28[i57] = c0508g.m1252i(3);
                i56 = i57 + 1;
            }
        } else {
            Arrays.fill(iArr28, 0, i15, iM1252i5);
        }
        int i58 = 0;
        while (i58 < iM1256m2) {
            int i59 = i58;
            int[] iArr30 = iArr28;
            int[] iArr31 = iArr29;
            int iMax = 0;
            for (int i60 = 0; i60 < iArr5[i59]; i60++) {
                iMax = Math.max(iMax, iArr30[((C0675g) c1692xM4112f.get(iArr11[i59][i60])).f2579a]);
            }
            iArr31[i59] = iMax + 1;
            i58 = i59 + 1;
            iArr28 = iArr30;
            iArr29 = iArr31;
        }
        int[] iArr32 = iArr29;
        if (c0508g.m1251h()) {
            int i61 = 0;
            while (i61 < iM1252i4) {
                int i62 = i61 + 1;
                int i63 = i62;
                while (i63 < i15) {
                    if (zArr12[i63][i61]) {
                        c0508g.m1263t(3);
                    }
                    i63++;
                    iM1252i4 = iM1252i4;
                }
                i61 = i62;
            }
        }
        c0508g.m1262s();
        int iM1256m4 = c0508g.m1256m() + 1;
        C1673D c1673dM4116m2 = AbstractC1676G.m4116m();
        c1673dM4116m2.m4102a(c0676hM1792e);
        if (iM1256m4 > 1) {
            c1673dM4116m2.m4102a(c0676hM1792e2);
            for (int i64 = 2; i64 < iM1256m4; i64++) {
                c0676hM1792e2 = m1792e(c0508g, c0508g.m1251h(), iM1252i5, c0676hM1792e2);
                c1673dM4116m2.m4102a(c0676hM1792e2);
            }
        }
        C1692X c1692xM4112f2 = c1673dM4116m2.m4112f();
        int iM1256m5 = c0508g.m1256m() + iM1256m2;
        if (iM1256m5 > iM1256m2) {
            return new C0536b(null, c0677i2, null, null);
        }
        int iM1252i8 = c0508g.m1252i(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iM1256m5, i17);
        int[] iArr33 = new int[iM1256m5];
        int i65 = 0;
        int[] iArr34 = new int[iM1256m5];
        int i66 = 0;
        while (i66 < iM1256m2) {
            iArr33[i66] = i65;
            iArr34[i66] = iArr12[i66];
            if (iM1252i8 == 0) {
                i7 = i66;
                zArr2 = zArr13;
                iArr2 = iArr33;
                iArr3 = iArr5;
                Arrays.fill(zArr13[i7], 0, iArr5[i7], true);
                iArr2[i7] = iArr3[i7];
            } else {
                i7 = i66;
                zArr2 = zArr13;
                iArr2 = iArr33;
                iArr3 = iArr5;
                if (iM1252i8 == 1) {
                    int i67 = iArr12[i7];
                    for (int i68 = 0; i68 < iArr3[i7]; i68++) {
                        zArr2[i7][i68] = iArr11[i7][i68] == i67;
                    }
                    iArr2[i7] = 1;
                } else {
                    i65 = 0;
                    zArr2[0][0] = true;
                    iArr2[0] = 1;
                }
                i66 = i7 + 1;
                zArr13 = zArr2;
                iArr33 = iArr2;
                iArr5 = iArr3;
            }
            i65 = 0;
            i66 = i7 + 1;
            zArr13 = zArr2;
            iArr33 = iArr2;
            iArr5 = iArr3;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr35 = iArr33;
        int[] iArr36 = iArr5;
        int[] iArr37 = new int[i17];
        int i69 = 2;
        int[] iArr38 = new int[2];
        iArr38[1] = i17;
        iArr38[i65] = iM1256m5;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr38);
        int i70 = 1;
        int i71 = 0;
        while (i70 < iM1256m5) {
            if (iM1252i8 == i69) {
                for (int i72 = 0; i72 < iArr36[i70]; i72++) {
                    zArr14[i70][i72] = c0508g.m1251h();
                    int i73 = iArr35[i70];
                    boolean z9 = zArr14[i70][i72];
                    iArr35[i70] = i73 + (z9 ? 1 : 0);
                    if (z9) {
                        iArr34[i70] = iArr11[i70][i72];
                    }
                }
            }
            if (i71 == 0 && iArr11[i70][0] == 0 && zArr14[i70][0]) {
                for (int i74 = 1; i74 < iArr36[i70]; i74++) {
                    if (iArr11[i70][i74] == i45 && zArr14[i70][i45]) {
                        i71 = i70;
                    }
                }
            }
            int i75 = 0;
            while (i75 < iArr36[i70]) {
                if (iM1256m4 > 1) {
                    zArr15[i70][i75] = zArr14[i70][i75];
                    c1692x = c1692xM4112f2;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int iM4281c = AbstractC1789b.m4281c(iM1256m4);
                    if (zArr[i70][i75]) {
                        i5 = iM1256m4;
                    } else {
                        C0675g c0675g = (C0675g) c1692xM4112f.get(iArr11[i70][i75]);
                        i5 = iM1256m4;
                        int i76 = 0;
                        while (true) {
                            if (i76 < i75) {
                                int i77 = i76;
                                i6 = i45;
                                if (zArr9[c0675g.f2579a][((C0675g) c1692xM4112f.get(iArr11[i70][i77])).f2579a]) {
                                    zArr[i70][i75] = true;
                                    break;
                                }
                                i76 = i77 + 1;
                                i45 = i6;
                            }
                        }
                        if (!zArr[i70][i75]) {
                            if (i71 > 0 || i70 != i71) {
                                c0508g.m1263t(iM4281c);
                            } else {
                                iArr37[i75] = c0508g.m1252i(iM4281c);
                            }
                        }
                    }
                    i6 = i45;
                    if (!zArr[i70][i75]) {
                        if (i71 > 0) {
                            c0508g.m1263t(iM4281c);
                        } else {
                            c0508g.m1263t(iM4281c);
                        }
                    }
                } else {
                    c1692x = c1692xM4112f2;
                    zArr = zArr15;
                    i5 = iM1256m4;
                    i6 = i45;
                }
                i75++;
                c1692xM4112f2 = c1692x;
                zArr15 = zArr;
                iM1256m4 = i5;
                i45 = i6;
            }
            C1692X c1692x2 = c1692xM4112f2;
            boolean[][] zArr16 = zArr15;
            int i78 = iM1256m4;
            int i79 = i45;
            if (iArr35[i70] == 1 && iArr27[iArr34[i70]] > 0) {
                c0508g.m1262s();
            }
            i70++;
            c1692xM4112f2 = c1692x2;
            zArr15 = zArr16;
            iM1256m4 = i78;
            i45 = i79;
            i69 = 2;
        }
        C1692X c1692x3 = c1692xM4112f2;
        boolean[][] zArr17 = zArr15;
        if (i71 == 0) {
            return new C0536b(null, c0677i2, null, null);
        }
        int iM1256m6 = c0508g.m1256m();
        int i80 = iM1256m6 + 1;
        AbstractC1723q.m4153b(i80, "expectedSize");
        AbstractC1723q.m4153b(i80, "initialCapacity");
        int[] iArr39 = new int[i15];
        Object[] objArrCopyOf = new Object[i80];
        int i81 = 0;
        int i82 = 0;
        boolean z10 = false;
        while (i81 < i80) {
            int i83 = i81;
            int iM1252i9 = c0508g.m1252i(16);
            int iM1252i10 = c0508g.m1252i(16);
            boolean z11 = z10;
            if (c0508g.m1251h()) {
                iM1252i = c0508g.m1252i(2);
                if (iM1252i == 3) {
                    c0508g.m1262s();
                }
                iM1252i2 = c0508g.m1252i(4);
                iM1252i3 = c0508g.m1252i(4);
            } else {
                iM1252i = 0;
                iM1252i2 = 0;
                iM1252i3 = 0;
            }
            if (c0508g.m1251h()) {
                int iM1256m7 = c0508g.m1256m();
                int iM1256m8 = c0508g.m1256m();
                int iM1256m9 = c0508g.m1256m();
                int iM1256m10 = c0508g.m1256m();
                iM1252i9 -= (iM1256m7 + iM1256m8) * ((iM1252i == 1 || iM1252i == 2) ? 2 : 1);
                iM1252i10 -= (iM1256m9 + iM1256m10) * (iM1252i == 1 ? 2 : 1);
            }
            C0678j c0678j = new C0678j(iM1252i, iM1252i2, iM1252i3, iM1252i9, iM1252i10);
            int iM4101e = AbstractC1670A.m4101e(objArrCopyOf.length, i82 + 1);
            if (iM4101e > objArrCopyOf.length || z11) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iM4101e);
                z10 = false;
            } else {
                z10 = z11;
            }
            objArrCopyOf[i82] = c0678j;
            i82++;
            i81 = i83 + 1;
        }
        if (i80 <= 1 || !c0508g.m1251h()) {
            for (int i84 = 1; i84 < i15; i84++) {
                iArr39[i84] = Math.min(i84, iM1256m6);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int iM4281c2 = AbstractC1789b.m4281c(i80);
            for (int i85 = 1; i85 < i15; i85++) {
                iArr39[i85] = c0508g.m1252i(iM4281c2);
            }
        }
        C0677i c0677i3 = new C0677i(AbstractC1676G.m4115l(i82, objArrCopyOf), iArr39, 1);
        c0508g.m1263t(2);
        for (int i86 = 1; i86 < i15; i86++) {
            if (iArr27[iArr26[i86]] == 0) {
                c0508g.m1262s();
            }
        }
        for (int i87 = 1; i87 < iM1256m5; i87++) {
            boolean zM1251h12 = c0508g.m1251h();
            int i88 = 0;
            while (i88 < iArr32[i87]) {
                if ((i88 <= 0 || !zM1251h12) ? i88 == 0 : c0508g.m1251h()) {
                    for (int i89 = 0; i89 < iArr36[i87]; i89++) {
                        if (zArr17[i87][i89]) {
                            c0508g.m1256m();
                        }
                    }
                    c0508g.m1256m();
                    c0508g.m1256m();
                }
                i88++;
            }
        }
        int iM1256m11 = c0508g.m1256m() + 2;
        if (c0508g.m1251h()) {
            c0508g.m1263t(iM1256m11);
        } else {
            for (int i90 = 1; i90 < i15; i90++) {
                for (int i91 = 0; i91 < i90; i91++) {
                    if (zArr12[i90][i91]) {
                        c0508g.m1263t(iM1256m11);
                    }
                }
            }
        }
        int iM1256m12 = c0508g.m1256m();
        for (int i92 = 1; i92 <= iM1256m12; i92++) {
            c0508g.m1263t(8);
        }
        if (c0508g.m1251h()) {
            int i93 = c0508g.f1734e;
            if (i93 > 0) {
                c0508g.m1263t(8 - i93);
            }
            if (!c0508g.m1251h() ? c0508g.m1251h() : true) {
                c0508g.m1262s();
            }
            boolean zM1251h13 = c0508g.m1251h();
            boolean zM1251h14 = c0508g.m1251h();
            if (zM1251h13 || zM1251h14) {
                for (int i94 = 0; i94 < iM1256m2; i94++) {
                    for (int i95 = 0; i95 < iArr32[i94]; i95++) {
                        boolean zM1251h15 = zM1251h13 ? c0508g.m1251h() : false;
                        boolean zM1251h16 = zM1251h14 ? c0508g.m1251h() : false;
                        if (zM1251h15) {
                            c0508g.m1263t(32);
                        }
                        if (zM1251h16) {
                            c0508g.m1263t(18);
                        }
                    }
                }
            }
            boolean zM1251h17 = c0508g.m1251h();
            int iM1252i11 = zM1251h17 ? c0508g.m1252i(4) + 1 : i15;
            AbstractC1723q.m4153b(iM1252i11, "expectedSize");
            AbstractC1723q.m4153b(iM1252i11, "initialCapacity");
            int[] iArr40 = new int[i15];
            Object[] objArrCopyOf2 = new Object[iM1252i11];
            int i96 = 0;
            int i97 = 0;
            boolean z12 = false;
            while (i96 < iM1252i11) {
                c0508g.m1263t(3);
                int i98 = c0508g.m1251h() ? 1 : 2;
                int iM1439f = C0573f.m1439f(c0508g.m1252i(8));
                boolean z13 = zM1251h17;
                int iM1440g = C0573f.m1440g(c0508g.m1252i(8));
                c0508g.m1263t(8);
                C0681m c0681m = new C0681m(iM1439f, i98, iM1440g);
                int iM4101e2 = AbstractC1670A.m4101e(objArrCopyOf2.length, i97 + 1);
                if (iM4101e2 > objArrCopyOf2.length || z12) {
                    objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, iM4101e2);
                    z12 = false;
                }
                objArrCopyOf2[i97] = c0681m;
                i96++;
                i97++;
                zM1251h17 = z13;
            }
            if (zM1251h17 && iM1252i11 > 1) {
                for (int i99 = 0; i99 < i15; i99++) {
                    iArr40[i99] = c0508g.m1252i(4);
                }
            }
            c0677i = new C0677i(AbstractC1676G.m4115l(i97, objArrCopyOf2), iArr40, 2);
        } else {
            c0677i = null;
        }
        return new C0536b(c1692xM4112f, new C0677i(c1692x3, iArr37, 0), c0677i3, c0677i);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x020c  */
    /* JADX WARN: Code duplicated, block: B:124:0x0218  */
    /* JADX WARN: Code duplicated, block: B:127:0x0223  */
    /* JADX WARN: Code duplicated, block: B:130:0x022c  */
    /* JADX WARN: Code duplicated, block: B:133:0x0233  */
    /* JADX WARN: Code duplicated, block: B:136:0x023f  */
    /* JADX INFO: renamed from: i */
    public static C0683o m1796i(byte[] bArr, int i3, int i4) {
        int iM1256m;
        boolean zM1251h;
        int i5;
        int i6;
        int i7;
        int iM1256m2;
        boolean z3;
        int i8;
        float f;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean zM1251h2;
        boolean zM1251h3;
        C0508g c0508g = new C0508g(bArr, i3 + 1, i4);
        int iM1252i = c0508g.m1252i(8);
        int iM1252i2 = c0508g.m1252i(8);
        int iM1252i3 = c0508g.m1252i(8);
        int iM1256m3 = c0508g.m1256m();
        if (iM1252i == 100 || iM1252i == 110 || iM1252i == 122 || iM1252i == 244 || iM1252i == 44 || iM1252i == 83 || iM1252i == 86 || iM1252i == 118 || iM1252i == 128 || iM1252i == 138) {
            iM1256m = c0508g.m1256m();
            zM1251h = iM1256m == 3 ? c0508g.m1251h() : false;
            int iM1256m4 = c0508g.m1256m();
            int iM1256m5 = c0508g.m1256m();
            c0508g.m1262s();
            if (c0508g.m1251h()) {
                int i14 = iM1256m != 3 ? 8 : 12;
                int i15 = 0;
                while (i15 < i14) {
                    if (c0508g.m1251h()) {
                        int i16 = i15 < 6 ? 16 : 64;
                        int iM1257n = 8;
                        int i17 = 8;
                        for (int i18 = 0; i18 < i16; i18++) {
                            if (iM1257n != 0) {
                                iM1257n = ((c0508g.m1257n() + i17) + 256) % 256;
                            }
                            if (iM1257n != 0) {
                                i17 = iM1257n;
                            }
                        }
                    }
                    i15++;
                }
            }
            i5 = iM1256m4;
            i6 = iM1256m5;
        } else {
            i5 = 0;
            i6 = 0;
            iM1256m = 1;
            zM1251h = false;
        }
        int iM1256m6 = c0508g.m1256m() + 4;
        int iM1256m7 = c0508g.m1256m();
        if (iM1256m7 == 0) {
            iM1256m2 = c0508g.m1256m() + 4;
            z3 = false;
            i7 = 1;
        } else if (iM1256m7 == 1) {
            boolean zM1251h4 = c0508g.m1251h();
            c0508g.m1257n();
            c0508g.m1257n();
            long jM1256m = c0508g.m1256m();
            i7 = 1;
            for (int i19 = 0; i19 < jM1256m; i19++) {
                c0508g.m1256m();
            }
            z3 = zM1251h4;
            iM1256m2 = 0;
        } else {
            i7 = 1;
            iM1256m2 = 0;
            z3 = false;
        }
        c0508g.m1256m();
        c0508g.m1262s();
        int iM1256m8 = c0508g.m1256m() + 1;
        int iM1256m9 = c0508g.m1256m() + 1;
        boolean zM1251h5 = c0508g.m1251h();
        int i20 = 2 - (zM1251h5 ? 1 : 0);
        int i21 = iM1256m9 * i20;
        if (!zM1251h5) {
            c0508g.m1262s();
        }
        c0508g.m1262s();
        int i22 = iM1256m8 * 16;
        int i23 = i21 * 16;
        if (c0508g.m1251h()) {
            int iM1256m10 = c0508g.m1256m();
            int iM1256m11 = c0508g.m1256m();
            int iM1256m12 = c0508g.m1256m();
            int iM1256m13 = c0508g.m1256m();
            if (iM1256m != 0) {
                if (iM1256m != 3) {
                    i7 = 2;
                }
                i20 *= iM1256m == 1 ? 2 : 1;
            }
            i22 -= (iM1256m10 + iM1256m11) * i7;
            i23 -= (iM1256m12 + iM1256m13) * i20;
        }
        int i24 = i23;
        int i25 = i22;
        int iM1256m14 = ((iM1252i == 44 || iM1252i == 86 || iM1252i == 100 || iM1252i == 110 || iM1252i == 122 || iM1252i == 244) && (iM1252i2 & 16) != 0) ? 0 : 16;
        int i26 = -1;
        float f3 = 1.0f;
        if (c0508g.m1251h()) {
            if (c0508g.m1251h()) {
                int iM1252i4 = c0508g.m1252i(8);
                if (iM1252i4 == 255) {
                    int iM1252i5 = c0508g.m1252i(16);
                    int iM1252i6 = c0508g.m1252i(16);
                    if (iM1252i5 != 0 && iM1252i6 != 0) {
                        f3 = iM1252i5 / iM1252i6;
                    }
                } else if (iM1252i4 < 17) {
                    f3 = f2630b[iM1252i4];
                } else {
                    AbstractC0462h.m1170j("Unexpected aspect_ratio_idc value: ", "NalUnitUtil", iM1252i4);
                }
            }
            if (c0508g.m1251h()) {
                c0508g.m1262s();
            }
            if (c0508g.m1251h()) {
                c0508g.m1263t(3);
                i12 = c0508g.m1251h() ? 1 : 2;
                if (c0508g.m1251h()) {
                    int iM1252i7 = c0508g.m1252i(8);
                    int iM1252i8 = c0508g.m1252i(8);
                    c0508g.m1263t(8);
                    int iM1439f = C0573f.m1439f(iM1252i7);
                    int iM1440g = C0573f.m1440g(iM1252i8);
                    i26 = iM1439f;
                    i13 = iM1440g;
                }
                if (c0508g.m1251h()) {
                    c0508g.m1256m();
                    c0508g.m1256m();
                }
                if (c0508g.m1251h()) {
                    c0508g.m1263t(65);
                }
                zM1251h2 = c0508g.m1251h();
                if (zM1251h2) {
                    m1797j(c0508g);
                }
                zM1251h3 = c0508g.m1251h();
                if (zM1251h3) {
                    m1797j(c0508g);
                }
                if (zM1251h2 || zM1251h3) {
                    c0508g.m1262s();
                }
                c0508g.m1262s();
                if (c0508g.m1251h()) {
                    c0508g.m1262s();
                    c0508g.m1256m();
                    c0508g.m1256m();
                    c0508g.m1256m();
                    c0508g.m1256m();
                    iM1256m14 = c0508g.m1256m();
                    c0508g.m1256m();
                }
                f = f3;
                i9 = i26;
                i10 = i12;
                i11 = i13;
                i8 = iM1256m14;
            } else {
                i12 = -1;
            }
            i13 = -1;
            if (c0508g.m1251h()) {
                c0508g.m1256m();
                c0508g.m1256m();
            }
            if (c0508g.m1251h()) {
                c0508g.m1263t(65);
            }
            zM1251h2 = c0508g.m1251h();
            if (zM1251h2) {
                m1797j(c0508g);
            }
            zM1251h3 = c0508g.m1251h();
            if (zM1251h3) {
                m1797j(c0508g);
            }
            if (zM1251h2) {
                c0508g.m1262s();
            } else {
                c0508g.m1262s();
            }
            c0508g.m1262s();
            if (c0508g.m1251h()) {
                c0508g.m1262s();
                c0508g.m1256m();
                c0508g.m1256m();
                c0508g.m1256m();
                c0508g.m1256m();
                iM1256m14 = c0508g.m1256m();
                c0508g.m1256m();
            }
            f = f3;
            i9 = i26;
            i10 = i12;
            i11 = i13;
            i8 = iM1256m14;
        } else {
            i8 = iM1256m14;
            f = 1.0f;
            i9 = -1;
            i10 = -1;
            i11 = -1;
        }
        return new C0683o(iM1252i, iM1252i2, iM1252i3, iM1256m3, i25, i24, f, i5, i6, zM1251h, zM1251h5 ? 1 : 0, iM1256m6, iM1256m7, iM1256m2, z3, i9, i10, i11, i8);
    }

    /* JADX INFO: renamed from: j */
    public static void m1797j(C0508g c0508g) {
        int iM1256m = c0508g.m1256m() + 1;
        c0508g.m1263t(8);
        for (int i3 = 0; i3 < iM1256m; i3++) {
            c0508g.m1256m();
            c0508g.m1256m();
            c0508g.m1262s();
        }
        c0508g.m1263t(20);
    }

    /* JADX INFO: renamed from: k */
    public static int m1798k(byte[] bArr, int i3) {
        int i4;
        synchronized (f2631c) {
            int i5 = 0;
            int i6 = 0;
            while (i5 < i3) {
                while (true) {
                    if (i5 >= i3 - 2) {
                        i5 = i3;
                        break;
                    }
                    try {
                        if (bArr[i5] == 0 && bArr[i5 + 1] == 0 && bArr[i5 + 2] == 3) {
                            break;
                        }
                        i5++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i5 < i3) {
                    int[] iArr = f2632d;
                    if (iArr.length <= i6) {
                        f2632d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f2632d[i6] = i5;
                    i5 += 3;
                    i6++;
                }
            }
            i4 = i3 - i6;
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < i6; i9++) {
                int i10 = f2632d[i9] - i8;
                System.arraycopy(bArr, i8, bArr, i7, i10);
                int i11 = i7 + i10;
                int i12 = i11 + 1;
                bArr[i11] = 0;
                i7 = i11 + 2;
                bArr[i12] = 0;
                i8 += i10 + 3;
            }
            System.arraycopy(bArr, i8, bArr, i7, i4 - i7);
        }
        return i4;
    }
}

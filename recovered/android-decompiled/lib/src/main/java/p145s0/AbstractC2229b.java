package p145s0;

import android.util.Base64;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.cast.C1323r;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p012E0.C0116a;
import p027J0.C0294a;
import p028J1.C0311q;
import p045P0.AbstractC0462h;
import p048Q0.C0508g;
import p055T.C0544G;
import p055T.C0546I;
import p055T.C0576h;
import p055T.C0587s;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p085c0.C1134j;

/* JADX INFO: renamed from: s0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2229b {

    /* JADX INFO: renamed from: a */
    public static final int[] f9565a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b */
    public static final int[] f9566b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: c */
    public static final int[] f9567c = {1, 2, 3, 6};

    /* JADX INFO: renamed from: d */
    public static final int[] f9568d = {48000, 44100, 32000};

    /* JADX INFO: renamed from: e */
    public static final int[] f9569e = {24000, 22050, 16000};

    /* JADX INFO: renamed from: f */
    public static final int[] f9570f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: g */
    public static final int[] f9571g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: h */
    public static final int[] f9572h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: i */
    public static final int[] f9573i = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX INFO: renamed from: j */
    public static final int[] f9574j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: k */
    public static final int[] f9575k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: l */
    public static final int[] f9576l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: m */
    public static final int[] f9577m = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: n */
    public static final int[] f9578n = {5, 8, 10, 12};

    /* JADX INFO: renamed from: o */
    public static final int[] f9579o = {6, 9, 12, 15};

    /* JADX INFO: renamed from: p */
    public static final int[] f9580p = {2, 4, 6, 8};

    /* JADX INFO: renamed from: q */
    public static final int[] f9581q = {9, 11, 13, 16};

    /* JADX INFO: renamed from: r */
    public static final int[] f9582r = {5, 8, 10, 12};

    /* JADX INFO: renamed from: s */
    public static final String[] f9583s = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: t */
    public static final int[] f9584t = {44100, 48000, 32000};

    /* JADX INFO: renamed from: u */
    public static final int[] f9585u = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: v */
    public static final int[] f9586v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: w */
    public static final int[] f9587w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: x */
    public static final int[] f9588x = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: y */
    public static final int[] f9589y = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: renamed from: a */
    public static ArrayList m4806a(byte[] bArr) {
        long j3 = (((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j3).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b7 A[LOOP:0: B:53:0x00b5->B:54:0x00b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x00c4 A[RETURN] */
    /* JADX INFO: renamed from: b */
    public static boolean m4807b(C0651s c0651s, C2245r c2245r, int i3, C0587s c0587s) {
        int iM1687u;
        byte[] bArr;
        int i4;
        int i5;
        int i6;
        int i7 = c0651s.f2521b;
        long jM1689w = c0651s.m1689w();
        long j3 = jM1689w >>> 16;
        if (j3 == i3) {
            boolean z3 = (j3 & 1) == 1;
            int i8 = (int) ((jM1689w >> 12) & 15);
            int i9 = (int) ((jM1689w >> 8) & 15);
            int i10 = (int) ((jM1689w >> 4) & 15);
            int i11 = (int) ((jM1689w >> 1) & 7);
            boolean z4 = (jM1689w & 1) == 1;
            if (i10 > 7 ? !(i10 > 10 || c2245r.f9651g != 2) : i10 == c2245r.f9651g - 1) {
                if ((i11 == 0 || i11 == c2245r.f9653i) && !z4) {
                    try {
                        long jM1660B = c0651s.m1660B();
                        if (!z3) {
                            jM1660B *= (long) c2245r.f9646b;
                        }
                        c0587s.f2181a = jM1660B;
                        int iM4824s = m4824s(i8, c0651s);
                        if (iM4824s != -1 && iM4824s <= c2245r.f9646b) {
                            if (i9 == 0) {
                                iM1687u = c0651s.m1687u();
                                int i12 = c0651s.f2521b;
                                bArr = c0651s.f2520a;
                                i4 = i12 - 1;
                                int i13 = AbstractC0632A.f2454a;
                                i6 = 0;
                                for (i5 = i7; i5 < i4; i5++) {
                                    i6 = AbstractC0632A.f2467n[i6 ^ (bArr[i5] & 255)];
                                }
                                if (iM1687u == i6) {
                                    return true;
                                }
                            } else if (i9 > 11) {
                                int i14 = c2245r.f9649e;
                                if (i9 == 12) {
                                    if (c0651s.m1687u() * 1000 == i14) {
                                        iM1687u = c0651s.m1687u();
                                        int i15 = c0651s.f2521b;
                                        bArr = c0651s.f2520a;
                                        i4 = i15 - 1;
                                        int i16 = AbstractC0632A.f2454a;
                                        i6 = 0;
                                        while (i5 < i4) {
                                            i6 = AbstractC0632A.f2467n[i6 ^ (bArr[i5] & 255)];
                                        }
                                        if (iM1687u == i6) {
                                            return true;
                                        }
                                    }
                                } else if (i9 <= 14) {
                                    int iM1659A = c0651s.m1659A();
                                    if (i9 == 14) {
                                        iM1659A *= 10;
                                    }
                                    if (iM1659A == i14) {
                                        iM1687u = c0651s.m1687u();
                                        int i17 = c0651s.f2521b;
                                        bArr = c0651s.f2520a;
                                        i4 = i17 - 1;
                                        int i18 = AbstractC0632A.f2454a;
                                        i6 = 0;
                                        while (i5 < i4) {
                                            i6 = AbstractC0632A.f2467n[i6 ^ (bArr[i5] & 255)];
                                        }
                                        if (iM1687u == i6) {
                                            return true;
                                        }
                                    }
                                }
                            } else if (i9 == c2245r.f9650f) {
                                iM1687u = c0651s.m1687u();
                                int i19 = c0651s.f2521b;
                                bArr = c0651s.f2520a;
                                i4 = i19 - 1;
                                int i110 = AbstractC0632A.f2454a;
                                i6 = 0;
                                while (i5 < i4) {
                                    i6 = AbstractC0632A.f2467n[i6 ^ (bArr[i5] & 255)];
                                }
                                if (iM1687u == i6) {
                                    return true;
                                }
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static void m4808c(String str, boolean z3) throws C0546I {
        if (!z3) {
            throw C0546I.m1365a(null, str);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m4809d(long j3, C0651s c0651s, InterfaceC2226E[] interfaceC2226EArr) {
        int i3;
        int iM1687u;
        while (true) {
            if (c0651s.m1667a() <= 1) {
                return;
            }
            int i4 = 0;
            while (true) {
                if (c0651s.m1667a() == 0) {
                    i3 = -1;
                    break;
                }
                int iM1687u2 = c0651s.m1687u();
                i4 += iM1687u2;
                if (iM1687u2 != 255) {
                    i3 = i4;
                    break;
                }
            }
            int i5 = 0;
            do {
                if (c0651s.m1667a() == 0) {
                    i5 = -1;
                    break;
                } else {
                    iM1687u = c0651s.m1687u();
                    i5 += iM1687u;
                }
            } while (iM1687u == 255);
            int i6 = c0651s.f2521b + i5;
            if (i5 == -1 || i5 > c0651s.m1667a()) {
                AbstractC0646n.m1647y("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i6 = c0651s.f2522c;
            } else if (i3 == 4 && i5 >= 8) {
                int iM1687u3 = c0651s.m1687u();
                int iM1659A = c0651s.m1659A();
                int iM1673g = iM1659A == 49 ? c0651s.m1673g() : 0;
                int iM1687u4 = c0651s.m1687u();
                if (iM1659A == 47) {
                    c0651s.m1666H(1);
                }
                boolean z3 = iM1687u3 == 181 && (iM1659A == 49 || iM1659A == 47) && iM1687u4 == 3;
                if (iM1659A == 49) {
                    z3 &= iM1673g == 1195456820;
                }
                if (z3) {
                    m4810e(j3, c0651s, interfaceC2226EArr);
                }
            }
            c0651s.m1665G(i6);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m4810e(long j3, C0651s c0651s, InterfaceC2226E[] interfaceC2226EArr) {
        int iM1687u = c0651s.m1687u();
        if ((iM1687u & 64) != 0) {
            c0651s.m1666H(1);
            int i3 = (iM1687u & 31) * 3;
            int i4 = c0651s.f2521b;
            for (InterfaceC2226E interfaceC2226E : interfaceC2226EArr) {
                c0651s.m1665G(i4);
                interfaceC2226E.mo1173b(i3, c0651s);
                AbstractC0646n.m1630h(j3 != -9223372036854775807L);
                interfaceC2226E.mo1172a(j3, 1, i3, 0, null);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m4811f(int i3, int i4) {
        int i5 = i4 / 2;
        if (i3 < 0 || i3 >= 3 || i4 < 0 || i5 >= 19) {
            return -1;
        }
        int i6 = f9568d[i3];
        if (i6 == 44100) {
            return ((i4 % 2) + f9572h[i5]) * 2;
        }
        int i7 = f9571g[i5];
        return i6 == 32000 ? i7 * 6 : i7 * 4;
    }

    /* JADX INFO: renamed from: g */
    public static void m4812g(int i3, C0651s c0651s) {
        c0651s.m1662D(7);
        byte[] bArr = c0651s.f2520a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i3 >> 16) & 255);
        bArr[5] = (byte) ((i3 >> 8) & 255);
        bArr[6] = (byte) (i3 & 255);
    }

    /* JADX INFO: renamed from: h */
    public static int m4813h(int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (!((i3 & (-2097152)) == -2097152) || (i4 = (i3 >>> 19) & 3) == 1 || (i5 = (i3 >>> 17) & 3) == 0 || (i6 = (i3 >>> 12) & 15) == 0 || i6 == 15 || (i7 = (i3 >>> 10) & 3) == 3) {
            return -1;
        }
        int i9 = f9584t[i7];
        if (i4 == 2) {
            i9 /= 2;
        } else if (i4 == 0) {
            i9 /= 4;
        }
        int i10 = (i3 >>> 9) & 1;
        if (i5 == 3) {
            return ((((i4 == 3 ? f9585u[i6 - 1] : f9586v[i6 - 1]) * 12) / i9) + i10) * 4;
        }
        if (i4 == 3) {
            i8 = i5 == 2 ? f9587w[i6 - 1] : f9588x[i6 - 1];
        } else {
            i8 = f9589y[i6 - 1];
        }
        if (i4 == 3) {
            return ((i8 * 144) / i9) + i10;
        }
        return (((i5 == 1 ? 72 : 144) * i8) / i9) + i10;
    }

    /* JADX INFO: renamed from: i */
    public static C0508g m4814i(byte[] bArr) {
        byte b3 = bArr[0];
        if (b3 == 127 || b3 == 100 || b3 == 64 || b3 == 113) {
            return new C0508g(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b4 = bArrCopyOf[0];
        if (b4 == -2 || b4 == -1 || b4 == 37 || b4 == -14 || b4 == -24) {
            for (int i3 = 0; i3 < bArrCopyOf.length - 1; i3 += 2) {
                byte b5 = bArrCopyOf[i3];
                int i4 = i3 + 1;
                bArrCopyOf[i3] = bArrCopyOf[i4];
                bArrCopyOf[i4] = b5;
            }
        }
        C0508g c0508g = new C0508g(bArrCopyOf, bArrCopyOf.length);
        if (bArrCopyOf[0] == 31) {
            C0508g c0508g2 = new C0508g(bArrCopyOf, bArrCopyOf.length);
            while (c0508g2.m1245b() >= 16) {
                c0508g2.m1263t(2);
                int iM1252i = c0508g2.m1252i(14) & 16383;
                int iMin = Math.min(8 - c0508g.f1733d, 14);
                int i5 = c0508g.f1733d;
                int i6 = (8 - i5) - iMin;
                byte[] bArr2 = c0508g.f1731b;
                int i7 = c0508g.f1732c;
                byte b6 = (byte) (((65280 >> i5) | ((1 << i6) - 1)) & bArr2[i7]);
                bArr2[i7] = b6;
                int i8 = 14 - iMin;
                bArr2[i7] = (byte) (b6 | ((iM1252i >>> i8) << i6));
                int i9 = i7 + 1;
                while (i8 > 8) {
                    c0508g.f1731b[i9] = (byte) (iM1252i >>> (i8 - 8));
                    i8 -= 8;
                    i9++;
                }
                int i10 = 8 - i8;
                byte[] bArr3 = c0508g.f1731b;
                byte b7 = (byte) (bArr3[i9] & ((1 << i10) - 1));
                bArr3[i9] = b7;
                bArr3[i9] = (byte) (((iM1252i & ((1 << i8) - 1)) << i10) | b7);
                c0508g.m1263t(14);
                c0508g.m1244a();
            }
        }
        c0508g.m1259p(bArrCopyOf, bArrCopyOf.length);
        return c0508g;
    }

    /* JADX INFO: renamed from: j */
    public static long m4815j(byte b3, byte b4) {
        int i3;
        int i4;
        int i5 = b3 & 255;
        int i6 = b3 & 3;
        if (i6 != 0) {
            i3 = 2;
            if (i6 != 1 && i6 != 2) {
                i3 = b4 & 63;
            }
        } else {
            i3 = 1;
        }
        int i7 = i5 >> 3;
        int i8 = i7 & 3;
        if (i7 >= 16) {
            i4 = 2500 << i8;
        } else if (i7 >= 12) {
            i4 = 10000 << (i7 & 1);
        } else {
            i4 = i8 == 3 ? 60000 : 10000 << i8;
        }
        return ((long) i3) * ((long) i4);
    }

    /* JADX INFO: renamed from: k */
    public static int m4816k(C0508g c0508g) throws C0546I {
        int iM1252i = c0508g.m1252i(4);
        if (iM1252i == 15) {
            if (c0508g.m1245b() >= 24) {
                return c0508g.m1252i(24);
            }
            throw C0546I.m1365a(null, "AAC header insufficient data");
        }
        if (iM1252i < 13) {
            return f9565a[iM1252i];
        }
        throw C0546I.m1365a(null, "AAC header wrong Sampling Frequency Index");
    }

    /* JADX INFO: renamed from: l */
    public static int m4817l(int i3) {
        int i4 = 0;
        while (i3 > 0) {
            i4++;
            i3 >>>= 1;
        }
        return i4;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0087  */
    /* JADX WARN: Code duplicated, block: B:44:0x008f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0094  */
    /* JADX INFO: renamed from: m */
    public static C0576h m4818m(C0508g c0508g) {
        int i3;
        int i4;
        int iM1252i = c0508g.m1252i(16);
        int iM1252i2 = c0508g.m1252i(16);
        if (iM1252i2 == 65535) {
            iM1252i2 = c0508g.m1252i(24);
            i3 = 7;
        } else {
            i3 = 4;
        }
        int i5 = iM1252i2 + i3;
        if (iM1252i == 44097) {
            i5 += 2;
        }
        if (c0508g.m1252i(2) == 3) {
            do {
                c0508g.m1252i(2);
            } while (c0508g.m1251h());
        }
        int iM1252i3 = c0508g.m1252i(10);
        if (c0508g.m1251h() && c0508g.m1252i(3) > 0) {
            c0508g.m1263t(2);
        }
        int i6 = c0508g.m1251h() ? 48000 : 44100;
        int iM1252i4 = c0508g.m1252i(4);
        int[] iArr = f9573i;
        if (i6 == 44100 && iM1252i4 == 13) {
            i4 = iArr[iM1252i4];
        } else if (i6 != 48000 || iM1252i4 >= 14) {
            i4 = 0;
        } else {
            int i7 = iArr[iM1252i4];
            int i8 = iM1252i3 % 5;
            if (i8 == 1) {
                if (iM1252i4 != 3 || iM1252i4 == 8) {
                    i4 = i7 + 1;
                } else {
                    i4 = i7;
                }
            } else if (i8 != 2) {
                if (i8 == 3) {
                    if (iM1252i4 != 3) {
                    }
                    i4 = i7 + 1;
                } else if (i8 == 4 && (iM1252i4 == 3 || iM1252i4 == 8 || iM1252i4 == 11)) {
                    i4 = i7 + 1;
                } else {
                    i4 = i7;
                }
            } else if (iM1252i4 == 8 || iM1252i4 == 11) {
                i4 = i7 + 1;
            } else {
                i4 = i7;
            }
        }
        return new C0576h(i6, i5, i4);
    }

    /* JADX INFO: renamed from: n */
    public static C2228a m4819n(C0508g c0508g, boolean z3) throws C0546I {
        int iM1252i = c0508g.m1252i(5);
        if (iM1252i == 31) {
            iM1252i = c0508g.m1252i(6) + 32;
        }
        int iM4816k = m4816k(c0508g);
        int iM1252i2 = c0508g.m1252i(4);
        String strM1165e = AbstractC0462h.m1165e(iM1252i, "mp4a.40.");
        if (iM1252i == 5 || iM1252i == 29) {
            iM4816k = m4816k(c0508g);
            int iM1252i3 = c0508g.m1252i(5);
            if (iM1252i3 == 31) {
                iM1252i3 = c0508g.m1252i(6) + 32;
            }
            iM1252i = iM1252i3;
            if (iM1252i == 22) {
                iM1252i2 = c0508g.m1252i(4);
            }
        }
        if (z3) {
            if (iM1252i != 1 && iM1252i != 2 && iM1252i != 3 && iM1252i != 4 && iM1252i != 6 && iM1252i != 7 && iM1252i != 17) {
                switch (iM1252i) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw C0546I.m1367c("Unsupported audio object type: " + iM1252i);
                }
            }
            if (c0508g.m1251h()) {
                AbstractC0646n.m1647y("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (c0508g.m1251h()) {
                c0508g.m1263t(14);
            }
            boolean zM1251h = c0508g.m1251h();
            if (iM1252i2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (iM1252i == 6 || iM1252i == 20) {
                c0508g.m1263t(3);
            }
            if (zM1251h) {
                if (iM1252i == 22) {
                    c0508g.m1263t(16);
                }
                if (iM1252i == 17 || iM1252i == 19 || iM1252i == 20 || iM1252i == 23) {
                    c0508g.m1263t(3);
                }
                c0508g.m1263t(1);
            }
            switch (iM1252i) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iM1252i4 = c0508g.m1252i(2);
                    if (iM1252i4 == 2 || iM1252i4 == 3) {
                        throw C0546I.m1367c("Unsupported epConfig: " + iM1252i4);
                    }
                    break;
            }
        }
        int i3 = f9566b[iM1252i2];
        if (i3 != -1) {
            return new C2228a(strM1165e, iM4816k, i3);
        }
        throw C0546I.m1365a(null, null);
    }

    /* JADX INFO: renamed from: o */
    public static void m4820o(C0508g c0508g, C1134j c1134j) throws C0546I {
        int iM1252i = c0508g.m1252i(5);
        c0508g.m1263t(2);
        if (c0508g.m1251h()) {
            c0508g.m1263t(5);
        }
        if (iM1252i >= 7 && iM1252i <= 10) {
            c0508g.m1262s();
        }
        if (c0508g.m1251h()) {
            int iM1252i2 = c0508g.m1252i(3);
            if (c1134j.f5255b == -1 && iM1252i >= 0 && iM1252i <= 15 && (iM1252i2 == 0 || iM1252i2 == 1)) {
                c1134j.f5255b = iM1252i;
            }
            if (c0508g.m1251h()) {
                m4827v(c0508g);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m4821p(C0508g c0508g, C1134j c1134j) throws C0546I {
        c0508g.m1263t(2);
        boolean zM1251h = c0508g.m1251h();
        int iM1252i = c0508g.m1252i(8);
        for (int i3 = 0; i3 < iM1252i; i3++) {
            c0508g.m1263t(2);
            if (c0508g.m1251h()) {
                c0508g.m1263t(5);
            }
            if (zM1251h) {
                c0508g.m1263t(24);
            } else {
                if (c0508g.m1251h()) {
                    if (!c0508g.m1251h()) {
                        c0508g.m1263t(4);
                    }
                    c1134j.f5256c = c0508g.m1252i(6) + 1;
                }
                c0508g.m1263t(4);
            }
        }
        if (c0508g.m1251h()) {
            c0508g.m1263t(3);
            if (c0508g.m1251h()) {
                m4827v(c0508g);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static int m4822q(C0508g c0508g, int[] iArr) {
        int i3 = 0;
        for (int i4 = 0; i4 < 3 && c0508g.m1251h(); i4++) {
            i3++;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            i5 += 1 << iArr[i6];
        }
        return c0508g.m1252i(iArr[i3]) + i5;
    }

    /* JADX INFO: renamed from: r */
    public static C0544G m4823r(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            String str = (String) list.get(i3);
            int i4 = AbstractC0632A.f2454a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                AbstractC0646n.m1647y("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(C0116a.m557d(new C0651s(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e3) {
                    AbstractC0646n.m1648z("VorbisUtil", "Failed to parse vorbis picture", e3);
                }
            } else {
                arrayList.add(new C0294a(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C0544G(arrayList);
    }

    /* JADX INFO: renamed from: s */
    public static int m4824s(int i3, C0651s c0651s) {
        switch (i3) {
            case 1:
                return 192;
            case 2:
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
            case 4:
            case 5:
                return 576 << (i3 - 2);
            case 6:
                return c0651s.m1687u() + 1;
            case 7:
                return c0651s.m1659A() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i3 - 8);
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: t */
    public static C1323r m4825t(C0651s c0651s) {
        c0651s.m1666H(1);
        int iM1690x = c0651s.m1690x();
        long j3 = ((long) c0651s.f2521b) + ((long) iM1690x);
        int i3 = iM1690x / 18;
        long[] jArrCopyOf = new long[i3];
        long[] jArrCopyOf2 = new long[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            long jM1681o = c0651s.m1681o();
            if (jM1681o == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i4);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i4);
                break;
            }
            jArrCopyOf[i4] = jM1681o;
            jArrCopyOf2[i4] = c0651s.m1681o();
            c0651s.m1666H(2);
        }
        c0651s.m1666H((int) (j3 - ((long) c0651s.f2521b)));
        return new C1323r(jArrCopyOf, 16, jArrCopyOf2);
    }

    /* JADX INFO: renamed from: u */
    public static C0311q m4826u(C0651s c0651s, boolean z3, boolean z4) throws C0546I {
        if (z3) {
            m4828w(3, c0651s, false);
        }
        c0651s.m1685s((int) c0651s.m1678l(), StandardCharsets.UTF_8);
        long jM1678l = c0651s.m1678l();
        String[] strArr = new String[(int) jM1678l];
        for (int i3 = 0; i3 < jM1678l; i3++) {
            strArr[i3] = c0651s.m1685s((int) c0651s.m1678l(), StandardCharsets.UTF_8);
        }
        if (z4 && (c0651s.m1687u() & 1) == 0) {
            throw C0546I.m1365a(null, "framing bit expected to be set");
        }
        return new C0311q(strArr);
    }

    /* JADX INFO: renamed from: v */
    public static void m4827v(C0508g c0508g) throws C0546I {
        int iM1252i = c0508g.m1252i(6);
        if (iM1252i < 2 || iM1252i > 42) {
            throw C0546I.m1367c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iM1252i)));
        }
        c0508g.m1263t(iM1252i * 8);
    }

    /* JADX INFO: renamed from: w */
    public static boolean m4828w(int i3, C0651s c0651s, boolean z3) throws C0546I {
        if (c0651s.m1667a() < 7) {
            if (z3) {
                return false;
            }
            throw C0546I.m1365a(null, "too short header: " + c0651s.m1667a());
        }
        if (c0651s.m1687u() != i3) {
            if (z3) {
                return false;
            }
            throw C0546I.m1365a(null, "expected header type " + Integer.toHexString(i3));
        }
        if (c0651s.m1687u() == 118 && c0651s.m1687u() == 111 && c0651s.m1687u() == 114 && c0651s.m1687u() == 98 && c0651s.m1687u() == 105 && c0651s.m1687u() == 115) {
            return true;
        }
        if (z3) {
            return false;
        }
        throw C0546I.m1365a(null, "expected characters 'vorbis'");
    }
}

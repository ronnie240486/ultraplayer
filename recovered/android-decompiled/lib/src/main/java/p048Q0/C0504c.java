package p048Q0;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000A.C0031d;
import p045P0.C0457c;
import p061V.C0614b;
import p064W.AbstractC0646n;
import p064W.C0651s;

/* JADX INFO: renamed from: Q0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0504c extends AbstractC0511j {

    /* JADX INFO: renamed from: i */
    public final int f1678i;

    /* JADX INFO: renamed from: j */
    public final int f1679j;

    /* JADX INFO: renamed from: k */
    public final int f1680k;

    /* JADX INFO: renamed from: o */
    public List f1684o;

    /* JADX INFO: renamed from: p */
    public List f1685p;

    /* JADX INFO: renamed from: q */
    public int f1686q;

    /* JADX INFO: renamed from: r */
    public int f1687r;

    /* JADX INFO: renamed from: s */
    public boolean f1688s;

    /* JADX INFO: renamed from: t */
    public boolean f1689t;

    /* JADX INFO: renamed from: u */
    public byte f1690u;

    /* JADX INFO: renamed from: v */
    public byte f1691v;

    /* JADX INFO: renamed from: x */
    public boolean f1693x;

    /* JADX INFO: renamed from: y */
    public long f1694y;

    /* JADX INFO: renamed from: z */
    public static final int[] f1676z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: A */
    public static final int[] f1669A = {0, 4, 8, 12, 16, 20, 24, 28};

    /* JADX INFO: renamed from: B */
    public static final int[] f1670B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* JADX INFO: renamed from: C */
    public static final int[] f1671C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* JADX INFO: renamed from: D */
    public static final int[] f1672D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* JADX INFO: renamed from: E */
    public static final int[] f1673E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* JADX INFO: renamed from: F */
    public static final int[] f1674F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: G */
    public static final boolean[] f1675G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: h */
    public final C0651s f1677h = new C0651s();

    /* JADX INFO: renamed from: m */
    public final ArrayList f1682m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public C0503b f1683n = new C0503b(0, 4);

    /* JADX INFO: renamed from: w */
    public int f1692w = 0;

    /* JADX INFO: renamed from: l */
    public final long f1681l = 16000000;

    public C0504c(int i3, String str) {
        this.f1678i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i3 == 1) {
            this.f1680k = 0;
            this.f1679j = 0;
        } else if (i3 == 2) {
            this.f1680k = 1;
            this.f1679j = 0;
        } else if (i3 == 3) {
            this.f1680k = 0;
            this.f1679j = 1;
        } else if (i3 != 4) {
            AbstractC0646n.m1647y("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f1680k = 0;
            this.f1679j = 0;
        } else {
            this.f1680k = 1;
            this.f1679j = 1;
        }
        m1237m(0);
        m1236l();
        this.f1693x = true;
        this.f1694y = -9223372036854775807L;
    }

    @Override // p048Q0.AbstractC0511j, p073Z.InterfaceC0768c
    public final void flush() {
        super.flush();
        this.f1684o = null;
        this.f1685p = null;
        m1237m(0);
        this.f1687r = 4;
        this.f1683n.f1668h = 4;
        m1236l();
        this.f1688s = false;
        this.f1689t = false;
        this.f1690u = (byte) 0;
        this.f1691v = (byte) 0;
        this.f1692w = 0;
        this.f1693x = true;
        this.f1694y = -9223372036854775807L;
    }

    @Override // p048Q0.AbstractC0511j
    /* JADX INFO: renamed from: g */
    public final C0031d mo1231g() {
        List list = this.f1684o;
        this.f1685p = list;
        list.getClass();
        return new C0031d(16, list);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x019a  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:134:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01da  */
    /* JADX WARN: Code duplicated, block: B:143:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:148:0x0207 A[LOOP:1: B:146:0x0201->B:148:0x0207, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x020b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0211 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0213  */
    /* JADX WARN: Code duplicated, block: B:153:0x0218  */
    /* JADX WARN: Code duplicated, block: B:154:0x021f  */
    /* JADX WARN: Code duplicated, block: B:155:0x022a  */
    /* JADX WARN: Code duplicated, block: B:156:0x0235  */
    /* JADX WARN: Code duplicated, block: B:157:0x0240  */
    /* JADX WARN: Code duplicated, block: B:158:0x0245  */
    /* JADX WARN: Code duplicated, block: B:159:0x024a  */
    /* JADX WARN: Code duplicated, block: B:161:0x025b  */
    /* JADX WARN: Code duplicated, block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x012a  */
    /* JADX WARN: Code duplicated, block: B:93:0x012e  */
    @Override // p048Q0.AbstractC0511j
    /* JADX INFO: renamed from: h */
    public final void mo1232h(C0510i c0510i) {
        boolean z3;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        ArrayList arrayList;
        int iMin;
        ByteBuffer byteBuffer = c0510i.f3144k;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C0651s c0651s = this.f1677h;
        c0651s.m1663E(bArrArray, iLimit);
        boolean z4 = false;
        while (true) {
            int iM1667a = c0651s.m1667a();
            int i7 = this.f1678i;
            if (iM1667a < i7) {
                if (z4) {
                    int i8 = this.f1686q;
                    if (i8 == 1 || i8 == 3) {
                        this.f1684o = m1235k();
                        this.f1694y = this.f1750e;
                        return;
                    }
                    return;
                }
                return;
            }
            int iM1687u = i7 == 2 ? -4 : c0651s.m1687u();
            int iM1687u2 = c0651s.m1687u();
            int iM1687u3 = c0651s.m1687u();
            if ((iM1687u & 2) == 0 && (iM1687u & 1) == this.f1679j) {
                byte b3 = (byte) (iM1687u2 & 127);
                byte b4 = (byte) (iM1687u3 & 127);
                if (b3 != 0 || b4 != 0) {
                    boolean z5 = this.f1688s;
                    if ((iM1687u & 4) == 4) {
                        boolean[] zArr = f1675G;
                        if (zArr[iM1687u2] && zArr[iM1687u3]) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } else {
                        z3 = false;
                    }
                    this.f1688s = z3;
                    if (!z3 || (b3 & 240) != 16) {
                        this.f1689t = false;
                        if (!z3) {
                            if (1 > b3 && b3 <= 15) {
                                this.f1693x = false;
                            } else if ((b3 & 246) == 20) {
                                if (b4 == 32 && b4 != 47) {
                                    switch (b4) {
                                        default:
                                            switch (b4) {
                                                case 42:
                                                case 43:
                                                    this.f1693x = false;
                                                    break;
                                            }
                                        case 37:
                                        case 38:
                                        case 39:
                                            this.f1693x = true;
                                            break;
                                    }
                                } else {
                                    this.f1693x = true;
                                }
                            }
                            if (this.f1693x) {
                                i3 = b3 & 224;
                                if (i3 == 0) {
                                    this.f1692w = (b3 >> 3) & 1;
                                }
                                if (this.f1692w != this.f1680k) {
                                    if (i3 == 0) {
                                        i4 = b3 & 247;
                                        if (i4 == 17 || (b4 & 240) != 48) {
                                            i5 = b3 & 246;
                                            if (i5 != 18 && (b4 & 224) == 32) {
                                                this.f1683n.m1225b();
                                                this.f1683n.m1224a((char) ((b3 & 1) == 0 ? f1673E[b4 & 31] : f1674F[b4 & 31]));
                                            } else if (i4 != 17 && (b4 & 240) == 32) {
                                                this.f1683n.m1224a(' ');
                                                boolean z6 = (b4 & 1) == 1;
                                                C0503b c0503b = this.f1683n;
                                                c0503b.f1661a.add(new C0502a((b4 >> 1) & 7, c0503b.f1663c.length(), z6));
                                            } else if ((b3 & 240) != 16 && (b4 & 192) == 64) {
                                                int i9 = f1676z[b3 & 7];
                                                if ((b4 & 32) != 0) {
                                                    i9++;
                                                }
                                                C0503b c0503b2 = this.f1683n;
                                                if (i9 != c0503b2.f1664d) {
                                                    if (this.f1686q != 1 && !c0503b2.m1228e()) {
                                                        C0503b c0503b3 = new C0503b(this.f1686q, this.f1687r);
                                                        this.f1683n = c0503b3;
                                                        this.f1682m.add(c0503b3);
                                                    }
                                                    this.f1683n.f1664d = i9;
                                                }
                                                boolean z7 = (b4 & 16) == 16;
                                                boolean z8 = (b4 & 1) == 1;
                                                int i10 = (b4 >> 1) & 7;
                                                C0503b c0503b4 = this.f1683n;
                                                c0503b4.f1661a.add(new C0502a(z7 ? 8 : i10, c0503b4.f1663c.length(), z8));
                                                if (z7) {
                                                    this.f1683n.f1665e = f1669A[i10];
                                                }
                                            } else if (i4 != 23 && b4 >= 33 && b4 <= 35) {
                                                this.f1683n.f1666f = b4 - 32;
                                            } else if (i5 == 20 && (b4 & 240) == 32) {
                                                if (b4 == 32) {
                                                    m1237m(2);
                                                } else if (b4 != 41) {
                                                    switch (b4) {
                                                        case 37:
                                                            m1237m(1);
                                                            this.f1687r = 2;
                                                            this.f1683n.f1668h = 2;
                                                            break;
                                                        case 38:
                                                            m1237m(1);
                                                            this.f1687r = 3;
                                                            this.f1683n.f1668h = 3;
                                                            break;
                                                        case 39:
                                                            m1237m(1);
                                                            this.f1687r = 4;
                                                            this.f1683n.f1668h = 4;
                                                            break;
                                                        default:
                                                            i6 = this.f1686q;
                                                            if (i6 != 0) {
                                                                if (b4 != 33) {
                                                                    switch (b4) {
                                                                        case 44:
                                                                            this.f1684o = Collections.EMPTY_LIST;
                                                                            if (i6 != 1 || i6 == 3) {
                                                                                m1236l();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i6 == 1 && !this.f1683n.m1228e()) {
                                                                                C0503b c0503b5 = this.f1683n;
                                                                                arrayList = c0503b5.f1662b;
                                                                                arrayList.add(c0503b5.m1227d());
                                                                                c0503b5.f1663c.setLength(0);
                                                                                c0503b5.f1661a.clear();
                                                                                iMin = Math.min(c0503b5.f1668h, c0503b5.f1664d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            m1236l();
                                                                            break;
                                                                        case 47:
                                                                            this.f1684o = m1235k();
                                                                            m1236l();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f1683n.m1225b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    m1237m(3);
                                                }
                                            }
                                        } else {
                                            this.f1683n.m1224a((char) f1672D[b4 & 15]);
                                        }
                                    } else {
                                        C0503b c0503b6 = this.f1683n;
                                        iArr = f1671C;
                                        c0503b6.m1224a((char) iArr[(b3 & 127) - 32]);
                                        if ((b4 & 224) != 0) {
                                            this.f1683n.m1224a((char) iArr[(b4 & 127) - 32]);
                                        }
                                    }
                                    z4 = true;
                                }
                            }
                        } else if (z5) {
                            m1236l();
                            z4 = true;
                        }
                    } else if (this.f1689t && this.f1690u == b3 && this.f1691v == b4) {
                        this.f1689t = false;
                    } else {
                        this.f1689t = true;
                        this.f1690u = b3;
                        this.f1691v = b4;
                        if (!z3) {
                            if (1 > b3) {
                                if ((b3 & 246) == 20) {
                                    if (b4 == 32) {
                                        this.f1693x = true;
                                    } else {
                                        this.f1693x = true;
                                    }
                                }
                            } else if ((b3 & 246) == 20) {
                                if (b4 == 32) {
                                    this.f1693x = true;
                                } else {
                                    this.f1693x = true;
                                }
                            }
                            if (this.f1693x) {
                                i3 = b3 & 224;
                                if (i3 == 0) {
                                    this.f1692w = (b3 >> 3) & 1;
                                }
                                if (this.f1692w != this.f1680k) {
                                    if (i3 == 0) {
                                        i4 = b3 & 247;
                                        if (i4 == 17) {
                                            i5 = b3 & 246;
                                            if (i5 != 18) {
                                                if (i4 != 17) {
                                                    if ((b3 & 240) != 16) {
                                                        if (i4 != 23) {
                                                            if (i5 == 20) {
                                                                if (b4 == 32) {
                                                                    m1237m(2);
                                                                } else if (b4 != 41) {
                                                                    switch (b4) {
                                                                        case 37:
                                                                            m1237m(1);
                                                                            this.f1687r = 2;
                                                                            this.f1683n.f1668h = 2;
                                                                            break;
                                                                        case 38:
                                                                            m1237m(1);
                                                                            this.f1687r = 3;
                                                                            this.f1683n.f1668h = 3;
                                                                            break;
                                                                        case 39:
                                                                            m1237m(1);
                                                                            this.f1687r = 4;
                                                                            this.f1683n.f1668h = 4;
                                                                            break;
                                                                        default:
                                                                            i6 = this.f1686q;
                                                                            if (i6 != 0) {
                                                                                if (b4 != 33) {
                                                                                    switch (b4) {
                                                                                        case 44:
                                                                                            this.f1684o = Collections.EMPTY_LIST;
                                                                                            if (i6 != 1) {
                                                                                                m1236l();
                                                                                            } else {
                                                                                                m1236l();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i6 == 1) {
                                                                                                C0503b c0503b7 = this.f1683n;
                                                                                                arrayList = c0503b7.f1662b;
                                                                                                arrayList.add(c0503b7.m1227d());
                                                                                                c0503b7.f1663c.setLength(0);
                                                                                                c0503b7.f1661a.clear();
                                                                                                iMin = Math.min(c0503b7.f1668h, c0503b7.f1664d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            m1236l();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f1684o = m1235k();
                                                                                            m1236l();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f1683n.m1225b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    m1237m(3);
                                                                }
                                                            }
                                                        } else if (i5 == 20) {
                                                            if (b4 == 32) {
                                                                m1237m(2);
                                                            } else if (b4 != 41) {
                                                                switch (b4) {
                                                                    case 37:
                                                                        m1237m(1);
                                                                        this.f1687r = 2;
                                                                        this.f1683n.f1668h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m1237m(1);
                                                                        this.f1687r = 3;
                                                                        this.f1683n.f1668h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m1237m(1);
                                                                        this.f1687r = 4;
                                                                        this.f1683n.f1668h = 4;
                                                                        break;
                                                                    default:
                                                                        i6 = this.f1686q;
                                                                        if (i6 != 0) {
                                                                            if (b4 != 33) {
                                                                                switch (b4) {
                                                                                    case 44:
                                                                                        this.f1684o = Collections.EMPTY_LIST;
                                                                                        if (i6 != 1) {
                                                                                            m1236l();
                                                                                        } else {
                                                                                            m1236l();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i6 == 1) {
                                                                                            C0503b c0503b8 = this.f1683n;
                                                                                            arrayList = c0503b8.f1662b;
                                                                                            arrayList.add(c0503b8.m1227d());
                                                                                            c0503b8.f1663c.setLength(0);
                                                                                            c0503b8.f1661a.clear();
                                                                                            iMin = Math.min(c0503b8.f1668h, c0503b8.f1664d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m1236l();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f1684o = m1235k();
                                                                                        m1236l();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f1683n.m1225b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m1237m(3);
                                                            }
                                                        }
                                                    } else if (i4 != 23) {
                                                        if (i5 == 20) {
                                                            if (b4 == 32) {
                                                                m1237m(2);
                                                            } else if (b4 != 41) {
                                                                switch (b4) {
                                                                    case 37:
                                                                        m1237m(1);
                                                                        this.f1687r = 2;
                                                                        this.f1683n.f1668h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m1237m(1);
                                                                        this.f1687r = 3;
                                                                        this.f1683n.f1668h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m1237m(1);
                                                                        this.f1687r = 4;
                                                                        this.f1683n.f1668h = 4;
                                                                        break;
                                                                    default:
                                                                        i6 = this.f1686q;
                                                                        if (i6 != 0) {
                                                                            if (b4 != 33) {
                                                                                switch (b4) {
                                                                                    case 44:
                                                                                        this.f1684o = Collections.EMPTY_LIST;
                                                                                        if (i6 != 1) {
                                                                                            m1236l();
                                                                                        } else {
                                                                                            m1236l();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i6 == 1) {
                                                                                            C0503b c0503b9 = this.f1683n;
                                                                                            arrayList = c0503b9.f1662b;
                                                                                            arrayList.add(c0503b9.m1227d());
                                                                                            c0503b9.f1663c.setLength(0);
                                                                                            c0503b9.f1661a.clear();
                                                                                            iMin = Math.min(c0503b9.f1668h, c0503b9.f1664d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m1236l();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f1684o = m1235k();
                                                                                        m1236l();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f1683n.m1225b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m1237m(3);
                                                            }
                                                        }
                                                    } else if (i5 == 20) {
                                                        if (b4 == 32) {
                                                            m1237m(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case 37:
                                                                    m1237m(1);
                                                                    this.f1687r = 2;
                                                                    this.f1683n.f1668h = 2;
                                                                    break;
                                                                case 38:
                                                                    m1237m(1);
                                                                    this.f1687r = 3;
                                                                    this.f1683n.f1668h = 3;
                                                                    break;
                                                                case 39:
                                                                    m1237m(1);
                                                                    this.f1687r = 4;
                                                                    this.f1683n.f1668h = 4;
                                                                    break;
                                                                default:
                                                                    i6 = this.f1686q;
                                                                    if (i6 != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case 44:
                                                                                    this.f1684o = Collections.EMPTY_LIST;
                                                                                    if (i6 != 1) {
                                                                                        m1236l();
                                                                                    } else {
                                                                                        m1236l();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i6 == 1) {
                                                                                        C0503b c0503b10 = this.f1683n;
                                                                                        arrayList = c0503b10.f1662b;
                                                                                        arrayList.add(c0503b10.m1227d());
                                                                                        c0503b10.f1663c.setLength(0);
                                                                                        c0503b10.f1661a.clear();
                                                                                        iMin = Math.min(c0503b10.f1668h, c0503b10.f1664d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m1236l();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f1684o = m1235k();
                                                                                    m1236l();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f1683n.m1225b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m1237m(3);
                                                        }
                                                    }
                                                } else if ((b3 & 240) != 16) {
                                                    if (i4 != 23) {
                                                        if (i5 == 20) {
                                                            if (b4 == 32) {
                                                                m1237m(2);
                                                            } else if (b4 != 41) {
                                                                switch (b4) {
                                                                    case 37:
                                                                        m1237m(1);
                                                                        this.f1687r = 2;
                                                                        this.f1683n.f1668h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m1237m(1);
                                                                        this.f1687r = 3;
                                                                        this.f1683n.f1668h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m1237m(1);
                                                                        this.f1687r = 4;
                                                                        this.f1683n.f1668h = 4;
                                                                        break;
                                                                    default:
                                                                        i6 = this.f1686q;
                                                                        if (i6 != 0) {
                                                                            if (b4 != 33) {
                                                                                switch (b4) {
                                                                                    case 44:
                                                                                        this.f1684o = Collections.EMPTY_LIST;
                                                                                        if (i6 != 1) {
                                                                                            m1236l();
                                                                                        } else {
                                                                                            m1236l();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i6 == 1) {
                                                                                            C0503b c0503b11 = this.f1683n;
                                                                                            arrayList = c0503b11.f1662b;
                                                                                            arrayList.add(c0503b11.m1227d());
                                                                                            c0503b11.f1663c.setLength(0);
                                                                                            c0503b11.f1661a.clear();
                                                                                            iMin = Math.min(c0503b11.f1668h, c0503b11.f1664d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m1236l();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f1684o = m1235k();
                                                                                        m1236l();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f1683n.m1225b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m1237m(3);
                                                            }
                                                        }
                                                    } else if (i5 == 20) {
                                                        if (b4 == 32) {
                                                            m1237m(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case 37:
                                                                    m1237m(1);
                                                                    this.f1687r = 2;
                                                                    this.f1683n.f1668h = 2;
                                                                    break;
                                                                case 38:
                                                                    m1237m(1);
                                                                    this.f1687r = 3;
                                                                    this.f1683n.f1668h = 3;
                                                                    break;
                                                                case 39:
                                                                    m1237m(1);
                                                                    this.f1687r = 4;
                                                                    this.f1683n.f1668h = 4;
                                                                    break;
                                                                default:
                                                                    i6 = this.f1686q;
                                                                    if (i6 != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case 44:
                                                                                    this.f1684o = Collections.EMPTY_LIST;
                                                                                    if (i6 != 1) {
                                                                                        m1236l();
                                                                                    } else {
                                                                                        m1236l();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i6 == 1) {
                                                                                        C0503b c0503b12 = this.f1683n;
                                                                                        arrayList = c0503b12.f1662b;
                                                                                        arrayList.add(c0503b12.m1227d());
                                                                                        c0503b12.f1663c.setLength(0);
                                                                                        c0503b12.f1661a.clear();
                                                                                        iMin = Math.min(c0503b12.f1668h, c0503b12.f1664d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m1236l();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f1684o = m1235k();
                                                                                    m1236l();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f1683n.m1225b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m1237m(3);
                                                        }
                                                    }
                                                } else if (i4 != 23) {
                                                    if (i5 == 20) {
                                                        if (b4 == 32) {
                                                            m1237m(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case 37:
                                                                    m1237m(1);
                                                                    this.f1687r = 2;
                                                                    this.f1683n.f1668h = 2;
                                                                    break;
                                                                case 38:
                                                                    m1237m(1);
                                                                    this.f1687r = 3;
                                                                    this.f1683n.f1668h = 3;
                                                                    break;
                                                                case 39:
                                                                    m1237m(1);
                                                                    this.f1687r = 4;
                                                                    this.f1683n.f1668h = 4;
                                                                    break;
                                                                default:
                                                                    i6 = this.f1686q;
                                                                    if (i6 != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case 44:
                                                                                    this.f1684o = Collections.EMPTY_LIST;
                                                                                    if (i6 != 1) {
                                                                                        m1236l();
                                                                                    } else {
                                                                                        m1236l();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i6 == 1) {
                                                                                        C0503b c0503b13 = this.f1683n;
                                                                                        arrayList = c0503b13.f1662b;
                                                                                        arrayList.add(c0503b13.m1227d());
                                                                                        c0503b13.f1663c.setLength(0);
                                                                                        c0503b13.f1661a.clear();
                                                                                        iMin = Math.min(c0503b13.f1668h, c0503b13.f1664d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m1236l();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f1684o = m1235k();
                                                                                    m1236l();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f1683n.m1225b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m1237m(3);
                                                        }
                                                    }
                                                } else if (i5 == 20) {
                                                    if (b4 == 32) {
                                                        m1237m(2);
                                                    } else if (b4 != 41) {
                                                        switch (b4) {
                                                            case 37:
                                                                m1237m(1);
                                                                this.f1687r = 2;
                                                                this.f1683n.f1668h = 2;
                                                                break;
                                                            case 38:
                                                                m1237m(1);
                                                                this.f1687r = 3;
                                                                this.f1683n.f1668h = 3;
                                                                break;
                                                            case 39:
                                                                m1237m(1);
                                                                this.f1687r = 4;
                                                                this.f1683n.f1668h = 4;
                                                                break;
                                                            default:
                                                                i6 = this.f1686q;
                                                                if (i6 != 0) {
                                                                    if (b4 != 33) {
                                                                        switch (b4) {
                                                                            case 44:
                                                                                this.f1684o = Collections.EMPTY_LIST;
                                                                                if (i6 != 1) {
                                                                                    m1236l();
                                                                                } else {
                                                                                    m1236l();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i6 == 1) {
                                                                                    C0503b c0503b14 = this.f1683n;
                                                                                    arrayList = c0503b14.f1662b;
                                                                                    arrayList.add(c0503b14.m1227d());
                                                                                    c0503b14.f1663c.setLength(0);
                                                                                    c0503b14.f1661a.clear();
                                                                                    iMin = Math.min(c0503b14.f1668h, c0503b14.f1664d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m1236l();
                                                                                break;
                                                                            case 47:
                                                                                this.f1684o = m1235k();
                                                                                m1236l();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f1683n.m1225b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m1237m(3);
                                                    }
                                                }
                                            } else if (i4 != 17) {
                                                if ((b3 & 240) != 16) {
                                                    if (i4 != 23) {
                                                        if (i5 == 20) {
                                                            if (b4 == 32) {
                                                                m1237m(2);
                                                            } else if (b4 != 41) {
                                                                switch (b4) {
                                                                    case 37:
                                                                        m1237m(1);
                                                                        this.f1687r = 2;
                                                                        this.f1683n.f1668h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m1237m(1);
                                                                        this.f1687r = 3;
                                                                        this.f1683n.f1668h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m1237m(1);
                                                                        this.f1687r = 4;
                                                                        this.f1683n.f1668h = 4;
                                                                        break;
                                                                    default:
                                                                        i6 = this.f1686q;
                                                                        if (i6 != 0) {
                                                                            if (b4 != 33) {
                                                                                switch (b4) {
                                                                                    case 44:
                                                                                        this.f1684o = Collections.EMPTY_LIST;
                                                                                        if (i6 != 1) {
                                                                                            m1236l();
                                                                                        } else {
                                                                                            m1236l();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i6 == 1) {
                                                                                            C0503b c0503b15 = this.f1683n;
                                                                                            arrayList = c0503b15.f1662b;
                                                                                            arrayList.add(c0503b15.m1227d());
                                                                                            c0503b15.f1663c.setLength(0);
                                                                                            c0503b15.f1661a.clear();
                                                                                            iMin = Math.min(c0503b15.f1668h, c0503b15.f1664d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m1236l();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f1684o = m1235k();
                                                                                        m1236l();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f1683n.m1225b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m1237m(3);
                                                            }
                                                        }
                                                    } else if (i5 == 20) {
                                                        if (b4 == 32) {
                                                            m1237m(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case 37:
                                                                    m1237m(1);
                                                                    this.f1687r = 2;
                                                                    this.f1683n.f1668h = 2;
                                                                    break;
                                                                case 38:
                                                                    m1237m(1);
                                                                    this.f1687r = 3;
                                                                    this.f1683n.f1668h = 3;
                                                                    break;
                                                                case 39:
                                                                    m1237m(1);
                                                                    this.f1687r = 4;
                                                                    this.f1683n.f1668h = 4;
                                                                    break;
                                                                default:
                                                                    i6 = this.f1686q;
                                                                    if (i6 != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case 44:
                                                                                    this.f1684o = Collections.EMPTY_LIST;
                                                                                    if (i6 != 1) {
                                                                                        m1236l();
                                                                                    } else {
                                                                                        m1236l();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i6 == 1) {
                                                                                        C0503b c0503b16 = this.f1683n;
                                                                                        arrayList = c0503b16.f1662b;
                                                                                        arrayList.add(c0503b16.m1227d());
                                                                                        c0503b16.f1663c.setLength(0);
                                                                                        c0503b16.f1661a.clear();
                                                                                        iMin = Math.min(c0503b16.f1668h, c0503b16.f1664d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m1236l();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f1684o = m1235k();
                                                                                    m1236l();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f1683n.m1225b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m1237m(3);
                                                        }
                                                    }
                                                } else if (i4 != 23) {
                                                    if (i5 == 20) {
                                                        if (b4 == 32) {
                                                            m1237m(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case 37:
                                                                    m1237m(1);
                                                                    this.f1687r = 2;
                                                                    this.f1683n.f1668h = 2;
                                                                    break;
                                                                case 38:
                                                                    m1237m(1);
                                                                    this.f1687r = 3;
                                                                    this.f1683n.f1668h = 3;
                                                                    break;
                                                                case 39:
                                                                    m1237m(1);
                                                                    this.f1687r = 4;
                                                                    this.f1683n.f1668h = 4;
                                                                    break;
                                                                default:
                                                                    i6 = this.f1686q;
                                                                    if (i6 != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case 44:
                                                                                    this.f1684o = Collections.EMPTY_LIST;
                                                                                    if (i6 != 1) {
                                                                                        m1236l();
                                                                                    } else {
                                                                                        m1236l();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i6 == 1) {
                                                                                        C0503b c0503b17 = this.f1683n;
                                                                                        arrayList = c0503b17.f1662b;
                                                                                        arrayList.add(c0503b17.m1227d());
                                                                                        c0503b17.f1663c.setLength(0);
                                                                                        c0503b17.f1661a.clear();
                                                                                        iMin = Math.min(c0503b17.f1668h, c0503b17.f1664d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m1236l();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f1684o = m1235k();
                                                                                    m1236l();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f1683n.m1225b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m1237m(3);
                                                        }
                                                    }
                                                } else if (i5 == 20) {
                                                    if (b4 == 32) {
                                                        m1237m(2);
                                                    } else if (b4 != 41) {
                                                        switch (b4) {
                                                            case 37:
                                                                m1237m(1);
                                                                this.f1687r = 2;
                                                                this.f1683n.f1668h = 2;
                                                                break;
                                                            case 38:
                                                                m1237m(1);
                                                                this.f1687r = 3;
                                                                this.f1683n.f1668h = 3;
                                                                break;
                                                            case 39:
                                                                m1237m(1);
                                                                this.f1687r = 4;
                                                                this.f1683n.f1668h = 4;
                                                                break;
                                                            default:
                                                                i6 = this.f1686q;
                                                                if (i6 != 0) {
                                                                    if (b4 != 33) {
                                                                        switch (b4) {
                                                                            case 44:
                                                                                this.f1684o = Collections.EMPTY_LIST;
                                                                                if (i6 != 1) {
                                                                                    m1236l();
                                                                                } else {
                                                                                    m1236l();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i6 == 1) {
                                                                                    C0503b c0503b18 = this.f1683n;
                                                                                    arrayList = c0503b18.f1662b;
                                                                                    arrayList.add(c0503b18.m1227d());
                                                                                    c0503b18.f1663c.setLength(0);
                                                                                    c0503b18.f1661a.clear();
                                                                                    iMin = Math.min(c0503b18.f1668h, c0503b18.f1664d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m1236l();
                                                                                break;
                                                                            case 47:
                                                                                this.f1684o = m1235k();
                                                                                m1236l();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f1683n.m1225b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m1237m(3);
                                                    }
                                                }
                                            } else if ((b3 & 240) != 16) {
                                                if (i4 != 23) {
                                                    if (i5 == 20) {
                                                        if (b4 == 32) {
                                                            m1237m(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case 37:
                                                                    m1237m(1);
                                                                    this.f1687r = 2;
                                                                    this.f1683n.f1668h = 2;
                                                                    break;
                                                                case 38:
                                                                    m1237m(1);
                                                                    this.f1687r = 3;
                                                                    this.f1683n.f1668h = 3;
                                                                    break;
                                                                case 39:
                                                                    m1237m(1);
                                                                    this.f1687r = 4;
                                                                    this.f1683n.f1668h = 4;
                                                                    break;
                                                                default:
                                                                    i6 = this.f1686q;
                                                                    if (i6 != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case 44:
                                                                                    this.f1684o = Collections.EMPTY_LIST;
                                                                                    if (i6 != 1) {
                                                                                        m1236l();
                                                                                    } else {
                                                                                        m1236l();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i6 == 1) {
                                                                                        C0503b c0503b19 = this.f1683n;
                                                                                        arrayList = c0503b19.f1662b;
                                                                                        arrayList.add(c0503b19.m1227d());
                                                                                        c0503b19.f1663c.setLength(0);
                                                                                        c0503b19.f1661a.clear();
                                                                                        iMin = Math.min(c0503b19.f1668h, c0503b19.f1664d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m1236l();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f1684o = m1235k();
                                                                                    m1236l();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f1683n.m1225b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m1237m(3);
                                                        }
                                                    }
                                                } else if (i5 == 20) {
                                                    if (b4 == 32) {
                                                        m1237m(2);
                                                    } else if (b4 != 41) {
                                                        switch (b4) {
                                                            case 37:
                                                                m1237m(1);
                                                                this.f1687r = 2;
                                                                this.f1683n.f1668h = 2;
                                                                break;
                                                            case 38:
                                                                m1237m(1);
                                                                this.f1687r = 3;
                                                                this.f1683n.f1668h = 3;
                                                                break;
                                                            case 39:
                                                                m1237m(1);
                                                                this.f1687r = 4;
                                                                this.f1683n.f1668h = 4;
                                                                break;
                                                            default:
                                                                i6 = this.f1686q;
                                                                if (i6 != 0) {
                                                                    if (b4 != 33) {
                                                                        switch (b4) {
                                                                            case 44:
                                                                                this.f1684o = Collections.EMPTY_LIST;
                                                                                if (i6 != 1) {
                                                                                    m1236l();
                                                                                } else {
                                                                                    m1236l();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i6 == 1) {
                                                                                    C0503b c0503b110 = this.f1683n;
                                                                                    arrayList = c0503b110.f1662b;
                                                                                    arrayList.add(c0503b110.m1227d());
                                                                                    c0503b110.f1663c.setLength(0);
                                                                                    c0503b110.f1661a.clear();
                                                                                    iMin = Math.min(c0503b110.f1668h, c0503b110.f1664d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m1236l();
                                                                                break;
                                                                            case 47:
                                                                                this.f1684o = m1235k();
                                                                                m1236l();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f1683n.m1225b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m1237m(3);
                                                    }
                                                }
                                            } else if (i4 != 23) {
                                                if (i5 == 20) {
                                                    if (b4 == 32) {
                                                        m1237m(2);
                                                    } else if (b4 != 41) {
                                                        switch (b4) {
                                                            case 37:
                                                                m1237m(1);
                                                                this.f1687r = 2;
                                                                this.f1683n.f1668h = 2;
                                                                break;
                                                            case 38:
                                                                m1237m(1);
                                                                this.f1687r = 3;
                                                                this.f1683n.f1668h = 3;
                                                                break;
                                                            case 39:
                                                                m1237m(1);
                                                                this.f1687r = 4;
                                                                this.f1683n.f1668h = 4;
                                                                break;
                                                            default:
                                                                i6 = this.f1686q;
                                                                if (i6 != 0) {
                                                                    if (b4 != 33) {
                                                                        switch (b4) {
                                                                            case 44:
                                                                                this.f1684o = Collections.EMPTY_LIST;
                                                                                if (i6 != 1) {
                                                                                    m1236l();
                                                                                } else {
                                                                                    m1236l();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i6 == 1) {
                                                                                    C0503b c0503b111 = this.f1683n;
                                                                                    arrayList = c0503b111.f1662b;
                                                                                    arrayList.add(c0503b111.m1227d());
                                                                                    c0503b111.f1663c.setLength(0);
                                                                                    c0503b111.f1661a.clear();
                                                                                    iMin = Math.min(c0503b111.f1668h, c0503b111.f1664d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m1236l();
                                                                                break;
                                                                            case 47:
                                                                                this.f1684o = m1235k();
                                                                                m1236l();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f1683n.m1225b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m1237m(3);
                                                    }
                                                }
                                            } else if (i5 == 20) {
                                                if (b4 == 32) {
                                                    m1237m(2);
                                                } else if (b4 != 41) {
                                                    switch (b4) {
                                                        case 37:
                                                            m1237m(1);
                                                            this.f1687r = 2;
                                                            this.f1683n.f1668h = 2;
                                                            break;
                                                        case 38:
                                                            m1237m(1);
                                                            this.f1687r = 3;
                                                            this.f1683n.f1668h = 3;
                                                            break;
                                                        case 39:
                                                            m1237m(1);
                                                            this.f1687r = 4;
                                                            this.f1683n.f1668h = 4;
                                                            break;
                                                        default:
                                                            i6 = this.f1686q;
                                                            if (i6 != 0) {
                                                                if (b4 != 33) {
                                                                    switch (b4) {
                                                                        case 44:
                                                                            this.f1684o = Collections.EMPTY_LIST;
                                                                            if (i6 != 1) {
                                                                                m1236l();
                                                                            } else {
                                                                                m1236l();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i6 == 1) {
                                                                                C0503b c0503b112 = this.f1683n;
                                                                                arrayList = c0503b112.f1662b;
                                                                                arrayList.add(c0503b112.m1227d());
                                                                                c0503b112.f1663c.setLength(0);
                                                                                c0503b112.f1661a.clear();
                                                                                iMin = Math.min(c0503b112.f1668h, c0503b112.f1664d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            m1236l();
                                                                            break;
                                                                        case 47:
                                                                            this.f1684o = m1235k();
                                                                            m1236l();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f1683n.m1225b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    m1237m(3);
                                                }
                                            }
                                        } else {
                                            i5 = b3 & 246;
                                            if (i5 != 18) {
                                                if (i4 != 17) {
                                                    if ((b3 & 240) != 16) {
                                                        if (i4 != 23) {
                                                            if (i5 == 20) {
                                                                if (b4 == 32) {
                                                                    m1237m(2);
                                                                } else if (b4 != 41) {
                                                                    switch (b4) {
                                                                        case 37:
                                                                            m1237m(1);
                                                                            this.f1687r = 2;
                                                                            this.f1683n.f1668h = 2;
                                                                            break;
                                                                        case 38:
                                                                            m1237m(1);
                                                                            this.f1687r = 3;
                                                                            this.f1683n.f1668h = 3;
                                                                            break;
                                                                        case 39:
                                                                            m1237m(1);
                                                                            this.f1687r = 4;
                                                                            this.f1683n.f1668h = 4;
                                                                            break;
                                                                        default:
                                                                            i6 = this.f1686q;
                                                                            if (i6 != 0) {
                                                                                if (b4 != 33) {
                                                                                    switch (b4) {
                                                                                        case 44:
                                                                                            this.f1684o = Collections.EMPTY_LIST;
                                                                                            if (i6 != 1) {
                                                                                                m1236l();
                                                                                            } else {
                                                                                                m1236l();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i6 == 1) {
                                                                                                C0503b c0503b113 = this.f1683n;
                                                                                                arrayList = c0503b113.f1662b;
                                                                                                arrayList.add(c0503b113.m1227d());
                                                                                                c0503b113.f1663c.setLength(0);
                                                                                                c0503b113.f1661a.clear();
                                                                                                iMin = Math.min(c0503b113.f1668h, c0503b113.f1664d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            m1236l();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f1684o = m1235k();
                                                                                            m1236l();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f1683n.m1225b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    m1237m(3);
                                                                }
                                                            }
                                                        } else if (i5 == 20) {
                                                            if (b4 == 32) {
                                                                m1237m(2);
                                                            } else if (b4 != 41) {
                                                                switch (b4) {
                                                                    case 37:
                                                                        m1237m(1);
                                                                        this.f1687r = 2;
                                                                        this.f1683n.f1668h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m1237m(1);
                                                                        this.f1687r = 3;
                                                                        this.f1683n.f1668h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m1237m(1);
                                                                        this.f1687r = 4;
                                                                        this.f1683n.f1668h = 4;
                                                                        break;
                                                                    default:
                                                                        i6 = this.f1686q;
                                                                        if (i6 != 0) {
                                                                            if (b4 != 33) {
                                                                                switch (b4) {
                                                                                    case 44:
                                                                                        this.f1684o = Collections.EMPTY_LIST;
                                                                                        if (i6 != 1) {
                                                                                            m1236l();
                                                                                        } else {
                                                                                            m1236l();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i6 == 1) {
                                                                                            C0503b c0503b114 = this.f1683n;
                                                                                            arrayList = c0503b114.f1662b;
                                                                                            arrayList.add(c0503b114.m1227d());
                                                                                            c0503b114.f1663c.setLength(0);
                                                                                            c0503b114.f1661a.clear();
                                                                                            iMin = Math.min(c0503b114.f1668h, c0503b114.f1664d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m1236l();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f1684o = m1235k();
                                                                                        m1236l();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f1683n.m1225b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m1237m(3);
                                                            }
                                                        }
                                                    } else if (i4 != 23) {
                                                        if (i5 == 20) {
                                                            if (b4 == 32) {
                                                                m1237m(2);
                                                            } else if (b4 != 41) {
                                                                switch (b4) {
                                                                    case 37:
                                                                        m1237m(1);
                                                                        this.f1687r = 2;
                                                                        this.f1683n.f1668h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m1237m(1);
                                                                        this.f1687r = 3;
                                                                        this.f1683n.f1668h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m1237m(1);
                                                                        this.f1687r = 4;
                                                                        this.f1683n.f1668h = 4;
                                                                        break;
                                                                    default:
                                                                        i6 = this.f1686q;
                                                                        if (i6 != 0) {
                                                                            if (b4 != 33) {
                                                                                switch (b4) {
                                                                                    case 44:
                                                                                        this.f1684o = Collections.EMPTY_LIST;
                                                                                        if (i6 != 1) {
                                                                                            m1236l();
                                                                                        } else {
                                                                                            m1236l();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i6 == 1) {
                                                                                            C0503b c0503b115 = this.f1683n;
                                                                                            arrayList = c0503b115.f1662b;
                                                                                            arrayList.add(c0503b115.m1227d());
                                                                                            c0503b115.f1663c.setLength(0);
                                                                                            c0503b115.f1661a.clear();
                                                                                            iMin = Math.min(c0503b115.f1668h, c0503b115.f1664d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m1236l();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f1684o = m1235k();
                                                                                        m1236l();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f1683n.m1225b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m1237m(3);
                                                            }
                                                        }
                                                    } else if (i5 == 20) {
                                                        if (b4 == 32) {
                                                            m1237m(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case 37:
                                                                    m1237m(1);
                                                                    this.f1687r = 2;
                                                                    this.f1683n.f1668h = 2;
                                                                    break;
                                                                case 38:
                                                                    m1237m(1);
                                                                    this.f1687r = 3;
                                                                    this.f1683n.f1668h = 3;
                                                                    break;
                                                                case 39:
                                                                    m1237m(1);
                                                                    this.f1687r = 4;
                                                                    this.f1683n.f1668h = 4;
                                                                    break;
                                                                default:
                                                                    i6 = this.f1686q;
                                                                    if (i6 != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case 44:
                                                                                    this.f1684o = Collections.EMPTY_LIST;
                                                                                    if (i6 != 1) {
                                                                                        m1236l();
                                                                                    } else {
                                                                                        m1236l();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i6 == 1) {
                                                                                        C0503b c0503b116 = this.f1683n;
                                                                                        arrayList = c0503b116.f1662b;
                                                                                        arrayList.add(c0503b116.m1227d());
                                                                                        c0503b116.f1663c.setLength(0);
                                                                                        c0503b116.f1661a.clear();
                                                                                        iMin = Math.min(c0503b116.f1668h, c0503b116.f1664d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m1236l();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f1684o = m1235k();
                                                                                    m1236l();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f1683n.m1225b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m1237m(3);
                                                        }
                                                    }
                                                } else if ((b3 & 240) != 16) {
                                                    if (i4 != 23) {
                                                        if (i5 == 20) {
                                                            if (b4 == 32) {
                                                                m1237m(2);
                                                            } else if (b4 != 41) {
                                                                switch (b4) {
                                                                    case 37:
                                                                        m1237m(1);
                                                                        this.f1687r = 2;
                                                                        this.f1683n.f1668h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m1237m(1);
                                                                        this.f1687r = 3;
                                                                        this.f1683n.f1668h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m1237m(1);
                                                                        this.f1687r = 4;
                                                                        this.f1683n.f1668h = 4;
                                                                        break;
                                                                    default:
                                                                        i6 = this.f1686q;
                                                                        if (i6 != 0) {
                                                                            if (b4 != 33) {
                                                                                switch (b4) {
                                                                                    case 44:
                                                                                        this.f1684o = Collections.EMPTY_LIST;
                                                                                        if (i6 != 1) {
                                                                                            m1236l();
                                                                                        } else {
                                                                                            m1236l();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i6 == 1) {
                                                                                            C0503b c0503b117 = this.f1683n;
                                                                                            arrayList = c0503b117.f1662b;
                                                                                            arrayList.add(c0503b117.m1227d());
                                                                                            c0503b117.f1663c.setLength(0);
                                                                                            c0503b117.f1661a.clear();
                                                                                            iMin = Math.min(c0503b117.f1668h, c0503b117.f1664d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m1236l();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f1684o = m1235k();
                                                                                        m1236l();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f1683n.m1225b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m1237m(3);
                                                            }
                                                        }
                                                    } else if (i5 == 20) {
                                                        if (b4 == 32) {
                                                            m1237m(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case 37:
                                                                    m1237m(1);
                                                                    this.f1687r = 2;
                                                                    this.f1683n.f1668h = 2;
                                                                    break;
                                                                case 38:
                                                                    m1237m(1);
                                                                    this.f1687r = 3;
                                                                    this.f1683n.f1668h = 3;
                                                                    break;
                                                                case 39:
                                                                    m1237m(1);
                                                                    this.f1687r = 4;
                                                                    this.f1683n.f1668h = 4;
                                                                    break;
                                                                default:
                                                                    i6 = this.f1686q;
                                                                    if (i6 != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case 44:
                                                                                    this.f1684o = Collections.EMPTY_LIST;
                                                                                    if (i6 != 1) {
                                                                                        m1236l();
                                                                                    } else {
                                                                                        m1236l();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i6 == 1) {
                                                                                        C0503b c0503b118 = this.f1683n;
                                                                                        arrayList = c0503b118.f1662b;
                                                                                        arrayList.add(c0503b118.m1227d());
                                                                                        c0503b118.f1663c.setLength(0);
                                                                                        c0503b118.f1661a.clear();
                                                                                        iMin = Math.min(c0503b118.f1668h, c0503b118.f1664d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m1236l();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f1684o = m1235k();
                                                                                    m1236l();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f1683n.m1225b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m1237m(3);
                                                        }
                                                    }
                                                } else if (i4 != 23) {
                                                    if (i5 == 20) {
                                                        if (b4 == 32) {
                                                            m1237m(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case 37:
                                                                    m1237m(1);
                                                                    this.f1687r = 2;
                                                                    this.f1683n.f1668h = 2;
                                                                    break;
                                                                case 38:
                                                                    m1237m(1);
                                                                    this.f1687r = 3;
                                                                    this.f1683n.f1668h = 3;
                                                                    break;
                                                                case 39:
                                                                    m1237m(1);
                                                                    this.f1687r = 4;
                                                                    this.f1683n.f1668h = 4;
                                                                    break;
                                                                default:
                                                                    i6 = this.f1686q;
                                                                    if (i6 != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case 44:
                                                                                    this.f1684o = Collections.EMPTY_LIST;
                                                                                    if (i6 != 1) {
                                                                                        m1236l();
                                                                                    } else {
                                                                                        m1236l();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i6 == 1) {
                                                                                        C0503b c0503b119 = this.f1683n;
                                                                                        arrayList = c0503b119.f1662b;
                                                                                        arrayList.add(c0503b119.m1227d());
                                                                                        c0503b119.f1663c.setLength(0);
                                                                                        c0503b119.f1661a.clear();
                                                                                        iMin = Math.min(c0503b119.f1668h, c0503b119.f1664d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m1236l();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f1684o = m1235k();
                                                                                    m1236l();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f1683n.m1225b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m1237m(3);
                                                        }
                                                    }
                                                } else if (i5 == 20) {
                                                    if (b4 == 32) {
                                                        m1237m(2);
                                                    } else if (b4 != 41) {
                                                        switch (b4) {
                                                            case 37:
                                                                m1237m(1);
                                                                this.f1687r = 2;
                                                                this.f1683n.f1668h = 2;
                                                                break;
                                                            case 38:
                                                                m1237m(1);
                                                                this.f1687r = 3;
                                                                this.f1683n.f1668h = 3;
                                                                break;
                                                            case 39:
                                                                m1237m(1);
                                                                this.f1687r = 4;
                                                                this.f1683n.f1668h = 4;
                                                                break;
                                                            default:
                                                                i6 = this.f1686q;
                                                                if (i6 != 0) {
                                                                    if (b4 != 33) {
                                                                        switch (b4) {
                                                                            case 44:
                                                                                this.f1684o = Collections.EMPTY_LIST;
                                                                                if (i6 != 1) {
                                                                                    m1236l();
                                                                                } else {
                                                                                    m1236l();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i6 == 1) {
                                                                                    C0503b c0503b1110 = this.f1683n;
                                                                                    arrayList = c0503b1110.f1662b;
                                                                                    arrayList.add(c0503b1110.m1227d());
                                                                                    c0503b1110.f1663c.setLength(0);
                                                                                    c0503b1110.f1661a.clear();
                                                                                    iMin = Math.min(c0503b1110.f1668h, c0503b1110.f1664d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m1236l();
                                                                                break;
                                                                            case 47:
                                                                                this.f1684o = m1235k();
                                                                                m1236l();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f1683n.m1225b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m1237m(3);
                                                    }
                                                }
                                            } else if (i4 != 17) {
                                                if ((b3 & 240) != 16) {
                                                    if (i4 != 23) {
                                                        if (i5 == 20) {
                                                            if (b4 == 32) {
                                                                m1237m(2);
                                                            } else if (b4 != 41) {
                                                                switch (b4) {
                                                                    case 37:
                                                                        m1237m(1);
                                                                        this.f1687r = 2;
                                                                        this.f1683n.f1668h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m1237m(1);
                                                                        this.f1687r = 3;
                                                                        this.f1683n.f1668h = 3;
                                                                        break;
                                                                    case 39:
                                                                        m1237m(1);
                                                                        this.f1687r = 4;
                                                                        this.f1683n.f1668h = 4;
                                                                        break;
                                                                    default:
                                                                        i6 = this.f1686q;
                                                                        if (i6 != 0) {
                                                                            if (b4 != 33) {
                                                                                switch (b4) {
                                                                                    case 44:
                                                                                        this.f1684o = Collections.EMPTY_LIST;
                                                                                        if (i6 != 1) {
                                                                                            m1236l();
                                                                                        } else {
                                                                                            m1236l();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i6 == 1) {
                                                                                            C0503b c0503b1111 = this.f1683n;
                                                                                            arrayList = c0503b1111.f1662b;
                                                                                            arrayList.add(c0503b1111.m1227d());
                                                                                            c0503b1111.f1663c.setLength(0);
                                                                                            c0503b1111.f1661a.clear();
                                                                                            iMin = Math.min(c0503b1111.f1668h, c0503b1111.f1664d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m1236l();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f1684o = m1235k();
                                                                                        m1236l();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f1683n.m1225b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m1237m(3);
                                                            }
                                                        }
                                                    } else if (i5 == 20) {
                                                        if (b4 == 32) {
                                                            m1237m(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case 37:
                                                                    m1237m(1);
                                                                    this.f1687r = 2;
                                                                    this.f1683n.f1668h = 2;
                                                                    break;
                                                                case 38:
                                                                    m1237m(1);
                                                                    this.f1687r = 3;
                                                                    this.f1683n.f1668h = 3;
                                                                    break;
                                                                case 39:
                                                                    m1237m(1);
                                                                    this.f1687r = 4;
                                                                    this.f1683n.f1668h = 4;
                                                                    break;
                                                                default:
                                                                    i6 = this.f1686q;
                                                                    if (i6 != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case 44:
                                                                                    this.f1684o = Collections.EMPTY_LIST;
                                                                                    if (i6 != 1) {
                                                                                        m1236l();
                                                                                    } else {
                                                                                        m1236l();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i6 == 1) {
                                                                                        C0503b c0503b1112 = this.f1683n;
                                                                                        arrayList = c0503b1112.f1662b;
                                                                                        arrayList.add(c0503b1112.m1227d());
                                                                                        c0503b1112.f1663c.setLength(0);
                                                                                        c0503b1112.f1661a.clear();
                                                                                        iMin = Math.min(c0503b1112.f1668h, c0503b1112.f1664d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m1236l();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f1684o = m1235k();
                                                                                    m1236l();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f1683n.m1225b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m1237m(3);
                                                        }
                                                    }
                                                } else if (i4 != 23) {
                                                    if (i5 == 20) {
                                                        if (b4 == 32) {
                                                            m1237m(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case 37:
                                                                    m1237m(1);
                                                                    this.f1687r = 2;
                                                                    this.f1683n.f1668h = 2;
                                                                    break;
                                                                case 38:
                                                                    m1237m(1);
                                                                    this.f1687r = 3;
                                                                    this.f1683n.f1668h = 3;
                                                                    break;
                                                                case 39:
                                                                    m1237m(1);
                                                                    this.f1687r = 4;
                                                                    this.f1683n.f1668h = 4;
                                                                    break;
                                                                default:
                                                                    i6 = this.f1686q;
                                                                    if (i6 != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case 44:
                                                                                    this.f1684o = Collections.EMPTY_LIST;
                                                                                    if (i6 != 1) {
                                                                                        m1236l();
                                                                                    } else {
                                                                                        m1236l();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i6 == 1) {
                                                                                        C0503b c0503b1113 = this.f1683n;
                                                                                        arrayList = c0503b1113.f1662b;
                                                                                        arrayList.add(c0503b1113.m1227d());
                                                                                        c0503b1113.f1663c.setLength(0);
                                                                                        c0503b1113.f1661a.clear();
                                                                                        iMin = Math.min(c0503b1113.f1668h, c0503b1113.f1664d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m1236l();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f1684o = m1235k();
                                                                                    m1236l();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f1683n.m1225b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m1237m(3);
                                                        }
                                                    }
                                                } else if (i5 == 20) {
                                                    if (b4 == 32) {
                                                        m1237m(2);
                                                    } else if (b4 != 41) {
                                                        switch (b4) {
                                                            case 37:
                                                                m1237m(1);
                                                                this.f1687r = 2;
                                                                this.f1683n.f1668h = 2;
                                                                break;
                                                            case 38:
                                                                m1237m(1);
                                                                this.f1687r = 3;
                                                                this.f1683n.f1668h = 3;
                                                                break;
                                                            case 39:
                                                                m1237m(1);
                                                                this.f1687r = 4;
                                                                this.f1683n.f1668h = 4;
                                                                break;
                                                            default:
                                                                i6 = this.f1686q;
                                                                if (i6 != 0) {
                                                                    if (b4 != 33) {
                                                                        switch (b4) {
                                                                            case 44:
                                                                                this.f1684o = Collections.EMPTY_LIST;
                                                                                if (i6 != 1) {
                                                                                    m1236l();
                                                                                } else {
                                                                                    m1236l();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i6 == 1) {
                                                                                    C0503b c0503b1114 = this.f1683n;
                                                                                    arrayList = c0503b1114.f1662b;
                                                                                    arrayList.add(c0503b1114.m1227d());
                                                                                    c0503b1114.f1663c.setLength(0);
                                                                                    c0503b1114.f1661a.clear();
                                                                                    iMin = Math.min(c0503b1114.f1668h, c0503b1114.f1664d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m1236l();
                                                                                break;
                                                                            case 47:
                                                                                this.f1684o = m1235k();
                                                                                m1236l();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f1683n.m1225b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m1237m(3);
                                                    }
                                                }
                                            } else if ((b3 & 240) != 16) {
                                                if (i4 != 23) {
                                                    if (i5 == 20) {
                                                        if (b4 == 32) {
                                                            m1237m(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case 37:
                                                                    m1237m(1);
                                                                    this.f1687r = 2;
                                                                    this.f1683n.f1668h = 2;
                                                                    break;
                                                                case 38:
                                                                    m1237m(1);
                                                                    this.f1687r = 3;
                                                                    this.f1683n.f1668h = 3;
                                                                    break;
                                                                case 39:
                                                                    m1237m(1);
                                                                    this.f1687r = 4;
                                                                    this.f1683n.f1668h = 4;
                                                                    break;
                                                                default:
                                                                    i6 = this.f1686q;
                                                                    if (i6 != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case 44:
                                                                                    this.f1684o = Collections.EMPTY_LIST;
                                                                                    if (i6 != 1) {
                                                                                        m1236l();
                                                                                    } else {
                                                                                        m1236l();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i6 == 1) {
                                                                                        C0503b c0503b1115 = this.f1683n;
                                                                                        arrayList = c0503b1115.f1662b;
                                                                                        arrayList.add(c0503b1115.m1227d());
                                                                                        c0503b1115.f1663c.setLength(0);
                                                                                        c0503b1115.f1661a.clear();
                                                                                        iMin = Math.min(c0503b1115.f1668h, c0503b1115.f1664d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m1236l();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f1684o = m1235k();
                                                                                    m1236l();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f1683n.m1225b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m1237m(3);
                                                        }
                                                    }
                                                } else if (i5 == 20) {
                                                    if (b4 == 32) {
                                                        m1237m(2);
                                                    } else if (b4 != 41) {
                                                        switch (b4) {
                                                            case 37:
                                                                m1237m(1);
                                                                this.f1687r = 2;
                                                                this.f1683n.f1668h = 2;
                                                                break;
                                                            case 38:
                                                                m1237m(1);
                                                                this.f1687r = 3;
                                                                this.f1683n.f1668h = 3;
                                                                break;
                                                            case 39:
                                                                m1237m(1);
                                                                this.f1687r = 4;
                                                                this.f1683n.f1668h = 4;
                                                                break;
                                                            default:
                                                                i6 = this.f1686q;
                                                                if (i6 != 0) {
                                                                    if (b4 != 33) {
                                                                        switch (b4) {
                                                                            case 44:
                                                                                this.f1684o = Collections.EMPTY_LIST;
                                                                                if (i6 != 1) {
                                                                                    m1236l();
                                                                                } else {
                                                                                    m1236l();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i6 == 1) {
                                                                                    C0503b c0503b1116 = this.f1683n;
                                                                                    arrayList = c0503b1116.f1662b;
                                                                                    arrayList.add(c0503b1116.m1227d());
                                                                                    c0503b1116.f1663c.setLength(0);
                                                                                    c0503b1116.f1661a.clear();
                                                                                    iMin = Math.min(c0503b1116.f1668h, c0503b1116.f1664d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m1236l();
                                                                                break;
                                                                            case 47:
                                                                                this.f1684o = m1235k();
                                                                                m1236l();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f1683n.m1225b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m1237m(3);
                                                    }
                                                }
                                            } else if (i4 != 23) {
                                                if (i5 == 20) {
                                                    if (b4 == 32) {
                                                        m1237m(2);
                                                    } else if (b4 != 41) {
                                                        switch (b4) {
                                                            case 37:
                                                                m1237m(1);
                                                                this.f1687r = 2;
                                                                this.f1683n.f1668h = 2;
                                                                break;
                                                            case 38:
                                                                m1237m(1);
                                                                this.f1687r = 3;
                                                                this.f1683n.f1668h = 3;
                                                                break;
                                                            case 39:
                                                                m1237m(1);
                                                                this.f1687r = 4;
                                                                this.f1683n.f1668h = 4;
                                                                break;
                                                            default:
                                                                i6 = this.f1686q;
                                                                if (i6 != 0) {
                                                                    if (b4 != 33) {
                                                                        switch (b4) {
                                                                            case 44:
                                                                                this.f1684o = Collections.EMPTY_LIST;
                                                                                if (i6 != 1) {
                                                                                    m1236l();
                                                                                } else {
                                                                                    m1236l();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i6 == 1) {
                                                                                    C0503b c0503b1117 = this.f1683n;
                                                                                    arrayList = c0503b1117.f1662b;
                                                                                    arrayList.add(c0503b1117.m1227d());
                                                                                    c0503b1117.f1663c.setLength(0);
                                                                                    c0503b1117.f1661a.clear();
                                                                                    iMin = Math.min(c0503b1117.f1668h, c0503b1117.f1664d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m1236l();
                                                                                break;
                                                                            case 47:
                                                                                this.f1684o = m1235k();
                                                                                m1236l();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f1683n.m1225b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m1237m(3);
                                                    }
                                                }
                                            } else if (i5 == 20) {
                                                if (b4 == 32) {
                                                    m1237m(2);
                                                } else if (b4 != 41) {
                                                    switch (b4) {
                                                        case 37:
                                                            m1237m(1);
                                                            this.f1687r = 2;
                                                            this.f1683n.f1668h = 2;
                                                            break;
                                                        case 38:
                                                            m1237m(1);
                                                            this.f1687r = 3;
                                                            this.f1683n.f1668h = 3;
                                                            break;
                                                        case 39:
                                                            m1237m(1);
                                                            this.f1687r = 4;
                                                            this.f1683n.f1668h = 4;
                                                            break;
                                                        default:
                                                            i6 = this.f1686q;
                                                            if (i6 != 0) {
                                                                if (b4 != 33) {
                                                                    switch (b4) {
                                                                        case 44:
                                                                            this.f1684o = Collections.EMPTY_LIST;
                                                                            if (i6 != 1) {
                                                                                m1236l();
                                                                            } else {
                                                                                m1236l();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i6 == 1) {
                                                                                C0503b c0503b1118 = this.f1683n;
                                                                                arrayList = c0503b1118.f1662b;
                                                                                arrayList.add(c0503b1118.m1227d());
                                                                                c0503b1118.f1663c.setLength(0);
                                                                                c0503b1118.f1661a.clear();
                                                                                iMin = Math.min(c0503b1118.f1668h, c0503b1118.f1664d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            m1236l();
                                                                            break;
                                                                        case 47:
                                                                            this.f1684o = m1235k();
                                                                            m1236l();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f1683n.m1225b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    m1237m(3);
                                                }
                                            }
                                        }
                                    } else {
                                        C0503b c0503b20 = this.f1683n;
                                        iArr = f1671C;
                                        c0503b20.m1224a((char) iArr[(b3 & 127) - 32]);
                                        if ((b4 & 224) != 0) {
                                            this.f1683n.m1224a((char) iArr[(b4 & 127) - 32]);
                                        }
                                    }
                                    z4 = true;
                                }
                            }
                        } else if (z5) {
                            m1236l();
                            z4 = true;
                        }
                    }
                }
            }
        }
    }

    @Override // p048Q0.AbstractC0511j, p073Z.InterfaceC0768c
    /* JADX INFO: renamed from: i */
    public final C0457c mo1230d() {
        C0457c c0457c;
        C0457c c0457cMo1230d = super.mo1230d();
        if (c0457cMo1230d != null) {
            return c0457cMo1230d;
        }
        long j3 = this.f1681l;
        if (j3 == -9223372036854775807L) {
            return null;
        }
        long j4 = this.f1694y;
        if (j4 == -9223372036854775807L || this.f1750e - j4 < j3 || (c0457c = (C0457c) this.f1747b.pollFirst()) == null) {
            return null;
        }
        this.f1684o = Collections.EMPTY_LIST;
        this.f1694y = -9223372036854775807L;
        C0031d c0031dMo1231g = mo1231g();
        long j5 = this.f1750e;
        c0457c.f3149i = j5;
        c0457c.f1527k = c0031dMo1231g;
        c0457c.f1528l = j5;
        return c0457c;
    }

    @Override // p048Q0.AbstractC0511j
    /* JADX INFO: renamed from: j */
    public final boolean mo1234j() {
        return this.f1684o != this.f1685p;
    }

    /* JADX INFO: renamed from: k */
    public final ArrayList m1235k() {
        ArrayList arrayList = this.f1682m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i3 = 0; i3 < size; i3++) {
            C0614b c0614bM1226c = ((C0503b) arrayList.get(i3)).m1226c(Integer.MIN_VALUE);
            arrayList2.add(c0614bM1226c);
            if (c0614bM1226c != null) {
                iMin = Math.min(iMin, c0614bM1226c.f2363i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            C0614b c0614bM1226c2 = (C0614b) arrayList2.get(i4);
            if (c0614bM1226c2 != null) {
                if (c0614bM1226c2.f2363i != iMin) {
                    c0614bM1226c2 = ((C0503b) arrayList.get(i4)).m1226c(iMin);
                    c0614bM1226c2.getClass();
                }
                arrayList3.add(c0614bM1226c2);
            }
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: l */
    public final void m1236l() {
        C0503b c0503b = this.f1683n;
        c0503b.f1667g = this.f1686q;
        c0503b.f1661a.clear();
        c0503b.f1662b.clear();
        c0503b.f1663c.setLength(0);
        c0503b.f1664d = 15;
        c0503b.f1665e = 0;
        c0503b.f1666f = 0;
        ArrayList arrayList = this.f1682m;
        arrayList.clear();
        arrayList.add(this.f1683n);
    }

    /* JADX INFO: renamed from: m */
    public final void m1237m(int i3) {
        int i4 = this.f1686q;
        if (i4 == i3) {
            return;
        }
        this.f1686q = i3;
        if (i3 != 3) {
            m1236l();
            if (i4 == 3 || i3 == 1 || i3 == 0) {
                this.f1684o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f1682m;
            if (i5 >= arrayList.size()) {
                return;
            }
            ((C0503b) arrayList.get(i5)).f1667g = i3;
            i5++;
        }
    }

    @Override // p048Q0.AbstractC0511j, p073Z.InterfaceC0768c
    /* JADX INFO: renamed from: a */
    public final void mo1229a() {
    }
}

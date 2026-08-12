package p018G0;

import com.google.android.gms.internal.cast.AbstractC1303m;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import p000A.C0041i;
import p004B0.C0098a;
import p045P0.AbstractC0462h;
import p048Q0.C0508g;
import p055T.AbstractC0545H;
import p055T.C0544G;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p105h2.AbstractC1676G;
import p105h2.C1673D;
import p105h2.C1692X;
import p122m1.AbstractC2003a;

/* JADX INFO: renamed from: G0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0218h extends AbstractC2003a {

    /* JADX INFO: renamed from: g */
    public static final C0041i f507g = new C0041i(2);

    /* JADX INFO: renamed from: f */
    public final C0041i f508f;

    public C0218h(C0041i c0041i) {
        this.f508f = c0041i;
    }

    /* JADX INFO: renamed from: A */
    public static C0213c m691A(C0651s c0651s, int i3, int i4, boolean z3, int i5, C0041i c0041i) throws Throwable {
        int i6 = c0651s.f2521b;
        int iM708R = m708R(c0651s.f2520a, i6);
        String str = new String(c0651s.f2520a, i6, iM708R - i6, StandardCharsets.ISO_8859_1);
        c0651s.m1665G(iM708R + 1);
        int iM1673g = c0651s.m1673g();
        int iM1673g2 = c0651s.m1673g();
        long jM1689w = c0651s.m1689w();
        if (jM1689w == 4294967295L) {
            jM1689w = -1;
        }
        long jM1689w2 = c0651s.m1689w();
        long j3 = jM1689w2 == 4294967295L ? -1L : jM1689w2;
        ArrayList arrayList = new ArrayList();
        int i7 = i6 + i3;
        while (c0651s.f2521b < i7) {
            AbstractC0219i abstractC0219iM694D = m694D(i4, c0651s, z3, i5, c0041i);
            if (abstractC0219iM694D != null) {
                arrayList.add(abstractC0219iM694D);
            }
        }
        return new C0213c(str, iM1673g, iM1673g2, jM1689w, j3, (AbstractC0219i[]) arrayList.toArray(new AbstractC0219i[0]));
    }

    /* JADX INFO: renamed from: B */
    public static C0214d m692B(C0651s c0651s, int i3, int i4, boolean z3, int i5, C0041i c0041i) throws Throwable {
        int i6 = c0651s.f2521b;
        int iM708R = m708R(c0651s.f2520a, i6);
        String str = new String(c0651s.f2520a, i6, iM708R - i6, StandardCharsets.ISO_8859_1);
        c0651s.m1665G(iM708R + 1);
        int iM1687u = c0651s.m1687u();
        boolean z4 = (iM1687u & 2) != 0;
        boolean z5 = (iM1687u & 1) != 0;
        int iM1687u2 = c0651s.m1687u();
        String[] strArr = new String[iM1687u2];
        for (int i7 = 0; i7 < iM1687u2; i7++) {
            int i8 = c0651s.f2521b;
            int iM708R2 = m708R(c0651s.f2520a, i8);
            strArr[i7] = new String(c0651s.f2520a, i8, iM708R2 - i8, StandardCharsets.ISO_8859_1);
            c0651s.m1665G(iM708R2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i9 = i6 + i3;
        while (c0651s.f2521b < i9) {
            AbstractC0219i abstractC0219iM694D = m694D(i4, c0651s, z3, i5, c0041i);
            if (abstractC0219iM694D != null) {
                arrayList.add(abstractC0219iM694D);
            }
        }
        return new C0214d(str, z4, z5, strArr, (AbstractC0219i[]) arrayList.toArray(new AbstractC0219i[0]));
    }

    /* JADX INFO: renamed from: C */
    public static C0215e m693C(int i3, C0651s c0651s) {
        if (i3 < 4) {
            return null;
        }
        int iM1687u = c0651s.m1687u();
        Charset charsetM705O = m705O(iM1687u);
        byte[] bArr = new byte[3];
        c0651s.m1671e(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i4 = i3 - 4;
        byte[] bArr2 = new byte[i4];
        c0651s.m1671e(bArr2, 0, i4);
        int iM707Q = m707Q(bArr2, 0, iM1687u);
        String str2 = new String(bArr2, 0, iM707Q, charsetM705O);
        int iM704N = m704N(iM1687u) + iM707Q;
        return new C0215e(str, str2, m698H(bArr2, iM704N, m707Q(bArr2, iM704N, iM1687u), charsetM705O));
    }

    /* JADX WARN: Code duplicated, block: B:153:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:161:0x01bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:162:0x01be  */
    /* JADX WARN: Code duplicated, block: B:177:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:183:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:185:0x0200  */
    /* JADX WARN: Code duplicated, block: B:191:0x020f A[Catch: all -> 0x012e, Exception -> 0x0131, OutOfMemoryError -> 0x0134, TRY_LEAVE, TryCatch #3 {Exception -> 0x0131, OutOfMemoryError -> 0x0134, all -> 0x012e, blocks: (B:107:0x0128, B:115:0x0139, B:122:0x014f, B:124:0x0157, B:132:0x0171, B:141:0x0189, B:152:0x01a4, B:159:0x01b6, B:182:0x01f5, B:190:0x020a, B:191:0x020f), top: B:205:0x011e }] */
    /* JADX WARN: Code duplicated, block: B:198:0x0231  */
    /* JADX WARN: Instruction removed from duplicated block: B:198:0x0231, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable] */
    /* JADX INFO: renamed from: D */
    public static AbstractC0219i m694D(int i3, C0651s c0651s, boolean z3, int i4, C0041i c0041i) throws Throwable {
        int iM1691y;
        AbstractC0219i abstractC0219i;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Object obj;
        AbstractC0219i abstractC0219i2;
        ?? r3;
        AbstractC0219i c0212b;
        boolean z9;
        int i5 = i3;
        C0651s c0651s2 = c0651s;
        int iM1687u = c0651s2.m1687u();
        int iM1687u2 = c0651s2.m1687u();
        int iM1687u3 = c0651s2.m1687u();
        int iM1687u4 = i5 >= 3 ? c0651s2.m1687u() : 0;
        if (i5 == 4) {
            iM1691y = c0651s2.m1691y();
            if (!z3) {
                iM1691y = (((iM1691y >> 24) & 255) << 21) | (iM1691y & 255) | (((iM1691y >> 8) & 255) << 7) | (((iM1691y >> 16) & 255) << 14);
            }
        } else {
            iM1691y = i5 == 3 ? c0651s2.m1691y() : c0651s2.m1690x();
        }
        int iM1659A = i5 >= 3 ? c0651s2.m1659A() : 0;
        if (iM1687u == 0 && iM1687u2 == 0 && iM1687u3 == 0 && iM1687u4 == 0 && iM1691y == 0 && iM1659A == 0) {
            c0651s2.m1665G(c0651s2.f2522c);
            return null;
        }
        int i6 = c0651s2.f2521b + iM1691y;
        if (i6 > c0651s2.f2522c) {
            AbstractC0646n.m1647y("Id3Decoder", "Frame size exceeds remaining tag data");
            c0651s2.m1665G(c0651s2.f2522c);
            return null;
        }
        if (c0041i != null) {
            switch (c0041i.f53g) {
                case 2:
                    abstractC0219i = null;
                    break;
                default:
                    abstractC0219i = null;
                    z9 = (iM1687u == 67 && iM1687u2 == 79 && iM1687u3 == 77 && (iM1687u4 == 77 || i5 == 2)) || (iM1687u == 77 && iM1687u2 == 76 && iM1687u3 == 76 && (iM1687u4 == 84 || i5 == 2));
                    break;
            }
            if (!z9) {
                c0651s2.m1665G(i6);
                return abstractC0219i;
            }
        } else {
            abstractC0219i = null;
        }
        if (i5 == 3) {
            z4 = (iM1659A & 128) != 0;
            z7 = (iM1659A & 64) != 0;
            z8 = false;
            z6 = (iM1659A & 32) != 0;
            z5 = z4;
        } else if (i5 == 4) {
            boolean z10 = (iM1659A & 64) != 0;
            boolean z11 = (iM1659A & 8) != 0;
            z7 = (iM1659A & 4) != 0;
            z8 = (iM1659A & 2) != 0;
            z5 = (iM1659A & 1) != 0;
            boolean z12 = z11;
            z6 = z10;
            z4 = z12;
        } else {
            z4 = false;
            z5 = false;
            z6 = false;
            z7 = false;
            z8 = false;
        }
        if (z4 || z7) {
            AbstractC0646n.m1647y("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            c0651s2.m1665G(i6);
            return abstractC0219i;
        }
        if (z6) {
            iM1691y--;
            c0651s2.m1666H(1);
        }
        if (z5) {
            iM1691y -= 4;
            c0651s2.m1666H(4);
        }
        if (z8) {
            iM1691y = m709S(iM1691y, c0651s2);
        }
        int i7 = iM1691y;
        try {
            if (iM1687u == 84 && iM1687u2 == 88 && iM1687u3 == 88 && (i5 == 2 || iM1687u4 == 88)) {
                c0212b = m701K(i7, c0651s2);
            } else if (iM1687u == 84) {
                c0212b = m699I(i7, c0651s2, m706P(i5, iM1687u, iM1687u2, iM1687u3, iM1687u4));
            } else if (iM1687u == 87 && iM1687u2 == 88 && iM1687u3 == 88 && (i5 == 2 || iM1687u4 == 88)) {
                c0212b = m703M(i7, c0651s2);
            } else if (iM1687u == 87) {
                c0212b = m702L(i7, c0651s2, m706P(i5, iM1687u, iM1687u2, iM1687u3, iM1687u4));
            } else if (iM1687u == 80 && iM1687u2 == 82 && iM1687u3 == 73 && iM1687u4 == 86) {
                c0212b = m697G(i7, c0651s2);
            } else {
                if (iM1687u != 71 || iM1687u2 != 69 || iM1687u3 != 79 || (iM1687u4 != 66 && i5 != 2)) {
                    if (i5 == 2) {
                        if (iM1687u == 80 && iM1687u2 == 73 && iM1687u3 == 67) {
                            c0212b = m711z(c0651s2, i7, i5);
                        } else if (iM1687u != 67 && iM1687u2 == 79 && iM1687u3 == 77 && (iM1687u4 == 77 || i5 == 2)) {
                            c0212b = m693C(i7, c0651s2);
                        } else if (iM1687u != 67 && iM1687u2 == 72 && iM1687u3 == 65 && iM1687u4 == 80) {
                            try {
                                c0212b = m691A(c0651s2, i7, i5, z3, i4, c0041i);
                                i5 = i3;
                                c0651s2 = c0651s;
                            } catch (Exception e3) {
                                e = e3;
                                i5 = i3;
                                c0651s2 = c0651s;
                                obj = e;
                                c0651s2.m1665G(i6);
                                abstractC0219i2 = abstractC0219i;
                                r3 = obj;
                            } catch (OutOfMemoryError e4) {
                                e = e4;
                                i5 = i3;
                                c0651s2 = c0651s;
                                obj = e;
                                c0651s2.m1665G(i6);
                                abstractC0219i2 = abstractC0219i;
                                r3 = obj;
                            } catch (Throwable th) {
                                th = th;
                                c0651s2 = c0651s;
                                c0651s2.m1665G(i6);
                                throw th;
                            }
                        } else if (iM1687u != 67 && iM1687u2 == 84 && iM1687u3 == 79 && iM1687u4 == 67) {
                            i5 = i3;
                            c0651s2 = c0651s;
                            c0212b = m692B(c0651s2, i7, i5, z3, i4, c0041i);
                        } else {
                            i5 = i3;
                            c0651s2 = c0651s;
                            if (iM1687u != 77 && iM1687u2 == 76 && iM1687u3 == 76 && iM1687u4 == 84) {
                                c0212b = m696F(i7, c0651s2);
                            } else {
                                String strM706P = m706P(i5, iM1687u, iM1687u2, iM1687u3, iM1687u4);
                                byte[] bArr = new byte[i7];
                                c0651s2.m1671e(bArr, 0, i7);
                                c0212b = new C0212b(strM706P, bArr);
                            }
                        }
                        c0651s2.m1665G(i6);
                        abstractC0219i2 = c0212b;
                        r3 = abstractC0219i;
                    } else if (iM1687u == 65 && iM1687u2 == 80 && iM1687u3 == 73 && iM1687u4 == 67) {
                        c0212b = m711z(c0651s2, i7, i5);
                    } else {
                        if (iM1687u != 67) {
                            if (iM1687u != 67) {
                            }
                            if (iM1687u != 67) {
                                i5 = i3;
                                c0651s2 = c0651s;
                                if (iM1687u != 77) {
                                    String strM706P2 = m706P(i5, iM1687u, iM1687u2, iM1687u3, iM1687u4);
                                    byte[] bArr2 = new byte[i7];
                                    c0651s2.m1671e(bArr2, 0, i7);
                                    c0212b = new C0212b(strM706P2, bArr2);
                                } else {
                                    String strM706P3 = m706P(i5, iM1687u, iM1687u2, iM1687u3, iM1687u4);
                                    byte[] bArr3 = new byte[i7];
                                    c0651s2.m1671e(bArr3, 0, i7);
                                    c0212b = new C0212b(strM706P3, bArr3);
                                }
                            } else {
                                i5 = i3;
                                c0651s2 = c0651s;
                                if (iM1687u != 77) {
                                    String strM706P4 = m706P(i5, iM1687u, iM1687u2, iM1687u3, iM1687u4);
                                    byte[] bArr4 = new byte[i7];
                                    c0651s2.m1671e(bArr4, 0, i7);
                                    c0212b = new C0212b(strM706P4, bArr4);
                                } else {
                                    String strM706P5 = m706P(i5, iM1687u, iM1687u2, iM1687u3, iM1687u4);
                                    byte[] bArr5 = new byte[i7];
                                    c0651s2.m1671e(bArr5, 0, i7);
                                    c0212b = new C0212b(strM706P5, bArr5);
                                }
                            }
                        } else {
                            if (iM1687u != 67) {
                            }
                            if (iM1687u != 67) {
                                i5 = i3;
                                c0651s2 = c0651s;
                                if (iM1687u != 77) {
                                    String strM706P6 = m706P(i5, iM1687u, iM1687u2, iM1687u3, iM1687u4);
                                    byte[] bArr6 = new byte[i7];
                                    c0651s2.m1671e(bArr6, 0, i7);
                                    c0212b = new C0212b(strM706P6, bArr6);
                                } else {
                                    String strM706P7 = m706P(i5, iM1687u, iM1687u2, iM1687u3, iM1687u4);
                                    byte[] bArr7 = new byte[i7];
                                    c0651s2.m1671e(bArr7, 0, i7);
                                    c0212b = new C0212b(strM706P7, bArr7);
                                }
                            } else {
                                i5 = i3;
                                c0651s2 = c0651s;
                                if (iM1687u != 77) {
                                    String strM706P8 = m706P(i5, iM1687u, iM1687u2, iM1687u3, iM1687u4);
                                    byte[] bArr8 = new byte[i7];
                                    c0651s2.m1671e(bArr8, 0, i7);
                                    c0212b = new C0212b(strM706P8, bArr8);
                                } else {
                                    String strM706P9 = m706P(i5, iM1687u, iM1687u2, iM1687u3, iM1687u4);
                                    byte[] bArr9 = new byte[i7];
                                    c0651s2.m1671e(bArr9, 0, i7);
                                    c0212b = new C0212b(strM706P9, bArr9);
                                }
                            }
                        }
                        c0651s2.m1665G(i6);
                        abstractC0219i2 = c0212b;
                        r3 = abstractC0219i;
                    }
                    if (abstractC0219i2 == null) {
                        AbstractC0646n.m1648z("Id3Decoder", "Failed to decode frame: id=" + m706P(i5, iM1687u, iM1687u2, iM1687u3, iM1687u4) + ", frameSize=" + i7, r3);
                    }
                    return abstractC0219i2;
                }
                c0212b = m695E(i7, c0651s2);
            }
            c0651s2.m1665G(i6);
            abstractC0219i2 = c0212b;
            r3 = abstractC0219i;
        } catch (Exception e5) {
            obj = e5;
        } catch (OutOfMemoryError e6) {
            obj = e6;
        } catch (Throwable th2) {
            th = th2;
        }
        if (abstractC0219i2 == null) {
            AbstractC0646n.m1648z("Id3Decoder", "Failed to decode frame: id=" + m706P(i5, iM1687u, iM1687u2, iM1687u3, iM1687u4) + ", frameSize=" + i7, r3);
        }
        return abstractC0219i2;
    }

    /* JADX INFO: renamed from: E */
    public static C0216f m695E(int i3, C0651s c0651s) {
        int iM1687u = c0651s.m1687u();
        Charset charsetM705O = m705O(iM1687u);
        int i4 = i3 - 1;
        byte[] bArr = new byte[i4];
        c0651s.m1671e(bArr, 0, i4);
        int iM708R = m708R(bArr, 0);
        String strM1364l = AbstractC0545H.m1364l(new String(bArr, 0, iM708R, StandardCharsets.ISO_8859_1));
        int i5 = iM708R + 1;
        int iM707Q = m707Q(bArr, i5, iM1687u);
        String strM698H = m698H(bArr, i5, iM707Q, charsetM705O);
        int iM704N = m704N(iM1687u) + iM707Q;
        int iM707Q2 = m707Q(bArr, iM704N, iM1687u);
        String strM698H2 = m698H(bArr, iM704N, iM707Q2, charsetM705O);
        int iM704N2 = m704N(iM1687u) + iM707Q2;
        return new C0216f(strM1364l, strM698H, strM698H2, i4 <= iM704N2 ? AbstractC0632A.f2459f : Arrays.copyOfRange(bArr, iM704N2, i4));
    }

    /* JADX INFO: renamed from: F */
    public static C0222l m696F(int i3, C0651s c0651s) {
        int iM1659A = c0651s.m1659A();
        int iM1690x = c0651s.m1690x();
        int iM1690x2 = c0651s.m1690x();
        int iM1687u = c0651s.m1687u();
        int iM1687u2 = c0651s.m1687u();
        C0508g c0508g = new C0508g();
        c0508g.m1258o(c0651s);
        int i4 = ((i3 - 10) * 8) / (iM1687u + iM1687u2);
        int[] iArr = new int[i4];
        int[] iArr2 = new int[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int iM1252i = c0508g.m1252i(iM1687u);
            int iM1252i2 = c0508g.m1252i(iM1687u2);
            iArr[i5] = iM1252i;
            iArr2[i5] = iM1252i2;
        }
        return new C0222l(iM1659A, iM1690x, iM1690x2, iArr, iArr2);
    }

    /* JADX INFO: renamed from: G */
    public static C0223m m697G(int i3, C0651s c0651s) {
        byte[] bArr = new byte[i3];
        c0651s.m1671e(bArr, 0, i3);
        int iM708R = m708R(bArr, 0);
        String str = new String(bArr, 0, iM708R, StandardCharsets.ISO_8859_1);
        int i4 = iM708R + 1;
        return new C0223m(str, i3 <= i4 ? AbstractC0632A.f2459f : Arrays.copyOfRange(bArr, i4, i3));
    }

    /* JADX INFO: renamed from: H */
    public static String m698H(byte[] bArr, int i3, int i4, Charset charset) {
        return (i4 <= i3 || i4 > bArr.length) ? "" : new String(bArr, i3, i4 - i3, charset);
    }

    /* JADX INFO: renamed from: I */
    public static C0224n m699I(int i3, C0651s c0651s, String str) {
        if (i3 < 1) {
            return null;
        }
        int iM1687u = c0651s.m1687u();
        int i4 = i3 - 1;
        byte[] bArr = new byte[i4];
        c0651s.m1671e(bArr, 0, i4);
        return new C0224n(str, null, m700J(bArr, iM1687u, 0));
    }

    /* JADX INFO: renamed from: J */
    public static C1692X m700J(byte[] bArr, int i3, int i4) {
        if (i4 >= bArr.length) {
            return AbstractC1676G.m4120r("");
        }
        C1673D c1673dM4116m = AbstractC1676G.m4116m();
        int iM707Q = m707Q(bArr, i4, i3);
        while (i4 < iM707Q) {
            c1673dM4116m.m4102a(new String(bArr, i4, iM707Q - i4, m705O(i3)));
            i4 = m704N(i3) + iM707Q;
            iM707Q = m707Q(bArr, i4, i3);
        }
        C1692X c1692xM4112f = c1673dM4116m.m4112f();
        return c1692xM4112f.isEmpty() ? AbstractC1676G.m4120r("") : c1692xM4112f;
    }

    /* JADX INFO: renamed from: K */
    public static C0224n m701K(int i3, C0651s c0651s) {
        if (i3 < 1) {
            return null;
        }
        int iM1687u = c0651s.m1687u();
        int i4 = i3 - 1;
        byte[] bArr = new byte[i4];
        c0651s.m1671e(bArr, 0, i4);
        int iM707Q = m707Q(bArr, 0, iM1687u);
        return new C0224n("TXXX", new String(bArr, 0, iM707Q, m705O(iM1687u)), m700J(bArr, iM1687u, m704N(iM1687u) + iM707Q));
    }

    /* JADX INFO: renamed from: L */
    public static C0225o m702L(int i3, C0651s c0651s, String str) {
        byte[] bArr = new byte[i3];
        c0651s.m1671e(bArr, 0, i3);
        return new C0225o(str, null, new String(bArr, 0, m708R(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    /* JADX INFO: renamed from: M */
    public static C0225o m703M(int i3, C0651s c0651s) {
        if (i3 < 1) {
            return null;
        }
        int iM1687u = c0651s.m1687u();
        int i4 = i3 - 1;
        byte[] bArr = new byte[i4];
        c0651s.m1671e(bArr, 0, i4);
        int iM707Q = m707Q(bArr, 0, iM1687u);
        String str = new String(bArr, 0, iM707Q, m705O(iM1687u));
        int iM704N = m704N(iM1687u) + iM707Q;
        return new C0225o("WXXX", str, m698H(bArr, iM704N, m708R(bArr, iM704N), StandardCharsets.ISO_8859_1));
    }

    /* JADX INFO: renamed from: N */
    public static int m704N(int i3) {
        return (i3 == 0 || i3 == 3) ? 1 : 2;
    }

    /* JADX INFO: renamed from: O */
    public static Charset m705O(int i3) {
        if (i3 == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i3 != 2) {
            return i3 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    /* JADX INFO: renamed from: P */
    public static String m706P(int i3, int i4, int i5, int i6, int i7) {
        return i3 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7));
    }

    /* JADX INFO: renamed from: Q */
    public static int m707Q(byte[] bArr, int i3, int i4) {
        int iM708R = m708R(bArr, i3);
        if (i4 == 0 || i4 == 3) {
            return iM708R;
        }
        while (iM708R < bArr.length - 1) {
            if ((iM708R - i3) % 2 == 0 && bArr[iM708R + 1] == 0) {
                return iM708R;
            }
            iM708R = m708R(bArr, iM708R + 1);
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: R */
    public static int m708R(byte[] bArr, int i3) {
        while (i3 < bArr.length) {
            if (bArr[i3] == 0) {
                return i3;
            }
            i3++;
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: S */
    public static int m709S(int i3, C0651s c0651s) {
        byte[] bArr = c0651s.f2520a;
        int i4 = c0651s.f2521b;
        int i5 = i4;
        while (true) {
            int i6 = i5 + 1;
            if (i6 >= i4 + i3) {
                return i3;
            }
            if ((bArr[i5] & 255) == 255 && bArr[i6] == 0) {
                System.arraycopy(bArr, i5 + 2, bArr, i6, (i3 - (i5 - i4)) - 2);
                i3--;
            }
            i5 = i6;
        }
    }

    /* JADX INFO: renamed from: T */
    public static boolean m710T(C0651s c0651s, int i3, int i4, boolean z3) {
        int iM1690x;
        long jM1690x;
        int iM1659A;
        int i5;
        int i6 = c0651s.f2521b;
        while (true) {
            try {
                boolean z4 = true;
                if (c0651s.m1667a() < i4) {
                    c0651s.m1665G(i6);
                    return true;
                }
                if (i3 >= 3) {
                    iM1690x = c0651s.m1673g();
                    jM1690x = c0651s.m1689w();
                    iM1659A = c0651s.m1659A();
                } else {
                    iM1690x = c0651s.m1690x();
                    jM1690x = c0651s.m1690x();
                    iM1659A = 0;
                }
                if (iM1690x == 0 && jM1690x == 0 && iM1659A == 0) {
                    c0651s.m1665G(i6);
                    return true;
                }
                if (i3 == 4 && !z3) {
                    if ((8421504 & jM1690x) != 0) {
                        c0651s.m1665G(i6);
                        return false;
                    }
                    jM1690x = (((jM1690x >> 24) & 255) << 21) | (jM1690x & 255) | (((jM1690x >> 8) & 255) << 7) | (((jM1690x >> 16) & 255) << 14);
                }
                if (i3 == 4) {
                    i5 = (iM1659A & 64) != 0 ? 1 : 0;
                    if ((iM1659A & 1) == 0) {
                        z4 = false;
                    }
                } else {
                    if (i3 == 3) {
                        i5 = (iM1659A & 32) != 0 ? 1 : 0;
                        if ((iM1659A & 128) == 0) {
                        }
                    } else {
                        i5 = 0;
                    }
                    z4 = false;
                }
                if (z4) {
                    i5 += 4;
                }
                if (jM1690x < i5) {
                    c0651s.m1665G(i6);
                    return false;
                }
                if (c0651s.m1667a() < jM1690x) {
                    c0651s.m1665G(i6);
                    return false;
                }
                c0651s.m1666H((int) jM1690x);
            } catch (Throwable th) {
                c0651s.m1665G(i6);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public static C0211a m711z(C0651s c0651s, int i3, int i4) {
        int iM708R;
        String strConcat;
        int iM1687u = c0651s.m1687u();
        Charset charsetM705O = m705O(iM1687u);
        int i5 = i3 - 1;
        byte[] bArr = new byte[i5];
        c0651s.m1671e(bArr, 0, i5);
        if (i4 == 2) {
            strConcat = "image/" + AbstractC1303m.m3288K(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iM708R = 2;
        } else {
            iM708R = m708R(bArr, 0);
            String strM3288K = AbstractC1303m.m3288K(new String(bArr, 0, iM708R, StandardCharsets.ISO_8859_1));
            strConcat = strM3288K.indexOf(47) == -1 ? "image/".concat(strM3288K) : strM3288K;
        }
        int i6 = bArr[iM708R + 1] & 255;
        int i7 = iM708R + 2;
        int iM707Q = m707Q(bArr, i7, iM1687u);
        String str = new String(bArr, i7, iM707Q - i7, charsetM705O);
        int iM704N = m704N(iM1687u) + iM707Q;
        return new C0211a(strConcat, str, i6, i5 <= iM704N ? AbstractC0632A.f2459f : Arrays.copyOfRange(bArr, iM704N, i5));
    }

    @Override // p122m1.AbstractC2003a
    /* JADX INFO: renamed from: i */
    public final C0544G mo501i(C0098a c0098a, ByteBuffer byteBuffer) {
        return m712y(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00c7 A[SYNTHETIC] */
    /* JADX INFO: renamed from: y */
    public final C0544G m712y(byte[] bArr, int i3) {
        boolean z3;
        C0217g c0217g;
        int i4;
        int i5;
        boolean z4;
        int iM709S;
        AbstractC0219i abstractC0219iM694D;
        boolean z5 = true;
        ArrayList arrayList = new ArrayList();
        C0651s c0651s = new C0651s(bArr, i3);
        if (c0651s.m1667a() < 10) {
            AbstractC0646n.m1647y("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iM1690x = c0651s.m1690x();
            if (iM1690x == 4801587) {
                int iM1687u = c0651s.m1687u();
                c0651s.m1666H(1);
                int iM1687u2 = c0651s.m1687u();
                int iM1686t = c0651s.m1686t();
                if (iM1687u != 2) {
                    if (iM1687u == 3) {
                        if ((iM1687u2 & 64) != 0) {
                            int iM1673g = c0651s.m1673g();
                            c0651s.m1666H(iM1673g);
                            iM1686t -= iM1673g + 4;
                        }
                    } else if (iM1687u == 4) {
                        if ((iM1687u2 & 64) != 0) {
                            int iM1686t2 = c0651s.m1686t();
                            c0651s.m1666H(iM1686t2 - 4);
                            iM1686t -= iM1686t2;
                        }
                        if ((iM1687u2 & 16) != 0) {
                            iM1686t -= 10;
                        }
                    } else {
                        AbstractC0462h.m1170j("Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder", iM1687u);
                    }
                    if (iM1687u < 4) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    c0217g = new C0217g(iM1687u, iM1686t, z3);
                } else if ((iM1687u2 & 64) != 0) {
                    AbstractC0646n.m1647y("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iM1687u < 4 || (iM1687u2 & 128) == 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    c0217g = new C0217g(iM1687u, iM1686t, z3);
                }
                if (c0217g == null) {
                    return null;
                }
                int i6 = c0651s.f2521b;
                i4 = c0217g.f504a;
                i5 = i4 == 2 ? 6 : 10;
                z4 = c0217g.f505b;
                iM709S = c0217g.f506c;
                if (z4) {
                    iM709S = m709S(iM709S, c0651s);
                }
                c0651s.m1664F(i6 + iM709S);
                if (m710T(c0651s, i4, i5, false)) {
                    z5 = false;
                } else if (i4 == 4 || !m710T(c0651s, 4, i5, true)) {
                    AbstractC0462h.m1170j("Failed to validate ID3 tag with majorVersion=", "Id3Decoder", i4);
                    return null;
                }
                while (c0651s.m1667a() >= i5) {
                    abstractC0219iM694D = m694D(i4, c0651s, z5, i5, this.f508f);
                    if (abstractC0219iM694D != null) {
                        arrayList.add(abstractC0219iM694D);
                    }
                }
                return new C0544G(arrayList);
            }
            AbstractC0646n.m1647y("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iM1690x))));
        }
        c0217g = null;
        if (c0217g == null) {
            return null;
        }
        int i7 = c0651s.f2521b;
        i4 = c0217g.f504a;
        if (i4 == 2) {
        }
        z4 = c0217g.f505b;
        iM709S = c0217g.f506c;
        if (z4) {
            iM709S = m709S(iM709S, c0651s);
        }
        c0651s.m1664F(i7 + iM709S);
        if (m710T(c0651s, i4, i5, false)) {
            if (i4 == 4) {
            }
            AbstractC0462h.m1170j("Failed to validate ID3 tag with majorVersion=", "Id3Decoder", i4);
            return null;
        }
        z5 = false;
        while (c0651s.m1667a() >= i5) {
            abstractC0219iM694D = m694D(i4, c0651s, z5, i5, this.f508f);
            if (abstractC0219iM694D != null) {
                arrayList.add(abstractC0219iM694D);
            }
        }
        return new C0544G(arrayList);
    }
}

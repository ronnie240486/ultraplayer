package p036M0;

import android.util.Pair;
import androidx.emoji2.text.C0924n;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p000A.C0031d;
import p048Q0.C0508g;
import p053S0.C0536b;
import p055T.AbstractC0545H;
import p055T.C0546I;
import p055T.C0573f;
import p055T.C0579k;
import p055T.C0582n;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p064W.AbstractC0633a;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p067X.AbstractC0672d;
import p067X.C0674f;
import p085c0.C1134j;
import p105h2.AbstractC1676G;
import p105h2.C1673D;
import p105h2.C1692X;
import p145s0.AbstractC2229b;
import p145s0.C2228a;
import p145s0.C2230c;
import p145s0.C2248u;

/* JADX INFO: renamed from: M0.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0371h {

    /* JADX INFO: renamed from: a */
    public static final byte[] f1191a;

    static {
        int i3 = AbstractC0632A.f2454a;
        f1191a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: a */
    public static C0365b m1023a(int i3, C0651s c0651s) {
        c0651s.m1665G(i3 + 12);
        c0651s.m1666H(1);
        m1024b(c0651s);
        c0651s.m1666H(2);
        int iM1687u = c0651s.m1687u();
        if ((iM1687u & 128) != 0) {
            c0651s.m1666H(2);
        }
        if ((iM1687u & 64) != 0) {
            c0651s.m1666H(c0651s.m1687u());
        }
        if ((iM1687u & 32) != 0) {
            c0651s.m1666H(2);
        }
        c0651s.m1666H(1);
        m1024b(c0651s);
        String strM1356d = AbstractC0545H.m1356d(c0651s.m1687u());
        if ("audio/mpeg".equals(strM1356d) || "audio/vnd.dts".equals(strM1356d) || "audio/vnd.dts.hd".equals(strM1356d)) {
            return new C0365b(strM1356d, null, -1L, -1L);
        }
        c0651s.m1666H(4);
        long jM1689w = c0651s.m1689w();
        long jM1689w2 = c0651s.m1689w();
        c0651s.m1666H(1);
        int iM1024b = m1024b(c0651s);
        long j3 = jM1689w2;
        byte[] bArr = new byte[iM1024b];
        c0651s.m1671e(bArr, 0, iM1024b);
        if (j3 <= 0) {
            j3 = -1;
        }
        return new C0365b(strM1356d, bArr, j3, jM1689w > 0 ? jM1689w : -1L);
    }

    /* JADX INFO: renamed from: b */
    public static int m1024b(C0651s c0651s) {
        int iM1687u = c0651s.m1687u();
        int i3 = iM1687u & 127;
        while ((iM1687u & 128) == 128) {
            iM1687u = c0651s.m1687u();
            i3 = (i3 << 7) | (iM1687u & 127);
        }
        return i3;
    }

    /* JADX INFO: renamed from: c */
    public static int m1025c(int i3) {
        return (i3 >> 24) & 255;
    }

    /* JADX INFO: renamed from: d */
    public static C0674f m1026d(C0651s c0651s) {
        long jM1681o;
        long jM1681o2;
        c0651s.m1665G(8);
        if (m1025c(c0651s.m1673g()) == 0) {
            jM1681o = c0651s.m1689w();
            jM1681o2 = c0651s.m1689w();
        } else {
            jM1681o = c0651s.m1681o();
            jM1681o2 = c0651s.m1681o();
        }
        return new C0674f(jM1681o, jM1681o2, c0651s.m1689w());
    }

    /* JADX INFO: renamed from: e */
    public static Pair m1027e(C0651s c0651s, int i3, int i4) throws C0546I {
        C0385v c0385v;
        Pair pairCreate;
        int i5;
        int i6;
        int i7 = c0651s.f2521b;
        while (i7 - i3 < i4) {
            c0651s.m1665G(i7);
            int iM1673g = c0651s.m1673g();
            AbstractC2229b.m4808c("childAtomSize must be positive", iM1673g > 0);
            if (c0651s.m1673g() == 1936289382) {
                int i8 = i7 + 8;
                int i9 = -1;
                Integer numValueOf = null;
                String strM1685s = null;
                int i10 = 0;
                while (i8 - i7 < iM1673g) {
                    c0651s.m1665G(i8);
                    int iM1673g2 = c0651s.m1673g();
                    int iM1673g3 = c0651s.m1673g();
                    if (iM1673g3 == 1718775137) {
                        numValueOf = Integer.valueOf(c0651s.m1673g());
                    } else if (iM1673g3 == 1935894637) {
                        c0651s.m1666H(4);
                        strM1685s = c0651s.m1685s(4, StandardCharsets.UTF_8);
                    } else if (iM1673g3 == 1935894633) {
                        i9 = i8;
                        i10 = iM1673g2;
                    }
                    i8 += iM1673g2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strM1685s) || "cbc1".equals(strM1685s) || "cens".equals(strM1685s) || "cbcs".equals(strM1685s)) {
                    AbstractC2229b.m4808c("frma atom is mandatory", numValueOf != null);
                    AbstractC2229b.m4808c("schi atom is mandatory", i9 != -1);
                    int i11 = i9 + 8;
                    while (true) {
                        if (i11 - i9 >= i10) {
                            c0385v = null;
                            break;
                        }
                        c0651s.m1665G(i11);
                        int iM1673g4 = c0651s.m1673g();
                        if (c0651s.m1673g() == 1952804451) {
                            int iM1025c = m1025c(c0651s.m1673g());
                            c0651s.m1666H(1);
                            if (iM1025c == 0) {
                                c0651s.m1666H(1);
                                i6 = 0;
                                i5 = 0;
                            } else {
                                int iM1687u = c0651s.m1687u();
                                i5 = iM1687u & 15;
                                i6 = (iM1687u & 240) >> 4;
                            }
                            boolean z3 = c0651s.m1687u() == 1;
                            int iM1687u2 = c0651s.m1687u();
                            byte[] bArr2 = new byte[16];
                            c0651s.m1671e(bArr2, 0, 16);
                            if (z3 && iM1687u2 == 0) {
                                int iM1687u3 = c0651s.m1687u();
                                byte[] bArr3 = new byte[iM1687u3];
                                c0651s.m1671e(bArr3, 0, iM1687u3);
                                bArr = bArr3;
                            }
                            c0385v = new C0385v(z3, strM1685s, iM1687u2, bArr2, i6, i5, bArr);
                            break;
                        }
                        i11 += iM1673g4;
                    }
                    AbstractC2229b.m4808c("tenc atom is mandatory", c0385v != null);
                    int i12 = AbstractC0632A.f2454a;
                    pairCreate = Pair.create(numValueOf, c0385v);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i7 += iM1673g;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:169:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:222:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:323:0x0645  */
    /* JADX WARN: Code duplicated, block: B:392:0x07f7  */
    /* JADX WARN: Code duplicated, block: B:404:0x081e  */
    /* JADX WARN: Code duplicated, block: B:411:0x082c  */
    /* JADX WARN: Code duplicated, block: B:548:0x0a05  */
    /* JADX WARN: Code duplicated, block: B:664:0x0a34 A[SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static C0368e m1028f(C0651s c0651s, int i3, int i4, String str, C0579k c0579k, boolean z3) throws C0546I {
        int i5;
        int i6;
        int iM1673g;
        int i7;
        int iM1691y;
        int i8;
        int i9;
        int i10;
        C0579k c0579k2;
        String str2;
        String str3;
        String str4;
        int i11;
        int i12;
        int i13;
        String str5;
        int i14;
        int i15;
        String str6;
        List list;
        String str7;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean zM1251h;
        int iM1252i;
        int iM1252i2;
        int iM1245b;
        boolean z4;
        int i22;
        boolean zM1251h2;
        int i23;
        int iM1252i3;
        int i24;
        boolean z5;
        String str8;
        C0579k c0579kM1444d;
        long j3;
        C1692X c1692xM4120r;
        C0651s c0651s2 = c0651s;
        String str9 = "audio/mhm1";
        c0651s2.m1665G(12);
        int iM1673g2 = c0651s2.m1673g();
        C0368e c0368e = new C0368e();
        c0368e.f1180c = new C0385v[iM1673g2];
        c0368e.f1179b = 0;
        int i25 = 0;
        while (i25 < iM1673g2) {
            int i26 = c0651s2.f2521b;
            int iM1673g3 = c0651s2.m1673g();
            String str10 = "childAtomSize must be positive";
            AbstractC2229b.m4808c("childAtomSize must be positive", iM1673g3 > 0);
            int iM1673g4 = c0651s2.m1673g();
            if (iM1673g4 == 1635148593 || iM1673g4 == 1635148595 || iM1673g4 == 1701733238 || iM1673g4 == 1831958048 || iM1673g4 == 1836070006 || iM1673g4 == 1752589105 || iM1673g4 == 1751479857 || iM1673g4 == 1932670515 || iM1673g4 == 1211250227 || iM1673g4 == 1748121139 || iM1673g4 == 1987063864 || iM1673g4 == 1987063865 || iM1673g4 == 1635135537 || iM1673g4 == 1685479798 || iM1673g4 == 1685479729 || iM1673g4 == 1685481573) {
                c0651s2 = c0651s;
            } else {
                if (iM1673g4 != 1685481521) {
                    if (iM1673g4 == 1836069985 || iM1673g4 == 1701733217 || iM1673g4 == 1633889587 || iM1673g4 == 1700998451 || iM1673g4 == 1633889588 || iM1673g4 == 1835823201 || iM1673g4 == 1685353315 || iM1673g4 == 1685353317 || iM1673g4 == 1685353320 || iM1673g4 == 1685353324 || iM1673g4 == 1685353336 || iM1673g4 == 1935764850 || iM1673g4 == 1935767394 || iM1673g4 == 1819304813 || iM1673g4 == 1936684916 || iM1673g4 == 1953984371 || iM1673g4 == 778924082 || iM1673g4 == 778924083 || iM1673g4 == 1835557169 || iM1673g4 == 1835560241 || iM1673g4 == 1634492771 || iM1673g4 == 1634492791 || iM1673g4 == 1970037111 || iM1673g4 == 1332770163 || iM1673g4 == 1716281667 || iM1673g4 == 1767992678) {
                        c0651s2.m1665G(i26 + 16);
                        if (z3) {
                            int iM1659A = c0651s2.m1659A();
                            c0651s2.m1666H(6);
                            i6 = iM1659A;
                        } else {
                            c0651s2.m1666H(8);
                            i6 = 0;
                        }
                        if (i6 == 0 || i6 == 1) {
                            int iM1659A2 = c0651s2.m1659A();
                            c0651s2.m1666H(6);
                            int iM1688v = c0651s2.m1688v();
                            c0651s2.m1665G(c0651s2.f2521b - 4);
                            iM1673g = c0651s2.m1673g();
                            if (i6 == 1) {
                                c0651s2.m1666H(16);
                            }
                            i7 = iM1688v;
                            iM1691y = iM1659A2;
                            i8 = -1;
                        } else {
                            if (i6 == 2) {
                                c0651s2.m1666H(16);
                                int iRound = (int) Math.round(Double.longBitsToDouble(c0651s2.m1681o()));
                                iM1691y = c0651s2.m1691y();
                                c0651s2.m1666H(4);
                                int iM1691y2 = c0651s2.m1691y();
                                int iM1691y3 = c0651s2.m1691y();
                                boolean z6 = (iM1691y3 & 1) != 0;
                                boolean z7 = (iM1691y3 & 2) != 0;
                                if (z6) {
                                    if (iM1691y2 == 32) {
                                        i8 = 4;
                                    } else {
                                        i8 = -1;
                                    }
                                } else if (iM1691y2 == 8) {
                                    i8 = 3;
                                } else if (iM1691y2 == 16) {
                                    i8 = z7 ? 268435456 : 2;
                                } else if (iM1691y2 == 24) {
                                    i8 = z7 ? 1342177280 : 21;
                                } else if (iM1691y2 == 32) {
                                    i8 = z7 ? 1610612736 : 22;
                                } else {
                                    i8 = -1;
                                }
                                c0651s2.m1666H(8);
                                i7 = iRound;
                                iM1673g = 0;
                            } else {
                                str9 = str9;
                                iM1673g2 = iM1673g2;
                                i10 = i26;
                                i9 = iM1673g3;
                                i5 = i25;
                            }
                            c0651s2 = c0651s;
                            c0368e = c0368e;
                            i26 = i10;
                            iM1673g3 = i9;
                        }
                        if (iM1673g4 == 1767992678) {
                            i7 = -1;
                            iM1691y = -1;
                        }
                        int i27 = c0651s2.f2521b;
                        if (iM1673g4 == 1701733217) {
                            Pair pairM1027e = m1027e(c0651s2, i26, iM1673g3);
                            if (pairM1027e != null) {
                                iM1673g4 = ((Integer) pairM1027e.first).intValue();
                                c0579kM1444d = c0579k == null ? null : c0579k.m1444d(((C0385v) pairM1027e.second).f1315b);
                                ((C0385v[]) c0368e.f1180c)[i25] = (C0385v) pairM1027e.second;
                            } else {
                                i7 = i7;
                                iM1691y = iM1691y;
                                c0579kM1444d = c0579k;
                            }
                            c0651s2.m1665G(i27);
                            c0579k2 = c0579kM1444d;
                        } else {
                            i7 = i7;
                            iM1691y = iM1691y;
                            c0579k2 = c0579k;
                        }
                        if (iM1673g4 == 1633889587) {
                            str2 = "audio/ac3";
                        } else if (iM1673g4 == 1700998451) {
                            str2 = "audio/eac3";
                        } else if (iM1673g4 == 1633889588) {
                            str2 = "audio/ac4";
                        } else if (iM1673g4 == 1685353315) {
                            str2 = "audio/vnd.dts";
                        } else if (iM1673g4 == 1685353320 || iM1673g4 == 1685353324) {
                            str2 = "audio/vnd.dts.hd";
                        } else if (iM1673g4 == 1685353317) {
                            str2 = "audio/vnd.dts.hd;profile=lbr";
                        } else if (iM1673g4 == 1685353336) {
                            str2 = "audio/vnd.dts.uhd;profile=p2";
                        } else if (iM1673g4 == 1935764850) {
                            str2 = "audio/3gpp";
                        } else if (iM1673g4 == 1935767394) {
                            str2 = "audio/amr-wb";
                        } else if (iM1673g4 == 1936684916) {
                            str2 = "audio/raw";
                            i8 = 2;
                        } else if (iM1673g4 == 1953984371) {
                            str2 = "audio/raw";
                            i8 = 268435456;
                        } else if (iM1673g4 == 1819304813) {
                            if (i8 == -1) {
                                str2 = "audio/raw";
                                i8 = 2;
                            } else {
                                str2 = "audio/raw";
                            }
                        } else if (iM1673g4 == 778924082 || iM1673g4 == 778924083) {
                            str2 = "audio/mpeg";
                        } else if (iM1673g4 == 1835557169) {
                            str2 = "audio/mha1";
                        } else if (iM1673g4 == 1835560241) {
                            str2 = str9;
                        } else if (iM1673g4 == 1634492771) {
                            str2 = "audio/alac";
                        } else if (iM1673g4 == 1634492791) {
                            str2 = "audio/g711-alaw";
                        } else if (iM1673g4 == 1970037111) {
                            str2 = "audio/g711-mlaw";
                        } else if (iM1673g4 == 1332770163) {
                            str2 = "audio/opus";
                        } else if (iM1673g4 == 1716281667) {
                            str2 = "audio/flac";
                        } else if (iM1673g4 == 1835823201) {
                            str2 = "audio/true-hd";
                        } else {
                            str2 = iM1673g4 == 1767992678 ? "audio/iamf" : null;
                        }
                        String str11 = str2;
                        int i28 = i27;
                        iM1673g2 = iM1673g2;
                        i10 = i26;
                        i5 = i25;
                        int iIntValue = i7;
                        int iIntValue2 = iM1691y;
                        String str12 = null;
                        List listM4120r = null;
                        C0365b c0365b = null;
                        while (i28 - i10 < iM1673g3) {
                            c0651s2.m1665G(i28);
                            int iM1673g5 = c0651s2.m1673g();
                            int i29 = iM1673g3;
                            AbstractC2229b.m4808c(str10, iM1673g5 > 0);
                            int iM1673g6 = c0651s2.m1673g();
                            C0365b c0365b2 = c0365b;
                            if (iM1673g6 == 1835557187) {
                                c0651s2.m1665G(i28 + 8);
                                c0651s2.m1666H(1);
                                int iM1687u = c0651s2.m1687u();
                                c0651s2.m1666H(1);
                                str12 = Objects.equals(str11, str9) ? String.format("mhm1.%02X", Integer.valueOf(iM1687u)) : String.format("mha1.%02X", Integer.valueOf(iM1687u));
                                int iM1659A3 = c0651s2.m1659A();
                                byte[] bArr = new byte[iM1659A3];
                                str3 = str9;
                                c0651s2.m1671e(bArr, 0, iM1659A3);
                                listM4120r = listM4120r == null ? AbstractC1676G.m4120r(bArr) : AbstractC1676G.m4121s(bArr, (byte[]) listM4120r.get(0));
                            } else {
                                str3 = str9;
                                if (iM1673g6 == 1835557200) {
                                    c0651s2.m1665G(i28 + 8);
                                    int iM1687u2 = c0651s2.m1687u();
                                    if (iM1687u2 > 0) {
                                        byte[] bArr2 = new byte[iM1687u2];
                                        c0651s2.m1671e(bArr2, 0, iM1687u2);
                                        listM4120r = listM4120r == null ? AbstractC1676G.m4120r(bArr2) : AbstractC1676G.m4121s((byte[]) listM4120r.get(0), bArr2);
                                    }
                                } else if (iM1673g6 == 1702061171 || (z3 && iM1673g6 == 2002876005)) {
                                    i8 = i8;
                                    int i30 = i28;
                                    str4 = str11;
                                    String str13 = str10;
                                    List list2 = listM4120r;
                                    int i31 = iM1673g5;
                                    int i32 = iIntValue2;
                                    int i33 = iIntValue;
                                    str12 = str12;
                                    if (iM1673g6 == 1702061171) {
                                        str5 = str13;
                                        i13 = i31;
                                        i11 = i30;
                                        i12 = i11;
                                    } else {
                                        i11 = c0651s2.f2521b;
                                        i12 = i30;
                                        AbstractC2229b.m4808c(null, i11 >= i12);
                                        while (true) {
                                            i13 = i31;
                                            if (i11 - i12 < i13) {
                                                c0651s2.m1665G(i11);
                                                int iM1673g7 = c0651s2.m1673g();
                                                str5 = str13;
                                                AbstractC2229b.m4808c(str5, iM1673g7 > 0);
                                                if (c0651s2.m1673g() != 1702061171) {
                                                    i11 += iM1673g7;
                                                    i31 = i13;
                                                    str13 = str5;
                                                }
                                            } else {
                                                str5 = str13;
                                                i11 = -1;
                                            }
                                        }
                                    }
                                    if (i11 != -1) {
                                        C0365b c0365bM1023a = m1023a(i11, c0651s2);
                                        String str14 = (String) c0365bM1023a.f1173e;
                                        byte[] bArr3 = (byte[]) c0365bM1023a.f1174f;
                                        if (bArr3 == null) {
                                            c0365b2 = c0365bM1023a;
                                            str4 = str14;
                                        } else if ("audio/vorbis".equals(str14)) {
                                            C0651s c0651s3 = new C0651s(bArr3);
                                            c0651s3.m1666H(1);
                                            int i34 = 0;
                                            while (c0651s3.m1667a() > 0 && (c0651s3.f2520a[c0651s3.f2521b] & 255) == 255) {
                                                i34 += 255;
                                                c0651s3.m1666H(1);
                                            }
                                            int iM1687u3 = c0651s3.m1687u() + i34;
                                            int i35 = 0;
                                            while (true) {
                                                if (c0651s3.m1667a() > 0) {
                                                    c0365b2 = c0365bM1023a;
                                                    if ((c0651s3.f2520a[c0651s3.f2521b] & 255) == 255) {
                                                        i35 += 255;
                                                        c0651s3.m1666H(1);
                                                        c0365bM1023a = c0365b2;
                                                    }
                                                } else {
                                                    c0365b2 = c0365bM1023a;
                                                }
                                            }
                                            int iM1687u4 = c0651s3.m1687u() + i35;
                                            byte[] bArr4 = new byte[iM1687u3];
                                            int i36 = c0651s3.f2521b;
                                            System.arraycopy(bArr3, i36, bArr4, 0, iM1687u3);
                                            int i37 = i36 + iM1687u3 + iM1687u4;
                                            int length = bArr3.length - i37;
                                            byte[] bArr5 = new byte[length];
                                            System.arraycopy(bArr3, i37, bArr5, 0, length);
                                            listM4120r = AbstractC1676G.m4121s(bArr4, bArr5);
                                            i33 = i33;
                                            str4 = str14;
                                            i14 = i32;
                                        } else {
                                            c0365b2 = c0365bM1023a;
                                            if ("audio/mp4a-latm".equals(str14)) {
                                                C2228a c2228aM4819n = AbstractC2229b.m4819n(new C0508g(bArr3, bArr3.length), false);
                                                i33 = c2228aM4819n.f9563b;
                                                i15 = c2228aM4819n.f9564c;
                                                str6 = c2228aM4819n.f9562a;
                                            } else {
                                                i15 = i32;
                                                str6 = str12;
                                            }
                                            listM4120r = AbstractC1676G.m4120r(bArr3);
                                            str4 = str14;
                                            str12 = str6;
                                            i33 = i33;
                                            i14 = i15;
                                        }
                                        iIntValue = i33;
                                        iIntValue2 = i14;
                                    }
                                    listM4120r = list2;
                                    i14 = i32;
                                    iIntValue = i33;
                                    iIntValue2 = i14;
                                } else {
                                    if (iM1673g6 == 1684103987) {
                                        c0651s2.m1665G(i28 + 8);
                                        String string = Integer.toString(i3);
                                        C0508g c0508g = new C0508g();
                                        c0508g.m1258o(c0651s2);
                                        int i38 = AbstractC2229b.f9568d[c0508g.m1252i(2)];
                                        str4 = str11;
                                        c0508g.m1263t(8);
                                        int i39 = AbstractC2229b.f9570f[c0508g.m1252i(3)];
                                        if (c0508g.m1252i(1) != 0) {
                                            i39++;
                                        }
                                        int i40 = i39;
                                        list = listM4120r;
                                        int i41 = AbstractC2229b.f9571g[c0508g.m1252i(5)] * 1000;
                                        c0508g.m1246c();
                                        c0651s2.m1665G(c0508g.m1249f());
                                        C0582n c0582n = new C0582n();
                                        c0582n.f2102a = string;
                                        c0582n.f2114m = AbstractC0545H.m1364l("audio/ac3");
                                        c0582n.f2092B = i40;
                                        c0582n.f2093C = i38;
                                        c0582n.f2118q = c0579k2;
                                        c0582n.f2105d = str;
                                        c0582n.f2109h = i41;
                                        c0582n.f2110i = i41;
                                        c0368e.f1181d = new C0583o(c0582n);
                                        i8 = i8;
                                        i12 = i28;
                                        str5 = str10;
                                        i13 = iM1673g5;
                                        i16 = iIntValue2;
                                        i17 = iIntValue;
                                        str7 = str12;
                                    } else {
                                        str4 = str11;
                                        list = listM4120r;
                                        if (iM1673g6 == 1684366131) {
                                            c0651s2.m1665G(i28 + 8);
                                            String string2 = Integer.toString(i3);
                                            C0508g c0508g2 = new C0508g();
                                            c0508g2.m1258o(c0651s2);
                                            int iM1252i4 = c0508g2.m1252i(13) * 1000;
                                            c0508g2.m1263t(3);
                                            int i42 = AbstractC2229b.f9568d[c0508g2.m1252i(2)];
                                            c0508g2.m1263t(10);
                                            int i43 = AbstractC2229b.f9570f[c0508g2.m1252i(3)];
                                            if (c0508g2.m1252i(1) != 0) {
                                                i43++;
                                            }
                                            c0508g2.m1263t(3);
                                            int iM1252i5 = c0508g2.m1252i(4);
                                            c0508g2.m1263t(1);
                                            if (iM1252i5 > 0) {
                                                c0508g2.m1263t(6);
                                                if (c0508g2.m1252i(1) != 0) {
                                                    i43 += 2;
                                                }
                                                c0508g2.m1263t(1);
                                            }
                                            int i44 = i43;
                                            str7 = str12;
                                            if (c0508g2.m1245b() > 7) {
                                                c0508g2.m1263t(7);
                                                if (c0508g2.m1252i(1) != 0) {
                                                    str8 = "audio/eac3-joc";
                                                } else {
                                                    str8 = "audio/eac3";
                                                }
                                            } else {
                                                str8 = "audio/eac3";
                                            }
                                            c0508g2.m1246c();
                                            c0651s2.m1665G(c0508g2.m1249f());
                                            C0582n c0582n2 = new C0582n();
                                            c0582n2.f2102a = string2;
                                            c0582n2.f2114m = AbstractC0545H.m1364l(str8);
                                            c0582n2.f2092B = i44;
                                            c0582n2.f2093C = i42;
                                            c0582n2.f2118q = c0579k2;
                                            c0582n2.f2105d = str;
                                            c0582n2.f2110i = iM1252i4;
                                            c0368e.f1181d = new C0583o(c0582n2);
                                            i12 = i28;
                                            str5 = str10;
                                            i13 = iM1673g5;
                                            i17 = iIntValue;
                                            i16 = iIntValue2;
                                        } else {
                                            i8 = i8;
                                            int i45 = iIntValue;
                                            str7 = str12;
                                            if (iM1673g6 == 1684103988) {
                                                c0651s2.m1665G(i28 + 8);
                                                String string3 = Integer.toString(i3);
                                                C0508g c0508g3 = new C0508g();
                                                c0508g3.m1258o(c0651s2);
                                                int iM1245b2 = c0508g3.m1245b();
                                                int iM1252i6 = c0508g3.m1252i(3);
                                                if (iM1252i6 > 1) {
                                                    throw C0546I.m1367c("Unsupported AC-4 DSI version: " + iM1252i6);
                                                }
                                                int iM1252i7 = c0508g3.m1252i(7);
                                                int i46 = c0508g3.m1251h() ? 48000 : 44100;
                                                c0508g3.m1263t(4);
                                                str5 = str10;
                                                int iM1252i8 = c0508g3.m1252i(9);
                                                if (iM1252i7 > 1) {
                                                    if (iM1252i6 == 0) {
                                                        throw C0546I.m1367c("Invalid AC-4 DSI version: " + iM1252i6);
                                                    }
                                                    if (c0508g3.m1251h()) {
                                                        c0508g3.m1263t(16);
                                                        if (c0508g3.m1251h()) {
                                                            c0508g3.m1263t(128);
                                                        }
                                                    }
                                                }
                                                if (iM1252i6 == 1) {
                                                    if (c0508g3.m1245b() < 66) {
                                                        throw C0546I.m1367c("Invalid AC-4 DSI bitrate.");
                                                    }
                                                    c0508g3.m1263t(66);
                                                    c0508g3.m1246c();
                                                }
                                                C1134j c1134j = new C1134j();
                                                c1134j.f5254a = true;
                                                c1134j.f5255b = -1;
                                                c1134j.f5256c = -1;
                                                c1134j.f5257d = true;
                                                c1134j.f5258e = 2;
                                                c1134j.f5259f = 0;
                                                i13 = iM1673g5;
                                                int i47 = 0;
                                                while (true) {
                                                    if (i47 < iM1252i8) {
                                                        if (iM1252i6 == 0) {
                                                            zM1251h = c0508g3.m1251h();
                                                            iM1252i = c0508g3.m1252i(5);
                                                            iM1252i2 = c0508g3.m1252i(5);
                                                            iM1245b = 0;
                                                            z4 = false;
                                                            i12 = i28;
                                                            i22 = 0;
                                                        } else {
                                                            int i48 = iM1252i8;
                                                            int iM1252i9 = c0508g3.m1252i(8);
                                                            i12 = i28;
                                                            int iM1252i10 = c0508g3.m1252i(8);
                                                            int iM1252i11 = iM1252i10 == 255 ? c0508g3.m1252i(16) + iM1252i10 : iM1252i10;
                                                            if (iM1252i9 > 2) {
                                                                c0508g3.m1263t(iM1252i11 * 8);
                                                                i47++;
                                                                iM1252i8 = i48;
                                                                i28 = i12;
                                                            } else {
                                                                iM1245b = (iM1245b2 - c0508g3.m1245b()) / 8;
                                                                int iM1252i12 = c0508g3.m1252i(5);
                                                                z4 = iM1252i12 == 31;
                                                                iM1252i2 = iM1252i9;
                                                                iM1252i = iM1252i12;
                                                                i22 = iM1252i11;
                                                                zM1251h = false;
                                                            }
                                                        }
                                                        i18 = i45;
                                                        if (zM1251h || z4 || iM1252i != 6) {
                                                            c1134j.f5259f = c0508g3.m1252i(3);
                                                            if (c0508g3.m1251h()) {
                                                                c0508g3.m1263t(5);
                                                            }
                                                            c0508g3.m1263t(2);
                                                            if (iM1252i6 == 1 && (iM1252i2 == 1 || iM1252i2 == 2)) {
                                                                c0508g3.m1263t(2);
                                                            }
                                                            c0508g3.m1263t(5);
                                                            c0508g3.m1263t(10);
                                                            if (iM1252i6 == 1) {
                                                                if (iM1252i2 > 0) {
                                                                    c1134j.f5254a = c0508g3.m1251h();
                                                                }
                                                                if (c1134j.f5254a) {
                                                                    if (iM1252i2 != 1) {
                                                                        i23 = 2;
                                                                        if (iM1252i2 == 2) {
                                                                            iM1252i3 = c0508g3.m1252i(5);
                                                                            if (iM1252i3 >= 0 && iM1252i3 <= 15) {
                                                                                c1134j.f5255b = iM1252i3;
                                                                            }
                                                                            if (iM1252i3 >= 11 || iM1252i3 > 14) {
                                                                                i23 = 2;
                                                                            } else {
                                                                                c1134j.f5257d = c0508g3.m1251h();
                                                                                i23 = 2;
                                                                                c1134j.f5258e = c0508g3.m1252i(2);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        iM1252i3 = c0508g3.m1252i(5);
                                                                        if (iM1252i3 >= 0) {
                                                                            c1134j.f5255b = iM1252i3;
                                                                        }
                                                                        if (iM1252i3 >= 11) {
                                                                            i23 = 2;
                                                                        } else {
                                                                            i23 = 2;
                                                                        }
                                                                    }
                                                                    c0508g3.m1263t(24);
                                                                } else {
                                                                    i23 = 2;
                                                                }
                                                                if (iM1252i2 == 1 || iM1252i2 == i23) {
                                                                    if (c0508g3.m1251h() && c0508g3.m1251h()) {
                                                                        c0508g3.m1263t(i23);
                                                                    }
                                                                    if (c0508g3.m1251h()) {
                                                                        c0508g3.m1262s();
                                                                        int i49 = 8;
                                                                        int iM1252i13 = c0508g3.m1252i(8);
                                                                        int i50 = 0;
                                                                        while (i50 < iM1252i13) {
                                                                            c0508g3.m1263t(i49);
                                                                            i50++;
                                                                            i49 = 8;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (!zM1251h && !z4) {
                                                                c0508g3.m1262s();
                                                                if (iM1252i == 0 || iM1252i == 1 || iM1252i == 2) {
                                                                    if (iM1252i2 == 0) {
                                                                        for (int i51 = 0; i51 < 2; i51++) {
                                                                            AbstractC2229b.m4820o(c0508g3, c1134j);
                                                                        }
                                                                    } else {
                                                                        for (int i52 = 0; i52 < 2; i52++) {
                                                                            AbstractC2229b.m4821p(c0508g3, c1134j);
                                                                        }
                                                                    }
                                                                } else if (iM1252i == 3 || iM1252i == 4) {
                                                                    if (iM1252i2 == 0) {
                                                                        for (int i53 = 0; i53 < 3; i53++) {
                                                                            AbstractC2229b.m4820o(c0508g3, c1134j);
                                                                        }
                                                                    } else {
                                                                        for (int i54 = 0; i54 < 3; i54++) {
                                                                            AbstractC2229b.m4821p(c0508g3, c1134j);
                                                                        }
                                                                    }
                                                                } else if (iM1252i != 5) {
                                                                    int iM1252i14 = c0508g3.m1252i(7);
                                                                    for (int i55 = 0; i55 < iM1252i14; i55++) {
                                                                        c0508g3.m1263t(8);
                                                                    }
                                                                } else if (iM1252i2 == 0) {
                                                                    AbstractC2229b.m4820o(c0508g3, c1134j);
                                                                } else {
                                                                    int iM1252i15 = c0508g3.m1252i(3);
                                                                    for (int i56 = 0; i56 < iM1252i15 + 2; i56++) {
                                                                        AbstractC2229b.m4821p(c0508g3, c1134j);
                                                                    }
                                                                }
                                                            } else if (iM1252i2 == 0) {
                                                                AbstractC2229b.m4820o(c0508g3, c1134j);
                                                            } else {
                                                                AbstractC2229b.m4821p(c0508g3, c1134j);
                                                            }
                                                            c0508g3.m1262s();
                                                            zM1251h2 = c0508g3.m1251h();
                                                        } else {
                                                            iM1252i2 = iM1252i2;
                                                            zM1251h2 = true;
                                                        }
                                                        if (zM1251h2) {
                                                            int iM1252i16 = c0508g3.m1252i(7);
                                                            for (int i57 = 0; i57 < iM1252i16; i57++) {
                                                                c0508g3.m1263t(15);
                                                            }
                                                        }
                                                        if (iM1252i2 > 0) {
                                                            if (c0508g3.m1251h()) {
                                                                if (c0508g3.m1245b() < 66) {
                                                                    z5 = false;
                                                                } else {
                                                                    c0508g3.m1263t(66);
                                                                    z5 = true;
                                                                }
                                                                if (!z5) {
                                                                    throw C0546I.m1367c("Can't parse bitrate DSI.");
                                                                }
                                                            }
                                                            if (c0508g3.m1251h()) {
                                                                c0508g3.m1246c();
                                                                c0508g3.m1264u(c0508g3.m1252i(16));
                                                                int iM1252i17 = c0508g3.m1252i(5);
                                                                for (int i58 = 0; i58 < iM1252i17; i58++) {
                                                                    c0508g3.m1263t(3);
                                                                    c0508g3.m1263t(8);
                                                                }
                                                            }
                                                            i24 = 1;
                                                        } else {
                                                            i24 = 1;
                                                        }
                                                        c0508g3.m1246c();
                                                        if (iM1252i6 == i24) {
                                                            int iM1245b3 = ((iM1245b2 - c0508g3.m1245b()) / 8) - iM1245b;
                                                            if (i22 < iM1245b3) {
                                                                throw C0546I.m1367c("pres_bytes is smaller than presentation bytes read.");
                                                            }
                                                            c0508g3.m1264u(i22 - iM1245b3);
                                                        }
                                                        if (c1134j.f5254a && c1134j.f5255b == -1) {
                                                            throw C0546I.m1367c("Can't determine channel mode of presentation " + i47);
                                                        }
                                                    } else {
                                                        i18 = i45;
                                                        i12 = i28;
                                                        iIntValue2 = iIntValue2;
                                                    }
                                                    if (c1134j.f5254a) {
                                                        int i59 = c1134j.f5255b;
                                                        boolean z8 = c1134j.f5257d;
                                                        int i60 = c1134j.f5258e;
                                                        switch (i59) {
                                                            case 0:
                                                                i21 = 11;
                                                                i20 = 1;
                                                                break;
                                                            case 1:
                                                                i21 = 11;
                                                                i20 = 2;
                                                                break;
                                                            case 2:
                                                                i21 = 11;
                                                                i20 = 3;
                                                                break;
                                                            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                                                i21 = 11;
                                                                i20 = 5;
                                                                break;
                                                            case 4:
                                                                i21 = 11;
                                                                i20 = 6;
                                                                break;
                                                            case 5:
                                                            case 7:
                                                            case 9:
                                                                i21 = 11;
                                                                i20 = 7;
                                                                break;
                                                            case 6:
                                                            case 8:
                                                            case 10:
                                                                i21 = 11;
                                                                i20 = 8;
                                                                break;
                                                            case 11:
                                                                i21 = 11;
                                                                i20 = 11;
                                                                break;
                                                            case 12:
                                                                i21 = 11;
                                                                i20 = 12;
                                                                break;
                                                            case 13:
                                                                i21 = 11;
                                                                i20 = 13;
                                                                break;
                                                            case 14:
                                                                i21 = 11;
                                                                i20 = 14;
                                                                break;
                                                            case 15:
                                                                i21 = 11;
                                                                i20 = 24;
                                                                break;
                                                            default:
                                                                i21 = 11;
                                                                i20 = -1;
                                                                break;
                                                        }
                                                        if (i59 != i21 && i59 != 12) {
                                                            if (i59 == 13 || i59 == 14) {
                                                            }
                                                        }
                                                        if (!z8) {
                                                            i20 -= 2;
                                                        }
                                                        if (i60 == 0) {
                                                            i20 -= 4;
                                                        } else if (i60 == 1) {
                                                            i20 -= 2;
                                                        }
                                                    } else {
                                                        i19 = c1134j.f5256c + 1;
                                                        if (c1134j.f5259f == 4) {
                                                            i20 = i19 == 17 ? 21 : i19;
                                                        }
                                                        if (i19 > 0) {
                                                            throw C0546I.m1367c("Can't determine channel count of presentation.");
                                                        }
                                                        C0582n c0582n3 = new C0582n();
                                                        c0582n3.f2102a = string3;
                                                        c0582n3.f2114m = AbstractC0545H.m1364l("audio/ac4");
                                                        c0582n3.f2092B = i19;
                                                        c0582n3.f2093C = i46;
                                                        c0582n3.f2118q = c0579k2;
                                                        c0582n3.f2105d = str;
                                                        c0368e.f1181d = new C0583o(c0582n3);
                                                        i17 = i18;
                                                        i16 = iIntValue2;
                                                    }
                                                    i19 = i20;
                                                    if (i19 > 0) {
                                                        throw C0546I.m1367c("Can't determine channel count of presentation.");
                                                    }
                                                    C0582n c0582n4 = new C0582n();
                                                    c0582n4.f2102a = string3;
                                                    c0582n4.f2114m = AbstractC0545H.m1364l("audio/ac4");
                                                    c0582n4.f2092B = i19;
                                                    c0582n4.f2093C = i46;
                                                    c0582n4.f2118q = c0579k2;
                                                    c0582n4.f2105d = str;
                                                    c0368e.f1181d = new C0583o(c0582n4);
                                                    i17 = i18;
                                                    i16 = iIntValue2;
                                                }
                                            } else {
                                                i12 = i28;
                                                str5 = str10;
                                                i13 = iM1673g5;
                                                int i61 = iIntValue2;
                                                if (iM1673g6 == 1684892784) {
                                                    if (iM1673g <= 0) {
                                                        throw C0546I.m1365a(null, "Invalid sample rate for Dolby TrueHD MLP stream: " + iM1673g);
                                                    }
                                                    str12 = str7;
                                                    listM4120r = list;
                                                    str5 = str5;
                                                    i13 = i13;
                                                    i12 = i12;
                                                    iIntValue2 = 2;
                                                    iIntValue = iM1673g;
                                                } else if (iM1673g6 == 1684305011 || iM1673g6 == 1969517683) {
                                                    C0582n c0582n5 = new C0582n();
                                                    c0582n5.f2102a = Integer.toString(i3);
                                                    c0582n5.f2114m = AbstractC0545H.m1364l(str4);
                                                    i16 = i61;
                                                    c0582n5.f2092B = i16;
                                                    i17 = i45;
                                                    c0582n5.f2093C = i17;
                                                    c0582n5.f2118q = c0579k2;
                                                    c0582n5.f2105d = str;
                                                    c0368e.f1181d = new C0583o(c0582n5);
                                                } else if (iM1673g6 == 1682927731) {
                                                    int i62 = i13 - 8;
                                                    byte[] bArr6 = f1191a;
                                                    byte[] bArrCopyOf = Arrays.copyOf(bArr6, bArr6.length + i62);
                                                    c0651s2.m1665G(i12 + 8);
                                                    c0651s2.m1671e(bArrCopyOf, bArr6.length, i62);
                                                    listM4120r = AbstractC2229b.m4806a(bArrCopyOf);
                                                    str12 = str7;
                                                    str5 = str5;
                                                    i13 = i13;
                                                    i12 = i12;
                                                    iIntValue = i45;
                                                    iIntValue2 = i61;
                                                } else if (iM1673g6 == 1684425825) {
                                                    byte[] bArr7 = new byte[i13 - 8];
                                                    bArr7[0] = 102;
                                                    bArr7[1] = 76;
                                                    bArr7[2] = 97;
                                                    bArr7[3] = 67;
                                                    c0651s2.m1665G(i12 + 12);
                                                    c0651s2.m1671e(bArr7, 4, i13 - 12);
                                                    listM4120r = AbstractC1676G.m4120r(bArr7);
                                                    str12 = str7;
                                                    iIntValue = i45;
                                                    iIntValue2 = i61;
                                                } else if (iM1673g6 == 1634492771) {
                                                    int i63 = i13 - 12;
                                                    byte[] bArr8 = new byte[i63];
                                                    c0651s2.m1665G(i12 + 12);
                                                    c0651s2.m1671e(bArr8, 0, i63);
                                                    byte[] bArr9 = AbstractC0633a.f2468a;
                                                    C0651s c0651s4 = new C0651s(bArr8);
                                                    c0651s4.m1665G(9);
                                                    int iM1687u5 = c0651s4.m1687u();
                                                    c0651s4.m1665G(20);
                                                    Pair pairCreate = Pair.create(Integer.valueOf(c0651s4.m1691y()), Integer.valueOf(iM1687u5));
                                                    iIntValue = ((Integer) pairCreate.first).intValue();
                                                    str12 = str7;
                                                    iIntValue2 = ((Integer) pairCreate.second).intValue();
                                                    listM4120r = AbstractC1676G.m4120r(bArr8);
                                                } else if (iM1673g6 == 1767990114) {
                                                    c0651s2.m1665G(i12 + 9);
                                                    long j4 = 0;
                                                    for (int i64 = 0; i64 < 9; i64++) {
                                                        if (c0651s2.f2521b == c0651s2.f2522c) {
                                                            throw new IllegalStateException("Attempting to read a byte over the limit.");
                                                        }
                                                        long jM1687u = c0651s2.m1687u();
                                                        j4 |= (jM1687u & 127) << (i64 * 7);
                                                        if ((jM1687u & 128) == 0) {
                                                            int iM3312e = AbstractC1303m.m3312e(j4);
                                                            byte[] bArr10 = new byte[iM3312e];
                                                            c0651s2.m1671e(bArr10, 0, iM3312e);
                                                            listM4120r = AbstractC1676G.m4120r(bArr10);
                                                            str12 = str7;
                                                            str5 = str5;
                                                            i13 = i13;
                                                            i12 = i12;
                                                            iIntValue = i45;
                                                            iIntValue2 = i61;
                                                        }
                                                    }
                                                    int iM3312e2 = AbstractC1303m.m3312e(j4);
                                                    byte[] bArr11 = new byte[iM3312e2];
                                                    c0651s2.m1671e(bArr11, 0, iM3312e2);
                                                    listM4120r = AbstractC1676G.m4120r(bArr11);
                                                    str12 = str7;
                                                    str5 = str5;
                                                    i13 = i13;
                                                    i12 = i12;
                                                    iIntValue = i45;
                                                    iIntValue2 = i61;
                                                } else {
                                                    i17 = i45;
                                                    i16 = i61;
                                                }
                                            }
                                        }
                                    }
                                    iIntValue2 = i16;
                                    str12 = str7;
                                    listM4120r = list;
                                    str5 = str5;
                                    i13 = i13;
                                    i12 = i12;
                                    iIntValue = i17;
                                }
                                i28 = i12 + i13;
                                c0651s2 = c0651s;
                                str10 = str5;
                                iM1673g3 = i29;
                                c0365b = c0365b2;
                                str9 = str3;
                                str11 = str4;
                                i8 = i8;
                            }
                            i8 = i8;
                            str4 = str11;
                            str5 = str10;
                            i13 = iM1673g5;
                            i12 = i28;
                            i28 = i12 + i13;
                            c0651s2 = c0651s;
                            str10 = str5;
                            iM1673g3 = i29;
                            c0365b = c0365b2;
                            str9 = str3;
                            str11 = str4;
                            i8 = i8;
                        }
                        str9 = str9;
                        int i65 = i8;
                        String str15 = str11;
                        List list3 = listM4120r;
                        C0365b c0365b3 = c0365b;
                        i9 = iM1673g3;
                        int i66 = iIntValue2;
                        int i67 = iIntValue;
                        String str16 = str12;
                        if (((C0583o) c0368e.f1181d) == null && str15 != null) {
                            C0582n c0582n6 = new C0582n();
                            c0582n6.f2102a = Integer.toString(i3);
                            c0582n6.f2114m = AbstractC0545H.m1364l(str15);
                            c0582n6.f2111j = str16;
                            c0582n6.f2092B = i66;
                            c0582n6.f2093C = i67;
                            c0582n6.f2094D = i65;
                            c0582n6.f2117p = list3;
                            c0582n6.f2118q = c0579k2;
                            c0582n6.f2105d = str;
                            if (c0365b3 != null) {
                                c0582n6.f2109h = AbstractC1303m.m3281D(c0365b3.f1171c);
                                c0582n6.f2110i = AbstractC1303m.m3281D(c0365b3.f1172d);
                            }
                            c0368e.f1181d = new C0583o(c0582n6);
                        }
                        c0651s2 = c0651s;
                        c0368e = c0368e;
                        i26 = i10;
                        iM1673g3 = i9;
                    } else {
                        if (iM1673g4 == 1414810956 || iM1673g4 == 1954034535 || iM1673g4 == 2004251764 || iM1673g4 == 1937010800 || iM1673g4 == 1664495672) {
                            c0651s2.m1665G(i26 + 16);
                            String str17 = "application/ttml+xml";
                            if (iM1673g4 == 1414810956) {
                                j3 = Long.MAX_VALUE;
                                c1692xM4120r = null;
                            } else if (iM1673g4 == 1954034535) {
                                int i68 = iM1673g3 - 16;
                                byte[] bArr12 = new byte[i68];
                                c0651s2.m1671e(bArr12, 0, i68);
                                c1692xM4120r = AbstractC1676G.m4120r(bArr12);
                                str17 = "application/x-quicktime-tx3g";
                                j3 = Long.MAX_VALUE;
                            } else {
                                if (iM1673g4 == 2004251764) {
                                    str17 = "application/x-mp4-vtt";
                                } else {
                                    if (iM1673g4 == 1937010800) {
                                        j3 = 0;
                                    } else {
                                        if (iM1673g4 != 1664495672) {
                                            throw new IllegalStateException();
                                        }
                                        c0368e.f1179b = 1;
                                        str17 = "application/x-mp4-cea-608";
                                    }
                                    c1692xM4120r = null;
                                }
                                j3 = Long.MAX_VALUE;
                                c1692xM4120r = null;
                            }
                            C0582n c0582n7 = new C0582n();
                            c0582n7.f2102a = Integer.toString(i3);
                            c0582n7.f2114m = AbstractC0545H.m1364l(str17);
                            c0582n7.f2105d = str;
                            c0582n7.f2119r = j3;
                            c0582n7.f2117p = c1692xM4120r;
                            c0368e.f1181d = new C0583o(c0582n7);
                        } else if (iM1673g4 == 1835365492) {
                            c0651s2.m1665G(i26 + 16);
                            if (iM1673g4 == 1835365492) {
                                c0651s2.m1682p();
                                String strM1682p = c0651s2.m1682p();
                                if (strM1682p != null) {
                                    C0582n c0582n8 = new C0582n();
                                    c0582n8.f2102a = Integer.toString(i3);
                                    c0582n8.f2114m = AbstractC0545H.m1364l(strM1682p);
                                    c0368e.f1181d = new C0583o(c0582n8);
                                }
                            }
                        } else if (iM1673g4 == 1667329389) {
                            C0582n c0582n9 = new C0582n();
                            c0582n9.f2102a = Integer.toString(i3);
                            c0582n9.f2114m = AbstractC0545H.m1364l("application/x-camera-motion");
                            c0368e.f1181d = new C0583o(c0582n9);
                        }
                        str9 = str9;
                        iM1673g2 = iM1673g2;
                        c0368e = c0368e;
                        i26 = i26;
                        iM1673g3 = iM1673g3;
                        i5 = i25;
                    }
                }
                c0651s2.m1665G(i26 + iM1673g3);
                i25 = i5 + 1;
                c0368e = c0368e;
                iM1673g2 = iM1673g2;
                str9 = str9;
            }
            m1030h(c0651s2, iM1673g4, i26, iM1673g3, i3, i4, c0579k, c0368e, i25);
            i5 = i25;
            c0651s2.m1665G(i26 + iM1673g3);
            i25 = i5 + 1;
            c0368e = c0368e;
            iM1673g2 = iM1673g2;
            str9 = str9;
        }
        return c0368e;
    }

    /* JADX WARN: Failed to calculate best type for var: r15v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r25v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r25v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r25v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r25v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v2 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v0 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    /* JADX INFO: renamed from: g */
    public static java.util.ArrayList m1029g(p067X.C0670b r69, p145s0.C2247t r70, long r71, p055T.C0579k r73, boolean r74, boolean r75, p101g2.InterfaceC1583d r76) {
        /*
            Method dump skipped, instruction units count: 2367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p036M0.AbstractC0371h.m1029g(X.b, s0.t, long, T.k, boolean, boolean, g2.d):java.util.ArrayList");
    }

    /* JADX WARN: Code duplicated, block: B:223:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:225:0x051a  */
    /* JADX WARN: Code duplicated, block: B:227:0x0520  */
    /* JADX WARN: Code duplicated, block: B:228:0x052f  */
    /* JADX WARN: Code duplicated, block: B:233:0x0551  */
    /* JADX WARN: Code duplicated, block: B:235:0x055f  */
    /* JADX WARN: Code duplicated, block: B:236:0x056e  */
    /* JADX WARN: Code duplicated, block: B:238:0x0574  */
    /* JADX WARN: Code duplicated, block: B:239:0x0583  */
    /* JADX WARN: Code duplicated, block: B:241:0x0589  */
    /* JADX WARN: Code duplicated, block: B:242:0x0599  */
    /* JADX WARN: Code duplicated, block: B:244:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:246:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:250:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:251:0x05da  */
    /* JADX WARN: Code duplicated, block: B:254:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:257:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:258:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:260:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:264:0x0604  */
    /* JADX WARN: Code duplicated, block: B:265:0x0609  */
    /* JADX WARN: Code duplicated, block: B:268:0x0614 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:272:0x061c  */
    /* JADX WARN: Code duplicated, block: B:275:0x0624  */
    /* JADX WARN: Code duplicated, block: B:278:0x062b  */
    /* JADX WARN: Code duplicated, block: B:280:0x063b  */
    /* JADX WARN: Code duplicated, block: B:282:0x0640 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:285:0x0646  */
    /* JADX WARN: Code duplicated, block: B:289:0x0655  */
    /* JADX WARN: Code duplicated, block: B:290:0x0657  */
    /* JADX WARN: Code duplicated, block: B:292:0x0665  */
    /* JADX WARN: Code duplicated, block: B:414:0x05b0 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:223:0x04f6, please report this as an issue */
    /* JADX INFO: renamed from: h */
    public static void m1030h(C0651s c0651s, int i3, int i4, int i5, int i6, int i7, C0579k c0579k, C0368e c0368e, int i8) throws C0546I {
        int iM1440g;
        C0579k c0579k2;
        String str;
        int i9;
        String str2;
        List list;
        int i10;
        int i11;
        int i12;
        int iM1252i;
        boolean zM1251h;
        int iM1252i2;
        int iM1252i3;
        int i13;
        int i14;
        boolean zM1251h2;
        int i15;
        int iM1252i4;
        int i16;
        boolean z3;
        int i17;
        int iM1440g2;
        C0573f c0573f;
        int iM1252i5;
        int i18;
        int iM1252i6;
        int i19;
        C0573f c0573f2;
        int iM1440g3;
        int i20;
        int i21;
        C0031d c0031d;
        int i22;
        int i23 = i4;
        int i24 = i5;
        C0579k c0579kM1444d = c0579k;
        C0368e c0368e2 = c0368e;
        char c = 7;
        char c2 = 5;
        c0651s.m1665G(i23 + 16);
        c0651s.m1666H(16);
        int iM1659A = c0651s.m1659A();
        int iM1659A2 = c0651s.m1659A();
        char c3 = 6;
        c0651s.m1666H(50);
        int i25 = c0651s.f2521b;
        byte b3 = 3;
        int iIntValue = i3;
        if (iIntValue == 1701733238) {
            Pair pairM1027e = m1027e(c0651s, i23, i24);
            if (pairM1027e != null) {
                iIntValue = ((Integer) pairM1027e.first).intValue();
                c0579kM1444d = c0579kM1444d == null ? null : c0579kM1444d.m1444d(((C0385v) pairM1027e.second).f1315b);
                ((C0385v[]) c0368e2.f1180c)[i8] = (C0385v) pairM1027e.second;
            }
            c0651s.m1665G(i25);
        }
        String str3 = "video/3gpp";
        String str4 = iIntValue == 1831958048 ? "video/mpeg" : iIntValue == 1211250227 ? "video/3gpp" : null;
        C0536b c0536b = null;
        ByteBuffer byteBufferOrder = null;
        float fM1691y = 1.0f;
        List listM4120r = null;
        String str5 = null;
        byte[] bArrCopyOfRange = null;
        int i26 = -1;
        int i27 = -1;
        int iM1439f = -1;
        int i28 = -1;
        int i29 = -1;
        int i30 = 8;
        int i31 = 8;
        C0365b c0365b = null;
        boolean z4 = false;
        while (i25 - i23 < i24) {
            c0651s.m1665G(i25);
            int i32 = c0651s.f2521b;
            int iM1673g = c0651s.m1673g();
            if (iM1673g == 0 && c0651s.f2521b - i23 == i24) {
                break;
            }
            String str6 = "childAtomSize must be positive";
            AbstractC2229b.m4808c("childAtomSize must be positive", iM1673g > 0);
            int iM1673g2 = c0651s.m1673g();
            if (iM1673g2 == 1635148611) {
                AbstractC2229b.m4808c(null, str4 == null);
                c0651s.m1665G(i32 + 8);
                C2230c c2230cM4829a = C2230c.m4829a(c0651s);
                c0368e2.f1178a = c2230cM4829a.f9591b;
                if (!z4) {
                    fM1691y = c2230cM4829a.f9600k;
                }
                ArrayList arrayList = c2230cM4829a.f9590a;
                String str7 = c2230cM4829a.f9601l;
                int i33 = c2230cM4829a.f9599j;
                int i34 = c2230cM4829a.f9596g;
                int i35 = c2230cM4829a.f9597h;
                int i36 = c2230cM4829a.f9598i;
                int i37 = c2230cM4829a.f9594e;
                i31 = c2230cM4829a.f9595f;
                i30 = i37;
                c0579k2 = c0579kM1444d;
                i25 = i25;
                str = str3;
                iM1439f = i34;
                i28 = i35;
                i9 = i26;
                iM1440g = i36;
                listM4120r = arrayList;
                str4 = "video/avc";
                str5 = str7;
                iIntValue = iIntValue;
                i27 = i33;
            } else if (iM1673g2 == 1752589123) {
                AbstractC2229b.m4808c(null, str4 == null);
                c0651s.m1665G(i32 + 8);
                C2248u c2248uM4844a = C2248u.m4844a(c0651s, false, null);
                c0368e2.f1178a = c2248uM4844a.f9662b;
                if (!z4) {
                    fM1691y = c2248uM4844a.f9669i;
                }
                int i38 = c2248uM4844a.f9668h;
                if (i38 != -1) {
                    i26 = i38;
                }
                List list2 = c2248uM4844a.f9661a;
                int i39 = c2248uM4844a.f9670j;
                String str8 = c2248uM4844a.f9671k;
                int i40 = c2248uM4844a.f9665e;
                int i41 = c2248uM4844a.f9666f;
                listM4120r = list2;
                int i42 = c2248uM4844a.f9667g;
                int i43 = c2248uM4844a.f9663c;
                i31 = c2248uM4844a.f9664d;
                c0579k2 = c0579kM1444d;
                i25 = i25;
                str = str3;
                iM1439f = i40;
                i28 = i41;
                i9 = i26;
                i30 = i43;
                i27 = i39;
                c0536b = c2248uM4844a.f9672l;
                iIntValue = iIntValue;
                str4 = "video/hevc";
                iM1440g = i42;
                str5 = str8;
            } else if (iM1673g2 == 1818785347) {
                AbstractC2229b.m4808c("lhvC must follow hvcC atom", "video/hevc".equals(str4));
                AbstractC2229b.m4808c("must have at least two layers", c0536b != null && ((AbstractC1676G) c0536b.f1867g).size() >= 2);
                c0651s.m1665G(i32 + 8);
                c0536b.getClass();
                C2248u c2248uM4844a2 = C2248u.m4844a(c0651s, true, c0536b);
                AbstractC2229b.m4808c("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", c0368e2.f1178a == c2248uM4844a2.f9662b);
                int i44 = c2248uM4844a2.f9665e;
                int i45 = iM1439f;
                if (i44 != -1) {
                    AbstractC2229b.m4808c("colorSpace must be the same for both views", i45 == i44);
                }
                int i46 = c2248uM4844a2.f9666f;
                int i47 = i28;
                if (i46 != -1) {
                    AbstractC2229b.m4808c("colorRange must be the same for both views", i47 == i46);
                }
                int i48 = c2248uM4844a2.f9667g;
                if (i48 != -1) {
                    i22 = i29;
                    AbstractC2229b.m4808c("colorTransfer must be the same for both views", i22 == i48);
                } else {
                    i22 = i29;
                }
                int i49 = i30;
                int i50 = i22;
                AbstractC2229b.m4808c("bitdepthLuma must be the same for both views", i49 == c2248uM4844a2.f9663c);
                int i51 = i31;
                AbstractC2229b.m4808c("bitdepthChroma must be the same for both views", i51 == c2248uM4844a2.f9664d);
                List list3 = listM4120r;
                if (list3 != null) {
                    C1673D c1673dM4116m = AbstractC1676G.m4116m();
                    c1673dM4116m.m4104c(list3);
                    c1673dM4116m.m4104c(c2248uM4844a2.f9661a);
                    listM4120r = c1673dM4116m.m4112f();
                } else {
                    AbstractC2229b.m4808c("initializationData must be already set from hvcC atom", false);
                    listM4120r = list3;
                }
                str5 = c2248uM4844a2.f9671k;
                iM1440g = i50;
                str4 = "video/mv-hevc";
                c0579k2 = c0579kM1444d;
                i28 = i47;
                str = str3;
                i30 = i49;
                i9 = i26;
                i31 = i51;
                iM1439f = i45;
                iIntValue = iIntValue;
            } else {
                String str9 = str4;
                i25 = i25;
                listM4120r = listM4120r;
                iM1439f = iM1439f;
                iM1440g = i29;
                i30 = i30;
                i31 = i31;
                if (iM1673g2 == 1986361461) {
                    c0651s.m1665G(i32 + 8);
                    int i52 = c0651s.f2521b;
                    str = str3;
                    C0031d c0031d2 = null;
                    while (i52 - i32 < iM1673g) {
                        c0651s.m1665G(i52);
                        int iM1673g3 = c0651s.m1673g();
                        int i53 = i52;
                        AbstractC2229b.m4808c(str6, iM1673g3 > 0);
                        if (c0651s.m1673g() == 1702454643) {
                            c0651s.m1665G(i53 + 8);
                            int i54 = c0651s.f2521b;
                            while (true) {
                                if (i54 - i53 >= iM1673g3) {
                                    c0031d = null;
                                    break;
                                }
                                c0651s.m1665G(i54);
                                int iM1673g4 = c0651s.m1673g();
                                AbstractC2229b.m4808c(str6, iM1673g4 > 0);
                                int i55 = i54;
                                if (c0651s.m1673g() == 1937011305) {
                                    c0651s.m1666H(4);
                                    int iM1687u = c0651s.m1687u();
                                    boolean z5 = (iM1687u & 1) == 1;
                                    boolean z6 = (iM1687u & 2) == 2;
                                    boolean z7 = (iM1687u & 8) == 8;
                                    C0367d c0367d = new C0367d();
                                    c0367d.f1175a = z5;
                                    c0367d.f1176b = z6;
                                    c0367d.f1177c = z7;
                                    c0031d = new C0031d(12, c0367d);
                                    break;
                                }
                                i54 = i55 + iM1673g4;
                            }
                            c0031d2 = c0031d;
                        } else {
                            c0579kM1444d = c0579kM1444d;
                            str6 = str6;
                            iM1673g3 = iM1673g3;
                        }
                        i52 = i53 + iM1673g3;
                        str6 = str6;
                        c0579kM1444d = c0579kM1444d;
                    }
                    c0579k2 = c0579kM1444d;
                    C0031d c0031d3 = c0031d2 == null ? null : new C0031d(13, c0031d2);
                    if (c0031d3 != null) {
                        C0367d c0367d2 = (C0367d) ((C0031d) c0031d3.f38h).f38h;
                        if (c0536b == null || ((AbstractC1676G) c0536b.f1867g).size() < 2) {
                            i20 = i26;
                            i21 = i20 == -1 ? c0367d2.f1177c ? 5 : 4 : i20;
                        } else {
                            AbstractC2229b.m4808c("both eye views must be marked as available", c0367d2.f1175a && c0367d2.f1176b);
                            AbstractC2229b.m4808c("for MV-HEVC, eye_views_reversed must be set to false", !c0367d2.f1177c);
                            i20 = i26;
                        }
                    } else {
                        i20 = i26;
                    }
                    i9 = i21;
                } else {
                    c0579k2 = c0579kM1444d;
                    str = str3;
                    i9 = i26;
                    if (iM1673g2 == 1685480259 || iM1673g2 == 1685485123) {
                        i9 = i9;
                        iIntValue = iIntValue;
                        C0536b c0536b2 = c0536b;
                        C0924n c0924nM2411b = C0924n.m2411b(c0651s);
                        if (c0924nM2411b != null) {
                            str2 = "video/dolby-vision";
                            str5 = c0924nM2411b.f4016g;
                        } else {
                            str2 = str9;
                        }
                        c0536b = c0536b2;
                        i30 = i30;
                        listM4120r = listM4120r;
                        i31 = i31;
                        iM1439f = iM1439f;
                        iM1440g = iM1440g;
                        str4 = str2;
                    } else {
                        if (iM1673g2 == 1987076931) {
                            AbstractC2229b.m4808c(null, str9 == null);
                            String str10 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                            c0651s.m1665G(i32 + 12);
                            byte bM1687u = (byte) c0651s.m1687u();
                            byte bM1687u2 = (byte) c0651s.m1687u();
                            int iM1687u2 = c0651s.m1687u();
                            int i56 = iM1687u2 >> 4;
                            byte b4 = (byte) ((iM1687u2 >> 1) & 7);
                            if (str10.equals("video/x-vnd.on2.vp9")) {
                                byte[] bArr = AbstractC0633a.f2468a;
                                byte[] bArr2 = new byte[12];
                                bArr2[0] = 1;
                                bArr2[1] = 1;
                                bArr2[2] = bM1687u;
                                bArr2[b3] = 2;
                                bArr2[4] = 1;
                                bArr2[c2] = bM1687u2;
                                bArr2[c3] = b3;
                                bArr2[c] = 1;
                                bArr2[8] = (byte) i56;
                                bArr2[9] = 4;
                                bArr2[10] = 1;
                                bArr2[11] = b4;
                                listM4120r = AbstractC1676G.m4120r(bArr2);
                            } else {
                                listM4120r = listM4120r;
                            }
                            boolean z8 = (iM1687u2 & 1) != 0;
                            int iM1687u3 = c0651s.m1687u();
                            int iM1687u4 = c0651s.m1687u();
                            iM1439f = C0573f.m1439f(iM1687u3);
                            i28 = z8 ? 1 : 2;
                            iM1440g3 = C0573f.m1440g(iM1687u4);
                            str4 = str10;
                            i30 = i56;
                            i31 = i30;
                        } else if (iM1673g2 == 1635135811) {
                            int i57 = iM1673g - 8;
                            byte[] bArr3 = new byte[i57];
                            c0651s.m1671e(bArr3, 0, i57);
                            listM4120r = AbstractC1676G.m4120r(bArr3);
                            c0651s.m1665G(i32 + 8);
                            byte[] bArr4 = c0651s.f2520a;
                            C0508g c0508g = new C0508g(bArr4, bArr4.length);
                            c0508g.m1260q(c0651s.f2521b * 8);
                            c0508g.m1264u(1);
                            int iM1252i7 = c0508g.m1252i(3);
                            c0508g.m1263t(6);
                            boolean zM1251h3 = c0508g.m1251h();
                            boolean zM1251h4 = c0508g.m1251h();
                            int i58 = -1;
                            if (iM1252i7 == 2 && zM1251h3) {
                                i11 = zM1251h4 ? 12 : 10;
                                i12 = zM1251h4 ? 12 : 10;
                            } else {
                                if (iM1252i7 <= 2) {
                                    int i59 = zM1251h3 ? 10 : 8;
                                    i12 = zM1251h3 ? 10 : 8;
                                    i11 = i59;
                                } else {
                                    i10 = 13;
                                    i11 = -1;
                                    i12 = -1;
                                }
                                c0508g.m1263t(i10);
                                c0508g.m1262s();
                                iM1252i = c0508g.m1252i(4);
                                if (iM1252i != 1) {
                                    AbstractC0646n.m1639q("BoxParsers", "Unsupported obu_type: " + iM1252i);
                                    c0573f2 = new C0573f(-1, -1, -1, i11, i12, null);
                                } else if (c0508g.m1251h()) {
                                    AbstractC0646n.m1639q("BoxParsers", "Unsupported obu_extension_flag");
                                    c0573f2 = new C0573f(-1, -1, -1, i11, i12, null);
                                } else {
                                    zM1251h = c0508g.m1251h();
                                    c0508g.m1262s();
                                    if (zM1251h || c0508g.m1252i(8) <= 127) {
                                        iM1252i2 = c0508g.m1252i(3);
                                        c0508g.m1262s();
                                        if (c0508g.m1251h()) {
                                            AbstractC0646n.m1639q("BoxParsers", "Unsupported reduced_still_picture_header");
                                            c0573f2 = new C0573f(-1, -1, -1, i11, i12, null);
                                        } else if (c0508g.m1251h()) {
                                            AbstractC0646n.m1639q("BoxParsers", "Unsupported timing_info_present_flag");
                                            c0573f2 = new C0573f(-1, -1, -1, i11, i12, null);
                                        } else {
                                            if (c0508g.m1251h()) {
                                                AbstractC0646n.m1639q("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                c0573f2 = new C0573f(-1, -1, -1, i11, i12, null);
                                            } else {
                                                iM1252i3 = c0508g.m1252i(5);
                                                for (i13 = 0; i13 <= iM1252i3; i13++) {
                                                    c0508g.m1263t(12);
                                                    if (c0508g.m1252i(5) > 7) {
                                                        c0508g.m1262s();
                                                    }
                                                }
                                                int iM1252i8 = c0508g.m1252i(4);
                                                int iM1252i9 = c0508g.m1252i(4);
                                                c0508g.m1263t(iM1252i8 + 1);
                                                c0508g.m1263t(iM1252i9 + 1);
                                                if (c0508g.m1251h()) {
                                                    i14 = 7;
                                                    c0508g.m1263t(7);
                                                } else {
                                                    i14 = 7;
                                                }
                                                c0508g.m1263t(i14);
                                                zM1251h2 = c0508g.m1251h();
                                                if (zM1251h2) {
                                                    c0508g.m1263t(2);
                                                }
                                                if (c0508g.m1251h()) {
                                                    i15 = 1;
                                                    iM1252i4 = 2;
                                                } else {
                                                    i15 = 1;
                                                    iM1252i4 = c0508g.m1252i(1);
                                                }
                                                if (iM1252i4 > 0 && !c0508g.m1251h()) {
                                                    c0508g.m1263t(i15);
                                                }
                                                if (zM1251h2) {
                                                    i16 = 3;
                                                    c0508g.m1263t(3);
                                                } else {
                                                    i16 = 3;
                                                }
                                                c0508g.m1263t(i16);
                                                boolean zM1251h5 = c0508g.m1251h();
                                                if (iM1252i2 == 2 && zM1251h5) {
                                                    c0508g.m1262s();
                                                }
                                                if (iM1252i2 == 1 && c0508g.m1251h()) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                if (c0508g.m1251h()) {
                                                    iM1252i5 = c0508g.m1252i(8);
                                                    int iM1252i10 = c0508g.m1252i(8);
                                                    int iM1252i11 = c0508g.m1252i(8);
                                                    if (z3) {
                                                        i18 = 1;
                                                    } else {
                                                        i18 = 1;
                                                        if (iM1252i5 != 1 && iM1252i10 == 13 && iM1252i11 == 0) {
                                                            iM1252i6 = 1;
                                                        }
                                                        int iM1439f2 = C0573f.m1439f(iM1252i5);
                                                        if (iM1252i6 == i18) {
                                                            i19 = 1;
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        i17 = iM1439f2;
                                                        i58 = i19;
                                                        iM1440g2 = C0573f.m1440g(iM1252i10);
                                                    }
                                                    iM1252i6 = c0508g.m1252i(i18);
                                                    int iM1439f3 = C0573f.m1439f(iM1252i5);
                                                    if (iM1252i6 == i18) {
                                                        i19 = 1;
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    i17 = iM1439f3;
                                                    i58 = i19;
                                                    iM1440g2 = C0573f.m1440g(iM1252i10);
                                                } else {
                                                    i17 = -1;
                                                    iM1440g2 = -1;
                                                }
                                                c0573f = new C0573f(i17, i58, iM1440g2, i11, i12, null);
                                            }
                                            int i60 = c0573f.f2067e;
                                            int i61 = c0573f.f2068f;
                                            int i62 = c0573f.f2063a;
                                            int i63 = c0573f.f2064b;
                                            iM1440g3 = c0573f.f2065c;
                                            iM1439f = i62;
                                            i30 = i60;
                                            i28 = i63;
                                            i31 = i61;
                                            c = 7;
                                            str4 = "video/av01";
                                        }
                                    } else {
                                        AbstractC0646n.m1639q("BoxParsers", "Excessive obu_size");
                                        c0573f2 = new C0573f(-1, -1, -1, i11, i12, null);
                                    }
                                }
                                c0573f = c0573f2;
                                int i64 = c0573f.f2067e;
                                int i65 = c0573f.f2068f;
                                int i66 = c0573f.f2063a;
                                int i67 = c0573f.f2064b;
                                iM1440g3 = c0573f.f2065c;
                                iM1439f = i66;
                                i30 = i64;
                                i28 = i67;
                                i31 = i65;
                                c = 7;
                                str4 = "video/av01";
                            }
                            i10 = 13;
                            c0508g.m1263t(i10);
                            c0508g.m1262s();
                            iM1252i = c0508g.m1252i(4);
                            if (iM1252i != 1) {
                                AbstractC0646n.m1639q("BoxParsers", "Unsupported obu_type: " + iM1252i);
                                c0573f2 = new C0573f(-1, -1, -1, i11, i12, null);
                            } else if (c0508g.m1251h()) {
                                AbstractC0646n.m1639q("BoxParsers", "Unsupported obu_extension_flag");
                                c0573f2 = new C0573f(-1, -1, -1, i11, i12, null);
                            } else {
                                zM1251h = c0508g.m1251h();
                                c0508g.m1262s();
                                if (zM1251h) {
                                    iM1252i2 = c0508g.m1252i(3);
                                    c0508g.m1262s();
                                    if (c0508g.m1251h()) {
                                        AbstractC0646n.m1639q("BoxParsers", "Unsupported reduced_still_picture_header");
                                        c0573f2 = new C0573f(-1, -1, -1, i11, i12, null);
                                    } else if (c0508g.m1251h()) {
                                        AbstractC0646n.m1639q("BoxParsers", "Unsupported timing_info_present_flag");
                                        c0573f2 = new C0573f(-1, -1, -1, i11, i12, null);
                                    } else if (c0508g.m1251h()) {
                                        AbstractC0646n.m1639q("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                        c0573f2 = new C0573f(-1, -1, -1, i11, i12, null);
                                    } else {
                                        iM1252i3 = c0508g.m1252i(5);
                                        while (i13 <= iM1252i3) {
                                            c0508g.m1263t(12);
                                            if (c0508g.m1252i(5) > 7) {
                                                c0508g.m1262s();
                                            }
                                        }
                                        int iM1252i12 = c0508g.m1252i(4);
                                        int iM1252i13 = c0508g.m1252i(4);
                                        c0508g.m1263t(iM1252i12 + 1);
                                        c0508g.m1263t(iM1252i13 + 1);
                                        if (c0508g.m1251h()) {
                                            i14 = 7;
                                            c0508g.m1263t(7);
                                        } else {
                                            i14 = 7;
                                        }
                                        c0508g.m1263t(i14);
                                        zM1251h2 = c0508g.m1251h();
                                        if (zM1251h2) {
                                            c0508g.m1263t(2);
                                        }
                                        if (c0508g.m1251h()) {
                                            i15 = 1;
                                            iM1252i4 = 2;
                                        } else {
                                            i15 = 1;
                                            iM1252i4 = c0508g.m1252i(1);
                                        }
                                        if (iM1252i4 > 0) {
                                            c0508g.m1263t(i15);
                                        }
                                        if (zM1251h2) {
                                            i16 = 3;
                                            c0508g.m1263t(3);
                                        } else {
                                            i16 = 3;
                                        }
                                        c0508g.m1263t(i16);
                                        boolean zM1251h6 = c0508g.m1251h();
                                        if (iM1252i2 == 2) {
                                            c0508g.m1262s();
                                        }
                                        if (iM1252i2 == 1) {
                                            z3 = false;
                                        } else {
                                            z3 = false;
                                        }
                                        if (c0508g.m1251h()) {
                                            iM1252i5 = c0508g.m1252i(8);
                                            int iM1252i14 = c0508g.m1252i(8);
                                            int iM1252i15 = c0508g.m1252i(8);
                                            if (z3) {
                                                i18 = 1;
                                                if (iM1252i5 != 1) {
                                                }
                                                int iM1439f4 = C0573f.m1439f(iM1252i5);
                                                if (iM1252i6 == i18) {
                                                    i19 = 1;
                                                } else {
                                                    i19 = 2;
                                                }
                                                i17 = iM1439f4;
                                                i58 = i19;
                                                iM1440g2 = C0573f.m1440g(iM1252i14);
                                            } else {
                                                i18 = 1;
                                            }
                                            iM1252i6 = c0508g.m1252i(i18);
                                            int iM1439f5 = C0573f.m1439f(iM1252i5);
                                            if (iM1252i6 == i18) {
                                                i19 = 1;
                                            } else {
                                                i19 = 2;
                                            }
                                            i17 = iM1439f5;
                                            i58 = i19;
                                            iM1440g2 = C0573f.m1440g(iM1252i14);
                                        } else {
                                            i17 = -1;
                                            iM1440g2 = -1;
                                        }
                                        c0573f = new C0573f(i17, i58, iM1440g2, i11, i12, null);
                                    }
                                } else {
                                    iM1252i2 = c0508g.m1252i(3);
                                    c0508g.m1262s();
                                    if (c0508g.m1251h()) {
                                        AbstractC0646n.m1639q("BoxParsers", "Unsupported reduced_still_picture_header");
                                        c0573f2 = new C0573f(-1, -1, -1, i11, i12, null);
                                    } else if (c0508g.m1251h()) {
                                        AbstractC0646n.m1639q("BoxParsers", "Unsupported timing_info_present_flag");
                                        c0573f2 = new C0573f(-1, -1, -1, i11, i12, null);
                                    } else if (c0508g.m1251h()) {
                                        AbstractC0646n.m1639q("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                        c0573f2 = new C0573f(-1, -1, -1, i11, i12, null);
                                    } else {
                                        iM1252i3 = c0508g.m1252i(5);
                                        while (i13 <= iM1252i3) {
                                            c0508g.m1263t(12);
                                            if (c0508g.m1252i(5) > 7) {
                                                c0508g.m1262s();
                                            }
                                        }
                                        int iM1252i16 = c0508g.m1252i(4);
                                        int iM1252i17 = c0508g.m1252i(4);
                                        c0508g.m1263t(iM1252i16 + 1);
                                        c0508g.m1263t(iM1252i17 + 1);
                                        if (c0508g.m1251h()) {
                                            i14 = 7;
                                            c0508g.m1263t(7);
                                        } else {
                                            i14 = 7;
                                        }
                                        c0508g.m1263t(i14);
                                        zM1251h2 = c0508g.m1251h();
                                        if (zM1251h2) {
                                            c0508g.m1263t(2);
                                        }
                                        if (c0508g.m1251h()) {
                                            i15 = 1;
                                            iM1252i4 = 2;
                                        } else {
                                            i15 = 1;
                                            iM1252i4 = c0508g.m1252i(1);
                                        }
                                        if (iM1252i4 > 0) {
                                            c0508g.m1263t(i15);
                                        }
                                        if (zM1251h2) {
                                            i16 = 3;
                                            c0508g.m1263t(3);
                                        } else {
                                            i16 = 3;
                                        }
                                        c0508g.m1263t(i16);
                                        boolean zM1251h7 = c0508g.m1251h();
                                        if (iM1252i2 == 2) {
                                            c0508g.m1262s();
                                        }
                                        if (iM1252i2 == 1) {
                                            z3 = false;
                                        } else {
                                            z3 = false;
                                        }
                                        if (c0508g.m1251h()) {
                                            iM1252i5 = c0508g.m1252i(8);
                                            int iM1252i18 = c0508g.m1252i(8);
                                            int iM1252i19 = c0508g.m1252i(8);
                                            if (z3) {
                                                i18 = 1;
                                                if (iM1252i5 != 1) {
                                                }
                                                int iM1439f6 = C0573f.m1439f(iM1252i5);
                                                if (iM1252i6 == i18) {
                                                    i19 = 1;
                                                } else {
                                                    i19 = 2;
                                                }
                                                i17 = iM1439f6;
                                                i58 = i19;
                                                iM1440g2 = C0573f.m1440g(iM1252i18);
                                            } else {
                                                i18 = 1;
                                            }
                                            iM1252i6 = c0508g.m1252i(i18);
                                            int iM1439f7 = C0573f.m1439f(iM1252i5);
                                            if (iM1252i6 == i18) {
                                                i19 = 1;
                                            } else {
                                                i19 = 2;
                                            }
                                            i17 = iM1439f7;
                                            i58 = i19;
                                            iM1440g2 = C0573f.m1440g(iM1252i18);
                                        } else {
                                            i17 = -1;
                                            iM1440g2 = -1;
                                        }
                                        c0573f = new C0573f(i17, i58, iM1440g2, i11, i12, null);
                                    }
                                }
                                int i68 = c0573f.f2067e;
                                int i69 = c0573f.f2068f;
                                int i610 = c0573f.f2063a;
                                int i611 = c0573f.f2064b;
                                iM1440g3 = c0573f.f2065c;
                                iM1439f = i610;
                                i30 = i68;
                                i28 = i611;
                                i31 = i69;
                                c = 7;
                                str4 = "video/av01";
                            }
                            c0573f = c0573f2;
                            int i612 = c0573f.f2067e;
                            int i613 = c0573f.f2068f;
                            int i614 = c0573f.f2063a;
                            int i615 = c0573f.f2064b;
                            iM1440g3 = c0573f.f2065c;
                            iM1439f = i614;
                            i30 = i612;
                            i28 = i615;
                            i31 = i613;
                            c = 7;
                            str4 = "video/av01";
                        } else if (iM1673g2 == 1668050025) {
                            if (byteBufferOrder == null) {
                                byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                            }
                            ByteBuffer byteBuffer = byteBufferOrder;
                            byteBuffer.position(21);
                            byteBuffer.putShort(c0651s.m1684r());
                            byteBuffer.putShort(c0651s.m1684r());
                            byteBufferOrder = byteBuffer;
                            i9 = i9;
                        } else {
                            if (iM1673g2 == 1835295606) {
                                if (byteBufferOrder == null) {
                                    byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                }
                                ByteBuffer byteBuffer2 = byteBufferOrder;
                                short sM1684r = c0651s.m1684r();
                                short sM1684r2 = c0651s.m1684r();
                                short sM1684r3 = c0651s.m1684r();
                                short sM1684r4 = c0651s.m1684r();
                                short sM1684r5 = c0651s.m1684r();
                                iIntValue = iIntValue;
                                short sM1684r6 = c0651s.m1684r();
                                C0536b c0536b3 = c0536b;
                                short sM1684r7 = c0651s.m1684r();
                                list = listM4120r;
                                short sM1684r8 = c0651s.m1684r();
                                long jM1689w = c0651s.m1689w();
                                long jM1689w2 = c0651s.m1689w();
                                i9 = i9;
                                byteBuffer2.position(1);
                                byteBuffer2.putShort(sM1684r5);
                                byteBuffer2.putShort(sM1684r6);
                                byteBuffer2.putShort(sM1684r);
                                byteBuffer2.putShort(sM1684r2);
                                byteBuffer2.putShort(sM1684r3);
                                byteBuffer2.putShort(sM1684r4);
                                byteBuffer2.putShort(sM1684r7);
                                byteBuffer2.putShort(sM1684r8);
                                byteBuffer2.putShort((short) (jM1689w / 10000));
                                byteBuffer2.putShort((short) (jM1689w2 / 10000));
                                byteBufferOrder = byteBuffer2;
                                c0536b = c0536b3;
                            } else {
                                list = listM4120r;
                                i9 = i9;
                                iIntValue = iIntValue;
                                C0536b c0536b4 = c0536b;
                                if (iM1673g2 == 1681012275) {
                                    AbstractC2229b.m4808c(null, str9 == null);
                                    c0536b = c0536b4;
                                    i30 = i30;
                                    listM4120r = list;
                                    i31 = i31;
                                    iM1439f = iM1439f;
                                    iM1440g = iM1440g;
                                    str4 = str;
                                } else if (iM1673g2 == 1702061171) {
                                    AbstractC2229b.m4808c(null, str9 == null);
                                    C0365b c0365bM1023a = m1023a(i32, c0651s);
                                    byte[] bArr5 = (byte[]) c0365bM1023a.f1174f;
                                    List listM4120r2 = bArr5 != null ? AbstractC1676G.m4120r(bArr5) : list;
                                    c0365b = c0365bM1023a;
                                    i31 = i31;
                                    c0536b = c0536b4;
                                    iM1439f = iM1439f;
                                    iM1440g = iM1440g;
                                    str4 = (String) c0365bM1023a.f1173e;
                                    i30 = i30;
                                    listM4120r = listM4120r2;
                                } else if (iM1673g2 == 1885434736) {
                                    c0651s.m1665G(i32 + 8);
                                    fM1691y = c0651s.m1691y() / c0651s.m1691y();
                                    c0536b = c0536b4;
                                    z4 = true;
                                } else if (iM1673g2 == 1937126244) {
                                    int i70 = i32 + 8;
                                    while (true) {
                                        if (i70 - i32 >= iM1673g) {
                                            bArrCopyOfRange = null;
                                            break;
                                        }
                                        c0651s.m1665G(i70);
                                        int iM1673g5 = c0651s.m1673g();
                                        if (c0651s.m1673g() == 1886547818) {
                                            bArrCopyOfRange = Arrays.copyOfRange(c0651s.f2520a, i70, iM1673g5 + i70);
                                            break;
                                        }
                                        i70 += iM1673g5;
                                    }
                                    c0536b = c0536b4;
                                } else if (iM1673g2 == 1936995172) {
                                    int iM1687u5 = c0651s.m1687u();
                                    c0651s.m1666H(3);
                                    if (iM1687u5 == 0) {
                                        int iM1687u6 = c0651s.m1687u();
                                        if (iM1687u6 == 0) {
                                            i9 = 0;
                                        } else if (iM1687u6 == 1) {
                                            i9 = 1;
                                        } else if (iM1687u6 == 2) {
                                            i9 = 2;
                                        } else if (iM1687u6 == 3) {
                                            i9 = 3;
                                        }
                                    }
                                    c0536b = c0536b4;
                                } else {
                                    if (iM1673g2 == 1668246642 && iM1439f == -1 && iM1440g == -1) {
                                        int iM1673g6 = c0651s.m1673g();
                                        if (iM1673g6 == 1852009592 || iM1673g6 == 1852009571) {
                                            int iM1659A3 = c0651s.m1659A();
                                            int iM1659A4 = c0651s.m1659A();
                                            c0651s.m1666H(2);
                                            boolean z9 = iM1673g == 19 && (c0651s.m1687u() & 128) != 0;
                                            iM1439f = C0573f.m1439f(iM1659A3);
                                            i28 = z9 ? 1 : 2;
                                            iM1440g = C0573f.m1440g(iM1659A4);
                                        } else {
                                            AbstractC0646n.m1647y("BoxParsers", "Unsupported color type: " + AbstractC0672d.m1785b(iM1673g6));
                                        }
                                    }
                                    c0536b = c0536b4;
                                }
                            }
                            i30 = i30;
                            listM4120r = list;
                            i31 = i31;
                            iM1439f = iM1439f;
                            iM1440g = iM1440g;
                            str4 = str9;
                        }
                        iM1440g = iM1440g3;
                    }
                }
                str4 = str9;
            }
            i25 += iM1673g;
            i23 = i4;
            c0368e2 = c0368e;
            iIntValue = iIntValue;
            str3 = str;
            c0579kM1444d = c0579k2;
            i26 = i9;
            c2 = 5;
            c3 = 6;
            b3 = 3;
            i29 = iM1440g;
            i24 = i5;
        }
        C0579k c0579k3 = c0579kM1444d;
        String str11 = str4;
        int i71 = i26;
        int i72 = iM1439f;
        int i73 = i29;
        int i74 = i31;
        List list4 = listM4120r;
        int i75 = i30;
        if (str11 == null) {
            return;
        }
        C0582n c0582n = new C0582n();
        c0582n.f2102a = Integer.toString(i6);
        c0582n.f2114m = AbstractC0545H.m1364l(str11);
        c0582n.f2111j = str5;
        c0582n.f2121t = iM1659A;
        c0582n.f2122u = iM1659A2;
        c0582n.f2125x = fM1691y;
        c0582n.f2124w = i7;
        c0582n.f2126y = bArrCopyOfRange;
        c0582n.f2127z = i71;
        c0582n.f2117p = list4;
        c0582n.f2116o = i27;
        c0582n.f2118q = c0579k3;
        c0582n.f2091A = new C0573f(i72, i28, i73, i75, i74, byteBufferOrder != null ? byteBufferOrder.array() : null);
        C0365b c0365b2 = c0365b;
        if (c0365b2 != null) {
            c0582n.f2109h = AbstractC1303m.m3281D(c0365b2.f1171c);
            c0582n.f2110i = AbstractC1303m.m3281D(c0365b2.f1172d);
        }
        c0368e.f1181d = new C0583o(c0582n);
    }
}

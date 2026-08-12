package p036M0;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.UUID;
import p018G0.AbstractC0219i;
import p018G0.C0211a;
import p018G0.C0215e;
import p018G0.C0224n;
import p045P0.AbstractC0462h;
import p055T.C0544G;
import p055T.InterfaceC0543F;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p067X.AbstractC0672d;
import p067X.C0669a;
import p105h2.AbstractC1676G;
import p115k2.C1967a;
import p145s0.InterfaceC2224C;
import p145s0.InterfaceC2241n;

/* JADX INFO: renamed from: M0.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0383t {

    /* JADX INFO: renamed from: a */
    public static final int[] f1301a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX INFO: renamed from: a */
    public static byte[] m1053a(UUID uuid, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    /* JADX INFO: renamed from: b */
    public static C0669a m1054b(C0544G c0544g, String str) {
        int i3 = 0;
        while (true) {
            InterfaceC0543F[] interfaceC0543FArr = c0544g.f1940g;
            if (i3 >= interfaceC0543FArr.length) {
                return null;
            }
            InterfaceC0543F interfaceC0543F = interfaceC0543FArr[i3];
            if (interfaceC0543F instanceof C0669a) {
                C0669a c0669a = (C0669a) interfaceC0543F;
                if (c0669a.f2564g.equals(str)) {
                    return c0669a;
                }
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1055c(int i3, boolean z3) {
        if ((i3 >>> 8) == 3368816) {
            return true;
        }
        if (i3 == 1751476579 && z3) {
            return true;
        }
        int[] iArr = f1301a;
        for (int i4 = 0; i4 < 29; i4++) {
            if (iArr[i4] == i3) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static C0215e m1056d(int i3, C0651s c0651s) {
        int iM1673g = c0651s.m1673g();
        if (c0651s.m1673g() == 1684108385) {
            c0651s.m1666H(8);
            String strM1683q = c0651s.m1683q(iM1673g - 16);
            return new C0215e("und", strM1683q, strM1683q);
        }
        AbstractC0646n.m1647y("MetadataUtil", "Failed to parse comment attribute: " + AbstractC0672d.m1785b(i3));
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static C0211a m1057e(C0651s c0651s) {
        String str;
        int iM1673g = c0651s.m1673g();
        if (c0651s.m1673g() != 1684108385) {
            AbstractC0646n.m1647y("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iM1673g2 = c0651s.m1673g();
        byte[] bArr = AbstractC0371h.f1191a;
        int i3 = iM1673g2 & 16777215;
        if (i3 == 13) {
            str = "image/jpeg";
        } else {
            str = i3 == 14 ? "image/png" : null;
        }
        if (str == null) {
            AbstractC0462h.m1170j("Unrecognized cover art flags: ", "MetadataUtil", i3);
            return null;
        }
        c0651s.m1666H(4);
        int i4 = iM1673g - 16;
        byte[] bArr2 = new byte[i4];
        c0651s.m1671e(bArr2, 0, i4);
        return new C0211a(str, null, 3, bArr2);
    }

    /* JADX INFO: renamed from: f */
    public static C0224n m1058f(int i3, C0651s c0651s, String str) {
        int iM1673g = c0651s.m1673g();
        if (c0651s.m1673g() == 1684108385 && iM1673g >= 22) {
            c0651s.m1666H(10);
            int iM1659A = c0651s.m1659A();
            if (iM1659A > 0) {
                String strM1165e = AbstractC0462h.m1165e(iM1659A, "");
                int iM1659A2 = c0651s.m1659A();
                if (iM1659A2 > 0) {
                    strM1165e = strM1165e + "/" + iM1659A2;
                }
                return new C0224n(str, null, AbstractC1676G.m4120r(strM1165e));
            }
        }
        AbstractC0646n.m1647y("MetadataUtil", "Failed to parse index/count attribute: " + AbstractC0672d.m1785b(i3));
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static int m1059g(C0651s c0651s) {
        int iM1673g = c0651s.m1673g();
        if (c0651s.m1673g() == 1684108385) {
            c0651s.m1666H(8);
            int i3 = iM1673g - 16;
            if (i3 == 1) {
                return c0651s.m1687u();
            }
            if (i3 == 2) {
                return c0651s.m1659A();
            }
            if (i3 == 3) {
                return c0651s.m1690x();
            }
            if (i3 == 4 && (c0651s.f2520a[c0651s.f2521b] & 128) == 0) {
                return c0651s.m1691y();
            }
        }
        AbstractC0646n.m1647y("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public static AbstractC0219i m1060h(int i3, String str, C0651s c0651s, boolean z3, boolean z4) {
        int iM1059g = m1059g(c0651s);
        if (z4) {
            iM1059g = Math.min(1, iM1059g);
        }
        if (iM1059g >= 0) {
            return z3 ? new C0224n(str, null, AbstractC1676G.m4120r(Integer.toString(iM1059g))) : new C0215e("und", str, Integer.toString(iM1059g));
        }
        AbstractC0646n.m1647y("MetadataUtil", "Failed to parse uint8 attribute: " + AbstractC0672d.m1785b(i3));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [byte[], java.io.Serializable] */
    /* JADX INFO: renamed from: i */
    public static C0380q m1061i(byte[] bArr) {
        C0651s c0651s = new C0651s(bArr);
        if (c0651s.f2522c < 32) {
            return null;
        }
        c0651s.m1665G(0);
        int iM1667a = c0651s.m1667a();
        int iM1673g = c0651s.m1673g();
        if (iM1673g != iM1667a) {
            AbstractC0646n.m1647y("PsshAtomUtil", "Advertised atom size (" + iM1673g + ") does not match buffer size: " + iM1667a);
            return null;
        }
        int iM1673g2 = c0651s.m1673g();
        if (iM1673g2 != 1886614376) {
            AbstractC0462h.m1170j("Atom type is not pssh: ", "PsshAtomUtil", iM1673g2);
            return null;
        }
        int iM1025c = AbstractC0371h.m1025c(c0651s.m1673g());
        if (iM1025c > 1) {
            AbstractC0462h.m1170j("Unsupported pssh version: ", "PsshAtomUtil", iM1025c);
            return null;
        }
        UUID uuid = new UUID(c0651s.m1681o(), c0651s.m1681o());
        if (iM1025c == 1) {
            int iM1691y = c0651s.m1691y();
            UUID[] uuidArr = new UUID[iM1691y];
            for (int i3 = 0; i3 < iM1691y; i3++) {
                uuidArr[i3] = new UUID(c0651s.m1681o(), c0651s.m1681o());
            }
        }
        int iM1691y2 = c0651s.m1691y();
        int iM1667a2 = c0651s.m1667a();
        if (iM1691y2 == iM1667a2) {
            ?? r3 = new byte[iM1691y2];
            c0651s.m1671e(r3, 0, iM1691y2);
            return new C0380q(uuid, iM1025c, (Serializable) r3, 0);
        }
        AbstractC0646n.m1647y("PsshAtomUtil", "Atom data size (" + iM1691y2 + ") does not match the bytes left: " + iM1667a2);
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static byte[] m1062j(UUID uuid, byte[] bArr) {
        C0380q c0380qM1061i = m1061i(bArr);
        if (c0380qM1061i == null) {
            return null;
        }
        UUID uuid2 = (UUID) c0380qM1061i.f1292i;
        if (uuid.equals(uuid2)) {
            return (byte[]) c0380qM1061i.f1293j;
        }
        AbstractC0646n.m1647y("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static C0224n m1063k(int i3, C0651s c0651s, String str) {
        int iM1673g = c0651s.m1673g();
        if (c0651s.m1673g() == 1684108385) {
            c0651s.m1666H(8);
            return new C0224n(str, null, AbstractC1676G.m4120r(c0651s.m1683q(iM1673g - 16)));
        }
        AbstractC0646n.m1647y("MetadataUtil", "Failed to parse text attribute: " + AbstractC0672d.m1785b(i3));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x012f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0132  */
    /* JADX WARN: Code duplicated, block: B:85:0x0136 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0138  */
    /* JADX WARN: Code duplicated, block: B:88:0x013b  */
    /* JADX WARN: Code duplicated, block: B:90:0x013e A[RETURN] */
    /* JADX INFO: renamed from: l */
    public static InterfaceC2224C m1064l(InterfaceC2241n interfaceC2241n, boolean z3, boolean z4) {
        InterfaceC2224C interfaceC2224C;
        boolean z5;
        long jM1681o;
        int i3;
        int[] iArr;
        boolean z6 = true;
        long jMo337g = interfaceC2241n.mo337g();
        long j3 = 4096;
        long j4 = -1;
        if (jMo337g != -1 && jMo337g <= 4096) {
            j3 = jMo337g;
        }
        int i4 = (int) j3;
        C0651s c0651s = new C0651s(64);
        int i5 = 0;
        int i6 = 0;
        boolean z7 = false;
        while (true) {
            if (i6 < i4) {
                c0651s.m1662D(8);
                if (interfaceC2241n.mo338i(c0651s.f2520a, i5, 8, z6)) {
                    long jM1689w = c0651s.m1689w();
                    int iM1673g = c0651s.m1673g();
                    if (jM1689w == 1) {
                        interfaceC2241n.mo342n(c0651s.f2520a, 8, 8);
                        i3 = 16;
                        c0651s.m1664F(16);
                        jM1681o = c0651s.m1681o();
                    } else {
                        if (jM1689w == 0) {
                            long jMo337g2 = interfaceC2241n.mo337g();
                            if (jMo337g2 != j4) {
                                jM1689w = (jMo337g2 - interfaceC2241n.mo339j()) + ((long) 8);
                            }
                        }
                        jM1681o = jM1689w;
                        i3 = 8;
                    }
                    long j5 = i3;
                    if (jM1681o < j5) {
                        return new C0377n();
                    }
                    int i7 = i6 + i3;
                    interfaceC2224C = null;
                    if (iM1673g == 1836019574) {
                        i4 += (int) jM1681o;
                        if (jMo337g != -1 && i4 > jMo337g) {
                            i4 = (int) jMo337g;
                        }
                        i6 = i7;
                    } else if (iM1673g == 1836019558 || iM1673g == 1836475768) {
                        z5 = true;
                    } else {
                        if (iM1673g == 1835295092) {
                            z7 = true;
                        }
                        long j6 = jMo337g;
                        if ((((long) i7) + jM1681o) - j5 >= i4) {
                            z5 = false;
                        } else {
                            int i8 = (int) (jM1681o - j5);
                            i6 = i7 + i8;
                            if (iM1673g == 1718909296) {
                                if (i8 < 8) {
                                    return new C0377n();
                                }
                                c0651s.m1662D(i8);
                                interfaceC2241n.mo342n(c0651s.f2520a, 0, i8);
                                if (m1055c(c0651s.m1673g(), z4)) {
                                    z7 = true;
                                }
                                c0651s.m1666H(4);
                                int iM1667a = c0651s.m1667a() / 4;
                                if (z7 || iM1667a <= 0) {
                                    iArr = null;
                                } else {
                                    iArr = new int[iM1667a];
                                    for (int i9 = 0; i9 < iM1667a; i9++) {
                                        int iM1673g2 = c0651s.m1673g();
                                        iArr[i9] = iM1673g2;
                                        if (m1055c(iM1673g2, z4)) {
                                            z7 = true;
                                            break;
                                        }
                                    }
                                }
                                if (!z7) {
                                    C0377n c0377n = new C0377n();
                                    if (iArr == null) {
                                        int i10 = C1967a.f8591i;
                                        return c0377n;
                                    }
                                    int i11 = C1967a.f8591i;
                                    if (iArr.length == 0) {
                                        return c0377n;
                                    }
                                    new C1967a(Arrays.copyOf(iArr, iArr.length));
                                    return c0377n;
                                }
                            } else if (i8 != 0) {
                                interfaceC2241n.mo343o(i8);
                            }
                            jMo337g = j6;
                        }
                    }
                    z6 = true;
                    j4 = -1;
                    i5 = 0;
                }
                if (!z7) {
                    return C0377n.f1252c;
                }
                if (z3 != z5) {
                    return z5 ? C0377n.f1250a : C0377n.f1251b;
                }
                return interfaceC2224C;
            }
            interfaceC2224C = null;
            z5 = false;
            if (!z7) {
                return C0377n.f1252c;
            }
            if (z3 != z5) {
                if (z5) {
                }
            }
            return interfaceC2224C;
        }
    }
}

package p153u0;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import p045P0.AbstractC0462h;
import p055T.AbstractC0545H;
import p055T.C0582n;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p105h2.AbstractC1670A;
import p105h2.AbstractC1676G;
import p105h2.AbstractC1723q;
import p105h2.C1674E;
import p105h2.C1692X;

/* JADX INFO: renamed from: u0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2294f implements InterfaceC2289a {

    /* JADX INFO: renamed from: a */
    public final C1692X f9798a;

    /* JADX INFO: renamed from: b */
    public final int f9799b;

    public C2294f(int i3, C1692X c1692x) {
        this.f9799b = i3;
        this.f9798a = c1692x;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: c */
    public static C2294f m4918c(int i3, C0651s c0651s) {
        String str;
        InterfaceC2289a c2295g;
        String str2;
        int i4 = 4;
        AbstractC1723q.m4153b(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i5 = c0651s.f2522c;
        int i6 = 0;
        int i7 = -2;
        int i8 = 0;
        while (c0651s.m1667a() > 8) {
            int iM1675i = c0651s.m1675i();
            int iM1675i2 = c0651s.f2521b + c0651s.m1675i();
            c0651s.m1664F(iM1675i2);
            if (iM1675i != 1414744396) {
                C2292d c2292d = null;
                switch (iM1675i) {
                    case 1718776947:
                        if (i7 != 2) {
                            if (i7 == 1) {
                                int iM1680n = c0651s.m1680n();
                                if (iM1680n == 1) {
                                    str = "audio/raw";
                                } else if (iM1680n == 85) {
                                    str = "audio/mpeg";
                                } else if (iM1680n == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iM1680n != 8192) {
                                    str = iM1680n != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iM1680n2 = c0651s.m1680n();
                                    int iM1675i3 = c0651s.m1675i();
                                    c0651s.m1666H(6);
                                    int iM1605x = AbstractC0632A.m1605x(c0651s.m1680n());
                                    int iM1680n3 = c0651s.m1667a() > 0 ? c0651s.m1680n() : 0;
                                    byte[] bArr = new byte[iM1680n3];
                                    c0651s.m1671e(bArr, i6, iM1680n3);
                                    C0582n c0582n = new C0582n();
                                    c0582n.f2114m = AbstractC0545H.m1364l(str);
                                    c0582n.f2092B = iM1680n2;
                                    c0582n.f2093C = iM1675i3;
                                    if ("audio/raw".equals(str) && iM1605x != 0) {
                                        c0582n.f2094D = iM1605x;
                                    }
                                    if ("audio/mp4a-latm".equals(str) && iM1680n3 > 0) {
                                        c0582n.f2117p = AbstractC1676G.m4120r(bArr);
                                    }
                                    c2295g = new C2295g(new C0583o(c0582n));
                                } else {
                                    AbstractC0462h.m1170j("Ignoring track with unsupported format tag ", "StreamFormatChunk", iM1680n);
                                }
                            } else {
                                AbstractC0646n.m1647y("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + AbstractC0632A.m1562C(i7));
                            }
                            c2295g = c2292d;
                            break;
                        } else {
                            c0651s.m1666H(i4);
                            int iM1675i4 = c0651s.m1675i();
                            int iM1675i5 = c0651s.m1675i();
                            c0651s.m1666H(i4);
                            int iM1675i6 = c0651s.m1675i();
                            switch (iM1675i6) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                C0582n c0582n2 = new C0582n();
                                c0582n2.f2121t = iM1675i4;
                                c0582n2.f2122u = iM1675i5;
                                c0582n2.f2114m = AbstractC0545H.m1364l(str2);
                                c2295g = new C2295g(new C0583o(c0582n2));
                            } else {
                                AbstractC0462h.m1170j("Ignoring track with unsupported compression ", "StreamFormatChunk", iM1675i6);
                                c2295g = c2292d;
                            }
                        }
                        break;
                    case 1751742049:
                        int iM1675i7 = c0651s.m1675i();
                        c0651s.m1666H(8);
                        int iM1675i8 = c0651s.m1675i();
                        int iM1675i9 = c0651s.m1675i();
                        c0651s.m1666H(i4);
                        c0651s.m1675i();
                        c0651s.m1666H(12);
                        c2295g = new C2291c(iM1675i7, iM1675i8, iM1675i9);
                        break;
                    case 1752331379:
                        int iM1675i10 = c0651s.m1675i();
                        c0651s.m1666H(12);
                        c0651s.m1675i();
                        int iM1675i11 = c0651s.m1675i();
                        int iM1675i12 = c0651s.m1675i();
                        c0651s.m1666H(i4);
                        int iM1675i13 = c0651s.m1675i();
                        int iM1675i14 = c0651s.m1675i();
                        c0651s.m1666H(8);
                        c2292d = new C2292d(iM1675i10, iM1675i11, iM1675i12, iM1675i13, iM1675i14);
                        c2295g = c2292d;
                        break;
                    case 1852994675:
                        c2295g = new C2296h(c0651s.m1685s(c0651s.m1667a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        c2295g = c2292d;
                        break;
                }
            } else {
                c2295g = m4918c(c0651s.m1675i(), c0651s);
            }
            if (c2295g != null) {
                if (c2295g.mo4915a() == 1752331379) {
                    int i9 = ((C2292d) c2295g).f9780a;
                    if (i9 == 1935960438) {
                        i7 = 2;
                    } else if (i9 == 1935963489) {
                        i7 = 1;
                    } else if (i9 != 1937012852) {
                        AbstractC0646n.m1647y("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i9));
                        i7 = -1;
                    } else {
                        i7 = 3;
                    }
                }
                int i10 = i8 + 1;
                int iM4101e = AbstractC1670A.m4101e(objArrCopyOf.length, i10);
                if (iM4101e > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iM4101e);
                }
                objArrCopyOf[i8] = c2295g;
                i8 = i10;
            }
            c0651s.m1665G(iM1675i2);
            c0651s.m1664F(i5);
            i4 = 4;
            i6 = 0;
        }
        return new C2294f(i3, AbstractC1676G.m4115l(i8, objArrCopyOf));
    }

    @Override // p153u0.InterfaceC2289a
    /* JADX INFO: renamed from: a */
    public final int mo4915a() {
        return this.f9799b;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC2289a m4919b(Class cls) {
        C1674E c1674eListIterator = this.f9798a.listIterator(0);
        while (c1674eListIterator.hasNext()) {
            InterfaceC2289a interfaceC2289a = (InterfaceC2289a) c1674eListIterator.next();
            if (interfaceC2289a.getClass() == cls) {
                return interfaceC2289a;
            }
        }
        return null;
    }
}

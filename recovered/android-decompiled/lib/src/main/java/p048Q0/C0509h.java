package p048Q0;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000A.C0031d;
import p045P0.AbstractC0462h;
import p064W.AbstractC0633a;
import p064W.AbstractC0646n;
import p064W.C0651s;

/* JADX INFO: renamed from: Q0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0509h extends AbstractC0511j {

    /* JADX INFO: renamed from: h */
    public final C0651s f1735h = new C0651s();

    /* JADX INFO: renamed from: i */
    public final C0508g f1736i = new C0508g();

    /* JADX INFO: renamed from: j */
    public int f1737j = -1;

    /* JADX INFO: renamed from: k */
    public final int f1738k;

    /* JADX INFO: renamed from: l */
    public final C0507f[] f1739l;

    /* JADX INFO: renamed from: m */
    public C0507f f1740m;

    /* JADX INFO: renamed from: n */
    public List f1741n;

    /* JADX INFO: renamed from: o */
    public List f1742o;

    /* JADX INFO: renamed from: p */
    public C0508g f1743p;

    /* JADX INFO: renamed from: q */
    public int f1744q;

    public C0509h(int i3, List list) {
        this.f1738k = i3 == -1 ? 1 : i3;
        if (list != null) {
            byte[] bArr = AbstractC0633a.f2468a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b3 = ((byte[]) list.get(0))[0];
            }
        }
        this.f1739l = new C0507f[8];
        for (int i4 = 0; i4 < 8; i4++) {
            this.f1739l[i4] = new C0507f();
        }
        this.f1740m = this.f1739l[0];
    }

    @Override // p048Q0.AbstractC0511j, p073Z.InterfaceC0768c
    public final void flush() {
        super.flush();
        this.f1741n = null;
        this.f1742o = null;
        this.f1744q = 0;
        this.f1740m = this.f1739l[0];
        m1267m();
        this.f1743p = null;
    }

    @Override // p048Q0.AbstractC0511j
    /* JADX INFO: renamed from: g */
    public final C0031d mo1231g() {
        List list = this.f1741n;
        this.f1742o = list;
        list.getClass();
        return new C0031d(16, list);
    }

    @Override // p048Q0.AbstractC0511j
    /* JADX INFO: renamed from: h */
    public final void mo1232h(C0510i c0510i) {
        ByteBuffer byteBuffer = c0510i.f3144k;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C0651s c0651s = this.f1735h;
        c0651s.m1663E(bArrArray, iLimit);
        while (c0651s.m1667a() >= 3) {
            int iM1687u = c0651s.m1687u();
            int i3 = iM1687u & 3;
            boolean z3 = (iM1687u & 4) == 4;
            byte bM1687u = (byte) c0651s.m1687u();
            byte bM1687u2 = (byte) c0651s.m1687u();
            if (i3 == 2 || i3 == 3) {
                if (z3) {
                    if (i3 == 3) {
                        m1265k();
                        int i4 = (bM1687u & 192) >> 6;
                        int i5 = this.f1737j;
                        if (i5 != -1 && i4 != (i5 + 1) % 4) {
                            m1267m();
                            AbstractC0646n.m1647y("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f1737j + " current=" + i4);
                        }
                        this.f1737j = i4;
                        int i6 = bM1687u & 63;
                        if (i6 == 0) {
                            i6 = 64;
                        }
                        C0508g c0508g = new C0508g(i4, i6);
                        this.f1743p = c0508g;
                        c0508g.f1734e = 1;
                        c0508g.f1731b[0] = bM1687u2;
                    } else {
                        AbstractC0646n.m1625c(i3 == 2);
                        C0508g c0508g2 = this.f1743p;
                        if (c0508g2 == null) {
                            AbstractC0646n.m1635m("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = c0508g2.f1731b;
                            int i7 = c0508g2.f1734e;
                            int i8 = i7 + 1;
                            c0508g2.f1734e = i8;
                            bArr[i7] = bM1687u;
                            c0508g2.f1734e = i7 + 2;
                            bArr[i8] = bM1687u2;
                        }
                    }
                    C0508g c0508g3 = this.f1743p;
                    if (c0508g3.f1734e == (c0508g3.f1733d * 2) - 1) {
                        m1265k();
                    }
                }
            }
        }
    }

    @Override // p048Q0.AbstractC0511j
    /* JADX INFO: renamed from: j */
    public final boolean mo1234j() {
        return this.f1741n != this.f1742o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:230:0x0539  */
    /* JADX INFO: renamed from: k */
    public final void m1265k() {
        C0508g c0508g = this.f1743p;
        if (c0508g == null) {
            return;
        }
        int i3 = 2;
        if (c0508g.f1734e != (c0508g.f1733d * 2) - 1) {
            AbstractC0646n.m1634l("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f1743p.f1733d * 2) - 1) + ", but current index is " + this.f1743p.f1734e + " (sequence number " + this.f1743p.f1732c + ");");
        }
        C0508g c0508g2 = this.f1743p;
        byte[] bArr = c0508g2.f1731b;
        int i4 = c0508g2.f1734e;
        C0508g c0508g3 = this.f1736i;
        c0508g3.m1259p(bArr, i4);
        boolean z3 = false;
        while (c0508g3.m1245b() > 0) {
            int i5 = 3;
            int iM1252i = c0508g3.m1252i(3);
            int iM1252i2 = c0508g3.m1252i(5);
            if (iM1252i == 7) {
                c0508g3.m1263t(i3);
                iM1252i = c0508g3.m1252i(6);
                if (iM1252i < 7) {
                    AbstractC0462h.m1170j("Invalid extended service number: ", "Cea708Decoder", iM1252i);
                }
            }
            if (iM1252i2 == 0) {
                if (iM1252i != 0) {
                    AbstractC0646n.m1647y("Cea708Decoder", "serviceNumber is non-zero (" + iM1252i + ") when blockSize is 0");
                }
                if (z3) {
                    this.f1741n = m1266l();
                }
                this.f1743p = null;
            }
            if (iM1252i != this.f1738k) {
                c0508g3.m1264u(iM1252i2);
            } else {
                int iM1250g = (iM1252i2 * 8) + c0508g3.m1250g();
                while (c0508g3.m1250g() < iM1250g) {
                    int iM1252i3 = c0508g3.m1252i(8);
                    if (iM1252i3 == 16) {
                        int iM1252i4 = c0508g3.m1252i(8);
                        if (iM1252i4 <= 31) {
                            if (iM1252i4 > 7) {
                                if (iM1252i4 <= 15) {
                                    c0508g3.m1263t(8);
                                } else if (iM1252i4 <= 23) {
                                    c0508g3.m1263t(16);
                                } else if (iM1252i4 <= 31) {
                                    c0508g3.m1263t(24);
                                }
                            }
                        } else if (iM1252i4 <= 127) {
                            if (iM1252i4 == 32) {
                                this.f1740m.m1239a(' ');
                            } else if (iM1252i4 == 33) {
                                this.f1740m.m1239a((char) 160);
                            } else if (iM1252i4 == 37) {
                                this.f1740m.m1239a((char) 8230);
                            } else if (iM1252i4 == 42) {
                                this.f1740m.m1239a((char) 352);
                            } else if (iM1252i4 == 44) {
                                this.f1740m.m1239a((char) 338);
                            } else if (iM1252i4 == 63) {
                                this.f1740m.m1239a((char) 376);
                            } else if (iM1252i4 == 57) {
                                this.f1740m.m1239a((char) 8482);
                            } else if (iM1252i4 == 58) {
                                this.f1740m.m1239a((char) 353);
                            } else if (iM1252i4 == 60) {
                                this.f1740m.m1239a((char) 339);
                            } else if (iM1252i4 != 61) {
                                switch (iM1252i4) {
                                    case 48:
                                        this.f1740m.m1239a((char) 9608);
                                        break;
                                    case 49:
                                        this.f1740m.m1239a((char) 8216);
                                        break;
                                    case 50:
                                        this.f1740m.m1239a((char) 8217);
                                        break;
                                    case 51:
                                        this.f1740m.m1239a((char) 8220);
                                        break;
                                    case 52:
                                        this.f1740m.m1239a((char) 8221);
                                        break;
                                    case 53:
                                        this.f1740m.m1239a((char) 8226);
                                        break;
                                    default:
                                        switch (iM1252i4) {
                                            case 118:
                                                this.f1740m.m1239a((char) 8539);
                                                break;
                                            case 119:
                                                this.f1740m.m1239a((char) 8540);
                                                break;
                                            case 120:
                                                this.f1740m.m1239a((char) 8541);
                                                break;
                                            case 121:
                                                this.f1740m.m1239a((char) 8542);
                                                break;
                                            case 122:
                                                this.f1740m.m1239a((char) 9474);
                                                break;
                                            case 123:
                                                this.f1740m.m1239a((char) 9488);
                                                break;
                                            case 124:
                                                this.f1740m.m1239a((char) 9492);
                                                break;
                                            case 125:
                                                this.f1740m.m1239a((char) 9472);
                                                break;
                                            case 126:
                                                this.f1740m.m1239a((char) 9496);
                                                break;
                                            case 127:
                                                this.f1740m.m1239a((char) 9484);
                                                break;
                                            default:
                                                AbstractC0462h.m1170j("Invalid G2 character: ", "Cea708Decoder", iM1252i4);
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                this.f1740m.m1239a((char) 8480);
                            }
                            z3 = true;
                        } else if (iM1252i4 <= 159) {
                            if (iM1252i4 <= 135) {
                                c0508g3.m1263t(32);
                            } else if (iM1252i4 <= 143) {
                                c0508g3.m1263t(40);
                            } else if (iM1252i4 <= 159) {
                                c0508g3.m1263t(2);
                                c0508g3.m1263t(c0508g3.m1252i(6) * 8);
                            }
                        } else if (iM1252i4 <= 255) {
                            if (iM1252i4 == 160) {
                                this.f1740m.m1239a((char) 13252);
                            } else {
                                AbstractC0462h.m1170j("Invalid G3 character: ", "Cea708Decoder", iM1252i4);
                                this.f1740m.m1239a('_');
                            }
                            z3 = true;
                        } else {
                            AbstractC0462h.m1170j("Invalid extended command: ", "Cea708Decoder", iM1252i4);
                        }
                    } else if (iM1252i3 <= 31) {
                        if (iM1252i3 != 0) {
                            if (iM1252i3 == i5) {
                                this.f1741n = m1266l();
                            } else if (iM1252i3 != 8) {
                                switch (iM1252i3) {
                                    case 12:
                                        m1267m();
                                        break;
                                    case 13:
                                        this.f1740m.m1239a('\n');
                                        break;
                                    case 14:
                                        break;
                                    default:
                                        if (iM1252i3 >= 17 && iM1252i3 <= 23) {
                                            AbstractC0646n.m1647y("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + iM1252i3);
                                            c0508g3.m1263t(8);
                                        } else if (iM1252i3 < 24 || iM1252i3 > 31) {
                                            AbstractC0462h.m1170j("Invalid C0 command: ", "Cea708Decoder", iM1252i3);
                                        } else {
                                            AbstractC0646n.m1647y("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + iM1252i3);
                                            c0508g3.m1263t(16);
                                        }
                                        break;
                                }
                            } else {
                                SpannableStringBuilder spannableStringBuilder = this.f1740m.f1710b;
                                int length = spannableStringBuilder.length();
                                if (length > 0) {
                                    spannableStringBuilder.delete(length - 1, length);
                                }
                            }
                        }
                    } else if (iM1252i3 <= 127) {
                        if (iM1252i3 == 127) {
                            this.f1740m.m1239a((char) 9835);
                        } else {
                            this.f1740m.m1239a((char) (iM1252i3 & 255));
                        }
                        z3 = true;
                    } else {
                        if (iM1252i3 <= 159) {
                            C0507f[] c0507fArr = this.f1739l;
                            switch (iM1252i3) {
                                case 128:
                                case 129:
                                case 130:
                                case 131:
                                case 132:
                                case 133:
                                case 134:
                                case 135:
                                    int i6 = iM1252i3 - 128;
                                    if (this.f1744q != i6) {
                                        this.f1744q = i6;
                                        this.f1740m = c0507fArr[i6];
                                    }
                                    break;
                                case 136:
                                    for (int i7 = 1; i7 <= 8; i7++) {
                                        if (c0508g3.m1251h()) {
                                            C0507f c0507f = c0507fArr[8 - i7];
                                            c0507f.f1709a.clear();
                                            c0507f.f1710b.clear();
                                            c0507f.f1723o = -1;
                                            c0507f.f1724p = -1;
                                            c0507f.f1725q = -1;
                                            c0507f.f1727s = -1;
                                            c0507f.f1729u = 0;
                                        }
                                    }
                                    break;
                                case 137:
                                    for (int i8 = 1; i8 <= 8; i8++) {
                                        if (c0508g3.m1251h()) {
                                            c0507fArr[8 - i8].f1712d = true;
                                        }
                                    }
                                    break;
                                case 138:
                                    for (int i9 = 1; i9 <= 8; i9++) {
                                        if (c0508g3.m1251h()) {
                                            c0507fArr[8 - i9].f1712d = false;
                                        }
                                    }
                                    break;
                                case 139:
                                    for (int i10 = 1; i10 <= 8; i10++) {
                                        if (c0508g3.m1251h()) {
                                            C0507f c0507f2 = c0507fArr[8 - i10];
                                            c0507f2.f1712d = !c0507f2.f1712d;
                                        }
                                    }
                                    break;
                                case 140:
                                    for (int i11 = 1; i11 <= 8; i11++) {
                                        if (c0508g3.m1251h()) {
                                            c0507fArr[8 - i11].m1241d();
                                        }
                                    }
                                    break;
                                case 141:
                                    c0508g3.m1263t(8);
                                    break;
                                case 142:
                                    break;
                                case 143:
                                    m1267m();
                                    break;
                                case 144:
                                    if (this.f1740m.f1711c) {
                                        c0508g3.m1252i(4);
                                        c0508g3.m1252i(2);
                                        c0508g3.m1252i(2);
                                        boolean zM1251h = c0508g3.m1251h();
                                        boolean zM1251h2 = c0508g3.m1251h();
                                        i5 = 3;
                                        c0508g3.m1252i(3);
                                        c0508g3.m1252i(3);
                                        this.f1740m.m1242e(zM1251h, zM1251h2);
                                    } else {
                                        c0508g3.m1263t(16);
                                        i5 = 3;
                                    }
                                    break;
                                case 145:
                                    if (this.f1740m.f1711c) {
                                        int iM1238c = C0507f.m1238c(c0508g3.m1252i(2), c0508g3.m1252i(2), c0508g3.m1252i(2), c0508g3.m1252i(2));
                                        int iM1238c2 = C0507f.m1238c(c0508g3.m1252i(2), c0508g3.m1252i(2), c0508g3.m1252i(2), c0508g3.m1252i(2));
                                        c0508g3.m1263t(2);
                                        C0507f.m1238c(c0508g3.m1252i(2), c0508g3.m1252i(2), c0508g3.m1252i(2), 0);
                                        this.f1740m.m1243f(iM1238c, iM1238c2);
                                    } else {
                                        c0508g3.m1263t(24);
                                    }
                                    i5 = 3;
                                    break;
                                case 146:
                                    if (this.f1740m.f1711c) {
                                        c0508g3.m1263t(4);
                                        int iM1252i5 = c0508g3.m1252i(4);
                                        c0508g3.m1263t(2);
                                        c0508g3.m1252i(6);
                                        C0507f c0507f3 = this.f1740m;
                                        if (c0507f3.f1729u != iM1252i5) {
                                            c0507f3.m1239a('\n');
                                        }
                                        c0507f3.f1729u = iM1252i5;
                                    } else {
                                        c0508g3.m1263t(16);
                                    }
                                    i5 = 3;
                                    break;
                                case 147:
                                case 148:
                                case 149:
                                case 150:
                                default:
                                    AbstractC0462h.m1170j("Invalid C1 command: ", "Cea708Decoder", iM1252i3);
                                    break;
                                case 151:
                                    if (this.f1740m.f1711c) {
                                        int iM1238c3 = C0507f.m1238c(c0508g3.m1252i(2), c0508g3.m1252i(2), c0508g3.m1252i(2), c0508g3.m1252i(2));
                                        c0508g3.m1252i(2);
                                        C0507f.m1238c(c0508g3.m1252i(2), c0508g3.m1252i(2), c0508g3.m1252i(2), 0);
                                        c0508g3.m1251h();
                                        c0508g3.m1251h();
                                        c0508g3.m1252i(2);
                                        c0508g3.m1252i(2);
                                        int iM1252i6 = c0508g3.m1252i(2);
                                        c0508g3.m1263t(8);
                                        C0507f c0507f4 = this.f1740m;
                                        c0507f4.f1722n = iM1238c3;
                                        c0507f4.f1719k = iM1252i6;
                                    } else {
                                        c0508g3.m1263t(32);
                                    }
                                    i5 = 3;
                                    break;
                                case 152:
                                case 153:
                                case 154:
                                case 155:
                                case 156:
                                case 157:
                                case 158:
                                case 159:
                                    int i12 = iM1252i3 - 152;
                                    C0507f c0507f5 = c0507fArr[i12];
                                    c0508g3.m1263t(i3);
                                    boolean zM1251h3 = c0508g3.m1251h();
                                    c0508g3.m1263t(i3);
                                    int iM1252i7 = c0508g3.m1252i(i5);
                                    boolean zM1251h4 = c0508g3.m1251h();
                                    int iM1252i8 = c0508g3.m1252i(7);
                                    int iM1252i9 = c0508g3.m1252i(8);
                                    int iM1252i10 = c0508g3.m1252i(4);
                                    int iM1252i11 = c0508g3.m1252i(4);
                                    c0508g3.m1263t(i3);
                                    c0508g3.m1263t(6);
                                    c0508g3.m1263t(i3);
                                    int iM1252i12 = c0508g3.m1252i(3);
                                    int iM1252i13 = c0508g3.m1252i(3);
                                    c0507f5.f1711c = true;
                                    c0507f5.f1712d = zM1251h3;
                                    c0507f5.f1713e = iM1252i7;
                                    c0507f5.f1714f = zM1251h4;
                                    c0507f5.f1715g = iM1252i8;
                                    c0507f5.f1716h = iM1252i9;
                                    c0507f5.f1717i = iM1252i10;
                                    int i13 = iM1252i11 + 1;
                                    if (c0507f5.f1718j != i13) {
                                        c0507f5.f1718j = i13;
                                        while (true) {
                                            ArrayList arrayList = c0507f5.f1709a;
                                            if (arrayList.size() >= c0507f5.f1718j || arrayList.size() >= 15) {
                                                arrayList.remove(0);
                                            }
                                        }
                                    }
                                    if (iM1252i12 != 0 && c0507f5.f1720l != iM1252i12) {
                                        c0507f5.f1720l = iM1252i12;
                                        int i14 = iM1252i12 - 1;
                                        int i15 = C0507f.f1700B[i14];
                                        boolean z4 = C0507f.f1699A[i14];
                                        int i16 = C0507f.f1707y[i14];
                                        int i17 = C0507f.f1708z[i14];
                                        int i18 = C0507f.f1706x[i14];
                                        c0507f5.f1722n = i15;
                                        c0507f5.f1719k = i18;
                                    }
                                    if (iM1252i13 != 0 && c0507f5.f1721m != iM1252i13) {
                                        c0507f5.f1721m = iM1252i13;
                                        int i19 = iM1252i13 - 1;
                                        int i20 = C0507f.f1702D[i19];
                                        int i21 = C0507f.f1701C[i19];
                                        c0507f5.m1242e(false, false);
                                        c0507f5.m1243f(C0507f.f1704v, C0507f.f1703E[i19]);
                                    }
                                    if (this.f1744q != i12) {
                                        this.f1744q = i12;
                                        this.f1740m = c0507fArr[i12];
                                    }
                                    i5 = 3;
                                    break;
                            }
                        } else if (iM1252i3 <= 255) {
                            this.f1740m.m1239a((char) (iM1252i3 & 255));
                        } else {
                            AbstractC0462h.m1170j("Invalid base command: ", "Cea708Decoder", iM1252i3);
                        }
                        z3 = true;
                    }
                    i3 = 2;
                }
            }
        }
        if (z3) {
            this.f1741n = m1266l();
        }
        this.f1743p = null;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ed  */
    /* JADX INFO: renamed from: l */
    public final List m1266l() {
        C0506e c0506e;
        Layout.Alignment alignment;
        float f;
        float f3;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < 8; i3++) {
            C0507f[] c0507fArr = this.f1739l;
            C0507f c0507f = c0507fArr[i3];
            if (c0507f.f1711c && (!c0507f.f1709a.isEmpty() || c0507f.f1710b.length() != 0)) {
                C0507f c0507f2 = c0507fArr[i3];
                if (c0507f2.f1712d) {
                    if (c0507f2.f1711c) {
                        ArrayList arrayList2 = c0507f2.f1709a;
                        if (arrayList2.isEmpty() && c0507f2.f1710b.length() == 0) {
                            c0506e = null;
                        } else {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                                spannableStringBuilder.append((CharSequence) arrayList2.get(i4));
                                spannableStringBuilder.append('\n');
                            }
                            spannableStringBuilder.append((CharSequence) c0507f2.m1240b());
                            int i5 = c0507f2.f1719k;
                            if (i5 == 0) {
                                alignment = Layout.Alignment.ALIGN_NORMAL;
                            } else if (i5 == 1) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else if (i5 != 2) {
                                if (i5 != 3) {
                                    throw new IllegalArgumentException("Unexpected justification value: " + c0507f2.f1719k);
                                }
                                alignment = Layout.Alignment.ALIGN_NORMAL;
                            } else {
                                alignment = Layout.Alignment.ALIGN_CENTER;
                            }
                            Layout.Alignment alignment2 = alignment;
                            if (c0507f2.f1714f) {
                                f = c0507f2.f1716h / 99.0f;
                                f3 = c0507f2.f1715g / 99.0f;
                            } else {
                                f = c0507f2.f1716h / 209.0f;
                                f3 = c0507f2.f1715g / 74.0f;
                            }
                            float f4 = (f * 0.9f) + 0.05f;
                            float f5 = (f3 * 0.9f) + 0.05f;
                            int i6 = c0507f2.f1717i;
                            int i7 = i6 / 3;
                            int i8 = i7 == 0 ? 0 : i7 == 1 ? 1 : 2;
                            int i9 = i6 % 3;
                            int i10 = i9 == 0 ? 0 : i9 == 1 ? 1 : 2;
                            int i11 = c0507f2.f1722n;
                            c0506e = new C0506e(spannableStringBuilder, alignment2, f5, i8, f4, i10, i11 != C0507f.f1705w, i11, c0507f2.f1713e);
                        }
                    } else {
                        c0506e = null;
                    }
                    if (c0506e != null) {
                        arrayList.add(c0506e);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, C0506e.f1696c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList3.add(((C0506e) arrayList.get(i12)).f1697a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    /* JADX INFO: renamed from: m */
    public final void m1267m() {
        for (int i3 = 0; i3 < 8; i3++) {
            this.f1739l[i3].m1241d();
        }
    }
}

package p071Y0;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
import p048Q0.C0508g;
import p055T.AbstractC0545H;
import p055T.C0546I;
import p055T.C0582n;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p145s0.AbstractC2229b;
import p145s0.C2228a;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2242o;

/* JADX INFO: renamed from: Y0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0743f implements InterfaceC0745h {

    /* JADX INFO: renamed from: a */
    public final C0651s f2889a;

    /* JADX INFO: renamed from: c */
    public final String f2891c;

    /* JADX INFO: renamed from: d */
    public final int f2892d;

    /* JADX INFO: renamed from: e */
    public String f2893e;

    /* JADX INFO: renamed from: f */
    public InterfaceC2226E f2894f;

    /* JADX INFO: renamed from: h */
    public int f2896h;

    /* JADX INFO: renamed from: i */
    public int f2897i;

    /* JADX INFO: renamed from: j */
    public long f2898j;

    /* JADX INFO: renamed from: k */
    public C0583o f2899k;

    /* JADX INFO: renamed from: l */
    public int f2900l;

    /* JADX INFO: renamed from: m */
    public int f2901m;

    /* JADX INFO: renamed from: g */
    public int f2895g = 0;

    /* JADX INFO: renamed from: p */
    public long f2904p = -9223372036854775807L;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f2890b = new AtomicInteger();

    /* JADX INFO: renamed from: n */
    public int f2902n = -1;

    /* JADX INFO: renamed from: o */
    public int f2903o = -1;

    public C0743f(String str, int i3, int i4) {
        this.f2889a = new C0651s(new byte[i4]);
        this.f2891c = str;
        this.f2892d = i3;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1857a(C0651s c0651s, byte[] bArr, int i3) {
        int iMin = Math.min(c0651s.m1667a(), i3 - this.f2896h);
        c0651s.m1671e(bArr, this.f2896h, iMin);
        int i4 = this.f2896h + iMin;
        this.f2896h = i4;
        return i4 == i3;
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: b */
    public final void mo1852b() {
        this.f2895g = 0;
        this.f2896h = 0;
        this.f2897i = 0;
        this.f2904p = -9223372036854775807L;
        this.f2890b.set(0);
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: c */
    public final void mo1853c(C0651s c0651s) throws C0546I {
        int i3;
        int i4;
        boolean z3;
        int i5;
        byte b3;
        int i6;
        byte b4;
        int i7;
        byte b5;
        int i8;
        int i9;
        int iM1252i;
        int iM1252i2;
        int iM1252i3;
        int i10;
        long jM1577R;
        int i11;
        long jM1577R2;
        int iM1252i4;
        int i12;
        int i13;
        int i14;
        int i15 = 4;
        AbstractC0646n.m1631i(this.f2894f);
        while (c0651s.m1667a() > 0) {
            int i16 = this.f2895g;
            C0651s c0651s2 = this.f2889a;
            switch (i16) {
                case 0:
                    while (c0651s.m1667a() > 0) {
                        int i17 = this.f2897i << 8;
                        this.f2897i = i17;
                        int iM1687u = i17 | c0651s.m1687u();
                        this.f2897i = iM1687u;
                        if (iM1687u == 2147385345 || iM1687u == -25230976 || iM1687u == 536864768 || iM1687u == -14745368) {
                            i3 = 1;
                        } else if (iM1687u == 1683496997 || iM1687u == 622876772) {
                            i3 = 2;
                        } else if (iM1687u == 1078008818 || iM1687u == -233094848) {
                            i3 = 3;
                        } else {
                            i3 = (iM1687u == 1908687592 || iM1687u == -398277519) ? 4 : 0;
                        }
                        this.f2901m = i3;
                        if (i3 != 0) {
                            byte[] bArr = c0651s2.f2520a;
                            bArr[0] = (byte) ((iM1687u >> 24) & 255);
                            bArr[1] = (byte) ((iM1687u >> 16) & 255);
                            bArr[2] = (byte) ((iM1687u >> 8) & 255);
                            bArr[3] = (byte) (iM1687u & 255);
                            this.f2896h = 4;
                            this.f2897i = 0;
                            if (i3 == 3 || i3 == 4) {
                                this.f2895g = 4;
                            } else if (i3 == 1) {
                                this.f2895g = 1;
                            } else {
                                this.f2895g = 2;
                            }
                            break;
                        }
                    }
                    break;
                case 1:
                    if (m1857a(c0651s, c0651s2.f2520a, 18)) {
                        byte[] bArr2 = c0651s2.f2520a;
                        if (this.f2899k == null) {
                            String str = this.f2893e;
                            C0508g c0508gM4814i = AbstractC2229b.m4814i(bArr2);
                            c0508gM4814i.m1263t(60);
                            int i18 = AbstractC2229b.f9574j[c0508gM4814i.m1252i(6)];
                            int i19 = AbstractC2229b.f9575k[c0508gM4814i.m1252i(4)];
                            int iM1252i5 = c0508gM4814i.m1252i(5);
                            int i20 = iM1252i5 >= 29 ? -1 : (AbstractC2229b.f9576l[iM1252i5] * 1000) / 2;
                            c0508gM4814i.m1263t(10);
                            int i21 = i18 + (c0508gM4814i.m1252i(2) > 0 ? 1 : 0);
                            C0582n c0582n = new C0582n();
                            c0582n.f2102a = str;
                            c0582n.f2114m = AbstractC0545H.m1364l("audio/vnd.dts");
                            c0582n.f2109h = i20;
                            c0582n.f2092B = i21;
                            c0582n.f2093C = i19;
                            c0582n.f2118q = null;
                            c0582n.f2105d = this.f2891c;
                            c0582n.f2107f = this.f2892d;
                            C0583o c0583o = new C0583o(c0582n);
                            this.f2899k = c0583o;
                            this.f2894f.mo1176e(c0583o);
                        }
                        byte b6 = bArr2[0];
                        if (b6 != -2) {
                            if (b6 == -1) {
                                i7 = ((bArr2[7] & 3) << 12) | ((bArr2[6] & 255) << 4);
                                b5 = bArr2[9];
                            } else if (b6 != 31) {
                                i4 = (((bArr2[5] & 3) << 12) | ((bArr2[6] & 255) << 4) | ((bArr2[7] & 240) >> 4)) + 1;
                                z3 = false;
                            } else {
                                i7 = ((bArr2[6] & 3) << 12) | ((bArr2[7] & 255) << 4);
                                b5 = bArr2[8];
                            }
                            i4 = (i7 | ((b5 & 60) >> 2)) + 1;
                            z3 = true;
                        } else {
                            i4 = (((bArr2[4] & 3) << 12) | ((bArr2[7] & 255) << 4) | ((bArr2[6] & 240) >> 4)) + 1;
                            z3 = false;
                        }
                        if (z3) {
                            i4 = (i4 * 16) / 14;
                        }
                        this.f2900l = i4;
                        if (b6 != -2) {
                            if (b6 == -1) {
                                i5 = (bArr2[4] & 7) << 4;
                                b4 = bArr2[7];
                            } else if (b6 != 31) {
                                i5 = (bArr2[4] & 1) << 6;
                                b3 = bArr2[5];
                            } else {
                                i5 = (bArr2[5] & 7) << 4;
                                b4 = bArr2[6];
                            }
                            i6 = b4 & 60;
                            this.f2898j = AbstractC1303m.m3312e(AbstractC0632A.m1575P(this.f2899k.f2131D, (((i6 >> 2) | i5) + 1) * 32));
                            c0651s2.m1665G(0);
                            this.f2894f.mo1173b(18, c0651s2);
                            this.f2895g = 6;
                        } else {
                            i5 = (bArr2[5] & 1) << 6;
                            b3 = bArr2[4];
                        }
                        i6 = b3 & 252;
                        this.f2898j = AbstractC1303m.m3312e(AbstractC0632A.m1575P(this.f2899k.f2131D, (((i6 >> 2) | i5) + 1) * 32));
                        c0651s2.m1665G(0);
                        this.f2894f.mo1173b(18, c0651s2);
                        this.f2895g = 6;
                        break;
                    }
                    break;
                case 2:
                    if (m1857a(c0651s, c0651s2.f2520a, 7)) {
                        C0508g c0508gM4814i2 = AbstractC2229b.m4814i(c0651s2.f2520a);
                        c0508gM4814i2.m1263t(42);
                        this.f2902n = c0508gM4814i2.m1252i(c0508gM4814i2.m1251h() ? 12 : 8) + 1;
                        this.f2895g = 3;
                    }
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    if (m1857a(c0651s, c0651s2.f2520a, this.f2902n)) {
                        C0508g c0508gM4814i3 = AbstractC2229b.m4814i(c0651s2.f2520a);
                        c0508gM4814i3.m1263t(40);
                        int iM1252i6 = c0508gM4814i3.m1252i(2);
                        if (c0508gM4814i3.m1251h()) {
                            i8 = 20;
                            i9 = 12;
                        } else {
                            i8 = 16;
                            i9 = 8;
                        }
                        c0508gM4814i3.m1263t(i9);
                        int iM1252i7 = c0508gM4814i3.m1252i(i8) + 1;
                        boolean zM1251h = c0508gM4814i3.m1251h();
                        if (zM1251h) {
                            iM1252i = c0508gM4814i3.m1252i(2);
                            iM1252i2 = (c0508gM4814i3.m1252i(3) + 1) * 512;
                            if (c0508gM4814i3.m1251h()) {
                                c0508gM4814i3.m1263t(36);
                            }
                            int iM1252i8 = c0508gM4814i3.m1252i(3) + 1;
                            int iM1252i9 = c0508gM4814i3.m1252i(3) + 1;
                            if (iM1252i8 != 1 || iM1252i9 != 1) {
                                throw C0546I.m1367c("Multiple audio presentations or assets not supported");
                            }
                            int i22 = iM1252i6 + 1;
                            int iM1252i10 = c0508gM4814i3.m1252i(i22);
                            for (int i23 = 0; i23 < i22; i23++) {
                                if (((iM1252i10 >> i23) & 1) == 1) {
                                    c0508gM4814i3.m1263t(8);
                                }
                            }
                            if (c0508gM4814i3.m1251h()) {
                                c0508gM4814i3.m1263t(2);
                                int iM1252i11 = (c0508gM4814i3.m1252i(2) + 1) << 2;
                                int iM1252i12 = c0508gM4814i3.m1252i(2) + 1;
                                for (int i24 = 0; i24 < iM1252i12; i24++) {
                                    c0508gM4814i3.m1263t(iM1252i11);
                                }
                            }
                        } else {
                            iM1252i = -1;
                            iM1252i2 = 0;
                        }
                        c0508gM4814i3.m1263t(i8);
                        c0508gM4814i3.m1263t(12);
                        if (zM1251h) {
                            if (c0508gM4814i3.m1251h()) {
                                c0508gM4814i3.m1263t(4);
                            }
                            if (c0508gM4814i3.m1251h()) {
                                c0508gM4814i3.m1263t(24);
                            }
                            if (c0508gM4814i3.m1251h()) {
                                c0508gM4814i3.m1264u(c0508gM4814i3.m1252i(10) + 1);
                            }
                            c0508gM4814i3.m1263t(5);
                            int i25 = AbstractC2229b.f9577m[c0508gM4814i3.m1252i(4)];
                            iM1252i3 = c0508gM4814i3.m1252i(8) + 1;
                            i10 = i25;
                        } else {
                            iM1252i3 = -1;
                            i10 = -2147483647;
                        }
                        if (zM1251h) {
                            if (iM1252i == 0) {
                                i11 = 32000;
                            } else if (iM1252i == 1) {
                                i11 = 44100;
                            } else {
                                if (iM1252i != 2) {
                                    throw C0546I.m1365a(null, "Unsupported reference clock code in DTS HD header: " + iM1252i);
                                }
                                i11 = 48000;
                            }
                            int i26 = AbstractC0632A.f2454a;
                            jM1577R = AbstractC0632A.m1577R(iM1252i2, 1000000L, i11, RoundingMode.DOWN);
                        } else {
                            jM1577R = -9223372036854775807L;
                        }
                        m1858g(new C2228a("audio/vnd.dts.hd;profile=lbr", iM1252i3, i10, iM1252i7, jM1577R));
                        this.f2900l = iM1252i7;
                        this.f2898j = jM1577R == -9223372036854775807L ? 0L : jM1577R;
                        c0651s2.m1665G(0);
                        this.f2894f.mo1173b(this.f2902n, c0651s2);
                        this.f2895g = 6;
                    }
                    break;
                case 4:
                    if (m1857a(c0651s, c0651s2.f2520a, 6)) {
                        C0508g c0508gM4814i4 = AbstractC2229b.m4814i(c0651s2.f2520a);
                        c0508gM4814i4.m1263t(32);
                        int iM4822q = AbstractC2229b.m4822q(c0508gM4814i4, AbstractC2229b.f9582r) + 1;
                        this.f2903o = iM4822q;
                        int i27 = this.f2896h;
                        if (i27 > iM4822q) {
                            int i28 = i27 - iM4822q;
                            this.f2896h = i27 - i28;
                            c0651s.m1665G(c0651s.f2521b - i28);
                        }
                        this.f2895g = 5;
                    }
                    break;
                case 5:
                    if (m1857a(c0651s, c0651s2.f2520a, this.f2903o)) {
                        byte[] bArr3 = c0651s2.f2520a;
                        AtomicInteger atomicInteger = this.f2890b;
                        C0508g c0508gM4814i5 = AbstractC2229b.m4814i(bArr3);
                        int i29 = c0508gM4814i5.m1252i(32) == 1078008818 ? 1 : 0;
                        int iM4822q2 = AbstractC2229b.m4822q(c0508gM4814i5, AbstractC2229b.f9578n);
                        int i30 = iM4822q2 + 1;
                        if (i29 == 0) {
                            jM1577R2 = -9223372036854775807L;
                            iM1252i4 = -2147483647;
                        } else {
                            if (!c0508gM4814i5.m1251h()) {
                                throw C0546I.m1367c("Only supports full channel mask-based audio presentation");
                            }
                            int i31 = iM4822q2 - 1;
                            int i32 = ((bArr3[i31] << 8) & 65535) | (bArr3[iM4822q2] & 255);
                            int i33 = AbstractC0632A.f2454a;
                            int i34 = 65535;
                            for (int i35 = 0; i35 < i31; i35++) {
                                byte b7 = bArr3[i35];
                                int[] iArr = AbstractC0632A.f2466m;
                                int i36 = (iArr[(((b7 & 255) >> 4) ^ ((i34 >> 12) & 255)) & 255] ^ ((i34 << 4) & 65535)) & 65535;
                                i34 = (((i36 << 4) & 65535) ^ iArr[((b7 & 15) ^ ((i36 >> 12) & 255)) & 255]) & 65535;
                            }
                            if (i32 != i34) {
                                throw C0546I.m1365a(null, "CRC check failed");
                            }
                            int iM1252i13 = c0508gM4814i5.m1252i(2);
                            if (iM1252i13 != 0) {
                                if (iM1252i13 == 1) {
                                    i13 = 480;
                                } else {
                                    if (iM1252i13 != 2) {
                                        throw C0546I.m1365a(null, "Unsupported base duration index in DTS UHD header: " + iM1252i13);
                                    }
                                    i13 = 384;
                                }
                                i12 = 3;
                            } else {
                                i12 = 3;
                                i13 = 512;
                            }
                            int iM1252i14 = (c0508gM4814i5.m1252i(i12) + 1) * i13;
                            int iM1252i15 = c0508gM4814i5.m1252i(2);
                            if (iM1252i15 == 0) {
                                i14 = 32000;
                            } else if (iM1252i15 == 1) {
                                i14 = 44100;
                            } else {
                                if (iM1252i15 != 2) {
                                    throw C0546I.m1365a(null, "Unsupported clock rate index in DTS UHD header: " + iM1252i15);
                                }
                                i14 = 48000;
                            }
                            if (c0508gM4814i5.m1251h()) {
                                c0508gM4814i5.m1263t(36);
                            }
                            iM1252i4 = i14 * (1 << c0508gM4814i5.m1252i(2));
                            jM1577R2 = AbstractC0632A.m1577R(iM1252i14, 1000000L, i14, RoundingMode.DOWN);
                        }
                        int iM4822q3 = 0;
                        for (int i37 = 0; i37 < i29; i37++) {
                            iM4822q3 += AbstractC2229b.m4822q(c0508gM4814i5, AbstractC2229b.f9579o);
                        }
                        if (i29 != 0) {
                            atomicInteger.set(AbstractC2229b.m4822q(c0508gM4814i5, AbstractC2229b.f9580p));
                        }
                        int iM4822q4 = iM4822q3 + (atomicInteger.get() != 0 ? AbstractC2229b.m4822q(c0508gM4814i5, AbstractC2229b.f9581q) : 0) + i30;
                        C2228a c2228a = new C2228a("audio/vnd.dts.uhd;profile=p2", 2, iM1252i4, iM4822q4, jM1577R2);
                        if (this.f2901m == 3) {
                            m1858g(c2228a);
                        }
                        this.f2900l = iM4822q4;
                        this.f2898j = jM1577R2 == -9223372036854775807L ? 0L : jM1577R2;
                        c0651s2.m1665G(0);
                        this.f2894f.mo1173b(this.f2903o, c0651s2);
                        this.f2895g = 6;
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    int iMin = Math.min(c0651s.m1667a(), this.f2900l - this.f2896h);
                    this.f2894f.mo1173b(iMin, c0651s);
                    int i38 = this.f2896h + iMin;
                    this.f2896h = i38;
                    if (i38 == this.f2900l) {
                        AbstractC0646n.m1630h(this.f2904p != -9223372036854775807L);
                        this.f2894f.mo1172a(this.f2904p, this.f2901m == i15 ? 0 : 1, this.f2900l, 0, null);
                        this.f2904p += this.f2898j;
                        this.f2895g = 0;
                    } else {
                        continue;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
            i15 = 4;
        }
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: e */
    public final void mo1855e(InterfaceC2242o interfaceC2242o, C0736G c0736g) {
        c0736g.m1848a();
        c0736g.m1849b();
        this.f2893e = c0736g.f2836e;
        c0736g.m1849b();
        this.f2894f = interfaceC2242o.mo344p(c0736g.f2835d, 1);
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: f */
    public final void mo1856f(int i3, long j3) {
        this.f2904p = j3;
    }

    /* JADX INFO: renamed from: g */
    public final void m1858g(C2228a c2228a) {
        int i3;
        int i4 = c2228a.f9563b;
        if (i4 == -2147483647 || (i3 = c2228a.f9564c) == -1) {
            return;
        }
        C0583o c0583o = this.f2899k;
        String str = c2228a.f9562a;
        if (c0583o != null && i3 == c0583o.f2130C && i4 == c0583o.f2131D && str.equals(c0583o.f2154n)) {
            return;
        }
        C0583o c0583o2 = this.f2899k;
        C0582n c0582n = c0583o2 == null ? new C0582n() : c0583o2.m1447a();
        c0582n.f2102a = this.f2893e;
        c0582n.f2114m = AbstractC0545H.m1364l(str);
        c0582n.f2092B = i3;
        c0582n.f2093C = i4;
        c0582n.f2105d = this.f2891c;
        c0582n.f2107f = this.f2892d;
        C0583o c0583o3 = new C0583o(c0582n);
        this.f2899k = c0583o3;
        this.f2894f.mo1176e(c0583o3);
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: d */
    public final void mo1854d(boolean z3) {
    }
}

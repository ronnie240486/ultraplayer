package p071Y0;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.cast.AbstractC1303m;
import p048Q0.C0508g;
import p055T.AbstractC0545H;
import p055T.C0546I;
import p055T.C0582n;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p066W1.AbstractC0664e;
import p105h2.AbstractC1676G;
import p105h2.C1692X;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2242o;

/* JADX INFO: renamed from: Y0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0758u implements InterfaceC0745h {

    /* JADX INFO: renamed from: e */
    public String f3076e;

    /* JADX INFO: renamed from: f */
    public InterfaceC2226E f3077f;

    /* JADX INFO: renamed from: i */
    public boolean f3080i;

    /* JADX INFO: renamed from: k */
    public int f3082k;

    /* JADX INFO: renamed from: l */
    public int f3083l;

    /* JADX INFO: renamed from: n */
    public int f3085n;

    /* JADX INFO: renamed from: o */
    public int f3086o;

    /* JADX INFO: renamed from: s */
    public int f3090s;

    /* JADX INFO: renamed from: u */
    public boolean f3092u;

    /* JADX INFO: renamed from: d */
    public int f3075d = 0;

    /* JADX INFO: renamed from: a */
    public final C0651s f3072a = new C0651s(new byte[15], 2);

    /* JADX INFO: renamed from: b */
    public final C0508g f3073b = new C0508g();

    /* JADX INFO: renamed from: c */
    public final C0651s f3074c = new C0651s();

    /* JADX INFO: renamed from: p */
    public final C0759v f3087p = new C0759v();

    /* JADX INFO: renamed from: q */
    public int f3088q = -2147483647;

    /* JADX INFO: renamed from: r */
    public int f3089r = -1;

    /* JADX INFO: renamed from: t */
    public long f3091t = -1;

    /* JADX INFO: renamed from: j */
    public boolean f3081j = true;

    /* JADX INFO: renamed from: m */
    public boolean f3084m = true;

    /* JADX INFO: renamed from: g */
    public double f3078g = -9.223372036854776E18d;

    /* JADX INFO: renamed from: h */
    public double f3079h = -9.223372036854776E18d;

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: b */
    public final void mo1852b() {
        this.f3075d = 0;
        this.f3083l = 0;
        this.f3072a.m1662D(2);
        this.f3085n = 0;
        this.f3086o = 0;
        this.f3088q = -2147483647;
        this.f3089r = -1;
        this.f3090s = 0;
        this.f3091t = -1L;
        this.f3092u = false;
        this.f3080i = false;
        this.f3084m = true;
        this.f3081j = true;
        this.f3078g = -9.223372036854776E18d;
        this.f3079h = -9.223372036854776E18d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:156:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:158:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:160:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:163:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:236:0x045e  */
    /* JADX WARN: Code duplicated, block: B:237:0x046a  */
    /* JADX WARN: Code duplicated, block: B:239:0x046d  */
    /* JADX WARN: Code duplicated, block: B:240:0x0486  */
    /* JADX WARN: Code duplicated, block: B:242:0x048d  */
    /* JADX WARN: Instruction removed from duplicated block: B:156:0x02c2, please report this as an issue */
    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: c */
    public final void mo1853c(C0651s c0651s) throws C0546I {
        C0759v c0759v;
        long j3;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int iM1252i;
        int iM1252i2;
        int i6;
        char c;
        byte[] bArr;
        long j4;
        long j5;
        C1692X c1692xM4121s;
        int iM1252i3;
        int i7 = 4;
        int i8 = 1;
        AbstractC0646n.m1631i(this.f3077f);
        while (c0651s.m1667a() > 0) {
            int i9 = this.f3075d;
            if (i9 != 0) {
                C0759v c0759v2 = this.f3087p;
                C0651s c0651s2 = this.f3074c;
                if (i9 == i8) {
                    int iM1667a = c0651s.m1667a();
                    C0651s c0651s3 = this.f3072a;
                    int iMin = Math.min(iM1667a, c0651s3.m1667a());
                    c0651s.m1671e(c0651s3.f2520a, c0651s3.f2521b, iMin);
                    c0651s3.m1666H(iMin);
                    if (c0651s3.m1667a() == 0) {
                        int i10 = c0651s3.f2522c;
                        byte[] bArr2 = c0651s3.f2520a;
                        C0508g c0508g = this.f3073b;
                        c0508g.m1259p(bArr2, i10);
                        c0508g.m1249f();
                        int iM1726K = AbstractC0664e.m1726K(c0508g, 3, 8, 8);
                        c0759v2.f3093a = iM1726K;
                        if (iM1726K == -1) {
                            c0759v = c0759v2;
                        } else {
                            AbstractC0646n.m1625c(Math.max(Math.max(2, 8), 32) <= 63);
                            c0759v = c0759v2;
                            AbstractC1303m.m3310d(AbstractC1303m.m3310d(3L, 255L), 4294967296L);
                            if (c0508g.m1245b() < 2) {
                                j3 = -1;
                            } else {
                                long jM1254k = c0508g.m1254k(2);
                                if (jM1254k == 3) {
                                    if (c0508g.m1245b() >= 8) {
                                        long jM1254k2 = c0508g.m1254k(8);
                                        jM1254k += jM1254k2;
                                        if (jM1254k2 == 255) {
                                            if (c0508g.m1245b() >= 32) {
                                                jM1254k = c0508g.m1254k(32) + jM1254k;
                                            }
                                        }
                                    }
                                    j3 = -1;
                                }
                                j3 = jM1254k;
                            }
                            c0759v.f3094b = j3;
                            if (j3 != -1) {
                                if (j3 > 16) {
                                    throw C0546I.m1367c("Contains sub-stream with an invalid packet label " + c0759v.f3094b);
                                }
                                if (j3 == 0) {
                                    int i11 = c0759v.f3093a;
                                    if (i11 == 1) {
                                        throw C0546I.m1365a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                    }
                                    if (i11 == 2) {
                                        throw C0546I.m1365a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                    }
                                    if (i11 == 17) {
                                        throw C0546I.m1365a(null, "AudioTruncation packet with invalid packet label 0");
                                    }
                                }
                                int iM1726K2 = AbstractC0664e.m1726K(c0508g, 11, 24, 24);
                                c0759v.f3095c = iM1726K2;
                                z3 = iM1726K2 != -1;
                            }
                            if (z3) {
                                i3 = 0;
                                this.f3085n = 0;
                                this.f3086o = c0759v.f3095c + i10 + this.f3086o;
                            } else {
                                i3 = 0;
                            }
                            if (z3) {
                                c0651s3.m1665G(i3);
                                this.f3077f.mo1173b(c0651s3.f2522c, c0651s3);
                                c0651s3.m1662D(2);
                                c0651s2.m1662D(c0759v.f3095c);
                                this.f3084m = true;
                                this.f3075d = 2;
                            } else {
                                i4 = c0651s3.f2522c;
                                if (i4 < 15) {
                                    c0651s3.m1664F(i4 + 1);
                                    this.f3084m = false;
                                }
                            }
                        }
                        if (z3) {
                            i3 = 0;
                            this.f3085n = 0;
                            this.f3086o = c0759v.f3095c + i10 + this.f3086o;
                        } else {
                            i3 = 0;
                        }
                        if (z3) {
                            c0651s3.m1665G(i3);
                            this.f3077f.mo1173b(c0651s3.f2522c, c0651s3);
                            c0651s3.m1662D(2);
                            c0651s2.m1662D(c0759v.f3095c);
                            this.f3084m = true;
                            this.f3075d = 2;
                        } else {
                            i4 = c0651s3.f2522c;
                            if (i4 < 15) {
                                c0651s3.m1664F(i4 + 1);
                                this.f3084m = false;
                            }
                        }
                    } else {
                        this.f3084m = false;
                    }
                } else {
                    if (i9 != 2) {
                        throw new IllegalStateException();
                    }
                    int i12 = c0759v2.f3093a;
                    if (i12 == i8 || i12 == 17) {
                        int i13 = c0651s.f2521b;
                        int iMin2 = Math.min(c0651s.m1667a(), c0651s2.m1667a());
                        c0651s.m1671e(c0651s2.f2520a, c0651s2.f2521b, iMin2);
                        c0651s2.m1666H(iMin2);
                        c0651s.m1665G(i13);
                    }
                    int iMin3 = Math.min(c0651s.m1667a(), c0759v2.f3095c - this.f3085n);
                    this.f3077f.mo1173b(iMin3, c0651s);
                    int i14 = this.f3085n + iMin3;
                    this.f3085n = i14;
                    if (i14 != c0759v2.f3095c) {
                        continue;
                    } else {
                        int i15 = c0759v2.f3093a;
                        if (i15 == i8) {
                            byte[] bArr3 = c0651s2.f2520a;
                            C0508g c0508g2 = new C0508g(bArr3, bArr3.length);
                            int iM1252i4 = c0508g2.m1252i(8);
                            int iM1252i5 = c0508g2.m1252i(5);
                            if (iM1252i5 != 31) {
                                switch (iM1252i5) {
                                    case 0:
                                        iM1252i2 = 96000;
                                        break;
                                    case 1:
                                        iM1252i2 = 88200;
                                        break;
                                    case 2:
                                        iM1252i2 = 64000;
                                        break;
                                    case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                        iM1252i2 = 48000;
                                        break;
                                    case 4:
                                        iM1252i2 = 44100;
                                        break;
                                    case 5:
                                        iM1252i2 = 32000;
                                        break;
                                    case 6:
                                        iM1252i2 = 24000;
                                        break;
                                    case 7:
                                        iM1252i2 = 22050;
                                        break;
                                    case 8:
                                        iM1252i2 = 16000;
                                        break;
                                    case 9:
                                        iM1252i2 = 12000;
                                        break;
                                    case 10:
                                        iM1252i2 = 11025;
                                        break;
                                    case 11:
                                        iM1252i2 = 8000;
                                        break;
                                    case 12:
                                        iM1252i2 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        throw C0546I.m1367c("Unsupported sampling rate index " + iM1252i5);
                                    case 15:
                                        iM1252i2 = 57600;
                                        break;
                                    case 16:
                                        iM1252i2 = 51200;
                                        break;
                                    case 17:
                                        iM1252i2 = 40000;
                                        break;
                                    case 18:
                                        iM1252i2 = 38400;
                                        break;
                                    case 19:
                                        iM1252i2 = 34150;
                                        break;
                                    case 20:
                                        iM1252i2 = 28800;
                                        break;
                                    case 21:
                                        iM1252i2 = 25600;
                                        break;
                                    case 22:
                                        iM1252i2 = 20000;
                                        break;
                                    case 23:
                                        iM1252i2 = 19200;
                                        break;
                                    case 24:
                                        iM1252i2 = 17075;
                                        break;
                                    case 25:
                                        iM1252i2 = 14400;
                                        break;
                                    case 26:
                                        iM1252i2 = 12800;
                                        break;
                                    case 27:
                                        iM1252i2 = 9600;
                                        break;
                                }
                            } else {
                                iM1252i2 = c0508g2.m1252i(24);
                            }
                            int iM1252i6 = c0508g2.m1252i(3);
                            if (iM1252i6 == 0) {
                                i6 = 768;
                            } else if (iM1252i6 == i8) {
                                i6 = 1024;
                            } else if (iM1252i6 == 2 || iM1252i6 == 3) {
                                i6 = 2048;
                            } else {
                                if (iM1252i6 != i7) {
                                    throw C0546I.m1367c("Unsupported coreSbrFrameLengthIndex " + iM1252i6);
                                }
                                i6 = 4096;
                            }
                            if (iM1252i6 == 0 || iM1252i6 == i8) {
                                c = 0;
                            } else if (iM1252i6 == 2) {
                                c = 2;
                            } else if (iM1252i6 == 3) {
                                c = 3;
                            } else {
                                if (iM1252i6 != i7) {
                                    throw C0546I.m1367c("Unsupported coreSbrFrameLengthIndex " + iM1252i6);
                                }
                                c = 1;
                            }
                            c0508g2.m1263t(2);
                            AbstractC0664e.m1734T(c0508g2);
                            int iM1252i7 = c0508g2.m1252i(5);
                            int i16 = 0;
                            int iM1726K3 = 0;
                            while (true) {
                                int i17 = 16;
                                if (i16 < iM1252i7 + 1) {
                                    int iM1252i8 = c0508g2.m1252i(3);
                                    iM1726K3 = AbstractC0664e.m1726K(c0508g2, 5, 8, 16) + 1 + iM1726K3;
                                    if ((iM1252i8 == 0 || iM1252i8 == 2) && c0508g2.m1251h()) {
                                        AbstractC0664e.m1734T(c0508g2);
                                    }
                                    i16++;
                                } else {
                                    int iM1726K4 = AbstractC0664e.m1726K(c0508g2, i7, 8, 16) + 1;
                                    c0508g2.m1262s();
                                    int i18 = 0;
                                    while (true) {
                                        double d3 = 2.0d;
                                        if (i18 < iM1726K4) {
                                            int iM1252i9 = c0508g2.m1252i(2);
                                            if (iM1252i9 == 0) {
                                                c0508g2.m1263t(3);
                                                if (c0508g2.m1251h()) {
                                                    c0508g2.m1263t(13);
                                                }
                                                if (c > 0) {
                                                    AbstractC0664e.m1733S(c0508g2);
                                                }
                                            } else if (iM1252i9 == 1) {
                                                c0508g2.m1263t(3);
                                                boolean zM1251h = c0508g2.m1251h();
                                                if (zM1251h) {
                                                    c0508g2.m1263t(13);
                                                }
                                                if (zM1251h) {
                                                    c0508g2.m1262s();
                                                }
                                                if (c > 0) {
                                                    AbstractC0664e.m1733S(c0508g2);
                                                    iM1252i3 = c0508g2.m1252i(2);
                                                } else {
                                                    iM1252i3 = 0;
                                                }
                                                if (iM1252i3 > 0) {
                                                    c0508g2.m1263t(6);
                                                    int iM1252i10 = c0508g2.m1252i(2);
                                                    c0508g2.m1263t(i7);
                                                    if (c0508g2.m1251h()) {
                                                        c0508g2.m1263t(5);
                                                    }
                                                    if (iM1252i3 == 2 || iM1252i3 == 3) {
                                                        c0508g2.m1263t(6);
                                                    }
                                                    if (iM1252i10 == 2) {
                                                        c0508g2.m1262s();
                                                    }
                                                }
                                                int iFloor = ((int) Math.floor(Math.log(iM1726K3 - 1) / Math.log(2.0d))) + 1;
                                                int iM1252i11 = c0508g2.m1252i(2);
                                                if (iM1252i11 > 0 && c0508g2.m1251h()) {
                                                    c0508g2.m1263t(iFloor);
                                                }
                                                if (c0508g2.m1251h()) {
                                                    c0508g2.m1263t(iFloor);
                                                }
                                                if (c == 0 && iM1252i11 == 0) {
                                                    c0508g2.m1262s();
                                                }
                                            } else if (iM1252i9 == 3) {
                                                AbstractC0664e.m1726K(c0508g2, i7, 8, i17);
                                                int iM1726K5 = AbstractC0664e.m1726K(c0508g2, i7, 8, i17);
                                                if (c0508g2.m1251h()) {
                                                    AbstractC0664e.m1726K(c0508g2, 8, i17, 0);
                                                }
                                                c0508g2.m1262s();
                                                if (iM1726K5 > 0) {
                                                    c0508g2.m1263t(iM1726K5 * 8);
                                                }
                                            }
                                            i18++;
                                            i7 = 4;
                                            i17 = 16;
                                        } else {
                                            if (c0508g2.m1251h()) {
                                                int i19 = 4;
                                                int iM1726K6 = AbstractC0664e.m1726K(c0508g2, 2, 4, 8) + 1;
                                                int i20 = 0;
                                                bArr = null;
                                                while (i20 < iM1726K6) {
                                                    int iM1726K7 = AbstractC0664e.m1726K(c0508g2, i19, 8, 16);
                                                    int iM1726K8 = AbstractC0664e.m1726K(c0508g2, i19, 8, 16);
                                                    if (iM1726K7 == 7) {
                                                        int iM1252i12 = c0508g2.m1252i(i19) + 1;
                                                        c0508g2.m1263t(i19);
                                                        byte[] bArr4 = new byte[iM1252i12];
                                                        for (int i21 = 0; i21 < iM1252i12; i21++) {
                                                            bArr4[i21] = (byte) c0508g2.m1252i(8);
                                                        }
                                                        bArr = bArr4;
                                                    } else {
                                                        c0508g2.m1263t(iM1726K8 * 8);
                                                    }
                                                    i20++;
                                                    i19 = 4;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (iM1252i2) {
                                                case 14700:
                                                case 16000:
                                                    d3 = 3.0d;
                                                    this.f3088q = (int) (((double) iM1252i2) * d3);
                                                    this.f3089r = (int) (((double) i6) * d3);
                                                    j4 = this.f3091t;
                                                    j5 = c0759v2.f3094b;
                                                    if (j4 != j5) {
                                                        this.f3091t = j5;
                                                        String strConcat = iM1252i4 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(iM1252i4))) : "mhm1";
                                                        if (bArr != null || bArr.length <= 0) {
                                                            c1692xM4121s = null;
                                                        } else {
                                                            c1692xM4121s = AbstractC1676G.m4121s(AbstractC0632A.f2459f, bArr);
                                                        }
                                                        C0582n c0582n = new C0582n();
                                                        c0582n.f2102a = this.f3076e;
                                                        c0582n.f2114m = AbstractC0545H.m1364l("audio/mhm1");
                                                        c0582n.f2093C = this.f3088q;
                                                        c0582n.f2111j = strConcat;
                                                        c0582n.f2117p = c1692xM4121s;
                                                        this.f3077f.mo1176e(new C0583o(c0582n));
                                                    }
                                                    this.f3092u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.f3088q = (int) (((double) iM1252i2) * d3);
                                                    this.f3089r = (int) (((double) i6) * d3);
                                                    j4 = this.f3091t;
                                                    j5 = c0759v2.f3094b;
                                                    if (j4 != j5) {
                                                        this.f3091t = j5;
                                                        if (iM1252i4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            c1692xM4121s = null;
                                                        } else {
                                                            c1692xM4121s = null;
                                                        }
                                                        C0582n c0582n2 = new C0582n();
                                                        c0582n2.f2102a = this.f3076e;
                                                        c0582n2.f2114m = AbstractC0545H.m1364l("audio/mhm1");
                                                        c0582n2.f2093C = this.f3088q;
                                                        c0582n2.f2111j = strConcat;
                                                        c0582n2.f2117p = c1692xM4121s;
                                                        this.f3077f.mo1176e(new C0583o(c0582n2));
                                                    }
                                                    this.f3092u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d3 = 1.5d;
                                                    this.f3088q = (int) (((double) iM1252i2) * d3);
                                                    this.f3089r = (int) (((double) i6) * d3);
                                                    j4 = this.f3091t;
                                                    j5 = c0759v2.f3094b;
                                                    if (j4 != j5) {
                                                        this.f3091t = j5;
                                                        if (iM1252i4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            c1692xM4121s = null;
                                                        } else {
                                                            c1692xM4121s = null;
                                                        }
                                                        C0582n c0582n3 = new C0582n();
                                                        c0582n3.f2102a = this.f3076e;
                                                        c0582n3.f2114m = AbstractC0545H.m1364l("audio/mhm1");
                                                        c0582n3.f2093C = this.f3088q;
                                                        c0582n3.f2111j = strConcat;
                                                        c0582n3.f2117p = c1692xM4121s;
                                                        this.f3077f.mo1176e(new C0583o(c0582n3));
                                                    }
                                                    this.f3092u = true;
                                                    break;
                                                case 44100:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d3 = 1.0d;
                                                    this.f3088q = (int) (((double) iM1252i2) * d3);
                                                    this.f3089r = (int) (((double) i6) * d3);
                                                    j4 = this.f3091t;
                                                    j5 = c0759v2.f3094b;
                                                    if (j4 != j5) {
                                                        this.f3091t = j5;
                                                        if (iM1252i4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            c1692xM4121s = null;
                                                        } else {
                                                            c1692xM4121s = null;
                                                        }
                                                        C0582n c0582n4 = new C0582n();
                                                        c0582n4.f2102a = this.f3076e;
                                                        c0582n4.f2114m = AbstractC0545H.m1364l("audio/mhm1");
                                                        c0582n4.f2093C = this.f3088q;
                                                        c0582n4.f2111j = strConcat;
                                                        c0582n4.f2117p = c1692xM4121s;
                                                        this.f3077f.mo1176e(new C0583o(c0582n4));
                                                    }
                                                    this.f3092u = true;
                                                    break;
                                                default:
                                                    throw C0546I.m1367c("Unsupported sampling rate " + iM1252i2);
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (i15 == 17) {
                            byte[] bArr5 = c0651s2.f2520a;
                            C0508g c0508g3 = new C0508g(bArr5, bArr5.length);
                            if (c0508g3.m1251h()) {
                                c0508g3.m1263t(2);
                                iM1252i = c0508g3.m1252i(13);
                            } else {
                                iM1252i = 0;
                            }
                            this.f3090s = iM1252i;
                        } else if (i15 == 2) {
                            if (this.f3092u) {
                                this.f3081j = false;
                                i5 = 1;
                            } else {
                                i5 = 0;
                            }
                            double d4 = (((double) (this.f3089r - this.f3090s)) * 1000000.0d) / ((double) this.f3088q);
                            long jRound = Math.round(this.f3078g);
                            if (this.f3080i) {
                                this.f3080i = false;
                                this.f3078g = this.f3079h;
                            } else {
                                this.f3078g += d4;
                            }
                            this.f3077f.mo1172a(jRound, i5, this.f3086o, 0, null);
                            this.f3092u = false;
                            this.f3090s = 0;
                            this.f3086o = 0;
                        }
                        this.f3075d = 1;
                    }
                }
            } else {
                int i22 = this.f3082k;
                if ((i22 & 2) == 0) {
                    c0651s.m1665G(c0651s.f2522c);
                } else {
                    if ((i22 & 4) == 0) {
                        while (true) {
                            if (c0651s.m1667a() > 0) {
                                int i23 = this.f3083l << 8;
                                this.f3083l = i23;
                                int iM1687u = i23 | c0651s.m1687u();
                                this.f3083l = iM1687u;
                                if ((iM1687u & 16777215) == 12583333) {
                                    c0651s.m1665G(c0651s.f2521b - 3);
                                    this.f3083l = 0;
                                }
                            }
                        }
                    }
                    this.f3075d = 1;
                }
            }
            i7 = 4;
            i8 = 1;
        }
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: e */
    public final void mo1855e(InterfaceC2242o interfaceC2242o, C0736G c0736g) {
        c0736g.m1848a();
        c0736g.m1849b();
        this.f3076e = c0736g.f2836e;
        c0736g.m1849b();
        this.f3077f = interfaceC2242o.mo344p(c0736g.f2835d, 1);
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: f */
    public final void mo1856f(int i3, long j3) {
        this.f3082k = i3;
        if (!this.f3081j && (this.f3086o != 0 || !this.f3084m)) {
            this.f3080i = true;
        }
        if (j3 != -9223372036854775807L) {
            if (this.f3080i) {
                this.f3079h = j3;
            } else {
                this.f3078g = j3;
            }
        }
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: d */
    public final void mo1854d(boolean z3) {
    }
}

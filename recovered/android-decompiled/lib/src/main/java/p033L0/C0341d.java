package p033L0;

import com.google.android.gms.internal.cast.AbstractC1303m;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.util.List;
import p018G0.C0222l;
import p018G0.C0224n;
import p055T.AbstractC0545H;
import p055T.C0544G;
import p055T.C0582n;
import p055T.C0583o;
import p055T.C0587s;
import p055T.InterfaceC0543F;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p068X0.C0688a;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1692X;
import p145s0.AbstractC2229b;
import p145s0.C2237j;
import p145s0.C2239l;
import p145s0.C2247t;
import p145s0.C2250w;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2240m;
import p145s0.InterfaceC2241n;
import p145s0.InterfaceC2242o;

/* JADX INFO: renamed from: L0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0341d implements InterfaceC2240m {

    /* JADX INFO: renamed from: a */
    public final long f1088a;

    /* JADX INFO: renamed from: b */
    public final C0651s f1089b;

    /* JADX INFO: renamed from: c */
    public final C2250w f1090c;

    /* JADX INFO: renamed from: d */
    public final C2247t f1091d;

    /* JADX INFO: renamed from: e */
    public final C0688a f1092e;

    /* JADX INFO: renamed from: f */
    public final C2239l f1093f;

    /* JADX INFO: renamed from: g */
    public InterfaceC2242o f1094g;

    /* JADX INFO: renamed from: h */
    public InterfaceC2226E f1095h;

    /* JADX INFO: renamed from: i */
    public InterfaceC2226E f1096i;

    /* JADX INFO: renamed from: j */
    public int f1097j;

    /* JADX INFO: renamed from: k */
    public C0544G f1098k;

    /* JADX INFO: renamed from: l */
    public long f1099l;

    /* JADX INFO: renamed from: m */
    public long f1100m;

    /* JADX INFO: renamed from: n */
    public long f1101n;

    /* JADX INFO: renamed from: o */
    public long f1102o;

    /* JADX INFO: renamed from: p */
    public int f1103p;

    /* JADX INFO: renamed from: q */
    public InterfaceC0343f f1104q;

    /* JADX INFO: renamed from: r */
    public boolean f1105r;

    /* JADX INFO: renamed from: s */
    public boolean f1106s;

    /* JADX INFO: renamed from: t */
    public long f1107t;

    public C0341d() {
        this(-9223372036854775807L);
    }

    /* JADX INFO: renamed from: b */
    public final void m947b() {
        InterfaceC0343f interfaceC0343f = this.f1104q;
        if ((interfaceC0343f instanceof C0338a) && ((C0338a) interfaceC0343f).mo941b()) {
            long j3 = this.f1102o;
            if (j3 == -1 || j3 == this.f1104q.mo943g()) {
                return;
            }
            C0338a c0338a = (C0338a) this.f1104q;
            long j4 = this.f1102o;
            int i3 = c0338a.f1082j;
            this.f1104q = new C0338a(j4, c0338a.f1080h, c0338a.f1081i, i3, c0338a.f1083k);
            InterfaceC2242o interfaceC2242o = this.f1094g;
            interfaceC2242o.getClass();
            interfaceC2242o.mo333b(this.f1104q);
        }
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: c */
    public final InterfaceC2240m mo327c() {
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m948d(C2237j c2237j) {
        InterfaceC0343f interfaceC0343f = this.f1104q;
        if (interfaceC0343f != null) {
            long jMo943g = interfaceC0343f.mo943g();
            if (jMo943g == -1 || c2237j.mo339j() <= jMo943g - 4) {
            }
            return true;
        }
        try {
            return !c2237j.mo338i(this.f1089b.f2520a, 0, 4, true);
        } catch (EOFException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0267  */
    /* JADX WARN: Code duplicated, block: B:114:0x0277  */
    /* JADX WARN: Code duplicated, block: B:120:0x028b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0291  */
    /* JADX WARN: Code duplicated, block: B:124:0x0295  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:130:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:136:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:140:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:142:0x02da  */
    /* JADX WARN: Code duplicated, block: B:144:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:146:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:14:0x0053  */
    /* JADX WARN: Code duplicated, block: B:216:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:217:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:220:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:29:0x008c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0090  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:78:0x01be  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d4 A[LOOP:4: B:84:0x01d2->B:85:0x01d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:94:0x0207  */
    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: e */
    public final int mo328e(InterfaceC2241n interfaceC2241n, C0587s c0587s) throws Throwable {
        Throwable th;
        int i3;
        int i4;
        long j3;
        long j4;
        int iMo1174c;
        int i5;
        int i6;
        int iM1673g;
        int iM1673g2;
        int iM1691y;
        long jM1689w;
        long[] jArr;
        int i7;
        int i8;
        long j5;
        int i9;
        int i10;
        long j6;
        long j7;
        C2247t c2247t;
        long jM1575P;
        long j8;
        InterfaceC0343f c0338a;
        long jM1575P2;
        long[] jArr2;
        int i11;
        C0340c c0340c;
        InterfaceC0343f c0338a2;
        long jM1571L;
        C2237j c2237j;
        int iM1687u;
        AbstractC0646n.m1631i(this.f1095h);
        int i12 = AbstractC0632A.f2454a;
        int i13 = this.f1097j;
        C2250w c2250w = this.f1090c;
        if (i13 == 0) {
            try {
                m949g((C2237j) interfaceC2241n, false);
            } catch (EOFException unused) {
                th = null;
                i3 = -1;
                i4 = -1;
                j3 = 1000000;
            }
        }
        InterfaceC0343f interfaceC0343f = this.f1104q;
        C0651s c0651s = this.f1089b;
        if (interfaceC0343f == null) {
            th = null;
            C0651s c0651s2 = new C0651s(c2250w.f9677b);
            j3 = 1000000;
            j4 = 0;
            ((C2237j) interfaceC2241n).mo338i(c0651s2.f2520a, 0, c2250w.f9677b, false);
            if ((c2250w.f9676a & 1) != 0) {
                if (c2250w.f9679d != 1) {
                    i6 = 36;
                } else {
                    i6 = 21;
                }
            } else if (c2250w.f9679d != 1) {
                i6 = 21;
            } else {
                i6 = 13;
            }
            if (c0651s2.f2522c >= i6 + 4) {
                c0651s2.m1665G(i6);
                iM1673g = c0651s2.m1673g();
                if (iM1673g != 1483304551 && iM1673g != 1231971951) {
                    if (c0651s2.f2522c >= 40) {
                        c0651s2.m1665G(36);
                        if (c0651s2.m1673g() == 1447187017) {
                            iM1673g = 1447187017;
                        } else {
                            iM1673g = 0;
                        }
                    } else {
                        iM1673g = 0;
                    }
                }
            } else if (c0651s2.f2522c >= 40) {
                c0651s2.m1665G(36);
                if (c0651s2.m1673g() == 1447187017) {
                    iM1673g = 1447187017;
                } else {
                    iM1673g = 0;
                }
            } else {
                iM1673g = 0;
            }
            C2247t c2247t2 = this.f1091d;
            if (iM1673g == 1231971951) {
                iM1673g2 = c0651s2.m1673g();
                if ((iM1673g2 & 1) != 0) {
                    iM1691y = c0651s2.m1691y();
                } else {
                    iM1691y = -1;
                }
                if ((iM1673g2 & 2) != 0) {
                    jM1689w = c0651s2.m1689w();
                } else {
                    jM1689w = -1;
                }
                if ((iM1673g2 & 4) == 4) {
                    jArr2 = new long[100];
                    for (i11 = 0; i11 < 100; i11++) {
                        jArr2[i11] = c0651s2.m1687u();
                    }
                    jArr = jArr2;
                } else {
                    jArr = null;
                }
                if ((iM1673g2 & 8) != 0) {
                    c0651s2.m1666H(4);
                }
                if (c0651s2.m1667a() >= 24) {
                    c0651s2.m1666H(21);
                    int iM1690x = c0651s2.m1690x();
                    i8 = (16773120 & iM1690x) >> 12;
                    i7 = iM1690x & 4095;
                } else {
                    i7 = -1;
                    i8 = -1;
                }
                j5 = iM1691y;
                i9 = c2250w.f9677b;
                int i14 = c2250w.f9678c;
                i10 = c2250w.f9680e;
                int i15 = c2250w.f9681f;
                if ((c2247t2.f9659a != -1 || c2247t2.f9660b == -1) && i8 != -1 && i7 != -1) {
                    c2247t2.f9659a = i8;
                    c2247t2.f9660b = i7;
                }
                C2237j c2237j2 = (C2237j) interfaceC2241n;
                j6 = c2237j2.f9629j;
                j7 = c2237j2.f9628i;
                if (j7 != -1 || jM1689w == -1) {
                    c2247t = c2247t2;
                } else {
                    c2247t = c2247t2;
                    long j9 = j6 + jM1689w;
                    if (j7 != j9) {
                        AbstractC0646n.m1639q("Mp3Extractor", "Data size mismatch between stream (" + j7 + ") and Xing frame (" + j9 + "), using Xing value.");
                    }
                }
                c2237j2.mo335d(c2250w.f9677b);
                if (iM1673g == 1483304551) {
                    if (j5 != -1 || j5 == 0) {
                        jM1575P2 = -9223372036854775807L;
                    } else {
                        jM1575P2 = AbstractC0632A.m1575P(i14, (j5 * ((long) i15)) - 1);
                    }
                    if (jM1575P2 == -9223372036854775807L) {
                        c0338a = null;
                    } else if (jM1689w != -1 || jArr == null) {
                        c0338a = new C0345h(j6, i9, jM1575P2, i10, -1L, null);
                    } else {
                        c0338a = new C0345h(j6, i9, jM1575P2, i10, jM1689w, jArr);
                    }
                } else {
                    if (j5 != -1 || j5 == 0) {
                        jM1575P = -9223372036854775807L;
                    } else {
                        jM1575P = AbstractC0632A.m1575P(i14, (((long) i15) * j5) - 1);
                    }
                    if (jM1575P != -9223372036854775807L) {
                        if (jM1689w != -1) {
                            j7 = j6 + jM1689w;
                            j8 = jM1689w - ((long) i9);
                        } else if (j7 != -1) {
                            j8 = (j7 - j6) - ((long) i9);
                        } else {
                            c0338a = null;
                        }
                        long j10 = j7;
                        long j11 = j8;
                        RoundingMode roundingMode = RoundingMode.HALF_UP;
                        c0338a = new C0338a(j10, j6 + ((long) i9), AbstractC1303m.m3312e(AbstractC0632A.m1577R(j11, 8000000L, jM1575P, roundingMode)), AbstractC1303m.m3312e(AbstractC1303m.m3317j(j11, j5, roundingMode)), false);
                    } else {
                        c0338a = null;
                    }
                }
            } else if (iM1673g == 1447187017) {
                C2237j c2237j3 = (C2237j) interfaceC2241n;
                long j12 = c2237j3.f9629j;
                c0651s2.m1666H(6);
                c2247t = c2247t2;
                long jM1673g = ((long) c2250w.f9677b) + j12 + ((long) c0651s2.m1673g());
                int iM1673g3 = c0651s2.m1673g();
                if (iM1673g3 > 0) {
                    int i16 = c2250w.f9678c;
                    c2237j = c2237j3;
                    long jM1577R = AbstractC0632A.m1577R(iM1673g3, ((long) (i16 >= 32000 ? 1152 : 576)) * 1000000, i16, RoundingMode.DOWN);
                    int iM1659A = c0651s2.m1659A();
                    int iM1659A2 = c0651s2.m1659A();
                    int iM1659A3 = c0651s2.m1659A();
                    c0651s2.m1666H(2);
                    long j13 = j12 + ((long) c2250w.f9677b);
                    long[] jArr3 = new long[iM1659A];
                    long[] jArr4 = new long[iM1659A];
                    int i17 = 0;
                    while (true) {
                        if (i17 >= iM1659A) {
                            long[] jArr5 = jArr4;
                            long[] jArr6 = jArr3;
                            long j14 = c2237j.f9628i;
                            if (j14 != -1 && j14 != jM1673g) {
                                AbstractC0646n.m1647y("VbriSeeker", "VBRI data size mismatch: " + j14 + ", " + jM1673g);
                            }
                            if (jM1673g != j13) {
                                AbstractC0646n.m1647y("VbriSeeker", "VBRI bytes and ToC mismatch (using max): " + jM1673g + ", " + j13 + "\nSeeking will be inaccurate.");
                                jM1673g = Math.max(jM1673g, j13);
                            }
                            c0338a = new C0344g(jArr6, jArr5, jM1577R, jM1673g, c2250w.f9680e);
                            break;
                        }
                        long[] jArr7 = jArr4;
                        long[] jArr8 = jArr3;
                        jArr8[i17] = (((long) i17) * jM1577R) / ((long) iM1659A);
                        jArr7[i17] = j13;
                        if (iM1659A3 == 1) {
                            iM1687u = c0651s2.m1687u();
                        } else if (iM1659A3 == 2) {
                            iM1687u = c0651s2.m1659A();
                        } else if (iM1659A3 == 3) {
                            iM1687u = c0651s2.m1690x();
                        } else {
                            if (iM1659A3 != 4) {
                                c0338a = null;
                                break;
                            }
                            iM1687u = c0651s2.m1691y();
                        }
                        j13 += ((long) iM1659A2) * ((long) iM1687u);
                        i17++;
                        jArr3 = jArr8;
                        jArr4 = jArr7;
                    }
                } else {
                    c0338a = null;
                    c2237j = c2237j3;
                }
                c2237j.mo335d(c2250w.f9677b);
            } else if (iM1673g != 1483304551) {
                ((C2237j) interfaceC2241n).f9631l = 0;
                c0338a = null;
                c2247t = c2247t2;
            } else {
                iM1673g2 = c0651s2.m1673g();
                if ((iM1673g2 & 1) != 0) {
                    iM1691y = c0651s2.m1691y();
                } else {
                    iM1691y = -1;
                }
                if ((iM1673g2 & 2) != 0) {
                    jM1689w = c0651s2.m1689w();
                } else {
                    jM1689w = -1;
                }
                if ((iM1673g2 & 4) == 4) {
                    jArr2 = new long[100];
                    while (i11 < 100) {
                        jArr2[i11] = c0651s2.m1687u();
                    }
                    jArr = jArr2;
                } else {
                    jArr = null;
                }
                if ((iM1673g2 & 8) != 0) {
                    c0651s2.m1666H(4);
                }
                if (c0651s2.m1667a() >= 24) {
                    c0651s2.m1666H(21);
                    int iM1690x2 = c0651s2.m1690x();
                    i8 = (16773120 & iM1690x2) >> 12;
                    i7 = iM1690x2 & 4095;
                } else {
                    i7 = -1;
                    i8 = -1;
                }
                j5 = iM1691y;
                i9 = c2250w.f9677b;
                int i18 = c2250w.f9678c;
                i10 = c2250w.f9680e;
                int i19 = c2250w.f9681f;
                if (c2247t2.f9659a != -1) {
                    c2247t2.f9659a = i8;
                    c2247t2.f9660b = i7;
                } else {
                    c2247t2.f9659a = i8;
                    c2247t2.f9660b = i7;
                }
                C2237j c2237j4 = (C2237j) interfaceC2241n;
                j6 = c2237j4.f9629j;
                j7 = c2237j4.f9628i;
                if (j7 != -1) {
                    c2247t = c2247t2;
                } else {
                    c2247t = c2247t2;
                }
                c2237j4.mo335d(c2250w.f9677b);
                if (iM1673g == 1483304551) {
                    if (j5 != -1) {
                        jM1575P2 = -9223372036854775807L;
                    } else {
                        jM1575P2 = -9223372036854775807L;
                    }
                    if (jM1575P2 == -9223372036854775807L) {
                        c0338a = null;
                    } else if (jM1689w != -1) {
                        c0338a = new C0345h(j6, i9, jM1575P2, i10, -1L, null);
                    } else {
                        c0338a = new C0345h(j6, i9, jM1575P2, i10, -1L, null);
                    }
                } else {
                    if (j5 != -1) {
                        jM1575P = -9223372036854775807L;
                    } else {
                        jM1575P = -9223372036854775807L;
                    }
                    if (jM1575P != -9223372036854775807L) {
                        if (jM1689w != -1) {
                            j7 = j6 + jM1689w;
                            j8 = jM1689w - ((long) i9);
                        } else if (j7 != -1) {
                            j8 = (j7 - j6) - ((long) i9);
                        } else {
                            c0338a = null;
                        }
                        long j15 = j7;
                        long j16 = j8;
                        RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                        c0338a = new C0338a(j15, j6 + ((long) i9), AbstractC1303m.m3312e(AbstractC0632A.m1577R(j16, 8000000L, jM1575P, roundingMode2)), AbstractC1303m.m3312e(AbstractC1303m.m3317j(j16, j5, roundingMode2)), false);
                    } else {
                        c0338a = null;
                    }
                }
            }
            C0544G c0544g = this.f1098k;
            C2237j c2237j5 = (C2237j) interfaceC2241n;
            long j17 = c2237j5.f9629j;
            if (c0544g == null) {
                c0340c = null;
                break;
            }
            InterfaceC0543F[] interfaceC0543FArr = c0544g.f1940g;
            int length = interfaceC0543FArr.length;
            int i20 = 0;
            while (true) {
                if (i20 >= length) {
                    c0340c = null;
                    break;
                }
                InterfaceC0543F interfaceC0543F = interfaceC0543FArr[i20];
                if (interfaceC0543F instanceof C0222l) {
                    C0222l c0222l = (C0222l) interfaceC0543F;
                    if (c0544g == null) {
                        jM1571L = -9223372036854775807L;
                        break;
                    }
                    InterfaceC0543F[] interfaceC0543FArr2 = c0544g.f1940g;
                    int length2 = interfaceC0543FArr2.length;
                    int i21 = 0;
                    while (true) {
                        if (i21 >= length2) {
                            jM1571L = -9223372036854775807L;
                            break;
                        }
                        InterfaceC0543F interfaceC0543F2 = interfaceC0543FArr2[i21];
                        if (interfaceC0543F2 instanceof C0224n) {
                            C0224n c0224n = (C0224n) interfaceC0543F2;
                            if (c0224n.f509g.equals("TLEN")) {
                                jM1571L = AbstractC0632A.m1571L(Long.parseLong((String) c0224n.f522i.get(0)));
                                break;
                            }
                        }
                        i21++;
                    }
                    int length3 = c0222l.f517k.length;
                    int i22 = length3 + 1;
                    long[] jArr9 = new long[i22];
                    long[] jArr10 = new long[i22];
                    jArr9[0] = j17;
                    jArr10[0] = 0;
                    long j18 = 0;
                    int i23 = 1;
                    while (i23 <= length3) {
                        int i24 = i23 - 1;
                        long j19 = j17 + ((long) (c0222l.f515i + c0222l.f517k[i24]));
                        j18 += (long) (c0222l.f516j + c0222l.f518l[i24]);
                        jArr9[i23] = j19;
                        jArr10[i23] = j18;
                        i23++;
                        length3 = length3;
                        j17 = j19;
                    }
                    c0340c = new C0340c(jM1571L, jArr9, jArr10);
                    break;
                }
                i20++;
            }
            if (this.f1105r) {
                c0338a2 = new C0342e(-9223372036854775807L);
            } else {
                if (c0340c != null) {
                    c0338a = c0340c;
                } else if (c0338a == null) {
                    c0338a = null;
                }
                if (c0338a != null) {
                    c0338a.mo941b();
                    c0338a2 = c0338a;
                } else {
                    c2237j5.mo338i(c0651s.f2520a, 0, 4, false);
                    c0651s.m1665G(0);
                    c2250w.m4845a(c0651s.m1673g());
                    c0338a2 = new C0338a(c2237j5.f9628i, c2237j5.f9629j, c2250w.f9680e, c2250w.f9677b, false);
                }
            }
            this.f1104q = c0338a2;
            this.f1094g.mo333b(c0338a2);
            C0582n c0582n = new C0582n();
            c0582n.f2114m = AbstractC0545H.m1364l((String) c2250w.f9682g);
            c0582n.f2115n = 4096;
            c0582n.f2092B = c2250w.f9679d;
            c0582n.f2093C = c2250w.f9678c;
            C2247t c2247t3 = c2247t;
            c0582n.f2095E = c2247t3.f9659a;
            c0582n.f2096F = c2247t3.f9660b;
            c0582n.f2112k = this.f1098k;
            if (this.f1104q.mo944k() != -2147483647) {
                c0582n.f2109h = this.f1104q.mo944k();
            }
            this.f1096i.mo1176e(new C0583o(c0582n));
            this.f1101n = c2237j5.f9629j;
        } else {
            j3 = 1000000;
            th = null;
            j4 = 0;
            long j20 = this.f1101n;
            if (j20 != 0) {
                long j21 = ((C2237j) interfaceC2241n).f9629j;
                if (j21 < j20) {
                    ((C2237j) interfaceC2241n).mo335d((int) (j20 - j21));
                }
            }
        }
        if (this.f1103p == 0) {
            ((C2237j) interfaceC2241n).f9631l = 0;
            C2237j c2237j6 = (C2237j) interfaceC2241n;
            if (m948d(c2237j6)) {
                i3 = -1;
            } else {
                c0651s.m1665G(0);
                int iM1673g4 = c0651s.m1673g();
                if (((-128000) & iM1673g4) != (((long) this.f1097j) & (-128000)) || AbstractC2229b.m4813h(iM1673g4) == -1) {
                    c2237j6.mo335d(1);
                    this.f1097j = 0;
                } else {
                    c2250w.m4845a(iM1673g4);
                    if (this.f1099l == -9223372036854775807L) {
                        this.f1099l = this.f1104q.mo942d(c2237j6.f9629j);
                        long j22 = this.f1088a;
                        if (j22 != -9223372036854775807L) {
                            this.f1099l = (j22 - this.f1104q.mo942d(j4)) + this.f1099l;
                        }
                    }
                    int i25 = c2250w.f9677b;
                    this.f1103p = i25;
                    this.f1102o = c2237j6.f9629j + ((long) i25);
                    InterfaceC0343f interfaceC0343f2 = this.f1104q;
                    if (interfaceC0343f2 instanceof AbstractC0339b) {
                        long j23 = ((this.f1100m + ((long) c2250w.f9681f)) * j3) / ((long) c2250w.f9678c);
                        ((AbstractC0339b) interfaceC0343f2).getClass();
                        throw th;
                    }
                    iMo1174c = this.f1096i.mo1174c(interfaceC2241n, this.f1103p, true);
                    if (iMo1174c == -1) {
                        i3 = -1;
                    } else {
                        i5 = this.f1103p - iMo1174c;
                        this.f1103p = i5;
                        if (i5 <= 0) {
                            this.f1096i.mo1172a(this.f1099l + ((this.f1100m * j3) / ((long) c2250w.f9678c)), 1, c2250w.f9677b, 0, null);
                            this.f1100m += (long) c2250w.f9681f;
                            this.f1103p = 0;
                        }
                    }
                }
                i3 = 0;
            }
            i4 = -1;
        } else {
            iMo1174c = this.f1096i.mo1174c(interfaceC2241n, this.f1103p, true);
            if (iMo1174c == -1) {
                i3 = -1;
            } else {
                i5 = this.f1103p - iMo1174c;
                this.f1103p = i5;
                if (i5 <= 0) {
                    this.f1096i.mo1172a(this.f1099l + ((this.f1100m * j3) / ((long) c2250w.f9678c)), 1, c2250w.f9677b, 0, null);
                    this.f1100m += (long) c2250w.f9681f;
                    this.f1103p = 0;
                }
                i3 = 0;
            }
            i4 = -1;
        }
        if (i3 == i4) {
            InterfaceC0343f interfaceC0343f3 = this.f1104q;
            if (interfaceC0343f3 instanceof AbstractC0339b) {
                if (interfaceC0343f3.mo945l() != ((this.f1100m * j3) / ((long) c2250w.f9678c)) + this.f1099l) {
                    ((AbstractC0339b) this.f1104q).getClass();
                    throw th;
                }
            }
        }
        return i3;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: f */
    public final boolean mo329f(InterfaceC2241n interfaceC2241n) {
        return m949g((C2237j) interfaceC2241n, true);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m949g(C2237j c2237j, boolean z3) throws EOFException, InterruptedIOException {
        int i3;
        int iMo339j;
        int iM4813h;
        int i4 = z3 ? 32768 : 131072;
        c2237j.f9631l = 0;
        if (c2237j.f9629j == 0) {
            C0544G c0544gM1810a = this.f1092e.m1810a(c2237j, null);
            this.f1098k = c0544gM1810a;
            if (c0544gM1810a != null) {
                this.f1091d.m4843b(c0544gM1810a);
            }
            iMo339j = (int) c2237j.mo339j();
            if (!z3) {
                c2237j.mo335d(iMo339j);
            }
            i3 = 0;
        } else {
            i3 = 0;
            iMo339j = 0;
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (m948d(c2237j)) {
                if (i5 > 0) {
                    break;
                }
                m947b();
                throw new EOFException();
            }
            C0651s c0651s = this.f1089b;
            c0651s.m1665G(0);
            int iM1673g = c0651s.m1673g();
            if ((i3 == 0 || ((-128000) & iM1673g) == (((long) i3) & (-128000))) && (iM4813h = AbstractC2229b.m4813h(iM1673g)) != -1) {
                i5++;
                if (i5 != 1) {
                    if (i5 == 4) {
                        break;
                    }
                } else {
                    this.f1090c.m4845a(iM1673g);
                    i3 = iM1673g;
                }
                c2237j.m4831b(iM4813h - 4, false);
            } else {
                int i7 = i6 + 1;
                if (i6 == i4) {
                    if (z3) {
                        return false;
                    }
                    m947b();
                    throw new EOFException();
                }
                if (z3) {
                    c2237j.f9631l = 0;
                    c2237j.m4831b(iMo339j + i7, false);
                } else {
                    c2237j.mo335d(1);
                }
                i6 = i7;
                i3 = 0;
                i5 = 0;
            }
        }
        if (z3) {
            c2237j.mo335d(iMo339j + i6);
        } else {
            c2237j.f9631l = 0;
        }
        this.f1097j = i3;
        return true;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: h */
    public final void mo330h(InterfaceC2242o interfaceC2242o) {
        this.f1094g = interfaceC2242o;
        InterfaceC2226E interfaceC2226EMo344p = interfaceC2242o.mo344p(0, 1);
        this.f1095h = interfaceC2226EMo344p;
        this.f1096i = interfaceC2226EMo344p;
        this.f1094g.mo341l();
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: j */
    public final void mo331j(long j3, long j4) {
        this.f1097j = 0;
        this.f1099l = -9223372036854775807L;
        this.f1100m = 0L;
        this.f1103p = 0;
        this.f1107t = j4;
        InterfaceC0343f interfaceC0343f = this.f1104q;
        if (interfaceC0343f instanceof AbstractC0339b) {
            ((AbstractC0339b) interfaceC0343f).getClass();
            throw null;
        }
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: m */
    public final List mo332m() {
        C1674E c1674e = AbstractC1676G.f7601h;
        return C1692X.f7629k;
    }

    public C0341d(long j3) {
        this.f1088a = j3;
        this.f1089b = new C0651s(10);
        this.f1090c = new C2250w();
        this.f1091d = new C2247t();
        this.f1099l = -9223372036854775807L;
        this.f1092e = new C0688a(1);
        C2239l c2239l = new C2239l();
        this.f1093f = c2239l;
        this.f1096i = c2239l;
        this.f1102o = -1L;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: a */
    public final void mo325a() {
    }
}

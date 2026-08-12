package p039N0;

import java.util.ArrayList;
import java.util.Arrays;
import p009D0.C0106b;
import p028J1.C0311q;
import p048Q0.C0508g;
import p055T.AbstractC0545H;
import p055T.C0544G;
import p055T.C0546I;
import p055T.C0582n;
import p055T.C0583o;
import p064W.AbstractC0646n;
import p064W.C0635c;
import p064W.C0651s;
import p105h2.AbstractC1676G;
import p145s0.AbstractC2229b;
import p145s0.C2250w;

/* JADX INFO: renamed from: N0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0415k extends AbstractC0413i {

    /* JADX INFO: renamed from: n */
    public C0414j f1412n;

    /* JADX INFO: renamed from: o */
    public int f1413o;

    /* JADX INFO: renamed from: p */
    public boolean f1414p;

    /* JADX INFO: renamed from: q */
    public C2250w f1415q;

    /* JADX INFO: renamed from: r */
    public C0311q f1416r;

    @Override // p039N0.AbstractC0413i
    /* JADX INFO: renamed from: a */
    public final void mo1109a(long j3) {
        this.f1400g = j3;
        this.f1414p = j3 != 0;
        C2250w c2250w = this.f1415q;
        this.f1413o = c2250w != null ? c2250w.f9680e : 0;
    }

    @Override // p039N0.AbstractC0413i
    /* JADX INFO: renamed from: b */
    public final long mo1100b(C0651s c0651s) {
        byte b3 = c0651s.f2520a[0];
        if ((b3 & 1) == 1) {
            return -1L;
        }
        C0414j c0414j = this.f1412n;
        AbstractC0646n.m1631i(c0414j);
        boolean z3 = ((C0635c[]) c0414j.f1411k)[(b3 >> 1) & (255 >>> (8 - c0414j.f1407g))].f2475a;
        C2250w c2250w = (C2250w) c0414j.f1408h;
        int i3 = !z3 ? c2250w.f9680e : c2250w.f9681f;
        long j3 = this.f1414p ? (this.f1413o + i3) / 4 : 0;
        byte[] bArr = c0651s.f2520a;
        int length = bArr.length;
        int i4 = c0651s.f2522c + 4;
        if (length < i4) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i4);
            c0651s.m1663E(bArrCopyOf, bArrCopyOf.length);
        } else {
            c0651s.m1664F(i4);
        }
        byte[] bArr2 = c0651s.f2520a;
        int i5 = c0651s.f2522c;
        bArr2[i5 - 4] = (byte) (j3 & 255);
        bArr2[i5 - 3] = (byte) ((j3 >>> 8) & 255);
        bArr2[i5 - 2] = (byte) ((j3 >>> 16) & 255);
        bArr2[i5 - 1] = (byte) ((j3 >>> 24) & 255);
        this.f1414p = true;
        this.f1413o = i3;
        return j3;
    }

    /* JADX WARN: Type inference failed for: r1v58, types: [byte[], java.io.Serializable] */
    @Override // p039N0.AbstractC0413i
    /* JADX INFO: renamed from: c */
    public final boolean mo1101c(C0651s c0651s, long j3, C0106b c0106b) throws C0546I {
        if (this.f1412n != null) {
            ((C0583o) c0106b.f140h).getClass();
            return false;
        }
        C2250w c2250w = this.f1415q;
        int i3 = 4;
        C0414j c0414j = null;
        if (c2250w == null) {
            AbstractC2229b.m4828w(1, c0651s, false);
            c0651s.m1679m();
            int iM1687u = c0651s.m1687u();
            int iM1679m = c0651s.m1679m();
            int iM1675i = c0651s.m1675i();
            if (iM1675i <= 0) {
                iM1675i = -1;
            }
            int iM1675i2 = c0651s.m1675i();
            int i4 = iM1675i2 <= 0 ? -1 : iM1675i2;
            c0651s.m1675i();
            int iM1687u2 = c0651s.m1687u();
            int iPow = (int) Math.pow(2.0d, iM1687u2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iM1687u2 & 240) >> 4);
            c0651s.m1687u();
            ?? CopyOf = Arrays.copyOf(c0651s.f2520a, c0651s.f2522c);
            C2250w c2250w2 = new C2250w();
            c2250w2.f9676a = iM1687u;
            c2250w2.f9677b = iM1679m;
            c2250w2.f9678c = iM1675i;
            c2250w2.f9679d = i4;
            c2250w2.f9680e = iPow;
            c2250w2.f9681f = iPow2;
            c2250w2.f9682g = CopyOf;
            this.f1415q = c2250w2;
        } else {
            C0311q c0311q = this.f1416r;
            if (c0311q == null) {
                this.f1416r = AbstractC2229b.m4826u(c0651s, true, true);
            } else {
                int i5 = c0651s.f2522c;
                byte[] bArr = new byte[i5];
                System.arraycopy(c0651s.f2520a, 0, bArr, 0, i5);
                int i6 = 5;
                AbstractC2229b.m4828w(5, c0651s, false);
                int iM1687u3 = c0651s.m1687u() + 1;
                C0508g c0508g = new C0508g(c0651s.f2520a);
                c0508g.m1263t(c0651s.f2521b * 8);
                int i7 = 0;
                while (true) {
                    int i8 = 2;
                    int i9 = 16;
                    if (i7 >= iM1687u3) {
                        int i10 = 6;
                        int iM1252i = c0508g.m1252i(6) + 1;
                        for (int i11 = 0; i11 < iM1252i; i11++) {
                            if (c0508g.m1252i(16) != 0) {
                                throw C0546I.m1365a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i12 = 1;
                        int iM1252i2 = c0508g.m1252i(6) + 1;
                        int i13 = 0;
                        while (true) {
                            int i14 = 3;
                            if (i13 >= iM1252i2) {
                                int i15 = 1;
                                int iM1252i3 = c0508g.m1252i(i10) + 1;
                                int i16 = 0;
                                while (i16 < iM1252i3) {
                                    if (c0508g.m1252i(16) > 2) {
                                        throw C0546I.m1365a(null, "residueType greater than 2 is not decodable");
                                    }
                                    c0508g.m1263t(24);
                                    c0508g.m1263t(24);
                                    c0508g.m1263t(24);
                                    int iM1252i4 = c0508g.m1252i(i10) + i15;
                                    int i17 = 8;
                                    c0508g.m1263t(8);
                                    int[] iArr = new int[iM1252i4];
                                    for (int i18 = 0; i18 < iM1252i4; i18++) {
                                        iArr[i18] = ((c0508g.m1251h() ? c0508g.m1252i(5) : 0) * 8) + c0508g.m1252i(3);
                                    }
                                    int i19 = 0;
                                    while (i19 < iM1252i4) {
                                        int i20 = 0;
                                        while (i20 < i17) {
                                            if ((iArr[i19] & (1 << i20)) != 0) {
                                                c0508g.m1263t(i17);
                                            }
                                            i20++;
                                            i17 = 8;
                                        }
                                        i19++;
                                        i17 = 8;
                                    }
                                    i16++;
                                    i10 = 6;
                                    i15 = 1;
                                }
                                int iM1252i5 = c0508g.m1252i(i10) + 1;
                                for (int i21 = 0; i21 < iM1252i5; i21++) {
                                    int iM1252i6 = c0508g.m1252i(16);
                                    if (iM1252i6 != 0) {
                                        AbstractC0646n.m1635m("VorbisUtil", "mapping type other than 0 not supported: " + iM1252i6);
                                    } else {
                                        int iM1252i7 = c0508g.m1251h() ? c0508g.m1252i(4) + 1 : 1;
                                        boolean zM1251h = c0508g.m1251h();
                                        int i22 = c2250w.f9676a;
                                        if (zM1251h) {
                                            int iM1252i8 = c0508g.m1252i(8) + 1;
                                            for (int i23 = 0; i23 < iM1252i8; i23++) {
                                                int i24 = i22 - 1;
                                                c0508g.m1263t(AbstractC2229b.m4817l(i24));
                                                c0508g.m1263t(AbstractC2229b.m4817l(i24));
                                            }
                                        }
                                        if (c0508g.m1252i(2) != 0) {
                                            throw C0546I.m1365a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (iM1252i7 > 1) {
                                            for (int i25 = 0; i25 < i22; i25++) {
                                                c0508g.m1263t(4);
                                            }
                                        }
                                        for (int i26 = 0; i26 < iM1252i7; i26++) {
                                            c0508g.m1263t(8);
                                            c0508g.m1263t(8);
                                            c0508g.m1263t(8);
                                        }
                                    }
                                }
                                int iM1252i9 = c0508g.m1252i(6);
                                int i27 = iM1252i9 + 1;
                                C0635c[] c0635cArr = new C0635c[i27];
                                for (int i28 = 0; i28 < i27; i28++) {
                                    boolean zM1251h2 = c0508g.m1251h();
                                    c0508g.m1252i(16);
                                    c0508g.m1252i(16);
                                    c0508g.m1252i(8);
                                    C0635c c0635c = new C0635c();
                                    c0635c.f2475a = zM1251h2;
                                    c0635cArr[i28] = c0635c;
                                }
                                if (!c0508g.m1251h()) {
                                    throw C0546I.m1365a(null, "framing bit after modes not set as expected");
                                }
                                int iM4817l = AbstractC2229b.m4817l(iM1252i9);
                                c0414j = new C0414j();
                                c0414j.f1408h = c2250w;
                                c0414j.f1409i = c0311q;
                                c0414j.f1410j = bArr;
                                c0414j.f1411k = c0635cArr;
                                c0414j.f1407g = iM4817l;
                                break;
                            }
                            int iM1252i10 = c0508g.m1252i(i9);
                            if (iM1252i10 == 0) {
                                int i29 = 8;
                                c0508g.m1263t(8);
                                c0508g.m1263t(16);
                                c0508g.m1263t(16);
                                c0508g.m1263t(6);
                                c0508g.m1263t(8);
                                int iM1252i11 = c0508g.m1252i(4) + 1;
                                int i30 = 0;
                                while (i30 < iM1252i11) {
                                    c0508g.m1263t(i29);
                                    i30++;
                                    i29 = 8;
                                }
                            } else {
                                if (iM1252i10 != i12) {
                                    throw C0546I.m1365a(null, "floor type greater than 1 not decodable: " + iM1252i10);
                                }
                                int iM1252i12 = c0508g.m1252i(i6);
                                int[] iArr2 = new int[iM1252i12];
                                int i31 = -1;
                                for (int i32 = 0; i32 < iM1252i12; i32++) {
                                    int iM1252i13 = c0508g.m1252i(4);
                                    iArr2[i32] = iM1252i13;
                                    if (iM1252i13 > i31) {
                                        i31 = iM1252i13;
                                    }
                                }
                                int i33 = i31 + 1;
                                int[] iArr3 = new int[i33];
                                int i34 = 0;
                                while (i34 < i33) {
                                    iArr3[i34] = c0508g.m1252i(i14) + 1;
                                    int iM1252i14 = c0508g.m1252i(i8);
                                    int i35 = 8;
                                    if (iM1252i14 > 0) {
                                        c0508g.m1263t(8);
                                    }
                                    int i36 = i33;
                                    int i37 = 0;
                                    for (int i38 = 1; i37 < (i38 << iM1252i14); i38 = 1) {
                                        c0508g.m1263t(i35);
                                        i37++;
                                        i35 = 8;
                                    }
                                    i34++;
                                    i33 = i36;
                                    i14 = 3;
                                    i8 = 2;
                                }
                                c0508g.m1263t(2);
                                int iM1252i15 = c0508g.m1252i(4);
                                int i39 = 0;
                                int i40 = 0;
                                for (int i41 = 0; i41 < iM1252i12; i41++) {
                                    i39 += iArr3[iArr2[i41]];
                                    while (i40 < i39) {
                                        c0508g.m1263t(iM1252i15);
                                        i40++;
                                    }
                                }
                            }
                            i13++;
                            i10 = 6;
                            i9 = 16;
                            i12 = 1;
                            i6 = 5;
                            i8 = 2;
                        }
                    } else {
                        if (c0508g.m1252i(24) != 5653314) {
                            throw C0546I.m1365a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((c0508g.f1733d * 8) + c0508g.f1734e));
                        }
                        int iM1252i16 = c0508g.m1252i(16);
                        int iM1252i17 = c0508g.m1252i(24);
                        if (c0508g.m1251h()) {
                            c0508g.m1263t(5);
                            for (int iM1252i18 = 0; iM1252i18 < iM1252i17; iM1252i18 += c0508g.m1252i(AbstractC2229b.m4817l(iM1252i17 - iM1252i18))) {
                            }
                        } else {
                            boolean zM1251h3 = c0508g.m1251h();
                            for (int i42 = 0; i42 < iM1252i17; i42++) {
                                if (!zM1251h3) {
                                    c0508g.m1263t(5);
                                } else if (c0508g.m1251h()) {
                                    c0508g.m1263t(5);
                                }
                            }
                        }
                        int iM1252i19 = c0508g.m1252i(i3);
                        if (iM1252i19 > 2) {
                            throw C0546I.m1365a(null, "lookup type greater than 2 not decodable: " + iM1252i19);
                        }
                        if (iM1252i19 == 1 || iM1252i19 == 2) {
                            c0508g.m1263t(32);
                            c0508g.m1263t(32);
                            int iM1252i20 = c0508g.m1252i(i3) + 1;
                            c0508g.m1263t(1);
                            c0508g.m1263t((int) ((iM1252i19 == 1 ? iM1252i16 != 0 ? (long) Math.floor(Math.pow(iM1252i17, 1.0d / ((double) iM1252i16))) : 0L : ((long) iM1252i17) * ((long) iM1252i16)) * ((long) iM1252i20)));
                        }
                        i7++;
                        i3 = 4;
                    }
                }
            }
        }
        this.f1412n = c0414j;
        if (c0414j == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        C2250w c2250w3 = (C2250w) c0414j.f1408h;
        arrayList.add((byte[]) c2250w3.f9682g);
        arrayList.add((byte[]) c0414j.f1410j);
        C0544G c0544gM4823r = AbstractC2229b.m4823r(AbstractC1676G.m4118o(((C0311q) c0414j.f1409i).f837h));
        C0582n c0582n = new C0582n();
        c0582n.f2114m = AbstractC0545H.m1364l("audio/vorbis");
        c0582n.f2109h = c2250w3.f9679d;
        c0582n.f2110i = c2250w3.f9678c;
        c0582n.f2092B = c2250w3.f9676a;
        c0582n.f2093C = c2250w3.f9677b;
        c0582n.f2117p = arrayList;
        c0582n.f2112k = c0544gM4823r;
        c0106b.f140h = new C0583o(c0582n);
        return true;
    }

    @Override // p039N0.AbstractC0413i
    /* JADX INFO: renamed from: d */
    public final void mo1102d(boolean z3) {
        super.mo1102d(z3);
        if (z3) {
            this.f1412n = null;
            this.f1415q = null;
            this.f1416r = null;
        }
        this.f1413o = 0;
        this.f1414p = false;
    }
}

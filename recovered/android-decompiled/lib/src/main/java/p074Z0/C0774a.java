package p074Z0;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import p036M0.C0370g;
import p055T.AbstractC0545H;
import p055T.C0546I;
import p055T.C0582n;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p064W.C0651s;
import p145s0.C2237j;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2242o;

/* JADX INFO: renamed from: Z0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0774a implements InterfaceC0775b {

    /* JADX INFO: renamed from: m */
    public static final int[] f3152m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: n */
    public static final int[] f3153n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* JADX INFO: renamed from: a */
    public final InterfaceC2242o f3154a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2226E f3155b;

    /* JADX INFO: renamed from: c */
    public final C0370g f3156c;

    /* JADX INFO: renamed from: d */
    public final int f3157d;

    /* JADX INFO: renamed from: e */
    public final byte[] f3158e;

    /* JADX INFO: renamed from: f */
    public final C0651s f3159f;

    /* JADX INFO: renamed from: g */
    public final int f3160g;

    /* JADX INFO: renamed from: h */
    public final C0583o f3161h;

    /* JADX INFO: renamed from: i */
    public int f3162i;

    /* JADX INFO: renamed from: j */
    public long f3163j;

    /* JADX INFO: renamed from: k */
    public int f3164k;

    /* JADX INFO: renamed from: l */
    public long f3165l;

    public C0774a(InterfaceC2242o interfaceC2242o, InterfaceC2226E interfaceC2226E, C0370g c0370g) throws C0546I {
        this.f3154a = interfaceC2242o;
        this.f3155b = interfaceC2226E;
        this.f3156c = c0370g;
        int i3 = c0370g.f1187c;
        int iMax = Math.max(1, i3 / 10);
        this.f3160g = iMax;
        C0651s c0651s = new C0651s((byte[]) c0370g.f1190f);
        c0651s.m1680n();
        int iM1680n = c0651s.m1680n();
        this.f3157d = iM1680n;
        int i4 = c0370g.f1186b;
        int i5 = c0370g.f1188d;
        int i6 = (((i5 - (i4 * 4)) * 8) / (c0370g.f1189e * i4)) + 1;
        if (iM1680n != i6) {
            throw C0546I.m1365a(null, "Expected frames per block: " + i6 + "; got: " + iM1680n);
        }
        int iM1587f = AbstractC0632A.m1587f(iMax, iM1680n);
        this.f3158e = new byte[iM1587f * i5];
        this.f3159f = new C0651s(iM1680n * 2 * i4 * iM1587f);
        int i7 = ((i5 * i3) * 8) / iM1680n;
        C0582n c0582n = new C0582n();
        c0582n.f2114m = AbstractC0545H.m1364l("audio/raw");
        c0582n.f2109h = i7;
        c0582n.f2110i = i7;
        c0582n.f2115n = iMax * 2 * i4;
        c0582n.f2092B = i4;
        c0582n.f2093C = i3;
        c0582n.f2094D = 2;
        this.f3161h = new C0583o(c0582n);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:28:0x00be  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:37:0x0138  */
    /* JADX WARN: Code duplicated, block: B:43:0x0046 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x010d A[EDGE_INSN: B:47:0x010d->B:35:0x010d BREAK  A[LOOP:1: B:17:0x004c->B:34:0x0103], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003d -> B:4:0x0021). Please report as a decompilation issue!!! */
    @Override // p074Z0.InterfaceC0775b
    /* JADX INFO: renamed from: a */
    public final boolean mo1887a(C2237j c2237j, long j3) throws EOFException, InterruptedIOException {
        byte[] bArr;
        int i3;
        int i4;
        int i5;
        C0651s c0651s;
        int i6;
        int i7;
        int i8;
        byte[] bArr2;
        int i9;
        int i10;
        int iM1590i;
        int iMin;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        byte b3;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iMo345q;
        int i19 = this.f3164k;
        C0370g c0370g = this.f3156c;
        int i20 = i19 / (c0370g.f1186b * 2);
        int i21 = this.f3160g;
        int i22 = this.f3157d;
        int iM1587f = AbstractC0632A.m1587f(i21 - i20, i22);
        int i23 = c0370g.f1188d;
        int i24 = iM1587f * i23;
        boolean z3 = j3 == 0;
        while (true) {
            bArr = this.f3158e;
            if (z3 && (i18 = this.f3162i) < i24) {
                iMo345q = c2237j.mo345q(bArr, this.f3162i, (int) Math.min(i24 - i18, j3));
                if (iMo345q == -1) {
                    break;
                }
                this.f3162i += iMo345q;
                bArr = this.f3158e;
                if (z3) {
                }
            }
            i3 = this.f3162i / i23;
            if (i3 > 0) {
                i5 = 0;
                while (true) {
                    c0651s = this.f3159f;
                    if (i5 < i3) {
                        break;
                    }
                    i7 = 0;
                    while (true) {
                        i8 = c0370g.f1186b;
                        if (i7 < i8) {
                            bArr2 = c0651s.f2520a;
                            int i25 = (i7 * 4) + (i5 * i23);
                            i9 = (i8 * 4) + i25;
                            i10 = (i23 / i8) - 4;
                            iM1590i = (short) (((bArr[i25 + 1] & 255) << 8) | (bArr[i25] & 255));
                            int i26 = i3;
                            iMin = Math.min(bArr[i25 + 2] & 255, 88);
                            iArr = f3153n;
                            i11 = iArr[iMin];
                            i12 = ((i5 * i22 * i8) + i7) * 2;
                            bArr2[i12] = (byte) (iM1590i & 255);
                            bArr2[i12 + 1] = (byte) (iM1590i >> 8);
                            int i27 = i5;
                            i13 = 0;
                            while (i13 < i10 * 2) {
                                b3 = bArr[((i13 / 8) * i8 * 4) + i9 + ((i13 / 2) % 4)];
                                i14 = i13;
                                i15 = b3 & 255;
                                if (i14 % 2 == 0) {
                                    i16 = b3 & 15;
                                } else {
                                    i16 = i15 >> 4;
                                }
                                i17 = ((((i16 & 7) * 2) + 1) * i11) >> 3;
                                if ((i16 & 8) != 0) {
                                    i17 = -i17;
                                }
                                iM1590i = AbstractC0632A.m1590i(iM1590i + i17, -32768, 32767);
                                i12 = (i8 * 2) + i12;
                                bArr2[i12] = (byte) (iM1590i & 255);
                                bArr2[i12 + 1] = (byte) (iM1590i >> 8);
                                iMin = AbstractC0632A.m1590i(iMin + f3152m[i16], 0, 88);
                                i11 = iArr[iMin];
                                i13 = i14 + 1;
                            }
                            i7++;
                            i3 = i26;
                            i5 = i27;
                        }
                    }
                    i5++;
                }
                int i28 = i3;
                int i29 = i22 * i28 * 2 * c0370g.f1186b;
                c0651s.m1665G(0);
                c0651s.m1664F(i29);
                this.f3162i -= i28 * i23;
                int i30 = c0651s.f2522c;
                this.f3155b.mo1173b(i30, c0651s);
                i6 = this.f3164k + i30;
                this.f3164k = i6;
                if (i6 / (c0370g.f1186b * 2) >= i21) {
                    m1890d(i21);
                }
            }
            if (z3 && (i4 = this.f3164k / (c0370g.f1186b * 2)) > 0) {
                m1890d(i4);
            }
            return z3;
        }
        while (true) {
            bArr = this.f3158e;
            if (z3) {
            }
            i3 = this.f3162i / i23;
            if (i3 > 0) {
                i5 = 0;
                while (true) {
                    c0651s = this.f3159f;
                    if (i5 < i3) {
                        break;
                        break;
                    }
                    i7 = 0;
                    while (true) {
                        i8 = c0370g.f1186b;
                        if (i7 < i8) {
                            bArr2 = c0651s.f2520a;
                            int i210 = (i7 * 4) + (i5 * i23);
                            i9 = (i8 * 4) + i210;
                            i10 = (i23 / i8) - 4;
                            iM1590i = (short) (((bArr[i210 + 1] & 255) << 8) | (bArr[i210] & 255));
                            int i211 = i3;
                            iMin = Math.min(bArr[i210 + 2] & 255, 88);
                            iArr = f3153n;
                            i11 = iArr[iMin];
                            i12 = ((i5 * i22 * i8) + i7) * 2;
                            bArr2[i12] = (byte) (iM1590i & 255);
                            bArr2[i12 + 1] = (byte) (iM1590i >> 8);
                            int i212 = i5;
                            i13 = 0;
                            while (i13 < i10 * 2) {
                                b3 = bArr[((i13 / 8) * i8 * 4) + i9 + ((i13 / 2) % 4)];
                                i14 = i13;
                                i15 = b3 & 255;
                                if (i14 % 2 == 0) {
                                    i16 = b3 & 15;
                                } else {
                                    i16 = i15 >> 4;
                                }
                                i17 = ((((i16 & 7) * 2) + 1) * i11) >> 3;
                                if ((i16 & 8) != 0) {
                                    i17 = -i17;
                                }
                                iM1590i = AbstractC0632A.m1590i(iM1590i + i17, -32768, 32767);
                                i12 = (i8 * 2) + i12;
                                bArr2[i12] = (byte) (iM1590i & 255);
                                bArr2[i12 + 1] = (byte) (iM1590i >> 8);
                                iMin = AbstractC0632A.m1590i(iMin + f3152m[i16], 0, 88);
                                i11 = iArr[iMin];
                                i13 = i14 + 1;
                            }
                            i7++;
                            i3 = i211;
                            i5 = i212;
                        }
                    }
                    i5++;
                }
                int i213 = i3;
                int i214 = i22 * i213 * 2 * c0370g.f1186b;
                c0651s.m1665G(0);
                c0651s.m1664F(i214);
                this.f3162i -= i213 * i23;
                int i31 = c0651s.f2522c;
                this.f3155b.mo1173b(i31, c0651s);
                i6 = this.f3164k + i31;
                this.f3164k = i6;
                if (i6 / (c0370g.f1186b * 2) >= i21) {
                    m1890d(i21);
                }
            }
            if (z3) {
                m1890d(i4);
            }
            return z3;
            this.f3162i += iMo345q;
        }
    }

    @Override // p074Z0.InterfaceC0775b
    /* JADX INFO: renamed from: b */
    public final void mo1888b(int i3, long j3) {
        this.f3154a.mo333b(new C0779f(this.f3156c, this.f3157d, i3, j3));
        this.f3155b.mo1176e(this.f3161h);
    }

    @Override // p074Z0.InterfaceC0775b
    /* JADX INFO: renamed from: c */
    public final void mo1889c(long j3) {
        this.f3162i = 0;
        this.f3163j = j3;
        this.f3164k = 0;
        this.f3165l = 0L;
    }

    /* JADX INFO: renamed from: d */
    public final void m1890d(int i3) {
        long j3 = this.f3163j;
        long j4 = this.f3165l;
        C0370g c0370g = this.f3156c;
        long j5 = c0370g.f1187c;
        int i4 = AbstractC0632A.f2454a;
        long jM1577R = j3 + AbstractC0632A.m1577R(j4, 1000000L, j5, RoundingMode.DOWN);
        int i5 = i3 * 2 * c0370g.f1186b;
        this.f3155b.mo1172a(jM1577R, 1, i5, this.f3164k - i5, null);
        this.f3165l += (long) i3;
        this.f3164k -= i5;
    }
}

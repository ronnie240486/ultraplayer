package p048Q0;

import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;

/* JADX INFO: renamed from: Q0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0508g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1730a;

    /* JADX INFO: renamed from: b */
    public byte[] f1731b;

    /* JADX INFO: renamed from: c */
    public int f1732c;

    /* JADX INFO: renamed from: d */
    public int f1733d;

    /* JADX INFO: renamed from: e */
    public int f1734e;

    public C0508g() {
        this.f1730a = 1;
        this.f1731b = AbstractC0632A.f2459f;
    }

    /* JADX INFO: renamed from: a */
    public void m1244a() {
        int i3;
        int i4;
        switch (this.f1730a) {
            case 1:
                int i5 = this.f1732c;
                AbstractC0646n.m1630h(i5 >= 0 && (i5 < (i3 = this.f1734e) || (i5 == i3 && this.f1733d == 0)));
                break;
            default:
                int i6 = this.f1733d;
                AbstractC0646n.m1630h(i6 >= 0 && (i6 < (i4 = this.f1732c) || (i6 == i4 && this.f1734e == 0)));
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public int m1245b() {
        return ((this.f1734e - this.f1732c) * 8) - this.f1733d;
    }

    /* JADX INFO: renamed from: c */
    public void m1246c() {
        if (this.f1733d == 0) {
            return;
        }
        this.f1733d = 0;
        this.f1732c++;
        m1244a();
    }

    /* JADX INFO: renamed from: d */
    public boolean m1247d(int i3) {
        int i4 = this.f1733d;
        int i5 = i3 / 8;
        int i6 = i4 + i5;
        int i7 = (this.f1734e + i3) - (i5 * 8);
        if (i7 > 7) {
            i6++;
            i7 -= 8;
        }
        while (true) {
            i4++;
            if (i4 > i6 || i6 >= this.f1732c) {
                break;
            }
            if (m1261r(i4)) {
                i6++;
                i4 += 2;
            }
        }
        int i8 = this.f1732c;
        if (i6 >= i8) {
            return i6 == i8 && i7 == 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public boolean m1248e() {
        int i3 = this.f1733d;
        int i4 = this.f1734e;
        int i5 = 0;
        while (this.f1733d < this.f1732c && !m1251h()) {
            i5++;
        }
        boolean z3 = this.f1733d == this.f1732c;
        this.f1733d = i3;
        this.f1734e = i4;
        return !z3 && m1247d((i5 * 2) + 1);
    }

    /* JADX INFO: renamed from: f */
    public int m1249f() {
        AbstractC0646n.m1630h(this.f1733d == 0);
        return this.f1732c;
    }

    /* JADX INFO: renamed from: g */
    public int m1250g() {
        return (this.f1732c * 8) + this.f1733d;
    }

    /* JADX INFO: renamed from: h */
    public boolean m1251h() {
        switch (this.f1730a) {
            case 1:
                boolean z3 = (this.f1731b[this.f1732c] & (128 >> this.f1733d)) != 0;
                m1262s();
                return z3;
            case 2:
                boolean z4 = (this.f1731b[this.f1733d] & (128 >> this.f1734e)) != 0;
                m1262s();
                return z4;
            default:
                boolean z5 = (((this.f1731b[this.f1733d] & 255) >> this.f1734e) & 1) == 1;
                m1263t(1);
                return z5;
        }
    }

    /* JADX INFO: renamed from: i */
    public int m1252i(int i3) {
        switch (this.f1730a) {
            case 1:
                if (i3 == 0) {
                    return 0;
                }
                this.f1733d += i3;
                int i4 = 0;
                while (true) {
                    int i5 = this.f1733d;
                    if (i5 <= 8) {
                        byte[] bArr = this.f1731b;
                        int i6 = this.f1732c;
                        int i7 = ((-1) >>> (32 - i3)) & (i4 | ((bArr[i6] & 255) >> (8 - i5)));
                        if (i5 == 8) {
                            this.f1733d = 0;
                            this.f1732c = i6 + 1;
                        }
                        m1244a();
                        return i7;
                    }
                    int i8 = i5 - 8;
                    this.f1733d = i8;
                    byte[] bArr2 = this.f1731b;
                    int i9 = this.f1732c;
                    this.f1732c = i9 + 1;
                    i4 |= (bArr2[i9] & 255) << i8;
                }
                break;
            case 2:
                this.f1734e += i3;
                int i10 = 0;
                while (true) {
                    int i11 = this.f1734e;
                    int i12 = 2;
                    if (i11 <= 8) {
                        byte[] bArr3 = this.f1731b;
                        int i13 = this.f1733d;
                        int i14 = ((-1) >>> (32 - i3)) & (i10 | ((bArr3[i13] & 255) >> (8 - i11)));
                        if (i11 == 8) {
                            this.f1734e = 0;
                            this.f1733d = i13 + (m1261r(i13 + 1) ? 2 : 1);
                        }
                        m1244a();
                        return i14;
                    }
                    int i15 = i11 - 8;
                    this.f1734e = i15;
                    byte[] bArr4 = this.f1731b;
                    int i16 = this.f1733d;
                    i10 |= (bArr4[i16] & 255) << i15;
                    if (!m1261r(i16 + 1)) {
                        i12 = 1;
                    }
                    this.f1733d = i16 + i12;
                }
                break;
            default:
                int i17 = this.f1733d;
                int iMin = Math.min(i3, 8 - this.f1734e);
                int i18 = i17 + 1;
                byte[] bArr5 = this.f1731b;
                int i19 = ((bArr5[i17] & 255) >> this.f1734e) & (255 >> (8 - iMin));
                while (iMin < i3) {
                    i19 |= (bArr5[i18] & 255) << iMin;
                    iMin += 8;
                    i18++;
                }
                int i20 = i19 & ((-1) >>> (32 - i3));
                m1263t(i3);
                return i20;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m1253j(byte[] bArr, int i3) {
        int i4 = i3 >> 3;
        for (int i5 = 0; i5 < i4; i5++) {
            byte[] bArr2 = this.f1731b;
            int i6 = this.f1732c;
            int i7 = i6 + 1;
            this.f1732c = i7;
            byte b3 = bArr2[i6];
            int i8 = this.f1733d;
            byte b4 = (byte) (b3 << i8);
            bArr[i5] = b4;
            bArr[i5] = (byte) (((255 & bArr2[i7]) >> (8 - i8)) | b4);
        }
        int i9 = i3 & 7;
        if (i9 == 0) {
            return;
        }
        byte b5 = (byte) (bArr[i4] & (255 >> i9));
        bArr[i4] = b5;
        int i10 = this.f1733d;
        if (i10 + i9 > 8) {
            byte[] bArr3 = this.f1731b;
            int i11 = this.f1732c;
            this.f1732c = i11 + 1;
            bArr[i4] = (byte) (b5 | ((bArr3[i11] & 255) << i10));
            this.f1733d = i10 - 8;
        }
        int i12 = this.f1733d + i9;
        this.f1733d = i12;
        byte[] bArr4 = this.f1731b;
        int i13 = this.f1732c;
        bArr[i4] = (byte) (((byte) (((255 & bArr4[i13]) >> (8 - i12)) << (8 - i9))) | bArr[i4]);
        if (i12 == 8) {
            this.f1733d = 0;
            this.f1732c = i13 + 1;
        }
        m1244a();
    }

    /* JADX INFO: renamed from: k */
    public long m1254k(int i3) {
        if (i3 <= 32) {
            int iM1252i = m1252i(i3);
            int i4 = AbstractC0632A.f2454a;
            return 4294967295L & ((long) iM1252i);
        }
        int iM1252i2 = m1252i(i3 - 32);
        int iM1252i3 = m1252i(32);
        int i5 = AbstractC0632A.f2454a;
        return (4294967295L & ((long) iM1252i3)) | ((((long) iM1252i2) & 4294967295L) << 32);
    }

    /* JADX INFO: renamed from: l */
    public void m1255l(byte[] bArr, int i3) {
        AbstractC0646n.m1630h(this.f1733d == 0);
        System.arraycopy(this.f1731b, this.f1732c, bArr, 0, i3);
        this.f1732c += i3;
        m1244a();
    }

    /* JADX INFO: renamed from: m */
    public int m1256m() {
        int i3 = 0;
        while (!m1251h()) {
            i3++;
        }
        return ((1 << i3) - 1) + (i3 > 0 ? m1252i(i3) : 0);
    }

    /* JADX INFO: renamed from: n */
    public int m1257n() {
        int iM1256m = m1256m();
        return ((iM1256m + 1) / 2) * (iM1256m % 2 == 0 ? -1 : 1);
    }

    /* JADX INFO: renamed from: o */
    public void m1258o(C0651s c0651s) {
        m1259p(c0651s.f2520a, c0651s.f2522c);
        m1260q(c0651s.f2521b * 8);
    }

    /* JADX INFO: renamed from: p */
    public void m1259p(byte[] bArr, int i3) {
        this.f1731b = bArr;
        this.f1732c = 0;
        this.f1733d = 0;
        this.f1734e = i3;
    }

    /* JADX INFO: renamed from: q */
    public void m1260q(int i3) {
        int i4 = i3 / 8;
        this.f1732c = i4;
        this.f1733d = i3 - (i4 * 8);
        m1244a();
    }

    /* JADX INFO: renamed from: r */
    public boolean m1261r(int i3) {
        if (2 > i3 || i3 >= this.f1732c) {
            return false;
        }
        byte[] bArr = this.f1731b;
        return bArr[i3] == 3 && bArr[i3 + (-2)] == 0 && bArr[i3 - 1] == 0;
    }

    /* JADX INFO: renamed from: s */
    public void m1262s() {
        switch (this.f1730a) {
            case 1:
                int i3 = this.f1733d + 1;
                this.f1733d = i3;
                if (i3 == 8) {
                    this.f1733d = 0;
                    this.f1732c++;
                }
                m1244a();
                break;
            default:
                int i4 = this.f1734e + 1;
                this.f1734e = i4;
                if (i4 == 8) {
                    this.f1734e = 0;
                    int i5 = this.f1733d;
                    this.f1733d = i5 + (m1261r(i5 + 1) ? 2 : 1);
                }
                m1244a();
                break;
        }
    }

    /* JADX INFO: renamed from: t */
    public void m1263t(int i3) {
        int i4;
        switch (this.f1730a) {
            case 1:
                int i5 = i3 / 8;
                int i6 = this.f1732c + i5;
                this.f1732c = i6;
                int i7 = (i3 - (i5 * 8)) + this.f1733d;
                this.f1733d = i7;
                if (i7 > 7) {
                    this.f1732c = i6 + 1;
                    this.f1733d = i7 - 8;
                }
                m1244a();
                break;
            case 2:
                int i8 = this.f1733d;
                int i9 = i3 / 8;
                int i10 = i8 + i9;
                this.f1733d = i10;
                int i11 = (i3 - (i9 * 8)) + this.f1734e;
                this.f1734e = i11;
                if (i11 > 7) {
                    this.f1733d = i10 + 1;
                    this.f1734e = i11 - 8;
                }
                while (true) {
                    i8++;
                    if (i8 > this.f1733d) {
                        m1244a();
                        break;
                    } else if (m1261r(i8)) {
                        this.f1733d++;
                        i8 += 2;
                    }
                }
                break;
            default:
                int i12 = i3 / 8;
                int i13 = this.f1733d + i12;
                this.f1733d = i13;
                int i14 = (i3 - (i12 * 8)) + this.f1734e;
                this.f1734e = i14;
                boolean z3 = true;
                if (i14 > 7) {
                    this.f1733d = i13 + 1;
                    this.f1734e = i14 - 8;
                }
                int i15 = this.f1733d;
                if (i15 < 0 || (i15 >= (i4 = this.f1732c) && (i15 != i4 || this.f1734e != 0))) {
                    z3 = false;
                }
                AbstractC0646n.m1630h(z3);
                break;
        }
    }

    /* JADX INFO: renamed from: u */
    public void m1264u(int i3) {
        AbstractC0646n.m1630h(this.f1733d == 0);
        this.f1732c += i3;
        m1244a();
    }

    public C0508g(byte[] bArr) {
        this.f1730a = 3;
        this.f1731b = bArr;
        this.f1732c = bArr.length;
    }

    public C0508g(byte[] bArr, int i3, int i4) {
        this.f1730a = 2;
        this.f1731b = bArr;
        this.f1733d = i3;
        this.f1732c = i4;
        this.f1734e = 0;
        m1244a();
    }

    public C0508g(byte[] bArr, int i3) {
        this.f1730a = 1;
        this.f1731b = bArr;
        this.f1734e = i3;
    }

    public C0508g(int i3, int i4) {
        this.f1730a = 0;
        this.f1732c = i3;
        this.f1733d = i4;
        this.f1731b = new byte[(i4 * 2) - 1];
        this.f1734e = 0;
    }
}

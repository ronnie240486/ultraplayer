package p064W;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import p019G1.AbstractC0230e;
import p045P0.AbstractC0462h;
import p105h2.AbstractC1679J;

/* JADX INFO: renamed from: W.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0651s {

    /* JADX INFO: renamed from: d */
    public static final char[] f2517d = {'\r', '\n'};

    /* JADX INFO: renamed from: e */
    public static final char[] f2518e = {'\n'};

    /* JADX INFO: renamed from: f */
    public static final AbstractC1679J f2519f = AbstractC1679J.m4127m(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* JADX INFO: renamed from: a */
    public byte[] f2520a;

    /* JADX INFO: renamed from: b */
    public int f2521b;

    /* JADX INFO: renamed from: c */
    public int f2522c;

    public C0651s() {
        this.f2520a = AbstractC0632A.f2459f;
    }

    /* JADX INFO: renamed from: A */
    public final int m1659A() {
        byte[] bArr = this.f2520a;
        int i3 = this.f2521b;
        int i4 = i3 + 1;
        this.f2521b = i4;
        int i5 = (bArr[i3] & 255) << 8;
        this.f2521b = i3 + 2;
        return (bArr[i4] & 255) | i5;
    }

    /* JADX INFO: renamed from: B */
    public final long m1660B() {
        int i3;
        int i4;
        long j3 = this.f2520a[this.f2521b];
        int i5 = 7;
        while (true) {
            if (i5 >= 0) {
                int i6 = 1 << i5;
                if ((((long) i6) & j3) == 0) {
                    if (i5 < 6) {
                        j3 &= (long) (i6 - 1);
                        i4 = 7 - i5;
                        break;
                    }
                    if (i5 == 7) {
                        i4 = 1;
                        break;
                    }
                } else {
                    i5--;
                }
            }
            i4 = 0;
            break;
        }
        if (i4 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j3);
        }
        for (i3 = 1; i3 < i4; i3++) {
            byte b3 = this.f2520a[this.f2521b + i3];
            if ((b3 & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j3);
            }
            j3 = (j3 << 6) | ((long) (b3 & 63));
        }
        this.f2521b += i4;
        return j3;
    }

    /* JADX INFO: renamed from: C */
    public final Charset m1661C() {
        if (m1667a() >= 3) {
            byte[] bArr = this.f2520a;
            int i3 = this.f2521b;
            if (bArr[i3] == -17 && bArr[i3 + 1] == -69 && bArr[i3 + 2] == -65) {
                this.f2521b = i3 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (m1667a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f2520a;
        int i4 = this.f2521b;
        byte b3 = bArr2[i4];
        if (b3 == -2 && bArr2[i4 + 1] == -1) {
            this.f2521b = i4 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b3 != -1 || bArr2[i4 + 1] != -2) {
            return null;
        }
        this.f2521b = i4 + 2;
        return StandardCharsets.UTF_16LE;
    }

    /* JADX INFO: renamed from: D */
    public final void m1662D(int i3) {
        byte[] bArr = this.f2520a;
        if (bArr.length < i3) {
            bArr = new byte[i3];
        }
        m1663E(bArr, i3);
    }

    /* JADX INFO: renamed from: E */
    public final void m1663E(byte[] bArr, int i3) {
        this.f2520a = bArr;
        this.f2522c = i3;
        this.f2521b = 0;
    }

    /* JADX INFO: renamed from: F */
    public final void m1664F(int i3) {
        AbstractC0646n.m1625c(i3 >= 0 && i3 <= this.f2520a.length);
        this.f2522c = i3;
    }

    /* JADX INFO: renamed from: G */
    public final void m1665G(int i3) {
        AbstractC0646n.m1625c(i3 >= 0 && i3 <= this.f2522c);
        this.f2521b = i3;
    }

    /* JADX INFO: renamed from: H */
    public final void m1666H(int i3) {
        m1665G(this.f2521b + i3);
    }

    /* JADX INFO: renamed from: a */
    public final int m1667a() {
        return this.f2522c - this.f2521b;
    }

    /* JADX INFO: renamed from: b */
    public final void m1668b(int i3) {
        byte[] bArr = this.f2520a;
        if (i3 > bArr.length) {
            this.f2520a = Arrays.copyOf(bArr, i3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final char m1669c(Charset charset) {
        AbstractC0646n.m1624b("Unsupported charset: " + charset, f2519f.contains(charset));
        return (char) (m1670d(charset) >> 16);
    }

    /* JADX INFO: renamed from: d */
    public final int m1670d(Charset charset) {
        byte b3;
        int i3;
        byte b4;
        byte b5;
        if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && m1667a() >= 1) {
            long j3 = this.f2520a[this.f2521b] & 255;
            char c = (char) j3;
            AbstractC0230e.m728f(((long) c) == j3, "Out of range: %s", j3);
            b3 = (byte) c;
            i3 = 1;
        } else {
            i3 = 2;
            if ((charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) && m1667a() >= 2) {
                byte[] bArr = this.f2520a;
                int i4 = this.f2521b;
                b4 = bArr[i4];
                b5 = bArr[i4 + 1];
            } else {
                if (!charset.equals(StandardCharsets.UTF_16LE) || m1667a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f2520a;
                int i5 = this.f2521b;
                b4 = bArr2[i5 + 1];
                b5 = bArr2[i5];
            }
            b3 = (byte) ((char) ((b5 & 255) | (b4 << 8)));
        }
        long j4 = b3;
        char c2 = (char) j4;
        AbstractC0230e.m728f(((long) c2) == j4, "Out of range: %s", j4);
        return (c2 << 16) + i3;
    }

    /* JADX INFO: renamed from: e */
    public final void m1671e(byte[] bArr, int i3, int i4) {
        System.arraycopy(this.f2520a, this.f2521b, bArr, i3, i4);
        this.f2521b += i4;
    }

    /* JADX INFO: renamed from: f */
    public final char m1672f(Charset charset, char[] cArr) {
        int iM1670d = m1670d(charset);
        if (iM1670d != 0) {
            char c = (char) (iM1670d >> 16);
            for (char c2 : cArr) {
                if (c2 == c) {
                    this.f2521b += iM1670d & 65535;
                    return c;
                }
            }
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: g */
    public final int m1673g() {
        byte[] bArr = this.f2520a;
        int i3 = this.f2521b;
        int i4 = i3 + 1;
        this.f2521b = i4;
        int i5 = (bArr[i3] & 255) << 24;
        int i6 = i3 + 2;
        this.f2521b = i6;
        int i7 = ((bArr[i4] & 255) << 16) | i5;
        int i8 = i3 + 3;
        this.f2521b = i8;
        int i9 = i7 | ((bArr[i6] & 255) << 8);
        this.f2521b = i3 + 4;
        return (bArr[i8] & 255) | i9;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c6 A[SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public final String m1674h(Charset charset) {
        int i3;
        byte[] bArr;
        AbstractC0646n.m1624b("Unsupported charset: " + charset, f2519f.contains(charset));
        if (m1667a() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            m1661C();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i3 = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i3 = 2;
        }
        int i4 = this.f2521b;
        while (true) {
            int i5 = this.f2522c;
            if (i4 >= i5 - (i3 - 1)) {
                i4 = i5;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && AbstractC0632A.m1569J(this.f2520a[i4])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr2 = this.f2520a;
                if (bArr2[i4] == 0 && AbstractC0632A.m1569J(bArr2[i4 + 1])) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.f2520a;
                    if (bArr[i4 + 1] == 0 && AbstractC0632A.m1569J(bArr[i4])) {
                        break;
                    }
                }
                i4 += i3;
            } else {
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.f2520a;
                    if (bArr[i4 + 1] == 0) {
                        continue;
                    }
                }
                i4 += i3;
            }
        }
        String strM1685s = m1685s(i4 - this.f2521b, charset);
        if (this.f2521b != this.f2522c && m1672f(charset, f2517d) == '\r') {
            m1672f(charset, f2518e);
        }
        return strM1685s;
    }

    /* JADX INFO: renamed from: i */
    public final int m1675i() {
        byte[] bArr = this.f2520a;
        int i3 = this.f2521b;
        int i4 = i3 + 1;
        this.f2521b = i4;
        int i5 = bArr[i3] & 255;
        int i6 = i3 + 2;
        this.f2521b = i6;
        int i7 = ((bArr[i4] & 255) << 8) | i5;
        int i8 = i3 + 3;
        this.f2521b = i8;
        int i9 = i7 | ((bArr[i6] & 255) << 16);
        this.f2521b = i3 + 4;
        return ((bArr[i8] & 255) << 24) | i9;
    }

    /* JADX INFO: renamed from: j */
    public final long m1676j() {
        byte[] bArr = this.f2520a;
        int i3 = this.f2521b;
        int i4 = i3 + 1;
        this.f2521b = i4;
        long j3 = ((long) bArr[i3]) & 255;
        int i5 = i3 + 2;
        this.f2521b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 8);
        int i6 = i3 + 3;
        this.f2521b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 16);
        int i7 = i3 + 4;
        this.f2521b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 24);
        int i8 = i3 + 5;
        this.f2521b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 32);
        int i9 = i3 + 6;
        this.f2521b = i9;
        long j8 = j7 | ((((long) bArr[i8]) & 255) << 40);
        int i10 = i3 + 7;
        this.f2521b = i10;
        long j9 = j8 | ((((long) bArr[i9]) & 255) << 48);
        this.f2521b = i3 + 8;
        return ((((long) bArr[i10]) & 255) << 56) | j9;
    }

    /* JADX INFO: renamed from: k */
    public final short m1677k() {
        byte[] bArr = this.f2520a;
        int i3 = this.f2521b;
        int i4 = i3 + 1;
        this.f2521b = i4;
        int i5 = bArr[i3] & 255;
        this.f2521b = i3 + 2;
        return (short) (((bArr[i4] & 255) << 8) | i5);
    }

    /* JADX INFO: renamed from: l */
    public final long m1678l() {
        byte[] bArr = this.f2520a;
        int i3 = this.f2521b;
        int i4 = i3 + 1;
        this.f2521b = i4;
        long j3 = ((long) bArr[i3]) & 255;
        int i5 = i3 + 2;
        this.f2521b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 8);
        int i6 = i3 + 3;
        this.f2521b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 16);
        this.f2521b = i3 + 4;
        return ((((long) bArr[i6]) & 255) << 24) | j5;
    }

    /* JADX INFO: renamed from: m */
    public final int m1679m() {
        int iM1675i = m1675i();
        if (iM1675i >= 0) {
            return iM1675i;
        }
        throw new IllegalStateException(AbstractC0462h.m1165e(iM1675i, "Top bit not zero: "));
    }

    /* JADX INFO: renamed from: n */
    public final int m1680n() {
        byte[] bArr = this.f2520a;
        int i3 = this.f2521b;
        int i4 = i3 + 1;
        this.f2521b = i4;
        int i5 = bArr[i3] & 255;
        this.f2521b = i3 + 2;
        return ((bArr[i4] & 255) << 8) | i5;
    }

    /* JADX INFO: renamed from: o */
    public final long m1681o() {
        byte[] bArr = this.f2520a;
        int i3 = this.f2521b;
        int i4 = i3 + 1;
        this.f2521b = i4;
        long j3 = (((long) bArr[i3]) & 255) << 56;
        int i5 = i3 + 2;
        this.f2521b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 48);
        int i6 = i3 + 3;
        this.f2521b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 40);
        int i7 = i3 + 4;
        this.f2521b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 32);
        int i8 = i3 + 5;
        this.f2521b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 24);
        int i9 = i3 + 6;
        this.f2521b = i9;
        long j8 = j7 | ((((long) bArr[i8]) & 255) << 16);
        int i10 = i3 + 7;
        this.f2521b = i10;
        long j9 = j8 | ((((long) bArr[i9]) & 255) << 8);
        this.f2521b = i3 + 8;
        return (((long) bArr[i10]) & 255) | j9;
    }

    /* JADX INFO: renamed from: p */
    public final String m1682p() {
        if (m1667a() == 0) {
            return null;
        }
        int i3 = this.f2521b;
        while (i3 < this.f2522c && this.f2520a[i3] != 0) {
            i3++;
        }
        byte[] bArr = this.f2520a;
        int i4 = this.f2521b;
        int i5 = AbstractC0632A.f2454a;
        String str = new String(bArr, i4, i3 - i4, StandardCharsets.UTF_8);
        this.f2521b = i3;
        if (i3 < this.f2522c) {
            this.f2521b = i3 + 1;
        }
        return str;
    }

    /* JADX INFO: renamed from: q */
    public final String m1683q(int i3) {
        if (i3 == 0) {
            return "";
        }
        int i4 = this.f2521b;
        int i5 = (i4 + i3) - 1;
        int i6 = (i5 >= this.f2522c || this.f2520a[i5] != 0) ? i3 : i3 - 1;
        byte[] bArr = this.f2520a;
        int i7 = AbstractC0632A.f2454a;
        String str = new String(bArr, i4, i6, StandardCharsets.UTF_8);
        this.f2521b += i3;
        return str;
    }

    /* JADX INFO: renamed from: r */
    public final short m1684r() {
        byte[] bArr = this.f2520a;
        int i3 = this.f2521b;
        int i4 = i3 + 1;
        this.f2521b = i4;
        int i5 = (bArr[i3] & 255) << 8;
        this.f2521b = i3 + 2;
        return (short) ((bArr[i4] & 255) | i5);
    }

    /* JADX INFO: renamed from: s */
    public final String m1685s(int i3, Charset charset) {
        String str = new String(this.f2520a, this.f2521b, i3, charset);
        this.f2521b += i3;
        return str;
    }

    /* JADX INFO: renamed from: t */
    public final int m1686t() {
        return (m1687u() << 21) | (m1687u() << 14) | (m1687u() << 7) | m1687u();
    }

    /* JADX INFO: renamed from: u */
    public final int m1687u() {
        byte[] bArr = this.f2520a;
        int i3 = this.f2521b;
        this.f2521b = i3 + 1;
        return bArr[i3] & 255;
    }

    /* JADX INFO: renamed from: v */
    public final int m1688v() {
        byte[] bArr = this.f2520a;
        int i3 = this.f2521b;
        int i4 = i3 + 1;
        this.f2521b = i4;
        int i5 = (bArr[i3] & 255) << 8;
        this.f2521b = i3 + 2;
        int i6 = (bArr[i4] & 255) | i5;
        this.f2521b = i3 + 4;
        return i6;
    }

    /* JADX INFO: renamed from: w */
    public final long m1689w() {
        byte[] bArr = this.f2520a;
        int i3 = this.f2521b;
        int i4 = i3 + 1;
        this.f2521b = i4;
        long j3 = (((long) bArr[i3]) & 255) << 24;
        int i5 = i3 + 2;
        this.f2521b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 16);
        int i6 = i3 + 3;
        this.f2521b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 8);
        this.f2521b = i3 + 4;
        return (((long) bArr[i6]) & 255) | j5;
    }

    /* JADX INFO: renamed from: x */
    public final int m1690x() {
        byte[] bArr = this.f2520a;
        int i3 = this.f2521b;
        int i4 = i3 + 1;
        this.f2521b = i4;
        int i5 = (bArr[i3] & 255) << 16;
        int i6 = i3 + 2;
        this.f2521b = i6;
        int i7 = ((bArr[i4] & 255) << 8) | i5;
        this.f2521b = i3 + 3;
        return (bArr[i6] & 255) | i7;
    }

    /* JADX INFO: renamed from: y */
    public final int m1691y() {
        int iM1673g = m1673g();
        if (iM1673g >= 0) {
            return iM1673g;
        }
        throw new IllegalStateException(AbstractC0462h.m1165e(iM1673g, "Top bit not zero: "));
    }

    /* JADX INFO: renamed from: z */
    public final long m1692z() {
        long jM1681o = m1681o();
        if (jM1681o >= 0) {
            return jM1681o;
        }
        throw new IllegalStateException("Top bit not zero: " + jM1681o);
    }

    public C0651s(int i3) {
        this.f2520a = new byte[i3];
        this.f2522c = i3;
    }

    public C0651s(byte[] bArr) {
        this.f2520a = bArr;
        this.f2522c = bArr.length;
    }

    public C0651s(byte[] bArr, int i3) {
        this.f2520a = bArr;
        this.f2522c = i3;
    }
}

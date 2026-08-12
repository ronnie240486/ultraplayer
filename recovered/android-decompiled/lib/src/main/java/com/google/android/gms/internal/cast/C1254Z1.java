package com.google.android.gms.internal.cast;

import java.util.logging.Level;
import java.util.logging.Logger;
import p122m1.AbstractC2003a;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.Z1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1254Z1 extends AbstractC2003a {

    /* JADX INFO: renamed from: j */
    public static final Logger f5753j = Logger.getLogger(C1254Z1.class.getName());

    /* JADX INFO: renamed from: k */
    public static final boolean f5754k = AbstractC1235U2.f5718e;

    /* JADX INFO: renamed from: f */
    public C1342v2 f5755f;

    /* JADX INFO: renamed from: g */
    public final byte[] f5756g;

    /* JADX INFO: renamed from: h */
    public final int f5757h;

    /* JADX INFO: renamed from: i */
    public int f5758i;

    public C1254Z1(byte[] bArr, int i3) {
        int length = bArr.length;
        if (((length - i3) | i3) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i3)));
        }
        this.f5756g = bArr;
        this.f5758i = 0;
        this.f5757h = i3;
    }

    /* JADX INFO: renamed from: K */
    public static int m3220K(int i3) {
        if (i3 >= 0) {
            return m3222M(i3);
        }
        return 10;
    }

    /* JADX INFO: renamed from: L */
    public static int m3221L(String str) {
        int length;
        try {
            length = AbstractC1243W2.m3212c(str);
        } catch (C1239V2 unused) {
            length = str.getBytes(AbstractC1306m2.f5927a).length;
        }
        return m3222M(length) + length;
    }

    /* JADX INFO: renamed from: M */
    public static int m3222M(int i3) {
        if ((i3 & (-128)) == 0) {
            return 1;
        }
        if ((i3 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i3) == 0) {
            return 3;
        }
        return (i3 & (-268435456)) == 0 ? 4 : 5;
    }

    /* JADX INFO: renamed from: N */
    public static int m3223N(long j3) {
        int i3;
        if (((-128) & j3) == 0) {
            return 1;
        }
        if (j3 < 0) {
            return 10;
        }
        if (((-34359738368L) & j3) != 0) {
            j3 >>>= 28;
            i3 = 6;
        } else {
            i3 = 2;
        }
        if (((-2097152) & j3) != 0) {
            j3 >>>= 14;
            i3 += 2;
        }
        return (j3 & (-16384)) != 0 ? i3 + 1 : i3;
    }

    /* JADX INFO: renamed from: A */
    public final void m3224A(int i3, C1250Y1 c1250y1) throws C1258a2 {
        m3231H((i3 << 3) | 2);
        m3231H(c1250y1.mo3215h());
        m3235z(c1250y1.f5745h, c1250y1.mo3215h());
    }

    /* JADX INFO: renamed from: B */
    public final void m3225B(int i3, int i4) throws C1258a2 {
        m3231H((i3 << 3) | 5);
        m3226C(i4);
    }

    /* JADX INFO: renamed from: C */
    public final void m3226C(int i3) throws C1258a2 {
        try {
            byte[] bArr = this.f5756g;
            int i4 = this.f5758i;
            int i5 = i4 + 1;
            this.f5758i = i5;
            bArr[i4] = (byte) (i3 & 255);
            int i6 = i4 + 2;
            this.f5758i = i6;
            bArr[i5] = (byte) ((i3 >> 8) & 255);
            int i7 = i4 + 3;
            this.f5758i = i7;
            bArr[i6] = (byte) ((i3 >> 16) & 255);
            this.f5758i = i4 + 4;
            bArr[i7] = (byte) ((i3 >> 24) & 255);
        } catch (IndexOutOfBoundsException e3) {
            throw new C1258a2(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5758i), Integer.valueOf(this.f5757h), 1), e3);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m3227D(int i3, long j3) throws C1258a2 {
        m3231H((i3 << 3) | 1);
        m3228E(j3);
    }

    /* JADX INFO: renamed from: E */
    public final void m3228E(long j3) throws C1258a2 {
        try {
            byte[] bArr = this.f5756g;
            int i3 = this.f5758i;
            int i4 = i3 + 1;
            this.f5758i = i4;
            bArr[i3] = (byte) (((int) j3) & 255);
            int i5 = i3 + 2;
            this.f5758i = i5;
            bArr[i4] = (byte) (((int) (j3 >> 8)) & 255);
            int i6 = i3 + 3;
            this.f5758i = i6;
            bArr[i5] = (byte) (((int) (j3 >> 16)) & 255);
            int i7 = i3 + 4;
            this.f5758i = i7;
            bArr[i6] = (byte) (((int) (j3 >> 24)) & 255);
            int i8 = i3 + 5;
            this.f5758i = i8;
            bArr[i7] = (byte) (((int) (j3 >> 32)) & 255);
            int i9 = i3 + 6;
            this.f5758i = i9;
            bArr[i8] = (byte) (((int) (j3 >> 40)) & 255);
            int i10 = i3 + 7;
            this.f5758i = i10;
            bArr[i9] = (byte) (((int) (j3 >> 48)) & 255);
            this.f5758i = i3 + 8;
            bArr[i10] = (byte) (((int) (j3 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e3) {
            throw new C1258a2(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5758i), Integer.valueOf(this.f5757h), 1), e3);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m3229F(int i3, String str) throws C1258a2 {
        m3231H((i3 << 3) | 2);
        int i4 = this.f5758i;
        try {
            int iM3222M = m3222M(str.length() * 3);
            int iM3222M2 = m3222M(str.length());
            byte[] bArr = this.f5756g;
            int i5 = this.f5757h;
            if (iM3222M2 != iM3222M) {
                m3231H(AbstractC1243W2.m3212c(str));
                int i6 = this.f5758i;
                this.f5758i = AbstractC1243W2.m3211b(str, bArr, i6, i5 - i6);
            } else {
                int i7 = i4 + iM3222M2;
                this.f5758i = i7;
                int iM3211b = AbstractC1243W2.m3211b(str, bArr, i7, i5 - i7);
                this.f5758i = i4;
                m3231H((iM3211b - i4) - iM3222M2);
                this.f5758i = iM3211b;
            }
        } catch (C1239V2 e3) {
            this.f5758i = i4;
            f5753j.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(AbstractC1306m2.f5927a);
            try {
                int length = bytes.length;
                m3231H(length);
                m3235z(bytes, length);
            } catch (IndexOutOfBoundsException e4) {
                throw new C1258a2(e4);
            }
        } catch (IndexOutOfBoundsException e5) {
            throw new C1258a2(e5);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m3230G(int i3, int i4) throws C1258a2 {
        m3231H((i3 << 3) | i4);
    }

    /* JADX INFO: renamed from: H */
    public final void m3231H(int i3) throws C1258a2 {
        while (true) {
            int i4 = i3 & (-128);
            byte[] bArr = this.f5756g;
            if (i4 == 0) {
                int i5 = this.f5758i;
                this.f5758i = i5 + 1;
                bArr[i5] = (byte) i3;
                return;
            } else {
                try {
                    int i6 = this.f5758i;
                    this.f5758i = i6 + 1;
                    bArr[i6] = (byte) ((i3 & 127) | 128);
                    i3 >>>= 7;
                } catch (IndexOutOfBoundsException e3) {
                    throw new C1258a2(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5758i), Integer.valueOf(this.f5757h), 1), e3);
                }
            }
            throw new C1258a2(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5758i), Integer.valueOf(this.f5757h), 1), e3);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m3232I(int i3, long j3) throws C1258a2 {
        m3231H(i3 << 3);
        m3233J(j3);
    }

    /* JADX INFO: renamed from: J */
    public final void m3233J(long j3) throws C1258a2 {
        byte[] bArr = this.f5756g;
        boolean z3 = f5754k;
        int i3 = this.f5757h;
        if (!z3 || i3 - this.f5758i < 10) {
            while ((j3 & (-128)) != 0) {
                try {
                    int i4 = this.f5758i;
                    this.f5758i = i4 + 1;
                    bArr[i4] = (byte) ((((int) j3) & 127) | 128);
                    j3 >>>= 7;
                } catch (IndexOutOfBoundsException e3) {
                    throw new C1258a2(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5758i), Integer.valueOf(i3), 1), e3);
                }
            }
            int i5 = this.f5758i;
            this.f5758i = i5 + 1;
            bArr[i5] = (byte) j3;
            return;
        }
        while (true) {
            int i6 = (int) j3;
            if ((j3 & (-128)) == 0) {
                int i7 = this.f5758i;
                this.f5758i = 1 + i7;
                AbstractC1235U2.f5716c.mo3188d(bArr, AbstractC1235U2.f5719f + ((long) i7), (byte) i6);
                return;
            }
            int i8 = this.f5758i;
            this.f5758i = i8 + 1;
            AbstractC1235U2.f5716c.mo3188d(bArr, AbstractC1235U2.f5719f + ((long) i8), (byte) ((i6 & 127) | 128));
            j3 >>>= 7;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m3234y(byte b3) throws C1258a2 {
        try {
            byte[] bArr = this.f5756g;
            int i3 = this.f5758i;
            this.f5758i = i3 + 1;
            bArr[i3] = b3;
        } catch (IndexOutOfBoundsException e3) {
            throw new C1258a2(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5758i), Integer.valueOf(this.f5757h), 1), e3);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m3235z(byte[] bArr, int i3) throws C1258a2 {
        try {
            System.arraycopy(bArr, 0, this.f5756g, this.f5758i, i3);
            this.f5758i += i3;
        } catch (IndexOutOfBoundsException e3) {
            throw new C1258a2(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5758i), Integer.valueOf(this.f5757h), Integer.valueOf(i3)), e3);
        }
    }
}

package p085c0;

import java.nio.ByteBuffer;
import p058U.AbstractC0605e;
import p058U.C0602b;
import p058U.C0603c;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: c0.D */
/* JADX INFO: loaded from: classes.dex */
public final class C1122D extends AbstractC0605e {

    /* JADX INFO: renamed from: n */
    public int f5203n;

    /* JADX INFO: renamed from: o */
    public boolean f5204o;

    /* JADX INFO: renamed from: p */
    public int f5205p;

    /* JADX INFO: renamed from: q */
    public long f5206q;

    /* JADX INFO: renamed from: s */
    public byte[] f5208s;

    /* JADX INFO: renamed from: v */
    public byte[] f5211v;

    /* JADX INFO: renamed from: r */
    public int f5207r = 0;

    /* JADX INFO: renamed from: t */
    public int f5209t = 0;

    /* JADX INFO: renamed from: u */
    public int f5210u = 0;

    /* JADX INFO: renamed from: l */
    public final long f5201l = 100000;

    /* JADX INFO: renamed from: i */
    public final float f5198i = 0.2f;

    /* JADX INFO: renamed from: m */
    public final long f5202m = 2000000;

    /* JADX INFO: renamed from: k */
    public final int f5200k = 10;

    /* JADX INFO: renamed from: j */
    public final short f5199j = 1024;

    public C1122D() {
        byte[] bArr = AbstractC0632A.f2459f;
        this.f5208s = bArr;
        this.f5211v = bArr;
    }

    @Override // p058U.AbstractC0605e, p058U.InterfaceC0604d
    /* JADX INFO: renamed from: e */
    public final boolean mo1475e() {
        return super.mo1475e() && this.f5204o;
    }

    @Override // p058U.InterfaceC0604d
    /* JADX INFO: renamed from: f */
    public final void mo1476f(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f2258g.hasRemaining()) {
            int i3 = this.f5205p;
            short s3 = this.f5199j;
            if (i3 == 0) {
                int iLimit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit2, byteBuffer.position() + this.f5208s.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3) << 8) | (byteBuffer.get(iLimit3 - 1) & 255)) > s3) {
                        int i4 = this.f5203n;
                        iPosition = ((iLimit3 / i4) * i4) + i4;
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f5205p = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    m1482l(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit2);
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException();
                }
                AbstractC0646n.m1630h(this.f5209t < this.f5208s.length);
                int iLimit4 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > s3) {
                        int i5 = this.f5203n;
                        iLimit = (iPosition2 / i5) * i5;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int length = this.f5209t;
                int i6 = this.f5210u;
                int length2 = length + i6;
                byte[] bArr = this.f5208s;
                if (length2 < bArr.length) {
                    length = bArr.length;
                } else {
                    length2 = i6 - (bArr.length - length);
                }
                int i7 = length - length2;
                boolean z3 = iLimit < iLimit4;
                int iMin = Math.min(iPosition3, i7);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f5208s, length2, iMin);
                int i8 = this.f5210u + iMin;
                this.f5210u = i8;
                AbstractC0646n.m1630h(i8 <= this.f5208s.length);
                boolean z4 = z3 && iPosition3 < i7;
                m3001n(z4);
                if (z4) {
                    this.f5205p = 0;
                    this.f5207r = 0;
                }
                byteBuffer.limit(iLimit4);
            }
        }
    }

    @Override // p058U.AbstractC0605e
    /* JADX INFO: renamed from: h */
    public final C0602b mo1478h(C0602b c0602b) throws C0603c {
        if (c0602b.f2250c == 2) {
            return c0602b.f2248a == -1 ? C0602b.f2247e : c0602b;
        }
        throw new C0603c(c0602b);
    }

    @Override // p058U.AbstractC0605e
    /* JADX INFO: renamed from: i */
    public final void mo1479i() {
        if (mo1475e()) {
            C0602b c0602b = this.f2253b;
            int i3 = c0602b.f2249b * 2;
            this.f5203n = i3;
            int i4 = ((((int) ((this.f5201l * ((long) c0602b.f2248a)) / 1000000)) / 2) / i3) * i3 * 2;
            if (this.f5208s.length != i4) {
                this.f5208s = new byte[i4];
                this.f5211v = new byte[i4];
            }
        }
        this.f5205p = 0;
        this.f5206q = 0L;
        this.f5207r = 0;
        this.f5209t = 0;
        this.f5210u = 0;
    }

    @Override // p058U.AbstractC0605e
    /* JADX INFO: renamed from: j */
    public final void mo1480j() {
        if (this.f5210u > 0) {
            m3001n(true);
            this.f5207r = 0;
        }
    }

    @Override // p058U.AbstractC0605e
    /* JADX INFO: renamed from: k */
    public final void mo1481k() {
        this.f5204o = false;
        byte[] bArr = AbstractC0632A.f2459f;
        this.f5208s = bArr;
        this.f5211v = bArr;
    }

    /* JADX INFO: renamed from: m */
    public final int m3000m(int i3) {
        int length = ((((int) ((this.f5202m * ((long) this.f2253b.f2248a)) / 1000000)) - this.f5207r) * this.f5203n) - (this.f5208s.length / 2);
        AbstractC0646n.m1630h(length >= 0);
        int iMin = (int) Math.min((i3 * this.f5198i) + 0.5f, length);
        int i4 = this.f5203n;
        return (iMin / i4) * i4;
    }

    /* JADX INFO: renamed from: n */
    public final void m3001n(boolean z3) {
        int length;
        int iM3000m;
        int i3 = this.f5210u;
        byte[] bArr = this.f5208s;
        if (i3 == bArr.length || z3) {
            if (this.f5207r == 0) {
                if (z3) {
                    m3002o(i3, 3);
                    length = i3;
                } else {
                    AbstractC0646n.m1630h(i3 >= bArr.length / 2);
                    length = this.f5208s.length / 2;
                    m3002o(length, 0);
                }
                iM3000m = length;
            } else if (z3) {
                int length2 = i3 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iM3000m2 = m3000m(length2) + (this.f5208s.length / 2);
                m3002o(iM3000m2, 2);
                iM3000m = iM3000m2;
                length = length3;
            } else {
                length = i3 - (bArr.length / 2);
                iM3000m = m3000m(length);
                m3002o(iM3000m, 1);
            }
            AbstractC0646n.m1629g("bytesConsumed is not aligned to frame size: %s" + length, length % this.f5203n == 0);
            AbstractC0646n.m1630h(i3 >= iM3000m);
            this.f5210u -= length;
            int i4 = this.f5209t + length;
            this.f5209t = i4;
            this.f5209t = i4 % this.f5208s.length;
            int i5 = this.f5207r;
            int i6 = this.f5203n;
            this.f5207r = (iM3000m / i6) + i5;
            this.f5206q += (long) ((length - iM3000m) / i6);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m3002o(int i3, int i4) {
        if (i3 == 0) {
            return;
        }
        AbstractC0646n.m1625c(this.f5210u >= i3);
        if (i4 == 2) {
            int i5 = this.f5209t;
            int i6 = this.f5210u;
            int i7 = i5 + i6;
            byte[] bArr = this.f5208s;
            if (i7 <= bArr.length) {
                System.arraycopy(bArr, i7 - i3, this.f5211v, 0, i3);
            } else {
                int length = i6 - (bArr.length - i5);
                if (length >= i3) {
                    System.arraycopy(bArr, length - i3, this.f5211v, 0, i3);
                } else {
                    int i8 = i3 - length;
                    System.arraycopy(bArr, bArr.length - i8, this.f5211v, 0, i8);
                    System.arraycopy(this.f5208s, 0, this.f5211v, i8, length);
                }
            }
        } else {
            int i9 = this.f5209t;
            int i10 = i9 + i3;
            byte[] bArr2 = this.f5208s;
            if (i10 <= bArr2.length) {
                System.arraycopy(bArr2, i9, this.f5211v, 0, i3);
            } else {
                int length2 = bArr2.length - i9;
                System.arraycopy(bArr2, i9, this.f5211v, 0, length2);
                System.arraycopy(this.f5208s, 0, this.f5211v, length2, i3 - length2);
            }
        }
        AbstractC0646n.m1624b("sizeToOutput is not aligned to frame size: " + i3, i3 % this.f5203n == 0);
        AbstractC0646n.m1630h(this.f5209t < this.f5208s.length);
        byte[] bArr3 = this.f5211v;
        AbstractC0646n.m1624b("byteOutput size is not aligned to frame size " + i3, i3 % this.f5203n == 0);
        if (i4 != 3) {
            for (int i11 = 0; i11 < i3; i11 += 2) {
                int i12 = i11 + 1;
                int i13 = (bArr3[i12] << 8) | (bArr3[i11] & 255);
                int i14 = this.f5200k;
                if (i4 == 0) {
                    i14 = ((((i11 * 1000) / (i3 - 1)) * (i14 - 100)) / 1000) + 100;
                } else if (i4 == 2) {
                    i14 += (((i11 * 1000) * (100 - i14)) / (i3 - 1)) / 1000;
                }
                int i15 = (i13 * i14) / 100;
                if (i15 >= 32767) {
                    bArr3[i11] = -1;
                    bArr3[i12] = 127;
                } else if (i15 <= -32768) {
                    bArr3[i11] = 0;
                    bArr3[i12] = -128;
                } else {
                    bArr3[i11] = (byte) (i15 & 255);
                    bArr3[i12] = (byte) (i15 >> 8);
                }
            }
        }
        m1482l(i3).put(bArr3, 0, i3).flip();
    }
}

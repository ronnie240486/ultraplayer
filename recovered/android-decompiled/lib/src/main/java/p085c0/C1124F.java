package p085c0;

import java.nio.ByteBuffer;
import p058U.AbstractC0605e;
import p058U.C0602b;
import p058U.C0603c;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: c0.F */
/* JADX INFO: loaded from: classes.dex */
public final class C1124F extends AbstractC0605e {

    /* JADX INFO: renamed from: i */
    public int f5213i;

    /* JADX INFO: renamed from: j */
    public int f5214j;

    /* JADX INFO: renamed from: k */
    public boolean f5215k;

    /* JADX INFO: renamed from: l */
    public int f5216l;

    /* JADX INFO: renamed from: m */
    public byte[] f5217m;

    /* JADX INFO: renamed from: n */
    public int f5218n;

    /* JADX INFO: renamed from: o */
    public long f5219o;

    @Override // p058U.AbstractC0605e, p058U.InterfaceC0604d
    /* JADX INFO: renamed from: a */
    public final ByteBuffer mo1471a() {
        int i3;
        if (super.mo1474d() && (i3 = this.f5218n) > 0) {
            m1482l(i3).put(this.f5217m, 0, this.f5218n).flip();
            this.f5218n = 0;
        }
        return super.mo1471a();
    }

    @Override // p058U.AbstractC0605e, p058U.InterfaceC0604d
    /* JADX INFO: renamed from: d */
    public final boolean mo1474d() {
        return super.mo1474d() && this.f5218n == 0;
    }

    @Override // p058U.InterfaceC0604d
    /* JADX INFO: renamed from: f */
    public final void mo1476f(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i3 = iLimit - iPosition;
        if (i3 == 0) {
            return;
        }
        int iMin = Math.min(i3, this.f5216l);
        this.f5219o += (long) (iMin / this.f2253b.f2251d);
        this.f5216l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f5216l > 0) {
            return;
        }
        int i4 = i3 - iMin;
        int length = (this.f5218n + i4) - this.f5217m.length;
        ByteBuffer byteBufferM1482l = m1482l(length);
        int iM1590i = AbstractC0632A.m1590i(length, 0, this.f5218n);
        byteBufferM1482l.put(this.f5217m, 0, iM1590i);
        int iM1590i2 = AbstractC0632A.m1590i(length - iM1590i, 0, i4);
        byteBuffer.limit(byteBuffer.position() + iM1590i2);
        byteBufferM1482l.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i5 = i4 - iM1590i2;
        int i6 = this.f5218n - iM1590i;
        this.f5218n = i6;
        byte[] bArr = this.f5217m;
        System.arraycopy(bArr, iM1590i, bArr, 0, i6);
        byteBuffer.get(this.f5217m, this.f5218n, i5);
        this.f5218n += i5;
        byteBufferM1482l.flip();
    }

    @Override // p058U.AbstractC0605e
    /* JADX INFO: renamed from: h */
    public final C0602b mo1478h(C0602b c0602b) throws C0603c {
        if (c0602b.f2250c != 2) {
            throw new C0603c(c0602b);
        }
        this.f5215k = true;
        return (this.f5213i == 0 && this.f5214j == 0) ? C0602b.f2247e : c0602b;
    }

    @Override // p058U.AbstractC0605e
    /* JADX INFO: renamed from: i */
    public final void mo1479i() {
        if (this.f5215k) {
            this.f5215k = false;
            int i3 = this.f5214j;
            int i4 = this.f2253b.f2251d;
            this.f5217m = new byte[i3 * i4];
            this.f5216l = this.f5213i * i4;
        }
        this.f5218n = 0;
    }

    @Override // p058U.AbstractC0605e
    /* JADX INFO: renamed from: j */
    public final void mo1480j() {
        if (this.f5215k) {
            int i3 = this.f5218n;
            if (i3 > 0) {
                this.f5219o += (long) (i3 / this.f2253b.f2251d);
            }
            this.f5218n = 0;
        }
    }

    @Override // p058U.AbstractC0605e
    /* JADX INFO: renamed from: k */
    public final void mo1481k() {
        this.f5217m = AbstractC0632A.f2459f;
    }
}

package p085c0;

import java.nio.ByteBuffer;
import p058U.AbstractC0605e;
import p058U.C0602b;
import p058U.C0603c;

/* JADX INFO: renamed from: c0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1142r extends AbstractC0605e {

    /* JADX INFO: renamed from: i */
    public int[] f5314i;

    /* JADX INFO: renamed from: j */
    public int[] f5315j;

    @Override // p058U.InterfaceC0604d
    /* JADX INFO: renamed from: f */
    public final void mo1476f(ByteBuffer byteBuffer) {
        int[] iArr = this.f5315j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferM1482l = m1482l(((iLimit - iPosition) / this.f2253b.f2251d) * this.f2254c.f2251d);
        while (iPosition < iLimit) {
            for (int i3 : iArr) {
                byteBufferM1482l.putShort(byteBuffer.getShort((i3 * 2) + iPosition));
            }
            iPosition += this.f2253b.f2251d;
        }
        byteBuffer.position(iLimit);
        byteBufferM1482l.flip();
    }

    @Override // p058U.AbstractC0605e
    /* JADX INFO: renamed from: h */
    public final C0602b mo1478h(C0602b c0602b) throws C0603c {
        int[] iArr = this.f5314i;
        if (iArr == null) {
            return C0602b.f2247e;
        }
        if (c0602b.f2250c != 2) {
            throw new C0603c(c0602b);
        }
        int length = iArr.length;
        int i3 = c0602b.f2249b;
        boolean z3 = i3 != length;
        int i4 = 0;
        while (i4 < iArr.length) {
            int i5 = iArr[i4];
            if (i5 >= i3) {
                throw new C0603c(c0602b);
            }
            z3 |= i5 != i4;
            i4++;
        }
        return z3 ? new C0602b(c0602b.f2248a, iArr.length, 2) : C0602b.f2247e;
    }

    @Override // p058U.AbstractC0605e
    /* JADX INFO: renamed from: i */
    public final void mo1479i() {
        this.f5315j = this.f5314i;
    }

    @Override // p058U.AbstractC0605e
    /* JADX INFO: renamed from: k */
    public final void mo1481k() {
        this.f5315j = null;
        this.f5314i = null;
    }
}

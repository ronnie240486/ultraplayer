package p085c0;

import java.nio.ByteBuffer;
import p058U.AbstractC0605e;
import p058U.C0602b;
import p058U.C0603c;

/* JADX INFO: renamed from: c0.E */
/* JADX INFO: loaded from: classes.dex */
public final class C1123E extends AbstractC0605e {

    /* JADX INFO: renamed from: i */
    public static final int f5212i = Float.floatToIntBits(Float.NaN);

    /* JADX INFO: renamed from: m */
    public static void m3003m(int i3, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i3) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f5212i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // p058U.InterfaceC0604d
    /* JADX INFO: renamed from: f */
    public final void mo1476f(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM1482l;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i3 = iLimit - iPosition;
        int i4 = this.f2253b.f2250c;
        if (i4 == 21) {
            byteBufferM1482l = m1482l((i3 / 3) * 4);
            while (iPosition < iLimit) {
                m3003m(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferM1482l);
                iPosition += 3;
            }
        } else if (i4 == 22) {
            byteBufferM1482l = m1482l(i3);
            while (iPosition < iLimit) {
                m3003m((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferM1482l);
                iPosition += 4;
            }
        } else if (i4 == 1342177280) {
            byteBufferM1482l = m1482l((i3 / 3) * 4);
            while (iPosition < iLimit) {
                m3003m(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferM1482l);
                iPosition += 3;
            }
        } else {
            if (i4 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferM1482l = m1482l(i3);
            while (iPosition < iLimit) {
                m3003m((byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferM1482l);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM1482l.flip();
    }

    @Override // p058U.AbstractC0605e
    /* JADX INFO: renamed from: h */
    public final C0602b mo1478h(C0602b c0602b) throws C0603c {
        int i3 = c0602b.f2250c;
        if (i3 == 21 || i3 == 1342177280 || i3 == 22 || i3 == 1610612736 || i3 == 4) {
            return i3 != 4 ? new C0602b(c0602b.f2248a, c0602b.f2249b, 4) : C0602b.f2247e;
        }
        throw new C0603c(c0602b);
    }
}

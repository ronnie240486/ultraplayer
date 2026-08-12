package p058U;

import java.nio.ByteBuffer;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: U.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0608h extends AbstractC0605e {
    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    @Override // p058U.InterfaceC0604d
    /* JADX INFO: renamed from: f */
    public final void mo1476f(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i3 = iLimit - iPosition;
        int i4 = this.f2253b.f2250c;
        if (i4 == 3) {
            i3 *= 2;
        } else if (i4 == 4) {
            i3 /= 2;
        } else {
            if (i4 != 21) {
                if (i4 == 22) {
                    i3 /= 2;
                } else if (i4 != 268435456) {
                    if (i4 != 1342177280) {
                        if (i4 != 1610612736) {
                            throw new IllegalStateException();
                        }
                        i3 /= 2;
                    }
                }
            }
            i3 /= 3;
            i3 *= 2;
        }
        ByteBuffer byteBufferM1482l = m1482l(i3);
        int i5 = this.f2253b.f2250c;
        if (i5 == 3) {
            while (iPosition < iLimit) {
                byteBufferM1482l.put((byte) 0);
                byteBufferM1482l.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i5 == 4) {
            while (iPosition < iLimit) {
                short sM1589h = (short) (AbstractC0632A.m1589h(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferM1482l.put((byte) (sM1589h & 255));
                byteBufferM1482l.put((byte) ((sM1589h >> 8) & 255));
                iPosition += 4;
            }
        } else if (i5 == 21) {
            while (iPosition < iLimit) {
                byteBufferM1482l.put(byteBuffer.get(iPosition + 1));
                byteBufferM1482l.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i5 == 22) {
            while (iPosition < iLimit) {
                byteBufferM1482l.put(byteBuffer.get(iPosition + 2));
                byteBufferM1482l.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i5 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferM1482l.put(byteBuffer.get(iPosition + 1));
                byteBufferM1482l.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i5 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferM1482l.put(byteBuffer.get(iPosition + 1));
                byteBufferM1482l.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else {
            if (i5 != 1610612736) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferM1482l.put(byteBuffer.get(iPosition + 1));
                byteBufferM1482l.put(byteBuffer.get(iPosition));
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
        if (i3 == 3 || i3 == 2 || i3 == 268435456 || i3 == 21 || i3 == 1342177280 || i3 == 22 || i3 == 1610612736 || i3 == 4) {
            return i3 != 2 ? new C0602b(c0602b.f2248a, c0602b.f2249b, 2) : C0602b.f2247e;
        }
        throw new C0603c(c0602b);
    }
}

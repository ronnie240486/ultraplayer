package p073Z;

import java.nio.ByteBuffer;
import p055T.AbstractC0540C;
import p055T.C0583o;
import p067X.AbstractC0672d;

/* JADX INFO: renamed from: Z.f */
/* JADX INFO: loaded from: classes.dex */
public class C0771f extends AbstractC0672d {

    /* JADX INFO: renamed from: i */
    public C0583o f3142i;

    /* JADX INFO: renamed from: j */
    public final C0767b f3143j = new C0767b();

    /* JADX INFO: renamed from: k */
    public ByteBuffer f3144k;

    /* JADX INFO: renamed from: l */
    public boolean f3145l;

    /* JADX INFO: renamed from: m */
    public long f3146m;

    /* JADX INFO: renamed from: n */
    public ByteBuffer f3147n;

    /* JADX INFO: renamed from: o */
    public final int f3148o;

    static {
        AbstractC0540C.m1348a("media3.decoder");
    }

    public C0771f(int i3) {
        this.f3148o = i3;
    }

    /* JADX INFO: renamed from: e */
    public void mo1883e() {
        this.f2573h = 0;
        ByteBuffer byteBuffer = this.f3144k;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f3147n;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f3145l = false;
    }

    /* JADX INFO: renamed from: f */
    public final ByteBuffer m1884f(int i3) {
        int i4 = this.f3148o;
        if (i4 == 1) {
            return ByteBuffer.allocate(i3);
        }
        if (i4 == 2) {
            return ByteBuffer.allocateDirect(i3);
        }
        ByteBuffer byteBuffer = this.f3144k;
        throw new C0770e("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i3 + ")");
    }

    /* JADX INFO: renamed from: h */
    public final void m1885h(int i3) {
        ByteBuffer byteBuffer = this.f3144k;
        if (byteBuffer == null) {
            this.f3144k = m1884f(i3);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i4 = i3 + iPosition;
        if (iCapacity >= i4) {
            this.f3144k = byteBuffer;
            return;
        }
        ByteBuffer byteBufferM1884f = m1884f(i4);
        byteBufferM1884f.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferM1884f.put(byteBuffer);
        }
        this.f3144k = byteBufferM1884f;
    }

    /* JADX INFO: renamed from: i */
    public final void m1886i() {
        ByteBuffer byteBuffer = this.f3144k;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f3147n;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}

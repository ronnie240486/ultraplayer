package p103h0;

import java.nio.ByteBuffer;
import p064W.AbstractC0646n;
import p073Z.C0771f;

/* JADX INFO: renamed from: h0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1599h extends C0771f {

    /* JADX INFO: renamed from: p */
    public long f7245p;

    /* JADX INFO: renamed from: q */
    public int f7246q;

    /* JADX INFO: renamed from: r */
    public int f7247r;

    @Override // p073Z.C0771f
    /* JADX INFO: renamed from: e */
    public final void mo1883e() {
        super.mo1883e();
        this.f7246q = 0;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m3934j(C0771f c0771f) {
        ByteBuffer byteBuffer;
        AbstractC0646n.m1625c(!c0771f.m1787c(1073741824));
        AbstractC0646n.m1625c(!c0771f.m1787c(268435456));
        AbstractC0646n.m1625c(!c0771f.m1787c(4));
        if (m3935l()) {
            if (this.f7246q >= this.f7247r) {
                return false;
            }
            ByteBuffer byteBuffer2 = c0771f.f3144k;
            if (byteBuffer2 != null && (byteBuffer = this.f3144k) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i3 = this.f7246q;
        this.f7246q = i3 + 1;
        if (i3 == 0) {
            this.f3146m = c0771f.f3146m;
            if (c0771f.m1787c(1)) {
                this.f2573h = 1;
            }
        }
        ByteBuffer byteBuffer3 = c0771f.f3144k;
        if (byteBuffer3 != null) {
            m1885h(byteBuffer3.remaining());
            this.f3144k.put(byteBuffer3);
        }
        this.f7245p = c0771f.f3146m;
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m3935l() {
        return this.f7246q > 0;
    }
}

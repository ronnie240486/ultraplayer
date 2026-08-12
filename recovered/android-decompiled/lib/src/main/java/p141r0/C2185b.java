package p141r0;

import java.nio.ByteBuffer;
import p009D0.C0106b;
import p045P0.AbstractC0462h;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p064W.C0651s;
import p073Z.C0771f;
import p077a0.AbstractC0827g;

/* JADX INFO: renamed from: r0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2185b extends AbstractC0827g {

    /* JADX INFO: renamed from: A */
    public long f9408A;

    /* JADX INFO: renamed from: x */
    public final C0771f f9409x;

    /* JADX INFO: renamed from: y */
    public final C0651s f9410y;

    /* JADX INFO: renamed from: z */
    public InterfaceC2184a f9411z;

    public C2185b() {
        super(6);
        this.f9409x = new C0771f(1);
        this.f9410y = new C0651s();
    }

    @Override // p077a0.AbstractC0827g, p077a0.InterfaceC0822d0
    /* JADX INFO: renamed from: c */
    public final void mo1903c(int i3, Object obj) {
        if (i3 == 8) {
            this.f9411z = (InterfaceC2184a) obj;
        }
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: i */
    public final String mo2082i() {
        return "CameraMotionRenderer";
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: k */
    public final boolean mo2084k() {
        return m2083j();
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: l */
    public final boolean mo2085l() {
        return true;
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: m */
    public final void mo2086m() {
        InterfaceC2184a interfaceC2184a = this.f9411z;
        if (interfaceC2184a != null) {
            interfaceC2184a.mo1901a();
        }
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: o */
    public final void mo2088o(long j3, boolean z3) {
        this.f9408A = Long.MIN_VALUE;
        InterfaceC2184a interfaceC2184a = this.f9411z;
        if (interfaceC2184a != null) {
            interfaceC2184a.mo1901a();
        }
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: v */
    public final void mo2095v(long j3, long j4) {
        float[] fArr;
        while (!m2083j() && this.f9408A < 100000 + j3) {
            C0771f c0771f = this.f9409x;
            c0771f.mo1883e();
            C0106b c0106b = this.f3479i;
            c0106b.m526n();
            if (m2094u(c0106b, c0771f, 0) != -4 || c0771f.m1787c(4)) {
                return;
            }
            long j5 = c0771f.f3146m;
            this.f9408A = j5;
            boolean z3 = j5 < this.f3488r;
            if (this.f9411z != null && !z3) {
                c0771f.m1886i();
                ByteBuffer byteBuffer = c0771f.f3144k;
                int i3 = AbstractC0632A.f2454a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    C0651s c0651s = this.f9410y;
                    c0651s.m1663E(bArrArray, iLimit);
                    c0651s.m1665G(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i4 = 0; i4 < 3; i4++) {
                        fArr2[i4] = Float.intBitsToFloat(c0651s.m1675i());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f9411z.mo1902b(this.f9408A - this.f3487q, fArr);
                }
            }
        }
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: z */
    public final int mo2099z(C0583o c0583o) {
        return "application/x-camera-motion".equals(c0583o.f2154n) ? AbstractC0462h.m1162b(4, 0, 0, 0) : AbstractC0462h.m1162b(0, 0, 0, 0);
    }
}

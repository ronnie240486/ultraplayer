package p039N0;

import com.google.android.gms.internal.cast.C1323r;
import java.util.Arrays;
import p009D0.C0106b;
import p036M0.C0365b;
import p055T.C0583o;
import p064W.C0651s;
import p145s0.AbstractC2229b;
import p145s0.C2245r;

/* JADX INFO: renamed from: N0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0407c extends AbstractC0413i {

    /* JADX INFO: renamed from: n */
    public C2245r f1374n;

    /* JADX INFO: renamed from: o */
    public C0365b f1375o;

    @Override // p039N0.AbstractC0413i
    /* JADX INFO: renamed from: b */
    public final long mo1100b(C0651s c0651s) {
        byte[] bArr = c0651s.f2520a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i3 = (bArr[2] & 255) >> 4;
        if (i3 == 6 || i3 == 7) {
            c0651s.m1666H(4);
            c0651s.m1660B();
        }
        int iM4824s = AbstractC2229b.m4824s(i3, c0651s);
        c0651s.m1665G(0);
        return iM4824s;
    }

    @Override // p039N0.AbstractC0413i
    /* JADX INFO: renamed from: c */
    public final boolean mo1101c(C0651s c0651s, long j3, C0106b c0106b) {
        byte[] bArr = c0651s.f2520a;
        C2245r c2245r = this.f1374n;
        if (c2245r == null) {
            C2245r c2245r2 = new C2245r(bArr, 17);
            this.f1374n = c2245r2;
            c0106b.f140h = c2245r2.m4841c(Arrays.copyOfRange(bArr, 9, c0651s.f2522c), null);
            return true;
        }
        byte b3 = bArr[0];
        if ((b3 & 127) != 3) {
            if (b3 != -1) {
                return true;
            }
            C0365b c0365b = this.f1375o;
            if (c0365b != null) {
                c0365b.f1171c = j3;
                c0106b.f141i = c0365b;
            }
            ((C0583o) c0106b.f140h).getClass();
            return false;
        }
        C1323r c1323rM4825t = AbstractC2229b.m4825t(c0651s);
        C2245r c2245r3 = new C2245r(c2245r.f9645a, c2245r.f9646b, c2245r.f9647c, c2245r.f9648d, c2245r.f9649e, c2245r.f9651g, c2245r.f9652h, c2245r.f9654j, c1323rM4825t, c2245r.f9656l);
        this.f1374n = c2245r3;
        C0365b c0365b2 = new C0365b();
        c0365b2.f1173e = c2245r3;
        c0365b2.f1174f = c1323rM4825t;
        c0365b2.f1171c = -1L;
        c0365b2.f1172d = -1L;
        this.f1375o = c0365b2;
        return true;
    }

    @Override // p039N0.AbstractC0413i
    /* JADX INFO: renamed from: d */
    public final void mo1102d(boolean z3) {
        super.mo1102d(z3);
        if (z3) {
            this.f1374n = null;
            this.f1375o = null;
        }
    }
}

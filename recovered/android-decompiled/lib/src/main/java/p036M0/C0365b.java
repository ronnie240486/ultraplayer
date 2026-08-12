package p036M0;

import com.google.android.gms.internal.cast.C1323r;
import p039N0.InterfaceC0411g;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p129o0.C2061a;
import p145s0.C2237j;
import p145s0.C2244q;
import p145s0.C2245r;
import p145s0.InterfaceC2252y;

/* JADX INFO: renamed from: M0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0365b implements InterfaceC0411g {

    /* JADX INFO: renamed from: c */
    public long f1171c;

    /* JADX INFO: renamed from: d */
    public long f1172d;

    /* JADX INFO: renamed from: e */
    public Object f1173e;

    /* JADX INFO: renamed from: f */
    public Object f1174f;

    public C0365b(int i3, long j3) {
        AbstractC0646n.m1630h(((C2061a) this.f1173e) == null);
        this.f1171c = j3;
        this.f1172d = j3 + ((long) i3);
    }

    @Override // p039N0.InterfaceC0411g
    /* JADX INFO: renamed from: c */
    public long mo974c(C2237j c2237j) {
        long j3 = this.f1172d;
        if (j3 < 0) {
            return -1L;
        }
        long j4 = -(j3 + 2);
        this.f1172d = -1L;
        return j4;
    }

    @Override // p039N0.InterfaceC0411g
    /* JADX INFO: renamed from: p */
    public InterfaceC2252y mo987p() {
        AbstractC0646n.m1630h(this.f1171c != -1);
        return new C2244q(0, this.f1171c, (C2245r) this.f1173e);
    }

    @Override // p039N0.InterfaceC0411g
    /* JADX INFO: renamed from: r */
    public void mo989r(long j3) {
        long[] jArr = (long[]) ((C1323r) this.f1174f).f5961h;
        this.f1172d = jArr[AbstractC0632A.m1586e(jArr, j3, true)];
    }

    public C0365b(String str, byte[] bArr, long j3, long j4) {
        this.f1173e = str;
        this.f1174f = bArr;
        this.f1171c = j3;
        this.f1172d = j4;
    }
}

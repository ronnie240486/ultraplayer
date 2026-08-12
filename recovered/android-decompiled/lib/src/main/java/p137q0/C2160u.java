package p137q0;

import p036M0.C0368e;
import p055T.C0574f0;
import p089d1.C1447t;
import p104h1.C1656m;

/* JADX INFO: renamed from: q0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C2160u {

    /* JADX INFO: renamed from: a */
    public final C1447t f9344a;

    /* JADX INFO: renamed from: b */
    public final C2156q f9345b;

    /* JADX INFO: renamed from: c */
    public final C2155p f9346c = new C2155p();

    /* JADX INFO: renamed from: d */
    public final C0368e f9347d = new C0368e();

    /* JADX INFO: renamed from: e */
    public final C0368e f9348e = new C0368e();

    /* JADX INFO: renamed from: f */
    public final C1656m f9349f;

    /* JADX INFO: renamed from: g */
    public C0574f0 f9350g;

    /* JADX INFO: renamed from: h */
    public C0574f0 f9351h;

    /* JADX INFO: renamed from: i */
    public long f9352i;

    /* JADX INFO: renamed from: j */
    public long f9353j;

    public C2160u(C1447t c1447t, C2156q c2156q) {
        this.f9344a = c1447t;
        this.f9345b = c2156q;
        C1656m c1656m = new C1656m();
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        c1656m.f7541b = 0;
        c1656m.f7542c = 0;
        c1656m.f7540a = new long[iHighestOneBit];
        c1656m.f7543d = iHighestOneBit - 1;
        this.f9349f = c1656m;
        this.f9351h = C0574f0.f2070d;
        this.f9353j = -9223372036854775807L;
    }
}

package p071Y0;

import p064W.AbstractC0632A;
import p064W.C0651s;
import p064W.C0656x;
import p145s0.C2237j;

/* JADX INFO: renamed from: Y0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0763z {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3118a;

    /* JADX INFO: renamed from: b */
    public final C0656x f3119b;

    /* JADX INFO: renamed from: c */
    public final C0651s f3120c;

    /* JADX INFO: renamed from: d */
    public boolean f3121d;

    /* JADX INFO: renamed from: e */
    public boolean f3122e;

    /* JADX INFO: renamed from: f */
    public boolean f3123f;

    /* JADX INFO: renamed from: g */
    public long f3124g;

    /* JADX INFO: renamed from: h */
    public long f3125h;

    /* JADX INFO: renamed from: i */
    public long f3126i;

    public C0763z(int i3) {
        this.f3118a = i3;
        switch (i3) {
            case 1:
                this.f3119b = new C0656x(0L);
                this.f3124g = -9223372036854775807L;
                this.f3125h = -9223372036854775807L;
                this.f3126i = -9223372036854775807L;
                this.f3120c = new C0651s();
                break;
            default:
                this.f3119b = new C0656x(0L);
                this.f3124g = -9223372036854775807L;
                this.f3125h = -9223372036854775807L;
                this.f3126i = -9223372036854775807L;
                this.f3120c = new C0651s();
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m1880b(byte[] bArr, int i3) {
        return (bArr[i3 + 3] & 255) | ((bArr[i3] & 255) << 24) | ((bArr[i3 + 1] & 255) << 16) | ((bArr[i3 + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: c */
    public static long m1881c(C0651s c0651s) {
        int i3 = c0651s.f2521b;
        if (c0651s.m1667a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c0651s.m1671e(bArr, 0, 9);
        c0651s.m1665G(i3);
        byte b3 = bArr[0];
        if ((b3 & 196) == 68) {
            byte b4 = bArr[2];
            if ((b4 & 4) == 4) {
                byte b5 = bArr[4];
                if ((b5 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j3 = b3;
                    long j4 = b4;
                    return ((j4 & 3) << 13) | ((j3 & 3) << 28) | (((56 & j3) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j4 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b5) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: a */
    public final void m1882a(C2237j c2237j) {
        switch (this.f3118a) {
            case 0:
                byte[] bArr = AbstractC0632A.f2459f;
                C0651s c0651s = this.f3120c;
                c0651s.getClass();
                c0651s.m1663E(bArr, bArr.length);
                this.f3121d = true;
                c2237j.f9631l = 0;
                break;
            default:
                byte[] bArr2 = AbstractC0632A.f2459f;
                C0651s c0651s2 = this.f3120c;
                c0651s2.getClass();
                c0651s2.m1663E(bArr2, bArr2.length);
                this.f3121d = true;
                c2237j.f9631l = 0;
                break;
        }
    }
}

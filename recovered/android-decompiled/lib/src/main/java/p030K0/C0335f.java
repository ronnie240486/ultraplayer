package p030K0;

import p145s0.C2237j;

/* JADX INFO: renamed from: K0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0335f {

    /* JADX INFO: renamed from: d */
    public static final long[] f1064d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a */
    public final byte[] f1065a = new byte[8];

    /* JADX INFO: renamed from: b */
    public int f1066b;

    /* JADX INFO: renamed from: c */
    public int f1067c;

    /* JADX INFO: renamed from: a */
    public static long m935a(int i3, boolean z3, byte[] bArr) {
        long j3 = ((long) bArr[0]) & 255;
        if (z3) {
            j3 &= ~f1064d[i3 - 1];
        }
        for (int i4 = 1; i4 < i3; i4++) {
            j3 = (j3 << 8) | (((long) bArr[i4]) & 255);
        }
        return j3;
    }

    /* JADX INFO: renamed from: b */
    public static int m936b(int i3) {
        for (int i4 = 0; i4 < 8; i4++) {
            if ((f1064d[i4] & ((long) i3)) != 0) {
                return i4 + 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public final long m937c(C2237j c2237j, boolean z3, boolean z4, int i3) {
        int i4 = this.f1066b;
        byte[] bArr = this.f1065a;
        if (i4 == 0) {
            if (!c2237j.mo336f(bArr, 0, 1, z3)) {
                return -1L;
            }
            int iM936b = m936b(bArr[0] & 255);
            this.f1067c = iM936b;
            if (iM936b == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f1066b = 1;
        }
        int i5 = this.f1067c;
        if (i5 > i3) {
            this.f1066b = 0;
            return -2L;
        }
        if (i5 != 1) {
            c2237j.mo336f(bArr, 1, i5 - 1, false);
        }
        this.f1066b = 0;
        return m935a(this.f1067c, z4, bArr);
    }
}

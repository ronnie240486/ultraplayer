package p030K0;

import java.util.ArrayDeque;
import p000A.C0031d;
import p145s0.C2237j;

/* JADX INFO: renamed from: K0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0331b {

    /* JADX INFO: renamed from: a */
    public final byte[] f941a = new byte[8];

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f942b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public final C0335f f943c = new C0335f();

    /* JADX INFO: renamed from: d */
    public C0031d f944d;

    /* JADX INFO: renamed from: e */
    public int f945e;

    /* JADX INFO: renamed from: f */
    public int f946f;

    /* JADX INFO: renamed from: g */
    public long f947g;

    /* JADX INFO: renamed from: a */
    public final long m910a(C2237j c2237j, int i3) {
        byte[] bArr = this.f941a;
        c2237j.mo336f(bArr, 0, i3, false);
        long j3 = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            j3 = (j3 << 8) | ((long) (bArr[i4] & 255));
        }
        return j3;
    }
}

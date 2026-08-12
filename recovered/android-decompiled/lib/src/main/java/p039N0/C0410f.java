package p039N0;

import java.io.EOFException;
import java.io.InterruptedIOException;
import p055T.C0546I;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p145s0.C2237j;

/* JADX INFO: renamed from: N0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0410f {

    /* JADX INFO: renamed from: a */
    public int f1384a;

    /* JADX INFO: renamed from: b */
    public long f1385b;

    /* JADX INFO: renamed from: c */
    public int f1386c;

    /* JADX INFO: renamed from: d */
    public int f1387d;

    /* JADX INFO: renamed from: e */
    public int f1388e;

    /* JADX INFO: renamed from: f */
    public final int[] f1389f = new int[255];

    /* JADX INFO: renamed from: g */
    public final C0651s f1390g = new C0651s(255);

    /* JADX INFO: renamed from: a */
    public final boolean m1106a(C2237j c2237j, boolean z3) throws EOFException, C0546I {
        boolean zMo338i;
        boolean zMo338i2;
        this.f1384a = 0;
        this.f1385b = 0L;
        this.f1386c = 0;
        this.f1387d = 0;
        this.f1388e = 0;
        C0651s c0651s = this.f1390g;
        c0651s.m1662D(27);
        try {
            zMo338i = c2237j.mo338i(c0651s.f2520a, 0, 27, z3);
        } catch (EOFException e3) {
            if (!z3) {
                throw e3;
            }
            zMo338i = false;
        }
        if (zMo338i && c0651s.m1689w() == 1332176723) {
            if (c0651s.m1687u() == 0) {
                this.f1384a = c0651s.m1687u();
                this.f1385b = c0651s.m1676j();
                c0651s.m1678l();
                c0651s.m1678l();
                c0651s.m1678l();
                int iM1687u = c0651s.m1687u();
                this.f1386c = iM1687u;
                this.f1387d = iM1687u + 27;
                c0651s.m1662D(iM1687u);
                try {
                    zMo338i2 = c2237j.mo338i(c0651s.f2520a, 0, this.f1386c, z3);
                } catch (EOFException e4) {
                    if (!z3) {
                        throw e4;
                    }
                    zMo338i2 = false;
                }
                if (zMo338i2) {
                    for (int i3 = 0; i3 < this.f1386c; i3++) {
                        int iM1687u2 = c0651s.m1687u();
                        this.f1389f[i3] = iM1687u2;
                        this.f1388e += iM1687u2;
                    }
                    return true;
                }
            } else if (!z3) {
                throw C0546I.m1367c("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1107b(C2237j c2237j, long j3) throws EOFException, InterruptedIOException {
        boolean zMo338i;
        int iMin;
        AbstractC0646n.m1625c(c2237j.f9629j == c2237j.mo339j());
        C0651s c0651s = this.f1390g;
        c0651s.m1662D(4);
        while (true) {
            if (j3 != -1 && c2237j.f9629j + 4 >= j3) {
                break;
            }
            try {
                zMo338i = c2237j.mo338i(c0651s.f2520a, 0, 4, true);
            } catch (EOFException unused) {
                zMo338i = false;
            }
            if (!zMo338i) {
                break;
            }
            c0651s.m1665G(0);
            if (c0651s.m1689w() == 1332176723) {
                c2237j.f9631l = 0;
                return true;
            }
            c2237j.mo335d(1);
        }
        do {
            if (j3 != -1 && c2237j.f9629j >= j3) {
                break;
            }
            iMin = Math.min(c2237j.f9632m, 1);
            c2237j.m4835s(iMin);
            if (iMin == 0) {
                byte[] bArr = c2237j.f9626g;
                iMin = c2237j.m4834p(bArr, 0, Math.min(1, bArr.length), 0, true);
            }
            if (iMin != -1) {
                c2237j.f9629j += (long) iMin;
            }
        } while (iMin != -1);
        return false;
    }
}

package p114k0;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p009D0.C0106b;
import p036M0.C0365b;
import p064W.AbstractC0632A;
import p064W.C0651s;
import p073Z.C0767b;
import p073Z.C0771f;
import p099g0.C1577g;
import p129o0.C2061a;
import p129o0.C2065e;
import p145s0.C2225D;

/* JADX INFO: renamed from: k0.V */
/* JADX INFO: loaded from: classes.dex */
public final class C1927V {

    /* JADX INFO: renamed from: a */
    public final C2065e f8433a;

    /* JADX INFO: renamed from: b */
    public final int f8434b;

    /* JADX INFO: renamed from: c */
    public final C0651s f8435c;

    /* JADX INFO: renamed from: d */
    public C0365b f8436d;

    /* JADX INFO: renamed from: e */
    public C0365b f8437e;

    /* JADX INFO: renamed from: f */
    public C0365b f8438f;

    /* JADX INFO: renamed from: g */
    public long f8439g;

    public C1927V(C2065e c2065e) {
        this.f8433a = c2065e;
        int i3 = c2065e.f8965b;
        this.f8434b = i3;
        this.f8435c = new C0651s(32);
        C0365b c0365b = new C0365b(i3, 0L);
        this.f8436d = c0365b;
        this.f8437e = c0365b;
        this.f8438f = c0365b;
    }

    /* JADX INFO: renamed from: d */
    public static C0365b m4455d(C0365b c0365b, long j3, ByteBuffer byteBuffer, int i3) {
        while (j3 >= c0365b.f1172d) {
            c0365b = (C0365b) c0365b.f1174f;
        }
        while (i3 > 0) {
            int iMin = Math.min(i3, (int) (c0365b.f1172d - j3));
            C2061a c2061a = (C2061a) c0365b.f1173e;
            byteBuffer.put(c2061a.f8955a, ((int) (j3 - c0365b.f1171c)) + c2061a.f8956b, iMin);
            i3 -= iMin;
            j3 += (long) iMin;
            if (j3 == c0365b.f1172d) {
                c0365b = (C0365b) c0365b.f1174f;
            }
        }
        return c0365b;
    }

    /* JADX INFO: renamed from: e */
    public static C0365b m4456e(C0365b c0365b, long j3, byte[] bArr, int i3) {
        while (j3 >= c0365b.f1172d) {
            c0365b = (C0365b) c0365b.f1174f;
        }
        int i4 = i3;
        while (i4 > 0) {
            int iMin = Math.min(i4, (int) (c0365b.f1172d - j3));
            C2061a c2061a = (C2061a) c0365b.f1173e;
            System.arraycopy(c2061a.f8955a, ((int) (j3 - c0365b.f1171c)) + c2061a.f8956b, bArr, i3 - i4, iMin);
            i4 -= iMin;
            j3 += (long) iMin;
            if (j3 == c0365b.f1172d) {
                c0365b = (C0365b) c0365b.f1174f;
            }
        }
        return c0365b;
    }

    /* JADX INFO: renamed from: f */
    public static C0365b m4457f(C0365b c0365b, C0771f c0771f, C1577g c1577g, C0651s c0651s) {
        int iM1659A;
        if (c0771f.m1787c(1073741824)) {
            long j3 = c1577g.f7163b;
            c0651s.m1662D(1);
            C0365b c0365bM4456e = m4456e(c0365b, j3, c0651s.f2520a, 1);
            long j4 = j3 + 1;
            byte b3 = c0651s.f2520a[0];
            boolean z3 = (b3 & 128) != 0;
            int i3 = b3 & 127;
            C0767b c0767b = c0771f.f3143j;
            byte[] bArr = c0767b.f3132a;
            if (bArr == null) {
                c0767b.f3132a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            c0365b = m4456e(c0365bM4456e, j4, c0767b.f3132a, i3);
            long j5 = j4 + ((long) i3);
            if (z3) {
                c0651s.m1662D(2);
                c0365b = m4456e(c0365b, j5, c0651s.f2520a, 2);
                j5 += 2;
                iM1659A = c0651s.m1659A();
            } else {
                iM1659A = 1;
            }
            int[] iArr = c0767b.f3135d;
            if (iArr == null || iArr.length < iM1659A) {
                iArr = new int[iM1659A];
            }
            int[] iArr2 = c0767b.f3136e;
            if (iArr2 == null || iArr2.length < iM1659A) {
                iArr2 = new int[iM1659A];
            }
            if (z3) {
                int i4 = iM1659A * 6;
                c0651s.m1662D(i4);
                c0365b = m4456e(c0365b, j5, c0651s.f2520a, i4);
                j5 += (long) i4;
                c0651s.m1665G(0);
                for (int i5 = 0; i5 < iM1659A; i5++) {
                    iArr[i5] = c0651s.m1659A();
                    iArr2[i5] = c0651s.m1691y();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = c1577g.f7162a - ((int) (j5 - c1577g.f7163b));
            }
            C2225D c2225d = (C2225D) c1577g.f7164c;
            int i6 = AbstractC0632A.f2454a;
            byte[] bArr2 = c2225d.f9552b;
            byte[] bArr3 = c0767b.f3132a;
            c0767b.f3137f = iM1659A;
            c0767b.f3135d = iArr;
            c0767b.f3136e = iArr2;
            c0767b.f3133b = bArr2;
            c0767b.f3132a = bArr3;
            int i7 = c2225d.f9551a;
            c0767b.f3134c = i7;
            int i8 = c2225d.f9553c;
            c0767b.f3138g = i8;
            int i9 = c2225d.f9554d;
            c0767b.f3139h = i9;
            MediaCodec.CryptoInfo cryptoInfo = c0767b.f3140i;
            cryptoInfo.numSubSamples = iM1659A;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i7;
            if (AbstractC0632A.f2454a >= 24) {
                C0106b c0106b = c0767b.f3141j;
                c0106b.getClass();
                ((MediaCodec.CryptoInfo.Pattern) c0106b.f141i).set(i8, i9);
                ((MediaCodec.CryptoInfo) c0106b.f140h).setPattern((MediaCodec.CryptoInfo.Pattern) c0106b.f141i);
            }
            long j6 = c1577g.f7163b;
            int i10 = (int) (j5 - j6);
            c1577g.f7163b = j6 + ((long) i10);
            c1577g.f7162a -= i10;
        }
        if (!c0771f.m1787c(268435456)) {
            c0771f.m1885h(c1577g.f7162a);
            return m4455d(c0365b, c1577g.f7163b, c0771f.f3144k, c1577g.f7162a);
        }
        c0651s.m1662D(4);
        C0365b c0365bM4456e2 = m4456e(c0365b, c1577g.f7163b, c0651s.f2520a, 4);
        int iM1691y = c0651s.m1691y();
        c1577g.f7163b += 4;
        c1577g.f7162a -= 4;
        c0771f.m1885h(iM1691y);
        C0365b c0365bM4455d = m4455d(c0365bM4456e2, c1577g.f7163b, c0771f.f3144k, iM1691y);
        c1577g.f7163b += (long) iM1691y;
        int i11 = c1577g.f7162a - iM1691y;
        c1577g.f7162a = i11;
        ByteBuffer byteBuffer = c0771f.f3147n;
        if (byteBuffer == null || byteBuffer.capacity() < i11) {
            c0771f.f3147n = ByteBuffer.allocate(i11);
        } else {
            c0771f.f3147n.clear();
        }
        return m4455d(c0365bM4455d, c1577g.f7163b, c0771f.f3147n, c1577g.f7162a);
    }

    /* JADX INFO: renamed from: a */
    public final void m4458a(C0365b c0365b) {
        if (((C2061a) c0365b.f1173e) == null) {
            return;
        }
        C2065e c2065e = this.f8433a;
        synchronized (c2065e) {
            C0365b c0365b2 = c0365b;
            while (c0365b2 != null) {
                try {
                    C2061a[] c2061aArr = c2065e.f8969f;
                    int i3 = c2065e.f8968e;
                    c2065e.f8968e = i3 + 1;
                    C2061a c2061a = (C2061a) c0365b2.f1173e;
                    c2061a.getClass();
                    c2061aArr[i3] = c2061a;
                    c2065e.f8967d--;
                    c0365b2 = (C0365b) c0365b2.f1174f;
                    if (c0365b2 == null || ((C2061a) c0365b2.f1173e) == null) {
                        c0365b2 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c2065e.notifyAll();
        }
        c0365b.f1173e = null;
        c0365b.f1174f = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m4459b(long j3) {
        C0365b c0365b;
        if (j3 == -1) {
            return;
        }
        while (true) {
            c0365b = this.f8436d;
            if (j3 < c0365b.f1172d) {
                break;
            }
            C2065e c2065e = this.f8433a;
            C2061a c2061a = (C2061a) c0365b.f1173e;
            synchronized (c2065e) {
                C2061a[] c2061aArr = c2065e.f8969f;
                int i3 = c2065e.f8968e;
                c2065e.f8968e = i3 + 1;
                c2061aArr[i3] = c2061a;
                c2065e.f8967d--;
                c2065e.notifyAll();
            }
            C0365b c0365b2 = this.f8436d;
            c0365b2.f1173e = null;
            C0365b c0365b3 = (C0365b) c0365b2.f1174f;
            c0365b2.f1174f = null;
            this.f8436d = c0365b3;
        }
        if (this.f8437e.f1171c < c0365b.f1171c) {
            this.f8437e = c0365b;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m4460c(int i3) {
        C2061a c2061a;
        C0365b c0365b = this.f8438f;
        if (((C2061a) c0365b.f1173e) == null) {
            C2065e c2065e = this.f8433a;
            synchronized (c2065e) {
                try {
                    int i4 = c2065e.f8967d + 1;
                    c2065e.f8967d = i4;
                    int i5 = c2065e.f8968e;
                    if (i5 > 0) {
                        C2061a[] c2061aArr = c2065e.f8969f;
                        int i6 = i5 - 1;
                        c2065e.f8968e = i6;
                        c2061a = c2061aArr[i6];
                        c2061a.getClass();
                        c2065e.f8969f[c2065e.f8968e] = null;
                    } else {
                        C2061a c2061a2 = new C2061a(new byte[c2065e.f8965b], 0);
                        C2061a[] c2061aArr2 = c2065e.f8969f;
                        if (i4 > c2061aArr2.length) {
                            c2065e.f8969f = (C2061a[]) Arrays.copyOf(c2061aArr2, c2061aArr2.length * 2);
                        }
                        c2061a = c2061a2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            C0365b c0365b2 = new C0365b(this.f8434b, this.f8438f.f1172d);
            c0365b.f1173e = c2061a;
            c0365b.f1174f = c0365b2;
        }
        return Math.min(i3, (int) (this.f8438f.f1172d - this.f8439g));
    }
}

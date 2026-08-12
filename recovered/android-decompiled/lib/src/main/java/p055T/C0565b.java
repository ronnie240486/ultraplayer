package p055T;

import java.util.Arrays;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: T.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0565b {

    /* JADX INFO: renamed from: c */
    public static final C0565b f2043c = new C0565b(new C0563a[0]);

    /* JADX INFO: renamed from: d */
    public static final C0563a f2044d;

    /* JADX INFO: renamed from: a */
    public final int f2045a;

    /* JADX INFO: renamed from: b */
    public final C0563a[] f2046b;

    static {
        C0563a c0563a = new C0563a(-1, -1, new int[0], new C0539B[0], new long[0]);
        int[] iArr = c0563a.f2022e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = c0563a.f2023f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        f2044d = new C0563a(0, c0563a.f2019b, iArrCopyOf, (C0539B[]) Arrays.copyOf(c0563a.f2021d, 0), jArrCopyOf);
        AbstractC0632A.m1566G(1);
        AbstractC0632A.m1566G(2);
        AbstractC0632A.m1566G(3);
        AbstractC0632A.m1566G(4);
    }

    public C0565b(C0563a[] c0563aArr) {
        this.f2045a = c0563aArr.length;
        this.f2046b = c0563aArr;
    }

    /* JADX INFO: renamed from: a */
    public final C0563a m1430a(int i3) {
        return i3 < 0 ? f2044d : this.f2046b[i3];
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1431b(int i3) {
        if (i3 != this.f2045a - 1) {
            return false;
        }
        m1430a(i3).getClass();
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0565b.class != obj.getClass()) {
            return false;
        }
        C0565b c0565b = (C0565b) obj;
        int i3 = AbstractC0632A.f2454a;
        return this.f2045a == c0565b.f2045a && Arrays.equals(this.f2046b, c0565b.f2046b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2046b) + (((((this.f2045a * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i3 = 0;
        while (true) {
            C0563a[] c0563aArr = this.f2046b;
            if (i3 >= c0563aArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=0, ads=[");
            c0563aArr[i3].getClass();
            for (int i4 = 0; i4 < c0563aArr[i3].f2022e.length; i4++) {
                sb.append("ad(state=");
                int i5 = c0563aArr[i3].f2022e[i4];
                if (i5 == 0) {
                    sb.append('_');
                } else if (i5 == 1) {
                    sb.append('R');
                } else if (i5 == 2) {
                    sb.append('S');
                } else if (i5 == 3) {
                    sb.append('P');
                } else if (i5 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(c0563aArr[i3].f2023f[i4]);
                sb.append(')');
                if (i4 < c0563aArr[i3].f2022e.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i3 < c0563aArr.length - 1) {
                sb.append(", ");
            }
            i3++;
        }
    }
}

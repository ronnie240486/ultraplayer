package p055T;

import java.util.Arrays;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: T.W */
/* JADX INFO: loaded from: classes.dex */
public final class C0559W {

    /* JADX INFO: renamed from: a */
    public final int f1992a;

    /* JADX INFO: renamed from: b */
    public final String f1993b;

    /* JADX INFO: renamed from: c */
    public final int f1994c;

    /* JADX INFO: renamed from: d */
    public final C0583o[] f1995d;

    /* JADX INFO: renamed from: e */
    public int f1996e;

    static {
        AbstractC0632A.m1566G(0);
        AbstractC0632A.m1566G(1);
    }

    public C0559W(String str, C0583o... c0583oArr) {
        AbstractC0646n.m1625c(c0583oArr.length > 0);
        this.f1993b = str;
        this.f1995d = c0583oArr;
        this.f1992a = c0583oArr.length;
        int iM1359g = AbstractC0545H.m1359g(c0583oArr[0].f2154n);
        this.f1994c = iM1359g == -1 ? AbstractC0545H.m1359g(c0583oArr[0].f2153m) : iM1359g;
        String str2 = c0583oArr[0].f2144d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i3 = c0583oArr[0].f2146f | 16384;
        for (int i4 = 1; i4 < c0583oArr.length; i4++) {
            String str3 = c0583oArr[i4].f2144d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                m1416b("languages", c0583oArr[0].f2144d, c0583oArr[i4].f2144d, i4);
                return;
            } else {
                if (i3 != (c0583oArr[i4].f2146f | 16384)) {
                    m1416b("role flags", Integer.toBinaryString(c0583oArr[0].f2146f), Integer.toBinaryString(c0583oArr[i4].f2146f), i4);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1416b(String str, String str2, String str3, int i3) {
        AbstractC0646n.m1636n("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i3 + ")"));
    }

    /* JADX INFO: renamed from: a */
    public final int m1417a(C0583o c0583o) {
        int i3 = 0;
        while (true) {
            C0583o[] c0583oArr = this.f1995d;
            if (i3 >= c0583oArr.length) {
                return -1;
            }
            if (c0583o == c0583oArr[i3]) {
                return i3;
            }
            i3++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0559W.class == obj.getClass()) {
            C0559W c0559w = (C0559W) obj;
            if (this.f1993b.equals(c0559w.f1993b) && Arrays.equals(this.f1995d, c0559w.f1995d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f1996e == 0) {
            this.f1996e = Arrays.hashCode(this.f1995d) + ((this.f1993b.hashCode() + 527) * 31);
        }
        return this.f1996e;
    }
}

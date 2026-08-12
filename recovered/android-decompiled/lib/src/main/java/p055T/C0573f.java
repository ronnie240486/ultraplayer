package p055T;

import java.util.Arrays;
import p045P0.AbstractC0462h;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: T.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0573f {

    /* JADX INFO: renamed from: h */
    public static final C0573f f2062h = new C0573f(1, 2, 3, -1, -1, null);

    /* JADX INFO: renamed from: a */
    public final int f2063a;

    /* JADX INFO: renamed from: b */
    public final int f2064b;

    /* JADX INFO: renamed from: c */
    public final int f2065c;

    /* JADX INFO: renamed from: d */
    public final byte[] f2066d;

    /* JADX INFO: renamed from: e */
    public final int f2067e;

    /* JADX INFO: renamed from: f */
    public final int f2068f;

    /* JADX INFO: renamed from: g */
    public int f2069g;

    static {
        AbstractC0462h.m1167g(0, 1, 2, 3, 4);
        AbstractC0632A.m1566G(5);
    }

    public C0573f(int i3, int i4, int i5, int i6, int i7, byte[] bArr) {
        this.f2063a = i3;
        this.f2064b = i4;
        this.f2065c = i5;
        this.f2066d = bArr;
        this.f2067e = i6;
        this.f2068f = i7;
    }

    /* JADX INFO: renamed from: a */
    public static String m1435a(int i3) {
        if (i3 == -1) {
            return "Unset color range";
        }
        if (i3 != 1) {
            return i3 != 2 ? AbstractC0462h.m1165e(i3, "Undefined color range ") : "Limited range";
        }
        return "Full range";
    }

    /* JADX INFO: renamed from: b */
    public static String m1436b(int i3) {
        if (i3 == -1) {
            return "Unset color space";
        }
        if (i3 == 6) {
            return "BT2020";
        }
        if (i3 != 1) {
            return i3 != 2 ? AbstractC0462h.m1165e(i3, "Undefined color space ") : "BT601";
        }
        return "BT709";
    }

    /* JADX INFO: renamed from: c */
    public static String m1437c(int i3) {
        if (i3 == -1) {
            return "Unset color transfer";
        }
        if (i3 == 10) {
            return "Gamma 2.2";
        }
        if (i3 == 1) {
            return "Linear";
        }
        if (i3 == 2) {
            return "sRGB";
        }
        if (i3 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i3 != 6) {
            return i3 != 7 ? AbstractC0462h.m1165e(i3, "Undefined color transfer ") : "HLG";
        }
        return "ST2084 PQ";
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1438e(C0573f c0573f) {
        if (c0573f == null) {
            return true;
        }
        int i3 = c0573f.f2063a;
        if (i3 != -1 && i3 != 1 && i3 != 2) {
            return false;
        }
        int i4 = c0573f.f2064b;
        if (i4 != -1 && i4 != 2) {
            return false;
        }
        int i5 = c0573f.f2065c;
        if ((i5 != -1 && i5 != 3) || c0573f.f2066d != null) {
            return false;
        }
        int i6 = c0573f.f2068f;
        if (i6 != -1 && i6 != 8) {
            return false;
        }
        int i7 = c0573f.f2067e;
        return i7 == -1 || i7 == 8;
    }

    /* JADX INFO: renamed from: f */
    public static int m1439f(int i3) {
        if (i3 == 1) {
            return 1;
        }
        if (i3 != 9) {
            return (i3 == 4 || i3 == 5 || i3 == 6 || i3 == 7) ? 2 : -1;
        }
        return 6;
    }

    /* JADX INFO: renamed from: g */
    public static int m1440g(int i3) {
        if (i3 == 1) {
            return 3;
        }
        if (i3 == 4) {
            return 10;
        }
        if (i3 == 13) {
            return 2;
        }
        if (i3 == 16) {
            return 6;
        }
        if (i3 != 18) {
            return (i3 == 6 || i3 == 7) ? 3 : -1;
        }
        return 7;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1441d() {
        return (this.f2063a == -1 || this.f2064b == -1 || this.f2065c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0573f.class == obj.getClass()) {
            C0573f c0573f = (C0573f) obj;
            if (this.f2063a == c0573f.f2063a && this.f2064b == c0573f.f2064b && this.f2065c == c0573f.f2065c && Arrays.equals(this.f2066d, c0573f.f2066d) && this.f2067e == c0573f.f2067e && this.f2068f == c0573f.f2068f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f2069g == 0) {
            this.f2069g = ((((Arrays.hashCode(this.f2066d) + ((((((527 + this.f2063a) * 31) + this.f2064b) * 31) + this.f2065c) * 31)) * 31) + this.f2067e) * 31) + this.f2068f;
        }
        return this.f2069g;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(m1436b(this.f2063a));
        sb.append(", ");
        sb.append(m1435a(this.f2064b));
        sb.append(", ");
        sb.append(m1437c(this.f2065c));
        sb.append(", ");
        sb.append(this.f2066d != null);
        sb.append(", ");
        String str2 = "NA";
        int i3 = this.f2067e;
        if (i3 != -1) {
            str = i3 + "bit Luma";
        } else {
            str = "NA";
        }
        sb.append(str);
        sb.append(", ");
        int i4 = this.f2068f;
        if (i4 != -1) {
            str2 = i4 + "bit Chroma";
        }
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}

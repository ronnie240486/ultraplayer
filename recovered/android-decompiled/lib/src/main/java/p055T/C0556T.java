package p055T;

import java.util.Objects;
import p045P0.AbstractC0462h;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: T.T */
/* JADX INFO: loaded from: classes.dex */
public final class C0556T {

    /* JADX INFO: renamed from: a */
    public Integer f1966a;

    /* JADX INFO: renamed from: b */
    public Object f1967b;

    /* JADX INFO: renamed from: c */
    public int f1968c;

    /* JADX INFO: renamed from: d */
    public long f1969d;

    /* JADX INFO: renamed from: e */
    public long f1970e;

    /* JADX INFO: renamed from: f */
    public boolean f1971f;

    /* JADX INFO: renamed from: g */
    public C0565b f1972g = C0565b.f2043c;

    static {
        AbstractC0462h.m1167g(0, 1, 2, 3, 4);
    }

    /* JADX INFO: renamed from: a */
    public final long m1396a(int i3, int i4) {
        C0563a c0563aM1430a = this.f1972g.m1430a(i3);
        if (c0563aM1430a.f2018a != -1) {
            return c0563aM1430a.f2023f[i4];
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: b */
    public final int m1397b(long j3) {
        int i3;
        C0563a c0563aM1430a;
        int i4;
        C0565b c0565b = this.f1972g;
        long j4 = this.f1969d;
        c0565b.getClass();
        if (j3 != Long.MIN_VALUE && (j4 == -9223372036854775807L || j3 < j4)) {
            int i5 = 0;
            while (true) {
                i3 = c0565b.f2045a;
                if (i5 >= i3) {
                    break;
                }
                c0565b.m1430a(i5).getClass();
                c0565b.m1430a(i5).getClass();
                if (0 > j3 && ((i4 = (c0563aM1430a = c0565b.m1430a(i5)).f2018a) == -1 || c0563aM1430a.m1428a(-1) < i4)) {
                    break;
                }
                i5++;
            }
            if (i5 < i3) {
                return i5;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public final int m1398c(long j3) {
        C0565b c0565b = this.f1972g;
        int i3 = c0565b.f2045a - 1;
        c0565b.m1431b(i3);
        while (i3 >= 0 && j3 != Long.MIN_VALUE) {
            c0565b.m1430a(i3).getClass();
            if (j3 >= 0) {
                break;
            }
            i3--;
        }
        if (i3 >= 0) {
            C0563a c0563aM1430a = c0565b.m1430a(i3);
            int i4 = c0563aM1430a.f2018a;
            if (i4 != -1) {
                for (int i5 = 0; i5 < i4; i5++) {
                    int i6 = c0563aM1430a.f2022e[i5];
                    if (i6 != 0 && i6 != 1) {
                    }
                }
            }
            return i3;
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public final long m1399d(int i3) {
        this.f1972g.m1430a(i3).getClass();
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    public final int m1400e(int i3) {
        return this.f1972g.m1430a(i3).m1428a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C0556T.class.equals(obj.getClass())) {
            return false;
        }
        C0556T c0556t = (C0556T) obj;
        Integer num = this.f1966a;
        Integer num2 = c0556t.f1966a;
        int i3 = AbstractC0632A.f2454a;
        return Objects.equals(num, num2) && Objects.equals(this.f1967b, c0556t.f1967b) && this.f1968c == c0556t.f1968c && this.f1969d == c0556t.f1969d && this.f1970e == c0556t.f1970e && this.f1971f == c0556t.f1971f && Objects.equals(this.f1972g, c0556t.f1972g);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1401f(int i3) {
        C0565b c0565b = this.f1972g;
        if (i3 != c0565b.f2045a - 1) {
            return false;
        }
        c0565b.m1431b(i3);
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m1402g(int i3) {
        this.f1972g.m1430a(i3).getClass();
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final void m1403h(Integer num, Object obj, int i3, long j3, long j4, C0565b c0565b, boolean z3) {
        this.f1966a = num;
        this.f1967b = obj;
        this.f1968c = i3;
        this.f1969d = j3;
        this.f1970e = j4;
        this.f1972g = c0565b;
        this.f1971f = z3;
    }

    public final int hashCode() {
        Integer num = this.f1966a;
        int iHashCode = (217 + (num == null ? 0 : num.hashCode())) * 31;
        Object obj = this.f1967b;
        int iHashCode2 = (((iHashCode + (obj != null ? obj.hashCode() : 0)) * 31) + this.f1968c) * 31;
        long j3 = this.f1969d;
        int i3 = (iHashCode2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f1970e;
        return this.f1972g.hashCode() + ((((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.f1971f ? 1 : 0)) * 31);
    }
}

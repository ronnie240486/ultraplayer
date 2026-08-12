package p055T;

import android.net.Uri;
import java.util.Arrays;
import p045P0.AbstractC0462h;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: T.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0563a {

    /* JADX INFO: renamed from: a */
    public final int f2018a;

    /* JADX INFO: renamed from: b */
    public final int f2019b;

    /* JADX INFO: renamed from: c */
    public final Uri[] f2020c;

    /* JADX INFO: renamed from: d */
    public final C0539B[] f2021d;

    /* JADX INFO: renamed from: e */
    public final int[] f2022e;

    /* JADX INFO: renamed from: f */
    public final long[] f2023f;

    static {
        AbstractC0462h.m1167g(0, 1, 2, 3, 4);
        AbstractC0632A.m1566G(5);
        AbstractC0632A.m1566G(6);
        AbstractC0632A.m1566G(7);
        AbstractC0632A.m1566G(8);
    }

    public C0563a(int i3, int i4, int[] iArr, C0539B[] c0539bArr, long[] jArr) {
        Uri uri;
        int i5 = 0;
        AbstractC0646n.m1625c(iArr.length == c0539bArr.length);
        this.f2018a = i3;
        this.f2019b = i4;
        this.f2022e = iArr;
        this.f2021d = c0539bArr;
        this.f2023f = jArr;
        this.f2020c = new Uri[c0539bArr.length];
        while (true) {
            Uri[] uriArr = this.f2020c;
            if (i5 >= uriArr.length) {
                return;
            }
            C0539B c0539b = c0539bArr[i5];
            if (c0539b == null) {
                uri = null;
            } else {
                C0593y c0593y = c0539b.f1875b;
                c0593y.getClass();
                uri = c0593y.f2199a;
            }
            uriArr[i5] = uri;
            i5++;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m1428a(int i3) {
        int i4;
        int i5 = i3 + 1;
        while (true) {
            int[] iArr = this.f2022e;
            if (i5 >= iArr.length || (i4 = iArr[i5]) == 0 || i4 == 1) {
                break;
            }
            i5++;
        }
        return i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0563a.class != obj.getClass()) {
            return false;
        }
        C0563a c0563a = (C0563a) obj;
        return this.f2018a == c0563a.f2018a && this.f2019b == c0563a.f2019b && Arrays.equals(this.f2021d, c0563a.f2021d) && Arrays.equals(this.f2022e, c0563a.f2022e) && Arrays.equals(this.f2023f, c0563a.f2023f);
    }

    public final int hashCode() {
        int i3 = (int) 0;
        return (((Arrays.hashCode(this.f2023f) + ((Arrays.hashCode(this.f2022e) + ((Arrays.hashCode(this.f2021d) + (((((this.f2018a * 31) + this.f2019b) * 31) + i3) * 31)) * 31)) * 31)) * 31) + i3) * 31;
    }
}

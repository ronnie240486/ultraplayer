package p055T;

import java.util.Arrays;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: T.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0566b0 {

    /* JADX INFO: renamed from: a */
    public final int f2047a;

    /* JADX INFO: renamed from: b */
    public final C0559W f2048b;

    /* JADX INFO: renamed from: c */
    public final boolean f2049c;

    /* JADX INFO: renamed from: d */
    public final int[] f2050d;

    /* JADX INFO: renamed from: e */
    public final boolean[] f2051e;

    static {
        AbstractC0632A.m1566G(0);
        AbstractC0632A.m1566G(1);
        AbstractC0632A.m1566G(3);
        AbstractC0632A.m1566G(4);
    }

    public C0566b0(C0559W c0559w, boolean z3, int[] iArr, boolean[] zArr) {
        int i3 = c0559w.f1992a;
        this.f2047a = i3;
        boolean z4 = false;
        AbstractC0646n.m1625c(i3 == iArr.length && i3 == zArr.length);
        this.f2048b = c0559w;
        if (z3 && i3 > 1) {
            z4 = true;
        }
        this.f2049c = z4;
        this.f2050d = (int[]) iArr.clone();
        this.f2051e = (boolean[]) zArr.clone();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1432a(int i3) {
        return this.f2050d[i3] == 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0566b0.class == obj.getClass()) {
            C0566b0 c0566b0 = (C0566b0) obj;
            if (this.f2049c == c0566b0.f2049c && this.f2048b.equals(c0566b0.f2048b) && Arrays.equals(this.f2050d, c0566b0.f2050d) && Arrays.equals(this.f2051e, c0566b0.f2051e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2051e) + ((Arrays.hashCode(this.f2050d) + (((this.f2048b.hashCode() * 31) + (this.f2049c ? 1 : 0)) * 31)) * 31);
    }
}

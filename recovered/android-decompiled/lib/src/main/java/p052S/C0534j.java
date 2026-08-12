package p052S;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.Arrays;
import p055T.AbstractC0558V;
import p055T.C0539B;
import p055T.C0556T;
import p055T.C0557U;
import p055T.C0565b;

/* JADX INFO: renamed from: S.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0534j extends AbstractC0558V {

    /* JADX INFO: renamed from: h */
    public static final C0534j f1851h = new C0534j(new int[0], new SparseArray());

    /* JADX INFO: renamed from: b */
    public final SparseIntArray f1852b;

    /* JADX INFO: renamed from: c */
    public final C0539B[] f1853c;

    /* JADX INFO: renamed from: d */
    public final int[] f1854d;

    /* JADX INFO: renamed from: e */
    public final long[] f1855e;

    /* JADX INFO: renamed from: f */
    public final long[] f1856f;

    /* JADX INFO: renamed from: g */
    public final boolean[] f1857g;

    public C0534j(int[] iArr, SparseArray sparseArray) {
        int length = iArr.length;
        this.f1852b = new SparseIntArray(length);
        this.f1854d = Arrays.copyOf(iArr, length);
        this.f1855e = new long[length];
        this.f1856f = new long[length];
        this.f1857g = new boolean[length];
        this.f1853c = new C0539B[length];
        int i3 = 0;
        while (true) {
            int[] iArr2 = this.f1854d;
            if (i3 >= iArr2.length) {
                return;
            }
            int i4 = iArr2[i3];
            this.f1852b.put(i4, i3);
            C0533i c0533i = (C0533i) sparseArray.get(i4, C0533i.f1845f);
            this.f1853c[i3] = c0533i.f1849d;
            this.f1855e[i3] = c0533i.f1846a;
            long[] jArr = this.f1856f;
            long j3 = c0533i.f1847b;
            if (j3 == -9223372036854775807L) {
                j3 = 0;
            }
            jArr[i3] = j3;
            this.f1857g[i3] = c0533i.f1848c;
            i3++;
        }
    }

    @Override // p055T.AbstractC0558V
    /* JADX INFO: renamed from: b */
    public final int mo1328b(Object obj) {
        if (obj instanceof Integer) {
            return this.f1852b.get(((Integer) obj).intValue(), -1);
        }
        return -1;
    }

    @Override // p055T.AbstractC0558V
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0534j)) {
            return false;
        }
        C0534j c0534j = (C0534j) obj;
        return Arrays.equals(this.f1854d, c0534j.f1854d) && Arrays.equals(this.f1855e, c0534j.f1855e) && Arrays.equals(this.f1856f, c0534j.f1856f) && Arrays.equals(this.f1857g, c0534j.f1857g);
    }

    @Override // p055T.AbstractC0558V
    /* JADX INFO: renamed from: f */
    public final C0556T mo1329f(int i3, C0556T c0556t, boolean z3) {
        int i4 = this.f1854d[i3];
        Integer numValueOf = Integer.valueOf(i4);
        Integer numValueOf2 = Integer.valueOf(i4);
        long j3 = this.f1855e[i3];
        c0556t.getClass();
        c0556t.m1403h(numValueOf, numValueOf2, i3, j3, 0L, C0565b.f2043c, false);
        return c0556t;
    }

    @Override // p055T.AbstractC0558V
    /* JADX INFO: renamed from: h */
    public final int mo1330h() {
        return this.f1854d.length;
    }

    @Override // p055T.AbstractC0558V
    public final int hashCode() {
        return Arrays.hashCode(this.f1857g) + ((Arrays.hashCode(this.f1856f) + ((Arrays.hashCode(this.f1855e) + (Arrays.hashCode(this.f1854d) * 31)) * 31)) * 31);
    }

    @Override // p055T.AbstractC0558V
    /* JADX INFO: renamed from: l */
    public final Object mo1331l(int i3) {
        return Integer.valueOf(this.f1854d[i3]);
    }

    @Override // p055T.AbstractC0558V
    /* JADX INFO: renamed from: m */
    public final C0557U mo1332m(int i3, C0557U c0557u, long j3) {
        long j4 = this.f1855e[i3];
        boolean z3 = j4 == -9223372036854775807L;
        Integer numValueOf = Integer.valueOf(this.f1854d[i3]);
        C0539B c0539b = this.f1853c[i3];
        c0557u.m1405b(numValueOf, c0539b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, !z3, z3, this.f1857g[i3] ? c0539b.f1876c : null, this.f1856f[i3], j4, i3, i3, 0L);
        return c0557u;
    }

    @Override // p055T.AbstractC0558V
    /* JADX INFO: renamed from: o */
    public final int mo1333o() {
        return this.f1854d.length;
    }
}

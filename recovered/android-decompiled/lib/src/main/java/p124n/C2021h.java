package p124n;

/* JADX INFO: renamed from: n.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2021h implements Cloneable {

    /* JADX INFO: renamed from: k */
    public static final Object f8780k = new Object();

    /* JADX INFO: renamed from: g */
    public boolean f8781g = false;

    /* JADX INFO: renamed from: h */
    public long[] f8782h;

    /* JADX INFO: renamed from: i */
    public Object[] f8783i;

    /* JADX INFO: renamed from: j */
    public int f8784j;

    public C2021h() {
        int i3;
        int i4 = 4;
        while (true) {
            i3 = 80;
            if (i4 >= 32) {
                break;
            }
            int i5 = (1 << i4) - 12;
            if (80 <= i5) {
                i3 = i5;
                break;
            }
            i4++;
        }
        int i6 = i3 / 8;
        this.f8782h = new long[i6];
        this.f8783i = new Object[i6];
    }

    /* JADX INFO: renamed from: a */
    public final void m4579a(long j3, Long l3) {
        int i3 = this.f8784j;
        if (i3 != 0 && j3 <= this.f8782h[i3 - 1]) {
            m4583e(j3, l3);
            return;
        }
        if (this.f8781g && i3 >= this.f8782h.length) {
            m4581c();
        }
        int i4 = this.f8784j;
        if (i4 >= this.f8782h.length) {
            int i5 = (i4 + 1) * 8;
            for (int i6 = 4; i6 < 32; i6++) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 / 8;
            long[] jArr = new long[i8];
            Object[] objArr = new Object[i8];
            long[] jArr2 = this.f8782h;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f8783i;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f8782h = jArr;
            this.f8783i = objArr;
        }
        this.f8782h[i4] = j3;
        this.f8783i[i4] = l3;
        this.f8784j = i4 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C2021h clone() {
        try {
            C2021h c2021h = (C2021h) super.clone();
            c2021h.f8782h = (long[]) this.f8782h.clone();
            c2021h.f8783i = (Object[]) this.f8783i.clone();
            return c2021h;
        } catch (CloneNotSupportedException e3) {
            throw new AssertionError(e3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4581c() {
        int i3 = this.f8784j;
        long[] jArr = this.f8782h;
        Object[] objArr = this.f8783i;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[i5];
            if (obj != f8780k) {
                if (i5 != i4) {
                    jArr[i4] = jArr[i5];
                    objArr[i4] = obj;
                    objArr[i5] = null;
                }
                i4++;
            }
        }
        this.f8781g = false;
        this.f8784j = i4;
    }

    /* JADX INFO: renamed from: d */
    public final Object m4582d(long j3, Long l3) {
        Object obj;
        int iM4578b = AbstractC2020g.m4578b(this.f8782h, this.f8784j, j3);
        return (iM4578b < 0 || (obj = this.f8783i[iM4578b]) == f8780k) ? l3 : obj;
    }

    /* JADX INFO: renamed from: e */
    public final void m4583e(long j3, Object obj) {
        int iM4578b = AbstractC2020g.m4578b(this.f8782h, this.f8784j, j3);
        if (iM4578b >= 0) {
            this.f8783i[iM4578b] = obj;
            return;
        }
        int i3 = ~iM4578b;
        int i4 = this.f8784j;
        if (i3 < i4) {
            Object[] objArr = this.f8783i;
            if (objArr[i3] == f8780k) {
                this.f8782h[i3] = j3;
                objArr[i3] = obj;
                return;
            }
        }
        if (this.f8781g && i4 >= this.f8782h.length) {
            m4581c();
            i3 = ~AbstractC2020g.m4578b(this.f8782h, this.f8784j, j3);
        }
        int i5 = this.f8784j;
        if (i5 >= this.f8782h.length) {
            int i6 = (i5 + 1) * 8;
            for (int i7 = 4; i7 < 32; i7++) {
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
            }
            int i9 = i6 / 8;
            long[] jArr = new long[i9];
            Object[] objArr2 = new Object[i9];
            long[] jArr2 = this.f8782h;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f8783i;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f8782h = jArr;
            this.f8783i = objArr2;
        }
        int i10 = this.f8784j - i3;
        if (i10 != 0) {
            long[] jArr3 = this.f8782h;
            int i11 = i3 + 1;
            System.arraycopy(jArr3, i3, jArr3, i11, i10);
            Object[] objArr4 = this.f8783i;
            System.arraycopy(objArr4, i3, objArr4, i11, this.f8784j - i3);
        }
        this.f8782h[i3] = j3;
        this.f8783i[i3] = obj;
        this.f8784j++;
    }

    public final String toString() {
        if (this.f8781g) {
            m4581c();
        }
        int i3 = this.f8784j;
        if (i3 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i3 * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f8784j; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            if (this.f8781g) {
                m4581c();
            }
            sb.append(this.f8782h[i4]);
            sb.append('=');
            if (this.f8781g) {
                m4581c();
            }
            Object obj = this.f8783i[i4];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

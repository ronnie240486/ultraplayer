package p124n;

/* JADX INFO: renamed from: n.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2023j implements Cloneable {

    /* JADX INFO: renamed from: j */
    public static final Object f8792j = new Object();

    /* JADX INFO: renamed from: g */
    public int[] f8793g;

    /* JADX INFO: renamed from: h */
    public Object[] f8794h;

    /* JADX INFO: renamed from: i */
    public int f8795i;

    public C2023j() {
        int i3;
        int i4 = 4;
        while (true) {
            i3 = 40;
            if (i4 >= 32) {
                break;
            }
            int i5 = (1 << i4) - 12;
            if (40 <= i5) {
                i3 = i5;
                break;
            }
            i4++;
        }
        int i6 = i3 / 4;
        this.f8793g = new int[i6];
        this.f8794h = new Object[i6];
    }

    /* JADX INFO: renamed from: a */
    public final void m4593a(int i3, Object obj) {
        int i4 = this.f8795i;
        if (i4 != 0 && i3 <= this.f8793g[i4 - 1]) {
            m4596d(i3, obj);
            return;
        }
        if (i4 >= this.f8793g.length) {
            int i5 = (i4 + 1) * 4;
            for (int i6 = 4; i6 < 32; i6++) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 / 4;
            int[] iArr = new int[i8];
            Object[] objArr = new Object[i8];
            int[] iArr2 = this.f8793g;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f8794h;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f8793g = iArr;
            this.f8794h = objArr;
        }
        this.f8793g[i4] = i3;
        this.f8794h[i4] = obj;
        this.f8795i = i4 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C2023j clone() {
        try {
            C2023j c2023j = (C2023j) super.clone();
            c2023j.f8793g = (int[]) this.f8793g.clone();
            c2023j.f8794h = (Object[]) this.f8794h.clone();
            return c2023j;
        } catch (CloneNotSupportedException e3) {
            throw new AssertionError(e3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m4595c(int i3, Integer num) {
        Object obj;
        int iM4577a = AbstractC2020g.m4577a(this.f8795i, i3, this.f8793g);
        return (iM4577a < 0 || (obj = this.f8794h[iM4577a]) == f8792j) ? num : obj;
    }

    /* JADX INFO: renamed from: d */
    public final void m4596d(int i3, Object obj) {
        int iM4577a = AbstractC2020g.m4577a(this.f8795i, i3, this.f8793g);
        if (iM4577a >= 0) {
            this.f8794h[iM4577a] = obj;
            return;
        }
        int i4 = ~iM4577a;
        int i5 = this.f8795i;
        if (i4 < i5) {
            Object[] objArr = this.f8794h;
            if (objArr[i4] == f8792j) {
                this.f8793g[i4] = i3;
                objArr[i4] = obj;
                return;
            }
        }
        if (i5 >= this.f8793g.length) {
            int i6 = (i5 + 1) * 4;
            for (int i7 = 4; i7 < 32; i7++) {
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
            }
            int i9 = i6 / 4;
            int[] iArr = new int[i9];
            Object[] objArr2 = new Object[i9];
            int[] iArr2 = this.f8793g;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f8794h;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f8793g = iArr;
            this.f8794h = objArr2;
        }
        int i10 = this.f8795i - i4;
        if (i10 != 0) {
            int[] iArr3 = this.f8793g;
            int i11 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i11, i10);
            Object[] objArr4 = this.f8794h;
            System.arraycopy(objArr4, i4, objArr4, i11, this.f8795i - i4);
        }
        this.f8793g[i4] = i3;
        this.f8794h[i4] = obj;
        this.f8795i++;
    }

    public final String toString() {
        int i3 = this.f8795i;
        if (i3 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i3 * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f8795i; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(this.f8793g[i4]);
            sb.append('=');
            Object obj = this.f8794h[i4];
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

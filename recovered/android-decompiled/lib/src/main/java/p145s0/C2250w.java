package p145s0;

import java.io.Serializable;

/* JADX INFO: renamed from: s0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C2250w {

    /* JADX INFO: renamed from: a */
    public int f9676a;

    /* JADX INFO: renamed from: b */
    public int f9677b;

    /* JADX INFO: renamed from: c */
    public int f9678c;

    /* JADX INFO: renamed from: d */
    public int f9679d;

    /* JADX INFO: renamed from: e */
    public int f9680e;

    /* JADX INFO: renamed from: f */
    public int f9681f;

    /* JADX INFO: renamed from: g */
    public Serializable f9682g;

    /* JADX INFO: renamed from: a */
    public boolean m4845a(int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        if (!((i3 & (-2097152)) == -2097152) || (i4 = (i3 >>> 19) & 3) == 1 || (i5 = (i3 >>> 17) & 3) == 0 || (i6 = (i3 >>> 12) & 15) == 0 || i6 == 15 || (i7 = (i3 >>> 10) & 3) == 3) {
            return false;
        }
        this.f9676a = i4;
        this.f9682g = AbstractC2229b.f9583s[3 - i5];
        int i8 = AbstractC2229b.f9584t[i7];
        this.f9678c = i8;
        if (i4 == 2) {
            this.f9678c = i8 / 2;
        } else if (i4 == 0) {
            this.f9678c = i8 / 4;
        }
        int i9 = (i3 >>> 9) & 1;
        int i10 = 1152;
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    throw new IllegalArgumentException();
                }
                i10 = 384;
            }
        } else if (i4 != 3) {
            i10 = 576;
        }
        this.f9681f = i10;
        if (i5 == 3) {
            int i11 = i4 == 3 ? AbstractC2229b.f9585u[i6 - 1] : AbstractC2229b.f9586v[i6 - 1];
            this.f9680e = i11;
            this.f9677b = (((i11 * 12) / this.f9678c) + i9) * 4;
        } else {
            if (i4 == 3) {
                int i12 = i5 == 2 ? AbstractC2229b.f9587w[i6 - 1] : AbstractC2229b.f9588x[i6 - 1];
                this.f9680e = i12;
                this.f9677b = ((i12 * 144) / this.f9678c) + i9;
            } else {
                int i13 = AbstractC2229b.f9589y[i6 - 1];
                this.f9680e = i13;
                this.f9677b = (((i5 == 1 ? 72 : 144) * i13) / this.f9678c) + i9;
            }
        }
        this.f9679d = ((i3 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}

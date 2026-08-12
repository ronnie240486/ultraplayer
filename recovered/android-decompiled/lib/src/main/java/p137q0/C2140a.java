package p137q0;

import java.util.Arrays;

/* JADX INFO: renamed from: q0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2140a {

    /* JADX INFO: renamed from: a */
    public long f9204a;

    /* JADX INFO: renamed from: b */
    public long f9205b;

    /* JADX INFO: renamed from: c */
    public long f9206c;

    /* JADX INFO: renamed from: d */
    public long f9207d;

    /* JADX INFO: renamed from: e */
    public long f9208e;

    /* JADX INFO: renamed from: f */
    public long f9209f;

    /* JADX INFO: renamed from: g */
    public final boolean[] f9210g = new boolean[15];

    /* JADX INFO: renamed from: h */
    public int f9211h;

    /* JADX INFO: renamed from: a */
    public final boolean m4712a() {
        return this.f9207d > 15 && this.f9211h == 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m4713b(long j3) {
        long j4 = this.f9207d;
        if (j4 == 0) {
            this.f9204a = j3;
        } else if (j4 == 1) {
            long j5 = j3 - this.f9204a;
            this.f9205b = j5;
            this.f9209f = j5;
            this.f9208e = 1L;
        } else {
            long j6 = j3 - this.f9206c;
            int i3 = (int) (j4 % 15);
            long jAbs = Math.abs(j6 - this.f9205b);
            boolean[] zArr = this.f9210g;
            if (jAbs <= 1000000) {
                this.f9208e++;
                this.f9209f += j6;
                if (zArr[i3]) {
                    zArr[i3] = false;
                    this.f9211h--;
                }
            } else if (!zArr[i3]) {
                zArr[i3] = true;
                this.f9211h++;
            }
        }
        this.f9207d++;
        this.f9206c = j3;
    }

    /* JADX INFO: renamed from: c */
    public final void m4714c() {
        this.f9207d = 0L;
        this.f9208e = 0L;
        this.f9209f = 0L;
        this.f9211h = 0;
        Arrays.fill(this.f9210g, false);
    }
}

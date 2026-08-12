package p095f0;

import p055T.C0579k;

/* JADX INFO: renamed from: f0.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1535h implements Comparable {

    /* JADX INFO: renamed from: g */
    public final String f6924g;

    /* JADX INFO: renamed from: h */
    public final C1534g f6925h;

    /* JADX INFO: renamed from: i */
    public final long f6926i;

    /* JADX INFO: renamed from: j */
    public final int f6927j;

    /* JADX INFO: renamed from: k */
    public final long f6928k;

    /* JADX INFO: renamed from: l */
    public final C0579k f6929l;

    /* JADX INFO: renamed from: m */
    public final String f6930m;

    /* JADX INFO: renamed from: n */
    public final String f6931n;

    /* JADX INFO: renamed from: o */
    public final long f6932o;

    /* JADX INFO: renamed from: p */
    public final long f6933p;

    /* JADX INFO: renamed from: q */
    public final boolean f6934q;

    public AbstractC1535h(String str, C1534g c1534g, long j3, int i3, long j4, C0579k c0579k, String str2, String str3, long j5, long j6, boolean z3) {
        this.f6924g = str;
        this.f6925h = c1534g;
        this.f6926i = j3;
        this.f6927j = i3;
        this.f6928k = j4;
        this.f6929l = c0579k;
        this.f6930m = str2;
        this.f6931n = str3;
        this.f6932o = j5;
        this.f6933p = j6;
        this.f6934q = z3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l3 = (Long) obj;
        long jLongValue = l3.longValue();
        long j3 = this.f6928k;
        if (j3 > jLongValue) {
            return 1;
        }
        return j3 < l3.longValue() ? -1 : 0;
    }
}

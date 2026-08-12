package p085c0;

import p036M0.C0367d;

/* JADX INFO: renamed from: c0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1130f {

    /* JADX INFO: renamed from: d */
    public static final C1130f f5243d = new C0367d().m1008a();

    /* JADX INFO: renamed from: a */
    public final boolean f5244a;

    /* JADX INFO: renamed from: b */
    public final boolean f5245b;

    /* JADX INFO: renamed from: c */
    public final boolean f5246c;

    public C1130f(C0367d c0367d) {
        this.f5244a = c0367d.f1175a;
        this.f5245b = c0367d.f1176b;
        this.f5246c = c0367d.f1177c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1130f.class != obj.getClass()) {
            return false;
        }
        C1130f c1130f = (C1130f) obj;
        return this.f5244a == c1130f.f5244a && this.f5245b == c1130f.f5245b && this.f5246c == c1130f.f5246c;
    }

    public final int hashCode() {
        return ((this.f5244a ? 1 : 0) << 2) + ((this.f5245b ? 1 : 0) << 1) + (this.f5246c ? 1 : 0);
    }
}

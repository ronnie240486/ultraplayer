package p074Z0;

import p064W.AbstractC0646n;
import p064W.C0651s;
import p145s0.C2237j;

/* JADX INFO: renamed from: Z0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0778e {

    /* JADX INFO: renamed from: a */
    public final int f3181a;

    /* JADX INFO: renamed from: b */
    public final long f3182b;

    public /* synthetic */ C0778e(int i3, long j3, boolean z3) {
        this.f3181a = i3;
        this.f3182b = j3;
    }

    /* JADX INFO: renamed from: a */
    public static C0778e m1891a(C2237j c2237j, C0651s c0651s) {
        c2237j.mo338i(c0651s.f2520a, 0, 8, false);
        c0651s.m1665G(0);
        return new C0778e(c0651s.m1673g(), c0651s.m1678l(), false);
    }

    public C0778e(int i3, long j3) {
        AbstractC0646n.m1625c(j3 >= 0);
        this.f3181a = i3;
        this.f3182b = j3;
    }
}

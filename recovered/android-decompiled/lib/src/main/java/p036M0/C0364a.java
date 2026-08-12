package p036M0;

import p055T.C0546I;
import p064W.C0651s;
import p145s0.AbstractC2229b;

/* JADX INFO: renamed from: M0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0364a {

    /* JADX INFO: renamed from: a */
    public final int f1162a;

    /* JADX INFO: renamed from: b */
    public int f1163b;

    /* JADX INFO: renamed from: c */
    public int f1164c;

    /* JADX INFO: renamed from: d */
    public long f1165d;

    /* JADX INFO: renamed from: e */
    public final boolean f1166e;

    /* JADX INFO: renamed from: f */
    public final C0651s f1167f;

    /* JADX INFO: renamed from: g */
    public final C0651s f1168g;

    /* JADX INFO: renamed from: h */
    public int f1169h;

    /* JADX INFO: renamed from: i */
    public int f1170i;

    public C0364a(C0651s c0651s, C0651s c0651s2, boolean z3) throws C0546I {
        this.f1168g = c0651s;
        this.f1167f = c0651s2;
        this.f1166e = z3;
        c0651s2.m1665G(12);
        this.f1162a = c0651s2.m1691y();
        c0651s.m1665G(12);
        this.f1170i = c0651s.m1691y();
        AbstractC2229b.m4808c("first_chunk must be 1", c0651s.m1673g() == 1);
        this.f1163b = -1;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1004a() {
        int i3 = this.f1163b + 1;
        this.f1163b = i3;
        if (i3 == this.f1162a) {
            return false;
        }
        boolean z3 = this.f1166e;
        C0651s c0651s = this.f1167f;
        this.f1165d = z3 ? c0651s.m1692z() : c0651s.m1689w();
        if (this.f1163b == this.f1169h) {
            C0651s c0651s2 = this.f1168g;
            this.f1164c = c0651s2.m1691y();
            c0651s2.m1666H(4);
            int i4 = this.f1170i - 1;
            this.f1170i = i4;
            this.f1169h = i4 > 0 ? c0651s2.m1691y() - 1 : -1;
        }
        return true;
    }
}

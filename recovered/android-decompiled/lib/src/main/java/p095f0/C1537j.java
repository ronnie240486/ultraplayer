package p095f0;

import java.util.List;
import java.util.Map;
import p055T.C0579k;
import p105h2.AbstractC1676G;
import p105h2.AbstractC1723q;
import p105h2.C1700c0;

/* JADX INFO: renamed from: f0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1537j extends AbstractC1541n {

    /* JADX INFO: renamed from: d */
    public final int f6940d;

    /* JADX INFO: renamed from: e */
    public final long f6941e;

    /* JADX INFO: renamed from: f */
    public final boolean f6942f;

    /* JADX INFO: renamed from: g */
    public final boolean f6943g;

    /* JADX INFO: renamed from: h */
    public final long f6944h;

    /* JADX INFO: renamed from: i */
    public final boolean f6945i;

    /* JADX INFO: renamed from: j */
    public final int f6946j;

    /* JADX INFO: renamed from: k */
    public final long f6947k;

    /* JADX INFO: renamed from: l */
    public final int f6948l;

    /* JADX INFO: renamed from: m */
    public final long f6949m;

    /* JADX INFO: renamed from: n */
    public final long f6950n;

    /* JADX INFO: renamed from: o */
    public final boolean f6951o;

    /* JADX INFO: renamed from: p */
    public final boolean f6952p;

    /* JADX INFO: renamed from: q */
    public final C0579k f6953q;

    /* JADX INFO: renamed from: r */
    public final AbstractC1676G f6954r;

    /* JADX INFO: renamed from: s */
    public final AbstractC1676G f6955s;

    /* JADX INFO: renamed from: t */
    public final C1700c0 f6956t;

    /* JADX INFO: renamed from: u */
    public final long f6957u;

    /* JADX INFO: renamed from: v */
    public final C1536i f6958v;

    public C1537j(int i3, String str, List list, long j3, boolean z3, long j4, boolean z4, int i4, long j5, int i5, long j6, long j7, boolean z5, boolean z6, boolean z7, C0579k c0579k, List list2, List list3, C1536i c1536i, Map map) {
        super(str, list, z5);
        this.f6940d = i3;
        this.f6944h = j4;
        this.f6943g = z3;
        this.f6945i = z4;
        this.f6946j = i4;
        this.f6947k = j5;
        this.f6948l = i5;
        this.f6949m = j6;
        this.f6950n = j7;
        this.f6951o = z6;
        this.f6952p = z7;
        this.f6953q = c0579k;
        this.f6954r = AbstractC1676G.m4117n(list2);
        this.f6955s = AbstractC1676G.m4117n(list3);
        this.f6956t = C1700c0.m4138a(map);
        if (!list3.isEmpty()) {
            C1532e c1532e = (C1532e) AbstractC1723q.m4158g(list3);
            this.f6957u = c1532e.f6928k + c1532e.f6926i;
        } else if (list2.isEmpty()) {
            this.f6957u = 0L;
        } else {
            C1534g c1534g = (C1534g) AbstractC1723q.m4158g(list2);
            this.f6957u = c1534g.f6928k + c1534g.f6926i;
        }
        this.f6941e = j3 != -9223372036854775807L ? j3 >= 0 ? Math.min(this.f6957u, j3) : Math.max(0L, this.f6957u + j3) : -9223372036854775807L;
        this.f6942f = j3 >= 0;
        this.f6958v = c1536i;
    }

    @Override // p095f0.AbstractC1541n
    /* JADX INFO: renamed from: a */
    public final Object mo3834a(List list) {
        return this;
    }
}

package p114k0;

import java.util.List;
import p064W.AbstractC0646n;
import p077a0.C0800K;
import p105h2.AbstractC1676G;
import p105h2.C1673D;
import p105h2.C1692X;

/* JADX INFO: renamed from: k0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1953m implements InterfaceC1935b0 {

    /* JADX INFO: renamed from: g */
    public final C1692X f8544g;

    /* JADX INFO: renamed from: h */
    public long f8545h;

    public C1953m(List list, List list2) {
        C1673D c1673dM4116m = AbstractC1676G.m4116m();
        AbstractC0646n.m1625c(list.size() == list2.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            c1673dM4116m.m4102a(new C1952l((InterfaceC1935b0) list.get(i3), (List) list2.get(i3)));
        }
        this.f8544g = c1673dM4116m.m4112f();
        this.f8545h = -9223372036854775807L;
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: a */
    public final boolean mo3759a() {
        int i3 = 0;
        while (true) {
            C1692X c1692x = this.f8544g;
            if (i3 >= c1692x.f7631j) {
                return false;
            }
            if (((C1952l) c1692x.get(i3)).f8542g.mo3759a()) {
                return true;
            }
            i3++;
        }
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: h */
    public final long mo3766h() {
        int i3 = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            C1692X c1692x = this.f8544g;
            if (i3 >= c1692x.f7631j) {
                break;
            }
            C1952l c1952l = (C1952l) c1692x.get(i3);
            long jMo3766h = c1952l.f8542g.mo3766h();
            AbstractC1676G abstractC1676G = c1952l.f8543h;
            if ((abstractC1676G.contains(1) || abstractC1676G.contains(2) || abstractC1676G.contains(4)) && jMo3766h != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo3766h);
            }
            if (jMo3766h != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jMo3766h);
            }
            i3++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.f8545h = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j3 = this.f8545h;
        return j3 != -9223372036854775807L ? j3 : jMin2;
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: i */
    public final boolean mo3767i(C0800K c0800k) {
        boolean zMo3767i;
        boolean z3 = false;
        do {
            long jMo3772r = mo3772r();
            if (jMo3772r == Long.MIN_VALUE) {
                return z3;
            }
            int i3 = 0;
            zMo3767i = false;
            while (true) {
                C1692X c1692x = this.f8544g;
                if (i3 >= c1692x.f7631j) {
                    break;
                }
                long jMo3772r2 = ((C1952l) c1692x.get(i3)).f8542g.mo3772r();
                boolean z4 = jMo3772r2 != Long.MIN_VALUE && jMo3772r2 <= c0800k.f3335a;
                if (jMo3772r2 == jMo3772r || z4) {
                    zMo3767i |= ((C1952l) c1692x.get(i3)).f8542g.mo3767i(c0800k);
                }
                i3++;
            }
            z3 |= zMo3767i;
        } while (zMo3767i);
        return z3;
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: r */
    public final long mo3772r() {
        int i3 = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            C1692X c1692x = this.f8544g;
            if (i3 >= c1692x.f7631j) {
                break;
            }
            long jMo3772r = ((C1952l) c1692x.get(i3)).f8542g.mo3772r();
            if (jMo3772r != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo3772r);
            }
            i3++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // p114k0.InterfaceC1935b0
    /* JADX INFO: renamed from: u */
    public final void mo3774u(long j3) {
        int i3 = 0;
        while (true) {
            C1692X c1692x = this.f8544g;
            if (i3 >= c1692x.f7631j) {
                return;
            }
            ((C1952l) c1692x.get(i3)).mo3774u(j3);
            i3++;
        }
    }
}

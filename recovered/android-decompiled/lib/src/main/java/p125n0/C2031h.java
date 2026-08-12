package p125n0;

import p045P0.AbstractC0462h;
import p055T.C0583o;
import p105h2.AbstractC1731y;

/* JADX INFO: renamed from: n0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2031h implements Comparable {

    /* JADX INFO: renamed from: g */
    public final boolean f8846g;

    /* JADX INFO: renamed from: h */
    public final boolean f8847h;

    public C2031h(C0583o c0583o, int i3) {
        this.f8846g = (c0583o.f2145e & 1) != 0;
        this.f8847h = AbstractC0462h.m1163c(i3, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2031h c2031h = (C2031h) obj;
        return AbstractC1731y.f7720a.mo4184c(this.f8847h, c2031h.f8847h).mo4184c(this.f8846g, c2031h.f8846g).mo4186e();
    }
}

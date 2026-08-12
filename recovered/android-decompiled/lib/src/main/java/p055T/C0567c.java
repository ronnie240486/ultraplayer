package p055T;

import p000A.C0031d;
import p045P0.AbstractC0462h;

/* JADX INFO: renamed from: T.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0567c {

    /* JADX INFO: renamed from: b */
    public static final C0567c f2052b = new C0567c();

    /* JADX INFO: renamed from: a */
    public C0031d f2053a;

    static {
        AbstractC0462h.m1167g(0, 1, 2, 3, 4);
    }

    /* JADX INFO: renamed from: a */
    public final C0031d m1433a() {
        if (this.f2053a == null) {
            this.f2053a = new C0031d(this);
        }
        return this.f2053a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0567c.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 486696559;
    }
}

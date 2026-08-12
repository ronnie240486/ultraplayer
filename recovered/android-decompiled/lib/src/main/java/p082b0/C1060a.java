package p082b0;

import java.util.Arrays;
import p055T.AbstractC0558V;
import p114k0.C1907A;
import p122m1.AbstractC2003a;

/* JADX INFO: renamed from: b0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1060a {

    /* JADX INFO: renamed from: a */
    public final long f4811a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0558V f4812b;

    /* JADX INFO: renamed from: c */
    public final int f4813c;

    /* JADX INFO: renamed from: d */
    public final C1907A f4814d;

    /* JADX INFO: renamed from: e */
    public final long f4815e;

    /* JADX INFO: renamed from: f */
    public final AbstractC0558V f4816f;

    /* JADX INFO: renamed from: g */
    public final int f4817g;

    /* JADX INFO: renamed from: h */
    public final C1907A f4818h;

    /* JADX INFO: renamed from: i */
    public final long f4819i;

    /* JADX INFO: renamed from: j */
    public final long f4820j;

    public C1060a(long j3, AbstractC0558V abstractC0558V, int i3, C1907A c1907a, long j4, AbstractC0558V abstractC0558V2, int i4, C1907A c1907a2, long j5, long j6) {
        this.f4811a = j3;
        this.f4812b = abstractC0558V;
        this.f4813c = i3;
        this.f4814d = c1907a;
        this.f4815e = j4;
        this.f4816f = abstractC0558V2;
        this.f4817g = i4;
        this.f4818h = c1907a2;
        this.f4819i = j5;
        this.f4820j = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1060a.class == obj.getClass()) {
            C1060a c1060a = (C1060a) obj;
            if (this.f4811a == c1060a.f4811a && this.f4813c == c1060a.f4813c && this.f4815e == c1060a.f4815e && this.f4817g == c1060a.f4817g && this.f4819i == c1060a.f4819i && this.f4820j == c1060a.f4820j && AbstractC2003a.m4538k(this.f4812b, c1060a.f4812b) && AbstractC2003a.m4538k(this.f4814d, c1060a.f4814d) && AbstractC2003a.m4538k(this.f4816f, c1060a.f4816f) && AbstractC2003a.m4538k(this.f4818h, c1060a.f4818h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4811a), this.f4812b, Integer.valueOf(this.f4813c), this.f4814d, Long.valueOf(this.f4815e), this.f4816f, Integer.valueOf(this.f4817g), this.f4818h, Long.valueOf(this.f4819i), Long.valueOf(this.f4820j)});
    }
}

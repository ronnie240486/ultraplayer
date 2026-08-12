package p055T;

import p064W.AbstractC0632A;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1692X;

/* JADX INFO: renamed from: T.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0568c0 {

    /* JADX INFO: renamed from: b */
    public static final C0568c0 f2054b;

    /* JADX INFO: renamed from: a */
    public final AbstractC1676G f2055a;

    static {
        C1674E c1674e = AbstractC1676G.f7601h;
        f2054b = new C0568c0(C1692X.f7629k);
        AbstractC0632A.m1566G(0);
    }

    public C0568c0(AbstractC1676G abstractC1676G) {
        this.f2055a = AbstractC1676G.m4117n(abstractC1676G);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1434a(int i3) {
        int i4 = 0;
        while (true) {
            AbstractC1676G abstractC1676G = this.f2055a;
            if (i4 >= abstractC1676G.size()) {
                return false;
            }
            C0566b0 c0566b0 = (C0566b0) abstractC1676G.get(i4);
            for (boolean z3 : c0566b0.f2051e) {
                if (z3) {
                    if (c0566b0.f2048b.f1994c != i3) {
                        break;
                    }
                    return true;
                }
            }
            i4++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0568c0.class != obj.getClass()) {
            return false;
        }
        return this.f2055a.equals(((C0568c0) obj).f2055a);
    }

    public final int hashCode() {
        return this.f2055a.hashCode();
    }
}

package p040N1;

import java.util.Arrays;
import p009D0.C0106b;
import p034L1.C0348c;
import p046P1.AbstractC0491s;

/* JADX INFO: renamed from: N1.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0436q {

    /* JADX INFO: renamed from: a */
    public final C0421b f1481a;

    /* JADX INFO: renamed from: b */
    public final C0348c f1482b;

    public /* synthetic */ C0436q(C0421b c0421b, C0348c c0348c) {
        this.f1481a = c0421b;
        this.f1482b = c0348c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C0436q)) {
            C0436q c0436q = (C0436q) obj;
            if (AbstractC0491s.m1216h(this.f1481a, c0436q.f1481a) && AbstractC0491s.m1216h(this.f1482b, c0436q.f1482b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1481a, this.f1482b});
    }

    public final String toString() {
        C0106b c0106b = new C0106b(this);
        c0106b.m525m(this.f1481a, "key");
        c0106b.m525m(this.f1482b, "feature");
        return c0106b.toString();
    }
}

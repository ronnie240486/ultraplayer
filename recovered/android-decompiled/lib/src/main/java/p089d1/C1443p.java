package p089d1;

import android.os.Bundle;

/* JADX INFO: renamed from: d1.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1443p {

    /* JADX INFO: renamed from: a */
    public final Bundle f6388a;

    /* JADX INFO: renamed from: b */
    public C1451x f6389b;

    public C1443p(C1451x c1451x, boolean z3) {
        if (c1451x == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.f6388a = bundle;
        this.f6389b = c1451x;
        bundle.putBundle("selector", c1451x.f6417a);
        bundle.putBoolean("activeScan", z3);
    }

    /* JADX INFO: renamed from: a */
    public final void m3612a() {
        if (this.f6389b == null) {
            C1451x c1451xM3639b = C1451x.m3639b(this.f6388a.getBundle("selector"));
            this.f6389b = c1451xM3639b;
            if (c1451xM3639b == null) {
                this.f6389b = C1451x.f6416c;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3613b() {
        return this.f6388a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1443p) {
            C1443p c1443p = (C1443p) obj;
            m3612a();
            C1451x c1451x = this.f6389b;
            c1443p.m3612a();
            if (c1451x.equals(c1443p.f6389b) && m3613b() == c1443p.m3613b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        m3612a();
        return (this.f6389b.hashCode() ^ (m3613b() ? 1 : 0)) == true ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryRequest{ selector=");
        m3612a();
        sb.append(this.f6389b);
        sb.append(", activeScan=");
        sb.append(m3613b());
        sb.append(", isValid=");
        m3612a();
        C1451x c1451x = this.f6389b;
        c1451x.m3640a();
        sb.append(!c1451x.f6418b.contains(null));
        sb.append(" }");
        return sb.toString();
    }
}

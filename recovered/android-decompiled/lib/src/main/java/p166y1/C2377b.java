package p166y1;

import p138q1.C2172h;
import p138q1.C2174j;

/* JADX INFO: renamed from: y1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2377b {

    /* JADX INFO: renamed from: a */
    public final long f9962a;

    /* JADX INFO: renamed from: b */
    public final C2174j f9963b;

    /* JADX INFO: renamed from: c */
    public final C2172h f9964c;

    public C2377b(long j3, C2174j c2174j, C2172h c2172h) {
        this.f9962a = j3;
        this.f9963b = c2174j;
        this.f9964c = c2172h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2377b) {
            C2377b c2377b = (C2377b) obj;
            if (this.f9962a == c2377b.f9962a && this.f9963b.equals(c2377b.f9963b) && this.f9964c.equals(c2377b.f9964c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f9962a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f9963b.hashCode()) * 1000003) ^ this.f9964c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f9962a + ", transportContext=" + this.f9963b + ", event=" + this.f9964c + "}";
    }
}

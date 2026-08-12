package p143r2;

import java.io.Serializable;
import p163x2.AbstractC2364c;

/* JADX INFO: renamed from: r2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2204b implements Serializable {

    /* JADX INFO: renamed from: g */
    public final Throwable f9493g;

    public C2204b(Throwable th) {
        this.f9493g = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2204b) {
            return AbstractC2364c.m4950a(this.f9493g, ((C2204b) obj).f9493g);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9493g.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f9493g + ')';
    }
}

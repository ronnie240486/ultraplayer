package p142r1;

import androidx.fragment.app.AbstractC0948N;

/* JADX INFO: renamed from: r1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2196a {

    /* JADX INFO: renamed from: a */
    public final int f9477a;

    /* JADX INFO: renamed from: b */
    public final long f9478b;

    public C2196a(int i3, long j3) {
        if (i3 == 0) {
            throw new NullPointerException("Null status");
        }
        this.f9477a = i3;
        this.f9478b = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2196a)) {
            return false;
        }
        C2196a c2196a = (C2196a) obj;
        int i3 = c2196a.f9477a;
        int i4 = this.f9477a;
        if (i4 != 0) {
            return (i4 == i3) && this.f9478b == c2196a.f9478b;
        }
        throw null;
    }

    public final int hashCode() {
        int iM2507b = (AbstractC0948N.m2507b(this.f9477a) ^ 1000003) * 1000003;
        long j3 = this.f9478b;
        return iM2507b ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i3 = this.f9477a;
        if (i3 == 1) {
            str = "OK";
        } else if (i3 == 2) {
            str = "TRANSIENT_ERROR";
        } else if (i3 != 3) {
            str = i3 != 4 ? "null" : "INVALID_PAYLOAD";
        } else {
            str = "FATAL_ERROR";
        }
        sb.append(str);
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.f9478b);
        sb.append("}");
        return sb.toString();
    }
}

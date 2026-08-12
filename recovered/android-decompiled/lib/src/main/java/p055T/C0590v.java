package p055T;

import android.net.Uri;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
import p040N1.C0437r;
import p045P0.AbstractC0462h;
import p064W.AbstractC0632A;
import p105h2.C1692X;
import p105h2.C1700c0;

/* JADX INFO: renamed from: T.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0590v {

    /* JADX INFO: renamed from: a */
    public final UUID f2183a;

    /* JADX INFO: renamed from: b */
    public final Uri f2184b;

    /* JADX INFO: renamed from: c */
    public final C1700c0 f2185c;

    /* JADX INFO: renamed from: d */
    public final boolean f2186d;

    /* JADX INFO: renamed from: e */
    public final C1692X f2187e;

    /* JADX INFO: renamed from: f */
    public final byte[] f2188f;

    static {
        AbstractC0462h.m1167g(0, 1, 2, 3, 4);
        AbstractC0632A.m1566G(5);
        AbstractC0632A.m1566G(6);
        AbstractC0632A.m1566G(7);
    }

    public C0590v(C0437r c0437r) {
        c0437r.getClass();
        UUID uuid = (UUID) c0437r.f1484b;
        uuid.getClass();
        this.f2183a = uuid;
        this.f2184b = (Uri) c0437r.f1485c;
        this.f2185c = (C1700c0) c0437r.f1486d;
        this.f2186d = c0437r.f1483a;
        this.f2187e = (C1692X) c0437r.f1487e;
        byte[] bArr = (byte[]) c0437r.f1488f;
        this.f2188f = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    /* JADX INFO: renamed from: a */
    public final C0437r m1452a() {
        C0437r c0437r = new C0437r();
        c0437r.f1484b = this.f2183a;
        c0437r.f1485c = this.f2184b;
        c0437r.f1486d = this.f2185c;
        c0437r.f1483a = this.f2186d;
        c0437r.f1487e = this.f2187e;
        c0437r.f1488f = this.f2188f;
        return c0437r;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0590v)) {
            return false;
        }
        C0590v c0590v = (C0590v) obj;
        return this.f2183a.equals(c0590v.f2183a) && Objects.equals(this.f2184b, c0590v.f2184b) && Objects.equals(this.f2185c, c0590v.f2185c) && this.f2186d == c0590v.f2186d && this.f2187e.equals(c0590v.f2187e) && Arrays.equals(this.f2188f, c0590v.f2188f);
    }

    public final int hashCode() {
        int iHashCode = this.f2183a.hashCode() * 31;
        Uri uri = this.f2184b;
        return Arrays.hashCode(this.f2188f) + ((this.f2187e.hashCode() + ((((this.f2185c.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 29791) + (this.f2186d ? 1 : 0)) * 31)) * 31);
    }
}

package p138q1;

import java.util.HashMap;
import p046P1.C0475c;

/* JADX INFO: renamed from: q1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2172h {

    /* JADX INFO: renamed from: a */
    public final String f9381a;

    /* JADX INFO: renamed from: b */
    public final Integer f9382b;

    /* JADX INFO: renamed from: c */
    public final C2176l f9383c;

    /* JADX INFO: renamed from: d */
    public final long f9384d;

    /* JADX INFO: renamed from: e */
    public final long f9385e;

    /* JADX INFO: renamed from: f */
    public final HashMap f9386f;

    public C2172h(String str, Integer num, C2176l c2176l, long j3, long j4, HashMap map) {
        this.f9381a = str;
        this.f9382b = num;
        this.f9383c = c2176l;
        this.f9384d = j3;
        this.f9385e = j4;
        this.f9386f = map;
    }

    /* JADX INFO: renamed from: a */
    public final String m4756a(String str) {
        String str2 = (String) this.f9386f.get(str);
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: renamed from: b */
    public final int m4757b(String str) {
        String str2 = (String) this.f9386f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* JADX INFO: renamed from: c */
    public final C0475c m4758c() {
        C0475c c0475c = new C0475c();
        String str = this.f9381a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        c0475c.f1570c = str;
        c0475c.f1573f = this.f9382b;
        C2176l c2176l = this.f9383c;
        if (c2176l == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        c0475c.f1568a = c2176l;
        c0475c.f1569b = Long.valueOf(this.f9384d);
        c0475c.f1571d = Long.valueOf(this.f9385e);
        c0475c.f1572e = new HashMap(this.f9386f);
        return c0475c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2172h)) {
            return false;
        }
        C2172h c2172h = (C2172h) obj;
        if (!this.f9381a.equals(c2172h.f9381a)) {
            return false;
        }
        Integer num = c2172h.f9382b;
        Integer num2 = this.f9382b;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        return this.f9383c.equals(c2172h.f9383c) && this.f9384d == c2172h.f9384d && this.f9385e == c2172h.f9385e && this.f9386f.equals(c2172h.f9386f);
    }

    public final int hashCode() {
        int iHashCode = (this.f9381a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f9382b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f9383c.hashCode()) * 1000003;
        long j3 = this.f9384d;
        int i3 = (iHashCode2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        long j4 = this.f9385e;
        return ((i3 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ this.f9386f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f9381a + ", code=" + this.f9382b + ", encodedPayload=" + this.f9383c + ", eventMillis=" + this.f9384d + ", uptimeMillis=" + this.f9385e + ", autoMetadata=" + this.f9386f + "}";
    }
}

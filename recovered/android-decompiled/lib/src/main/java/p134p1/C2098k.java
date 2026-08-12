package p134p1;

import java.util.Arrays;

/* JADX INFO: renamed from: p1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2098k extends AbstractC2105r {

    /* JADX INFO: renamed from: a */
    public final long f9117a;

    /* JADX INFO: renamed from: b */
    public final Integer f9118b;

    /* JADX INFO: renamed from: c */
    public final long f9119c;

    /* JADX INFO: renamed from: d */
    public final byte[] f9120d;

    /* JADX INFO: renamed from: e */
    public final String f9121e;

    /* JADX INFO: renamed from: f */
    public final long f9122f;

    /* JADX INFO: renamed from: g */
    public final C2101n f9123g;

    public C2098k(long j3, Integer num, long j4, byte[] bArr, String str, long j5, C2101n c2101n) {
        this.f9117a = j3;
        this.f9118b = num;
        this.f9119c = j4;
        this.f9120d = bArr;
        this.f9121e = str;
        this.f9122f = j5;
        this.f9123g = c2101n;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2105r)) {
            return false;
        }
        AbstractC2105r abstractC2105r = (AbstractC2105r) obj;
        C2098k c2098k = (C2098k) abstractC2105r;
        if (this.f9117a != c2098k.f9117a) {
            return false;
        }
        Integer num = this.f9118b;
        if (num == null) {
            if (c2098k.f9118b != null) {
                return false;
            }
        } else if (!num.equals(c2098k.f9118b)) {
            return false;
        }
        if (this.f9119c != c2098k.f9119c) {
            return false;
        }
        if (!Arrays.equals(this.f9120d, abstractC2105r instanceof C2098k ? ((C2098k) abstractC2105r).f9120d : c2098k.f9120d)) {
            return false;
        }
        String str = c2098k.f9121e;
        String str2 = this.f9121e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f9122f != c2098k.f9122f) {
            return false;
        }
        C2101n c2101n = c2098k.f9123g;
        C2101n c2101n2 = this.f9123g;
        if (c2101n2 == null) {
            return c2101n == null;
        }
        return c2101n2.equals(c2101n);
    }

    public final int hashCode() {
        long j3 = this.f9117a;
        int i3 = (((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f9118b;
        int iHashCode = (i3 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j4 = this.f9119c;
        int iHashCode2 = (((iHashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f9120d)) * 1000003;
        String str = this.f9121e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j5 = this.f9122f;
        int i4 = (iHashCode3 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        C2101n c2101n = this.f9123g;
        return i4 ^ (c2101n != null ? c2101n.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f9117a + ", eventCode=" + this.f9118b + ", eventUptimeMs=" + this.f9119c + ", sourceExtension=" + Arrays.toString(this.f9120d) + ", sourceExtensionJsonProto3=" + this.f9121e + ", timezoneOffsetSeconds=" + this.f9122f + ", networkConnectionInfo=" + this.f9123g + "}";
    }
}

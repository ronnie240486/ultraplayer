package p134p1;

import java.util.ArrayList;

/* JADX INFO: renamed from: p1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2099l extends AbstractC2106s {

    /* JADX INFO: renamed from: a */
    public final long f9124a;

    /* JADX INFO: renamed from: b */
    public final long f9125b;

    /* JADX INFO: renamed from: c */
    public final C2097j f9126c;

    /* JADX INFO: renamed from: d */
    public final Integer f9127d;

    /* JADX INFO: renamed from: e */
    public final String f9128e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f9129f;

    public C2099l(long j3, long j4, C2097j c2097j, Integer num, String str, ArrayList arrayList) {
        EnumC2110w enumC2110w = EnumC2110w.f9139g;
        this.f9124a = j3;
        this.f9125b = j4;
        this.f9126c = c2097j;
        this.f9127d = num;
        this.f9128e = str;
        this.f9129f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2106s)) {
            return false;
        }
        C2099l c2099l = (C2099l) ((AbstractC2106s) obj);
        if (this.f9124a != c2099l.f9124a) {
            return false;
        }
        if (this.f9125b != c2099l.f9125b) {
            return false;
        }
        if (!this.f9126c.equals(c2099l.f9126c)) {
            return false;
        }
        Integer num = c2099l.f9127d;
        Integer num2 = this.f9127d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = c2099l.f9128e;
        String str2 = this.f9128e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f9129f.equals(c2099l.f9129f)) {
            return false;
        }
        Object obj2 = EnumC2110w.f9139g;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j3 = this.f9124a;
        long j4 = this.f9125b;
        int iHashCode = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ this.f9126c.hashCode()) * 1000003;
        Integer num = this.f9127d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f9128e;
        return EnumC2110w.f9139g.hashCode() ^ ((((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f9129f.hashCode()) * 1000003);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f9124a + ", requestUptimeMs=" + this.f9125b + ", clientInfo=" + this.f9126c + ", logSource=" + this.f9127d + ", logSourceName=" + this.f9128e + ", logEvents=" + this.f9129f + ", qosTier=" + EnumC2110w.f9139g + "}";
    }
}

package p138q1;

import android.util.Base64;
import java.util.Arrays;
import p126n1.EnumC2048c;

/* JADX INFO: renamed from: q1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2174j {

    /* JADX INFO: renamed from: a */
    public final String f9391a;

    /* JADX INFO: renamed from: b */
    public final byte[] f9392b;

    /* JADX INFO: renamed from: c */
    public final EnumC2048c f9393c;

    public C2174j(String str, byte[] bArr, EnumC2048c enumC2048c) {
        this.f9391a = str;
        this.f9392b = bArr;
        this.f9393c = enumC2048c;
    }

    /* JADX INFO: renamed from: a */
    public static C2173i m4761a() {
        C2173i c2173i = new C2173i();
        c2173i.f9390j = EnumC2048c.f8921g;
        return c2173i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2174j) {
            C2174j c2174j = (C2174j) obj;
            if (this.f9391a.equals(c2174j.f9391a) && Arrays.equals(this.f9392b, c2174j.f9392b) && this.f9393c.equals(c2174j.f9393c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f9391a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f9392b)) * 1000003) ^ this.f9393c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f9392b;
        return "TransportContext(" + this.f9391a + ", " + this.f9393c + ", " + (bArr == null ? "" : Base64.encodeToString(bArr, 2)) + ")";
    }
}

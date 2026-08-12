package p138q1;

import java.util.Arrays;
import p126n1.C2047b;

/* JADX INFO: renamed from: q1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2176l {

    /* JADX INFO: renamed from: a */
    public final C2047b f9399a;

    /* JADX INFO: renamed from: b */
    public final byte[] f9400b;

    public C2176l(C2047b c2047b, byte[] bArr) {
        if (c2047b == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f9399a = c2047b;
        this.f9400b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2176l)) {
            return false;
        }
        C2176l c2176l = (C2176l) obj;
        if (this.f9399a.equals(c2176l.f9399a)) {
            return Arrays.equals(this.f9400b, c2176l.f9400b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f9399a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f9400b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f9399a + ", bytes=[...]}";
    }
}

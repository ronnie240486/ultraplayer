package p082b0;

import android.media.metrics.LogSessionId;
import java.util.Objects;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: b0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1071l {

    /* JADX INFO: renamed from: a */
    public final String f4880a;

    /* JADX INFO: renamed from: b */
    public final C1070k f4881b;

    /* JADX INFO: renamed from: c */
    public final Object f4882c;

    static {
        if (AbstractC0632A.f2454a < 31) {
            new C1071l("");
        } else {
            new C1071l(C1070k.f4878b, "");
        }
    }

    public C1071l(String str) {
        AbstractC0646n.m1630h(AbstractC0632A.f2454a < 31);
        this.f4880a = str;
        this.f4881b = null;
        this.f4882c = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1071l)) {
            return false;
        }
        C1071l c1071l = (C1071l) obj;
        return Objects.equals(this.f4880a, c1071l.f4880a) && Objects.equals(this.f4881b, c1071l.f4881b) && Objects.equals(this.f4882c, c1071l.f4882c);
    }

    public final int hashCode() {
        return Objects.hash(this.f4880a, this.f4881b, this.f4882c);
    }

    public C1071l(LogSessionId logSessionId, String str) {
        this(new C1070k(logSessionId), str);
    }

    public C1071l(C1070k c1070k, String str) {
        this.f4881b = c1070k;
        this.f4880a = str;
        this.f4882c = new Object();
    }
}

package p143r2;

import androidx.activity.C0902l;
import java.io.Serializable;
import p163x2.AbstractC2364c;

/* JADX INFO: renamed from: r2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2205c implements Serializable {

    /* JADX INFO: renamed from: g */
    public C0902l f9494g;

    /* JADX INFO: renamed from: h */
    public volatile Object f9495h = C2206d.f9497b;

    /* JADX INFO: renamed from: i */
    public final Object f9496i = this;

    public C2205c(C0902l c0902l) {
        this.f9494g = c0902l;
    }

    /* JADX INFO: renamed from: a */
    public final Object m4778a() {
        Object objMo2290a;
        Object obj = this.f9495h;
        C2206d c2206d = C2206d.f9497b;
        if (obj != c2206d) {
            return obj;
        }
        synchronized (this.f9496i) {
            objMo2290a = this.f9495h;
            if (objMo2290a == c2206d) {
                C0902l c0902l = this.f9494g;
                AbstractC2364c.m4951b(c0902l);
                objMo2290a = c0902l.mo2290a();
                this.f9495h = objMo2290a;
                this.f9494g = null;
            }
        }
        return objMo2290a;
    }

    public final String toString() {
        return this.f9495h != C2206d.f9497b ? String.valueOf(m4778a()) : "Lazy value not initialized yet.";
    }
}

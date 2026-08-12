package p044P;

import android.os.Build;
import android.text.TextUtils;
import p000A.AbstractC0045k;

/* JADX INFO: renamed from: P.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0449a {

    /* JADX INFO: renamed from: a */
    public C0451c f1514a;

    public C0449a(String str, int i3, int i4) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT < 28) {
            this.f1514a = new C0451c(str, i3, i4);
            return;
        }
        C0450b c0450b = new C0450b(str, i3, i4);
        AbstractC0045k.m250u(str, i3, i4);
        this.f1514a = c0450b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0449a)) {
            return false;
        }
        return this.f1514a.equals(((C0449a) obj).f1514a);
    }

    public final int hashCode() {
        return this.f1514a.hashCode();
    }
}

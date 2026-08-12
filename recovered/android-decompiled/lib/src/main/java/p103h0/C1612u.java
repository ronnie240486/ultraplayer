package p103h0;

import android.text.TextUtils;

/* JADX INFO: renamed from: h0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1612u {

    /* JADX INFO: renamed from: a */
    public final String f7334a;

    /* JADX INFO: renamed from: b */
    public final boolean f7335b;

    /* JADX INFO: renamed from: c */
    public final boolean f7336c;

    public C1612u(String str, boolean z3, boolean z4) {
        this.f7334a = str;
        this.f7335b = z3;
        this.f7336c = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == C1612u.class) {
            C1612u c1612u = (C1612u) obj;
            if (TextUtils.equals(this.f7334a, c1612u.f7334a) && this.f7335b == c1612u.f7335b && this.f7336c == c1612u.f7336c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f7334a.hashCode() + 31) * 31) + (this.f7335b ? 1231 : 1237)) * 31) + (this.f7336c ? 1231 : 1237);
    }
}

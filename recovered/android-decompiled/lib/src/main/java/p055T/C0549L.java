package p055T;

import android.util.SparseBooleanArray;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: T.L */
/* JADX INFO: loaded from: classes.dex */
public final class C0549L {

    /* JADX INFO: renamed from: a */
    public final C0581m f1952a;

    static {
        new SparseBooleanArray();
        AbstractC0646n.m1630h(!false);
        AbstractC0632A.m1566G(0);
    }

    public C0549L(C0581m c0581m) {
        this.f1952a = c0581m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0549L) {
            return this.f1952a.equals(((C0549L) obj).f1952a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1952a.hashCode();
    }
}

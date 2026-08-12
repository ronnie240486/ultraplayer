package p055T;

import java.util.Objects;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: T.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0577i {

    /* JADX INFO: renamed from: a */
    public final int f2077a;

    /* JADX INFO: renamed from: b */
    public final int f2078b;

    /* JADX INFO: renamed from: c */
    public final int f2079c;

    /* JADX INFO: renamed from: d */
    public final String f2080d = null;

    static {
        new C0576h(0).m1442a();
        AbstractC0632A.m1566G(0);
        AbstractC0632A.m1566G(1);
        AbstractC0632A.m1566G(2);
        AbstractC0632A.m1566G(3);
    }

    public C0577i(C0576h c0576h) {
        this.f2077a = c0576h.f2074a;
        this.f2078b = c0576h.f2075b;
        this.f2079c = c0576h.f2076c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0577i)) {
            return false;
        }
        C0577i c0577i = (C0577i) obj;
        if (this.f2077a != c0577i.f2077a || this.f2078b != c0577i.f2078b || this.f2079c != c0577i.f2079c) {
            return false;
        }
        int i3 = AbstractC0632A.f2454a;
        return Objects.equals(this.f2080d, c0577i.f2080d);
    }

    public final int hashCode() {
        int i3 = (((((527 + this.f2077a) * 31) + this.f2078b) * 31) + this.f2079c) * 31;
        String str = this.f2080d;
        return i3 + (str == null ? 0 : str.hashCode());
    }
}

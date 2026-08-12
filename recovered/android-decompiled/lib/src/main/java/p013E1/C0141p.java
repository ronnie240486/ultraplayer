package p013E1;

import java.util.Arrays;
import p046P1.AbstractC0491s;

/* JADX INFO: renamed from: E1.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0141p {

    /* JADX INFO: renamed from: a */
    public final long f299a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0141p) {
            return this.f299a == ((C0141p) obj).f299a && AbstractC0491s.m1216h(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f299a), 0, Boolean.FALSE, null});
    }
}

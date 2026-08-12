package p077a0;

import java.util.Arrays;

/* JADX INFO: renamed from: a0.K */
/* JADX INFO: loaded from: classes.dex */
public final class C0800K {

    /* JADX INFO: renamed from: a */
    public final long f3335a;

    /* JADX INFO: renamed from: b */
    public final float f3336b;

    /* JADX INFO: renamed from: c */
    public final long f3337c;

    public C0800K(C0799J c0799j) {
        this.f3335a = c0799j.f3332a;
        this.f3336b = c0799j.f3333b;
        this.f3337c = c0799j.f3334c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0800K)) {
            return false;
        }
        C0800K c0800k = (C0800K) obj;
        return this.f3335a == c0800k.f3335a && this.f3336b == c0800k.f3336b && this.f3337c == c0800k.f3337c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3335a), Float.valueOf(this.f3336b), Long.valueOf(this.f3337c)});
    }
}

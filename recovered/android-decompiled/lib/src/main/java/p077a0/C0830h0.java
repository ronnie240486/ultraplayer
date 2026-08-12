package p077a0;

/* JADX INFO: renamed from: a0.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0830h0 {

    /* JADX INFO: renamed from: c */
    public static final C0830h0 f3516c = new C0830h0(0, false);

    /* JADX INFO: renamed from: a */
    public final int f3517a;

    /* JADX INFO: renamed from: b */
    public final boolean f3518b;

    public C0830h0(int i3, boolean z3) {
        this.f3517a = i3;
        this.f3518b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0830h0.class != obj.getClass()) {
            return false;
        }
        C0830h0 c0830h0 = (C0830h0) obj;
        return this.f3517a == c0830h0.f3517a && this.f3518b == c0830h0.f3518b;
    }

    public final int hashCode() {
        return (this.f3517a << 1) + (this.f3518b ? 1 : 0);
    }
}

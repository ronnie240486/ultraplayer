package p104h1;

/* JADX INFO: renamed from: h1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1642a {

    /* JADX INFO: renamed from: a */
    public int f7450a;

    /* JADX INFO: renamed from: b */
    public int f7451b;

    /* JADX INFO: renamed from: c */
    public int f7452c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1642a)) {
                return false;
            }
            C1642a c1642a = (C1642a) obj;
            int i3 = this.f7450a;
            if (i3 != c1642a.f7450a) {
                return false;
            }
            if (i3 != 8 || Math.abs(this.f7452c - this.f7451b) != 1 || this.f7452c != c1642a.f7451b || this.f7451b != c1642a.f7452c) {
                return this.f7452c == c1642a.f7452c && this.f7451b == c1642a.f7451b;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f7450a * 31) + this.f7451b) * 31) + this.f7452c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i3 = this.f7450a;
        if (i3 == 1) {
            str = "add";
        } else if (i3 == 2) {
            str = "rm";
        } else if (i3 != 4) {
            str = i3 != 8 ? "??" : "mv";
        } else {
            str = "up";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.f7451b);
        sb.append("c:");
        sb.append(this.f7452c);
        sb.append(",p:null]");
        return sb.toString();
    }
}

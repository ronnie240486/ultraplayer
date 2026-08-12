package p058U;

import java.util.Arrays;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: U.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0602b {

    /* JADX INFO: renamed from: e */
    public static final C0602b f2247e = new C0602b(-1, -1, -1);

    /* JADX INFO: renamed from: a */
    public final int f2248a;

    /* JADX INFO: renamed from: b */
    public final int f2249b;

    /* JADX INFO: renamed from: c */
    public final int f2250c;

    /* JADX INFO: renamed from: d */
    public final int f2251d;

    public C0602b(int i3, int i4, int i5) {
        this.f2248a = i3;
        this.f2249b = i4;
        this.f2250c = i5;
        this.f2251d = AbstractC0632A.m1567H(i5) ? AbstractC0632A.m1606y(i5, i4) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0602b)) {
            return false;
        }
        C0602b c0602b = (C0602b) obj;
        return this.f2248a == c0602b.f2248a && this.f2249b == c0602b.f2249b && this.f2250c == c0602b.f2250c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2248a), Integer.valueOf(this.f2249b), Integer.valueOf(this.f2250c)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f2248a + ", channelCount=" + this.f2249b + ", encoding=" + this.f2250c + ']';
    }
}

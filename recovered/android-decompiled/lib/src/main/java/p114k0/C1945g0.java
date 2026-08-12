package p114k0;

import p055T.C0559W;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p105h2.AbstractC1676G;
import p105h2.C1692X;

/* JADX INFO: renamed from: k0.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1945g0 {

    /* JADX INFO: renamed from: d */
    public static final C1945g0 f8525d = new C1945g0(new C0559W[0]);

    /* JADX INFO: renamed from: a */
    public final int f8526a;

    /* JADX INFO: renamed from: b */
    public final C1692X f8527b;

    /* JADX INFO: renamed from: c */
    public int f8528c;

    static {
        AbstractC0632A.m1566G(0);
    }

    public C1945g0(C0559W... c0559wArr) {
        this.f8527b = AbstractC1676G.m4118o(c0559wArr);
        this.f8526a = c0559wArr.length;
        int i3 = 0;
        while (true) {
            C1692X c1692x = this.f8527b;
            if (i3 >= c1692x.f7631j) {
                return;
            }
            int i4 = i3 + 1;
            for (int i5 = i4; i5 < c1692x.f7631j; i5++) {
                if (((C0559W) c1692x.get(i3)).equals(c1692x.get(i5))) {
                    AbstractC0646n.m1636n("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i3 = i4;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0559W m4499a(int i3) {
        return (C0559W) this.f8527b.get(i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1945g0.class != obj.getClass()) {
            return false;
        }
        C1945g0 c1945g0 = (C1945g0) obj;
        return this.f8526a == c1945g0.f8526a && this.f8527b.equals(c1945g0.f8527b);
    }

    public final int hashCode() {
        if (this.f8528c == 0) {
            this.f8528c = this.f8527b.hashCode();
        }
        return this.f8528c;
    }
}

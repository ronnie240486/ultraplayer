package p064W;

import p046P1.C0471D;

/* JADX INFO: renamed from: W.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0644l {

    /* JADX INFO: renamed from: a */
    public final Object f2492a;

    /* JADX INFO: renamed from: b */
    public C0471D f2493b = new C0471D();

    /* JADX INFO: renamed from: c */
    public boolean f2494c;

    /* JADX INFO: renamed from: d */
    public boolean f2495d;

    public C0644l(Object obj) {
        this.f2492a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0644l.class != obj.getClass()) {
            return false;
        }
        return this.f2492a.equals(((C0644l) obj).f2492a);
    }

    public final int hashCode() {
        return this.f2492a.hashCode();
    }
}

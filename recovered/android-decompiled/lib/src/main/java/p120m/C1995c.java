package p120m;

import java.util.Map;

/* JADX INFO: renamed from: m.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1995c implements Map.Entry {

    /* JADX INFO: renamed from: g */
    public final Object f8703g;

    /* JADX INFO: renamed from: h */
    public final Object f8704h;

    /* JADX INFO: renamed from: i */
    public C1995c f8705i;

    /* JADX INFO: renamed from: j */
    public C1995c f8706j;

    public C1995c(Object obj, Object obj2) {
        this.f8703g = obj;
        this.f8704h = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1995c)) {
            return false;
        }
        C1995c c1995c = (C1995c) obj;
        return this.f8703g.equals(c1995c.f8703g) && this.f8704h.equals(c1995c.f8704h);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f8703g;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f8704h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f8703g.hashCode() ^ this.f8704h.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f8703g + "=" + this.f8704h;
    }
}

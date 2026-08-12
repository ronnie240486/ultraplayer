package p123m2;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: m2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2009c {

    /* JADX INFO: renamed from: a */
    public final String f8753a;

    /* JADX INFO: renamed from: b */
    public final Map f8754b;

    public C2009c(String str, Map map) {
        this.f8753a = str;
        this.f8754b = map;
    }

    /* JADX INFO: renamed from: a */
    public static C2009c m4566a(String str) {
        return new C2009c(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2009c)) {
            return false;
        }
        C2009c c2009c = (C2009c) obj;
        return this.f8753a.equals(c2009c.f8753a) && this.f8754b.equals(c2009c.f8754b);
    }

    public final int hashCode() {
        return this.f8754b.hashCode() + (this.f8753a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f8753a + ", properties=" + this.f8754b.values() + "}";
    }
}

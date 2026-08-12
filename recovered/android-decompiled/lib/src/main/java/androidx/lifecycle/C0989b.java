package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.lifecycle.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0989b {

    /* JADX INFO: renamed from: a */
    public final int f4306a;

    /* JADX INFO: renamed from: b */
    public final Method f4307b;

    public C0989b(int i3, Method method) {
        this.f4306a = i3;
        this.f4307b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0989b)) {
            return false;
        }
        C0989b c0989b = (C0989b) obj;
        return this.f4306a == c0989b.f4306a && this.f4307b.getName().equals(c0989b.f4307b.getName());
    }

    public final int hashCode() {
        return this.f4307b.getName().hashCode() + (this.f4306a * 31);
    }
}

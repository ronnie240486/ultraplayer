package p040N1;

import p028J1.InterfaceC0302h;

/* JADX INFO: renamed from: N1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0427h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0302h f1459a;

    public C0427h(InterfaceC0302h interfaceC0302h) {
        this.f1459a = interfaceC0302h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0427h) {
            return this.f1459a == ((C0427h) obj).f1459a;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f1459a) * 31) + 1520230490;
    }
}

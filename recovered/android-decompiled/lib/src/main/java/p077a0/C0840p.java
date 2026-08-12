package p077a0;

import p101g2.InterfaceC1587h;
import p114k0.C1955o;
import p114k0.InterfaceC1966z;

/* JADX INFO: renamed from: a0.p */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0840p implements InterfaceC1587h {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3572g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f3573h;

    public /* synthetic */ C0840p(int i3, Object obj) {
        this.f3572g = i3;
        this.f3573h = obj;
    }

    @Override // p101g2.InterfaceC1587h
    public final Object get() {
        switch (this.f3572g) {
            case 0:
                return (C1955o) this.f3573h;
            case 1:
                return Boolean.valueOf(((C0797H) this.f3573h).f3289I);
            default:
                try {
                    return (InterfaceC1966z) ((Class) this.f3573h).getConstructor(null).newInstance(null);
                } catch (Exception e3) {
                    throw new IllegalStateException(e3);
                }
        }
    }
}

package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.e2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1274e2 implements InterfaceC1354y2 {

    /* JADX INFO: renamed from: b */
    public static final C1274e2 f5899b = new C1274e2(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5900a;

    public /* synthetic */ C1274e2(int i3) {
        this.f5900a = i3;
    }

    @Override // com.google.android.gms.internal.cast.InterfaceC1354y2
    /* JADX INFO: renamed from: a */
    public final C1184H2 mo3247a(Class cls) {
        switch (this.f5900a) {
            case 0:
                if (!AbstractC1282g2.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C1184H2) AbstractC1282g2.m3260k(cls.asSubclass(AbstractC1282g2.class)).mo3096h(3, null);
                } catch (Exception e3) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e3);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.cast.InterfaceC1354y2
    /* JADX INFO: renamed from: b */
    public final boolean mo3248b(Class cls) {
        switch (this.f5900a) {
            case 0:
                return AbstractC1282g2.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}

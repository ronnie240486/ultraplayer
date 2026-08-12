package androidx.lifecycle;

import p163x2.AbstractC2364c;

/* JADX INFO: renamed from: androidx.lifecycle.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1006s {

    /* JADX INFO: renamed from: a */
    public EnumC1000m f4320a;

    /* JADX INFO: renamed from: b */
    public InterfaceC1003p f4321b;

    /* JADX INFO: renamed from: a */
    public final void m2564a(InterfaceC1005r interfaceC1005r, EnumC0999l enumC0999l) {
        EnumC1000m enumC1000mM2563a = enumC0999l.m2563a();
        EnumC1000m enumC1000m = this.f4320a;
        AbstractC2364c.m4954e(enumC1000m, "state1");
        if (enumC1000mM2563a.compareTo(enumC1000m) < 0) {
            enumC1000m = enumC1000mM2563a;
        }
        this.f4320a = enumC1000m;
        this.f4321b.mo2288b(interfaceC1005r, enumC0999l);
        this.f4320a = enumC1000mM2563a;
    }
}

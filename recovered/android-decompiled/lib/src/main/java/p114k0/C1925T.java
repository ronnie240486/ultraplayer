package p114k0;

import android.support.v4.media.session.C0858A;
import p009D0.C0106b;
import p011E.C0111d;
import p034L1.C0352g;
import p055T.C0539B;
import p088d0.InterfaceC1390n;
import p095f0.C1528a;
import p145s0.C2238k;

/* JADX INFO: renamed from: k0.T */
/* JADX INFO: loaded from: classes.dex */
public final class C1925T implements InterfaceC1966z {

    /* JADX INFO: renamed from: a */
    public final C0106b f8416a;

    /* JADX INFO: renamed from: b */
    public final C0111d f8417b;

    /* JADX INFO: renamed from: c */
    public final C0858A f8418c;

    /* JADX INFO: renamed from: d */
    public final C1528a f8419d;

    /* JADX INFO: renamed from: e */
    public final int f8420e;

    public C1925T(C0106b c0106b, C2238k c2238k) {
        C0111d c0111d = new C0111d(20, c2238k);
        C0858A c0858a = new C0858A(18);
        C1528a c1528a = new C1528a(12);
        this.f8416a = c0106b;
        this.f8417b = c0111d;
        this.f8418c = c0858a;
        this.f8419d = c1528a;
        this.f8420e = 1048576;
    }

    @Override // p114k0.InterfaceC1966z
    /* JADX INFO: renamed from: a */
    public final InterfaceC1966z mo2582a(boolean z3) {
        return this;
    }

    @Override // p114k0.InterfaceC1966z
    /* JADX INFO: renamed from: b */
    public final InterfaceC1966z mo2583b(C0352g c0352g) {
        return this;
    }

    @Override // p114k0.InterfaceC1966z
    /* JADX INFO: renamed from: c */
    public final AbstractC1932a mo2584c(C0539B c0539b) {
        c0539b.f1875b.getClass();
        InterfaceC1390n interfaceC1390nM2153A = this.f8418c.m2153A(c0539b);
        C1528a c1528a = this.f8419d;
        return new C1926U(c0539b, this.f8416a, this.f8417b, interfaceC1390nM2153A, c1528a, this.f8420e, false);
    }
}

package androidx.media3.exoplayer.hls;

import android.support.v4.media.session.C0858A;
import com.google.android.gms.internal.cast.C1323r;
import java.util.List;
import p034L1.C0352g;
import p055T.C0539B;
import p070Y.InterfaceC0710g;
import p082b0.C1063d;
import p088d0.InterfaceC1390n;
import p089d1.C1447t;
import p092e0.C1498c;
import p092e0.C1507l;
import p095f0.C1528a;
import p095f0.C1531d;
import p095f0.InterfaceC1544q;
import p114k0.AbstractC1932a;
import p114k0.InterfaceC1966z;

/* JADX INFO: loaded from: classes.dex */
public final class HlsMediaSource$Factory implements InterfaceC1966z {

    /* JADX INFO: renamed from: a */
    public final C1447t f4354a;

    /* JADX INFO: renamed from: b */
    public C1498c f4355b;

    /* JADX INFO: renamed from: c */
    public C0352g f4356c;

    /* JADX INFO: renamed from: h */
    public final C0858A f4361h = new C0858A(18);

    /* JADX INFO: renamed from: e */
    public final C1528a f4358e = new C1528a(0);

    /* JADX INFO: renamed from: f */
    public final C1063d f4359f = C1531d.f6902u;

    /* JADX INFO: renamed from: i */
    public final C1528a f4362i = new C1528a(12);

    /* JADX INFO: renamed from: g */
    public final C1528a f4360g = new C1528a(8);

    /* JADX INFO: renamed from: k */
    public final int f4364k = 1;

    /* JADX INFO: renamed from: l */
    public final long f4365l = -9223372036854775807L;

    /* JADX INFO: renamed from: j */
    public final boolean f4363j = true;

    /* JADX INFO: renamed from: d */
    public boolean f4357d = true;

    public HlsMediaSource$Factory(InterfaceC0710g interfaceC0710g) {
        this.f4354a = new C1447t(3, interfaceC0710g);
    }

    @Override // p114k0.InterfaceC1966z
    /* JADX INFO: renamed from: a */
    public final InterfaceC1966z mo2582a(boolean z3) {
        this.f4357d = z3;
        return this;
    }

    @Override // p114k0.InterfaceC1966z
    /* JADX INFO: renamed from: b */
    public final InterfaceC1966z mo2583b(C0352g c0352g) {
        this.f4356c = c0352g;
        return this;
    }

    @Override // p114k0.InterfaceC1966z
    /* JADX INFO: renamed from: c */
    public final AbstractC1932a mo2584c(C0539B c0539b) {
        c0539b.f1875b.getClass();
        if (this.f4355b == null) {
            C1498c c1498c = new C1498c();
            c1498c.f6656a = new C0352g(12);
            this.f4355b = c1498c;
        }
        C0352g c0352g = this.f4356c;
        if (c0352g != null) {
            this.f4355b.f6656a = c0352g;
        }
        C1498c c1498c2 = this.f4355b;
        c1498c2.f6657b = this.f4357d;
        InterfaceC1544q c1323r = this.f4358e;
        List list = c0539b.f1875b.f2202d;
        if (!list.isEmpty()) {
            c1323r = new C1323r(c1323r, 3, list);
        }
        InterfaceC1390n interfaceC1390nM2153A = this.f4361h.m2153A(c0539b);
        C1528a c1528a = this.f4362i;
        this.f4359f.getClass();
        C1447t c1447t = this.f4354a;
        return new C1507l(c0539b, c1447t, c1498c2, this.f4360g, interfaceC1390nM2153A, c1528a, new C1531d(c1447t, c1528a, c1323r), this.f4365l, this.f4363j, this.f4364k);
    }
}

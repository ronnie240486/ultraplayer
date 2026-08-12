package p114k0;

import java.io.IOException;
import p036M0.C0380q;
import p064W.InterfaceC0636d;

/* JADX INFO: renamed from: k0.D */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1910D implements InterfaceC0636d {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0380q f8320g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1958r f8321h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1963w f8322i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ IOException f8323j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f8324k;

    public /* synthetic */ C1910D(C0380q c0380q, C1958r c1958r, C1963w c1963w, IOException iOException, boolean z3) {
        this.f8320g = c0380q;
        this.f8321h = c1958r;
        this.f8322i = c1963w;
        this.f8323j = iOException;
        this.f8324k = z3;
    }

    @Override // p064W.InterfaceC0636d
    /* JADX INFO: renamed from: b */
    public final void mo545b(Object obj) {
        InterfaceC1913G interfaceC1913G = (InterfaceC1913G) obj;
        C0380q c0380q = this.f8320g;
        interfaceC1913G.mo2039g(c0380q.f1291h, (C1907A) c0380q.f1292i, this.f8321h, this.f8322i, this.f8323j, this.f8324k);
    }
}

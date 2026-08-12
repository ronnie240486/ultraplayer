package p114k0;

import p036M0.C0380q;
import p064W.InterfaceC0636d;

/* JADX INFO: renamed from: k0.C */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1909C implements InterfaceC0636d {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f8316g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0380q f8317h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1958r f8318i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1963w f8319j;

    public /* synthetic */ C1909C(C0380q c0380q, C1958r c1958r, C1963w c1963w, int i3) {
        this.f8316g = i3;
        this.f8317h = c0380q;
        this.f8318i = c1958r;
        this.f8319j = c1963w;
    }

    @Override // p064W.InterfaceC0636d
    /* JADX INFO: renamed from: b */
    public final void mo545b(Object obj) {
        InterfaceC1913G interfaceC1913G = (InterfaceC1913G) obj;
        switch (this.f8316g) {
            case 0:
                C0380q c0380q = this.f8317h;
                interfaceC1913G.mo2043s(c0380q.f1291h, (C1907A) c0380q.f1292i, this.f8318i, this.f8319j);
                break;
            case 1:
                C0380q c0380q2 = this.f8317h;
                interfaceC1913G.mo2041n(c0380q2.f1291h, (C1907A) c0380q2.f1292i, this.f8318i, this.f8319j);
                break;
            default:
                C0380q c0380q3 = this.f8317h;
                interfaceC1913G.mo2035G(c0380q3.f1291h, (C1907A) c0380q3.f1292i, this.f8318i, this.f8319j);
                break;
        }
    }
}

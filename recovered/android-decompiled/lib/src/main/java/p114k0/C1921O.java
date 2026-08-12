package p114k0;

import java.io.IOException;
import p009D0.C0106b;
import p073Z.C0771f;
import p088d0.C1383g;
import p088d0.InterfaceC1384h;
import p129o0.C2074n;
import p129o0.HandlerC2070j;

/* JADX INFO: renamed from: k0.O */
/* JADX INFO: loaded from: classes.dex */
public final class C1921O implements InterfaceC1931Z {

    /* JADX INFO: renamed from: g */
    public final int f8369g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1923Q f8370h;

    public C1921O(C1923Q c1923q, int i3) {
        this.f8370h = c1923q;
        this.f8369g = i3;
    }

    @Override // p114k0.InterfaceC1931Z
    /* JADX INFO: renamed from: h */
    public final boolean mo3786h() {
        C1923Q c1923q = this.f8370h;
        return !c1923q.m4447F() && c1923q.f8415z[this.f8369g].m4478u(c1923q.f8394T);
    }

    @Override // p114k0.InterfaceC1931Z
    /* JADX INFO: renamed from: n */
    public final int mo3787n(C0106b c0106b, C0771f c0771f, int i3) {
        C1923Q c1923q = this.f8370h;
        if (c1923q.m4447F()) {
            return -3;
        }
        int i4 = this.f8369g;
        c1923q.m4442A(i4);
        int iM4482y = c1923q.f8415z[i4].m4482y(c0106b, c0771f, i3, c1923q.f8394T);
        if (iM4482y == -3) {
            c1923q.m4443B(i4);
        }
        return iM4482y;
    }

    @Override // p114k0.InterfaceC1931Z
    /* JADX INFO: renamed from: u */
    public final void mo3788u() throws IOException {
        C1923Q c1923q = this.f8370h;
        C1930Y c1930y = c1923q.f8415z[this.f8369g];
        InterfaceC1384h interfaceC1384h = c1930y.f8456h;
        if (interfaceC1384h != null && interfaceC1384h.mo3460a() == 1) {
            C1383g c1383gMo3466g = c1930y.f8456h.mo3466g();
            c1383gMo3466g.getClass();
            throw c1383gMo3466g;
        }
        int iM3824B = c1923q.f8399j.m3824B(c1923q.f8384J);
        C2074n c2074n = c1923q.f8407r;
        IOException iOException = c2074n.f9011c;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC2070j handlerC2070j = c2074n.f9010b;
        if (handlerC2070j != null) {
            if (iM3824B == Integer.MIN_VALUE) {
                iM3824B = handlerC2070j.f8996g;
            }
            IOException iOException2 = handlerC2070j.f9000k;
            if (iOException2 != null && handlerC2070j.f9001l > iM3824B) {
                throw iOException2;
            }
        }
    }

    @Override // p114k0.InterfaceC1931Z
    /* JADX INFO: renamed from: v */
    public final int mo3789v(long j3) {
        C1923Q c1923q = this.f8370h;
        if (c1923q.m4447F()) {
            return 0;
        }
        int i3 = this.f8369g;
        c1923q.m4442A(i3);
        C1930Y c1930y = c1923q.f8415z[i3];
        int iM4476s = c1930y.m4476s(j3, c1923q.f8394T);
        c1930y.m4464D(iM4476s);
        if (iM4476s == 0) {
            c1923q.m4443B(i3);
        }
        return iM4476s;
    }
}

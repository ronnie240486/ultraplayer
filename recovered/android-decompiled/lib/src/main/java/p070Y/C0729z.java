package p070Y;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: Y.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0729z implements InterfaceC0711h {

    /* JADX INFO: renamed from: g */
    public final InterfaceC0711h f2783g;

    /* JADX INFO: renamed from: h */
    public long f2784h;

    /* JADX INFO: renamed from: i */
    public Uri f2785i;

    public C0729z(InterfaceC0711h interfaceC0711h) {
        interfaceC0711h.getClass();
        this.f2783g = interfaceC0711h;
        this.f2785i = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: a */
    public final long mo1827a(C0715l c0715l) {
        InterfaceC0711h interfaceC0711h = this.f2783g;
        this.f2785i = c0715l.f2735a;
        Map map = Collections.EMPTY_MAP;
        try {
            return interfaceC0711h.mo1827a(c0715l);
        } finally {
            Uri uriMo1828h = interfaceC0711h.mo1828h();
            if (uriMo1828h != null) {
                this.f2785i = uriMo1828h;
            }
            interfaceC0711h.mo1833m();
        }
    }

    @Override // p070Y.InterfaceC0711h
    public final void close() {
        this.f2783g.close();
    }

    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: e */
    public final void mo1830e(InterfaceC0701A interfaceC0701A) {
        interfaceC0701A.getClass();
        this.f2783g.mo1830e(interfaceC0701A);
    }

    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: h */
    public final Uri mo1828h() {
        return this.f2783g.mo1828h();
    }

    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: m */
    public final Map mo1833m() {
        return this.f2783g.mo1833m();
    }

    @Override // p055T.InterfaceC0575g
    /* JADX INFO: renamed from: q */
    public final int mo345q(byte[] bArr, int i3, int i4) {
        int iMo345q = this.f2783g.mo345q(bArr, i3, i4);
        if (iMo345q != -1) {
            this.f2784h += (long) iMo345q;
        }
        return iMo345q;
    }
}

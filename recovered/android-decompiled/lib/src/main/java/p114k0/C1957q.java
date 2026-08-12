package p114k0;

import android.net.Uri;
import java.util.Map;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p070Y.C0715l;
import p070Y.InterfaceC0701A;
import p070Y.InterfaceC0711h;
import p145s0.InterfaceC2226E;

/* JADX INFO: renamed from: k0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1957q implements InterfaceC0711h {

    /* JADX INFO: renamed from: g */
    public final InterfaceC0711h f8558g;

    /* JADX INFO: renamed from: h */
    public final int f8559h;

    /* JADX INFO: renamed from: i */
    public final C1920N f8560i;

    /* JADX INFO: renamed from: j */
    public final byte[] f8561j;

    /* JADX INFO: renamed from: k */
    public int f8562k;

    public C1957q(InterfaceC0711h interfaceC0711h, int i3, C1920N c1920n) {
        AbstractC0646n.m1625c(i3 > 0);
        this.f8558g = interfaceC0711h;
        this.f8559h = i3;
        this.f8560i = c1920n;
        this.f8561j = new byte[1];
        this.f8562k = i3;
    }

    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: a */
    public final long mo1827a(C0715l c0715l) {
        throw new UnsupportedOperationException();
    }

    @Override // p070Y.InterfaceC0711h
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: e */
    public final void mo1830e(InterfaceC0701A interfaceC0701A) {
        interfaceC0701A.getClass();
        this.f8558g.mo1830e(interfaceC0701A);
    }

    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: h */
    public final Uri mo1828h() {
        return this.f8558g.mo1828h();
    }

    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: m */
    public final Map mo1833m() {
        return this.f8558g.mo1833m();
    }

    @Override // p055T.InterfaceC0575g
    /* JADX INFO: renamed from: q */
    public final int mo345q(byte[] bArr, int i3, int i4) {
        int i5 = this.f8562k;
        InterfaceC0711h interfaceC0711h = this.f8558g;
        if (i5 == 0) {
            byte[] bArr2 = this.f8561j;
            int i6 = 0;
            if (interfaceC0711h.mo345q(bArr2, 0, 1) != -1) {
                int i7 = (bArr2[0] & 255) << 4;
                if (i7 != 0) {
                    byte[] bArr3 = new byte[i7];
                    int i8 = i7;
                    while (i8 > 0) {
                        int iMo345q = interfaceC0711h.mo345q(bArr3, i6, i8);
                        if (iMo345q != -1) {
                            i6 += iMo345q;
                            i8 -= iMo345q;
                        }
                    }
                    while (i7 > 0 && bArr3[i7 - 1] == 0) {
                        i7--;
                    }
                    if (i7 > 0) {
                        C0651s c0651s = new C0651s(bArr3, i7);
                        C1920N c1920n = this.f8560i;
                        long jMax = !c1920n.f8367l ? c1920n.f8364i : Math.max(c1920n.f8368m.m4450x(true), c1920n.f8364i);
                        int iM1667a = c0651s.m1667a();
                        InterfaceC2226E interfaceC2226E = c1920n.f8366k;
                        interfaceC2226E.getClass();
                        interfaceC2226E.mo1173b(iM1667a, c0651s);
                        interfaceC2226E.mo1172a(jMax, 1, iM1667a, 0, null);
                        c1920n.f8367l = true;
                    }
                }
                this.f8562k = this.f8559h;
            }
            return -1;
        }
        int iMo345q2 = interfaceC0711h.mo345q(bArr, i3, Math.min(this.f8562k, i4));
        if (iMo345q2 != -1) {
            this.f8562k -= iMo345q2;
        }
        return iMo345q2;
    }
}

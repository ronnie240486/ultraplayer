package p145s0;

import java.io.EOFException;
import p055T.C0583o;
import p055T.InterfaceC0575g;
import p064W.C0651s;

/* JADX INFO: renamed from: s0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2239l implements InterfaceC2226E {

    /* JADX INFO: renamed from: a */
    public final byte[] f9640a = new byte[4096];

    @Override // p145s0.InterfaceC2226E
    /* JADX INFO: renamed from: b */
    public final void mo1173b(int i3, C0651s c0651s) {
        c0651s.m1666H(i3);
    }

    @Override // p145s0.InterfaceC2226E
    /* JADX INFO: renamed from: c */
    public final int mo1174c(InterfaceC0575g interfaceC0575g, int i3, boolean z3) {
        return mo1177f(interfaceC0575g, i3, z3);
    }

    @Override // p145s0.InterfaceC2226E
    /* JADX INFO: renamed from: d */
    public final void mo1175d(C0651s c0651s, int i3, int i4) {
        c0651s.m1666H(i3);
    }

    @Override // p145s0.InterfaceC2226E
    /* JADX INFO: renamed from: f */
    public final int mo1177f(InterfaceC0575g interfaceC0575g, int i3, boolean z3) throws EOFException {
        byte[] bArr = this.f9640a;
        int iMo345q = interfaceC0575g.mo345q(bArr, 0, Math.min(bArr.length, i3));
        if (iMo345q != -1) {
            return iMo345q;
        }
        if (z3) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p145s0.InterfaceC2226E
    /* JADX INFO: renamed from: e */
    public final void mo1176e(C0583o c0583o) {
    }

    @Override // p145s0.InterfaceC2226E
    /* JADX INFO: renamed from: a */
    public final void mo1172a(long j3, int i3, int i4, int i5, C2225D c2225d) {
    }
}

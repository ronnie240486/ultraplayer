package p092e0;

import java.util.Arrays;
import p060U1.AbstractC0610a;
import p117l0.AbstractC1972a;

/* JADX INFO: renamed from: e0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1500e extends AbstractC1972a {

    /* JADX INFO: renamed from: j */
    public byte[] f6658j;

    /* JADX INFO: renamed from: k */
    public volatile boolean f6659k;

    /* JADX INFO: renamed from: l */
    public byte[] f6660l;

    @Override // p129o0.InterfaceC2071k
    /* JADX INFO: renamed from: a */
    public final void mo3742a() {
        try {
            this.f8609i.mo1827a(this.f8602b);
            int iMo345q = 0;
            int i3 = 0;
            while (iMo345q != -1 && !this.f6659k) {
                byte[] bArr = this.f6658j;
                if (bArr.length < i3 + 16384) {
                    this.f6658j = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                iMo345q = this.f8609i.mo345q(this.f6658j, i3, 16384);
                if (iMo345q != -1) {
                    i3 += iMo345q;
                }
            }
            if (!this.f6659k) {
                this.f6660l = Arrays.copyOf(this.f6658j, i3);
            }
        } finally {
            AbstractC0610a.m1504f(this.f8609i);
        }
    }

    @Override // p129o0.InterfaceC2071k
    /* JADX INFO: renamed from: b */
    public final void mo3743b() {
        this.f6659k = true;
    }
}

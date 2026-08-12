package p145s0;

import p064W.AbstractC0646n;

/* JADX INFO: renamed from: s0.F */
/* JADX INFO: loaded from: classes.dex */
public final class C2227F {

    /* JADX INFO: renamed from: a */
    public final byte[] f9555a = new byte[10];

    /* JADX INFO: renamed from: b */
    public boolean f9556b;

    /* JADX INFO: renamed from: c */
    public int f9557c;

    /* JADX INFO: renamed from: d */
    public long f9558d;

    /* JADX INFO: renamed from: e */
    public int f9559e;

    /* JADX INFO: renamed from: f */
    public int f9560f;

    /* JADX INFO: renamed from: g */
    public int f9561g;

    /* JADX INFO: renamed from: a */
    public final void m4803a(InterfaceC2226E interfaceC2226E, C2225D c2225d) {
        if (this.f9557c > 0) {
            interfaceC2226E.mo1172a(this.f9558d, this.f9559e, this.f9560f, this.f9561g, c2225d);
            this.f9557c = 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4804b(InterfaceC2226E interfaceC2226E, long j3, int i3, int i4, int i5, C2225D c2225d) {
        AbstractC0646n.m1629g("TrueHD chunk samples must be contiguous in the sample queue.", this.f9561g <= i4 + i5);
        if (this.f9556b) {
            int i6 = this.f9557c;
            int i7 = i6 + 1;
            this.f9557c = i7;
            if (i6 == 0) {
                this.f9558d = j3;
                this.f9559e = i3;
                this.f9560f = 0;
            }
            this.f9560f += i4;
            this.f9561g = i5;
            if (i7 >= 16) {
                m4803a(interfaceC2226E, c2225d);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4805c(InterfaceC2241n interfaceC2241n) {
        if (this.f9556b) {
            return;
        }
        byte[] bArr = this.f9555a;
        int i3 = 0;
        interfaceC2241n.mo342n(bArr, 0, 10);
        interfaceC2241n.mo334c();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b3 = bArr[7];
            if ((b3 & 254) == 186) {
                i3 = 40 << ((bArr[(b3 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i3 == 0) {
            return;
        }
        this.f9556b = true;
    }
}

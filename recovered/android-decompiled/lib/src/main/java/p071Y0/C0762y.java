package p071Y0;

import p055T.C0587s;
import p064W.AbstractC0646n;
import p145s0.C2231d;
import p145s0.C2232e;
import p145s0.C2234g;
import p145s0.C2237j;
import p145s0.InterfaceC2233f;
import p145s0.InterfaceC2235h;

/* JADX INFO: renamed from: Y0.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0762y {

    /* JADX INFO: renamed from: a */
    public final C2231d f3114a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2235h f3115b;

    /* JADX INFO: renamed from: c */
    public C2232e f3116c;

    /* JADX INFO: renamed from: d */
    public final int f3117d;

    public C0762y(InterfaceC2233f interfaceC2233f, InterfaceC2235h interfaceC2235h, long j3, long j4, long j5, long j6, long j7, int i3) {
        this.f3115b = interfaceC2235h;
        this.f3117d = i3;
        this.f3114a = new C2231d(interfaceC2233f, j3, j4, j5, j6, j7);
    }

    /* JADX INFO: renamed from: a */
    public static int m1876a(byte[] bArr, int i3) {
        return (bArr[i3 + 3] & 255) | ((bArr[i3] & 255) << 24) | ((bArr[i3 + 1] & 255) << 16) | ((bArr[i3 + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: c */
    public static int m1877c(C2237j c2237j, long j3, C0587s c0587s) {
        if (j3 == c2237j.f9629j) {
            return 0;
        }
        c0587s.f2181a = j3;
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public final int m1878b(C2237j c2237j, C0587s c0587s) {
        while (true) {
            C2232e c2232e = this.f3116c;
            AbstractC0646n.m1631i(c2232e);
            long j3 = c2232e.f9613f;
            long j4 = c2232e.f9614g;
            long j5 = c2232e.f9615h;
            long j6 = j4 - j3;
            long j7 = this.f3117d;
            InterfaceC2235h interfaceC2235h = this.f3115b;
            if (j6 <= j7) {
                this.f3116c = null;
                interfaceC2235h.mo522j();
                return m1877c(c2237j, j3, c0587s);
            }
            long j8 = j5 - c2237j.f9629j;
            if (j8 < 0 || j8 > 262144) {
                return m1877c(c2237j, j5, c0587s);
            }
            c2237j.mo335d((int) j8);
            c2237j.f9631l = 0;
            C2234g c2234gMo517e = interfaceC2235h.mo517e(c2237j, c2232e.f9609b);
            int i3 = c2234gMo517e.f9617a;
            if (i3 == -3) {
                this.f3116c = null;
                interfaceC2235h.mo522j();
                return m1877c(c2237j, j5, c0587s);
            }
            long j9 = c2234gMo517e.f9618b;
            long j10 = c2234gMo517e.f9619c;
            if (i3 == -2) {
                c2232e.f9611d = j9;
                c2232e.f9613f = j10;
                c2232e.f9615h = C2232e.m4830a(c2232e.f9609b, j9, c2232e.f9612e, j10, c2232e.f9614g, c2232e.f9610c);
            } else {
                if (i3 != -1) {
                    if (i3 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long j11 = j10 - c2237j.f9629j;
                    if (j11 >= 0 && j11 <= 262144) {
                        c2237j.mo335d((int) j11);
                    }
                    this.f3116c = null;
                    interfaceC2235h.mo522j();
                    return m1877c(c2237j, j10, c0587s);
                }
                c2232e.f9612e = j9;
                c2232e.f9614g = j10;
                c2232e.f9615h = C2232e.m4830a(c2232e.f9609b, c2232e.f9611d, j9, c2232e.f9613f, j10, c2232e.f9610c);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1879d(long j3) {
        C2232e c2232e = this.f3116c;
        if (c2232e == null || c2232e.f9608a != j3) {
            C2231d c2231d = this.f3114a;
            this.f3116c = new C2232e(j3, c2231d.f9602a.mo547d(j3), c2231d.f9604c, c2231d.f9605d, c2231d.f9606e, c2231d.f9607f);
        }
    }
}

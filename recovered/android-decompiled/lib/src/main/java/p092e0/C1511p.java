package p092e0;

import java.util.Map;
import p018G0.C0223m;
import p055T.C0544G;
import p055T.C0579k;
import p055T.C0582n;
import p055T.C0583o;
import p055T.InterfaceC0543F;
import p088d0.C1387k;
import p088d0.InterfaceC1390n;
import p114k0.C1930Y;
import p129o0.C2065e;

/* JADX INFO: renamed from: e0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1511p extends C1930Y {

    /* JADX INFO: renamed from: H */
    public final Map f6764H;

    /* JADX INFO: renamed from: I */
    public C0579k f6765I;

    public C1511p(C2065e c2065e, InterfaceC1390n interfaceC1390n, C1387k c1387k, Map map) {
        super(c2065e, interfaceC1390n, c1387k);
        this.f6764H = map;
    }

    @Override // p114k0.C1930Y
    /* JADX INFO: renamed from: m */
    public final C0583o mo3790m(C0583o c0583o) {
        C0579k c0579k;
        C0579k c0579k2 = this.f6765I;
        if (c0579k2 == null) {
            c0579k2 = c0583o.f2158r;
        }
        if (c0579k2 != null && (c0579k = (C0579k) this.f6764H.get(c0579k2.f2088i)) != null) {
            c0579k2 = c0579k;
        }
        C0544G c0544g = c0583o.f2152l;
        C0544G c0544g2 = null;
        if (c0544g == null) {
            c0544g = c0544g2;
        } else {
            InterfaceC0543F[] interfaceC0543FArr = c0544g.f1940g;
            int length = interfaceC0543FArr.length;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    i4 = -1;
                    break;
                }
                InterfaceC0543F interfaceC0543F = interfaceC0543FArr[i4];
                if ((interfaceC0543F instanceof C0223m) && "com.apple.streaming.transportStreamTimestamp".equals(((C0223m) interfaceC0543F).f519h)) {
                    break;
                }
                i4++;
            }
            if (i4 != -1) {
                if (length != 1) {
                    InterfaceC0543F[] interfaceC0543FArr2 = new InterfaceC0543F[length - 1];
                    while (i3 < length) {
                        if (i3 != i4) {
                            interfaceC0543FArr2[i3 < i4 ? i3 : i3 - 1] = interfaceC0543FArr[i3];
                        }
                        i3++;
                    }
                    c0544g2 = new C0544G(interfaceC0543FArr2);
                }
                c0544g = c0544g2;
            }
        }
        if (c0579k2 != c0583o.f2158r || c0544g != c0583o.f2152l) {
            C0582n c0582nM1447a = c0583o.m1447a();
            c0582nM1447a.f2118q = c0579k2;
            c0582nM1447a.f2112k = c0544g;
            c0583o = new C0583o(c0582nM1447a);
        }
        return super.mo3790m(c0583o);
    }
}

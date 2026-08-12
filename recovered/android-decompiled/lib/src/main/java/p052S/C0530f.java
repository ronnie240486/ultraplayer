package p052S;

import p019G1.C0242q;
import p037M1.InterfaceC0398k;
import p037M1.InterfaceC0399l;
import p064W.AbstractC0646n;
import p122m1.AbstractC2003a;

/* JADX INFO: renamed from: S.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0530f implements InterfaceC0399l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1814a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0532h f1815b;

    public /* synthetic */ C0530f(C0532h c0532h, int i3) {
        this.f1814a = i3;
        this.f1815b = c0532h;
    }

    @Override // p037M1.InterfaceC0399l
    /* JADX INFO: renamed from: a */
    public final void mo778a(InterfaceC0398k interfaceC0398k) {
        switch (this.f1814a) {
            case 0:
                C0532h c0532h = this.f1815b;
                if (c0532h.f1834p != null) {
                    c0532h.m1313k0(this);
                    c0532h.f1829k.m1617b();
                }
                break;
            case 1:
                C0532h c0532h2 = this.f1815b;
                if (c0532h2.f1834p != null) {
                    c0532h2.m1311j0(this);
                    c0532h2.f1829k.m1617b();
                }
                break;
            case 2:
                C0532h c0532h3 = this.f1815b;
                if (c0532h3.f1834p != null) {
                    c0532h3.m1315l0(this);
                    c0532h3.f1829k.m1617b();
                }
                break;
            default:
                int i3 = ((C0242q) interfaceC0398k).mo774d().f5497g;
                if (i3 != 0 && i3 != 2103) {
                    AbstractC0646n.m1635m("CastPlayer", "Seek failed. Error code " + i3 + ": " + AbstractC2003a.m4541n(i3));
                }
                C0532h c0532h4 = this.f1815b;
                int i4 = c0532h4.f1841w - 1;
                c0532h4.f1841w = i4;
                if (i4 == 0) {
                    c0532h4.f1839u = c0532h4.f1842x;
                    c0532h4.f1842x = -1;
                    c0532h4.f1843y = -9223372036854775807L;
                }
                break;
        }
    }
}

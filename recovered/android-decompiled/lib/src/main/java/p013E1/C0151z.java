package p013E1;

import p028J1.C0296b;
import p028J1.C0300f;
import p028J1.C0319y;
import p040N1.InterfaceC0430k;
import p097f2.C1560d;

/* JADX INFO: renamed from: E1.z */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0151z implements InterfaceC0430k {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ C0151z f357h = new C0151z(0);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ C0151z f358i = new C0151z(1);

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f359g;

    public /* synthetic */ C0151z(int i3) {
        this.f359g = i3;
    }

    @Override // p040N1.InterfaceC0430k
    /* JADX INFO: renamed from: m */
    public final void mo165m(Object obj, Object obj2) {
        C0319y c0319y = (C0319y) obj;
        C1560d c1560d = (C1560d) obj2;
        switch (this.f359g) {
            case 0:
                C0296b c0296b = C0125H.f181F;
                ((C0300f) c0319y.m3090r()).m835w0();
                c1560d.m3879b(null);
                break;
            default:
                C0296b c0296b2 = C0125H.f181F;
                C0300f c0300f = (C0300f) c0319y.m3090r();
                c0300f.m1897v0(c0300f.m1894e0(), 19);
                c1560d.m3879b(Boolean.TRUE);
                break;
        }
    }
}

package p040N1;

import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
import p009D0.C0106b;
import p013E1.RunnableC0121D;
import p034L1.C0346a;
import p040N1.C0437r;
import p045P0.AbstractC0462h;
import p046P1.InterfaceC0474b;
import p077a0.C0840p;
import p101g2.InterfaceC1587h;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1692X;
import p105h2.C1700c0;
import p114k0.InterfaceC1966z;
import p145s0.C2238k;

/* JADX INFO: renamed from: N1.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0437r implements InterfaceC0474b {

    /* JADX INFO: renamed from: b */
    public Object f1484b;

    /* JADX INFO: renamed from: c */
    public Object f1485c;

    /* JADX INFO: renamed from: e */
    public Object f1487e;

    /* JADX INFO: renamed from: f */
    public Object f1488f;

    /* JADX INFO: renamed from: d */
    public Object f1486d = C1700c0.f7651m;

    /* JADX INFO: renamed from: a */
    public boolean f1483a = true;

    public C0437r() {
        C1674E c1674e = AbstractC1676G.f7601h;
        this.f1487e = C1692X.f7629k;
    }

    @Override // p046P1.InterfaceC0474b
    /* JADX INFO: renamed from: a */
    public void mo1149a(C0346a c0346a) {
        ((C0424e) this.f1488f).f1457s.post(new RunnableC0121D(this, c0346a, 4, false));
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC1587h m1150b(int i3) {
        InterfaceC1587h c0840p;
        final int i4 = 3;
        final int i5 = 1;
        final int i6 = 2;
        HashMap map = (HashMap) this.f1485c;
        InterfaceC1587h interfaceC1587h = (InterfaceC1587h) map.get(Integer.valueOf(i3));
        if (interfaceC1587h != null) {
            return interfaceC1587h;
        }
        final C0106b c0106b = (C0106b) this.f1487e;
        c0106b.getClass();
        if (i3 == 0) {
            final GenericDeclaration genericDeclarationAsSubclass = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(InterfaceC1966z.class);
            final int i7 = 0;
            c0840p = new InterfaceC1587h() { // from class: k0.n
                @Override // p101g2.InterfaceC1587h
                public final Object get() {
                    switch (i7) {
                        case 0:
                            return C1955o.m4508d((Class) genericDeclarationAsSubclass, c0106b);
                        case 1:
                            return C1955o.m4508d((Class) genericDeclarationAsSubclass, c0106b);
                        case 2:
                            return C1955o.m4508d((Class) genericDeclarationAsSubclass, c0106b);
                        default:
                            return new C1925T(c0106b, (C2238k) ((C0437r) genericDeclarationAsSubclass).f1484b);
                    }
                }
            };
        } else if (i3 == 1) {
            final GenericDeclaration genericDeclarationAsSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(InterfaceC1966z.class);
            c0840p = new InterfaceC1587h() { // from class: k0.n
                @Override // p101g2.InterfaceC1587h
                public final Object get() {
                    switch (i5) {
                        case 0:
                            return C1955o.m4508d((Class) genericDeclarationAsSubclass2, c0106b);
                        case 1:
                            return C1955o.m4508d((Class) genericDeclarationAsSubclass2, c0106b);
                        case 2:
                            return C1955o.m4508d((Class) genericDeclarationAsSubclass2, c0106b);
                        default:
                            return new C1925T(c0106b, (C2238k) ((C0437r) genericDeclarationAsSubclass2).f1484b);
                    }
                }
            };
        } else if (i3 == 2) {
            final Class clsAsSubclass = HlsMediaSource$Factory.class.asSubclass(InterfaceC1966z.class);
            c0840p = new InterfaceC1587h() { // from class: k0.n
                @Override // p101g2.InterfaceC1587h
                public final Object get() {
                    switch (i6) {
                        case 0:
                            return C1955o.m4508d((Class) clsAsSubclass, c0106b);
                        case 1:
                            return C1955o.m4508d((Class) clsAsSubclass, c0106b);
                        case 2:
                            return C1955o.m4508d((Class) clsAsSubclass, c0106b);
                        default:
                            return new C1925T(c0106b, (C2238k) ((C0437r) clsAsSubclass).f1484b);
                    }
                }
            };
        } else if (i3 == 3) {
            c0840p = new C0840p(i6, Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(InterfaceC1966z.class));
        } else {
            if (i3 != 4) {
                throw new IllegalArgumentException(AbstractC0462h.m1165e(i3, "Unrecognized contentType: "));
            }
            c0840p = new InterfaceC1587h() { // from class: k0.n
                @Override // p101g2.InterfaceC1587h
                public final Object get() {
                    switch (i4) {
                        case 0:
                            return C1955o.m4508d((Class) this, c0106b);
                        case 1:
                            return C1955o.m4508d((Class) this, c0106b);
                        case 2:
                            return C1955o.m4508d((Class) this, c0106b);
                        default:
                            return new C1925T(c0106b, (C2238k) ((C0437r) this).f1484b);
                    }
                }
            };
        }
        map.put(Integer.valueOf(i3), c0840p);
        return c0840p;
    }

    /* JADX INFO: renamed from: c */
    public void m1151c(C0346a c0346a) {
        C0435p c0435p = (C0435p) ((C0424e) this.f1488f).f1454p.get((C0421b) this.f1485c);
        if (c0435p != null) {
            c0435p.m1147n(c0346a);
        }
    }
}

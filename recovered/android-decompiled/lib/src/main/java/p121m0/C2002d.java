package p121m0;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import p000A.C0041i;
import p009D0.C0106b;
import p011E.C0111d;
import p034L1.C0352g;
import p045P0.AbstractC0462h;
import p045P0.C0455a;
import p045P0.C0457c;
import p045P0.C0460f;
import p045P0.C0461g;
import p045P0.InterfaceC0459e;
import p045P0.InterfaceC0465k;
import p048Q0.C0504c;
import p048Q0.C0509h;
import p055T.AbstractC0545H;
import p055T.C0583o;
import p061V.C0615c;
import p064W.AbstractC0646n;
import p073Z.C0771f;
import p077a0.AbstractC0827g;
import p077a0.C0792C;
import p077a0.SurfaceHolderCallbackC0850z;
import p089d1.C1447t;
import p089d1.C1450w;
import p099g0.C1572b;
import p105h2.AbstractC1676G;
import p105h2.C1673D;
import p105h2.C1692X;
import p114k0.C1907A;
import p114k0.InterfaceC1931Z;

/* JADX INFO: renamed from: m0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2002d extends AbstractC0827g implements Handler.Callback {

    /* JADX INFO: renamed from: A */
    public final C1447t f8717A;

    /* JADX INFO: renamed from: B */
    public boolean f8718B;

    /* JADX INFO: renamed from: C */
    public int f8719C;

    /* JADX INFO: renamed from: D */
    public InterfaceC0459e f8720D;

    /* JADX INFO: renamed from: E */
    public C0461g f8721E;

    /* JADX INFO: renamed from: F */
    public C0457c f8722F;

    /* JADX INFO: renamed from: G */
    public C0457c f8723G;

    /* JADX INFO: renamed from: H */
    public int f8724H;

    /* JADX INFO: renamed from: I */
    public final Handler f8725I;

    /* JADX INFO: renamed from: J */
    public final SurfaceHolderCallbackC0850z f8726J;

    /* JADX INFO: renamed from: K */
    public final C0106b f8727K;

    /* JADX INFO: renamed from: L */
    public boolean f8728L;

    /* JADX INFO: renamed from: M */
    public boolean f8729M;

    /* JADX INFO: renamed from: N */
    public C0583o f8730N;

    /* JADX INFO: renamed from: O */
    public long f8731O;

    /* JADX INFO: renamed from: P */
    public long f8732P;

    /* JADX INFO: renamed from: Q */
    public IOException f8733Q;

    /* JADX INFO: renamed from: x */
    public final C0352g f8734x;

    /* JADX INFO: renamed from: y */
    public final C0771f f8735y;

    /* JADX INFO: renamed from: z */
    public InterfaceC1999a f8736z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2002d(SurfaceHolderCallbackC0850z surfaceHolderCallbackC0850z, Looper looper) {
        super(3);
        C1447t c1447t = InterfaceC2001c.f8716d;
        this.f8726J = surfaceHolderCallbackC0850z;
        this.f8725I = looper == null ? null : new Handler(looper, this);
        this.f8717A = c1447t;
        this.f8734x = new C0352g(10);
        this.f8735y = new C0771f(1);
        this.f8727K = new C0106b(22, false);
        this.f8732P = -9223372036854775807L;
        this.f8731O = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: B */
    public final void m4526B() {
        AbstractC0646n.m1629g("Legacy decoding is disabled, can't handle " + this.f8730N.f2154n + " samples (expected application/x-media3-cues).", Objects.equals(this.f8730N.f2154n, "application/cea-608") || Objects.equals(this.f8730N.f2154n, "application/x-mp4-cea-608") || Objects.equals(this.f8730N.f2154n, "application/cea-708"));
    }

    /* JADX INFO: renamed from: C */
    public final long m4527C() {
        if (this.f8724H == -1) {
            return Long.MAX_VALUE;
        }
        this.f8722F.getClass();
        if (this.f8724H >= this.f8722F.mo166n()) {
            return Long.MAX_VALUE;
        }
        return this.f8722F.mo163k(this.f8724H);
    }

    /* JADX INFO: renamed from: D */
    public final long m4528D(long j3) {
        AbstractC0646n.m1630h(j3 != -9223372036854775807L);
        return j3 - this.f3487q;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:6:0x001b  */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x0076, please report this as an issue */
    /* JADX INFO: renamed from: E */
    public final void m4529E() {
        C0352g c0352g;
        InterfaceC0459e c1572b;
        byte b3 = 1;
        this.f8718B = true;
        C0583o c0583o = this.f8730N;
        c0583o.getClass();
        C1447t c1447t = this.f8717A;
        c1447t.getClass();
        String str = c0583o.f2154n;
        if (str != null) {
            int i3 = c0583o.f2135H;
            switch (str.hashCode()) {
                case 930165504:
                    if (!str.equals("application/x-mp4-cea-608")) {
                        b3 = -1;
                    } else {
                        b3 = 0;
                    }
                    break;
                case 1566015601:
                    if (!str.equals("application/cea-608")) {
                        b3 = -1;
                    }
                    break;
                case 1566016562:
                    if (!str.equals("application/cea-708")) {
                        b3 = -1;
                    } else {
                        b3 = 2;
                    }
                    break;
                default:
                    b3 = -1;
                    break;
            }
            switch (b3) {
                case 0:
                case 1:
                    c1572b = new C0504c(i3, str);
                    break;
                case 2:
                    c1572b = new C0509h(i3, c0583o.f2157q);
                    break;
                default:
                    c0352g = (C0352g) c1447t.f6406h;
                    if (c0352g.mo996y(c0583o)) {
                        throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
                    }
                    InterfaceC0465k interfaceC0465kMo976e = c0352g.mo976e(c0583o);
                    interfaceC0465kMo976e.getClass().getSimpleName().concat("Decoder");
                    c1572b = new C1572b(interfaceC0465kMo976e);
                    break;
                    break;
            }
        } else {
            c0352g = (C0352g) c1447t.f6406h;
            if (c0352g.mo996y(c0583o)) {
                throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
            }
            InterfaceC0465k interfaceC0465kMo976e2 = c0352g.mo976e(c0583o);
            interfaceC0465kMo976e2.getClass().getSimpleName().concat("Decoder");
            c1572b = new C1572b(interfaceC0465kMo976e2);
        }
        this.f8720D = c1572b;
        c1572b.mo1270f(this.f3488r);
    }

    /* JADX INFO: renamed from: F */
    public final void m4530F(C0615c c0615c) {
        AbstractC1676G abstractC1676G = c0615c.f2373a;
        SurfaceHolderCallbackC0850z surfaceHolderCallbackC0850z = this.f8726J;
        surfaceHolderCallbackC0850z.f3610g.f3251l.m1621f(27, new C0111d(11, abstractC1676G));
        C0792C c0792c = surfaceHolderCallbackC0850z.f3610g;
        c0792c.f3231Y = c0615c;
        c0792c.f3251l.m1621f(27, new C0111d(8, c0615c));
    }

    /* JADX INFO: renamed from: G */
    public final void m4531G() {
        this.f8721E = null;
        this.f8724H = -1;
        C0457c c0457c = this.f8722F;
        if (c0457c != null) {
            c0457c.mo1159f();
            this.f8722F = null;
        }
        C0457c c0457c2 = this.f8723G;
        if (c0457c2 != null) {
            c0457c2.mo1159f();
            this.f8723G = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        m4530F((C0615c) message.obj);
        return true;
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: i */
    public final String mo2082i() {
        return "TextRenderer";
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: k */
    public final boolean mo2084k() {
        return this.f8729M;
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: l */
    public final boolean mo2085l() {
        if (this.f8730N != null) {
            if (this.f8733Q == null) {
                try {
                    InterfaceC1931Z interfaceC1931Z = this.f3485o;
                    interfaceC1931Z.getClass();
                    interfaceC1931Z.mo3788u();
                } catch (IOException e3) {
                    this.f8733Q = e3;
                }
            }
            if (this.f8733Q != null) {
                C0583o c0583o = this.f8730N;
                c0583o.getClass();
                if (Objects.equals(c0583o.f2154n, "application/x-media3-cues")) {
                    InterfaceC1999a interfaceC1999a = this.f8736z;
                    interfaceC1999a.getClass();
                    return interfaceC1999a.mo3634c(this.f8731O) != Long.MIN_VALUE;
                }
                if (!this.f8729M) {
                    if (this.f8728L) {
                        C0457c c0457c = this.f8722F;
                        long j3 = this.f8731O;
                        if (c0457c == null || c0457c.mo163k(c0457c.mo166n() - 1) <= j3) {
                            C0457c c0457c2 = this.f8723G;
                            long j4 = this.f8731O;
                            if ((c0457c2 == null || c0457c2.mo163k(c0457c2.mo166n() - 1) <= j4) && this.f8721E != null) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: m */
    public final void mo2086m() {
        this.f8730N = null;
        this.f8732P = -9223372036854775807L;
        C1692X c1692x = C1692X.f7629k;
        m4528D(this.f8731O);
        C0615c c0615c = new C0615c(c1692x);
        Handler handler = this.f8725I;
        if (handler != null) {
            handler.obtainMessage(1, c0615c).sendToTarget();
        } else {
            m4530F(c0615c);
        }
        this.f8731O = -9223372036854775807L;
        if (this.f8720D != null) {
            m4531G();
            InterfaceC0459e interfaceC0459e = this.f8720D;
            interfaceC0459e.getClass();
            interfaceC0459e.mo1229a();
            this.f8720D = null;
            this.f8719C = 0;
        }
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: o */
    public final void mo2088o(long j3, boolean z3) {
        this.f8731O = j3;
        InterfaceC1999a interfaceC1999a = this.f8736z;
        if (interfaceC1999a != null) {
            interfaceC1999a.clear();
        }
        C1692X c1692x = C1692X.f7629k;
        m4528D(this.f8731O);
        C0615c c0615c = new C0615c(c1692x);
        Handler handler = this.f8725I;
        if (handler != null) {
            handler.obtainMessage(1, c0615c).sendToTarget();
        } else {
            m4530F(c0615c);
        }
        this.f8728L = false;
        this.f8729M = false;
        this.f8732P = -9223372036854775807L;
        C0583o c0583o = this.f8730N;
        if (c0583o == null || Objects.equals(c0583o.f2154n, "application/x-media3-cues")) {
            return;
        }
        if (this.f8719C == 0) {
            m4531G();
            InterfaceC0459e interfaceC0459e = this.f8720D;
            interfaceC0459e.getClass();
            interfaceC0459e.flush();
            interfaceC0459e.mo1270f(this.f3488r);
            return;
        }
        m4531G();
        InterfaceC0459e interfaceC0459e2 = this.f8720D;
        interfaceC0459e2.getClass();
        interfaceC0459e2.mo1229a();
        this.f8720D = null;
        this.f8719C = 0;
        m4529E();
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: t */
    public final void mo2093t(C0583o[] c0583oArr, long j3, long j4, C1907A c1907a) {
        InterfaceC1999a c2000b;
        C0583o c0583o = c0583oArr[0];
        this.f8730N = c0583o;
        if (!Objects.equals(c0583o.f2154n, "application/x-media3-cues")) {
            m4526B();
            if (this.f8720D != null) {
                this.f8719C = 1;
                return;
            } else {
                m4529E();
                return;
            }
        }
        if (this.f8730N.f2136I == 1) {
            c2000b = new C2000b();
        } else {
            C1450w c1450w = new C1450w();
            c1450w.f6415a = new ArrayList();
            c2000b = c1450w;
        }
        this.f8736z = c2000b;
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: v */
    public final void mo2095v(long j3, long j4) {
        boolean z3;
        C0106b c0106b;
        long jMo163k;
        if (this.f3490t) {
            long j5 = this.f8732P;
            if (j5 != -9223372036854775807L && j3 >= j5) {
                m4531G();
                this.f8729M = true;
            }
        }
        if (this.f8729M) {
            return;
        }
        C0583o c0583o = this.f8730N;
        c0583o.getClass();
        boolean zEquals = Objects.equals(c0583o.f2154n, "application/x-media3-cues");
        Handler handler = this.f8725I;
        boolean zMo3635d = false;
        zMo3635d = false;
        zMo3635d = false;
        C0106b c0106b2 = this.f8727K;
        if (zEquals) {
            this.f8736z.getClass();
            if (!this.f8728L) {
                C0771f c0771f = this.f8735y;
                if (m2094u(c0106b2, c0771f, 0) == -4) {
                    if (c0771f.m1787c(4)) {
                        this.f8728L = true;
                    } else {
                        c0771f.m1886i();
                        ByteBuffer byteBuffer = c0771f.f3144k;
                        byteBuffer.getClass();
                        long j6 = c0771f.f3146m;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.f8734x.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        C0041i c0041i = new C0041i(5);
                        C1673D c1673dM4116m = AbstractC1676G.m4116m();
                        for (int i3 = 0; i3 < parcelableArrayList.size(); i3++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i3);
                            bundle2.getClass();
                            c1673dM4116m.m4102a(c0041i.apply(bundle2));
                        }
                        C0455a c0455a = new C0455a(c1673dM4116m.m4112f(), j6, bundle.getLong("d"));
                        c0771f.mo1883e();
                        zMo3635d = this.f8736z.mo3635d(c0455a, j3);
                    }
                }
            }
            long jMo3634c = this.f8736z.mo3634c(this.f8731O);
            if (jMo3634c == Long.MIN_VALUE && this.f8728L && !zMo3635d) {
                this.f8729M = true;
            }
            if (jMo3634c != Long.MIN_VALUE && jMo3634c <= j3) {
                zMo3635d = true;
            }
            if (zMo3635d) {
                AbstractC1676G abstractC1676GMo3632a = this.f8736z.mo3632a(j3);
                long jMo3633b = this.f8736z.mo3633b(j3);
                m4528D(jMo3633b);
                C0615c c0615c = new C0615c(abstractC1676GMo3632a);
                if (handler != null) {
                    handler.obtainMessage(1, c0615c).sendToTarget();
                } else {
                    m4530F(c0615c);
                }
                this.f8736z.mo3636e(jMo3633b);
            }
            this.f8731O = j3;
            return;
        }
        m4526B();
        this.f8731O = j3;
        if (this.f8723G == null) {
            InterfaceC0459e interfaceC0459e = this.f8720D;
            interfaceC0459e.getClass();
            interfaceC0459e.mo1160b(j3);
            try {
                InterfaceC0459e interfaceC0459e2 = this.f8720D;
                interfaceC0459e2.getClass();
                this.f8723G = (C0457c) interfaceC0459e2.mo1230d();
            } catch (C0460f e3) {
                AbstractC0646n.m1636n("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f8730N, e3);
                C1692X c1692x = C1692X.f7629k;
                m4528D(this.f8731O);
                C0615c c0615c2 = new C0615c(c1692x);
                if (handler != null) {
                    handler.obtainMessage(1, c0615c2).sendToTarget();
                } else {
                    m4530F(c0615c2);
                }
                m4531G();
                InterfaceC0459e interfaceC0459e3 = this.f8720D;
                interfaceC0459e3.getClass();
                interfaceC0459e3.mo1229a();
                this.f8720D = null;
                this.f8719C = 0;
                m4529E();
                return;
            }
        }
        if (this.f3484n != 2) {
            return;
        }
        if (this.f8722F != null) {
            long jM4527C = m4527C();
            z3 = false;
            while (jM4527C <= j3) {
                this.f8724H++;
                jM4527C = m4527C();
                z3 = true;
            }
        } else {
            z3 = false;
        }
        C0457c c0457c = this.f8723G;
        if (c0457c == null) {
            c0106b = c0106b2;
        } else if (c0457c.m1787c(4)) {
            if (!z3 && m4527C() == Long.MAX_VALUE) {
                if (this.f8719C == 2) {
                    m4531G();
                    InterfaceC0459e interfaceC0459e4 = this.f8720D;
                    interfaceC0459e4.getClass();
                    interfaceC0459e4.mo1229a();
                    this.f8720D = null;
                    this.f8719C = 0;
                    m4529E();
                } else {
                    m4531G();
                    this.f8729M = true;
                }
            }
            c0106b = c0106b2;
        } else {
            c0106b = c0106b2;
            if (c0457c.f3149i <= j3) {
                C0457c c0457c2 = this.f8722F;
                if (c0457c2 != null) {
                    c0457c2.mo1159f();
                }
                this.f8724H = c0457c.mo156d(j3);
                this.f8722F = c0457c;
                this.f8723G = null;
                z3 = true;
            }
        }
        if (z3) {
            this.f8722F.getClass();
            int iMo156d = this.f8722F.mo156d(j3);
            if (iMo156d == 0 || this.f8722F.mo166n() == 0) {
                jMo163k = this.f8722F.f3149i;
            } else if (iMo156d == -1) {
                C0457c c0457c3 = this.f8722F;
                jMo163k = c0457c3.mo163k(c0457c3.mo166n() - 1);
            } else {
                jMo163k = this.f8722F.mo163k(iMo156d - 1);
            }
            m4528D(jMo163k);
            C0615c c0615c3 = new C0615c(this.f8722F.mo159g(j3));
            if (handler != null) {
                handler.obtainMessage(1, c0615c3).sendToTarget();
            } else {
                m4530F(c0615c3);
            }
        }
        if (this.f8719C == 2) {
            return;
        }
        while (!this.f8728L) {
            try {
                C0461g c0461g = this.f8721E;
                if (c0461g == null) {
                    InterfaceC0459e interfaceC0459e5 = this.f8720D;
                    interfaceC0459e5.getClass();
                    c0461g = (C0461g) interfaceC0459e5.mo1269e();
                    if (c0461g == null) {
                        return;
                    } else {
                        this.f8721E = c0461g;
                    }
                }
                if (this.f8719C == 1) {
                    c0461g.f2573h = 4;
                    InterfaceC0459e interfaceC0459e6 = this.f8720D;
                    interfaceC0459e6.getClass();
                    interfaceC0459e6.mo1268c(c0461g);
                    this.f8721E = null;
                    this.f8719C = 2;
                    return;
                }
                int iM2094u = m2094u(c0106b, c0461g, 0);
                if (iM2094u == -4) {
                    if (c0461g.m1787c(4)) {
                        this.f8728L = true;
                        this.f8718B = false;
                    } else {
                        C0583o c0583o2 = (C0583o) c0106b.f141i;
                        if (c0583o2 == null) {
                            return;
                        }
                        c0461g.f1531p = c0583o2.f2159s;
                        c0461g.m1886i();
                        this.f8718B &= !c0461g.m1787c(1);
                    }
                    if (!this.f8718B) {
                        InterfaceC0459e interfaceC0459e7 = this.f8720D;
                        interfaceC0459e7.getClass();
                        interfaceC0459e7.mo1268c(c0461g);
                        this.f8721E = null;
                    }
                } else if (iM2094u == -3) {
                    return;
                }
            } catch (C0460f e4) {
                AbstractC0646n.m1636n("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f8730N, e4);
                C1692X c1692x2 = C1692X.f7629k;
                m4528D(this.f8731O);
                C0615c c0615c4 = new C0615c(c1692x2);
                if (handler != null) {
                    handler.obtainMessage(1, c0615c4).sendToTarget();
                } else {
                    m4530F(c0615c4);
                }
                m4531G();
                InterfaceC0459e interfaceC0459e8 = this.f8720D;
                interfaceC0459e8.getClass();
                interfaceC0459e8.mo1229a();
                this.f8720D = null;
                this.f8719C = 0;
                m4529E();
                return;
            }
        }
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: z */
    public final int mo2099z(C0583o c0583o) {
        if (!Objects.equals(c0583o.f2154n, "application/x-media3-cues")) {
            C1447t c1447t = this.f8717A;
            c1447t.getClass();
            if (!((C0352g) c1447t.f6406h).mo996y(c0583o)) {
                String str = c0583o.f2154n;
                if (!Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                    return AbstractC0545H.m1362j(str) ? AbstractC0462h.m1162b(1, 0, 0, 0) : AbstractC0462h.m1162b(0, 0, 0, 0);
                }
            }
        }
        return AbstractC0462h.m1162b(c0583o.f2139L == 0 ? 4 : 2, 0, 0, 0);
    }
}

package p016F1;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.C0858A;
import android.support.v4.media.session.C0885u;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.internal.cast.AbstractC1267d;
import com.google.android.gms.internal.cast.AbstractC1339v;
import com.google.android.gms.internal.cast.BinderC1319q;
import com.google.android.gms.internal.cast.C1211O1;
import com.google.android.gms.internal.cast.C1275f;
import java.lang.reflect.Field;
import java.util.HashSet;
import p000A.C0031d;
import p013E1.AbstractC0132g;
import p013E1.AbstractC0150y;
import p013E1.C0125H;
import p013E1.C0129d;
import p013E1.C0130e;
import p013E1.C0151z;
import p019G1.C0226a;
import p019G1.C0231f;
import p019G1.C0233h;
import p022H1.C0258b;
import p022H1.C0267k;
import p028J1.C0296b;
import p028J1.C0307m;
import p028J1.C0315u;
import p034L1.C0348c;
import p037M1.C0391d;
import p039N0.C0414j;
import p040N1.C0417B;
import p040N1.C0424e;
import p040N1.C0427h;
import p040N1.C0428i;
import p040N1.C0431l;
import p040N1.C0443x;
import p040N1.C0444y;
import p046P1.AbstractC0491s;
import p063V1.InterfaceC0629a;
import p075Z1.HandlerC0784e;
import p097f2.C1560d;
import p097f2.C1563g;

/* JADX INFO: renamed from: F1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0187d extends AbstractC0191h {

    /* JADX INFO: renamed from: m */
    public static final C0296b f455m = new C0296b("CastSession", null);

    /* JADX INFO: renamed from: c */
    public final Context f456c;

    /* JADX INFO: renamed from: d */
    public final HashSet f457d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0202s f458e;

    /* JADX INFO: renamed from: f */
    public final C0186c f459f;

    /* JADX INFO: renamed from: g */
    public final BinderC1319q f460g;

    /* JADX INFO: renamed from: h */
    public final C0267k f461h;

    /* JADX INFO: renamed from: i */
    public C0125H f462i;

    /* JADX INFO: renamed from: j */
    public C0233h f463j;

    /* JADX INFO: renamed from: k */
    public CastDevice f464k;

    /* JADX INFO: renamed from: l */
    public C1211O1 f465l;

    public C0187d(Context context, String str, String str2, C0186c c0186c, BinderC1319q binderC1319q, C0267k c0267k) {
        super(context, str, str2);
        this.f457d = new HashSet();
        this.f456c = context.getApplicationContext();
        this.f459f = c0186c;
        this.f460g = binderC1319q;
        this.f461h = c0267k;
        InterfaceC0629a interfaceC0629aM677c = m677c();
        BinderC0176B binderC0176B = new BinderC0176B(this);
        C0296b c0296b = AbstractC1267d.f5825a;
        InterfaceC0202s interfaceC0202sM3250w0 = null;
        if (interfaceC0629aM677c != null) {
            try {
                interfaceC0202sM3250w0 = AbstractC1267d.m3244b(context).m3250w0(c0186c, interfaceC0629aM677c, binderC0176B);
            } catch (C0188e | RemoteException e3) {
                AbstractC1267d.f5825a.m830a(e3, "Unable to call %s on %s.", "newCastSessionImpl", C1275f.class.getSimpleName());
            }
        }
        this.f458e = interfaceC0202sM3250w0;
    }

    /* JADX INFO: renamed from: d */
    public static void m672d(C0187d c0187d, int i3) {
        C0267k c0267k = c0187d.f461h;
        if (c0267k.f720q) {
            c0267k.f720q = false;
            C0233h c0233h = c0267k.f717n;
            if (c0233h != null) {
                AbstractC0491s.m1210b();
                C0181G c0181g = c0267k.f716m;
                if (c0181g != null) {
                    c0233h.f610i.remove(c0181g);
                }
            }
            c0267k.f706c.m3348v0(null);
            C0258b c0258b = c0267k.f711h;
            if (c0258b != null) {
                c0258b.m791p();
                c0258b.f667l = null;
            }
            C0258b c0258b2 = c0267k.f712i;
            if (c0258b2 != null) {
                c0258b2.m791p();
                c0258b2.f667l = null;
            }
            C0858A c0858a = c0267k.f719p;
            if (c0858a != null) {
                c0858a.m2173V(null, null);
                c0267k.f719p.m2174W(new MediaMetadataCompat(new Bundle()));
                c0267k.m813j(0, null);
            }
            C0858A c0858a2 = c0267k.f719p;
            if (c0858a2 != null) {
                c0858a2.m2172U(false);
                C0885u c0885u = (C0885u) c0267k.f719p.f3639h;
                c0885u.f3706e.kill();
                int i4 = Build.VERSION.SDK_INT;
                MediaSession mediaSession = c0885u.f3702a;
                if (i4 == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } catch (Exception e3) {
                        Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e3);
                    }
                }
                mediaSession.setCallback(null);
                c0885u.f3703b.f3701b.set(null);
                mediaSession.release();
                c0267k.f719p = null;
            }
            c0267k.f717n = null;
            c0267k.f718o = null;
            c0267k.m811h();
            if (i3 == 0) {
                c0267k.m812i();
            }
        }
        C0125H c0125h = c0187d.f462i;
        if (c0125h != null) {
            C0431l c0431lM1132b = C0431l.m1132b();
            c0431lM1132b.f1464d = C0151z.f357h;
            c0431lM1132b.f1463c = 8403;
            c0125h.m1079c(1, c0431lM1132b.m1133a());
            c0125h.m584g();
            c0125h.m583f(c0125h.f188j);
            c0187d.f462i = null;
        }
        c0187d.f464k = null;
        C0233h c0233h2 = c0187d.f463j;
        if (c0233h2 != null) {
            c0233h2.m769t(null);
            c0187d.f463j = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m673e(C0187d c0187d, String str, C1563g c1563g) {
        int i3 = 0;
        C0296b c0296b = f455m;
        if (c0187d.f458e == null) {
            return;
        }
        try {
            boolean zM3888e = c1563g.m3888e();
            InterfaceC0202s interfaceC0202s = c0187d.f458e;
            if (!zM3888e) {
                Exception excM3886c = c1563g.m3886c();
                if (!(excM3886c instanceof C0391d)) {
                    C0200q c0200q = (C0200q) interfaceC0202s;
                    Parcel parcelM1894e0 = c0200q.m1894e0();
                    parcelM1894e0.writeInt(2476);
                    c0200q.m1896u0(parcelM1894e0, 5);
                    return;
                }
                int i4 = ((C0391d) excM3886c).f1345g.f5497g;
                C0200q c0200q2 = (C0200q) interfaceC0202s;
                Parcel parcelM1894e1 = c0200q2.m1894e0();
                parcelM1894e1.writeInt(i4);
                c0200q2.m1896u0(parcelM1894e1, 5);
                return;
            }
            C0315u c0315u = (C0315u) c1563g.m3887d();
            if (c0315u.f841g.f5497g > 0) {
                c0296b.m831b("%s() -> failure result", str);
                int i5 = c0315u.f841g.f5497g;
                C0200q c0200q3 = (C0200q) interfaceC0202s;
                Parcel parcelM1894e2 = c0200q3.m1894e0();
                parcelM1894e2.writeInt(i5);
                c0200q3.m1896u0(parcelM1894e2, 5);
                return;
            }
            c0296b.m831b("%s() -> success result", str);
            C0233h c0233h = new C0233h(new C0307m());
            c0187d.f463j = c0233h;
            c0233h.m769t(c0187d.f462i);
            c0187d.f463j.m765o(new C0181G(i3, c0187d));
            c0187d.f463j.m768s();
            C0267k c0267k = c0187d.f461h;
            C0233h c0233h2 = c0187d.f463j;
            AbstractC0491s.m1210b();
            c0267k.m804a(c0233h2, c0187d.f464k);
            C0129d c0129d = c0315u.f842h;
            AbstractC0491s.m1213e(c0129d);
            String str2 = c0315u.f843i;
            String str3 = c0315u.f844j;
            AbstractC0491s.m1213e(str3);
            boolean z3 = c0315u.f845k;
            C0200q c0200q4 = (C0200q) interfaceC0202s;
            Parcel parcelM1894e3 = c0200q4.m1894e0();
            AbstractC1339v.m3421c(parcelM1894e3, c0129d);
            parcelM1894e3.writeString(str2);
            parcelM1894e3.writeString(str3);
            parcelM1894e3.writeInt(z3 ? 1 : 0);
            c0200q4.m1896u0(parcelM1894e3, 4);
        } catch (RemoteException e3) {
            c0296b.m830a(e3, "Unable to call %s on %s.", "methods", InterfaceC0202s.class.getSimpleName());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m674f(Bundle bundle) {
        boolean z3;
        CastDevice castDeviceM3070e = CastDevice.m3070e(bundle);
        this.f464k = castDeviceM3070e;
        if (castDeviceM3070e == null) {
            AbstractC0491s.m1210b();
            InterfaceC0209z interfaceC0209z = this.f468a;
            if (interfaceC0209z != null) {
                try {
                    C0207x c0207x = (C0207x) interfaceC0209z;
                    Parcel parcelM1895q0 = c0207x.m1895q0(c0207x.m1894e0(), 9);
                    int i3 = AbstractC1339v.f5981a;
                    z3 = parcelM1895q0.readInt() != 0;
                    parcelM1895q0.recycle();
                } catch (RemoteException e3) {
                    AbstractC0191h.f467b.m830a(e3, "Unable to call %s on %s.", "isResuming", InterfaceC0209z.class.getSimpleName());
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            if (z3) {
                InterfaceC0209z interfaceC0209z2 = this.f468a;
                if (interfaceC0209z2 == null) {
                    return;
                }
                try {
                    C0207x c0207x2 = (C0207x) interfaceC0209z2;
                    Parcel parcelM1894e0 = c0207x2.m1894e0();
                    parcelM1894e0.writeInt(2153);
                    c0207x2.m1896u0(parcelM1894e0, 15);
                    return;
                } catch (RemoteException e4) {
                    AbstractC0191h.f467b.m830a(e4, "Unable to call %s on %s.", "notifyFailedToResumeSession", InterfaceC0209z.class.getSimpleName());
                    return;
                }
            }
            InterfaceC0209z interfaceC0209z3 = this.f468a;
            if (interfaceC0209z3 == null) {
                return;
            }
            try {
                C0207x c0207x3 = (C0207x) interfaceC0209z3;
                Parcel parcelM1894e1 = c0207x3.m1894e0();
                parcelM1894e1.writeInt(2151);
                c0207x3.m1896u0(parcelM1894e1, 12);
                return;
            } catch (RemoteException e5) {
                AbstractC0191h.f467b.m830a(e5, "Unable to call %s on %s.", "notifyFailedToStartSession", InterfaceC0209z.class.getSimpleName());
                return;
            }
        }
        C0125H c0125h = this.f462i;
        if (c0125h != null) {
            C0431l c0431lM1132b = C0431l.m1132b();
            c0431lM1132b.f1464d = C0151z.f357h;
            c0431lM1132b.f1463c = 8403;
            c0125h.m1079c(1, c0431lM1132b.m1133a());
            c0125h.m584g();
            c0125h.m583f(c0125h.f188j);
            this.f462i = null;
        }
        f455m.m831b("Acquiring a connection to Google Play Services for %s", this.f464k);
        CastDevice castDevice = this.f464k;
        AbstractC0491s.m1213e(castDevice);
        Bundle bundle2 = new Bundle();
        C0186c c0186c = this.f459f;
        C0226a c0226a = c0186c == null ? null : c0186c.f444l;
        C0231f c0231f = c0226a != null ? c0226a.f529j : null;
        boolean z4 = c0226a != null && c0226a.f530k;
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", c0231f != null);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z4);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", this.f460g.f5958h);
        C0858A c0858a = new C0858A(castDevice, new C0183I(this));
        c0858a.f3641j = bundle2;
        C0130e c0130e = new C0130e(c0858a);
        Context context = this.f456c;
        int i4 = AbstractC0132g.f244a;
        C0125H c0125h2 = new C0125H(context, c0130e);
        c0125h2.f186D.add(new C0194k(this));
        this.f462i = c0125h2;
        C0428i c0428iM1078b = c0125h2.m1078b(c0125h2.f188j);
        C0414j c0414j = new C0414j();
        C0031d c0031d = new C0031d(5, c0125h2);
        C0151z c0151z = C0151z.f358i;
        c0414j.f1410j = c0428iM1078b;
        c0414j.f1408h = c0031d;
        c0414j.f1409i = c0151z;
        c0414j.f1411k = new C0348c[]{AbstractC0150y.f352a};
        c0414j.f1407g = 8428;
        C0427h c0427h = c0428iM1078b.f1460a;
        AbstractC0491s.m1214f(c0427h, "Key must not be null");
        C0428i c0428i = (C0428i) c0414j.f1410j;
        C0348c[] c0348cArr = (C0348c[]) c0414j.f1411k;
        int i5 = c0414j.f1407g;
        C0858A c0858a2 = new C0858A(c0414j, c0428i, c0348cArr, i5);
        C0031d c0031d2 = new C0031d(c0414j, c0427h);
        AbstractC0491s.m1214f(c0428i.f1460a, "Listener has already been released.");
        C0424e c0424e = c0125h2.f1357i;
        c0424e.getClass();
        C1560d c1560d = new C1560d();
        c0424e.m1128e(c1560d, i5, c0125h2);
        C0443x c0443x = new C0443x(new C0417B(new C0444y(c0858a2, c0031d2), c1560d), c0424e.f1453o.get(), c0125h2);
        HandlerC0784e handlerC0784e = c0424e.f1457s;
        handlerC0784e.sendMessage(handlerC0784e.obtainMessage(8, c0443x));
    }
}

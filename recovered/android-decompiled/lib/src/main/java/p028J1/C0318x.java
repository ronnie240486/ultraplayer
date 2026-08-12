package p028J1;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.internal.AbstractC1152a;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;
import p013E1.C0129d;
import p013E1.C0149x;
import p016F1.C0183I;
import p034L1.C0346a;
import p040N1.C0435p;
import p046P1.AbstractC0491s;
import p046P1.C0475c;

/* JADX INFO: renamed from: J1.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0318x extends AbstractC1152a {

    /* JADX INFO: renamed from: S */
    public static final C0296b f851S = new C0296b("CastClientImpl", null);

    /* JADX INFO: renamed from: T */
    public static final Object f852T = new Object();

    /* JADX INFO: renamed from: U */
    public static final Object f853U = new Object();

    /* JADX INFO: renamed from: A */
    public final CastDevice f854A;

    /* JADX INFO: renamed from: B */
    public final C0183I f855B;

    /* JADX INFO: renamed from: C */
    public final HashMap f856C;

    /* JADX INFO: renamed from: D */
    public final long f857D;

    /* JADX INFO: renamed from: E */
    public final Bundle f858E;

    /* JADX INFO: renamed from: F */
    public BinderC0317w f859F;

    /* JADX INFO: renamed from: G */
    public String f860G;

    /* JADX INFO: renamed from: H */
    public boolean f861H;

    /* JADX INFO: renamed from: I */
    public boolean f862I;

    /* JADX INFO: renamed from: J */
    public boolean f863J;

    /* JADX INFO: renamed from: K */
    public double f864K;

    /* JADX INFO: renamed from: L */
    public C0149x f865L;

    /* JADX INFO: renamed from: M */
    public int f866M;

    /* JADX INFO: renamed from: N */
    public int f867N;

    /* JADX INFO: renamed from: O */
    public String f868O;

    /* JADX INFO: renamed from: P */
    public String f869P;

    /* JADX INFO: renamed from: Q */
    public Bundle f870Q;

    /* JADX INFO: renamed from: R */
    public final HashMap f871R;

    /* JADX INFO: renamed from: z */
    public C0129d f872z;

    public C0318x(Context context, Looper looper, C0475c c0475c, CastDevice castDevice, long j3, C0183I c0183i, Bundle bundle, C0435p c0435p, C0435p c0435p2) {
        super(context, looper, 10, c0475c, c0435p, c0435p2);
        this.f854A = castDevice;
        this.f855B = c0183i;
        this.f857D = j3;
        this.f858E = bundle;
        this.f856C = new HashMap();
        new AtomicLong(0L);
        this.f871R = new HashMap();
        this.f866M = -1;
        this.f867N = -1;
        this.f872z = null;
        this.f860G = null;
        this.f864K = 0.0d;
        m866D();
        this.f861H = false;
        this.f865L = null;
        m866D();
    }

    /* JADX INFO: renamed from: B */
    public static void m864B(C0318x c0318x, long j3) {
        synchronized (c0318x.f871R) {
            try {
                if (c0318x.f871R.remove(Long.valueOf(j3)) != null) {
                    throw new ClassCastException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m865C() {
        f851S.m831b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.f856C) {
            this.f856C.clear();
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m866D() {
        CastDevice castDevice = this.f854A;
        AbstractC0491s.m1214f(castDevice, "device should not be null");
        if (castDevice.m3071f(2048) || !castDevice.m3071f(4) || castDevice.m3071f(1)) {
            return;
        }
        "Chromecast Audio".equals(castDevice.f5423k);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1152a, p037M1.InterfaceC0390c
    /* JADX INFO: renamed from: i */
    public final void mo867i() {
        Object[] objArr = {this.f859F, Boolean.valueOf(mo1068c())};
        C0296b c0296b = f851S;
        c0296b.m831b("disconnect(); ServiceListener=%s, isConnected=%b", objArr);
        BinderC0317w binderC0317w = this.f859F;
        C0318x c0318x = null;
        this.f859F = null;
        if (binderC0317w != null) {
            C0318x c0318x2 = (C0318x) binderC0317w.f849c.getAndSet(null);
            if (c0318x2 != null) {
                c0318x2.f866M = -1;
                c0318x2.f867N = -1;
                c0318x2.f872z = null;
                c0318x2.f860G = null;
                c0318x2.f864K = 0.0d;
                c0318x2.m866D();
                c0318x2.f861H = false;
                c0318x2.f865L = null;
                c0318x = c0318x2;
            }
            if (c0318x != null) {
                m865C();
                try {
                    try {
                        ((C0300f) m3090r()).m835w0();
                    } finally {
                        super.mo867i();
                    }
                } catch (RemoteException | IllegalStateException e3) {
                    c0296b.m830a(e3, "Error while disconnecting the controller interface", new Object[0]);
                }
                return;
            }
        }
        c0296b.m831b("already disposed, so short-circuiting", new Object[0]);
    }

    @Override // p037M1.InterfaceC0390c
    /* JADX INFO: renamed from: m */
    public final int mo859m() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1152a
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ IInterface mo860n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return iInterfaceQueryLocalInterface instanceof C0300f ? (C0300f) iInterfaceQueryLocalInterface : new C0300f(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1152a
    /* JADX INFO: renamed from: p */
    public final Bundle mo868p() {
        Bundle bundle = this.f870Q;
        if (bundle == null) {
            return null;
        }
        this.f870Q = null;
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1152a
    /* JADX INFO: renamed from: q */
    public final Bundle mo869q() {
        Bundle bundle = new Bundle();
        f851S.m831b("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.f868O, this.f869P);
        CastDevice castDevice = this.f854A;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.f857D);
        Bundle bundle2 = this.f858E;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        BinderC0317w binderC0317w = new BinderC0317w(this);
        this.f859F = binderC0317w;
        bundle.putParcelable("listener", new BinderWrapper(binderC0317w));
        String str = this.f868O;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.f869P;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1152a
    /* JADX INFO: renamed from: s */
    public final String mo862s() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1152a
    /* JADX INFO: renamed from: t */
    public final String mo863t() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1152a
    /* JADX INFO: renamed from: v */
    public final void mo870v(C0346a c0346a) {
        super.mo870v(c0346a);
        m865C();
    }

    @Override // com.google.android.gms.common.internal.AbstractC1152a
    /* JADX INFO: renamed from: w */
    public final void mo871w(int i3, IBinder iBinder, Bundle bundle, int i4) {
        f851S.m831b("in onPostInitHandler; statusCode=%d", Integer.valueOf(i3));
        if (i3 == 0 || i3 == 2300) {
            this.f862I = true;
            this.f863J = true;
        }
        if (i3 == 2300) {
            Bundle bundle2 = new Bundle();
            this.f870Q = bundle2;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i3 = 0;
        }
        super.mo871w(i3, iBinder, bundle, i4);
    }
}

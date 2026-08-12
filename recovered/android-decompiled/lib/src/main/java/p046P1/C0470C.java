package p046P1;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import p054S1.C0537a;
import p075Z1.HandlerC0784e;

/* JADX INFO: renamed from: P1.C */
/* JADX INFO: loaded from: classes.dex */
public final class C0470C {

    /* JADX INFO: renamed from: g */
    public static final Object f1555g = new Object();

    /* JADX INFO: renamed from: h */
    public static C0470C f1556h;

    /* JADX INFO: renamed from: i */
    public static HandlerThread f1557i;

    /* JADX INFO: renamed from: a */
    public final HashMap f1558a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Context f1559b;

    /* JADX INFO: renamed from: c */
    public volatile HandlerC0784e f1560c;

    /* JADX INFO: renamed from: d */
    public final C0537a f1561d;

    /* JADX INFO: renamed from: e */
    public final long f1562e;

    /* JADX INFO: renamed from: f */
    public final long f1563f;

    public C0470C(Context context, Looper looper) {
        C0469B c0469b = new C0469B(this);
        this.f1559b = context.getApplicationContext();
        HandlerC0784e handlerC0784e = new HandlerC0784e(looper, c0469b);
        Looper.getMainLooper();
        this.f1560c = handlerC0784e;
        if (C0537a.f1872b == null) {
            synchronized (C0537a.f1871a) {
                try {
                    if (C0537a.f1872b == null) {
                        C0537a c0537a = new C0537a();
                        new ConcurrentHashMap();
                        C0537a.f1872b = c0537a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C0537a c0537a2 = C0537a.f1872b;
        AbstractC0491s.m1213e(c0537a2);
        this.f1561d = c0537a2;
        this.f1562e = 5000L;
        this.f1563f = 300000L;
    }

    /* JADX INFO: renamed from: a */
    public static HandlerThread m1180a() {
        synchronized (f1555g) {
            try {
                HandlerThread handlerThread = f1557i;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f1557i = handlerThread2;
                handlerThread2.start();
                return f1557i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1181b(String str, ServiceConnection serviceConnection, boolean z3) {
        C0498z c0498z = new C0498z(str, z3);
        AbstractC0491s.m1214f(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f1558a) {
            try {
                ServiceConnectionC0468A serviceConnectionC0468A = (ServiceConnectionC0468A) this.f1558a.get(c0498z);
                if (serviceConnectionC0468A == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(c0498z.toString()));
                }
                if (!serviceConnectionC0468A.f1547a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(c0498z.toString()));
                }
                serviceConnectionC0468A.f1547a.remove(serviceConnection);
                if (serviceConnectionC0468A.f1547a.isEmpty()) {
                    this.f1560c.sendMessageDelayed(this.f1560c.obtainMessage(0, c0498z), this.f1562e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1182c(C0498z c0498z, ServiceConnectionC0494v serviceConnectionC0494v, String str) {
        boolean z3;
        synchronized (this.f1558a) {
            try {
                ServiceConnectionC0468A serviceConnectionC0468A = (ServiceConnectionC0468A) this.f1558a.get(c0498z);
                if (serviceConnectionC0468A == null) {
                    serviceConnectionC0468A = new ServiceConnectionC0468A(this, c0498z);
                    serviceConnectionC0468A.f1547a.put(serviceConnectionC0494v, serviceConnectionC0494v);
                    serviceConnectionC0468A.m1179a(str, null);
                    this.f1558a.put(c0498z, serviceConnectionC0468A);
                } else {
                    this.f1560c.removeMessages(0, c0498z);
                    if (serviceConnectionC0468A.f1547a.containsKey(serviceConnectionC0494v)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(c0498z.toString()));
                    }
                    serviceConnectionC0468A.f1547a.put(serviceConnectionC0494v, serviceConnectionC0494v);
                    int i3 = serviceConnectionC0468A.f1548b;
                    if (i3 == 1) {
                        serviceConnectionC0494v.onServiceConnected(serviceConnectionC0468A.f1552f, serviceConnectionC0468A.f1550d);
                    } else if (i3 == 2) {
                        serviceConnectionC0468A.m1179a(str, null);
                    }
                }
                z3 = serviceConnectionC0468A.f1549c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }
}

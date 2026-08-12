package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p000A.C0031d;
import p014F.RunnableC0153b;
import p028J1.C0314t;
import p034L1.C0346a;
import p034L1.C0348c;
import p034L1.C0349d;
import p034L1.C0350e;
import p037M1.InterfaceC0390c;
import p037M1.InterfaceC0394g;
import p037M1.InterfaceC0395h;
import p040N1.C0435p;
import p046P1.AbstractC0488p;
import p046P1.AbstractC0491s;
import p046P1.BinderC0493u;
import p046P1.C0470C;
import p046P1.C0471D;
import p046P1.C0475c;
import p046P1.C0477e;
import p046P1.C0480h;
import p046P1.C0490r;
import p046P1.C0495w;
import p046P1.C0496x;
import p046P1.C0497y;
import p046P1.C0498z;
import p046P1.HandlerC0492t;
import p046P1.InterfaceC0474b;
import p046P1.InterfaceC0478f;
import p046P1.ServiceConnectionC0494v;
import p075Z1.AbstractC0780a;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1152a implements InterfaceC0390c {

    /* JADX INFO: renamed from: y */
    public static final C0348c[] f5513y = new C0348c[0];

    /* JADX INFO: renamed from: a */
    public volatile String f5514a;

    /* JADX INFO: renamed from: b */
    public C0471D f5515b;

    /* JADX INFO: renamed from: c */
    public final Context f5516c;

    /* JADX INFO: renamed from: d */
    public final Looper f5517d;

    /* JADX INFO: renamed from: e */
    public final C0470C f5518e;

    /* JADX INFO: renamed from: f */
    public final HandlerC0492t f5519f;

    /* JADX INFO: renamed from: g */
    public final Object f5520g;

    /* JADX INFO: renamed from: h */
    public final Object f5521h;

    /* JADX INFO: renamed from: i */
    public C0490r f5522i;

    /* JADX INFO: renamed from: j */
    public InterfaceC0474b f5523j;

    /* JADX INFO: renamed from: k */
    public IInterface f5524k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f5525l;

    /* JADX INFO: renamed from: m */
    public ServiceConnectionC0494v f5526m;

    /* JADX INFO: renamed from: n */
    public int f5527n;

    /* JADX INFO: renamed from: o */
    public final C0480h f5528o;

    /* JADX INFO: renamed from: p */
    public final C0480h f5529p;

    /* JADX INFO: renamed from: q */
    public final int f5530q;

    /* JADX INFO: renamed from: r */
    public final String f5531r;

    /* JADX INFO: renamed from: s */
    public volatile String f5532s;

    /* JADX INFO: renamed from: t */
    public C0346a f5533t;

    /* JADX INFO: renamed from: u */
    public boolean f5534u;

    /* JADX INFO: renamed from: v */
    public volatile C0497y f5535v;

    /* JADX INFO: renamed from: w */
    public final AtomicInteger f5536w;

    /* JADX INFO: renamed from: x */
    public final Set f5537x;

    public AbstractC1152a(Context context, Looper looper, int i3, C0475c c0475c, InterfaceC0394g interfaceC0394g, InterfaceC0395h interfaceC0395h) {
        synchronized (C0470C.f1555g) {
            try {
                if (C0470C.f1556h == null) {
                    C0470C.f1556h = new C0470C(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0470C c0470c = C0470C.f1556h;
        Object obj = C0349d.f1131c;
        AbstractC0491s.m1213e(interfaceC0394g);
        AbstractC0491s.m1213e(interfaceC0395h);
        C0480h c0480h = new C0480h(interfaceC0394g);
        C0480h c0480h2 = new C0480h(interfaceC0395h);
        String str = (String) c0475c.f1571d;
        this.f5514a = null;
        this.f5520g = new Object();
        this.f5521h = new Object();
        this.f5525l = new ArrayList();
        this.f5527n = 1;
        this.f5533t = null;
        this.f5534u = false;
        this.f5535v = null;
        this.f5536w = new AtomicInteger(0);
        AbstractC0491s.m1214f(context, "Context must not be null");
        this.f5516c = context;
        AbstractC0491s.m1214f(looper, "Looper must not be null");
        this.f5517d = looper;
        AbstractC0491s.m1214f(c0470c, "Supervisor must not be null");
        this.f5518e = c0470c;
        this.f5519f = new HandlerC0492t(this, looper);
        this.f5530q = i3;
        this.f5528o = c0480h;
        this.f5529p = c0480h2;
        this.f5531r = str;
        Set set = (Set) c0475c.f1569b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f5537x = set;
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ void m3087y(AbstractC1152a abstractC1152a) {
        int i3;
        int i4;
        synchronized (abstractC1152a.f5520g) {
            i3 = abstractC1152a.f5527n;
        }
        if (i3 == 3) {
            abstractC1152a.f5534u = true;
            i4 = 5;
        } else {
            i4 = 4;
        }
        HandlerC0492t handlerC0492t = abstractC1152a.f5519f;
        handlerC0492t.sendMessage(handlerC0492t.obtainMessage(i4, abstractC1152a.f5536w.get(), 16));
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m3088z(AbstractC1152a abstractC1152a, int i3, int i4, IInterface iInterface) {
        synchronized (abstractC1152a.f5520g) {
            try {
                if (abstractC1152a.f5527n != i3) {
                    return false;
                }
                abstractC1152a.m3089A(i4, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m3089A(int i3, IInterface iInterface) {
        C0471D c0471d;
        if ((i3 == 4) != (iInterface != null)) {
            throw new IllegalArgumentException();
        }
        synchronized (this.f5520g) {
            try {
                this.f5527n = i3;
                this.f5524k = iInterface;
                if (i3 == 1) {
                    ServiceConnectionC0494v serviceConnectionC0494v = this.f5526m;
                    if (serviceConnectionC0494v != null) {
                        C0470C c0470c = this.f5518e;
                        String str = (String) this.f5515b.f1566c;
                        AbstractC0491s.m1213e(str);
                        this.f5515b.getClass();
                        if (this.f5531r == null) {
                            this.f5516c.getClass();
                        }
                        c0470c.m1181b(str, serviceConnectionC0494v, this.f5515b.f1565b);
                        this.f5526m = null;
                    }
                } else if (i3 == 2 || i3 == 3) {
                    ServiceConnectionC0494v serviceConnectionC0494v2 = this.f5526m;
                    if (serviceConnectionC0494v2 != null && (c0471d = this.f5515b) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) c0471d.f1566c) + " on com.google.android.gms");
                        C0470C c0470c2 = this.f5518e;
                        String str2 = (String) this.f5515b.f1566c;
                        AbstractC0491s.m1213e(str2);
                        this.f5515b.getClass();
                        if (this.f5531r == null) {
                            this.f5516c.getClass();
                        }
                        c0470c2.m1181b(str2, serviceConnectionC0494v2, this.f5515b.f1565b);
                        this.f5536w.incrementAndGet();
                    }
                    ServiceConnectionC0494v serviceConnectionC0494v3 = new ServiceConnectionC0494v(this, this.f5536w.get());
                    this.f5526m = serviceConnectionC0494v3;
                    String strMo863t = mo863t();
                    boolean zMo1278u = mo1278u();
                    this.f5515b = new C0471D(strMo863t, zMo1278u);
                    if (zMo1278u && mo859m() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.f5515b.f1566c)));
                    }
                    C0470C c0470c3 = this.f5518e;
                    String str3 = (String) this.f5515b.f1566c;
                    AbstractC0491s.m1213e(str3);
                    this.f5515b.getClass();
                    String name = this.f5531r;
                    if (name == null) {
                        name = this.f5516c.getClass().getName();
                    }
                    if (!c0470c3.m1182c(new C0498z(str3, this.f5515b.f1565b), serviceConnectionC0494v3, name)) {
                        Log.w("GmsClient", "unable to connect to service: " + ((String) this.f5515b.f1566c) + " on com.google.android.gms");
                        int i4 = this.f5536w.get();
                        C0496x c0496x = new C0496x(this, 16);
                        HandlerC0492t handlerC0492t = this.f5519f;
                        handlerC0492t.sendMessage(handlerC0492t.obtainMessage(7, i4, -1, c0496x));
                    }
                } else if (i3 == 4) {
                    AbstractC0491s.m1213e(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p037M1.InterfaceC0390c
    /* JADX INFO: renamed from: a */
    public final boolean mo1066a() {
        boolean z3;
        synchronized (this.f5520g) {
            int i3 = this.f5527n;
            z3 = true;
            if (i3 != 2 && i3 != 3) {
                z3 = false;
            }
        }
        return z3;
    }

    @Override // p037M1.InterfaceC0390c
    /* JADX INFO: renamed from: b */
    public final C0348c[] mo1067b() {
        C0497y c0497y = this.f5535v;
        if (c0497y == null) {
            return null;
        }
        return c0497y.f1649h;
    }

    @Override // p037M1.InterfaceC0390c
    /* JADX INFO: renamed from: c */
    public final boolean mo1068c() {
        boolean z3;
        synchronized (this.f5520g) {
            z3 = this.f5527n == 4;
        }
        return z3;
    }

    @Override // p037M1.InterfaceC0390c
    /* JADX INFO: renamed from: d */
    public final void mo1069d() {
        if (!mo1068c() || this.f5515b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    @Override // p037M1.InterfaceC0390c
    /* JADX INFO: renamed from: e */
    public final void mo1070e(C0031d c0031d) {
        ((C0435p) c0031d.f38h).f1480n.f1457s.post(new RunnableC0153b(4, c0031d));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p037M1.InterfaceC0390c
    /* JADX INFO: renamed from: f */
    public final void mo1071f(InterfaceC0478f interfaceC0478f, Set set) {
        Bundle bundleMo869q = mo869q();
        String str = this.f5532s;
        int i3 = C0350e.f1133a;
        Scope[] scopeArr = C0477e.f1580u;
        Bundle bundle = new Bundle();
        int i4 = this.f5530q;
        C0348c[] c0348cArr = C0477e.f1581v;
        C0477e c0477e = new C0477e(6, i4, i3, null, null, scopeArr, bundle, null, c0348cArr, c0348cArr, true, 0, false, str);
        c0477e.f1585j = this.f5516c.getPackageName();
        c0477e.f1588m = bundleMo869q;
        if (set != null) {
            c0477e.f1587l = (Scope[]) set.toArray(new Scope[0]);
        }
        if (mo1075k()) {
            c0477e.f1589n = new Account("<<default account>>", "com.google");
            if (interfaceC0478f != 0) {
                c0477e.f1586k = ((AbstractC0780a) interfaceC0478f).f3189c;
            }
        }
        c0477e.f1590o = f5513y;
        c0477e.f1591p = mo861o();
        if (mo872x()) {
            c0477e.f1594s = true;
        }
        try {
            synchronized (this.f5521h) {
                try {
                    C0490r c0490r = this.f5522i;
                    if (c0490r != null) {
                        c0490r.m1208P(new BinderC0493u(this, this.f5536w.get()), c0477e);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            int i5 = this.f5536w.get();
            HandlerC0492t handlerC0492t = this.f5519f;
            handlerC0492t.sendMessage(handlerC0492t.obtainMessage(6, i5, 3));
        } catch (RemoteException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            mo871w(8, null, null, this.f5536w.get());
        } catch (SecurityException e5) {
            throw e5;
        } catch (RuntimeException e6) {
            e = e6;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            mo871w(8, null, null, this.f5536w.get());
        }
    }

    @Override // p037M1.InterfaceC0390c
    /* JADX INFO: renamed from: g */
    public final String mo1072g() {
        return this.f5514a;
    }

    @Override // p037M1.InterfaceC0390c
    /* JADX INFO: renamed from: h */
    public final Set mo1073h() {
        return mo1075k() ? this.f5537x : Collections.EMPTY_SET;
    }

    @Override // p037M1.InterfaceC0390c
    /* JADX INFO: renamed from: i */
    public void mo867i() {
        this.f5536w.incrementAndGet();
        synchronized (this.f5525l) {
            try {
                int size = this.f5525l.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((AbstractC0488p) this.f5525l.get(i3)).m1206c();
                }
                this.f5525l.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f5521h) {
            this.f5522i = null;
        }
        m3089A(1, null);
    }

    @Override // p037M1.InterfaceC0390c
    /* JADX INFO: renamed from: j */
    public final void mo1074j(String str) {
        this.f5514a = str;
        mo867i();
    }

    @Override // p037M1.InterfaceC0390c
    /* JADX INFO: renamed from: k */
    public boolean mo1075k() {
        return false;
    }

    @Override // p037M1.InterfaceC0390c
    /* JADX INFO: renamed from: l */
    public final void mo1076l(InterfaceC0474b interfaceC0474b) {
        this.f5523j = interfaceC0474b;
        m3089A(2, null);
    }

    /* JADX INFO: renamed from: n */
    public abstract IInterface mo860n(IBinder iBinder);

    /* JADX INFO: renamed from: o */
    public C0348c[] mo861o() {
        return f5513y;
    }

    /* JADX INFO: renamed from: p */
    public Bundle mo868p() {
        return null;
    }

    /* JADX INFO: renamed from: q */
    public Bundle mo869q() {
        return new Bundle();
    }

    /* JADX INFO: renamed from: r */
    public final IInterface m3090r() {
        IInterface iInterface;
        synchronized (this.f5520g) {
            try {
                if (this.f5527n == 5) {
                    throw new DeadObjectException();
                }
                if (!mo1068c()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f5524k;
                AbstractC0491s.m1214f(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    /* JADX INFO: renamed from: s */
    public abstract String mo862s();

    /* JADX INFO: renamed from: t */
    public abstract String mo863t();

    /* JADX INFO: renamed from: u */
    public boolean mo1278u() {
        return mo859m() >= 211700000;
    }

    /* JADX INFO: renamed from: v */
    public void mo870v(C0346a c0346a) {
        c0346a.getClass();
        System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: w */
    public void mo871w(int i3, IBinder iBinder, Bundle bundle, int i4) {
        C0495w c0495w = new C0495w(this, i3, iBinder, bundle);
        HandlerC0492t handlerC0492t = this.f5519f;
        handlerC0492t.sendMessage(handlerC0492t.obtainMessage(1, i4, -1, c0495w));
    }

    /* JADX INFO: renamed from: x */
    public boolean mo872x() {
        return this instanceof C0314t;
    }
}

package p089d1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p011E.C0111d;
import p046P1.C0471D;
import p075Z1.HandlerC0784e;

/* JADX INFO: renamed from: d1.Z */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC1425Z extends AbstractC1449v implements ServiceConnection {

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ int f6299q = 0;

    /* JADX INFO: renamed from: i */
    public final ComponentName f6300i;

    /* JADX INFO: renamed from: j */
    public final HandlerC0784e f6301j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f6302k;

    /* JADX INFO: renamed from: l */
    public boolean f6303l;

    /* JADX INFO: renamed from: m */
    public boolean f6304m;

    /* JADX INFO: renamed from: n */
    public C1419T f6305n;

    /* JADX INFO: renamed from: o */
    public boolean f6306o;

    /* JADX INFO: renamed from: p */
    public C0111d f6307p;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public ServiceConnectionC1425Z(Context context, ComponentName componentName) {
        super(context, new C1447t(0, componentName));
        this.f6302k = new ArrayList();
        this.f6300i = componentName;
        this.f6301j = new HandlerC0784e();
    }

    @Override // p089d1.AbstractC1449v
    /* JADX INFO: renamed from: c */
    public final AbstractC1446s mo3560c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
        }
        C0471D c0471d = this.f6413g;
        if (c0471d == null) {
            return null;
        }
        List list = (List) c0471d.f1566c;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((C1442o) list.get(i3)).m3610d().equals(str)) {
                C1423X c1423x = new C1423X(this, str);
                this.f6302k.add(c1423x);
                if (this.f6306o) {
                    c1423x.mo3547b(this.f6305n);
                }
                m3566m();
                return c1423x;
            }
        }
        return null;
    }

    @Override // p089d1.AbstractC1449v
    /* JADX INFO: renamed from: d */
    public final AbstractC1448u mo3526d(String str) {
        if (str != null) {
            return m3563j(str, null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override // p089d1.AbstractC1449v
    /* JADX INFO: renamed from: e */
    public final AbstractC1448u mo3561e(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return m3563j(str, str2);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    @Override // p089d1.AbstractC1449v
    /* JADX INFO: renamed from: f */
    public final void mo3527f(C1443p c1443p) {
        if (this.f6306o) {
            C1419T c1419t = this.f6305n;
            int i3 = c1419t.f6273d;
            c1419t.f6273d = i3 + 1;
            c1419t.m3543b(10, i3, 0, c1443p != null ? c1443p.f6388a : null, null);
        }
        m3566m();
    }

    /* JADX INFO: renamed from: i */
    public final void m3562i() {
        if (this.f6304m) {
            return;
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.f6300i);
        try {
            this.f6304m = this.f6407a.bindService(intent, this, Build.VERSION.SDK_INT >= 29 ? 4097 : 1);
        } catch (SecurityException unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    public final C1424Y m3563j(String str, String str2) {
        C0471D c0471d = this.f6413g;
        if (c0471d == null) {
            return null;
        }
        List list = (List) c0471d.f1566c;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((C1442o) list.get(i3)).m3610d().equals(str)) {
                C1424Y c1424y = new C1424Y(this, str, str2);
                this.f6302k.add(c1424y);
                if (this.f6306o) {
                    c1424y.mo3547b(this.f6305n);
                }
                m3566m();
                return c1424y;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m3564k() {
        if (this.f6305n != null) {
            m3630g(null);
            this.f6306o = false;
            ArrayList arrayList = this.f6302k;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((InterfaceC1420U) arrayList.get(i3)).mo3548c();
            }
            C1419T c1419t = this.f6305n;
            c1419t.m3543b(2, 0, 0, null, null);
            c1419t.f6271b.f6280b.clear();
            c1419t.f6270a.getBinder().unlinkToDeath(c1419t, 0);
            ServiceConnectionC1425Z serviceConnectionC1425Z = c1419t.f6278i;
            serviceConnectionC1425Z.f6301j.post(new RunnableC1418S(c1419t, 0));
            this.f6305n = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m3565l() {
        if (this.f6304m) {
            this.f6304m = false;
            m3564k();
            try {
                this.f6407a.unbindService(this);
            } catch (IllegalArgumentException e3) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e3);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m3566m() {
        if (!this.f6303l || (this.f6411e == null && this.f6302k.isEmpty())) {
            m3565l();
        } else {
            m3562i();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f6304m) {
            m3564k();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        C1419T c1419t = new C1419T(this, messenger);
                        int i3 = c1419t.f6273d;
                        c1419t.f6273d = i3 + 1;
                        c1419t.f6276g = i3;
                        if (c1419t.m3543b(1, i3, 4, null, null)) {
                            try {
                                c1419t.f6270a.getBinder().linkToDeath(c1419t, 0);
                                this.f6305n = c1419t;
                                return;
                            } catch (RemoteException unused) {
                                c1419t.binderDied();
                                return;
                            }
                        }
                        return;
                    }
                } catch (NullPointerException unused2) {
                }
            }
            Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        m3564k();
    }

    public final String toString() {
        return "Service connection " + this.f6300i.flattenToShortString();
    }
}

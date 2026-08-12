package p046P1;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p054S1.C0537a;

/* JADX INFO: renamed from: P1.A */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC0468A implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final HashMap f1547a = new HashMap();

    /* JADX INFO: renamed from: b */
    public int f1548b = 2;

    /* JADX INFO: renamed from: c */
    public boolean f1549c;

    /* JADX INFO: renamed from: d */
    public IBinder f1550d;

    /* JADX INFO: renamed from: e */
    public final C0498z f1551e;

    /* JADX INFO: renamed from: f */
    public ComponentName f1552f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0470C f1553g;

    public ServiceConnectionC0468A(C0470C c0470c, C0498z c0498z) {
        this.f1553g = c0470c;
        this.f1551e = c0498z;
    }

    /* JADX INFO: renamed from: a */
    public final void m1179a(String str, Executor executor) throws Throwable {
        this.f1548b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            C0470C c0470c = this.f1553g;
            C0537a c0537a = c0470c.f1561d;
            Context context = c0470c.f1559b;
            try {
                boolean zM1346b = c0537a.m1346b(context, str, this.f1551e.m1217a(context), this, executor);
                this.f1549c = zM1346b;
                if (zM1346b) {
                    this.f1553g.f1560c.sendMessageDelayed(this.f1553g.f1560c.obtainMessage(1, this.f1551e), this.f1553g.f1563f);
                } else {
                    this.f1548b = 2;
                    try {
                        C0470C c0470c2 = this.f1553g;
                        c0470c2.f1561d.m1345a(c0470c2.f1559b, this);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                StrictMode.setVmPolicy(vmPolicy);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                StrictMode.setVmPolicy(vmPolicy);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f1553g.f1558a) {
            try {
                this.f1553g.f1560c.removeMessages(1, this.f1551e);
                this.f1550d = iBinder;
                this.f1552f = componentName;
                Iterator it = this.f1547a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f1548b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f1553g.f1558a) {
            try {
                this.f1553g.f1560c.removeMessages(1, this.f1551e);
                this.f1550d = null;
                this.f1552f = componentName;
                Iterator it = this.f1547a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f1548b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

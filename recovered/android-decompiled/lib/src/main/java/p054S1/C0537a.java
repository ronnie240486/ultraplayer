package p054S1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import p046P1.ServiceConnectionC0468A;
import p060U1.C0612c;

/* JADX INFO: renamed from: S1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0537a {

    /* JADX INFO: renamed from: a */
    public static final Object f1871a = new Object();

    /* JADX INFO: renamed from: b */
    public static volatile C0537a f1872b;

    /* JADX INFO: renamed from: a */
    public final void m1345a(Context context, ServiceConnectionC0468A serviceConnectionC0468A) {
        try {
            context.unbindService(serviceConnectionC0468A);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1346b(Context context, String str, Intent intent, ServiceConnectionC0468A serviceConnectionC0468A, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C0612c.m1534a(context).f2316a.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (executor == null) {
            executor = null;
        }
        return (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnectionC0468A, 4225) : context.bindService(intent, 4225, executor, serviceConnectionC0468A);
    }
}

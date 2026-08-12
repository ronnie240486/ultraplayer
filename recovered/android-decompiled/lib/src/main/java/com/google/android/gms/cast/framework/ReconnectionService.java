package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.AbstractC1267d;
import com.google.android.gms.internal.cast.AbstractC1339v;
import com.google.android.gms.internal.cast.C1275f;
import p016F1.C0175A;
import p016F1.C0185b;
import p016F1.C0188e;
import p016F1.C0192i;
import p016F1.C0195l;
import p016F1.C0203t;
import p016F1.C0204u;
import p016F1.InterfaceC0206w;
import p028J1.C0296b;
import p046P1.AbstractC0491s;
import p063V1.BinderC0630b;
import p063V1.InterfaceC0629a;

/* JADX INFO: loaded from: classes.dex */
public class ReconnectionService extends Service {

    /* JADX INFO: renamed from: h */
    public static final C0296b f5472h = new C0296b("ReconnectionService", null);

    /* JADX INFO: renamed from: g */
    public InterfaceC0206w f5473g;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        InterfaceC0206w interfaceC0206w = this.f5473g;
        if (interfaceC0206w != null) {
            try {
                C0204u c0204u = (C0204u) interfaceC0206w;
                Parcel parcelM1894e0 = c0204u.m1894e0();
                AbstractC1339v.m3421c(parcelM1894e0, intent);
                Parcel parcelM1895q0 = c0204u.m1895q0(parcelM1894e0, 3);
                IBinder strongBinder = parcelM1895q0.readStrongBinder();
                parcelM1895q0.recycle();
                return strongBinder;
            } catch (RemoteException e3) {
                f5472h.m830a(e3, "Unable to call %s on %s.", "onBind", InterfaceC0206w.class.getSimpleName());
            }
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        InterfaceC0629a interfaceC0629aM1558v0;
        InterfaceC0629a interfaceC0629aM1558v1;
        C0185b c0185bM670a = C0185b.m670a(this);
        c0185bM670a.getClass();
        AbstractC0491s.m1210b();
        C0192i c0192i = c0185bM670a.f428c;
        c0192i.getClass();
        InterfaceC0206w interfaceC0206wM3251x0 = null;
        try {
            C0175A c0175a = c0192i.f470a;
            Parcel parcelM1895q0 = c0175a.m1895q0(c0175a.m1894e0(), 7);
            interfaceC0629aM1558v0 = BinderC0630b.m1558v0(parcelM1895q0.readStrongBinder());
            parcelM1895q0.recycle();
        } catch (RemoteException e3) {
            C0192i.f469c.m830a(e3, "Unable to call %s on %s.", "getWrappedThis", C0175A.class.getSimpleName());
            interfaceC0629aM1558v0 = null;
        }
        AbstractC0491s.m1210b();
        C0195l c0195l = c0185bM670a.f429d;
        c0195l.getClass();
        try {
            C0203t c0203t = c0195l.f474a;
            Parcel parcelM1895q1 = c0203t.m1895q0(c0203t.m1894e0(), 5);
            interfaceC0629aM1558v1 = BinderC0630b.m1558v0(parcelM1895q1.readStrongBinder());
            parcelM1895q1.recycle();
        } catch (RemoteException e4) {
            C0195l.f473b.m830a(e4, "Unable to call %s on %s.", "getWrappedThis", C0203t.class.getSimpleName());
            interfaceC0629aM1558v1 = null;
        }
        C0296b c0296b = AbstractC1267d.f5825a;
        if (interfaceC0629aM1558v0 != null && interfaceC0629aM1558v1 != null) {
            try {
                interfaceC0206wM3251x0 = AbstractC1267d.m3244b(getApplicationContext()).m3251x0(new BinderC0630b(this), interfaceC0629aM1558v0, interfaceC0629aM1558v1);
            } catch (C0188e | RemoteException e5) {
                AbstractC1267d.f5825a.m830a(e5, "Unable to call %s on %s.", "newReconnectionServiceImpl", C1275f.class.getSimpleName());
            }
        }
        this.f5473g = interfaceC0206wM3251x0;
        if (interfaceC0206wM3251x0 != null) {
            try {
                C0204u c0204u = (C0204u) interfaceC0206wM3251x0;
                c0204u.m1896u0(c0204u.m1894e0(), 1);
            } catch (RemoteException e6) {
                f5472h.m830a(e6, "Unable to call %s on %s.", "onCreate", InterfaceC0206w.class.getSimpleName());
            }
            super.onCreate();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        InterfaceC0206w interfaceC0206w = this.f5473g;
        if (interfaceC0206w != null) {
            try {
                C0204u c0204u = (C0204u) interfaceC0206w;
                c0204u.m1896u0(c0204u.m1894e0(), 4);
            } catch (RemoteException e3) {
                f5472h.m830a(e3, "Unable to call %s on %s.", "onDestroy", InterfaceC0206w.class.getSimpleName());
            }
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i3, int i4) {
        InterfaceC0206w interfaceC0206w = this.f5473g;
        if (interfaceC0206w != null) {
            try {
                C0204u c0204u = (C0204u) interfaceC0206w;
                Parcel parcelM1894e0 = c0204u.m1894e0();
                AbstractC1339v.m3421c(parcelM1894e0, intent);
                parcelM1894e0.writeInt(i3);
                parcelM1894e0.writeInt(i4);
                Parcel parcelM1895q0 = c0204u.m1895q0(parcelM1894e0, 2);
                int i5 = parcelM1895q0.readInt();
                parcelM1895q0.recycle();
                return i5;
            } catch (RemoteException e3) {
                f5472h.m830a(e3, "Unable to call %s on %s.", "onStartCommand", InterfaceC0206w.class.getSimpleName());
            }
        }
        return 2;
    }
}

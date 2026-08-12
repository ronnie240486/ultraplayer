package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;
import p028J1.C0296b;
import p046P1.AbstractC0491s;
import p089d1.AbstractC1452y;
import p089d1.C1403C;
import p089d1.C1405E;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1283h extends AbstractC1452y {

    /* JADX INFO: renamed from: b */
    public static final C0296b f5903b = new C0296b("MediaRouterCallback", null);

    /* JADX INFO: renamed from: a */
    public final C1279g f5904a;

    public C1283h(C1279g c1279g) {
        AbstractC0491s.m1213e(c1279g);
        this.f5904a = c1279g;
    }

    @Override // p089d1.AbstractC1452y
    /* JADX INFO: renamed from: d */
    public final void mo2604d(C1403C c1403c) {
        try {
            C1279g c1279g = this.f5904a;
            String str = c1403c.f6218c;
            Bundle bundle = c1403c.f6234s;
            Parcel parcelM1894e0 = c1279g.m1894e0();
            parcelM1894e0.writeString(str);
            AbstractC1339v.m3421c(parcelM1894e0, bundle);
            c1279g.m1896u0(parcelM1894e0, 1);
        } catch (RemoteException e3) {
            f5903b.m830a(e3, "Unable to call %s on %s.", "onRouteAdded", C1279g.class.getSimpleName());
        }
    }

    @Override // p089d1.AbstractC1452y
    /* JADX INFO: renamed from: e */
    public final void mo2605e(C1403C c1403c) {
        try {
            C1279g c1279g = this.f5904a;
            String str = c1403c.f6218c;
            Bundle bundle = c1403c.f6234s;
            Parcel parcelM1894e0 = c1279g.m1894e0();
            parcelM1894e0.writeString(str);
            AbstractC1339v.m3421c(parcelM1894e0, bundle);
            c1279g.m1896u0(parcelM1894e0, 2);
        } catch (RemoteException e3) {
            f5903b.m830a(e3, "Unable to call %s on %s.", "onRouteChanged", C1279g.class.getSimpleName());
        }
    }

    @Override // p089d1.AbstractC1452y
    /* JADX INFO: renamed from: f */
    public final void mo2606f(C1403C c1403c) {
        try {
            C1279g c1279g = this.f5904a;
            String str = c1403c.f6218c;
            Bundle bundle = c1403c.f6234s;
            Parcel parcelM1894e0 = c1279g.m1894e0();
            parcelM1894e0.writeString(str);
            AbstractC1339v.m3421c(parcelM1894e0, bundle);
            c1279g.m1896u0(parcelM1894e0, 3);
        } catch (RemoteException e3) {
            f5903b.m830a(e3, "Unable to call %s on %s.", "onRouteRemoved", C1279g.class.getSimpleName());
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0033  */
    @Override // p089d1.AbstractC1452y
    /* JADX INFO: renamed from: h */
    public final void mo3266h(C1405E c1405e, C1403C c1403c, int i3) {
        char c;
        CastDevice castDeviceM3070e;
        String str;
        CastDevice castDeviceM3070e2;
        C1279g c1279g = this.f5904a;
        Integer numValueOf = Integer.valueOf(i3);
        String str2 = c1403c.f6218c;
        Object[] objArr = {numValueOf, str2};
        C0296b c0296b = f5903b;
        Log.i(c0296b.f788a, c0296b.m833d("onRouteSelected with reason = %d, routeId = %s", objArr));
        if (c1403c.f6227l != 1) {
            return;
        }
        if (str2 != null) {
            try {
                if (str2.endsWith("-groupRoute") && (castDeviceM3070e = CastDevice.m3070e(c1403c.f6234s)) != null) {
                    String strSubstring = castDeviceM3070e.f5419g;
                    if (strSubstring.startsWith("__cast_nearby__")) {
                        strSubstring = strSubstring.substring(16);
                    }
                    c1405e.getClass();
                    C1405E.m3510b();
                    ArrayList arrayList = C1405E.m3511c().f6339j;
                    int size = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            Object obj = arrayList.get(i4);
                            i4++;
                            C1403C c1403c2 = (C1403C) obj;
                            c = 0;
                            try {
                                str = c1403c2.f6218c;
                                if (str != null && !str.endsWith("-groupRoute") && (castDeviceM3070e2 = CastDevice.m3070e(c1403c2.f6234s)) != null) {
                                    String strSubstring2 = castDeviceM3070e2.f5419g;
                                    if (strSubstring2.startsWith("__cast_nearby__")) {
                                        strSubstring2 = strSubstring2.substring(16);
                                    }
                                    if (TextUtils.equals(strSubstring2, strSubstring)) {
                                        c0296b.m831b("routeId is changed from %s to %s", str2, str);
                                    }
                                }
                            } catch (RemoteException e3) {
                                e = e3;
                                String simpleName = C1279g.class.getSimpleName();
                                Object[] objArr2 = new Object[2];
                                objArr2[c] = "onRouteSelected";
                                objArr2[1] = simpleName;
                                c0296b.m830a(e, "Unable to call %s on %s.", objArr2);
                                return;
                            }
                        } else {
                            str = str2;
                        }
                    }
                } else {
                    str = str2;
                }
            } catch (RemoteException e4) {
                e = e4;
                c = 0;
            }
        } else {
            str = str2;
        }
        Parcel parcelM1895q0 = c1279g.m1895q0(c1279g.m1894e0(), 7);
        int i5 = parcelM1895q0.readInt();
        parcelM1895q0.recycle();
        if (i5 < 220400000) {
            Bundle bundle = c1403c.f6234s;
            Parcel parcelM1894e0 = c1279g.m1894e0();
            parcelM1894e0.writeString(str);
            AbstractC1339v.m3421c(parcelM1894e0, bundle);
            c1279g.m1896u0(parcelM1894e0, 4);
            return;
        }
        Bundle bundle2 = c1403c.f6234s;
        Parcel parcelM1894e1 = c1279g.m1894e0();
        parcelM1894e1.writeString(str);
        parcelM1894e1.writeString(str2);
        AbstractC1339v.m3421c(parcelM1894e1, bundle2);
        c1279g.m1896u0(parcelM1894e1, 8);
    }

    @Override // p089d1.AbstractC1452y
    /* JADX INFO: renamed from: j */
    public final void mo3267j(C1405E c1405e, C1403C c1403c, int i3) {
        Integer numValueOf = Integer.valueOf(i3);
        String str = c1403c.f6218c;
        Object[] objArr = {numValueOf, str};
        C0296b c0296b = f5903b;
        Log.i(c0296b.f788a, c0296b.m833d("onRouteUnselected with reason = %d, routeId = %s", objArr));
        if (c1403c.f6227l != 1) {
            c0296b.m831b("skip route unselection for non-cast route", new Object[0]);
            return;
        }
        try {
            C1279g c1279g = this.f5904a;
            Bundle bundle = c1403c.f6234s;
            Parcel parcelM1894e0 = c1279g.m1894e0();
            parcelM1894e0.writeString(str);
            AbstractC1339v.m3421c(parcelM1894e0, bundle);
            parcelM1894e0.writeInt(i3);
            c1279g.m1896u0(parcelM1894e0, 6);
        } catch (RemoteException e3) {
            c0296b.m830a(e3, "Unable to call %s on %s.", "onRouteUnselected", C1279g.class.getSimpleName());
        }
    }
}

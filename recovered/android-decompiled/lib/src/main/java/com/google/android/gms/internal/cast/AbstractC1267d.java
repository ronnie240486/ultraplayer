package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;
import p016F1.AbstractBinderC0198o;
import p016F1.C0186c;
import p016F1.C0188e;
import p016F1.C0197n;
import p016F1.InterfaceC0199p;
import p028J1.C0296b;
import p063V1.BinderC0630b;
import p066W1.C0661b;
import p066W1.C0662c;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1267d {

    /* JADX INFO: renamed from: a */
    public static final C0296b f5825a = new C0296b("CastDynamiteModule", null);

    /* JADX INFO: renamed from: a */
    public static InterfaceC0199p m3243a(Context context, C0186c c0186c, BinderC1319q binderC1319q, HashMap map) {
        InterfaceC0199p c0197n;
        C1275f c1275fM3244b = m3244b(context);
        BinderC0630b binderC0630b = new BinderC0630b(context.getApplicationContext());
        Parcel parcelM1894e0 = c1275fM3244b.m1894e0();
        AbstractC1339v.m3422d(parcelM1894e0, binderC0630b);
        AbstractC1339v.m3421c(parcelM1894e0, c0186c);
        AbstractC1339v.m3422d(parcelM1894e0, binderC1319q);
        parcelM1894e0.writeMap(map);
        Parcel parcelM1895q0 = c1275fM3244b.m1895q0(parcelM1894e0, 1);
        IBinder strongBinder = parcelM1895q0.readStrongBinder();
        int i3 = AbstractBinderC0198o.f476c;
        if (strongBinder == null) {
            c0197n = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            c0197n = iInterfaceQueryLocalInterface instanceof InterfaceC0199p ? (InterfaceC0199p) iInterfaceQueryLocalInterface : new C0197n(strongBinder, "com.google.android.gms.cast.framework.ICastContext", 2);
        }
        parcelM1895q0.recycle();
        return c0197n;
    }

    /* JADX INFO: renamed from: b */
    public static C1275f m3244b(Context context) {
        try {
            try {
                IBinder iBinder = (IBinder) C0662c.m1713a(context, C0662c.f2543b).f2554a.getClassLoader().loadClass("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl").newInstance();
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
                return iInterfaceQueryLocalInterface instanceof C1275f ? (C1275f) iInterfaceQueryLocalInterface : new C1275f(iBinder, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule", 2);
            } catch (ClassNotFoundException e3) {
                e = e3;
                throw new C0661b("Failed to instantiate module class: ".concat("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl"), e);
            } catch (IllegalAccessException e4) {
                e = e4;
                throw new C0661b("Failed to instantiate module class: ".concat("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl"), e);
            } catch (InstantiationException e5) {
                e = e5;
                throw new C0661b("Failed to instantiate module class: ".concat("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl"), e);
            }
        } catch (C0661b e6) {
            throw new C0188e(e6);
        }
    }
}

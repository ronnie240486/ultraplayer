package com.google.android.gms.internal.cast;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p016F1.AbstractBinderC0201r;
import p016F1.AbstractBinderC0205v;
import p016F1.AbstractBinderC0208y;
import p016F1.BinderC0176B;
import p016F1.C0186c;
import p016F1.C0200q;
import p016F1.C0204u;
import p016F1.C0207x;
import p016F1.InterfaceC0202s;
import p016F1.InterfaceC0206w;
import p016F1.InterfaceC0209z;
import p022H1.AbstractBinderC0261e;
import p022H1.C0260d;
import p022H1.InterfaceC0262f;
import p063V1.BinderC0630b;
import p063V1.InterfaceC0629a;
import p075Z1.AbstractC0780a;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1275f extends AbstractC0780a {
    /* JADX INFO: renamed from: A0 */
    public final InterfaceC0262f m3249A0(BinderC0630b binderC0630b, BinderC0630b binderC0630b2, BinderC0176B binderC0176B, int i3, int i4) {
        InterfaceC0262f c0260d;
        Parcel parcelM1894e0 = m1894e0();
        AbstractC1339v.m3422d(parcelM1894e0, binderC0630b);
        AbstractC1339v.m3422d(parcelM1894e0, binderC0630b2);
        AbstractC1339v.m3422d(parcelM1894e0, binderC0176B);
        parcelM1894e0.writeInt(i3);
        parcelM1894e0.writeInt(i4);
        parcelM1894e0.writeInt(0);
        parcelM1894e0.writeLong(2097152L);
        parcelM1894e0.writeInt(5);
        parcelM1894e0.writeInt(333);
        parcelM1894e0.writeInt(10000);
        Parcel parcelM1895q0 = m1895q0(parcelM1894e0, 7);
        IBinder strongBinder = parcelM1895q0.readStrongBinder();
        int i5 = AbstractBinderC0261e.f671c;
        if (strongBinder == null) {
            c0260d = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            c0260d = iInterfaceQueryLocalInterface instanceof InterfaceC0262f ? (InterfaceC0262f) iInterfaceQueryLocalInterface : new C0260d(strongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 2);
        }
        parcelM1895q0.recycle();
        return c0260d;
    }

    /* JADX INFO: renamed from: w0 */
    public final InterfaceC0202s m3250w0(C0186c c0186c, InterfaceC0629a interfaceC0629a, BinderC0176B binderC0176B) {
        InterfaceC0202s c0200q;
        Parcel parcelM1894e0 = m1894e0();
        AbstractC1339v.m3421c(parcelM1894e0, c0186c);
        AbstractC1339v.m3422d(parcelM1894e0, interfaceC0629a);
        AbstractC1339v.m3422d(parcelM1894e0, binderC0176B);
        Parcel parcelM1895q0 = m1895q0(parcelM1894e0, 3);
        IBinder strongBinder = parcelM1895q0.readStrongBinder();
        int i3 = AbstractBinderC0201r.f477c;
        if (strongBinder == null) {
            c0200q = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            c0200q = iInterfaceQueryLocalInterface instanceof InterfaceC0202s ? (InterfaceC0202s) iInterfaceQueryLocalInterface : new C0200q(strongBinder, "com.google.android.gms.cast.framework.ICastSession", 2);
        }
        parcelM1895q0.recycle();
        return c0200q;
    }

    /* JADX INFO: renamed from: x0 */
    public final InterfaceC0206w m3251x0(BinderC0630b binderC0630b, InterfaceC0629a interfaceC0629a, InterfaceC0629a interfaceC0629a2) {
        InterfaceC0206w c0204u;
        Parcel parcelM1894e0 = m1894e0();
        AbstractC1339v.m3422d(parcelM1894e0, binderC0630b);
        AbstractC1339v.m3422d(parcelM1894e0, interfaceC0629a);
        AbstractC1339v.m3422d(parcelM1894e0, interfaceC0629a2);
        Parcel parcelM1895q0 = m1895q0(parcelM1894e0, 5);
        IBinder strongBinder = parcelM1895q0.readStrongBinder();
        int i3 = AbstractBinderC0205v.f478c;
        if (strongBinder == null) {
            c0204u = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            c0204u = iInterfaceQueryLocalInterface instanceof InterfaceC0206w ? (InterfaceC0206w) iInterfaceQueryLocalInterface : new C0204u(strongBinder, "com.google.android.gms.cast.framework.IReconnectionService", 2);
        }
        parcelM1895q0.recycle();
        return c0204u;
    }

    /* JADX INFO: renamed from: y0 */
    public final InterfaceC0209z m3252y0(String str, String str2, BinderC0176B binderC0176B) {
        InterfaceC0209z c0207x;
        Parcel parcelM1894e0 = m1894e0();
        parcelM1894e0.writeString(str);
        parcelM1894e0.writeString(str2);
        AbstractC1339v.m3422d(parcelM1894e0, binderC0176B);
        Parcel parcelM1895q0 = m1895q0(parcelM1894e0, 2);
        IBinder strongBinder = parcelM1895q0.readStrongBinder();
        int i3 = AbstractBinderC0208y.f479c;
        if (strongBinder == null) {
            c0207x = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            c0207x = iInterfaceQueryLocalInterface instanceof InterfaceC0209z ? (InterfaceC0209z) iInterfaceQueryLocalInterface : new C0207x(strongBinder, "com.google.android.gms.cast.framework.ISession", 2);
        }
        parcelM1895q0.recycle();
        return c0207x;
    }

    /* JADX INFO: renamed from: z0 */
    public final InterfaceC0262f m3253z0(BinderC0630b binderC0630b, BinderC0176B binderC0176B, int i3, int i4) {
        InterfaceC0262f c0260d;
        Parcel parcelM1894e0 = m1894e0();
        AbstractC1339v.m3422d(parcelM1894e0, binderC0630b);
        AbstractC1339v.m3422d(parcelM1894e0, binderC0176B);
        parcelM1894e0.writeInt(i3);
        parcelM1894e0.writeInt(i4);
        parcelM1894e0.writeInt(0);
        parcelM1894e0.writeLong(2097152L);
        parcelM1894e0.writeInt(5);
        parcelM1894e0.writeInt(333);
        parcelM1894e0.writeInt(10000);
        Parcel parcelM1895q0 = m1895q0(parcelM1894e0, 6);
        IBinder strongBinder = parcelM1895q0.readStrongBinder();
        int i5 = AbstractBinderC0261e.f671c;
        if (strongBinder == null) {
            c0260d = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            c0260d = iInterfaceQueryLocalInterface instanceof InterfaceC0262f ? (InterfaceC0262f) iInterfaceQueryLocalInterface : new C0260d(strongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 2);
        }
        parcelM1895q0.recycle();
        return c0260d;
    }
}

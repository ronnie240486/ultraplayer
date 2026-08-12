package p066W1;

import android.os.Parcel;
import p063V1.BinderC0630b;
import p063V1.InterfaceC0629a;
import p075Z1.AbstractC0780a;
import p079a2.AbstractC0853b;

/* JADX INFO: renamed from: W1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0667h extends AbstractC0780a {
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC0629a m1775w0(BinderC0630b binderC0630b, int i3) {
        Parcel parcelM1894e0 = m1894e0();
        AbstractC0853b.m2116c(parcelM1894e0, binderC0630b);
        parcelM1894e0.writeString("com.google.android.gms.cast.framework.dynamite");
        parcelM1894e0.writeInt(i3);
        Parcel parcelM1893P = m1893P(parcelM1894e0, 2);
        InterfaceC0629a interfaceC0629aM1558v0 = BinderC0630b.m1558v0(parcelM1893P.readStrongBinder());
        parcelM1893P.recycle();
        return interfaceC0629aM1558v0;
    }

    /* JADX INFO: renamed from: x0 */
    public final InterfaceC0629a m1776x0(BinderC0630b binderC0630b, int i3, BinderC0630b binderC0630b2) {
        Parcel parcelM1894e0 = m1894e0();
        AbstractC0853b.m2116c(parcelM1894e0, binderC0630b);
        parcelM1894e0.writeString("com.google.android.gms.cast.framework.dynamite");
        parcelM1894e0.writeInt(i3);
        AbstractC0853b.m2116c(parcelM1894e0, binderC0630b2);
        Parcel parcelM1893P = m1893P(parcelM1894e0, 8);
        InterfaceC0629a interfaceC0629aM1558v0 = BinderC0630b.m1558v0(parcelM1893P.readStrongBinder());
        parcelM1893P.recycle();
        return interfaceC0629aM1558v0;
    }

    /* JADX INFO: renamed from: y0 */
    public final InterfaceC0629a m1777y0(BinderC0630b binderC0630b, int i3) {
        Parcel parcelM1894e0 = m1894e0();
        AbstractC0853b.m2116c(parcelM1894e0, binderC0630b);
        parcelM1894e0.writeString("com.google.android.gms.cast.framework.dynamite");
        parcelM1894e0.writeInt(i3);
        Parcel parcelM1893P = m1893P(parcelM1894e0, 4);
        InterfaceC0629a interfaceC0629aM1558v0 = BinderC0630b.m1558v0(parcelM1893P.readStrongBinder());
        parcelM1893P.recycle();
        return interfaceC0629aM1558v0;
    }

    /* JADX INFO: renamed from: z0 */
    public final InterfaceC0629a m1778z0(BinderC0630b binderC0630b, boolean z3, long j3) {
        Parcel parcelM1894e0 = m1894e0();
        AbstractC0853b.m2116c(parcelM1894e0, binderC0630b);
        parcelM1894e0.writeString("com.google.android.gms.cast.framework.dynamite");
        parcelM1894e0.writeInt(z3 ? 1 : 0);
        parcelM1894e0.writeLong(j3);
        Parcel parcelM1893P = m1893P(parcelM1894e0, 7);
        InterfaceC0629a interfaceC0629aM1558v0 = BinderC0630b.m1558v0(parcelM1893P.readStrongBinder());
        parcelM1893P.recycle();
        return interfaceC0629aM1558v0;
    }
}

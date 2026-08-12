package p016F1;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.AbstractC1267d;
import com.google.android.gms.internal.cast.C1275f;
import p028J1.C0296b;
import p046P1.AbstractC0491s;
import p063V1.BinderC0630b;
import p063V1.InterfaceC0629a;

/* JADX INFO: renamed from: F1.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0191h {

    /* JADX INFO: renamed from: b */
    public static final C0296b f467b = new C0296b("Session", null);

    /* JADX INFO: renamed from: a */
    public final InterfaceC0209z f468a;

    public AbstractC0191h(Context context, String str, String str2) {
        InterfaceC0209z interfaceC0209zM3252y0;
        try {
            interfaceC0209zM3252y0 = AbstractC1267d.m3244b(context).m3252y0(str, str2, new BinderC0176B(this));
        } catch (C0188e | RemoteException e3) {
            AbstractC1267d.f5825a.m830a(e3, "Unable to call %s on %s.", "newSessionImpl", C1275f.class.getSimpleName());
            interfaceC0209zM3252y0 = null;
        }
        this.f468a = interfaceC0209zM3252y0;
    }

    /* JADX INFO: renamed from: a */
    public final void m675a(int i3) {
        InterfaceC0209z interfaceC0209z = this.f468a;
        if (interfaceC0209z == null) {
            return;
        }
        try {
            C0207x c0207x = (C0207x) interfaceC0209z;
            Parcel parcelM1894e0 = c0207x.m1894e0();
            parcelM1894e0.writeInt(i3);
            c0207x.m1896u0(parcelM1894e0, 13);
        } catch (RemoteException e3) {
            f467b.m830a(e3, "Unable to call %s on %s.", "notifySessionEnded", InterfaceC0209z.class.getSimpleName());
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m676b() {
        AbstractC0491s.m1210b();
        InterfaceC0209z interfaceC0209z = this.f468a;
        if (interfaceC0209z != null) {
            try {
                C0207x c0207x = (C0207x) interfaceC0209z;
                Parcel parcelM1895q0 = c0207x.m1895q0(c0207x.m1894e0(), 17);
                int i3 = parcelM1895q0.readInt();
                parcelM1895q0.recycle();
                if (i3 >= 211100000) {
                    C0207x c0207x2 = (C0207x) interfaceC0209z;
                    Parcel parcelM1895q1 = c0207x2.m1895q0(c0207x2.m1894e0(), 18);
                    int i4 = parcelM1895q1.readInt();
                    parcelM1895q1.recycle();
                    return i4;
                }
            } catch (RemoteException e3) {
                f467b.m830a(e3, "Unable to call %s on %s.", "getSessionStartType", InterfaceC0209z.class.getSimpleName());
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC0629a m677c() {
        InterfaceC0209z interfaceC0209z = this.f468a;
        if (interfaceC0209z != null) {
            try {
                C0207x c0207x = (C0207x) interfaceC0209z;
                Parcel parcelM1895q0 = c0207x.m1895q0(c0207x.m1894e0(), 1);
                InterfaceC0629a interfaceC0629aM1558v0 = BinderC0630b.m1558v0(parcelM1895q0.readStrongBinder());
                parcelM1895q0.recycle();
                return interfaceC0629aM1558v0;
            } catch (RemoteException e3) {
                f467b.m830a(e3, "Unable to call %s on %s.", "getWrappedObject", InterfaceC0209z.class.getSimpleName());
            }
        }
        return null;
    }
}

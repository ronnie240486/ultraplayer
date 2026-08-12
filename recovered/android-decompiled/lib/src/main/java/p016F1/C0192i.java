package p016F1;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.cast.AbstractC1339v;
import p028J1.C0296b;
import p046P1.AbstractC0491s;
import p063V1.BinderC0630b;
import p063V1.InterfaceC0629a;

/* JADX INFO: renamed from: F1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0192i {

    /* JADX INFO: renamed from: c */
    public static final C0296b f469c = new C0296b("SessionManager", null);

    /* JADX INFO: renamed from: a */
    public final C0175A f470a;

    /* JADX INFO: renamed from: b */
    public final Context f471b;

    public C0192i(C0175A c0175a, Context context) {
        this.f470a = c0175a;
        this.f471b = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m678a(InterfaceC0193j interfaceC0193j) {
        AbstractC0491s.m1210b();
        try {
            C0175A c0175a = this.f470a;
            BinderC0177C binderC0177C = new BinderC0177C(interfaceC0193j);
            Parcel parcelM1894e0 = c0175a.m1894e0();
            AbstractC1339v.m3422d(parcelM1894e0, binderC0177C);
            c0175a.m1896u0(parcelM1894e0, 2);
        } catch (RemoteException e3) {
            f469c.m830a(e3, "Unable to call %s on %s.", "addSessionManagerListener", C0175A.class.getSimpleName());
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m679b(boolean z3) {
        C0296b c0296b = f469c;
        AbstractC0491s.m1210b();
        try {
            Log.i(c0296b.f788a, c0296b.m833d("End session for %s", this.f471b.getPackageName()));
            C0175A c0175a = this.f470a;
            Parcel parcelM1894e0 = c0175a.m1894e0();
            int i3 = AbstractC1339v.f5981a;
            parcelM1894e0.writeInt(1);
            parcelM1894e0.writeInt(z3 ? 1 : 0);
            c0175a.m1896u0(parcelM1894e0, 6);
        } catch (RemoteException e3) {
            c0296b.m830a(e3, "Unable to call %s on %s.", "endCurrentSession", C0175A.class.getSimpleName());
        }
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC0191h m680c() {
        AbstractC0491s.m1210b();
        try {
            C0175A c0175a = this.f470a;
            Parcel parcelM1895q0 = c0175a.m1895q0(c0175a.m1894e0(), 1);
            InterfaceC0629a interfaceC0629aM1558v0 = BinderC0630b.m1558v0(parcelM1895q0.readStrongBinder());
            parcelM1895q0.recycle();
            return (AbstractC0191h) BinderC0630b.m1559w0(interfaceC0629aM1558v0);
        } catch (RemoteException e3) {
            f469c.m830a(e3, "Unable to call %s on %s.", "getWrappedCurrentSession", C0175A.class.getSimpleName());
            return null;
        }
    }
}

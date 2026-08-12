package p046P1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC1152a;
import p079a2.AbstractBinderC0852a;
import p079a2.AbstractC0853b;

/* JADX INFO: renamed from: P1.u */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0493u extends AbstractBinderC0852a {

    /* JADX INFO: renamed from: c */
    public AbstractC1152a f1641c;

    /* JADX INFO: renamed from: d */
    public final int f1642d;

    public BinderC0493u(AbstractC1152a abstractC1152a, int i3) {
        super(0, "com.google.android.gms.common.internal.IGmsCallbacks");
        this.f1641c = abstractC1152a;
        this.f1642d = i3;
    }

    @Override // p079a2.AbstractBinderC0852a
    /* JADX INFO: renamed from: u0 */
    public final boolean mo648u0(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 == 1) {
            int i4 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) AbstractC0853b.m2114a(parcel, Bundle.CREATOR);
            AbstractC0853b.m2115b(parcel);
            AbstractC0491s.m1214f(this.f1641c, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f1641c.mo871w(i4, strongBinder, bundle, this.f1642d);
            this.f1641c = null;
        } else if (i3 == 2) {
            parcel.readInt();
            AbstractC0853b.m2115b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i3 != 3) {
                return false;
            }
            int i5 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            C0497y c0497y = (C0497y) AbstractC0853b.m2114a(parcel, C0497y.CREATOR);
            AbstractC0853b.m2115b(parcel);
            AbstractC1152a abstractC1152a = this.f1641c;
            AbstractC0491s.m1214f(abstractC1152a, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            AbstractC0491s.m1213e(c0497y);
            abstractC1152a.f5535v = c0497y;
            if (abstractC1152a.mo872x()) {
                C0476d c0476d = c0497y.f1651j;
                C0480h c0480hM1197b = C0480h.m1197b();
                C0481i c0481i = c0476d == null ? null : c0476d.f1574g;
                synchronized (c0480hM1197b) {
                    try {
                        if (c0481i == null) {
                            c0481i = C0480h.f1606c;
                        } else {
                            C0481i c0481i2 = (C0481i) c0480hM1197b.f1607a;
                            if (c0481i2 == null || c0481i2.f1608g < c0481i.f1608g) {
                            }
                        }
                        c0480hM1197b.f1607a = c0481i;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            Bundle bundle2 = c0497y.f1648g;
            AbstractC0491s.m1214f(this.f1641c, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f1641c.mo871w(i5, strongBinder2, bundle2, this.f1642d);
            this.f1641c = null;
        }
        parcel2.writeNoException();
        return true;
    }
}

package p016F1;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.AbstractC1339v;
import com.google.android.gms.internal.cast.C1211O1;
import com.google.android.gms.internal.cast.C1251Y2;
import p019G1.C0233h;
import p022H1.C0258b;
import p036M0.C0380q;

/* JADX INFO: renamed from: F1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0194k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0187d f472a;

    public C0194k(C0187d c0187d) {
        this.f472a = c0187d;
    }

    /* JADX INFO: renamed from: a */
    public final void m690a() {
        C0187d c0187d = this.f472a;
        if (c0187d.f458e == null) {
            return;
        }
        try {
            C0233h c0233h = c0187d.f463j;
            if (c0233h != null) {
                c0233h.m768s();
            }
            C0200q c0200q = (C0200q) c0187d.f458e;
            Parcel parcelM1894e0 = c0200q.m1894e0();
            int i3 = AbstractC1339v.f5981a;
            parcelM1894e0.writeInt(0);
            c0200q.m1896u0(parcelM1894e0, 1);
        } catch (RemoteException e3) {
            C0187d.f455m.m830a(e3, "Unable to call %s on %s.", "onConnected", InterfaceC0202s.class.getSimpleName());
        }
        C1211O1 c1211o1 = c0187d.f465l;
        if (c1211o1 != null) {
            C0258b.m779q(c1211o1.f5677g, new C1251Y2(new C0380q(3, 3)));
        }
    }
}

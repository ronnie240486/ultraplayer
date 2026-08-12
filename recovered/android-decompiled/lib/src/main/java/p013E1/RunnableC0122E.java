package p013E1;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.AbstractC1339v;
import java.util.Iterator;
import p016F1.C0187d;
import p016F1.C0194k;
import p016F1.C0200q;
import p016F1.InterfaceC0202s;
import p034L1.C0346a;

/* JADX INFO: renamed from: E1.E */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0122E implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f173g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ BinderC0124G f174h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f175i;

    public /* synthetic */ RunnableC0122E(BinderC0124G binderC0124G, int i3, int i4) {
        this.f173g = i4;
        this.f174h = binderC0124G;
        this.f175i = i3;
    }

    /* JADX INFO: renamed from: a */
    private final void m562a() {
        BinderC0124G binderC0124G = this.f174h;
        C0125H c0125h = binderC0124G.f180c;
        c0125h.f201w = -1;
        c0125h.f202x = -1;
        c0125h.f197s = null;
        c0125h.f198t = null;
        c0125h.f199u = 0.0d;
        c0125h.m586i();
        c0125h.f200v = false;
        c0125h.f203y = null;
        C0125H c0125h2 = binderC0124G.f180c;
        c0125h2.f187E = 1;
        int i3 = this.f175i;
        synchronized (c0125h2.f186D) {
            try {
                Iterator it = binderC0124G.f180c.f186D.iterator();
                while (it.hasNext()) {
                    InterfaceC0202s interfaceC0202s = ((C0194k) it.next()).f472a.f458e;
                    if (interfaceC0202s != null) {
                        try {
                            C0346a c0346a = new C0346a(i3);
                            C0200q c0200q = (C0200q) interfaceC0202s;
                            Parcel parcelM1894e0 = c0200q.m1894e0();
                            AbstractC1339v.m3421c(parcelM1894e0, c0346a);
                            c0200q.m1896u0(parcelM1894e0, 3);
                        } catch (RemoteException e3) {
                            C0187d.f455m.m830a(e3, "Unable to call %s on %s.", "onDisconnected", InterfaceC0202s.class.getSimpleName());
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        binderC0124G.f180c.m584g();
        C0125H c0125h3 = binderC0124G.f180c;
        c0125h3.m583f(c0125h3.f188j);
    }

    /* JADX INFO: renamed from: b */
    private final void m563b() {
        BinderC0124G binderC0124G = this.f174h;
        int i3 = this.f175i;
        if (i3 == 0) {
            C0125H c0125h = binderC0124G.f180c;
            c0125h.f187E = 2;
            c0125h.f190l = true;
            c0125h.f191m = true;
            synchronized (c0125h.f186D) {
                try {
                    Iterator it = binderC0124G.f180c.f186D.iterator();
                    while (it.hasNext()) {
                        ((C0194k) it.next()).m690a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        C0125H c0125h2 = binderC0124G.f180c;
        c0125h2.f187E = 1;
        synchronized (c0125h2.f186D) {
            try {
                Iterator it2 = binderC0124G.f180c.f186D.iterator();
                while (it2.hasNext()) {
                    InterfaceC0202s interfaceC0202s = ((C0194k) it2.next()).f472a.f458e;
                    if (interfaceC0202s != null) {
                        try {
                            C0346a c0346a = new C0346a(i3);
                            C0200q c0200q = (C0200q) interfaceC0202s;
                            Parcel parcelM1894e0 = c0200q.m1894e0();
                            AbstractC1339v.m3421c(parcelM1894e0, c0346a);
                            c0200q.m1896u0(parcelM1894e0, 3);
                        } catch (RemoteException e3) {
                            C0187d.f455m.m830a(e3, "Unable to call %s on %s.", "onConnectionFailed", InterfaceC0202s.class.getSimpleName());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        binderC0124G.f180c.m584g();
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f173g) {
            case 0:
                m562a();
                return;
            case 1:
                m563b();
                return;
            case 2:
                this.f174h.f180c.f185C.m664b(this.f175i);
                return;
            default:
                BinderC0124G binderC0124G = this.f174h;
                C0125H c0125h = binderC0124G.f180c;
                c0125h.f187E = 3;
                int i3 = this.f175i;
                synchronized (c0125h.f186D) {
                    try {
                        Iterator it = binderC0124G.f180c.f186D.iterator();
                        while (it.hasNext()) {
                            InterfaceC0202s interfaceC0202s = ((C0194k) it.next()).f472a.f458e;
                            if (interfaceC0202s != null) {
                                try {
                                    C0200q c0200q = (C0200q) interfaceC0202s;
                                    Parcel parcelM1894e0 = c0200q.m1894e0();
                                    parcelM1894e0.writeInt(i3);
                                    c0200q.m1896u0(parcelM1894e0, 2);
                                } catch (RemoteException e3) {
                                    C0187d.f455m.m830a(e3, "Unable to call %s on %s.", "onConnectionSuspended", InterfaceC0202s.class.getSimpleName());
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }
}

package p016F1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.session.C0858A;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.cast.AbstractC1339v;
import com.google.android.gms.internal.cast.C1271e;
import java.util.HashSet;
import java.util.Iterator;
import p013E1.C0118A;
import p013E1.C0119B;
import p013E1.C0125H;
import p013E1.C0134i;
import p019G1.C0233h;
import p022H1.AsyncTaskC0259c;
import p022H1.C0267k;
import p028J1.C0296b;
import p040N1.C0431l;
import p046P1.AbstractC0491s;
import p063V1.BinderC0630b;
import p063V1.InterfaceC0629a;
import p079a2.AbstractBinderC0852a;
import p097f2.C1563g;
import p097f2.InterfaceC1557a;

/* JADX INFO: renamed from: F1.B */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0176B extends AbstractBinderC0852a {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f408c = 2;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f409d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0176B(C0187d c0187d) {
        super(1, "com.google.android.gms.cast.framework.ICastConnectionController");
        this.f409d = c0187d;
    }

    @Override // p079a2.AbstractBinderC0852a
    /* JADX INFO: renamed from: u0 */
    public final boolean mo648u0(int i3, Parcel parcel, Parcel parcel2) {
        CastDevice castDevice;
        CastDevice castDevice2;
        int i4 = 4;
        Object obj = this.f409d;
        final int i5 = 1;
        final int i6 = 0;
        switch (this.f408c) {
            case 0:
                AbstractC0191h abstractC0191h = (AbstractC0191h) obj;
                switch (i3) {
                    case 1:
                        BinderC0630b binderC0630b = new BinderC0630b(abstractC0191h);
                        parcel2.writeNoException();
                        AbstractC1339v.m3422d(parcel2, binderC0630b);
                        return true;
                    case 2:
                        Bundle bundle = (Bundle) AbstractC1339v.m3419a(parcel, Bundle.CREATOR);
                        AbstractC1339v.m3420b(parcel);
                        ((C0187d) abstractC0191h).m674f(bundle);
                        parcel2.writeNoException();
                        return true;
                    case ModuleDescriptor.MODULE_VERSION /* 3 */:
                        Bundle bundle2 = (Bundle) AbstractC1339v.m3419a(parcel, Bundle.CREATOR);
                        AbstractC1339v.m3420b(parcel);
                        ((C0187d) abstractC0191h).m674f(bundle2);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        int i7 = AbstractC1339v.f5981a;
                        int i8 = parcel.readInt() != 0 ? 1 : 0;
                        AbstractC1339v.m3420b(parcel);
                        C0187d c0187d = (C0187d) abstractC0191h;
                        InterfaceC0202s interfaceC0202s = c0187d.f458e;
                        if (interfaceC0202s != null) {
                            try {
                                C0200q c0200q = (C0200q) interfaceC0202s;
                                Parcel parcelM1894e0 = c0200q.m1894e0();
                                parcelM1894e0.writeInt(i8);
                                parcelM1894e0.writeInt(0);
                                c0200q.m1896u0(parcelM1894e0, 6);
                            } catch (RemoteException e3) {
                                C0187d.f455m.m830a(e3, "Unable to call %s on %s.", "disconnectFromDevice", InterfaceC0202s.class.getSimpleName());
                            }
                            c0187d.m675a(0);
                            break;
                        }
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        C0187d c0187d2 = (C0187d) abstractC0191h;
                        c0187d2.getClass();
                        AbstractC0491s.m1210b();
                        C0233h c0233h = c0187d2.f463j;
                        long jM756f = c0233h == null ? 0L : c0233h.m756f() - c0187d2.f463j.m751a();
                        parcel2.writeNoException();
                        parcel2.writeLong(jM756f);
                        return true;
                    case 6:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        return true;
                    case 7:
                        Bundle bundle3 = (Bundle) AbstractC1339v.m3419a(parcel, Bundle.CREATOR);
                        AbstractC1339v.m3420b(parcel);
                        C0187d c0187d3 = (C0187d) abstractC0191h;
                        c0187d3.getClass();
                        c0187d3.f464k = CastDevice.m3070e(bundle3);
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        Bundle bundle4 = (Bundle) AbstractC1339v.m3419a(parcel, Bundle.CREATOR);
                        AbstractC1339v.m3420b(parcel);
                        C0187d c0187d4 = (C0187d) abstractC0191h;
                        c0187d4.getClass();
                        c0187d4.f464k = CastDevice.m3070e(bundle4);
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        Bundle bundle5 = (Bundle) AbstractC1339v.m3419a(parcel, Bundle.CREATOR);
                        AbstractC1339v.m3420b(parcel);
                        C0187d c0187d5 = (C0187d) abstractC0191h;
                        c0187d5.getClass();
                        CastDevice castDeviceM3070e = CastDevice.m3070e(bundle5);
                        if (castDeviceM3070e != null && !castDeviceM3070e.equals(c0187d5.f464k)) {
                            String str = castDeviceM3070e.f5422j;
                            boolean z3 = !TextUtils.isEmpty(str) && ((castDevice2 = c0187d5.f464k) == null || !TextUtils.equals(castDevice2.f5422j, str));
                            c0187d5.f464k = castDeviceM3070e;
                            C0187d.f455m.m831b("update to device (%s) with name %s", castDeviceM3070e, true != z3 ? "unchanged" : "changed");
                            if (z3 && (castDevice = c0187d5.f464k) != null) {
                                C0267k c0267k = c0187d5.f461h;
                                if (c0267k != null) {
                                    C0296b c0296b = C0267k.f703v;
                                    Log.i(c0296b.f788a, c0296b.m833d("update Cast device to %s", castDevice));
                                    c0267k.f718o = castDevice;
                                    c0267k.m805b();
                                }
                                Iterator it = new HashSet(c0187d5.f457d).iterator();
                                while (it.hasNext()) {
                                    ((C0183I) it.next()).getClass();
                                }
                            }
                        }
                        parcel2.writeNoException();
                        return true;
                    default:
                        return false;
                }
            case 1:
                C1271e c1271e = (C1271e) obj;
                if (i3 == 1) {
                    String string = parcel.readString();
                    AbstractC1339v.m3420b(parcel);
                    c1271e.getClass();
                    InterfaceC0629a interfaceC0629aM677c = new C0187d(c1271e.f5836a, c1271e.f5837b, string, c1271e.f5839d, c1271e.f5840e, new C0267k(c1271e.f5836a, c1271e.f5839d, c1271e.f5840e)).m677c();
                    parcel2.writeNoException();
                    AbstractC1339v.m3422d(parcel2, interfaceC0629aM677c);
                    return true;
                }
                if (i3 == 2) {
                    boolean z4 = c1271e.f5839d.f443k;
                    parcel2.writeNoException();
                    int i9 = AbstractC1339v.f5981a;
                    parcel2.writeInt(z4 ? 1 : 0);
                    return true;
                }
                if (i3 == 3) {
                    String str2 = c1271e.f5837b;
                    parcel2.writeNoException();
                    parcel2.writeString(str2);
                    return true;
                }
                if (i3 != 4) {
                    return false;
                }
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            case 2:
                C0187d c0187d6 = (C0187d) obj;
                if (i3 == 1) {
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    AbstractC1339v.m3420b(parcel);
                    C0125H c0125h = c0187d6.f462i;
                    if (c0125h != null && c0125h.f187E == 2) {
                        C0431l c0431lM1132b = C0431l.m1132b();
                        c0431lM1132b.f1464d = new C0118A(c0125h, string2, string3, i6);
                        c0431lM1132b.f1463c = 8407;
                        c0125h.m1079c(1, c0431lM1132b.m1133a()).m3884a(new InterfaceC1557a(this) { // from class: F1.H

                            /* JADX INFO: renamed from: h */
                            public final /* synthetic */ BinderC0176B f419h;

                            {
                                this.f419h = this;
                            }

                            @Override // p097f2.InterfaceC1557a
                            /* JADX INFO: renamed from: l */
                            public final void mo524l(C1563g c1563g) {
                                switch (i5) {
                                    case 0:
                                        C0187d.m673e((C0187d) this.f419h.f409d, "launchApplication", c1563g);
                                        break;
                                    default:
                                        C0187d.m673e((C0187d) this.f419h.f409d, "joinApplication", c1563g);
                                        break;
                                }
                            }
                        });
                    }
                    parcel2.writeNoException();
                    return true;
                }
                if (i3 == 2) {
                    String string4 = parcel.readString();
                    C0134i c0134i = (C0134i) AbstractC1339v.m3419a(parcel, C0134i.CREATOR);
                    AbstractC1339v.m3420b(parcel);
                    C0125H c0125h2 = c0187d6.f462i;
                    if (c0125h2 != null && c0125h2.f187E == 2) {
                        C0431l c0431lM1132b2 = C0431l.m1132b();
                        c0431lM1132b2.f1464d = new C0858A(c0125h2, string4, c0134i, i4);
                        c0431lM1132b2.f1463c = 8406;
                        c0125h2.m1079c(1, c0431lM1132b2.m1133a()).m3884a(new InterfaceC1557a(this) { // from class: F1.H

                            /* JADX INFO: renamed from: h */
                            public final /* synthetic */ BinderC0176B f419h;

                            {
                                this.f419h = this;
                            }

                            @Override // p097f2.InterfaceC1557a
                            /* JADX INFO: renamed from: l */
                            public final void mo524l(C1563g c1563g) {
                                switch (i6) {
                                    case 0:
                                        C0187d.m673e((C0187d) this.f419h.f409d, "launchApplication", c1563g);
                                        break;
                                    default:
                                        C0187d.m673e((C0187d) this.f419h.f409d, "joinApplication", c1563g);
                                        break;
                                }
                            }
                        });
                    }
                    parcel2.writeNoException();
                    return true;
                }
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            return false;
                        }
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        return true;
                    }
                    int i10 = parcel.readInt();
                    AbstractC1339v.m3420b(parcel);
                    C0187d.m672d(c0187d6, i10);
                    parcel2.writeNoException();
                    return true;
                }
                String string5 = parcel.readString();
                AbstractC1339v.m3420b(parcel);
                C0125H c0125h3 = c0187d6.f462i;
                if (c0125h3 != null && c0125h3.f187E == 2) {
                    C0431l c0431lM1132b3 = C0431l.m1132b();
                    c0431lM1132b3.f1464d = new C0119B(c0125h3, string5);
                    c0431lM1132b3.f1463c = 8409;
                    c0125h3.m1079c(1, c0431lM1132b3.m1133a());
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i3 != 1) {
                    if (i3 != 2) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    return true;
                }
                long j3 = parcel.readLong();
                long j4 = parcel.readLong();
                AbstractC1339v.m3420b(parcel);
                ((AsyncTaskC0259c) obj).publishProgress(Long.valueOf(j3), Long.valueOf(j4));
                parcel2.writeNoException();
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0176B(AbstractC0191h abstractC0191h) {
        super(1, "com.google.android.gms.cast.framework.ISessionProxy");
        this.f409d = abstractC0191h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0176B(AsyncTaskC0259c asyncTaskC0259c) {
        super(1, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
        this.f409d = asyncTaskC0259c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0176B(C1271e c1271e) {
        super(1, "com.google.android.gms.cast.framework.ISessionProvider");
        this.f409d = c1271e;
    }
}

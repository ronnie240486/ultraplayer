package p016F1;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.cast.AbstractC1339v;
import com.google.android.gms.internal.cast.BinderC1263c;
import com.google.android.gms.internal.cast.BinderC1319q;
import com.google.android.gms.internal.cast.C1279g;
import com.google.android.gms.internal.cast.C1283h;
import com.google.android.gms.internal.cast.C1295k;
import com.google.android.gms.internal.cast.C1299l;
import com.google.android.gms.internal.cast.C1323r;
import com.google.android.gms.internal.cast.RunnableC1287i;
import com.google.android.gms.internal.cast.RunnableC1315p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p013E1.RunnableC0121D;
import p028J1.C0296b;
import p063V1.BinderC0630b;
import p075Z1.HandlerC0784e;
import p079a2.AbstractBinderC0852a;
import p089d1.AbstractC1452y;
import p089d1.C1403C;
import p089d1.C1405E;
import p089d1.C1406F;
import p089d1.C1433f;
import p089d1.C1451x;

/* JADX INFO: renamed from: F1.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0196m extends AbstractBinderC0852a {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f475c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractBinderC0196m(int i3, String str) {
        super(1, str);
        this.f475c = i3;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00de  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e3  */
    @Override // p079a2.AbstractBinderC0852a
    /* JADX INFO: renamed from: u0 */
    public final boolean mo648u0(int i3, Parcel parcel, Parcel parcel2) {
        int i4 = 0;
        switch (this.f475c) {
            case 0:
                if (i3 == 1) {
                    BinderC0630b binderC0630b = new BinderC0630b((BinderC1263c) this);
                    parcel2.writeNoException();
                    AbstractC1339v.m3422d(parcel2, binderC0630b);
                } else if (i3 == 2) {
                    BinderC1263c binderC1263c = (BinderC1263c) this;
                    C0296b c0296b = BinderC1263c.f5807f;
                    Log.i(c0296b.f788a, c0296b.m833d("onAppEnteredForeground", new Object[0]));
                    binderC1263c.f5810e = 1;
                    Iterator it = binderC1263c.f5809d.iterator();
                    while (it.hasNext()) {
                        ((C1295k) it.next()).f5918a.m3273m();
                    }
                    parcel2.writeNoException();
                } else if (i3 == 3) {
                    BinderC1263c binderC1263c2 = (BinderC1263c) this;
                    C0296b c0296b2 = BinderC1263c.f5807f;
                    Log.i(c0296b2.f788a, c0296b2.m833d("onAppEnteredBackground", new Object[0]));
                    binderC1263c2.f5810e = 2;
                    Iterator it2 = binderC1263c2.f5809d.iterator();
                    while (it2.hasNext()) {
                        C1299l c1299l = ((C1295k) it2.next()).f5918a;
                        c1299l.getClass();
                        C1299l.f5919f.m831b("Stopping RouteDiscovery.", new Object[0]);
                        c1299l.f5922c.clear();
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            C1323r c1323r = c1299l.f5924e;
                            if (((C1405E) c1323r.f5962i) == null) {
                                c1323r.f5962i = C1405E.m3512d((Context) c1323r.f5961h);
                            }
                            C1405E c1405e = (C1405E) c1323r.f5962i;
                            if (c1405e != null) {
                                c1405e.m3518h(c1299l);
                            }
                        } else {
                            new HandlerC0784e(Looper.getMainLooper(), 3).post(new RunnableC1287i(c1299l, i4));
                        }
                    }
                    parcel2.writeNoException();
                } else {
                    if (i3 != 4) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                }
                return true;
            default:
                C1279g c1279g = null;
                Bundle bundle = null;
                switch (i3) {
                    case 1:
                        Bundle bundle2 = (Bundle) AbstractC1339v.m3419a(parcel, Bundle.CREATOR);
                        IBinder strongBinder = parcel.readStrongBinder();
                        if (strongBinder != null) {
                            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                            c1279g = iInterfaceQueryLocalInterface instanceof C1279g ? (C1279g) iInterfaceQueryLocalInterface : new C1279g(strongBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback", 2);
                        }
                        AbstractC1339v.m3420b(parcel);
                        BinderC1319q binderC1319q = (BinderC1319q) this;
                        C1451x c1451xM3639b = C1451x.m3639b(bundle2);
                        if (c1451xM3639b != null) {
                            HashMap map = binderC1319q.f5956f;
                            if (!map.containsKey(c1451xM3639b)) {
                                map.put(c1451xM3639b, new HashSet());
                            }
                            ((Set) map.get(c1451xM3639b)).add(new C1283h(c1279g));
                        }
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        Bundle bundle3 = (Bundle) AbstractC1339v.m3419a(parcel, Bundle.CREATOR);
                        int i5 = parcel.readInt();
                        AbstractC1339v.m3420b(parcel);
                        BinderC1319q binderC1319q2 = (BinderC1319q) this;
                        C1451x c1451xM3639b2 = C1451x.m3639b(bundle3);
                        if (c1451xM3639b2 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                binderC1319q2.m3349w0(c1451xM3639b2, i5);
                            } else {
                                new HandlerC0784e(Looper.getMainLooper(), 3).post(new RunnableC1315p(binderC1319q2, c1451xM3639b2, i5, i4));
                            }
                        }
                        parcel2.writeNoException();
                        return true;
                    case ModuleDescriptor.MODULE_VERSION /* 3 */:
                        Bundle bundle4 = (Bundle) AbstractC1339v.m3419a(parcel, Bundle.CREATOR);
                        AbstractC1339v.m3420b(parcel);
                        BinderC1319q binderC1319q3 = (BinderC1319q) this;
                        C1451x c1451xM3639b3 = C1451x.m3639b(bundle4);
                        if (c1451xM3639b3 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                binderC1319q3.m3350x0(c1451xM3639b3);
                            } else {
                                new HandlerC0784e(Looper.getMainLooper(), 3).post(new RunnableC0121D(binderC1319q3, 6, c1451xM3639b3));
                            }
                        }
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        Bundle bundle5 = (Bundle) AbstractC1339v.m3419a(parcel, Bundle.CREATOR);
                        int i6 = parcel.readInt();
                        AbstractC1339v.m3420b(parcel);
                        BinderC1319q binderC1319q4 = (BinderC1319q) this;
                        C1451x c1451xM3639b4 = C1451x.m3639b(bundle5);
                        if (c1451xM3639b4 != null) {
                            binderC1319q4.f5954d.getClass();
                            C1405E.m3510b();
                            C1433f c1433fM3511c = C1405E.m3511c();
                            c1433fM3511c.getClass();
                            if (!c1451xM3639b4.m3642d()) {
                                if ((2 & i6) == 0 && c1433fM3511c.f6345p) {
                                    i4 = 1;
                                } else {
                                    C1406F c1406f = c1433fM3511c.f6350u;
                                    boolean z3 = c1406f != null && c1406f.f6243b && c1433fM3511c.m3578f();
                                    ArrayList arrayList = c1433fM3511c.f6339j;
                                    int size = arrayList.size();
                                    for (int i7 = 0; i7 < size; i7++) {
                                        C1403C c1403c = (C1403C) arrayList.get(i7);
                                        if (((i6 & 1) == 0 || !c1403c.m3494d()) && ((!z3 || c1403c.m3494d() || c1403c.m3493c() == c1433fM3511c.f6347r) && c1403c.m3498h(c1451xM3639b4))) {
                                            i4 = 1;
                                        }
                                    }
                                }
                            }
                        }
                        parcel2.writeNoException();
                        parcel2.writeInt(i4);
                        return true;
                    case 5:
                        String string = parcel.readString();
                        AbstractC1339v.m3420b(parcel);
                        C0296b c0296b3 = BinderC1319q.f5953i;
                        c0296b3.m831b("select route with routeId = %s", string);
                        ((BinderC1319q) this).f5954d.getClass();
                        C1405E.m3510b();
                        ArrayList arrayList2 = C1405E.m3511c().f6339j;
                        int size2 = arrayList2.size();
                        int i8 = 0;
                        while (i8 < size2) {
                            Object obj = arrayList2.get(i8);
                            i8++;
                            C1403C c1403c2 = (C1403C) obj;
                            if (c1403c2.f6218c.equals(string)) {
                                c0296b3.m831b("media route is found and selected", new Object[0]);
                                C1405E.m3510b();
                                C1405E.m3511c().m3581i(c1403c2, 3);
                                parcel2.writeNoException();
                                return true;
                            }
                        }
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        ((BinderC1319q) this).f5954d.getClass();
                        C1405E.m3510b();
                        C1403C c1403c3 = C1405E.m3511c().f6351v;
                        if (c1403c3 == null) {
                            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                        }
                        C1405E.m3510b();
                        C1405E.m3511c().m3581i(c1403c3, 3);
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        ((BinderC1319q) this).f5954d.getClass();
                        C1405E.m3510b();
                        C1403C c1403c4 = C1405E.m3511c().f6351v;
                        if (c1403c4 == null) {
                            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                        }
                        boolean zEquals = C1405E.m3514f().f6218c.equals(c1403c4.f6218c);
                        parcel2.writeNoException();
                        int i9 = AbstractC1339v.f5981a;
                        parcel2.writeInt(zEquals ? 1 : 0);
                        return true;
                    case 8:
                        String string2 = parcel.readString();
                        AbstractC1339v.m3420b(parcel);
                        ((BinderC1319q) this).f5954d.getClass();
                        C1405E.m3510b();
                        ArrayList arrayList3 = C1405E.m3511c().f6339j;
                        int size3 = arrayList3.size();
                        int i10 = 0;
                        while (i10 < size3) {
                            Object obj2 = arrayList3.get(i10);
                            i10++;
                            C1403C c1403c5 = (C1403C) obj2;
                            if (c1403c5.f6218c.equals(string2)) {
                                bundle = c1403c5.f6234s;
                                parcel2.writeNoException();
                                if (bundle == null) {
                                    parcel2.writeInt(0);
                                } else {
                                    parcel2.writeInt(1);
                                    bundle.writeToParcel(parcel2, 1);
                                }
                                return true;
                            }
                        }
                        parcel2.writeNoException();
                        if (bundle == null) {
                            parcel2.writeInt(0);
                        } else {
                            parcel2.writeInt(1);
                            bundle.writeToParcel(parcel2, 1);
                        }
                        return true;
                    case 9:
                        ((BinderC1319q) this).f5954d.getClass();
                        String str = C1405E.m3514f().f6218c;
                        parcel2.writeNoException();
                        parcel2.writeString(str);
                        return true;
                    case 10:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        return true;
                    case 11:
                        BinderC1319q binderC1319q5 = (BinderC1319q) this;
                        HashMap map2 = binderC1319q5.f5956f;
                        Iterator it3 = map2.values().iterator();
                        while (it3.hasNext()) {
                            Iterator it4 = ((Set) it3.next()).iterator();
                            while (it4.hasNext()) {
                                binderC1319q5.f5954d.m3518h((AbstractC1452y) it4.next());
                            }
                        }
                        map2.clear();
                        parcel2.writeNoException();
                        return true;
                    case 12:
                        ((BinderC1319q) this).f5954d.getClass();
                        C1405E.m3510b();
                        C1403C c1403c6 = C1405E.m3511c().f6352w;
                        if (c1403c6 != null && C1405E.m3514f().f6218c.equals(c1403c6.f6218c)) {
                            i4 = 1;
                        }
                        parcel2.writeNoException();
                        int i11 = AbstractC1339v.f5981a;
                        parcel2.writeInt(i4);
                        return true;
                    case 13:
                        int i12 = parcel.readInt();
                        AbstractC1339v.m3420b(parcel);
                        ((BinderC1319q) this).f5954d.getClass();
                        C1405E.m3516i(i12);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return false;
                }
        }
    }
}

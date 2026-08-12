package p089d1;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p011E.C0111d;
import p046P1.C0471D;

/* JADX INFO: renamed from: d1.V */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC1421V extends Handler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6279a = 1;

    /* JADX INFO: renamed from: b */
    public WeakReference f6280b;

    public /* synthetic */ HandlerC1421V() {
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    /* JADX WARN: Code duplicated, block: B:64:0x0122  */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1445r c1445r;
        C0111d c0111d;
        AbstractC1448u abstractC1448u;
        C1433f c1433f;
        switch (this.f6279a) {
            case 0:
                C1419T c1419t = (C1419T) this.f6280b.get();
                if (c1419t != null) {
                    int i3 = message.what;
                    int i4 = message.arg1;
                    int i5 = message.arg2;
                    Object obj = message.obj;
                    Bundle bundlePeekData = message.peekData();
                    SparseArray sparseArray = c1419t.f6277h;
                    ServiceConnectionC1425Z serviceConnectionC1425Z = c1419t.f6278i;
                    int i6 = 0;
                    InterfaceC1420U interfaceC1420U = null;
                    InterfaceC1420U interfaceC1420U2 = null;
                    ArrayList arrayList = serviceConnectionC1425Z.f6302k;
                    switch (i3) {
                        case 0:
                            if (i4 == c1419t.f6276g) {
                                c1419t.f6276g = 0;
                                if (serviceConnectionC1425Z.f6305n == c1419t) {
                                    serviceConnectionC1425Z.m3565l();
                                }
                            }
                            if (((C1422W) sparseArray.get(i4)) != null) {
                                sparseArray.remove(i4);
                                C1422W.m3549a(null, null);
                            }
                            break;
                        case 2:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle = (Bundle) obj;
                                if (c1419t.f6275f == 0 && i4 == c1419t.f6276g && i5 >= 1) {
                                    c1419t.f6276g = 0;
                                    c1419t.f6275f = i5;
                                    C0471D c0471dM1183c = C0471D.m1183c(bundle);
                                    if (serviceConnectionC1425Z.f6305n == c1419t) {
                                        serviceConnectionC1425Z.m3630g(c0471dM1183c);
                                    }
                                    if (serviceConnectionC1425Z.f6305n == c1419t) {
                                        serviceConnectionC1425Z.f6306o = true;
                                        int size = arrayList.size();
                                        while (i6 < size) {
                                            ((InterfaceC1420U) arrayList.get(i6)).mo3547b(serviceConnectionC1425Z.f6305n);
                                            i6++;
                                        }
                                        C1443p c1443p = serviceConnectionC1425Z.f6411e;
                                        if (c1443p != null) {
                                            C1419T c1419t2 = serviceConnectionC1425Z.f6305n;
                                            int i7 = c1419t2.f6273d;
                                            c1419t2.f6273d = 1 + i7;
                                            c1419t2.m3543b(10, i7, 0, c1443p.f6388a, null);
                                        }
                                    }
                                }
                            }
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle2 = (Bundle) obj;
                                C1422W c1422w = (C1422W) sparseArray.get(i4);
                                if (c1422w != null) {
                                    sparseArray.remove(i4);
                                    c1422w.m3550b(bundle2);
                                }
                            }
                            break;
                        case 4:
                            if (obj == null || (obj instanceof Bundle)) {
                                String string = bundlePeekData != null ? bundlePeekData.getString("error") : null;
                                Bundle bundle3 = (Bundle) obj;
                                if (((C1422W) sparseArray.get(i4)) != null) {
                                    sparseArray.remove(i4);
                                    C1422W.m3549a(string, bundle3);
                                }
                            }
                            break;
                        case 5:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle4 = (Bundle) obj;
                                if (c1419t.f6275f != 0) {
                                    C0471D c0471dM1183c2 = C0471D.m1183c(bundle4);
                                    if (serviceConnectionC1425Z.f6305n == c1419t) {
                                        serviceConnectionC1425Z.m3630g(c0471dM1183c2);
                                    }
                                }
                            }
                            break;
                        case 6:
                            if (!(obj instanceof Bundle)) {
                                Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                            } else {
                                Bundle bundle5 = (Bundle) obj;
                                C1422W c1422w2 = (C1422W) sparseArray.get(i4);
                                if (bundle5 != null && bundle5.containsKey("routeId")) {
                                    sparseArray.remove(i4);
                                    c1422w2.m3550b(bundle5);
                                } else {
                                    c1422w2.getClass();
                                    C1422W.m3549a("DynamicGroupRouteController is created without valid route id.", bundle5);
                                }
                            }
                            break;
                        case 7:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle6 = (Bundle) obj;
                                if (c1419t.f6275f != 0) {
                                    Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                                    C1442o c1442o = bundle7 != null ? new C1442o(bundle7) : null;
                                    ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                                    ArrayList arrayList2 = new ArrayList();
                                    int size2 = parcelableArrayList.size();
                                    int i8 = 0;
                                    while (i8 < size2) {
                                        Object obj2 = parcelableArrayList.get(i8);
                                        i8++;
                                        Bundle bundle8 = (Bundle) obj2;
                                        if (bundle8 == null) {
                                            c1445r = null;
                                        } else {
                                            Bundle bundle9 = bundle8.getBundle("mrDescriptor");
                                            c1445r = new C1445r(bundle9 != null ? new C1442o(bundle9) : null, bundle8.getInt("selectionState", 1), bundle8.getBoolean("isUnselectable", false), bundle8.getBoolean("isGroupable", false), bundle8.getBoolean("isTransferable", false));
                                        }
                                        arrayList2.add(c1445r);
                                    }
                                    if (serviceConnectionC1425Z.f6305n == c1419t) {
                                        int size3 = arrayList.size();
                                        while (i6 < size3) {
                                            Object obj3 = arrayList.get(i6);
                                            i6++;
                                            InterfaceC1420U interfaceC1420U3 = (InterfaceC1420U) obj3;
                                            if (interfaceC1420U3.mo3546a() == i5) {
                                                interfaceC1420U2 = interfaceC1420U3;
                                                if (interfaceC1420U2 instanceof C1423X) {
                                                    ((C1423X) interfaceC1420U2).m3614l(c1442o, arrayList2);
                                                }
                                                break;
                                            }
                                        }
                                        if (interfaceC1420U2 instanceof C1423X) {
                                            ((C1423X) interfaceC1420U2).m3614l(c1442o, arrayList2);
                                        }
                                    }
                                }
                            }
                            break;
                        case 8:
                            if (serviceConnectionC1425Z.f6305n == c1419t) {
                                int size4 = arrayList.size();
                                while (i6 < size4) {
                                    Object obj4 = arrayList.get(i6);
                                    i6++;
                                    InterfaceC1420U interfaceC1420U4 = (InterfaceC1420U) obj4;
                                    if (interfaceC1420U4.mo3546a() == i5) {
                                        interfaceC1420U = interfaceC1420U4;
                                        c0111d = serviceConnectionC1425Z.f6307p;
                                        if (c0111d != null && (interfaceC1420U instanceof AbstractC1448u)) {
                                            abstractC1448u = (AbstractC1448u) interfaceC1420U;
                                            c1433f = (C1433f) ((C1427a0) c0111d.f148h).f6310c;
                                            if (c1433f.f6334e == abstractC1448u) {
                                                c1433f.m3581i(c1433f.m3575c(), 2);
                                            }
                                        }
                                        arrayList.remove(interfaceC1420U);
                                        interfaceC1420U.mo3548c();
                                        serviceConnectionC1425Z.m3566m();
                                        break;
                                    }
                                }
                                c0111d = serviceConnectionC1425Z.f6307p;
                                if (c0111d != null) {
                                    abstractC1448u = (AbstractC1448u) interfaceC1420U;
                                    c1433f = (C1433f) ((C1427a0) c0111d.f148h).f6310c;
                                    if (c1433f.f6334e == abstractC1448u) {
                                        c1433f.m3581i(c1433f.m3575c(), 2);
                                    }
                                }
                                arrayList.remove(interfaceC1420U);
                                interfaceC1420U.mo3548c();
                                serviceConnectionC1425Z.m3566m();
                            }
                            break;
                    }
                    int i9 = ServiceConnectionC1425Z.f6299q;
                }
                break;
            default:
                int i10 = message.what;
                if (i10 == -3 || i10 == -2 || i10 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f6280b.get(), message.what);
                    break;
                } else if (i10 == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    break;
                }
                break;
        }
    }

    public HandlerC1421V(C1419T c1419t) {
        this.f6280b = new WeakReference(c1419t);
    }
}

package p089d1;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p168z.C2388b;

/* JADX INFO: renamed from: d1.c */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC1430c extends Handler {

    /* JADX INFO: renamed from: a */
    public final ArrayList f6318a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ArrayList f6319b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1433f f6320c;

    public HandlerC1430c(C1433f c1433f) {
        this.f6320c = c1433f;
    }

    /* JADX INFO: renamed from: a */
    public static void m3571a(C1453z c1453z, int i3, Object obj, int i4) {
        C1405E c1405e = c1453z.f6419a;
        int i5 = 65280 & i3;
        AbstractC1452y abstractC1452y = c1453z.f6420b;
        if (i5 != 256) {
            if (i5 != 512) {
                if (i5 == 768 && i3 == 769) {
                    abstractC1452y.mo2610l((C1406F) obj);
                }
                return;
            }
            switch (i3) {
                case 513:
                    abstractC1452y.mo2601a();
                    break;
                case 514:
                    abstractC1452y.mo2603c();
                    break;
                case 515:
                    abstractC1452y.mo2602b();
                    break;
            }
        }
        C1403C c1403c = (i3 == 264 || i3 == 262) ? (C1403C) ((C2388b) obj).f9982b : (C1403C) obj;
        C1403C c1403c2 = (i3 == 264 || i3 == 262) ? (C1403C) ((C2388b) obj).f9981a : null;
        if (c1403c != null) {
            boolean zM3494d = true;
            if ((c1453z.f6422d & 2) == 0 && !c1403c.m3498h(c1453z.f6421c)) {
                C1406F c1406f = C1405E.m3511c().f6350u;
                zM3494d = ((c1406f == null ? false : c1406f.f6244c) && c1403c.m3494d() && i3 == 262 && i4 == 3 && c1403c2 != null) ? true ^ c1403c2.m3494d() : false;
            }
            if (zM3494d) {
                switch (i3) {
                    case 257:
                        abstractC1452y.mo2604d(c1403c);
                        break;
                    case 258:
                        abstractC1452y.mo2606f(c1403c);
                        break;
                    case 259:
                        abstractC1452y.mo2605e(c1403c);
                        break;
                    case 260:
                        abstractC1452y.mo2609k(c1403c);
                        break;
                    case 261:
                        abstractC1452y.getClass();
                        break;
                    case 262:
                        abstractC1452y.mo3266h(c1405e, c1403c, i4);
                        break;
                    case 263:
                        abstractC1452y.mo3267j(c1405e, c1403c, i4);
                        break;
                    case 264:
                        abstractC1452y.mo3266h(c1405e, c1403c, i4);
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3572b(int i3, Object obj) {
        obtainMessage(i3, obj).sendToTarget();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int iM3531l;
        ArrayList arrayList = this.f6318a;
        int i3 = message.what;
        Object obj = message.obj;
        int i4 = message.arg1;
        C1433f c1433f = this.f6320c;
        if (i3 == 259 && c1433f.m3577e().f6218c.equals(((C1403C) obj).f6218c)) {
            c1433f.m3587o(true);
        }
        ArrayList arrayList2 = this.f6319b;
        int i5 = 0;
        if (i3 == 262) {
            C1403C c1403c = (C1403C) ((C2388b) obj).f9982b;
            c1433f.f6348s.m3536s(c1403c);
            if (c1433f.f6351v != null && c1403c.m3494d()) {
                int size = arrayList2.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj2 = arrayList2.get(i6);
                    i6++;
                    c1433f.f6348s.m3535r((C1403C) obj2);
                }
                arrayList2.clear();
            }
        } else if (i3 != 264) {
            switch (i3) {
                case 257:
                    c1433f.f6348s.m3534q((C1403C) obj);
                    break;
                case 258:
                    c1433f.f6348s.m3535r((C1403C) obj);
                    break;
                case 259:
                    C1416P c1416p = c1433f.f6348s;
                    C1403C c1403c2 = (C1403C) obj;
                    c1416p.getClass();
                    if (c1403c2.m3493c() != c1416p && (iM3531l = c1416p.m3531l(c1403c2)) >= 0) {
                        c1416p.m3541x((C1415O) c1416p.f6267r.get(iM3531l));
                    }
                    break;
            }
        } else {
            C1403C c1403c3 = (C1403C) ((C2388b) obj).f9982b;
            arrayList2.add(c1403c3);
            c1433f.f6348s.m3534q(c1403c3);
            c1433f.f6348s.m3536s(c1403c3);
        }
        try {
            int size2 = c1433f.f6338i.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    int size3 = arrayList.size();
                    while (i5 < size3) {
                        Object obj3 = arrayList.get(i5);
                        i5++;
                        m3571a((C1453z) obj3, i3, obj, i4);
                    }
                    return;
                }
                ArrayList arrayList3 = c1433f.f6338i;
                C1405E c1405e = (C1405E) ((WeakReference) arrayList3.get(size2)).get();
                if (c1405e == null) {
                    arrayList3.remove(size2);
                } else {
                    arrayList.addAll(c1405e.f6241b);
                }
            }
        } finally {
            arrayList.clear();
        }
    }
}

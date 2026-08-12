package p040N1;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.support.v4.media.session.C0858A;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1152a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import p000A.C0031d;
import p009D0.C0106b;
import p014F.RunnableC0153b;
import p028J1.RunnableC0316v;
import p034L1.C0346a;
import p034L1.C0348c;
import p034L1.C0349d;
import p037M1.AbstractC0393f;
import p037M1.C0400m;
import p037M1.InterfaceC0390c;
import p037M1.InterfaceC0394g;
import p037M1.InterfaceC0395h;
import p039N0.C0414j;
import p045P0.AbstractC0462h;
import p046P1.AbstractC0491s;
import p046P1.C0475c;
import p046P1.C0480h;
import p051R1.C0524c;
import p075Z1.HandlerC0784e;
import p090d2.C1454a;
import p094e2.C1523a;
import p097f2.C1560d;
import p122m1.AbstractC2003a;
import p124n.AbstractC2020g;
import p124n.C2018e;
import p124n.C2019f;

/* JADX INFO: renamed from: N1.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0435p implements InterfaceC0394g, InterfaceC0395h {

    /* JADX INFO: renamed from: c */
    public final InterfaceC0390c f1469c;

    /* JADX INFO: renamed from: d */
    public final C0421b f1470d;

    /* JADX INFO: renamed from: e */
    public final C0106b f1471e;

    /* JADX INFO: renamed from: h */
    public final int f1474h;

    /* JADX INFO: renamed from: i */
    public final BinderC0416A f1475i;

    /* JADX INFO: renamed from: j */
    public boolean f1476j;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C0424e f1480n;

    /* JADX INFO: renamed from: b */
    public final LinkedList f1468b = new LinkedList();

    /* JADX INFO: renamed from: f */
    public final HashSet f1472f = new HashSet();

    /* JADX INFO: renamed from: g */
    public final HashMap f1473g = new HashMap();

    /* JADX INFO: renamed from: k */
    public final ArrayList f1477k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public C0346a f1478l = null;

    /* JADX INFO: renamed from: m */
    public int f1479m = 0;

    public C0435p(C0424e c0424e, AbstractC0393f abstractC0393f) {
        this.f1480n = c0424e;
        Looper looper = c0424e.f1457s.getLooper();
        C0858A c0858aM1077a = abstractC0393f.m1077a();
        C0475c c0475c = new C0475c((C2019f) c0858aM1077a.f3639h, (String) c0858aM1077a.f3640i, (String) c0858aM1077a.f3641j);
        AbstractC2003a abstractC2003a = (AbstractC2003a) abstractC0393f.f1351c.f140h;
        AbstractC0491s.m1213e(abstractC2003a);
        InterfaceC0390c interfaceC0390cMo558a = abstractC2003a.mo558a(abstractC0393f.f1349a, looper, c0475c, abstractC0393f.f1352d, this, this);
        String str = abstractC0393f.f1350b;
        if (str != null && (interfaceC0390cMo558a instanceof AbstractC1152a)) {
            ((AbstractC1152a) interfaceC0390cMo558a).f5532s = str;
        }
        if (str != null && (interfaceC0390cMo558a instanceof AbstractServiceConnectionC0429j)) {
            AbstractC0462h.m1169i(interfaceC0390cMo558a);
            throw null;
        }
        this.f1469c = interfaceC0390cMo558a;
        this.f1470d = abstractC0393f.f1353e;
        this.f1471e = new C0106b(8);
        this.f1474h = abstractC0393f.f1355g;
        if (!interfaceC0390cMo558a.mo1075k()) {
            this.f1475i = null;
            return;
        }
        Context context = c0424e.f1449k;
        HandlerC0784e handlerC0784e = c0424e.f1457s;
        C0858A c0858aM1077a2 = abstractC0393f.m1077a();
        this.f1475i = new BinderC0416A(context, handlerC0784e, new C0475c((C2019f) c0858aM1077a2.f3639h, (String) c0858aM1077a2.f3640i, (String) c0858aM1077a2.f3641j));
    }

    @Override // p037M1.InterfaceC0394g
    /* JADX INFO: renamed from: P */
    public final void mo1080P(int i3) {
        Looper looperMyLooper = Looper.myLooper();
        C0424e c0424e = this.f1480n;
        if (looperMyLooper == c0424e.f1457s.getLooper()) {
            m1140g(i3);
        } else {
            c0424e.f1457s.post(new RunnableC0316v(i3, 1, this));
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0348c m1134a(C0348c[] c0348cArr) {
        if (c0348cArr != null && c0348cArr.length != 0) {
            C0348c[] c0348cArrMo1067b = this.f1469c.mo1067b();
            if (c0348cArrMo1067b == null) {
                c0348cArrMo1067b = new C0348c[0];
            }
            int length = c0348cArrMo1067b.length;
            C2018e c2018e = new C2018e();
            if (length == 0) {
                c2018e.f8789g = AbstractC2020g.f8778a;
                c2018e.f8790h = AbstractC2020g.f8779b;
            } else {
                c2018e.m4585a(length);
            }
            c2018e.f8791i = 0;
            for (C0348c c0348c : c0348cArrMo1067b) {
                c2018e.put(c0348c.f1128g, Long.valueOf(c0348c.m951e()));
            }
            for (C0348c c0348c2 : c0348cArr) {
                Long l3 = (Long) c2018e.getOrDefault(c0348c2.f1128g, null);
                if (l3 == null || l3.longValue() < c0348c2.m951e()) {
                    return c0348c2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m1135b(C0346a c0346a) {
        HashSet hashSet = this.f1472f;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (AbstractC0491s.m1216h(c0346a, C0346a.f1120k)) {
                this.f1469c.mo1069d();
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1136c(Status status) {
        AbstractC0491s.m1209a(this.f1480n.f1457s);
        m1137d(status, null, false);
    }

    /* JADX INFO: renamed from: d */
    public final void m1137d(Status status, RuntimeException runtimeException, boolean z3) {
        AbstractC0491s.m1209a(this.f1480n.f1457s);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f1468b.iterator();
        while (it.hasNext()) {
            AbstractC0440u abstractC0440u = (AbstractC0440u) it.next();
            if (!z3 || abstractC0440u.f1491a == 2) {
                if (status != null) {
                    abstractC0440u.mo1116c(status);
                } else {
                    abstractC0440u.mo1117d(runtimeException);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1138e() {
        LinkedList linkedList = this.f1468b;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC0440u abstractC0440u = (AbstractC0440u) arrayList.get(i3);
            if (!this.f1469c.mo1068c()) {
                return;
            }
            if (m1142i(abstractC0440u)) {
                linkedList.remove(abstractC0440u);
            }
        }
    }

    @Override // p037M1.InterfaceC0394g
    /* JADX INFO: renamed from: e0 */
    public final void mo1081e0() {
        Looper looperMyLooper = Looper.myLooper();
        C0424e c0424e = this.f1480n;
        if (looperMyLooper == c0424e.f1457s.getLooper()) {
            m1139f();
        } else {
            c0424e.f1457s.post(new RunnableC0153b(3, this));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1139f() {
        InterfaceC0390c interfaceC0390c = this.f1469c;
        C0424e c0424e = this.f1480n;
        AbstractC0491s.m1209a(c0424e.f1457s);
        this.f1478l = null;
        m1135b(C0346a.f1120k);
        if (this.f1476j) {
            HandlerC0784e handlerC0784e = c0424e.f1457s;
            C0421b c0421b = this.f1470d;
            handlerC0784e.removeMessages(11, c0421b);
            c0424e.f1457s.removeMessages(9, c0421b);
            this.f1476j = false;
        }
        Iterator it = this.f1473g.values().iterator();
        while (it.hasNext()) {
            C0444y c0444y = (C0444y) it.next();
            if (m1134a((C0348c[]) c0444y.f1504a.f3640i) != null) {
                it.remove();
            } else {
                try {
                    C0858A c0858a = c0444y.f1504a;
                    ((C0031d) ((C0414j) c0858a.f3641j).f1408h).mo165m(interfaceC0390c, new C1560d());
                } catch (DeadObjectException unused) {
                    mo1080P(3);
                    interfaceC0390c.mo1074j("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        m1138e();
        m1141h();
    }

    /* JADX INFO: renamed from: g */
    public final void m1140g(int i3) {
        C0424e c0424e = this.f1480n;
        AbstractC0491s.m1209a(c0424e.f1457s);
        this.f1478l = null;
        this.f1476j = true;
        String strMo1072g = this.f1469c.mo1072g();
        C0106b c0106b = this.f1471e;
        c0106b.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i3 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i3 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strMo1072g != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strMo1072g);
        }
        c0106b.m512J(true, new Status(20, sb.toString(), null, null));
        HandlerC0784e handlerC0784e = c0424e.f1457s;
        C0421b c0421b = this.f1470d;
        handlerC0784e.sendMessageDelayed(Message.obtain(handlerC0784e, 9, c0421b), 5000L);
        HandlerC0784e handlerC0784e2 = c0424e.f1457s;
        handlerC0784e2.sendMessageDelayed(Message.obtain(handlerC0784e2, 11, c0421b), 120000L);
        ((SparseIntArray) c0424e.f1451m.f140h).clear();
        Iterator it = this.f1473g.values().iterator();
        while (it.hasNext()) {
            ((C0444y) it.next()).getClass();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m1141h() {
        C0424e c0424e = this.f1480n;
        HandlerC0784e handlerC0784e = c0424e.f1457s;
        C0421b c0421b = this.f1470d;
        handlerC0784e.removeMessages(12, c0421b);
        HandlerC0784e handlerC0784e2 = c0424e.f1457s;
        handlerC0784e2.sendMessageDelayed(handlerC0784e2.obtainMessage(12, c0421b), c0424e.f1445g);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m1142i(AbstractC0440u abstractC0440u) {
        if (abstractC0440u != null) {
            C0348c c0348cM1134a = m1134a(abstractC0440u.mo1115b(this));
            if (c0348cM1134a != null) {
                Log.w("GoogleApiManager", this.f1469c.getClass().getName() + " could not execute call because it requires feature (" + c0348cM1134a.f1128g + ", " + c0348cM1134a.m951e() + ").");
                if (!this.f1480n.f1458t || !abstractC0440u.mo1114a(this)) {
                    abstractC0440u.mo1117d(new C0400m(c0348cM1134a));
                    return true;
                }
                C0436q c0436q = new C0436q(this.f1470d, c0348cM1134a);
                int iIndexOf = this.f1477k.indexOf(c0436q);
                if (iIndexOf >= 0) {
                    C0436q c0436q2 = (C0436q) this.f1477k.get(iIndexOf);
                    this.f1480n.f1457s.removeMessages(15, c0436q2);
                    HandlerC0784e handlerC0784e = this.f1480n.f1457s;
                    handlerC0784e.sendMessageDelayed(Message.obtain(handlerC0784e, 15, c0436q2), 5000L);
                } else {
                    this.f1477k.add(c0436q);
                    HandlerC0784e handlerC0784e2 = this.f1480n.f1457s;
                    handlerC0784e2.sendMessageDelayed(Message.obtain(handlerC0784e2, 15, c0436q), 5000L);
                    HandlerC0784e handlerC0784e3 = this.f1480n.f1457s;
                    handlerC0784e3.sendMessageDelayed(Message.obtain(handlerC0784e3, 16, c0436q), 120000L);
                    C0346a c0346a = new C0346a(2, null);
                    if (!m1143j(c0346a)) {
                        this.f1480n.m1126b(c0346a, this.f1474h);
                    }
                }
                return false;
            }
            InterfaceC0390c interfaceC0390c = this.f1469c;
            abstractC0440u.mo1119f(this.f1471e, interfaceC0390c.mo1075k());
            try {
                abstractC0440u.mo1118e(this);
                return true;
            } catch (DeadObjectException unused) {
                mo1080P(1);
                interfaceC0390c.mo1074j("DeadObjectException thrown while running ApiCallRunner.");
            }
        } else {
            InterfaceC0390c interfaceC0390c2 = this.f1469c;
            abstractC0440u.mo1119f(this.f1471e, interfaceC0390c2.mo1075k());
            try {
                abstractC0440u.mo1118e(this);
                return true;
            } catch (DeadObjectException unused2) {
                mo1080P(1);
                interfaceC0390c2.mo1074j("DeadObjectException thrown while running ApiCallRunner.");
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1143j(C0346a c0346a) {
        synchronized (C0424e.f1443w) {
            this.f1480n.getClass();
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final void m1144k() {
        C0424e c0424e = this.f1480n;
        AbstractC0491s.m1209a(c0424e.f1457s);
        InterfaceC0390c interfaceC0390c = this.f1469c;
        if (interfaceC0390c.mo1068c() || interfaceC0390c.mo1066a()) {
            return;
        }
        try {
            C0106b c0106b = c0424e.f1451m;
            Context context = c0424e.f1449k;
            c0106b.getClass();
            AbstractC0491s.m1213e(context);
            int iMo859m = interfaceC0390c.mo859m();
            SparseIntArray sparseIntArray = (SparseIntArray) c0106b.f140h;
            int iM958b = sparseIntArray.get(iMo859m, -1);
            if (iM958b == -1) {
                iM958b = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= sparseIntArray.size()) {
                        iM958b = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i3);
                    if (iKeyAt > iMo859m && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (iM958b == -1) {
                    iM958b = ((C0349d) c0106b.f141i).m958b(context, iMo859m);
                }
                sparseIntArray.put(iMo859m, iM958b);
            }
            if (iM958b != 0) {
                C0346a c0346a = new C0346a(iM958b, null);
                Log.w("GoogleApiManager", "The service for " + interfaceC0390c.getClass().getName() + " is not available: " + c0346a.toString());
                m1146m(c0346a, null);
                return;
            }
            C0421b c0421b = this.f1470d;
            C0437r c0437r = new C0437r();
            c0437r.f1488f = c0424e;
            c0437r.f1486d = null;
            c0437r.f1487e = null;
            c0437r.f1483a = false;
            c0437r.f1484b = interfaceC0390c;
            c0437r.f1485c = c0421b;
            if (interfaceC0390c.mo1075k()) {
                BinderC0416A binderC0416A = this.f1475i;
                AbstractC0491s.m1213e(binderC0416A);
                C1523a c1523a = binderC0416A.f1423h;
                if (c1523a != null) {
                    c1523a.mo867i();
                }
                Integer numValueOf = Integer.valueOf(System.identityHashCode(binderC0416A));
                C0475c c0475c = binderC0416A.f1422g;
                c0475c.f1573f = numValueOf;
                HandlerC0784e handlerC0784e = binderC0416A.f1419d;
                binderC0416A.f1423h = (C1523a) binderC0416A.f1420e.mo558a(binderC0416A.f1418c, handlerC0784e.getLooper(), c0475c, (C1454a) c0475c.f1572e, binderC0416A, binderC0416A);
                binderC0416A.f1424i = c0437r;
                Set set = binderC0416A.f1421f;
                if (set == null || set.isEmpty()) {
                    handlerC0784e.post(new RunnableC0153b(5, binderC0416A));
                } else {
                    C1523a c1523a2 = binderC0416A.f1423h;
                    c1523a2.getClass();
                    c1523a2.mo1076l(new C0480h(c1523a2));
                }
            }
            try {
                interfaceC0390c.mo1076l(c0437r);
            } catch (SecurityException e3) {
                m1146m(new C0346a(10), e3);
            }
        } catch (IllegalStateException e4) {
            m1146m(new C0346a(10), e4);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1145l(AbstractC0440u abstractC0440u) {
        AbstractC0491s.m1209a(this.f1480n.f1457s);
        boolean zMo1068c = this.f1469c.mo1068c();
        LinkedList linkedList = this.f1468b;
        if (zMo1068c) {
            if (m1142i(abstractC0440u)) {
                m1141h();
                return;
            } else {
                linkedList.add(abstractC0440u);
                return;
            }
        }
        linkedList.add(abstractC0440u);
        C0346a c0346a = this.f1478l;
        if (c0346a == null || c0346a.f1122h == 0 || c0346a.f1123i == null) {
            m1144k();
        } else {
            m1146m(c0346a, null);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m1146m(C0346a c0346a, RuntimeException runtimeException) {
        C1523a c1523a;
        AbstractC0491s.m1209a(this.f1480n.f1457s);
        BinderC0416A binderC0416A = this.f1475i;
        if (binderC0416A != null && (c1523a = binderC0416A.f1423h) != null) {
            c1523a.mo867i();
        }
        AbstractC0491s.m1209a(this.f1480n.f1457s);
        this.f1478l = null;
        ((SparseIntArray) this.f1480n.f1451m.f140h).clear();
        m1135b(c0346a);
        if ((this.f1469c instanceof C0524c) && c0346a.f1122h != 24) {
            C0424e c0424e = this.f1480n;
            c0424e.f1446h = true;
            HandlerC0784e handlerC0784e = c0424e.f1457s;
            handlerC0784e.sendMessageDelayed(handlerC0784e.obtainMessage(19), 300000L);
        }
        if (c0346a.f1122h == 4) {
            m1136c(C0424e.f1442v);
            return;
        }
        if (this.f1468b.isEmpty()) {
            this.f1478l = c0346a;
            return;
        }
        if (runtimeException != null) {
            AbstractC0491s.m1209a(this.f1480n.f1457s);
            m1137d(null, runtimeException, false);
            return;
        }
        if (!this.f1480n.f1458t) {
            m1136c(C0424e.m1123c(this.f1470d, c0346a));
            return;
        }
        m1137d(C0424e.m1123c(this.f1470d, c0346a), null, true);
        if (this.f1468b.isEmpty() || m1143j(c0346a) || this.f1480n.m1126b(c0346a, this.f1474h)) {
            return;
        }
        if (c0346a.f1122h == 18) {
            this.f1476j = true;
        }
        if (!this.f1476j) {
            m1136c(C0424e.m1123c(this.f1470d, c0346a));
            return;
        }
        C0424e c0424e2 = this.f1480n;
        C0421b c0421b = this.f1470d;
        HandlerC0784e handlerC0784e2 = c0424e2.f1457s;
        handlerC0784e2.sendMessageDelayed(Message.obtain(handlerC0784e2, 9, c0421b), 5000L);
    }

    /* JADX INFO: renamed from: n */
    public final void m1147n(C0346a c0346a) {
        AbstractC0491s.m1209a(this.f1480n.f1457s);
        InterfaceC0390c interfaceC0390c = this.f1469c;
        interfaceC0390c.mo1074j("onSignInFailed for " + interfaceC0390c.getClass().getName() + " with " + String.valueOf(c0346a));
        m1146m(c0346a, null);
    }

    /* JADX INFO: renamed from: o */
    public final void m1148o() {
        AbstractC0491s.m1209a(this.f1480n.f1457s);
        Status status = C0424e.f1441u;
        m1136c(status);
        this.f1471e.m512J(false, status);
        for (C0427h c0427h : (C0427h[]) this.f1473g.keySet().toArray(new C0427h[0])) {
            m1145l(new C0417B(c0427h, new C1560d()));
        }
        m1135b(new C0346a(4));
        InterfaceC0390c interfaceC0390c = this.f1469c;
        if (interfaceC0390c.mo1068c()) {
            interfaceC0390c.mo1070e(new C0031d(14, this));
        }
    }

    @Override // p037M1.InterfaceC0395h
    /* JADX INFO: renamed from: q0 */
    public final void mo1082q0(C0346a c0346a) {
        m1146m(c0346a, null);
    }
}

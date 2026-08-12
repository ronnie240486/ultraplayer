package p013E1;

import android.app.Application;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.cast.BinderC1319q;
import com.zuxoplayer.app.MainActivity;
import java.lang.reflect.Method;
import java.util.Set;
import p016F1.C0183I;
import p028J1.AbstractC0295a;
import p028J1.C0296b;
import p028J1.C0297c;
import p028J1.C0298d;
import p028J1.C0318x;
import p034L1.C0346a;
import p036M0.C0368e;
import p037M1.InterfaceC0390c;
import p040N1.BinderC0416A;
import p040N1.C0421b;
import p040N1.C0424e;
import p040N1.C0435p;
import p040N1.C0437r;
import p046P1.AbstractBinderC0473a;
import p046P1.AbstractC0491s;
import p046P1.C0472E;
import p046P1.C0487o;
import p046P1.InterfaceC0478f;
import p089d1.C1447t;
import p089d1.C1451x;
import p094e2.C1527e;
import p097f2.C1562f;
import p097f2.C1563g;
import p097f2.InterfaceC1557a;
import p097f2.InterfaceC1558b;
import p097f2.InterfaceC1559c;
import p136q.AbstractC2119b;
import p136q.C2118a;
import p160x.C2345d;

/* JADX INFO: renamed from: E1.D */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0121D implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f170g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f171h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f172i;

    public /* synthetic */ RunnableC0121D(Object obj, int i3, Object obj2) {
        this.f170g = i3;
        this.f171h = obj;
        this.f172i = obj2;
    }

    /* JADX INFO: renamed from: a */
    private final void m560a() {
        synchronized (((C1562f) this.f172i).f7068b) {
            InterfaceC1558b interfaceC1558b = (InterfaceC1558b) ((C1562f) this.f172i).f7070d;
            Exception excM3886c = ((C1563g) this.f171h).m3886c();
            AbstractC0491s.m1213e(excM3886c);
            interfaceC1558b.mo340k(excM3886c);
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m561b() {
        synchronized (((C1562f) this.f172i).f7068b) {
            ((InterfaceC1559c) ((C1562f) this.f172i).f7070d).mo649j(((C1563g) this.f171h).m3887d());
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        InterfaceC0478f interfaceC0478f;
        Set set;
        InterfaceC0478f c0472e = null;
        switch (this.f170g) {
            case 0:
                C0125H c0125h = ((BinderC0124G) this.f171h).f180c;
                C0296b c0296b = C0125H.f181F;
                C0298d c0298d = (C0298d) this.f172i;
                C0129d c0129d = c0298d.f795j;
                boolean zM828e = AbstractC0295a.m828e(c0129d, c0125h.f197s);
                C0183I c0183i = c0125h.f185C;
                if (!zM828e) {
                    c0125h.f197s = c0129d;
                    c0183i.m665c();
                }
                double d3 = c0298d.f792g;
                if (Double.isNaN(d3) || Math.abs(d3 - c0125h.f199u) <= 1.0E-7d) {
                    z3 = false;
                } else {
                    c0125h.f199u = d3;
                    z3 = true;
                }
                boolean z11 = c0125h.f200v;
                boolean z12 = c0298d.f793h;
                if (z12 != z11) {
                    c0125h.f200v = z12;
                    z3 = true;
                }
                Object[] objArr = {Boolean.valueOf(z3), Boolean.valueOf(c0125h.f190l)};
                C0296b c0296b2 = C0125H.f181F;
                c0296b2.m831b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", objArr);
                if (c0183i != null && (z3 || c0125h.f190l)) {
                    c0183i.m668f();
                }
                Double.isNaN(c0298d.f798m);
                int i3 = c0125h.f201w;
                int i4 = c0298d.f794i;
                if (i4 != i3) {
                    c0125h.f201w = i4;
                    z4 = true;
                } else {
                    z4 = false;
                }
                c0296b2.m831b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z4), Boolean.valueOf(c0125h.f190l));
                if (c0183i != null && (z4 || c0125h.f190l)) {
                    c0183i.m663a();
                }
                int i5 = c0125h.f202x;
                int i6 = c0298d.f796k;
                if (i6 != i5) {
                    c0125h.f202x = i6;
                    z5 = true;
                } else {
                    z5 = false;
                }
                c0296b2.m831b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z5), Boolean.valueOf(c0125h.f190l));
                if (c0183i != null && (z5 || c0125h.f190l)) {
                    c0183i.m667e();
                }
                C0149x c0149x = c0125h.f203y;
                C0149x c0149x2 = c0298d.f797l;
                if (!AbstractC0295a.m828e(c0149x, c0149x2)) {
                    c0125h.f203y = c0149x2;
                }
                c0125h.f190l = false;
                return;
            case 1:
                C0125H c0125h2 = ((BinderC0124G) this.f171h).f180c;
                C0296b c0296b3 = C0125H.f181F;
                String str = ((C0297c) this.f172i).f791g;
                if (AbstractC0295a.m828e(str, c0125h2.f198t)) {
                    z6 = false;
                } else {
                    c0125h2.f198t = str;
                    z6 = true;
                }
                C0125H.f181F.m831b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z6), Boolean.valueOf(c0125h2.f191m));
                C0183I c0183i2 = c0125h2.f185C;
                if (c0183i2 != null && (z6 || c0125h2.f191m)) {
                    c0183i2.m666d();
                }
                c0125h2.f191m = false;
                return;
            case 2:
                C0296b c0296b4 = C0318x.f851S;
                C0298d c0298d2 = (C0298d) this.f172i;
                C0129d c0129d2 = c0298d2.f795j;
                C0318x c0318x = (C0318x) this.f171h;
                boolean zM828e2 = AbstractC0295a.m828e(c0129d2, c0318x.f872z);
                C0183I c0183i3 = c0318x.f855B;
                if (!zM828e2) {
                    c0318x.f872z = c0129d2;
                    c0183i3.m665c();
                }
                double d4 = c0298d2.f792g;
                if (Double.isNaN(d4) || Math.abs(d4 - c0318x.f864K) <= 1.0E-7d) {
                    z7 = false;
                } else {
                    c0318x.f864K = d4;
                    z7 = true;
                }
                boolean z13 = c0318x.f861H;
                boolean z14 = c0298d2.f793h;
                if (z14 != z13) {
                    c0318x.f861H = z14;
                    z7 = true;
                }
                Double.isNaN(c0298d2.f798m);
                Object[] objArr2 = {Boolean.valueOf(z7), Boolean.valueOf(c0318x.f863J)};
                C0296b c0296b5 = C0318x.f851S;
                c0296b5.m831b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", objArr2);
                if (c0183i3 != null && (z7 || c0318x.f863J)) {
                    c0183i3.m668f();
                }
                int i7 = c0318x.f866M;
                int i8 = c0298d2.f794i;
                if (i8 != i7) {
                    c0318x.f866M = i8;
                    z8 = true;
                } else {
                    z8 = false;
                }
                c0296b5.m831b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z8), Boolean.valueOf(c0318x.f863J));
                if (c0183i3 != null && (z8 || c0318x.f863J)) {
                    c0183i3.m663a();
                }
                int i9 = c0318x.f867N;
                int i10 = c0298d2.f796k;
                if (i10 != i9) {
                    c0318x.f867N = i10;
                    z9 = true;
                } else {
                    z9 = false;
                }
                c0296b5.m831b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z9), Boolean.valueOf(c0318x.f863J));
                if (c0183i3 != null && (z9 || c0318x.f863J)) {
                    c0183i3.m667e();
                }
                C0149x c0149x3 = c0318x.f865L;
                C0149x c0149x4 = c0298d2.f797l;
                if (!AbstractC0295a.m828e(c0149x3, c0149x4)) {
                    c0318x.f865L = c0149x4;
                }
                c0318x.f863J = false;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                C0296b c0296b6 = C0318x.f851S;
                String str2 = ((C0297c) this.f172i).f791g;
                C0318x c0318x2 = (C0318x) this.f171h;
                if (AbstractC0295a.m828e(str2, c0318x2.f860G)) {
                    z10 = false;
                } else {
                    c0318x2.f860G = str2;
                    z10 = true;
                }
                C0318x.f851S.m831b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(c0318x2.f862I));
                C0183I c0183i4 = c0318x2.f855B;
                if (c0183i4 != null && (z10 || c0318x2.f862I)) {
                    c0183i4.m666d();
                }
                c0318x2.f862I = false;
                return;
            case 4:
                C0437r c0437r = (C0437r) this.f172i;
                C0435p c0435p = (C0435p) ((C0424e) c0437r.f1488f).f1454p.get((C0421b) c0437r.f1485c);
                if (c0435p == null) {
                    return;
                }
                C0346a c0346a = (C0346a) this.f171h;
                if (!(c0346a.f1122h == 0)) {
                    c0435p.m1146m(c0346a, null);
                    return;
                }
                c0437r.f1483a = true;
                InterfaceC0390c interfaceC0390c = (InterfaceC0390c) c0437r.f1484b;
                if (interfaceC0390c.mo1075k()) {
                    if (!c0437r.f1483a || (interfaceC0478f = (InterfaceC0478f) c0437r.f1486d) == null) {
                        return;
                    }
                    interfaceC0390c.mo1071f(interfaceC0478f, (Set) c0437r.f1487e);
                    return;
                }
                try {
                    interfaceC0390c.mo1071f(null, interfaceC0390c.mo1073h());
                    return;
                } catch (SecurityException e3) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e3);
                    interfaceC0390c.mo1074j("Failed to get service from broker.");
                    c0435p.m1146m(new C0346a(10), null);
                    return;
                }
            case 5:
                C1527e c1527e = (C1527e) this.f171h;
                C0346a c0346a2 = c1527e.f6886h;
                boolean z15 = c0346a2.f1122h == 0;
                BinderC0416A binderC0416A = (BinderC0416A) this.f172i;
                if (z15) {
                    C0487o c0487o = c1527e.f6887i;
                    AbstractC0491s.m1213e(c0487o);
                    C0346a c0346a3 = c0487o.f1627i;
                    if (c0346a3.f1122h != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(c0346a3)), new Exception());
                        binderC0416A.f1424i.m1151c(c0346a3);
                        binderC0416A.f1423h.mo867i();
                        return;
                    }
                    C0437r c0437r2 = binderC0416A.f1424i;
                    IBinder iBinder = c0487o.f1626h;
                    if (iBinder != null) {
                        int i11 = AbstractBinderC0473a.f1567c;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        c0472e = iInterfaceQueryLocalInterface instanceof InterfaceC0478f ? (InterfaceC0478f) iInterfaceQueryLocalInterface : new C0472E(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                    }
                    c0437r2.getClass();
                    if (c0472e == null || (set = binderC0416A.f1421f) == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        c0437r2.m1151c(new C0346a(4));
                    } else {
                        c0437r2.f1486d = c0472e;
                        c0437r2.f1487e = set;
                        if (c0437r2.f1483a) {
                            ((InterfaceC0390c) c0437r2.f1484b).mo1071f(c0472e, set);
                        }
                    }
                } else {
                    binderC0416A.f1424i.m1151c(c0346a2);
                }
                binderC0416A.f1423h.mo867i();
                return;
            case 6:
                ((BinderC1319q) this.f171h).m3350x0((C1451x) this.f172i);
                return;
            case 7:
                ((MainActivity) this.f172i).f6008g.evaluateJavascript((String) this.f171h, null);
                return;
            case 8:
                synchronized (((C1562f) this.f172i).f7068b) {
                    ((InterfaceC1557a) ((C1562f) this.f172i).f7070d).mo524l((C1563g) this.f171h);
                    break;
                }
                return;
            case 9:
                m560a();
                return;
            case 10:
                m561b();
                return;
            case 11:
                ((C2118a) this.f171h).f9159g = this.f172i;
                return;
            case 12:
                ((Application) this.f171h).unregisterActivityLifecycleCallbacks((C2118a) this.f172i);
                return;
            case 13:
                try {
                    Method method = AbstractC2119b.f9168d;
                    Object obj = this.f172i;
                    Object obj2 = this.f171h;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC2119b.f9169e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e4) {
                    if (e4.getClass() == RuntimeException.class && e4.getMessage() != null && e4.getMessage().startsWith("Unable to stop")) {
                        throw e4;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 14:
                C0368e c0368e = (C0368e) ((C1447t) this.f171h).f6406h;
                if (c0368e != null) {
                    c0368e.m1013e((Typeface) this.f172i);
                    return;
                }
                return;
            default:
                ((C2345d) this.f171h).mo2543b(this.f172i);
                return;
        }
    }

    public /* synthetic */ RunnableC0121D(Object obj, Object obj2, int i3, boolean z3) {
        this.f170g = i3;
        this.f172i = obj;
        this.f171h = obj2;
    }
}

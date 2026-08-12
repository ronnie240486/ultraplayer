package p040N1;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.support.v4.media.session.C0858A;
import com.google.android.gms.common.api.Status;
import p000A.C0031d;
import p009D0.C0106b;
import p013E1.C0151z;
import p034L1.C0348c;
import p037M1.C0391d;
import p039N0.C0414j;
import p097f2.C1560d;
import p097f2.C1563g;

/* JADX INFO: renamed from: N1.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0417B extends AbstractC0440u {

    /* JADX INFO: renamed from: b */
    public final C1560d f1425b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f1426c;

    /* JADX INFO: renamed from: d */
    public final Object f1427d;

    public C0417B(int i3, C1560d c1560d) {
        super(i3);
        this.f1425b = c1560d;
    }

    @Override // p040N1.AbstractC0440u
    /* JADX INFO: renamed from: a */
    public final boolean mo1114a(C0435p c0435p) {
        switch (this.f1426c) {
            case 0:
                ((C0444y) this.f1427d).f1504a.getClass();
                return true;
            default:
                return ((C0444y) c0435p.f1473g.get((C0427h) this.f1427d)) != null;
        }
    }

    @Override // p040N1.AbstractC0440u
    /* JADX INFO: renamed from: b */
    public final C0348c[] mo1115b(C0435p c0435p) {
        switch (this.f1426c) {
            case 0:
                return (C0348c[]) ((C0444y) this.f1427d).f1504a.f3640i;
            default:
                C0444y c0444y = (C0444y) c0435p.f1473g.get((C0427h) this.f1427d);
                if (c0444y == null) {
                    return null;
                }
                return (C0348c[]) c0444y.f1504a.f3640i;
        }
    }

    @Override // p040N1.AbstractC0440u
    /* JADX INFO: renamed from: c */
    public final void mo1116c(Status status) {
        this.f1425b.m3880c(new C0391d(status));
    }

    @Override // p040N1.AbstractC0440u
    /* JADX INFO: renamed from: d */
    public final void mo1117d(RuntimeException runtimeException) {
        this.f1425b.m3880c(runtimeException);
    }

    @Override // p040N1.AbstractC0440u
    /* JADX INFO: renamed from: e */
    public final void mo1118e(C0435p c0435p) throws DeadObjectException {
        try {
            m1120h(c0435p);
        } catch (DeadObjectException e3) {
            mo1116c(AbstractC0440u.m1152g(e3));
            throw e3;
        } catch (RemoteException e4) {
            mo1116c(AbstractC0440u.m1152g(e4));
        } catch (RuntimeException e5) {
            this.f1425b.m3880c(e5);
        }
    }

    @Override // p040N1.AbstractC0440u
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo1119f(C0106b c0106b, boolean z3) {
        int i3 = this.f1426c;
    }

    /* JADX INFO: renamed from: h */
    public final void m1120h(C0435p c0435p) {
        switch (this.f1426c) {
            case 0:
                C0858A c0858a = ((C0444y) this.f1427d).f1504a;
                ((C0031d) ((C0414j) c0858a.f3641j).f1408h).mo165m(c0435p.f1469c, this.f1425b);
                C0427h c0427h = ((C0428i) ((C0444y) this.f1427d).f1504a.f3639h).f1460a;
                if (c0427h != null) {
                    c0435p.f1473g.put(c0427h, (C0444y) this.f1427d);
                    return;
                }
                return;
            default:
                C0444y c0444y = (C0444y) c0435p.f1473g.remove((C0427h) this.f1427d);
                if (c0444y != null) {
                    ((C0151z) ((C0414j) c0444y.f1505b.f38h).f1409i).mo165m(c0435p.f1469c, this.f1425b);
                    ((C0428i) c0444y.f1504a.f3639h).f1460a = null;
                    return;
                }
                C1560d c1560d = this.f1425b;
                Boolean bool = Boolean.FALSE;
                C1563g c1563g = c1560d.f7065a;
                synchronized (c1563g.f7071a) {
                    try {
                        if (!c1563g.f7073c) {
                            c1563g.f7073c = true;
                            c1563g.f7074d = bool;
                            c1563g.f7072b.m2059f(c1563g);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0417B(C0427h c0427h, C1560d c1560d) {
        this(4, c1560d);
        this.f1426c = 1;
        this.f1427d = c0427h;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0417B(C0444y c0444y, C1560d c1560d) {
        this(3, c1560d);
        this.f1426c = 0;
        this.f1427d = c0444y;
    }

    /* JADX INFO: renamed from: i */
    private final /* bridge */ /* synthetic */ void m1112i(C0106b c0106b, boolean z3) {
    }

    /* JADX INFO: renamed from: j */
    private final /* bridge */ /* synthetic */ void m1113j(C0106b c0106b, boolean z3) {
    }
}

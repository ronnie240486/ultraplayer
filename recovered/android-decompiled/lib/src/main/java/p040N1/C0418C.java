package p040N1;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import p009D0.C0106b;
import p034L1.C0348c;
import p037M1.C0391d;
import p037M1.C0397j;
import p097f2.C1560d;

/* JADX INFO: renamed from: N1.C */
/* JADX INFO: loaded from: classes.dex */
public final class C0418C extends AbstractC0440u {

    /* JADX INFO: renamed from: b */
    public final C0431l f1428b;

    /* JADX INFO: renamed from: c */
    public final C1560d f1429c;

    /* JADX INFO: renamed from: d */
    public final C0420a f1430d;

    public C0418C(int i3, C0431l c0431l, C1560d c1560d, C0420a c0420a) {
        super(i3);
        this.f1429c = c1560d;
        this.f1428b = c0431l;
        this.f1430d = c0420a;
        if (i3 == 2 && c0431l.f1462b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // p040N1.AbstractC0440u
    /* JADX INFO: renamed from: a */
    public final boolean mo1114a(C0435p c0435p) {
        return this.f1428b.f1462b;
    }

    @Override // p040N1.AbstractC0440u
    /* JADX INFO: renamed from: b */
    public final C0348c[] mo1115b(C0435p c0435p) {
        return this.f1428b.f1461a;
    }

    @Override // p040N1.AbstractC0440u
    /* JADX INFO: renamed from: c */
    public final void mo1116c(Status status) {
        this.f1430d.getClass();
        this.f1429c.m3880c(status.f5499i != null ? new C0397j(status) : new C0391d(status));
    }

    @Override // p040N1.AbstractC0440u
    /* JADX INFO: renamed from: d */
    public final void mo1117d(RuntimeException runtimeException) {
        this.f1429c.m3880c(runtimeException);
    }

    @Override // p040N1.AbstractC0440u
    /* JADX INFO: renamed from: e */
    public final void mo1118e(C0435p c0435p) throws DeadObjectException {
        C1560d c1560d = this.f1429c;
        try {
            C0431l c0431l = this.f1428b;
            ((InterfaceC0430k) ((C0431l) c0431l.f1464d).f1464d).mo165m(c0435p.f1469c, c1560d);
        } catch (DeadObjectException e3) {
            throw e3;
        } catch (RemoteException e4) {
            mo1116c(AbstractC0440u.m1152g(e4));
        } catch (RuntimeException e5) {
            c1560d.m3880c(e5);
        }
    }

    @Override // p040N1.AbstractC0440u
    /* JADX INFO: renamed from: f */
    public final void mo1119f(C0106b c0106b, boolean z3) {
        Boolean boolValueOf = Boolean.valueOf(z3);
        Map map = (Map) c0106b.f141i;
        C1560d c1560d = this.f1429c;
        map.put(c1560d, boolValueOf);
        c1560d.f7065a.m3884a(new C0106b((Object) c0106b, (Object) c1560d, 7, false));
    }
}

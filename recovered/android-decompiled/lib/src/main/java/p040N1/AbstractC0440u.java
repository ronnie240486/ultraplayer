package p040N1;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p009D0.C0106b;
import p034L1.C0348c;

/* JADX INFO: renamed from: N1.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0440u {

    /* JADX INFO: renamed from: a */
    public final int f1491a;

    public AbstractC0440u(int i3) {
        this.f1491a = i3;
    }

    /* JADX INFO: renamed from: g */
    public static Status m1152g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo1114a(C0435p c0435p);

    /* JADX INFO: renamed from: b */
    public abstract C0348c[] mo1115b(C0435p c0435p);

    /* JADX INFO: renamed from: c */
    public abstract void mo1116c(Status status);

    /* JADX INFO: renamed from: d */
    public abstract void mo1117d(RuntimeException runtimeException);

    /* JADX INFO: renamed from: e */
    public abstract void mo1118e(C0435p c0435p);

    /* JADX INFO: renamed from: f */
    public abstract void mo1119f(C0106b c0106b, boolean z3);
}

package p028J1;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.AbstractC1152a;
import p013E1.AbstractC0150y;
import p034L1.C0348c;

/* JADX INFO: renamed from: J1.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0314t extends AbstractC1152a {
    @Override // p037M1.InterfaceC0390c
    /* JADX INFO: renamed from: m */
    public final int mo859m() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1152a
    /* JADX INFO: renamed from: n */
    public final IInterface mo860n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        return iInterfaceQueryLocalInterface instanceof C0303i ? (C0303i) iInterfaceQueryLocalInterface : new C0303i(iBinder, "com.google.android.gms.cast.internal.ICastService", 2);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1152a
    /* JADX INFO: renamed from: o */
    public final C0348c[] mo861o() {
        return AbstractC0150y.f356e;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1152a
    /* JADX INFO: renamed from: s */
    public final String mo862s() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1152a
    /* JADX INFO: renamed from: t */
    public final String mo863t() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }
}

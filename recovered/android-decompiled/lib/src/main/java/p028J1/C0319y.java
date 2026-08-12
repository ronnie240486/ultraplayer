package p028J1;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.internal.AbstractC1152a;
import p013E1.AbstractC0150y;
import p034L1.C0348c;
import p040N1.C0435p;
import p046P1.C0475c;

/* JADX INFO: renamed from: J1.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0319y extends AbstractC1152a {

    /* JADX INFO: renamed from: D */
    public static final C0296b f873D = new C0296b("CastClientImplCxless", null);

    /* JADX INFO: renamed from: A */
    public final long f874A;

    /* JADX INFO: renamed from: B */
    public final Bundle f875B;

    /* JADX INFO: renamed from: C */
    public final String f876C;

    /* JADX INFO: renamed from: z */
    public final CastDevice f877z;

    public C0319y(Context context, Looper looper, C0475c c0475c, CastDevice castDevice, long j3, Bundle bundle, String str, C0435p c0435p, C0435p c0435p2) {
        super(context, looper, 10, c0475c, c0435p, c0435p2);
        this.f877z = castDevice;
        this.f874A = j3;
        this.f875B = bundle;
        this.f876C = str;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1152a, p037M1.InterfaceC0390c
    /* JADX INFO: renamed from: i */
    public final void mo867i() {
        try {
            try {
                ((C0300f) m3090r()).m835w0();
            } finally {
                super.mo867i();
            }
        } catch (RemoteException | IllegalStateException e3) {
            f873D.m830a(e3, "Error while disconnecting the controller interface", new Object[0]);
        }
    }

    @Override // p037M1.InterfaceC0390c
    /* JADX INFO: renamed from: m */
    public final int mo859m() {
        return 19390000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1152a
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ IInterface mo860n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return iInterfaceQueryLocalInterface instanceof C0300f ? (C0300f) iInterfaceQueryLocalInterface : new C0300f(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1152a
    /* JADX INFO: renamed from: o */
    public final C0348c[] mo861o() {
        return AbstractC0150y.f356e;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1152a
    /* JADX INFO: renamed from: q */
    public final Bundle mo869q() {
        Bundle bundle = new Bundle();
        f873D.m831b("getRemoteService()", new Object[0]);
        CastDevice castDevice = this.f877z;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.f874A);
        bundle.putString("connectionless_client_record_id", this.f876C);
        Bundle bundle2 = this.f875B;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1152a
    /* JADX INFO: renamed from: s */
    public final String mo862s() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1152a
    /* JADX INFO: renamed from: t */
    public final String mo863t() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1152a
    /* JADX INFO: renamed from: x */
    public final boolean mo872x() {
        return true;
    }
}

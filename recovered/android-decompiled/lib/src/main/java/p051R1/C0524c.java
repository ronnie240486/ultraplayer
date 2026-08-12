package p051R1;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC1152a;
import p034L1.C0348c;
import p040N1.C0435p;
import p046P1.C0475c;
import p046P1.C0483k;
import p075Z1.AbstractC0782c;

/* JADX INFO: renamed from: R1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0524c extends AbstractC1152a {

    /* JADX INFO: renamed from: z */
    public final C0483k f1801z;

    public C0524c(Context context, Looper looper, C0475c c0475c, C0483k c0483k, C0435p c0435p, C0435p c0435p2) {
        super(context, looper, 270, c0475c, c0435p, c0435p2);
        this.f1801z = c0483k;
    }

    @Override // p037M1.InterfaceC0390c
    /* JADX INFO: renamed from: m */
    public final int mo859m() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1152a
    /* JADX INFO: renamed from: n */
    public final IInterface mo860n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof C0522a ? (C0522a) iInterfaceQueryLocalInterface : new C0522a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1152a
    /* JADX INFO: renamed from: o */
    public final C0348c[] mo861o() {
        return AbstractC0782c.f3193b;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1152a
    /* JADX INFO: renamed from: q */
    public final Bundle mo869q() {
        this.f1801z.getClass();
        return new Bundle();
    }

    @Override // com.google.android.gms.common.internal.AbstractC1152a
    /* JADX INFO: renamed from: s */
    public final String mo862s() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1152a
    /* JADX INFO: renamed from: t */
    public final String mo863t() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1152a
    /* JADX INFO: renamed from: u */
    public final boolean mo1278u() {
        return true;
    }
}

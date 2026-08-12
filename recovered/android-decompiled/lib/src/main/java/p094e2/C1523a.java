package p094e2;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC1152a;
import p037M1.InterfaceC0390c;
import p037M1.InterfaceC0394g;
import p037M1.InterfaceC0395h;
import p046P1.C0475c;

/* JADX INFO: renamed from: e2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1523a extends AbstractC1152a implements InterfaceC0390c {

    /* JADX INFO: renamed from: A */
    public final C0475c f6876A;

    /* JADX INFO: renamed from: B */
    public final Bundle f6877B;

    /* JADX INFO: renamed from: C */
    public final Integer f6878C;

    /* JADX INFO: renamed from: z */
    public final boolean f6879z;

    public C1523a(Context context, Looper looper, C0475c c0475c, Bundle bundle, InterfaceC0394g interfaceC0394g, InterfaceC0395h interfaceC0395h) {
        super(context, looper, 44, c0475c, interfaceC0394g, interfaceC0395h);
        this.f6879z = true;
        this.f6876A = c0475c;
        this.f6877B = bundle;
        this.f6878C = (Integer) c0475c.f1573f;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1152a, p037M1.InterfaceC0390c
    /* JADX INFO: renamed from: k */
    public final boolean mo1075k() {
        return this.f6879z;
    }

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
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof C1525c ? (C1525c) iInterfaceQueryLocalInterface : new C1525c(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1152a
    /* JADX INFO: renamed from: q */
    public final Bundle mo869q() {
        C0475c c0475c = this.f6876A;
        boolean zEquals = this.f5516c.getPackageName().equals((String) c0475c.f1570c);
        Bundle bundle = this.f6877B;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) c0475c.f1570c);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1152a
    /* JADX INFO: renamed from: s */
    public final String mo862s() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1152a
    /* JADX INFO: renamed from: t */
    public final String mo863t() {
        return "com.google.android.gms.signin.service.START";
    }
}

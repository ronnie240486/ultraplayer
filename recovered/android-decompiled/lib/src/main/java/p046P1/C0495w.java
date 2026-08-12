package p046P1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC1152a;
import p034L1.C0346a;
import p037M1.InterfaceC0394g;
import p037M1.InterfaceC0395h;

/* JADX INFO: renamed from: P1.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0495w extends AbstractC0488p {

    /* JADX INFO: renamed from: g */
    public final IBinder f1645g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC1152a f1646h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0495w(AbstractC1152a abstractC1152a, int i3, IBinder iBinder, Bundle bundle) {
        super(abstractC1152a, i3, bundle);
        this.f1646h = abstractC1152a;
        this.f1645g = iBinder;
    }

    @Override // p046P1.AbstractC0488p
    /* JADX INFO: renamed from: a */
    public final void mo1204a(C0346a c0346a) {
        AbstractC1152a abstractC1152a = this.f1646h;
        C0480h c0480h = abstractC1152a.f5529p;
        if (c0480h != null) {
            ((InterfaceC0395h) c0480h.f1607a).mo1082q0(c0346a);
        }
        abstractC1152a.mo870v(c0346a);
    }

    @Override // p046P1.AbstractC0488p
    /* JADX INFO: renamed from: b */
    public final boolean mo1205b() {
        IBinder iBinder = this.f1645g;
        try {
            AbstractC0491s.m1213e(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC1152a abstractC1152a = this.f1646h;
            if (!abstractC1152a.mo862s().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + abstractC1152a.mo862s() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceMo860n = abstractC1152a.mo860n(iBinder);
            if (iInterfaceMo860n == null || !(AbstractC1152a.m3088z(abstractC1152a, 2, 4, iInterfaceMo860n) || AbstractC1152a.m3088z(abstractC1152a, 3, 4, iInterfaceMo860n))) {
                return false;
            }
            abstractC1152a.f5533t = null;
            abstractC1152a.mo868p();
            C0480h c0480h = abstractC1152a.f5528o;
            if (c0480h == null) {
                return true;
            }
            ((InterfaceC0394g) c0480h.f1607a).mo1081e0();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}

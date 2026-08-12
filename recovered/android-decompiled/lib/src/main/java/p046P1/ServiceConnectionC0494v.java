package p046P1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.AbstractC1152a;

/* JADX INFO: renamed from: P1.v */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC0494v implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final int f1643a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC1152a f1644b;

    public ServiceConnectionC0494v(AbstractC1152a abstractC1152a, int i3) {
        this.f1644b = abstractC1152a;
        this.f1643a = i3;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC1152a abstractC1152a = this.f1644b;
        if (iBinder == null) {
            AbstractC1152a.m3087y(abstractC1152a);
            return;
        }
        synchronized (abstractC1152a.f5521h) {
            try {
                AbstractC1152a abstractC1152a2 = this.f1644b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC1152a2.f5522i = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof C0490r)) ? new C0490r(iBinder) : (C0490r) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC1152a abstractC1152a3 = this.f1644b;
        int i3 = this.f1643a;
        abstractC1152a3.getClass();
        C0496x c0496x = new C0496x(abstractC1152a3, 0);
        HandlerC0492t handlerC0492t = abstractC1152a3.f5519f;
        handlerC0492t.sendMessage(handlerC0492t.obtainMessage(7, i3, -1, c0496x));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC1152a abstractC1152a;
        synchronized (this.f1644b.f5521h) {
            abstractC1152a = this.f1644b;
            abstractC1152a.f5522i = null;
        }
        int i3 = this.f1643a;
        HandlerC0492t handlerC0492t = abstractC1152a.f5519f;
        handlerC0492t.sendMessage(handlerC0492t.obtainMessage(6, i3, 1));
    }
}

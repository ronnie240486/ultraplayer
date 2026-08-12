package p046P1;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: renamed from: P1.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0469B implements Handler.Callback {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0470C f1554g;

    public /* synthetic */ C0469B(C0470C c0470c) {
        this.f1554g = c0470c;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i3 = message.what;
        if (i3 == 0) {
            synchronized (this.f1554g.f1558a) {
                try {
                    C0498z c0498z = (C0498z) message.obj;
                    ServiceConnectionC0468A serviceConnectionC0468A = (ServiceConnectionC0468A) this.f1554g.f1558a.get(c0498z);
                    if (serviceConnectionC0468A != null && serviceConnectionC0468A.f1547a.isEmpty()) {
                        if (serviceConnectionC0468A.f1549c) {
                            serviceConnectionC0468A.f1553g.f1560c.removeMessages(1, serviceConnectionC0468A.f1551e);
                            C0470C c0470c = serviceConnectionC0468A.f1553g;
                            c0470c.f1561d.m1345a(c0470c.f1559b, serviceConnectionC0468A);
                            serviceConnectionC0468A.f1549c = false;
                            serviceConnectionC0468A.f1548b = 2;
                        }
                        this.f1554g.f1558a.remove(c0498z);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        if (i3 != 1) {
            return false;
        }
        synchronized (this.f1554g.f1558a) {
            try {
                C0498z c0498z2 = (C0498z) message.obj;
                ServiceConnectionC0468A serviceConnectionC0468A2 = (ServiceConnectionC0468A) this.f1554g.f1558a.get(c0498z2);
                if (serviceConnectionC0468A2 != null && serviceConnectionC0468A2.f1548b == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(c0498z2)), new Exception());
                    ComponentName componentName = serviceConnectionC0468A2.f1552f;
                    if (componentName == null) {
                        c0498z2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = c0498z2.f1654b;
                        AbstractC0491s.m1213e(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    serviceConnectionC0468A2.onServiceDisconnected(componentName);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}

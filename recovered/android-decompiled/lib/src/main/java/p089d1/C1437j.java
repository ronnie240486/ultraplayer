package p089d1;

import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: renamed from: d1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1437j extends AbstractC1448u {

    /* JADX INFO: renamed from: a */
    public final String f6368a;

    /* JADX INFO: renamed from: b */
    public final C1436i f6369b;

    public C1437j(String str, C1436i c1436i) {
        this.f6368a = str;
        this.f6369b = c1436i;
    }

    @Override // p089d1.AbstractC1448u
    /* JADX INFO: renamed from: f */
    public final void mo3523f(int i3) {
        C1436i c1436i;
        MediaRouter2.RoutingController routingController;
        Messenger messenger;
        String str = this.f6368a;
        if (str == null || (c1436i = this.f6369b) == null || (routingController = c1436i.f6358g) == null || routingController.isReleased() || (messenger = c1436i.f6359h) == null) {
            return;
        }
        int andIncrement = c1436i.f6363l.getAndIncrement();
        Message messageObtain = Message.obtain();
        messageObtain.what = 7;
        messageObtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i3);
        bundle.putString("routeId", str);
        messageObtain.setData(bundle);
        messageObtain.replyTo = c1436i.f6360i;
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException e3) {
            Log.e("MR2Provider", "Could not send control request to service.", e3);
        }
    }

    @Override // p089d1.AbstractC1448u
    /* JADX INFO: renamed from: i */
    public final void mo3524i(int i3) {
        C1436i c1436i;
        MediaRouter2.RoutingController routingController;
        Messenger messenger;
        String str = this.f6368a;
        if (str == null || (c1436i = this.f6369b) == null || (routingController = c1436i.f6358g) == null || routingController.isReleased() || (messenger = c1436i.f6359h) == null) {
            return;
        }
        int andIncrement = c1436i.f6363l.getAndIncrement();
        Message messageObtain = Message.obtain();
        messageObtain.what = 8;
        messageObtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i3);
        bundle.putString("routeId", str);
        messageObtain.setData(bundle);
        messageObtain.replyTo = c1436i.f6360i;
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException e3) {
            Log.e("MR2Provider", "Could not send control request to service.", e3);
        }
    }
}

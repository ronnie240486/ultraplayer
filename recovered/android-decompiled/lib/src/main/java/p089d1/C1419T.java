package p089d1;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;

/* JADX INFO: renamed from: d1.T */
/* JADX INFO: loaded from: classes.dex */
public final class C1419T implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a */
    public final Messenger f6270a;

    /* JADX INFO: renamed from: b */
    public final HandlerC1421V f6271b;

    /* JADX INFO: renamed from: c */
    public final Messenger f6272c;

    /* JADX INFO: renamed from: f */
    public int f6275f;

    /* JADX INFO: renamed from: g */
    public int f6276g;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ServiceConnectionC1425Z f6278i;

    /* JADX INFO: renamed from: d */
    public int f6273d = 1;

    /* JADX INFO: renamed from: e */
    public int f6274e = 1;

    /* JADX INFO: renamed from: h */
    public final SparseArray f6277h = new SparseArray();

    public C1419T(ServiceConnectionC1425Z serviceConnectionC1425Z, Messenger messenger) {
        this.f6278i = serviceConnectionC1425Z;
        this.f6270a = messenger;
        HandlerC1421V handlerC1421V = new HandlerC1421V(this);
        this.f6271b = handlerC1421V;
        this.f6272c = new Messenger(handlerC1421V);
    }

    /* JADX INFO: renamed from: a */
    public final void m3542a(int i3) {
        int i4 = this.f6273d;
        this.f6273d = i4 + 1;
        m3543b(5, i4, i3, null, null);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3543b(int i3, int i4, int i5, Bundle bundle, Bundle bundle2) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i3;
        messageObtain.arg1 = i4;
        messageObtain.arg2 = i5;
        messageObtain.obj = bundle;
        messageObtain.setData(bundle2);
        messageObtain.replyTo = this.f6272c;
        try {
            this.f6270a.send(messageObtain);
            return true;
        } catch (DeadObjectException unused) {
            return false;
        } catch (RemoteException e3) {
            if (i3 == 2) {
                return false;
            }
            Log.e("MediaRouteProviderProxy", "Could not send message to service.", e3);
            return false;
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        ServiceConnectionC1425Z serviceConnectionC1425Z = this.f6278i;
        serviceConnectionC1425Z.f6301j.post(new RunnableC1418S(this, 1));
    }

    /* JADX INFO: renamed from: c */
    public final void m3544c(int i3, int i4) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i4);
        int i5 = this.f6273d;
        this.f6273d = i5 + 1;
        m3543b(7, i5, i3, null, bundle);
    }

    /* JADX INFO: renamed from: d */
    public final void m3545d(int i3, int i4) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i4);
        int i5 = this.f6273d;
        this.f6273d = i5 + 1;
        m3543b(8, i5, i3, null, bundle);
    }
}

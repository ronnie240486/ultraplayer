package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.RemoteException;
import android.util.Log;
import androidx.mediarouter.app.C1048q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: android.support.v4.media.session.h */
/* JADX INFO: loaded from: classes.dex */
public class C0872h {

    /* JADX INFO: renamed from: a */
    public final MediaController f3686a;

    /* JADX INFO: renamed from: b */
    public final Object f3687b = new Object();

    /* JADX INFO: renamed from: c */
    public final ArrayList f3688c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final HashMap f3689d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final MediaSessionCompat$Token f3690e;

    public C0872h(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f3690e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.f3654h);
        this.f3686a = mediaController;
        if (mediaSessionCompat$Token.m2214d() == null) {
            ResultReceiverC0864x50fd9e4a resultReceiverC0864x50fd9e4a = new ResultReceiverC0864x50fd9e4a(null);
            resultReceiverC0864x50fd9e4a.f3649g = new WeakReference(this);
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, resultReceiverC0864x50fd9e4a);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2272a() {
        MediaSessionCompat$Token mediaSessionCompat$Token = this.f3690e;
        if (mediaSessionCompat$Token.m2214d() == null) {
            return;
        }
        ArrayList arrayList = this.f3688c;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            C1048q c1048q = (C1048q) obj;
            BinderC0871g binderC0871g = new BinderC0871g(c1048q);
            this.f3689d.put(c1048q, binderC0871g);
            c1048q.f4600c = binderC0871g;
            try {
                mediaSessionCompat$Token.m2214d().mo2229p(binderC0871g);
                c1048q.m2650e(13, null, null);
            } catch (RemoteException e3) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e3);
            }
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: b */
    public final void m2273b(C1048q c1048q) {
        this.f3686a.unregisterCallback(c1048q.f4598a);
        synchronized (this.f3687b) {
            if (this.f3690e.m2214d() != null) {
                try {
                    BinderC0871g binderC0871g = (BinderC0871g) this.f3689d.remove(c1048q);
                    if (binderC0871g != null) {
                        c1048q.f4600c = null;
                        this.f3690e.m2214d().mo2231v(binderC0871g);
                    }
                } catch (RemoteException e3) {
                    Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e3);
                }
            } else {
                this.f3688c.remove(c1048q);
            }
        }
    }
}

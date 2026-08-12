package p089d1;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.support.v4.media.session.HandlerC0881q;
import android.util.Log;
import android.util.SparseArray;
import androidx.activity.RunnableC0892b;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: d1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1436i extends AbstractC1446s {

    /* JADX INFO: renamed from: f */
    public final String f6357f;

    /* JADX INFO: renamed from: g */
    public final MediaRouter2.RoutingController f6358g;

    /* JADX INFO: renamed from: h */
    public final Messenger f6359h;

    /* JADX INFO: renamed from: i */
    public final Messenger f6360i;

    /* JADX INFO: renamed from: k */
    public final Handler f6362k;

    /* JADX INFO: renamed from: o */
    public C1442o f6366o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C1440m f6367p;

    /* JADX INFO: renamed from: j */
    public final SparseArray f6361j = new SparseArray();

    /* JADX INFO: renamed from: l */
    public final AtomicInteger f6363l = new AtomicInteger(1);

    /* JADX INFO: renamed from: m */
    public final RunnableC0892b f6364m = new RunnableC0892b(14, this);

    /* JADX INFO: renamed from: n */
    public int f6365n = -1;

    public C1436i(C1440m c1440m, MediaRouter2.RoutingController routingController, String str) {
        this.f6367p = c1440m;
        this.f6358g = routingController;
        this.f6357f = str;
        int i3 = C1440m.f6373r;
        Bundle controlHints = routingController.getControlHints();
        Messenger messenger = controlHints == null ? null : (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
        this.f6359h = messenger;
        this.f6360i = messenger != null ? new Messenger(new HandlerC0881q(this)) : null;
        this.f6362k = new Handler(Looper.getMainLooper());
    }

    @Override // p089d1.AbstractC1448u
    /* JADX INFO: renamed from: d */
    public final void mo3551d() {
        this.f6358g.release();
    }

    @Override // p089d1.AbstractC1448u
    /* JADX INFO: renamed from: f */
    public final void mo3523f(int i3) {
        MediaRouter2.RoutingController routingController = this.f6358g;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i3);
        this.f6365n = i3;
        Handler handler = this.f6362k;
        RunnableC0892b runnableC0892b = this.f6364m;
        handler.removeCallbacks(runnableC0892b);
        handler.postDelayed(runnableC0892b, 1000L);
    }

    @Override // p089d1.AbstractC1448u
    /* JADX INFO: renamed from: i */
    public final void mo3524i(int i3) {
        MediaRouter2.RoutingController routingController = this.f6358g;
        if (routingController == null) {
            return;
        }
        int volume = this.f6365n;
        if (volume < 0) {
            volume = routingController.getVolume();
        }
        int iMax = Math.max(0, Math.min(volume + i3, this.f6358g.getVolumeMax()));
        this.f6365n = iMax;
        this.f6358g.setVolume(iMax);
        Handler handler = this.f6362k;
        RunnableC0892b runnableC0892b = this.f6364m;
        handler.removeCallbacks(runnableC0892b);
        handler.postDelayed(runnableC0892b, 1000L);
    }

    @Override // p089d1.AbstractC1446s
    /* JADX INFO: renamed from: m */
    public final void mo3557m(String str) {
        if (str == null || str.isEmpty()) {
            Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
            return;
        }
        MediaRoute2Info mediaRoute2InfoM3602i = this.f6367p.m3602i(str);
        if (mediaRoute2InfoM3602i == null) {
            Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=".concat(str));
        } else {
            this.f6358g.selectRoute(mediaRoute2InfoM3602i);
        }
    }

    @Override // p089d1.AbstractC1446s
    /* JADX INFO: renamed from: n */
    public final void mo3558n(String str) {
        if (str == null || str.isEmpty()) {
            Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
            return;
        }
        MediaRoute2Info mediaRoute2InfoM3602i = this.f6367p.m3602i(str);
        if (mediaRoute2InfoM3602i == null) {
            Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=".concat(str));
        } else {
            this.f6358g.deselectRoute(mediaRoute2InfoM3602i);
        }
    }

    @Override // p089d1.AbstractC1446s
    /* JADX INFO: renamed from: o */
    public final void mo3559o(List list) {
        if (list == null || list.isEmpty()) {
            Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
            return;
        }
        String str = (String) list.get(0);
        C1440m c1440m = this.f6367p;
        MediaRoute2Info mediaRoute2InfoM3602i = c1440m.m3602i(str);
        if (mediaRoute2InfoM3602i != null) {
            c1440m.f6374i.transferTo(mediaRoute2InfoM3602i);
            return;
        }
        Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=" + str);
    }
}

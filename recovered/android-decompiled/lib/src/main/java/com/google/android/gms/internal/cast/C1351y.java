package com.google.android.gms.internal.cast;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import com.zuxoplayer.app.MainActivity;
import p014F.RunnableC0153b;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1351y extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5991a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5992b;

    public /* synthetic */ C1351y(int i3, Object obj) {
        this.f5991a = i3;
        this.f5992b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        switch (this.f5991a) {
            case 0:
                break;
            default:
                ((MainActivity) this.f5992b).runOnUiThread(new RunnableC0153b(10, this));
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        switch (this.f5991a) {
            case 0:
                ((C1355z) this.f5992b).m3441b(network, linkProperties);
                break;
            default:
                super.onLinkPropertiesChanged(network, linkProperties);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        switch (this.f5991a) {
            case 0:
                C1355z c1355z = (C1355z) this.f5992b;
                synchronized (c1355z.f6002h) {
                    try {
                        if (c1355z.f5998d != null && c1355z.f5999e != null) {
                            C1355z.f5994j.m831b("the network is lost", new Object[0]);
                            if (c1355z.f5999e.remove(network)) {
                                c1355z.f5998d.remove(network);
                            }
                            c1355z.m3442c();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                super.onLost(network);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        switch (this.f5991a) {
            case 0:
                C1355z c1355z = (C1355z) this.f5992b;
                synchronized (c1355z.f6002h) {
                    if (c1355z.f5998d != null && c1355z.f5999e != null) {
                        C1355z.f5994j.m831b("all networks are unavailable.", new Object[0]);
                        c1355z.f5998d.clear();
                        c1355z.f5999e.clear();
                        c1355z.m3442c();
                        return;
                    }
                    return;
                }
            default:
                super.onUnavailable();
                return;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m3430a(Network network) {
    }
}

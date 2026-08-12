package p077a0;

import android.media.AudioManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.zuxoplayer.app.PlayerActivity;
import p009D0.C0106b;
import p039N0.C0409e;
import p101g2.InterfaceC1587h;
import p105h2.C1692X;
import p114k0.C1955o;
import p125n0.C2040q;
import p129o0.C2067g;
import p129o0.C2068h;
import p145s0.C2238k;

/* JADX INFO: renamed from: a0.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0819c implements InterfaceC1587h {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3451g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ PlayerActivity f3452h;

    public /* synthetic */ C0819c(PlayerActivity playerActivity, int i3) {
        this.f3451g = i3;
        this.f3452h = playerActivity;
    }

    @Override // p101g2.InterfaceC1587h
    public final Object get() {
        C2068h c2068h;
        switch (this.f3451g) {
            case 0:
                AudioManager audioManager = (AudioManager) this.f3452h.getApplicationContext().getSystemService("audio");
                audioManager.getClass();
                return audioManager;
            case 1:
                return new C0838n(this.f3452h);
            case 2:
                return new C1955o(new C0106b(this.f3452h, new C0409e(1)), new C2238k());
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C2040q(this.f3452h);
            default:
                PlayerActivity playerActivity = this.f3452h;
                C1692X c1692x = C2068h.f8976n;
                synchronized (C2068h.class) {
                    try {
                        if (C2068h.f8982t == null) {
                            C2067g c2067g = new C2067g(playerActivity);
                            C2068h.f8982t = new C2068h(c2067g.f8971a, c2067g.f8972b, c2067g.f8973c, c2067g.f8974d, c2067g.f8975e);
                        }
                        c2068h = C2068h.f8982t;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c2068h;
        }
    }
}

package p077a0;

import android.os.Looper;
import com.zuxoplayer.app.PlayerActivity;
import p055T.C0567c;
import p064W.AbstractC0632A;
import p064W.C0653u;
import p101g2.InterfaceC1587h;

/* JADX INFO: renamed from: a0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0842r {

    /* JADX INFO: renamed from: a */
    public final PlayerActivity f3575a;

    /* JADX INFO: renamed from: b */
    public final C0653u f3576b;

    /* JADX INFO: renamed from: c */
    public final C0819c f3577c;

    /* JADX INFO: renamed from: d */
    public InterfaceC1587h f3578d;

    /* JADX INFO: renamed from: e */
    public final C0819c f3579e;

    /* JADX INFO: renamed from: f */
    public final C0819c f3580f;

    /* JADX INFO: renamed from: g */
    public final Looper f3581g;

    /* JADX INFO: renamed from: h */
    public final int f3582h;

    /* JADX INFO: renamed from: i */
    public final C0567c f3583i;

    /* JADX INFO: renamed from: j */
    public final int f3584j;

    /* JADX INFO: renamed from: k */
    public final boolean f3585k;

    /* JADX INFO: renamed from: l */
    public final C0832i0 f3586l;

    /* JADX INFO: renamed from: m */
    public long f3587m;

    /* JADX INFO: renamed from: n */
    public long f3588n;

    /* JADX INFO: renamed from: o */
    public final long f3589o;

    /* JADX INFO: renamed from: p */
    public final C0833j f3590p;

    /* JADX INFO: renamed from: q */
    public final long f3591q;

    /* JADX INFO: renamed from: r */
    public final long f3592r;

    /* JADX INFO: renamed from: s */
    public final boolean f3593s;

    /* JADX INFO: renamed from: t */
    public boolean f3594t;

    /* JADX INFO: renamed from: u */
    public final String f3595u;

    public C0842r(PlayerActivity playerActivity) {
        C0819c c0819c = new C0819c(playerActivity, 1);
        C0819c c0819c2 = new C0819c(playerActivity, 2);
        C0819c c0819c3 = new C0819c(playerActivity, 3);
        C0819c c0819c4 = new C0819c(playerActivity, 4);
        this.f3575a = playerActivity;
        this.f3577c = c0819c;
        this.f3578d = c0819c2;
        this.f3579e = c0819c3;
        this.f3580f = c0819c4;
        int i3 = AbstractC0632A.f2454a;
        Looper looperMyLooper = Looper.myLooper();
        this.f3581g = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.f3583i = C0567c.f2052b;
        this.f3584j = 1;
        this.f3585k = true;
        this.f3586l = C0832i0.f3524c;
        this.f3587m = 5000L;
        this.f3588n = 15000L;
        this.f3589o = 3000L;
        this.f3590p = new C0833j(AbstractC0632A.m1571L(20L), AbstractC0632A.m1571L(500L));
        this.f3576b = C0653u.f2526a;
        this.f3591q = 500L;
        this.f3592r = 2000L;
        this.f3593s = true;
        this.f3595u = "";
        this.f3582h = -1000;
    }
}

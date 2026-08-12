package p129o0;

import android.os.SystemClock;

/* JADX INFO: renamed from: o0.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2066f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2068h f8970a;

    /* JADX INFO: renamed from: a */
    public final void m4631a(int i3) {
        C2068h c2068h = this.f8970a;
        synchronized (c2068h) {
            int i4 = c2068h.f8995m;
            if (i4 == 0 || c2068h.f8986d) {
                if (i4 == i3) {
                    return;
                }
                c2068h.f8995m = i3;
                if (i3 != 1 && i3 != 0 && i3 != 8) {
                    c2068h.f8993k = c2068h.m4632a(i3);
                    c2068h.f8985c.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    c2068h.m4633b(c2068h.f8988f > 0 ? (int) (jElapsedRealtime - c2068h.f8989g) : 0, c2068h.f8990h, c2068h.f8993k);
                    c2068h.f8989g = jElapsedRealtime;
                    c2068h.f8990h = 0L;
                    c2068h.f8992j = 0L;
                    c2068h.f8991i = 0L;
                    C2078r c2078r = c2068h.f8987e;
                    c2078r.f9024b.clear();
                    c2078r.f9026d = -1;
                    c2078r.f9027e = 0;
                    c2078r.f9028f = 0;
                }
            }
        }
    }
}

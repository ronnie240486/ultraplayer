package p137q0;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: q0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C2159t {

    /* JADX INFO: renamed from: a */
    public final C2141b f9327a;

    /* JADX INFO: renamed from: b */
    public final C2157r f9328b;

    /* JADX INFO: renamed from: c */
    public final ChoreographerFrameCallbackC2158s f9329c;

    /* JADX INFO: renamed from: d */
    public boolean f9330d;

    /* JADX INFO: renamed from: e */
    public Surface f9331e;

    /* JADX INFO: renamed from: f */
    public float f9332f;

    /* JADX INFO: renamed from: g */
    public float f9333g;

    /* JADX INFO: renamed from: h */
    public float f9334h;

    /* JADX INFO: renamed from: i */
    public float f9335i;

    /* JADX INFO: renamed from: j */
    public int f9336j;

    /* JADX INFO: renamed from: k */
    public long f9337k;

    /* JADX INFO: renamed from: l */
    public long f9338l;

    /* JADX INFO: renamed from: m */
    public long f9339m;

    /* JADX INFO: renamed from: n */
    public long f9340n;

    /* JADX INFO: renamed from: o */
    public long f9341o;

    /* JADX INFO: renamed from: p */
    public long f9342p;

    /* JADX INFO: renamed from: q */
    public long f9343q;

    public C2159t(Context context) {
        DisplayManager displayManager;
        C2141b c2141b = new C2141b();
        c2141b.f9212a = new C2140a();
        c2141b.f9213b = new C2140a();
        c2141b.f9215d = -9223372036854775807L;
        this.f9327a = c2141b;
        C2157r c2157r = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new C2157r(this, displayManager);
        this.f9328b = c2157r;
        this.f9329c = c2157r != null ? ChoreographerFrameCallbackC2158s.f9322k : null;
        this.f9337k = -9223372036854775807L;
        this.f9338l = -9223372036854775807L;
        this.f9332f = -1.0f;
        this.f9335i = 1.0f;
        this.f9336j = 0;
    }

    /* JADX INFO: renamed from: a */
    public static void m4752a(C2159t c2159t, Display display) {
        c2159t.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            c2159t.f9337k = refreshRate;
            c2159t.f9338l = (refreshRate * 80) / 100;
        } else {
            AbstractC0646n.m1647y("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            c2159t.f9337k = -9223372036854775807L;
            c2159t.f9338l = -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4753b() {
        Surface surface;
        if (AbstractC0632A.f2454a < 30 || (surface = this.f9331e) == null || this.f9336j == Integer.MIN_VALUE || this.f9334h == 0.0f) {
            return;
        }
        this.f9334h = 0.0f;
        try {
            surface.setFrameRate(0.0f, 0);
        } catch (IllegalStateException e3) {
            AbstractC0646n.m1636n("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0072  */
    /* JADX INFO: renamed from: c */
    public final void m4754c() {
        float f;
        float f3;
        if (AbstractC0632A.f2454a < 30 || this.f9331e == null) {
            return;
        }
        C2141b c2141b = this.f9327a;
        if (!c2141b.f9212a.m4712a()) {
            f = this.f9332f;
        } else if (c2141b.f9212a.m4712a()) {
            C2140a c2140a = c2141b.f9212a;
            long j3 = c2140a.f9208e;
            f = (float) (1.0E9d / (j3 != 0 ? c2140a.f9209f / j3 : 0L));
        } else {
            f = -1.0f;
        }
        float f4 = this.f9333g;
        if (f == f4) {
            return;
        }
        if (f != -1.0f && f4 != -1.0f) {
            if (c2141b.f9212a.m4712a()) {
                if ((c2141b.f9212a.m4712a() ? c2141b.f9212a.f9209f : -9223372036854775807L) >= 5000000000L) {
                    f3 = 0.02f;
                } else {
                    f3 = 1.0f;
                }
            } else {
                f3 = 1.0f;
            }
            if (Math.abs(f - this.f9333g) < f3) {
                return;
            }
        } else if (f == -1.0f && c2141b.f9216e < 30) {
            return;
        }
        this.f9333g = f;
        m4755d(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023  */
    /* JADX INFO: renamed from: d */
    public final void m4755d(boolean z3) {
        Surface surface;
        float f;
        if (AbstractC0632A.f2454a < 30 || (surface = this.f9331e) == null || this.f9336j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f9330d) {
            float f3 = this.f9333g;
            if (f3 != -1.0f) {
                f = f3 * this.f9335i;
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        if (z3 || this.f9334h != f) {
            this.f9334h = f;
            try {
                surface.setFrameRate(f, f == 0.0f ? 0 : 1);
            } catch (IllegalStateException e3) {
                AbstractC0646n.m1636n("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e3);
            }
        }
    }
}

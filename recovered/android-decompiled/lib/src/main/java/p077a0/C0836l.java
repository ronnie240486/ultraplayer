package p077a0;

import java.util.HashMap;
import java.util.Iterator;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p129o0.C2065e;

/* JADX INFO: renamed from: a0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0836l {

    /* JADX INFO: renamed from: a */
    public final C2065e f3548a;

    /* JADX INFO: renamed from: b */
    public final long f3549b;

    /* JADX INFO: renamed from: c */
    public final long f3550c;

    /* JADX INFO: renamed from: d */
    public final long f3551d;

    /* JADX INFO: renamed from: e */
    public final long f3552e;

    /* JADX INFO: renamed from: f */
    public final int f3553f;

    /* JADX INFO: renamed from: g */
    public final long f3554g;

    /* JADX INFO: renamed from: h */
    public final HashMap f3555h;

    /* JADX INFO: renamed from: i */
    public long f3556i;

    public C0836l() {
        C2065e c2065e = new C2065e();
        m2106a(2500, 0, "bufferForPlaybackMs", "0");
        m2106a(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m2106a(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        m2106a(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m2106a(50000, 50000, "maxBufferMs", "minBufferMs");
        m2106a(0, 0, "backBufferDurationMs", "0");
        this.f3548a = c2065e;
        long j3 = 50000;
        this.f3549b = AbstractC0632A.m1571L(j3);
        this.f3550c = AbstractC0632A.m1571L(j3);
        this.f3551d = AbstractC0632A.m1571L(2500);
        this.f3552e = AbstractC0632A.m1571L(5000);
        this.f3553f = -1;
        this.f3554g = AbstractC0632A.m1571L(0);
        this.f3555h = new HashMap();
        this.f3556i = -1L;
    }

    /* JADX INFO: renamed from: a */
    public static void m2106a(int i3, int i4, String str, String str2) {
        AbstractC0646n.m1624b(str + " cannot be less than " + str2, i3 >= i4);
    }

    /* JADX INFO: renamed from: b */
    public final int m2107b() {
        Iterator it = this.f3555h.values().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            i3 += ((C0835k) it.next()).f3547b;
        }
        return i3;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2108c(C0798I c0798i) {
        int i3;
        C0835k c0835k = (C0835k) this.f3555h.get(c0798i.f3329a);
        c0835k.getClass();
        C2065e c2065e = this.f3548a;
        synchronized (c2065e) {
            i3 = c2065e.f8967d * c2065e.f8965b;
        }
        boolean z3 = i3 >= m2107b();
        long j3 = this.f3550c;
        long jMin = this.f3549b;
        float f = c0798i.f3331c;
        if (f > 1.0f) {
            jMin = Math.min(AbstractC0632A.m1604w(jMin, f), j3);
        }
        long jMax = Math.max(jMin, 500000L);
        long j4 = c0798i.f3330b;
        if (j4 < jMax) {
            c0835k.f3546a = !z3;
            if (z3 && j4 < 500000) {
                AbstractC0646n.m1647y("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j4 >= j3 || z3) {
            c0835k.f3546a = false;
        }
        return c0835k.f3546a;
    }

    /* JADX INFO: renamed from: d */
    public final void m2109d() {
        if (!this.f3555h.isEmpty()) {
            this.f3548a.m4629a(m2107b());
            return;
        }
        C2065e c2065e = this.f3548a;
        synchronized (c2065e) {
            if (c2065e.f8964a) {
                c2065e.m4629a(0);
            }
        }
    }
}

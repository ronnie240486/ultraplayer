package p137q0;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.SystemClock;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0653u;
import p077a0.C0829h;
import p114k0.InterfaceC1931Z;

/* JADX INFO: renamed from: q0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C2156q {

    /* JADX INFO: renamed from: a */
    public final C2144e f9309a;

    /* JADX INFO: renamed from: b */
    public final C2159t f9310b;

    /* JADX INFO: renamed from: c */
    public boolean f9311c;

    /* JADX INFO: renamed from: f */
    public long f9314f;

    /* JADX INFO: renamed from: i */
    public boolean f9317i;

    /* JADX INFO: renamed from: d */
    public int f9312d = 0;

    /* JADX INFO: renamed from: e */
    public long f9313e = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public long f9315g = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f9316h = -9223372036854775807L;

    /* JADX INFO: renamed from: j */
    public float f9318j = 1.0f;

    /* JADX INFO: renamed from: k */
    public C0653u f9319k = C0653u.f2526a;

    public C2156q(Context context, C2144e c2144e) {
        this.f9309a = c2144e;
        this.f9310b = new C2159t(context);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0218  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ec  */
    /* JADX INFO: renamed from: a */
    public final int m4744a(long j3, long j4, long j5, long j6, boolean z3, C2155p c2155p) {
        long j7;
        long j8;
        boolean z4;
        int i3;
        int i4;
        int i5;
        boolean z5;
        long j9;
        long j10;
        boolean z6;
        int i6;
        c2155p.f9307a = -9223372036854775807L;
        c2155p.f9308b = -9223372036854775807L;
        if (this.f9313e == -9223372036854775807L) {
            this.f9313e = j4;
        }
        if (this.f9315g != j3) {
            C2159t c2159t = this.f9310b;
            j7 = 1000;
            long j11 = c2159t.f9340n;
            if (j11 != -1) {
                c2159t.f9342p = j11;
                c2159t.f9343q = c2159t.f9341o;
            }
            c2159t.f9339m++;
            long j12 = j3 * 1000;
            C2141b c2141b = c2159t.f9327a;
            c2141b.f9212a.m4713b(j12);
            if (c2141b.f9212a.m4712a()) {
                c2141b.f9214c = false;
            } else {
                if (c2141b.f9215d != -9223372036854775807L) {
                    if (c2141b.f9214c) {
                        C2140a c2140a = c2141b.f9213b;
                        j8 = 0;
                        long j13 = c2140a.f9207d;
                        if (j13 == 0) {
                            z6 = false;
                        } else {
                            z6 = c2140a.f9210g[(int) ((j13 - 1) % 15)];
                        }
                        if (z6) {
                        }
                        c2141b.f9214c = true;
                        c2141b.f9213b.m4713b(j12);
                    } else {
                        j8 = 0;
                    }
                    c2141b.f9213b.m4714c();
                    c2141b.f9213b.m4713b(c2141b.f9215d);
                    c2141b.f9214c = true;
                    c2141b.f9213b.m4713b(j12);
                }
                if (c2141b.f9214c && c2141b.f9213b.m4712a()) {
                    C2140a c2140a2 = c2141b.f9212a;
                    c2141b.f9212a = c2141b.f9213b;
                    c2141b.f9213b = c2140a2;
                    c2141b.f9214c = false;
                }
                c2141b.f9215d = j12;
                if (c2141b.f9212a.m4712a()) {
                    i6 = 0;
                } else {
                    i6 = c2141b.f9216e + 1;
                }
                c2141b.f9216e = i6;
                c2159t.m4754c();
                this.f9315g = j3;
            }
            j8 = 0;
            if (c2141b.f9214c) {
                C2140a c2140a3 = c2141b.f9212a;
                c2141b.f9212a = c2141b.f9213b;
                c2141b.f9213b = c2140a3;
                c2141b.f9214c = false;
            }
            c2141b.f9215d = j12;
            if (c2141b.f9212a.m4712a()) {
                i6 = 0;
            } else {
                i6 = c2141b.f9216e + 1;
            }
            c2141b.f9216e = i6;
            c2159t.m4754c();
            this.f9315g = j3;
        } else {
            j7 = 1000;
            j8 = 0;
        }
        long jM1571L = (long) ((j3 - j4) / ((double) this.f9318j));
        if (this.f9311c) {
            this.f9319k.getClass();
            jM1571L -= AbstractC0632A.m1571L(SystemClock.elapsedRealtime()) - j5;
        }
        c2155p.f9307a = jM1571L;
        if (this.f9316h == -9223372036854775807L || this.f9317i) {
            int i7 = this.f9312d;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            throw new IllegalStateException();
                        }
                        this.f9319k.getClass();
                        long jM1571L2 = AbstractC0632A.m1571L(SystemClock.elapsedRealtime()) - this.f9314f;
                        if (!this.f9311c || jM1571L >= -30000 || jM1571L2 <= 100000) {
                            z4 = false;
                        }
                    } else if (j4 < j6) {
                        z4 = false;
                    }
                }
                z4 = true;
            } else {
                z4 = this.f9311c;
            }
        } else {
            z4 = false;
        }
        if (z4) {
            return 0;
        }
        if (!this.f9311c || j4 == this.f9313e) {
            return 5;
        }
        this.f9319k.getClass();
        long jNanoTime = System.nanoTime();
        C2159t c2159t2 = this.f9310b;
        long j14 = c2155p.f9307a;
        Long.signum(j14);
        long j15 = (j14 * j7) + jNanoTime;
        if (c2159t2.f9342p == r10 || !c2159t2.f9327a.f9212a.m4712a()) {
            i3 = 3;
            i4 = 2;
            i5 = 1;
        } else {
            C2141b c2141b2 = c2159t2.f9327a;
            if (c2141b2.f9212a.m4712a()) {
                C2140a c2140a4 = c2141b2.f9212a;
                long j16 = c2140a4.f9208e;
                if (j16 == j8) {
                    j10 = j8;
                    i3 = 3;
                    i4 = 2;
                } else {
                    i3 = 3;
                    i4 = 2;
                    j10 = c2140a4.f9209f / j16;
                }
            } else {
                i3 = 3;
                i4 = 2;
                j10 = -9223372036854775807L;
            }
            i5 = 1;
            long j17 = c2159t2.f9343q + ((long) (((c2159t2.f9339m - c2159t2.f9342p) * j10) / c2159t2.f9335i));
            if (Math.abs(j15 - j17) <= 20000000) {
                j15 = j17;
            } else {
                c2159t2.f9339m = j8;
                c2159t2.f9342p = -1L;
                c2159t2.f9340n = -1L;
            }
        }
        c2159t2.f9340n = c2159t2.f9339m;
        c2159t2.f9341o = j15;
        ChoreographerFrameCallbackC2158s choreographerFrameCallbackC2158s = c2159t2.f9329c;
        if (choreographerFrameCallbackC2158s != null && c2159t2.f9337k != -9223372036854775807L) {
            long j18 = choreographerFrameCallbackC2158s.f9323g;
            if (j18 != -9223372036854775807L) {
                long j19 = c2159t2.f9337k;
                long j20 = (((j15 - j18) / j19) * j19) + j18;
                if (j15 <= j20) {
                    j9 = j20 - j19;
                } else {
                    j9 = j20;
                    j20 = j19 + j20;
                }
                if (j20 - j15 >= j15 - j9) {
                    j20 = j9;
                }
                j15 = j20 - c2159t2.f9338l;
            }
        }
        c2155p.f9308b = j15;
        long j21 = (j15 - jNanoTime) / j7;
        c2155p.f9307a = j21;
        boolean z7 = (this.f9316h == -9223372036854775807L || this.f9317i) ? false : true;
        C2144e c2144e = this.f9309a;
        if (j21 >= -500000 || z3) {
            z5 = false;
        } else {
            InterfaceC1931Z interfaceC1931Z = c2144e.f3485o;
            interfaceC1931Z.getClass();
            int iMo3789v = interfaceC1931Z.mo3789v(j4 - c2144e.f3487q);
            if (iMo3789v == 0) {
                z5 = false;
            } else {
                if (z7) {
                    C0829h c0829h = c2144e.f7278D0;
                    c0829h.f3507d += iMo3789v;
                    c0829h.f3509f += c2144e.f9244e1;
                } else {
                    c2144e.f7278D0.f3513j++;
                    c2144e.m4725F0(iMo3789v, c2144e.f9244e1);
                }
                if (c2144e.m3951J()) {
                    c2144e.m3957T();
                }
                C2149j c2149j = c2144e.f9232S0;
                if (c2149j != null) {
                    c2149j.m4731a(false);
                }
                z5 = true;
            }
        }
        if (z5) {
            return 4;
        }
        long j22 = c2155p.f9307a;
        if (j22 < -30000 && !z3) {
            return z7 ? i3 : i4;
        }
        if (j22 > 50000) {
            return 5;
        }
        return i5;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4745b(boolean z3) {
        if (z3 && this.f9312d == 3) {
            this.f9316h = -9223372036854775807L;
            return true;
        }
        if (this.f9316h == -9223372036854775807L) {
            return false;
        }
        this.f9319k.getClass();
        if (SystemClock.elapsedRealtime() < this.f9316h) {
            return true;
        }
        this.f9316h = -9223372036854775807L;
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final void m4746c(boolean z3) {
        this.f9317i = z3;
        this.f9319k.getClass();
        this.f9316h = SystemClock.elapsedRealtime() + 5000;
    }

    /* JADX INFO: renamed from: d */
    public final void m4747d(int i3) {
        this.f9312d = Math.min(this.f9312d, i3);
    }

    /* JADX INFO: renamed from: e */
    public final void m4748e() {
        this.f9311c = true;
        this.f9319k.getClass();
        this.f9314f = AbstractC0632A.m1571L(SystemClock.elapsedRealtime());
        C2159t c2159t = this.f9310b;
        c2159t.f9330d = true;
        c2159t.f9339m = 0L;
        c2159t.f9342p = -1L;
        c2159t.f9340n = -1L;
        C2157r c2157r = c2159t.f9328b;
        if (c2157r != null) {
            ChoreographerFrameCallbackC2158s choreographerFrameCallbackC2158s = c2159t.f9329c;
            choreographerFrameCallbackC2158s.getClass();
            choreographerFrameCallbackC2158s.f9324h.sendEmptyMessage(2);
            Handler handlerM1594m = AbstractC0632A.m1594m(null);
            DisplayManager displayManager = c2157r.f9320a;
            displayManager.registerDisplayListener(c2157r, handlerM1594m);
            C2159t.m4752a(c2157r.f9321b, displayManager.getDisplay(0));
        }
        c2159t.m4755d(false);
    }

    /* JADX INFO: renamed from: f */
    public final void m4749f() {
        this.f9311c = false;
        this.f9316h = -9223372036854775807L;
        C2159t c2159t = this.f9310b;
        c2159t.f9330d = false;
        C2157r c2157r = c2159t.f9328b;
        if (c2157r != null) {
            c2157r.f9320a.unregisterDisplayListener(c2157r);
            ChoreographerFrameCallbackC2158s choreographerFrameCallbackC2158s = c2159t.f9329c;
            choreographerFrameCallbackC2158s.getClass();
            choreographerFrameCallbackC2158s.f9324h.sendEmptyMessage(3);
        }
        c2159t.m4753b();
    }

    /* JADX INFO: renamed from: g */
    public final void m4750g(float f) {
        C2159t c2159t = this.f9310b;
        c2159t.f9332f = f;
        C2141b c2141b = c2159t.f9327a;
        c2141b.f9212a.m4714c();
        c2141b.f9213b.m4714c();
        c2141b.f9214c = false;
        c2141b.f9215d = -9223372036854775807L;
        c2141b.f9216e = 0;
        c2159t.m4754c();
    }

    /* JADX INFO: renamed from: h */
    public final void m4751h(float f) {
        AbstractC0646n.m1625c(f > 0.0f);
        if (f == this.f9318j) {
            return;
        }
        this.f9318j = f;
        C2159t c2159t = this.f9310b;
        c2159t.f9335i = f;
        c2159t.f9339m = 0L;
        c2159t.f9342p = -1L;
        c2159t.f9340n = -1L;
        c2159t.m4755d(false);
    }
}

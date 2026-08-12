package p085c0;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.C0858A;
import android.util.Pair;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.cast.AbstractC1303m;
import com.zuxoplayer.app.PlayerActivity;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p000A.C0031d;
import p003B.AbstractC0081c;
import p009D0.C0106b;
import p011E.C0111d;
import p036M0.C0367d;
import p040N1.C0437r;
import p045P0.AbstractC0462h;
import p048Q0.C0508g;
import p052S.C0529e;
import p055T.AbstractC0545H;
import p055T.C0548K;
import p055T.C0567c;
import p055T.C0569d;
import p055T.C0583o;
import p058U.C0601a;
import p058U.C0602b;
import p058U.C0603c;
import p058U.C0607g;
import p058U.C0608h;
import p058U.InterfaceC0604d;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.ThreadFactoryC0657y;
import p077a0.C0792C;
import p077a0.C0793D;
import p077a0.RunnableC0810V;
import p082b0.C1070k;
import p082b0.C1071l;
import p105h2.AbstractC1676G;
import p105h2.AbstractC1723q;
import p105h2.C1673D;
import p105h2.C1674E;
import p105h2.C1692X;
import p112j2.AbstractC1790c;
import p145s0.AbstractC2229b;

/* JADX INFO: renamed from: c0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1150z {

    /* JADX INFO: renamed from: j0 */
    public static final Object f5339j0 = new Object();

    /* JADX INFO: renamed from: k0 */
    public static ScheduledExecutorService f5340k0;

    /* JADX INFO: renamed from: l0 */
    public static int f5341l0;

    /* JADX INFO: renamed from: A */
    public C1145u f5342A;

    /* JADX INFO: renamed from: B */
    public C1145u f5343B;

    /* JADX INFO: renamed from: C */
    public C0548K f5344C;

    /* JADX INFO: renamed from: D */
    public boolean f5345D;

    /* JADX INFO: renamed from: E */
    public ByteBuffer f5346E;

    /* JADX INFO: renamed from: F */
    public int f5347F;

    /* JADX INFO: renamed from: G */
    public long f5348G;

    /* JADX INFO: renamed from: H */
    public long f5349H;

    /* JADX INFO: renamed from: I */
    public long f5350I;

    /* JADX INFO: renamed from: J */
    public long f5351J;

    /* JADX INFO: renamed from: K */
    public int f5352K;

    /* JADX INFO: renamed from: L */
    public boolean f5353L;

    /* JADX INFO: renamed from: M */
    public boolean f5354M;

    /* JADX INFO: renamed from: N */
    public long f5355N;

    /* JADX INFO: renamed from: O */
    public float f5356O;

    /* JADX INFO: renamed from: P */
    public ByteBuffer f5357P;

    /* JADX INFO: renamed from: Q */
    public int f5358Q;

    /* JADX INFO: renamed from: R */
    public ByteBuffer f5359R;

    /* JADX INFO: renamed from: S */
    public boolean f5360S;

    /* JADX INFO: renamed from: T */
    public boolean f5361T;

    /* JADX INFO: renamed from: U */
    public boolean f5362U;

    /* JADX INFO: renamed from: V */
    public boolean f5363V;

    /* JADX INFO: renamed from: W */
    public boolean f5364W;

    /* JADX INFO: renamed from: X */
    public int f5365X;

    /* JADX INFO: renamed from: Y */
    public C0569d f5366Y;

    /* JADX INFO: renamed from: Z */
    public C0031d f5367Z;

    /* JADX INFO: renamed from: a */
    public final PlayerActivity f5368a;

    /* JADX INFO: renamed from: a0 */
    public boolean f5369a0;

    /* JADX INFO: renamed from: b */
    public final C0858A f5370b;

    /* JADX INFO: renamed from: b0 */
    public long f5371b0;

    /* JADX INFO: renamed from: c */
    public final C1142r f5372c;

    /* JADX INFO: renamed from: c0 */
    public long f5373c0;

    /* JADX INFO: renamed from: d */
    public final C1124F f5374d;

    /* JADX INFO: renamed from: d0 */
    public boolean f5375d0;

    /* JADX INFO: renamed from: e */
    public final C1692X f5376e;

    /* JADX INFO: renamed from: e0 */
    public boolean f5377e0;

    /* JADX INFO: renamed from: f */
    public final C1692X f5378f;

    /* JADX INFO: renamed from: f0 */
    public Looper f5379f0;

    /* JADX INFO: renamed from: g */
    public final C1141q f5380g;

    /* JADX INFO: renamed from: g0 */
    public long f5381g0;

    /* JADX INFO: renamed from: h */
    public final ArrayDeque f5382h;

    /* JADX INFO: renamed from: h0 */
    public long f5383h0;

    /* JADX INFO: renamed from: i */
    public final boolean f5384i;

    /* JADX INFO: renamed from: i0 */
    public Handler f5385i0;

    /* JADX INFO: renamed from: j */
    public int f5386j;

    /* JADX INFO: renamed from: k */
    public C0858A f5387k;

    /* JADX INFO: renamed from: l */
    public final C1147w f5388l;

    /* JADX INFO: renamed from: m */
    public final C1147w f5389m;

    /* JADX INFO: renamed from: n */
    public final C1119A f5390n;

    /* JADX INFO: renamed from: o */
    public final C0106b f5391o;

    /* JADX INFO: renamed from: p */
    public final C1119A f5392p;

    /* JADX INFO: renamed from: q */
    public C1071l f5393q;

    /* JADX INFO: renamed from: r */
    public C0031d f5394r;

    /* JADX INFO: renamed from: s */
    public C1144t f5395s;

    /* JADX INFO: renamed from: t */
    public C1144t f5396t;

    /* JADX INFO: renamed from: u */
    public C0601a f5397u;

    /* JADX INFO: renamed from: v */
    public AudioTrack f5398v;

    /* JADX INFO: renamed from: w */
    public C1126b f5399w;

    /* JADX INFO: renamed from: x */
    public C1129e f5400x;

    /* JADX INFO: renamed from: y */
    public C0858A f5401y;

    /* JADX INFO: renamed from: z */
    public C0567c f5402z;

    public C1150z(C0437r c0437r) {
        PlayerActivity playerActivity = (PlayerActivity) c0437r.f1484b;
        this.f5368a = playerActivity;
        C0567c c0567c = C0567c.f2052b;
        this.f5402z = c0567c;
        C1126b c1126b = C1126b.f5224c;
        int i3 = AbstractC0632A.f2454a;
        this.f5399w = C1126b.m3005b(playerActivity, c0567c, null);
        this.f5370b = (C0858A) c0437r.f1485c;
        int i4 = AbstractC0632A.f2454a;
        this.f5384i = false;
        this.f5386j = 0;
        this.f5390n = (C1119A) c0437r.f1486d;
        C0106b c0106b = (C0106b) c0437r.f1488f;
        c0106b.getClass();
        this.f5391o = c0106b;
        this.f5380g = new C1141q(new C0031d(28, this));
        C1142r c1142r = new C1142r();
        this.f5372c = c1142r;
        C1124F c1124f = new C1124F();
        c1124f.f5217m = AbstractC0632A.f2459f;
        this.f5374d = c1124f;
        C0608h c0608h = new C0608h();
        C1674E c1674e = AbstractC1676G.f7601h;
        Object[] objArr = {c0608h, c1142r, c1124f};
        AbstractC1723q.m4152a(3, objArr);
        this.f5376e = AbstractC1676G.m4115l(3, objArr);
        this.f5378f = AbstractC1676G.m4120r(new C1123E());
        this.f5356O = 1.0f;
        this.f5365X = 0;
        this.f5366Y = new C0569d();
        C0548K c0548k = C0548K.f1948d;
        this.f5343B = new C1145u(c0548k, 0L, 0L);
        this.f5344C = c0548k;
        this.f5345D = false;
        this.f5382h = new ArrayDeque();
        this.f5388l = new C1147w();
        this.f5389m = new C1147w();
        this.f5392p = (C1119A) c0437r.f1487e;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m3045p(AudioTrack audioTrack) {
        return AbstractC0632A.f2454a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    /* JADX INFO: renamed from: a */
    public final void m3046a(long j3) {
        C0548K c0548k;
        boolean z3;
        boolean zM3068x = m3068x();
        C0858A c0858a = this.f5370b;
        if (zM3068x) {
            c0548k = C0548K.f1948d;
        } else {
            if (this.f5369a0) {
                c0548k = C0548K.f1948d;
            } else {
                C1144t c1144t = this.f5396t;
                if (c1144t.f5318c == 0) {
                    int i3 = c1144t.f5316a.f2132E;
                    c0548k = this.f5344C;
                    c0858a.getClass();
                    float f = c0548k.f1949a;
                    C0607g c0607g = (C0607g) c0858a.f3641j;
                    if (c0607g.f2284c != f) {
                        c0607g.f2284c = f;
                        c0607g.f2290i = true;
                    }
                    float f3 = c0607g.f2285d;
                    float f4 = c0548k.f1950b;
                    if (f3 != f4) {
                        c0607g.f2285d = f4;
                        c0607g.f2290i = true;
                    }
                } else {
                    c0548k = C0548K.f1948d;
                }
            }
            this.f5344C = c0548k;
        }
        C0548K c0548k2 = c0548k;
        if (this.f5369a0) {
            z3 = false;
        } else {
            C1144t c1144t2 = this.f5396t;
            if (c1144t2.f5318c == 0) {
                int i4 = c1144t2.f5316a.f2132E;
                z3 = this.f5345D;
                ((C1122D) c0858a.f3640i).f5204o = z3;
            } else {
                z3 = false;
            }
        }
        this.f5345D = z3;
        ArrayDeque arrayDeque = this.f5382h;
        long jMax = Math.max(0L, j3);
        C1144t c1144t3 = this.f5396t;
        arrayDeque.add(new C1145u(c0548k2, jMax, AbstractC0632A.m1575P(c1144t3.f5320e, m3056k())));
        C0601a c0601a = this.f5396t.f5324i;
        this.f5397u = c0601a;
        c0601a.m1466b();
        C0031d c0031d = this.f5394r;
        if (c0031d != null) {
            final boolean z4 = this.f5345D;
            final C1133i c1133i = ((C1120B) c0031d.f38h).f5180J0;
            Handler handler = c1133i.f5252b;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c0.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1133i c1133i2 = c1133i;
                        c1133i2.getClass();
                        int i5 = AbstractC0632A.f2454a;
                        C0792C c0792c = c1133i2.f5253c.f3610g;
                        boolean z5 = c0792c.f3230X;
                        boolean z6 = z4;
                        if (z5 == z6) {
                            return;
                        }
                        c0792c.f3230X = z6;
                        c0792c.f3251l.m1621f(23, new C0529e(2, z6));
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final AudioTrack m3047b(C1134j c1134j, C0567c c0567c, int i3, C0583o c0583o) throws C1136l {
        try {
            try {
                AudioTrack audioTrackM2979a = this.f5392p.m2979a(c1134j, c0567c, i3);
                int state = audioTrackM2979a.getState();
                if (state == 1) {
                    return audioTrackM2979a;
                }
                try {
                    audioTrackM2979a.release();
                } catch (Exception unused) {
                }
                throw new C1136l(state, c1134j.f5256c, c1134j.f5258e, c1134j.f5255b, c0583o, c1134j.f5257d, null);
            } catch (IllegalArgumentException e3) {
                e = e3;
                RuntimeException runtimeException = e;
                throw new C1136l(0, c1134j.f5256c, c1134j.f5258e, c1134j.f5255b, c0583o, c1134j.f5257d, runtimeException);
            } catch (UnsupportedOperationException e4) {
                e = e4;
                RuntimeException runtimeException2 = e;
                throw new C1136l(0, c1134j.f5256c, c1134j.f5258e, c1134j.f5255b, c0583o, c1134j.f5257d, runtimeException2);
            }
        } catch (IllegalArgumentException e5) {
            e = e5;
        } catch (UnsupportedOperationException e6) {
            e = e6;
        }
    }

    /* JADX INFO: renamed from: c */
    public final AudioTrack m3048c(C1144t c1144t) throws C1136l {
        try {
            return m3047b(c1144t.m3043a(), this.f5402z, this.f5365X, c1144t.f5316a);
        } catch (C1136l e3) {
            C0031d c0031d = this.f5394r;
            if (c0031d != null) {
                c0031d.m177y(e3);
            }
            throw e3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:71:0x0182  */
    /* JADX INFO: renamed from: d */
    public final void m3049d(C0583o c0583o, int[] iArr) {
        int iIntValue;
        C0601a c0601a;
        int i3;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        int i7;
        int iM1590i;
        int iM2978c;
        m3061q();
        boolean zEquals = "audio/raw".equals(c0583o.f2154n);
        boolean z5 = this.f5384i;
        String str = c0583o.f2154n;
        int i8 = c0583o.f2131D;
        int i9 = c0583o.f2130C;
        if (zEquals) {
            int i10 = c0583o.f2132E;
            AbstractC0646n.m1625c(AbstractC0632A.m1567H(i10));
            int iM1606y = AbstractC0632A.m1606y(i10, i9);
            C1673D c1673d = new C1673D(4);
            c1673d.m4104c(this.f5376e);
            InterfaceC0604d[] interfaceC0604dArr = (InterfaceC0604d[]) this.f5370b.f3639h;
            int length = interfaceC0604dArr.length;
            AbstractC1723q.m4152a(length, interfaceC0604dArr);
            c1673d.m4105d(length);
            System.arraycopy(interfaceC0604dArr, 0, c1673d.f7589a, c1673d.f7590b, length);
            c1673d.f7590b += length;
            C0601a c0601a2 = new C0601a(c1673d.m4112f());
            if (c0601a2.equals(this.f5397u)) {
                c0601a2 = this.f5397u;
            }
            int i11 = c0583o.f2133F;
            C1124F c1124f = this.f5374d;
            c1124f.f5213i = i11;
            c1124f.f5214j = c0583o.f2134G;
            this.f5372c.f5314i = iArr;
            try {
                C0602b c0602bM1465a = c0601a2.m1465a(new C0602b(i8, i9, i10));
                int i12 = c0602bM1465a.f2249b;
                iIntValue = AbstractC0632A.m1598q(i12);
                int i13 = c0602bM1465a.f2250c;
                int iM1606y2 = AbstractC0632A.m1606y(i13, i12);
                i8 = c0602bM1465a.f2248a;
                i4 = iM1606y2;
                c0601a = c0601a2;
                i3 = i13;
                z4 = z5;
                i6 = iM1606y;
                z3 = false;
                i5 = 0;
            } catch (C0603c e3) {
                throw new C1135k(e3, c0583o);
            }
        } else {
            C0601a c0601a3 = new C0601a(C1692X.f7629k);
            C1130f c1130fM3053h = this.f5386j != 0 ? m3053h(c0583o) : C1130f.f5243d;
            if (this.f5386j == 0 || !c1130fM3053h.f5244a) {
                Pair pairM3007d = this.f5399w.m3007d(this.f5402z, c0583o);
                if (pairM3007d == null) {
                    throw new C1135k("Unable to configure passthrough for: " + c0583o, c0583o);
                }
                int iIntValue2 = ((Integer) pairM3007d.first).intValue();
                iIntValue = ((Integer) pairM3007d.second).intValue();
                c0601a = c0601a3;
                i3 = iIntValue2;
                i4 = -1;
                z3 = false;
                i5 = 2;
                z4 = z5;
                i6 = -1;
            } else {
                str.getClass();
                int iM1354b = AbstractC0545H.m1354b(str, c0583o.f2151k);
                iIntValue = AbstractC0632A.m1598q(i9);
                z3 = c1130fM3053h.f5245b;
                c0601a = c0601a3;
                i3 = iM1354b;
                i4 = -1;
                i6 = -1;
                z4 = true;
                i5 = 1;
            }
        }
        if (i3 == 0) {
            throw new C1135k("Invalid output encoding (mode=" + i5 + ") for: " + c0583o, c0583o);
        }
        if (iIntValue == 0) {
            throw new C1135k("Invalid output channel config (mode=" + i5 + ") for: " + c0583o, c0583o);
        }
        boolean zEquals2 = "audio/vnd.dts.hd;profile=lbr".equals(str);
        int i14 = c0583o.f2150j;
        if (zEquals2 && i14 == -1) {
            i14 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i8, iIntValue, i3);
        AbstractC0646n.m1630h(minBufferSize != -2);
        int i15 = i4 != -1 ? i4 : 1;
        double d3 = z4 ? 8.0d : 1.0d;
        this.f5390n.getClass();
        if (i5 == 0) {
            i7 = i3;
            long j3 = i8;
            long j4 = ((long) 250000) * j3;
            long j5 = i15;
            iM1590i = AbstractC0632A.m1590i(minBufferSize * 4, AbstractC1303m.m3312e((j4 * j5) / 1000000), AbstractC1303m.m3312e(((((long) 750000) * j3) * j5) / 1000000));
        } else if (i5 == 1) {
            i7 = i3;
            iM1590i = AbstractC1303m.m3312e((((long) 50000000) * ((long) C1119A.m2978c(i7))) / 1000000);
        } else {
            if (i5 != 2) {
                throw new IllegalArgumentException();
            }
            int i16 = i3 == 5 ? 500000 : i3 == 8 ? 1000000 : 250000;
            if (i14 != -1) {
                RoundingMode roundingMode = RoundingMode.CEILING;
                roundingMode.getClass();
                iM2978c = i14 / 8;
                int i17 = i14 - (8 * iM2978c);
                if (i17 != 0) {
                    int i18 = ((i14 ^ 8) >> 31) | 1;
                    switch (AbstractC1790c.f7981a[roundingMode.ordinal()]) {
                        case 1:
                            if (i17 != 0) {
                                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                            }
                            break;
                        case 2:
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            if (i18 < 0) {
                                iM2978c += i18;
                            }
                            break;
                        case 4:
                            iM2978c += i18;
                            break;
                        case 5:
                            if (i18 > 0) {
                                iM2978c += i18;
                            }
                            break;
                        case 6:
                        case 7:
                        case 8:
                            int iAbs = Math.abs(i17);
                            int iAbs2 = iAbs - (Math.abs(8) - iAbs);
                            if (iAbs2 == 0) {
                                RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                                RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                            } else if (iAbs2 > 0) {
                                iM2978c += i18;
                            }
                            break;
                        default:
                            throw new AssertionError();
                    }
                }
            } else {
                iM2978c = C1119A.m2978c(i3);
            }
            i7 = i3;
            iM1590i = AbstractC1303m.m3312e((((long) i16) * ((long) iM2978c)) / 1000000);
        }
        int iMax = (((Math.max(minBufferSize, (int) (((double) iM1590i) * d3)) + i15) - 1) / i15) * i15;
        this.f5375d0 = false;
        C1144t c1144t = new C1144t(c0583o, i6, i5, i4, i8, iIntValue, i7, iMax, c0601a, z4, z3, this.f5369a0);
        if (m3060o()) {
            this.f5395s = c1144t;
        } else {
            this.f5396t = c1144t;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b5  */
    /* JADX INFO: renamed from: e */
    public final void m3050e(long j3) throws C1138n {
        int iWrite;
        C0031d c0031d;
        C0793D c0793d;
        boolean z3;
        if (this.f5359R == null) {
            return;
        }
        C1147w c1147w = this.f5389m;
        boolean z4 = false;
        if (c1147w.f5333a != null) {
            synchronized (f5339j0) {
                z3 = f5341l0 > 0;
            }
            if (z3 || SystemClock.elapsedRealtime() < c1147w.f5335c) {
                return;
            }
        }
        int iRemaining = this.f5359R.remaining();
        if (this.f5369a0) {
            AbstractC0646n.m1630h(j3 != -9223372036854775807L);
            if (j3 == Long.MIN_VALUE) {
                j3 = this.f5371b0;
            } else {
                this.f5371b0 = j3;
            }
            AudioTrack audioTrack = this.f5398v;
            ByteBuffer byteBuffer = this.f5359R;
            if (AbstractC0632A.f2454a >= 26) {
                iWrite = audioTrack.write(byteBuffer, iRemaining, 1, j3 * 1000);
            } else {
                if (this.f5346E == null) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                    this.f5346E = byteBufferAllocate;
                    byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                    this.f5346E.putInt(1431633921);
                }
                if (this.f5347F == 0) {
                    this.f5346E.putInt(4, iRemaining);
                    this.f5346E.putLong(8, j3 * 1000);
                    this.f5346E.position(0);
                    this.f5347F = iRemaining;
                }
                int iRemaining2 = this.f5346E.remaining();
                if (iRemaining2 <= 0) {
                    iWrite = audioTrack.write(byteBuffer, iRemaining, 1);
                    if (iWrite < 0) {
                        this.f5347F = 0;
                    } else {
                        this.f5347F -= iWrite;
                    }
                } else {
                    int iWrite2 = audioTrack.write(this.f5346E, iRemaining2, 1);
                    if (iWrite2 < 0) {
                        this.f5347F = 0;
                        iWrite = iWrite2;
                    } else if (iWrite2 < iRemaining2) {
                        iWrite = 0;
                    } else {
                        iWrite = audioTrack.write(byteBuffer, iRemaining, 1);
                        if (iWrite < 0) {
                            this.f5347F = 0;
                        } else {
                            this.f5347F -= iWrite;
                        }
                    }
                }
            }
        } else {
            iWrite = this.f5398v.write(this.f5359R, iRemaining, 1);
        }
        this.f5373c0 = SystemClock.elapsedRealtime();
        if (iWrite < 0) {
            if ((AbstractC0632A.f2454a >= 24 && iWrite == -6) || iWrite == -32) {
                if (m3056k() > 0) {
                    z4 = true;
                } else if (m3045p(this.f5398v)) {
                    if (this.f5396t.f5318c == 1) {
                        this.f5375d0 = true;
                    }
                    z4 = true;
                }
            }
            C1138n c1138n = new C1138n(iWrite, this.f5396t.f5316a, z4);
            C0031d c0031d2 = this.f5394r;
            if (c0031d2 != null) {
                c0031d2.m177y(c1138n);
            }
            if (c1138n.f5264h) {
                this.f5399w = C1126b.f5224c;
                throw c1138n;
            }
            c1147w.m3044a(c1138n);
            return;
        }
        c1147w.f5333a = null;
        c1147w.f5334b = -9223372036854775807L;
        c1147w.f5335c = -9223372036854775807L;
        if (m3045p(this.f5398v)) {
            if (this.f5351J > 0) {
                this.f5377e0 = false;
            }
            if (this.f5363V && (c0031d = this.f5394r) != null && iWrite < iRemaining && !this.f5377e0 && (c0793d = ((C1120B) c0031d.f38h).f7289L) != null) {
                c0793d.f3266a.f3298R = true;
            }
        }
        int i3 = this.f5396t.f5318c;
        if (i3 == 0) {
            this.f5350I += (long) iWrite;
        }
        if (iWrite == iRemaining) {
            if (i3 != 0) {
                AbstractC0646n.m1630h(this.f5359R == this.f5357P);
                this.f5351J = (((long) this.f5352K) * ((long) this.f5358Q)) + this.f5351J;
            }
            this.f5359R = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0044 A[RETURN] */
    /* JADX INFO: renamed from: f */
    public final boolean m3051f() throws C1138n {
        ByteBuffer byteBuffer;
        if (!this.f5397u.m1469e()) {
            m3050e(Long.MIN_VALUE);
            if (this.f5359R == null) {
                return true;
            }
            return false;
        }
        C0601a c0601a = this.f5397u;
        if (c0601a.m1469e() && !c0601a.f2246d) {
            c0601a.f2246d = true;
            ((InterfaceC0604d) c0601a.f2244b.get(0)).mo1473c();
        }
        m3064t(Long.MIN_VALUE);
        if (!this.f5397u.m1468d() || ((byteBuffer = this.f5359R) != null && byteBuffer.hasRemaining())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m3052g() {
        C0858A c0858a;
        if (m3060o()) {
            this.f5348G = 0L;
            this.f5349H = 0L;
            this.f5350I = 0L;
            this.f5351J = 0L;
            this.f5377e0 = false;
            this.f5352K = 0;
            this.f5343B = new C1145u(this.f5344C, 0L, 0L);
            this.f5355N = 0L;
            this.f5342A = null;
            this.f5382h.clear();
            this.f5357P = null;
            this.f5358Q = 0;
            this.f5359R = null;
            this.f5361T = false;
            this.f5360S = false;
            this.f5362U = false;
            this.f5346E = null;
            this.f5347F = 0;
            this.f5374d.f5219o = 0L;
            C0601a c0601a = this.f5396t.f5324i;
            this.f5397u = c0601a;
            c0601a.m1466b();
            AudioTrack audioTrack = this.f5380g.f5290c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f5398v.pause();
            }
            if (m3045p(this.f5398v)) {
                C0858A c0858a2 = this.f5387k;
                c0858a2.getClass();
                this.f5398v.unregisterStreamEventCallback((C1149y) c0858a2.f3640i);
                ((Handler) c0858a2.f3639h).removeCallbacksAndMessages(null);
            }
            C1134j c1134jM3043a = this.f5396t.m3043a();
            C1144t c1144t = this.f5395s;
            if (c1144t != null) {
                this.f5396t = c1144t;
                this.f5395s = null;
            }
            C1141q c1141q = this.f5380g;
            c1141q.m3019d();
            c1141q.f5290c = null;
            c1141q.f5292e = null;
            if (AbstractC0632A.f2454a >= 24 && (c0858a = this.f5401y) != null) {
                C1146v c1146v = (C1146v) c0858a.f3641j;
                c1146v.getClass();
                ((AudioTrack) c0858a.f3639h).removeOnRoutingChangedListener(c1146v);
                c0858a.f3641j = null;
                this.f5401y = null;
            }
            AudioTrack audioTrack2 = this.f5398v;
            C0031d c0031d = this.f5394r;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f5339j0) {
                try {
                    if (f5340k0 == null) {
                        f5340k0 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC0657y());
                    }
                    f5341l0++;
                    f5340k0.schedule(new RunnableC0810V(audioTrack2, c0031d, handler, c1134jM3043a, 3), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f5398v = null;
        }
        C1147w c1147w = this.f5389m;
        c1147w.f5333a = null;
        c1147w.f5334b = -9223372036854775807L;
        c1147w.f5335c = -9223372036854775807L;
        C1147w c1147w2 = this.f5388l;
        c1147w2.f5333a = null;
        c1147w2.f5334b = -9223372036854775807L;
        c1147w2.f5335c = -9223372036854775807L;
        this.f5381g0 = 0L;
        this.f5383h0 = 0L;
        Handler handler2 = this.f5385i0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: h */
    public final C1130f m3053h(C0583o c0583o) {
        int i3;
        boolean zBooleanValue;
        if (this.f5375d0) {
            return C1130f.f5243d;
        }
        C0567c c0567c = this.f5402z;
        C0106b c0106b = this.f5391o;
        c0106b.getClass();
        c0583o.getClass();
        c0567c.getClass();
        int i4 = AbstractC0632A.f2454a;
        if (i4 < 29 || (i3 = c0583o.f2131D) == -1) {
            return C1130f.f5243d;
        }
        Boolean bool = (Boolean) c0106b.f141i;
        boolean z3 = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            AudioManager audioManager = (AudioManager) ((PlayerActivity) c0106b.f140h).getSystemService("audio");
            if (audioManager != null) {
                String parameters = audioManager.getParameters("offloadVariableRateSupported");
                c0106b.f141i = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                c0106b.f141i = Boolean.FALSE;
            }
            zBooleanValue = ((Boolean) c0106b.f141i).booleanValue();
        }
        String str = c0583o.f2154n;
        str.getClass();
        int iM1354b = AbstractC0545H.m1354b(str, c0583o.f2151k);
        if (iM1354b == 0 || i4 < AbstractC0632A.m1596o(iM1354b)) {
            return C1130f.f5243d;
        }
        int iM1598q = AbstractC0632A.m1598q(c0583o.f2130C);
        if (iM1598q == 0) {
            return C1130f.f5243d;
        }
        try {
            AudioFormat audioFormatM1597p = AbstractC0632A.m1597p(i3, iM1598q, iM1354b);
            if (i4 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatM1597p, (AudioAttributes) c0567c.m1433a().f38h)) {
                    return C1130f.f5243d;
                }
                C0367d c0367d = new C0367d();
                c0367d.f1175a = true;
                c0367d.f1177c = zBooleanValue;
                return c0367d.m1008a();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatM1597p, (AudioAttributes) c0567c.m1433a().f38h);
            if (playbackOffloadSupport == 0) {
                return C1130f.f5243d;
            }
            C0367d c0367d2 = new C0367d();
            if (i4 > 32 && playbackOffloadSupport == 2) {
                z3 = true;
            }
            c0367d2.f1175a = true;
            c0367d2.f1176b = z3;
            c0367d2.f1177c = zBooleanValue;
            return c0367d2.m1008a();
        } catch (IllegalArgumentException unused) {
            return C1130f.f5243d;
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m3054i(C0583o c0583o) {
        m3061q();
        if ("audio/raw".equals(c0583o.f2154n)) {
            int i3 = c0583o.f2132E;
            if (!AbstractC0632A.m1567H(i3)) {
                AbstractC0462h.m1170j("Invalid PCM encoding: ", "DefaultAudioSink", i3);
                return 0;
            }
            if (i3 != 2) {
                return 1;
            }
        } else if (this.f5399w.m3007d(this.f5402z, c0583o) == null) {
            return 0;
        }
        return 2;
    }

    /* JADX INFO: renamed from: j */
    public final long m3055j() {
        C1144t c1144t = this.f5396t;
        return c1144t.f5318c == 0 ? this.f5348G / ((long) c1144t.f5317b) : this.f5349H;
    }

    /* JADX INFO: renamed from: k */
    public final long m3056k() {
        C1144t c1144t = this.f5396t;
        if (c1144t.f5318c != 0) {
            return this.f5351J;
        }
        long j3 = this.f5350I;
        long j4 = c1144t.f5319d;
        int i3 = AbstractC0632A.f2454a;
        return ((j3 + j4) - 1) / j4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:140:0x024e  */
    /* JADX WARN: Code duplicated, block: B:164:0x0286  */
    /* JADX WARN: Code duplicated, block: B:165:0x0288  */
    /* JADX WARN: Code duplicated, block: B:167:0x0296  */
    /* JADX WARN: Code duplicated, block: B:170:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:172:0x02bc  */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x039f, code lost:
    
        if (r5 == 0) goto L211;
     */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3057l(ByteBuffer byteBuffer, long j3, int i3) throws C1138n, C1136l {
        int i4;
        int iM4815j;
        int i5;
        byte b3;
        int i6;
        byte b4;
        int i7;
        int i8;
        int i9;
        int i10;
        C1139o c1139o;
        ByteBuffer byteBuffer2 = this.f5357P;
        AbstractC0646n.m1625c(byteBuffer2 == null || byteBuffer == byteBuffer2);
        C1144t c1144t = this.f5395s;
        C1141q c1141q = this.f5380g;
        if (c1144t != null) {
            if (!m3051f()) {
                return false;
            }
            C1144t c1144t2 = this.f5395s;
            C1144t c1144t3 = this.f5396t;
            c1144t2.getClass();
            if (c1144t3.f5318c == c1144t2.f5318c && c1144t3.f5322g == c1144t2.f5322g && c1144t3.f5320e == c1144t2.f5320e && c1144t3.f5321f == c1144t2.f5321f && c1144t3.f5319d == c1144t2.f5319d && c1144t3.f5325j == c1144t2.f5325j && c1144t3.f5326k == c1144t2.f5326k) {
                this.f5396t = this.f5395s;
                this.f5395s = null;
                AudioTrack audioTrack = this.f5398v;
                if (audioTrack != null && m3045p(audioTrack) && this.f5396t.f5326k) {
                    if (this.f5398v.getPlayState() == 3) {
                        this.f5398v.setOffloadEndOfStream();
                        c1141q.f5285G = true;
                        C1140p c1140p = c1141q.f5292e;
                        if (c1140p != null && (c1139o = c1140p.f5273a) != null) {
                            c1139o.f5271f = true;
                        }
                    }
                    AudioTrack audioTrack2 = this.f5398v;
                    C0583o c0583o = this.f5396t.f5316a;
                    audioTrack2.setOffloadDelayPadding(c0583o.f2133F, c0583o.f2134G);
                    this.f5377e0 = true;
                }
            } else {
                m3063s();
                if (m3058m()) {
                    return false;
                }
                m3052g();
            }
            m3046a(j3);
        }
        boolean zM3060o = m3060o();
        C1147w c1147w = this.f5388l;
        if (!zM3060o) {
            try {
                if (!m3059n()) {
                    return false;
                }
            } catch (C1136l e3) {
                if (e3.f5262h) {
                    throw e3;
                }
                c1147w.m3044a(e3);
                return false;
            }
        }
        c1147w.f5333a = null;
        c1147w.f5334b = -9223372036854775807L;
        c1147w.f5335c = -9223372036854775807L;
        if (this.f5354M) {
            this.f5355N = Math.max(0L, j3);
            this.f5353L = false;
            this.f5354M = false;
            if (m3068x()) {
                m3066v();
            }
            m3046a(j3);
            if (this.f5363V) {
                m3062r();
            }
        }
        long jM3056k = m3056k();
        AudioTrack audioTrack3 = c1141q.f5290c;
        audioTrack3.getClass();
        int playState = audioTrack3.getPlayState();
        if (c1141q.f5294g) {
            if (playState == 2) {
                c1141q.f5302o = false;
                return false;
            }
            if (playState == 1 && c1141q.m3017b() == 0) {
                return false;
            }
        }
        boolean z3 = c1141q.f5302o;
        boolean zM3018c = c1141q.m3018c(jM3056k);
        c1141q.f5302o = zM3018c;
        if (z3 && !zM3018c && playState != 1) {
            int i11 = c1141q.f5291d;
            long jM1581V = AbstractC0632A.m1581V(c1141q.f5295h);
            C1150z c1150z = (C1150z) c1141q.f5288a.f38h;
            if (c1150z.f5394r != null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - c1150z.f5373c0;
                C1133i c1133i = ((C1120B) c1150z.f5394r.f38h).f5180J0;
                Handler handler = c1133i.f5252b;
                if (handler != null) {
                    handler.post(new RunnableC1131g(c1133i, i11, jM1581V, jElapsedRealtime));
                }
            }
        }
        if (this.f5357P == null) {
            AbstractC0646n.m1625c(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.hasRemaining()) {
                C1144t c1144t4 = this.f5396t;
                if (c1144t4.f5318c != 0 && this.f5352K == 0) {
                    int i12 = c1144t4.f5322g;
                    if (i12 == 20) {
                        if ((byteBuffer.get(5) & 2) == 0) {
                            i4 = 0;
                        } else {
                            byte b5 = byteBuffer.get(26);
                            int i13 = 28;
                            int i14 = 28;
                            for (int i15 = 0; i15 < b5; i15++) {
                                i14 += byteBuffer.get(i15 + 27);
                            }
                            byte b6 = byteBuffer.get(i14 + 26);
                            for (int i16 = 0; i16 < b6; i16++) {
                                i13 += byteBuffer.get(i14 + 27 + i16);
                            }
                            i4 = i14 + i13;
                        }
                        int i17 = byteBuffer.get(i4 + 26) + 27 + i4;
                        iM4815j = (int) ((AbstractC2229b.m4815j(byteBuffer.get(i17), byteBuffer.limit() - i17 > 1 ? byteBuffer.get(i17 + 1) : (byte) 0) * 48000) / 1000000);
                    } else if (i12 != 30) {
                        switch (i12) {
                            case 5:
                            case 6:
                                if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                                    i7 = AbstractC2229b.f9567c[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
                                    iM4815j = i7;
                                } else {
                                    iM4815j = 1536;
                                }
                                break;
                            case 7:
                            case 8:
                                if (byteBuffer.getInt(0) != -233094848 || byteBuffer.getInt(0) == -398277519) {
                                    iM4815j = 1024;
                                } else if (byteBuffer.getInt(0) == 622876772) {
                                    iM4815j = 4096;
                                } else {
                                    int iPosition = byteBuffer.position();
                                    byte b7 = byteBuffer.get(iPosition);
                                    if (b7 != -2) {
                                        if (b7 == -1) {
                                            i5 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                                            b4 = byteBuffer.get(iPosition + 7);
                                        } else if (b7 != 31) {
                                            i5 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                                            b3 = byteBuffer.get(iPosition + 5);
                                        } else {
                                            i5 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                                            b4 = byteBuffer.get(iPosition + 6);
                                        }
                                        i6 = b4 & 60;
                                        iM4815j = (((i6 >> 2) | i5) + 1) * 32;
                                    } else {
                                        i5 = (byteBuffer.get(iPosition + 5) & 1) << 6;
                                        b3 = byteBuffer.get(iPosition + 4);
                                    }
                                    i6 = b3 & 252;
                                    iM4815j = (((i6 >> 2) | i5) + 1) * 32;
                                }
                                break;
                            case 9:
                                int iReverseBytes = byteBuffer.getInt(byteBuffer.position());
                                if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                    iReverseBytes = Integer.reverseBytes(iReverseBytes);
                                }
                                if ((iReverseBytes & (-2097152)) != -2097152 || (i8 = (iReverseBytes >>> 19) & 3) == 1 || (i9 = (iReverseBytes >>> 17) & 3) == 0) {
                                    i7 = -1;
                                } else {
                                    int i18 = (iReverseBytes >>> 12) & 15;
                                    int i19 = (iReverseBytes >>> 10) & 3;
                                    if (i18 == 0 || i18 == 15 || i19 == 3) {
                                        i7 = -1;
                                    } else {
                                        int i20 = 1152;
                                        if (i9 != 1) {
                                            if (i9 != 2) {
                                                if (i9 != 3) {
                                                    throw new IllegalArgumentException();
                                                }
                                                i20 = 384;
                                            }
                                        } else if (i8 != 3) {
                                            i20 = 576;
                                        }
                                        i7 = i20;
                                    }
                                }
                                if (i7 == -1) {
                                    throw new IllegalArgumentException();
                                }
                                iM4815j = i7;
                                break;
                            case 10:
                                iM4815j = 1024;
                                break;
                            case 11:
                            case 12:
                                iM4815j = 2048;
                                break;
                            default:
                                switch (i12) {
                                    case 14:
                                        int iPosition2 = byteBuffer.position();
                                        int iLimit = byteBuffer.limit() - 10;
                                        int i21 = iPosition2;
                                        while (true) {
                                            if (i21 <= iLimit) {
                                                int iReverseBytes2 = byteBuffer.getInt(i21 + 4);
                                                if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                                    iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                                }
                                                if ((iReverseBytes2 & (-2)) == -126718022) {
                                                    i10 = i21 - iPosition2;
                                                } else {
                                                    i21++;
                                                }
                                            } else {
                                                i10 = -1;
                                            }
                                        }
                                        if (i10 == -1) {
                                            iM4815j = 0;
                                        } else {
                                            iM4815j = (40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                                        }
                                        break;
                                    case 15:
                                        iM4815j = 512;
                                        break;
                                    case 16:
                                        iM4815j = 1024;
                                        break;
                                    case 17:
                                        byte[] bArr = new byte[16];
                                        int iPosition3 = byteBuffer.position();
                                        byteBuffer.get(bArr);
                                        byteBuffer.position(iPosition3);
                                        iM4815j = AbstractC2229b.m4818m(new C0508g(bArr, 16)).f2076c;
                                        break;
                                    case 18:
                                        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                                            i7 = AbstractC2229b.f9567c[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
                                            iM4815j = i7;
                                        } else {
                                            iM4815j = 1536;
                                        }
                                        break;
                                    default:
                                        throw new IllegalStateException(AbstractC0462h.m1165e(i12, "Unexpected audio encoding: "));
                                }
                                break;
                        }
                    } else if (byteBuffer.getInt(0) != -233094848) {
                        iM4815j = 1024;
                    } else {
                        iM4815j = 1024;
                    }
                    this.f5352K = iM4815j;
                }
                if (this.f5342A != null) {
                    if (!m3051f()) {
                        return false;
                    }
                    m3046a(j3);
                    this.f5342A = null;
                }
                long jM1575P = AbstractC0632A.m1575P(this.f5396t.f5316a.f2131D, m3055j() - this.f5374d.f5219o) + this.f5355N;
                if (!this.f5353L && Math.abs(jM1575P - j3) > 200000) {
                    C0031d c0031d = this.f5394r;
                    if (c0031d != null) {
                        c0031d.m177y(new C1137m("Unexpected audio track timestamp discontinuity: expected " + jM1575P + ", got " + j3));
                    }
                    this.f5353L = true;
                }
                if (this.f5353L) {
                    if (!m3051f()) {
                        return false;
                    }
                    long j4 = j3 - jM1575P;
                    this.f5355N += j4;
                    this.f5353L = false;
                    m3046a(j3);
                    C0031d c0031d2 = this.f5394r;
                    if (c0031d2 != null && j4 != 0) {
                        ((C1120B) c0031d2.f38h).f5189S0 = true;
                    }
                }
                if (this.f5396t.f5318c == 0) {
                    this.f5348G += (long) byteBuffer.remaining();
                } else {
                    this.f5349H = (((long) this.f5352K) * ((long) i3)) + this.f5349H;
                }
                this.f5357P = byteBuffer;
                this.f5358Q = i3;
            }
            return true;
        }
        m3064t(j3);
        if (!this.f5357P.hasRemaining()) {
            this.f5357P = null;
            this.f5358Q = 0;
            return true;
        }
        long jM3056k2 = m3056k();
        if (c1141q.f5312y == -9223372036854775807L || jM3056k2 <= 0) {
            return false;
        }
        c1141q.f5287I.getClass();
        if (SystemClock.elapsedRealtime() - c1141q.f5312y < 200) {
            return false;
        }
        AbstractC0646n.m1647y("DefaultAudioSink", "Resetting stalled audio track");
        m3052g();
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m3058m() {
        if (m3060o()) {
            return !(AbstractC0632A.f2454a >= 29 && this.f5398v.isOffloadedPlayback() && this.f5362U) && this.f5380g.m3018c(m3056k());
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0025  */
    /* JADX WARN: Code duplicated, block: B:83:0x019f  */
    /* JADX WARN: Code duplicated, block: B:94:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    public final boolean m3059n() throws C1136l {
        boolean z3;
        AudioTrack audioTrackM3048c;
        C1129e c1129e;
        C1071l c1071l;
        boolean z4;
        C1147w c1147w = this.f5388l;
        if (c1147w.f5333a == null) {
            z3 = false;
        } else {
            synchronized (f5339j0) {
                z4 = f5341l0 > 0;
            }
            if (!z4 && SystemClock.elapsedRealtime() >= c1147w.f5335c) {
                z3 = false;
            } else {
                z3 = true;
            }
        }
        if (z3) {
            return false;
        }
        try {
            C1144t c1144t = this.f5396t;
            c1144t.getClass();
            audioTrackM3048c = m3048c(c1144t);
        } catch (C1136l e3) {
            C1144t c1144t2 = this.f5396t;
            if (c1144t2.f5323h > 1000000) {
                C1144t c1144t3 = new C1144t(c1144t2.f5316a, c1144t2.f5317b, c1144t2.f5318c, c1144t2.f5319d, c1144t2.f5320e, c1144t2.f5321f, c1144t2.f5322g, 1000000, c1144t2.f5324i, c1144t2.f5325j, c1144t2.f5326k, c1144t2.f5327l);
                try {
                    audioTrackM3048c = m3048c(c1144t3);
                    this.f5396t = c1144t3;
                } catch (C1136l e4) {
                    e3.addSuppressed(e4);
                    if (this.f5396t.f5318c == 1) {
                        throw e3;
                    }
                    this.f5375d0 = true;
                    throw e3;
                }
            }
            if (this.f5396t.f5318c == 1) {
                throw e3;
            }
            this.f5375d0 = true;
            throw e3;
        }
        this.f5398v = audioTrackM3048c;
        if (m3045p(audioTrackM3048c)) {
            AudioTrack audioTrack = this.f5398v;
            if (this.f5387k == null) {
                this.f5387k = new C0858A(this);
            }
            C0858A c0858a = this.f5387k;
            Handler handler = (Handler) c0858a.f3639h;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new ExecutorC1148x(handler, 0), (C1149y) c0858a.f3640i);
            C1144t c1144t4 = this.f5396t;
            if (c1144t4.f5326k) {
                AudioTrack audioTrack2 = this.f5398v;
                C0583o c0583o = c1144t4.f5316a;
                audioTrack2.setOffloadDelayPadding(c0583o.f2133F, c0583o.f2134G);
            }
        }
        int i3 = AbstractC0632A.f2454a;
        if (i3 >= 31 && (c1071l = this.f5393q) != null) {
            AudioTrack audioTrack3 = this.f5398v;
            C1070k c1070k = c1071l.f4881b;
            c1070k.getClass();
            LogSessionId logSessionId = c1070k.f4879a;
            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
            if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                audioTrack3.setLogSessionId(logSessionId);
            }
        }
        this.f5365X = this.f5398v.getAudioSessionId();
        AudioTrack audioTrack4 = this.f5398v;
        C1144t c1144t5 = this.f5396t;
        boolean z5 = c1144t5.f5318c == 2;
        int i4 = c1144t5.f5322g;
        int i5 = c1144t5.f5319d;
        int i6 = c1144t5.f5323h;
        C1141q c1141q = this.f5380g;
        c1141q.f5290c = audioTrack4;
        c1141q.f5291d = i6;
        c1141q.f5292e = new C1140p(audioTrack4);
        c1141q.f5293f = audioTrack4.getSampleRate();
        c1141q.f5294g = z5 && i3 < 23 && (i4 == 5 || i4 == 6);
        boolean zM1567H = AbstractC0632A.m1567H(i4);
        c1141q.f5303p = zM1567H;
        c1141q.f5295h = zM1567H ? AbstractC0632A.m1575P(c1141q.f5293f, i6 / i5) : -9223372036854775807L;
        c1141q.f5306s = 0L;
        c1141q.f5307t = 0L;
        c1141q.f5285G = false;
        c1141q.f5286H = 0L;
        c1141q.f5308u = 0L;
        c1141q.f5302o = false;
        c1141q.f5311x = -9223372036854775807L;
        c1141q.f5312y = -9223372036854775807L;
        c1141q.f5304q = 0L;
        c1141q.f5301n = 0L;
        c1141q.f5296i = 1.0f;
        if (m3060o()) {
            this.f5398v.setVolume(this.f5356O);
        }
        this.f5366Y.getClass();
        C0031d c0031d = this.f5367Z;
        if (c0031d != null && i3 >= 23) {
            this.f5398v.setPreferredDevice((AudioDeviceInfo) c0031d.f38h);
            C1129e c1129e2 = this.f5400x;
            if (c1129e2 != null) {
                c1129e2.m3010b((AudioDeviceInfo) this.f5367Z.f38h);
            }
        }
        if (i3 >= 24 && (c1129e = this.f5400x) != null) {
            this.f5401y = new C0858A(this.f5398v, c1129e);
        }
        this.f5354M = true;
        C0031d c0031d2 = this.f5394r;
        if (c0031d2 != null) {
            C1134j c1134jM3043a = this.f5396t.m3043a();
            C1133i c1133i = ((C1120B) c0031d2.f38h).f5180J0;
            Handler handler2 = c1133i.f5252b;
            if (handler2 != null) {
                handler2.post(new RunnableC1131g(c1133i, c1134jM3043a, 1));
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m3060o() {
        return this.f5398v != null;
    }

    /* JADX INFO: renamed from: q */
    public final void m3061q() {
        C1126b c1126bM3006c;
        C1127c c1127c;
        if (this.f5400x == null) {
            PlayerActivity playerActivity = this.f5368a;
            this.f5379f0 = Looper.myLooper();
            C1129e c1129e = new C1129e(playerActivity, new C0111d(17, this), this.f5402z, this.f5367Z);
            this.f5400x = c1129e;
            if (c1129e.f5242j) {
                c1126bM3006c = c1129e.f5239g;
                c1126bM3006c.getClass();
            } else {
                c1129e.f5242j = true;
                C1128d c1128d = c1129e.f5238f;
                if (c1128d != null) {
                    c1128d.f5230a.registerContentObserver(c1128d.f5231b, false, c1128d);
                }
                int i3 = AbstractC0632A.f2454a;
                Handler handler = c1129e.f5235c;
                Context context = c1129e.f5233a;
                if (i3 >= 23 && (c1127c = c1129e.f5236d) != null) {
                    AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                    audioManager.getClass();
                    audioManager.registerAudioDeviceCallback(c1127c, handler);
                }
                c1126bM3006c = C1126b.m3006c(context, context.registerReceiver(c1129e.f5237e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), c1129e.f5241i, c1129e.f5240h);
                c1129e.f5239g = c1126bM3006c;
            }
            this.f5399w = c1126bM3006c;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m3062r() {
        this.f5363V = true;
        if (m3060o()) {
            C1141q c1141q = this.f5380g;
            if (c1141q.f5311x != -9223372036854775807L) {
                c1141q.f5287I.getClass();
                c1141q.f5311x = AbstractC0632A.m1571L(SystemClock.elapsedRealtime());
            }
            C1140p c1140p = c1141q.f5292e;
            c1140p.getClass();
            c1140p.m3014a();
            this.f5398v.play();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m3063s() {
        if (this.f5361T) {
            return;
        }
        this.f5361T = true;
        long jM3056k = m3056k();
        C1141q c1141q = this.f5380g;
        c1141q.f5313z = c1141q.m3017b();
        c1141q.f5287I.getClass();
        c1141q.f5311x = AbstractC0632A.m1571L(SystemClock.elapsedRealtime());
        c1141q.f5279A = jM3056k;
        if (m3045p(this.f5398v)) {
            this.f5362U = false;
        }
        this.f5398v.stop();
        this.f5347F = 0;
    }

    /* JADX INFO: renamed from: t */
    public final void m3064t(long j3) throws C1138n {
        ByteBuffer byteBuffer;
        m3050e(j3);
        if (this.f5359R != null) {
            return;
        }
        if (!this.f5397u.m1469e()) {
            ByteBuffer byteBuffer2 = this.f5357P;
            if (byteBuffer2 != null) {
                m3067w(byteBuffer2);
                m3050e(j3);
                return;
            }
            return;
        }
        while (!this.f5397u.m1468d()) {
            do {
                C0601a c0601a = this.f5397u;
                if (c0601a.m1469e()) {
                    ByteBuffer byteBuffer3 = c0601a.f2245c[c0601a.m1467c()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        c0601a.m1470f(InterfaceC0604d.f2252a);
                        byteBuffer = c0601a.f2245c[c0601a.m1467c()];
                    }
                } else {
                    byteBuffer = InterfaceC0604d.f2252a;
                }
                if (byteBuffer.hasRemaining()) {
                    m3067w(byteBuffer);
                    m3050e(j3);
                } else {
                    ByteBuffer byteBuffer4 = this.f5357P;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    C0601a c0601a2 = this.f5397u;
                    ByteBuffer byteBuffer5 = this.f5357P;
                    if (c0601a2.m1469e() && !c0601a2.f2246d) {
                        c0601a2.m1470f(byteBuffer5);
                    }
                }
            } while (this.f5359R == null);
            return;
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m3065u() {
        m3052g();
        C1674E c1674eListIterator = this.f5376e.listIterator(0);
        while (c1674eListIterator.hasNext()) {
            ((InterfaceC0604d) c1674eListIterator.next()).mo1472b();
        }
        C1674E c1674eListIterator2 = this.f5378f.listIterator(0);
        while (c1674eListIterator2.hasNext()) {
            ((InterfaceC0604d) c1674eListIterator2.next()).mo1472b();
        }
        C0601a c0601a = this.f5397u;
        if (c0601a != null) {
            int i3 = 0;
            while (true) {
                C1692X c1692x = c0601a.f2243a;
                if (i3 >= c1692x.f7631j) {
                    break;
                }
                InterfaceC0604d interfaceC0604d = (InterfaceC0604d) c1692x.get(i3);
                interfaceC0604d.flush();
                interfaceC0604d.mo1472b();
                i3++;
            }
            c0601a.f2245c = new ByteBuffer[0];
            C0602b c0602b = C0602b.f2247e;
            c0601a.f2246d = false;
        }
        this.f5363V = false;
        this.f5375d0 = false;
    }

    /* JADX INFO: renamed from: v */
    public final void m3066v() {
        if (m3060o()) {
            try {
                this.f5398v.setPlaybackParams(AbstractC0081c.m400h().allowDefaults().setSpeed(this.f5344C.f1949a).setPitch(this.f5344C.f1950b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e3) {
                AbstractC0646n.m1648z("DefaultAudioSink", "Failed to set playback params", e3);
            }
            C0548K c0548k = new C0548K(this.f5398v.getPlaybackParams().getSpeed(), this.f5398v.getPlaybackParams().getPitch());
            this.f5344C = c0548k;
            float f = c0548k.f1949a;
            C1141q c1141q = this.f5380g;
            c1141q.f5296i = f;
            C1140p c1140p = c1141q.f5292e;
            if (c1140p != null) {
                c1140p.m3014a();
            }
            c1141q.m3019d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    /* JADX WARN: Code duplicated, block: B:47:0x0140  */
    /* JADX WARN: Code duplicated, block: B:49:0x0143  */
    /* JADX WARN: Code duplicated, block: B:51:0x0146 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0148  */
    /* JADX WARN: Code duplicated, block: B:54:0x014c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0150  */
    /* JADX WARN: Code duplicated, block: B:58:0x0154  */
    /* JADX WARN: Code duplicated, block: B:60:0x0158  */
    /* JADX WARN: Code duplicated, block: B:63:0x0176  */
    /* JADX WARN: Code duplicated, block: B:64:0x0189  */
    /* JADX WARN: Code duplicated, block: B:65:0x0196  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0055 A[SYNTHETIC] */
    /* JADX INFO: renamed from: w */
    public final void m3067w(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferOrder;
        int i3;
        byte b3;
        int i4;
        int i5;
        int i6;
        AbstractC0646n.m1630h(this.f5359R == null);
        if (byteBuffer.hasRemaining()) {
            if (this.f5396t.f5318c != 0) {
                byteBufferOrder = byteBuffer;
            } else {
                int iM1577R = (int) AbstractC0632A.m1577R(AbstractC0632A.m1571L(20L), this.f5396t.f5320e, 1000000L, RoundingMode.UP);
                long jM3056k = m3056k();
                long j3 = iM1577R;
                if (jM3056k >= j3) {
                    byteBufferOrder = byteBuffer;
                } else {
                    C1144t c1144t = this.f5396t;
                    int i7 = c1144t.f5322g;
                    int i8 = (int) jM3056k;
                    byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i8 < iM1577R) {
                        if (i7 != 2) {
                            if (i7 == 3) {
                                i5 = (byteBuffer.get() & 255) << 24;
                            } else if (i7 == 4) {
                                float fM1589h = AbstractC0632A.m1589h(byteBuffer.getFloat(), -1.0f, 1.0f);
                                i5 = (int) (fM1589h < 0.0f ? (-fM1589h) * (-2.1474836E9f) : fM1589h * 2.1474836E9f);
                            } else if (i7 != 21) {
                                if (i7 == 22) {
                                    i3 = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                    b3 = byteBuffer.get();
                                } else if (i7 == 268435456) {
                                    i3 = (byteBuffer.get() & 255) << 24;
                                    i4 = (byteBuffer.get() & 255) << 16;
                                } else if (i7 == 1342177280) {
                                    i3 = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                                    i4 = (byteBuffer.get() & 255) << 8;
                                } else {
                                    if (i7 != 1610612736) {
                                        throw new IllegalStateException();
                                    }
                                    i3 = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                                    i4 = byteBuffer.get() & 255;
                                }
                                i5 = i3 | i4;
                            } else {
                                i3 = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b3 = byteBuffer.get();
                            }
                            i6 = (int) ((((long) i5) * ((long) i8)) / j3);
                            if (i7 != 2) {
                                byteBufferOrder.put((byte) (i6 >> 16));
                                byteBufferOrder.put((byte) (i6 >> 24));
                            } else if (i7 != 3) {
                                byteBufferOrder.put((byte) (i6 >> 24));
                            } else if (i7 != 4) {
                                if (i7 != 21) {
                                    byteBufferOrder.put((byte) (i6 >> 8));
                                    byteBufferOrder.put((byte) (i6 >> 16));
                                    byteBufferOrder.put((byte) (i6 >> 24));
                                } else if (i7 != 22) {
                                    byteBufferOrder.put((byte) i6);
                                    byteBufferOrder.put((byte) (i6 >> 8));
                                    byteBufferOrder.put((byte) (i6 >> 16));
                                    byteBufferOrder.put((byte) (i6 >> 24));
                                } else if (i7 != 268435456) {
                                    byteBufferOrder.put((byte) (i6 >> 24));
                                    byteBufferOrder.put((byte) (i6 >> 16));
                                } else if (i7 != 1342177280) {
                                    byteBufferOrder.put((byte) (i6 >> 24));
                                    byteBufferOrder.put((byte) (i6 >> 16));
                                    byteBufferOrder.put((byte) (i6 >> 8));
                                } else {
                                    if (i7 == 1610612736) {
                                        throw new IllegalStateException();
                                    }
                                    byteBufferOrder.put((byte) (i6 >> 24));
                                    byteBufferOrder.put((byte) (i6 >> 16));
                                    byteBufferOrder.put((byte) (i6 >> 8));
                                    byteBufferOrder.put((byte) i6);
                                }
                            } else if (i6 < 0) {
                                byteBufferOrder.putFloat((-i6) / (-2.1474836E9f));
                            } else {
                                byteBufferOrder.putFloat(i6 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() == c1144t.f5319d + iPosition) {
                                i8++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i3 = (byteBuffer.get() & 255) << 16;
                            b3 = byteBuffer.get();
                        }
                        i4 = (b3 & 255) << 24;
                        i5 = i3 | i4;
                        i6 = (int) ((((long) i5) * ((long) i8)) / j3);
                        if (i7 != 2) {
                            byteBufferOrder.put((byte) (i6 >> 16));
                            byteBufferOrder.put((byte) (i6 >> 24));
                        } else if (i7 != 3) {
                            byteBufferOrder.put((byte) (i6 >> 24));
                        } else if (i7 != 4) {
                            if (i7 != 21) {
                                byteBufferOrder.put((byte) (i6 >> 8));
                                byteBufferOrder.put((byte) (i6 >> 16));
                                byteBufferOrder.put((byte) (i6 >> 24));
                            } else if (i7 != 22) {
                                byteBufferOrder.put((byte) i6);
                                byteBufferOrder.put((byte) (i6 >> 8));
                                byteBufferOrder.put((byte) (i6 >> 16));
                                byteBufferOrder.put((byte) (i6 >> 24));
                            } else if (i7 != 268435456) {
                                byteBufferOrder.put((byte) (i6 >> 24));
                                byteBufferOrder.put((byte) (i6 >> 16));
                            } else if (i7 != 1342177280) {
                                byteBufferOrder.put((byte) (i6 >> 24));
                                byteBufferOrder.put((byte) (i6 >> 16));
                                byteBufferOrder.put((byte) (i6 >> 8));
                            } else {
                                if (i7 == 1610612736) {
                                    throw new IllegalStateException();
                                }
                                byteBufferOrder.put((byte) (i6 >> 24));
                                byteBufferOrder.put((byte) (i6 >> 16));
                                byteBufferOrder.put((byte) (i6 >> 8));
                                byteBufferOrder.put((byte) i6);
                            }
                        } else if (i6 < 0) {
                            byteBufferOrder.putFloat((-i6) / (-2.1474836E9f));
                        } else {
                            byteBufferOrder.putFloat(i6 / 2.1474836E9f);
                        }
                        if (byteBuffer.position() == c1144t.f5319d + iPosition) {
                            i8++;
                            iPosition = byteBuffer.position();
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                }
            }
            this.f5359R = byteBufferOrder;
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m3068x() {
        C1144t c1144t = this.f5396t;
        return c1144t != null && c1144t.f5325j && AbstractC0632A.f2454a >= 23;
    }
}

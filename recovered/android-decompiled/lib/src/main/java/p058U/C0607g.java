package p058U;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: renamed from: U.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0607g implements InterfaceC0604d {

    /* JADX INFO: renamed from: b */
    public int f2283b;

    /* JADX INFO: renamed from: c */
    public float f2284c;

    /* JADX INFO: renamed from: d */
    public float f2285d;

    /* JADX INFO: renamed from: e */
    public C0602b f2286e;

    /* JADX INFO: renamed from: f */
    public C0602b f2287f;

    /* JADX INFO: renamed from: g */
    public C0602b f2288g;

    /* JADX INFO: renamed from: h */
    public C0602b f2289h;

    /* JADX INFO: renamed from: i */
    public boolean f2290i;

    /* JADX INFO: renamed from: j */
    public C0606f f2291j;

    /* JADX INFO: renamed from: k */
    public ByteBuffer f2292k;

    /* JADX INFO: renamed from: l */
    public ShortBuffer f2293l;

    /* JADX INFO: renamed from: m */
    public ByteBuffer f2294m;

    /* JADX INFO: renamed from: n */
    public long f2295n;

    /* JADX INFO: renamed from: o */
    public long f2296o;

    /* JADX INFO: renamed from: p */
    public boolean f2297p;

    @Override // p058U.InterfaceC0604d
    /* JADX INFO: renamed from: a */
    public final ByteBuffer mo1471a() {
        C0606f c0606f = this.f2291j;
        if (c0606f != null) {
            int i3 = c0606f.f2272m;
            int i4 = c0606f.f2261b;
            int i5 = i3 * i4 * 2;
            if (i5 > 0) {
                if (this.f2292k.capacity() < i5) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i5).order(ByteOrder.nativeOrder());
                    this.f2292k = byteBufferOrder;
                    this.f2293l = byteBufferOrder.asShortBuffer();
                } else {
                    this.f2292k.clear();
                    this.f2293l.clear();
                }
                ShortBuffer shortBuffer = this.f2293l;
                int iMin = Math.min(shortBuffer.remaining() / i4, c0606f.f2272m);
                int i6 = iMin * i4;
                shortBuffer.put(c0606f.f2271l, 0, i6);
                int i7 = c0606f.f2272m - iMin;
                c0606f.f2272m = i7;
                short[] sArr = c0606f.f2271l;
                System.arraycopy(sArr, i6, sArr, 0, i7 * i4);
                this.f2296o += (long) i5;
                this.f2292k.limit(i5);
                this.f2294m = this.f2292k;
            }
        }
        ByteBuffer byteBuffer = this.f2294m;
        this.f2294m = InterfaceC0604d.f2252a;
        return byteBuffer;
    }

    @Override // p058U.InterfaceC0604d
    /* JADX INFO: renamed from: b */
    public final void mo1472b() {
        this.f2284c = 1.0f;
        this.f2285d = 1.0f;
        C0602b c0602b = C0602b.f2247e;
        this.f2286e = c0602b;
        this.f2287f = c0602b;
        this.f2288g = c0602b;
        this.f2289h = c0602b;
        ByteBuffer byteBuffer = InterfaceC0604d.f2252a;
        this.f2292k = byteBuffer;
        this.f2293l = byteBuffer.asShortBuffer();
        this.f2294m = byteBuffer;
        this.f2283b = -1;
        this.f2290i = false;
        this.f2291j = null;
        this.f2295n = 0L;
        this.f2296o = 0L;
        this.f2297p = false;
    }

    @Override // p058U.InterfaceC0604d
    /* JADX INFO: renamed from: c */
    public final void mo1473c() {
        C0606f c0606f = this.f2291j;
        if (c0606f != null) {
            int i3 = c0606f.f2270k;
            float f = c0606f.f2262c;
            float f3 = c0606f.f2263d;
            double d3 = f / f3;
            double d4 = c0606f.f2264e * f3;
            int i4 = c0606f.f2277r;
            int i5 = c0606f.f2272m + ((int) ((((((((double) (i3 - i4)) / d3) + ((double) i4)) + c0606f.f2282w) + ((double) c0606f.f2274o)) / d4) + 0.5d));
            c0606f.f2282w = 0.0d;
            short[] sArr = c0606f.f2269j;
            int i6 = c0606f.f2267h * 2;
            c0606f.f2269j = c0606f.m1486c(sArr, i3, i6 + i3);
            int i7 = 0;
            while (true) {
                int i8 = c0606f.f2261b;
                if (i7 >= i6 * i8) {
                    break;
                }
                c0606f.f2269j[(i8 * i3) + i7] = 0;
                i7++;
            }
            c0606f.f2270k = i6 + c0606f.f2270k;
            c0606f.m1488f();
            if (c0606f.f2272m > i5) {
                c0606f.f2272m = i5;
            }
            c0606f.f2270k = 0;
            c0606f.f2277r = 0;
            c0606f.f2274o = 0;
        }
        this.f2297p = true;
    }

    @Override // p058U.InterfaceC0604d
    /* JADX INFO: renamed from: d */
    public final boolean mo1474d() {
        if (!this.f2297p) {
            return false;
        }
        C0606f c0606f = this.f2291j;
        return c0606f == null || (c0606f.f2272m * c0606f.f2261b) * 2 == 0;
    }

    @Override // p058U.InterfaceC0604d
    /* JADX INFO: renamed from: e */
    public final boolean mo1475e() {
        if (this.f2287f.f2248a != -1) {
            return Math.abs(this.f2284c - 1.0f) >= 1.0E-4f || Math.abs(this.f2285d - 1.0f) >= 1.0E-4f || this.f2287f.f2248a != this.f2286e.f2248a;
        }
        return false;
    }

    @Override // p058U.InterfaceC0604d
    /* JADX INFO: renamed from: f */
    public final void mo1476f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C0606f c0606f = this.f2291j;
            c0606f.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f2295n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i3 = c0606f.f2261b;
            int i4 = iRemaining2 / i3;
            short[] sArrM1486c = c0606f.m1486c(c0606f.f2269j, c0606f.f2270k, i4);
            c0606f.f2269j = sArrM1486c;
            shortBufferAsShortBuffer.get(sArrM1486c, c0606f.f2270k * i3, ((i4 * i3) * 2) / 2);
            c0606f.f2270k += i4;
            c0606f.m1488f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // p058U.InterfaceC0604d
    public final void flush() {
        if (mo1475e()) {
            C0602b c0602b = this.f2286e;
            this.f2288g = c0602b;
            C0602b c0602b2 = this.f2287f;
            this.f2289h = c0602b2;
            if (this.f2290i) {
                this.f2291j = new C0606f(c0602b.f2248a, c0602b.f2249b, this.f2284c, this.f2285d, c0602b2.f2248a);
            } else {
                C0606f c0606f = this.f2291j;
                if (c0606f != null) {
                    c0606f.f2270k = 0;
                    c0606f.f2272m = 0;
                    c0606f.f2274o = 0;
                    c0606f.f2275p = 0;
                    c0606f.f2276q = 0;
                    c0606f.f2277r = 0;
                    c0606f.f2278s = 0;
                    c0606f.f2279t = 0;
                    c0606f.f2280u = 0;
                    c0606f.f2281v = 0;
                    c0606f.f2282w = 0.0d;
                }
            }
        }
        this.f2294m = InterfaceC0604d.f2252a;
        this.f2295n = 0L;
        this.f2296o = 0L;
        this.f2297p = false;
    }

    @Override // p058U.InterfaceC0604d
    /* JADX INFO: renamed from: g */
    public final C0602b mo1477g(C0602b c0602b) throws C0603c {
        if (c0602b.f2250c != 2) {
            throw new C0603c(c0602b);
        }
        int i3 = this.f2283b;
        if (i3 == -1) {
            i3 = c0602b.f2248a;
        }
        this.f2286e = c0602b;
        C0602b c0602b2 = new C0602b(i3, c0602b.f2249b, 2);
        this.f2287f = c0602b2;
        this.f2290i = true;
        return c0602b2;
    }
}

package p099g0;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import p045P0.C0457c;
import p045P0.C0460f;
import p045P0.C0461g;
import p045P0.InterfaceC0458d;
import p045P0.InterfaceC0459e;
import p045P0.InterfaceC0465k;
import p064W.AbstractC0646n;
import p073Z.AbstractC0769d;
import p073Z.AbstractC0772g;
import p073Z.C0771f;
import p073Z.C0773h;
import p073Z.InterfaceC0768c;
import p082b0.C1063d;

/* JADX INFO: renamed from: g0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1572b implements InterfaceC0459e, InterfaceC0768c {

    /* JADX INFO: renamed from: a */
    public final C0773h f7143a;

    /* JADX INFO: renamed from: b */
    public final Object f7144b;

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f7145c;

    /* JADX INFO: renamed from: d */
    public final ArrayDeque f7146d;

    /* JADX INFO: renamed from: e */
    public final C0771f[] f7147e;

    /* JADX INFO: renamed from: f */
    public final AbstractC0772g[] f7148f;

    /* JADX INFO: renamed from: g */
    public int f7149g;

    /* JADX INFO: renamed from: h */
    public int f7150h;

    /* JADX INFO: renamed from: i */
    public C0771f f7151i;

    /* JADX INFO: renamed from: j */
    public AbstractC0769d f7152j;

    /* JADX INFO: renamed from: k */
    public boolean f7153k;

    /* JADX INFO: renamed from: l */
    public boolean f7154l;

    /* JADX INFO: renamed from: m */
    public long f7155m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f7156n;

    /* JADX INFO: renamed from: o */
    public final Object f7157o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1572b(InterfaceC0465k interfaceC0465k) {
        this(new C0461g[2], new C0457c[2]);
        this.f7156n = 1;
        int i3 = this.f7149g;
        C0771f[] c0771fArr = this.f7147e;
        AbstractC0646n.m1630h(i3 == c0771fArr.length);
        for (C0771f c0771f : c0771fArr) {
            c0771f.m1885h(1024);
        }
        this.f7157o = interfaceC0465k;
    }

    @Override // p073Z.InterfaceC0768c
    /* JADX INFO: renamed from: a */
    public final void mo1229a() {
        synchronized (this.f7144b) {
            this.f7154l = true;
            this.f7144b.notify();
        }
        try {
            this.f7143a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // p073Z.InterfaceC0768c
    /* JADX INFO: renamed from: e */
    public final Object mo1269e() {
        C0771f c0771f;
        synchronized (this.f7144b) {
            try {
                AbstractC0769d abstractC0769d = this.f7152j;
                if (abstractC0769d != null) {
                    throw abstractC0769d;
                }
                AbstractC0646n.m1630h(this.f7151i == null);
                int i3 = this.f7149g;
                if (i3 == 0) {
                    c0771f = null;
                } else {
                    C0771f[] c0771fArr = this.f7147e;
                    int i4 = i3 - 1;
                    this.f7149g = i4;
                    c0771f = c0771fArr[i4];
                }
                this.f7151i = c0771f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0771f;
    }

    @Override // p073Z.InterfaceC0768c
    /* JADX INFO: renamed from: f */
    public final void mo1270f(long j3) {
        synchronized (this.f7144b) {
            try {
                AbstractC0646n.m1630h(this.f7149g == this.f7147e.length || this.f7153k);
                this.f7155m = j3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p073Z.InterfaceC0768c
    public final void flush() {
        synchronized (this.f7144b) {
            try {
                this.f7153k = true;
                C0771f c0771f = this.f7151i;
                if (c0771f != null) {
                    c0771f.mo1883e();
                    int i3 = this.f7149g;
                    this.f7149g = i3 + 1;
                    this.f7147e[i3] = c0771f;
                    this.f7151i = null;
                }
                while (!this.f7145c.isEmpty()) {
                    C0771f c0771f2 = (C0771f) this.f7145c.removeFirst();
                    c0771f2.mo1883e();
                    int i4 = this.f7149g;
                    this.f7149g = i4 + 1;
                    this.f7147e[i4] = c0771f2;
                }
                while (!this.f7146d.isEmpty()) {
                    ((AbstractC0772g) this.f7146d.removeFirst()).mo1159f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC0769d m3904g(Throwable th) {
        switch (this.f7156n) {
            case 0:
                return new C1574d("Unexpected decode error", th);
            default:
                return new C0460f("Unexpected decode error", th);
        }
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC0769d m3905h(C0771f c0771f, AbstractC0772g abstractC0772g, boolean z3) {
        switch (this.f7156n) {
            case 0:
                C1571a c1571a = (C1571a) abstractC0772g;
                try {
                    ByteBuffer byteBuffer = c0771f.f3144k;
                    byteBuffer.getClass();
                    AbstractC0646n.m1630h(byteBuffer.hasArray());
                    AbstractC0646n.m1625c(byteBuffer.arrayOffset() == 0);
                    C1063d c1063d = (C1063d) this.f7157o;
                    byte[] bArrArray = byteBuffer.array();
                    int iRemaining = byteBuffer.remaining();
                    c1063d.getClass();
                    c1571a.f7141k = C1063d.m2828c(bArrArray, iRemaining);
                    c1571a.f3149i = c0771f.f3146m;
                    return null;
                } catch (C1574d e3) {
                    return e3;
                }
            default:
                C0461g c0461g = (C0461g) c0771f;
                C0457c c0457c = (C0457c) abstractC0772g;
                try {
                    ByteBuffer byteBuffer2 = c0461g.f3144k;
                    byteBuffer2.getClass();
                    byte[] bArrArray2 = byteBuffer2.array();
                    int iLimit = byteBuffer2.limit();
                    InterfaceC0465k interfaceC0465k = (InterfaceC0465k) this.f7157o;
                    if (z3) {
                        interfaceC0465k.mo514b();
                    }
                    InterfaceC0458d interfaceC0458dMo523k = interfaceC0465k.mo523k(bArrArray2, 0, iLimit);
                    long j3 = c0461g.f3146m;
                    long j4 = c0461g.f1531p;
                    c0457c.f3149i = j3;
                    c0457c.f1527k = interfaceC0458dMo523k;
                    if (j4 != Long.MAX_VALUE) {
                        j3 = j4;
                    }
                    c0457c.f1528l = j3;
                    c0457c.f3150j = false;
                    return null;
                } catch (C0460f e4) {
                    return e4;
                }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m3906i() {
        AbstractC0769d abstractC0769dM3904g;
        synchronized (this.f7144b) {
            while (!this.f7154l) {
                try {
                    if (!this.f7145c.isEmpty() && this.f7150h > 0) {
                        break;
                    }
                    this.f7144b.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f7154l) {
                return false;
            }
            C0771f c0771f = (C0771f) this.f7145c.removeFirst();
            AbstractC0772g[] abstractC0772gArr = this.f7148f;
            int i3 = this.f7150h - 1;
            this.f7150h = i3;
            AbstractC0772g abstractC0772g = abstractC0772gArr[i3];
            boolean z3 = this.f7153k;
            this.f7153k = false;
            if (c0771f.m1787c(4)) {
                abstractC0772g.m1786a(4);
            } else {
                abstractC0772g.f3149i = c0771f.f3146m;
                if (c0771f.m1787c(134217728)) {
                    abstractC0772g.m1786a(134217728);
                }
                if (!m3908k(c0771f.f3146m)) {
                    abstractC0772g.f3150j = true;
                }
                try {
                    abstractC0769dM3904g = m3905h(c0771f, abstractC0772g, z3);
                } catch (OutOfMemoryError e3) {
                    abstractC0769dM3904g = m3904g(e3);
                } catch (RuntimeException e4) {
                    abstractC0769dM3904g = m3904g(e4);
                }
                if (abstractC0769dM3904g != null) {
                    synchronized (this.f7144b) {
                        this.f7152j = abstractC0769dM3904g;
                    }
                    return false;
                }
            }
            synchronized (this.f7144b) {
                try {
                    if (this.f7153k || abstractC0772g.f3150j) {
                        abstractC0772g.mo1159f();
                    } else {
                        this.f7146d.addLast(abstractC0772g);
                    }
                    c0771f.mo1883e();
                    int i4 = this.f7149g;
                    this.f7149g = i4 + 1;
                    this.f7147e[i4] = c0771f;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    @Override // p073Z.InterfaceC0768c
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final AbstractC0772g mo1230d() {
        synchronized (this.f7144b) {
            try {
                AbstractC0769d abstractC0769d = this.f7152j;
                if (abstractC0769d != null) {
                    throw abstractC0769d;
                }
                if (this.f7146d.isEmpty()) {
                    return null;
                }
                return (AbstractC0772g) this.f7146d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m3908k(long j3) {
        boolean z3;
        synchronized (this.f7144b) {
            long j4 = this.f7155m;
            z3 = j4 == -9223372036854775807L || j3 >= j4;
        }
        return z3;
    }

    @Override // p073Z.InterfaceC0768c
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void mo1268c(C0771f c0771f) {
        synchronized (this.f7144b) {
            try {
                AbstractC0769d abstractC0769d = this.f7152j;
                if (abstractC0769d != null) {
                    throw abstractC0769d;
                }
                AbstractC0646n.m1625c(c0771f == this.f7151i);
                this.f7145c.addLast(c0771f);
                if (!this.f7145c.isEmpty() && this.f7150h > 0) {
                    this.f7144b.notify();
                }
                this.f7151i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m3910m(AbstractC0772g abstractC0772g) {
        synchronized (this.f7144b) {
            abstractC0772g.mo1158e();
            int i3 = this.f7150h;
            this.f7150h = i3 + 1;
            this.f7148f[i3] = abstractC0772g;
            if (!this.f7145c.isEmpty() && this.f7150h > 0) {
                this.f7144b.notify();
            }
        }
    }

    public C1572b(C0771f[] c0771fArr, AbstractC0772g[] abstractC0772gArr) {
        AbstractC0772g c1571a;
        C0771f c0771f;
        this.f7144b = new Object();
        this.f7155m = -9223372036854775807L;
        this.f7145c = new ArrayDeque();
        this.f7146d = new ArrayDeque();
        this.f7147e = c0771fArr;
        this.f7149g = c0771fArr.length;
        for (int i3 = 0; i3 < this.f7149g; i3++) {
            C0771f[] c0771fArr2 = this.f7147e;
            switch (this.f7156n) {
                case 0:
                    c0771f = new C0771f(1);
                    break;
                default:
                    c0771f = new C0461g(1);
                    break;
            }
            c0771fArr2[i3] = c0771f;
        }
        this.f7148f = abstractC0772gArr;
        this.f7150h = abstractC0772gArr.length;
        for (int i4 = 0; i4 < this.f7150h; i4++) {
            AbstractC0772g[] abstractC0772gArr2 = this.f7148f;
            switch (this.f7156n) {
                case 0:
                    c1571a = new C1571a(this);
                    break;
                default:
                    c1571a = new C0457c(this);
                    break;
            }
            abstractC0772gArr2[i4] = c1571a;
        }
        C0773h c0773h = new C0773h(this);
        this.f7143a = c0773h;
        c0773h.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1572b(C1063d c1063d) {
        this(new C0771f[1], new C1571a[1]);
        this.f7156n = 0;
        this.f7157o = c1063d;
    }

    @Override // p045P0.InterfaceC0459e
    /* JADX INFO: renamed from: b */
    public void mo1160b(long j3) {
    }
}

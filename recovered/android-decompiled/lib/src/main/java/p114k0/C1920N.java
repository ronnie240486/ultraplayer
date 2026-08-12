package p114k0;

import android.net.Uri;
import android.support.v4.media.session.C0858A;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import p015F0.C0173b;
import p033L0.C0341d;
import p055T.C0587s;
import p060U1.AbstractC0610a;
import p064W.AbstractC0646n;
import p064W.C0635c;
import p070Y.C0715l;
import p070Y.C0729z;
import p070Y.InterfaceC0711h;
import p129o0.InterfaceC2071k;
import p145s0.C2237j;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2240m;

/* JADX INFO: renamed from: k0.N */
/* JADX INFO: loaded from: classes.dex */
public final class C1920N implements InterfaceC2071k {

    /* JADX INFO: renamed from: a */
    public final Uri f8356a;

    /* JADX INFO: renamed from: b */
    public final C0729z f8357b;

    /* JADX INFO: renamed from: c */
    public final C0858A f8358c;

    /* JADX INFO: renamed from: d */
    public final C1923Q f8359d;

    /* JADX INFO: renamed from: e */
    public final C0635c f8360e;

    /* JADX INFO: renamed from: g */
    public volatile boolean f8362g;

    /* JADX INFO: renamed from: i */
    public long f8364i;

    /* JADX INFO: renamed from: j */
    public C0715l f8365j;

    /* JADX INFO: renamed from: k */
    public InterfaceC2226E f8366k;

    /* JADX INFO: renamed from: l */
    public boolean f8367l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C1923Q f8368m;

    /* JADX INFO: renamed from: f */
    public final C0587s f8361f = new C0587s();

    /* JADX INFO: renamed from: h */
    public boolean f8363h = true;

    public C1920N(C1923Q c1923q, Uri uri, InterfaceC0711h interfaceC0711h, C0858A c0858a, C1923Q c1923q2, C0635c c0635c) {
        this.f8368m = c1923q;
        this.f8356a = uri;
        this.f8357b = new C0729z(interfaceC0711h);
        this.f8358c = c0858a;
        this.f8359d = c1923q2;
        this.f8360e = c0635c;
        C1958r.f8563b.getAndIncrement();
        this.f8365j = m4441c(0L);
    }

    @Override // p129o0.InterfaceC2071k
    /* JADX INFO: renamed from: a */
    public final void mo3742a() {
        InterfaceC0711h c1957q;
        InterfaceC2240m interfaceC2240m;
        int i3;
        int iMo328e = 0;
        while (iMo328e == 0 && !this.f8362g) {
            try {
                long j3 = this.f8361f.f2181a;
                C0715l c0715lM4441c = m4441c(j3);
                this.f8365j = c0715lM4441c;
                long jMo1827a = this.f8357b.mo1827a(c0715lM4441c);
                if (this.f8362g) {
                    if (iMo328e != 1 && this.f8358c.m2157E() != -1) {
                        this.f8361f.f2181a = this.f8358c.m2157E();
                    }
                    AbstractC0610a.m1504f(this.f8357b);
                    return;
                }
                if (jMo1827a != -1) {
                    jMo1827a += j3;
                    C1923Q c1923q = this.f8368m;
                    c1923q.f8412w.post(new RunnableC1918L(c1923q, 0));
                }
                long j4 = jMo1827a;
                this.f8368m.f8414y = C0173b.m647d(this.f8357b.f2783g.mo1833m());
                C0729z c0729z = this.f8357b;
                C0173b c0173b = this.f8368m.f8414y;
                if (c0173b == null || (i3 = c0173b.f404l) == -1) {
                    c1957q = c0729z;
                } else {
                    c1957q = new C1957q(c0729z, i3, this);
                    C1923Q c1923q2 = this.f8368m;
                    c1923q2.getClass();
                    InterfaceC2226E interfaceC2226EM4444C = c1923q2.m4444C(new C1922P(0, true));
                    this.f8366k = interfaceC2226EM4444C;
                    interfaceC2226EM4444C.mo1176e(C1923Q.f8374W);
                }
                this.f8358c.m2167O(c1957q, this.f8356a, this.f8357b.f2783g.mo1833m(), j3, j4, this.f8359d);
                if (this.f8368m.f8414y != null && (interfaceC2240m = (InterfaceC2240m) this.f8358c.f3640i) != null) {
                    InterfaceC2240m interfaceC2240mMo327c = interfaceC2240m.mo327c();
                    if (interfaceC2240mMo327c instanceof C0341d) {
                        ((C0341d) interfaceC2240mMo327c).f1105r = true;
                    }
                }
                if (this.f8363h) {
                    C0858A c0858a = this.f8358c;
                    long j5 = this.f8364i;
                    InterfaceC2240m interfaceC2240m2 = (InterfaceC2240m) c0858a.f3640i;
                    interfaceC2240m2.getClass();
                    interfaceC2240m2.mo331j(j3, j5);
                    this.f8363h = false;
                }
                while (iMo328e == 0 && !this.f8362g) {
                    try {
                        C0635c c0635c = this.f8360e;
                        synchronized (c0635c) {
                            while (!c0635c.f2475a) {
                                try {
                                    c0635c.wait();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        C0858A c0858a2 = this.f8358c;
                        C0587s c0587s = this.f8361f;
                        InterfaceC2240m interfaceC2240m3 = (InterfaceC2240m) c0858a2.f3640i;
                        interfaceC2240m3.getClass();
                        C2237j c2237j = (C2237j) c0858a2.f3641j;
                        c2237j.getClass();
                        iMo328e = interfaceC2240m3.mo328e(c2237j, c0587s);
                        long jM2157E = this.f8358c.m2157E();
                        if (jM2157E > this.f8368m.f8404o + j3) {
                            this.f8360e.m1612b();
                            C1923Q c1923q3 = this.f8368m;
                            c1923q3.f8412w.post(c1923q3.f8411v);
                            j3 = jM2157E;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (iMo328e == 1) {
                    iMo328e = 0;
                } else if (this.f8358c.m2157E() != -1) {
                    this.f8361f.f2181a = this.f8358c.m2157E();
                }
                AbstractC0610a.m1504f(this.f8357b);
            } catch (Throwable th2) {
                if (iMo328e != 1 && this.f8358c.m2157E() != -1) {
                    this.f8361f.f2181a = this.f8358c.m2157E();
                }
                AbstractC0610a.m1504f(this.f8357b);
                throw th2;
            }
        }
    }

    @Override // p129o0.InterfaceC2071k
    /* JADX INFO: renamed from: b */
    public final void mo3743b() {
        this.f8362g = true;
    }

    /* JADX INFO: renamed from: c */
    public final C0715l m4441c(long j3) {
        Map map = Collections.EMPTY_MAP;
        this.f8368m.getClass();
        Map map2 = C1923Q.f8373V;
        Uri uri = this.f8356a;
        AbstractC0646n.m1632j(uri, "The uri must be set.");
        return new C0715l(uri, 1, null, map2, j3, -1L, 6);
    }
}

package p114k0;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p036M0.C0380q;
import p055T.AbstractC0558V;
import p064W.AbstractC0646n;
import p070Y.InterfaceC0701A;
import p082b0.C1071l;
import p088d0.C1386j;
import p088d0.C1387k;

/* JADX INFO: renamed from: k0.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1951k extends AbstractC1932a {

    /* JADX INFO: renamed from: h */
    public final HashMap f8539h = new HashMap();

    /* JADX INFO: renamed from: i */
    public Handler f8540i;

    /* JADX INFO: renamed from: j */
    public InterfaceC0701A f8541j;

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: c */
    public final void mo4485c() {
        for (C1950j c1950j : this.f8539h.values()) {
            c1950j.f8536a.m4484b(c1950j.f8537b);
        }
    }

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: e */
    public final void mo4487e() {
        for (C1950j c1950j : this.f8539h.values()) {
            c1950j.f8536a.m4486d(c1950j.f8537b);
        }
    }

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: i */
    public void mo3778i() {
        Iterator it = this.f8539h.values().iterator();
        while (it.hasNext()) {
            ((C1950j) it.next()).f8536a.mo3778i();
        }
    }

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: o */
    public void mo3781o() {
        HashMap map = this.f8539h;
        for (C1950j c1950j : map.values()) {
            c1950j.f8536a.m4492n(c1950j.f8537b);
            C1948i c1948i = c1950j.f8538c;
            AbstractC1932a abstractC1932a = c1950j.f8536a;
            abstractC1932a.m4494q(c1948i);
            abstractC1932a.m4493p(c1948i);
        }
        map.clear();
    }

    /* JADX INFO: renamed from: s */
    public abstract C1907A mo4439s(Object obj, C1907A c1907a);

    /* JADX INFO: renamed from: v */
    public abstract void mo4440v(Object obj, AbstractC1932a abstractC1932a, AbstractC0558V abstractC0558V);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [k0.B, k0.h] */
    /* JADX INFO: renamed from: w */
    public final void m4507w(final Object obj, AbstractC1932a abstractC1932a) {
        HashMap map = this.f8539h;
        AbstractC0646n.m1625c(!map.containsKey(obj));
        ?? r3 = new InterfaceC1908B() { // from class: k0.h
            @Override // p114k0.InterfaceC1908B
            /* JADX INFO: renamed from: a */
            public final void mo2034a(AbstractC1932a abstractC1932a2, AbstractC0558V abstractC0558V) {
                this.f8529a.mo4440v(obj, abstractC1932a2, abstractC0558V);
            }
        };
        C1948i c1948i = new C1948i(this, obj);
        map.put(obj, new C1950j(abstractC1932a, r3, c1948i));
        Handler handler = this.f8540i;
        handler.getClass();
        abstractC1932a.getClass();
        C0380q c0380q = abstractC1932a.f8477c;
        c0380q.getClass();
        C1912F c1912f = new C1912F();
        c1912f.f8329a = handler;
        c1912f.f8330b = c1948i;
        ((CopyOnWriteArrayList) c0380q.f1293j).add(c1912f);
        Handler handler2 = this.f8540i;
        handler2.getClass();
        C1387k c1387k = abstractC1932a.f8478d;
        c1387k.getClass();
        C1386j c1386j = new C1386j();
        c1386j.f6180a = handler2;
        c1386j.f6181b = c1948i;
        c1387k.f6184c.add(c1386j);
        InterfaceC0701A interfaceC0701A = this.f8541j;
        C1071l c1071l = this.f8481g;
        AbstractC0646n.m1631i(c1071l);
        abstractC1932a.m4490j(r3, interfaceC0701A, c1071l);
        if (this.f8476b.isEmpty()) {
            abstractC1932a.m4484b(r3);
        }
    }

    /* JADX INFO: renamed from: t */
    public long mo4503t(long j3, Object obj) {
        return j3;
    }

    /* JADX INFO: renamed from: u */
    public int mo4504u(int i3, Object obj) {
        return i3;
    }
}

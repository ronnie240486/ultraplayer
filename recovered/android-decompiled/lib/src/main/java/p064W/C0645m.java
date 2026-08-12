package p064W;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;
import p046P1.C0471D;
import p055T.C0581m;
import p055T.InterfaceC0551N;

/* JADX INFO: renamed from: W.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0645m {

    /* JADX INFO: renamed from: a */
    public final C0653u f2496a;

    /* JADX INFO: renamed from: b */
    public final C0655w f2497b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0643k f2498c;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArraySet f2499d;

    /* JADX INFO: renamed from: e */
    public final ArrayDeque f2500e;

    /* JADX INFO: renamed from: f */
    public final ArrayDeque f2501f;

    /* JADX INFO: renamed from: g */
    public final Object f2502g;

    /* JADX INFO: renamed from: h */
    public boolean f2503h;

    /* JADX INFO: renamed from: i */
    public final boolean f2504i;

    public C0645m(Looper looper, C0653u c0653u, InterfaceC0643k interfaceC0643k) {
        this(new CopyOnWriteArraySet(), looper, c0653u, interfaceC0643k, true);
    }

    /* JADX INFO: renamed from: a */
    public final void m1616a(Object obj) {
        obj.getClass();
        synchronized (this.f2502g) {
            try {
                if (this.f2503h) {
                    return;
                }
                this.f2499d.add(new C0644l(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1617b() {
        m1622g();
        ArrayDeque arrayDeque = this.f2501f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        C0655w c0655w = this.f2497b;
        if (!c0655w.f2529a.hasMessages(1)) {
            c0655w.getClass();
            C0654v c0654vM1696b = C0655w.m1696b();
            c0654vM1696b.f2527a = c0655w.f2529a.obtainMessage(1);
            c0655w.getClass();
            Message message = c0654vM1696b.f2527a;
            message.getClass();
            c0655w.f2529a.sendMessageAtFrontOfQueue(message);
            c0654vM1696b.m1694a();
        }
        ArrayDeque arrayDeque2 = this.f2500e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1618c(int i3, InterfaceC0642j interfaceC0642j) {
        m1622g();
        this.f2501f.add(new RunnableC0641i(new CopyOnWriteArraySet(this.f2499d), i3, interfaceC0642j, 0));
    }

    /* JADX INFO: renamed from: d */
    public final void m1619d() {
        m1622g();
        synchronized (this.f2502g) {
            this.f2503h = true;
        }
        for (C0644l c0644l : this.f2499d) {
            InterfaceC0643k interfaceC0643k = this.f2498c;
            c0644l.f2495d = true;
            if (c0644l.f2494c) {
                c0644l.f2494c = false;
                interfaceC0643k.mo1279a(c0644l.f2492a, c0644l.f2493b.m1185b());
            }
        }
        this.f2499d.clear();
    }

    /* JADX INFO: renamed from: e */
    public final void m1620e(InterfaceC0551N interfaceC0551N) {
        m1622g();
        CopyOnWriteArraySet<C0644l> copyOnWriteArraySet = this.f2499d;
        for (C0644l c0644l : copyOnWriteArraySet) {
            if (c0644l.f2492a.equals(interfaceC0551N)) {
                c0644l.f2495d = true;
                if (c0644l.f2494c) {
                    c0644l.f2494c = false;
                    C0581m c0581mM1185b = c0644l.f2493b.m1185b();
                    this.f2498c.mo1279a(c0644l.f2492a, c0581mM1185b);
                }
                copyOnWriteArraySet.remove(c0644l);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1621f(int i3, InterfaceC0642j interfaceC0642j) {
        m1618c(i3, interfaceC0642j);
        m1617b();
    }

    /* JADX INFO: renamed from: g */
    public final void m1622g() {
        if (this.f2504i) {
            AbstractC0646n.m1630h(Thread.currentThread() == this.f2497b.f2529a.getLooper().getThread());
        }
    }

    public C0645m(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, C0653u c0653u, InterfaceC0643k interfaceC0643k, boolean z3) {
        this.f2496a = c0653u;
        this.f2499d = copyOnWriteArraySet;
        this.f2498c = interfaceC0643k;
        this.f2502g = new Object();
        this.f2500e = new ArrayDeque();
        this.f2501f = new ArrayDeque();
        this.f2497b = c0653u.m1693a(looper, new Handler.Callback() { // from class: W.h
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                C0645m c0645m = this.f2487g;
                for (C0644l c0644l : c0645m.f2499d) {
                    if (!c0644l.f2495d && c0644l.f2494c) {
                        C0581m c0581mM1185b = c0644l.f2493b.m1185b();
                        c0644l.f2493b = new C0471D();
                        c0644l.f2494c = false;
                        c0645m.f2498c.mo1279a(c0644l.f2492a, c0581mM1185b);
                    }
                    if (c0645m.f2497b.f2529a.hasMessages(1)) {
                        break;
                    }
                }
                return true;
            }
        });
        this.f2504i = z3;
    }
}

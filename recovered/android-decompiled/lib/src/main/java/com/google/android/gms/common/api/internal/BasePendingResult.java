package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p019G1.AbstractC0230e;
import p037M1.InterfaceC0398k;
import p037M1.InterfaceC0399l;
import p040N1.C0419D;
import p040N1.HandlerC0423d;
import p046P1.AbstractC0491s;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasePendingResult<R extends InterfaceC0398k> extends AbstractC0230e {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ int f5501E = 0;

    /* JADX INFO: renamed from: A */
    public InterfaceC0398k f5502A;

    /* JADX INFO: renamed from: B */
    public volatile boolean f5503B;

    /* JADX INFO: renamed from: C */
    public boolean f5504C;

    /* JADX INFO: renamed from: D */
    public boolean f5505D;

    /* JADX INFO: renamed from: y */
    public InterfaceC0399l f5510y;

    /* JADX INFO: renamed from: u */
    public final Object f5506u = new Object();

    /* JADX INFO: renamed from: w */
    public final CountDownLatch f5508w = new CountDownLatch(1);

    /* JADX INFO: renamed from: x */
    public final ArrayList f5509x = new ArrayList();

    /* JADX INFO: renamed from: z */
    public final AtomicReference f5511z = new AtomicReference();

    /* JADX INFO: renamed from: v */
    public final HandlerC0423d f5507v = new HandlerC0423d(Looper.getMainLooper(), 0);

    static {
        new C0419D(0);
    }

    public BasePendingResult() {
        new WeakReference(null);
    }

    /* JADX INFO: renamed from: D */
    public final void m3078D() {
        synchronized (this.f5506u) {
            try {
                if (!this.f5504C && !this.f5503B) {
                    this.f5504C = true;
                    m3085L(mo775E(Status.f5496m));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public abstract InterfaceC0398k mo775E(Status status);

    /* JADX INFO: renamed from: F */
    public final void m3079F(Status status) {
        synchronized (this.f5506u) {
            try {
                if (!m3081H()) {
                    m3082I(mo775E(status));
                    this.f5505D = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final boolean m3080G() {
        boolean z3;
        synchronized (this.f5506u) {
            z3 = this.f5504C;
        }
        return z3;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m3081H() {
        return this.f5508w.getCount() == 0;
    }

    /* JADX INFO: renamed from: I */
    public final void m3082I(InterfaceC0398k interfaceC0398k) {
        synchronized (this.f5506u) {
            try {
                if (this.f5505D || this.f5504C) {
                    return;
                }
                m3081H();
                AbstractC0491s.m1215g("Results have already been set", !m3081H());
                AbstractC0491s.m1215g("Result has already been consumed", !this.f5503B);
                m3085L(interfaceC0398k);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m3083J(InterfaceC0399l interfaceC0399l) {
        synchronized (this.f5506u) {
            try {
                if (interfaceC0399l == null) {
                    this.f5510y = null;
                    return;
                }
                AbstractC0491s.m1215g("Result has already been consumed.", !this.f5503B);
                if (m3080G()) {
                    return;
                }
                if (m3081H()) {
                    HandlerC0423d handlerC0423d = this.f5507v;
                    InterfaceC0398k interfaceC0398kM3084K = m3084K();
                    handlerC0423d.getClass();
                    handlerC0423d.sendMessage(handlerC0423d.obtainMessage(1, new Pair(interfaceC0399l, interfaceC0398kM3084K)));
                } else {
                    this.f5510y = interfaceC0399l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final InterfaceC0398k m3084K() {
        InterfaceC0398k interfaceC0398k;
        synchronized (this.f5506u) {
            AbstractC0491s.m1215g("Result has already been consumed.", !this.f5503B);
            AbstractC0491s.m1215g("Result is not ready.", m3081H());
            interfaceC0398k = this.f5502A;
            this.f5502A = null;
            this.f5510y = null;
            this.f5503B = true;
        }
        if (this.f5511z.getAndSet(null) != null) {
            throw new ClassCastException();
        }
        AbstractC0491s.m1213e(interfaceC0398k);
        return interfaceC0398k;
    }

    /* JADX INFO: renamed from: L */
    public final void m3085L(InterfaceC0398k interfaceC0398k) {
        this.f5502A = interfaceC0398k;
        interfaceC0398k.getClass();
        this.f5508w.countDown();
        if (this.f5504C) {
            this.f5510y = null;
        } else {
            InterfaceC0399l interfaceC0399l = this.f5510y;
            if (interfaceC0399l != null) {
                HandlerC0423d handlerC0423d = this.f5507v;
                handlerC0423d.removeMessages(2);
                handlerC0423d.sendMessage(handlerC0423d.obtainMessage(1, new Pair(interfaceC0399l, m3084K())));
            }
        }
        ArrayList arrayList = this.f5509x;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }
}

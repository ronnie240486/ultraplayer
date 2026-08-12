package p028J1;

import java.util.concurrent.atomic.AtomicReference;
import p013E1.C0129d;
import p013E1.RunnableC0121D;
import p013E1.RunnableC0123F;
import p046P1.HandlerC0492t;
import p075Z1.HandlerC0784e;

/* JADX INFO: renamed from: J1.w */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0317w extends AbstractBinderC0301g {

    /* JADX INFO: renamed from: c */
    public final AtomicReference f849c;

    /* JADX INFO: renamed from: d */
    public final HandlerC0784e f850d;

    public BinderC0317w(C0318x c0318x) {
        this.f849c = new AtomicReference(c0318x);
        this.f850d = new HandlerC0784e(c0318x.f5517d, 3);
    }

    @Override // p028J1.InterfaceC0302h
    /* JADX INFO: renamed from: F */
    public final void mo566F(int i3) {
        C0318x c0318x = null;
        C0318x c0318x2 = (C0318x) this.f849c.getAndSet(null);
        if (c0318x2 != null) {
            c0318x2.f866M = -1;
            c0318x2.f867N = -1;
            c0318x2.f872z = null;
            c0318x2.f860G = null;
            c0318x2.f864K = 0.0d;
            c0318x2.m866D();
            c0318x2.f861H = false;
            c0318x2.f865L = null;
            c0318x = c0318x2;
        }
        if (c0318x == null) {
            return;
        }
        C0318x.f851S.m831b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i3));
        if (i3 != 0) {
            int i4 = c0318x.f5536w.get();
            HandlerC0492t handlerC0492t = c0318x.f5519f;
            handlerC0492t.sendMessage(handlerC0492t.obtainMessage(6, i4, 2));
        }
    }

    @Override // p028J1.InterfaceC0302h
    /* JADX INFO: renamed from: K */
    public final void mo567K(String str, String str2) {
        int i3 = 1;
        C0318x c0318x = (C0318x) this.f849c.get();
        if (c0318x == null) {
            return;
        }
        C0318x.f851S.m831b("Receive (type=text, ns=%s) %s", str, str2);
        this.f850d.post(new RunnableC0123F(c0318x, str, str2, i3));
    }

    @Override // p028J1.InterfaceC0302h
    /* JADX INFO: renamed from: S */
    public final void mo568S(int i3, long j3) {
        C0318x c0318x = (C0318x) this.f849c.get();
        if (c0318x == null) {
            return;
        }
        C0318x.m864B(c0318x, j3);
    }

    @Override // p028J1.InterfaceC0302h
    /* JADX INFO: renamed from: X */
    public final void mo569X(int i3) {
        if (((C0318x) this.f849c.get()) == null) {
            return;
        }
        synchronized (C0318x.f852T) {
        }
    }

    @Override // p028J1.InterfaceC0302h
    /* JADX INFO: renamed from: a0 */
    public final void mo570a0(C0129d c0129d, String str, String str2, boolean z3) {
        C0318x c0318x = (C0318x) this.f849c.get();
        if (c0318x == null) {
            return;
        }
        c0318x.f872z = c0129d;
        c0318x.f868O = c0129d.f231g;
        c0318x.f869P = str2;
        c0318x.f860G = str;
        synchronized (C0318x.f852T) {
        }
    }

    @Override // p028J1.InterfaceC0302h
    /* JADX INFO: renamed from: d */
    public final void mo571d(int i3) {
        if (((C0318x) this.f849c.get()) == null) {
            return;
        }
        synchronized (C0318x.f853U) {
        }
    }

    @Override // p028J1.InterfaceC0302h
    /* JADX INFO: renamed from: d0 */
    public final void mo572d0(String str, byte[] bArr) {
        if (((C0318x) this.f849c.get()) == null) {
            return;
        }
        C0318x.f851S.m831b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // p028J1.InterfaceC0302h
    /* JADX INFO: renamed from: f */
    public final void mo573f(int i3) {
        if (((C0318x) this.f849c.get()) == null) {
            return;
        }
        synchronized (C0318x.f853U) {
        }
    }

    @Override // p028J1.InterfaceC0302h
    /* JADX INFO: renamed from: h0 */
    public final void mo574h0(C0297c c0297c) {
        C0318x c0318x = (C0318x) this.f849c.get();
        if (c0318x == null) {
            return;
        }
        C0318x.f851S.m831b("onApplicationStatusChanged", new Object[0]);
        this.f850d.post(new RunnableC0121D(c0318x, 3, c0297c));
    }

    @Override // p028J1.InterfaceC0302h
    /* JADX INFO: renamed from: i */
    public final void mo575i() {
        C0318x.f851S.m831b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override // p028J1.InterfaceC0302h
    /* JADX INFO: renamed from: j0 */
    public final void mo576j0(long j3) {
        C0318x c0318x = (C0318x) this.f849c.get();
        if (c0318x == null) {
            return;
        }
        C0318x.m864B(c0318x, j3);
    }

    @Override // p028J1.InterfaceC0302h
    /* JADX INFO: renamed from: k */
    public final void mo577k(int i3) {
        C0318x c0318x = (C0318x) this.f849c.get();
        if (c0318x == null) {
            return;
        }
        c0318x.f868O = null;
        c0318x.f869P = null;
        synchronized (C0318x.f853U) {
        }
        if (c0318x.f855B != null) {
            this.f850d.post(new RunnableC0316v(i3, 0, c0318x));
        }
    }

    @Override // p028J1.InterfaceC0302h
    /* JADX INFO: renamed from: m */
    public final void mo578m(C0298d c0298d) {
        C0318x c0318x = (C0318x) this.f849c.get();
        if (c0318x == null) {
            return;
        }
        C0318x.f851S.m831b("onDeviceStatusChanged", new Object[0]);
        this.f850d.post(new RunnableC0121D(c0318x, 2, c0298d));
    }

    @Override // p028J1.InterfaceC0302h
    /* JADX INFO: renamed from: D */
    public final void mo565D(int i3) {
    }

    @Override // p028J1.InterfaceC0302h
    /* JADX INFO: renamed from: y */
    public final void mo579y(int i3) {
    }
}

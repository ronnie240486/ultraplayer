package p013E1;

import com.google.android.gms.common.api.Status;
import p028J1.AbstractBinderC0301g;
import p028J1.C0297c;
import p028J1.C0298d;
import p028J1.C0315u;
import p097f2.C1560d;

/* JADX INFO: renamed from: E1.G */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0124G extends AbstractBinderC0301g {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0125H f180c;

    public BinderC0124G(C0125H c0125h) {
        this.f180c = c0125h;
    }

    @Override // p028J1.InterfaceC0302h
    /* JADX INFO: renamed from: D */
    public final void mo565D(int i3) {
        C0125H.m582j(this.f180c).post(new RunnableC0122E(this, i3, 1));
    }

    @Override // p028J1.InterfaceC0302h
    /* JADX INFO: renamed from: F */
    public final void mo566F(int i3) {
        C0125H.m582j(this.f180c).post(new RunnableC0122E(this, i3, 0));
    }

    @Override // p028J1.InterfaceC0302h
    /* JADX INFO: renamed from: K */
    public final void mo567K(String str, String str2) {
        C0125H.f181F.m831b("Receive (type=text, ns=%s) %s", str, str2);
        C0125H.m582j(this.f180c).post(new RunnableC0123F(this, str, str2, 0));
    }

    @Override // p028J1.InterfaceC0302h
    /* JADX INFO: renamed from: S */
    public final void mo568S(int i3, long j3) {
        C0125H.m580d(this.f180c, j3, i3);
    }

    @Override // p028J1.InterfaceC0302h
    /* JADX INFO: renamed from: X */
    public final void mo569X(int i3) {
        this.f180c.m585h(i3);
    }

    @Override // p028J1.InterfaceC0302h
    /* JADX INFO: renamed from: a0 */
    public final void mo570a0(C0129d c0129d, String str, String str2, boolean z3) {
        C0125H c0125h = this.f180c;
        c0125h.f197s = c0129d;
        c0125h.f198t = str;
        C0315u c0315u = new C0315u(new Status(0, null, null, null), c0129d, str, str2, z3);
        synchronized (c0125h.f195q) {
            try {
                C1560d c1560d = c0125h.f192n;
                if (c1560d != null) {
                    c1560d.m3879b(c0315u);
                }
                c0125h.f192n = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p028J1.InterfaceC0302h
    /* JADX INFO: renamed from: d */
    public final void mo571d(int i3) {
        C0125H.m581e(this.f180c, i3);
    }

    @Override // p028J1.InterfaceC0302h
    /* JADX INFO: renamed from: d0 */
    public final void mo572d0(String str, byte[] bArr) {
        C0125H.f181F.m831b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // p028J1.InterfaceC0302h
    /* JADX INFO: renamed from: f */
    public final void mo573f(int i3) {
        C0125H.m581e(this.f180c, i3);
    }

    @Override // p028J1.InterfaceC0302h
    /* JADX INFO: renamed from: h0 */
    public final void mo574h0(C0297c c0297c) {
        C0125H.m582j(this.f180c).post(new RunnableC0121D(this, 1, c0297c));
    }

    @Override // p028J1.InterfaceC0302h
    /* JADX INFO: renamed from: i */
    public final void mo575i() {
        C0125H.f181F.m831b("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }

    @Override // p028J1.InterfaceC0302h
    /* JADX INFO: renamed from: j0 */
    public final void mo576j0(long j3) {
        C0125H.m580d(this.f180c, j3, 0);
    }

    @Override // p028J1.InterfaceC0302h
    /* JADX INFO: renamed from: k */
    public final void mo577k(int i3) {
        C0125H c0125h = this.f180c;
        C0125H.m581e(c0125h, i3);
        if (c0125h.f185C != null) {
            C0125H.m582j(c0125h).post(new RunnableC0122E(this, i3, 2));
        }
    }

    @Override // p028J1.InterfaceC0302h
    /* JADX INFO: renamed from: m */
    public final void mo578m(C0298d c0298d) {
        C0125H.m582j(this.f180c).post(new RunnableC0121D(this, 0, c0298d));
    }

    @Override // p028J1.InterfaceC0302h
    /* JADX INFO: renamed from: y */
    public final void mo579y(int i3) {
        C0125H.m582j(this.f180c).post(new RunnableC0122E(this, i3, 3));
    }
}

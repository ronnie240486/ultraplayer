package p078a1;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import p055T.C0587s;
import p064W.C0651s;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1692X;
import p145s0.C2222A;
import p145s0.C2237j;
import p145s0.InterfaceC2240m;
import p145s0.InterfaceC2241n;
import p145s0.InterfaceC2242o;

/* JADX INFO: renamed from: a1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0851a implements InterfaceC2240m {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3611a;

    /* JADX INFO: renamed from: b */
    public final C0651s f3612b;

    /* JADX INFO: renamed from: c */
    public final C2222A f3613c;

    public C0851a(int i3) {
        this.f3611a = i3;
        switch (i3) {
            case 1:
                this.f3612b = new C0651s(4);
                this.f3613c = new C2222A("image/avif", -1, -1);
                break;
            case 2:
                this.f3612b = new C0651s(4);
                this.f3613c = new C2222A("image/heif", -1, -1);
                break;
            default:
                this.f3612b = new C0651s(4);
                this.f3613c = new C2222A("image/webp", -1, -1);
                break;
        }
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: a */
    public final void mo325a() {
        int i3 = this.f3611a;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: c */
    public final InterfaceC2240m mo327c() {
        int i3 = this.f3611a;
        return this;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: e */
    public final int mo328e(InterfaceC2241n interfaceC2241n, C0587s c0587s) {
        switch (this.f3611a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f3613c.mo328e(interfaceC2241n, c0587s);
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: f */
    public final boolean mo329f(InterfaceC2241n interfaceC2241n) throws EOFException, InterruptedIOException {
        switch (this.f3611a) {
            case 0:
                C0651s c0651s = this.f3612b;
                c0651s.m1662D(4);
                C2237j c2237j = (C2237j) interfaceC2241n;
                c2237j.mo338i(c0651s.f2520a, 0, 4, false);
                if (c0651s.m1689w() != 1380533830) {
                    return false;
                }
                c2237j.m4831b(4, false);
                c0651s.m1662D(4);
                c2237j.mo338i(c0651s.f2520a, 0, 4, false);
                return c0651s.m1689w() == 1464156752;
            case 1:
                C2237j c2237j2 = (C2237j) interfaceC2241n;
                c2237j2.m4831b(4, false);
                C0651s c0651s2 = this.f3612b;
                c0651s2.m1662D(4);
                c2237j2.mo338i(c0651s2.f2520a, 0, 4, false);
                if (c0651s2.m1689w() != 1718909296) {
                    return false;
                }
                c0651s2.m1662D(4);
                c2237j2.mo338i(c0651s2.f2520a, 0, 4, false);
                return c0651s2.m1689w() == ((long) 1635150182);
            default:
                C2237j c2237j3 = (C2237j) interfaceC2241n;
                c2237j3.m4831b(4, false);
                C0651s c0651s3 = this.f3612b;
                c0651s3.m1662D(4);
                c2237j3.mo338i(c0651s3.f2520a, 0, 4, false);
                if (c0651s3.m1689w() != 1718909296) {
                    return false;
                }
                c0651s3.m1662D(4);
                c2237j3.mo338i(c0651s3.f2520a, 0, 4, false);
                return c0651s3.m1689w() == ((long) 1751476579);
        }
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: h */
    public final void mo330h(InterfaceC2242o interfaceC2242o) {
        switch (this.f3611a) {
            case 0:
                this.f3613c.mo330h(interfaceC2242o);
                break;
            case 1:
                this.f3613c.mo330h(interfaceC2242o);
                break;
            default:
                this.f3613c.mo330h(interfaceC2242o);
                break;
        }
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: j */
    public final void mo331j(long j3, long j4) {
        switch (this.f3611a) {
            case 0:
                this.f3613c.mo331j(j3, j4);
                break;
            case 1:
                this.f3613c.mo331j(j3, j4);
                break;
            default:
                this.f3613c.mo331j(j3, j4);
                break;
        }
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: m */
    public final List mo332m() {
        switch (this.f3611a) {
            case 0:
                C1674E c1674e = AbstractC1676G.f7601h;
                break;
            case 1:
                C1674E c1674e2 = AbstractC1676G.f7601h;
                break;
            default:
                C1674E c1674e3 = AbstractC1676G.f7601h;
                break;
        }
        return C1692X.f7629k;
    }

    /* JADX INFO: renamed from: b */
    private final void m2111b() {
    }

    /* JADX INFO: renamed from: d */
    private final void m2112d() {
    }

    /* JADX INFO: renamed from: g */
    private final void m2113g() {
    }
}

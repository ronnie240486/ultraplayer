package p042O0;

import java.util.List;
import p001A0.C0067a;
import p055T.C0587s;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1692X;
import p145s0.C2222A;
import p145s0.InterfaceC2240m;
import p145s0.InterfaceC2241n;
import p145s0.InterfaceC2242o;

/* JADX INFO: renamed from: O0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0447a implements InterfaceC2240m {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1508a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2240m f1509b;

    public C0447a(int i3, byte b3) {
        this.f1508a = i3;
        switch (i3) {
            case 1:
                this.f1509b = new C2222A("image/bmp", 16973, 2);
                break;
            default:
                this.f1509b = new C2222A("image/png", 35152, 2);
                break;
        }
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: a */
    public final void mo325a() {
        switch (this.f1508a) {
            case 0:
            case 1:
                break;
            default:
                this.f1509b.mo325a();
                break;
        }
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: c */
    public final InterfaceC2240m mo327c() {
        int i3 = this.f1508a;
        return this;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: e */
    public final int mo328e(InterfaceC2241n interfaceC2241n, C0587s c0587s) {
        switch (this.f1508a) {
            case 0:
                return ((C2222A) this.f1509b).mo328e(interfaceC2241n, c0587s);
            case 1:
                return ((C2222A) this.f1509b).mo328e(interfaceC2241n, c0587s);
            default:
                return this.f1509b.mo328e(interfaceC2241n, c0587s);
        }
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: f */
    public final boolean mo329f(InterfaceC2241n interfaceC2241n) {
        switch (this.f1508a) {
            case 0:
                return ((C2222A) this.f1509b).mo329f(interfaceC2241n);
            case 1:
                return ((C2222A) this.f1509b).mo329f(interfaceC2241n);
            default:
                return this.f1509b.mo329f(interfaceC2241n);
        }
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: h */
    public final void mo330h(InterfaceC2242o interfaceC2242o) {
        switch (this.f1508a) {
            case 0:
                ((C2222A) this.f1509b).mo330h(interfaceC2242o);
                break;
            case 1:
                ((C2222A) this.f1509b).mo330h(interfaceC2242o);
                break;
            default:
                this.f1509b.mo330h(interfaceC2242o);
                break;
        }
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: j */
    public final void mo331j(long j3, long j4) {
        switch (this.f1508a) {
            case 0:
                ((C2222A) this.f1509b).mo331j(j3, j4);
                break;
            case 1:
                ((C2222A) this.f1509b).mo331j(j3, j4);
                break;
            default:
                this.f1509b.mo331j(j3, j4);
                break;
        }
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: m */
    public final List mo332m() {
        switch (this.f1508a) {
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

    public C0447a(int i3) {
        this.f1508a = 2;
        if ((i3 & 1) != 0) {
            this.f1509b = new C2222A("image/jpeg", 65496, 2);
        } else {
            this.f1509b = new C0067a();
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m1155b() {
    }

    /* JADX INFO: renamed from: d */
    private final void m1156d() {
    }
}

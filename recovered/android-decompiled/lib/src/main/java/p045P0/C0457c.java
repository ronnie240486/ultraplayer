package p045P0;

import java.util.List;
import p011E.C0111d;
import p048Q0.AbstractC0511j;
import p073Z.AbstractC0772g;
import p099g0.C1572b;

/* JADX INFO: renamed from: P0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0457c extends AbstractC0772g implements InterfaceC0458d {

    /* JADX INFO: renamed from: k */
    public InterfaceC0458d f1527k;

    /* JADX INFO: renamed from: l */
    public long f1528l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f1529m = 1;

    /* JADX INFO: renamed from: n */
    public Object f1530n;

    public /* synthetic */ C0457c() {
    }

    @Override // p045P0.InterfaceC0458d
    /* JADX INFO: renamed from: d */
    public final int mo156d(long j3) {
        InterfaceC0458d interfaceC0458d = this.f1527k;
        interfaceC0458d.getClass();
        return interfaceC0458d.mo156d(j3 - this.f1528l);
    }

    @Override // p073Z.AbstractC0772g
    /* JADX INFO: renamed from: e */
    public final void mo1158e() {
        this.f2573h = 0;
        this.f3149i = 0L;
        this.f3150j = false;
        this.f1527k = null;
    }

    @Override // p073Z.AbstractC0772g
    /* JADX INFO: renamed from: f */
    public final void mo1159f() {
        switch (this.f1529m) {
            case 0:
                ((C1572b) this.f1530n).m3910m(this);
                break;
            default:
                C0111d c0111d = (C0111d) this.f1530n;
                c0111d.getClass();
                AbstractC0511j abstractC0511j = (AbstractC0511j) c0111d.f148h;
                abstractC0511j.getClass();
                mo1158e();
                abstractC0511j.f1747b.add(this);
                break;
        }
    }

    @Override // p045P0.InterfaceC0458d
    /* JADX INFO: renamed from: g */
    public final List mo159g(long j3) {
        InterfaceC0458d interfaceC0458d = this.f1527k;
        interfaceC0458d.getClass();
        return interfaceC0458d.mo159g(j3 - this.f1528l);
    }

    @Override // p045P0.InterfaceC0458d
    /* JADX INFO: renamed from: k */
    public final long mo163k(int i3) {
        InterfaceC0458d interfaceC0458d = this.f1527k;
        interfaceC0458d.getClass();
        return interfaceC0458d.mo163k(i3) + this.f1528l;
    }

    @Override // p045P0.InterfaceC0458d
    /* JADX INFO: renamed from: n */
    public final int mo166n() {
        InterfaceC0458d interfaceC0458d = this.f1527k;
        interfaceC0458d.getClass();
        return interfaceC0458d.mo166n();
    }

    public C0457c(C1572b c1572b) {
        this.f1530n = c1572b;
    }
}

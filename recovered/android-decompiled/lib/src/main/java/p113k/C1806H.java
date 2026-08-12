package p113k;

import p110j.InterfaceC1757C;

/* JADX INFO: renamed from: k.H */
/* JADX INFO: loaded from: classes.dex */
public final class C1806H extends AbstractViewOnTouchListenerC1896u0 {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C1818N f8032p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C1824Q f8033q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1806H(C1824Q c1824q, C1824Q c1824q2, C1818N c1818n) {
        super(c1824q2);
        this.f8033q = c1824q;
        this.f8032p = c1818n;
    }

    @Override // p113k.AbstractViewOnTouchListenerC1896u0
    /* JADX INFO: renamed from: b */
    public final InterfaceC1757C mo4238b() {
        return this.f8032p;
    }

    @Override // p113k.AbstractViewOnTouchListenerC1896u0
    /* JADX INFO: renamed from: c */
    public final boolean mo4239c() {
        C1824Q c1824q = this.f8033q;
        if (c1824q.getInternalPopup().mo4306b()) {
            return true;
        }
        c1824q.f8080l.mo4308e(c1824q.getTextDirection(), c1824q.getTextAlignment());
        return true;
    }
}

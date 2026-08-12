package p128o;

/* JADX INFO: renamed from: o.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2058i extends AbstractC2056g {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C2059j f8952n;

    public C2058i(C2059j c2059j) {
        this.f8952n = c2059j;
    }

    @Override // p128o.AbstractC2056g
    /* JADX INFO: renamed from: f */
    public final String mo4625f() {
        C2057h c2057h = (C2057h) this.f8952n.f8953g.get();
        if (c2057h == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + c2057h.f8948a + "]";
    }
}

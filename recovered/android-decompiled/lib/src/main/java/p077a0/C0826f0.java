package p077a0;

import p055T.AbstractC0558V;
import p055T.C0539B;
import p055T.C0556T;
import p055T.C0557U;
import p055T.C0565b;
import p055T.C0593y;
import p114k0.AbstractC1956p;

/* JADX INFO: renamed from: a0.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0826f0 extends AbstractC1956p {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f3475c = 0;

    /* JADX INFO: renamed from: d */
    public final Object f3476d;

    public C0826f0(AbstractC0558V abstractC0558V, C0539B c0539b) {
        super(abstractC0558V);
        this.f3476d = c0539b;
    }

    @Override // p114k0.AbstractC1956p, p055T.AbstractC0558V
    /* JADX INFO: renamed from: f */
    public C0556T mo1329f(int i3, C0556T c0556t, boolean z3) {
        switch (this.f3475c) {
            case 0:
                AbstractC0558V abstractC0558V = this.f8557b;
                C0556T c0556tMo1329f = abstractC0558V.mo1329f(i3, c0556t, z3);
                if (abstractC0558V.mo1332m(c0556tMo1329f.f1968c, (C0557U) this.f3476d, 0L).m1404a()) {
                    c0556tMo1329f.m1403h(c0556t.f1966a, c0556t.f1967b, c0556t.f1968c, c0556t.f1969d, c0556t.f1970e, C0565b.f2043c, true);
                } else {
                    c0556tMo1329f.f1971f = true;
                }
                return c0556tMo1329f;
            default:
                return super.mo1329f(i3, c0556t, z3);
        }
    }

    @Override // p114k0.AbstractC1956p, p055T.AbstractC0558V
    /* JADX INFO: renamed from: m */
    public C0557U mo1332m(int i3, C0557U c0557u, long j3) {
        switch (this.f3475c) {
            case 1:
                super.mo1332m(i3, c0557u, j3);
                C0539B c0539b = (C0539B) this.f3476d;
                c0557u.f1977c = c0539b;
                C0593y c0593y = c0539b.f1875b;
                c0557u.getClass();
                return c0557u;
            default:
                return super.mo1332m(i3, c0557u, j3);
        }
    }

    public C0826f0(AbstractC0558V abstractC0558V) {
        super(abstractC0558V);
        this.f3476d = new C0557U();
    }
}

package p114k0;

import java.util.ArrayList;
import p055T.AbstractC0558V;
import p055T.C0557U;
import p064W.AbstractC0646n;
import p129o0.C2065e;

/* JADX INFO: renamed from: k0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1944g extends AbstractC1949i0 {

    /* JADX INFO: renamed from: l */
    public final long f8517l;

    /* JADX INFO: renamed from: m */
    public final boolean f8518m;

    /* JADX INFO: renamed from: n */
    public final ArrayList f8519n;

    /* JADX INFO: renamed from: o */
    public final C0557U f8520o;

    /* JADX INFO: renamed from: p */
    public C1940e f8521p;

    /* JADX INFO: renamed from: q */
    public C1942f f8522q;

    /* JADX INFO: renamed from: r */
    public long f8523r;

    /* JADX INFO: renamed from: s */
    public long f8524s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1944g(AbstractC1932a abstractC1932a, long j3, boolean z3) {
        super(abstractC1932a);
        abstractC1932a.getClass();
        this.f8517l = j3;
        this.f8518m = z3;
        this.f8519n = new ArrayList();
        this.f8520o = new C0557U();
    }

    /* JADX INFO: renamed from: B */
    public final void m4497B(AbstractC0558V abstractC0558V) {
        long j3;
        C0557U c0557u = this.f8520o;
        abstractC0558V.m1414n(0, c0557u);
        long j4 = c0557u.f1990p;
        C1940e c1940e = this.f8521p;
        ArrayList arrayList = this.f8519n;
        long j5 = this.f8517l;
        if (c1940e == null || arrayList.isEmpty()) {
            this.f8523r = j4;
            this.f8524s = j5 != Long.MIN_VALUE ? j4 + j5 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1938d c1938d = (C1938d) arrayList.get(i3);
                long j6 = this.f8523r;
                long j7 = this.f8524s;
                c1938d.f8492k = j6;
                c1938d.f8493l = j7;
            }
            j3 = 0;
        } else {
            j3 = this.f8523r - j4;
            j5 = j5 == Long.MIN_VALUE ? Long.MIN_VALUE : this.f8524s - j4;
        }
        try {
            C1940e c1940e2 = new C1940e(abstractC0558V, j3, j5);
            this.f8521p = c1940e2;
            m4491l(c1940e2);
        } catch (C1942f e3) {
            this.f8522q = e3;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                ((C1938d) arrayList.get(i4)).f8494m = this.f8522q;
            }
        }
    }

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: a */
    public final InterfaceC1965y mo3776a(C1907A c1907a, C2065e c2065e, long j3) {
        C1938d c1938d = new C1938d(this.f8535k.mo3776a(c1907a, c2065e, j3), this.f8518m, this.f8523r, this.f8524s);
        this.f8519n.add(c1938d);
        return c1938d;
    }

    @Override // p114k0.AbstractC1951k, p114k0.AbstractC1932a
    /* JADX INFO: renamed from: i */
    public final void mo3778i() throws C1942f {
        C1942f c1942f = this.f8522q;
        if (c1942f != null) {
            throw c1942f;
        }
        super.mo3778i();
    }

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: m */
    public final void mo3780m(InterfaceC1965y interfaceC1965y) {
        ArrayList arrayList = this.f8519n;
        AbstractC0646n.m1630h(arrayList.remove(interfaceC1965y));
        this.f8535k.mo3780m(((C1938d) interfaceC1965y).f8488g);
        if (arrayList.isEmpty()) {
            C1940e c1940e = this.f8521p;
            c1940e.getClass();
            m4497B(c1940e.f8557b);
        }
    }

    @Override // p114k0.AbstractC1951k, p114k0.AbstractC1932a
    /* JADX INFO: renamed from: o */
    public final void mo3781o() {
        super.mo3781o();
        this.f8522q = null;
        this.f8521p = null;
    }

    @Override // p114k0.AbstractC1949i0
    /* JADX INFO: renamed from: y */
    public final void mo4498y(AbstractC0558V abstractC0558V) {
        if (this.f8522q != null) {
            return;
        }
        m4497B(abstractC0558V);
    }
}

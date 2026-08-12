package p114k0;

import java.util.Objects;
import p055T.AbstractC0558V;
import p055T.C0556T;
import p055T.C0557U;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: k0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1960t extends AbstractC1956p {

    /* JADX INFO: renamed from: e */
    public static final Object f8572e = new Object();

    /* JADX INFO: renamed from: c */
    public final Object f8573c;

    /* JADX INFO: renamed from: d */
    public final Object f8574d;

    public C1960t(AbstractC0558V abstractC0558V, Object obj, Object obj2) {
        super(abstractC0558V);
        this.f8573c = obj;
        this.f8574d = obj2;
    }

    @Override // p114k0.AbstractC1956p, p055T.AbstractC0558V
    /* JADX INFO: renamed from: b */
    public final int mo1328b(Object obj) {
        Object obj2;
        if (f8572e.equals(obj) && (obj2 = this.f8574d) != null) {
            obj = obj2;
        }
        return this.f8557b.mo1328b(obj);
    }

    @Override // p114k0.AbstractC1956p, p055T.AbstractC0558V
    /* JADX INFO: renamed from: f */
    public final C0556T mo1329f(int i3, C0556T c0556t, boolean z3) {
        this.f8557b.mo1329f(i3, c0556t, z3);
        if (Objects.equals(c0556t.f1967b, this.f8574d) && z3) {
            c0556t.f1967b = f8572e;
        }
        return c0556t;
    }

    @Override // p114k0.AbstractC1956p, p055T.AbstractC0558V
    /* JADX INFO: renamed from: l */
    public final Object mo1331l(int i3) {
        Object objMo1331l = this.f8557b.mo1331l(i3);
        int i4 = AbstractC0632A.f2454a;
        return Objects.equals(objMo1331l, this.f8574d) ? f8572e : objMo1331l;
    }

    @Override // p114k0.AbstractC1956p, p055T.AbstractC0558V
    /* JADX INFO: renamed from: m */
    public final C0557U mo1332m(int i3, C0557U c0557u, long j3) {
        this.f8557b.mo1332m(i3, c0557u, j3);
        if (Objects.equals(c0557u.f1975a, this.f8573c)) {
            c0557u.f1975a = C0557U.f1973q;
        }
        return c0557u;
    }
}

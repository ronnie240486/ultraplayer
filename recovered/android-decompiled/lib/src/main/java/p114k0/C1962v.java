package p114k0;

import android.util.Pair;
import p055T.AbstractC0558V;
import p055T.C0539B;
import p055T.C0556T;
import p055T.C0557U;
import p064W.AbstractC0646n;
import p077a0.C0826f0;
import p129o0.C2065e;

/* JADX INFO: renamed from: k0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1962v extends AbstractC1949i0 {

    /* JADX INFO: renamed from: l */
    public final boolean f8576l;

    /* JADX INFO: renamed from: m */
    public final C0557U f8577m;

    /* JADX INFO: renamed from: n */
    public final C0556T f8578n;

    /* JADX INFO: renamed from: o */
    public C1960t f8579o;

    /* JADX INFO: renamed from: p */
    public C1959s f8580p;

    /* JADX INFO: renamed from: q */
    public boolean f8581q;

    /* JADX INFO: renamed from: r */
    public boolean f8582r;

    /* JADX INFO: renamed from: s */
    public boolean f8583s;

    public C1962v(AbstractC1932a abstractC1932a, boolean z3) {
        super(abstractC1932a);
        this.f8576l = z3 && abstractC1932a.mo4489h();
        this.f8577m = new C0557U();
        this.f8578n = new C0556T();
        AbstractC0558V abstractC0558VMo4488f = abstractC1932a.mo4488f();
        if (abstractC0558VMo4488f == null) {
            this.f8579o = new C1960t(new C1961u(abstractC1932a.mo3777g()), C0557U.f1973q, C1960t.f8572e);
        } else {
            this.f8579o = new C1960t(abstractC0558VMo4488f, null, null);
            this.f8583s = true;
        }
    }

    @Override // p114k0.AbstractC1949i0
    /* JADX INFO: renamed from: A */
    public final void mo4502A() {
        if (this.f8576l) {
            return;
        }
        this.f8581q = true;
        m4506z();
    }

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final C1959s mo3776a(C1907A c1907a, C2065e c2065e, long j3) {
        C1959s c1959s = new C1959s(c1907a, c2065e, j3);
        AbstractC0646n.m1630h(c1959s.f8568j == null);
        c1959s.f8568j = this.f8535k;
        if (!this.f8582r) {
            this.f8580p = c1959s;
            if (!this.f8581q) {
                this.f8581q = true;
                m4506z();
            }
            return c1959s;
        }
        Object obj = this.f8579o.f8574d;
        Object obj2 = c1907a.f8311a;
        if (obj != null && obj2.equals(C1960t.f8572e)) {
            obj2 = this.f8579o.f8574d;
        }
        c1959s.m4509b(c1907a.m4421a(obj2));
        return c1959s;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m4511C(long j3) {
        C1959s c1959s = this.f8580p;
        int iMo1328b = this.f8579o.mo1328b(c1959s.f8565g.f8311a);
        if (iMo1328b == -1) {
            return false;
        }
        C1960t c1960t = this.f8579o;
        C0556T c0556t = this.f8578n;
        c1960t.mo1329f(iMo1328b, c0556t, false);
        long j4 = c0556t.f1969d;
        if (j4 != -9223372036854775807L && j3 >= j4) {
            j3 = Math.max(0L, j4 - 1);
        }
        c1959s.f8571m = j3;
        return true;
    }

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: m */
    public final void mo3780m(InterfaceC1965y interfaceC1965y) {
        C1959s c1959s = (C1959s) interfaceC1965y;
        if (c1959s.f8569k != null) {
            AbstractC1932a abstractC1932a = c1959s.f8568j;
            abstractC1932a.getClass();
            abstractC1932a.mo3780m(c1959s.f8569k);
        }
        if (interfaceC1965y == this.f8580p) {
            this.f8580p = null;
        }
    }

    @Override // p114k0.AbstractC1951k, p114k0.AbstractC1932a
    /* JADX INFO: renamed from: o */
    public final void mo3781o() {
        this.f8582r = false;
        this.f8581q = false;
        super.mo3781o();
    }

    @Override // p114k0.AbstractC1949i0, p114k0.AbstractC1932a
    /* JADX INFO: renamed from: r */
    public final void mo3782r(C0539B c0539b) {
        if (this.f8583s) {
            C1960t c1960t = this.f8579o;
            this.f8579o = new C1960t(new C0826f0(this.f8579o.f8557b, c0539b), c1960t.f8573c, c1960t.f8574d);
        } else {
            this.f8579o = new C1960t(new C1961u(c0539b), C0557U.f1973q, C1960t.f8572e);
        }
        this.f8535k.mo3782r(c0539b);
    }

    @Override // p114k0.AbstractC1949i0
    /* JADX INFO: renamed from: x */
    public final C1907A mo4505x(C1907A c1907a) {
        Object obj = c1907a.f8311a;
        Object obj2 = this.f8579o.f8574d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = C1960t.f8572e;
        }
        return c1907a.m4421a(obj);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // p114k0.AbstractC1949i0
    /* JADX INFO: renamed from: y */
    public final void mo4498y(AbstractC0558V abstractC0558V) {
        long j3;
        C1960t c1960t;
        C1907A c1907aM4421a;
        C1960t c1960t2;
        if (this.f8582r) {
            C1960t c1960t3 = this.f8579o;
            this.f8579o = new C1960t(abstractC0558V, c1960t3.f8573c, c1960t3.f8574d);
            C1959s c1959s = this.f8580p;
            if (c1959s != null) {
                m4511C(c1959s.f8571m);
            }
        } else {
            if (!abstractC0558V.m1415p()) {
                C0557U c0557u = this.f8577m;
                abstractC0558V.m1414n(0, c0557u);
                long j4 = c0557u.f1986l;
                Object obj = c0557u.f1975a;
                C1959s c1959s2 = this.f8580p;
                if (c1959s2 != null) {
                    C1960t c1960t4 = this.f8579o;
                    Object obj2 = c1959s2.f8565g.f8311a;
                    C0556T c0556t = this.f8578n;
                    c1960t4.mo1410g(obj2, c0556t);
                    long j5 = c0556t.f1970e + c1959s2.f8566h;
                    this.f8579o.mo1332m(0, c0557u, 0L);
                    if (j5 != c0557u.f1986l) {
                        j3 = j5;
                    } else {
                        j3 = j4;
                    }
                } else {
                    j3 = j4;
                }
                Pair pairM1411i = abstractC0558V.m1411i(this.f8577m, this.f8578n, 0, j3);
                Object obj3 = pairM1411i.first;
                long jLongValue = ((Long) pairM1411i.second).longValue();
                if (this.f8583s) {
                    C1960t c1960t5 = this.f8579o;
                    c1960t = new C1960t(abstractC0558V, c1960t5.f8573c, c1960t5.f8574d);
                } else {
                    c1960t = new C1960t(abstractC0558V, obj, obj3);
                }
                this.f8579o = c1960t;
                C1959s c1959s3 = this.f8580p;
                if (c1959s3 != null && m4511C(jLongValue)) {
                    C1907A c1907a = c1959s3.f8565g;
                    Object obj4 = this.f8579o.f8574d;
                    Object obj5 = c1907a.f8311a;
                    if (obj4 != null && obj5.equals(C1960t.f8572e)) {
                        obj5 = this.f8579o.f8574d;
                    }
                    c1907aM4421a = c1907a.m4421a(obj5);
                }
                this.f8583s = true;
                this.f8582r = true;
                m4491l(this.f8579o);
                if (c1907aM4421a != null) {
                    C1959s c1959s4 = this.f8580p;
                    c1959s4.getClass();
                    c1959s4.m4509b(c1907aM4421a);
                }
            }
            if (this.f8583s) {
                C1960t c1960t6 = this.f8579o;
                c1960t2 = new C1960t(abstractC0558V, c1960t6.f8573c, c1960t6.f8574d);
            } else {
                c1960t2 = new C1960t(abstractC0558V, C0557U.f1973q, C1960t.f8572e);
            }
            this.f8579o = c1960t2;
        }
        c1907aM4421a = null;
        this.f8583s = true;
        this.f8582r = true;
        m4491l(this.f8579o);
        if (c1907aM4421a != null) {
            C1959s c1959s5 = this.f8580p;
            c1959s5.getClass();
            c1959s5.m4509b(c1907aM4421a);
        }
    }

    @Override // p114k0.AbstractC1951k, p114k0.AbstractC1932a
    /* JADX INFO: renamed from: i */
    public final void mo3778i() {
    }
}

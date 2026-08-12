package p077a0;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p036M0.C0380q;
import p055T.AbstractC0558V;
import p064W.AbstractC0632A;
import p064W.C0655w;
import p070Y.InterfaceC0701A;
import p082b0.C1064e;
import p082b0.C1071l;
import p088d0.C1386j;
import p088d0.C1387k;
import p114k0.AbstractC1932a;
import p114k0.C1912F;
import p114k0.C1937c0;
import p114k0.C1959s;
import p114k0.C1962v;
import p114k0.InterfaceC1908B;
import p114k0.InterfaceC1965y;

/* JADX INFO: renamed from: a0.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0816a0 {

    /* JADX INFO: renamed from: a */
    public final C1071l f3415a;

    /* JADX INFO: renamed from: e */
    public final C0797H f3419e;

    /* JADX INFO: renamed from: h */
    public final C1064e f3422h;

    /* JADX INFO: renamed from: i */
    public final C0655w f3423i;

    /* JADX INFO: renamed from: k */
    public boolean f3425k;

    /* JADX INFO: renamed from: l */
    public InterfaceC0701A f3426l;

    /* JADX INFO: renamed from: j */
    public C1937c0 f3424j = new C1937c0();

    /* JADX INFO: renamed from: c */
    public final IdentityHashMap f3417c = new IdentityHashMap();

    /* JADX INFO: renamed from: d */
    public final HashMap f3418d = new HashMap();

    /* JADX INFO: renamed from: b */
    public final ArrayList f3416b = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final HashMap f3420f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final HashSet f3421g = new HashSet();

    public C0816a0(C0797H c0797h, C1064e c1064e, C0655w c0655w, C1071l c1071l) {
        this.f3415a = c1071l;
        this.f3419e = c0797h;
        this.f3422h = c1064e;
        this.f3423i = c0655w;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0558V m2047a(int i3, ArrayList arrayList, C1937c0 c1937c0) {
        if (!arrayList.isEmpty()) {
            this.f3424j = c1937c0;
            for (int i4 = i3; i4 < arrayList.size() + i3; i4++) {
                C0814Z c0814z = (C0814Z) arrayList.get(i4 - i3);
                ArrayList arrayList2 = this.f3416b;
                if (i4 > 0) {
                    C0814Z c0814z2 = (C0814Z) arrayList2.get(i4 - 1);
                    c0814z.f3410d = c0814z2.f3407a.f8579o.f8557b.mo1333o() + c0814z2.f3410d;
                    c0814z.f3411e = false;
                    c0814z.f3409c.clear();
                } else {
                    c0814z.f3410d = 0;
                    c0814z.f3411e = false;
                    c0814z.f3409c.clear();
                }
                int iMo1333o = c0814z.f3407a.f8579o.f8557b.mo1333o();
                for (int i5 = i4; i5 < arrayList2.size(); i5++) {
                    ((C0814Z) arrayList2.get(i5)).f3410d += iMo1333o;
                }
                arrayList2.add(i4, c0814z);
                this.f3418d.put(c0814z.f3408b, c0814z);
                if (this.f3425k) {
                    m2051e(c0814z);
                    if (this.f3417c.isEmpty()) {
                        this.f3421g.add(c0814z);
                    } else {
                        C0813Y c0813y = (C0813Y) this.f3420f.get(c0814z);
                        if (c0813y != null) {
                            c0813y.f3404a.m4484b(c0813y.f3405b);
                        }
                    }
                }
            }
        }
        return m2048b();
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0558V m2048b() {
        ArrayList arrayList = this.f3416b;
        if (arrayList.isEmpty()) {
            return AbstractC0558V.f1991a;
        }
        int iMo1333o = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C0814Z c0814z = (C0814Z) arrayList.get(i3);
            c0814z.f3410d = iMo1333o;
            iMo1333o += c0814z.f3407a.f8579o.f8557b.mo1333o();
        }
        return new C0828g0(arrayList, this.f3424j);
    }

    /* JADX INFO: renamed from: c */
    public final void m2049c() {
        Iterator it = this.f3421g.iterator();
        while (it.hasNext()) {
            C0814Z c0814z = (C0814Z) it.next();
            if (c0814z.f3409c.isEmpty()) {
                C0813Y c0813y = (C0813Y) this.f3420f.get(c0814z);
                if (c0813y != null) {
                    c0813y.f3404a.m4484b(c0813y.f3405b);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2050d(C0814Z c0814z) {
        if (c0814z.f3411e && c0814z.f3409c.isEmpty()) {
            C0813Y c0813y = (C0813Y) this.f3420f.remove(c0814z);
            c0813y.getClass();
            C0807S c0807s = c0813y.f3405b;
            AbstractC1932a abstractC1932a = c0813y.f3404a;
            abstractC1932a.m4492n(c0807s);
            C0812X c0812x = c0813y.f3406c;
            abstractC1932a.m4494q(c0812x);
            abstractC1932a.m4493p(c0812x);
            this.f3421g.remove(c0814z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [a0.S, k0.B] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: e */
    public final void m2051e(C0814Z c0814z) {
        C1962v c1962v = c0814z.f3407a;
        ?? r3 = new InterfaceC1908B() { // from class: a0.S
            @Override // p114k0.InterfaceC1908B
            /* JADX INFO: renamed from: a */
            public final void mo2034a(AbstractC1932a abstractC1932a, AbstractC0558V abstractC0558V) {
                C0655w c0655w = this.f3383a.f3419e.f3317o;
                c0655w.m1699d(2);
                c0655w.m1700e(22);
            }
        };
        C0812X c0812x = new C0812X(this, c0814z);
        this.f3420f.put(c0814z, new C0813Y(c1962v, r3, c0812x));
        int i3 = AbstractC0632A.f2454a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        c1962v.getClass();
        C0380q c0380q = c1962v.f8477c;
        c0380q.getClass();
        C1912F c1912f = new C1912F();
        c1912f.f8329a = handler;
        c1912f.f8330b = c0812x;
        ((CopyOnWriteArrayList) c0380q.f1293j).add(c1912f);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(looperMyLooper2, null);
        C1387k c1387k = c1962v.f8478d;
        c1387k.getClass();
        C1386j c1386j = new C1386j();
        c1386j.f6180a = handler2;
        c1386j.f6181b = c0812x;
        c1387k.f6184c.add(c1386j);
        c1962v.m4490j(r3, this.f3426l, this.f3415a);
    }

    /* JADX INFO: renamed from: f */
    public final void m2052f(InterfaceC1965y interfaceC1965y) {
        IdentityHashMap identityHashMap = this.f3417c;
        C0814Z c0814z = (C0814Z) identityHashMap.remove(interfaceC1965y);
        c0814z.getClass();
        c0814z.f3407a.mo3780m(interfaceC1965y);
        c0814z.f3409c.remove(((C1959s) interfaceC1965y).f8565g);
        if (!identityHashMap.isEmpty()) {
            m2049c();
        }
        m2050d(c0814z);
    }

    /* JADX INFO: renamed from: g */
    public final void m2053g(int i3, int i4) {
        for (int i5 = i4 - 1; i5 >= i3; i5--) {
            ArrayList arrayList = this.f3416b;
            C0814Z c0814z = (C0814Z) arrayList.remove(i5);
            this.f3418d.remove(c0814z.f3408b);
            int i6 = -c0814z.f3407a.f8579o.f8557b.mo1333o();
            for (int i7 = i5; i7 < arrayList.size(); i7++) {
                ((C0814Z) arrayList.get(i7)).f3410d += i6;
            }
            c0814z.f3411e = true;
            if (this.f3425k) {
                m2050d(c0814z);
            }
        }
    }
}

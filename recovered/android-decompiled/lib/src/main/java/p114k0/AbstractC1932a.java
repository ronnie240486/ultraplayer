package p114k0;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import p036M0.C0380q;
import p055T.AbstractC0558V;
import p055T.C0539B;
import p064W.AbstractC0646n;
import p070Y.InterfaceC0701A;
import p082b0.C1071l;
import p088d0.C1386j;
import p088d0.C1387k;
import p088d0.InterfaceC1388l;
import p129o0.C2065e;

/* JADX INFO: renamed from: k0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1932a {

    /* JADX INFO: renamed from: a */
    public final ArrayList f8475a = new ArrayList(1);

    /* JADX INFO: renamed from: b */
    public final HashSet f8476b = new HashSet(1);

    /* JADX INFO: renamed from: c */
    public final C0380q f8477c = new C0380q(new CopyOnWriteArrayList(), 0, (C1907A) null);

    /* JADX INFO: renamed from: d */
    public final C1387k f8478d = new C1387k(new CopyOnWriteArrayList(), 0, null);

    /* JADX INFO: renamed from: e */
    public Looper f8479e;

    /* JADX INFO: renamed from: f */
    public AbstractC0558V f8480f;

    /* JADX INFO: renamed from: g */
    public C1071l f8481g;

    /* JADX INFO: renamed from: a */
    public abstract InterfaceC1965y mo3776a(C1907A c1907a, C2065e c2065e, long j3);

    /* JADX INFO: renamed from: b */
    public final void m4484b(InterfaceC1908B interfaceC1908B) {
        HashSet hashSet = this.f8476b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(interfaceC1908B);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        mo4485c();
    }

    /* JADX INFO: renamed from: d */
    public final void m4486d(InterfaceC1908B interfaceC1908B) {
        this.f8479e.getClass();
        HashSet hashSet = this.f8476b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(interfaceC1908B);
        if (zIsEmpty) {
            mo4487e();
        }
    }

    /* JADX INFO: renamed from: f */
    public AbstractC0558V mo4488f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public abstract C0539B mo3777g();

    /* JADX INFO: renamed from: h */
    public boolean mo4489h() {
        return true;
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo3778i();

    /* JADX INFO: renamed from: j */
    public final void m4490j(InterfaceC1908B interfaceC1908B, InterfaceC0701A interfaceC0701A, C1071l c1071l) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f8479e;
        AbstractC0646n.m1625c(looper == null || looper == looperMyLooper);
        this.f8481g = c1071l;
        AbstractC0558V abstractC0558V = this.f8480f;
        this.f8475a.add(interfaceC1908B);
        if (this.f8479e == null) {
            this.f8479e = looperMyLooper;
            this.f8476b.add(interfaceC1908B);
            mo3779k(interfaceC0701A);
        } else if (abstractC0558V != null) {
            m4486d(interfaceC1908B);
            interfaceC1908B.mo2034a(this, abstractC0558V);
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo3779k(InterfaceC0701A interfaceC0701A);

    /* JADX INFO: renamed from: l */
    public final void m4491l(AbstractC0558V abstractC0558V) {
        this.f8480f = abstractC0558V;
        ArrayList arrayList = this.f8475a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((InterfaceC1908B) obj).mo2034a(this, abstractC0558V);
        }
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo3780m(InterfaceC1965y interfaceC1965y);

    /* JADX INFO: renamed from: n */
    public final void m4492n(InterfaceC1908B interfaceC1908B) {
        ArrayList arrayList = this.f8475a;
        arrayList.remove(interfaceC1908B);
        if (!arrayList.isEmpty()) {
            m4484b(interfaceC1908B);
            return;
        }
        this.f8479e = null;
        this.f8480f = null;
        this.f8481g = null;
        this.f8476b.clear();
        mo3781o();
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo3781o();

    /* JADX INFO: renamed from: p */
    public final void m4493p(InterfaceC1388l interfaceC1388l) {
        CopyOnWriteArrayList<C1386j> copyOnWriteArrayList = this.f8478d.f6184c;
        for (C1386j c1386j : copyOnWriteArrayList) {
            if (c1386j.f6181b == interfaceC1388l) {
                copyOnWriteArrayList.remove(c1386j);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m4494q(InterfaceC1913G interfaceC1913G) {
        CopyOnWriteArrayList<C1912F> copyOnWriteArrayList = (CopyOnWriteArrayList) this.f8477c.f1293j;
        for (C1912F c1912f : copyOnWriteArrayList) {
            if (c1912f.f8330b == interfaceC1913G) {
                copyOnWriteArrayList.remove(c1912f);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo3782r(C0539B c0539b);

    /* JADX INFO: renamed from: c */
    public void mo4485c() {
    }

    /* JADX INFO: renamed from: e */
    public void mo4487e() {
    }
}

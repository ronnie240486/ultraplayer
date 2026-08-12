package p046P1;

import p034L1.C0346a;
import p037M1.InterfaceC0395h;
import p094e2.C1523a;

/* JADX INFO: renamed from: P1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0480h implements InterfaceC0474b {

    /* JADX INFO: renamed from: b */
    public static C0480h f1605b;

    /* JADX INFO: renamed from: c */
    public static final C0481i f1606c = new C0481i(0, false, false, 0, 0);

    /* JADX INFO: renamed from: a */
    public Object f1607a;

    public /* synthetic */ C0480h(Object obj) {
        this.f1607a = obj;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C0480h m1197b() {
        try {
            if (f1605b == null) {
                f1605b = new C0480h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1605b;
    }

    @Override // p046P1.InterfaceC0474b
    /* JADX INFO: renamed from: a */
    public void mo1149a(C0346a c0346a) {
        boolean z3 = c0346a.f1122h == 0;
        C1523a c1523a = (C1523a) this.f1607a;
        if (z3) {
            c1523a.mo1071f(null, c1523a.f5537x);
            return;
        }
        C0480h c0480h = c1523a.f5529p;
        if (c0480h != null) {
            ((InterfaceC0395h) c0480h.f1607a).mo1082q0(c0346a);
        }
    }
}

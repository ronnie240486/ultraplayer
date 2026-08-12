package p040N1;

import p034L1.C0348c;

/* JADX INFO: renamed from: N1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0431l {

    /* JADX INFO: renamed from: a */
    public C0348c[] f1461a;

    /* JADX INFO: renamed from: b */
    public boolean f1462b;

    /* JADX INFO: renamed from: c */
    public int f1463c;

    /* JADX INFO: renamed from: d */
    public Object f1464d;

    /* JADX INFO: renamed from: b */
    public static C0431l m1132b() {
        C0431l c0431l = new C0431l();
        c0431l.f1462b = true;
        c0431l.f1463c = 0;
        return c0431l;
    }

    /* JADX INFO: renamed from: a */
    public C0431l m1133a() {
        if (!(((InterfaceC0430k) this.f1464d) != null)) {
            throw new IllegalArgumentException("execute parameter required");
        }
        C0348c[] c0348cArr = this.f1461a;
        boolean z3 = this.f1462b;
        int i3 = this.f1463c;
        C0431l c0431l = new C0431l();
        c0431l.f1464d = this;
        c0431l.f1461a = c0348cArr;
        boolean z4 = false;
        if (c0348cArr != null && z3) {
            z4 = true;
        }
        c0431l.f1462b = z4;
        c0431l.f1463c = i3;
        return c0431l;
    }
}

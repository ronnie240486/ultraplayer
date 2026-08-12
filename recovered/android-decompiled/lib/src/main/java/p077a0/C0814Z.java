package p077a0;

import java.util.ArrayList;
import p055T.AbstractC0558V;
import p114k0.AbstractC1932a;
import p114k0.C1962v;

/* JADX INFO: renamed from: a0.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C0814Z implements InterfaceC0806Q {

    /* JADX INFO: renamed from: a */
    public final C1962v f3407a;

    /* JADX INFO: renamed from: d */
    public int f3410d;

    /* JADX INFO: renamed from: e */
    public boolean f3411e;

    /* JADX INFO: renamed from: c */
    public final ArrayList f3409c = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final Object f3408b = new Object();

    public C0814Z(AbstractC1932a abstractC1932a, boolean z3) {
        this.f3407a = new C1962v(abstractC1932a, z3);
    }

    @Override // p077a0.InterfaceC0806Q
    /* JADX INFO: renamed from: a */
    public final Object mo1905a() {
        return this.f3408b;
    }

    @Override // p077a0.InterfaceC0806Q
    /* JADX INFO: renamed from: b */
    public final AbstractC0558V mo1906b() {
        return this.f3407a.f8579o;
    }
}

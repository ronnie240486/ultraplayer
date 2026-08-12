package p135p2;

import p123m2.C2008b;
import p123m2.C2009c;
import p123m2.InterfaceC2013g;

/* JADX INFO: renamed from: p2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2117g implements InterfaceC2013g {

    /* JADX INFO: renamed from: a */
    public boolean f9155a = false;

    /* JADX INFO: renamed from: b */
    public boolean f9156b = false;

    /* JADX INFO: renamed from: c */
    public C2009c f9157c;

    /* JADX INFO: renamed from: d */
    public final C2115e f9158d;

    public C2117g(C2115e c2115e) {
        this.f9158d = c2115e;
    }

    @Override // p123m2.InterfaceC2013g
    /* JADX INFO: renamed from: a */
    public final InterfaceC2013g mo4569a(String str) {
        if (this.f9155a) {
            throw new C2008b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f9155a = true;
        this.f9158d.m4652b(this.f9157c, str, this.f9156b);
        return this;
    }

    @Override // p123m2.InterfaceC2013g
    /* JADX INFO: renamed from: b */
    public final InterfaceC2013g mo4570b(boolean z3) {
        if (this.f9155a) {
            throw new C2008b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f9155a = true;
        this.f9158d.m4651a(this.f9157c, z3 ? 1 : 0, this.f9156b);
        return this;
    }
}

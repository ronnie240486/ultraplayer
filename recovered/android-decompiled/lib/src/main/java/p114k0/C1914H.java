package p114k0;

import java.util.List;
import p055T.C0559W;
import p055T.C0583o;
import p117l0.AbstractC1972a;
import p117l0.InterfaceC1974c;
import p125n0.InterfaceC2042s;

/* JADX INFO: renamed from: k0.H */
/* JADX INFO: loaded from: classes.dex */
public final class C1914H implements InterfaceC2042s {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2042s f8331a;

    /* JADX INFO: renamed from: b */
    public final C0559W f8332b;

    public C1914H(InterfaceC2042s interfaceC2042s, C0559W c0559w) {
        this.f8331a = interfaceC2042s;
        this.f8332b = c0559w;
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: a */
    public final int mo4423a() {
        return this.f8331a.mo4423a();
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: b */
    public final C0559W mo4424b() {
        return this.f8332b;
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: c */
    public final void mo3746c(long j3, long j4, long j5, List list, InterfaceC1974c[] interfaceC1974cArr) {
        this.f8331a.mo3746c(j3, j4, j5, list, interfaceC1974cArr);
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: d */
    public final void mo4425d(boolean z3) {
        this.f8331a.mo4425d(z3);
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: e */
    public final C0583o mo4426e() {
        return this.f8332b.f1995d[this.f8331a.mo4423a()];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1914H)) {
            return false;
        }
        C1914H c1914h = (C1914H) obj;
        return this.f8331a.equals(c1914h.f8331a) && this.f8332b.equals(c1914h.f8332b);
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: f */
    public final boolean mo4427f(int i3, long j3) {
        return this.f8331a.mo4427f(i3, j3);
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: g */
    public final int mo3747g() {
        return this.f8331a.mo3747g();
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: h */
    public final int mo3748h() {
        return this.f8331a.mo3748h();
    }

    public final int hashCode() {
        return this.f8331a.hashCode() + ((this.f8332b.hashCode() + 527) * 31);
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: i */
    public final C0583o mo4428i(int i3) {
        return this.f8332b.f1995d[this.f8331a.mo4432m(i3)];
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: j */
    public final boolean mo4429j(int i3, long j3) {
        return this.f8331a.mo4429j(i3, j3);
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: k */
    public final void mo4430k() {
        this.f8331a.mo4430k();
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: l */
    public final void mo4431l(float f) {
        this.f8331a.mo4431l(f);
    }

    @Override // p125n0.InterfaceC2042s
    public final int length() {
        return this.f8331a.length();
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: m */
    public final int mo4432m(int i3) {
        return this.f8331a.mo4432m(i3);
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: n */
    public final Object mo3749n() {
        return this.f8331a.mo3749n();
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: o */
    public final void mo4433o() {
        this.f8331a.mo4433o();
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: p */
    public final int mo4434p(long j3, List list) {
        return this.f8331a.mo4434p(j3, list);
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: q */
    public final void mo4435q() {
        this.f8331a.mo4435q();
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: r */
    public final void mo4436r() {
        this.f8331a.mo4436r();
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: s */
    public final boolean mo4437s(long j3, AbstractC1972a abstractC1972a, List list) {
        return this.f8331a.mo4437s(j3, abstractC1972a, list);
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: t */
    public final int mo4438t(int i3) {
        return this.f8331a.mo4438t(i3);
    }
}

package p125n0;

import p045P0.AbstractC0462h;
import p055T.C0559W;
import p055T.C0583o;

/* JADX INFO: renamed from: n0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2030g extends AbstractC2038o implements Comparable {

    /* JADX INFO: renamed from: k */
    public final int f8844k;

    /* JADX INFO: renamed from: l */
    public final int f8845l;

    public C2030g(int i3, C0559W c0559w, int i4, C2033j c2033j, int i5) {
        int i6;
        super(i3, c0559w, i4);
        this.f8844k = AbstractC0462h.m1163c(i5, c2033j.f8865y) ? 1 : 0;
        C0583o c0583o = this.f8884j;
        int i7 = c0583o.f2161u;
        int i8 = -1;
        if (i7 != -1 && (i6 = c0583o.f2162v) != -1) {
            i8 = i7 * i6;
        }
        this.f8845l = i8;
    }

    @Override // p125n0.AbstractC2038o
    /* JADX INFO: renamed from: a */
    public final int mo4600a() {
        return this.f8844k;
    }

    @Override // p125n0.AbstractC2038o
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo4601b(AbstractC2038o abstractC2038o) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f8845l, ((C2030g) obj).f8845l);
    }
}

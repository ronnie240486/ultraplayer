package p125n0;

import p045P0.AbstractC0462h;
import p055T.C0559W;
import p105h2.AbstractC1676G;
import p105h2.AbstractC1691W;
import p105h2.AbstractC1731y;
import p105h2.C1690V;
import p105h2.C1692X;

/* JADX INFO: renamed from: n0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2036m extends AbstractC2038o implements Comparable {

    /* JADX INFO: renamed from: k */
    public final int f8872k;

    /* JADX INFO: renamed from: l */
    public final boolean f8873l;

    /* JADX INFO: renamed from: m */
    public final boolean f8874m;

    /* JADX INFO: renamed from: n */
    public final boolean f8875n;

    /* JADX INFO: renamed from: o */
    public final int f8876o;

    /* JADX INFO: renamed from: p */
    public final int f8877p;

    /* JADX INFO: renamed from: q */
    public final int f8878q;

    /* JADX INFO: renamed from: r */
    public final int f8879r;

    /* JADX INFO: renamed from: s */
    public final boolean f8880s;

    public C2036m(int i3, C0559W c0559w, int i4, C2033j c2033j, int i5, String str) {
        int iM4609d;
        super(i3, c0559w, i4);
        int i6 = 0;
        this.f8873l = AbstractC0462h.m1163c(i5, false);
        int i7 = this.f8884j.f2145e & (~c2033j.f2040p);
        this.f8874m = (i7 & 1) != 0;
        this.f8875n = (i7 & 2) != 0;
        C1692X c1692x = c2033j.f2038n;
        C1692X c1692xM4120r = c1692x.isEmpty() ? AbstractC1676G.m4120r("") : c1692x;
        int i8 = 0;
        while (true) {
            if (i8 >= c1692xM4120r.f7631j) {
                i8 = Integer.MAX_VALUE;
                iM4609d = 0;
                break;
            } else {
                iM4609d = C2040q.m4609d(this.f8884j, (String) c1692xM4120r.get(i8), false);
                if (iM4609d > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.f8876o = i8;
        this.f8877p = iM4609d;
        int i9 = this.f8884j.f2146f;
        AbstractC1691W abstractC1691W = C2040q.f8900j;
        int i10 = c2033j.f2039o;
        int iBitCount = (i9 == 0 || i9 != i10) ? Integer.bitCount(i9 & i10) : Integer.MAX_VALUE;
        this.f8878q = iBitCount;
        this.f8880s = (this.f8884j.f2146f & 1088) != 0;
        int iM4609d2 = C2040q.m4609d(this.f8884j, str, C2040q.m4610g(str) == null);
        this.f8879r = iM4609d2;
        boolean z3 = iM4609d > 0 || (c1692x.isEmpty() && iBitCount > 0) || this.f8874m || (this.f8875n && iM4609d2 > 0);
        if (AbstractC0462h.m1163c(i5, c2033j.f8865y) && z3) {
            i6 = 1;
        }
        this.f8872k = i6;
    }

    @Override // p125n0.AbstractC2038o
    /* JADX INFO: renamed from: a */
    public final int mo4600a() {
        return this.f8872k;
    }

    @Override // p125n0.AbstractC2038o
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo4601b(AbstractC2038o abstractC2038o) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2036m c2036m) {
        AbstractC1731y abstractC1731yMo4184c = AbstractC1731y.f7720a.mo4184c(this.f8873l, c2036m.f8873l);
        Integer numValueOf = Integer.valueOf(this.f8876o);
        Integer numValueOf2 = Integer.valueOf(c2036m.f8876o);
        C1690V c1690v = C1690V.f7627i;
        AbstractC1731y abstractC1731yMo4183b = abstractC1731yMo4184c.mo4183b(numValueOf, numValueOf2, c1690v);
        int i3 = this.f8877p;
        AbstractC1731y abstractC1731yMo4182a = abstractC1731yMo4183b.mo4182a(i3, c2036m.f8877p);
        int i4 = this.f8878q;
        AbstractC1731y abstractC1731yMo4184c2 = abstractC1731yMo4182a.mo4182a(i4, c2036m.f8878q).mo4184c(this.f8874m, c2036m.f8874m);
        Boolean boolValueOf = Boolean.valueOf(this.f8875n);
        Boolean boolValueOf2 = Boolean.valueOf(c2036m.f8875n);
        if (i3 == 0) {
            c1690v = C1690V.f7626h;
        }
        AbstractC1731y abstractC1731yMo4182a2 = abstractC1731yMo4184c2.mo4183b(boolValueOf, boolValueOf2, c1690v).mo4182a(this.f8879r, c2036m.f8879r);
        if (i4 == 0) {
            abstractC1731yMo4182a2 = abstractC1731yMo4182a2.mo4185d(this.f8880s, c2036m.f8880s);
        }
        return abstractC1731yMo4182a2.mo4186e();
    }
}

package p125n0;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Objects;
import p045P0.AbstractC0462h;
import p055T.C0559W;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p105h2.AbstractC1691W;
import p105h2.AbstractC1731y;
import p105h2.C1690V;
import p105h2.C1692X;

/* JADX INFO: renamed from: n0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2029f extends AbstractC2038o implements Comparable {

    /* JADX INFO: renamed from: A */
    public final int f8824A;

    /* JADX INFO: renamed from: B */
    public final boolean f8825B;

    /* JADX INFO: renamed from: C */
    public final boolean f8826C;

    /* JADX INFO: renamed from: D */
    public final boolean f8827D;

    /* JADX INFO: renamed from: k */
    public final int f8828k;

    /* JADX INFO: renamed from: l */
    public final boolean f8829l;

    /* JADX INFO: renamed from: m */
    public final String f8830m;

    /* JADX INFO: renamed from: n */
    public final C2033j f8831n;

    /* JADX INFO: renamed from: o */
    public final boolean f8832o;

    /* JADX INFO: renamed from: p */
    public final int f8833p;

    /* JADX INFO: renamed from: q */
    public final int f8834q;

    /* JADX INFO: renamed from: r */
    public final int f8835r;

    /* JADX INFO: renamed from: s */
    public final boolean f8836s;

    /* JADX INFO: renamed from: t */
    public final boolean f8837t;

    /* JADX INFO: renamed from: u */
    public final int f8838u;

    /* JADX INFO: renamed from: v */
    public final int f8839v;

    /* JADX INFO: renamed from: w */
    public final boolean f8840w;

    /* JADX INFO: renamed from: x */
    public final int f8841x;

    /* JADX INFO: renamed from: y */
    public final int f8842y;

    /* JADX INFO: renamed from: z */
    public final int f8843z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ab  */
    public C2029f(int i3, C0559W c0559w, int i4, C2033j c2033j, int i5, boolean z3, C2028e c2028e, int i6) {
        int i7;
        int iM4609d;
        boolean z4;
        int iM4609d2;
        boolean z5;
        super(i3, c0559w, i4);
        int i8 = 2;
        this.f8831n = c2033j;
        int i9 = c2033j.f8863w ? 24 : 16;
        this.f8836s = false;
        this.f8830m = C2040q.m4610g(this.f8884j.f2144d);
        this.f8832o = AbstractC0462h.m1163c(i5, false);
        int i10 = 0;
        while (true) {
            C1692X c1692x = c2033j.f2033i;
            i7 = Integer.MAX_VALUE;
            if (i10 >= c1692x.f7631j) {
                i10 = Integer.MAX_VALUE;
                iM4609d = 0;
                break;
            } else {
                iM4609d = C2040q.m4609d(this.f8884j, (String) c1692x.get(i10), false);
                if (iM4609d > 0) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f8834q = i10;
        this.f8833p = iM4609d;
        int i11 = this.f8884j.f2146f;
        this.f8835r = (i11 == 0 || i11 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        C0583o c0583o = this.f8884j;
        int i12 = c0583o.f2146f;
        this.f8837t = i12 == 0 || (i12 & 1) != 0;
        this.f8840w = (c0583o.f2145e & 1) != 0;
        String str = c0583o.f2154n;
        if (str != null) {
            switch (str) {
                case "audio/eac3-joc":
                case "audio/ac4":
                case "audio/iamf":
                    z4 = true;
                    break;
                default:
                    z4 = false;
                    break;
            }
        } else {
            z4 = false;
        }
        this.f8827D = z4;
        int i13 = c0583o.f2130C;
        this.f8841x = i13;
        this.f8842y = c0583o.f2131D;
        int i14 = c0583o.f2150j;
        this.f8843z = i14;
        this.f8829l = (i14 == -1 || i14 <= c2033j.f2035k) && (i13 == -1 || i13 <= c2033j.f2034j) && c2028e.apply(c0583o);
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] strArrSplit = AbstractC0632A.f2454a >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{configuration.locale.toLanguageTag()};
        for (int i15 = 0; i15 < strArrSplit.length; i15++) {
            strArrSplit[i15] = AbstractC0632A.m1572M(strArrSplit[i15]);
        }
        int i16 = 0;
        while (true) {
            if (i16 < strArrSplit.length) {
                iM4609d2 = C2040q.m4609d(this.f8884j, strArrSplit[i16], false);
                if (iM4609d2 <= 0) {
                    i16++;
                }
            } else {
                i16 = Integer.MAX_VALUE;
                iM4609d2 = 0;
            }
        }
        this.f8838u = i16;
        this.f8839v = iM4609d2;
        int i17 = 0;
        while (true) {
            C1692X c1692x2 = c2033j.f2036l;
            if (i17 < c1692x2.f7631j) {
                String str2 = this.f8884j.f2154n;
                if (str2 == null || !str2.equals(c1692x2.get(i17))) {
                    i17++;
                } else {
                    i7 = i17;
                }
            }
        }
        this.f8824A = i7;
        this.f8825B = (i5 & 384) == 128;
        this.f8826C = (i5 & 64) == 64;
        C2033j c2033j2 = this.f8831n;
        if (AbstractC0462h.m1163c(i5, c2033j2.f8865y) && ((z5 = this.f8829l) || c2033j2.f8862v)) {
            c2033j2.f2037m.getClass();
            if (!AbstractC0462h.m1163c(i5, false) || !z5 || this.f8884j.f2150j == -1 || ((!c2033j2.f8866z && z3) || (i9 & i5) == 0)) {
                i8 = 1;
            }
        } else {
            i8 = 0;
        }
        this.f8828k = i8;
    }

    @Override // p125n0.AbstractC2038o
    /* JADX INFO: renamed from: a */
    public final int mo4600a() {
        return this.f8828k;
    }

    @Override // p125n0.AbstractC2038o
    /* JADX INFO: renamed from: b */
    public final boolean mo4601b(AbstractC2038o abstractC2038o) {
        int i3;
        String str;
        C2029f c2029f = (C2029f) abstractC2038o;
        this.f8831n.getClass();
        C0583o c0583o = this.f8884j;
        int i4 = c0583o.f2130C;
        if (i4 == -1) {
            return false;
        }
        C0583o c0583o2 = c2029f.f8884j;
        if (i4 != c0583o2.f2130C) {
            return false;
        }
        if ((this.f8836s || ((str = c0583o.f2154n) != null && TextUtils.equals(str, c0583o2.f2154n))) && (i3 = c0583o.f2131D) != -1 && i3 == c0583o2.f2131D) {
            return this.f8825B == c2029f.f8825B && this.f8826C == c2029f.f8826C;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2029f c2029f) {
        boolean z3 = this.f8832o;
        boolean z4 = this.f8829l;
        AbstractC1691W abstractC1691WMo4136a = (z4 && z3) ? C2040q.f8900j : C2040q.f8900j.mo4136a();
        AbstractC1731y abstractC1731yMo4184c = AbstractC1731y.f7720a.mo4184c(z3, c2029f.f8832o);
        Integer numValueOf = Integer.valueOf(this.f8834q);
        Integer numValueOf2 = Integer.valueOf(c2029f.f8834q);
        C1690V c1690v = C1690V.f7627i;
        AbstractC1731y abstractC1731yMo4183b = abstractC1731yMo4184c.mo4183b(numValueOf, numValueOf2, c1690v).mo4182a(this.f8833p, c2029f.f8833p).mo4182a(this.f8835r, c2029f.f8835r).mo4184c(this.f8840w, c2029f.f8840w).mo4184c(this.f8837t, c2029f.f8837t).mo4183b(Integer.valueOf(this.f8838u), Integer.valueOf(c2029f.f8838u), c1690v).mo4182a(this.f8839v, c2029f.f8839v).mo4184c(z4, c2029f.f8829l).mo4183b(Integer.valueOf(this.f8824A), Integer.valueOf(c2029f.f8824A), c1690v);
        this.f8831n.getClass();
        AbstractC1731y abstractC1731yMo4183b2 = abstractC1731yMo4183b.mo4184c(this.f8825B, c2029f.f8825B).mo4184c(this.f8826C, c2029f.f8826C).mo4184c(this.f8827D, c2029f.f8827D).mo4183b(Integer.valueOf(this.f8841x), Integer.valueOf(c2029f.f8841x), abstractC1691WMo4136a).mo4183b(Integer.valueOf(this.f8842y), Integer.valueOf(c2029f.f8842y), abstractC1691WMo4136a);
        if (Objects.equals(this.f8830m, c2029f.f8830m)) {
            abstractC1731yMo4183b2 = abstractC1731yMo4183b2.mo4183b(Integer.valueOf(this.f8843z), Integer.valueOf(c2029f.f8843z), abstractC1691WMo4136a);
        }
        return abstractC1731yMo4183b2.mo4186e();
    }
}

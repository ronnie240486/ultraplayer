package p125n0;

import java.util.Objects;
import p045P0.AbstractC0462h;
import p055T.C0559W;
import p055T.C0583o;
import p105h2.AbstractC1691W;
import p105h2.AbstractC1731y;
import p105h2.C1690V;
import p105h2.C1692X;

/* JADX INFO: renamed from: n0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C2039p extends AbstractC2038o {

    /* JADX INFO: renamed from: k */
    public final boolean f8885k;

    /* JADX INFO: renamed from: l */
    public final C2033j f8886l;

    /* JADX INFO: renamed from: m */
    public final boolean f8887m;

    /* JADX INFO: renamed from: n */
    public final boolean f8888n;

    /* JADX INFO: renamed from: o */
    public final boolean f8889o;

    /* JADX INFO: renamed from: p */
    public final int f8890p;

    /* JADX INFO: renamed from: q */
    public final int f8891q;

    /* JADX INFO: renamed from: r */
    public final int f8892r;

    /* JADX INFO: renamed from: s */
    public final int f8893s;

    /* JADX INFO: renamed from: t */
    public final boolean f8894t;

    /* JADX INFO: renamed from: u */
    public final boolean f8895u;

    /* JADX INFO: renamed from: v */
    public final int f8896v;

    /* JADX INFO: renamed from: w */
    public final boolean f8897w;

    /* JADX INFO: renamed from: x */
    public final boolean f8898x;

    /* JADX INFO: renamed from: y */
    public final int f8899y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:112:0x0138  */
    /* JADX WARN: Code duplicated, block: B:119:0x0149  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:42:0x006b  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fd  */
    public C2039p(int i3, C0559W c0559w, int i4, C2033j c2033j, int i5, int i6, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        int i7;
        C0583o c0583o;
        int i8;
        int i9;
        int i10;
        C0583o c0583o2;
        int i11;
        int i12;
        int i13;
        super(i3, c0559w, i4);
        int i14 = 4;
        int i15 = 2;
        this.f8886l = c2033j;
        int i16 = c2033j.f8861u ? 24 : 16;
        this.f8895u = false;
        if (!z3 || (((i11 = (c0583o2 = this.f8884j).f2161u) != -1 && i11 > c2033j.f2025a) || ((i12 = c0583o2.f2162v) != -1 && i12 > c2033j.f2026b))) {
            z4 = false;
        } else {
            float f = c0583o2.f2163w;
            if ((f == -1.0f || f <= c2033j.f2027c) && ((i13 = c0583o2.f2150j) == -1 || i13 <= c2033j.f2028d)) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        this.f8885k = z4;
        if (!z3 || (((i8 = (c0583o = this.f8884j).f2161u) != -1 && i8 < 0) || ((i9 = c0583o.f2162v) != -1 && i9 < 0))) {
            z5 = false;
        } else {
            float f3 = c0583o.f2163w;
            if ((f3 == -1.0f || f3 >= 0) && ((i10 = c0583o.f2150j) == -1 || i10 >= 0)) {
                z5 = true;
            } else {
                z5 = false;
            }
        }
        this.f8887m = z5;
        this.f8888n = AbstractC0462h.m1163c(i5, false);
        C0583o c0583o3 = this.f8884j;
        float f4 = c0583o3.f2163w;
        this.f8889o = f4 != -1.0f && f4 >= 10.0f;
        this.f8890p = c0583o3.f2150j;
        int i17 = c0583o3.f2161u;
        this.f8891q = (i17 == -1 || (i7 = c0583o3.f2162v) == -1) ? -1 : i17 * i7;
        int i18 = c0583o3.f2146f;
        AbstractC1691W abstractC1691W = C2040q.f8900j;
        int i19 = Integer.MAX_VALUE;
        this.f8893s = (i18 == 0 || i18 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        int i20 = this.f8884j.f2146f;
        this.f8894t = i20 == 0 || (i20 & 1) != 0;
        int i21 = 0;
        while (true) {
            C1692X c1692x = c2033j.f2032h;
            if (i21 < c1692x.f7631j) {
                String str = this.f8884j.f2154n;
                if (str != null && str.equals(c1692x.get(i21))) {
                    i19 = i21;
                    break;
                }
                i21++;
            } else {
                break;
            }
        }
        this.f8892r = i19;
        this.f8897w = (i5 & 384) == 128;
        this.f8898x = (i5 & 64) == 64;
        C0583o c0583o4 = this.f8884j;
        String str2 = c0583o4.f2154n;
        if (str2 != null) {
            switch (str2) {
                case "video/dolby-vision":
                    i14 = 5;
                    break;
                case "video/av01":
                    break;
                case "video/hevc":
                    i14 = 3;
                    break;
                case "video/avc":
                    i14 = 1;
                    break;
                case "video/x-vnd.on2.vp9":
                    i14 = 2;
                    break;
                default:
                    i14 = 0;
                    break;
            }
        } else {
            i14 = 0;
        }
        this.f8899y = i14;
        if ((c0583o4.f2146f & 16384) != 0) {
            i15 = 0;
        } else {
            C2033j c2033j2 = this.f8886l;
            if (!AbstractC0462h.m1163c(i5, c2033j2.f8865y) || (!(z6 = this.f8885k) && !c2033j2.f8860t)) {
                i15 = 0;
            } else if (!AbstractC0462h.m1163c(i5, false) || !this.f8887m || !z6 || c0583o4.f2150j == -1 || (i16 & i5) == 0) {
                i15 = 1;
            }
        }
        this.f8896v = i15;
    }

    /* JADX INFO: renamed from: c */
    public static int m4607c(C2039p c2039p, C2039p c2039p2) {
        AbstractC1731y abstractC1731yMo4183b = AbstractC1731y.f7720a.mo4184c(c2039p.f8888n, c2039p2.f8888n).mo4182a(c2039p.f8893s, c2039p2.f8893s).mo4184c(c2039p.f8894t, c2039p2.f8894t).mo4184c(c2039p.f8889o, c2039p2.f8889o).mo4184c(c2039p.f8885k, c2039p2.f8885k).mo4184c(c2039p.f8887m, c2039p2.f8887m).mo4183b(Integer.valueOf(c2039p.f8892r), Integer.valueOf(c2039p2.f8892r), C1690V.f7627i);
        boolean z3 = c2039p2.f8897w;
        boolean z4 = c2039p.f8897w;
        AbstractC1731y abstractC1731yMo4184c = abstractC1731yMo4183b.mo4184c(z4, z3);
        boolean z5 = c2039p2.f8898x;
        boolean z6 = c2039p.f8898x;
        AbstractC1731y abstractC1731yMo4184c2 = abstractC1731yMo4184c.mo4184c(z6, z5);
        if (z4 && z6) {
            abstractC1731yMo4184c2 = abstractC1731yMo4184c2.mo4182a(c2039p.f8899y, c2039p2.f8899y);
        }
        return abstractC1731yMo4184c2.mo4186e();
    }

    @Override // p125n0.AbstractC2038o
    /* JADX INFO: renamed from: a */
    public final int mo4600a() {
        return this.f8896v;
    }

    @Override // p125n0.AbstractC2038o
    /* JADX INFO: renamed from: b */
    public final boolean mo4601b(AbstractC2038o abstractC2038o) {
        C2039p c2039p = (C2039p) abstractC2038o;
        if (!this.f8895u && !Objects.equals(this.f8884j.f2154n, c2039p.f8884j.f2154n)) {
            return false;
        }
        this.f8886l.getClass();
        return this.f8897w == c2039p.f8897w && this.f8898x == c2039p.f8898x;
    }
}

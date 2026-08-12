package p145s0;

import java.util.Collections;
import java.util.List;
import p053S0.C0536b;
import p055T.C0546I;
import p064W.AbstractC0633a;
import p064W.C0651s;
import p067X.AbstractC0684p;
import p067X.C0675g;
import p067X.C0676h;
import p067X.C0679k;
import p067X.C0680l;
import p105h2.AbstractC1676G;

/* JADX INFO: renamed from: s0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C2248u {

    /* JADX INFO: renamed from: a */
    public final List f9661a;

    /* JADX INFO: renamed from: b */
    public final int f9662b;

    /* JADX INFO: renamed from: c */
    public final int f9663c;

    /* JADX INFO: renamed from: d */
    public final int f9664d;

    /* JADX INFO: renamed from: e */
    public final int f9665e;

    /* JADX INFO: renamed from: f */
    public final int f9666f;

    /* JADX INFO: renamed from: g */
    public final int f9667g;

    /* JADX INFO: renamed from: h */
    public final int f9668h;

    /* JADX INFO: renamed from: i */
    public final float f9669i;

    /* JADX INFO: renamed from: j */
    public final int f9670j;

    /* JADX INFO: renamed from: k */
    public final String f9671k;

    /* JADX INFO: renamed from: l */
    public final C0536b f9672l;

    public C2248u(List list, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, int i10, String str, C0536b c0536b) {
        this.f9661a = list;
        this.f9662b = i3;
        this.f9663c = i4;
        this.f9664d = i5;
        this.f9665e = i6;
        this.f9666f = i7;
        this.f9667g = i8;
        this.f9668h = i9;
        this.f9669i = f;
        this.f9670j = i10;
        this.f9671k = str;
        this.f9672l = c0536b;
    }

    /* JADX INFO: renamed from: a */
    public static C2248u m4844a(C0651s c0651s, boolean z3, C0536b c0536b) throws C0546I {
        C0679k c0679kM1793f;
        int i3 = 4;
        try {
            if (z3) {
                c0651s.m1666H(4);
            } else {
                c0651s.m1666H(21);
            }
            int iM1687u = c0651s.m1687u() & 3;
            int iM1687u2 = c0651s.m1687u();
            int i4 = c0651s.f2521b;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < iM1687u2; i7++) {
                c0651s.m1666H(1);
                int iM1659A = c0651s.m1659A();
                for (int i8 = 0; i8 < iM1659A; i8++) {
                    int iM1659A2 = c0651s.m1659A();
                    i6 += iM1659A2 + 4;
                    c0651s.m1666H(iM1659A2);
                }
            }
            c0651s.m1665G(i4);
            byte[] bArr = new byte[i6];
            C0536b c0536b2 = c0536b;
            String strM1608a = null;
            int i9 = 0;
            int i10 = 0;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            float f = 1.0f;
            int i17 = -1;
            while (i9 < iM1687u2) {
                int iM1687u3 = c0651s.m1687u() & 63;
                int iM1659A3 = c0651s.m1659A();
                C0536b c0536bM1795h = c0536b2;
                int i18 = 0;
                while (i18 < iM1659A3) {
                    int iM1659A4 = c0651s.m1659A();
                    int i19 = iM1687u;
                    System.arraycopy(AbstractC0684p.f2629a, i5, bArr, i10, i3);
                    int i20 = i10 + 4;
                    System.arraycopy(c0651s.f2520a, c0651s.f2521b, bArr, i20, iM1659A4);
                    if (iM1687u3 == 32 && i18 == 0) {
                        c0536bM1795h = AbstractC0684p.m1795h(bArr, i20, i20 + iM1659A4);
                    } else {
                        if (iM1687u3 == 33 && i18 == 0) {
                            C0680l c0680lM1794g = AbstractC0684p.m1794g(bArr, i20, i20 + iM1659A4, c0536bM1795h);
                            i11 = c0680lM1794g.f2596b + 8;
                            i12 = c0680lM1794g.f2597c + 8;
                            int i21 = c0680lM1794g.f2602h;
                            int i22 = c0680lM1794g.f2603i;
                            i13 = i21;
                            int i23 = c0680lM1794g.f2604j;
                            float f3 = c0680lM1794g.f2600f;
                            int i24 = c0680lM1794g.f2601g;
                            C0676h c0676h = c0680lM1794g.f2595a;
                            if (c0676h != null) {
                                strM1608a = AbstractC0633a.m1608a(c0676h.f2581a, c0676h.f2582b, c0676h.f2583c, c0676h.f2584d, c0676h.f2585e, c0676h.f2586f);
                            }
                            i17 = i24;
                            f = f3;
                            i15 = i23;
                            i14 = i22;
                        } else if (iM1687u3 == 39 && i18 == 0 && (c0679kM1793f = AbstractC0684p.m1793f(bArr, i20, i20 + iM1659A4)) != null && c0536bM1795h != null) {
                            i5 = 0;
                            i16 = c0679kM1793f.f2594a == ((C0675g) ((AbstractC1676G) c0536bM1795h.f1867g).get(0)).f2580b ? 4 : 5;
                        }
                        i5 = 0;
                    }
                    i10 = i20 + iM1659A4;
                    c0651s.m1666H(iM1659A4);
                    i18++;
                    iM1687u = i19;
                    i3 = 4;
                }
                i9++;
                c0536b2 = c0536bM1795h;
                i3 = 4;
            }
            return new C2248u(i6 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iM1687u + 1, i11, i12, i13, i14, i15, i16, f, i17, strM1608a, c0536b2);
        } catch (ArrayIndexOutOfBoundsException e3) {
            throw C0546I.m1365a(e3, "Error parsing".concat(z3 ? "L-HEVC config" : "HEVC config"));
        }
    }
}

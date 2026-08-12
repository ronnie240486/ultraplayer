package p065W0;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import p045P0.AbstractC0462h;
import p045P0.C0455a;
import p045P0.C0464j;
import p045P0.InterfaceC0458d;
import p045P0.InterfaceC0465k;
import p061V.C0614b;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p064W.InterfaceC0636d;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1692X;

/* JADX INFO: renamed from: W0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0659a implements InterfaceC0465k {

    /* JADX INFO: renamed from: g */
    public final C0651s f2536g = new C0651s();

    /* JADX INFO: renamed from: h */
    public final boolean f2537h;

    /* JADX INFO: renamed from: i */
    public final int f2538i;

    /* JADX INFO: renamed from: j */
    public final int f2539j;

    /* JADX INFO: renamed from: k */
    public final String f2540k;

    /* JADX INFO: renamed from: l */
    public final float f2541l;

    /* JADX INFO: renamed from: m */
    public final int f2542m;

    public C0659a(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f2538i = 0;
            this.f2539j = -1;
            this.f2540k = "sans-serif";
            this.f2537h = false;
            this.f2541l = 0.85f;
            this.f2542m = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f2538i = bArr[24];
        this.f2539j = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f2540k = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i3 = bArr[25] * 20;
        this.f2542m = i3;
        boolean z3 = (bArr[0] & 32) != 0;
        this.f2537h = z3;
        if (z3) {
            this.f2541l = AbstractC0632A.m1589h(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i3, 0.0f, 0.95f);
        } else {
            this.f2541l = 0.85f;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1709a(SpannableStringBuilder spannableStringBuilder, int i3, int i4, int i5, int i6, int i7) {
        if (i3 != i4) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i3 >>> 8) | ((i3 & 255) << 24)), i5, i6, i7 | 33);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m1710c(SpannableStringBuilder spannableStringBuilder, int i3, int i4, int i5, int i6, int i7) {
        if (i3 != i4) {
            int i8 = i7 | 33;
            boolean z3 = (i3 & 1) != 0;
            boolean z4 = (i3 & 2) != 0;
            if (z3) {
                if (z4) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i5, i6, i8);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i5, i6, i8);
                }
            } else if (z4) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i5, i6, i8);
            }
            boolean z5 = (i3 & 4) != 0;
            if (z5) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i5, i6, i8);
            }
            if (z5 || z3 || z4) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i5, i6, i8);
        }
    }

    @Override // p045P0.InterfaceC0465k
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo514b() {
    }

    @Override // p045P0.InterfaceC0465k
    /* JADX INFO: renamed from: h */
    public final void mo520h(byte[] bArr, int i3, int i4, C0464j c0464j, InterfaceC0636d interfaceC0636d) {
        String strM1685s;
        int i5 = 1;
        C0651s c0651s = this.f2536g;
        c0651s.m1663E(bArr, i3 + i4);
        c0651s.m1665G(i3);
        int i6 = 2;
        AbstractC0646n.m1625c(c0651s.m1667a() >= 2);
        int iM1659A = c0651s.m1659A();
        if (iM1659A == 0) {
            strM1685s = "";
        } else {
            int i7 = c0651s.f2521b;
            Charset charsetM1661C = c0651s.m1661C();
            int i8 = iM1659A - (c0651s.f2521b - i7);
            if (charsetM1661C == null) {
                charsetM1661C = StandardCharsets.UTF_8;
            }
            strM1685s = c0651s.m1685s(i8, charsetM1661C);
        }
        if (strM1685s.isEmpty()) {
            C1674E c1674e = AbstractC1676G.f7601h;
            interfaceC0636d.mo545b(new C0455a(C1692X.f7629k, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM1685s);
        m1710c(spannableStringBuilder, this.f2538i, 0, 0, spannableStringBuilder.length(), 16711680);
        m1709a(spannableStringBuilder, this.f2539j, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f2540k;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fM1589h = this.f2541l;
        while (c0651s.m1667a() >= 8) {
            int i9 = c0651s.f2521b;
            int iM1673g = c0651s.m1673g();
            int iM1673g2 = c0651s.m1673g();
            if (iM1673g2 == 1937013100) {
                AbstractC0646n.m1625c(c0651s.m1667a() >= i6);
                int iM1659A2 = c0651s.m1659A();
                int i10 = 0;
                while (i10 < iM1659A2) {
                    AbstractC0646n.m1625c(c0651s.m1667a() >= 12);
                    int iM1659A3 = c0651s.m1659A();
                    int iM1659A4 = c0651s.m1659A();
                    c0651s.m1666H(i6);
                    int i11 = i10;
                    int iM1687u = c0651s.m1687u();
                    c0651s.m1666H(i5);
                    int iM1673g3 = c0651s.m1673g();
                    if (iM1659A4 > spannableStringBuilder.length()) {
                        AbstractC0646n.m1647y("Tx3gParser", "Truncating styl end (" + iM1659A4 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
                        iM1659A4 = spannableStringBuilder.length();
                    }
                    if (iM1659A3 >= iM1659A4) {
                        AbstractC0646n.m1647y("Tx3gParser", "Ignoring styl with start (" + iM1659A3 + ") >= end (" + iM1659A4 + ").");
                    } else {
                        int i12 = iM1659A4;
                        m1710c(spannableStringBuilder, iM1687u, this.f2538i, iM1659A3, i12, 0);
                        m1709a(spannableStringBuilder, iM1673g3, this.f2539j, iM1659A3, i12, 0);
                    }
                    i10 = i11 + 1;
                    i5 = 1;
                    i6 = 2;
                }
            } else {
                if (iM1673g2 == 1952608120 && this.f2537h) {
                    AbstractC0646n.m1625c(c0651s.m1667a() >= 2);
                    fM1589h = AbstractC0632A.m1589h(c0651s.m1659A() / this.f2542m, 0.0f, 0.95f);
                }
                c0651s.m1665G(i9 + iM1673g);
                i5 = 1;
                i6 = 2;
            }
            c0651s.m1665G(i9 + iM1673g);
            i5 = 1;
            i6 = 2;
        }
        interfaceC0636d.mo545b(new C0455a(AbstractC1676G.m4120r(new C0614b(spannableStringBuilder, null, null, null, fM1589h, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f)), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // p045P0.InterfaceC0465k
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC0458d mo523k(byte[] bArr, int i3, int i4) {
        return AbstractC0462h.m1161a(this, bArr, i4);
    }
}

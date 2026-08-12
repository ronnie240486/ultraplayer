package p048Q0;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: Q0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0507f {

    /* JADX INFO: renamed from: A */
    public static final boolean[] f1699A;

    /* JADX INFO: renamed from: B */
    public static final int[] f1700B;

    /* JADX INFO: renamed from: C */
    public static final int[] f1701C;

    /* JADX INFO: renamed from: D */
    public static final int[] f1702D;

    /* JADX INFO: renamed from: E */
    public static final int[] f1703E;

    /* JADX INFO: renamed from: v */
    public static final int f1704v = m1238c(2, 2, 2, 0);

    /* JADX INFO: renamed from: w */
    public static final int f1705w;

    /* JADX INFO: renamed from: x */
    public static final int[] f1706x;

    /* JADX INFO: renamed from: y */
    public static final int[] f1707y;

    /* JADX INFO: renamed from: z */
    public static final int[] f1708z;

    /* JADX INFO: renamed from: a */
    public final ArrayList f1709a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final SpannableStringBuilder f1710b = new SpannableStringBuilder();

    /* JADX INFO: renamed from: c */
    public boolean f1711c;

    /* JADX INFO: renamed from: d */
    public boolean f1712d;

    /* JADX INFO: renamed from: e */
    public int f1713e;

    /* JADX INFO: renamed from: f */
    public boolean f1714f;

    /* JADX INFO: renamed from: g */
    public int f1715g;

    /* JADX INFO: renamed from: h */
    public int f1716h;

    /* JADX INFO: renamed from: i */
    public int f1717i;

    /* JADX INFO: renamed from: j */
    public int f1718j;

    /* JADX INFO: renamed from: k */
    public int f1719k;

    /* JADX INFO: renamed from: l */
    public int f1720l;

    /* JADX INFO: renamed from: m */
    public int f1721m;

    /* JADX INFO: renamed from: n */
    public int f1722n;

    /* JADX INFO: renamed from: o */
    public int f1723o;

    /* JADX INFO: renamed from: p */
    public int f1724p;

    /* JADX INFO: renamed from: q */
    public int f1725q;

    /* JADX INFO: renamed from: r */
    public int f1726r;

    /* JADX INFO: renamed from: s */
    public int f1727s;

    /* JADX INFO: renamed from: t */
    public int f1728t;

    /* JADX INFO: renamed from: u */
    public int f1729u;

    static {
        int iM1238c = m1238c(0, 0, 0, 0);
        f1705w = iM1238c;
        int iM1238c2 = m1238c(0, 0, 0, 3);
        f1706x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f1707y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f1708z = new int[]{3, 3, 3, 3, 3, 3, 1};
        f1699A = new boolean[]{false, false, false, true, true, true, false};
        f1700B = new int[]{iM1238c, iM1238c2, iM1238c, iM1238c, iM1238c2, iM1238c, iM1238c};
        f1701C = new int[]{0, 1, 2, 3, 4, 3, 4};
        f1702D = new int[]{0, 0, 0, 0, 0, 3, 3};
        f1703E = new int[]{iM1238c, iM1238c, iM1238c, iM1238c, iM1238c, iM1238c2, iM1238c2};
    }

    public C0507f() {
        m1241d();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    /* JADX INFO: renamed from: c */
    public static int m1238c(int i3, int i4, int i5, int i6) {
        int i7;
        AbstractC0646n.m1628f(i3, 4);
        AbstractC0646n.m1628f(i4, 4);
        AbstractC0646n.m1628f(i5, 4);
        AbstractC0646n.m1628f(i6, 4);
        if (i6 == 0 || i6 == 1) {
            i7 = 255;
        } else if (i6 == 2) {
            i7 = 127;
        } else if (i6 != 3) {
            i7 = 255;
        } else {
            i7 = 0;
        }
        return Color.argb(i7, i3 > 1 ? 255 : 0, i4 > 1 ? 255 : 0, i5 > 1 ? 255 : 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m1239a(char c) {
        SpannableStringBuilder spannableStringBuilder = this.f1710b;
        if (c != '\n') {
            spannableStringBuilder.append(c);
            return;
        }
        ArrayList arrayList = this.f1709a;
        arrayList.add(m1240b());
        spannableStringBuilder.clear();
        if (this.f1723o != -1) {
            this.f1723o = 0;
        }
        if (this.f1724p != -1) {
            this.f1724p = 0;
        }
        if (this.f1725q != -1) {
            this.f1725q = 0;
        }
        if (this.f1727s != -1) {
            this.f1727s = 0;
        }
        while (true) {
            if (arrayList.size() < this.f1718j && arrayList.size() < 15) {
                this.f1729u = arrayList.size();
                return;
            }
            arrayList.remove(0);
        }
    }

    /* JADX INFO: renamed from: b */
    public final SpannableString m1240b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f1710b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f1723o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f1723o, length, 33);
            }
            if (this.f1724p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f1724p, length, 33);
            }
            if (this.f1725q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f1726r), this.f1725q, length, 33);
            }
            if (this.f1727s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f1728t), this.f1727s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: d */
    public final void m1241d() {
        this.f1709a.clear();
        this.f1710b.clear();
        this.f1723o = -1;
        this.f1724p = -1;
        this.f1725q = -1;
        this.f1727s = -1;
        this.f1729u = 0;
        this.f1711c = false;
        this.f1712d = false;
        this.f1713e = 4;
        this.f1714f = false;
        this.f1715g = 0;
        this.f1716h = 0;
        this.f1717i = 0;
        this.f1718j = 15;
        this.f1719k = 0;
        this.f1720l = 0;
        this.f1721m = 0;
        int i3 = f1705w;
        this.f1722n = i3;
        this.f1726r = f1704v;
        this.f1728t = i3;
    }

    /* JADX INFO: renamed from: e */
    public final void m1242e(boolean z3, boolean z4) {
        int i3 = this.f1723o;
        SpannableStringBuilder spannableStringBuilder = this.f1710b;
        if (i3 != -1) {
            if (!z3) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f1723o, spannableStringBuilder.length(), 33);
                this.f1723o = -1;
            }
        } else if (z3) {
            this.f1723o = spannableStringBuilder.length();
        }
        if (this.f1724p == -1) {
            if (z4) {
                this.f1724p = spannableStringBuilder.length();
            }
        } else {
            if (z4) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f1724p, spannableStringBuilder.length(), 33);
            this.f1724p = -1;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1243f(int i3, int i4) {
        int i5 = this.f1725q;
        SpannableStringBuilder spannableStringBuilder = this.f1710b;
        if (i5 != -1 && this.f1726r != i3) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f1726r), this.f1725q, spannableStringBuilder.length(), 33);
        }
        if (i3 != f1704v) {
            this.f1725q = spannableStringBuilder.length();
            this.f1726r = i3;
        }
        if (this.f1727s != -1 && this.f1728t != i4) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f1728t), this.f1727s, spannableStringBuilder.length(), 33);
        }
        if (i4 != f1705w) {
            this.f1727s = spannableStringBuilder.length();
            this.f1728t = i4;
        }
    }
}

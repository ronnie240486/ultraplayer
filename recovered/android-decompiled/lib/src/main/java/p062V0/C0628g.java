package p062V0;

import android.text.Layout;

/* JADX INFO: renamed from: V0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0628g {

    /* JADX INFO: renamed from: a */
    public String f2434a;

    /* JADX INFO: renamed from: b */
    public int f2435b;

    /* JADX INFO: renamed from: c */
    public boolean f2436c;

    /* JADX INFO: renamed from: d */
    public int f2437d;

    /* JADX INFO: renamed from: e */
    public boolean f2438e;

    /* JADX INFO: renamed from: k */
    public float f2444k;

    /* JADX INFO: renamed from: l */
    public String f2445l;

    /* JADX INFO: renamed from: o */
    public Layout.Alignment f2448o;

    /* JADX INFO: renamed from: p */
    public Layout.Alignment f2449p;

    /* JADX INFO: renamed from: r */
    public C0623b f2451r;

    /* JADX INFO: renamed from: f */
    public int f2439f = -1;

    /* JADX INFO: renamed from: g */
    public int f2440g = -1;

    /* JADX INFO: renamed from: h */
    public int f2441h = -1;

    /* JADX INFO: renamed from: i */
    public int f2442i = -1;

    /* JADX INFO: renamed from: j */
    public int f2443j = -1;

    /* JADX INFO: renamed from: m */
    public int f2446m = -1;

    /* JADX INFO: renamed from: n */
    public int f2447n = -1;

    /* JADX INFO: renamed from: q */
    public int f2450q = -1;

    /* JADX INFO: renamed from: s */
    public float f2452s = Float.MAX_VALUE;

    /* JADX INFO: renamed from: a */
    public final void m1557a(C0628g c0628g) {
        int i3;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c0628g != null) {
            if (!this.f2436c && c0628g.f2436c) {
                this.f2435b = c0628g.f2435b;
                this.f2436c = true;
            }
            if (this.f2441h == -1) {
                this.f2441h = c0628g.f2441h;
            }
            if (this.f2442i == -1) {
                this.f2442i = c0628g.f2442i;
            }
            if (this.f2434a == null && (str = c0628g.f2434a) != null) {
                this.f2434a = str;
            }
            if (this.f2439f == -1) {
                this.f2439f = c0628g.f2439f;
            }
            if (this.f2440g == -1) {
                this.f2440g = c0628g.f2440g;
            }
            if (this.f2447n == -1) {
                this.f2447n = c0628g.f2447n;
            }
            if (this.f2448o == null && (alignment2 = c0628g.f2448o) != null) {
                this.f2448o = alignment2;
            }
            if (this.f2449p == null && (alignment = c0628g.f2449p) != null) {
                this.f2449p = alignment;
            }
            if (this.f2450q == -1) {
                this.f2450q = c0628g.f2450q;
            }
            if (this.f2443j == -1) {
                this.f2443j = c0628g.f2443j;
                this.f2444k = c0628g.f2444k;
            }
            if (this.f2451r == null) {
                this.f2451r = c0628g.f2451r;
            }
            if (this.f2452s == Float.MAX_VALUE) {
                this.f2452s = c0628g.f2452s;
            }
            if (!this.f2438e && c0628g.f2438e) {
                this.f2437d = c0628g.f2437d;
                this.f2438e = true;
            }
            if (this.f2446m != -1 || (i3 = c0628g.f2446m) == -1) {
                return;
            }
            this.f2446m = i3;
        }
    }
}

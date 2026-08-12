package p061V;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: V.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0614b {

    /* JADX INFO: renamed from: A */
    public static final String f2336A;

    /* JADX INFO: renamed from: B */
    public static final String f2337B;

    /* JADX INFO: renamed from: C */
    public static final String f2338C;

    /* JADX INFO: renamed from: D */
    public static final String f2339D;

    /* JADX INFO: renamed from: E */
    public static final String f2340E;

    /* JADX INFO: renamed from: F */
    public static final String f2341F;

    /* JADX INFO: renamed from: G */
    public static final String f2342G;

    /* JADX INFO: renamed from: H */
    public static final String f2343H;

    /* JADX INFO: renamed from: I */
    public static final String f2344I;

    /* JADX INFO: renamed from: J */
    public static final String f2345J;

    /* JADX INFO: renamed from: r */
    public static final String f2346r;

    /* JADX INFO: renamed from: s */
    public static final String f2347s;

    /* JADX INFO: renamed from: t */
    public static final String f2348t;

    /* JADX INFO: renamed from: u */
    public static final String f2349u;

    /* JADX INFO: renamed from: v */
    public static final String f2350v;

    /* JADX INFO: renamed from: w */
    public static final String f2351w;

    /* JADX INFO: renamed from: x */
    public static final String f2352x;

    /* JADX INFO: renamed from: y */
    public static final String f2353y;

    /* JADX INFO: renamed from: z */
    public static final String f2354z;

    /* JADX INFO: renamed from: a */
    public final CharSequence f2355a;

    /* JADX INFO: renamed from: b */
    public final Layout.Alignment f2356b;

    /* JADX INFO: renamed from: c */
    public final Layout.Alignment f2357c;

    /* JADX INFO: renamed from: d */
    public final Bitmap f2358d;

    /* JADX INFO: renamed from: e */
    public final float f2359e;

    /* JADX INFO: renamed from: f */
    public final int f2360f;

    /* JADX INFO: renamed from: g */
    public final int f2361g;

    /* JADX INFO: renamed from: h */
    public final float f2362h;

    /* JADX INFO: renamed from: i */
    public final int f2363i;

    /* JADX INFO: renamed from: j */
    public final float f2364j;

    /* JADX INFO: renamed from: k */
    public final float f2365k;

    /* JADX INFO: renamed from: l */
    public final boolean f2366l;

    /* JADX INFO: renamed from: m */
    public final int f2367m;

    /* JADX INFO: renamed from: n */
    public final int f2368n;

    /* JADX INFO: renamed from: o */
    public final float f2369o;

    /* JADX INFO: renamed from: p */
    public final int f2370p;

    /* JADX INFO: renamed from: q */
    public final float f2371q;

    static {
        new C0614b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        int i3 = AbstractC0632A.f2454a;
        f2346r = Integer.toString(0, 36);
        f2347s = Integer.toString(17, 36);
        f2348t = Integer.toString(1, 36);
        f2349u = Integer.toString(2, 36);
        f2350v = Integer.toString(3, 36);
        f2351w = Integer.toString(18, 36);
        f2352x = Integer.toString(4, 36);
        f2353y = Integer.toString(5, 36);
        f2354z = Integer.toString(6, 36);
        f2336A = Integer.toString(7, 36);
        f2337B = Integer.toString(8, 36);
        f2338C = Integer.toString(9, 36);
        f2339D = Integer.toString(10, 36);
        f2340E = Integer.toString(11, 36);
        f2341F = Integer.toString(12, 36);
        f2342G = Integer.toString(13, 36);
        f2343H = Integer.toString(14, 36);
        f2344I = Integer.toString(15, 36);
        f2345J = Integer.toString(16, 36);
    }

    public C0614b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i3, int i4, float f3, int i5, int i6, float f4, float f5, float f6, boolean z3, int i7, int i8, float f7) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            AbstractC0646n.m1625c(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f2355a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f2355a = charSequence.toString();
        } else {
            this.f2355a = null;
        }
        this.f2356b = alignment;
        this.f2357c = alignment2;
        this.f2358d = bitmap;
        this.f2359e = f;
        this.f2360f = i3;
        this.f2361g = i4;
        this.f2362h = f3;
        this.f2363i = i5;
        this.f2364j = f5;
        this.f2365k = f6;
        this.f2366l = z3;
        this.f2367m = i7;
        this.f2368n = i6;
        this.f2369o = f4;
        this.f2370p = i8;
        this.f2371q = f7;
    }

    /* JADX INFO: renamed from: a */
    public final C0613a m1536a() {
        C0613a c0613a = new C0613a();
        c0613a.f2319a = this.f2355a;
        c0613a.f2320b = this.f2358d;
        c0613a.f2321c = this.f2356b;
        c0613a.f2322d = this.f2357c;
        c0613a.f2323e = this.f2359e;
        c0613a.f2324f = this.f2360f;
        c0613a.f2325g = this.f2361g;
        c0613a.f2326h = this.f2362h;
        c0613a.f2327i = this.f2363i;
        c0613a.f2328j = this.f2368n;
        c0613a.f2329k = this.f2369o;
        c0613a.f2330l = this.f2364j;
        c0613a.f2331m = this.f2365k;
        c0613a.f2332n = this.f2366l;
        c0613a.f2333o = this.f2367m;
        c0613a.f2334p = this.f2370p;
        c0613a.f2335q = this.f2371q;
        return c0613a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0614b.class == obj.getClass()) {
            C0614b c0614b = (C0614b) obj;
            if (TextUtils.equals(this.f2355a, c0614b.f2355a) && this.f2356b == c0614b.f2356b && this.f2357c == c0614b.f2357c) {
                Bitmap bitmap = c0614b.f2358d;
                Bitmap bitmap2 = this.f2358d;
                if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                    if (this.f2359e == c0614b.f2359e && this.f2360f == c0614b.f2360f && this.f2361g == c0614b.f2361g && this.f2362h == c0614b.f2362h && this.f2363i == c0614b.f2363i && this.f2364j == c0614b.f2364j && this.f2365k == c0614b.f2365k && this.f2366l == c0614b.f2366l && this.f2367m == c0614b.f2367m && this.f2368n == c0614b.f2368n && this.f2369o == c0614b.f2369o && this.f2370p == c0614b.f2370p && this.f2371q == c0614b.f2371q) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2355a, this.f2356b, this.f2357c, this.f2358d, Float.valueOf(this.f2359e), Integer.valueOf(this.f2360f), Integer.valueOf(this.f2361g), Float.valueOf(this.f2362h), Integer.valueOf(this.f2363i), Float.valueOf(this.f2364j), Float.valueOf(this.f2365k), Boolean.valueOf(this.f2366l), Integer.valueOf(this.f2367m), Integer.valueOf(this.f2368n), Float.valueOf(this.f2369o), Integer.valueOf(this.f2370p), Float.valueOf(this.f2371q)});
    }
}

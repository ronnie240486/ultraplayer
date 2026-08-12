package p055T;

import android.net.Uri;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.util.Arrays;
import java.util.Objects;
import p045P0.AbstractC0462h;
import p064W.AbstractC0632A;
import p105h2.AbstractC1676G;

/* JADX INFO: renamed from: T.E */
/* JADX INFO: loaded from: classes.dex */
public final class C0542E {

    /* JADX INFO: renamed from: D */
    public static final C0542E f1910D = new C0542E(new C0541D());

    /* JADX INFO: renamed from: A */
    public final CharSequence f1911A;

    /* JADX INFO: renamed from: B */
    public final Integer f1912B;

    /* JADX INFO: renamed from: C */
    public final AbstractC1676G f1913C;

    /* JADX INFO: renamed from: a */
    public final CharSequence f1914a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f1915b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f1916c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f1917d;

    /* JADX INFO: renamed from: e */
    public final String f1918e;

    /* JADX INFO: renamed from: f */
    public final CharSequence f1919f;

    /* JADX INFO: renamed from: g */
    public final byte[] f1920g;

    /* JADX INFO: renamed from: h */
    public final Integer f1921h;

    /* JADX INFO: renamed from: i */
    public final Uri f1922i;

    /* JADX INFO: renamed from: j */
    public final Integer f1923j;

    /* JADX INFO: renamed from: k */
    public final Integer f1924k;

    /* JADX INFO: renamed from: l */
    public final Integer f1925l;

    /* JADX INFO: renamed from: m */
    public final Boolean f1926m;

    /* JADX INFO: renamed from: n */
    public final Integer f1927n;

    /* JADX INFO: renamed from: o */
    public final Integer f1928o;

    /* JADX INFO: renamed from: p */
    public final Integer f1929p;

    /* JADX INFO: renamed from: q */
    public final Integer f1930q;

    /* JADX INFO: renamed from: r */
    public final Integer f1931r;

    /* JADX INFO: renamed from: s */
    public final Integer f1932s;

    /* JADX INFO: renamed from: t */
    public final Integer f1933t;

    /* JADX INFO: renamed from: u */
    public final CharSequence f1934u;

    /* JADX INFO: renamed from: v */
    public final CharSequence f1935v;

    /* JADX INFO: renamed from: w */
    public final CharSequence f1936w;

    /* JADX INFO: renamed from: x */
    public final Integer f1937x;

    /* JADX INFO: renamed from: y */
    public final Integer f1938y;

    /* JADX INFO: renamed from: z */
    public final CharSequence f1939z;

    static {
        AbstractC0462h.m1167g(0, 1, 2, 3, 4);
        AbstractC0462h.m1167g(5, 6, 8, 9, 10);
        AbstractC0462h.m1167g(11, 12, 13, 14, 15);
        AbstractC0462h.m1167g(16, 17, 18, 19, 20);
        AbstractC0462h.m1167g(21, 22, 23, 24, 25);
        AbstractC0462h.m1167g(26, 27, 28, 29, 30);
        AbstractC0462h.m1167g(31, 32, 33, 34, 1000);
    }

    public C0542E(C0541D c0541d) {
        Boolean boolValueOf = c0541d.f1896m;
        Integer numValueOf = c0541d.f1895l;
        Integer numValueOf2 = c0541d.f1882A;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i3 = 0;
                            break;
                        case 21:
                            i3 = 2;
                            break;
                        case 22:
                            i3 = 3;
                            break;
                        case 23:
                            i3 = 4;
                            break;
                        case 24:
                            i3 = 5;
                            break;
                        case 25:
                            i3 = 6;
                            break;
                    }
                    i5 = i3;
                }
                numValueOf = Integer.valueOf(i5);
            }
        } else if (numValueOf != null) {
            boolean z3 = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z3);
            if (z3 && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i4 = 21;
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 3 */:
                        i4 = 22;
                        break;
                    case 4:
                        i4 = 23;
                        break;
                    case 5:
                        i4 = 24;
                        break;
                    case 6:
                        i4 = 25;
                        break;
                    default:
                        i4 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i4);
            }
        }
        this.f1914a = c0541d.f1884a;
        this.f1915b = c0541d.f1885b;
        this.f1916c = c0541d.f1886c;
        this.f1917d = c0541d.f1887d;
        this.f1918e = c0541d.f1888e;
        this.f1919f = c0541d.f1889f;
        this.f1920g = c0541d.f1890g;
        this.f1921h = c0541d.f1891h;
        this.f1922i = c0541d.f1892i;
        this.f1923j = c0541d.f1893j;
        this.f1924k = c0541d.f1894k;
        this.f1925l = numValueOf;
        this.f1926m = boolValueOf;
        Integer num = c0541d.f1897n;
        this.f1927n = num;
        this.f1928o = num;
        this.f1929p = c0541d.f1898o;
        this.f1930q = c0541d.f1899p;
        this.f1931r = c0541d.f1900q;
        this.f1932s = c0541d.f1901r;
        this.f1933t = c0541d.f1902s;
        this.f1934u = c0541d.f1903t;
        this.f1935v = c0541d.f1904u;
        this.f1936w = c0541d.f1905v;
        this.f1937x = c0541d.f1906w;
        this.f1938y = c0541d.f1907x;
        this.f1939z = c0541d.f1908y;
        this.f1911A = c0541d.f1909z;
        this.f1912B = numValueOf2;
        this.f1913C = c0541d.f1883B;
    }

    /* JADX INFO: renamed from: a */
    public final C0541D m1350a() {
        C0541D c0541d = new C0541D();
        c0541d.f1884a = this.f1914a;
        c0541d.f1885b = this.f1915b;
        c0541d.f1886c = this.f1916c;
        c0541d.f1887d = this.f1917d;
        c0541d.f1888e = this.f1918e;
        c0541d.f1889f = this.f1919f;
        c0541d.f1890g = this.f1920g;
        c0541d.f1891h = this.f1921h;
        c0541d.f1892i = this.f1922i;
        c0541d.f1893j = this.f1923j;
        c0541d.f1894k = this.f1924k;
        c0541d.f1895l = this.f1925l;
        c0541d.f1896m = this.f1926m;
        c0541d.f1897n = this.f1928o;
        c0541d.f1898o = this.f1929p;
        c0541d.f1899p = this.f1930q;
        c0541d.f1900q = this.f1931r;
        c0541d.f1901r = this.f1932s;
        c0541d.f1902s = this.f1933t;
        c0541d.f1903t = this.f1934u;
        c0541d.f1904u = this.f1935v;
        c0541d.f1905v = this.f1936w;
        c0541d.f1906w = this.f1937x;
        c0541d.f1907x = this.f1938y;
        c0541d.f1908y = this.f1939z;
        c0541d.f1909z = this.f1911A;
        c0541d.f1882A = this.f1912B;
        c0541d.f1883B = this.f1913C;
        return c0541d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0542E.class != obj.getClass()) {
            return false;
        }
        C0542E c0542e = (C0542E) obj;
        int i3 = AbstractC0632A.f2454a;
        return Objects.equals(this.f1914a, c0542e.f1914a) && Objects.equals(this.f1915b, c0542e.f1915b) && Objects.equals(this.f1916c, c0542e.f1916c) && Objects.equals(this.f1917d, c0542e.f1917d) && Objects.equals(this.f1918e, c0542e.f1918e) && Objects.equals(this.f1919f, c0542e.f1919f) && Arrays.equals(this.f1920g, c0542e.f1920g) && Objects.equals(this.f1921h, c0542e.f1921h) && Objects.equals(this.f1922i, c0542e.f1922i) && Objects.equals(this.f1923j, c0542e.f1923j) && Objects.equals(this.f1924k, c0542e.f1924k) && Objects.equals(this.f1925l, c0542e.f1925l) && Objects.equals(this.f1926m, c0542e.f1926m) && Objects.equals(this.f1928o, c0542e.f1928o) && Objects.equals(this.f1929p, c0542e.f1929p) && Objects.equals(this.f1930q, c0542e.f1930q) && Objects.equals(this.f1931r, c0542e.f1931r) && Objects.equals(this.f1932s, c0542e.f1932s) && Objects.equals(this.f1933t, c0542e.f1933t) && Objects.equals(this.f1934u, c0542e.f1934u) && Objects.equals(this.f1935v, c0542e.f1935v) && Objects.equals(this.f1936w, c0542e.f1936w) && Objects.equals(this.f1937x, c0542e.f1937x) && Objects.equals(this.f1938y, c0542e.f1938y) && Objects.equals(this.f1939z, c0542e.f1939z) && Objects.equals(this.f1911A, c0542e.f1911A) && Objects.equals(this.f1912B, c0542e.f1912B) && Objects.equals(this.f1913C, c0542e.f1913C);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1914a, this.f1915b, this.f1916c, this.f1917d, null, this.f1918e, this.f1919f, null, null, null, Integer.valueOf(Arrays.hashCode(this.f1920g)), this.f1921h, this.f1922i, this.f1923j, this.f1924k, this.f1925l, this.f1926m, null, this.f1928o, this.f1929p, this.f1930q, this.f1931r, this.f1932s, this.f1933t, this.f1934u, this.f1935v, this.f1936w, this.f1937x, this.f1938y, this.f1939z, null, this.f1911A, this.f1912B, true, this.f1913C});
    }
}

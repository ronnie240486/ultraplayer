package p055T;

import android.text.TextUtils;
import androidx.emoji2.text.C0924n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import p000A.C0041i;
import p045P0.AbstractC0462h;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p105h2.AbstractC1676G;
import p105h2.AbstractC1723q;
import p112j2.AbstractC1789b;

/* JADX INFO: renamed from: T.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0583o {

    /* JADX INFO: renamed from: A */
    public final int f2128A;

    /* JADX INFO: renamed from: B */
    public final C0573f f2129B;

    /* JADX INFO: renamed from: C */
    public final int f2130C;

    /* JADX INFO: renamed from: D */
    public final int f2131D;

    /* JADX INFO: renamed from: E */
    public final int f2132E;

    /* JADX INFO: renamed from: F */
    public final int f2133F;

    /* JADX INFO: renamed from: G */
    public final int f2134G;

    /* JADX INFO: renamed from: H */
    public final int f2135H;

    /* JADX INFO: renamed from: I */
    public final int f2136I;

    /* JADX INFO: renamed from: J */
    public final int f2137J;

    /* JADX INFO: renamed from: K */
    public final int f2138K;

    /* JADX INFO: renamed from: L */
    public final int f2139L;

    /* JADX INFO: renamed from: M */
    public int f2140M;

    /* JADX INFO: renamed from: a */
    public final String f2141a;

    /* JADX INFO: renamed from: b */
    public final String f2142b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1676G f2143c;

    /* JADX INFO: renamed from: d */
    public final String f2144d;

    /* JADX INFO: renamed from: e */
    public final int f2145e;

    /* JADX INFO: renamed from: f */
    public final int f2146f;

    /* JADX INFO: renamed from: g */
    public final int f2147g;

    /* JADX INFO: renamed from: h */
    public final int f2148h;

    /* JADX INFO: renamed from: i */
    public final int f2149i;

    /* JADX INFO: renamed from: j */
    public final int f2150j;

    /* JADX INFO: renamed from: k */
    public final String f2151k;

    /* JADX INFO: renamed from: l */
    public final C0544G f2152l;

    /* JADX INFO: renamed from: m */
    public final String f2153m;

    /* JADX INFO: renamed from: n */
    public final String f2154n;

    /* JADX INFO: renamed from: o */
    public final int f2155o;

    /* JADX INFO: renamed from: p */
    public final int f2156p;

    /* JADX INFO: renamed from: q */
    public final List f2157q;

    /* JADX INFO: renamed from: r */
    public final C0579k f2158r;

    /* JADX INFO: renamed from: s */
    public final long f2159s;

    /* JADX INFO: renamed from: t */
    public final boolean f2160t;

    /* JADX INFO: renamed from: u */
    public final int f2161u;

    /* JADX INFO: renamed from: v */
    public final int f2162v;

    /* JADX INFO: renamed from: w */
    public final float f2163w;

    /* JADX INFO: renamed from: x */
    public final int f2164x;

    /* JADX INFO: renamed from: y */
    public final float f2165y;

    /* JADX INFO: renamed from: z */
    public final byte[] f2166z;

    static {
        new C0583o(new C0582n());
        AbstractC0632A.m1566G(0);
        AbstractC0632A.m1566G(1);
        AbstractC0632A.m1566G(2);
        AbstractC0632A.m1566G(3);
        AbstractC0632A.m1566G(4);
        AbstractC0462h.m1167g(5, 6, 7, 8, 9);
        AbstractC0462h.m1167g(10, 11, 12, 13, 14);
        AbstractC0462h.m1167g(15, 16, 17, 18, 19);
        AbstractC0462h.m1167g(20, 21, 22, 23, 24);
        AbstractC0462h.m1167g(25, 26, 27, 28, 29);
        AbstractC0632A.m1566G(30);
        AbstractC0632A.m1566G(31);
        AbstractC0632A.m1566G(32);
        AbstractC0632A.m1566G(33);
    }

    public C0583o(C0582n c0582n) {
        boolean z3;
        String str;
        this.f2141a = c0582n.f2102a;
        String strM1572M = AbstractC0632A.m1572M(c0582n.f2105d);
        this.f2144d = strM1572M;
        if (c0582n.f2104c.isEmpty() && c0582n.f2103b != null) {
            this.f2143c = AbstractC1676G.m4120r(new C0585q(strM1572M, c0582n.f2103b));
            this.f2142b = c0582n.f2103b;
        } else if (c0582n.f2104c.isEmpty() || c0582n.f2103b != null) {
            if (!c0582n.f2104c.isEmpty() || c0582n.f2103b != null) {
                int i3 = 0;
                while (true) {
                    if (i3 >= c0582n.f2104c.size()) {
                        z3 = false;
                        break;
                    } else {
                        if (((C0585q) c0582n.f2104c.get(i3)).f2169b.equals(c0582n.f2103b)) {
                            z3 = true;
                            break;
                        }
                        i3++;
                    }
                }
            } else {
                z3 = true;
                break;
            }
            AbstractC0646n.m1630h(z3);
            this.f2143c = c0582n.f2104c;
            this.f2142b = c0582n.f2103b;
        } else {
            AbstractC1676G abstractC1676G = c0582n.f2104c;
            this.f2143c = abstractC1676G;
            int size = abstractC1676G.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    str = ((C0585q) abstractC1676G.get(0)).f2169b;
                    break;
                }
                Object obj = abstractC1676G.get(i4);
                i4++;
                C0585q c0585q = (C0585q) obj;
                if (TextUtils.equals(c0585q.f2168a, strM1572M)) {
                    str = c0585q.f2169b;
                    break;
                }
            }
            this.f2142b = str;
        }
        this.f2145e = c0582n.f2106e;
        AbstractC0646n.m1629g("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", c0582n.f2108g == 0 || (c0582n.f2107f & 32768) != 0);
        this.f2146f = c0582n.f2107f;
        this.f2147g = c0582n.f2108g;
        int i5 = c0582n.f2109h;
        this.f2148h = i5;
        int i6 = c0582n.f2110i;
        this.f2149i = i6;
        this.f2150j = i6 != -1 ? i6 : i5;
        this.f2151k = c0582n.f2111j;
        this.f2152l = c0582n.f2112k;
        this.f2153m = c0582n.f2113l;
        this.f2154n = c0582n.f2114m;
        this.f2155o = c0582n.f2115n;
        this.f2156p = c0582n.f2116o;
        List list = c0582n.f2117p;
        this.f2157q = list == null ? Collections.EMPTY_LIST : list;
        C0579k c0579k = c0582n.f2118q;
        this.f2158r = c0579k;
        this.f2159s = c0582n.f2119r;
        this.f2160t = c0582n.f2120s;
        this.f2161u = c0582n.f2121t;
        this.f2162v = c0582n.f2122u;
        this.f2163w = c0582n.f2123v;
        int i7 = c0582n.f2124w;
        this.f2164x = i7 == -1 ? 0 : i7;
        float f = c0582n.f2125x;
        this.f2165y = f == -1.0f ? 1.0f : f;
        this.f2166z = c0582n.f2126y;
        this.f2128A = c0582n.f2127z;
        this.f2129B = c0582n.f2091A;
        this.f2130C = c0582n.f2092B;
        this.f2131D = c0582n.f2093C;
        this.f2132E = c0582n.f2094D;
        int i8 = c0582n.f2095E;
        this.f2133F = i8 == -1 ? 0 : i8;
        int i9 = c0582n.f2096F;
        this.f2134G = i9 != -1 ? i9 : 0;
        this.f2135H = c0582n.f2097G;
        this.f2136I = c0582n.f2098H;
        this.f2137J = c0582n.f2099I;
        this.f2138K = c0582n.f2100J;
        int i10 = c0582n.f2101K;
        if (i10 != 0 || c0579k == null) {
            this.f2139L = i10;
        } else {
            this.f2139L = 1;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m1446c(C0583o c0583o) {
        String str;
        String str2;
        int i3;
        if (c0583o == null) {
            return "null";
        }
        C0924n c0924n = new C0924n(String.valueOf(','));
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(c0583o.f2141a);
        sb.append(", mimeType=");
        sb.append(c0583o.f2154n);
        String str3 = c0583o.f2153m;
        if (str3 != null) {
            sb.append(", container=");
            sb.append(str3);
        }
        int i4 = c0583o.f2150j;
        if (i4 != -1) {
            sb.append(", bitrate=");
            sb.append(i4);
        }
        String str4 = c0583o.f2151k;
        if (str4 != null) {
            sb.append(", codecs=");
            sb.append(str4);
        }
        C0579k c0579k = c0583o.f2158r;
        if (c0579k != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i5 = 0; i5 < c0579k.f2089j; i5++) {
                UUID uuid = c0579k.f2086g[i5].f2082h;
                if (uuid.equals(AbstractC0571e.f2058b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(AbstractC0571e.f2059c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(AbstractC0571e.f2061e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(AbstractC0571e.f2060d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(AbstractC0571e.f2057a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            sb.append(", drm=[");
            c0924n.m2412a(sb, linkedHashSet.iterator());
            sb.append(']');
        }
        int i6 = c0583o.f2161u;
        if (i6 != -1 && (i3 = c0583o.f2162v) != -1) {
            sb.append(", res=");
            sb.append(i6);
            sb.append("x");
            sb.append(i3);
        }
        float f = c0583o.f2165y;
        double d3 = f;
        int i7 = AbstractC1789b.f7980a;
        if (Math.copySign(d3 - 1.0d, 1.0d) > 0.001d && d3 != 1.0d && (!Double.isNaN(d3) || !Double.isNaN(1.0d))) {
            sb.append(", par=");
            Object[] objArr = {Float.valueOf(f)};
            int i8 = AbstractC0632A.f2454a;
            sb.append(String.format(Locale.US, "%.3f", objArr));
        }
        C0573f c0573f = c0583o.f2129B;
        if (c0573f != null) {
            int i9 = c0573f.f2068f;
            int i10 = c0573f.f2067e;
            if ((i10 != -1 && i9 != -1) || c0573f.m1441d()) {
                sb.append(", color=");
                if (c0573f.m1441d()) {
                    String strM1436b = C0573f.m1436b(c0573f.f2063a);
                    String strM1435a = C0573f.m1435a(c0573f.f2064b);
                    String strM1437c = C0573f.m1437c(c0573f.f2065c);
                    Locale locale = Locale.US;
                    str2 = strM1436b + "/" + strM1435a + "/" + strM1437c;
                } else {
                    str2 = "NA/NA/NA";
                }
                sb.append(str2 + "/" + ((i10 == -1 || i9 == -1) ? "NA/NA" : i10 + "/" + i9));
            }
        }
        float f3 = c0583o.f2163w;
        if (f3 != -1.0f) {
            sb.append(", fps=");
            sb.append(f3);
        }
        int i11 = c0583o.f2130C;
        if (i11 != -1) {
            sb.append(", channels=");
            sb.append(i11);
        }
        int i12 = c0583o.f2131D;
        if (i12 != -1) {
            sb.append(", sample_rate=");
            sb.append(i12);
        }
        String str5 = c0583o.f2144d;
        if (str5 != null) {
            sb.append(", language=");
            sb.append(str5);
        }
        AbstractC1676G abstractC1676G = c0583o.f2143c;
        if (!abstractC1676G.isEmpty()) {
            sb.append(", labels=[");
            c0924n.m2412a(sb, AbstractC1723q.m4168q(abstractC1676G, new C0041i(9)).iterator());
            sb.append("]");
        }
        int i13 = c0583o.f2145e;
        if (i13 != 0) {
            sb.append(", selectionFlags=[");
            int i14 = AbstractC0632A.f2454a;
            ArrayList arrayList = new ArrayList();
            if ((i13 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i13 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i13 & 2) != 0) {
                arrayList.add("forced");
            }
            c0924n.m2412a(sb, arrayList.iterator());
            sb.append("]");
        }
        int i15 = c0583o.f2146f;
        if (i15 != 0) {
            sb.append(", roleFlags=[");
            int i16 = AbstractC0632A.f2454a;
            ArrayList arrayList2 = new ArrayList();
            if ((i15 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i15 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i15 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i15 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i15 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i15 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i15 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i15 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i15 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i15 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i15 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i15 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i15 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i15 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i15 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i15 & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            c0924n.m2412a(sb, arrayList2.iterator());
            sb.append("]");
        }
        if ((32768 & i15) != 0) {
            sb.append(", auxiliaryTrackType=");
            int i17 = AbstractC0632A.f2454a;
            int i18 = c0583o.f2147g;
            if (i18 == 0) {
                str = "undefined";
            } else if (i18 == 1) {
                str = "original";
            } else if (i18 == 2) {
                str = "depth-linear";
            } else if (i18 == 3) {
                str = "depth-inverse";
            } else {
                if (i18 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public final C0582n m1447a() {
        C0582n c0582n = new C0582n();
        c0582n.f2102a = this.f2141a;
        c0582n.f2103b = this.f2142b;
        c0582n.f2104c = this.f2143c;
        c0582n.f2105d = this.f2144d;
        c0582n.f2106e = this.f2145e;
        c0582n.f2107f = this.f2146f;
        c0582n.f2109h = this.f2148h;
        c0582n.f2110i = this.f2149i;
        c0582n.f2111j = this.f2151k;
        c0582n.f2112k = this.f2152l;
        c0582n.f2113l = this.f2153m;
        c0582n.f2114m = this.f2154n;
        c0582n.f2115n = this.f2155o;
        c0582n.f2116o = this.f2156p;
        c0582n.f2117p = this.f2157q;
        c0582n.f2118q = this.f2158r;
        c0582n.f2119r = this.f2159s;
        c0582n.f2120s = this.f2160t;
        c0582n.f2121t = this.f2161u;
        c0582n.f2122u = this.f2162v;
        c0582n.f2123v = this.f2163w;
        c0582n.f2124w = this.f2164x;
        c0582n.f2125x = this.f2165y;
        c0582n.f2126y = this.f2166z;
        c0582n.f2127z = this.f2128A;
        c0582n.f2091A = this.f2129B;
        c0582n.f2092B = this.f2130C;
        c0582n.f2093C = this.f2131D;
        c0582n.f2094D = this.f2132E;
        c0582n.f2095E = this.f2133F;
        c0582n.f2096F = this.f2134G;
        c0582n.f2097G = this.f2135H;
        c0582n.f2098H = this.f2136I;
        c0582n.f2099I = this.f2137J;
        c0582n.f2100J = this.f2138K;
        c0582n.f2101K = this.f2139L;
        return c0582n;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1448b(C0583o c0583o) {
        List list = this.f2157q;
        if (list.size() != c0583o.f2157q.size()) {
            return false;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!Arrays.equals((byte[]) list.get(i3), (byte[]) c0583o.f2157q.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final C0583o m1449d(C0583o c0583o) {
        String str;
        String str2;
        C0578j[] c0578jArr;
        if (this == c0583o) {
            return this;
        }
        int iM1359g = AbstractC0545H.m1359g(this.f2154n);
        String str3 = c0583o.f2141a;
        String str4 = c0583o.f2142b;
        if (str4 == null) {
            str4 = this.f2142b;
        }
        AbstractC1676G abstractC1676G = c0583o.f2143c;
        if (abstractC1676G.isEmpty()) {
            abstractC1676G = this.f2143c;
        }
        if ((iM1359g != 3 && iM1359g != 1) || (str = c0583o.f2144d) == null) {
            str = this.f2144d;
        }
        int i3 = this.f2148h;
        if (i3 == -1) {
            i3 = c0583o.f2148h;
        }
        int i4 = this.f2149i;
        if (i4 == -1) {
            i4 = c0583o.f2149i;
        }
        String str5 = this.f2151k;
        if (str5 == null) {
            String strM1601t = AbstractC0632A.m1601t(iM1359g, c0583o.f2151k);
            if (AbstractC0632A.m1580U(strM1601t).length == 1) {
                str5 = strM1601t;
            }
        }
        C0544G c0544gM1352e = c0583o.f2152l;
        C0544G c0544g = this.f2152l;
        if (c0544g != null) {
            c0544gM1352e = c0544g.m1352e(c0544gM1352e);
        }
        float f = this.f2163w;
        if (f == -1.0f && iM1359g == 2) {
            f = c0583o.f2163w;
        }
        int i5 = this.f2145e | c0583o.f2145e;
        int i6 = this.f2146f | c0583o.f2146f;
        ArrayList arrayList = new ArrayList();
        C0579k c0579k = c0583o.f2158r;
        if (c0579k != null) {
            C0578j[] c0578jArr2 = c0579k.f2086g;
            int length = c0578jArr2.length;
            int i7 = 0;
            while (i7 < length) {
                int i8 = length;
                C0578j c0578j = c0578jArr2[i7];
                int i9 = i7;
                if (c0578j.f2085k != null) {
                    arrayList.add(c0578j);
                }
                i7 = i9 + 1;
                length = i8;
            }
            str2 = c0579k.f2088i;
        } else {
            str2 = null;
        }
        C0579k c0579k2 = this.f2158r;
        if (c0579k2 != null) {
            if (str2 == null) {
                str2 = c0579k2.f2088i;
            }
            int size = arrayList.size();
            C0578j[] c0578jArr3 = c0579k2.f2086g;
            int length2 = c0578jArr3.length;
            String str6 = str2;
            int i10 = 0;
            while (i10 < length2) {
                int i11 = length2;
                C0578j c0578j2 = c0578jArr3[i10];
                int i12 = i10;
                if (c0578j2.f2085k != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size) {
                            c0578jArr = c0578jArr3;
                            arrayList.add(c0578j2);
                            break;
                        }
                        int i14 = i13;
                        c0578jArr = c0578jArr3;
                        if (((C0578j) arrayList.get(i13)).f2082h.equals(c0578j2.f2082h)) {
                            break;
                        }
                        i13 = i14 + 1;
                        c0578jArr3 = c0578jArr;
                    }
                } else {
                    c0578jArr = c0578jArr3;
                }
                i10 = i12 + 1;
                length2 = i11;
                c0578jArr3 = c0578jArr;
            }
            str2 = str6;
        }
        C0579k c0579k3 = arrayList.isEmpty() ? null : new C0579k(str2, false, (C0578j[]) arrayList.toArray(new C0578j[0]));
        C0582n c0582nM1447a = m1447a();
        c0582nM1447a.f2102a = str3;
        c0582nM1447a.f2103b = str4;
        c0582nM1447a.f2104c = AbstractC1676G.m4117n(abstractC1676G);
        c0582nM1447a.f2105d = str;
        c0582nM1447a.f2106e = i5;
        c0582nM1447a.f2107f = i6;
        c0582nM1447a.f2109h = i3;
        c0582nM1447a.f2110i = i4;
        c0582nM1447a.f2111j = str5;
        c0582nM1447a.f2112k = c0544gM1352e;
        c0582nM1447a.f2118q = c0579k3;
        c0582nM1447a.f2123v = f;
        c0582nM1447a.f2099I = c0583o.f2137J;
        c0582nM1447a.f2100J = c0583o.f2138K;
        return new C0583o(c0582nM1447a);
    }

    public final boolean equals(Object obj) {
        int i3;
        if (this == obj) {
            return true;
        }
        if (obj == null || C0583o.class != obj.getClass()) {
            return false;
        }
        C0583o c0583o = (C0583o) obj;
        int i4 = this.f2140M;
        return (i4 == 0 || (i3 = c0583o.f2140M) == 0 || i4 == i3) && this.f2145e == c0583o.f2145e && this.f2146f == c0583o.f2146f && this.f2147g == c0583o.f2147g && this.f2148h == c0583o.f2148h && this.f2149i == c0583o.f2149i && this.f2155o == c0583o.f2155o && this.f2159s == c0583o.f2159s && this.f2161u == c0583o.f2161u && this.f2162v == c0583o.f2162v && this.f2164x == c0583o.f2164x && this.f2128A == c0583o.f2128A && this.f2130C == c0583o.f2130C && this.f2131D == c0583o.f2131D && this.f2132E == c0583o.f2132E && this.f2133F == c0583o.f2133F && this.f2134G == c0583o.f2134G && this.f2135H == c0583o.f2135H && this.f2137J == c0583o.f2137J && this.f2138K == c0583o.f2138K && this.f2139L == c0583o.f2139L && Float.compare(this.f2163w, c0583o.f2163w) == 0 && Float.compare(this.f2165y, c0583o.f2165y) == 0 && Objects.equals(this.f2141a, c0583o.f2141a) && Objects.equals(this.f2142b, c0583o.f2142b) && this.f2143c.equals(c0583o.f2143c) && Objects.equals(this.f2151k, c0583o.f2151k) && Objects.equals(this.f2153m, c0583o.f2153m) && Objects.equals(this.f2154n, c0583o.f2154n) && Objects.equals(this.f2144d, c0583o.f2144d) && Arrays.equals(this.f2166z, c0583o.f2166z) && Objects.equals(this.f2152l, c0583o.f2152l) && Objects.equals(this.f2129B, c0583o.f2129B) && Objects.equals(this.f2158r, c0583o.f2158r) && m1448b(c0583o);
    }

    public final int hashCode() {
        if (this.f2140M == 0) {
            String str = this.f2141a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f2142b;
            int iHashCode2 = (this.f2143c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.f2144d;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f2145e) * 31) + this.f2146f) * 31) + this.f2147g) * 31) + this.f2148h) * 31) + this.f2149i) * 31;
            String str4 = this.f2151k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            C0544G c0544g = this.f2152l;
            int iHashCode5 = (iHashCode4 + (c0544g == null ? 0 : c0544g.hashCode())) * 961;
            String str5 = this.f2153m;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f2154n;
            this.f2140M = ((((((((((((((((((((Float.floatToIntBits(this.f2165y) + ((((Float.floatToIntBits(this.f2163w) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f2155o) * 31) + ((int) this.f2159s)) * 31) + this.f2161u) * 31) + this.f2162v) * 31)) * 31) + this.f2164x) * 31)) * 31) + this.f2128A) * 31) + this.f2130C) * 31) + this.f2131D) * 31) + this.f2132E) * 31) + this.f2133F) * 31) + this.f2134G) * 31) + this.f2135H) * 31) + this.f2137J) * 31) + this.f2138K) * 31) + this.f2139L;
        }
        return this.f2140M;
    }

    public final String toString() {
        return "Format(" + this.f2141a + ", " + this.f2142b + ", " + this.f2153m + ", " + this.f2154n + ", " + this.f2151k + ", " + this.f2150j + ", " + this.f2144d + ", [" + this.f2161u + ", " + this.f2162v + ", " + this.f2163w + ", " + this.f2129B + "], [" + this.f2130C + ", " + this.f2131D + "])";
    }
}

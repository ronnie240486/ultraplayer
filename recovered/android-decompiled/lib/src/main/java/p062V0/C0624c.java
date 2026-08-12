package p062V0;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p061V.C0613a;
import p061V.C0617e;
import p061V.C0619g;
import p061V.C0620h;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p122m1.AbstractC2003a;

/* JADX INFO: renamed from: V0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0624c {

    /* JADX INFO: renamed from: a */
    public final String f2399a;

    /* JADX INFO: renamed from: b */
    public final String f2400b;

    /* JADX INFO: renamed from: c */
    public final boolean f2401c;

    /* JADX INFO: renamed from: d */
    public final long f2402d;

    /* JADX INFO: renamed from: e */
    public final long f2403e;

    /* JADX INFO: renamed from: f */
    public final C0628g f2404f;

    /* JADX INFO: renamed from: g */
    public final String[] f2405g;

    /* JADX INFO: renamed from: h */
    public final String f2406h;

    /* JADX INFO: renamed from: i */
    public final String f2407i;

    /* JADX INFO: renamed from: j */
    public final C0624c f2408j;

    /* JADX INFO: renamed from: k */
    public final HashMap f2409k;

    /* JADX INFO: renamed from: l */
    public final HashMap f2410l;

    /* JADX INFO: renamed from: m */
    public ArrayList f2411m;

    public C0624c(String str, String str2, long j3, long j4, C0628g c0628g, String[] strArr, String str3, String str4, C0624c c0624c) {
        this.f2399a = str;
        this.f2400b = str2;
        this.f2407i = str4;
        this.f2404f = c0628g;
        this.f2405g = strArr;
        this.f2401c = str2 != null;
        this.f2402d = j3;
        this.f2403e = j4;
        str3.getClass();
        this.f2406h = str3;
        this.f2408j = c0624c;
        this.f2409k = new HashMap();
        this.f2410l = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public static C0624c m1538a(String str) {
        return new C0624c(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* JADX INFO: renamed from: e */
    public static SpannableStringBuilder m1539e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C0613a c0613a = new C0613a();
            c0613a.f2319a = new SpannableStringBuilder();
            treeMap.put(str, c0613a);
        }
        CharSequence charSequence = ((C0613a) treeMap.get(str)).f2319a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    /* JADX INFO: renamed from: b */
    public final C0624c m1540b(int i3) {
        ArrayList arrayList = this.f2411m;
        if (arrayList != null) {
            return (C0624c) arrayList.get(i3);
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: c */
    public final int m1541c() {
        ArrayList arrayList = this.f2411m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* JADX INFO: renamed from: d */
    public final void m1542d(TreeSet treeSet, boolean z3) {
        String str = this.f2399a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z3 || zEquals || (zEquals2 && this.f2407i != null)) {
            long j3 = this.f2402d;
            if (j3 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j3));
            }
            long j4 = this.f2403e;
            if (j4 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j4));
            }
        }
        if (this.f2411m == null) {
            return;
        }
        for (int i3 = 0; i3 < this.f2411m.size(); i3++) {
            ((C0624c) this.f2411m.get(i3)).m1542d(treeSet, z3 || zEquals);
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1543f(long j3) {
        long j4 = this.f2403e;
        long j5 = this.f2402d;
        if (j5 == -9223372036854775807L && j4 == -9223372036854775807L) {
            return true;
        }
        if (j5 <= j3 && j4 == -9223372036854775807L) {
            return true;
        }
        if (j5 != -9223372036854775807L || j3 >= j4) {
            return j5 <= j3 && j3 < j4;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m1544g(long j3, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f2406h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (m1543f(j3) && "div".equals(this.f2399a) && (str2 = this.f2407i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i3 = 0; i3 < m1541c(); i3++) {
            m1540b(i3).m1544g(j3, str, arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0211  */
    /* JADX WARN: Code duplicated, block: B:147:0x021f  */
    /* JADX WARN: Code duplicated, block: B:149:0x0222  */
    /* JADX WARN: Code duplicated, block: B:151:0x0225  */
    /* JADX WARN: Code duplicated, block: B:152:0x022b  */
    /* JADX WARN: Code duplicated, block: B:154:0x023c  */
    /* JADX WARN: Code duplicated, block: B:167:0x026d  */
    /* JADX WARN: Code duplicated, block: B:170:0x0285  */
    /* JADX WARN: Code duplicated, block: B:171:0x0294  */
    /* JADX WARN: Code duplicated, block: B:174:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:176:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:179:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:182:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:195:0x02d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x02d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b9  */
    /* JADX INFO: renamed from: h */
    public final void m1545h(long j3, Map map, HashMap map2, String str, TreeMap treeMap) {
        Iterator it;
        int i3;
        C0624c c0624c;
        C0628g c0628gM4543p;
        int i4;
        float f;
        float f3;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        float sizeChange;
        RelativeSizeSpan[] relativeSizeSpanArr;
        int length;
        int i5;
        RelativeSizeSpan relativeSizeSpan;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = -1;
        int i11 = 1;
        if (m1543f(j3)) {
            String str2 = this.f2406h;
            String str3 = "".equals(str2) ? str : str2;
            Iterator it2 = this.f2410l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap map3 = this.f2409k;
                int iIntValue = map3.containsKey(str4) ? ((Integer) map3.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    C0613a c0613a = (C0613a) treeMap.get(str4);
                    c0613a.getClass();
                    C0627f c0627f = (C0627f) map2.get(str3);
                    c0627f.getClass();
                    C0628g c0628gM4543p2 = AbstractC2003a.m4543p(this.f2404f, this.f2405g, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c0613a.f2319a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        c0613a.f2319a = spannableStringBuilder;
                    }
                    if (c0628gM4543p2 != null) {
                        int i12 = c0628gM4543p2.f2441h;
                        if (((i12 == i10 && c0628gM4543p2.f2442i == i10) ? -1 : (i12 == i11 ? 1 : 0) | (c0628gM4543p2.f2442i == i11 ? 2 : 0)) != i10) {
                            int i13 = c0628gM4543p2.f2441h;
                            if (i13 != i10) {
                                if (i13 == i11) {
                                    i7 = 1;
                                } else {
                                    i7 = 0;
                                }
                                if (c0628gM4543p2.f2442i == i11) {
                                    i8 = 2;
                                } else {
                                    i8 = 0;
                                }
                                i9 = i7 | i8;
                            } else if (c0628gM4543p2.f2442i == i10) {
                                i11 = 1;
                                i9 = -1;
                            } else {
                                i11 = 1;
                                if (i13 == i11) {
                                    i7 = 1;
                                } else {
                                    i7 = 0;
                                }
                                if (c0628gM4543p2.f2442i == i11) {
                                    i8 = 2;
                                } else {
                                    i8 = 0;
                                }
                                i9 = i7 | i8;
                            }
                            StyleSpan styleSpan = new StyleSpan(i9);
                            i3 = 33;
                            spannableStringBuilder.setSpan(styleSpan, iIntValue, iIntValue2, 33);
                        } else {
                            i3 = 33;
                        }
                        if (c0628gM4543p2.f2439f == i11) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, i3);
                        }
                        if (c0628gM4543p2.f2440g == i11) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, i3);
                        }
                        if (c0628gM4543p2.f2436c) {
                            if (!c0628gM4543p2.f2436c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            AbstractC1303m.m3306b(spannableStringBuilder, new ForegroundColorSpan(c0628gM4543p2.f2435b), iIntValue, iIntValue2);
                        }
                        if (c0628gM4543p2.f2438e) {
                            if (!c0628gM4543p2.f2438e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            AbstractC1303m.m3306b(spannableStringBuilder, new BackgroundColorSpan(c0628gM4543p2.f2437d), iIntValue, iIntValue2);
                        }
                        if (c0628gM4543p2.f2434a != null) {
                            AbstractC1303m.m3306b(spannableStringBuilder, new TypefaceSpan(c0628gM4543p2.f2434a), iIntValue, iIntValue2);
                        }
                        C0623b c0623b = c0628gM4543p2.f2451r;
                        if (c0623b != null) {
                            int i14 = c0623b.f2396a;
                            if (i14 == i10) {
                                int i15 = c0627f.f2433j;
                                i14 = (i15 == 2 || i15 == 1) ? 3 : 1;
                                i6 = 1;
                            } else {
                                i6 = c0623b.f2397b;
                            }
                            int i16 = c0623b.f2398c;
                            if (i16 == -2) {
                                i16 = 1;
                            }
                            AbstractC1303m.m3306b(spannableStringBuilder, new C0620h(i14, i6, i16), iIntValue, iIntValue2);
                        }
                        int i17 = c0628gM4543p2.f2446m;
                        if (i17 == 2) {
                            C0624c c0624c2 = this.f2408j;
                            while (true) {
                                if (c0624c2 == null) {
                                    c0624c2 = null;
                                    break;
                                }
                                C0628g c0628gM4543p3 = AbstractC2003a.m4543p(c0624c2.f2404f, c0624c2.f2405g, map);
                                if (c0628gM4543p3 != null && c0628gM4543p3.f2446m == 1) {
                                    break;
                                } else {
                                    c0624c2 = c0624c2.f2408j;
                                }
                            }
                            if (c0624c2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(c0624c2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        c0624c = null;
                                        break;
                                    }
                                    C0624c c0624c3 = (C0624c) arrayDeque.pop();
                                    C0628g c0628gM4543p4 = AbstractC2003a.m4543p(c0624c3.f2404f, c0624c3.f2405g, map);
                                    if (c0628gM4543p4 != null && c0628gM4543p4.f2446m == 3) {
                                        c0624c = c0624c3;
                                        break;
                                    }
                                    for (int iM1541c = c0624c3.m1541c() - 1; iM1541c >= 0; iM1541c--) {
                                        arrayDeque.push(c0624c3.m1540b(iM1541c));
                                    }
                                }
                                if (c0624c != null) {
                                    if (c0624c.m1541c() != 1 || c0624c.m1540b(0).f2400b == null) {
                                        AbstractC0646n.m1639q("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str5 = c0624c.m1540b(0).f2400b;
                                        int i18 = AbstractC0632A.f2454a;
                                        C0628g c0628gM4543p5 = AbstractC2003a.m4543p(c0624c.f2404f, c0624c.f2405g, map);
                                        int i19 = c0628gM4543p5 != null ? c0628gM4543p5.f2447n : -1;
                                        if (i19 == -1 && (c0628gM4543p = AbstractC2003a.m4543p(c0624c2.f2404f, c0624c2.f2405g, map)) != null) {
                                            i19 = c0628gM4543p.f2447n;
                                        }
                                        spannableStringBuilder.setSpan(new C0619g(i19, str5), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                            if (c0628gM4543p2.f2450q == 1) {
                                AbstractC1303m.m3306b(spannableStringBuilder, new C0617e(), iIntValue, iIntValue2);
                            }
                            i4 = c0628gM4543p2.f2443j;
                            if (i4 != 1) {
                                it = it2;
                                f = 100.0f;
                                AbstractC1303m.m3306b(spannableStringBuilder, new AbsoluteSizeSpan((int) c0628gM4543p2.f2444k, true), iIntValue, iIntValue2);
                            } else if (i4 != 2) {
                                it = it2;
                                f = 100.0f;
                                AbstractC1303m.m3306b(spannableStringBuilder, new RelativeSizeSpan(c0628gM4543p2.f2444k), iIntValue, iIntValue2);
                            } else if (i4 != 3) {
                                it = it2;
                                f = 100.0f;
                            } else {
                                sizeChange = c0628gM4543p2.f2444k / 100.0f;
                                relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                                length = relativeSizeSpanArr.length;
                                i5 = 0;
                                f = 100.0f;
                                while (i5 < length) {
                                    relativeSizeSpan = relativeSizeSpanArr[i5];
                                    Iterator it3 = it2;
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= iIntValue2) {
                                        sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                    }
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) != iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) == iIntValue2) {
                                        if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                            spannableStringBuilder.removeSpan(relativeSizeSpan);
                                        }
                                    }
                                    i5++;
                                    it2 = it3;
                                }
                                it = it2;
                                spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                            }
                            if ("p".equals(this.f2399a)) {
                                f3 = c0628gM4543p2.f2452s;
                                if (f3 != Float.MAX_VALUE) {
                                    c0613a.f2335q = (f3 * (-90.0f)) / f;
                                }
                                alignment = c0628gM4543p2.f2448o;
                                if (alignment != null) {
                                    c0613a.f2321c = alignment;
                                }
                                alignment2 = c0628gM4543p2.f2449p;
                                if (alignment2 != null) {
                                    c0613a.f2322d = alignment2;
                                }
                            }
                        } else if (i17 == 3 || i17 == 4) {
                            spannableStringBuilder.setSpan(new C0622a(), iIntValue, iIntValue2, 33);
                        }
                        if (c0628gM4543p2.f2450q == 1) {
                            AbstractC1303m.m3306b(spannableStringBuilder, new C0617e(), iIntValue, iIntValue2);
                        }
                        i4 = c0628gM4543p2.f2443j;
                        if (i4 != 1) {
                            it = it2;
                            f = 100.0f;
                            AbstractC1303m.m3306b(spannableStringBuilder, new AbsoluteSizeSpan((int) c0628gM4543p2.f2444k, true), iIntValue, iIntValue2);
                        } else if (i4 != 2) {
                            it = it2;
                            f = 100.0f;
                            AbstractC1303m.m3306b(spannableStringBuilder, new RelativeSizeSpan(c0628gM4543p2.f2444k), iIntValue, iIntValue2);
                        } else if (i4 != 3) {
                            it = it2;
                            f = 100.0f;
                        } else {
                            sizeChange = c0628gM4543p2.f2444k / 100.0f;
                            relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                            length = relativeSizeSpanArr.length;
                            i5 = 0;
                            f = 100.0f;
                            while (i5 < length) {
                                relativeSizeSpan = relativeSizeSpanArr[i5];
                                Iterator it4 = it2;
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue) {
                                    sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                }
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) != iIntValue) {
                                }
                                i5++;
                                it2 = it4;
                            }
                            it = it2;
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                        }
                        if ("p".equals(this.f2399a)) {
                            f3 = c0628gM4543p2.f2452s;
                            if (f3 != Float.MAX_VALUE) {
                                c0613a.f2335q = (f3 * (-90.0f)) / f;
                            }
                            alignment = c0628gM4543p2.f2448o;
                            if (alignment != null) {
                                c0613a.f2321c = alignment;
                            }
                            alignment2 = c0628gM4543p2.f2449p;
                            if (alignment2 != null) {
                                c0613a.f2322d = alignment2;
                            }
                        }
                    }
                    it2 = it;
                    i10 = -1;
                    i11 = 1;
                }
                it = it2;
                it2 = it;
                i10 = -1;
                i11 = 1;
            }
            for (int i20 = 0; i20 < m1541c(); i20++) {
                m1540b(i20).m1545h(j3, map, map2, str3, treeMap);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m1546i(long j3, boolean z3, String str, TreeMap treeMap) {
        HashMap map = this.f2409k;
        map.clear();
        HashMap map2 = this.f2410l;
        map2.clear();
        String str2 = this.f2399a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f2406h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f2401c && z3) {
            SpannableStringBuilder spannableStringBuilderM1539e = m1539e(str4, treeMap);
            String str5 = this.f2400b;
            str5.getClass();
            spannableStringBuilderM1539e.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z3) {
            m1539e(str4, treeMap).append('\n');
            return;
        }
        if (m1543f(j3)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((C0613a) entry.getValue()).f2319a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i3 = 0; i3 < m1541c(); i3++) {
                m1540b(i3).m1546i(j3, z3 || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderM1539e2 = m1539e(str4, treeMap);
                int length = spannableStringBuilderM1539e2.length() - 1;
                while (length >= 0 && spannableStringBuilderM1539e2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderM1539e2.charAt(length) != '\n') {
                    spannableStringBuilderM1539e2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((C0613a) entry2.getValue()).f2319a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}

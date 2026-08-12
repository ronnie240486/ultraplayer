package p068X0;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p061V.C0617e;
import p061V.C0619g;
import p061V.C0621i;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;

/* JADX INFO: renamed from: X0.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0696i {

    /* JADX INFO: renamed from: a */
    public static final Pattern f2686a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b */
    public static final Pattern f2687b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c */
    public static final Map f2688c;

    /* JADX INFO: renamed from: d */
    public static final Map f2689d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f2688c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f2689d = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x001e  */
    /* JADX INFO: renamed from: a */
    public static void m1816a(String str, C0693f c0693f, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i3;
        int i4;
        int i5;
        int i6 = c0693f.f2670b;
        int length = spannableStringBuilder.length();
        String str2 = c0693f.f2669a;
        str2.getClass();
        int i7 = -1;
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i6, length, 33);
                break;
            case "c":
                for (String str3 : c0693f.f2672d) {
                    Map map = f2688c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i6, length, 33);
                    } else {
                        Map map2 = f2689d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i6, length, 33);
                        }
                    }
                }
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i6, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i6, length, 33);
                break;
            case "v":
                spannableStringBuilder.setSpan(new C0621i(c0693f.f2671c), i6, length, 33);
                break;
            case "ruby":
                int iM1818c = m1818c(list2, str, c0693f);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, C0692e.f2666c);
                int i8 = c0693f.f2670b;
                int i9 = 0;
                int length2 = 0;
                while (i9 < arrayList.size()) {
                    if ("rt".equals(((C0692e) arrayList.get(i9)).f2667a.f2669a)) {
                        C0692e c0692e = (C0692e) arrayList.get(i9);
                        int iM1818c2 = m1818c(list2, str, c0692e.f2667a);
                        if (iM1818c2 == i7) {
                            iM1818c2 = iM1818c != i7 ? iM1818c : 1;
                        }
                        int i10 = c0692e.f2667a.f2670b - length2;
                        int i11 = c0692e.f2668b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i10, i11);
                        spannableStringBuilder.delete(i10, i11);
                        spannableStringBuilder.setSpan(new C0619g(iM1818c2, charSequenceSubSequence.toString()), i8, i10, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i8 = i10;
                    }
                    i9++;
                    i7 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList arrayListM1817b = m1817b(list2, str, c0693f);
        for (int i12 = 0; i12 < arrayListM1817b.size(); i12++) {
            C0690c c0690c = ((C0694g) arrayListM1817b.get(i12)).f2674h;
            int i13 = c0690c.f2657l;
            if (i13 == -1 && c0690c.f2658m == -1) {
                i3 = -1;
            } else {
                i3 = (c0690c.f2658m == 1 ? (char) 2 : (char) 0) | (i13 == 1 ? (char) 1 : (char) 0);
            }
            if (i3 != -1) {
                int i14 = c0690c.f2657l;
                if (i14 == -1 && c0690c.f2658m == -1) {
                    i5 = -1;
                    i4 = 1;
                } else {
                    i4 = 1;
                    i5 = (i14 == 1 ? 1 : 0) | (c0690c.f2658m == 1 ? 2 : 0);
                }
                AbstractC1303m.m3306b(spannableStringBuilder, new StyleSpan(i5), i6, length);
            } else {
                i4 = 1;
            }
            if (c0690c.f2655j == i4) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i6, length, 33);
            }
            if (c0690c.f2656k == i4) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i6, length, 33);
            }
            if (c0690c.f2652g) {
                if (!c0690c.f2652g) {
                    throw new IllegalStateException("Font color not defined");
                }
                AbstractC1303m.m3306b(spannableStringBuilder, new ForegroundColorSpan(c0690c.f2651f), i6, length);
            }
            if (c0690c.f2654i) {
                if (!c0690c.f2654i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                AbstractC1303m.m3306b(spannableStringBuilder, new BackgroundColorSpan(c0690c.f2653h), i6, length);
            }
            if (c0690c.f2650e != null) {
                AbstractC1303m.m3306b(spannableStringBuilder, new TypefaceSpan(c0690c.f2650e), i6, length);
            }
            int i15 = c0690c.f2659n;
            if (i15 == 1) {
                AbstractC1303m.m3306b(spannableStringBuilder, new AbsoluteSizeSpan((int) c0690c.f2660o, true), i6, length);
            } else if (i15 == 2) {
                AbstractC1303m.m3306b(spannableStringBuilder, new RelativeSizeSpan(c0690c.f2660o), i6, length);
            } else if (i15 == 3) {
                AbstractC1303m.m3306b(spannableStringBuilder, new RelativeSizeSpan(c0690c.f2660o / 100.0f), i6, length);
            }
            if (c0690c.f2662q) {
                spannableStringBuilder.setSpan(new C0617e(), i6, length, 33);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX INFO: renamed from: b */
    public static ArrayList m1817b(List list, String str, C0693f c0693f) {
        ?? r4;
        int size;
        boolean zIsEmpty;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            C0690c c0690c = (C0690c) list.get(i3);
            String str2 = c0693f.f2669a;
            if (c0690c.f2646a.isEmpty() && c0690c.f2647b.isEmpty() && c0690c.f2648c.isEmpty() && c0690c.f2649d.isEmpty()) {
                zIsEmpty = TextUtils.isEmpty(str2);
            } else {
                int iM1814a = C0690c.m1814a(C0690c.m1814a(C0690c.m1814a(0, 1073741824, c0690c.f2646a, str), 2, c0690c.f2647b, str2), 4, c0690c.f2649d, c0693f.f2671c);
                if (iM1814a != -1) {
                    if (c0693f.f2672d.containsAll(c0690c.f2648c)) {
                        size = iM1814a + (c0690c.f2648c.size() * 4);
                    } else {
                        r4 = 0;
                    }
                } else {
                    r4 = 0;
                }
            }
            if (r4 > 0) {
                r4 = size;
                r4 = zIsEmpty;
                arrayList.add(new C0694g(r4, c0690c));
            } else {
                r4 = size;
                r4 = zIsEmpty;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static int m1818c(List list, String str, C0693f c0693f) {
        ArrayList arrayListM1817b = m1817b(list, str, c0693f);
        for (int i3 = 0; i3 < arrayListM1817b.size(); i3++) {
            int i4 = ((C0694g) arrayListM1817b.get(i3)).f2674h.f2661p;
            if (i4 != -1) {
                return i4;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static C0691d m1819d(String str, Matcher matcher, C0651s c0651s, ArrayList arrayList) {
        C0695h c0695h = new C0695h();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            c0695h.f2675a = AbstractC0697j.m1825c(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            c0695h.f2676b = AbstractC0697j.m1825c(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            m1820e(strGroup3, c0695h);
            StringBuilder sb = new StringBuilder();
            c0651s.getClass();
            String strM1674h = c0651s.m1674h(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strM1674h)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strM1674h.trim());
                strM1674h = c0651s.m1674h(StandardCharsets.UTF_8);
            }
            c0695h.f2677c = m1821f(str, sb.toString(), arrayList);
            return new C0691d(c0695h.m1815a().m1535a(), c0695h.f2675a, c0695h.f2676b);
        } catch (NumberFormatException unused) {
            AbstractC0646n.m1647y("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x0048  */
    /* JADX WARN: Code duplicated, block: B:53:0x00be  */
    /* JADX INFO: renamed from: e */
    public static void m1820e(String str, C0695h c0695h) {
        int i3;
        int i4;
        int i5;
        Matcher matcher = f2687b.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    m1822g(strGroup2, c0695h);
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2) {
                        case "center":
                        case "middle":
                            i3 = 2;
                            break;
                        case "end":
                            i3 = 3;
                            break;
                        case "left":
                            i3 = 4;
                            break;
                        case "right":
                            i3 = 5;
                            break;
                        case "start":
                            i3 = 1;
                            break;
                        default:
                            AbstractC0646n.m1647y("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                            i3 = 2;
                            break;
                    }
                    c0695h.f2678d = i3;
                } else if ("position".equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    if (iIndexOf != -1) {
                        String strSubstring = strGroup2.substring(iIndexOf + 1);
                        strSubstring.getClass();
                        switch (strSubstring) {
                            case "line-left":
                            case "start":
                                i4 = 0;
                                break;
                            case "center":
                            case "middle":
                                i4 = 1;
                                break;
                            case "line-right":
                            case "end":
                                i4 = 2;
                                break;
                            default:
                                AbstractC0646n.m1647y("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                                i4 = Integer.MIN_VALUE;
                                break;
                        }
                        c0695h.f2683i = i4;
                        strGroup2 = strGroup2.substring(0, iIndexOf);
                    }
                    c0695h.f2682h = AbstractC0697j.m1824b(strGroup2);
                } else if ("size".equals(strGroup)) {
                    c0695h.f2684j = AbstractC0697j.m1824b(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    if (strGroup2.equals("lr")) {
                        i5 = 2;
                    } else if (strGroup2.equals("rl")) {
                        i5 = 1;
                    } else {
                        AbstractC0646n.m1647y("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                        i5 = Integer.MIN_VALUE;
                    }
                    c0695h.f2685k = i5;
                } else {
                    AbstractC0646n.m1647y("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                }
            } catch (NumberFormatException unused) {
                AbstractC0646n.m1647y("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a5  */
    /* JADX WARN: Failed to find 'out' block for switch in B:69:0x00ff. Please report as an issue. */
    /* JADX INFO: renamed from: f */
    public static SpannedString m1821f(String str, String str2, List list) {
        char c;
        int i3 = 2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (true) {
            String strTrim = "";
            if (i4 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    m1816a(str, (C0693f) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                m1816a(str, new C0693f("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i4);
            if (cCharAt == '&') {
                i4++;
                int iIndexOf = str2.indexOf(59, i4);
                int iIndexOf2 = str2.indexOf(32, i4);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(i4, iIndexOf);
                    strSubstring.getClass();
                    switch (strSubstring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            AbstractC0646n.m1647y("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i4 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i4++;
            } else {
                int length = i4 + 1;
                if (length < str2.length()) {
                    boolean z3 = str2.charAt(length) == '/';
                    int iIndexOf3 = str2.indexOf(62, length);
                    length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                    int i5 = length - 2;
                    boolean z4 = str2.charAt(i5) == '/';
                    int i6 = i4 + (z3 ? 2 : 1);
                    if (!z4) {
                        i5 = length - 1;
                    }
                    String strSubstring2 = str2.substring(i6, i5);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim2 = strSubstring2.trim();
                        AbstractC0646n.m1625c(!strTrim2.isEmpty());
                        int i7 = AbstractC0632A.f2454a;
                        String str3 = strTrim2.split("[ \\.]", i3)[0];
                        str3.getClass();
                        switch (str3) {
                            case "b":
                            case "c":
                            case "i":
                            case "u":
                            case "v":
                            case "rt":
                            case "lang":
                            case "ruby":
                                if (!z3) {
                                    if (!z4) {
                                        int length2 = spannableStringBuilder.length();
                                        String strTrim3 = strSubstring2.trim();
                                        AbstractC0646n.m1625c(!strTrim3.isEmpty());
                                        int iIndexOf4 = strTrim3.indexOf(" ");
                                        if (iIndexOf4 == -1) {
                                            c = 0;
                                        } else {
                                            strTrim = strTrim3.substring(iIndexOf4).trim();
                                            c = 0;
                                            strTrim3 = strTrim3.substring(0, iIndexOf4);
                                        }
                                        String[] strArrSplit = strTrim3.split("\\.", -1);
                                        String str4 = strArrSplit[c];
                                        HashSet hashSet = new HashSet();
                                        for (int i8 = 1; i8 < strArrSplit.length; i8++) {
                                            hashSet.add(strArrSplit[i8]);
                                        }
                                        arrayDeque.push(new C0693f(str4, length2, strTrim, hashSet));
                                    }
                                    break;
                                } else {
                                    while (!arrayDeque.isEmpty()) {
                                        C0693f c0693f = (C0693f) arrayDeque.pop();
                                        m1816a(str, c0693f, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new C0692e(c0693f, spannableStringBuilder.length()));
                                        }
                                        if (c0693f.f2669a.equals(str3)) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    i4 = length;
                }
                i4 = length;
            }
            i3 = 2;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m1822g(String str, C0695h c0695h) {
        int i3 = 2;
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            switch (strSubstring) {
                case "center":
                case "middle":
                    i3 = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i3 = 0;
                    break;
                default:
                    AbstractC0646n.m1647y("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i3 = Integer.MIN_VALUE;
                    break;
            }
            c0695h.f2681g = i3;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            c0695h.f2679e = AbstractC0697j.m1824b(str);
            c0695h.f2680f = 0;
        } else {
            c0695h.f2679e = Integer.parseInt(str);
            c0695h.f2680f = 1;
        }
    }
}

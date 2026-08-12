package p056T0;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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

/* JADX INFO: renamed from: T0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0596b implements InterfaceC0465k {

    /* JADX INFO: renamed from: m */
    public static final Pattern f2211m = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: g */
    public final boolean f2212g;

    /* JADX INFO: renamed from: h */
    public final C0595a f2213h;

    /* JADX INFO: renamed from: j */
    public LinkedHashMap f2215j;

    /* JADX INFO: renamed from: k */
    public float f2216k = -3.4028235E38f;

    /* JADX INFO: renamed from: l */
    public float f2217l = -3.4028235E38f;

    /* JADX INFO: renamed from: i */
    public final C0651s f2214i = new C0651s();

    public C0596b(List list) {
        if (list == null || list.isEmpty()) {
            this.f2212g = false;
            this.f2213h = null;
            return;
        }
        this.f2212g = true;
        String strM1595n = AbstractC0632A.m1595n((byte[]) list.get(0));
        AbstractC0646n.m1625c(strM1595n.startsWith("Format:"));
        C0595a c0595aM1455b = C0595a.m1455b(strM1595n);
        c0595aM1455b.getClass();
        this.f2213h = c0595aM1455b;
        m1459c(new C0651s((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: a */
    public static int m1457a(long j3, ArrayList arrayList, ArrayList arrayList2) {
        int i3;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i3 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j3) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j3) {
                i3 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i3, Long.valueOf(j3));
        arrayList2.add(i3, i3 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i3 - 1)));
        return i3;
    }

    /* JADX INFO: renamed from: d */
    public static long m1458d(String str) {
        Matcher matcher = f2211m.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i3 = AbstractC0632A.f2454a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    @Override // p045P0.InterfaceC0465k
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo514b() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:167:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cf  */
    /* JADX INFO: renamed from: c */
    public final void m1459c(C0651s c0651s, Charset charset) {
        float f;
        int i3;
        C0599e c0599e;
        int i4;
        float f3;
        int i5 = 6;
        int i6 = 7;
        int i7 = 2;
        char c = 0;
        while (true) {
            String strM1674h = c0651s.m1674h(charset);
            if (strM1674h == null) {
                return;
            }
            char c2 = '[';
            if ("[Script Info]".equalsIgnoreCase(strM1674h)) {
                while (true) {
                    String strM1674h2 = c0651s.m1674h(charset);
                    if (strM1674h2 == null || (c0651s.m1667a() != 0 && c0651s.m1669c(charset) == '[')) {
                        break;
                    }
                    String[] strArrSplit = strM1674h2.split(":");
                    if (strArrSplit.length == i7) {
                        String strM3288K = AbstractC1303m.m3288K(strArrSplit[c].trim());
                        strM3288K.getClass();
                        if (strM3288K.equals("playresx")) {
                            this.f2216k = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strM3288K.equals("playresy")) {
                            try {
                                this.f2217l = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else {
                if ("[V4+ Styles]".equalsIgnoreCase(strM1674h)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C0597c c0597c = null;
                    while (true) {
                        String strM1674h3 = c0651s.m1674h(charset);
                        if (strM1674h3 != null && (c0651s.m1667a() == 0 || c0651s.m1669c(charset) != c2)) {
                            if (strM1674h3.startsWith("Format:")) {
                                String[] strArrSplit2 = TextUtils.split(strM1674h3.substring(i6), ",");
                                int i8 = -1;
                                int i9 = -1;
                                int i10 = -1;
                                int i11 = -1;
                                int i12 = -1;
                                int i13 = -1;
                                int i14 = -1;
                                int i15 = -1;
                                int i16 = -1;
                                int i17 = -1;
                                for (int i18 = 0; i18 < strArrSplit2.length; i18++) {
                                    String strM3288K2 = AbstractC1303m.m3288K(strArrSplit2[i18].trim());
                                    strM3288K2.getClass();
                                    switch (strM3288K2) {
                                        case "italic":
                                            i14 = i18;
                                            break;
                                        case "underline":
                                            i15 = i18;
                                            break;
                                        case "strikeout":
                                            i16 = i18;
                                            break;
                                        case "primarycolour":
                                            i10 = i18;
                                            break;
                                        case "bold":
                                            i13 = i18;
                                            break;
                                        case "name":
                                            i8 = i18;
                                            break;
                                        case "fontsize":
                                            i12 = i18;
                                            break;
                                        case "borderstyle":
                                            i17 = i18;
                                            break;
                                        case "alignment":
                                            i9 = i18;
                                            break;
                                        case "outlinecolour":
                                            i11 = i18;
                                            break;
                                    }
                                }
                                c0597c = i8 != -1 ? new C0597c(i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, strArrSplit2.length) : null;
                                i6 = 7;
                            } else {
                                if (strM1674h3.startsWith("Style:")) {
                                    if (c0597c == null) {
                                        AbstractC0646n.m1647y("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strM1674h3));
                                    } else {
                                        AbstractC0646n.m1625c(strM1674h3.startsWith("Style:"));
                                        String[] strArrSplit3 = TextUtils.split(strM1674h3.substring(i5), ",");
                                        int length = strArrSplit3.length;
                                        int i19 = c0597c.f2228k;
                                        if (length != i19) {
                                            int length2 = strArrSplit3.length;
                                            int i20 = AbstractC0632A.f2454a;
                                            Locale locale = Locale.US;
                                            AbstractC0646n.m1647y("SsaStyle", "Skipping malformed 'Style:' line (expected " + i19 + " values, found " + length2 + "): '" + strM1674h3 + "'");
                                        } else {
                                            try {
                                                String strTrim = strArrSplit3[c0597c.f2218a].trim();
                                                int i21 = c0597c.f2219b;
                                                int iM1461a = i21 != -1 ? C0599e.m1461a(strArrSplit3[i21].trim()) : -1;
                                                int i22 = c0597c.f2220c;
                                                Integer numM1463c = i22 != -1 ? C0599e.m1463c(strArrSplit3[i22].trim()) : null;
                                                int i23 = c0597c.f2221d;
                                                Integer numM1463c2 = i23 != -1 ? C0599e.m1463c(strArrSplit3[i23].trim()) : null;
                                                int i24 = c0597c.f2222e;
                                                if (i24 != -1) {
                                                    String strTrim2 = strArrSplit3[i24].trim();
                                                    try {
                                                        f3 = Float.parseFloat(strTrim2);
                                                    } catch (NumberFormatException e3) {
                                                        AbstractC0646n.m1648z("SsaStyle", "Failed to parse font size: '" + strTrim2 + "'", e3);
                                                        f3 = -3.4028235E38f;
                                                    }
                                                    f = f3;
                                                } else {
                                                    f = -3.4028235E38f;
                                                }
                                                int i25 = c0597c.f2223f;
                                                boolean z3 = i25 != -1 && C0599e.m1462b(strArrSplit3[i25].trim());
                                                int i26 = c0597c.f2224g;
                                                boolean z4 = i26 != -1 && C0599e.m1462b(strArrSplit3[i26].trim());
                                                int i27 = c0597c.f2225h;
                                                boolean z5 = i27 != -1 && C0599e.m1462b(strArrSplit3[i27].trim());
                                                int i28 = c0597c.f2226i;
                                                boolean z6 = i28 != -1 && C0599e.m1462b(strArrSplit3[i28].trim());
                                                int i29 = c0597c.f2227j;
                                                if (i29 != -1) {
                                                    String strTrim3 = strArrSplit3[i29].trim();
                                                    try {
                                                        i4 = Integer.parseInt(strTrim3.trim());
                                                        if (i4 != 1 && i4 != 3) {
                                                            AbstractC0646n.m1647y("SsaStyle", "Ignoring unknown BorderStyle: " + strTrim3);
                                                            i4 = -1;
                                                        }
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                    i3 = i4;
                                                } else {
                                                    i3 = -1;
                                                }
                                                c0599e = new C0599e(strTrim, iM1461a, numM1463c, numM1463c2, f, z3, z4, z5, z6, i3);
                                            } catch (RuntimeException e4) {
                                                AbstractC0646n.m1648z("SsaStyle", "Skipping malformed 'Style:' line: '" + strM1674h3 + "'", e4);
                                                c0599e = null;
                                            }
                                            if (c0599e != null) {
                                                linkedHashMap.put(c0599e.f2233a, c0599e);
                                            }
                                        }
                                        c0599e = null;
                                        if (c0599e != null) {
                                            linkedHashMap.put(c0599e.f2233a, c0599e);
                                        }
                                    }
                                }
                                i5 = 6;
                                i6 = 7;
                                c2 = '[';
                            }
                        }
                    }
                    this.f2215j = linkedHashMap;
                } else if ("[V4 Styles]".equalsIgnoreCase(strM1674h)) {
                    AbstractC0646n.m1639q("SsaParser", "[V4 Styles] are not supported");
                } else if ("[Events]".equalsIgnoreCase(strM1674h)) {
                    return;
                }
                i5 = 6;
                i6 = 7;
                i7 = 2;
                c = 0;
            }
        }
    }

    @Override // p045P0.InterfaceC0465k
    /* JADX INFO: renamed from: h */
    public final void mo520h(byte[] bArr, int i3, int i4, C0464j c0464j, InterfaceC0636d interfaceC0636d) {
        Charset charset;
        int i5;
        int i6;
        float f;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i7;
        float f3;
        int i8;
        int i9;
        float f4;
        float f5;
        float f6;
        int i10;
        float f7;
        int i11;
        int i12;
        int i13;
        Integer num;
        int iM1461a;
        int i14;
        C0596b c0596b = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C0651s c0651s = c0596b.f2214i;
        c0651s.m1663E(bArr, i3 + i4);
        c0651s.m1665G(i3);
        Charset charsetM1661C = c0651s.m1661C();
        if (charsetM1661C == null) {
            charsetM1661C = StandardCharsets.UTF_8;
        }
        boolean z3 = c0596b.f2212g;
        if (!z3) {
            c0596b.m1459c(c0651s, charsetM1661C);
        }
        C0595a c0595aM1455b = z3 ? c0596b.f2213h : null;
        while (true) {
            String strM1674h = c0651s.m1674h(charsetM1661C);
            if (strM1674h == null) {
                long j3 = c0464j.f1534a;
                ArrayList arrayList3 = (j3 == -9223372036854775807L || !c0464j.f1535b) ? null : new ArrayList();
                int i15 = 0;
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    List list = (List) arrayList.get(i16);
                    if (!list.isEmpty() || i16 == 0) {
                        if (i16 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i16)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i16 + 1)).longValue() - ((Long) arrayList2.get(i16)).longValue();
                        if (j3 == -9223372036854775807L || jLongValue >= j3) {
                            interfaceC0636d.mo545b(new C0455a(list, jLongValue, jLongValue2));
                        } else if (arrayList3 != null) {
                            arrayList3.add(new C0455a(list, jLongValue, jLongValue2));
                        }
                    }
                }
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i15 < size) {
                        Object obj = arrayList3.get(i15);
                        i15++;
                        interfaceC0636d.mo545b((C0455a) obj);
                    }
                    return;
                }
                return;
            }
            if (strM1674h.startsWith("Format:")) {
                c0595aM1455b = C0595a.m1455b(strM1674h);
            } else {
                if (strM1674h.startsWith("Dialogue:")) {
                    if (c0595aM1455b == null) {
                        AbstractC0646n.m1647y("SsaParser", "Skipping dialogue line before complete format: ".concat(strM1674h));
                    } else {
                        AbstractC0646n.m1625c(strM1674h.startsWith("Dialogue:"));
                        String strSubstring = strM1674h.substring(9);
                        int i17 = c0595aM1455b.f2210e;
                        String[] strArrSplit = strSubstring.split(",", i17);
                        if (strArrSplit.length != i17) {
                            AbstractC0646n.m1647y("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strM1674h));
                        } else {
                            if (m1458d(strArrSplit[c0595aM1455b.f2206a]) == -9223372036854775807L) {
                                AbstractC0646n.m1647y("SsaParser", "Skipping invalid timing: ".concat(strM1674h));
                            } else {
                                long jM1458d = m1458d(strArrSplit[c0595aM1455b.f2207b]);
                                if (jM1458d == -9223372036854775807L) {
                                    AbstractC0646n.m1647y("SsaParser", "Skipping invalid timing: ".concat(strM1674h));
                                } else {
                                    LinkedHashMap linkedHashMap = c0596b.f2215j;
                                    C0599e c0599e = (linkedHashMap == null || (i14 = c0595aM1455b.f2208c) == -1) ? null : (C0599e) linkedHashMap.get(strArrSplit[i14].trim());
                                    String str = strArrSplit[c0595aM1455b.f2209d];
                                    Matcher matcher = C0598d.f2229a.matcher(str);
                                    int i18 = -1;
                                    PointF pointF = null;
                                    while (matcher.find()) {
                                        Charset charset2 = charsetM1661C;
                                        String strGroup = matcher.group(1);
                                        strGroup.getClass();
                                        try {
                                            PointF pointFM1460a = C0598d.m1460a(strGroup);
                                            if (pointFM1460a != null) {
                                                pointF = pointFM1460a;
                                            }
                                        } catch (RuntimeException unused) {
                                        }
                                        try {
                                            Matcher matcher2 = C0598d.f2232d.matcher(strGroup);
                                            if (matcher2.find()) {
                                                String strGroup2 = matcher2.group(1);
                                                strGroup2.getClass();
                                                iM1461a = C0599e.m1461a(strGroup2);
                                            } else {
                                                iM1461a = -1;
                                            }
                                            if (iM1461a != -1) {
                                                i18 = iM1461a;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                        charsetM1661C = charset2;
                                    }
                                    charset = charsetM1661C;
                                    String strReplace = C0598d.f2229a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f8 = c0596b.f2216k;
                                    float f9 = c0596b.f2217l;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    if (c0599e != null) {
                                        Integer num2 = c0599e.f2235c;
                                        if (num2 != null) {
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        }
                                        if (c0599e.f2242j == 3 && (num = c0599e.f2236d) != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f10 = c0599e.f2237e;
                                        if (f10 == -3.4028235E38f || f9 == -3.4028235E38f) {
                                            f6 = -3.4028235E38f;
                                            i10 = Integer.MIN_VALUE;
                                        } else {
                                            f6 = f10 / f9;
                                            i10 = 1;
                                        }
                                        boolean z4 = c0599e.f2239g;
                                        boolean z5 = c0599e.f2238f;
                                        if (z5 && z4) {
                                            f7 = f6;
                                            i11 = i10;
                                            i12 = 0;
                                            i13 = 33;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            f7 = f6;
                                            i11 = i10;
                                            i12 = 0;
                                            i13 = 33;
                                            if (z5) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z4) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (c0599e.f2240h) {
                                            spannableString.setSpan(new UnderlineSpan(), i12, spannableString.length(), i13);
                                        }
                                        if (c0599e.f2241i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i12, spannableString.length(), i13);
                                        }
                                        i6 = i11;
                                        f = f7;
                                        i5 = -1;
                                    } else {
                                        c0595aM1455b = c0595aM1455b;
                                        c0651s = c0651s;
                                        i5 = -1;
                                        i6 = Integer.MIN_VALUE;
                                        f = -3.4028235E38f;
                                    }
                                    if (i18 != i5) {
                                        i5 = i18;
                                    } else if (c0599e != null) {
                                        i5 = c0599e.f2234b;
                                    }
                                    switch (i5) {
                                        case 0:
                                        default:
                                            AbstractC0462h.m1170j("Unknown alignment: ", "SsaParser", i5);
                                        case -1:
                                            alignment2 = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            alignment2 = alignment;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            alignment2 = alignment;
                                            break;
                                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            alignment2 = alignment;
                                            break;
                                    }
                                    int i19 = Integer.MIN_VALUE;
                                    switch (i5) {
                                        case 0:
                                        default:
                                            AbstractC0462h.m1170j("Unknown alignment: ", "SsaParser", i5);
                                        case -1:
                                            i7 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i7 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i7 = 1;
                                            break;
                                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                        case 6:
                                        case 9:
                                            i7 = 2;
                                            break;
                                    }
                                    switch (i5) {
                                        case 0:
                                        default:
                                            AbstractC0462h.m1170j("Unknown alignment: ", "SsaParser", i5);
                                        case -1:
                                            break;
                                        case 1:
                                        case 2:
                                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                            i19 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i19 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i19 = 0;
                                            break;
                                    }
                                    if (pointF == 0 || f9 == -3.4028235E38f || f8 == -3.4028235E38f) {
                                        f3 = 0.05f;
                                        if (i7 != 0) {
                                            i8 = 1;
                                            if (i7 != 1) {
                                                i9 = 2;
                                                f4 = i7 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i9 = 2;
                                                f4 = 0.5f;
                                            }
                                        } else {
                                            i8 = 1;
                                            i9 = 2;
                                            f4 = 0.05f;
                                        }
                                        if (i19 != 0) {
                                            f3 = i19 != i8 ? i19 != i9 ? -3.4028235E38f : 0.95f : 0.5f;
                                        }
                                        f5 = f4;
                                    } else {
                                        float f11 = pointF.x / f8;
                                        f3 = pointF.y / f9;
                                        f5 = f11;
                                    }
                                    C0614b c0614b = new C0614b(spannableString, alignment2, null, null, f3, 0, i19, f5, i7, i6, f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                    int iM1457a = m1457a(jM1458d, arrayList2, arrayList);
                                    for (int iM1457a2 = m1457a(r11, arrayList2, arrayList); iM1457a2 < iM1457a; iM1457a2++) {
                                        ((List) arrayList.get(iM1457a2)).add(c0614b);
                                    }
                                }
                            }
                        }
                    }
                    charset = charsetM1661C;
                    c0595aM1455b = c0595aM1455b;
                    c0651s = c0651s;
                } else {
                    charset = charsetM1661C;
                    c0595aM1455b = c0595aM1455b;
                    c0651s = c0651s;
                }
                c0596b = this;
                charsetM1661C = charset;
                c0595aM1455b = c0595aM1455b;
                c0651s = c0651s;
            }
        }
    }

    @Override // p045P0.InterfaceC0465k
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC0458d mo523k(byte[] bArr, int i3, int i4) {
        return AbstractC0462h.m1161a(this, bArr, i4);
    }
}

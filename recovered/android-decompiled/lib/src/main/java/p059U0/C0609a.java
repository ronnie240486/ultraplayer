package p059U0;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p045P0.AbstractC0462h;
import p045P0.C0455a;
import p045P0.C0464j;
import p045P0.InterfaceC0458d;
import p045P0.InterfaceC0465k;
import p061V.C0614b;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p064W.InterfaceC0636d;
import p105h2.AbstractC1676G;

/* JADX INFO: renamed from: U0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0609a implements InterfaceC0465k {

    /* JADX INFO: renamed from: j */
    public static final Pattern f2298j = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: k */
    public static final Pattern f2299k = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: g */
    public final StringBuilder f2300g = new StringBuilder();

    /* JADX INFO: renamed from: h */
    public final ArrayList f2301h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final C0651s f2302i = new C0651s();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x0097  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fa  */
    /* JADX INFO: renamed from: a */
    public static C0614b m1489a(Spanned spanned, String str) {
        byte b3;
        int i3;
        byte b4;
        int i4;
        float f;
        if (str == null) {
            return new C0614b(spanned, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        }
        switch (str) {
            case "{\an1}":
                b3 = 0;
                break;
            case "{\an2}":
                b3 = 6;
                break;
            case "{\an3}":
                b3 = 3;
                break;
            case "{\an4}":
                b3 = 1;
                break;
            case "{\an5}":
                b3 = 7;
                break;
            case "{\an6}":
                b3 = 4;
                break;
            case "{\an7}":
                b3 = 2;
                break;
            case "{\an8}":
                b3 = 8;
                break;
            case "{\an9}":
                b3 = 5;
                break;
            default:
                b3 = -1;
                break;
        }
        if (b3 == 0 || b3 == 1 || b3 == 2) {
            i3 = 0;
        } else {
            i3 = (b3 == 3 || b3 == 4 || b3 == 5) ? 2 : 1;
        }
        switch (str) {
            case "{\an1}":
                b4 = 0;
                break;
            case "{\an2}":
                b4 = 1;
                break;
            case "{\an3}":
                b4 = 2;
                break;
            case "{\an4}":
                b4 = 6;
                break;
            case "{\an5}":
                b4 = 7;
                break;
            case "{\an6}":
                b4 = 8;
                break;
            case "{\an7}":
                b4 = 3;
                break;
            case "{\an8}":
                b4 = 4;
                break;
            case "{\an9}":
                b4 = 5;
                break;
            default:
                b4 = -1;
                break;
        }
        if (b4 == 0 || b4 == 1 || b4 == 2) {
            i4 = 2;
        } else {
            i4 = (b4 == 3 || b4 == 4 || b4 == 5) ? 0 : 1;
        }
        float f3 = 0.92f;
        if (i3 == 0) {
            f = 0.08f;
        } else if (i3 == 1) {
            f = 0.5f;
        } else {
            if (i3 != 2) {
                throw new IllegalArgumentException();
            }
            f = 0.92f;
        }
        if (i4 == 0) {
            f3 = 0.08f;
        } else if (i4 == 1) {
            f3 = 0.5f;
        } else if (i4 != 2) {
            throw new IllegalArgumentException();
        }
        return new C0614b(spanned, null, null, null, f3, 0, i4, f, i3, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    /* JADX INFO: renamed from: c */
    public static long m1490c(Matcher matcher, int i3) {
        String strGroup = matcher.group(i3 + 1);
        long j3 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i3 + 2);
        strGroup2.getClass();
        long j4 = (Long.parseLong(strGroup2) * 60000) + j3;
        String strGroup3 = matcher.group(i3 + 3);
        strGroup3.getClass();
        long j5 = (Long.parseLong(strGroup3) * 1000) + j4;
        String strGroup4 = matcher.group(i3 + 4);
        if (strGroup4 != null) {
            j5 += Long.parseLong(strGroup4);
        }
        return j5 * 1000;
    }

    @Override // p045P0.InterfaceC0465k
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo514b() {
    }

    @Override // p045P0.InterfaceC0465k
    /* JADX INFO: renamed from: h */
    public final void mo520h(byte[] bArr, int i3, int i4, C0464j c0464j, InterfaceC0636d interfaceC0636d) {
        String str;
        C0609a c0609a = this;
        C0651s c0651s = c0609a.f2302i;
        c0651s.m1663E(bArr, i3 + i4);
        c0651s.m1665G(i3);
        Charset charsetM1661C = c0651s.m1661C();
        if (charsetM1661C == null) {
            charsetM1661C = StandardCharsets.UTF_8;
        }
        long j3 = c0464j.f1534a;
        long j4 = -9223372036854775807L;
        ArrayList arrayList = (j3 == -9223372036854775807L || !c0464j.f1535b) ? null : new ArrayList();
        while (true) {
            String strM1674h = c0651s.m1674h(charsetM1661C);
            if (strM1674h == null) {
                break;
            }
            if (strM1674h.length() != 0) {
                try {
                    Integer.parseInt(strM1674h);
                    String strM1674h2 = c0651s.m1674h(charsetM1661C);
                    if (strM1674h2 == null) {
                        AbstractC0646n.m1647y("SubripParser", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f2298j.matcher(strM1674h2);
                    if (matcher.matches()) {
                        long jM1490c = m1490c(matcher, 1);
                        long jM1490c2 = m1490c(matcher, 6);
                        StringBuilder sb = c0609a.f2300g;
                        sb.setLength(0);
                        ArrayList arrayList2 = c0609a.f2301h;
                        arrayList2.clear();
                        String strM1674h3 = c0651s.m1674h(charsetM1661C);
                        while (!TextUtils.isEmpty(strM1674h3)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String strTrim = strM1674h3.trim();
                            long j5 = j4;
                            StringBuilder sb2 = new StringBuilder(strTrim);
                            Matcher matcher2 = f2299k.matcher(strTrim);
                            int i5 = 0;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList2.add(strGroup);
                                int iStart = matcher2.start() - i5;
                                int length = strGroup.length();
                                sb2.replace(iStart, iStart + length, "");
                                i5 += length;
                                matcher2 = matcher2;
                                j3 = j3;
                            }
                            sb.append(sb2.toString());
                            strM1674h3 = c0651s.m1674h(charsetM1661C);
                            j4 = j5;
                            j3 = j3;
                        }
                        long j6 = j3;
                        long j7 = j4;
                        Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                        int i6 = 0;
                        while (true) {
                            if (i6 >= arrayList2.size()) {
                                str = null;
                                break;
                            }
                            str = (String) arrayList2.get(i6);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i6++;
                            }
                        }
                        if (j6 == j7 || jM1490c >= j6) {
                            interfaceC0636d.mo545b(new C0455a(AbstractC1676G.m4120r(m1489a(spannedFromHtml, str)), jM1490c, jM1490c2 - jM1490c));
                        } else if (arrayList != null) {
                            arrayList.add(new C0455a(AbstractC1676G.m4120r(m1489a(spannedFromHtml, str)), jM1490c, jM1490c2 - jM1490c));
                        }
                        c0609a = this;
                        j4 = j7;
                        j3 = j6;
                    } else {
                        AbstractC0646n.m1647y("SubripParser", "Skipping invalid timing: ".concat(strM1674h2));
                        c0609a = this;
                    }
                } catch (NumberFormatException unused) {
                    AbstractC0646n.m1647y("SubripParser", "Skipping invalid index: ".concat(strM1674h));
                }
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                interfaceC0636d.mo545b((C0455a) obj);
            }
        }
    }

    @Override // p045P0.InterfaceC0465k
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC0458d mo523k(byte[] bArr, int i3, int i4) {
        return AbstractC0462h.m1161a(this, bArr, i4);
    }
}

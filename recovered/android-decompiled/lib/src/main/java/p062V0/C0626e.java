package p062V0;

import android.text.Layout;
import android.text.TextUtils;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p000A.C0058r;
import p022H1.C0258b;
import p045P0.AbstractC0462h;
import p045P0.C0460f;
import p045P0.C0464j;
import p045P0.InterfaceC0458d;
import p045P0.InterfaceC0465k;
import p060U1.AbstractC0610a;
import p064W.AbstractC0632A;
import p064W.AbstractC0634b;
import p064W.AbstractC0646n;
import p064W.InterfaceC0636d;
import p105h2.AbstractC1679J;
import p105h2.AbstractC1723q;
import p105h2.C1680K;
import p105h2.C1702d0;
import p105h2.C1706f0;
import p105h2.C1714j0;

/* JADX INFO: renamed from: V0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0626e implements InterfaceC0465k {

    /* JADX INFO: renamed from: h */
    public static final Pattern f2415h = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: i */
    public static final Pattern f2416i = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: j */
    public static final Pattern f2417j = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: k */
    public static final Pattern f2418k = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: l */
    public static final Pattern f2419l = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: m */
    public static final Pattern f2420m = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: n */
    public static final Pattern f2421n = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: o */
    public static final C0625d f2422o = new C0625d(30.0f, 1, 1);

    /* JADX INFO: renamed from: g */
    public final XmlPullParserFactory f2423g;

    public C0626e() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f2423g = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e3) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e3);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0628g m1547a(C0628g c0628g) {
        return c0628g == null ? new C0628g() : c0628g;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1548c(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    /* JADX INFO: renamed from: d */
    public static int m1549d(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f2421n.matcher(attributeValue);
        if (!matcher.matches()) {
            AbstractC0646n.m1647y("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z3 = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i3 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i4 = Integer.parseInt(strGroup2);
            if (i3 == 0 || i4 == 0) {
                z3 = false;
            }
            AbstractC0646n.m1624b("Invalid cell resolution " + i3 + " " + i4, z3);
            return i4;
        } catch (NumberFormatException unused) {
            AbstractC0646n.m1647y("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m1550e(String str, C0628g c0628g) throws C0460f {
        Matcher matcher;
        int i3 = AbstractC0632A.f2454a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = f2417j;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new C0460f("Invalid number of entries for fontSize: " + strArrSplit.length + ".");
            }
            matcher = pattern.matcher(strArrSplit[1]);
            AbstractC0646n.m1647y("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new C0460f(AbstractC0462h.m1166f("Invalid expression for fontSize: '", str, "'."));
        }
        String strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                c0628g.f2443j = 3;
                break;
            case "em":
                c0628g.f2443j = 2;
                break;
            case "px":
                c0628g.f2443j = 1;
                break;
            default:
                throw new C0460f(AbstractC0462h.m1166f("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        c0628g.f2444k = Float.parseFloat(strGroup2);
    }

    /* JADX INFO: renamed from: f */
    public static C0625d m1551f(XmlPullParser xmlPullParser) {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i3 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i4 = AbstractC0632A.f2454a;
            String[] strArrSplit = attributeValue2.split(" ", -1);
            AbstractC0646n.m1624b("frameRateMultiplier doesn't have 2 parts", strArrSplit.length == 2);
            f = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f = 1.0f;
        }
        C0625d c0625d = f2422o;
        int i5 = c0625d.f2413b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i5 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        return new C0625d(i3 * f, i5, attributeValue4 != null ? Integer.parseInt(attributeValue4) : c0625d.f2414c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:105:0x0254 A[LOOP:0: B:3:0x000a->B:105:0x0254, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:45:0x0122  */
    /* JADX WARN: Code duplicated, block: B:47:0x0128 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x012a  */
    /* JADX WARN: Code duplicated, block: B:53:0x015d  */
    /* JADX WARN: Code duplicated, block: B:55:0x016c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0175  */
    /* JADX WARN: Code duplicated, block: B:59:0x017b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0184  */
    /* JADX WARN: Code duplicated, block: B:63:0x0196  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:69:0x01af  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:74:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:81:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f4  */
    /* JADX INFO: renamed from: g */
    public static void m1552g(XmlPullParser xmlPullParser, HashMap map, int i3, C0058r c0058r, HashMap map2, HashMap map3) throws XmlPullParserException, IOException {
        String strM1637o;
        float f;
        float f3;
        String strM1637o2;
        Matcher matcher;
        Matcher matcher2;
        float f4;
        float f5;
        float f6;
        String strM1637o3;
        float f7;
        int i4;
        String strM1637o4;
        int i5;
        String strM3288K;
        String strM3288K2;
        String[] strArrSplit;
        int i6 = -1;
        int i7 = 0;
        while (true) {
            xmlPullParser.next();
            if (AbstractC0646n.m1641s(xmlPullParser, "style")) {
                String strM1637o5 = AbstractC0646n.m1637o(xmlPullParser, "style");
                C0628g c0628gM1554j = m1554j(xmlPullParser, new C0628g());
                if (strM1637o5 != null) {
                    String strTrim = strM1637o5.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[i7];
                    } else {
                        int i8 = AbstractC0632A.f2454a;
                        strArrSplit = strTrim.split("\\s+", i6);
                    }
                    for (String str : strArrSplit) {
                        c0628gM1554j.m1557a((C0628g) map.get(str));
                    }
                }
                String str2 = c0628gM1554j.f2445l;
                if (str2 != null) {
                    map.put(str2, c0628gM1554j);
                }
            } else {
                if (AbstractC0646n.m1641s(xmlPullParser, "region")) {
                    String strM1637o6 = AbstractC0646n.m1637o(xmlPullParser, "id");
                    C0627f c0627f = null;
                    if (strM1637o6 != null) {
                        String strM1637o7 = AbstractC0646n.m1637o(xmlPullParser, "origin");
                        if (strM1637o7 != null) {
                            Pattern pattern = f2419l;
                            Matcher matcher3 = pattern.matcher(strM1637o7);
                            Pattern pattern2 = f2420m;
                            Matcher matcher4 = pattern2.matcher(strM1637o7);
                            if (matcher3.matches()) {
                                try {
                                    String strGroup = matcher3.group(1);
                                    strGroup.getClass();
                                    f = Float.parseFloat(strGroup) / 100.0f;
                                    String strGroup2 = matcher3.group(2);
                                    strGroup2.getClass();
                                    f3 = Float.parseFloat(strGroup2) / 100.0f;
                                    strM1637o2 = AbstractC0646n.m1637o(xmlPullParser, "extent");
                                    if (strM1637o2 != null) {
                                        matcher = pattern.matcher(strM1637o2);
                                        matcher2 = pattern2.matcher(strM1637o2);
                                        if (matcher.matches()) {
                                            try {
                                                String strGroup3 = matcher.group(1);
                                                strGroup3.getClass();
                                                f4 = Float.parseFloat(strGroup3) / 100.0f;
                                                String strGroup4 = matcher.group(2);
                                                strGroup4.getClass();
                                                f5 = Float.parseFloat(strGroup4) / 100.0f;
                                                float f8 = f4;
                                                f6 = f5;
                                                strM1637o3 = AbstractC0646n.m1637o(xmlPullParser, "displayAlign");
                                                if (strM1637o3 != null) {
                                                    strM3288K2 = AbstractC1303m.m3288K(strM1637o3);
                                                    strM3288K2.getClass();
                                                    if (!strM3288K2.equals("center")) {
                                                        f7 = f3 + (f6 / 2.0f);
                                                        i4 = 1;
                                                    } else if (strM3288K2.equals("after")) {
                                                        f7 = f3 + f6;
                                                        i4 = 2;
                                                    } else {
                                                        f7 = f3;
                                                        i4 = 0;
                                                    }
                                                } else {
                                                    f7 = f3;
                                                    i4 = 0;
                                                }
                                                float f9 = 1.0f / i3;
                                                strM1637o4 = AbstractC0646n.m1637o(xmlPullParser, "writingMode");
                                                if (strM1637o4 != null) {
                                                    strM3288K = AbstractC1303m.m3288K(strM1637o4);
                                                    strM3288K.getClass();
                                                    switch (strM3288K) {
                                                        case "tb":
                                                        case "tblr":
                                                            i5 = 2;
                                                            break;
                                                        case "tbrl":
                                                            i5 = 1;
                                                            break;
                                                        default:
                                                            i5 = Integer.MIN_VALUE;
                                                            break;
                                                    }
                                                } else {
                                                    i5 = Integer.MIN_VALUE;
                                                }
                                                c0627f = new C0627f(strM1637o6, f, f7, 0, i4, f8, f6, 1, f9, i5);
                                            } catch (NumberFormatException unused) {
                                                AbstractC0646n.m1647y("TtmlParser", "Ignoring region with malformed extent: ".concat(strM1637o7));
                                            }
                                        } else if (matcher2.matches()) {
                                            AbstractC0646n.m1647y("TtmlParser", "Ignoring region with unsupported extent: ".concat(strM1637o7));
                                        } else if (c0058r == null) {
                                            AbstractC0646n.m1647y("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strM1637o7));
                                        } else {
                                            try {
                                                String strGroup5 = matcher2.group(1);
                                                strGroup5.getClass();
                                                int i9 = Integer.parseInt(strGroup5);
                                                String strGroup6 = matcher2.group(2);
                                                strGroup6.getClass();
                                                int i10 = Integer.parseInt(strGroup6);
                                                f4 = i9 / c0058r.f82a;
                                                f5 = i10 / c0058r.f83b;
                                                float f10 = f4;
                                                f6 = f5;
                                                strM1637o3 = AbstractC0646n.m1637o(xmlPullParser, "displayAlign");
                                                if (strM1637o3 != null) {
                                                    strM3288K2 = AbstractC1303m.m3288K(strM1637o3);
                                                    strM3288K2.getClass();
                                                    if (!strM3288K2.equals("center")) {
                                                        f7 = f3 + (f6 / 2.0f);
                                                        i4 = 1;
                                                    } else if (strM3288K2.equals("after")) {
                                                        f7 = f3;
                                                        i4 = 0;
                                                    } else {
                                                        f7 = f3 + f6;
                                                        i4 = 2;
                                                    }
                                                } else {
                                                    f7 = f3;
                                                    i4 = 0;
                                                }
                                                float f11 = 1.0f / i3;
                                                strM1637o4 = AbstractC0646n.m1637o(xmlPullParser, "writingMode");
                                                if (strM1637o4 != null) {
                                                    strM3288K = AbstractC1303m.m3288K(strM1637o4);
                                                    strM3288K.getClass();
                                                    switch (strM3288K) {
                                                        case 3694:
                                                            if (!strM3288K.equals("tb")) {
                                                            }
                                                            break;
                                                        case 3553396:
                                                            if (!strM3288K.equals("tblr")) {
                                                            }
                                                            break;
                                                        case 3553576:
                                                            if (!strM3288K.equals("tbrl")) {
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                    /*  JADX ERROR: Method code generation error
                                                        java.lang.NullPointerException: Switch insn not found in header
                                                        	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                                                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                                                        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                                                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                                                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
                                                        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                                        */
                                                    /*
                                                        Method dump skipped, instruction units count: 624
                                                        To view this dump add '--comments-level debug' option
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: p062V0.C0626e.m1552g(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, A.r, java.util.HashMap, java.util.HashMap):void");
                                                }

                                                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                                /* JADX WARN: Code duplicated, block: B:32:0x007d  */
                                                /* JADX WARN: Code duplicated, block: B:6:0x0037  */
                                                /* JADX INFO: renamed from: i */
                                                public static C0624c m1553i(XmlPullParser xmlPullParser, C0624c c0624c, HashMap map, C0625d c0625d) throws C0460f {
                                                    String[] strArrSplit;
                                                    int attributeCount = xmlPullParser.getAttributeCount();
                                                    String strSubstring = null;
                                                    C0628g c0628gM1554j = m1554j(xmlPullParser, null);
                                                    long j3 = -9223372036854775807L;
                                                    long jM1555l = -9223372036854775807L;
                                                    long jM1555l2 = -9223372036854775807L;
                                                    long jM1555l3 = -9223372036854775807L;
                                                    String[] strArr = null;
                                                    String str = "";
                                                    int i3 = 0;
                                                    while (i3 < attributeCount) {
                                                        long j4 = j3;
                                                        String attributeName = xmlPullParser.getAttributeName(i3);
                                                        String attributeValue = xmlPullParser.getAttributeValue(i3);
                                                        attributeName.getClass();
                                                        switch (attributeName) {
                                                            case "region":
                                                                if (!map.containsKey(attributeValue)) {
                                                                    break;
                                                                } else {
                                                                    str = attributeValue;
                                                                    break;
                                                                }
                                                                break;
                                                            case "dur":
                                                                jM1555l3 = m1555l(attributeValue, c0625d);
                                                                break;
                                                            case "end":
                                                                jM1555l2 = m1555l(attributeValue, c0625d);
                                                                break;
                                                            case "begin":
                                                                jM1555l = m1555l(attributeValue, c0625d);
                                                                break;
                                                            case "style":
                                                                String strTrim = attributeValue.trim();
                                                                if (strTrim.isEmpty()) {
                                                                    strArrSplit = new String[0];
                                                                } else {
                                                                    int i4 = AbstractC0632A.f2454a;
                                                                    strArrSplit = strTrim.split("\\s+", -1);
                                                                }
                                                                if (strArrSplit.length <= 0) {
                                                                    break;
                                                                } else {
                                                                    strArr = strArrSplit;
                                                                    break;
                                                                }
                                                                break;
                                                            case "backgroundImage":
                                                                if (!attributeValue.startsWith("#")) {
                                                                    break;
                                                                } else {
                                                                    strSubstring = attributeValue.substring(1);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                        i3++;
                                                        j3 = j4;
                                                    }
                                                    long j5 = j3;
                                                    if (c0624c != null) {
                                                        long j6 = c0624c.f2402d;
                                                        if (j6 != j5) {
                                                            if (jM1555l != j5) {
                                                                jM1555l += j6;
                                                            }
                                                            if (jM1555l2 != j5) {
                                                                jM1555l2 += j6;
                                                            }
                                                        }
                                                    }
                                                    long j7 = jM1555l;
                                                    if (jM1555l2 == j5) {
                                                        if (jM1555l3 != j5) {
                                                            jM1555l2 = j7 + jM1555l3;
                                                        } else if (c0624c != null) {
                                                            long j8 = c0624c.f2403e;
                                                            if (j8 != j5) {
                                                                jM1555l2 = j8;
                                                            }
                                                        }
                                                    }
                                                    return new C0624c(xmlPullParser.getName(), null, j7, jM1555l2, c0628gM1554j, strArr, str, strSubstring, c0624c);
                                                }

                                                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                                /* JADX WARN: Code duplicated, block: B:114:0x0195  */
                                                /* JADX WARN: Code duplicated, block: B:145:0x0216  */
                                                /* JADX WARN: Code duplicated, block: B:186:0x02c7  */
                                                /* JADX WARN: Code duplicated, block: B:187:0x02cc  */
                                                /* JADX WARN: Code duplicated, block: B:190:0x02d8  */
                                                /* JADX WARN: Code duplicated, block: B:192:0x02dd  */
                                                /* JADX WARN: Code duplicated, block: B:198:0x02ed  */
                                                /* JADX WARN: Code duplicated, block: B:200:0x02f5  */
                                                /* JADX WARN: Code duplicated, block: B:201:0x02f7  */
                                                /* JADX WARN: Code duplicated, block: B:203:0x02fd  */
                                                /* JADX WARN: Code duplicated, block: B:204:0x02ff  */
                                                /* JADX WARN: Code duplicated, block: B:206:0x0302  */
                                                /* JADX WARN: Code duplicated, block: B:208:0x0305  */
                                                /* JADX WARN: Code duplicated, block: B:209:0x0307  */
                                                /* JADX WARN: Code duplicated, block: B:210:0x0309  */
                                                /* JADX WARN: Code duplicated, block: B:240:0x03ce  */
                                                /* JADX WARN: Code duplicated, block: B:278:0x0484  */
                                                /* JADX WARN: Code duplicated, block: B:303:0x04f5  */
                                                /* JADX WARN: Code duplicated, block: B:6:0x0031  */
                                                /* JADX WARN: Code duplicated, block: B:71:0x0109  */
                                                /* JADX WARN: Switch 'out' block B:216:0x0321 for B:265:0x0411 already processed. Defaulting to fallback option. */
                                                /* JADX INFO: renamed from: j */
                                                public static C0628g m1554j(XmlPullParser xmlPullParser, C0628g c0628g) {
                                                    byte b3;
                                                    C1680K c1680k;
                                                    Object next;
                                                    String str;
                                                    int iHashCode;
                                                    byte b4;
                                                    int i3;
                                                    C0623b c0623b;
                                                    XmlPullParser xmlPullParser2 = xmlPullParser;
                                                    String str2 = "after";
                                                    int attributeCount = xmlPullParser2.getAttributeCount();
                                                    C0628g c0628gM1547a = c0628g;
                                                    int i4 = 0;
                                                    while (i4 < attributeCount) {
                                                        String attributeValue = xmlPullParser2.getAttributeValue(i4);
                                                        String attributeName = xmlPullParser2.getAttributeName(i4);
                                                        attributeName.getClass();
                                                        Layout.Alignment alignment = null;
                                                        switch (attributeName) {
                                                            case "fontStyle":
                                                                str2 = str2;
                                                                c0628gM1547a = m1547a(c0628gM1547a);
                                                                c0628gM1547a.f2442i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                                                                break;
                                                            case "fontFamily":
                                                                str2 = str2;
                                                                c0628gM1547a = m1547a(c0628gM1547a);
                                                                c0628gM1547a.f2434a = attributeValue;
                                                                break;
                                                            case "textAlign":
                                                                str2 = str2;
                                                                c0628gM1547a = m1547a(c0628gM1547a);
                                                                String strM3288K = AbstractC1303m.m3288K(attributeValue);
                                                                strM3288K.getClass();
                                                                switch (strM3288K) {
                                                                    case "center":
                                                                        alignment = Layout.Alignment.ALIGN_CENTER;
                                                                        break;
                                                                    case "end":
                                                                    case "right":
                                                                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                                        break;
                                                                    case "left":
                                                                    case "start":
                                                                        alignment = Layout.Alignment.ALIGN_NORMAL;
                                                                        break;
                                                                }
                                                                c0628gM1547a.f2448o = alignment;
                                                                break;
                                                            case "textDecoration":
                                                                str2 = str2;
                                                                String strM3288K2 = AbstractC1303m.m3288K(attributeValue);
                                                                strM3288K2.getClass();
                                                                switch (strM3288K2) {
                                                                    case "nounderline":
                                                                        c0628gM1547a = m1547a(c0628gM1547a);
                                                                        c0628gM1547a.f2440g = 0;
                                                                        break;
                                                                    case "underline":
                                                                        c0628gM1547a = m1547a(c0628gM1547a);
                                                                        c0628gM1547a.f2440g = 1;
                                                                        break;
                                                                    case "nolinethrough":
                                                                        c0628gM1547a = m1547a(c0628gM1547a);
                                                                        c0628gM1547a.f2439f = 0;
                                                                        break;
                                                                    case "linethrough":
                                                                        c0628gM1547a = m1547a(c0628gM1547a);
                                                                        c0628gM1547a.f2439f = 1;
                                                                    default:
                                                                        break;
                                                                }
                                                                break;
                                                            case "fontWeight":
                                                                str2 = str2;
                                                                c0628gM1547a = m1547a(c0628gM1547a);
                                                                c0628gM1547a.f2441h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                                                                break;
                                                            case "id":
                                                                str2 = str2;
                                                                if ("style".equals(xmlPullParser.getName())) {
                                                                    c0628gM1547a = m1547a(c0628gM1547a);
                                                                    c0628gM1547a.f2445l = attributeValue;
                                                                }
                                                                break;
                                                            case "ruby":
                                                                str2 = str2;
                                                                String strM3288K3 = AbstractC1303m.m3288K(attributeValue);
                                                                strM3288K3.getClass();
                                                                switch (strM3288K3) {
                                                                    case "baseContainer":
                                                                    case "base":
                                                                        c0628gM1547a = m1547a(c0628gM1547a);
                                                                        c0628gM1547a.f2446m = 2;
                                                                        break;
                                                                    case "container":
                                                                        c0628gM1547a = m1547a(c0628gM1547a);
                                                                        c0628gM1547a.f2446m = 1;
                                                                        break;
                                                                    case "delimiter":
                                                                        c0628gM1547a = m1547a(c0628gM1547a);
                                                                        c0628gM1547a.f2446m = 4;
                                                                        break;
                                                                    case "textContainer":
                                                                    case "text":
                                                                        c0628gM1547a = m1547a(c0628gM1547a);
                                                                        c0628gM1547a.f2446m = 3;
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                                break;
                                                            case "color":
                                                                str2 = str2;
                                                                c0628gM1547a = m1547a(c0628gM1547a);
                                                                try {
                                                                    c0628gM1547a.f2435b = AbstractC0634b.m1610a(attributeValue, false);
                                                                    c0628gM1547a.f2436c = true;
                                                                    break;
                                                                } catch (IllegalArgumentException unused) {
                                                                    AbstractC0462h.m1171k("Failed parsing color value: ", attributeValue, "TtmlParser");
                                                                }
                                                                break;
                                                            case "shear":
                                                                str2 = str2;
                                                                C0628g c0628gM1547a2 = m1547a(c0628gM1547a);
                                                                Matcher matcher = f2418k.matcher(attributeValue);
                                                                float fMin = Float.MAX_VALUE;
                                                                if (matcher.matches()) {
                                                                    try {
                                                                        String strGroup = matcher.group(1);
                                                                        strGroup.getClass();
                                                                        fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                                                                    } catch (NumberFormatException e3) {
                                                                        AbstractC0646n.m1648z("TtmlParser", "Failed to parse shear: " + attributeValue, e3);
                                                                    }
                                                                    break;
                                                                } else {
                                                                    AbstractC0462h.m1171k("Invalid value for shear: ", attributeValue, "TtmlParser");
                                                                }
                                                                c0628gM1547a2.f2452s = fMin;
                                                                c0628gM1547a = c0628gM1547a2;
                                                                break;
                                                            case "textCombine":
                                                                str2 = str2;
                                                                String strM3288K4 = AbstractC1303m.m3288K(attributeValue);
                                                                strM3288K4.getClass();
                                                                if (strM3288K4.equals("all")) {
                                                                    c0628gM1547a = m1547a(c0628gM1547a);
                                                                    c0628gM1547a.f2450q = 1;
                                                                } else if (strM3288K4.equals("none")) {
                                                                    c0628gM1547a = m1547a(c0628gM1547a);
                                                                    c0628gM1547a.f2450q = 0;
                                                                }
                                                                break;
                                                            case "fontSize":
                                                                str2 = str2;
                                                                try {
                                                                    c0628gM1547a = m1547a(c0628gM1547a);
                                                                    m1550e(attributeValue, c0628gM1547a);
                                                                    break;
                                                                } catch (C0460f unused2) {
                                                                    AbstractC0462h.m1171k("Failed parsing fontSize value: ", attributeValue, "TtmlParser");
                                                                }
                                                                break;
                                                            case "textEmphasis":
                                                                c0628gM1547a = m1547a(c0628gM1547a);
                                                                Pattern pattern = C0623b.f2391d;
                                                                if (attributeValue == null) {
                                                                    c0623b = null;
                                                                } else {
                                                                    String strM3288K5 = AbstractC1303m.m3288K(attributeValue.trim());
                                                                    if (strM3288K5.isEmpty()) {
                                                                        c0623b = null;
                                                                    } else {
                                                                        String[] strArrSplit = TextUtils.split(strM3288K5, C0623b.f2391d);
                                                                        int length = strArrSplit.length;
                                                                        AbstractC1679J abstractC1679JM4127m = length != 0 ? length != 1 ? AbstractC1679J.m4127m(strArrSplit.length, (Object[]) strArrSplit.clone()) : new C1714j0(strArrSplit[0]) : C1702d0.f7663p;
                                                                        C1680K c1680k2 = new C1680K(AbstractC1723q.m4160i(C0623b.f2395h, abstractC1679JM4127m));
                                                                        String str3 = (String) (c1680k2.hasNext() ? c1680k2.next() : "outside");
                                                                        int iHashCode2 = str3.hashCode();
                                                                        if (iHashCode2 != -1392885889) {
                                                                            if (iHashCode2 != -1106037339) {
                                                                                if (iHashCode2 == 92734940 && str3.equals(str2)) {
                                                                                    b3 = 0;
                                                                                } else {
                                                                                    b3 = -1;
                                                                                }
                                                                            } else if (str3.equals("outside")) {
                                                                                b3 = 1;
                                                                            } else {
                                                                                b3 = -1;
                                                                            }
                                                                        } else if (str3.equals("before")) {
                                                                            b3 = 2;
                                                                        } else {
                                                                            b3 = -1;
                                                                        }
                                                                        int i5 = b3 != 0 ? b3 != 1 ? 1 : -2 : 2;
                                                                        C1706f0 c1706f0M4160i = AbstractC1723q.m4160i(C0623b.f2392e, abstractC1679JM4127m);
                                                                        if (c1706f0M4160i.isEmpty()) {
                                                                            C1706f0 c1706f0M4160i2 = AbstractC1723q.m4160i(C0623b.f2394g, abstractC1679JM4127m);
                                                                            C1706f0 c1706f0M4160i3 = AbstractC1723q.m4160i(C0623b.f2393f, abstractC1679JM4127m);
                                                                            if (c1706f0M4160i2.isEmpty() && c1706f0M4160i3.isEmpty()) {
                                                                                c0623b = new C0623b(-1, 0, i5);
                                                                            } else {
                                                                                C1680K c1680k3 = new C1680K(c1706f0M4160i2);
                                                                                String str4 = (String) (c1680k3.hasNext() ? c1680k3.next() : "filled");
                                                                                int iHashCode3 = str4.hashCode();
                                                                                if (iHashCode3 != -1274499742) {
                                                                                    int i6 = (iHashCode3 == 3417674 && str4.equals("open")) ? 2 : 1;
                                                                                    c1680k = new C1680K(c1706f0M4160i3);
                                                                                    if (c1680k.hasNext()) {
                                                                                        next = c1680k.next();
                                                                                    } else {
                                                                                        next = "circle";
                                                                                    }
                                                                                    str = (String) next;
                                                                                    iHashCode = str.hashCode();
                                                                                    if (iHashCode != -1360216880) {
                                                                                        if (iHashCode != -905816648) {
                                                                                            if (iHashCode != 99657 && str.equals("dot")) {
                                                                                                b4 = 0;
                                                                                            } else {
                                                                                                b4 = -1;
                                                                                            }
                                                                                        } else if (str.equals("sesame")) {
                                                                                            b4 = 1;
                                                                                        } else {
                                                                                            b4 = -1;
                                                                                        }
                                                                                    } else if (str.equals("circle")) {
                                                                                        b4 = 2;
                                                                                    } else {
                                                                                        b4 = -1;
                                                                                    }
                                                                                    if (b4 != 0) {
                                                                                        i3 = 2;
                                                                                    } else if (b4 != 1) {
                                                                                        i3 = 1;
                                                                                    } else {
                                                                                        i3 = 3;
                                                                                    }
                                                                                    c0623b = new C0623b(i3, i6, i5);
                                                                                } else {
                                                                                    str4.equals("filled");
                                                                                }
                                                                                c1680k = new C1680K(c1706f0M4160i3);
                                                                                if (c1680k.hasNext()) {
                                                                                    next = c1680k.next();
                                                                                } else {
                                                                                    next = "circle";
                                                                                }
                                                                                str = (String) next;
                                                                                iHashCode = str.hashCode();
                                                                                if (iHashCode != -1360216880) {
                                                                                    if (iHashCode != -905816648) {
                                                                                        if (iHashCode != 99657) {
                                                                                            b4 = -1;
                                                                                        } else {
                                                                                            b4 = 0;
                                                                                        }
                                                                                    } else if (str.equals("sesame")) {
                                                                                        b4 = 1;
                                                                                    } else {
                                                                                        b4 = -1;
                                                                                    }
                                                                                } else if (str.equals("circle")) {
                                                                                    b4 = 2;
                                                                                } else {
                                                                                    b4 = -1;
                                                                                }
                                                                                if (b4 != 0) {
                                                                                    i3 = 2;
                                                                                } else if (b4 != 1) {
                                                                                    i3 = 1;
                                                                                } else {
                                                                                    i3 = 3;
                                                                                }
                                                                                c0623b = new C0623b(i3, i6, i5);
                                                                            }
                                                                        } else {
                                                                            String str5 = (String) new C1680K(c1706f0M4160i).next();
                                                                            int iHashCode4 = str5.hashCode();
                                                                            if (iHashCode4 != 3005871) {
                                                                                int i7 = (iHashCode4 == 3387192 && str5.equals("none")) ? 0 : -1;
                                                                                c0623b = new C0623b(i7, 0, i5);
                                                                            } else {
                                                                                str5.equals("auto");
                                                                            }
                                                                            c0623b = new C0623b(i7, 0, i5);
                                                                        }
                                                                    }
                                                                }
                                                                c0628gM1547a.f2451r = c0623b;
                                                                break;
                                                            case "rubyPosition":
                                                                String strM3288K6 = AbstractC1303m.m3288K(attributeValue);
                                                                strM3288K6.getClass();
                                                                if (strM3288K6.equals("before")) {
                                                                    c0628gM1547a = m1547a(c0628gM1547a);
                                                                    c0628gM1547a.f2447n = 1;
                                                                } else if (strM3288K6.equals(str2)) {
                                                                    c0628gM1547a = m1547a(c0628gM1547a);
                                                                    c0628gM1547a.f2447n = 2;
                                                                }
                                                                str2 = str2;
                                                                break;
                                                            case "backgroundColor":
                                                                c0628gM1547a = m1547a(c0628gM1547a);
                                                                try {
                                                                    c0628gM1547a.f2437d = AbstractC0634b.m1610a(attributeValue, false);
                                                                    c0628gM1547a.f2438e = true;
                                                                    break;
                                                                } catch (IllegalArgumentException unused3) {
                                                                    AbstractC0462h.m1171k("Failed parsing background value: ", attributeValue, "TtmlParser");
                                                                }
                                                                str2 = str2;
                                                                break;
                                                            case "multiRowAlign":
                                                                c0628gM1547a = m1547a(c0628gM1547a);
                                                                String strM3288K7 = AbstractC1303m.m3288K(attributeValue);
                                                                strM3288K7.getClass();
                                                                switch (strM3288K7) {
                                                                    case "center":
                                                                        alignment = Layout.Alignment.ALIGN_CENTER;
                                                                        break;
                                                                    case "end":
                                                                    case "right":
                                                                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                                        break;
                                                                    case "left":
                                                                    case "start":
                                                                        alignment = Layout.Alignment.ALIGN_NORMAL;
                                                                        break;
                                                                }
                                                                c0628gM1547a.f2449p = alignment;
                                                                str2 = str2;
                                                                break;
                                                            default:
                                                                str2 = str2;
                                                                break;
                                                        }
                                                        i4++;
                                                        xmlPullParser2 = xmlPullParser;
                                                        str2 = str2;
                                                    }
                                                    return c0628gM1547a;
                                                }

                                                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                                /* JADX WARN: Code duplicated, block: B:21:0x00a4  */
                                                /* JADX INFO: renamed from: l */
                                                public static long m1555l(String str, C0625d c0625d) throws C0460f {
                                                    double d3;
                                                    double d4;
                                                    byte b3 = 4;
                                                    Matcher matcher = f2415h.matcher(str);
                                                    if (matcher.matches()) {
                                                        String strGroup = matcher.group(1);
                                                        strGroup.getClass();
                                                        double d5 = Long.parseLong(strGroup) * 3600;
                                                        String strGroup2 = matcher.group(2);
                                                        strGroup2.getClass();
                                                        double d6 = d5 + (Long.parseLong(strGroup2) * 60);
                                                        String strGroup3 = matcher.group(3);
                                                        strGroup3.getClass();
                                                        double d7 = d6 + Long.parseLong(strGroup3);
                                                        String strGroup4 = matcher.group(4);
                                                        double d8 = d7 + (strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d);
                                                        String strGroup5 = matcher.group(5);
                                                        double d9 = d8 + (strGroup5 != null ? Long.parseLong(strGroup5) / c0625d.f2412a : 0.0d);
                                                        String strGroup6 = matcher.group(6);
                                                        return (long) ((d9 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) c0625d.f2413b)) / ((double) c0625d.f2412a) : 0.0d)) * 1000000.0d);
                                                    }
                                                    Matcher matcher2 = f2416i.matcher(str);
                                                    if (!matcher2.matches()) {
                                                        throw new C0460f("Malformed time expression: " + str);
                                                    }
                                                    String strGroup7 = matcher2.group(1);
                                                    strGroup7.getClass();
                                                    double d10 = Double.parseDouble(strGroup7);
                                                    String strGroup8 = matcher2.group(2);
                                                    strGroup8.getClass();
                                                    switch (strGroup8.hashCode()) {
                                                        case 102:
                                                            if (!strGroup8.equals("f")) {
                                                                b3 = -1;
                                                            } else {
                                                                b3 = 0;
                                                            }
                                                            break;
                                                        case 104:
                                                            if (!strGroup8.equals("h")) {
                                                                b3 = -1;
                                                            } else {
                                                                b3 = 1;
                                                            }
                                                            break;
                                                        case 109:
                                                            if (!strGroup8.equals("m")) {
                                                                b3 = -1;
                                                            } else {
                                                                b3 = 2;
                                                            }
                                                            break;
                                                        case 116:
                                                            if (!strGroup8.equals("t")) {
                                                                b3 = -1;
                                                            } else {
                                                                b3 = 3;
                                                            }
                                                            break;
                                                        case 3494:
                                                            if (!strGroup8.equals("ms")) {
                                                                b3 = -1;
                                                            }
                                                            break;
                                                        default:
                                                            b3 = -1;
                                                            break;
                                                    }
                                                    switch (b3) {
                                                        case 0:
                                                            d3 = c0625d.f2412a;
                                                            d10 /= d3;
                                                            return (long) (d10 * 1000000.0d);
                                                        case 1:
                                                            d4 = 3600.0d;
                                                            break;
                                                        case 2:
                                                            d4 = 60.0d;
                                                            break;
                                                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                                            d3 = c0625d.f2414c;
                                                            d10 /= d3;
                                                            return (long) (d10 * 1000000.0d);
                                                        case 4:
                                                            d3 = 1000.0d;
                                                            d10 /= d3;
                                                            return (long) (d10 * 1000000.0d);
                                                        default:
                                                            return (long) (d10 * 1000000.0d);
                                                    }
                                                    d10 *= d4;
                                                    return (long) (d10 * 1000000.0d);
                                                }

                                                /* JADX INFO: renamed from: m */
                                                public static C0058r m1556m(XmlPullParser xmlPullParser) {
                                                    String strM1637o = AbstractC0646n.m1637o(xmlPullParser, "extent");
                                                    if (strM1637o == null) {
                                                        return null;
                                                    }
                                                    Matcher matcher = f2420m.matcher(strM1637o);
                                                    if (!matcher.matches()) {
                                                        AbstractC0646n.m1647y("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strM1637o));
                                                        return null;
                                                    }
                                                    try {
                                                        String strGroup = matcher.group(1);
                                                        strGroup.getClass();
                                                        int i3 = Integer.parseInt(strGroup);
                                                        String strGroup2 = matcher.group(2);
                                                        strGroup2.getClass();
                                                        return new C0058r(i3, Integer.parseInt(strGroup2));
                                                    } catch (NumberFormatException unused) {
                                                        AbstractC0646n.m1647y("TtmlParser", "Ignoring malformed tts extent: ".concat(strM1637o));
                                                        return null;
                                                    }
                                                }

                                                @Override // p045P0.InterfaceC0465k
                                                /* JADX INFO: renamed from: b */
                                                public final /* synthetic */ void mo514b() {
                                                }

                                                @Override // p045P0.InterfaceC0465k
                                                /* JADX INFO: renamed from: h */
                                                public final void mo520h(byte[] bArr, int i3, int i4, C0464j c0464j, InterfaceC0636d interfaceC0636d) {
                                                    AbstractC0610a.m1497K(mo523k(bArr, i3, i4), c0464j, interfaceC0636d);
                                                }

                                                @Override // p045P0.InterfaceC0465k
                                                /* JADX INFO: renamed from: k */
                                                public final InterfaceC0458d mo523k(byte[] bArr, int i3, int i4) {
                                                    try {
                                                        XmlPullParser xmlPullParserNewPullParser = this.f2423g.newPullParser();
                                                        HashMap map = new HashMap();
                                                        HashMap map2 = new HashMap();
                                                        HashMap map3 = new HashMap();
                                                        map2.put("", new C0627f("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
                                                        C0058r c0058rM1556m = null;
                                                        xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i3, i4), null);
                                                        ArrayDeque arrayDeque = new ArrayDeque();
                                                        C0625d c0625dM1551f = f2422o;
                                                        C0258b c0258b = null;
                                                        int iM1549d = 15;
                                                        int i5 = 0;
                                                        for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                                                            C0624c c0624c = (C0624c) arrayDeque.peek();
                                                            if (i5 == 0) {
                                                                String name = xmlPullParserNewPullParser.getName();
                                                                if (eventType == 2) {
                                                                    if ("tt".equals(name)) {
                                                                        c0625dM1551f = m1551f(xmlPullParserNewPullParser);
                                                                        iM1549d = m1549d(xmlPullParserNewPullParser);
                                                                        c0058rM1556m = m1556m(xmlPullParserNewPullParser);
                                                                    }
                                                                    C0625d c0625d = c0625dM1551f;
                                                                    C0058r c0058r = c0058rM1556m;
                                                                    int i6 = iM1549d;
                                                                    if (m1548c(name)) {
                                                                        if ("head".equals(name)) {
                                                                            m1552g(xmlPullParserNewPullParser, map, i6, c0058r, map2, map3);
                                                                        } else {
                                                                            try {
                                                                                C0624c c0624cM1553i = m1553i(xmlPullParserNewPullParser, c0624c, map2, c0625d);
                                                                                arrayDeque.push(c0624cM1553i);
                                                                                if (c0624c != null) {
                                                                                    if (c0624c.f2411m == null) {
                                                                                        c0624c.f2411m = new ArrayList();
                                                                                    }
                                                                                    c0624c.f2411m.add(c0624cM1553i);
                                                                                }
                                                                            } catch (C0460f e3) {
                                                                                AbstractC0646n.m1648z("TtmlParser", "Suppressing parser error", e3);
                                                                                i5++;
                                                                            }
                                                                        }
                                                                        iM1549d = i6;
                                                                        c0058rM1556m = c0058r;
                                                                        c0625dM1551f = c0625d;
                                                                    } else {
                                                                        AbstractC0646n.m1639q("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                                                                    }
                                                                    i5++;
                                                                    iM1549d = i6;
                                                                    c0058rM1556m = c0058r;
                                                                    c0625dM1551f = c0625d;
                                                                } else if (eventType == 4) {
                                                                    c0624c.getClass();
                                                                    C0624c c0624cM1538a = C0624c.m1538a(xmlPullParserNewPullParser.getText());
                                                                    if (c0624c.f2411m == null) {
                                                                        c0624c.f2411m = new ArrayList();
                                                                    }
                                                                    c0624c.f2411m.add(c0624cM1538a);
                                                                } else if (eventType == 3) {
                                                                    if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                                                        C0624c c0624c2 = (C0624c) arrayDeque.peek();
                                                                        c0624c2.getClass();
                                                                        c0258b = new C0258b(c0624c2, map, map2, map3);
                                                                    }
                                                                    arrayDeque.pop();
                                                                }
                                                            } else if (eventType == 2) {
                                                                i5++;
                                                            } else if (eventType == 3) {
                                                                i5--;
                                                            }
                                                            xmlPullParserNewPullParser.next();
                                                        }
                                                        c0258b.getClass();
                                                        return c0258b;
                                                    } catch (IOException e4) {
                                                        throw new IllegalStateException("Unexpected error when reading input.", e4);
                                                    } catch (XmlPullParserException e5) {
                                                        throw new IllegalStateException("Unable to decode source", e5);
                                                    }
                                                }
                                            }

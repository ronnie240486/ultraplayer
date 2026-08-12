package p064W;

import android.app.UiModeManager;
import android.content.Context;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.io.Closeable;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p000A.C0031d;
import p030K0.C0334e;
import p038N.AbstractC0402b;
import p046P1.C0471D;
import p055T.AbstractC0545H;
import p055T.AbstractC0558V;
import p055T.C0549L;
import p055T.C0557U;
import p055T.C0581m;
import p055T.InterfaceC0553P;
import p060U1.AbstractC0610a;
import p105h2.AbstractC1676G;
import p112j2.AbstractC1788a;
import p112j2.AbstractC1789b;
import p137q0.C2143d;

/* JADX INFO: renamed from: W.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0632A {

    /* JADX INFO: renamed from: a */
    public static final int f2454a;

    /* JADX INFO: renamed from: b */
    public static final String f2455b;

    /* JADX INFO: renamed from: c */
    public static final String f2456c;

    /* JADX INFO: renamed from: d */
    public static final String f2457d;

    /* JADX INFO: renamed from: e */
    public static final String f2458e;

    /* JADX INFO: renamed from: f */
    public static final byte[] f2459f;

    /* JADX INFO: renamed from: g */
    public static final Pattern f2460g;

    /* JADX INFO: renamed from: h */
    public static final Pattern f2461h;

    /* JADX INFO: renamed from: i */
    public static HashMap f2462i;

    /* JADX INFO: renamed from: j */
    public static final String[] f2463j;

    /* JADX INFO: renamed from: k */
    public static final String[] f2464k;

    /* JADX INFO: renamed from: l */
    public static final int[] f2465l;

    /* JADX INFO: renamed from: m */
    public static final int[] f2466m;

    /* JADX INFO: renamed from: n */
    public static final int[] f2467n;

    static {
        int i3 = Build.VERSION.SDK_INT;
        f2454a = i3;
        String str = Build.DEVICE;
        f2455b = str;
        String str2 = Build.MANUFACTURER;
        f2456c = str2;
        String str3 = Build.MODEL;
        f2457d = str3;
        f2458e = str + ", " + str3 + ", " + str2 + ", " + i3;
        f2459f = new byte[0];
        f2460g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f2461h = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f2463j = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f2464k = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f2465l = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f2466m = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f2467n = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    /* JADX INFO: renamed from: A */
    public static String m1560A(StringBuilder sb, Formatter formatter, long j3) {
        long j4 = j3 == -9223372036854775807L ? 0L : j3;
        String str = j4 < 0 ? "-" : "";
        long jAbs = (Math.abs(j4) + 500) / 1000;
        long j5 = jAbs % 60;
        long j6 = (jAbs / 60) % 60;
        long j7 = jAbs / 3600;
        sb.setLength(0);
        return j7 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j7), Long.valueOf(j6), Long.valueOf(j5)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j6), Long.valueOf(j5)).toString();
    }

    /* JADX INFO: renamed from: B */
    public static String m1561B(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e3) {
            AbstractC0646n.m1636n("Util", "Failed to read system property ".concat(str), e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: C */
    public static String m1562C(int i3) {
        switch (i3) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i3 < 10000) {
                    return "?";
                }
                return "custom (" + i3 + ")";
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003b  */
    /* JADX WARN: Code duplicated, block: B:20:0x003f A[RETURN] */
    /* JADX INFO: renamed from: D */
    public static boolean m1563D(InterfaceC0553P interfaceC0553P) {
        AbstractC0402b abstractC0402b;
        boolean z3 = false;
        if (interfaceC0553P == null) {
            return false;
        }
        int iMo1304g = interfaceC0553P.mo1304g();
        if (iMo1304g != 1 || !((AbstractC0402b) interfaceC0553P).m1089U(2)) {
            if (iMo1304g == 4) {
                AbstractC0402b abstractC0402b2 = (AbstractC0402b) interfaceC0553P;
                if (abstractC0402b2.m1089U(4)) {
                    abstractC0402b2.mo1092X(abstractC0402b2.mo1292N(), -9223372036854775807L, false);
                }
            }
            abstractC0402b = (AbstractC0402b) interfaceC0553P;
            if (abstractC0402b.m1089U(1)) {
                return z3;
            }
            abstractC0402b.mo1308i(true);
            return true;
        }
        interfaceC0553P.mo1295b();
        z3 = true;
        abstractC0402b = (AbstractC0402b) interfaceC0553P;
        if (abstractC0402b.m1089U(1)) {
            return z3;
        }
        abstractC0402b.mo1308i(true);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x00d9 A[RETURN] */
    /* JADX INFO: renamed from: E */
    public static int m1564E(Uri uri, String str) {
        int i3;
        if (str != null) {
            switch (str) {
                case "application/x-mpegURL":
                    return 2;
                case "application/vnd.ms-sstr+xml":
                    return 1;
                case "application/dash+xml":
                    return 0;
                case "application/x-rtsp":
                    return 3;
                default:
                    return 4;
            }
        }
        String scheme = uri.getScheme();
        if (scheme == null || !AbstractC1303m.m3318k("rtsp", scheme)) {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                if (iLastIndexOf >= 0) {
                    String strM3288K = AbstractC1303m.m3288K(lastPathSegment.substring(iLastIndexOf + 1));
                    strM3288K.getClass();
                    switch (strM3288K.hashCode()) {
                        case 104579:
                            if (strM3288K.equals("ism")) {
                            }
                            break;
                        case 108321:
                            if (strM3288K.equals("mpd")) {
                            }
                            break;
                        case 3242057:
                            if (strM3288K.equals("isml")) {
                            }
                            break;
                        case 3299913:
                            if (strM3288K.equals("m3u8")) {
                            }
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
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                        Method dump skipped, instruction units count: 278
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p064W.AbstractC0632A.m1564E(android.net.Uri, java.lang.String):int");
                }

                /* JADX INFO: renamed from: F */
                public static boolean m1565F(C0651s c0651s, C0651s c0651s2, Inflater inflater) {
                    if (c0651s.m1667a() <= 0) {
                        return false;
                    }
                    if (c0651s2.f2520a.length < c0651s.m1667a()) {
                        c0651s2.m1668b(c0651s.m1667a() * 2);
                    }
                    if (inflater == null) {
                        inflater = new Inflater();
                    }
                    inflater.setInput(c0651s.f2520a, c0651s.f2521b, c0651s.m1667a());
                    int iInflate = 0;
                    while (true) {
                        try {
                            byte[] bArr = c0651s2.f2520a;
                            iInflate += inflater.inflate(bArr, iInflate, bArr.length - iInflate);
                            if (inflater.finished()) {
                                c0651s2.m1664F(iInflate);
                                inflater.reset();
                                return true;
                            }
                            if (!inflater.needsDictionary() && !inflater.needsInput()) {
                                byte[] bArr2 = c0651s2.f2520a;
                                if (iInflate == bArr2.length) {
                                    c0651s2.m1668b(bArr2.length * 2);
                                }
                            }
                            inflater.reset();
                            return false;
                        } catch (DataFormatException unused) {
                            inflater.reset();
                            return false;
                        } catch (Throwable th) {
                            inflater.reset();
                            throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: G */
                public static void m1566G(int i3) {
                    Integer.toString(i3, 36);
                }

                /* JADX INFO: renamed from: H */
                public static boolean m1567H(int i3) {
                    return i3 == 3 || i3 == 2 || i3 == 268435456 || i3 == 21 || i3 == 1342177280 || i3 == 22 || i3 == 1610612736 || i3 == 4;
                }

                /* JADX INFO: renamed from: I */
                public static boolean m1568I(Context context) {
                    int i3 = f2454a;
                    if (i3 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
                        return true;
                    }
                    String str = f2457d;
                    if (i3 == 30 && (AbstractC1303m.m3318k(str, "moto g(20)") || AbstractC1303m.m3318k(str, "rmx3231"))) {
                        return true;
                    }
                    return i3 == 34 && AbstractC1303m.m3318k(str, "sm-x200");
                }

                /* JADX INFO: renamed from: J */
                public static boolean m1569J(int i3) {
                    return i3 == 10 || i3 == 13;
                }

                /* JADX INFO: renamed from: K */
                public static boolean m1570K(Context context) {
                    UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
                    return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
                }

                /* JADX INFO: renamed from: L */
                public static long m1571L(long j3) {
                    return (j3 == -9223372036854775807L || j3 == Long.MIN_VALUE) ? j3 : j3 * 1000;
                }

                /* JADX INFO: renamed from: M */
                public static String m1572M(String str) {
                    if (str == null) {
                        return null;
                    }
                    String strReplace = str.replace('_', '-');
                    if (!strReplace.isEmpty() && !strReplace.equals("und")) {
                        str = strReplace;
                    }
                    String strM3288K = AbstractC1303m.m3288K(str);
                    int i3 = 0;
                    String str2 = strM3288K.split("-", 2)[0];
                    if (f2462i == null) {
                        String[] iSOLanguages = Locale.getISOLanguages();
                        int length = iSOLanguages.length;
                        String[] strArr = f2463j;
                        HashMap map = new HashMap(length + strArr.length);
                        for (String str3 : iSOLanguages) {
                            try {
                                String iSO3Language = new Locale(str3).getISO3Language();
                                if (!TextUtils.isEmpty(iSO3Language)) {
                                    map.put(iSO3Language, str3);
                                }
                            } catch (MissingResourceException unused) {
                            }
                        }
                        for (int i4 = 0; i4 < strArr.length; i4 += 2) {
                            map.put(strArr[i4], strArr[i4 + 1]);
                        }
                        f2462i = map;
                    }
                    String str4 = (String) f2462i.get(str2);
                    if (str4 != null) {
                        strM3288K = str4 + strM3288K.substring(str2.length());
                        str2 = str4;
                    }
                    if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
                        return strM3288K;
                    }
                    while (true) {
                        String[] strArr2 = f2464k;
                        if (i3 >= strArr2.length) {
                            return strM3288K;
                        }
                        if (strM3288K.startsWith(strArr2[i3])) {
                            return strArr2[i3 + 1] + strM3288K.substring(strArr2[i3].length());
                        }
                        i3 += 2;
                    }
                }

                /* JADX INFO: renamed from: N */
                public static Object[] m1573N(int i3, Object[] objArr) {
                    AbstractC0646n.m1625c(i3 <= objArr.length);
                    return Arrays.copyOf(objArr, i3);
                }

                /* JADX INFO: renamed from: O */
                public static void m1574O(Handler handler, Runnable runnable) {
                    if (handler.getLooper().getThread().isAlive()) {
                        if (handler.getLooper() == Looper.myLooper()) {
                            runnable.run();
                        } else {
                            handler.post(runnable);
                        }
                    }
                }

                /* JADX INFO: renamed from: P */
                public static long m1575P(int i3, long j3) {
                    return m1577R(j3, 1000000L, i3, RoundingMode.DOWN);
                }

                /* JADX INFO: renamed from: Q */
                public static void m1576Q(long[] jArr, long j3) {
                    long j4;
                    RoundingMode roundingMode = RoundingMode.DOWN;
                    int i3 = 0;
                    if (j3 >= 1000000 && j3 % 1000000 == 0) {
                        long jM3317j = AbstractC1303m.m3317j(j3, 1000000L, RoundingMode.UNNECESSARY);
                        while (i3 < jArr.length) {
                            jArr[i3] = AbstractC1303m.m3317j(jArr[i3], jM3317j, roundingMode);
                            i3++;
                        }
                        return;
                    }
                    if (j3 < 1000000 && 1000000 % j3 == 0) {
                        long jM3317j2 = AbstractC1303m.m3317j(1000000L, j3, RoundingMode.UNNECESSARY);
                        while (i3 < jArr.length) {
                            jArr[i3] = AbstractC1303m.m3282E(jArr[i3], jM3317j2);
                            i3++;
                        }
                        return;
                    }
                    int i4 = 0;
                    while (i4 < jArr.length) {
                        long j5 = jArr[i4];
                        if (j5 != 0) {
                            if (j3 >= j5 && j3 % j5 == 0) {
                                jArr[i4] = AbstractC1303m.m3317j(1000000L, AbstractC1303m.m3317j(j3, j5, RoundingMode.UNNECESSARY), roundingMode);
                            } else if (j3 >= j5 || j5 % j3 != 0) {
                                j4 = j3;
                                jArr[i4] = m1578S(j5, 1000000L, j4, roundingMode);
                            } else {
                                jArr[i4] = AbstractC1303m.m3282E(1000000L, AbstractC1303m.m3317j(j5, j3, RoundingMode.UNNECESSARY));
                            }
                            j4 = j3;
                        } else {
                            j4 = j3;
                        }
                        i4++;
                        j3 = j4;
                    }
                }

                /* JADX INFO: renamed from: R */
                public static long m1577R(long j3, long j4, long j5, RoundingMode roundingMode) {
                    if (j3 == 0 || j4 == 0) {
                        return 0L;
                    }
                    if (j5 >= j4 && j5 % j4 == 0) {
                        return AbstractC1303m.m3317j(j3, AbstractC1303m.m3317j(j5, j4, RoundingMode.UNNECESSARY), roundingMode);
                    }
                    if (j5 < j4 && j4 % j5 == 0) {
                        return AbstractC1303m.m3282E(j3, AbstractC1303m.m3317j(j4, j5, RoundingMode.UNNECESSARY));
                    }
                    if (j5 < j3 || j5 % j3 != 0) {
                        return (j5 >= j3 || j3 % j5 != 0) ? m1578S(j3, j4, j5, roundingMode) : AbstractC1303m.m3282E(j4, AbstractC1303m.m3317j(j3, j5, RoundingMode.UNNECESSARY));
                    }
                    return AbstractC1303m.m3317j(j4, AbstractC1303m.m3317j(j5, j3, RoundingMode.UNNECESSARY), roundingMode);
                }

                /* JADX WARN: Code duplicated, block: B:60:0x00f0  */
                /* JADX WARN: Code duplicated, block: B:61:0x00f2  */
                /* JADX WARN: Code duplicated, block: B:65:0x00f8  */
                /* JADX WARN: Code duplicated, block: B:68:0x00fd  */
                /* JADX WARN: Code duplicated, block: B:70:0x00ff  */
                /* JADX WARN: Instruction removed from duplicated block: B:70:0x00ff, please report this as an issue */
                /* JADX INFO: renamed from: S */
                public static long m1578S(long j3, long j4, long j5, RoundingMode roundingMode) {
                    double dRint;
                    long j6;
                    boolean z3;
                    long jM3282E = AbstractC1303m.m3282E(j3, j4);
                    if (jM3282E != Long.MAX_VALUE && jM3282E != Long.MIN_VALUE) {
                        return AbstractC1303m.m3317j(jM3282E, j5, roundingMode);
                    }
                    long jM3320m = AbstractC1303m.m3320m(Math.abs(j4), Math.abs(j5));
                    RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
                    long jM3317j = AbstractC1303m.m3317j(j4, jM3320m, roundingMode2);
                    long jM3317j2 = AbstractC1303m.m3317j(j5, jM3320m, roundingMode2);
                    long jM3320m2 = AbstractC1303m.m3320m(Math.abs(j3), Math.abs(jM3317j2));
                    long jM3317j3 = AbstractC1303m.m3317j(j3, jM3320m2, roundingMode2);
                    long jM3317j4 = AbstractC1303m.m3317j(jM3317j2, jM3320m2, roundingMode2);
                    long jM3282E2 = AbstractC1303m.m3282E(jM3317j3, jM3317j);
                    if (jM3282E2 != Long.MAX_VALUE && jM3282E2 != Long.MIN_VALUE) {
                        return AbstractC1303m.m3317j(jM3282E2, jM3317j4, roundingMode);
                    }
                    double d3 = jM3317j3 * (jM3317j / jM3317j4);
                    if (d3 > 9.223372036854776E18d) {
                        return Long.MAX_VALUE;
                    }
                    if (d3 < -9.223372036854776E18d) {
                        return Long.MIN_VALUE;
                    }
                    int i3 = AbstractC1789b.f7980a;
                    if (!AbstractC0610a.m1518u(d3)) {
                        throw new ArithmeticException("input is infinite or NaN");
                    }
                    switch (AbstractC1788a.f7979a[roundingMode.ordinal()]) {
                        case 1:
                            if (!AbstractC1789b.m4279a(d3)) {
                                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                            }
                            dRint = d3;
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d3 + " and rounding mode " + roundingMode);
                        case 2:
                            if (d3 >= 0.0d || AbstractC1789b.m4279a(d3)) {
                                dRint = d3;
                            } else {
                                j6 = ((long) d3) - 1;
                                dRint = j6;
                            }
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d3 + " and rounding mode " + roundingMode);
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            if (d3 <= 0.0d || AbstractC1789b.m4279a(d3)) {
                                dRint = d3;
                            } else {
                                j6 = ((long) d3) + 1;
                                dRint = j6;
                            }
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d3 + " and rounding mode " + roundingMode);
                        case 4:
                            dRint = d3;
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d3 + " and rounding mode " + roundingMode);
                        case 5:
                            if (AbstractC1789b.m4279a(d3)) {
                                dRint = d3;
                            } else {
                                dRint = ((long) d3) + ((long) (d3 > 0.0d ? 1 : -1));
                            }
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d3 + " and rounding mode " + roundingMode);
                        case 6:
                            dRint = Math.rint(d3);
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d3 + " and rounding mode " + roundingMode);
                        case 7:
                            dRint = Math.rint(d3);
                            if (Math.abs(d3 - dRint) == 0.5d) {
                                dRint = Math.copySign(0.5d, d3) + d3;
                            }
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d3 + " and rounding mode " + roundingMode);
                        case 8:
                            dRint = Math.rint(d3);
                            if (Math.abs(d3 - dRint) == 0.5d) {
                                dRint = d3;
                            }
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d3 + " and rounding mode " + roundingMode);
                        default:
                            throw new AssertionError();
                    }
                }

                /* JADX INFO: renamed from: T */
                public static boolean m1579T(InterfaceC0553P interfaceC0553P, boolean z3) {
                    return interfaceC0553P == null || !interfaceC0553P.mo1322t() || interfaceC0553P.mo1304g() == 1 || interfaceC0553P.mo1304g() == 4 || (z3 && interfaceC0553P.mo1321r() != 0);
                }

                /* JADX INFO: renamed from: U */
                public static String[] m1580U(String str) {
                    return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
                }

                /* JADX INFO: renamed from: V */
                public static long m1581V(long j3) {
                    return (j3 == -9223372036854775807L || j3 == Long.MIN_VALUE) ? j3 : j3 / 1000;
                }

                /* JADX INFO: renamed from: a */
                public static int m1582a(long[] jArr, long j3, boolean z3) {
                    int i3;
                    int iBinarySearch = Arrays.binarySearch(jArr, j3);
                    if (iBinarySearch < 0) {
                        return ~iBinarySearch;
                    }
                    while (true) {
                        i3 = iBinarySearch + 1;
                        if (i3 >= jArr.length || jArr[i3] != j3) {
                            break;
                        }
                        iBinarySearch = i3;
                    }
                    return z3 ? iBinarySearch : i3;
                }

                /* JADX INFO: renamed from: b */
                public static int m1583b(C0334e c0334e, long j3) {
                    int i3 = c0334e.f1062g - 1;
                    int i4 = 0;
                    while (i4 <= i3) {
                        int i5 = (i4 + i3) >>> 1;
                        if (c0334e.m927g(i5) < j3) {
                            i4 = i5 + 1;
                        } else {
                            i3 = i5 - 1;
                        }
                    }
                    int i6 = i3 + 1;
                    if (i6 < c0334e.f1062g && c0334e.m927g(i6) == j3) {
                        return i6;
                    }
                    if (i3 == -1) {
                        return 0;
                    }
                    return i3;
                }

                /* JADX INFO: renamed from: c */
                public static int m1584c(AbstractC1676G abstractC1676G, Long l3, boolean z3) {
                    int i3;
                    int iBinarySearch = Collections.binarySearch(abstractC1676G, l3);
                    if (iBinarySearch < 0) {
                        i3 = -(iBinarySearch + 2);
                    } else {
                        while (true) {
                            int i4 = iBinarySearch - 1;
                            if (i4 < 0 || ((Comparable) abstractC1676G.get(i4)).compareTo(l3) != 0) {
                                break;
                            }
                            iBinarySearch = i4;
                        }
                        i3 = iBinarySearch;
                    }
                    return z3 ? Math.max(0, i3) : i3;
                }

                /* JADX INFO: renamed from: d */
                public static int m1585d(int[] iArr, int i3, boolean z3, boolean z4) {
                    int i4;
                    int i5;
                    int iBinarySearch = Arrays.binarySearch(iArr, i3);
                    if (iBinarySearch < 0) {
                        i5 = -(iBinarySearch + 2);
                    } else {
                        while (true) {
                            i4 = iBinarySearch - 1;
                            if (i4 < 0 || iArr[i4] != i3) {
                                break;
                            }
                            iBinarySearch = i4;
                        }
                        i5 = z3 ? iBinarySearch : i4;
                    }
                    return z4 ? Math.max(0, i5) : i5;
                }

                /* JADX INFO: renamed from: e */
                public static int m1586e(long[] jArr, long j3, boolean z3) {
                    int i3;
                    int iBinarySearch = Arrays.binarySearch(jArr, j3);
                    if (iBinarySearch < 0) {
                        i3 = -(iBinarySearch + 2);
                    } else {
                        while (true) {
                            int i4 = iBinarySearch - 1;
                            if (i4 < 0 || jArr[i4] != j3) {
                                break;
                            }
                            iBinarySearch = i4;
                        }
                        i3 = iBinarySearch;
                    }
                    return z3 ? Math.max(0, i3) : i3;
                }

                /* JADX INFO: renamed from: f */
                public static int m1587f(int i3, int i4) {
                    return ((i3 + i4) - 1) / i4;
                }

                /* JADX INFO: renamed from: g */
                public static void m1588g(Closeable closeable) {
                    try {
                        closeable.close();
                    } catch (IOException unused) {
                    }
                }

                /* JADX INFO: renamed from: h */
                public static float m1589h(float f, float f3, float f4) {
                    return Math.max(f3, Math.min(f, f4));
                }

                /* JADX INFO: renamed from: i */
                public static int m1590i(int i3, int i4, int i5) {
                    return Math.max(i4, Math.min(i3, i5));
                }

                /* JADX INFO: renamed from: j */
                public static long m1591j(long j3, long j4, long j5) {
                    return Math.max(j4, Math.min(j3, j5));
                }

                /* JADX INFO: renamed from: k */
                public static boolean m1592k(Object[] objArr, Object obj) {
                    for (Object obj2 : objArr) {
                        if (Objects.equals(obj2, obj)) {
                            return true;
                        }
                    }
                    return false;
                }

                /* JADX INFO: renamed from: l */
                public static int m1593l(int i3, int i4, int i5, byte[] bArr) {
                    while (i3 < i4) {
                        i5 = f2465l[((i5 >>> 24) ^ (bArr[i3] & 255)) & 255] ^ (i5 << 8);
                        i3++;
                    }
                    return i5;
                }

                /* JADX INFO: renamed from: m */
                public static Handler m1594m(C2143d c2143d) {
                    Looper looperMyLooper = Looper.myLooper();
                    AbstractC0646n.m1631i(looperMyLooper);
                    return new Handler(looperMyLooper, c2143d);
                }

                /* JADX INFO: renamed from: n */
                public static String m1595n(byte[] bArr) {
                    return new String(bArr, StandardCharsets.UTF_8);
                }

                /* JADX INFO: renamed from: o */
                public static int m1596o(int i3) {
                    if (i3 == 20) {
                        return 30;
                    }
                    if (i3 == 22) {
                        return 31;
                    }
                    if (i3 == 30) {
                        return 34;
                    }
                    switch (i3) {
                        case 2:
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            return 3;
                        case 4:
                        case 5:
                        case 6:
                            return 21;
                        case 7:
                        case 8:
                            return 23;
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            return 28;
                        default:
                            switch (i3) {
                                case 14:
                                    return 25;
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                    return 28;
                                default:
                                    return Integer.MAX_VALUE;
                            }
                    }
                }

                /* JADX INFO: renamed from: p */
                public static AudioFormat m1597p(int i3, int i4, int i5) {
                    return new AudioFormat.Builder().setSampleRate(i3).setChannelMask(i4).setEncoding(i5).build();
                }

                /* JADX INFO: renamed from: q */
                public static int m1598q(int i3) {
                    int i4 = f2454a;
                    if (i3 == 10) {
                        return i4 >= 32 ? 737532 : 6396;
                    }
                    if (i3 == 12) {
                        return 743676;
                    }
                    if (i3 == 24) {
                        return i4 >= 32 ? 67108860 : 0;
                    }
                    switch (i3) {
                        case 1:
                            return 4;
                        case 2:
                            return 12;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            return 28;
                        case 4:
                            return 204;
                        case 5:
                            return 220;
                        case 6:
                            return 252;
                        case 7:
                            return 1276;
                        case 8:
                            return 6396;
                        default:
                            return 0;
                    }
                }

                /* JADX INFO: renamed from: r */
                public static C0549L m1599r(AbstractC0402b abstractC0402b, C0549L c0549l) {
                    int iMo1413k;
                    int iMo1409e;
                    boolean zMo1310j = abstractC0402b.mo1310j();
                    AbstractC0558V abstractC0558VMo1324w = abstractC0402b.mo1324w();
                    boolean zM1415p = abstractC0558VMo1324w.m1415p();
                    boolean z3 = false;
                    C0557U c0557u = (C0557U) abstractC0402b.f1360a;
                    boolean z4 = !zM1415p && abstractC0558VMo1324w.mo1332m(abstractC0402b.mo1292N(), c0557u, 0L).f1982h;
                    AbstractC0558V abstractC0558VMo1324w2 = abstractC0402b.mo1324w();
                    if (abstractC0558VMo1324w2.m1415p()) {
                        iMo1413k = -1;
                    } else {
                        int iMo1292N = abstractC0402b.mo1292N();
                        int iMo1300e = abstractC0402b.mo1300e();
                        if (iMo1300e == 1) {
                            iMo1300e = 0;
                        }
                        iMo1413k = abstractC0558VMo1324w2.mo1413k(iMo1292N, iMo1300e, abstractC0402b.mo1282B());
                    }
                    boolean z5 = iMo1413k != -1;
                    AbstractC0558V abstractC0558VMo1324w3 = abstractC0402b.mo1324w();
                    if (abstractC0558VMo1324w3.m1415p()) {
                        iMo1409e = -1;
                    } else {
                        int iMo1292N2 = abstractC0402b.mo1292N();
                        int iMo1300e2 = abstractC0402b.mo1300e();
                        if (iMo1300e2 == 1) {
                            iMo1300e2 = 0;
                        }
                        iMo1409e = abstractC0558VMo1324w3.mo1409e(iMo1292N2, iMo1300e2, abstractC0402b.mo1282B());
                    }
                    boolean z6 = iMo1409e != -1;
                    boolean zM1090V = abstractC0402b.m1090V();
                    AbstractC0558V abstractC0558VMo1324w4 = abstractC0402b.mo1324w();
                    boolean z7 = !abstractC0558VMo1324w4.m1415p() && abstractC0558VMo1324w4.mo1332m(abstractC0402b.mo1292N(), c0557u, 0L).f1983i;
                    boolean zM1415p2 = abstractC0402b.mo1324w().m1415p();
                    C0031d c0031d = new C0031d(20);
                    C0581m c0581m = c0549l.f1952a;
                    C0471D c0471d = (C0471D) c0031d.f38h;
                    c0471d.getClass();
                    for (int i3 = 0; i3 < c0581m.f2090a.size(); i3++) {
                        c0471d.m1184a(c0581m.m1445a(i3));
                    }
                    boolean z8 = !zMo1310j;
                    c0031d.m168p(4, z8);
                    c0031d.m168p(5, z4 && !zMo1310j);
                    c0031d.m168p(6, z5 && !zMo1310j);
                    c0031d.m168p(7, !zM1415p2 && (z5 || !zM1090V || z4) && !zMo1310j);
                    c0031d.m168p(8, z6 && !zMo1310j);
                    c0031d.m168p(9, !zM1415p2 && (z6 || (zM1090V && z7)) && !zMo1310j);
                    c0031d.m168p(10, z8);
                    c0031d.m168p(11, z4 && !zMo1310j);
                    if (z4 && !zMo1310j) {
                        z3 = true;
                    }
                    c0031d.m168p(12, z3);
                    return new C0549L(c0471d.m1185b());
                }

                /* JADX INFO: renamed from: s */
                public static int m1600s(int i3, String str) {
                    int i4 = 0;
                    for (String str2 : m1580U(str)) {
                        if (i3 == AbstractC0545H.m1359g(AbstractC0545H.m1355c(str2))) {
                            i4++;
                        }
                    }
                    return i4;
                }

                /* JADX INFO: renamed from: t */
                public static String m1601t(int i3, String str) {
                    String[] strArrM1580U = m1580U(str);
                    if (strArrM1580U.length == 0) {
                        return null;
                    }
                    StringBuilder sb = new StringBuilder();
                    for (String str2 : strArrM1580U) {
                        if (i3 == AbstractC0545H.m1359g(AbstractC0545H.m1355c(str2))) {
                            if (sb.length() > 0) {
                                sb.append(",");
                            }
                            sb.append(str2);
                        }
                    }
                    if (sb.length() > 0) {
                        return sb.toString();
                    }
                    return null;
                }

                /* JADX INFO: renamed from: u */
                public static int m1602u(int i3) {
                    if (i3 == 2 || i3 == 4) {
                        return 6005;
                    }
                    if (i3 == 10) {
                        return 6004;
                    }
                    if (i3 == 7) {
                        return 6005;
                    }
                    if (i3 == 8) {
                        return 6003;
                    }
                    switch (i3) {
                        case 15:
                            return 6003;
                        case 16:
                        case 18:
                            return 6005;
                        case 17:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            return 6004;
                        default:
                            switch (i3) {
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                    return 6002;
                                default:
                                    return 6006;
                            }
                    }
                }

                /* JADX INFO: renamed from: v */
                public static int m1603v(String str) {
                    String[] strArrSplit;
                    int length;
                    int i3 = 0;
                    if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
                        return 0;
                    }
                    String str2 = strArrSplit[length - 1];
                    boolean z3 = length >= 3 && "neg".equals(strArrSplit[length - 2]);
                    try {
                        str2.getClass();
                        i3 = Integer.parseInt(str2);
                        if (z3) {
                            return -i3;
                        }
                    } catch (NumberFormatException unused) {
                    }
                    return i3;
                }

                /* JADX INFO: renamed from: w */
                public static long m1604w(long j3, float f) {
                    return f == 1.0f ? j3 : Math.round(j3 * ((double) f));
                }

                /* JADX INFO: renamed from: x */
                public static int m1605x(int i3) {
                    if (i3 == 8) {
                        return 3;
                    }
                    if (i3 == 16) {
                        return 2;
                    }
                    if (i3 != 24) {
                        return i3 != 32 ? 0 : 22;
                    }
                    return 21;
                }

                /* JADX WARN: Code duplicated, block: B:21:0x0024  */
                /* JADX WARN: Code duplicated, block: B:22:0x0026  */
                /* JADX INFO: renamed from: y */
                public static int m1606y(int i3, int i4) {
                    int i5 = 2;
                    if (i3 != 2) {
                        if (i3 == 3) {
                            i5 = 1;
                        } else if (i3 == 4) {
                            i5 = 4;
                        } else if (i3 == 21) {
                            i5 = 3;
                        } else if (i3 == 22) {
                            i5 = 4;
                        } else if (i3 != 268435456) {
                            if (i3 != 1342177280) {
                                if (i3 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                                i5 = 4;
                            } else {
                                i5 = 3;
                            }
                        }
                    }
                    return i5 * i4;
                }

                /* JADX INFO: renamed from: z */
                public static long m1607z(long j3, float f) {
                    return f == 1.0f ? j3 : Math.round(j3 / ((double) f));
                }
            }

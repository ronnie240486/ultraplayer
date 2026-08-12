package p095f0;

import android.net.Uri;
import android.support.v4.media.session.C0858A;
import android.text.TextUtils;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p036M0.AbstractC0383t;
import p055T.AbstractC0545H;
import p055T.AbstractC0571e;
import p055T.C0544G;
import p055T.C0546I;
import p055T.C0578j;
import p055T.C0579k;
import p055T.C0582n;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p070Y.C0713j;
import p092e0.C1513r;
import p092e0.C1514s;
import p105h2.AbstractC1676G;
import p105h2.AbstractC1723q;
import p129o0.InterfaceC2075o;

/* JADX INFO: renamed from: f0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1543p implements InterfaceC2075o {

    /* JADX INFO: renamed from: g */
    public final C1540m f7032g;

    /* JADX INFO: renamed from: h */
    public final C1537j f7033h;

    /* JADX INFO: renamed from: i */
    public static final Pattern f7014i = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: j */
    public static final Pattern f7015j = Pattern.compile("VIDEO=\"(.+?)\"");

    /* JADX INFO: renamed from: k */
    public static final Pattern f7016k = Pattern.compile("AUDIO=\"(.+?)\"");

    /* JADX INFO: renamed from: l */
    public static final Pattern f7017l = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* JADX INFO: renamed from: m */
    public static final Pattern f7018m = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: n */
    public static final Pattern f7019n = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: o */
    public static final Pattern f7020o = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* JADX INFO: renamed from: p */
    public static final Pattern f7021p = Pattern.compile("CODECS=\"(.+?)\"");

    /* JADX INFO: renamed from: q */
    public static final Pattern f7022q = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: r */
    public static final Pattern f7023r = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: s */
    public static final Pattern f7024s = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: t */
    public static final Pattern f7025t = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: u */
    public static final Pattern f7026u = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: v */
    public static final Pattern f7027v = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: w */
    public static final Pattern f7028w = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: x */
    public static final Pattern f7029x = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: y */
    public static final Pattern f7030y = m3837a("CAN-SKIP-DATERANGES");

    /* JADX INFO: renamed from: z */
    public static final Pattern f7031z = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* JADX INFO: renamed from: A */
    public static final Pattern f6980A = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: B */
    public static final Pattern f6981B = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: C */
    public static final Pattern f6982C = m3837a("CAN-BLOCK-RELOAD");

    /* JADX INFO: renamed from: D */
    public static final Pattern f6983D = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* JADX INFO: renamed from: E */
    public static final Pattern f6984E = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: F */
    public static final Pattern f6985F = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* JADX INFO: renamed from: G */
    public static final Pattern f6986G = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* JADX INFO: renamed from: H */
    public static final Pattern f6987H = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* JADX INFO: renamed from: I */
    public static final Pattern f6988I = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: J */
    public static final Pattern f6989J = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* JADX INFO: renamed from: K */
    public static final Pattern f6990K = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* JADX INFO: renamed from: L */
    public static final Pattern f6991L = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* JADX INFO: renamed from: M */
    public static final Pattern f6992M = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* JADX INFO: renamed from: N */
    public static final Pattern f6993N = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* JADX INFO: renamed from: O */
    public static final Pattern f6994O = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* JADX INFO: renamed from: P */
    public static final Pattern f6995P = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: Q */
    public static final Pattern f6996Q = Pattern.compile("URI=\"(.+?)\"");

    /* JADX INFO: renamed from: R */
    public static final Pattern f6997R = Pattern.compile("IV=([^,.*]+)");

    /* JADX INFO: renamed from: S */
    public static final Pattern f6998S = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* JADX INFO: renamed from: T */
    public static final Pattern f6999T = Pattern.compile("TYPE=(PART|MAP)");

    /* JADX INFO: renamed from: U */
    public static final Pattern f7000U = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* JADX INFO: renamed from: V */
    public static final Pattern f7001V = Pattern.compile("NAME=\"(.+?)\"");

    /* JADX INFO: renamed from: W */
    public static final Pattern f7002W = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* JADX INFO: renamed from: X */
    public static final Pattern f7003X = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* JADX INFO: renamed from: Y */
    public static final Pattern f7004Y = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* JADX INFO: renamed from: Z */
    public static final Pattern f7005Z = m3837a("AUTOSELECT");

    /* JADX INFO: renamed from: a0 */
    public static final Pattern f7006a0 = m3837a("DEFAULT");

    /* JADX INFO: renamed from: b0 */
    public static final Pattern f7007b0 = m3837a("FORCED");

    /* JADX INFO: renamed from: c0 */
    public static final Pattern f7008c0 = m3837a("INDEPENDENT");

    /* JADX INFO: renamed from: d0 */
    public static final Pattern f7009d0 = m3837a("GAP");

    /* JADX INFO: renamed from: e0 */
    public static final Pattern f7010e0 = m3837a("PRECISE");

    /* JADX INFO: renamed from: f0 */
    public static final Pattern f7011f0 = Pattern.compile("VALUE=\"(.+?)\"");

    /* JADX INFO: renamed from: g0 */
    public static final Pattern f7012g0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* JADX INFO: renamed from: h0 */
    public static final Pattern f7013h0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public C1543p(C1540m c1540m, C1537j c1537j) {
        this.f7032g = c1540m;
        this.f7033h = c1537j;
    }

    /* JADX INFO: renamed from: a */
    public static Pattern m3837a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    /* JADX INFO: renamed from: b */
    public static C0579k m3838b(String str, C0578j[] c0578jArr) {
        C0578j[] c0578jArr2 = new C0578j[c0578jArr.length];
        for (int i3 = 0; i3 < c0578jArr.length; i3++) {
            C0578j c0578j = c0578jArr[i3];
            c0578jArr2[i3] = new C0578j(c0578j.f2082h, c0578j.f2083i, c0578j.f2084j, null);
        }
        return new C0579k(str, true, c0578jArr2);
    }

    /* JADX INFO: renamed from: c */
    public static C0578j m3839c(String str, String str2, HashMap map) throws C0546I {
        String strM3845i = m3845i(str, f6995P, "1", map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f6996Q;
        if (zEquals) {
            String strM3846j = m3846j(str, pattern, map);
            return new C0578j(AbstractC0571e.f2060d, null, "video/mp4", Base64.decode(strM3846j.substring(strM3846j.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = AbstractC0571e.f2060d;
            int i3 = AbstractC0632A.f2454a;
            return new C0578j(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strM3845i)) {
            return null;
        }
        String strM3846j2 = m3846j(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strM3846j2.substring(strM3846j2.indexOf(44)), 0);
        UUID uuid2 = AbstractC0571e.f2061e;
        return new C0578j(uuid2, null, "video/mp4", AbstractC0383t.m1053a(uuid2, bArrDecode));
    }

    /* JADX WARN: Code duplicated, block: B:294:0x0856  */
    /* JADX WARN: Code duplicated, block: B:296:0x0873  */
    /* JADX WARN: Code duplicated, block: B:299:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:300:0x08a4  */
    /* JADX INFO: renamed from: d */
    public static C1537j m3840d(C1540m c1540m, C1537j c1537j, C0858A c0858a, String str) throws C1542o, C0546I {
        C1534g c1534g;
        C0579k c0579k;
        int i3;
        int i4;
        C0579k c0579k2;
        C1534g c1534g2;
        C0579k c0579kM3838b;
        C1534g c1534g3;
        long j3;
        C0579k c0579kM3838b2;
        int i5;
        C1540m c1540m2 = c1540m;
        c1537j = c1537j;
        boolean z3 = c1540m2.f6979c;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        C1536i c1536i = new C1536i(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        boolean z4 = z3;
        String strM3845i = "";
        long j4 = -9223372036854775807L;
        long j5 = -9223372036854775807L;
        long j6 = 0;
        long jM1571L = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long jLongValue = 0;
        long j10 = 0;
        long j11 = -1;
        boolean zM3842f = false;
        C1532e c1532e = null;
        int i6 = 0;
        C0579k c0579k3 = null;
        C1534g c1534g4 = null;
        C0579k c0579k4 = null;
        int i7 = 0;
        String strM3846j = null;
        String strM3845i2 = null;
        boolean z5 = false;
        char c = 0;
        boolean z6 = false;
        int i8 = 0;
        String str2 = null;
        boolean z7 = false;
        boolean z8 = false;
        long j12 = -9223372036854775807L;
        long j13 = 0;
        int i9 = 1;
        while (c0858a.m2165M()) {
            String strM2168P = c0858a.m2168P();
            if (strM2168P.startsWith("#EXT")) {
                arrayList4.add(strM2168P);
            }
            if (strM2168P.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strM3846j2 = m3846j(strM2168P, f7028w, map);
                if ("VOD".equals(strM3846j2)) {
                    i6 = 1;
                } else if ("EVENT".equals(strM3846j2)) {
                    i6 = 2;
                }
            } else if (strM2168P.equals("#EXT-X-I-FRAMES-ONLY")) {
                z7 = true;
            } else if (strM2168P.startsWith("#EXT-X-START")) {
                j4 = (long) (Double.parseDouble(m3846j(strM2168P, f6988I, Collections.EMPTY_MAP)) * 1000000.0d);
                zM3842f = m3842f(strM2168P, f7010e0);
            } else if (strM2168P.startsWith("#EXT-X-SERVER-CONTROL")) {
                double dM3843g = m3843g(strM2168P, f7029x);
                long j14 = dM3843g == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM3843g * 1000000.0d);
                boolean zM3842f2 = m3842f(strM2168P, f7030y);
                double dM3843g2 = m3843g(strM2168P, f6980A);
                long j15 = dM3843g2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM3843g2 * 1000000.0d);
                double dM3843g3 = m3843g(strM2168P, f6981B);
                zM3842f = zM3842f;
                c1536i = new C1536i(j14, zM3842f2, j15, dM3843g3 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM3843g3 * 1000000.0d), m3842f(strM2168P, f6982C));
            } else {
                zM3842f = zM3842f;
                if (strM2168P.startsWith("#EXT-X-PART-INF")) {
                    j5 = (long) (Double.parseDouble(m3846j(strM2168P, f7026u, Collections.EMPTY_MAP)) * 1000000.0d);
                    zM3842f = zM3842f;
                } else {
                    boolean zStartsWith = strM2168P.startsWith("#EXT-X-MAP");
                    Pattern pattern = f6990K;
                    Pattern pattern2 = f6996Q;
                    if (zStartsWith) {
                        String strM3846j3 = m3846j(strM2168P, pattern2, map);
                        String strM3845i3 = m3845i(strM2168P, pattern, null, map);
                        if (strM3845i3 != null) {
                            int i10 = AbstractC0632A.f2454a;
                            String[] strArrSplit = strM3845i3.split("@", -1);
                            j11 = Long.parseLong(strArrSplit[c]);
                            if (strArrSplit.length > 1) {
                                j8 = Long.parseLong(strArrSplit[1]);
                            }
                        }
                        long j16 = j11;
                        if (j16 == -1) {
                            j8 = 0;
                        }
                        if (strM3846j != null && strM3845i2 == null) {
                            throw C0546I.m1366b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                        }
                        String str3 = strM3846j;
                        C1534g c1534g5 = new C1534g(strM3846j3, j8, j16, str3, strM3845i2);
                        strM3846j = str3;
                        String str4 = strM3845i2;
                        if (j16 != -1) {
                            j8 += j16;
                        }
                        j11 = -1;
                        c1534g4 = c1534g5;
                        zM3842f = zM3842f;
                        strM3845i2 = str4;
                    } else {
                        arrayList4 = arrayList4;
                        strM3845i2 = strM3845i2;
                        c1536i = c1536i;
                        if (strM2168P.startsWith("#EXT-X-TARGETDURATION")) {
                            j12 = ((long) Integer.parseInt(m3846j(strM2168P, f7024s, Collections.EMPTY_MAP))) * 1000000;
                        } else if (strM2168P.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                            j7 = Long.parseLong(m3846j(strM2168P, f6983D, Collections.EMPTY_MAP));
                            j13 = j7;
                        } else if (strM2168P.startsWith("#EXT-X-VERSION")) {
                            i9 = Integer.parseInt(m3846j(strM2168P, f7027v, Collections.EMPTY_MAP));
                        } else {
                            if (strM2168P.startsWith("#EXT-X-DEFINE")) {
                                String strM3845i4 = m3845i(strM2168P, f7012g0, null, map);
                                if (strM3845i4 != null) {
                                    String str5 = (String) c1540m2.f6975j.get(strM3845i4);
                                    if (str5 != null) {
                                        map.put(strM3845i4, str5);
                                    }
                                } else {
                                    map.put(m3846j(strM2168P, f7001V, map), m3846j(strM2168P, f7011f0, map));
                                }
                                c1534g = c1534g4;
                                c0579k = c0579k4;
                                str2 = str2;
                            } else if (strM2168P.startsWith("#EXTINF")) {
                                jLongValue = new BigDecimal(m3846j(strM2168P, f6984E, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
                                strM3845i = m3845i(strM2168P, f6985F, "", map);
                            } else {
                                if (strM2168P.startsWith("#EXT-X-SKIP")) {
                                    int i11 = Integer.parseInt(m3846j(strM2168P, f7031z, Collections.EMPTY_MAP));
                                    AbstractC0646n.m1630h(c1537j != null && arrayList.isEmpty());
                                    int i12 = AbstractC0632A.f2454a;
                                    int i13 = (int) (j13 - c1537j.f6947k);
                                    int i14 = i11 + i13;
                                    if (i13 >= 0) {
                                        AbstractC1676G abstractC1676G = c1537j.f6954r;
                                        if (i14 <= abstractC1676G.size()) {
                                            long j17 = j9;
                                            strM3845i2 = strM3845i2;
                                            while (i13 < i14) {
                                                C1534g c1534g6 = (C1534g) abstractC1676G.get(i13);
                                                if (j13 != c1537j.f6947k) {
                                                    int i15 = (c1537j.f6946j - i8) + c1534g6.f6927j;
                                                    ArrayList arrayList5 = new ArrayList();
                                                    long j18 = j17;
                                                    int i16 = 0;
                                                    while (true) {
                                                        AbstractC1676G abstractC1676G2 = c1534g6.f6923s;
                                                        if (i16 >= abstractC1676G2.size()) {
                                                            break;
                                                        }
                                                        C1532e c1532e2 = (C1532e) abstractC1676G2.get(i16);
                                                        arrayList5.add(new C1532e(c1532e2.f6924g, c1532e2.f6925h, c1532e2.f6926i, i15, j18, c1532e2.f6929l, c1532e2.f6930m, c1532e2.f6931n, c1532e2.f6932o, c1532e2.f6933p, c1532e2.f6934q, c1532e2.f6917r, c1532e2.f6918s));
                                                        j18 += c1532e2.f6926i;
                                                        i16++;
                                                        i14 = i14;
                                                    }
                                                    i5 = i14;
                                                    c1534g6 = new C1534g(c1534g6.f6924g, c1534g6.f6925h, c1534g6.f6922r, c1534g6.f6926i, i15, j17, c1534g6.f6929l, c1534g6.f6930m, c1534g6.f6931n, c1534g6.f6932o, c1534g6.f6933p, c1534g6.f6934q, arrayList5);
                                                } else {
                                                    i5 = i14;
                                                }
                                                arrayList.add(c1534g6);
                                                j17 += c1534g6.f6926i;
                                                long j19 = c1534g6.f6933p;
                                                if (j19 != -1) {
                                                    j8 = c1534g6.f6932o + j19;
                                                }
                                                String str6 = c1534g6.f6931n;
                                                if (str6 == null || !str6.equals(Long.toHexString(j7))) {
                                                    strM3845i2 = str6;
                                                }
                                                j7++;
                                                i13++;
                                                i7 = c1534g6.f6927j;
                                                c1534g4 = c1534g6.f6925h;
                                                c0579k3 = c1534g6.f6929l;
                                                strM3846j = c1534g6.f6930m;
                                                i14 = i5;
                                                j6 = j17;
                                                c1537j = c1537j;
                                            }
                                            c1540m2 = c1540m;
                                            c1537j = c1537j;
                                            zM3842f = zM3842f;
                                            arrayList4 = arrayList4;
                                            c1536i = c1536i;
                                            j9 = j17;
                                        }
                                    }
                                    throw new C1542o();
                                }
                                if (strM2168P.startsWith("#EXT-X-KEY")) {
                                    String strM3846j4 = m3846j(strM2168P, f6993N, map);
                                    String strM3845i5 = m3845i(strM2168P, f6994O, "identity", map);
                                    if ("NONE".equals(strM3846j4)) {
                                        treeMap.clear();
                                        c0579k3 = null;
                                        strM3846j = null;
                                        strM3845i2 = null;
                                    } else {
                                        strM3845i2 = m3845i(strM2168P, f6997R, null, map);
                                        if (!"identity".equals(strM3845i5)) {
                                            String str7 = str2;
                                            str2 = str7 == null ? ("SAMPLE-AES-CENC".equals(strM3846j4) || "SAMPLE-AES-CTR".equals(strM3846j4)) ? "cenc" : "cbcs" : str7;
                                            C0578j c0578jM3839c = m3839c(strM2168P, strM3845i5, map);
                                            if (c0578jM3839c != null) {
                                                treeMap.put(strM3845i5, c0578jM3839c);
                                                c0579k3 = null;
                                            }
                                            strM3846j = null;
                                        } else if ("AES-128".equals(strM3846j4)) {
                                            strM3846j = m3846j(strM2168P, pattern2, map);
                                            strM3845i2 = strM3845i2;
                                        }
                                        strM3846j = null;
                                    }
                                    c1540m2 = c1540m;
                                    c1537j = c1537j;
                                    arrayList4 = arrayList4;
                                    c1536i = c1536i;
                                } else {
                                    str2 = str2;
                                    if (strM2168P.startsWith("#EXT-X-BYTERANGE")) {
                                        String strM3846j5 = m3846j(strM2168P, f6989J, map);
                                        int i17 = AbstractC0632A.f2454a;
                                        String[] strArrSplit2 = strM3846j5.split("@", -1);
                                        j11 = Long.parseLong(strArrSplit2[c]);
                                        if (strArrSplit2.length > 1) {
                                            j8 = Long.parseLong(strArrSplit2[1]);
                                        }
                                    } else if (strM2168P.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                        i8 = Integer.parseInt(strM2168P.substring(strM2168P.indexOf(58) + 1));
                                        c1540m2 = c1540m;
                                        c1537j = c1537j;
                                        str2 = str2;
                                        zM3842f = zM3842f;
                                        strM3845i2 = strM3845i2;
                                        arrayList4 = arrayList4;
                                        c1536i = c1536i;
                                        z6 = true;
                                    } else if (strM2168P.equals("#EXT-X-DISCONTINUITY")) {
                                        i7++;
                                    } else {
                                        if (strM2168P.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                            if (jM1571L == 0) {
                                                String strSubstring = strM2168P.substring(strM2168P.indexOf(58) + 1);
                                                Matcher matcher = AbstractC0632A.f2460g.matcher(strSubstring);
                                                if (!matcher.matches()) {
                                                    throw C0546I.m1365a(null, "Invalid date/time format: " + strSubstring);
                                                }
                                                if (matcher.group(9) == null || matcher.group(9).equalsIgnoreCase("Z")) {
                                                    i3 = 0;
                                                } else {
                                                    i3 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                                                    if ("-".equals(matcher.group(11))) {
                                                        i3 *= -1;
                                                    }
                                                }
                                                GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
                                                gregorianCalendar.clear();
                                                gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                                                if (!TextUtils.isEmpty(matcher.group(8))) {
                                                    gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
                                                }
                                                long timeInMillis = gregorianCalendar.getTimeInMillis();
                                                if (i3 != 0) {
                                                    timeInMillis -= ((long) i3) * 60000;
                                                }
                                                jM1571L = AbstractC0632A.m1571L(timeInMillis) - j9;
                                            }
                                        } else if (strM2168P.equals("#EXT-X-GAP")) {
                                            c1540m2 = c1540m;
                                            c1537j = c1537j;
                                            str2 = str2;
                                            zM3842f = zM3842f;
                                            strM3845i2 = strM3845i2;
                                            arrayList4 = arrayList4;
                                            c1536i = c1536i;
                                            z8 = true;
                                        } else if (strM2168P.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                            c1540m2 = c1540m;
                                            c1537j = c1537j;
                                            str2 = str2;
                                            zM3842f = zM3842f;
                                            strM3845i2 = strM3845i2;
                                            arrayList4 = arrayList4;
                                            c1536i = c1536i;
                                            z4 = true;
                                        } else if (strM2168P.equals("#EXT-X-ENDLIST")) {
                                            c1540m2 = c1540m;
                                            c1537j = c1537j;
                                            str2 = str2;
                                            zM3842f = zM3842f;
                                            strM3845i2 = strM3845i2;
                                            arrayList4 = arrayList4;
                                            c1536i = c1536i;
                                            z5 = true;
                                        } else if (strM2168P.startsWith("#EXT-X-RENDITION-REPORT")) {
                                            long jM3844h = m3844h(strM2168P, f6986G);
                                            Matcher matcher2 = f6987H.matcher(strM2168P);
                                            if (matcher2.find()) {
                                                String strGroup = matcher2.group(1);
                                                strGroup.getClass();
                                                i4 = Integer.parseInt(strGroup);
                                            } else {
                                                i4 = -1;
                                            }
                                            arrayList3.add(new C1533f(Uri.parse(AbstractC0646n.m1644v(str, m3846j(strM2168P, pattern2, map))), jM3844h, i4));
                                        } else {
                                            if (!strM2168P.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                C0579k c0579k5 = c0579k4;
                                                C1534g c1534g7 = c1534g4;
                                                if (strM2168P.startsWith("#EXT-X-PART")) {
                                                    String hexString = strM3846j == null ? null : strM3845i2 != null ? strM3845i2 : Long.toHexString(j7);
                                                    String strM3846j6 = m3846j(strM2168P, pattern2, map);
                                                    long j20 = (long) (Double.parseDouble(m3846j(strM2168P, f7025t, Collections.EMPTY_MAP)) * 1000000.0d);
                                                    boolean zM3842f3 = m3842f(strM2168P, f7008c0) | (z4 && arrayList2.isEmpty());
                                                    boolean zM3842f4 = m3842f(strM2168P, f7009d0);
                                                    String strM3845i6 = m3845i(strM2168P, pattern, null, map);
                                                    if (strM3845i6 != null) {
                                                        int i18 = AbstractC0632A.f2454a;
                                                        String[] strArrSplit3 = strM3845i6.split("@", -1);
                                                        long j21 = Long.parseLong(strArrSplit3[0]);
                                                        if (strArrSplit3.length > 1) {
                                                            j10 = Long.parseLong(strArrSplit3[1]);
                                                        }
                                                        j3 = j21;
                                                    } else {
                                                        j3 = -1;
                                                    }
                                                    long j22 = j3 == -1 ? 0L : j10;
                                                    if (c0579k3 != null || treeMap.isEmpty()) {
                                                        c0579kM3838b2 = c0579k5;
                                                    } else {
                                                        C0578j[] c0578jArr = (C0578j[]) treeMap.values().toArray(new C0578j[0]);
                                                        C0579k c0579k6 = new C0579k(str2, true, c0578jArr);
                                                        if (c0579k5 == null) {
                                                            c0579kM3838b2 = m3838b(str2, c0578jArr);
                                                            c0579k3 = c0579k6;
                                                        } else {
                                                            c0579k3 = c0579k6;
                                                            c0579kM3838b2 = c0579k5;
                                                        }
                                                    }
                                                    long j23 = j6;
                                                    C0579k c0579k7 = c0579k3;
                                                    arrayList2.add(new C1532e(strM3846j6, c1534g7, j20, i7, j23, c0579k7, strM3846j, hexString, j22, j3, zM3842f4, zM3842f3, false));
                                                    j6 = j23 + j20;
                                                    if (j3 != -1) {
                                                        j22 += j3;
                                                    }
                                                    j10 = j22;
                                                    c1540m2 = c1540m;
                                                    c0579k4 = c0579kM3838b2;
                                                    str2 = str2;
                                                    c1534g4 = c1534g7;
                                                    c0579k3 = c0579k7;
                                                    zM3842f = zM3842f;
                                                    strM3845i2 = strM3845i2;
                                                    arrayList4 = arrayList4;
                                                    c1536i = c1536i;
                                                    c = 0;
                                                    c1537j = c1537j;
                                                } else {
                                                    c0579k = c0579k5;
                                                    c1534g = c1534g7;
                                                    if (!strM2168P.startsWith("#")) {
                                                        String hexString2 = strM3846j == null ? null : strM3845i2 != null ? strM3845i2 : Long.toHexString(j7);
                                                        long j24 = j7 + 1;
                                                        String strM3847k = m3847k(strM2168P, map);
                                                        C1534g c1534g8 = (C1534g) map2.get(strM3847k);
                                                        if (j11 == -1) {
                                                            c1534g2 = c1534g8;
                                                            j8 = 0;
                                                        } else {
                                                            if (z7 && c1534g == null && c1534g8 == null) {
                                                                c1534g8 = new C1534g(strM3847k, 0L, j8, null, null);
                                                                map2.put(strM3847k, c1534g8);
                                                            }
                                                            c1534g2 = c1534g8;
                                                        }
                                                        if (c0579k3 != null || treeMap.isEmpty()) {
                                                            j7 = j24;
                                                        } else {
                                                            j7 = j24;
                                                            C0578j[] c0578jArr2 = (C0578j[]) treeMap.values().toArray(new C0578j[0]);
                                                            C0579k c0579k8 = new C0579k(str2, true, c0578jArr2);
                                                            if (c0579k == null) {
                                                                c0579kM3838b = m3838b(str2, c0578jArr2);
                                                                c0579k3 = c0579k8;
                                                            } else {
                                                                c0579k3 = c0579k8;
                                                            }
                                                            if (c1534g != null) {
                                                                c1534g3 = c1534g;
                                                            } else {
                                                                c1534g3 = c1534g2;
                                                            }
                                                            C0579k c0579k9 = c0579k3;
                                                            C1534g c1534g9 = new C1534g(strM3847k, c1534g3, strM3845i, jLongValue, i7, j9, c0579k9, strM3846j, hexString2, j8, j11, z8, arrayList2);
                                                            i7 = i7;
                                                            arrayList.add(c1534g9);
                                                            j6 = j9 + jLongValue;
                                                            arrayList2 = new ArrayList();
                                                            if (j11 != -1) {
                                                                j8 += j11;
                                                            } else {
                                                                j8 = j8;
                                                            }
                                                            c0579k4 = c0579kM3838b;
                                                            c1534g4 = c1534g;
                                                            strM3845i = "";
                                                            j11 = -1;
                                                            j9 = j6;
                                                            c0579k3 = c0579k9;
                                                            strM3846j = strM3846j;
                                                            jLongValue = 0;
                                                            c = 0;
                                                            z8 = false;
                                                        }
                                                        c0579kM3838b = c0579k;
                                                        if (c1534g != null) {
                                                            c1534g3 = c1534g;
                                                        } else {
                                                            c1534g3 = c1534g2;
                                                        }
                                                        C0579k c0579k10 = c0579k3;
                                                        C1534g c1534g10 = new C1534g(strM3847k, c1534g3, strM3845i, jLongValue, i7, j9, c0579k10, strM3846j, hexString2, j8, j11, z8, arrayList2);
                                                        i7 = i7;
                                                        arrayList.add(c1534g10);
                                                        j6 = j9 + jLongValue;
                                                        arrayList2 = new ArrayList();
                                                        if (j11 != -1) {
                                                            j8 += j11;
                                                        } else {
                                                            j8 = j8;
                                                        }
                                                        c0579k4 = c0579kM3838b;
                                                        c1534g4 = c1534g;
                                                        strM3845i = "";
                                                        j11 = -1;
                                                        j9 = j6;
                                                        c0579k3 = c0579k10;
                                                        strM3846j = strM3846j;
                                                        jLongValue = 0;
                                                        c = 0;
                                                        z8 = false;
                                                    }
                                                }
                                            } else if (c1532e == null && "PART".equals(m3846j(strM2168P, f6999T, map))) {
                                                C0579k c0579kM3838b3 = c0579k4;
                                                C1534g c1534g11 = c1534g4;
                                                String strM3846j7 = m3846j(strM2168P, pattern2, map);
                                                long jM3844h2 = m3844h(strM2168P, f6991L);
                                                long jM3844h3 = m3844h(strM2168P, f6992M);
                                                String hexString3 = strM3846j == null ? null : strM3845i2 != null ? strM3845i2 : Long.toHexString(j7);
                                                if (c0579k3 != null || treeMap.isEmpty()) {
                                                    c0579k2 = c0579k3;
                                                } else {
                                                    C0578j[] c0578jArr3 = (C0578j[]) treeMap.values().toArray(new C0578j[0]);
                                                    C0579k c0579k11 = new C0579k(str2, true, c0578jArr3);
                                                    if (c0579kM3838b3 == null) {
                                                        c0579kM3838b3 = m3838b(str2, c0578jArr3);
                                                    }
                                                    c0579k2 = c0579k11;
                                                }
                                                if (jM3844h2 == -1 || jM3844h3 != -1) {
                                                    long j25 = j6;
                                                    j6 = j25;
                                                    c1532e = new C1532e(strM3846j7, c1534g11, 0L, i7, j25, c0579k2, strM3846j, hexString3, jM3844h2 != -1 ? jM3844h2 : 0L, jM3844h3, false, false, true);
                                                }
                                                c1534g4 = c1534g11;
                                                c0579k3 = c0579k2;
                                                c = 0;
                                                c0579k4 = c0579kM3838b3;
                                            }
                                            c1540m2 = c1540m;
                                        }
                                        c1534g = c1534g4;
                                        c0579k = c0579k4;
                                    }
                                    c1540m2 = c1540m;
                                    c1537j = c1537j;
                                    str2 = str2;
                                }
                            }
                            c1540m2 = c1540m;
                            c1537j = c1537j;
                            str2 = str2;
                            c1534g4 = c1534g;
                            c0579k4 = c0579k;
                            j9 = j9;
                            strM3846j = strM3846j;
                            j11 = j11;
                            z8 = z8;
                            zM3842f = zM3842f;
                            strM3845i2 = strM3845i2;
                            arrayList4 = arrayList4;
                            c1536i = c1536i;
                            c = 0;
                        }
                        strM3845i2 = strM3845i2;
                        arrayList4 = arrayList4;
                        c1536i = c1536i;
                    }
                }
            }
        }
        boolean z9 = zM3842f;
        ArrayList arrayList6 = arrayList4;
        C1536i c1536i2 = c1536i;
        C0579k c0579k12 = c0579k4;
        HashMap map3 = new HashMap();
        for (int i19 = 0; i19 < arrayList3.size(); i19++) {
            C1533f c1533f = (C1533f) arrayList3.get(i19);
            long size = c1533f.f6920b;
            if (size == -1) {
                size = (j13 + ((long) arrayList.size())) - (arrayList2.isEmpty() ? 1L : 0L);
            }
            int size2 = c1533f.f6921c;
            if (size2 == -1 && j5 != -9223372036854775807L) {
                size2 = (arrayList2.isEmpty() ? ((C1534g) AbstractC1723q.m4158g(arrayList)).f6923s : arrayList2).size() - 1;
            }
            Uri uri = c1533f.f6919a;
            map3.put(uri, new C1533f(uri, size, size2));
        }
        if (c1532e != null) {
            arrayList2.add(c1532e);
        }
        return new C1537j(i6, str, arrayList6, j4, z9, jM1571L, z6, i8, j13, i9, j12, j5, z4, z5, jM1571L != 0, c0579k12, arrayList, arrayList2, c1536i2, map3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:111:0x0369  */
    /* JADX WARN: Code duplicated, block: B:202:0x020b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0167  */
    /* JADX WARN: Code duplicated, block: B:54:0x016e  */
    /* JADX WARN: Code duplicated, block: B:57:0x018b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0196  */
    /* JADX WARN: Code duplicated, block: B:61:0x019c  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX INFO: renamed from: e */
    public static C1540m m3841e(C0858A c0858a, String str) throws IOException {
        ?? r10;
        Pattern pattern;
        int i3;
        ArrayList arrayList;
        C1539l c1539l;
        String strM1355c;
        int i4;
        String str2;
        C1539l c1539l2;
        String strM1355c2;
        C1539l c1539l3;
        int i5;
        ArrayList arrayList2;
        int i6;
        int i7;
        String strM3845i;
        float f;
        Uri uriM1645w;
        Uri uri;
        ArrayList arrayList3;
        String str3 = str;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        boolean z3 = false;
        boolean zContains = false;
        while (true) {
            boolean zM2165M = c0858a.m2165M();
            Pattern pattern2 = f6996Q;
            Pattern pattern3 = f7001V;
            if (!zM2165M) {
                ArrayList arrayList12 = arrayList5;
                ArrayList arrayList13 = arrayList6;
                ArrayList arrayList14 = arrayList7;
                boolean z4 = z3;
                ArrayList arrayList15 = arrayList10;
                ArrayList arrayList16 = arrayList11;
                ArrayList arrayList17 = new ArrayList();
                HashSet hashSet = new HashSet();
                for (int i8 = 0; i8 < arrayList4.size(); i8++) {
                    C1539l c1539l4 = (C1539l) arrayList4.get(i8);
                    if (hashSet.add(c1539l4.f6962a)) {
                        C0583o c0583o = c1539l4.f6963b;
                        AbstractC0646n.m1630h(c0583o.f2152l == null);
                        ArrayList arrayList18 = (ArrayList) map.get(c1539l4.f6962a);
                        arrayList18.getClass();
                        C0544G c0544g = new C0544G(new C1514s(null, null, arrayList18));
                        C0582n c0582nM1447a = c0583o.m1447a();
                        c0582nM1447a.f2112k = c0544g;
                        arrayList17.add(new C1539l(c1539l4.f6962a, new C0583o(c0582nM1447a), c1539l4.f6964c, c1539l4.f6965d, c1539l4.f6966e, c1539l4.f6967f));
                    }
                }
                int i9 = 0;
                C0583o c0583o2 = null;
                List arrayList19 = null;
                while (i9 < arrayList9.size()) {
                    String str4 = (String) arrayList9.get(i9);
                    String strM3846j = m3846j(str4, f7002W, map2);
                    String strM3846j2 = m3846j(str4, pattern3, map2);
                    C0582n c0582n = new C0582n();
                    c0582n.f2102a = strM3846j + ":" + strM3846j2;
                    c0582n.f2103b = strM3846j2;
                    c0582n.f2113l = AbstractC0545H.m1364l("application/x-mpegURL");
                    boolean zM3842f = m3842f(str4, f7006a0);
                    if (m3842f(str4, f7007b0)) {
                        r10 = zM3842f;
                        r10 = (zM3842f ? 1 : 0) | 2;
                    }
                    r10 = zM3842f;
                    int i10 = r10;
                    if (m3842f(str4, f7005Z)) {
                        i10 = (r10 == true ? 1 : 0) | 4;
                    }
                    c0582n.f2106e = i10;
                    String strM3845i2 = m3845i(str4, f7003X, null, map2);
                    if (TextUtils.isEmpty(strM3845i2)) {
                        pattern = pattern3;
                        i3 = 0;
                    } else {
                        int i11 = AbstractC0632A.f2454a;
                        pattern = pattern3;
                        String[] strArrSplit = strM3845i2.split(",", -1);
                        i3 = AbstractC0632A.m1592k(strArrSplit, "public.accessibility.describes-video") ? 512 : 0;
                        if (AbstractC0632A.m1592k(strArrSplit, "public.accessibility.transcribes-spoken-dialog")) {
                            i3 |= 4096;
                        }
                        if (AbstractC0632A.m1592k(strArrSplit, "public.accessibility.describes-music-and-sound")) {
                            i3 |= 1024;
                        }
                        if (AbstractC0632A.m1592k(strArrSplit, "public.easy-to-read")) {
                            i3 |= 8192;
                        }
                    }
                    c0582n.f2107f = i3;
                    c0582n.f2105d = m3845i(str4, f7000U, null, map2);
                    String strM3845i3 = m3845i(str4, pattern2, null, map2);
                    Uri uriM1645w2 = strM3845i3 == null ? null : AbstractC0646n.m1645w(str3, strM3845i3);
                    int i12 = i9;
                    C0544G c0544g2 = new C0544G(new C1514s(strM3846j, strM3846j2, Collections.EMPTY_LIST));
                    switch (m3846j(str4, f6998S, map2)) {
                        case "SUBTITLES":
                            arrayList = arrayList13;
                            int i13 = 0;
                            while (true) {
                                if (i13 < arrayList4.size()) {
                                    c1539l = (C1539l) arrayList4.get(i13);
                                    if (!strM3846j.equals(c1539l.f6966e)) {
                                        i13++;
                                    }
                                } else {
                                    c1539l = null;
                                }
                            }
                            if (c1539l != null) {
                                String strM1601t = AbstractC0632A.m1601t(3, c1539l.f6963b.f2151k);
                                c0582n.f2111j = strM1601t;
                                strM1355c = AbstractC0545H.m1355c(strM1601t);
                            } else {
                                strM1355c = null;
                            }
                            if (strM1355c == null) {
                                strM1355c = "text/vtt";
                            }
                            c0582n.f2114m = AbstractC0545H.m1364l(strM1355c);
                            c0582n.f2112k = c0544g2;
                            if (uriM1645w2 != null) {
                                C1538k c1538k = new C1538k(uriM1645w2, new C0583o(c0582n), strM3846j2);
                                arrayList14 = arrayList14;
                                arrayList14.add(c1538k);
                                break;
                            } else {
                                arrayList14 = arrayList14;
                                AbstractC0646n.m1647y("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            }
                            break;
                        case "CLOSED-CAPTIONS":
                            arrayList = arrayList13;
                            String strM3846j3 = m3846j(str4, f7004Y, map2);
                            if (strM3846j3.startsWith("CC")) {
                                i4 = Integer.parseInt(strM3846j3.substring(2));
                                str2 = "application/cea-608";
                            } else {
                                i4 = Integer.parseInt(strM3846j3.substring(7));
                                str2 = "application/cea-708";
                            }
                            if (arrayList19 == null) {
                                arrayList19 = new ArrayList();
                            }
                            c0582n.f2114m = AbstractC0545H.m1364l(str2);
                            c0582n.f2097G = i4;
                            arrayList19.add(new C0583o(c0582n));
                            break;
                        case "AUDIO":
                            ArrayList arrayList20 = arrayList12;
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList4.size()) {
                                    c1539l2 = (C1539l) arrayList4.get(i14);
                                    int i15 = i14;
                                    if (!strM3846j.equals(c1539l2.f6965d)) {
                                        i14 = i15 + 1;
                                    }
                                } else {
                                    c1539l2 = null;
                                }
                            }
                            if (c1539l2 != null) {
                                String strM1601t2 = AbstractC0632A.m1601t(1, c1539l2.f6963b.f2151k);
                                c0582n.f2111j = strM1601t2;
                                strM1355c2 = AbstractC0545H.m1355c(strM1601t2);
                            } else {
                                strM1355c2 = null;
                            }
                            arrayList12 = arrayList20;
                            String strM3845i4 = m3845i(str4, f7020o, null, map2);
                            if (strM3845i4 != null) {
                                int i16 = AbstractC0632A.f2454a;
                                c0582n.f2092B = Integer.parseInt(strM3845i4.split("/", 2)[0]);
                                if ("audio/eac3".equals(strM1355c2) && strM3845i4.endsWith("/JOC")) {
                                    c0582n.f2111j = "ec+3";
                                    strM1355c2 = "audio/eac3-joc";
                                }
                            }
                            c0582n.f2114m = AbstractC0545H.m1364l(strM1355c2);
                            if (uriM1645w2 == null) {
                                arrayList = arrayList13;
                                if (c1539l2 != null) {
                                    c0583o2 = new C0583o(c0582n);
                                }
                                break;
                            } else {
                                c0582n.f2112k = c0544g2;
                                arrayList = arrayList13;
                                arrayList.add(new C1538k(uriM1645w2, new C0583o(c0582n), strM3846j2));
                            }
                            break;
                        case "VIDEO":
                            int i17 = 0;
                            while (true) {
                                if (i17 < arrayList4.size()) {
                                    c1539l3 = (C1539l) arrayList4.get(i17);
                                    if (!strM3846j.equals(c1539l3.f6964c)) {
                                        i17++;
                                    }
                                } else {
                                    c1539l3 = null;
                                }
                            }
                            if (c1539l3 != null) {
                                C0583o c0583o3 = c1539l3.f6963b;
                                String strM1601t3 = AbstractC0632A.m1601t(2, c0583o3.f2151k);
                                c0582n.f2111j = strM1601t3;
                                c0582n.f2114m = AbstractC0545H.m1364l(AbstractC0545H.m1355c(strM1601t3));
                                c0582n.f2121t = c0583o3.f2161u;
                                c0582n.f2122u = c0583o3.f2162v;
                                c0582n.f2123v = c0583o3.f2163w;
                            }
                            if (uriM1645w2 != null) {
                                c0582n.f2112k = c0544g2;
                                arrayList12.add(new C1538k(uriM1645w2, new C0583o(c0582n), strM3846j2));
                                break;
                            }
                        default:
                            arrayList = arrayList13;
                            break;
                    }
                    arrayList14 = arrayList14;
                    arrayList13 = arrayList;
                    pattern3 = pattern;
                    i9 = i12 + 1;
                    str3 = str;
                }
                ArrayList arrayList21 = arrayList14;
                ArrayList arrayList22 = arrayList13;
                if (zContains) {
                    arrayList19 = Collections.EMPTY_LIST;
                }
                return new C1540m(str, arrayList16, arrayList17, arrayList12, arrayList22, arrayList21, arrayList8, c0583o2, arrayList19, z4, map2, arrayList15);
            }
            String strM2168P = c0858a.m2168P();
            if (strM2168P.startsWith("#EXT")) {
                arrayList11.add(strM2168P);
            }
            boolean zStartsWith = strM2168P.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            if (strM2168P.startsWith("#EXT-X-DEFINE")) {
                map2.put(m3846j(strM2168P, pattern3, map2), m3846j(strM2168P, f7011f0, map2));
            } else {
                if (strM2168P.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    arrayList2 = arrayList7;
                    z3 = true;
                } else if (strM2168P.startsWith("#EXT-X-MEDIA")) {
                    arrayList9.add(strM2168P);
                } else if (strM2168P.startsWith("#EXT-X-SESSION-KEY")) {
                    C0578j c0578jM3839c = m3839c(strM2168P, m3845i(strM2168P, f6994O, "identity", map2), map2);
                    if (c0578jM3839c != null) {
                        String strM3846j4 = m3846j(strM2168P, f6993N, map2);
                        arrayList10.add(new C0579k(("SAMPLE-AES-CENC".equals(strM3846j4) || "SAMPLE-AES-CTR".equals(strM3846j4)) ? "cenc" : "cbcs", true, c0578jM3839c));
                    }
                } else if (strM2168P.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                    zContains |= strM2168P.contains("CLOSED-CAPTIONS=NONE");
                    int i18 = zStartsWith ? 16384 : 0;
                    int i19 = Integer.parseInt(m3846j(strM2168P, f7019n, Collections.EMPTY_MAP));
                    Matcher matcher = f7014i.matcher(strM2168P);
                    if (matcher.find()) {
                        String strGroup = matcher.group(1);
                        strGroup.getClass();
                        i5 = Integer.parseInt(strGroup);
                    } else {
                        i5 = -1;
                    }
                    String strM3845i5 = m3845i(strM2168P, f7021p, null, map2);
                    String strM3845i6 = m3845i(strM2168P, f7022q, null, map2);
                    if (strM3845i6 != null) {
                        int i20 = AbstractC0632A.f2454a;
                        arrayList2 = arrayList7;
                        String[] strArrSplit2 = strM3845i6.split("x", -1);
                        i6 = Integer.parseInt(strArrSplit2[0]);
                        i7 = Integer.parseInt(strArrSplit2[1]);
                        if (i6 <= 0 || i7 <= 0) {
                        }
                        strM3845i = m3845i(strM2168P, f7023r, null, map2);
                        if (strM3845i != null) {
                            f = Float.parseFloat(strM3845i);
                        } else {
                            f = -1.0f;
                        }
                        String strM3845i7 = m3845i(strM2168P, f7015j, null, map2);
                        String strM3845i8 = m3845i(strM2168P, f7016k, null, map2);
                        String strM3845i9 = m3845i(strM2168P, f7017l, null, map2);
                        String strM3845i10 = m3845i(strM2168P, f7018m, null, map2);
                        if (zStartsWith) {
                            uriM1645w = AbstractC0646n.m1645w(str3, m3846j(strM2168P, pattern2, map2));
                        } else {
                            if (c0858a.m2165M()) {
                                throw C0546I.m1366b("#EXT-X-STREAM-INF must be followed by another line");
                            }
                            uriM1645w = AbstractC0646n.m1645w(str3, m3847k(c0858a.m2168P(), map2));
                        }
                        uri = uriM1645w;
                        C0582n c0582n2 = new C0582n();
                        c0582n2.f2102a = Integer.toString(arrayList4.size());
                        c0582n2.f2113l = AbstractC0545H.m1364l("application/x-mpegURL");
                        c0582n2.f2111j = strM3845i5;
                        c0582n2.f2109h = i5;
                        c0582n2.f2110i = i19;
                        c0582n2.f2121t = i6;
                        c0582n2.f2122u = i7;
                        c0582n2.f2123v = f;
                        c0582n2.f2107f = i18;
                        arrayList4.add(new C1539l(uri, new C0583o(c0582n2), strM3845i7, strM3845i8, strM3845i9, strM3845i10));
                        arrayList3 = (ArrayList) map.get(uri);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            map.put(uri, arrayList3);
                        }
                        arrayList3.add(new C1513r(i5, i19, strM3845i7, strM3845i8, strM3845i9, strM3845i10));
                        z3 = z3;
                    } else {
                        arrayList2 = arrayList7;
                    }
                    i6 = -1;
                    i7 = -1;
                    strM3845i = m3845i(strM2168P, f7023r, null, map2);
                    if (strM3845i != null) {
                        f = Float.parseFloat(strM3845i);
                    } else {
                        f = -1.0f;
                    }
                    String strM3845i11 = m3845i(strM2168P, f7015j, null, map2);
                    String strM3845i12 = m3845i(strM2168P, f7016k, null, map2);
                    String strM3845i13 = m3845i(strM2168P, f7017l, null, map2);
                    String strM3845i14 = m3845i(strM2168P, f7018m, null, map2);
                    if (zStartsWith) {
                        uriM1645w = AbstractC0646n.m1645w(str3, m3846j(strM2168P, pattern2, map2));
                    } else {
                        if (c0858a.m2165M()) {
                            throw C0546I.m1366b("#EXT-X-STREAM-INF must be followed by another line");
                        }
                        uriM1645w = AbstractC0646n.m1645w(str3, m3847k(c0858a.m2168P(), map2));
                    }
                    uri = uriM1645w;
                    C0582n c0582n3 = new C0582n();
                    c0582n3.f2102a = Integer.toString(arrayList4.size());
                    c0582n3.f2113l = AbstractC0545H.m1364l("application/x-mpegURL");
                    c0582n3.f2111j = strM3845i5;
                    c0582n3.f2109h = i5;
                    c0582n3.f2110i = i19;
                    c0582n3.f2121t = i6;
                    c0582n3.f2122u = i7;
                    c0582n3.f2123v = f;
                    c0582n3.f2107f = i18;
                    arrayList4.add(new C1539l(uri, new C0583o(c0582n3), strM3845i11, strM3845i12, strM3845i13, strM3845i14));
                    arrayList3 = (ArrayList) map.get(uri);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        map.put(uri, arrayList3);
                    }
                    arrayList3.add(new C1513r(i5, i19, strM3845i11, strM3845i12, strM3845i13, strM3845i14));
                    z3 = z3;
                }
                arrayList10 = arrayList10;
                arrayList11 = arrayList11;
                arrayList7 = arrayList2;
                arrayList6 = arrayList6;
                arrayList5 = arrayList5;
            }
            arrayList2 = arrayList7;
            arrayList10 = arrayList10;
            arrayList11 = arrayList11;
            arrayList7 = arrayList2;
            arrayList6 = arrayList6;
            arrayList5 = arrayList5;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m3842f(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static double m3843g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -9.223372036854776E18d;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    /* JADX INFO: renamed from: h */
    public static long m3844h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    /* JADX INFO: renamed from: i */
    public static String m3845i(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : m3847k(str2, map);
    }

    /* JADX INFO: renamed from: j */
    public static String m3846j(String str, Pattern pattern, Map map) throws C0546I {
        String strM3845i = m3845i(str, pattern, null, map);
        if (strM3845i != null) {
            return strM3845i;
        }
        throw C0546I.m1366b("Couldn't match " + pattern.pattern() + " in " + str);
    }

    /* JADX INFO: renamed from: k */
    public static String m3847k(String str, Map map) {
        Matcher matcher = f7013h0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003f A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:31:0x0068, B:33:0x006e, B:36:0x0079, B:38:0x0081, B:43:0x0097, B:45:0x009f, B:47:0x00a7, B:49:0x00af, B:51:0x00b7, B:53:0x00bf, B:55:0x00c7, B:57:0x00cf, B:60:0x00d8, B:61:0x00dc, B:66:0x00fe, B:67:0x0104, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:70:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0048 A[Catch: all -> 0x0095, LOOP:2: B:17:0x003c->B:22:0x0048, LOOP_END, TryCatch #0 {all -> 0x0095, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:31:0x0068, B:33:0x006e, B:36:0x0079, B:38:0x0081, B:43:0x0097, B:45:0x009f, B:47:0x00a7, B:49:0x00af, B:51:0x00b7, B:53:0x00bf, B:55:0x00c7, B:57:0x00cf, B:60:0x00d8, B:61:0x00dc, B:66:0x00fe, B:67:0x0104, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:70:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:89:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0047 A[SYNTHETIC] */
    @Override // p129o0.InterfaceC2075o
    /* JADX INFO: renamed from: l */
    public final AbstractC1541n mo3378l(Uri uri, C0713j c0713j) throws C0546I {
        int i3;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c0713j));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            int i4 = bufferedReader.read();
            boolean zM1569J = false;
            if (i4 == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    i4 = bufferedReader.read();
                    while (i4 != -1) {
                        i4 = bufferedReader.read();
                    }
                    i3 = 0;
                    while (true) {
                        if (i3 < 7) {
                            while (i4 != -1) {
                                i4 = bufferedReader.read();
                            }
                            zM1569J = AbstractC0632A.m1569J(i4);
                            break;
                        }
                        if (i4 != "#EXTM3U".charAt(i3)) {
                            break;
                            break;
                        }
                        i4 = bufferedReader.read();
                        i3++;
                    }
                }
            } else {
                while (i4 != -1 && Character.isWhitespace(i4)) {
                    i4 = bufferedReader.read();
                }
                i3 = 0;
                while (true) {
                    if (i3 < 7) {
                        while (i4 != -1 && Character.isWhitespace(i4) && !AbstractC0632A.m1569J(i4)) {
                            i4 = bufferedReader.read();
                        }
                        zM1569J = AbstractC0632A.m1569J(i4);
                        break;
                    }
                    if (i4 != "#EXTM3U".charAt(i3)) {
                        break;
                    }
                    i4 = bufferedReader.read();
                    i3++;
                }
            }
            if (!zM1569J) {
                throw C0546I.m1366b("Input does not start with the #EXTM3U header.");
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    AbstractC0632A.m1588g(bufferedReader);
                    throw C0546I.m1366b("Failed to parse the playlist, could not identify any tags.");
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        arrayDeque.add(strTrim);
                        C1540m c1540mM3841e = m3841e(new C0858A(arrayDeque, bufferedReader), uri.toString());
                        AbstractC0632A.m1588g(bufferedReader);
                        return c1540mM3841e;
                    }
                    if (!strTrim.startsWith("#EXT-X-TARGETDURATION") && !strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") && !strTrim.startsWith("#EXTINF") && !strTrim.startsWith("#EXT-X-KEY") && !strTrim.startsWith("#EXT-X-BYTERANGE") && !strTrim.equals("#EXT-X-DISCONTINUITY") && !strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") && !strTrim.equals("#EXT-X-ENDLIST")) {
                        arrayDeque.add(strTrim);
                    }
                    arrayDeque.add(strTrim);
                    C1537j c1537jM3840d = m3840d(this.f7032g, this.f7033h, new C0858A(arrayDeque, bufferedReader), uri.toString());
                    AbstractC0632A.m1588g(bufferedReader);
                    return c1537jM3840d;
                }
            }
        } catch (Throwable th) {
            AbstractC0632A.m1588g(bufferedReader);
            throw th;
        }
    }
}

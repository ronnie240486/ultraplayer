package p055T;

import android.text.TextUtils;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000A.C0058r;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: T.H */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0545H {

    /* JADX INFO: renamed from: a */
    public static final ArrayList f1942a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public static final Pattern f1943b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: renamed from: a */
    public static String m1353a(String str, String str2) {
        if (str != null && str2 != null) {
            String[] strArrM1580U = AbstractC0632A.m1580U(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : strArrM1580U) {
                if (str2.equals(m1355c(str3))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static int m1354b(String str, String str2) {
        C0058r c0058rM1357e;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (c0058rM1357e = m1357e(str2)) == null) {
                    return 0;
                }
                return c0058rM1357e.m319a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m1355c(String str) {
        C0058r c0058rM1357e;
        String strM1356d = null;
        if (str != null) {
            String strM3288K = AbstractC1303m.m3288K(str.trim());
            if (strM3288K.startsWith("avc1") || strM3288K.startsWith("avc3")) {
                return "video/avc";
            }
            if (strM3288K.startsWith("hev1") || strM3288K.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (strM3288K.startsWith("dvav") || strM3288K.startsWith("dva1") || strM3288K.startsWith("dvhe") || strM3288K.startsWith("dvh1")) {
                return "video/dolby-vision";
            }
            if (strM3288K.startsWith("av01")) {
                return "video/av01";
            }
            if (strM3288K.startsWith("vp9") || strM3288K.startsWith("vp09")) {
                return "video/x-vnd.on2.vp9";
            }
            if (strM3288K.startsWith("vp8") || strM3288K.startsWith("vp08")) {
                return "video/x-vnd.on2.vp8";
            }
            if (strM3288K.startsWith("mp4a")) {
                if (strM3288K.startsWith("mp4a.") && (c0058rM1357e = m1357e(strM3288K)) != null) {
                    strM1356d = m1356d(c0058rM1357e.f82a);
                }
                return strM1356d == null ? "audio/mp4a-latm" : strM1356d;
            }
            if (strM3288K.startsWith("mha1")) {
                return "audio/mha1";
            }
            if (strM3288K.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (strM3288K.startsWith("ac-3") || strM3288K.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (strM3288K.startsWith("ec-3") || strM3288K.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (strM3288K.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (strM3288K.startsWith("ac-4") || strM3288K.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (strM3288K.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (strM3288K.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (strM3288K.startsWith("dtsh") || strM3288K.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (strM3288K.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (strM3288K.startsWith("opus")) {
                return "audio/opus";
            }
            if (strM3288K.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (strM3288K.startsWith("flac")) {
                return "audio/flac";
            }
            if (strM3288K.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (strM3288K.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (strM3288K.contains("cea708")) {
                return "application/cea-708";
            }
            if (strM3288K.contains("eia608") || strM3288K.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = f1942a;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static String m1356d(int i3) {
        if (i3 == 32) {
            return "video/mp4v-es";
        }
        if (i3 == 33) {
            return "video/avc";
        }
        if (i3 == 35) {
            return "video/hevc";
        }
        if (i3 == 64) {
            return "audio/mp4a-latm";
        }
        if (i3 == 163) {
            return "video/wvc1";
        }
        if (i3 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i3 == 221) {
            return "audio/vorbis";
        }
        if (i3 == 165) {
            return "audio/ac3";
        }
        if (i3 == 166) {
            return "audio/eac3";
        }
        switch (i3) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i3) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* JADX INFO: renamed from: e */
    public static C0058r m1357e(String str) {
        Matcher matcher = f1943b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new C0058r(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m1358f(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    /* JADX INFO: renamed from: g */
    public static int m1359g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m1360h(str)) {
            return 1;
        }
        if (m1363k(str)) {
            return 2;
        }
        if (m1362j(str)) {
            return 3;
        }
        if (m1361i(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f1942a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m1360h(String str) {
        return "audio".equals(m1358f(str));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m1361i(String str) {
        return "image".equals(m1358f(str)) || "application/x-image-uri".equals(str);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m1362j(String str) {
        return "text".equals(m1358f(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m1363k(String str) {
        return "video".equals(m1358f(str));
    }

    /* JADX INFO: renamed from: l */
    public static String m1364l(String str) {
        if (str == null) {
            return null;
        }
        String strM3288K = AbstractC1303m.m3288K(str);
        strM3288K.getClass();
        switch (strM3288K) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strM3288K;
        }
    }
}

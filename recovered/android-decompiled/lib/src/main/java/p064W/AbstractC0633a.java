package p064W;

import android.util.Pair;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p045P0.AbstractC0462h;
import p055T.C0573f;

/* JADX INFO: renamed from: W.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0633a {

    /* JADX INFO: renamed from: a */
    public static final byte[] f2468a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final String[] f2469b = {"", "A", "B", "C"};

    /* JADX INFO: renamed from: c */
    public static final Pattern f2470c = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: a */
    public static String m1608a(int i3, boolean z3, int i4, int i5, int[] iArr, int i6) {
        Object[] objArr = {f2469b[i3], Integer.valueOf(i4), Integer.valueOf(i5), Character.valueOf(z3 ? 'H' : 'L'), Integer.valueOf(i6)};
        int i7 = AbstractC0632A.f2454a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i8 = 0; i8 < length; i8++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i8])));
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    /* JADX INFO: renamed from: b */
    public static Pair m1609b(String str, String[] strArr, C0573f c0573f) {
        int i3;
        Integer num;
        if (strArr.length < 4) {
            AbstractC0462h.m1171k("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = f2470c.matcher(strArr[1]);
        if (!matcher.matches()) {
            AbstractC0462h.m1171k("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        String strGroup = matcher.group(1);
        if ("1".equals(strGroup)) {
            i3 = 1;
        } else if ("2".equals(strGroup)) {
            i3 = (c0573f == null || c0573f.f2065c != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(strGroup)) {
                AbstractC0462h.m1171k("Unknown HEVC profile string: ", strGroup, "CodecSpecificDataUtil");
                return null;
            }
            i3 = 6;
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2) {
                case "H30":
                    num = 2;
                    break;
                case "H60":
                    num = 8;
                    break;
                case "H63":
                    num = 32;
                    break;
                case "H90":
                    num = 128;
                    break;
                case "H93":
                    num = 512;
                    break;
                case "L30":
                    num = 1;
                    break;
                case "L60":
                    num = 4;
                    break;
                case "L63":
                    num = 16;
                    break;
                case "L90":
                    num = 64;
                    break;
                case "L93":
                    num = 256;
                    break;
                case "H120":
                    num = 2048;
                    break;
                case "H123":
                    num = 8192;
                    break;
                case "H150":
                    num = 32768;
                    break;
                case "H153":
                    num = 131072;
                    break;
                case "H156":
                    num = 524288;
                    break;
                case "H180":
                    num = 2097152;
                    break;
                case "H183":
                    num = 8388608;
                    break;
                case "H186":
                    num = 33554432;
                    break;
                case "L120":
                    num = 1024;
                    break;
                case "L123":
                    num = 4096;
                    break;
                case "L150":
                    num = 16384;
                    break;
                case "L153":
                    num = 65536;
                    break;
                case "L156":
                    num = 262144;
                    break;
                case "L180":
                    num = 1048576;
                    break;
                case "L183":
                    num = 4194304;
                    break;
                case "L186":
                    num = 16777216;
                    break;
                default:
                    num = null;
                    break;
            }
        } else {
            num = null;
        }
        if (num != null) {
            return new Pair(Integer.valueOf(i3), num);
        }
        AbstractC0462h.m1171k("Unknown HEVC level string: ", str2, "CodecSpecificDataUtil");
        return null;
    }
}

package p068X0;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import p055T.C0546I;
import p064W.AbstractC0632A;
import p064W.C0651s;

/* JADX INFO: renamed from: X0.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0697j {

    /* JADX INFO: renamed from: a */
    public static final Pattern f2690a = Pattern.compile("^NOTE([ \t].*)?$");

    /* JADX INFO: renamed from: a */
    public static boolean m1823a(C0651s c0651s) {
        c0651s.getClass();
        String strM1674h = c0651s.m1674h(StandardCharsets.UTF_8);
        return strM1674h != null && strM1674h.startsWith("WEBVTT");
    }

    /* JADX INFO: renamed from: b */
    public static float m1824b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* JADX INFO: renamed from: c */
    public static long m1825c(String str) {
        int i3 = AbstractC0632A.f2454a;
        String[] strArrSplit = str.split("\\.", 2);
        long j3 = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j3 = (j3 * 60) + Long.parseLong(str2);
        }
        long j4 = j3 * 1000;
        if (strArrSplit.length == 2) {
            j4 += Long.parseLong(strArrSplit[1]);
        }
        return j4 * 1000;
    }

    /* JADX INFO: renamed from: d */
    public static void m1826d(C0651s c0651s) {
        int i3 = c0651s.f2521b;
        if (m1823a(c0651s)) {
            return;
        }
        c0651s.m1665G(i3);
        throw C0546I.m1365a(null, "Expected WEBVTT. Got " + c0651s.m1674h(StandardCharsets.UTF_8));
    }
}

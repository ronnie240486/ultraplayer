package p068X0;

import java.util.regex.Pattern;
import p064W.C0651s;

/* JADX INFO: renamed from: X0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0689b {

    /* JADX INFO: renamed from: c */
    public static final Pattern f2642c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d */
    public static final Pattern f2643d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a */
    public final C0651s f2644a = new C0651s();

    /* JADX INFO: renamed from: b */
    public final StringBuilder f2645b = new StringBuilder();

    /* JADX INFO: renamed from: a */
    public static String m1811a(C0651s c0651s, StringBuilder sb) {
        boolean z3 = false;
        sb.setLength(0);
        int i3 = c0651s.f2521b;
        int i4 = c0651s.f2522c;
        while (i3 < i4 && !z3) {
            char c = (char) c0651s.f2520a[i3];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z3 = true;
            } else {
                i3++;
                sb.append(c);
            }
        }
        c0651s.m1666H(i3 - c0651s.f2521b);
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m1812b(C0651s c0651s, StringBuilder sb) {
        m1813c(c0651s);
        if (c0651s.m1667a() == 0) {
            return null;
        }
        String strM1811a = m1811a(c0651s, sb);
        if (!"".equals(strM1811a)) {
            return strM1811a;
        }
        return "" + ((char) c0651s.m1687u());
    }

    /* JADX INFO: renamed from: c */
    public static void m1813c(C0651s c0651s) {
        while (true) {
            for (boolean z3 = true; c0651s.m1667a() > 0 && z3; z3 = false) {
                int i3 = c0651s.f2521b;
                byte[] bArr = c0651s.f2520a;
                byte b3 = bArr[i3];
                char c = (char) b3;
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    c0651s.m1666H(1);
                } else {
                    int i4 = c0651s.f2522c;
                    int i5 = i3 + 2;
                    if (i5 <= i4) {
                        int i6 = i3 + 1;
                        if (b3 == 47 && bArr[i6] == 42) {
                            while (true) {
                                int i7 = i5 + 1;
                                if (i7 >= i4) {
                                    break;
                                }
                                if (((char) bArr[i5]) == '*' && ((char) bArr[i7]) == '/') {
                                    i5 += 2;
                                    i4 = i5;
                                } else {
                                    i5 = i7;
                                }
                            }
                            c0651s.m1666H(i4 - c0651s.f2521b);
                        }
                    }
                }
            }
            return;
        }
    }
}

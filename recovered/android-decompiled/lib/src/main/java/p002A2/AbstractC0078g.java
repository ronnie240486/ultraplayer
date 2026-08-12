package p002A2;

import p163x2.AbstractC2364c;

/* JADX INFO: renamed from: A2.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0078g extends AbstractC0077f {
    /* JADX INFO: renamed from: f0 */
    public static String m358f0(String str) {
        AbstractC2364c.m4954e(str, "<this>");
        AbstractC2364c.m4954e(str, "missingDelimiterValue");
        int iLastIndexOf = str.lastIndexOf(46, str.length() - 1);
        if (iLastIndexOf == -1) {
            return str;
        }
        String strSubstring = str.substring(iLastIndexOf + 1, str.length());
        AbstractC2364c.m4953d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}

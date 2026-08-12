package p064W;

import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p045P0.AbstractC0462h;

/* JADX INFO: renamed from: W.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0646n {

    /* JADX INFO: renamed from: a */
    public static final Object f2505a = new Object();

    /* JADX INFO: renamed from: a */
    public static String m1623a(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (f2505a) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        return str + "\n  " + strReplace.replace("\n", "\n  ") + '\n';
    }

    /* JADX INFO: renamed from: b */
    public static void m1624b(String str, boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m1625c(boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m1626d() throws C0639g {
        StringBuilder sb = new StringBuilder();
        boolean z3 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z3) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z3 = true;
        }
        if (z3) {
            throw new C0639g(sb.toString());
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m1627e(String str, boolean z3) throws C0639g {
        if (!z3) {
            throw new C0639g(str);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m1628f(int i3, int i4) {
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m1629g(String str, boolean z3) {
        if (!z3) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m1630h(boolean z3) {
        if (!z3) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m1631i(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m1632j(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str);
        }
    }

    /* JADX INFO: renamed from: k */
    public static FloatBuffer m1633k(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    /* JADX INFO: renamed from: l */
    public static void m1634l(String str, String str2) {
        synchronized (f2505a) {
            Log.d(str, m1623a(str2, null));
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m1635m(String str, String str2) {
        synchronized (f2505a) {
            Log.e(str, m1623a(str2, null));
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m1636n(String str, String str2, Throwable th) {
        synchronized (f2505a) {
            Log.e(str, m1623a(str2, th));
        }
    }

    /* JADX INFO: renamed from: o */
    public static String m1637o(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i3 = 0; i3 < attributeCount; i3++) {
            if (xmlPullParser.getAttributeName(i3).equals(str)) {
                return xmlPullParser.getAttributeValue(i3);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static int[] m1638p(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i3 = iIndexOf5 + 2;
        if (i3 < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i3) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    /* JADX INFO: renamed from: q */
    public static void m1639q(String str, String str2) {
        synchronized (f2505a) {
            Log.i(str, m1623a(str2, null));
        }
    }

    /* JADX INFO: renamed from: r */
    public static boolean m1640r(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m1641s(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    /* JADX INFO: renamed from: t */
    public static void m1642t(MediaFormat mediaFormat, String str, int i3) {
        if (i3 != -1) {
            mediaFormat.setInteger(str, i3);
        }
    }

    /* JADX INFO: renamed from: u */
    public static String m1643u(StringBuilder sb, int i3, int i4) {
        int i5;
        int iLastIndexOf;
        if (i3 >= i4) {
            return sb.toString();
        }
        if (sb.charAt(i3) == '/') {
            i3++;
        }
        int i6 = i3;
        int i7 = i6;
        while (i6 <= i4) {
            if (i6 == i4) {
                i5 = i6;
            } else if (sb.charAt(i6) == '/') {
                i5 = i6 + 1;
            } else {
                i6++;
            }
            int i8 = i7 + 1;
            if (i6 == i8 && sb.charAt(i7) == '.') {
                sb.delete(i7, i5);
                i4 -= i5 - i7;
            } else {
                if (i6 == i7 + 2 && sb.charAt(i7) == '.' && sb.charAt(i8) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i7 - 2) + 1;
                    int i9 = iLastIndexOf > i3 ? iLastIndexOf : i3;
                    sb.delete(i9, i5);
                    i4 -= i5 - i9;
                } else {
                    iLastIndexOf = i6 + 1;
                }
                i7 = iLastIndexOf;
            }
            i6 = i7;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: v */
    public static String m1644v(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrM1638p = m1638p(str2);
        if (iArrM1638p[0] != -1) {
            sb.append(str2);
            m1643u(sb, iArrM1638p[1], iArrM1638p[2]);
            return sb.toString();
        }
        int[] iArrM1638p2 = m1638p(str);
        if (iArrM1638p[3] == 0) {
            sb.append((CharSequence) str, 0, iArrM1638p2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrM1638p[2] == 0) {
            sb.append((CharSequence) str, 0, iArrM1638p2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i3 = iArrM1638p[1];
        if (i3 != 0) {
            int i4 = iArrM1638p2[0] + 1;
            sb.append((CharSequence) str, 0, i4);
            sb.append(str2);
            return m1643u(sb, iArrM1638p[1] + i4, i4 + iArrM1638p[2]);
        }
        if (str2.charAt(i3) == '/') {
            sb.append((CharSequence) str, 0, iArrM1638p2[1]);
            sb.append(str2);
            int i5 = iArrM1638p2[1];
            return m1643u(sb, i5, iArrM1638p[2] + i5);
        }
        int i6 = iArrM1638p2[0] + 2;
        int i7 = iArrM1638p2[1];
        if (i6 >= i7 || i7 != iArrM1638p2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrM1638p2[2] - 1);
            int i8 = iLastIndexOf == -1 ? iArrM1638p2[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i8);
            sb.append(str2);
            return m1643u(sb, iArrM1638p2[1], i8 + iArrM1638p[2]);
        }
        sb.append((CharSequence) str, 0, i7);
        sb.append('/');
        sb.append(str2);
        int i9 = iArrM1638p2[1];
        return m1643u(sb, i9, iArrM1638p[2] + i9 + 1);
    }

    /* JADX INFO: renamed from: w */
    public static Uri m1645w(String str, String str2) {
        return Uri.parse(m1644v(str, str2));
    }

    /* JADX INFO: renamed from: x */
    public static void m1646x(MediaFormat mediaFormat, List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            mediaFormat.setByteBuffer(AbstractC0462h.m1165e(i3, "csd-"), ByteBuffer.wrap((byte[]) list.get(i3)));
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m1647y(String str, String str2) {
        synchronized (f2505a) {
            Log.w(str, m1623a(str2, null));
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m1648z(String str, String str2, Throwable th) {
        synchronized (f2505a) {
            Log.w(str, m1623a(str2, th));
        }
    }
}

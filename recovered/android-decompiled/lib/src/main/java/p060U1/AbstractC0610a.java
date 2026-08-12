package p060U1;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.widget.EdgeEffect;
import androidx.lifecycle.C0983H;
import com.google.android.gms.internal.cast.AbstractC1179G1;
import com.google.android.gms.internal.cast.C1155A1;
import com.google.android.gms.internal.cast.C1175F1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000A.AbstractC0029c;
import p000A.C0058r;
import p000A.InterfaceC0028b0;
import p014F.AbstractC0156e;
import p014F.AbstractC0157f;
import p045P0.AbstractC0462h;
import p045P0.C0455a;
import p045P0.C0464j;
import p045P0.InterfaceC0458d;
import p053S0.C0536b;
import p061V.C0613a;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.InterfaceC0636d;
import p066W1.AbstractC0664e;
import p070Y.C0713j;
import p070Y.C0714k;
import p070Y.C0715l;
import p070Y.C0725v;
import p070Y.C0729z;
import p070Y.InterfaceC0711h;
import p077a0.C0792C;
import p082b0.C1064e;
import p082b0.C1069j;
import p082b0.C1071l;
import p088d0.C1399w;
import p109i2.AbstractC1754b;
import p113k.AbstractC1857e1;
import p113k.C1817M0;
import p113k.ViewOnLongClickListenerC1863g1;
import p125n0.InterfaceC2042s;
import p136q.AbstractC2121d;
import p136q.AbstractC2122e;
import p144s.AbstractC2209c;
import p144s.AbstractC2216j;
import p144s.AbstractC2220n;
import p144s.C2217k;
import p144s.C2218l;
import p148t.C2267f;
import p163x2.AbstractC2364c;
import p167y2.InterfaceC2386a;

/* JADX INFO: renamed from: U1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0610a implements InterfaceC0028b0 {

    /* JADX INFO: renamed from: a */
    public static Context f2303a;

    /* JADX INFO: renamed from: b */
    public static Boolean f2304b;

    /* JADX INFO: renamed from: c */
    public static Boolean f2305c;

    /* JADX INFO: renamed from: d */
    public static Boolean f2306d;

    /* JADX INFO: renamed from: e */
    public static Boolean f2307e;

    /* JADX INFO: renamed from: f */
    public static Boolean f2308f;

    /* JADX INFO: renamed from: g */
    public static Boolean f2309g;

    /* JADX INFO: renamed from: h */
    public static Boolean f2310h;

    /* JADX INFO: renamed from: i */
    public static Boolean f2311i;

    /* JADX INFO: renamed from: j */
    public static Boolean f2312j;

    /* JADX INFO: renamed from: k */
    public static Boolean f2313k;

    /* JADX INFO: renamed from: l */
    public static Boolean f2314l;

    /* JADX INFO: renamed from: m */
    public static Boolean f2315m;

    /* JADX INFO: renamed from: C */
    public static float m1491C(EdgeEffect edgeEffect, float f, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0157f.m617c(edgeEffect, f, f3);
        }
        AbstractC0156e.m614a(edgeEffect, f, f3);
        return f;
    }

    /* JADX INFO: renamed from: D */
    public static void m1492D(InterfaceC0458d interfaceC0458d, int i3, InterfaceC0636d interfaceC0636d) {
        long jMo163k = interfaceC0458d.mo163k(i3);
        List listMo159g = interfaceC0458d.mo159g(jMo163k);
        if (listMo159g.isEmpty()) {
            return;
        }
        if (i3 == interfaceC0458d.mo166n() - 1) {
            throw new IllegalStateException();
        }
        long jMo163k2 = interfaceC0458d.mo163k(i3 + 1) - interfaceC0458d.mo163k(i3);
        if (jMo163k2 > 0) {
            interfaceC0636d.mo545b(new C0455a(listMo159g, jMo163k, jMo163k2));
        }
    }

    /* JADX INFO: renamed from: E */
    public static C1071l m1493E(Context context, C0792C c0792c, boolean z3, String str) {
        MediaMetricsManager mediaMetricsManagerM129e = AbstractC0029c.m129e(context.getSystemService("media_metrics"));
        C1069j c1069j = mediaMetricsManagerM129e == null ? null : new C1069j(context, mediaMetricsManagerM129e.createPlaybackSession());
        if (c1069j == null) {
            AbstractC0646n.m1647y("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new C1071l(LogSessionId.LOG_SESSION_ID_NONE, str);
        }
        if (z3) {
            c0792c.getClass();
            C1064e c1064e = c0792c.f3257r;
            c1064e.getClass();
            c1064e.f4831l.m1616a(c1069j);
        }
        return new C1071l(c1069j.f4854c.getSessionId(), str);
    }

    /* JADX INFO: renamed from: F */
    public static void m1494F(C0613a c0613a) {
        c0613a.f2329k = -3.4028235E38f;
        c0613a.f2328j = Integer.MIN_VALUE;
        CharSequence charSequence = c0613a.f2319a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                c0613a.f2319a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = c0613a.f2319a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public static float m1495G(int i3, float f, int i4, int i5) {
        float f3;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i3 == 0) {
            f3 = i5;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f3 = i4;
        }
        return f * f3;
    }

    /* JADX INFO: renamed from: J */
    public static void m1496J(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1857e1.m4376a(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC1863g1 viewOnLongClickListenerC1863g1 = ViewOnLongClickListenerC1863g1.f8167q;
        if (viewOnLongClickListenerC1863g1 != null && viewOnLongClickListenerC1863g1.f8169g == view) {
            ViewOnLongClickListenerC1863g1.m4388b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC1863g1(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC1863g1 viewOnLongClickListenerC1863g2 = ViewOnLongClickListenerC1863g1.f8168r;
        if (viewOnLongClickListenerC1863g2 != null && viewOnLongClickListenerC1863g2.f8169g == view) {
            viewOnLongClickListenerC1863g2.m4389a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX INFO: renamed from: K */
    public static void m1497K(InterfaceC0458d interfaceC0458d, C0464j c0464j, InterfaceC0636d interfaceC0636d) {
        int iMo156d;
        boolean z3;
        long j3 = c0464j.f1534a;
        if (j3 == -9223372036854775807L) {
            iMo156d = 0;
        } else {
            iMo156d = interfaceC0458d.mo156d(j3);
            if (iMo156d == -1) {
                iMo156d = interfaceC0458d.mo166n();
            }
            if (iMo156d > 0 && interfaceC0458d.mo163k(iMo156d - 1) == j3) {
                iMo156d--;
            }
        }
        if (j3 == -9223372036854775807L || iMo156d >= interfaceC0458d.mo166n()) {
            z3 = false;
        } else {
            List listMo159g = interfaceC0458d.mo159g(j3);
            long jMo163k = interfaceC0458d.mo163k(iMo156d);
            if (listMo159g.isEmpty()) {
                z3 = false;
            } else {
                long j4 = c0464j.f1534a;
                if (j4 < jMo163k) {
                    interfaceC0636d.mo545b(new C0455a(listMo159g, j4, jMo163k - j4));
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
        }
        for (int i3 = iMo156d; i3 < interfaceC0458d.mo166n(); i3++) {
            m1492D(interfaceC0458d, i3, interfaceC0636d);
        }
        if (c0464j.f1535b) {
            if (z3) {
                iMo156d--;
            }
            for (int i4 = 0; i4 < iMo156d; i4++) {
                m1492D(interfaceC0458d, i4, interfaceC0636d);
            }
            if (z3) {
                interfaceC0636d.mo545b(new C0455a(interfaceC0458d.mo159g(j3), interfaceC0458d.mo163k(iMo156d), j3 - interfaceC0458d.mo163k(iMo156d)));
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m1498M(int i3, int i4) {
        String strM1745d0;
        if (i3 < 0 || i3 >= i4) {
            if (i3 < 0) {
                strM1745d0 = AbstractC0664e.m1745d0("%s (%s) must not be negative", "index", Integer.valueOf(i3));
            } else {
                if (i4 < 0) {
                    throw new IllegalArgumentException(AbstractC0462h.m1165e(i4, "negative size: "));
                }
                strM1745d0 = AbstractC0664e.m1745d0("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i3), Integer.valueOf(i4));
            }
            throw new IndexOutOfBoundsException(strM1745d0);
        }
    }

    /* JADX INFO: renamed from: O */
    public static void m1499O(int i3, int i4) {
        if (i3 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException(m1501S("index", i3, i4));
        }
    }

    /* JADX INFO: renamed from: Q */
    public static void m1500Q(int i3, int i4, int i5) {
        String strM1501S;
        if (i3 < 0 || i4 < i3 || i4 > i5) {
            if (i3 < 0 || i3 > i5) {
                strM1501S = m1501S("start index", i3, i5);
            } else {
                strM1501S = (i4 < 0 || i4 > i5) ? m1501S("end index", i4, i5) : AbstractC0664e.m1745d0("end index (%s) must not be less than start index (%s)", Integer.valueOf(i4), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strM1501S);
        }
    }

    /* JADX INFO: renamed from: S */
    public static String m1501S(String str, int i3, int i4) {
        if (i3 < 0) {
            return AbstractC0664e.m1745d0("%s (%s) must not be negative", str, Integer.valueOf(i3));
        }
        if (i4 >= 0) {
            return AbstractC0664e.m1745d0("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i3), Integer.valueOf(i4));
        }
        throw new IllegalArgumentException(AbstractC0462h.m1165e(i4, "negative size: "));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1502d(C2267f[] c2267fArr, C2267f[] c2267fArr2) {
        if (c2267fArr == null || c2267fArr2 == null || c2267fArr.length != c2267fArr2.length) {
            return false;
        }
        for (int i3 = 0; i3 < c2267fArr.length; i3++) {
            C2267f c2267f = c2267fArr[i3];
            char c = c2267f.f9703a;
            C2267f c2267f2 = c2267fArr2[i3];
            if (c != c2267f2.f9703a || c2267f.f9704b.length != c2267f2.f9704b.length) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0084 A[RETURN] */
    /* JADX INFO: renamed from: e */
    public static int m1503e(Context context, String str) {
        int iM4665a;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            int i3 = Build.VERSION.SDK_INT;
            String strM4664d = i3 >= 23 ? AbstractC2121d.m4664d(str) : null;
            if (strM4664d != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                int iM4663c = 1;
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName)) {
                    if (i3 >= 29) {
                        AppOpsManager appOpsManagerM4667c = AbstractC2122e.m4667c(context);
                        iM4665a = AbstractC2122e.m4665a(appOpsManagerM4667c, strM4664d, Binder.getCallingUid(), packageName);
                        if (iM4665a == 0) {
                            iM4665a = AbstractC2122e.m4665a(appOpsManagerM4667c, strM4664d, iMyUid, AbstractC2122e.m4666b(context));
                        }
                    } else if (i3 >= 23) {
                        iM4663c = AbstractC2121d.m4663c((AppOpsManager) AbstractC2121d.m4661a(context, AppOpsManager.class), strM4664d, packageName);
                    }
                    if (iM4665a == 0) {
                        return -2;
                    }
                } else if (i3 >= 23) {
                    iM4663c = AbstractC2121d.m4663c((AppOpsManager) AbstractC2121d.m4661a(context, AppOpsManager.class), strM4664d, packageName);
                }
                iM4665a = iM4663c;
                if (iM4665a == 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static void m1504f(InterfaceC0711h interfaceC0711h) {
        if (interfaceC0711h != null) {
            try {
                interfaceC0711h.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static float[] m1505g(float[] fArr, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i3, length);
        float[] fArr2 = new float[i3];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX INFO: renamed from: h */
    public static C0058r m1506h(InterfaceC2042s interfaceC2042s) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = interfaceC2042s.length();
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (interfaceC2042s.mo4427f(i4, jElapsedRealtime)) {
                i3++;
            }
        }
        return new C0058r(length, i3);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    /* JADX WARN: Code duplicated, block: B:41:0x0093  */
    /* JADX WARN: Code duplicated, block: B:46:0x009e A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b3 A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d9 A[SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public static C2267f[] m1507i(String str) {
        int i3;
        String strTrim;
        float[] fArrM1505g;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i5 = 1;
        int i6 = 0;
        while (i5 < str.length()) {
            while (i5 < str.length()) {
                char cCharAt = str.charAt(i5);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i6, i5).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i4) != 'z' || strTrim.charAt(i4) == 'Z') {
                                fArrM1505g = new float[i4];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i7 = 1;
                                    int i8 = 0;
                                    while (i7 < length) {
                                        boolean z3 = false;
                                        boolean z4 = false;
                                        boolean z5 = false;
                                        boolean z6 = false;
                                        for (int i9 = i7; i9 < strTrim.length(); i9++) {
                                            char cCharAt2 = strTrim.charAt(i9);
                                            if (cCharAt2 == ' ') {
                                                z3 = false;
                                                z5 = true;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        z3 = false;
                                                        z5 = true;
                                                        break;
                                                    case '-':
                                                        if (i9 == i7 || z3) {
                                                            z3 = false;
                                                        } else {
                                                            z3 = false;
                                                            z5 = true;
                                                            z6 = true;
                                                        }
                                                        break;
                                                    case '.':
                                                        if (z4) {
                                                            z3 = false;
                                                            z5 = true;
                                                            z6 = true;
                                                        } else {
                                                            z3 = false;
                                                            z4 = true;
                                                        }
                                                        break;
                                                    default:
                                                        z3 = false;
                                                        break;
                                                }
                                            } else {
                                                z3 = true;
                                            }
                                            if (z5) {
                                                if (i7 < i9) {
                                                    fArr[i8] = Float.parseFloat(strTrim.substring(i7, i9));
                                                    i8++;
                                                }
                                                if (z6) {
                                                    i7 = i9;
                                                } else {
                                                    i7 = i9 + 1;
                                                }
                                            }
                                        }
                                        if (i7 < i9) {
                                            fArr[i8] = Float.parseFloat(strTrim.substring(i7, i9));
                                            i8++;
                                        }
                                        if (z6) {
                                            i7 = i9;
                                        } else {
                                            i7 = i9 + 1;
                                        }
                                    }
                                    fArrM1505g = m1505g(fArr, i8);
                                    i4 = 0;
                                } catch (NumberFormatException e3) {
                                    throw new RuntimeException(AbstractC0462h.m1166f("error in parsing \"", strTrim, "\""), e3);
                                }
                            }
                            arrayList.add(new C2267f(strTrim.charAt(i4), fArrM1505g));
                        }
                        i6 = i5;
                        i5++;
                        i4 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i5++;
            }
            strTrim = str.substring(i6, i5).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i4) != 'z') {
                    fArrM1505g = new float[i4];
                } else {
                    fArrM1505g = new float[i4];
                }
                arrayList.add(new C2267f(strTrim.charAt(i4), fArrM1505g));
            }
            i6 = i5;
            i5++;
            i4 = 0;
        }
        if (i5 - i6 != 1 || i6 >= str.length()) {
            i3 = 0;
        } else {
            i3 = 0;
            arrayList.add(new C2267f(str.charAt(i6), new float[0]));
        }
        return (C2267f[]) arrayList.toArray(new C2267f[i3]);
    }

    /* JADX INFO: renamed from: j */
    public static C2267f[] m1508j(C2267f[] c2267fArr) {
        C2267f[] c2267fArr2 = new C2267f[c2267fArr.length];
        for (int i3 = 0; i3 < c2267fArr.length; i3++) {
            c2267fArr2[i3] = new C2267f(c2267fArr[i3]);
        }
        return c2267fArr2;
    }

    /* JADX INFO: renamed from: k */
    public static byte[] m1509k(InterfaceC0711h interfaceC0711h, String str, byte[] bArr, Map map) throws C1399w {
        Map map2;
        List list;
        C0729z c0729z = new C0729z(interfaceC0711h);
        Map map3 = Collections.EMPTY_MAP;
        Uri uri = Uri.parse(str);
        AbstractC0646n.m1632j(uri, "The uri must be set.");
        C0715l c0715l = new C0715l(uri, 2, bArr, map, 0L, -1L, 1);
        C0715l c0715l2 = c0715l;
        int i3 = 0;
        while (true) {
            try {
                C0713j c0713j = new C0713j(c0729z, c0715l2);
                try {
                    byte[] bArrM4210b = AbstractC1754b.m4210b(c0713j);
                    AbstractC0632A.m1588g(c0713j);
                    return bArrM4210b;
                } catch (C0725v e3) {
                    try {
                        int i4 = e3.f2773j;
                        String str2 = null;
                        if ((i4 == 307 || i4 == 308) && i3 < 5 && (map2 = e3.f2774k) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                            str2 = (String) list.get(0);
                        }
                        if (str2 == null) {
                            throw e3;
                        }
                        i3++;
                        C0714k c0714kM1836a = c0715l2.m1836a();
                        Uri uri2 = Uri.parse(str2);
                        c0714kM1836a.f2727a = uri2;
                        AbstractC0646n.m1632j(uri2, "The uri must be set.");
                        C0715l c0715l3 = new C0715l(c0714kM1836a.f2727a, c0714kM1836a.f2728b, c0714kM1836a.f2729c, c0714kM1836a.f2730d, c0714kM1836a.f2731e, c0714kM1836a.f2732f, c0714kM1836a.f2733g);
                        AbstractC0632A.m1588g(c0713j);
                        c0715l2 = c0715l3;
                    } catch (Throwable th) {
                        AbstractC0632A.m1588g(c0713j);
                        throw th;
                    }
                }
            } catch (Exception e4) {
                Uri uri3 = c0729z.f2785i;
                uri3.getClass();
                throw new C1399w(c0715l, uri3, c0729z.f2783g.mo1833m(), c0729z.f2784h, e4);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static ColorStateList m1510l(Context context, int i3) {
        ColorStateList colorStateListM4793a;
        ColorStateList colorStateList;
        C2217k c2217k;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        C2218l c2218l = new C2218l(resources, theme);
        synchronized (AbstractC2220n.f9532c) {
            try {
                SparseArray sparseArray = (SparseArray) AbstractC2220n.f9531b.get(c2218l);
                colorStateListM4793a = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (c2217k = (C2217k) sparseArray.get(i3)) == null) {
                    colorStateList = null;
                } else {
                    if (c2217k.f9526b.equals(resources.getConfiguration())) {
                        if (theme != null || c2217k.f9527c != 0) {
                            if (theme == null || c2217k.f9527c != theme.hashCode()) {
                            }
                        }
                        colorStateList = c2217k.f9525a;
                    }
                    sparseArray.remove(i3);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = AbstractC2220n.f9530a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i3, typedValue, true);
        int i4 = typedValue.type;
        if (i4 < 28 || i4 > 31) {
            try {
                colorStateListM4793a = AbstractC2209c.m4793a(resources, resources.getXml(i3), theme);
            } catch (Exception e3) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e3);
            }
        }
        if (colorStateListM4793a == null) {
            return Build.VERSION.SDK_INT >= 23 ? AbstractC2216j.m4799b(resources, i3, theme) : resources.getColorStateList(i3);
        }
        AbstractC2220n.m4801a(c2218l, i3, colorStateListM4793a, theme);
        return colorStateListM4793a;
    }

    /* JADX INFO: renamed from: m */
    public static float m1511m(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0157f.m616b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: n */
    public static Drawable m1512n(Context context, int i3) {
        return C1817M0.m4317d().m4324f(context, i3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: p */
    public static final Class m1513p(InterfaceC2386a interfaceC2386a) {
        AbstractC2364c.m4954e(interfaceC2386a, "<this>");
        if (C0983H.class.isPrimitive()) {
            String name = C0983H.class.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return C0983H.class;
    }

    /* JADX INFO: renamed from: q */
    public static long m1514q(double d3) {
        if (!m1518u(d3)) {
            throw new IllegalArgumentException("not a normal value");
        }
        int exponent = Math.getExponent(d3);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d3) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m1515r(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f2314l == null) {
            f2314l = Boolean.valueOf(Build.VERSION.SDK_INT >= 26 && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        return f2314l.booleanValue();
    }

    /* JADX INFO: renamed from: s */
    public static boolean m1516s(Throwable th) {
        return AbstractC0632A.f2454a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    /* JADX INFO: renamed from: t */
    public static boolean m1517t(Throwable th) {
        return AbstractC0632A.f2454a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    /* JADX INFO: renamed from: u */
    public static boolean m1518u(double d3) {
        return Math.getExponent(d3) <= 1023;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m1519v(Resources resources) {
        boolean z3 = false;
        if (resources == null) {
            return false;
        }
        if (f2312j == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z3 = true;
            }
            f2312j = Boolean.valueOf(z3);
        }
        return f2312j.booleanValue();
    }

    /* JADX INFO: renamed from: w */
    public static boolean m1520w(Context context) {
        Resources resources = context.getResources();
        if (resources == null) {
            return false;
        }
        if (f2310h == null) {
            f2310h = Boolean.valueOf((resources.getConfiguration().screenLayout & 15) > 3 || m1519v(resources));
        }
        return f2310h.booleanValue();
    }

    /* JADX INFO: renamed from: x */
    public static boolean m1521x(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f2315m == null) {
            f2315m = Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.tv") || packageManager.hasSystemFeature("android.hardware.type.television") || packageManager.hasSystemFeature("android.software.leanback"));
        }
        return f2315m.booleanValue();
    }

    /* JADX INFO: renamed from: y */
    public static boolean m1522y(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f2305c == null) {
            f2305c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (f2305c.booleanValue() && Build.VERSION.SDK_INT < 24) {
            return true;
        }
        if (f2306d == null) {
            f2306d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (f2306d.booleanValue()) {
            return !AbstractC0664e.m1720C() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public static String m1523z(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i3 = 0;
        for (int i4 = 0; i4 < objArr.length; i4++) {
            Object obj = objArr[i4];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e3) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e3);
                    string = "<" + str2 + " threw " + e3.getClass().getName() + ">";
                }
            }
            objArr[i4] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i5 = 0;
        while (i3 < objArr.length && (iIndexOf = str.indexOf("%s", i5)) != -1) {
            sb.append((CharSequence) str, i5, iIndexOf);
            sb.append(objArr[i3]);
            i5 = iIndexOf + 2;
            i3++;
        }
        sb.append((CharSequence) str, i5, str.length());
        if (i3 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i3]);
            for (int i6 = i3 + 1; i6 < objArr.length; i6++) {
                sb.append(", ");
                sb.append(objArr[i6]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo1524A(Throwable th);

    /* JADX INFO: renamed from: B */
    public abstract void mo1525B(C0536b c0536b);

    /* JADX INFO: renamed from: H */
    public abstract void mo819H(boolean z3);

    /* JADX INFO: renamed from: I */
    public abstract void mo820I(boolean z3);

    /* JADX INFO: renamed from: L */
    public abstract C1155A1 mo1526L(AbstractC1179G1 abstractC1179G1);

    /* JADX INFO: renamed from: N */
    public abstract C1175F1 mo1527N(AbstractC1179G1 abstractC1179G1);

    /* JADX INFO: renamed from: P */
    public abstract void mo1528P(C1175F1 c1175f1, C1175F1 c1175f2);

    /* JADX INFO: renamed from: R */
    public abstract void mo1529R(C1175F1 c1175f1, Thread thread);

    /* JADX INFO: renamed from: T */
    public abstract boolean mo1530T(AbstractC1179G1 abstractC1179G1, Object obj, Object obj2);

    /* JADX INFO: renamed from: U */
    public abstract boolean mo1531U(AbstractC1179G1 abstractC1179G1, C1175F1 c1175f1, C1175F1 c1175f2);

    /* JADX INFO: renamed from: o */
    public abstract InputFilter[] mo822o(InputFilter[] inputFilterArr);

    @Override // p000A.InterfaceC0028b0
    /* JADX INFO: renamed from: b */
    public void mo119b() {
    }

    @Override // p000A.InterfaceC0028b0
    /* JADX INFO: renamed from: c */
    public void mo120c() {
    }
}

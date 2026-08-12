package p045P0;

import com.google.android.gms.internal.cast.C1254Z1;
import java.util.HashMap;
import p011E.C0111d;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p105h2.AbstractC1676G;
import p105h2.C1673D;

/* JADX INFO: renamed from: P0.h */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0462h {
    /* JADX INFO: renamed from: a */
    public static C0456b m1161a(InterfaceC0465k interfaceC0465k, byte[] bArr, int i3) {
        C1673D c1673dM4116m = AbstractC1676G.m4116m();
        interfaceC0465k.mo520h(bArr, 0, i3, C0464j.f1533c, new C0111d(1, c1673dM4116m));
        return new C0456b(c1673dM4116m.m4112f());
    }

    /* JADX INFO: renamed from: b */
    public static int m1162b(int i3, int i4, int i5, int i6) {
        return i3 | i4 | i5 | 128 | i6;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1163c(int i3, boolean z3) {
        int i4 = i3 & 7;
        if (i4 != 4) {
            return z3 && i4 == 3;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static int m1164d(int i3, int i4, int i5) {
        return C1254Z1.m3222M(i3) + i4 + i5;
    }

    /* JADX INFO: renamed from: e */
    public static String m1165e(int i3, String str) {
        return str + i3;
    }

    /* JADX INFO: renamed from: f */
    public static String m1166f(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: g */
    public static void m1167g(int i3, int i4, int i5, int i6, int i7) {
        AbstractC0632A.m1566G(i3);
        AbstractC0632A.m1566G(i4);
        AbstractC0632A.m1566G(i5);
        AbstractC0632A.m1566G(i6);
        AbstractC0632A.m1566G(i7);
    }

    /* JADX INFO: renamed from: h */
    public static void m1168h(int i3, HashMap map, String str, int i4, String str2) {
        map.put(str, Integer.valueOf(i3));
        map.put(str2, Integer.valueOf(i4));
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m1169i(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m1170j(String str, String str2, int i3) {
        AbstractC0646n.m1647y(str2, str + i3);
    }

    /* JADX INFO: renamed from: k */
    public static void m1171k(String str, String str2, String str3) {
        AbstractC0646n.m1647y(str3, str + str2);
    }
}

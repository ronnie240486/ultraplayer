package p165y0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import p038N.AbstractC0402b;
import p064W.C0651s;

/* JADX INFO: renamed from: y0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2374c extends AbstractC0402b {

    /* JADX INFO: renamed from: b */
    public long f9947b;

    /* JADX INFO: renamed from: c */
    public long[] f9948c;

    /* JADX INFO: renamed from: d */
    public long[] f9949d;

    /* JADX INFO: renamed from: b0 */
    public static Serializable m4964b0(int i3, C0651s c0651s) {
        if (i3 == 0) {
            return Double.valueOf(Double.longBitsToDouble(c0651s.m1681o()));
        }
        if (i3 == 1) {
            return Boolean.valueOf(c0651s.m1687u() == 1);
        }
        if (i3 == 2) {
            return m4966d0(c0651s);
        }
        if (i3 != 3) {
            if (i3 == 8) {
                return m4965c0(c0651s);
            }
            if (i3 != 10) {
                if (i3 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(c0651s.m1681o()));
                c0651s.m1666H(2);
                return date;
            }
            int iM1691y = c0651s.m1691y();
            ArrayList arrayList = new ArrayList(iM1691y);
            for (int i4 = 0; i4 < iM1691y; i4++) {
                Serializable serializableM4964b0 = m4964b0(c0651s.m1687u(), c0651s);
                if (serializableM4964b0 != null) {
                    arrayList.add(serializableM4964b0);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strM4966d0 = m4966d0(c0651s);
            int iM1687u = c0651s.m1687u();
            if (iM1687u == 9) {
                return map;
            }
            Serializable serializableM4964b1 = m4964b0(iM1687u, c0651s);
            if (serializableM4964b1 != null) {
                map.put(strM4966d0, serializableM4964b1);
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static HashMap m4965c0(C0651s c0651s) {
        int iM1691y = c0651s.m1691y();
        HashMap map = new HashMap(iM1691y);
        for (int i3 = 0; i3 < iM1691y; i3++) {
            String strM4966d0 = m4966d0(c0651s);
            Serializable serializableM4964b0 = m4964b0(c0651s.m1687u(), c0651s);
            if (serializableM4964b0 != null) {
                map.put(strM4966d0, serializableM4964b0);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: d0 */
    public static String m4966d0(C0651s c0651s) {
        int iM1659A = c0651s.m1659A();
        int i3 = c0651s.f2521b;
        c0651s.m1666H(iM1659A);
        return new String(c0651s.f2520a, i3, iM1659A);
    }
}

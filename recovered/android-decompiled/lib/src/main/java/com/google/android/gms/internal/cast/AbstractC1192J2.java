package com.google.android.gms.internal.cast;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.J2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1192J2 {

    /* JADX INFO: renamed from: a */
    public static final Class f5645a;

    /* JADX INFO: renamed from: b */
    public static final C1204M2 f5646b;

    /* JADX INFO: renamed from: c */
    public static final C1204M2 f5647c;

    static {
        Class<?> cls;
        Class<?> cls2;
        C1204M2 c1204m2 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f5645a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                c1204m2 = (C1204M2) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f5646b = c1204m2;
        f5647c = new C1204M2();
    }

    /* JADX INFO: renamed from: a */
    public static void m3150a(int i3, List list, C1342v2 c1342v2, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1254Z1 c1254z1 = (C1254Z1) c1342v2.f5983g;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                int iIntValue = ((Integer) list.get(i4)).intValue();
                c1254z1.m3231H(i3 << 3);
                c1254z1.m3231H((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i4++;
            }
            return;
        }
        c1254z1.m3230G(i3, 2);
        int iM3222M = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            int iIntValue2 = ((Integer) list.get(i5)).intValue();
            iM3222M += C1254Z1.m3222M((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        c1254z1.m3231H(iM3222M);
        while (i4 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i4)).intValue();
            c1254z1.m3231H((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i4++;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m3151b(int i3, List list, C1342v2 c1342v2, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1254Z1 c1254z1 = (C1254Z1) c1342v2.f5983g;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                long jLongValue = ((Long) list.get(i4)).longValue();
                c1254z1.m3232I(i3, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i4++;
            }
            return;
        }
        c1254z1.m3230G(i3, 2);
        int iM3223N = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            long jLongValue2 = ((Long) list.get(i5)).longValue();
            iM3223N += C1254Z1.m3223N((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        c1254z1.m3231H(iM3223N);
        while (i4 < list.size()) {
            long jLongValue3 = ((Long) list.get(i4)).longValue();
            c1254z1.m3233J((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i4++;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3152c(int i3, List list, C1342v2 c1342v2, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1254Z1 c1254z1 = (C1254Z1) c1342v2.f5983g;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                int iIntValue = ((Integer) list.get(i4)).intValue();
                c1254z1.m3231H(i3 << 3);
                c1254z1.m3231H(iIntValue);
                i4++;
            }
            return;
        }
        c1254z1.m3230G(i3, 2);
        int iM3222M = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iM3222M += C1254Z1.m3222M(((Integer) list.get(i5)).intValue());
        }
        c1254z1.m3231H(iM3222M);
        while (i4 < list.size()) {
            c1254z1.m3231H(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m3153d(int i3, List list, C1342v2 c1342v2, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1254Z1 c1254z1 = (C1254Z1) c1342v2.f5983g;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c1254z1.m3232I(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        c1254z1.m3230G(i3, 2);
        int iM3223N = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iM3223N += C1254Z1.m3223N(((Long) list.get(i5)).longValue());
        }
        c1254z1.m3231H(iM3223N);
        while (i4 < list.size()) {
            c1254z1.m3233J(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m3154e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static int m3155f(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1286h2)) {
            int iM3220K = 0;
            while (i3 < size) {
                iM3220K += C1254Z1.m3220K(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return iM3220K;
        }
        C1286h2 c1286h2 = (C1286h2) list;
        int iM3220K2 = 0;
        while (i3 < size) {
            c1286h2.m3272h(i3);
            iM3220K2 += C1254Z1.m3220K(c1286h2.f5912h[i3]);
            i3++;
        }
        return iM3220K2;
    }

    /* JADX INFO: renamed from: g */
    public static int m3156g(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1254Z1.m3222M(i3 << 3) + 4) * size;
    }

    /* JADX INFO: renamed from: h */
    public static int m3157h(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1254Z1.m3222M(i3 << 3) + 8) * size;
    }

    /* JADX INFO: renamed from: i */
    public static int m3158i(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1286h2)) {
            int iM3220K = 0;
            while (i3 < size) {
                iM3220K += C1254Z1.m3220K(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return iM3220K;
        }
        C1286h2 c1286h2 = (C1286h2) list;
        int iM3220K2 = 0;
        while (i3 < size) {
            c1286h2.m3272h(i3);
            iM3220K2 += C1254Z1.m3220K(c1286h2.f5912h[i3]);
            i3++;
        }
        return iM3220K2;
    }

    /* JADX INFO: renamed from: j */
    public static int m3159j(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1334t2)) {
            int iM3223N = 0;
            while (i3 < size) {
                iM3223N += C1254Z1.m3223N(((Long) list.get(i3)).longValue());
                i3++;
            }
            return iM3223N;
        }
        C1334t2 c1334t2 = (C1334t2) list;
        int iM3223N2 = 0;
        while (i3 < size) {
            c1334t2.m3409g(i3);
            iM3223N2 += C1254Z1.m3223N(c1334t2.f5969h[i3]);
            i3++;
        }
        return iM3223N2;
    }

    /* JADX INFO: renamed from: k */
    public static int m3160k(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1286h2)) {
            int iM3222M = 0;
            while (i3 < size) {
                int iIntValue = ((Integer) list.get(i3)).intValue();
                iM3222M += C1254Z1.m3222M((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i3++;
            }
            return iM3222M;
        }
        C1286h2 c1286h2 = (C1286h2) list;
        int iM3222M2 = 0;
        while (i3 < size) {
            c1286h2.m3272h(i3);
            int i4 = c1286h2.f5912h[i3];
            iM3222M2 += C1254Z1.m3222M((i4 >> 31) ^ (i4 + i4));
            i3++;
        }
        return iM3222M2;
    }

    /* JADX INFO: renamed from: l */
    public static int m3161l(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1334t2)) {
            int iM3223N = 0;
            while (i3 < size) {
                long jLongValue = ((Long) list.get(i3)).longValue();
                iM3223N += C1254Z1.m3223N((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i3++;
            }
            return iM3223N;
        }
        C1334t2 c1334t2 = (C1334t2) list;
        int iM3223N2 = 0;
        while (i3 < size) {
            c1334t2.m3409g(i3);
            long j3 = c1334t2.f5969h[i3];
            iM3223N2 += C1254Z1.m3223N((j3 >> 63) ^ (j3 + j3));
            i3++;
        }
        return iM3223N2;
    }

    /* JADX INFO: renamed from: m */
    public static int m3162m(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1286h2)) {
            int iM3222M = 0;
            while (i3 < size) {
                iM3222M += C1254Z1.m3222M(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return iM3222M;
        }
        C1286h2 c1286h2 = (C1286h2) list;
        int iM3222M2 = 0;
        while (i3 < size) {
            c1286h2.m3272h(i3);
            iM3222M2 += C1254Z1.m3222M(c1286h2.f5912h[i3]);
            i3++;
        }
        return iM3222M2;
    }

    /* JADX INFO: renamed from: n */
    public static int m3163n(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1334t2)) {
            int iM3223N = 0;
            while (i3 < size) {
                iM3223N += C1254Z1.m3223N(((Long) list.get(i3)).longValue());
                i3++;
            }
            return iM3223N;
        }
        C1334t2 c1334t2 = (C1334t2) list;
        int iM3223N2 = 0;
        while (i3 < size) {
            c1334t2.m3409g(i3);
            iM3223N2 += C1254Z1.m3223N(c1334t2.f5969h[i3]);
            i3++;
        }
        return iM3223N2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: o */
    public static void m3164o(C1204M2 c1204m2, Object obj, Object obj2) {
        c1204m2.getClass();
        AbstractC1282g2 abstractC1282g2 = (AbstractC1282g2) obj;
        C1200L2 c1200l2 = abstractC1282g2.zzc;
        C1200L2 c1200l3 = ((AbstractC1282g2) obj2).zzc;
        C1200L2 c1200l4 = C1200L2.f5654e;
        if (!c1200l4.equals(c1200l3)) {
            if (c1200l4.equals(c1200l2)) {
                c1200l2.getClass();
                c1200l3.getClass();
                int[] iArrCopyOf = Arrays.copyOf(c1200l2.f5655a, 0);
                System.arraycopy(c1200l3.f5655a, 0, iArrCopyOf, 0, 0);
                Object[] objArrCopyOf = Arrays.copyOf(c1200l2.f5656b, 0);
                System.arraycopy(c1200l3.f5656b, 0, objArrCopyOf, 0, 0);
                c1200l2 = new C1200L2(iArrCopyOf, objArrCopyOf, true);
            } else {
                c1200l2.getClass();
                if (!c1200l3.equals(c1200l4)) {
                    if (!c1200l2.f5658d) {
                        throw new UnsupportedOperationException();
                    }
                    int[] iArr = c1200l2.f5655a;
                    int length = iArr.length;
                    System.arraycopy(c1200l3.f5655a, 0, iArr, 0, 0);
                    System.arraycopy(c1200l3.f5656b, 0, c1200l2.f5656b, 0, 0);
                }
            }
        }
        abstractC1282g2.zzc = c1200l2;
    }

    /* JADX INFO: renamed from: p */
    public static void m3165p(int i3, List list, C1342v2 c1342v2, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1254Z1 c1254z1 = (C1254Z1) c1342v2.f5983g;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                boolean zBooleanValue = ((Boolean) list.get(i4)).booleanValue();
                c1254z1.m3231H(i3 << 3);
                c1254z1.m3234y(zBooleanValue ? (byte) 1 : (byte) 0);
                i4++;
            }
            return;
        }
        c1254z1.m3230G(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Boolean) list.get(i6)).getClass();
            i5++;
        }
        c1254z1.m3231H(i5);
        while (i4 < list.size()) {
            c1254z1.m3234y(((Boolean) list.get(i4)).booleanValue() ? (byte) 1 : (byte) 0);
            i4++;
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m3166q(int i3, List list, C1342v2 c1342v2, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1254Z1 c1254z1 = (C1254Z1) c1342v2.f5983g;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c1254z1.m3227D(i3, Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
                i4++;
            }
            return;
        }
        c1254z1.m3230G(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Double) list.get(i6)).getClass();
            i5 += 8;
        }
        c1254z1.m3231H(i5);
        while (i4 < list.size()) {
            c1254z1.m3228E(Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
            i4++;
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m3167r(int i3, List list, C1342v2 c1342v2, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1254Z1 c1254z1 = (C1254Z1) c1342v2.f5983g;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                int iIntValue = ((Integer) list.get(i4)).intValue();
                c1254z1.m3231H(i3 << 3);
                if (iIntValue >= 0) {
                    c1254z1.m3231H(iIntValue);
                } else {
                    c1254z1.m3233J(iIntValue);
                }
                i4++;
            }
            return;
        }
        c1254z1.m3230G(i3, 2);
        int iM3220K = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iM3220K += C1254Z1.m3220K(((Integer) list.get(i5)).intValue());
        }
        c1254z1.m3231H(iM3220K);
        while (i4 < list.size()) {
            int iIntValue2 = ((Integer) list.get(i4)).intValue();
            if (iIntValue2 >= 0) {
                c1254z1.m3231H(iIntValue2);
            } else {
                c1254z1.m3233J(iIntValue2);
            }
            i4++;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m3168s(int i3, List list, C1342v2 c1342v2, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1254Z1 c1254z1 = (C1254Z1) c1342v2.f5983g;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c1254z1.m3225B(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c1254z1.m3230G(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Integer) list.get(i6)).getClass();
            i5 += 4;
        }
        c1254z1.m3231H(i5);
        while (i4 < list.size()) {
            c1254z1.m3226C(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m3169t(int i3, List list, C1342v2 c1342v2, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1254Z1 c1254z1 = (C1254Z1) c1342v2.f5983g;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c1254z1.m3227D(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        c1254z1.m3230G(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Long) list.get(i6)).getClass();
            i5 += 8;
        }
        c1254z1.m3231H(i5);
        while (i4 < list.size()) {
            c1254z1.m3228E(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m3170u(int i3, List list, C1342v2 c1342v2, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1254Z1 c1254z1 = (C1254Z1) c1342v2.f5983g;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c1254z1.m3225B(i3, Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
                i4++;
            }
            return;
        }
        c1254z1.m3230G(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Float) list.get(i6)).getClass();
            i5 += 4;
        }
        c1254z1.m3231H(i5);
        while (i4 < list.size()) {
            c1254z1.m3226C(Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
            i4++;
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m3171v(int i3, List list, C1342v2 c1342v2, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1254Z1 c1254z1 = (C1254Z1) c1342v2.f5983g;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                int iIntValue = ((Integer) list.get(i4)).intValue();
                c1254z1.m3231H(i3 << 3);
                if (iIntValue >= 0) {
                    c1254z1.m3231H(iIntValue);
                } else {
                    c1254z1.m3233J(iIntValue);
                }
                i4++;
            }
            return;
        }
        c1254z1.m3230G(i3, 2);
        int iM3220K = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iM3220K += C1254Z1.m3220K(((Integer) list.get(i5)).intValue());
        }
        c1254z1.m3231H(iM3220K);
        while (i4 < list.size()) {
            int iIntValue2 = ((Integer) list.get(i4)).intValue();
            if (iIntValue2 >= 0) {
                c1254z1.m3231H(iIntValue2);
            } else {
                c1254z1.m3233J(iIntValue2);
            }
            i4++;
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m3172w(int i3, List list, C1342v2 c1342v2, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1254Z1 c1254z1 = (C1254Z1) c1342v2.f5983g;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c1254z1.m3232I(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        c1254z1.m3230G(i3, 2);
        int iM3223N = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iM3223N += C1254Z1.m3223N(((Long) list.get(i5)).longValue());
        }
        c1254z1.m3231H(iM3223N);
        while (i4 < list.size()) {
            c1254z1.m3233J(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m3173x(int i3, List list, C1342v2 c1342v2, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1254Z1 c1254z1 = (C1254Z1) c1342v2.f5983g;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c1254z1.m3225B(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c1254z1.m3230G(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Integer) list.get(i6)).getClass();
            i5 += 4;
        }
        c1254z1.m3231H(i5);
        while (i4 < list.size()) {
            c1254z1.m3226C(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m3174y(int i3, List list, C1342v2 c1342v2, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1254Z1 c1254z1 = (C1254Z1) c1342v2.f5983g;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c1254z1.m3227D(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        c1254z1.m3230G(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Long) list.get(i6)).getClass();
            i5 += 8;
        }
        c1254z1.m3231H(i5);
        while (i4 < list.size()) {
            c1254z1.m3228E(((Long) list.get(i4)).longValue());
            i4++;
        }
    }
}

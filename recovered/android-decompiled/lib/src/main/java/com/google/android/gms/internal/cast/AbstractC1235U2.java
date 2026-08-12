package com.google.android.gms.internal.cast;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.U2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1235U2 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f5714a;

    /* JADX INFO: renamed from: b */
    public static final Class f5715b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC1231T2 f5716c;

    /* JADX INFO: renamed from: d */
    public static final boolean f5717d;

    /* JADX INFO: renamed from: e */
    public static final boolean f5718e;

    /* JADX INFO: renamed from: f */
    public static final long f5719f;

    /* JADX INFO: renamed from: g */
    public static final boolean f5720g;

    /* JADX WARN: Code duplicated, block: B:11:0x004b  */
    /* JADX WARN: Code duplicated, block: B:4:0x001e  */
    /* JADX WARN: Code duplicated, block: B:50:0x017e A[PHI: r0
      0x017e: PHI (r0v42 java.lang.reflect.Field) = (r0v35 java.lang.reflect.Field), (r0v37 java.lang.reflect.Field) binds: [B:43:0x016d, B:49:0x017c] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        AbstractC1231T2 c1223r2;
        Field declaredField;
        boolean z3;
        boolean z4;
        Field declaredField2;
        Field field;
        AbstractC1231T2 abstractC1231T2;
        Unsafe unsafeM3202h = m3202h();
        f5714a = unsafeM3202h;
        int i3 = AbstractC1238V1.f5721a;
        f5715b = Memory.class;
        Class<?> cls = Long.TYPE;
        boolean zM3208n = m3208n(cls);
        Class<?> cls2 = Integer.TYPE;
        boolean zM3208n2 = m3208n(cls2);
        if (unsafeM3202h == null) {
            c1223r2 = null;
        } else if (zM3208n) {
            c1223r2 = new C1227S2(unsafeM3202h);
        } else if (zM3208n2) {
            c1223r2 = new C1223R2(unsafeM3202h);
        } else {
            c1223r2 = null;
        }
        f5716c = c1223r2;
        if (c1223r2 == null) {
            z3 = false;
        } else {
            try {
                Class<?> cls3 = c1223r2.f5711a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                try {
                    declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
                } catch (Throwable unused) {
                    declaredField = null;
                }
                if (declaredField == null) {
                    try {
                        declaredField = Buffer.class.getDeclaredField("address");
                    } catch (Throwable unused2) {
                        declaredField = null;
                    }
                    if (declaredField == null || declaredField.getType() != cls) {
                        declaredField = null;
                    }
                }
                if (declaredField == null) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            } catch (Throwable th) {
                Logger.getLogger(AbstractC1235U2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        f5717d = z3;
        AbstractC1231T2 abstractC1231T3 = f5716c;
        if (abstractC1231T3 == null) {
            z4 = false;
        } else {
            try {
                Class<?> cls4 = abstractC1231T3.f5711a.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z4 = true;
            } catch (Throwable th2) {
                Logger.getLogger(AbstractC1235U2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z4 = false;
            }
        }
        f5718e = z4;
        f5719f = m3209o(byte[].class);
        m3209o(boolean[].class);
        m3195a(boolean[].class);
        m3209o(int[].class);
        m3195a(int[].class);
        m3209o(long[].class);
        m3195a(long[].class);
        m3209o(float[].class);
        m3195a(float[].class);
        m3209o(double[].class);
        m3195a(double[].class);
        m3209o(Object[].class);
        m3195a(Object[].class);
        int i4 = AbstractC1238V1.f5721a;
        try {
            declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        if (declaredField2 == null) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("address");
            } catch (Throwable unused4) {
                declaredField2 = null;
            }
            if (declaredField2 == null || declaredField2.getType() != cls) {
                field = null;
            } else {
                field = declaredField2;
            }
        } else {
            field = declaredField2;
        }
        if (field != null && (abstractC1231T2 = f5716c) != null) {
            abstractC1231T2.f5711a.objectFieldOffset(field);
        }
        f5720g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static void m3195a(Class cls) {
        if (f5718e) {
            f5716c.f5711a.arrayIndexScale(cls);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m3196b(Object obj, long j3, byte b3) {
        AbstractC1231T2 abstractC1231T2 = f5716c;
        long j4 = (-4) & j3;
        int i3 = abstractC1231T2.f5711a.getInt(obj, j4);
        int i4 = ((~((int) j3)) & 3) << 3;
        abstractC1231T2.f5711a.putInt(obj, j4, ((255 & b3) << i4) | (i3 & (~(255 << i4))));
    }

    /* JADX INFO: renamed from: c */
    public static void m3197c(Object obj, long j3, byte b3) {
        AbstractC1231T2 abstractC1231T2 = f5716c;
        long j4 = (-4) & j3;
        int i3 = (((int) j3) & 3) << 3;
        abstractC1231T2.f5711a.putInt(obj, j4, ((255 & b3) << i3) | (abstractC1231T2.f5711a.getInt(obj, j4) & (~(255 << i3))));
    }

    /* JADX INFO: renamed from: d */
    public static int m3198d(long j3, Object obj) {
        return f5716c.f5711a.getInt(obj, j3);
    }

    /* JADX INFO: renamed from: e */
    public static long m3199e(long j3, Object obj) {
        return f5716c.f5711a.getLong(obj, j3);
    }

    /* JADX INFO: renamed from: f */
    public static Object m3200f(Class cls) {
        try {
            return f5714a.allocateInstance(cls);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(e3);
        }
    }

    /* JADX INFO: renamed from: g */
    public static Object m3201g(long j3, Object obj) {
        return f5716c.f5711a.getObject(obj, j3);
    }

    /* JADX INFO: renamed from: h */
    public static Unsafe m3202h() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C1220Q2());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m3203i(int i3, long j3, Object obj) {
        f5716c.f5711a.putInt(obj, j3, i3);
    }

    /* JADX INFO: renamed from: j */
    public static void m3204j(Object obj, long j3, long j4) {
        f5716c.f5711a.putLong(obj, j3, j4);
    }

    /* JADX INFO: renamed from: k */
    public static void m3205k(long j3, Object obj, Object obj2) {
        f5716c.f5711a.putObject(obj, j3, obj2);
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ boolean m3206l(long j3, Object obj) {
        return ((byte) ((f5716c.f5711a.getInt(obj, (-4) & j3) >>> ((int) (((~j3) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ boolean m3207m(long j3, Object obj) {
        return ((byte) ((f5716c.f5711a.getInt(obj, (-4) & j3) >>> ((int) ((j3 & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static boolean m3208n(Class cls) {
        int i3 = AbstractC1238V1.f5721a;
        try {
            Class cls2 = f5715b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: o */
    public static int m3209o(Class cls) {
        if (f5718e) {
            return f5716c.f5711a.arrayBaseOffset(cls);
        }
        return -1;
    }
}

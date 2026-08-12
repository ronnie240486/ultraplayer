package com.google.android.gms.internal.cast;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p045P0.AbstractC0462h;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.g2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1282g2 extends AbstractC1230T1 {
    private static final Map zzb = new ConcurrentHashMap();
    protected C1200L2 zzc;
    private int zzd;

    public AbstractC1282g2() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = C1200L2.f5654e;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC1302l2 m3257b(InterfaceC1302l2 interfaceC1302l2) {
        int size = interfaceC1302l2.size();
        return interfaceC1302l2.mo3140f(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: renamed from: c */
    public static Object m3258c(Method method, AbstractC1230T1 abstractC1230T1, Object... objArr) {
        try {
            return method.invoke(abstractC1230T1, objArr);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e3);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m3259e(Class cls, AbstractC1282g2 abstractC1282g2) {
        abstractC1282g2.m3261d();
        zzb.put(cls, abstractC1282g2);
    }

    /* JADX INFO: renamed from: k */
    public static AbstractC1282g2 m3260k(Class cls) {
        Map map = zzb;
        AbstractC1282g2 abstractC1282g2 = (AbstractC1282g2) map.get(cls);
        if (abstractC1282g2 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1282g2 = (AbstractC1282g2) map.get(cls);
            } catch (ClassNotFoundException e3) {
                throw new IllegalStateException("Class initialization cannot fail.", e3);
            }
        }
        if (abstractC1282g2 != null) {
            return abstractC1282g2;
        }
        AbstractC1282g2 abstractC1282g3 = (AbstractC1282g2) ((AbstractC1282g2) AbstractC1235U2.m3200f(cls)).mo3096h(6, null);
        if (abstractC1282g3 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, abstractC1282g3);
        return abstractC1282g3;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1230T1
    /* JADX INFO: renamed from: a */
    public final int mo3193a(InterfaceC1188I2 interfaceC1188I2) {
        if (m3263g()) {
            int iMo3107e = interfaceC1188I2.mo3107e(this);
            if (iMo3107e >= 0) {
                return iMo3107e;
            }
            throw new IllegalStateException(AbstractC0462h.m1165e(iMo3107e, "serialized size must be non-negative, was "));
        }
        int i3 = this.zzd & Integer.MAX_VALUE;
        if (i3 != Integer.MAX_VALUE) {
            return i3;
        }
        int iMo3107e2 = interfaceC1188I2.mo3107e(this);
        if (iMo3107e2 < 0) {
            throw new IllegalStateException(AbstractC0462h.m1165e(iMo3107e2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iMo3107e2;
        return iMo3107e2;
    }

    /* JADX INFO: renamed from: d */
    public final void m3261d() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C1176F2.f5618c.m3131a(getClass()).mo3106d(this, (AbstractC1282g2) obj);
    }

    /* JADX INFO: renamed from: f */
    public final void m3262f() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m3263g() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: h */
    public abstract Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2);

    public final int hashCode() {
        if (m3263g()) {
            return C1176F2.f5618c.m3131a(getClass()).mo3105c(this);
        }
        int i3 = this.zza;
        if (i3 != 0) {
            return i3;
        }
        int iMo3105c = C1176F2.f5618c.m3131a(getClass()).mo3105c(this);
        this.zza = iMo3105c;
        return iMo3105c;
    }

    /* JADX INFO: renamed from: i */
    public final int m3264i() {
        if (m3263g()) {
            int iMo3107e = C1176F2.f5618c.m3131a(getClass()).mo3107e(this);
            if (iMo3107e >= 0) {
                return iMo3107e;
            }
            throw new IllegalStateException(AbstractC0462h.m1165e(iMo3107e, "serialized size must be non-negative, was "));
        }
        int i3 = this.zzd & Integer.MAX_VALUE;
        if (i3 != Integer.MAX_VALUE) {
            return i3;
        }
        int iMo3107e2 = C1176F2.f5618c.m3131a(getClass()).mo3107e(this);
        if (iMo3107e2 < 0) {
            throw new IllegalStateException(AbstractC0462h.m1165e(iMo3107e2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iMo3107e2;
        return iMo3107e2;
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC1278f2 m3265j() {
        return (AbstractC1278f2) mo3096h(5, null);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = AbstractC1358z2.f6005a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC1358z2.m3445c(this, sb, 0);
        return sb.toString();
    }
}

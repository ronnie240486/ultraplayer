package p148t;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: t.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2272k extends C2271j {
    @Override // p148t.C2271j
    /* JADX INFO: renamed from: j0 */
    public final Typeface mo4876j0(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f9716n, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f9722t.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // p148t.C2271j
    /* JADX INFO: renamed from: n0 */
    public final Method mo4879n0(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}

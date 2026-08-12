package androidx.fragment.app;

import java.lang.reflect.InvocationTargetException;
import p045P0.AbstractC0462h;
import p049Q1.C0513b;
import p124n.C2022i;

/* JADX INFO: renamed from: androidx.fragment.app.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0972w {

    /* JADX INFO: renamed from: b */
    public static final C2022i f4267b = new C2022i();

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0937C f4268a;

    public C0972w(AbstractC0937C abstractC0937C) {
        this.f4268a = abstractC0937C;
    }

    /* JADX INFO: renamed from: b */
    public static Class m2546b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C2022i c2022i = f4267b;
        C2022i c2022i2 = (C2022i) c2022i.getOrDefault(classLoader, null);
        if (c2022i2 == null) {
            c2022i2 = new C2022i();
            c2022i.put(classLoader, c2022i2);
        }
        Class cls = (Class) c2022i2.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c2022i2.put(str, cls2);
        return cls2;
    }

    /* JADX INFO: renamed from: c */
    public static Class m2547c(ClassLoader classLoader, String str) {
        try {
            return m2546b(classLoader, str);
        } catch (ClassCastException e3) {
            throw new C0513b(AbstractC0462h.m1166f("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e3);
        } catch (ClassNotFoundException e4) {
            throw new C0513b(AbstractC0462h.m1166f("Unable to instantiate fragment ", str, ": make sure class name exists"), e4);
        }
    }

    /* JADX INFO: renamed from: a */
    public final AbstractComponentCallbacksC0963n m2548a(String str) {
        try {
            return (AbstractComponentCallbacksC0963n) m2547c(this.f4268a.f4083t.f4249v.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e3) {
            throw new C0513b(AbstractC0462h.m1166f("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (InstantiationException e4) {
            throw new C0513b(AbstractC0462h.m1166f("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e4);
        } catch (NoSuchMethodException e5) {
            throw new C0513b(AbstractC0462h.m1166f("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e5);
        } catch (InvocationTargetException e6) {
            throw new C0513b(AbstractC0462h.m1166f("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e6);
        }
    }
}

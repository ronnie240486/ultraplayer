package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0990c {

    /* JADX INFO: renamed from: c */
    public static final C0990c f4308c = new C0990c();

    /* JADX INFO: renamed from: a */
    public final HashMap f4309a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f4310b = new HashMap();

    /* JADX INFO: renamed from: b */
    public static void m2561b(HashMap map, C0989b c0989b, EnumC0999l enumC0999l, Class cls) {
        EnumC0999l enumC0999l2 = (EnumC0999l) map.get(c0989b);
        if (enumC0999l2 == null || enumC0999l == enumC0999l2) {
            if (enumC0999l2 == null) {
                map.put(c0989b, enumC0999l);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0989b.f4307b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0999l2 + ", new value " + enumC0999l);
    }

    /* JADX INFO: renamed from: a */
    public final C0988a m2562a(Class cls, Method[] methodArr) {
        int i3;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f4309a;
        if (superclass != null) {
            C0988a c0988aM2562a = (C0988a) map2.get(superclass);
            if (c0988aM2562a == null) {
                c0988aM2562a = m2562a(superclass, null);
            }
            map.putAll(c0988aM2562a.f4305b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0988a c0988aM2562a2 = (C0988a) map2.get(cls2);
            if (c0988aM2562a2 == null) {
                c0988aM2562a2 = m2562a(cls2, null);
            }
            for (Map.Entry entry : c0988aM2562a2.f4305b.entrySet()) {
                m2561b(map, (C0989b) entry.getKey(), (EnumC0999l) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e3) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e3);
            }
        }
        boolean z3 = false;
        for (Method method : methodArr) {
            InterfaceC1012y interfaceC1012y = (InterfaceC1012y) method.getAnnotation(InterfaceC1012y.class);
            if (interfaceC1012y != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i3 = 0;
                } else {
                    if (!InterfaceC1005r.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i3 = 1;
                }
                EnumC0999l enumC0999lValue = interfaceC1012y.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0999l.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC0999lValue != EnumC0999l.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i3 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m2561b(map, new C0989b(i3, method), enumC0999lValue, cls);
                z3 = true;
            }
        }
        C0988a c0988a = new C0988a(map);
        map2.put(cls, c0988a);
        this.f4310b.put(cls, Boolean.valueOf(z3));
        return c0988a;
    }
}

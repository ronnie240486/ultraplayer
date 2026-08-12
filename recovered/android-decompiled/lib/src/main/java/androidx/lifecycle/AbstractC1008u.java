package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p163x2.AbstractC2364c;

/* JADX INFO: renamed from: androidx.lifecycle.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1008u {

    /* JADX INFO: renamed from: a */
    public static final HashMap f4330a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static final HashMap f4331b = new HashMap();

    /* JADX INFO: renamed from: a */
    public static void m2573a(Constructor constructor, InterfaceC1004q interfaceC1004q) {
        try {
            AbstractC2364c.m4953d(constructor.newInstance(interfaceC1004q), "{\n            constructo…tance(`object`)\n        }");
            throw new ClassCastException();
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m2574b(String str) {
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        int iIndexOf = str.indexOf(".", 0);
        if (iIndexOf >= 0) {
            int length = str.length();
            if (length < 0) {
                throw new OutOfMemoryError();
            }
            StringBuilder sb2 = new StringBuilder(length);
            do {
                sb2.append((CharSequence) str, i3, iIndexOf);
                sb2.append("_");
                i3 = iIndexOf + 1;
                if (iIndexOf >= str.length()) {
                    break;
                }
                iIndexOf = str.indexOf(".", i3);
            } while (iIndexOf > 0);
            sb2.append((CharSequence) str, i3, str.length());
            str = sb2.toString();
            AbstractC2364c.m4953d(str, "stringBuilder.append(this, i, length).toString()");
        }
        sb.append(str);
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0112  */
    /* JADX WARN: Code duplicated, block: B:66:0x011e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0122  */
    /* JADX WARN: Code duplicated, block: B:72:0x012e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0130  */
    /* JADX WARN: Code duplicated, block: B:77:0x0145  */
    /* JADX WARN: Code duplicated, block: B:87:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static int m2575c(Class cls) {
        Constructor declaredConstructor;
        boolean zBooleanValue;
        Class<?>[] interfaces;
        int i3;
        boolean z3;
        int i4 = 1;
        HashMap map = f4330a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r4 != null ? r4.getName() : "";
                AbstractC2364c.m4953d(name, "fullPackage");
                if (name.length() != 0) {
                    AbstractC2364c.m4953d(canonicalName, "name");
                    canonicalName = canonicalName.substring(name.length() + 1);
                    AbstractC2364c.m4953d(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                AbstractC2364c.m4953d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String strM2574b = m2574b(canonicalName);
                if (name.length() != 0) {
                    strM2574b = name + '.' + strM2574b;
                }
                declaredConstructor = Class.forName(strM2574b).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException(e3);
            }
            HashMap map2 = f4331b;
            if (declaredConstructor != null) {
                List listSingletonList = Collections.singletonList(declaredConstructor);
                AbstractC2364c.m4953d(listSingletonList, "singletonList(element)");
                map2.put(cls, listSingletonList);
            } else {
                C0990c c0990c = C0990c.f4308c;
                HashMap map3 = c0990c.f4310b;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                map3.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((InterfaceC1012y) declaredMethods[i5].getAnnotation(InterfaceC1012y.class)) != null) {
                                c0990c.m2562a(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i5++;
                        }
                    } catch (NoClassDefFoundError e4) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e4);
                    }
                }
                if (!zBooleanValue) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC1004q.class.isAssignableFrom(superclass)) {
                        AbstractC2364c.m4953d(superclass, "superclass");
                        if (m2575c(superclass) != 1) {
                            Object obj = map2.get(superclass);
                            AbstractC2364c.m4951b(obj);
                            arrayList = new ArrayList((Collection) obj);
                            interfaces = cls.getInterfaces();
                            AbstractC2364c.m4953d(interfaces, "klass.interfaces");
                            for (Class<?> cls2 : interfaces) {
                                if (cls2 == null && InterfaceC1004q.class.isAssignableFrom(cls2)) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (!z3) {
                                    AbstractC2364c.m4953d(cls2, "intrface");
                                    if (m2575c(cls2) == 1) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        Object obj2 = map2.get(cls2);
                                        AbstractC2364c.m4951b(obj2);
                                        arrayList.addAll((Collection) obj2);
                                    }
                                }
                            }
                            if (arrayList != null) {
                                map2.put(cls, arrayList);
                            }
                        }
                    } else {
                        interfaces = cls.getInterfaces();
                        AbstractC2364c.m4953d(interfaces, "klass.interfaces");
                        while (i3 < r8) {
                            if (cls2 == null) {
                                z3 = false;
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                AbstractC2364c.m4953d(cls2, "intrface");
                                if (m2575c(cls2) == 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    Object obj3 = map2.get(cls2);
                                    AbstractC2364c.m4951b(obj3);
                                    arrayList.addAll((Collection) obj3);
                                }
                            }
                        }
                        if (arrayList != null) {
                            map2.put(cls, arrayList);
                        }
                    }
                }
            }
            i4 = 2;
        }
        map.put(cls, Integer.valueOf(i4));
        return i4;
    }
}

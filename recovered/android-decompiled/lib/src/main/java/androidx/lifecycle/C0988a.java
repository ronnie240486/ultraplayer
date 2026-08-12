package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0988a {

    /* JADX INFO: renamed from: a */
    public final HashMap f4304a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f4305b;

    public C0988a(HashMap map) {
        this.f4305b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC0999l enumC0999l = (EnumC0999l) entry.getValue();
            List arrayList = (List) this.f4304a.get(enumC0999l);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f4304a.put(enumC0999l, arrayList);
            }
            arrayList.add((C0989b) entry.getKey());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2560a(List list, InterfaceC1005r interfaceC1005r, EnumC0999l enumC0999l, InterfaceC1004q interfaceC1004q) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0989b c0989b = (C0989b) list.get(size);
                c0989b.getClass();
                try {
                    int i3 = c0989b.f4306a;
                    Method method = c0989b.f4307b;
                    if (i3 == 0) {
                        method.invoke(interfaceC1004q, null);
                    } else if (i3 == 1) {
                        method.invoke(interfaceC1004q, interfaceC1005r);
                    } else if (i3 == 2) {
                        method.invoke(interfaceC1004q, interfaceC1005r, enumC0999l);
                    }
                } catch (IllegalAccessException e3) {
                    throw new RuntimeException(e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException("Failed to call observer method", e4.getCause());
                }
            }
        }
    }
}

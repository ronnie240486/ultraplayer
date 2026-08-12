package p163x2;

import androidx.lifecycle.C0983H;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000A.C0022X;
import p002A2.AbstractC0078g;
import p060U1.AbstractC0610a;
import p143r2.C2203a;
import p147s2.AbstractC2261g;
import p159w2.InterfaceC2320a;
import p159w2.InterfaceC2321b;
import p159w2.InterfaceC2322c;
import p159w2.InterfaceC2323d;
import p159w2.InterfaceC2324e;
import p159w2.InterfaceC2325f;
import p159w2.InterfaceC2326g;
import p159w2.InterfaceC2327h;
import p159w2.InterfaceC2328i;
import p159w2.InterfaceC2329j;
import p159w2.InterfaceC2330k;
import p159w2.InterfaceC2331l;
import p159w2.InterfaceC2332m;
import p159w2.InterfaceC2333n;
import p159w2.InterfaceC2334o;
import p159w2.InterfaceC2335p;
import p159w2.InterfaceC2336q;
import p159w2.InterfaceC2337r;
import p159w2.InterfaceC2338s;
import p159w2.InterfaceC2339t;
import p159w2.InterfaceC2340u;
import p159w2.InterfaceC2341v;
import p167y2.InterfaceC2386a;

/* JADX INFO: renamed from: x2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2363b implements InterfaceC2386a, InterfaceC2362a {

    /* JADX INFO: renamed from: a */
    public static final Map f9919a;

    static {
        int i3 = 0;
        List listAsList = Arrays.asList(InterfaceC2320a.class, InterfaceC2331l.class, C0022X.class, InterfaceC2335p.class, InterfaceC2336q.class, InterfaceC2337r.class, InterfaceC2338s.class, InterfaceC2339t.class, InterfaceC2340u.class, InterfaceC2341v.class, InterfaceC2321b.class, InterfaceC2322c.class, InterfaceC2323d.class, InterfaceC2324e.class, InterfaceC2325f.class, InterfaceC2326g.class, InterfaceC2327h.class, InterfaceC2328i.class, InterfaceC2329j.class, InterfaceC2330k.class, InterfaceC2332m.class, InterfaceC2333n.class, InterfaceC2334o.class);
        AbstractC2364c.m4953d(listAsList, "asList(this)");
        ArrayList arrayList = new ArrayList(listAsList.size());
        for (Object obj : listAsList) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new C2203a((Class) obj, Integer.valueOf(i3)));
            i3 = i4;
        }
        f9919a = AbstractC2261g.m4852E(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        AbstractC2364c.m4953d(collectionValues, "primitiveFqNames.values");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            AbstractC2364c.m4953d(str, "kotlinName");
            sb.append(AbstractC0078g.m358f0(str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f9919a.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2261g.m4851D(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), AbstractC0078g.m358f0((String) entry2.getValue()));
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2363b) && AbstractC0610a.m1513p(this).equals(AbstractC0610a.m1513p((InterfaceC2386a) obj));
    }

    public final int hashCode() {
        return AbstractC0610a.m1513p(this).hashCode();
    }

    public final String toString() {
        return C0983H.class.toString() + " (Kotlin reflection is not available)";
    }
}

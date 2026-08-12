package p147s2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p019G1.AbstractC0230e;
import p143r2.C2203a;
import p163x2.AbstractC2364c;

/* JADX INFO: renamed from: s2.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2261g extends AbstractC0230e {
    /* JADX INFO: renamed from: D */
    public static int m4851D(int i3) {
        if (i3 < 0) {
            return i3;
        }
        if (i3 < 3) {
            return i3 + 1;
        }
        if (i3 < 1073741824) {
            return (int) ((i3 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: E */
    public static Map m4852E(ArrayList arrayList) {
        C2259e c2259e = C2259e.f9694g;
        int size = arrayList.size();
        if (size == 0) {
            return c2259e;
        }
        if (size == 1) {
            C2203a c2203a = (C2203a) arrayList.get(0);
            AbstractC2364c.m4954e(c2203a, "pair");
            Map mapSingletonMap = Collections.singletonMap(c2203a.f9491g, c2203a.f9492h);
            AbstractC2364c.m4953d(mapSingletonMap, "singletonMap(pair.first, pair.second)");
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m4851D(arrayList.size()));
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj = arrayList.get(i3);
            i3++;
            C2203a c2203a2 = (C2203a) obj;
            linkedHashMap.put(c2203a2.f9491g, c2203a2.f9492h);
        }
        return linkedHashMap;
    }
}

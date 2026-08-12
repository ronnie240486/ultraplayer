package p092e0;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: e0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1499d extends LinkedHashMap {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 4;
    }
}

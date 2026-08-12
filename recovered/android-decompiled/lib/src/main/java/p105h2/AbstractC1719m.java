package p105h2;

import java.util.Map;
import p122m1.AbstractC2003a;

/* JADX INFO: renamed from: h2.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1719m implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (AbstractC2003a.m4538k(getKey(), entry.getKey()) && AbstractC2003a.m4538k(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}

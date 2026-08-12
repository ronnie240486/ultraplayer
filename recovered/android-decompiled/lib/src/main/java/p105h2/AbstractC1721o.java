package p105h2;

import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: h2.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1721o {

    /* JADX INFO: renamed from: g */
    public transient Set f7692g;

    /* JADX INFO: renamed from: h */
    public transient C1720n f7693h;

    /* JADX INFO: renamed from: i */
    public transient Map f7694i;

    /* JADX INFO: renamed from: a */
    public abstract Map mo4132a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1721o) {
            return ((C1688T) this).mo4132a().equals(((C1688T) ((AbstractC1721o) obj)).mo4132a());
        }
        return false;
    }

    public final int hashCode() {
        return mo4132a().hashCode();
    }

    public final String toString() {
        return mo4132a().toString();
    }
}

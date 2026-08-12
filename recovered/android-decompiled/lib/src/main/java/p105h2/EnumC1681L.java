package p105h2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h2.L */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1681L implements Iterator {

    /* JADX INFO: renamed from: g */
    public static final EnumC1681L f7612g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ EnumC1681L[] f7613h;

    static {
        EnumC1681L enumC1681L = new EnumC1681L("INSTANCE", 0);
        f7612g = enumC1681L;
        f7613h = new EnumC1681L[]{enumC1681L};
    }

    public static EnumC1681L valueOf(String str) {
        return (EnumC1681L) Enum.valueOf(EnumC1681L.class, str);
    }

    public static EnumC1681L[] values() {
        return (EnumC1681L[]) f7613h.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}

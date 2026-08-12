package p105h2;

import java.io.Serializable;

/* JADX INFO: renamed from: h2.C */
/* JADX INFO: loaded from: classes.dex */
public final class C1672C extends AbstractC1719m implements Serializable {

    /* JADX INFO: renamed from: g */
    public final Object f7593g;

    /* JADX INFO: renamed from: h */
    public final Object f7594h;

    public C1672C(Object obj, Object obj2) {
        this.f7593g = obj;
        this.f7594h = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f7593g;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f7594h;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}

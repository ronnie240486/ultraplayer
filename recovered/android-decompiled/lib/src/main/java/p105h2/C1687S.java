package p105h2;

import java.io.Serializable;
import java.util.ArrayList;
import p101g2.InterfaceC1587h;

/* JADX INFO: renamed from: h2.S */
/* JADX INFO: loaded from: classes.dex */
public final class C1687S implements InterfaceC1587h, Serializable {

    /* JADX INFO: renamed from: g */
    public final int f7622g;

    public C1687S() {
        AbstractC1723q.m4153b(2, "expectedValuesPerKey");
        this.f7622g = 2;
    }

    @Override // p101g2.InterfaceC1587h
    public final Object get() {
        return new ArrayList(this.f7622g);
    }
}

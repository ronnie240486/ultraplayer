package p019G1;

import android.util.LruCache;
import p046P1.AbstractC0491s;

/* JADX INFO: renamed from: G1.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0249x extends LruCache {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0228c f647a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0249x(C0228c c0228c) {
        super(20);
        this.f647a = c0228c;
    }

    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z3, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj;
        if (z3) {
            C0228c c0228c = this.f647a;
            AbstractC0491s.m1213e(c0228c.f541g);
            c0228c.f541g.add(num);
        }
    }
}

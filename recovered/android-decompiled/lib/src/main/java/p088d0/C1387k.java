package p088d0;

import java.util.concurrent.CopyOnWriteArrayList;
import p064W.AbstractC0632A;
import p064W.RunnableC0641i;
import p077a0.RunnableC0804O;
import p114k0.C1907A;

/* JADX INFO: renamed from: d0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1387k {

    /* JADX INFO: renamed from: a */
    public final int f6182a;

    /* JADX INFO: renamed from: b */
    public final C1907A f6183b;

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f6184c;

    public C1387k(CopyOnWriteArrayList copyOnWriteArrayList, int i3, C1907A c1907a) {
        this.f6184c = copyOnWriteArrayList;
        this.f6182a = i3;
        this.f6183b = c1907a;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [d0.l, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public final void m3483a() {
        for (C1386j c1386j : this.f6184c) {
            AbstractC0632A.m1574O(c1386j.f6180a, new RunnableC1385i(this, c1386j.f6181b, 2));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [d0.l, java.lang.Object] */
    /* JADX INFO: renamed from: b */
    public final void m3484b() {
        for (C1386j c1386j : this.f6184c) {
            AbstractC0632A.m1574O(c1386j.f6180a, new RunnableC1385i(this, c1386j.f6181b, 1));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3485c(int i3) {
        for (C1386j c1386j : this.f6184c) {
            AbstractC0632A.m1574O(c1386j.f6180a, new RunnableC0641i(this, c1386j.f6181b, i3, 2));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3486d(Exception exc) {
        for (C1386j c1386j : this.f6184c) {
            AbstractC0632A.m1574O(c1386j.f6180a, new RunnableC0804O(this, c1386j.f6181b, exc, 4));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [d0.l, java.lang.Object] */
    /* JADX INFO: renamed from: e */
    public final void m3487e() {
        for (C1386j c1386j : this.f6184c) {
            AbstractC0632A.m1574O(c1386j.f6180a, new RunnableC1385i(this, c1386j.f6181b, 0));
        }
    }
}

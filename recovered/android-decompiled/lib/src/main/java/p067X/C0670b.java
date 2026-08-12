package p067X;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: X.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0670b extends AbstractC0672d {

    /* JADX INFO: renamed from: i */
    public final long f2568i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f2569j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f2570k;

    public C0670b(int i3, long j3) {
        super(i3);
        this.f2568i = j3;
        this.f2569j = new ArrayList();
        this.f2570k = new ArrayList();
    }

    /* JADX INFO: renamed from: e */
    public final C0670b m1783e(int i3) {
        ArrayList arrayList = this.f2570k;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0670b c0670b = (C0670b) arrayList.get(i4);
            if (c0670b.f2573h == i3) {
                return c0670b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final C0671c m1784f(int i3) {
        ArrayList arrayList = this.f2569j;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0671c c0671c = (C0671c) arrayList.get(i4);
            if (c0671c.f2573h == i3) {
                return c0671c;
            }
        }
        return null;
    }

    @Override // p067X.AbstractC0672d
    public final String toString() {
        return AbstractC0672d.m1785b(this.f2573h) + " leaves: " + Arrays.toString(this.f2569j.toArray()) + " containers: " + Arrays.toString(this.f2570k.toArray());
    }
}

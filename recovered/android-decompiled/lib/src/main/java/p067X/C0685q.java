package p067X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0685q implements Comparable {

    /* JADX INFO: renamed from: h */
    public long f2634h = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public final ArrayList f2633g = new ArrayList();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f2634h, ((C0685q) obj).f2634h);
    }
}

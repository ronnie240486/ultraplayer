package p068X0;

/* JADX INFO: renamed from: X0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0694g implements Comparable {

    /* JADX INFO: renamed from: g */
    public final int f2673g;

    /* JADX INFO: renamed from: h */
    public final C0690c f2674h;

    public C0694g(int i3, C0690c c0690c) {
        this.f2673g = i3;
        this.f2674h = c0690c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f2673g, ((C0694g) obj).f2673g);
    }
}

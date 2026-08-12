package p071Y0;

/* JADX INFO: renamed from: Y0.G */
/* JADX INFO: loaded from: classes.dex */
public final class C0736G {

    /* JADX INFO: renamed from: a */
    public final String f2832a;

    /* JADX INFO: renamed from: b */
    public final int f2833b;

    /* JADX INFO: renamed from: c */
    public final int f2834c;

    /* JADX INFO: renamed from: d */
    public int f2835d;

    /* JADX INFO: renamed from: e */
    public String f2836e;

    public C0736G(int i3, int i4) {
        this(Integer.MIN_VALUE, i3, i4);
    }

    /* JADX INFO: renamed from: a */
    public final void m1848a() {
        int i3 = this.f2835d;
        this.f2835d = i3 == Integer.MIN_VALUE ? this.f2833b : i3 + this.f2834c;
        this.f2836e = this.f2832a + this.f2835d;
    }

    /* JADX INFO: renamed from: b */
    public final void m1849b() {
        if (this.f2835d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public C0736G(int i3, int i4, int i5) {
        String str;
        if (i3 != Integer.MIN_VALUE) {
            str = i3 + "/";
        } else {
            str = "";
        }
        this.f2832a = str;
        this.f2833b = i4;
        this.f2834c = i5;
        this.f2835d = Integer.MIN_VALUE;
        this.f2836e = "";
    }
}

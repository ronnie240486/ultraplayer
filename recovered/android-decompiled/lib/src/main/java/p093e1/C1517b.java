package p093e1;

/* JADX INFO: renamed from: e1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1517b {

    /* JADX INFO: renamed from: a */
    public final int f6837a;

    /* JADX INFO: renamed from: b */
    public int f6838b;

    /* JADX INFO: renamed from: c */
    public int f6839c;

    /* JADX INFO: renamed from: d */
    public int f6840d;

    /* JADX INFO: renamed from: e */
    public int f6841e;

    /* JADX INFO: renamed from: f */
    public int f6842f;

    /* JADX INFO: renamed from: g */
    public int f6843g;

    /* JADX INFO: renamed from: h */
    public int f6844h;

    /* JADX INFO: renamed from: i */
    public int f6845i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1518c f6846j;

    public C1517b(C1518c c1518c, int i3, int i4) {
        this.f6846j = c1518c;
        this.f6837a = i3;
        this.f6838b = i4;
        m3810a();
    }

    /* JADX INFO: renamed from: a */
    public final void m3810a() {
        C1518c c1518c = this.f6846j;
        int[] iArr = c1518c.f6848a;
        int[] iArr2 = c1518c.f6849b;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MIN_VALUE;
        int i7 = Integer.MIN_VALUE;
        int i8 = Integer.MIN_VALUE;
        int i9 = 0;
        for (int i10 = this.f6837a; i10 <= this.f6838b; i10++) {
            int i11 = iArr[i10];
            i9 += iArr2[i11];
            int i12 = (i11 >> 10) & 31;
            int i13 = (i11 >> 5) & 31;
            int i14 = i11 & 31;
            if (i12 > i6) {
                i6 = i12;
            }
            if (i12 < i3) {
                i3 = i12;
            }
            if (i13 > i7) {
                i7 = i13;
            }
            if (i13 < i4) {
                i4 = i13;
            }
            if (i14 > i8) {
                i8 = i14;
            }
            if (i14 < i5) {
                i5 = i14;
            }
        }
        this.f6840d = i3;
        this.f6841e = i6;
        this.f6842f = i4;
        this.f6843g = i7;
        this.f6844h = i5;
        this.f6845i = i8;
        this.f6839c = i9;
    }

    /* JADX INFO: renamed from: b */
    public final int m3811b() {
        return ((this.f6845i - this.f6844h) + 1) * ((this.f6843g - this.f6842f) + 1) * ((this.f6841e - this.f6840d) + 1);
    }
}

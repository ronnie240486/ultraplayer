package p014F;

/* JADX INFO: renamed from: F.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0152a {

    /* JADX INFO: renamed from: a */
    public int f360a;

    /* JADX INFO: renamed from: b */
    public int f361b;

    /* JADX INFO: renamed from: c */
    public float f362c;

    /* JADX INFO: renamed from: d */
    public float f363d;

    /* JADX INFO: renamed from: e */
    public long f364e;

    /* JADX INFO: renamed from: f */
    public long f365f;

    /* JADX INFO: renamed from: g */
    public long f366g;

    /* JADX INFO: renamed from: h */
    public float f367h;

    /* JADX INFO: renamed from: i */
    public int f368i;

    /* JADX INFO: renamed from: a */
    public final float m608a(long j3) {
        long j4 = this.f364e;
        if (j3 < j4) {
            return 0.0f;
        }
        long j5 = this.f366g;
        if (j5 < 0 || j3 < j5) {
            return ViewOnTouchListenerC0159h.m622b((j3 - j4) / this.f360a, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f367h;
        return (ViewOnTouchListenerC0159h.m622b((j3 - j5) / this.f368i, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}

package p113k;

/* JADX INFO: renamed from: k.O0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1821O0 {

    /* JADX INFO: renamed from: a */
    public int f8066a;

    /* JADX INFO: renamed from: b */
    public int f8067b;

    /* JADX INFO: renamed from: c */
    public int f8068c;

    /* JADX INFO: renamed from: d */
    public int f8069d;

    /* JADX INFO: renamed from: e */
    public int f8070e;

    /* JADX INFO: renamed from: f */
    public int f8071f;

    /* JADX INFO: renamed from: g */
    public boolean f8072g;

    /* JADX INFO: renamed from: h */
    public boolean f8073h;

    /* JADX INFO: renamed from: a */
    public final void m4332a(int i3, int i4) {
        this.f8068c = i3;
        this.f8069d = i4;
        this.f8073h = true;
        if (this.f8072g) {
            if (i4 != Integer.MIN_VALUE) {
                this.f8066a = i4;
            }
            if (i3 != Integer.MIN_VALUE) {
                this.f8067b = i3;
                return;
            }
            return;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f8066a = i3;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f8067b = i4;
        }
    }
}

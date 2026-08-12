package p067X;

/* JADX INFO: renamed from: X.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0672d {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2572g = 1;

    /* JADX INFO: renamed from: h */
    public int f2573h;

    public /* synthetic */ AbstractC0672d() {
    }

    /* JADX INFO: renamed from: b */
    public static String m1785b(int i3) {
        return "" + ((char) ((i3 >> 24) & 255)) + ((char) ((i3 >> 16) & 255)) + ((char) ((i3 >> 8) & 255)) + ((char) (i3 & 255));
    }

    /* JADX INFO: renamed from: a */
    public void m1786a(int i3) {
        this.f2573h = i3 | this.f2573h;
    }

    /* JADX INFO: renamed from: c */
    public boolean m1787c(int i3) {
        return (this.f2573h & i3) == i3;
    }

    public String toString() {
        switch (this.f2572g) {
            case 0:
                return m1785b(this.f2573h);
            default:
                return super.toString();
        }
    }

    public AbstractC0672d(int i3) {
        this.f2573h = i3;
    }
}

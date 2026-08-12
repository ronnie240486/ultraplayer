package p064W;

/* JADX INFO: renamed from: W.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0635c {

    /* JADX INFO: renamed from: a */
    public boolean f2475a;

    /* JADX INFO: renamed from: a */
    public synchronized void m1611a() {
        while (!this.f2475a) {
            wait();
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m1612b() {
        this.f2475a = false;
    }

    /* JADX INFO: renamed from: c */
    public synchronized boolean m1613c() {
        if (this.f2475a) {
            return false;
        }
        this.f2475a = true;
        notifyAll();
        return true;
    }
}

package p064W;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: renamed from: W.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0655w {

    /* JADX INFO: renamed from: b */
    public static final ArrayList f2528b = new ArrayList(50);

    /* JADX INFO: renamed from: a */
    public final Handler f2529a;

    public C0655w(Handler handler) {
        this.f2529a = handler;
    }

    /* JADX INFO: renamed from: b */
    public static C0654v m1696b() {
        C0654v c0654v;
        ArrayList arrayList = f2528b;
        synchronized (arrayList) {
            try {
                c0654v = arrayList.isEmpty() ? new C0654v() : (C0654v) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0654v;
    }

    /* JADX INFO: renamed from: a */
    public final C0654v m1697a(int i3, Object obj) {
        C0654v c0654vM1696b = m1696b();
        c0654vM1696b.f2527a = this.f2529a.obtainMessage(i3, obj);
        return c0654vM1696b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1698c(Runnable runnable) {
        return this.f2529a.post(runnable);
    }

    /* JADX INFO: renamed from: d */
    public final void m1699d(int i3) {
        AbstractC0646n.m1625c(i3 != 0);
        this.f2529a.removeMessages(i3);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1700e(int i3) {
        return this.f2529a.sendEmptyMessage(i3);
    }
}

package androidx.emoji2.text;

import android.os.Build;
import android.support.v4.media.session.C0858A;
import java.util.ArrayList;
import p028J1.RunnableC0316v;
import p053S0.C0536b;
import p060U1.AbstractC0610a;
import p066W1.AbstractC0664e;

/* JADX INFO: renamed from: androidx.emoji2.text.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0914d extends AbstractC0610a {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C0915e f3996n;

    public C0914d(C0915e c0915e) {
        this.f3996n = c0915e;
    }

    @Override // p060U1.AbstractC0610a
    /* JADX INFO: renamed from: A */
    public final void mo1524A(Throwable th) {
        this.f3996n.f3997a.m2407d(th);
    }

    @Override // p060U1.AbstractC0610a
    /* JADX INFO: renamed from: B */
    public final void mo1525B(C0536b c0536b) {
        C0915e c0915e = this.f3996n;
        c0915e.f3999c = c0536b;
        C0536b c0536b2 = c0915e.f3999c;
        C0919i c0919i = c0915e.f3997a;
        c0915e.f3998b = new C0858A(c0536b2, c0919i.f4011g, c0919i.f4013i, Build.VERSION.SDK_INT >= 34 ? AbstractC0922l.m2410a() : AbstractC0664e.m1718A());
        C0919i c0919i2 = c0915e.f3997a;
        c0919i2.getClass();
        ArrayList arrayList = new ArrayList();
        c0919i2.f4005a.writeLock().lock();
        try {
            c0919i2.f4007c = 1;
            arrayList.addAll(c0919i2.f4006b);
            c0919i2.f4006b.clear();
            c0919i2.f4005a.writeLock().unlock();
            c0919i2.f4008d.post(new RunnableC0316v(arrayList, c0919i2.f4007c, (Throwable) null));
        } catch (Throwable th) {
            c0919i2.f4005a.writeLock().unlock();
            throw th;
        }
    }
}

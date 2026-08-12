package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;
import p077a0.C0817b;
import p091e.AbstractActivityC1479j;

/* JADX INFO: renamed from: androidx.activity.i */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0899i implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

    /* JADX INFO: renamed from: h */
    public Runnable f3741h;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ AbstractActivityC1479j f3743j;

    /* JADX INFO: renamed from: g */
    public final long f3740g = SystemClock.uptimeMillis() + 10000;

    /* JADX INFO: renamed from: i */
    public boolean f3742i = false;

    public ExecutorC0899i(AbstractActivityC1479j abstractActivityC1479j) {
        this.f3743j = abstractActivityC1479j;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f3741h = runnable;
        View decorView = this.f3743j.getWindow().getDecorView();
        if (!this.f3742i) {
            decorView.postOnAnimation(new RunnableC0892b(1, this));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z3;
        Runnable runnable = this.f3741h;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f3740g) {
                this.f3742i = false;
                this.f3743j.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f3741h = null;
        C0817b c0817b = this.f3743j.f3751o;
        synchronized (c0817b.f3428b) {
            z3 = c0817b.f3427a;
        }
        if (z3) {
            this.f3742i = false;
            this.f3743j.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3743j.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

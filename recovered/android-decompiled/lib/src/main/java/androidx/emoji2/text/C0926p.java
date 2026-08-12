package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.activity.RunnableC0892b;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p022H1.C0258b;
import p030K0.C0334e;
import p034L1.C0352g;
import p060U1.AbstractC0610a;
import p064W.ThreadFactoryC0658z;
import p066W1.AbstractC0664e;
import p160x.AbstractC2343b;
import p160x.C2348g;

/* JADX INFO: renamed from: androidx.emoji2.text.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0926p implements InterfaceC0918h {

    /* JADX INFO: renamed from: a */
    public final Context f4023a;

    /* JADX INFO: renamed from: b */
    public final C0258b f4024b;

    /* JADX INFO: renamed from: c */
    public final C0352g f4025c;

    /* JADX INFO: renamed from: d */
    public final Object f4026d;

    /* JADX INFO: renamed from: e */
    public Handler f4027e;

    /* JADX INFO: renamed from: f */
    public ThreadPoolExecutor f4028f;

    /* JADX INFO: renamed from: g */
    public ThreadPoolExecutor f4029g;

    /* JADX INFO: renamed from: h */
    public AbstractC0610a f4030h;

    public C0926p(Context context, C0258b c0258b) {
        C0352g c0352g = C0927q.f4031d;
        this.f4026d = new Object();
        AbstractC0664e.m1747h(context, "Context cannot be null");
        this.f4023a = context.getApplicationContext();
        this.f4024b = c0258b;
        this.f4025c = c0352g;
    }

    @Override // androidx.emoji2.text.InterfaceC0918h
    /* JADX INFO: renamed from: a */
    public final void mo1532a(AbstractC0610a abstractC0610a) {
        synchronized (this.f4026d) {
            this.f4030h = abstractC0610a;
        }
        m2418c();
    }

    /* JADX INFO: renamed from: b */
    public final void m2417b() {
        synchronized (this.f4026d) {
            try {
                this.f4030h = null;
                Handler handler = this.f4027e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f4027e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f4029g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f4028f = null;
                this.f4029g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2418c() {
        synchronized (this.f4026d) {
            try {
                if (this.f4030h == null) {
                    return;
                }
                if (this.f4028f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0658z(1, "emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f4029g = threadPoolExecutor;
                    this.f4028f = threadPoolExecutor;
                }
                this.f4028f.execute(new RunnableC0892b(3, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final C2348g m2419d() {
        try {
            C0352g c0352g = this.f4025c;
            Context context = this.f4023a;
            C0258b c0258b = this.f4024b;
            c0352g.getClass();
            C0334e c0334eM4945a = AbstractC2343b.m4945a(context, c0258b);
            int i3 = c0334eM4945a.f1062g;
            if (i3 != 0) {
                throw new RuntimeException("fetchFonts failed (" + i3 + ")");
            }
            C2348g[] c2348gArr = (C2348g[]) c0334eM4945a.f1063h;
            if (c2348gArr == null || c2348gArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c2348gArr[0];
        } catch (PackageManager.NameNotFoundException e3) {
            throw new RuntimeException("provider not found", e3);
        }
    }
}

package p060U1;

import android.content.Context;

/* JADX INFO: renamed from: U1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0612c {

    /* JADX INFO: renamed from: b */
    public static final C0612c f2317b;

    /* JADX INFO: renamed from: a */
    public C0611b f2318a;

    static {
        C0612c c0612c = new C0612c();
        c0612c.f2318a = null;
        f2317b = c0612c;
    }

    /* JADX INFO: renamed from: a */
    public static C0611b m1534a(Context context) {
        C0611b c0611b;
        C0612c c0612c = f2317b;
        synchronized (c0612c) {
            try {
                if (c0612c.f2318a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    c0612c.f2318a = new C0611b(context, 0);
                }
                c0611b = c0612c.f2318a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0611b;
    }
}

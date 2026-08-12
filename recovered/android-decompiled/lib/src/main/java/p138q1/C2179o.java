package p138q1;

import android.content.Context;
import androidx.activity.RunnableC0892b;
import p034L1.C0352g;
import p060U1.C0611b;
import p158w1.InterfaceC2319b;
import p162x1.C2360i;
import p162x1.C2361j;

/* JADX INFO: renamed from: q1.o */
/* JADX INFO: loaded from: classes.dex */
public final class C2179o {

    /* JADX INFO: renamed from: e */
    public static volatile C2175k f9403e;

    /* JADX INFO: renamed from: a */
    public final C0352g f9404a;

    /* JADX INFO: renamed from: b */
    public final C0352g f9405b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2319b f9406c;

    /* JADX INFO: renamed from: d */
    public final C2360i f9407d;

    public C2179o(C0352g c0352g, C0352g c0352g2, InterfaceC2319b interfaceC2319b, C2360i c2360i, C2361j c2361j) {
        this.f9404a = c0352g;
        this.f9405b = c0352g2;
        this.f9406c = interfaceC2319b;
        this.f9407d = c2360i;
        c2361j.getClass();
        c2361j.f9915a.execute(new RunnableC0892b(22, c2361j));
    }

    /* JADX INFO: renamed from: a */
    public static C2179o m4762a() {
        C2175k c2175k = f9403e;
        if (c2175k != null) {
            return (C2179o) c2175k.f9398k.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* JADX INFO: renamed from: b */
    public static void m4763b(Context context) {
        if (f9403e == null) {
            synchronized (C2179o.class) {
                try {
                    if (f9403e == null) {
                        C0611b c0611b = new C0611b();
                        context.getClass();
                        c0611b.f2316a = context;
                        f9403e = c0611b.m1533b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}

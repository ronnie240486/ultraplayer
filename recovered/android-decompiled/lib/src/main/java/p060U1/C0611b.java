package p060U1;

import android.content.Context;
import androidx.emoji2.text.InterfaceC0918h;
import com.google.android.gms.internal.cast.C1323r;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p022H1.C0258b;
import p053S0.C0536b;
import p064W.ThreadFactoryC0658z;
import p077a0.RunnableC0804O;
import p095f0.C1528a;
import p113k.C1866h1;
import p138q1.AbstractC2177m;
import p138q1.C2173i;
import p138q1.C2175k;
import p139q2.InterfaceC2180a;
import p142r1.C2200e;
import p150t1.C2275a;
import p150t1.C2277c;

/* JADX INFO: renamed from: U1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0611b implements InterfaceC0918h {

    /* JADX INFO: renamed from: a */
    public Context f2316a;

    public C0611b(Context context, int i3) {
        switch (i3) {
            case 1:
                this.f2316a = context.getApplicationContext();
                break;
            default:
                this.f2316a = context;
                break;
        }
    }

    @Override // androidx.emoji2.text.InterfaceC0918h
    /* JADX INFO: renamed from: a */
    public void mo1532a(AbstractC0610a abstractC0610a) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0658z(1, "EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC0804O(this, abstractC0610a, threadPoolExecutor, 2));
    }

    /* JADX INFO: renamed from: b */
    public C2175k m1533b() {
        Context context = this.f2316a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        C2175k c2175k = new C2175k();
        c2175k.f9394g = C2275a.m4884a(AbstractC2177m.f9401a);
        C2277c c2277c = new C2277c(context);
        c2175k.f9395h = c2277c;
        c2175k.f9396i = C2275a.m4884a(new C1323r(c2277c, 13, new C2200e(c2277c, 0)));
        C2277c c2277c2 = c2175k.f9395h;
        InterfaceC2180a interfaceC2180aM4884a = C2275a.m4884a(new C1323r(new C2200e(c2277c2, 2), 18, new C2200e(c2277c2, 1)));
        c2175k.f9397j = interfaceC2180aM4884a;
        C1528a c1528a = new C1528a(19);
        C2277c c2277c3 = c2175k.f9395h;
        C2173i c2173i = new C2173i(c2277c3, interfaceC2180aM4884a, c1528a, 4);
        InterfaceC2180a interfaceC2180a = c2175k.f9394g;
        InterfaceC2180a interfaceC2180a2 = c2175k.f9396i;
        C0258b c0258b = new C0258b(interfaceC2180a, interfaceC2180a2, c2173i, interfaceC2180aM4884a, interfaceC2180aM4884a);
        C1866h1 c1866h1 = new C1866h1();
        c1866h1.f8183g = c2277c3;
        c1866h1.f8184h = interfaceC2180a2;
        c1866h1.f8185i = interfaceC2180aM4884a;
        c1866h1.f8186j = c2173i;
        c1866h1.f8187k = interfaceC2180a;
        c1866h1.f8188l = interfaceC2180aM4884a;
        c1866h1.f8189m = interfaceC2180aM4884a;
        C0536b c0536b = new C0536b();
        c0536b.f1867g = interfaceC2180a;
        c0536b.f1868h = interfaceC2180aM4884a;
        c0536b.f1869i = c2173i;
        c0536b.f1870j = interfaceC2180aM4884a;
        c2175k.f9398k = C2275a.m4884a(new C2173i(c0258b, c1866h1, c0536b, 2));
        return c2175k;
    }
}

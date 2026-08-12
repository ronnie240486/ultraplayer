package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import p111j1.C1786a;
import p111j1.InterfaceC1787b;
import p147s2.C2258d;
import p163x2.AbstractC2364c;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC1787b {
    @Override // p111j1.InterfaceC1787b
    /* JADX INFO: renamed from: a */
    public final List mo2384a() {
        return C2258d.f9693g;
    }

    @Override // p111j1.InterfaceC1787b
    /* JADX INFO: renamed from: b */
    public final Object mo2385b(Context context) {
        AbstractC2364c.m4954e(context, "context");
        C1786a c1786aM4276c = C1786a.m4276c(context);
        AbstractC2364c.m4953d(c1786aM4276c, "getInstance(context)");
        if (!c1786aM4276c.f7977b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC1002o.f4319a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            AbstractC2364c.m4952c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C1001n());
        }
        C0977B c0977b = C0977B.f4273o;
        c0977b.getClass();
        c0977b.f4278k = new Handler();
        c0977b.f4279l.m2568d(EnumC0999l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        AbstractC2364c.m4952c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new C0976A(c0977b));
        return c0977b;
    }
}

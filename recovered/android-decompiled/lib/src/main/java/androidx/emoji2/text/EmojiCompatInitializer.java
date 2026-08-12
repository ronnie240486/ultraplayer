package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C1007t;
import androidx.lifecycle.InterfaceC0991d;
import androidx.lifecycle.InterfaceC1005r;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p060U1.C0611b;
import p111j1.C1786a;
import p111j1.InterfaceC1787b;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC1787b {
    @Override // p111j1.InterfaceC1787b
    /* JADX INFO: renamed from: a */
    public final List mo2384a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // p111j1.InterfaceC1787b
    /* JADX INFO: renamed from: b */
    public final Object mo2385b(Context context) {
        C0927q c0927q = new C0927q(new C0611b(context, 1));
        c0927q.f4000a = 1;
        if (C0919i.f4004k == null) {
            synchronized (C0919i.f4003j) {
                try {
                    if (C0919i.f4004k == null) {
                        C0919i.f4004k = new C0919i(c0927q);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        m2386c(context);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: c */
    public final void m2386c(Context context) {
        Object objM4278b;
        C1786a c1786aM4276c = C1786a.m4276c(context);
        c1786aM4276c.getClass();
        synchronized (C1786a.f7975e) {
            try {
                objM4278b = c1786aM4276c.f7976a.get(ProcessLifecycleInitializer.class);
                if (objM4278b == null) {
                    objM4278b = c1786aM4276c.m4278b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        final C1007t c1007tMo2300e = ((InterfaceC1005r) objM4278b).mo2300e();
        c1007tMo2300e.m2565a(new InterfaceC0991d() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.InterfaceC0991d
            /* JADX INFO: renamed from: a */
            public final void mo2387a() {
                EmojiCompatInitializer.this.getClass();
                (Build.VERSION.SDK_INT >= 28 ? AbstractC0911a.m2388a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0921k(), 500L);
                c1007tMo2300e.m2570f(this);
            }
        });
    }
}

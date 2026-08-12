package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.AbstractC0937C;
import androidx.fragment.app.C0970u;
import androidx.lifecycle.C1007t;
import androidx.lifecycle.EnumC1000m;
import androidx.lifecycle.InterfaceC1005r;
import java.util.Iterator;
import java.util.ListIterator;
import p147s2.C2255a;
import p163x2.AbstractC2364c;

/* JADX INFO: renamed from: androidx.activity.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0906p {

    /* JADX INFO: renamed from: a */
    public final Runnable f3770a;

    /* JADX INFO: renamed from: b */
    public final C2255a f3771b = new C2255a();

    /* JADX INFO: renamed from: c */
    public final C0902l f3772c;

    /* JADX INFO: renamed from: d */
    public final OnBackInvokedCallback f3773d;

    /* JADX INFO: renamed from: e */
    public OnBackInvokedDispatcher f3774e;

    /* JADX INFO: renamed from: f */
    public boolean f3775f;

    public C0906p(Runnable runnable) {
        this.f3770a = runnable;
        if (Build.VERSION.SDK_INT >= 33) {
            this.f3772c = new C0902l(0, this);
            this.f3773d = C0904n.f3767a.m2305a(new C0902l(1, this));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2308a(InterfaceC1005r interfaceC1005r, C0970u c0970u) {
        AbstractC2364c.m4954e(c0970u, "onBackPressedCallback");
        C1007t c1007tMo2300e = interfaceC1005r.mo2300e();
        if (c1007tMo2300e.f4324c == EnumC1000m.f4313g) {
            return;
        }
        c0970u.f4263b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, c1007tMo2300e, c0970u));
        if (Build.VERSION.SDK_INT >= 33) {
            m2310c();
            c0970u.f4264c = this.f3772c;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2309b() {
        Object objPrevious;
        C2255a c2255a = this.f3771b;
        c2255a.getClass();
        ListIterator listIterator = c2255a.listIterator(c2255a.f9691i);
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((C0970u) objPrevious).f4262a);
        C0970u c0970u = (C0970u) objPrevious;
        if (c0970u == null) {
            this.f3770a.run();
            return;
        }
        AbstractC0937C abstractC0937C = c0970u.f4265d;
        abstractC0937C.m2480x(true);
        if (abstractC0937C.f4071h.f4262a) {
            abstractC0937C.m2443M();
        } else {
            abstractC0937C.f4070g.m2309b();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2310c() {
        boolean z3;
        C2255a c2255a = this.f3771b;
        if (!(c2255a != null) || !c2255a.isEmpty()) {
            Iterator it = c2255a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z3 = false;
                    break;
                } else if (((C0970u) it.next()).f4262a) {
                    z3 = true;
                    break;
                }
            }
        } else {
            z3 = false;
            break;
        }
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f3774e;
        OnBackInvokedCallback onBackInvokedCallback = this.f3773d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        C0904n c0904n = C0904n.f3767a;
        if (z3 && !this.f3775f) {
            c0904n.m2306b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f3775f = true;
        } else {
            if (z3 || !this.f3775f) {
                return;
            }
            c0904n.m2307c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f3775f = false;
        }
    }
}

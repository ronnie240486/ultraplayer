package p077a0;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C1007t;
import androidx.lifecycle.EnumC0999l;
import androidx.lifecycle.EnumC1000m;
import androidx.lifecycle.InterfaceC1003p;
import androidx.lifecycle.InterfaceC1005r;
import androidx.savedstate.Recreator;
import java.util.ArrayDeque;
import java.util.Map;
import p097f2.C1562f;
import p097f2.C1563g;
import p108i1.C1751d;
import p108i1.InterfaceC1750c;
import p108i1.InterfaceC1752e;
import p120m.C1996d;
import p120m.C1998f;
import p163x2.AbstractC2364c;

/* JADX INFO: renamed from: a0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0817b {

    /* JADX INFO: renamed from: a */
    public boolean f3427a;

    /* JADX INFO: renamed from: b */
    public Object f3428b;

    /* JADX INFO: renamed from: c */
    public Object f3429c = new C1751d();

    public C0817b(InterfaceC1752e interfaceC1752e) {
        this.f3428b = interfaceC1752e;
    }

    /* JADX INFO: renamed from: a */
    public void m2054a() {
        InterfaceC1752e interfaceC1752e = (InterfaceC1752e) this.f3428b;
        C1007t c1007tMo2300e = interfaceC1752e.mo2300e();
        if (c1007tMo2300e.f4324c != EnumC1000m.f4314h) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        c1007tMo2300e.m2565a(new Recreator(interfaceC1752e));
        final C1751d c1751d = (C1751d) this.f3429c;
        c1751d.getClass();
        if (c1751d.f7802a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        c1007tMo2300e.m2565a(new InterfaceC1003p() { // from class: i1.a
            @Override // androidx.lifecycle.InterfaceC1003p
            /* JADX INFO: renamed from: b */
            public final void mo2288b(InterfaceC1005r interfaceC1005r, EnumC0999l enumC0999l) {
                C1751d c1751d2 = c1751d;
                AbstractC2364c.m4954e(c1751d2, "this$0");
                if (enumC0999l == EnumC0999l.ON_START) {
                    c1751d2.f7804c = true;
                } else if (enumC0999l == EnumC0999l.ON_STOP) {
                    c1751d2.f7804c = false;
                }
            }
        });
        c1751d.f7802a = true;
        this.f3427a = true;
    }

    /* JADX INFO: renamed from: b */
    public void m2055b(Bundle bundle) {
        if (!this.f3427a) {
            m2054a();
        }
        C1007t c1007tMo2300e = ((InterfaceC1752e) this.f3428b).mo2300e();
        if (c1007tMo2300e.f4324c.compareTo(EnumC1000m.f4316j) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c1007tMo2300e.f4324c).toString());
        }
        C1751d c1751d = (C1751d) this.f3429c;
        if (!c1751d.f7802a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c1751d.f7803b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c1751d.f7806e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c1751d.f7803b = true;
    }

    /* JADX INFO: renamed from: c */
    public void m2056c(Bundle bundle) {
        C1751d c1751d = (C1751d) this.f3429c;
        c1751d.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) c1751d.f7806e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C1998f c1998f = (C1998f) c1751d.f7805d;
        c1998f.getClass();
        C1996d c1996d = new C1996d(c1998f);
        c1998f.f8712i.put(c1996d, Boolean.FALSE);
        while (c1996d.hasNext()) {
            Map.Entry entry = (Map.Entry) c1996d.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC1750c) entry.getValue()).mo2291a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* JADX INFO: renamed from: d */
    public void m2057d() {
        if (this.f3427a) {
            ((Context) this.f3428b).unregisterReceiver((RunnableC0815a) this.f3429c);
            this.f3427a = false;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m2058e(C1562f c1562f) {
        synchronized (this.f3428b) {
            try {
                if (((ArrayDeque) this.f3429c) == null) {
                    this.f3429c = new ArrayDeque();
                }
                ((ArrayDeque) this.f3429c).add(c1562f);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m2059f(C1563g c1563g) {
        C1562f c1562f;
        synchronized (this.f3428b) {
            if (((ArrayDeque) this.f3429c) != null && !this.f3427a) {
                this.f3427a = true;
                while (true) {
                    synchronized (this.f3428b) {
                        try {
                            c1562f = (C1562f) ((ArrayDeque) this.f3429c).poll();
                            if (c1562f == null) {
                                this.f3427a = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c1562f.m3883a(c1563g);
                }
            }
        }
    }
}

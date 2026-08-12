package androidx.lifecycle;

import android.os.Looper;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0959j;
import java.util.Map;
import p000A.C0031d;
import p045P0.AbstractC0462h;
import p116l.C1970a;
import p120m.C1995c;
import p120m.C1996d;
import p120m.C1998f;

/* JADX INFO: renamed from: androidx.lifecycle.x */
/* JADX INFO: loaded from: classes.dex */
public class C1011x {

    /* JADX INFO: renamed from: j */
    public static final Object f4336j = new Object();

    /* JADX INFO: renamed from: a */
    public final Object f4337a = new Object();

    /* JADX INFO: renamed from: b */
    public final C1998f f4338b = new C1998f();

    /* JADX INFO: renamed from: c */
    public int f4339c = 0;

    /* JADX INFO: renamed from: d */
    public boolean f4340d;

    /* JADX INFO: renamed from: e */
    public volatile Object f4341e;

    /* JADX INFO: renamed from: f */
    public volatile Object f4342f;

    /* JADX INFO: renamed from: g */
    public int f4343g;

    /* JADX INFO: renamed from: h */
    public boolean f4344h;

    /* JADX INFO: renamed from: i */
    public boolean f4345i;

    public C1011x() {
        Object obj = f4336j;
        this.f4342f = obj;
        this.f4341e = obj;
        this.f4343g = -1;
    }

    /* JADX INFO: renamed from: a */
    public static void m2577a(String str) {
        ((C1970a) C1970a.m4512D().f8599u).getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(AbstractC0462h.m1166f("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2578b(AbstractC1010w abstractC1010w) {
        if (abstractC1010w.f4333b) {
            if (!abstractC1010w.mo2559e()) {
                abstractC1010w.m2576c(false);
                return;
            }
            int i3 = abstractC1010w.f4334c;
            int i4 = this.f4343g;
            if (i3 >= i4) {
                return;
            }
            abstractC1010w.f4334c = i4;
            C0031d c0031d = abstractC1010w.f4332a;
            Object obj = this.f4341e;
            c0031d.getClass();
            if (((InterfaceC1005r) obj) != null) {
                DialogInterfaceOnCancelListenerC0959j dialogInterfaceOnCancelListenerC0959j = (DialogInterfaceOnCancelListenerC0959j) c0031d.f38h;
                if (dialogInterfaceOnCancelListenerC0959j.f4183c0) {
                    dialogInterfaceOnCancelListenerC0959j.getClass();
                    throw new IllegalStateException("Fragment " + dialogInterfaceOnCancelListenerC0959j + " did not return a View from onCreateView() or this was called before onCreateView().");
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2579c(AbstractC1010w abstractC1010w) {
        if (this.f4344h) {
            this.f4345i = true;
            return;
        }
        this.f4344h = true;
        do {
            this.f4345i = false;
            if (abstractC1010w != null) {
                m2578b(abstractC1010w);
                abstractC1010w = null;
            } else {
                C1998f c1998f = this.f4338b;
                c1998f.getClass();
                C1996d c1996d = new C1996d(c1998f);
                c1998f.f8712i.put(c1996d, Boolean.FALSE);
                while (c1996d.hasNext()) {
                    m2578b((AbstractC1010w) ((Map.Entry) c1996d.next()).getValue());
                    if (this.f4345i) {
                        break;
                    }
                }
            }
        } while (this.f4345i);
        this.f4344h = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m2580d(C0031d c0031d) {
        Object obj;
        m2577a("observeForever");
        C1009v c1009v = new C1009v(this, c0031d);
        C1998f c1998f = this.f4338b;
        C1995c c1995cMo4522e = c1998f.mo4522e(c0031d);
        if (c1995cMo4522e != null) {
            obj = c1995cMo4522e.f8704h;
        } else {
            C1995c c1995c = new C1995c(c0031d, c1009v);
            c1998f.f8713j++;
            C1995c c1995c2 = c1998f.f8711h;
            if (c1995c2 == null) {
                c1998f.f8710g = c1995c;
                c1998f.f8711h = c1995c;
            } else {
                c1995c2.f8705i = c1995c;
                c1995c.f8706j = c1995c2;
                c1998f.f8711h = c1995c;
            }
            obj = null;
        }
        AbstractC1010w abstractC1010w = (AbstractC1010w) obj;
        if (abstractC1010w instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC1010w != null) {
            return;
        }
        c1009v.m2576c(true);
    }
}

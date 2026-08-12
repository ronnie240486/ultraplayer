package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.AbstractC0984I;
import androidx.lifecycle.C0986K;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.fragment.app.F */
/* JADX INFO: loaded from: classes.dex */
public final class C0940F extends AbstractC0984I {

    /* JADX INFO: renamed from: f */
    public final boolean f4101f;

    /* JADX INFO: renamed from: c */
    public final HashMap f4098c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashMap f4099d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final HashMap f4100e = new HashMap();

    /* JADX INFO: renamed from: g */
    public boolean f4102g = false;

    /* JADX INFO: renamed from: h */
    public boolean f4103h = false;

    public C0940F(boolean z3) {
        this.f4101f = z3;
    }

    @Override // androidx.lifecycle.AbstractC0984I
    /* JADX INFO: renamed from: a */
    public final void mo1154a() {
        if (AbstractC0937C.m2430F(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f4102g = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m2483b(AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n) {
        if (AbstractC0937C.m2430F(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0963n);
        }
        m2484c(abstractComponentCallbacksC0963n.f4230k);
    }

    /* JADX INFO: renamed from: c */
    public final void m2484c(String str) {
        HashMap map = this.f4099d;
        C0940F c0940f = (C0940F) map.get(str);
        if (c0940f != null) {
            c0940f.mo1154a();
            map.remove(str);
        }
        HashMap map2 = this.f4100e;
        C0986K c0986k = (C0986K) map2.get(str);
        if (c0986k != null) {
            c0986k.m2557a();
            map2.remove(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2485d(AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n) {
        if (this.f4103h) {
            if (AbstractC0937C.m2430F(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f4098c.remove(abstractComponentCallbacksC0963n.f4230k) == null || !AbstractC0937C.m2430F(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC0963n);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0940F.class == obj.getClass()) {
            C0940F c0940f = (C0940F) obj;
            if (this.f4098c.equals(c0940f.f4098c) && this.f4099d.equals(c0940f.f4099d) && this.f4100e.equals(c0940f.f4100e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4100e.hashCode() + ((this.f4099d.hashCode() + (this.f4098c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f4098c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f4099d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f4100e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}

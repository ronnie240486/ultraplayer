package p035M;

import android.util.Log;
import androidx.fragment.app.AbstractC0937C;
import androidx.fragment.app.AbstractComponentCallbacksC0963n;
import p163x2.AbstractC2364c;

/* JADX INFO: renamed from: M.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0363d {

    /* JADX INFO: renamed from: a */
    public static final C0362c f1161a = C0362c.f1160a;

    /* JADX INFO: renamed from: a */
    public static C0362c m1001a(AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n) {
        while (abstractComponentCallbacksC0963n != null) {
            if (abstractComponentCallbacksC0963n.f4244y != null && abstractComponentCallbacksC0963n.f4236q) {
                abstractComponentCallbacksC0963n.m2536j();
            }
            abstractComponentCallbacksC0963n = abstractComponentCallbacksC0963n.f4204A;
        }
        return f1161a;
    }

    /* JADX INFO: renamed from: b */
    public static void m1002b(C0360a c0360a) {
        if (AbstractC0937C.m2430F(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(c0360a.f1155g.getClass().getName()), c0360a);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m1003c(AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n, String str) {
        AbstractC2364c.m4954e(str, "previousFragmentId");
        m1002b(new C0360a(abstractComponentCallbacksC0963n, "Attempting to reuse fragment " + abstractComponentCallbacksC0963n + " with previous ID " + str));
        m1001a(abstractComponentCallbacksC0963n).getClass();
    }
}

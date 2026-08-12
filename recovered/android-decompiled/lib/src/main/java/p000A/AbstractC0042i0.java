package p000A;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import p148t.C2264c;

/* JADX INFO: renamed from: A.i0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0042i0 extends C0054o0 {

    /* JADX INFO: renamed from: f */
    public static boolean f54f = false;

    /* JADX INFO: renamed from: g */
    public static Method f55g;

    /* JADX INFO: renamed from: h */
    public static Class f56h;

    /* JADX INFO: renamed from: i */
    public static Field f57i;

    /* JADX INFO: renamed from: j */
    public static Field f58j;

    /* JADX INFO: renamed from: c */
    public final WindowInsets f59c;

    /* JADX INFO: renamed from: d */
    public C2264c f60d;

    /* JADX INFO: renamed from: e */
    public C2264c f61e;

    public AbstractC0042i0(C0056p0 c0056p0, WindowInsets windowInsets) {
        super(c0056p0);
        this.f60d = null;
        this.f59c = windowInsets;
    }

    /* JADX INFO: renamed from: n */
    private C2264c m215n(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f54f) {
            m216o();
        }
        Method method = f55g;
        if (method != null && f56h != null && f57i != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f57i.get(f58j.get(objInvoke));
                if (rect != null) {
                    return C2264c.m4862a(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e3) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    private static void m216o() {
        try {
            f55g = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f56h = cls;
            f57i = cls.getDeclaredField("mVisibleInsets");
            f58j = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f57i.setAccessible(true);
            f58j.setAccessible(true);
        } catch (ReflectiveOperationException e3) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
        }
        f54f = true;
    }

    @Override // p000A.C0054o0
    /* JADX INFO: renamed from: d */
    public void mo217d(View view) {
        C2264c c2264cM215n = m215n(view);
        if (c2264cM215n == null) {
            c2264cM215n = C2264c.f9697e;
        }
        m223p(c2264cM215n);
    }

    @Override // p000A.C0054o0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f61e, ((AbstractC0042i0) obj).f61e);
        }
        return false;
    }

    @Override // p000A.C0054o0
    /* JADX INFO: renamed from: g */
    public final C2264c mo218g() {
        if (this.f60d == null) {
            WindowInsets windowInsets = this.f59c;
            this.f60d = C2264c.m4862a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f60d;
    }

    @Override // p000A.C0054o0
    /* JADX INFO: renamed from: h */
    public C0056p0 mo219h(int i3, int i4, int i5, int i6) {
        AbstractC0040h0 c0036f0;
        C0056p0 c0056p0M316c = C0056p0.m316c(this.f59c, null);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            c0036f0 = new C0038g0(c0056p0M316c);
        } else {
            c0036f0 = i7 >= 29 ? new C0036f0(c0056p0M316c) : new C0032d0(c0056p0M316c);
        }
        c0036f0.mo182d(C0056p0.m315a(mo218g(), i3, i4, i5, i6));
        c0036f0.mo181c(C0056p0.m315a(mo226f(), i3, i4, i5, i6));
        return c0036f0.mo180b();
    }

    @Override // p000A.C0054o0
    /* JADX INFO: renamed from: j */
    public boolean mo220j() {
        return this.f59c.isRound();
    }

    /* JADX INFO: renamed from: p */
    public void m223p(C2264c c2264c) {
        this.f61e = c2264c;
    }

    @Override // p000A.C0054o0
    /* JADX INFO: renamed from: k */
    public void mo221k(C2264c[] c2264cArr) {
    }

    @Override // p000A.C0054o0
    /* JADX INFO: renamed from: l */
    public void mo222l(C0056p0 c0056p0) {
    }
}

package p000A;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.zuxoplayer.app.R;
import p148t.C2264c;

/* JADX INFO: renamed from: A.F */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0005F {
    /* JADX INFO: renamed from: a */
    public static void m8a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C0056p0 m9b(View view, C0056p0 c0056p0, Rect rect) {
        WindowInsets windowInsetsM317b = c0056p0.m317b();
        if (windowInsetsM317b != null) {
            return C0056p0.m316c(view.computeSystemWindowInsets(windowInsetsM317b, rect), view);
        }
        rect.setEmpty();
        return c0056p0;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m10c(View view, float f, float f3, boolean z3) {
        return view.dispatchNestedFling(f, f3, z3);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m11d(View view, float f, float f3) {
        return view.dispatchNestedPreFling(f, f3);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m12e(View view, int i3, int i4, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i3, i4, iArr, iArr2);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m13f(View view, int i3, int i4, int i5, int i6, int[] iArr) {
        return view.dispatchNestedScroll(i3, i4, i5, i6, iArr);
    }

    /* JADX INFO: renamed from: g */
    public static ColorStateList m14g(View view) {
        return view.getBackgroundTintList();
    }

    /* JADX INFO: renamed from: h */
    public static PorterDuff.Mode m15h(View view) {
        return view.getBackgroundTintMode();
    }

    /* JADX INFO: renamed from: i */
    public static float m16i(View view) {
        return view.getElevation();
    }

    /* JADX INFO: renamed from: j */
    public static C0056p0 m17j(View view) {
        AbstractC0040h0 c0036f0;
        if (!AbstractC0030c0.f36d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = AbstractC0030c0.f33a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) AbstractC0030c0.f34b.get(obj);
            Rect rect2 = (Rect) AbstractC0030c0.f35c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                c0036f0 = new C0038g0();
            } else {
                c0036f0 = i3 >= 29 ? new C0036f0() : new C0032d0();
            }
            c0036f0.mo181c(C2264c.m4862a(rect.left, rect.top, rect.right, rect.bottom));
            c0036f0.mo182d(C2264c.m4862a(rect2.left, rect2.top, rect2.right, rect2.bottom));
            C0056p0 c0056p0Mo180b = c0036f0.mo180b();
            c0056p0Mo180b.f81a.mo222l(c0056p0Mo180b);
            c0056p0Mo180b.f81a.mo217d(view.getRootView());
            return c0056p0Mo180b;
        } catch (IllegalAccessException e3) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e3.getMessage(), e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m18k(View view) {
        return view.getTransitionName();
    }

    /* JADX INFO: renamed from: l */
    public static float m19l(View view) {
        return view.getTranslationZ();
    }

    /* JADX INFO: renamed from: m */
    public static float m20m(View view) {
        return view.getZ();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m21n(View view) {
        return view.hasNestedScrollingParent();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m22o(View view) {
        return view.isImportantForAccessibility();
    }

    /* JADX INFO: renamed from: p */
    public static boolean m23p(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* JADX INFO: renamed from: q */
    public static void m24q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* JADX INFO: renamed from: r */
    public static void m25r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* JADX INFO: renamed from: s */
    public static void m26s(View view, float f) {
        view.setElevation(f);
    }

    /* JADX INFO: renamed from: t */
    public static void m27t(View view, boolean z3) {
        view.setNestedScrollingEnabled(z3);
    }

    /* JADX INFO: renamed from: u */
    public static void m28u(View view, InterfaceC0059s interfaceC0059s) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, interfaceC0059s);
        }
        if (interfaceC0059s == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0004E(view, interfaceC0059s));
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m29v(View view, String str) {
        view.setTransitionName(str);
    }

    /* JADX INFO: renamed from: w */
    public static void m30w(View view, float f) {
        view.setTranslationZ(f);
    }

    /* JADX INFO: renamed from: x */
    public static void m31x(View view, float f) {
        view.setZ(f);
    }

    /* JADX INFO: renamed from: y */
    public static boolean m32y(View view, int i3) {
        return view.startNestedScroll(i3);
    }

    /* JADX INFO: renamed from: z */
    public static void m33z(View view) {
        view.stopNestedScroll();
    }
}

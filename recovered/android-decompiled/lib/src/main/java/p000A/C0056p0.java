package p000A;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;
import p148t.C2264c;

/* JADX INFO: renamed from: A.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0056p0 {

    /* JADX INFO: renamed from: b */
    public static final C0056p0 f80b;

    /* JADX INFO: renamed from: a */
    public final C0054o0 f81a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f80b = C0052n0.f72l;
        } else {
            f80b = C0054o0.f78b;
        }
    }

    public C0056p0(WindowInsets windowInsets) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            this.f81a = new C0052n0(this, windowInsets);
            return;
        }
        if (i3 >= 29) {
            this.f81a = new C0048l0(this, windowInsets);
        } else if (i3 >= 28) {
            this.f81a = new C0046k0(this, windowInsets);
        } else {
            this.f81a = new C0044j0(this, windowInsets);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C2264c m315a(C2264c c2264c, int i3, int i4, int i5, int i6) {
        int iMax = Math.max(0, c2264c.f9698a - i3);
        int iMax2 = Math.max(0, c2264c.f9699b - i4);
        int iMax3 = Math.max(0, c2264c.f9700c - i5);
        int iMax4 = Math.max(0, c2264c.f9701d - i6);
        return (iMax == i3 && iMax2 == i4 && iMax3 == i5 && iMax4 == i6) ? c2264c : C2264c.m4862a(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: renamed from: c */
    public static C0056p0 m316c(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        C0056p0 c0056p0 = new C0056p0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = AbstractC0016Q.f14a;
            C0056p0 c0056p0M34a = Build.VERSION.SDK_INT >= 23 ? AbstractC0006G.m34a(view) : AbstractC0005F.m17j(view);
            C0054o0 c0054o0 = c0056p0.f81a;
            c0054o0.mo222l(c0056p0M34a);
            c0054o0.mo217d(view.getRootView());
        }
        return c0056p0;
    }

    /* JADX INFO: renamed from: b */
    public final WindowInsets m317b() {
        C0054o0 c0054o0 = this.f81a;
        if (c0054o0 instanceof AbstractC0042i0) {
            return ((AbstractC0042i0) c0054o0).f59c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0056p0)) {
            return false;
        }
        return Objects.equals(this.f81a, ((C0056p0) obj).f81a);
    }

    public final int hashCode() {
        C0054o0 c0054o0 = this.f81a;
        if (c0054o0 == null) {
            return 0;
        }
        return c0054o0.hashCode();
    }

    public C0056p0() {
        this.f81a = new C0054o0(this);
    }
}

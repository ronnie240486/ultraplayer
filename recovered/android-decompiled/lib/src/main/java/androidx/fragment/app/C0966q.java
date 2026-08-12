package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.zuxoplayer.app.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;
import p000A.AbstractC0003D;
import p000A.AbstractC0016Q;
import p000A.C0056p0;
import p032L.AbstractC0337a;
import p045P0.AbstractC0462h;
import p091e.AbstractActivityC1479j;
import p163x2.AbstractC2364c;

/* JADX INFO: renamed from: androidx.fragment.app.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0966q extends FrameLayout {

    /* JADX INFO: renamed from: g */
    public final ArrayList f4253g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f4254h;

    /* JADX INFO: renamed from: i */
    public View.OnApplyWindowInsetsListener f4255i;

    /* JADX INFO: renamed from: j */
    public boolean f4256j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0966q(Context context, AttributeSet attributeSet, AbstractC0937C abstractC0937C) {
        super(context, attributeSet);
        AbstractC2364c.m4954e(context, "context");
        AbstractC2364c.m4954e(attributeSet, "attrs");
        AbstractC2364c.m4954e(abstractC0937C, "fm");
        this.f4253g = new ArrayList();
        this.f4254h = new ArrayList();
        this.f4256j = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i3 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0337a.f1072b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963nM2482z = abstractC0937C.m2482z(id);
        if (classAttribute != null && abstractComponentCallbacksC0963nM2482z == null) {
            if (id == -1) {
                throw new IllegalStateException(AbstractC0462h.m1166f("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            C0972w c0972wM2437C = abstractC0937C.m2437C();
            context.getClassLoader();
            AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963nM2548a = c0972wM2437C.m2548a(classAttribute);
            AbstractC2364c.m4953d(abstractComponentCallbacksC0963nM2548a, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            abstractComponentCallbacksC0963nM2548a.f4212I = true;
            C0965p c0965p = abstractComponentCallbacksC0963nM2548a.f4244y;
            if ((c0965p == null ? null : c0965p.f4248u) != null) {
                abstractComponentCallbacksC0963nM2548a.f4212I = true;
            }
            C0950a c0950a = new C0950a(abstractC0937C);
            c0950a.f4148o = true;
            abstractComponentCallbacksC0963nM2548a.f4213J = this;
            c0950a.m2511e(getId(), abstractComponentCallbacksC0963nM2548a, string);
            if (c0950a.f4140g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            AbstractC0937C abstractC0937C2 = c0950a.f4149p;
            if (abstractC0937C2.f4083t != null && !abstractC0937C2.f4057G) {
                abstractC0937C2.m2479w(true);
                c0950a.mo2429a(abstractC0937C2.f4059I, abstractC0937C2.f4060J);
                abstractC0937C2.f4065b = true;
                try {
                    abstractC0937C2.m2446P(abstractC0937C2.f4059I, abstractC0937C2.f4060J);
                    abstractC0937C2.m2460d();
                    abstractC0937C2.m2457a0();
                    if (abstractC0937C2.f4058H) {
                        abstractC0937C2.f4058H = false;
                        abstractC0937C2.m2454Y();
                    }
                    ((HashMap) abstractC0937C2.f4066c.f1868h).values().removeAll(Collections.singleton(null));
                } catch (Throwable th) {
                    abstractC0937C2.m2460d();
                    throw th;
                }
            }
        }
        ArrayList arrayListM1338f = abstractC0937C.f4066c.m1338f();
        int size = arrayListM1338f.size();
        while (i3 < size) {
            Object obj = arrayListM1338f.get(i3);
            i3++;
            int i4 = ((C0943I) obj).f4120c.f4206C;
            getId();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2544a(View view) {
        if (this.f4254h.contains(view)) {
            this.f4253g.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        AbstractC2364c.m4954e(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0963n ? (AbstractComponentCallbacksC0963n) tag : null) != null) {
            super.addView(view, i3, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C0056p0 c0056p0M316c;
        AbstractC2364c.m4954e(windowInsets, "insets");
        C0056p0 c0056p0M316c2 = C0056p0.m316c(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f4255i;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            AbstractC2364c.m4953d(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            c0056p0M316c = C0056p0.m316c(windowInsetsOnApplyWindowInsets, null);
        } else {
            WeakHashMap weakHashMap = AbstractC0016Q.f14a;
            WindowInsets windowInsetsM317b = c0056p0M316c2.m317b();
            if (windowInsetsM317b != null) {
                WindowInsets windowInsetsM6b = AbstractC0003D.m6b(this, windowInsetsM317b);
                if (!windowInsetsM6b.equals(windowInsetsM317b)) {
                    c0056p0M316c2 = C0056p0.m316c(windowInsetsM6b, this);
                }
            }
            c0056p0M316c = c0056p0M316c2;
        }
        if (!c0056p0M316c.f81a.mo227i()) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                WeakHashMap weakHashMap2 = AbstractC0016Q.f14a;
                WindowInsets windowInsetsM317b2 = c0056p0M316c.m317b();
                if (windowInsetsM317b2 != null) {
                    WindowInsets windowInsetsM5a = AbstractC0003D.m5a(childAt, windowInsetsM317b2);
                    if (!windowInsetsM5a.equals(windowInsetsM317b2)) {
                        C0056p0.m316c(windowInsetsM5a, childAt);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        AbstractC2364c.m4954e(canvas, "canvas");
        if (this.f4256j) {
            ArrayList arrayList = this.f4253g;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        AbstractC2364c.m4954e(canvas, "canvas");
        AbstractC2364c.m4954e(view, "child");
        if (this.f4256j) {
            ArrayList arrayList = this.f4253g;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        AbstractC2364c.m4954e(view, "view");
        this.f4254h.remove(view);
        if (this.f4253g.remove(view)) {
            this.f4256j = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0963n> F getFragment() {
        AbstractActivityC1479j abstractActivityC1479j;
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n;
        AbstractC0937C abstractC0937CM2533g;
        View view = this;
        while (true) {
            abstractActivityC1479j = null;
            if (view == null) {
                abstractComponentCallbacksC0963n = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            abstractComponentCallbacksC0963n = tag instanceof AbstractComponentCallbacksC0963n ? (AbstractComponentCallbacksC0963n) tag : null;
            if (abstractComponentCallbacksC0963n != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC0963n == null) {
            for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof AbstractActivityC1479j) {
                    abstractActivityC1479j = (AbstractActivityC1479j) context;
                    break;
                }
            }
            if (abstractActivityC1479j == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            abstractC0937CM2533g = ((C0965p) abstractActivityC1479j.f6611x.f38h).f4251x;
        } else {
            if (abstractComponentCallbacksC0963n.f4244y == null || !abstractComponentCallbacksC0963n.f4236q) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0963n + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            abstractC0937CM2533g = abstractComponentCallbacksC0963n.m2533g();
        }
        return (F) abstractC0937CM2533g.m2482z(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        AbstractC2364c.m4954e(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                AbstractC2364c.m4953d(childAt, "view");
                m2544a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        AbstractC2364c.m4954e(view, "view");
        m2544a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i3) {
        View childAt = getChildAt(i3);
        AbstractC2364c.m4953d(childAt, "view");
        m2544a(childAt);
        super.removeViewAt(i3);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        AbstractC2364c.m4954e(view, "view");
        m2544a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i3, int i4) {
        int i5 = i3 + i4;
        for (int i6 = i3; i6 < i5; i6++) {
            View childAt = getChildAt(i6);
            AbstractC2364c.m4953d(childAt, "view");
            m2544a(childAt);
        }
        super.removeViews(i3, i4);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i3, int i4) {
        int i5 = i3 + i4;
        for (int i6 = i3; i6 < i5; i6++) {
            View childAt = getChildAt(i6);
            AbstractC2364c.m4953d(childAt, "view");
            m2544a(childAt);
        }
        super.removeViewsInLayout(i3, i4);
    }

    public final void setDrawDisappearingViewsLast(boolean z3) {
        this.f4256j = z3;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        AbstractC2364c.m4954e(onApplyWindowInsetsListener, "listener");
        this.f4255i = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        AbstractC2364c.m4954e(view, "view");
        if (view.getParent() == this) {
            this.f4254h.add(view);
        }
        super.startViewTransition(view);
    }
}

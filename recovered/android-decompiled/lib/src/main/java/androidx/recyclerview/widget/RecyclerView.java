package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.support.v4.media.session.C0858A;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.fragment.app.AbstractC0948N;
import com.google.android.gms.internal.cast.C1323r;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000A.AbstractC0005F;
import p000A.AbstractC0007H;
import p000A.AbstractC0016Q;
import p000A.AbstractC0017S;
import p000A.AbstractC0020V;
import p000A.C0053o;
import p000A.C0058r;
import p001A0.C0069c;
import p014F.RunnableC0153b;
import p017G.C0210a;
import p022H1.C0258b;
import p030K0.C0334e;
import p060U1.AbstractC0610a;
import p089d1.C1447t;
import p100g1.AbstractC1579a;
import p104h1.AbstractC1617A;
import p104h1.AbstractC1618B;
import p104h1.AbstractC1621E;
import p104h1.AbstractC1623G;
import p104h1.AbstractC1624H;
import p104h1.AbstractC1633Q;
import p104h1.AbstractC1635T;
import p104h1.AbstractC1667x;
import p104h1.C1622F;
import p104h1.C1625I;
import p104h1.C1626J;
import p104h1.C1627K;
import p104h1.C1629M;
import p104h1.C1630N;
import p104h1.C1631O;
import p104h1.C1632P;
import p104h1.C1637V;
import p104h1.C1642a;
import p104h1.C1645b0;
import p104h1.C1651h;
import p104h1.C1655l;
import p104h1.C1656m;
import p104h1.C1666w;
import p104h1.InterfaceC1628L;
import p104h1.InterfaceC1669z;
import p104h1.InterpolatorC1665v;
import p104h1.RunnableC1634S;
import p104h1.RunnableC1658o;
import p122m1.AbstractC2003a;
import p124n.C2021h;
import p124n.C2022i;
import p157w.AbstractC2317k;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* JADX INFO: renamed from: C0 */
    public static final int[] f4706C0 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: D0 */
    public static final float f4707D0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: E0 */
    public static final boolean f4708E0;

    /* JADX INFO: renamed from: F0 */
    public static final boolean f4709F0;

    /* JADX INFO: renamed from: G0 */
    public static final Class[] f4710G0;

    /* JADX INFO: renamed from: H0 */
    public static final InterpolatorC1665v f4711H0;

    /* JADX INFO: renamed from: I0 */
    public static final C1632P f4712I0;

    /* JADX INFO: renamed from: A */
    public int f4713A;

    /* JADX INFO: renamed from: A0 */
    public int f4714A0;

    /* JADX INFO: renamed from: B */
    public boolean f4715B;

    /* JADX INFO: renamed from: B0 */
    public final C1666w f4716B0;

    /* JADX INFO: renamed from: C */
    public boolean f4717C;

    /* JADX INFO: renamed from: D */
    public boolean f4718D;

    /* JADX INFO: renamed from: E */
    public int f4719E;

    /* JADX INFO: renamed from: F */
    public final AccessibilityManager f4720F;

    /* JADX INFO: renamed from: G */
    public boolean f4721G;

    /* JADX INFO: renamed from: H */
    public boolean f4722H;

    /* JADX INFO: renamed from: I */
    public int f4723I;

    /* JADX INFO: renamed from: J */
    public int f4724J;

    /* JADX INFO: renamed from: K */
    public AbstractC1617A f4725K;

    /* JADX INFO: renamed from: L */
    public EdgeEffect f4726L;

    /* JADX INFO: renamed from: M */
    public EdgeEffect f4727M;

    /* JADX INFO: renamed from: N */
    public EdgeEffect f4728N;

    /* JADX INFO: renamed from: O */
    public EdgeEffect f4729O;

    /* JADX INFO: renamed from: P */
    public AbstractC1618B f4730P;

    /* JADX INFO: renamed from: Q */
    public int f4731Q;

    /* JADX INFO: renamed from: R */
    public int f4732R;

    /* JADX INFO: renamed from: S */
    public VelocityTracker f4733S;

    /* JADX INFO: renamed from: T */
    public int f4734T;

    /* JADX INFO: renamed from: U */
    public int f4735U;

    /* JADX INFO: renamed from: V */
    public int f4736V;

    /* JADX INFO: renamed from: W */
    public int f4737W;

    /* JADX INFO: renamed from: a0 */
    public int f4738a0;

    /* JADX INFO: renamed from: b0 */
    public final int f4739b0;

    /* JADX INFO: renamed from: c0 */
    public final int f4740c0;

    /* JADX INFO: renamed from: d0 */
    public final float f4741d0;

    /* JADX INFO: renamed from: e0 */
    public final float f4742e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f4743f0;

    /* JADX INFO: renamed from: g */
    public final float f4744g;

    /* JADX INFO: renamed from: g0 */
    public final RunnableC1634S f4745g0;

    /* JADX INFO: renamed from: h */
    public final C1629M f4746h;

    /* JADX INFO: renamed from: h0 */
    public RunnableC1658o f4747h0;

    /* JADX INFO: renamed from: i */
    public final C1627K f4748i;

    /* JADX INFO: renamed from: i0 */
    public final C1656m f4749i0;

    /* JADX INFO: renamed from: j */
    public C1630N f4750j;

    /* JADX INFO: renamed from: j0 */
    public final C1631O f4751j0;

    /* JADX INFO: renamed from: k */
    public final C0258b f4752k;

    /* JADX INFO: renamed from: k0 */
    public AbstractC1624H f4753k0;

    /* JADX INFO: renamed from: l */
    public final C0858A f4754l;

    /* JADX INFO: renamed from: l0 */
    public ArrayList f4755l0;

    /* JADX INFO: renamed from: m */
    public final C1323r f4756m;

    /* JADX INFO: renamed from: m0 */
    public boolean f4757m0;

    /* JADX INFO: renamed from: n */
    public boolean f4758n;

    /* JADX INFO: renamed from: n0 */
    public boolean f4759n0;

    /* JADX INFO: renamed from: o */
    public final Rect f4760o;

    /* JADX INFO: renamed from: o0 */
    public final C1666w f4761o0;

    /* JADX INFO: renamed from: p */
    public final Rect f4762p;

    /* JADX INFO: renamed from: p0 */
    public boolean f4763p0;

    /* JADX INFO: renamed from: q */
    public final RectF f4764q;

    /* JADX INFO: renamed from: q0 */
    public C1637V f4765q0;

    /* JADX INFO: renamed from: r */
    public AbstractC1667x f4766r;

    /* JADX INFO: renamed from: r0 */
    public final int[] f4767r0;

    /* JADX INFO: renamed from: s */
    public AbstractC1621E f4768s;

    /* JADX INFO: renamed from: s0 */
    public C0053o f4769s0;

    /* JADX INFO: renamed from: t */
    public final ArrayList f4770t;

    /* JADX INFO: renamed from: t0 */
    public final int[] f4771t0;

    /* JADX INFO: renamed from: u */
    public final ArrayList f4772u;

    /* JADX INFO: renamed from: u0 */
    public final int[] f4773u0;

    /* JADX INFO: renamed from: v */
    public final ArrayList f4774v;

    /* JADX INFO: renamed from: v0 */
    public final int[] f4775v0;

    /* JADX INFO: renamed from: w */
    public C1655l f4776w;

    /* JADX INFO: renamed from: w0 */
    public final ArrayList f4777w0;

    /* JADX INFO: renamed from: x */
    public boolean f4778x;

    /* JADX INFO: renamed from: x0 */
    public final RunnableC0153b f4779x0;

    /* JADX INFO: renamed from: y */
    public boolean f4780y;

    /* JADX INFO: renamed from: y0 */
    public boolean f4781y0;

    /* JADX INFO: renamed from: z */
    public boolean f4782z;

    /* JADX INFO: renamed from: z0 */
    public int f4783z0;

    static {
        f4708E0 = Build.VERSION.SDK_INT >= 23;
        f4709F0 = true;
        Class cls = Integer.TYPE;
        f4710G0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f4711H0 = new InterpolatorC1665v();
        f4712I0 = new C1632P();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        float fM94a;
        int i3;
        char c;
        int i4;
        char c2;
        Constructor constructor;
        super(context, attributeSet, com.zuxoplayer.app.R.attr.recyclerViewStyle);
        this.f4746h = new C1629M(this);
        this.f4748i = new C1627K(this);
        this.f4756m = new C1323r(9, (byte) 0);
        this.f4760o = new Rect();
        this.f4762p = new Rect();
        this.f4764q = new RectF();
        this.f4770t = new ArrayList();
        this.f4772u = new ArrayList();
        this.f4774v = new ArrayList();
        this.f4713A = 0;
        this.f4721G = false;
        this.f4722H = false;
        this.f4723I = 0;
        this.f4724J = 0;
        this.f4725K = f4712I0;
        C1651h c1651h = new C1651h();
        Object[] objArr = null;
        c1651h.f7338a = null;
        c1651h.f7339b = new ArrayList();
        c1651h.f7340c = 120L;
        c1651h.f7341d = 120L;
        c1651h.f7342e = 250L;
        c1651h.f7343f = 250L;
        c1651h.f7494g = true;
        c1651h.f7495h = new ArrayList();
        c1651h.f7496i = new ArrayList();
        c1651h.f7497j = new ArrayList();
        c1651h.f7498k = new ArrayList();
        c1651h.f7499l = new ArrayList();
        c1651h.f7500m = new ArrayList();
        c1651h.f7501n = new ArrayList();
        c1651h.f7502o = new ArrayList();
        c1651h.f7503p = new ArrayList();
        c1651h.f7504q = new ArrayList();
        c1651h.f7505r = new ArrayList();
        this.f4730P = c1651h;
        this.f4731Q = 0;
        this.f4732R = -1;
        this.f4741d0 = Float.MIN_VALUE;
        this.f4742e0 = Float.MIN_VALUE;
        this.f4743f0 = true;
        this.f4745g0 = new RunnableC1634S(this);
        this.f4749i0 = f4709F0 ? new C1656m() : null;
        C1631O c1631o = new C1631O();
        c1631o.f7385a = 0;
        c1631o.f7386b = 0;
        c1631o.f7387c = 1;
        c1631o.f7388d = 0;
        c1631o.f7389e = false;
        c1631o.f7390f = false;
        c1631o.f7391g = false;
        c1631o.f7392h = false;
        c1631o.f7393i = false;
        c1631o.f7394j = false;
        this.f4751j0 = c1631o;
        this.f4757m0 = false;
        this.f4759n0 = false;
        C1666w c1666w = new C1666w(this);
        this.f4761o0 = c1666w;
        this.f4763p0 = false;
        this.f4767r0 = new int[2];
        this.f4771t0 = new int[2];
        this.f4773u0 = new int[2];
        this.f4775v0 = new int[2];
        this.f4777w0 = new ArrayList();
        this.f4779x0 = new RunnableC0153b(15, this);
        this.f4783z0 = 0;
        this.f4714A0 = 0;
        this.f4716B0 = new C1666w(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4738a0 = viewConfiguration.getScaledTouchSlop();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            Method method = AbstractC0020V.f19a;
            fM94a = AbstractC0017S.m88a(viewConfiguration);
        } else {
            fM94a = AbstractC0020V.m94a(viewConfiguration, context);
        }
        this.f4741d0 = fM94a;
        this.f4742e0 = i5 >= 26 ? AbstractC0017S.m89b(viewConfiguration) : AbstractC0020V.m94a(viewConfiguration, context);
        this.f4739b0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4740c0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f4744g = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f4730P.f7338a = c1666w;
        this.f4752k = new C0258b(new C1666w(this));
        this.f4754l = new C0858A(new C1666w(this));
        WeakHashMap weakHashMap = AbstractC0016Q.f14a;
        if ((i5 >= 26 ? AbstractC0007H.m40c(this) : 0) == 0 && i5 >= 26) {
            AbstractC0007H.m50m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f4720F = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1637V(this));
        int[] iArr = AbstractC1579a.f7184a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, com.zuxoplayer.app.R.attr.recyclerViewStyle, 0);
        AbstractC0016Q.m85g(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, com.zuxoplayer.app.R.attr.recyclerViewStyle);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f4758n = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + m2790w());
            }
            Resources resources = getContext().getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(com.zuxoplayer.app.R.dimen.fastscroll_default_thickness);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(com.zuxoplayer.app.R.dimen.fastscroll_minimum_range);
            c2 = 2;
            int dimensionPixelOffset = resources.getDimensionPixelOffset(com.zuxoplayer.app.R.dimen.fastscroll_margin);
            i3 = 4;
            c = 3;
            i4 = com.zuxoplayer.app.R.attr.recyclerViewStyle;
            new C1655l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelOffset);
        } else {
            i3 = 4;
            c = 3;
            i4 = com.zuxoplayer.app.R.attr.recyclerViewStyle;
            c2 = 2;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC1621E.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(f4710G0);
                        Object[] objArr2 = new Object[i3];
                        objArr2[0] = context;
                        objArr2[1] = attributeSet;
                        objArr2[c2] = Integer.valueOf(i4);
                        objArr2[c] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e3) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e4) {
                            e4.initCause(e3);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e4);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((AbstractC1621E) constructor.newInstance(objArr));
                } catch (ClassCastException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e5);
                } catch (ClassNotFoundException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e6);
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e7);
                } catch (InstantiationException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e8);
                } catch (InvocationTargetException e9) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e9);
                }
            }
        }
        int[] iArr2 = f4706C0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, com.zuxoplayer.app.R.attr.recyclerViewStyle, 0);
        AbstractC0016Q.m85g(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, com.zuxoplayer.app.R.attr.recyclerViewStyle);
        boolean z3 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z3);
        setTag(com.zuxoplayer.app.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: B */
    public static RecyclerView m2740B(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            RecyclerView recyclerViewM2740B = m2740B(viewGroup.getChildAt(i3));
            if (recyclerViewM2740B != null) {
                return recyclerViewM2740B;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: F */
    public static AbstractC1635T m2741F(View view) {
        if (view == null) {
            return null;
        }
        return ((C1622F) view.getLayoutParams()).f7364a;
    }

    /* JADX INFO: renamed from: g */
    public static void m2746g(AbstractC1635T abstractC1635T) {
        WeakReference weakReference = abstractC1635T.f7407b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == abstractC1635T.f7406a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            abstractC1635T.f7407b = null;
        }
    }

    private C0053o getScrollingChildHelper() {
        if (this.f4769s0 == null) {
            this.f4769s0 = new C0053o(this);
        }
        return this.f4769s0;
    }

    /* JADX INFO: renamed from: j */
    public static int m2747j(int i3, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i4) {
        if (i3 > 0 && edgeEffect != null && AbstractC0610a.m1511m(edgeEffect) != 0.0f) {
            int iRound = Math.round(AbstractC0610a.m1491C(edgeEffect, ((-i3) * 4.0f) / i4, 0.5f) * ((-i4) / 4.0f));
            if (iRound != i3) {
                edgeEffect.finish();
            }
            return i3 - iRound;
        }
        if (i3 >= 0 || edgeEffect2 == null || AbstractC0610a.m1511m(edgeEffect2) == 0.0f) {
            return i3;
        }
        float f = i4;
        int iRound2 = Math.round(AbstractC0610a.m1491C(edgeEffect2, (i3 * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i3) {
            edgeEffect2.finish();
        }
        return i3 - iRound2;
    }

    /* JADX INFO: renamed from: A */
    public final void m2748A(int[] iArr) {
        int iM2155C = this.f4754l.m2155C();
        if (iM2155C == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        for (int i5 = 0; i5 < iM2155C; i5++) {
            AbstractC1635T abstractC1635TM2741F = m2741F(this.f4754l.m2154B(i5));
            if (!abstractC1635TM2741F.m4060n()) {
                int iM4048b = abstractC1635TM2741F.m4048b();
                if (iM4048b < i3) {
                    i3 = iM4048b;
                }
                if (iM4048b > i4) {
                    i4 = iM4048b;
                }
            }
        }
        iArr[0] = i3;
        iArr[1] = i4;
    }

    /* JADX INFO: renamed from: C */
    public final AbstractC1635T m2749C(int i3) {
        AbstractC1635T abstractC1635T = null;
        if (this.f4721G) {
            return null;
        }
        int iM2163K = this.f4754l.m2163K();
        for (int i4 = 0; i4 < iM2163K; i4++) {
            AbstractC1635T abstractC1635TM2741F = m2741F(this.f4754l.m2162J(i4));
            if (abstractC1635TM2741F != null && !abstractC1635TM2741F.m4053g() && m2750D(abstractC1635TM2741F) == i3) {
                if (!((ArrayList) this.f4754l.f3641j).contains(abstractC1635TM2741F.f7406a)) {
                    return abstractC1635TM2741F;
                }
                abstractC1635T = abstractC1635TM2741F;
            }
        }
        return abstractC1635T;
    }

    /* JADX INFO: renamed from: D */
    public final int m2750D(AbstractC1635T abstractC1635T) {
        if (((abstractC1635T.f7414i & 524) != 0) || !abstractC1635T.m4050d()) {
            return -1;
        }
        C0258b c0258b = this.f4752k;
        int i3 = abstractC1635T.f7408c;
        ArrayList arrayList = (ArrayList) c0258b.f664i;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C1642a c1642a = (C1642a) arrayList.get(i4);
            int i5 = c1642a.f7450a;
            if (i5 != 1) {
                if (i5 == 2) {
                    int i6 = c1642a.f7451b;
                    if (i6 <= i3) {
                        int i7 = c1642a.f7452c;
                        if (i6 + i7 > i3) {
                            return -1;
                        }
                        i3 -= i7;
                    } else {
                        continue;
                    }
                } else if (i5 == 8) {
                    int i8 = c1642a.f7451b;
                    if (i8 == i3) {
                        i3 = c1642a.f7452c;
                    } else {
                        if (i8 < i3) {
                            i3--;
                        }
                        if (c1642a.f7452c <= i3) {
                            i3++;
                        }
                    }
                }
            } else if (c1642a.f7451b <= i3) {
                i3 += c1642a.f7452c;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: E */
    public final AbstractC1635T m2751E(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m2741F(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* JADX INFO: renamed from: G */
    public final Rect m2752G(View view) {
        C1622F c1622f = (C1622F) view.getLayoutParams();
        boolean z3 = c1622f.f7366c;
        Rect rect = c1622f.f7365b;
        if (!z3 || (this.f4751j0.f7390f && (c1622f.f7364a.m4056j() || c1622f.f7364a.m4051e()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f4772u;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Rect rect2 = this.f4760o;
            rect2.set(0, 0, 0, 0);
            ((C1655l) arrayList.get(i3)).getClass();
            ((C1622F) view.getLayoutParams()).f7364a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c1622f.f7366c = false;
        return rect;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m2753H() {
        return !this.f4782z || this.f4721G || this.f4752k.m785h();
    }

    /* JADX INFO: renamed from: I */
    public final boolean m2754I() {
        return this.f4723I > 0;
    }

    /* JADX INFO: renamed from: J */
    public final void m2755J() {
        int iM2163K = this.f4754l.m2163K();
        for (int i3 = 0; i3 < iM2163K; i3++) {
            ((C1622F) this.f4754l.m2162J(i3).getLayoutParams()).f7366c = true;
        }
        ArrayList arrayList = this.f4748i.f7377c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C1622F c1622f = (C1622F) ((AbstractC1635T) arrayList.get(i4)).f7406a.getLayoutParams();
            if (c1622f != null) {
                c1622f.f7366c = true;
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m2756K(int i3, int i4, boolean z3) {
        int i5 = i3 + i4;
        int iM2163K = this.f4754l.m2163K();
        for (int i6 = 0; i6 < iM2163K; i6++) {
            AbstractC1635T abstractC1635TM2741F = m2741F(this.f4754l.m2162J(i6));
            if (abstractC1635TM2741F != null && !abstractC1635TM2741F.m4060n()) {
                int i7 = abstractC1635TM2741F.f7408c;
                C1631O c1631o = this.f4751j0;
                if (i7 >= i5) {
                    abstractC1635TM2741F.m4057k(-i4, z3);
                    c1631o.f7389e = true;
                } else if (i7 >= i3) {
                    abstractC1635TM2741F.m4047a(8);
                    abstractC1635TM2741F.m4057k(-i4, z3);
                    abstractC1635TM2741F.f7408c = i3 - 1;
                    c1631o.f7389e = true;
                }
            }
        }
        C1627K c1627k = this.f4748i;
        ArrayList arrayList = c1627k.f7377c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC1635T abstractC1635T = (AbstractC1635T) arrayList.get(size);
            if (abstractC1635T != null) {
                int i8 = abstractC1635T.f7408c;
                if (i8 >= i5) {
                    abstractC1635T.m4057k(-i4, z3);
                } else if (i8 >= i3) {
                    abstractC1635T.m4047a(8);
                    c1627k.m4037g(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: L */
    public final void m2757L() {
        this.f4723I++;
    }

    /* JADX INFO: renamed from: M */
    public final void m2758M(boolean z3) {
        int i3;
        AccessibilityManager accessibilityManager;
        int i4 = this.f4723I - 1;
        this.f4723I = i4;
        if (i4 < 1) {
            this.f4723I = 0;
            if (z3) {
                int i5 = this.f4719E;
                this.f4719E = 0;
                if (i5 != 0 && (accessibilityManager = this.f4720F) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i5);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f4777w0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    AbstractC1635T abstractC1635T = (AbstractC1635T) arrayList.get(size);
                    if (abstractC1635T.f7406a.getParent() == this && !abstractC1635T.m4060n() && (i3 = abstractC1635T.f7421p) != -1) {
                        WeakHashMap weakHashMap = AbstractC0016Q.f14a;
                        abstractC1635T.f7406a.setImportantForAccessibility(i3);
                        abstractC1635T.f7421p = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m2759N(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4732R) {
            int i3 = actionIndex == 0 ? 1 : 0;
            this.f4732R = motionEvent.getPointerId(i3);
            int x3 = (int) (motionEvent.getX(i3) + 0.5f);
            this.f4736V = x3;
            this.f4734T = x3;
            int y3 = (int) (motionEvent.getY(i3) + 0.5f);
            this.f4737W = y3;
            this.f4735U = y3;
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m2760O() {
        if (this.f4763p0 || !this.f4778x) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC0016Q.f14a;
        postOnAnimation(this.f4779x0);
        this.f4763p0 = true;
    }

    /* JADX INFO: renamed from: P */
    public final void m2761P(boolean z3) {
        this.f4722H = z3 | this.f4722H;
        this.f4721G = true;
        int iM2163K = this.f4754l.m2163K();
        for (int i3 = 0; i3 < iM2163K; i3++) {
            AbstractC1635T abstractC1635TM2741F = m2741F(this.f4754l.m2162J(i3));
            if (abstractC1635TM2741F != null && !abstractC1635TM2741F.m4060n()) {
                abstractC1635TM2741F.m4047a(6);
            }
        }
        m2755J();
        C1627K c1627k = this.f4748i;
        ArrayList arrayList = c1627k.f7377c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC1635T abstractC1635T = (AbstractC1635T) arrayList.get(i4);
            if (abstractC1635T != null) {
                abstractC1635T.m4047a(6);
                abstractC1635T.m4047a(1024);
            }
        }
        c1627k.m4036f();
    }

    /* JADX INFO: renamed from: Q */
    public final void m2762Q(AbstractC1635T abstractC1635T, C0058r c0058r) {
        abstractC1635T.f7414i &= -8193;
        boolean z3 = this.f4751j0.f7391g;
        C1323r c1323r = this.f4756m;
        if (z3 && abstractC1635T.m4056j() && !abstractC1635T.m4053g() && !abstractC1635T.m4060n()) {
            this.f4766r.getClass();
            ((C2021h) c1323r.f5962i).m4583e(abstractC1635T.f7408c, abstractC1635T);
        }
        C2022i c2022i = (C2022i) c1323r.f5961h;
        C1645b0 c1645b0M4071a = (C1645b0) c2022i.getOrDefault(abstractC1635T, null);
        if (c1645b0M4071a == null) {
            c1645b0M4071a = C1645b0.m4071a();
            c2022i.put(abstractC1635T, c1645b0M4071a);
        }
        c1645b0M4071a.f7464b = c0058r;
        c1645b0M4071a.f7463a |= 4;
    }

    /* JADX INFO: renamed from: R */
    public final int m2763R(int i3, float f) {
        float height = f / getHeight();
        float width = i3 / getWidth();
        EdgeEffect edgeEffect = this.f4726L;
        float f3 = 0.0f;
        if (edgeEffect == null || AbstractC0610a.m1511m(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f4728N;
            if (edgeEffect2 != null && AbstractC0610a.m1511m(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f4728N.onRelease();
                } else {
                    float fM1491C = AbstractC0610a.m1491C(this.f4728N, width, height);
                    if (AbstractC0610a.m1511m(this.f4728N) == 0.0f) {
                        this.f4728N.onRelease();
                    }
                    f3 = fM1491C;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f4726L.onRelease();
            } else {
                float f4 = -AbstractC0610a.m1491C(this.f4726L, -width, 1.0f - height);
                if (AbstractC0610a.m1511m(this.f4726L) == 0.0f) {
                    this.f4726L.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getWidth());
    }

    /* JADX INFO: renamed from: S */
    public final int m2764S(int i3, float f) {
        float width = f / getWidth();
        float height = i3 / getHeight();
        EdgeEffect edgeEffect = this.f4727M;
        float f3 = 0.0f;
        if (edgeEffect == null || AbstractC0610a.m1511m(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f4729O;
            if (edgeEffect2 != null && AbstractC0610a.m1511m(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f4729O.onRelease();
                } else {
                    float fM1491C = AbstractC0610a.m1491C(this.f4729O, height, 1.0f - width);
                    if (AbstractC0610a.m1511m(this.f4729O) == 0.0f) {
                        this.f4729O.onRelease();
                    }
                    f3 = fM1491C;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f4727M.onRelease();
            } else {
                float f4 = -AbstractC0610a.m1491C(this.f4727M, -height, width);
                if (AbstractC0610a.m1511m(this.f4727M) == 0.0f) {
                    this.f4727M.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getHeight());
    }

    /* JADX INFO: renamed from: T */
    public final void m2765T(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f4760o;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C1622F) {
            C1622F c1622f = (C1622F) layoutParams;
            if (!c1622f.f7366c) {
                int i3 = rect.left;
                Rect rect2 = c1622f.f7365b;
                rect.left = i3 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f4768s.m4016g0(this, view, this.f4760o, !this.f4782z, view2 == null);
    }

    /* JADX INFO: renamed from: U */
    public final void m2766U() {
        VelocityTracker velocityTracker = this.f4733S;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        m2773b0(0);
        EdgeEffect edgeEffect = this.f4726L;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f4726L.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f4727M;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f4727M.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4728N;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f4728N.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4729O;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f4729O.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = AbstractC0016Q.f14a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00df  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fa A[DONT_INVERT, PHI: r7
      0x00fa: PHI (r7v10 boolean) = (r7v8 boolean), (r7v11 boolean) binds: [B:34:0x00e1, B:32:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:41:0x0104  */
    /* JADX INFO: renamed from: V */
    public final boolean m2767V(int i3, int i4, MotionEvent motionEvent, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z3;
        boolean z4;
        m2778k();
        AbstractC1667x abstractC1667x = this.f4766r;
        int[] iArr = this.f4775v0;
        if (abstractC1667x != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            m2768W(i3, i4, iArr);
            i6 = iArr[0];
            i7 = iArr[1];
            i8 = i3 - i6;
            i9 = i4 - i7;
        } else {
            i6 = 0;
            i7 = 0;
            i8 = 0;
            i9 = 0;
        }
        if (!this.f4772u.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        m2784q(i6, i7, i8, i9, this.f4771t0, i5, iArr);
        int i10 = iArr[0];
        int i11 = i8 - i10;
        int i12 = iArr[1];
        int i13 = i9 - i12;
        boolean z5 = (i10 == 0 && i12 == 0) ? false : true;
        int i14 = this.f4736V;
        int[] iArr2 = this.f4771t0;
        int i15 = iArr2[0];
        this.f4736V = i14 - i15;
        int i16 = this.f4737W;
        int i17 = iArr2[1];
        this.f4737W = i16 - i17;
        int[] iArr3 = this.f4773u0;
        iArr3[0] = iArr3[0] + i15;
        iArr3[1] = iArr3[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || (motionEvent.getSource() & 8194) == 8194) {
                z3 = true;
            } else {
                float x3 = motionEvent.getX();
                float f = i11;
                float y3 = motionEvent.getY();
                float f3 = i13;
                if (f < 0.0f) {
                    m2787t();
                    z3 = true;
                    AbstractC0610a.m1491C(this.f4726L, (-f) / getWidth(), 1.0f - (y3 / getHeight()));
                } else {
                    z3 = true;
                    if (f > 0.0f) {
                        m2788u();
                        AbstractC0610a.m1491C(this.f4728N, f / getWidth(), y3 / getHeight());
                    } else {
                        z4 = false;
                    }
                    if (f3 < 0.0f) {
                        m2789v();
                        AbstractC0610a.m1491C(this.f4727M, (-f3) / getHeight(), x3 / getWidth());
                    } else if (f3 > 0.0f) {
                        m2786s();
                        AbstractC0610a.m1491C(this.f4729O, f3 / getHeight(), 1.0f - (x3 / getWidth()));
                    } else if (z4 || f != 0.0f || f3 != 0.0f) {
                        WeakHashMap weakHashMap = AbstractC0016Q.f14a;
                        postInvalidateOnAnimation();
                    }
                    z4 = true;
                    if (z4) {
                        WeakHashMap weakHashMap2 = AbstractC0016Q.f14a;
                        postInvalidateOnAnimation();
                    } else {
                        WeakHashMap weakHashMap3 = AbstractC0016Q.f14a;
                        postInvalidateOnAnimation();
                    }
                }
                z4 = true;
                if (f3 < 0.0f) {
                    m2789v();
                    AbstractC0610a.m1491C(this.f4727M, (-f3) / getHeight(), x3 / getWidth());
                } else if (f3 > 0.0f) {
                    m2786s();
                    AbstractC0610a.m1491C(this.f4729O, f3 / getHeight(), 1.0f - (x3 / getWidth()));
                } else if (z4) {
                    WeakHashMap weakHashMap4 = AbstractC0016Q.f14a;
                    postInvalidateOnAnimation();
                } else {
                    WeakHashMap weakHashMap5 = AbstractC0016Q.f14a;
                    postInvalidateOnAnimation();
                }
                z4 = true;
                if (z4) {
                    WeakHashMap weakHashMap6 = AbstractC0016Q.f14a;
                    postInvalidateOnAnimation();
                } else {
                    WeakHashMap weakHashMap7 = AbstractC0016Q.f14a;
                    postInvalidateOnAnimation();
                }
            }
            m2777i(i3, i4);
        } else {
            z3 = true;
        }
        if (i6 != 0 || i7 != 0) {
            m2785r(i6, i7);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z5 && i6 == 0 && i7 == 0) {
            return false;
        }
        return z3;
    }

    /* JADX INFO: renamed from: W */
    public final void m2768W(int i3, int i4, int[] iArr) {
        AbstractC1635T abstractC1635T;
        C0858A c0858a = this.f4754l;
        m2771Z();
        m2757L();
        int i5 = AbstractC2317k.f9837a;
        Trace.beginSection("RV Scroll");
        C1631O c1631o = this.f4751j0;
        m2791x(c1631o);
        C1627K c1627k = this.f4748i;
        int iMo2690i0 = i3 != 0 ? this.f4768s.mo2690i0(i3, c1627k, c1631o) : 0;
        int iMo2692j0 = i4 != 0 ? this.f4768s.mo2692j0(i4, c1627k, c1631o) : 0;
        Trace.endSection();
        int iM2155C = c0858a.m2155C();
        for (int i6 = 0; i6 < iM2155C; i6++) {
            View viewM2154B = c0858a.m2154B(i6);
            AbstractC1635T abstractC1635TM2751E = m2751E(viewM2154B);
            if (abstractC1635TM2751E != null && (abstractC1635T = abstractC1635TM2751E.f7413h) != null) {
                int left = viewM2154B.getLeft();
                int top = viewM2154B.getTop();
                View view = abstractC1635T.f7406a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        m2758M(true);
        m2772a0(false);
        if (iArr != null) {
            iArr[0] = iMo2690i0;
            iArr[1] = iMo2692j0;
        }
    }

    /* JADX INFO: renamed from: X */
    public final boolean m2769X(EdgeEffect edgeEffect, int i3, int i4) {
        if (i3 > 0) {
            return true;
        }
        float fM1511m = AbstractC0610a.m1511m(edgeEffect) * i4;
        float fAbs = Math.abs(-i3) * 0.35f;
        float f = this.f4744g * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d3 = f4707D0;
        return ((float) (Math.exp((d3 / (d3 - 1.0d)) * dLog) * ((double) f))) < fM1511m;
    }

    /* JADX INFO: renamed from: Y */
    public final void m2770Y(int i3, int i4, boolean z3) {
        AbstractC1621E abstractC1621E = this.f4768s;
        if (abstractC1621E == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f4717C) {
            return;
        }
        int i5 = !abstractC1621E.mo2726c() ? 0 : i3;
        int i6 = !this.f4768s.mo2727d() ? 0 : i4;
        if (i5 == 0 && i6 == 0) {
            return;
        }
        if (z3) {
            int i7 = i5 != 0 ? 1 : 0;
            if (i6 != 0) {
                i7 |= 2;
            }
            getScrollingChildHelper().m308g(i7, 1);
        }
        RunnableC1634S runnableC1634S = this.f4745g0;
        RecyclerView recyclerView = runnableC1634S.f7404m;
        int iAbs = Math.abs(i5);
        int iAbs2 = Math.abs(i6);
        boolean z4 = iAbs > iAbs2;
        int width = z4 ? recyclerView.getWidth() : recyclerView.getHeight();
        if (!z4) {
            iAbs = iAbs2;
        }
        int iMin = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        Interpolator interpolator = runnableC1634S.f7401j;
        InterpolatorC1665v interpolatorC1665v = f4711H0;
        if (interpolator != interpolatorC1665v) {
            runnableC1634S.f7401j = interpolatorC1665v;
            runnableC1634S.f7400i = new OverScroller(recyclerView.getContext(), interpolatorC1665v);
        }
        runnableC1634S.f7399h = 0;
        runnableC1634S.f7398g = 0;
        recyclerView.setScrollState(2);
        runnableC1634S.f7400i.startScroll(0, 0, i5, i6, iMin);
        if (Build.VERSION.SDK_INT < 23) {
            runnableC1634S.f7400i.computeScrollOffset();
        }
        if (runnableC1634S.f7402k) {
            runnableC1634S.f7403l = true;
            return;
        }
        RecyclerView recyclerView2 = runnableC1634S.f7404m;
        recyclerView2.removeCallbacks(runnableC1634S);
        WeakHashMap weakHashMap = AbstractC0016Q.f14a;
        recyclerView2.postOnAnimation(runnableC1634S);
    }

    /* JADX INFO: renamed from: Z */
    public final void m2771Z() {
        int i3 = this.f4713A + 1;
        this.f4713A = i3;
        if (i3 != 1 || this.f4717C) {
            return;
        }
        this.f4715B = false;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m2772a0(boolean z3) {
        if (this.f4713A < 1) {
            this.f4713A = 1;
        }
        if (!z3 && !this.f4717C) {
            this.f4715B = false;
        }
        if (this.f4713A == 1) {
            if (z3 && this.f4715B && !this.f4717C && this.f4768s != null && this.f4766r != null) {
                m2780m();
            }
            if (!this.f4717C) {
                this.f4715B = false;
            }
        }
        this.f4713A--;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i3, int i4) {
        AbstractC1621E abstractC1621E = this.f4768s;
        if (abstractC1621E != null) {
            abstractC1621E.getClass();
        }
        super.addFocusables(arrayList, i3, i4);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m2773b0(int i3) {
        getScrollingChildHelper().m309h(i3);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1622F) && this.f4768s.mo2689e((C1622F) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC1621E abstractC1621E = this.f4768s;
        if (abstractC1621E != null && abstractC1621E.mo2726c()) {
            return this.f4768s.mo2730i(this.f4751j0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC1621E abstractC1621E = this.f4768s;
        if (abstractC1621E != null && abstractC1621E.mo2726c()) {
            return this.f4768s.mo2691j(this.f4751j0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC1621E abstractC1621E = this.f4768s;
        if (abstractC1621E != null && abstractC1621E.mo2726c()) {
            return this.f4768s.mo2693k(this.f4751j0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC1621E abstractC1621E = this.f4768s;
        if (abstractC1621E != null && abstractC1621E.mo2727d()) {
            return this.f4768s.mo2731l(this.f4751j0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC1621E abstractC1621E = this.f4768s;
        if (abstractC1621E != null && abstractC1621E.mo2727d()) {
            return this.f4768s.mo2694m(this.f4751j0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC1621E abstractC1621E = this.f4768s;
        if (abstractC1621E != null && abstractC1621E.mo2727d()) {
            return this.f4768s.mo2696n(this.f4751j0);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f3, boolean z3) {
        return getScrollingChildHelper().m302a(f, f3, z3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f3) {
        return getScrollingChildHelper().m303b(f, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i3, int i4, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m304c(i3, i4, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i3, int i4, int i5, int i6, int[] iArr) {
        return getScrollingChildHelper().m305d(i3, i4, i5, i6, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z3;
        super.draw(canvas);
        ArrayList arrayList = this.f4772u;
        int size = arrayList.size();
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            C1655l c1655l = (C1655l) arrayList.get(i3);
            if (c1655l.f7530q != c1655l.f7532s.getWidth() || c1655l.f7531r != c1655l.f7532s.getHeight()) {
                c1655l.f7530q = c1655l.f7532s.getWidth();
                c1655l.f7531r = c1655l.f7532s.getHeight();
                c1655l.m4081d(0);
            } else if (c1655l.f7512A != 0) {
                if (c1655l.f7533t) {
                    int i4 = c1655l.f7530q;
                    int i5 = c1655l.f7518e;
                    int i6 = i4 - i5;
                    int i7 = c1655l.f7525l;
                    int i8 = c1655l.f7524k;
                    int i9 = i7 - (i8 / 2);
                    StateListDrawable stateListDrawable = c1655l.f7516c;
                    stateListDrawable.setBounds(0, 0, i5, i8);
                    int i10 = c1655l.f7531r;
                    Drawable drawable = c1655l.f7517d;
                    drawable.setBounds(0, 0, c1655l.f7519f, i10);
                    RecyclerView recyclerView = c1655l.f7532s;
                    WeakHashMap weakHashMap = AbstractC0016Q.f14a;
                    if (recyclerView.getLayoutDirection() == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i5, i9);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        canvas.translate(-i5, -i9);
                    } else {
                        canvas.translate(i6, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i9);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i6, -i9);
                    }
                }
                if (c1655l.f7534u) {
                    int i11 = c1655l.f7531r;
                    int i12 = c1655l.f7522i;
                    int i13 = i11 - i12;
                    int i14 = c1655l.f7528o;
                    int i15 = c1655l.f7527n;
                    int i16 = i14 - (i15 / 2);
                    StateListDrawable stateListDrawable2 = c1655l.f7520g;
                    stateListDrawable2.setBounds(0, 0, i15, i12);
                    int i17 = c1655l.f7530q;
                    Drawable drawable2 = c1655l.f7521h;
                    drawable2.setBounds(0, 0, i17, c1655l.f7523j);
                    canvas.translate(0.0f, i13);
                    drawable2.draw(canvas);
                    canvas.translate(i16, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i16, -i13);
                }
            }
        }
        EdgeEffect edgeEffect = this.f4726L;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z3 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f4758n ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f4726L;
            z3 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f4727M;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f4758n) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f4727M;
            z3 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f4728N;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f4758n ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f4728N;
            z3 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f4729O;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f4758n) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f4729O;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z3 |= z4;
            canvas.restoreToCount(iSave4);
        }
        if ((z3 || this.f4730P == null || arrayList.size() <= 0 || !this.f4730P.mo3995f()) ? z3 : true) {
            WeakHashMap weakHashMap2 = AbstractC0016Q.f14a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return super.drawChild(canvas, view, j3);
    }

    /* JADX INFO: renamed from: e */
    public final void m2774e(AbstractC1635T abstractC1635T) {
        View view = abstractC1635T.f7406a;
        boolean z3 = view.getParent() == this;
        this.f4748i.m4042l(m2751E(view));
        if (abstractC1635T.m4055i()) {
            this.f4754l.m2178q(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z3) {
            this.f4754l.m2177o(view, -1, true);
            return;
        }
        C0858A c0858a = this.f4754l;
        int iIndexOfChild = ((C1666w) c0858a.f3639h).f7586a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            ((C0069c) c0858a.f3640i).m354z(iIndexOfChild);
            c0858a.m2166N(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2775f(String str) {
        if (m2754I()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m2790w());
        }
        if (this.f4724J > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + m2790w()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x01a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:137:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    /* JADX WARN: Code duplicated, block: B:72:0x00dd  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i3) {
        View viewMo2670N;
        int i4;
        byte b3;
        boolean z3;
        this.f4768s.getClass();
        boolean z4 = true;
        boolean z5 = (this.f4766r == null || this.f4768s == null || m2754I() || this.f4717C) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        C1631O c1631o = this.f4751j0;
        C1627K c1627k = this.f4748i;
        if (z5 && (i3 == 2 || i3 == 1)) {
            if (this.f4768s.mo2727d()) {
                if (focusFinder.findNextFocus(this, view, i3 == 2 ? 130 : 33) == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            if (!z3 && this.f4768s.mo2726c()) {
                RecyclerView recyclerView = this.f4768s.f7351b;
                WeakHashMap weakHashMap = AbstractC0016Q.f14a;
                z3 = focusFinder.findNextFocus(this, view, (recyclerView.getLayoutDirection() == 1) ^ (i3 == 2) ? 66 : 17) == null;
            }
            if (z3) {
                m2778k();
                if (m2792y(view) != null) {
                    m2771Z();
                    this.f4768s.mo2670N(view, i3, c1627k, c1631o);
                    m2772a0(false);
                }
                return null;
            }
            viewMo2670N = focusFinder.findNextFocus(this, view, i3);
            if (viewMo2670N == null) {
            }
            if (viewMo2670N != null) {
                z4 = false;
            } else {
                z4 = false;
            }
            if (z4) {
                return viewMo2670N;
            }
            return super.focusSearch(view, i3);
        }
        View viewFindNextFocus = focusFinder.findNextFocus(this, view, i3);
        if (viewFindNextFocus == null && z5) {
            m2778k();
            if (m2792y(view) != null) {
                m2771Z();
                viewMo2670N = this.f4768s.mo2670N(view, i3, c1627k, c1631o);
                m2772a0(false);
            }
            return null;
        }
        viewMo2670N = viewFindNextFocus;
        if (viewMo2670N == null && !viewMo2670N.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i3);
            }
            m2765T(viewMo2670N, null);
            return view;
        }
        if (viewMo2670N != null || viewMo2670N == this || viewMo2670N == view || m2792y(viewMo2670N) == null) {
            z4 = false;
        } else if (view != null && m2792y(view) != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            Rect rect = this.f4760o;
            rect.set(0, 0, width, height);
            int width2 = viewMo2670N.getWidth();
            int height2 = viewMo2670N.getHeight();
            Rect rect2 = this.f4762p;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(viewMo2670N, rect2);
            RecyclerView recyclerView2 = this.f4768s.f7351b;
            WeakHashMap weakHashMap2 = AbstractC0016Q.f14a;
            int i5 = recyclerView2.getLayoutDirection() == 1 ? -1 : 1;
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                i4 = 1;
            } else {
                int i8 = rect.right;
                int i9 = rect2.right;
                i4 = ((i8 > i9 || i6 >= i9) && i6 > i7) ? -1 : 0;
            }
            int i10 = rect.top;
            int i11 = rect2.top;
            if ((i10 < i11 || rect.bottom <= i11) && rect.bottom < rect2.bottom) {
                b3 = 1;
            } else {
                int i12 = rect.bottom;
                int i13 = rect2.bottom;
                b3 = ((i12 > i13 || i10 >= i13) && i10 > i11) ? (byte) -1 : (byte) 0;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 17) {
                        if (i3 != 33) {
                            if (i3 != 66) {
                                if (i3 != 130) {
                                    throw new IllegalArgumentException("Invalid direction: " + i3 + m2790w());
                                }
                                if (b3 <= 0) {
                                    z4 = false;
                                }
                            } else if (i4 <= 0) {
                                z4 = false;
                            }
                        } else if (b3 >= 0) {
                            z4 = false;
                        }
                    } else if (i4 >= 0) {
                        z4 = false;
                    }
                } else if (b3 <= 0 && (b3 != 0 || i4 * i5 <= 0)) {
                    z4 = false;
                }
            } else if (b3 >= 0 && (b3 != 0 || i4 * i5 >= 0)) {
                z4 = false;
            }
        }
        if (z4) {
            return viewMo2670N;
        }
        return super.focusSearch(view, i3);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC1621E abstractC1621E = this.f4768s;
        if (abstractC1621E != null) {
            return abstractC1621E.mo2697q();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m2790w());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC1621E abstractC1621E = this.f4768s;
        if (abstractC1621E != null) {
            return abstractC1621E.mo2698r(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m2790w());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC1667x getAdapter() {
        return this.f4766r;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC1621E abstractC1621E = this.f4768s;
        if (abstractC1621E == null) {
            return super.getBaseline();
        }
        abstractC1621E.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i3, int i4) {
        return super.getChildDrawingOrder(i3, i4);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f4758n;
    }

    public C1637V getCompatAccessibilityDelegate() {
        return this.f4765q0;
    }

    public AbstractC1617A getEdgeEffectFactory() {
        return this.f4725K;
    }

    public AbstractC1618B getItemAnimator() {
        return this.f4730P;
    }

    public int getItemDecorationCount() {
        return this.f4772u.size();
    }

    public AbstractC1621E getLayoutManager() {
        return this.f4768s;
    }

    public int getMaxFlingVelocity() {
        return this.f4740c0;
    }

    public int getMinFlingVelocity() {
        return this.f4739b0;
    }

    public long getNanoTime() {
        if (f4709F0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC1623G getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f4743f0;
    }

    public C1626J getRecycledViewPool() {
        return this.f4748i.m4033c();
    }

    public int getScrollState() {
        return this.f4731Q;
    }

    /* JADX INFO: renamed from: h */
    public final void m2776h() {
        int iM2163K = this.f4754l.m2163K();
        for (int i3 = 0; i3 < iM2163K; i3++) {
            AbstractC1635T abstractC1635TM2741F = m2741F(this.f4754l.m2162J(i3));
            if (!abstractC1635TM2741F.m4060n()) {
                abstractC1635TM2741F.f7409d = -1;
                abstractC1635TM2741F.f7411f = -1;
            }
        }
        C1627K c1627k = this.f4748i;
        ArrayList arrayList = c1627k.f7377c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC1635T abstractC1635T = (AbstractC1635T) arrayList.get(i4);
            abstractC1635T.f7409d = -1;
            abstractC1635T.f7411f = -1;
        }
        ArrayList arrayList2 = c1627k.f7375a;
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            AbstractC1635T abstractC1635T2 = (AbstractC1635T) arrayList2.get(i5);
            abstractC1635T2.f7409d = -1;
            abstractC1635T2.f7411f = -1;
        }
        ArrayList arrayList3 = c1627k.f7376b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i6 = 0; i6 < size3; i6++) {
                AbstractC1635T abstractC1635T3 = (AbstractC1635T) c1627k.f7376b.get(i6);
                abstractC1635T3.f7409d = -1;
                abstractC1635T3.f7411f = -1;
            }
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m307f(0);
    }

    /* JADX INFO: renamed from: i */
    public final void m2777i(int i3, int i4) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f4726L;
        if (edgeEffect == null || edgeEffect.isFinished() || i3 <= 0) {
            zIsFinished = false;
        } else {
            this.f4726L.onRelease();
            zIsFinished = this.f4726L.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f4728N;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i3 < 0) {
            this.f4728N.onRelease();
            zIsFinished |= this.f4728N.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4727M;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i4 > 0) {
            this.f4727M.onRelease();
            zIsFinished |= this.f4727M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4729O;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i4 < 0) {
            this.f4729O.onRelease();
            zIsFinished |= this.f4729O.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = AbstractC0016Q.f14a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f4778x;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f4717C;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f76d;
    }

    /* JADX INFO: renamed from: k */
    public final void m2778k() {
        C0258b c0258b = this.f4752k;
        if (!this.f4782z || this.f4721G) {
            int i3 = AbstractC2317k.f9837a;
            Trace.beginSection("RV FullInvalidate");
            m2780m();
            Trace.endSection();
            return;
        }
        if (c0258b.m785h()) {
            c0258b.getClass();
            if (c0258b.m785h()) {
                int i4 = AbstractC2317k.f9837a;
                Trace.beginSection("RV FullInvalidate");
                m2780m();
                Trace.endSection();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2779l(int i3, int i4) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = AbstractC0016Q.f14a;
        setMeasuredDimension(AbstractC1621E.m4004f(i3, paddingRight, getMinimumWidth()), AbstractC1621E.m4004f(i4, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code duplicated, block: B:162:0x034e  */
    /* JADX WARN: Code duplicated, block: B:164:0x0354  */
    /* JADX WARN: Code duplicated, block: B:167:0x0361  */
    /* JADX WARN: Code duplicated, block: B:170:0x0366  */
    /* JADX WARN: Code duplicated, block: B:173:0x036e  */
    /* JADX WARN: Code duplicated, block: B:176:0x0375  */
    /* JADX WARN: Code duplicated, block: B:179:0x037f A[LOOP:4: B:172:0x036c->B:179:0x037f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:182:0x038c  */
    /* JADX WARN: Code duplicated, block: B:185:0x0393  */
    /* JADX WARN: Code duplicated, block: B:188:0x039d A[LOOP:5: B:181:0x038a->B:188:0x039d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:189:0x03a0 A[EDGE_INSN: B:189:0x03a0->B:190:0x03a2 BREAK  A[LOOP:5: B:181:0x038a->B:188:0x039d]] */
    /* JADX WARN: Code duplicated, block: B:191:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:216:0x037d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0382 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x0382 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x03a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x03a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x039b A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: m */
    public final void m2780m() {
        View view;
        int i3;
        View viewFindViewById;
        int i4;
        int iM4045b;
        int i5;
        int iMin;
        AbstractC1635T abstractC1635TM2749C;
        View view2;
        AbstractC1635T abstractC1635TM2749C2;
        View view3;
        C0058r c0058r;
        ?? r3;
        boolean zM4073g;
        if (this.f4766r == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f4768s == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        C1631O c1631o = this.f4751j0;
        boolean z3 = false;
        c1631o.f7392h = false;
        boolean z4 = this.f4781y0 && !(this.f4783z0 == getWidth() && this.f4714A0 == getHeight());
        this.f4783z0 = 0;
        this.f4714A0 = 0;
        this.f4781y0 = false;
        if (c1631o.f7387c == 1) {
            m2781n();
            this.f4768s.m4018k0(this);
            m2782o();
        } else {
            C0258b c0258b = this.f4752k;
            if ((((ArrayList) c0258b.f665j).isEmpty() || ((ArrayList) c0258b.f664i).isEmpty()) && !z4 && this.f4768s.f7362m == getWidth() && this.f4768s.f7363n == getHeight()) {
                this.f4768s.m4018k0(this);
            } else {
                this.f4768s.m4018k0(this);
                m2782o();
            }
        }
        int i6 = 4;
        c1631o.m4044a(4);
        m2771Z();
        m2757L();
        c1631o.f7387c = 1;
        boolean z5 = c1631o.f7393i;
        Long l3 = null;
        C1627K c1627k = this.f4748i;
        C1323r c1323r = this.f4756m;
        if (z5) {
            int iM2155C = this.f4754l.m2155C() - 1;
            while (iM2155C >= 0) {
                AbstractC1635T abstractC1635TM2741F = m2741F(this.f4754l.m2154B(iM2155C));
                if (!abstractC1635TM2741F.m4060n()) {
                    this.f4766r.getClass();
                    long j3 = abstractC1635TM2741F.f7408c;
                    this.f4730P.getClass();
                    C0058r c0058r2 = new C0058r();
                    c0058r2.m320b(abstractC1635TM2741F);
                    AbstractC1635T abstractC1635T = (AbstractC1635T) ((C2021h) c1323r.f5962i).m4582d(j3, l3);
                    if (abstractC1635T == null || abstractC1635T.m4060n()) {
                        c1323r.m3386t(abstractC1635TM2741F, c0058r2);
                    } else {
                        C2022i c2022i = (C2022i) c1323r.f5961h;
                        C1645b0 c1645b0 = (C1645b0) c2022i.getOrDefault(abstractC1635T, l3);
                        boolean z6 = (c1645b0 == null || (c1645b0.f7463a & 1) == 0) ? false : true;
                        C1645b0 c1645b1 = (C1645b0) c2022i.getOrDefault(abstractC1635TM2741F, l3);
                        boolean z7 = (c1645b1 == null || (c1645b1.f7463a & 1) == 0) ? false : true;
                        if (z6 && abstractC1635T == abstractC1635TM2741F) {
                            c1323r.m3386t(abstractC1635TM2741F, c0058r2);
                        } else {
                            C0058r c0058rM3363K = c1323r.m3363K(abstractC1635T, i6);
                            c1323r.m3386t(abstractC1635TM2741F, c0058r2);
                            C0058r c0058rM3363K2 = c1323r.m3363K(abstractC1635TM2741F, 8);
                            if (c0058rM3363K == null) {
                                int i7 = 0;
                                for (int iM2155C2 = this.f4754l.m2155C(); i7 < iM2155C2; iM2155C2 = iM2155C2) {
                                    AbstractC1635T abstractC1635TM2741F2 = m2741F(this.f4754l.m2154B(i7));
                                    if (abstractC1635TM2741F2 != abstractC1635TM2741F) {
                                        this.f4766r.getClass();
                                        if (abstractC1635TM2741F2.f7408c == j3) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + abstractC1635TM2741F2 + " \n View Holder 2:" + abstractC1635TM2741F + m2790w());
                                        }
                                    }
                                    i7++;
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC1635T + " cannot be found but it is necessary for " + abstractC1635TM2741F + m2790w());
                            } else {
                                abstractC1635T.m4059m(false);
                                if (z6) {
                                    m2774e(abstractC1635T);
                                }
                                if (abstractC1635T != abstractC1635TM2741F) {
                                    if (z7) {
                                        m2774e(abstractC1635TM2741F);
                                    }
                                    abstractC1635T.f7412g = abstractC1635TM2741F;
                                    m2774e(abstractC1635T);
                                    c1627k.m4042l(abstractC1635T);
                                    abstractC1635TM2741F.m4059m(false);
                                    abstractC1635TM2741F.f7413h = abstractC1635T;
                                }
                                if (this.f4730P.mo3991a(abstractC1635T, abstractC1635TM2741F, c0058rM3363K, c0058rM3363K2)) {
                                    m2760O();
                                }
                            }
                        }
                    }
                }
                iM2155C--;
                i6 = 4;
                l3 = null;
            }
            C2022i c2022i2 = (C2022i) c1323r.f5961h;
            int i8 = c2022i2.f8791i - 1;
            while (i8 >= 0) {
                AbstractC1635T abstractC1635T2 = (AbstractC1635T) c2022i2.m4590g(i8);
                C1645b0 c1645b2 = (C1645b0) c2022i2.m4591h(i8);
                int i9 = c1645b2.f7463a;
                int i10 = i9 & 3;
                C1666w c1666w = this.f4716B0;
                if (i10 == 3) {
                    RecyclerView recyclerView = c1666w.f7586a;
                    recyclerView.f4768s.m4014e0(abstractC1635T2.f7406a, recyclerView.f4748i);
                    r3 = z3;
                } else if ((i9 & 1) != 0) {
                    C0058r c0058r3 = c1645b2.f7464b;
                    if (c0058r3 == null) {
                        RecyclerView recyclerView2 = c1666w.f7586a;
                        recyclerView2.f4768s.m4014e0(abstractC1635T2.f7406a, recyclerView2.f4748i);
                        r3 = z3;
                    } else {
                        c1666w.m4098g(abstractC1635T2, c0058r3, c1645b2.f7465c);
                        r3 = z3;
                    }
                } else if ((i9 & 14) == 14) {
                    c1666w.m4097f(abstractC1635T2, c1645b2.f7464b, c1645b2.f7465c);
                    r3 = z3;
                } else {
                    if ((i9 & 12) == 12) {
                        C0058r c0058r4 = c1645b2.f7464b;
                        C0058r c0058r5 = c1645b2.f7465c;
                        c1666w.getClass();
                        abstractC1635T2.m4059m(z3);
                        RecyclerView recyclerView3 = c1666w.f7586a;
                        if (!recyclerView3.f4721G) {
                            C1651h c1651h = (C1651h) recyclerView3.f4730P;
                            c1651h.getClass();
                            int i11 = c0058r4.f82a;
                            int i12 = c0058r5.f82a;
                            if (i11 == i12 && c0058r4.f83b == c0058r5.f83b) {
                                c1651h.m3992c(abstractC1635T2);
                                zM4073g = false;
                            } else {
                                zM4073g = c1651h.m4073g(abstractC1635T2, i11, c0058r4.f83b, i12, c0058r5.f83b);
                            }
                            if (zM4073g) {
                                recyclerView3.m2760O();
                            }
                        } else if (recyclerView3.f4730P.mo3991a(abstractC1635T2, abstractC1635T2, c0058r4, c0058r5)) {
                            recyclerView3.m2760O();
                        }
                        r3 = 0;
                    } else {
                        if ((i9 & 4) != 0) {
                            c0058r = null;
                            c1666w.m4098g(abstractC1635T2, c1645b2.f7464b, null);
                        } else {
                            c0058r = null;
                            if ((i9 & 8) != 0) {
                                c1666w.m4097f(abstractC1635T2, c1645b2.f7464b, c1645b2.f7465c);
                            }
                        }
                        r3 = 0;
                    }
                    c1645b2.f7463a = r3;
                    c1645b2.f7464b = c0058r;
                    c1645b2.f7465c = c0058r;
                    C1645b0.f7462d.m932l(c1645b2);
                    i8--;
                    z3 = false;
                }
                c0058r = null;
                c1645b2.f7463a = r3;
                c1645b2.f7464b = c0058r;
                c1645b2.f7465c = c0058r;
                C1645b0.f7462d.m932l(c1645b2);
                i8--;
                z3 = false;
            }
        }
        this.f4768s.m4013d0(c1627k);
        c1631o.f7385a = c1631o.f7388d;
        this.f4721G = false;
        this.f4722H = false;
        c1631o.f7393i = false;
        c1631o.f7394j = false;
        this.f4768s.f7354e = false;
        ArrayList arrayList = c1627k.f7376b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC1621E abstractC1621E = this.f4768s;
        if (abstractC1621E.f7359j) {
            abstractC1621E.f7358i = 0;
            abstractC1621E.f7359j = false;
            c1627k.m4043m();
        }
        this.f4768s.mo2683Y(c1631o);
        m2758M(true);
        m2772a0(false);
        ((C2022i) c1323r.f5961h).clear();
        C2021h c2021h = (C2021h) c1323r.f5962i;
        int i13 = c2021h.f8784j;
        Object[] objArr = c2021h.f8783i;
        for (int i14 = 0; i14 < i13; i14++) {
            objArr[i14] = null;
        }
        c2021h.f8784j = 0;
        c2021h.f8781g = false;
        int[] iArr = this.f4767r0;
        int i15 = iArr[0];
        int i16 = iArr[1];
        m2748A(iArr);
        if ((iArr[0] == i15 && iArr[1] == i16) ? false : true) {
            m2785r(0, 0);
        }
        if (this.f4743f0 && this.f4766r != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                if (c1631o.f7396l != -1) {
                    this.f4766r.getClass();
                }
                if (this.f4754l.m2155C() <= 0) {
                    view = null;
                    break;
                }
                i4 = c1631o.f7395k;
                if (i4 == -1) {
                    i4 = 0;
                }
                iM4045b = c1631o.m4045b();
                i5 = i4;
                while (true) {
                    if (i5 >= iM4045b) {
                        abstractC1635TM2749C2 = m2749C(i5);
                        if (abstractC1635TM2749C2 == null) {
                            view3 = abstractC1635TM2749C2.f7406a;
                            if (view3.hasFocusable()) {
                                view = view3;
                            } else {
                                i5++;
                            }
                        }
                    }
                    iMin = Math.min(iM4045b, i4) - 1;
                    while (true) {
                        if (iMin < 0) {
                            abstractC1635TM2749C = m2749C(iMin);
                            if (abstractC1635TM2749C == null) {
                                view2 = abstractC1635TM2749C.f7406a;
                                if (view2.hasFocusable()) {
                                    view = view2;
                                    break;
                                }
                                iMin--;
                            }
                        }
                        view = null;
                        break;
                    }
                }
                if (view != null) {
                    i3 = c1631o.f7397m;
                    if (i3 != -1) {
                        view = viewFindViewById;
                    }
                    view.requestFocus();
                }
            } else if (((ArrayList) this.f4754l.f3641j).contains(getFocusedChild())) {
                if (c1631o.f7396l != -1) {
                    this.f4766r.getClass();
                }
                if (this.f4754l.m2155C() <= 0) {
                    view = null;
                    break;
                }
                i4 = c1631o.f7395k;
                if (i4 == -1) {
                    i4 = 0;
                }
                iM4045b = c1631o.m4045b();
                i5 = i4;
                while (true) {
                    if (i5 >= iM4045b) {
                        abstractC1635TM2749C2 = m2749C(i5);
                        if (abstractC1635TM2749C2 == null) {
                            view3 = abstractC1635TM2749C2.f7406a;
                            if (view3.hasFocusable()) {
                                view = view3;
                            } else {
                                i5++;
                            }
                        }
                    }
                    iMin = Math.min(iM4045b, i4) - 1;
                    while (true) {
                        if (iMin < 0) {
                            abstractC1635TM2749C = m2749C(iMin);
                            if (abstractC1635TM2749C == null) {
                                view2 = abstractC1635TM2749C.f7406a;
                                if (view2.hasFocusable()) {
                                    view = view2;
                                    break;
                                }
                                iMin--;
                            }
                        }
                        view = null;
                        break;
                    }
                }
                if (view != null) {
                    i3 = c1631o.f7397m;
                    if (i3 != -1 && (viewFindViewById = view.findViewById(i3)) != null && viewFindViewById.isFocusable()) {
                        view = viewFindViewById;
                    }
                    view.requestFocus();
                }
            }
        }
        c1631o.f7396l = -1L;
        c1631o.f7395k = -1;
        c1631o.f7397m = -1;
    }

    /* JADX WARN: Code duplicated, block: B:253:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:343:0x0233 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:52:0x0105  */
    /* JADX WARN: Code duplicated, block: B:54:0x010a  */
    /* JADX INFO: renamed from: n */
    public final void m2781n() {
        boolean z3;
        View viewM2792y;
        int iM2750D;
        C1645b0 c1645b0;
        boolean z4;
        int i3;
        int i4;
        boolean z5;
        boolean z6;
        byte b3;
        boolean z7;
        boolean z8;
        C1642a c1642aM786i;
        int i5;
        int i6;
        int i7;
        C1642a c1642a;
        C1631O c1631o = this.f4751j0;
        c1631o.m4044a(1);
        m2791x(c1631o);
        c1631o.f7392h = false;
        m2771Z();
        C1323r c1323r = this.f4756m;
        ((C2022i) c1323r.f5961h).clear();
        C2021h c2021h = (C2021h) c1323r.f5962i;
        int i8 = c2021h.f8784j;
        Object[] objArr = c2021h.f8783i;
        for (int i9 = 0; i9 < i8; i9++) {
            objArr[i9] = null;
        }
        c2021h.f8784j = 0;
        c2021h.f8781g = false;
        m2757L();
        if (this.f4721G) {
            C0258b c0258b = this.f4752k;
            c0258b.m788l((ArrayList) c0258b.f664i);
            c0258b.m788l((ArrayList) c0258b.f665j);
            if (this.f4722H) {
                this.f4768s.mo2675T();
            }
        }
        if (this.f4730P == null || !this.f4768s.mo2700s0()) {
            this.f4752k.m781b();
        } else {
            C0258b c0258b2 = this.f4752k;
            ArrayList arrayList = (ArrayList) c0258b2.f664i;
            C1447t c1447t = (C1447t) c0258b2.f667l;
            c1447t.getClass();
            while (true) {
                int size = arrayList.size() - 1;
                boolean z9 = false;
                while (true) {
                    i3 = 8;
                    if (size < 0) {
                        size = -1;
                        break;
                    }
                    if (((C1642a) arrayList.get(size)).f7450a == 8) {
                        if (z9) {
                            break;
                        }
                    } else {
                        z9 = true;
                    }
                    size--;
                }
                if (size == -1) {
                    break;
                }
                int i10 = size + 1;
                C1642a c1642a2 = (C1642a) arrayList.get(size);
                C1642a c1642a3 = (C1642a) arrayList.get(i10);
                int i11 = c1642a3.f7450a;
                if (i11 != 1) {
                    C1642a c1642aM786i2 = null;
                    C0258b c0258b3 = (C0258b) c1447t.f6406h;
                    if (i11 == 2) {
                        int i12 = c1642a2.f7451b;
                        int i13 = c1642a2.f7452c;
                        if (i12 < i13) {
                            z7 = c1642a3.f7451b == i12 && c1642a3.f7452c == i13 - i12;
                            z8 = false;
                        } else {
                            z7 = c1642a3.f7451b == i13 + 1 && c1642a3.f7452c == i12 - i13;
                            z8 = true;
                        }
                        int i14 = c1642a3.f7451b;
                        if (i13 < i14) {
                            c1642a3.f7451b = i14 - 1;
                        } else {
                            int i15 = c1642a3.f7452c;
                            if (i13 < i14 + i15) {
                                c1642a3.f7452c = i15 - 1;
                                c1642a2.f7450a = 2;
                                c1642a2.f7452c = 1;
                                if (c1642a3.f7452c == 0) {
                                    arrayList.remove(i10);
                                    c0258b3.getClass();
                                    ((C0334e) c0258b3.f663h).m932l(c1642a3);
                                }
                            }
                        }
                        int i16 = c1642a2.f7451b;
                        int i17 = c1642a3.f7451b;
                        if (i16 <= i17) {
                            c1642a3.f7451b = i17 + 1;
                        } else {
                            int i18 = i17 + c1642a3.f7452c;
                            if (i16 < i18) {
                                c1642aM786i2 = c0258b3.m786i(2, i16 + 1, i18 - i16);
                                c1642a3.f7452c = c1642a2.f7451b - c1642a3.f7451b;
                            }
                        }
                        C1642a c1642a4 = c1642aM786i2;
                        if (z7) {
                            arrayList.set(size, c1642a3);
                            arrayList.remove(i10);
                            c0258b3.getClass();
                            ((C0334e) c0258b3.f663h).m932l(c1642a2);
                        } else {
                            if (z8) {
                                if (c1642a4 != null) {
                                    int i19 = c1642a2.f7451b;
                                    if (i19 > c1642a4.f7451b) {
                                        c1642a2.f7451b = i19 - c1642a4.f7452c;
                                    }
                                    int i20 = c1642a2.f7452c;
                                    if (i20 > c1642a4.f7451b) {
                                        c1642a2.f7452c = i20 - c1642a4.f7452c;
                                    }
                                }
                                int i21 = c1642a2.f7451b;
                                if (i21 > c1642a3.f7451b) {
                                    c1642a2.f7451b = i21 - c1642a3.f7452c;
                                }
                                int i22 = c1642a2.f7452c;
                                if (i22 > c1642a3.f7451b) {
                                    c1642a2.f7452c = i22 - c1642a3.f7452c;
                                }
                            } else {
                                if (c1642a4 != null) {
                                    int i23 = c1642a2.f7451b;
                                    if (i23 >= c1642a4.f7451b) {
                                        c1642a2.f7451b = i23 - c1642a4.f7452c;
                                    }
                                    int i24 = c1642a2.f7452c;
                                    if (i24 >= c1642a4.f7451b) {
                                        c1642a2.f7452c = i24 - c1642a4.f7452c;
                                    }
                                }
                                int i25 = c1642a2.f7451b;
                                if (i25 >= c1642a3.f7451b) {
                                    c1642a2.f7451b = i25 - c1642a3.f7452c;
                                }
                                int i26 = c1642a2.f7452c;
                                if (i26 >= c1642a3.f7451b) {
                                    c1642a2.f7452c = i26 - c1642a3.f7452c;
                                }
                            }
                            arrayList.set(size, c1642a3);
                            if (c1642a2.f7451b != c1642a2.f7452c) {
                                arrayList.set(i10, c1642a2);
                            } else {
                                arrayList.remove(i10);
                            }
                            if (c1642a4 != null) {
                                arrayList.add(size, c1642a4);
                            }
                        }
                    } else if (i11 == 4) {
                        int i27 = c1642a2.f7452c;
                        int i28 = c1642a3.f7451b;
                        if (i27 < i28) {
                            c1642a3.f7451b = i28 - 1;
                        } else {
                            int i29 = c1642a3.f7452c;
                            if (i27 < i28 + i29) {
                                c1642a3.f7452c = i29 - 1;
                                c1642aM786i = c0258b3.m786i(4, c1642a2.f7451b, 1);
                            }
                            i5 = c1642a2.f7451b;
                            i6 = c1642a3.f7451b;
                            if (i5 <= i6) {
                                c1642a3.f7451b = i6 + 1;
                            } else {
                                i7 = i6 + c1642a3.f7452c;
                                if (i5 < i7) {
                                    int i30 = i7 - i5;
                                    c1642aM786i2 = c0258b3.m786i(4, i5 + 1, i30);
                                    c1642a3.f7452c -= i30;
                                }
                            }
                            c1642a = c1642aM786i2;
                            arrayList.set(i10, c1642a2);
                            if (c1642a3.f7452c > 0) {
                                arrayList.set(size, c1642a3);
                            } else {
                                arrayList.remove(size);
                                c0258b3.getClass();
                                ((C0334e) c0258b3.f663h).m932l(c1642a3);
                            }
                            if (c1642aM786i != null) {
                                arrayList.add(size, c1642aM786i);
                            }
                            if (c1642a != null) {
                                arrayList.add(size, c1642a);
                            }
                        }
                        c1642aM786i = null;
                        i5 = c1642a2.f7451b;
                        i6 = c1642a3.f7451b;
                        if (i5 <= i6) {
                            c1642a3.f7451b = i6 + 1;
                        } else {
                            i7 = i6 + c1642a3.f7452c;
                            if (i5 < i7) {
                                int i31 = i7 - i5;
                                c1642aM786i2 = c0258b3.m786i(4, i5 + 1, i31);
                                c1642a3.f7452c -= i31;
                            }
                        }
                        c1642a = c1642aM786i2;
                        arrayList.set(i10, c1642a2);
                        if (c1642a3.f7452c > 0) {
                            arrayList.set(size, c1642a3);
                        } else {
                            arrayList.remove(size);
                            c0258b3.getClass();
                            ((C0334e) c0258b3.f663h).m932l(c1642a3);
                        }
                        if (c1642aM786i != null) {
                            arrayList.add(size, c1642aM786i);
                        }
                        if (c1642a != null) {
                            arrayList.add(size, c1642a);
                        }
                    }
                } else {
                    int i32 = c1642a2.f7452c;
                    int i33 = c1642a3.f7451b;
                    int i34 = i32 < i33 ? -1 : 0;
                    int i35 = c1642a2.f7451b;
                    if (i35 < i33) {
                        i34++;
                    }
                    if (i33 <= i35) {
                        c1642a2.f7451b = i35 + c1642a3.f7452c;
                    }
                    int i36 = c1642a3.f7451b;
                    if (i36 <= i32) {
                        c1642a2.f7452c = i32 + c1642a3.f7452c;
                    }
                    c1642a3.f7451b = i36 + i34;
                    arrayList.set(size, c1642a3);
                    arrayList.set(i10, c1642a2);
                }
            }
            int size2 = arrayList.size();
            int i37 = 0;
            while (i37 < size2) {
                C1642a c1642aM786i3 = (C1642a) arrayList.get(i37);
                int i38 = c1642aM786i3.f7450a;
                if (i38 != 1) {
                    C0334e c0334e = (C0334e) c0258b2.f663h;
                    C1666w c1666w = (C1666w) c0258b2.f666k;
                    if (i38 == 2) {
                        i4 = size2;
                        int i39 = c1642aM786i3.f7451b;
                        int i40 = c1642aM786i3.f7452c + i39;
                        int i41 = i39;
                        int i42 = 0;
                        byte b4 = -1;
                        while (i41 < i40) {
                            if (c1666w.m4093b(i41) != null || c0258b2.m780a(i41)) {
                                if (b4 == 0) {
                                    c0258b2.m782c(c0258b2.m786i(2, i39, i42));
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                z6 = z5;
                                b3 = 1;
                            } else {
                                if (b4 == 1) {
                                    c0258b2.m787j(c0258b2.m786i(2, i39, i42));
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                b3 = 0;
                            }
                            if (z6) {
                                i41 -= i42;
                                i40 -= i42;
                                i42 = 1;
                            } else {
                                i42++;
                            }
                            i41++;
                            b4 = b3;
                        }
                        if (i42 != c1642aM786i3.f7452c) {
                            c0334e.m932l(c1642aM786i3);
                            c1642aM786i3 = c0258b2.m786i(2, i39, i42);
                        }
                        if (b4 == 0) {
                            c0258b2.m782c(c1642aM786i3);
                        } else {
                            c0258b2.m787j(c1642aM786i3);
                        }
                    } else if (i38 != 4) {
                        if (i38 == i3) {
                            c0258b2.m787j(c1642aM786i3);
                        }
                        i4 = size2;
                    } else {
                        int i43 = c1642aM786i3.f7451b;
                        int i44 = c1642aM786i3.f7452c + i43;
                        int i45 = i43;
                        int i46 = 0;
                        byte b5 = -1;
                        while (i43 < i44) {
                            if (c1666w.m4093b(i43) != null || c0258b2.m780a(i43)) {
                                if (b5 == 0) {
                                    c0258b2.m782c(c0258b2.m786i(4, i45, i46));
                                    i45 = i43;
                                    i46 = 0;
                                }
                                b5 = 1;
                            } else {
                                if (b5 == 1) {
                                    c0258b2.m787j(c0258b2.m786i(4, i45, i46));
                                    i45 = i43;
                                    i46 = 0;
                                }
                                b5 = 0;
                            }
                            i46++;
                            i43++;
                            size2 = size2;
                        }
                        i4 = size2;
                        if (i46 != c1642aM786i3.f7452c) {
                            c0334e.m932l(c1642aM786i3);
                            c1642aM786i3 = c0258b2.m786i(4, i45, i46);
                        }
                        if (b5 == 0) {
                            c0258b2.m782c(c1642aM786i3);
                        } else {
                            c0258b2.m787j(c1642aM786i3);
                        }
                    }
                } else {
                    i4 = size2;
                    c0258b2.m787j(c1642aM786i3);
                }
                i37++;
                size2 = i4;
                i3 = 8;
            }
            arrayList.clear();
        }
        boolean z10 = this.f4757m0 || this.f4759n0;
        if (!this.f4782z || this.f4730P == null || (!(z4 = this.f4721G) && !z10 && !this.f4768s.f7354e)) {
            z3 = false;
        } else if (z4) {
            this.f4766r.getClass();
            z3 = false;
        } else {
            z3 = true;
        }
        C1631O c1631o2 = this.f4751j0;
        c1631o2.f7393i = z3;
        c1631o2.f7394j = z3 && z10 && !this.f4721G && this.f4730P != null && this.f4768s.mo2700s0();
        View focusedChild = (this.f4743f0 && hasFocus() && this.f4766r != null) ? getFocusedChild() : null;
        AbstractC1635T abstractC1635TM2751E = (focusedChild == null || (viewM2792y = m2792y(focusedChild)) == null) ? null : m2751E(viewM2792y);
        if (abstractC1635TM2751E == null) {
            c1631o.f7396l = -1L;
            c1631o.f7395k = -1;
            c1631o.f7397m = -1;
        } else {
            this.f4766r.getClass();
            c1631o.f7396l = -1L;
            if (this.f4721G) {
                iM2750D = -1;
            } else if (abstractC1635TM2751E.m4053g()) {
                iM2750D = abstractC1635TM2751E.f7409d;
            } else {
                RecyclerView recyclerView = abstractC1635TM2751E.f7422q;
                if (recyclerView == null) {
                    iM2750D = -1;
                } else {
                    iM2750D = recyclerView.m2750D(abstractC1635TM2751E);
                }
            }
            c1631o.f7395k = iM2750D;
            View focusedChild2 = abstractC1635TM2751E.f7406a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            c1631o.f7397m = id;
        }
        c1631o.f7391g = c1631o.f7393i && this.f4759n0;
        this.f4759n0 = false;
        this.f4757m0 = false;
        c1631o.f7390f = c1631o.f7394j;
        c1631o.f7388d = this.f4766r.mo2591a();
        m2748A(this.f4767r0);
        boolean z11 = c1631o.f7393i;
        C2022i c2022i = (C2022i) c1323r.f5961h;
        if (z11) {
            int iM2155C = this.f4754l.m2155C();
            for (int i47 = 0; i47 < iM2155C; i47++) {
                AbstractC1635T abstractC1635TM2741F = m2741F(this.f4754l.m2154B(i47));
                if (!abstractC1635TM2741F.m4060n()) {
                    if (abstractC1635TM2741F.m4051e()) {
                        this.f4766r.getClass();
                    } else {
                        AbstractC1618B abstractC1618B = this.f4730P;
                        AbstractC1618B.m3990b(abstractC1635TM2741F);
                        abstractC1635TM2741F.m4049c();
                        abstractC1618B.getClass();
                        C0058r c0058r = new C0058r();
                        c0058r.m320b(abstractC1635TM2741F);
                        C1645b0 c1645b0M4071a = (C1645b0) c2022i.getOrDefault(abstractC1635TM2741F, null);
                        if (c1645b0M4071a == null) {
                            c1645b0M4071a = C1645b0.m4071a();
                            c2022i.put(abstractC1635TM2741F, c1645b0M4071a);
                        }
                        c1645b0M4071a.f7464b = c0058r;
                        c1645b0M4071a.f7463a |= 4;
                        if (c1631o.f7391g && abstractC1635TM2741F.m4056j() && !abstractC1635TM2741F.m4053g() && !abstractC1635TM2741F.m4060n() && !abstractC1635TM2741F.m4051e()) {
                            this.f4766r.getClass();
                            c2021h.m4583e(abstractC1635TM2741F.f7408c, abstractC1635TM2741F);
                        }
                    }
                }
            }
        }
        if (c1631o.f7394j) {
            int iM2163K = this.f4754l.m2163K();
            for (int i48 = 0; i48 < iM2163K; i48++) {
                AbstractC1635T abstractC1635TM2741F2 = m2741F(this.f4754l.m2162J(i48));
                if (!abstractC1635TM2741F2.m4060n() && abstractC1635TM2741F2.f7409d == -1) {
                    abstractC1635TM2741F2.f7409d = abstractC1635TM2741F2.f7408c;
                }
            }
            boolean z12 = c1631o.f7389e;
            c1631o.f7389e = false;
            this.f4768s.mo2681X(this.f4748i, c1631o);
            c1631o.f7389e = z12;
            for (int i49 = 0; i49 < this.f4754l.m2155C(); i49++) {
                AbstractC1635T abstractC1635TM2741F3 = m2741F(this.f4754l.m2154B(i49));
                if (!abstractC1635TM2741F3.m4060n() && ((c1645b0 = (C1645b0) c2022i.getOrDefault(abstractC1635TM2741F3, null)) == null || (c1645b0.f7463a & 4) == 0)) {
                    AbstractC1618B.m3990b(abstractC1635TM2741F3);
                    boolean z13 = (abstractC1635TM2741F3.f7414i & 8192) != 0;
                    AbstractC1618B abstractC1618B2 = this.f4730P;
                    abstractC1635TM2741F3.m4049c();
                    abstractC1618B2.getClass();
                    C0058r c0058r2 = new C0058r();
                    c0058r2.m320b(abstractC1635TM2741F3);
                    if (z13) {
                        m2762Q(abstractC1635TM2741F3, c0058r2);
                    } else {
                        C1645b0 c1645b0M4071a2 = (C1645b0) c2022i.getOrDefault(abstractC1635TM2741F3, null);
                        if (c1645b0M4071a2 == null) {
                            c1645b0M4071a2 = C1645b0.m4071a();
                            c2022i.put(abstractC1635TM2741F3, c1645b0M4071a2);
                        }
                        c1645b0M4071a2.f7463a |= 2;
                        c1645b0M4071a2.f7464b = c0058r2;
                    }
                }
            }
            m2776h();
        } else {
            m2776h();
        }
        m2758M(true);
        m2772a0(false);
        c1631o.f7387c = 2;
    }

    /* JADX INFO: renamed from: o */
    public final void m2782o() {
        m2771Z();
        m2757L();
        C1631O c1631o = this.f4751j0;
        c1631o.m4044a(6);
        this.f4752k.m781b();
        c1631o.f7388d = this.f4766r.mo2591a();
        c1631o.f7386b = 0;
        if (this.f4750j != null) {
            AbstractC1667x abstractC1667x = this.f4766r;
            int iM2507b = AbstractC0948N.m2507b(abstractC1667x.f7588b);
            if (iM2507b == 1 ? abstractC1667x.mo2591a() > 0 : iM2507b != 2) {
                Parcelable parcelable = this.f4750j.f7384i;
                if (parcelable != null) {
                    this.f4768s.mo2723Z(parcelable);
                }
                this.f4750j = null;
            }
        }
        c1631o.f7390f = false;
        this.f4768s.mo2681X(this.f4748i, c1631o);
        c1631o.f7389e = false;
        c1631o.f7393i = c1631o.f7393i && this.f4730P != null;
        c1631o.f7387c = 4;
        m2758M(true);
        m2772a0(false);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.f4723I = 0;
        this.f4778x = true;
        this.f4782z = this.f4782z && !isLayoutRequested();
        this.f4748i.m4034d();
        AbstractC1621E abstractC1621E = this.f4768s;
        if (abstractC1621E != null) {
            abstractC1621E.f7355f = true;
        }
        this.f4763p0 = false;
        if (f4709F0) {
            ThreadLocal threadLocal = RunnableC1658o.f7549k;
            RunnableC1658o runnableC1658o = (RunnableC1658o) threadLocal.get();
            this.f4747h0 = runnableC1658o;
            if (runnableC1658o == null) {
                RunnableC1658o runnableC1658o2 = new RunnableC1658o();
                runnableC1658o2.f7551g = new ArrayList();
                runnableC1658o2.f7554j = new ArrayList();
                this.f4747h0 = runnableC1658o2;
                WeakHashMap weakHashMap = AbstractC0016Q.f14a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                RunnableC1658o runnableC1658o3 = this.f4747h0;
                runnableC1658o3.f7553i = (long) (1.0E9f / refreshRate);
                threadLocal.set(runnableC1658o3);
            }
            this.f4747h0.f7551g.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C1627K c1627k;
        RunnableC1658o runnableC1658o;
        super.onDetachedFromWindow();
        AbstractC1618B abstractC1618B = this.f4730P;
        if (abstractC1618B != null) {
            abstractC1618B.mo3994e();
        }
        int i3 = 0;
        setScrollState(0);
        RunnableC1634S runnableC1634S = this.f4745g0;
        runnableC1634S.f7404m.removeCallbacks(runnableC1634S);
        runnableC1634S.f7400i.abortAnimation();
        this.f4778x = false;
        AbstractC1621E abstractC1621E = this.f4768s;
        if (abstractC1621E != null) {
            abstractC1621E.f7355f = false;
            abstractC1621E.mo2713M(this);
        }
        this.f4777w0.clear();
        removeCallbacks(this.f4779x0);
        this.f4756m.getClass();
        while (C1645b0.f7462d.m921a() != null) {
        }
        int i4 = 0;
        while (true) {
            c1627k = this.f4748i;
            ArrayList arrayList = c1627k.f7377c;
            if (i4 >= arrayList.size()) {
                break;
            }
            AbstractC2003a.m4532c(((AbstractC1635T) arrayList.get(i4)).f7406a);
            i4++;
        }
        c1627k.m4035e(c1627k.f7382h.f4766r, false);
        while (i3 < getChildCount()) {
            int i5 = i3 + 1;
            View childAt = getChildAt(i3);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            C0210a c0210a = (C0210a) childAt.getTag(com.zuxoplayer.app.R.id.pooling_container_listener_holder_tag);
            if (c0210a == null) {
                c0210a = new C0210a();
                childAt.setTag(com.zuxoplayer.app.R.id.pooling_container_listener_holder_tag, c0210a);
            }
            ArrayList arrayList2 = c0210a.f480a;
            int iM4539l = AbstractC2003a.m4539l(arrayList2);
            if (-1 < iM4539l) {
                arrayList2.get(iM4539l).getClass();
                throw new ClassCastException();
            }
            i3 = i5;
        }
        if (!f4709F0 || (runnableC1658o = this.f4747h0) == null) {
            return;
        }
        runnableC1658o.f7551g.remove(this);
        this.f4747h0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f4772u;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C1655l) arrayList.get(i3)).getClass();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float axisValue;
        if (this.f4768s != null && !this.f4717C && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.f4768s.mo2727d() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f4768s.mo2726c() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.f4768s.mo2727d()) {
                    f = -axisValue2;
                } else if (this.f4768s.mo2726c()) {
                    axisValue = axisValue2;
                    f = 0.0f;
                } else {
                    f = 0.0f;
                }
            } else {
                f = 0.0f;
            }
            if (f != 0.0f || axisValue != 0.0f) {
                int i3 = (int) (axisValue * this.f4741d0);
                int i4 = (int) (f * this.f4742e0);
                AbstractC1621E abstractC1621E = this.f4768s;
                if (abstractC1621E == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    return false;
                }
                if (!this.f4717C) {
                    int[] iArr = this.f4775v0;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zMo2726c = abstractC1621E.mo2726c();
                    boolean zMo2727d = this.f4768s.mo2727d();
                    int i5 = zMo2727d ? (zMo2726c ? 1 : 0) | 2 : zMo2726c ? 1 : 0;
                    float y3 = motionEvent.getY();
                    float x3 = motionEvent.getX();
                    int iM2763R = i3 - m2763R(i3, y3);
                    int iM2764S = i4 - m2764S(i4, x3);
                    getScrollingChildHelper().m308g(i5, 1);
                    if (m2783p(zMo2726c ? iM2763R : 0, zMo2727d ? iM2764S : 0, 1, this.f4775v0, this.f4771t0)) {
                        iM2763R -= iArr[0];
                        iM2764S -= iArr[1];
                    }
                    m2767V(zMo2726c ? iM2763R : 0, zMo2727d ? iM2764S : 0, motionEvent, 1);
                    RunnableC1658o runnableC1658o = this.f4747h0;
                    if (runnableC1658o != null && (iM2763R != 0 || iM2764S != 0)) {
                        runnableC1658o.m4088a(this, iM2763R, iM2764S);
                    }
                    m2773b0(1);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        boolean z4;
        if (!this.f4717C) {
            this.f4776w = null;
            if (m2793z(motionEvent)) {
                m2766U();
                setScrollState(0);
                return true;
            }
            AbstractC1621E abstractC1621E = this.f4768s;
            if (abstractC1621E != null) {
                boolean zMo2726c = abstractC1621E.mo2726c();
                boolean zMo2727d = this.f4768s.mo2727d();
                if (this.f4733S == null) {
                    this.f4733S = VelocityTracker.obtain();
                }
                this.f4733S.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f4718D) {
                        this.f4718D = false;
                    }
                    this.f4732R = motionEvent.getPointerId(0);
                    int x3 = (int) (motionEvent.getX() + 0.5f);
                    this.f4736V = x3;
                    this.f4734T = x3;
                    int y3 = (int) (motionEvent.getY() + 0.5f);
                    this.f4737W = y3;
                    this.f4735U = y3;
                    EdgeEffect edgeEffect = this.f4726L;
                    if (edgeEffect == null || AbstractC0610a.m1511m(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z3 = false;
                    } else {
                        AbstractC0610a.m1491C(this.f4726L, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z3 = true;
                    }
                    EdgeEffect edgeEffect2 = this.f4728N;
                    if (edgeEffect2 != null && AbstractC0610a.m1511m(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        AbstractC0610a.m1491C(this.f4728N, 0.0f, motionEvent.getY() / getHeight());
                        z3 = true;
                    }
                    EdgeEffect edgeEffect3 = this.f4727M;
                    if (edgeEffect3 != null && AbstractC0610a.m1511m(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        AbstractC0610a.m1491C(this.f4727M, 0.0f, motionEvent.getX() / getWidth());
                        z3 = true;
                    }
                    EdgeEffect edgeEffect4 = this.f4729O;
                    if (edgeEffect4 != null && AbstractC0610a.m1511m(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        AbstractC0610a.m1491C(this.f4729O, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z3 = true;
                    }
                    if (z3 || this.f4731Q == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        m2773b0(1);
                    }
                    int[] iArr = this.f4773u0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i3 = zMo2726c;
                    if (zMo2727d) {
                        i3 = (zMo2726c ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().m308g(i3, 0);
                } else if (actionMasked == 1) {
                    this.f4733S.clear();
                    m2773b0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f4732R);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f4732R + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x4 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y4 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.f4731Q != 1) {
                        int i4 = x4 - this.f4734T;
                        int i5 = y4 - this.f4735U;
                        if (!zMo2726c || Math.abs(i4) <= this.f4738a0) {
                            z4 = false;
                        } else {
                            this.f4736V = x4;
                            z4 = true;
                        }
                        if (zMo2727d && Math.abs(i5) > this.f4738a0) {
                            this.f4737W = y4;
                            z4 = true;
                        }
                        if (z4) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    m2766U();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f4732R = motionEvent.getPointerId(actionIndex);
                    int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f4736V = x5;
                    this.f4734T = x5;
                    int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f4737W = y5;
                    this.f4735U = y5;
                } else if (actionMasked == 6) {
                    m2759N(motionEvent);
                }
                if (this.f4731Q == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int i7 = AbstractC2317k.f9837a;
        Trace.beginSection("RV OnLayout");
        m2780m();
        Trace.endSection();
        this.f4782z = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        AbstractC1621E abstractC1621E = this.f4768s;
        if (abstractC1621E == null) {
            m2779l(i3, i4);
            return;
        }
        boolean zMo2708G = abstractC1621E.mo2708G();
        boolean z3 = false;
        C1631O c1631o = this.f4751j0;
        if (!zMo2708G) {
            if (this.f4780y) {
                this.f4768s.f7351b.m2779l(i3, i4);
                return;
            }
            if (c1631o.f7394j) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC1667x abstractC1667x = this.f4766r;
            if (abstractC1667x != null) {
                c1631o.f7388d = abstractC1667x.mo2591a();
            } else {
                c1631o.f7388d = 0;
            }
            m2771Z();
            this.f4768s.f7351b.m2779l(i3, i4);
            m2772a0(false);
            c1631o.f7390f = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        this.f4768s.f7351b.m2779l(i3, i4);
        if (mode == 1073741824 && mode2 == 1073741824) {
            z3 = true;
        }
        this.f4781y0 = z3;
        if (z3 || this.f4766r == null) {
            return;
        }
        if (c1631o.f7387c == 1) {
            m2781n();
        }
        this.f4768s.m4019l0(i3, i4);
        c1631o.f7392h = true;
        m2782o();
        this.f4768s.m4020n0(i3, i4);
        if (this.f4768s.mo2733q0()) {
            this.f4768s.m4019l0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            c1631o.f7392h = true;
            m2782o();
            this.f4768s.m4020n0(i3, i4);
        }
        this.f4783z0 = getMeasuredWidth();
        this.f4714A0 = getMeasuredHeight();
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i3, Rect rect) {
        if (m2754I()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i3, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1630N)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1630N c1630n = (C1630N) parcelable;
        this.f4750j = c1630n;
        super.onRestoreInstanceState(c1630n.f650g);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1630N c1630n = new C1630N(super.onSaveInstanceState());
        C1630N c1630n2 = this.f4750j;
        if (c1630n2 != null) {
            c1630n.f7384i = c1630n2.f7384i;
            return c1630n;
        }
        AbstractC1621E abstractC1621E = this.f4768s;
        if (abstractC1621E != null) {
            c1630n.f7384i = abstractC1621E.mo2724a0();
            return c1630n;
        }
        c1630n.f7384i = null;
        return c1630n;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        if (i3 == i5 && i4 == i6) {
            return;
        }
        this.f4729O = null;
        this.f4727M = null;
        this.f4728N = null;
        this.f4726L = null;
    }

    /* JADX WARN: Code duplicated, block: B:178:0x0343  */
    /* JADX WARN: Code duplicated, block: B:196:0x0385  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f7 A[PHI: r1
      0x01f7: PHI (r1v59 int) = (r1v43 int), (r1v63 int) binds: [B:90:0x01e0, B:94:0x01f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM2793z;
        int i3;
        int iMax;
        int i4;
        boolean z3;
        if (!this.f4717C && !this.f4718D) {
            C1655l c1655l = this.f4776w;
            if (c1655l == null) {
                zM2793z = motionEvent.getAction() == 0 ? false : m2793z(motionEvent);
            } else {
                if (c1655l.f7535v != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean zM4080b = c1655l.m4080b(motionEvent.getX(), motionEvent.getY());
                        boolean zM4079a = c1655l.m4079a(motionEvent.getX(), motionEvent.getY());
                        if (zM4080b || zM4079a) {
                            if (zM4079a) {
                                c1655l.f7536w = 1;
                                c1655l.f7529p = (int) motionEvent.getX();
                            } else if (zM4080b) {
                                c1655l.f7536w = 2;
                                c1655l.f7526m = (int) motionEvent.getY();
                            }
                            c1655l.m4081d(2);
                        }
                    } else if (motionEvent.getAction() == 1 && c1655l.f7535v == 2) {
                        c1655l.f7526m = 0.0f;
                        c1655l.f7529p = 0.0f;
                        c1655l.m4081d(1);
                        c1655l.f7536w = 0;
                    } else if (motionEvent.getAction() == 2 && c1655l.f7535v == 2) {
                        c1655l.m4082e();
                        int i5 = c1655l.f7536w;
                        int i6 = c1655l.f7515b;
                        if (i5 == 1) {
                            float x3 = motionEvent.getX();
                            int[] iArr = c1655l.f7538y;
                            iArr[0] = i6;
                            int i7 = c1655l.f7530q - i6;
                            iArr[1] = i7;
                            float fMax = Math.max(i6, Math.min(i7, x3));
                            if (Math.abs(c1655l.f7528o - fMax) >= 2.0f) {
                                int iM4078c = C1655l.m4078c(c1655l.f7529p, fMax, iArr, c1655l.f7532s.computeHorizontalScrollRange(), c1655l.f7532s.computeHorizontalScrollOffset(), c1655l.f7530q);
                                if (iM4078c != 0) {
                                    c1655l.f7532s.scrollBy(iM4078c, 0);
                                }
                                c1655l.f7529p = fMax;
                            }
                        }
                        if (c1655l.f7536w == 2) {
                            float y3 = motionEvent.getY();
                            int[] iArr2 = c1655l.f7537x;
                            iArr2[0] = i6;
                            int i8 = c1655l.f7531r - i6;
                            iArr2[1] = i8;
                            float fMax2 = Math.max(i6, Math.min(i8, y3));
                            if (Math.abs(c1655l.f7525l - fMax2) >= 2.0f) {
                                int iM4078c2 = C1655l.m4078c(c1655l.f7526m, fMax2, iArr2, c1655l.f7532s.computeVerticalScrollRange(), c1655l.f7532s.computeVerticalScrollOffset(), c1655l.f7531r);
                                if (iM4078c2 != 0) {
                                    c1655l.f7532s.scrollBy(0, iM4078c2);
                                }
                                c1655l.f7526m = fMax2;
                            }
                        }
                    }
                }
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.f4776w = null;
                }
                zM2793z = true;
            }
            if (zM2793z) {
                m2766U();
                setScrollState(0);
                return true;
            }
            AbstractC1621E abstractC1621E = this.f4768s;
            if (abstractC1621E != null) {
                boolean zMo2726c = abstractC1621E.mo2726c();
                boolean zMo2727d = this.f4768s.mo2727d();
                if (this.f4733S == null) {
                    this.f4733S = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr3 = this.f4773u0;
                if (actionMasked == 0) {
                    iArr3[1] = 0;
                    iArr3[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(iArr3[0], iArr3[1]);
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        this.f4733S.addMovement(motionEventObtain);
                        VelocityTracker velocityTracker = this.f4733S;
                        int i9 = this.f4740c0;
                        velocityTracker.computeCurrentVelocity(1000, i9);
                        float f = zMo2726c ? -this.f4733S.getXVelocity(this.f4732R) : 0.0f;
                        float f3 = zMo2727d ? -this.f4733S.getYVelocity(this.f4732R) : 0.0f;
                        if (f == 0.0f && f3 == 0.0f) {
                            setScrollState(0);
                        } else {
                            int i10 = (int) f;
                            int iMax2 = (int) f3;
                            AbstractC1621E abstractC1621E2 = this.f4768s;
                            if (abstractC1621E2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.f4717C) {
                                boolean zMo2726c2 = abstractC1621E2.mo2726c();
                                boolean zMo2727d2 = this.f4768s.mo2727d();
                                int i11 = this.f4739b0;
                                if (!zMo2726c2 || Math.abs(i10) < i11) {
                                    i10 = 0;
                                }
                                if (!zMo2727d2 || Math.abs(iMax2) < i11) {
                                    iMax2 = 0;
                                }
                                if (i10 != 0 || iMax2 != 0) {
                                    if (i10 == 0) {
                                        iMax = 0;
                                    } else {
                                        EdgeEffect edgeEffect = this.f4726L;
                                        if (edgeEffect == null || AbstractC0610a.m1511m(edgeEffect) == 0.0f) {
                                            EdgeEffect edgeEffect2 = this.f4728N;
                                            if (edgeEffect2 == null || AbstractC0610a.m1511m(edgeEffect2) == 0.0f) {
                                                iMax = 0;
                                            } else if (m2769X(this.f4728N, i10, getWidth())) {
                                                this.f4728N.onAbsorb(i10);
                                                i10 = 0;
                                            }
                                        } else {
                                            int i12 = -i10;
                                            if (m2769X(this.f4726L, i12, getWidth())) {
                                                this.f4726L.onAbsorb(i12);
                                                i10 = 0;
                                            }
                                        }
                                        iMax = i10;
                                        i10 = 0;
                                    }
                                    if (iMax2 == 0) {
                                        i4 = iMax2;
                                        iMax2 = 0;
                                    } else {
                                        EdgeEffect edgeEffect3 = this.f4727M;
                                        if (edgeEffect3 == null || AbstractC0610a.m1511m(edgeEffect3) == 0.0f) {
                                            EdgeEffect edgeEffect4 = this.f4729O;
                                            if (edgeEffect4 == null || AbstractC0610a.m1511m(edgeEffect4) == 0.0f) {
                                                i4 = iMax2;
                                                iMax2 = 0;
                                            } else if (m2769X(this.f4729O, iMax2, getHeight())) {
                                                this.f4729O.onAbsorb(iMax2);
                                                iMax2 = 0;
                                            }
                                        } else {
                                            int i13 = -iMax2;
                                            if (m2769X(this.f4727M, i13, getHeight())) {
                                                this.f4727M.onAbsorb(i13);
                                                iMax2 = 0;
                                            }
                                        }
                                        i4 = 0;
                                    }
                                    RunnableC1634S runnableC1634S = this.f4745g0;
                                    if (iMax != 0 || iMax2 != 0) {
                                        int i14 = -i9;
                                        iMax = Math.max(i14, Math.min(iMax, i9));
                                        iMax2 = Math.max(i14, Math.min(iMax2, i9));
                                        runnableC1634S.m4046a(iMax, iMax2);
                                    }
                                    if (i10 != 0 || i4 != 0) {
                                        float f4 = i10;
                                        float f5 = i4;
                                        if (!dispatchNestedPreFling(f4, f5)) {
                                            boolean z4 = zMo2726c2 || zMo2727d2;
                                            dispatchNestedFling(f4, f5, z4);
                                            int i15 = zMo2726c2;
                                            if (z4) {
                                                if (zMo2727d2) {
                                                    i15 = (zMo2726c2 ? 1 : 0) | 2;
                                                }
                                                getScrollingChildHelper().m308g(i15, 1);
                                                int i16 = -i9;
                                                runnableC1634S.m4046a(Math.max(i16, Math.min(i10, i9)), Math.max(i16, Math.min(i4, i9)));
                                            }
                                        }
                                    } else if (iMax == 0 && iMax2 == 0) {
                                    }
                                }
                            }
                            setScrollState(0);
                        }
                        m2766U();
                    } else if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.f4732R);
                        if (iFindPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f4732R + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x4 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y4 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        int iMax3 = this.f4736V - x4;
                        int iMax4 = this.f4737W - y4;
                        if (this.f4731Q != 1) {
                            if (zMo2726c) {
                                iMax3 = iMax3 > 0 ? Math.max(0, iMax3 - this.f4738a0) : Math.min(0, iMax3 + this.f4738a0);
                                if (iMax3 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            } else {
                                z3 = false;
                            }
                            if (zMo2727d) {
                                iMax4 = iMax4 > 0 ? Math.max(0, iMax4 - this.f4738a0) : Math.min(0, iMax4 + this.f4738a0);
                                if (iMax4 != 0) {
                                    z3 = true;
                                }
                            }
                            if (z3) {
                                setScrollState(1);
                            }
                        }
                        if (this.f4731Q == 1) {
                            int[] iArr4 = this.f4775v0;
                            iArr4[0] = 0;
                            iArr4[1] = 0;
                            int iM2763R = iMax3 - m2763R(iMax3, motionEvent.getY());
                            int iM2764S = iMax4 - m2764S(iMax4, motionEvent.getX());
                            boolean zM2783p = m2783p(zMo2726c ? iM2763R : 0, zMo2727d ? iM2764S : 0, 0, this.f4775v0, this.f4771t0);
                            int[] iArr5 = this.f4771t0;
                            if (zM2783p) {
                                iM2763R -= iArr4[0];
                                iM2764S -= iArr4[1];
                                iArr3[0] = iArr3[0] + iArr5[0];
                                iArr3[1] = iArr3[1] + iArr5[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i17 = iM2763R;
                            int i18 = iM2764S;
                            this.f4736V = x4 - iArr5[0];
                            this.f4737W = y4 - iArr5[1];
                            if (m2767V(zMo2726c ? i17 : 0, zMo2727d ? i18 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            RunnableC1658o runnableC1658o = this.f4747h0;
                            if (runnableC1658o != null && (i17 != 0 || i18 != 0)) {
                                runnableC1658o.m4088a(this, i17, i18);
                            }
                        }
                    } else if (actionMasked == 3) {
                        m2766U();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.f4732R = motionEvent.getPointerId(actionIndex);
                        int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.f4736V = x5;
                        this.f4734T = x5;
                        int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.f4737W = y5;
                        this.f4735U = y5;
                    } else if (actionMasked == 6) {
                        m2759N(motionEvent);
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                this.f4732R = motionEvent.getPointerId(0);
                int x6 = (int) (motionEvent.getX() + 0.5f);
                this.f4736V = x6;
                this.f4734T = x6;
                int y6 = (int) (motionEvent.getY() + 0.5f);
                this.f4737W = y6;
                this.f4735U = y6;
                if (zMo2727d) {
                    i3 = zMo2726c;
                    i3 = (zMo2726c ? 1 : 0) | 2;
                }
                i3 = zMo2726c;
                getScrollingChildHelper().m308g(i3, 0);
                this.f4733S.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m2783p(int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m304c(i3, i4, i5, iArr, iArr2);
    }

    /* JADX INFO: renamed from: q */
    public final void m2784q(int i3, int i4, int i5, int i6, int[] iArr, int i7, int[] iArr2) {
        getScrollingChildHelper().m305d(i3, i4, i5, i6, iArr, i7, iArr2);
    }

    /* JADX INFO: renamed from: r */
    public final void m2785r(int i3, int i4) {
        this.f4724J++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i3, scrollY - i4);
        AbstractC1624H abstractC1624H = this.f4753k0;
        if (abstractC1624H != null) {
            abstractC1624H.mo4029a(this);
        }
        ArrayList arrayList = this.f4755l0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC1624H) this.f4755l0.get(size)).mo4029a(this);
            }
        }
        this.f4724J--;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z3) {
        AbstractC1635T abstractC1635TM2741F = m2741F(view);
        if (abstractC1635TM2741F != null) {
            if (abstractC1635TM2741F.m4055i()) {
                abstractC1635TM2741F.f7414i &= -257;
            } else if (!abstractC1635TM2741F.m4060n()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + abstractC1635TM2741F + m2790w());
            }
        }
        view.clearAnimation();
        m2741F(view);
        super.removeDetachedView(view, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.f4768s.getClass();
        if (!m2754I() && view2 != null) {
            m2765T(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        return this.f4768s.m4016g0(this, view, rect, z3, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        ArrayList arrayList = this.f4774v;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C1655l) arrayList.get(i3)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f4713A != 0 || this.f4717C) {
            this.f4715B = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m2786s() {
        if (this.f4729O != null) {
            return;
        }
        ((C1632P) this.f4725K).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f4729O = edgeEffect;
        if (this.f4758n) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i3, int i4) {
        AbstractC1621E abstractC1621E = this.f4768s;
        if (abstractC1621E == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f4717C) {
            return;
        }
        boolean zMo2726c = abstractC1621E.mo2726c();
        boolean zMo2727d = this.f4768s.mo2727d();
        if (zMo2726c || zMo2727d) {
            if (!zMo2726c) {
                i3 = 0;
            }
            if (!zMo2727d) {
                i4 = 0;
            }
            m2767V(i3, i4, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i3, int i4) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!m2754I()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f4719E |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(C1637V c1637v) {
        this.f4765q0 = c1637v;
        AbstractC0016Q.m86h(this, c1637v);
    }

    public void setAdapter(AbstractC1667x abstractC1667x) {
        setLayoutFrozen(false);
        AbstractC1667x abstractC1667x2 = this.f4766r;
        C1629M c1629m = this.f4746h;
        if (abstractC1667x2 != null) {
            abstractC1667x2.f7587a.unregisterObserver(c1629m);
            this.f4766r.getClass();
        }
        AbstractC1618B abstractC1618B = this.f4730P;
        if (abstractC1618B != null) {
            abstractC1618B.mo3994e();
        }
        AbstractC1621E abstractC1621E = this.f4768s;
        C1627K c1627k = this.f4748i;
        if (abstractC1621E != null) {
            abstractC1621E.m4012c0(c1627k);
            this.f4768s.m4013d0(c1627k);
        }
        c1627k.f7375a.clear();
        c1627k.m4036f();
        C0258b c0258b = this.f4752k;
        c0258b.m788l((ArrayList) c0258b.f664i);
        c0258b.m788l((ArrayList) c0258b.f665j);
        AbstractC1667x abstractC1667x3 = this.f4766r;
        this.f4766r = abstractC1667x;
        if (abstractC1667x != null) {
            abstractC1667x.f7587a.registerObserver(c1629m);
        }
        AbstractC1621E abstractC1621E2 = this.f4768s;
        if (abstractC1621E2 != null) {
            abstractC1621E2.mo2808L();
        }
        AbstractC1667x abstractC1667x4 = this.f4766r;
        c1627k.f7375a.clear();
        c1627k.m4036f();
        c1627k.m4035e(abstractC1667x3, true);
        C1626J c1626jM4033c = c1627k.m4033c();
        if (abstractC1667x3 != null) {
            c1626jM4033c.f7373b--;
        }
        if (c1626jM4033c.f7373b == 0) {
            int i3 = 0;
            while (true) {
                SparseArray sparseArray = c1626jM4033c.f7372a;
                if (i3 >= sparseArray.size()) {
                    break;
                }
                C1625I c1625i = (C1625I) sparseArray.valueAt(i3);
                ArrayList arrayList = c1625i.f7368a;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    AbstractC2003a.m4532c(((AbstractC1635T) obj).f7406a);
                }
                c1625i.f7368a.clear();
                i3++;
            }
        }
        if (abstractC1667x4 != null) {
            c1626jM4033c.f7373b++;
        }
        c1627k.m4034d();
        this.f4751j0.f7389e = true;
        m2761P(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC1669z interfaceC1669z) {
        if (interfaceC1669z == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z3) {
        if (z3 != this.f4758n) {
            this.f4729O = null;
            this.f4727M = null;
            this.f4728N = null;
            this.f4726L = null;
        }
        this.f4758n = z3;
        super.setClipToPadding(z3);
        if (this.f4782z) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(AbstractC1617A abstractC1617A) {
        abstractC1617A.getClass();
        this.f4725K = abstractC1617A;
        this.f4729O = null;
        this.f4727M = null;
        this.f4728N = null;
        this.f4726L = null;
    }

    public void setHasFixedSize(boolean z3) {
        this.f4780y = z3;
    }

    public void setItemAnimator(AbstractC1618B abstractC1618B) {
        AbstractC1618B abstractC1618B2 = this.f4730P;
        if (abstractC1618B2 != null) {
            abstractC1618B2.mo3994e();
            this.f4730P.f7338a = null;
        }
        this.f4730P = abstractC1618B;
        if (abstractC1618B != null) {
            abstractC1618B.f7338a = this.f4761o0;
        }
    }

    public void setItemViewCacheSize(int i3) {
        C1627K c1627k = this.f4748i;
        c1627k.f7379e = i3;
        c1627k.m4043m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z3) {
        suppressLayout(z3);
    }

    public void setLayoutManager(AbstractC1621E abstractC1621E) {
        RecyclerView recyclerView;
        if (abstractC1621E == this.f4768s) {
            return;
        }
        setScrollState(0);
        RunnableC1634S runnableC1634S = this.f4745g0;
        runnableC1634S.f7404m.removeCallbacks(runnableC1634S);
        runnableC1634S.f7400i.abortAnimation();
        AbstractC1621E abstractC1621E2 = this.f4768s;
        C1627K c1627k = this.f4748i;
        if (abstractC1621E2 != null) {
            AbstractC1618B abstractC1618B = this.f4730P;
            if (abstractC1618B != null) {
                abstractC1618B.mo3994e();
            }
            this.f4768s.m4012c0(c1627k);
            this.f4768s.m4013d0(c1627k);
            c1627k.f7375a.clear();
            c1627k.m4036f();
            if (this.f4778x) {
                AbstractC1621E abstractC1621E3 = this.f4768s;
                abstractC1621E3.f7355f = false;
                abstractC1621E3.mo2713M(this);
            }
            this.f4768s.m4022o0(null);
            this.f4768s = null;
        } else {
            c1627k.f7375a.clear();
            c1627k.m4036f();
        }
        C0858A c0858a = this.f4754l;
        ((C0069c) c0858a.f3640i).m353y();
        ArrayList arrayList = (ArrayList) c0858a.f3641j;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((C1666w) c0858a.f3639h).f7586a;
            if (size < 0) {
                break;
            }
            AbstractC1635T abstractC1635TM2741F = m2741F((View) arrayList.get(size));
            if (abstractC1635TM2741F != null) {
                int i3 = abstractC1635TM2741F.f7420o;
                if (recyclerView.m2754I()) {
                    abstractC1635TM2741F.f7421p = i3;
                    recyclerView.f4777w0.add(abstractC1635TM2741F);
                } else {
                    WeakHashMap weakHashMap = AbstractC0016Q.f14a;
                    abstractC1635TM2741F.f7406a.setImportantForAccessibility(i3);
                }
                abstractC1635TM2741F.f7420o = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            m2741F(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f4768s = abstractC1621E;
        if (abstractC1621E != null) {
            if (abstractC1621E.f7351b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC1621E + " is already attached to a RecyclerView:" + abstractC1621E.f7351b.m2790w());
            }
            abstractC1621E.m4022o0(this);
            if (this.f4778x) {
                this.f4768s.f7355f = true;
            }
        }
        c1627k.m4043m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z3) {
        C0053o scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f76d) {
            WeakHashMap weakHashMap = AbstractC0016Q.f14a;
            AbstractC0005F.m33z(scrollingChildHelper.f75c);
        }
        scrollingChildHelper.f76d = z3;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC1624H abstractC1624H) {
        this.f4753k0 = abstractC1624H;
    }

    public void setPreserveFocusAfterLayout(boolean z3) {
        this.f4743f0 = z3;
    }

    public void setRecycledViewPool(C1626J c1626j) {
        C1627K c1627k = this.f4748i;
        RecyclerView recyclerView = c1627k.f7382h;
        c1627k.m4035e(recyclerView.f4766r, false);
        C1626J c1626j2 = c1627k.f7381g;
        if (c1626j2 != null) {
            c1626j2.f7373b--;
        }
        c1627k.f7381g = c1626j;
        if (c1626j != null && recyclerView.getAdapter() != null) {
            c1627k.f7381g.f7373b++;
        }
        c1627k.m4034d();
    }

    public void setScrollState(int i3) {
        if (i3 == this.f4731Q) {
            return;
        }
        this.f4731Q = i3;
        if (i3 != 2) {
            RunnableC1634S runnableC1634S = this.f4745g0;
            runnableC1634S.f7404m.removeCallbacks(runnableC1634S);
            runnableC1634S.f7400i.abortAnimation();
        }
        AbstractC1621E abstractC1621E = this.f4768s;
        if (abstractC1621E != null) {
            abstractC1621E.mo2819b0(i3);
        }
        ArrayList arrayList = this.f4755l0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC1624H) this.f4755l0.get(size)).getClass();
            }
        }
    }

    public void setScrollingTouchSlop(int i3) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i3 != 0) {
            if (i3 == 1) {
                this.f4738a0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i3 + "; using default value");
        }
        this.f4738a0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC1633Q abstractC1633Q) {
        this.f4748i.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i3) {
        return getScrollingChildHelper().m308g(i3, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().m309h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z3) {
        if (z3 != this.f4717C) {
            m2775f("Do not suppressLayout in layout or scroll");
            if (!z3) {
                this.f4717C = false;
                if (this.f4715B && this.f4768s != null && this.f4766r != null) {
                    requestLayout();
                }
                this.f4715B = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f4717C = true;
            this.f4718D = true;
            setScrollState(0);
            RunnableC1634S runnableC1634S = this.f4745g0;
            runnableC1634S.f7404m.removeCallbacks(runnableC1634S);
            runnableC1634S.f7400i.abortAnimation();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m2787t() {
        if (this.f4726L != null) {
            return;
        }
        ((C1632P) this.f4725K).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f4726L = edgeEffect;
        if (this.f4758n) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m2788u() {
        if (this.f4728N != null) {
            return;
        }
        ((C1632P) this.f4725K).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f4728N = edgeEffect;
        if (this.f4758n) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m2789v() {
        if (this.f4727M != null) {
            return;
        }
        ((C1632P) this.f4725K).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f4727M = edgeEffect;
        if (this.f4758n) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: w */
    public final String m2790w() {
        return " " + super.toString() + ", adapter:" + this.f4766r + ", layout:" + this.f4768s + ", context:" + getContext();
    }

    /* JADX INFO: renamed from: x */
    public final void m2791x(C1631O c1631o) {
        if (getScrollState() != 2) {
            c1631o.getClass();
            return;
        }
        OverScroller overScroller = this.f4745g0.f7400i;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c1631o.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX INFO: renamed from: y */
    public final View m2792y(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0061 A[SYNTHETIC] */
    /* JADX INFO: renamed from: z */
    public final boolean m2793z(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f4774v;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C1655l c1655l = (C1655l) arrayList.get(i3);
            int i4 = c1655l.f7535v;
            if (i4 == 1) {
                boolean zM4080b = c1655l.m4080b(motionEvent.getX(), motionEvent.getY());
                boolean zM4079a = c1655l.m4079a(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (zM4080b || zM4079a)) {
                    if (zM4079a) {
                        c1655l.f7536w = 1;
                        c1655l.f7529p = (int) motionEvent.getX();
                    } else if (zM4080b) {
                        c1655l.f7536w = 2;
                        c1655l.f7526m = (int) motionEvent.getY();
                    }
                    c1655l.m4081d(2);
                    if (action != 3) {
                        this.f4776w = c1655l;
                        return true;
                    }
                }
            } else if (i4 != 2) {
                continue;
            } else if (action != 3) {
                this.f4776w = c1655l;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC1621E abstractC1621E = this.f4768s;
        if (abstractC1621E != null) {
            return abstractC1621E.mo2699s(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m2790w());
    }

    public void setOnFlingListener(AbstractC1623G abstractC1623G) {
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC1628L interfaceC1628L) {
    }
}

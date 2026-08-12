package p091e;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.internal.cast.AbstractC1303m;
import com.google.android.gms.internal.cast.C1323r;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000A.AbstractC0003D;
import p000A.AbstractC0005F;
import p000A.AbstractC0016Q;
import p000A.C0026a0;
import p087d.AbstractC1376a;
import p089d1.C1447t;
import p091e.C1469N;
import p106i.C1741i;
import p106i.C1742j;
import p113k.C1854d1;
import p113k.InterfaceC1852d;
import p113k.InterfaceC1874k0;

/* JADX INFO: renamed from: e.N */
/* JADX INFO: loaded from: classes.dex */
public final class C1469N extends AbstractC1303m implements InterfaceC1852d {

    /* JADX INFO: renamed from: G */
    public static final AccelerateInterpolator f6526G = new AccelerateInterpolator();

    /* JADX INFO: renamed from: H */
    public static final DecelerateInterpolator f6527H = new DecelerateInterpolator();

    /* JADX INFO: renamed from: A */
    public C1742j f6528A;

    /* JADX INFO: renamed from: B */
    public boolean f6529B;

    /* JADX INFO: renamed from: C */
    public boolean f6530C;

    /* JADX INFO: renamed from: D */
    public final C1467L f6531D;

    /* JADX INFO: renamed from: E */
    public final C1467L f6532E;

    /* JADX INFO: renamed from: F */
    public final C1447t f6533F;

    /* JADX INFO: renamed from: i */
    public Context f6534i;

    /* JADX INFO: renamed from: j */
    public Context f6535j;

    /* JADX INFO: renamed from: k */
    public ActionBarOverlayLayout f6536k;

    /* JADX INFO: renamed from: l */
    public ActionBarContainer f6537l;

    /* JADX INFO: renamed from: m */
    public InterfaceC1874k0 f6538m;

    /* JADX INFO: renamed from: n */
    public ActionBarContextView f6539n;

    /* JADX INFO: renamed from: o */
    public final View f6540o;

    /* JADX INFO: renamed from: p */
    public boolean f6541p;

    /* JADX INFO: renamed from: q */
    public C1468M f6542q;

    /* JADX INFO: renamed from: r */
    public C1468M f6543r;

    /* JADX INFO: renamed from: s */
    public C1323r f6544s;

    /* JADX INFO: renamed from: t */
    public boolean f6545t;

    /* JADX INFO: renamed from: u */
    public final ArrayList f6546u;

    /* JADX INFO: renamed from: v */
    public int f6547v;

    /* JADX INFO: renamed from: w */
    public boolean f6548w;

    /* JADX INFO: renamed from: x */
    public boolean f6549x;

    /* JADX INFO: renamed from: y */
    public boolean f6550y;

    /* JADX INFO: renamed from: z */
    public boolean f6551z;

    public C1469N(Activity activity, boolean z3) {
        super(13);
        new ArrayList();
        this.f6546u = new ArrayList();
        this.f6547v = 0;
        this.f6548w = true;
        this.f6551z = true;
        this.f6531D = new C1467L(this, 0);
        this.f6532E = new C1467L(this, 1);
        this.f6533F = new C1447t(2, this);
        View decorView = activity.getWindow().getDecorView();
        m3696g0(decorView);
        if (z3) {
            return;
        }
        this.f6540o = decorView.findViewById(R.id.content);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m3694e0(boolean z3) {
        C0026a0 c0026a0M2326i;
        C0026a0 c0026a0M2326i2;
        if (z3) {
            if (!this.f6550y) {
                this.f6550y = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f6536k;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m3699j0(false);
            }
        } else if (this.f6550y) {
            this.f6550y = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6536k;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m3699j0(false);
        }
        if (!this.f6537l.isLaidOut()) {
            if (z3) {
                ((C1854d1) this.f6538m).f8135a.setVisibility(4);
                this.f6539n.setVisibility(0);
                return;
            } else {
                ((C1854d1) this.f6538m).f8135a.setVisibility(0);
                this.f6539n.setVisibility(8);
                return;
            }
        }
        if (z3) {
            C1854d1 c1854d1 = (C1854d1) this.f6538m;
            c0026a0M2326i = AbstractC0016Q.m79a(c1854d1.f8135a);
            c0026a0M2326i.m104a(0.0f);
            c0026a0M2326i.m106c(100L);
            c0026a0M2326i.m107d(new C1741i(c1854d1, 4));
            c0026a0M2326i2 = this.f6539n.m2326i(0, 200L);
        } else {
            C1854d1 c1854d2 = (C1854d1) this.f6538m;
            C0026a0 c0026a0M79a = AbstractC0016Q.m79a(c1854d2.f8135a);
            c0026a0M79a.m104a(1.0f);
            c0026a0M79a.m106c(200L);
            c0026a0M79a.m107d(new C1741i(c1854d2, 0));
            c0026a0M2326i = this.f6539n.m2326i(8, 100L);
            c0026a0M2326i2 = c0026a0M79a;
        }
        C1742j c1742j = new C1742j();
        ArrayList arrayList = c1742j.f7784a;
        arrayList.add(c0026a0M2326i);
        View view = (View) c0026a0M2326i.f29a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c0026a0M2326i2.f29a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c0026a0M2326i2);
        c1742j.m4194b();
    }

    /* JADX INFO: renamed from: f0 */
    public final Context m3695f0() {
        if (this.f6535j == null) {
            TypedValue typedValue = new TypedValue();
            this.f6534i.getTheme().resolveAttribute(com.zuxoplayer.app.R.attr.actionBarWidgetTheme, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 != 0) {
                this.f6535j = new ContextThemeWrapper(this.f6534i, i3);
            } else {
                this.f6535j = this.f6534i;
            }
        }
        return this.f6535j;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m3696g0(View view) {
        InterfaceC1874k0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.zuxoplayer.app.R.id.decor_content_parent);
        this.f6536k = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.zuxoplayer.app.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC1874k0) {
            wrapper = (InterfaceC1874k0) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f6538m = wrapper;
        this.f6539n = (ActionBarContextView) view.findViewById(com.zuxoplayer.app.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.zuxoplayer.app.R.id.action_bar_container);
        this.f6537l = actionBarContainer;
        InterfaceC1874k0 interfaceC1874k0 = this.f6538m;
        if (interfaceC1874k0 == null || this.f6539n == null || actionBarContainer == null) {
            throw new IllegalStateException(C1469N.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((C1854d1) interfaceC1874k0).f8135a.getContext();
        this.f6534i = context;
        if ((((C1854d1) this.f6538m).f8136b & 4) != 0) {
            this.f6541p = true;
        }
        int i3 = context.getApplicationInfo().targetSdkVersion;
        this.f6538m.getClass();
        m3698i0(context.getResources().getBoolean(com.zuxoplayer.app.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f6534i.obtainStyledAttributes(null, AbstractC1376a.f6095a, com.zuxoplayer.app.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6536k;
            if (!actionBarOverlayLayout2.f3858m) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f6530C = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f6537l;
            WeakHashMap weakHashMap = AbstractC0016Q.f14a;
            AbstractC0005F.m26s(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m3697h0(boolean z3) {
        if (this.f6541p) {
            return;
        }
        int i3 = z3 ? 4 : 0;
        C1854d1 c1854d1 = (C1854d1) this.f6538m;
        int i4 = c1854d1.f8136b;
        this.f6541p = true;
        c1854d1.m4372a((i3 & 4) | (i4 & (-5)));
    }

    /* JADX INFO: renamed from: i0 */
    public final void m3698i0(boolean z3) {
        if (z3) {
            this.f6537l.setTabContainer(null);
            ((C1854d1) this.f6538m).getClass();
        } else {
            ((C1854d1) this.f6538m).getClass();
            this.f6537l.setTabContainer(null);
        }
        this.f6538m.getClass();
        ((C1854d1) this.f6538m).f8135a.setCollapsible(false);
        this.f6536k.setHasNonEmbeddedTabs(false);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m3699j0(boolean z3) {
        boolean z4 = this.f6550y || !this.f6549x;
        View view = this.f6540o;
        final C1447t c1447t = this.f6533F;
        if (!z4) {
            if (this.f6551z) {
                this.f6551z = false;
                C1742j c1742j = this.f6528A;
                if (c1742j != null) {
                    c1742j.m4193a();
                }
                int i3 = this.f6547v;
                C1467L c1467l = this.f6531D;
                if (i3 != 0 || (!this.f6529B && !z3)) {
                    c1467l.mo118a();
                    return;
                }
                this.f6537l.setAlpha(1.0f);
                this.f6537l.setTransitioning(true);
                C1742j c1742j2 = new C1742j();
                float f = -this.f6537l.getHeight();
                if (z3) {
                    int[] iArr = {0, 0};
                    this.f6537l.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                C0026a0 c0026a0M79a = AbstractC0016Q.m79a(this.f6537l);
                c0026a0M79a.m108e(f);
                final View view2 = (View) c0026a0M79a.f29a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(c1447t != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: A.Z
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((C1469N) c1447t.f6406h).f6537l.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z5 = c1742j2.f7788e;
                ArrayList arrayList = c1742j2.f7784a;
                if (!z5) {
                    arrayList.add(c0026a0M79a);
                }
                if (this.f6548w && view != null) {
                    C0026a0 c0026a0M79a2 = AbstractC0016Q.m79a(view);
                    c0026a0M79a2.m108e(f);
                    if (!c1742j2.f7788e) {
                        arrayList.add(c0026a0M79a2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f6526G;
                boolean z6 = c1742j2.f7788e;
                if (!z6) {
                    c1742j2.f7786c = accelerateInterpolator;
                }
                if (!z6) {
                    c1742j2.f7785b = 250L;
                }
                if (!z6) {
                    c1742j2.f7787d = c1467l;
                }
                this.f6528A = c1742j2;
                c1742j2.m4194b();
                return;
            }
            return;
        }
        if (this.f6551z) {
            return;
        }
        this.f6551z = true;
        C1742j c1742j3 = this.f6528A;
        if (c1742j3 != null) {
            c1742j3.m4193a();
        }
        this.f6537l.setVisibility(0);
        int i4 = this.f6547v;
        C1467L c1467l2 = this.f6532E;
        if (i4 == 0 && (this.f6529B || z3)) {
            this.f6537l.setTranslationY(0.0f);
            float f3 = -this.f6537l.getHeight();
            if (z3) {
                int[] iArr2 = {0, 0};
                this.f6537l.getLocationInWindow(iArr2);
                f3 -= iArr2[1];
            }
            this.f6537l.setTranslationY(f3);
            C1742j c1742j4 = new C1742j();
            C0026a0 c0026a0M79a3 = AbstractC0016Q.m79a(this.f6537l);
            c0026a0M79a3.m108e(0.0f);
            final View view3 = (View) c0026a0M79a3.f29a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(c1447t != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: A.Z
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((C1469N) c1447t.f6406h).f6537l.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z7 = c1742j4.f7788e;
            ArrayList arrayList2 = c1742j4.f7784a;
            if (!z7) {
                arrayList2.add(c0026a0M79a3);
            }
            if (this.f6548w && view != null) {
                view.setTranslationY(f3);
                C0026a0 c0026a0M79a4 = AbstractC0016Q.m79a(view);
                c0026a0M79a4.m108e(0.0f);
                if (!c1742j4.f7788e) {
                    arrayList2.add(c0026a0M79a4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f6527H;
            boolean z8 = c1742j4.f7788e;
            if (!z8) {
                c1742j4.f7786c = decelerateInterpolator;
            }
            if (!z8) {
                c1742j4.f7785b = 250L;
            }
            if (!z8) {
                c1742j4.f7787d = c1467l2;
            }
            this.f6528A = c1742j4;
            c1742j4.m4194b();
        } else {
            this.f6537l.setAlpha(1.0f);
            this.f6537l.setTranslationY(0.0f);
            if (this.f6548w && view != null) {
                view.setTranslationY(0.0f);
            }
            c1467l2.mo118a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f6536k;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = AbstractC0016Q.f14a;
            AbstractC0003D.m7c(actionBarOverlayLayout);
        }
    }

    public C1469N(Dialog dialog) {
        super(13);
        new ArrayList();
        this.f6546u = new ArrayList();
        this.f6547v = 0;
        this.f6548w = true;
        this.f6551z = true;
        this.f6531D = new C1467L(this, 0);
        this.f6532E = new C1467L(this, 1);
        this.f6533F = new C1447t(2, this);
        m3696g0(dialog.getWindow().getDecorView());
    }
}

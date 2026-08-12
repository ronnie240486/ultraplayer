package p113k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.zuxoplayer.app.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p000A.AbstractC0016Q;
import p000A.AbstractC0018T;
import p000A.AbstractC0020V;

/* JADX INFO: renamed from: k.g1 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLongClickListenerC1863g1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: q */
    public static ViewOnLongClickListenerC1863g1 f8167q;

    /* JADX INFO: renamed from: r */
    public static ViewOnLongClickListenerC1863g1 f8168r;

    /* JADX INFO: renamed from: g */
    public final View f8169g;

    /* JADX INFO: renamed from: h */
    public final CharSequence f8170h;

    /* JADX INFO: renamed from: i */
    public final int f8171i;

    /* JADX INFO: renamed from: j */
    public final RunnableC1860f1 f8172j;

    /* JADX INFO: renamed from: k */
    public final RunnableC1860f1 f8173k;

    /* JADX INFO: renamed from: l */
    public int f8174l;

    /* JADX INFO: renamed from: m */
    public int f8175m;

    /* JADX INFO: renamed from: n */
    public C1866h1 f8176n;

    /* JADX INFO: renamed from: o */
    public boolean f8177o;

    /* JADX INFO: renamed from: p */
    public boolean f8178p;

    /* JADX WARN: Type inference failed for: r0v0, types: [k.f1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [k.f1] */
    public ViewOnLongClickListenerC1863g1(View view, CharSequence charSequence) {
        final int i3 = 0;
        this.f8172j = new Runnable(this) { // from class: k.f1

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ ViewOnLongClickListenerC1863g1 f8151h;

            {
                this.f8151h = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.f8151h.m4390c(false);
                        break;
                    default:
                        this.f8151h.m4389a();
                        break;
                }
            }
        };
        final int i4 = 1;
        this.f8173k = new Runnable(this) { // from class: k.f1

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ ViewOnLongClickListenerC1863g1 f8151h;

            {
                this.f8151h = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i4) {
                    case 0:
                        this.f8151h.m4390c(false);
                        break;
                    default:
                        this.f8151h.m4389a();
                        break;
                }
            }
        };
        this.f8169g = view;
        this.f8170h = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = AbstractC0020V.f19a;
        this.f8171i = Build.VERSION.SDK_INT >= 28 ? AbstractC0018T.m90a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f8178p = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* JADX INFO: renamed from: b */
    public static void m4388b(ViewOnLongClickListenerC1863g1 viewOnLongClickListenerC1863g1) {
        ViewOnLongClickListenerC1863g1 viewOnLongClickListenerC1863g2 = f8167q;
        if (viewOnLongClickListenerC1863g2 != null) {
            viewOnLongClickListenerC1863g2.f8169g.removeCallbacks(viewOnLongClickListenerC1863g2.f8172j);
        }
        f8167q = viewOnLongClickListenerC1863g1;
        if (viewOnLongClickListenerC1863g1 != null) {
            viewOnLongClickListenerC1863g1.f8169g.postDelayed(viewOnLongClickListenerC1863g1.f8172j, ViewConfiguration.getLongPressTimeout());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4389a() {
        ViewOnLongClickListenerC1863g1 viewOnLongClickListenerC1863g1 = f8168r;
        View view = this.f8169g;
        if (viewOnLongClickListenerC1863g1 == this) {
            f8168r = null;
            C1866h1 c1866h1 = this.f8176n;
            if (c1866h1 != null) {
                View view2 = (View) c1866h1.f8184h;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) c1866h1.f8183g).getSystemService("window")).removeView(view2);
                }
                this.f8176n = null;
                this.f8178p = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f8167q == this) {
            m4388b(null);
        }
        view.removeCallbacks(this.f8173k);
    }

    /* JADX INFO: renamed from: c */
    public final void m4390c(boolean z3) {
        int height;
        int i3;
        int i4;
        char c;
        long longPressTimeout;
        long j3;
        long j4;
        View view = this.f8169g;
        if (view.isAttachedToWindow()) {
            m4388b(null);
            ViewOnLongClickListenerC1863g1 viewOnLongClickListenerC1863g1 = f8168r;
            if (viewOnLongClickListenerC1863g1 != null) {
                viewOnLongClickListenerC1863g1.m4389a();
            }
            f8168r = this;
            this.f8177o = z3;
            Context context = view.getContext();
            C1866h1 c1866h1 = new C1866h1();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            c1866h1.f8186j = layoutParams;
            c1866h1.f8187k = new Rect();
            c1866h1.f8188l = new int[2];
            c1866h1.f8189m = new int[2];
            c1866h1.f8183g = context;
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            c1866h1.f8184h = viewInflate;
            c1866h1.f8185i = (TextView) viewInflate.findViewById(R.id.message);
            layoutParams.setTitle(C1866h1.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            this.f8176n = c1866h1;
            int width = this.f8174l;
            int i5 = this.f8175m;
            boolean z4 = this.f8177o;
            View view2 = (View) c1866h1.f8184h;
            ViewParent parent = view2.getParent();
            Context context2 = (Context) c1866h1.f8183g;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) c1866h1.f8185i).setText(this.f8170h);
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) c1866h1.f8186j;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i5 + dimensionPixelOffset2;
                i3 = i5 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i3 = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z4 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                for (Context context3 = view.getContext(); context3 instanceof ContextWrapper; context3 = ((ContextWrapper) context3).getBaseContext()) {
                    if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                Rect rect = (Rect) c1866h1.f8187k;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i4 = 0;
                    c = 1;
                } else {
                    Resources resources = context2.getResources();
                    c = 1;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i4 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = (int[]) c1866h1.f8189m;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) c1866h1.f8188l;
                view.getLocationOnScreen(iArr2);
                int i6 = iArr2[i4] - iArr[i4];
                iArr2[i4] = i6;
                iArr2[c] = iArr2[c] - iArr[c];
                layoutParams2.x = (i6 + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, i4);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i7 = iArr2[c];
                int i8 = ((i7 + i3) - dimensionPixelOffset3) - measuredHeight;
                int i9 = i7 + height + dimensionPixelOffset3;
                if (z4) {
                    if (i8 >= 0) {
                        layoutParams2.y = i8;
                    } else {
                        layoutParams2.y = i9;
                    }
                } else if (measuredHeight + i9 <= rect.height()) {
                    layoutParams2.y = i9;
                } else {
                    layoutParams2.y = i8;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.f8177o) {
                j4 = 2500;
            } else {
                WeakHashMap weakHashMap = AbstractC0016Q.f14a;
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j3 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j3 = 15000;
                }
                j4 = j3 - longPressTimeout;
            }
            RunnableC1860f1 runnableC1860f1 = this.f8173k;
            view.removeCallbacks(runnableC1860f1);
            view.postDelayed(runnableC1860f1, j4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f8176n == null || !this.f8177o) {
            View view2 = this.f8169g;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f8178p = true;
                        m4389a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f8176n == null) {
                    int x3 = (int) motionEvent.getX();
                    int y3 = (int) motionEvent.getY();
                    if (this.f8178p) {
                        this.f8174l = x3;
                        this.f8175m = y3;
                        this.f8178p = false;
                        m4388b(this);
                    } else {
                        int iAbs = Math.abs(x3 - this.f8174l);
                        int i3 = this.f8171i;
                        if (iAbs > i3 || Math.abs(y3 - this.f8175m) > i3) {
                            this.f8174l = x3;
                            this.f8175m = y3;
                            this.f8178p = false;
                            m4388b(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f8174l = view.getWidth() / 2;
        this.f8175m = view.getHeight() / 2;
        m4390c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m4389a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}

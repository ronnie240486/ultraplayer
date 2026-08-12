package p113k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p060U1.AbstractC0610a;
import p066W1.AbstractC0664e;
import p087d.AbstractC1376a;
import p110j.InterfaceC1757C;

/* JADX INFO: renamed from: k.E0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1801E0 implements InterfaceC1757C {

    /* JADX INFO: renamed from: F */
    public static final Method f7997F;

    /* JADX INFO: renamed from: G */
    public static final Method f7998G;

    /* JADX INFO: renamed from: H */
    public static final Method f7999H;

    /* JADX INFO: renamed from: A */
    public final Handler f8000A;

    /* JADX INFO: renamed from: C */
    public Rect f8002C;

    /* JADX INFO: renamed from: D */
    public boolean f8003D;

    /* JADX INFO: renamed from: E */
    public final C1905z f8004E;

    /* JADX INFO: renamed from: g */
    public final Context f8005g;

    /* JADX INFO: renamed from: h */
    public ListAdapter f8006h;

    /* JADX INFO: renamed from: i */
    public C1890r0 f8007i;

    /* JADX INFO: renamed from: l */
    public int f8010l;

    /* JADX INFO: renamed from: m */
    public int f8011m;

    /* JADX INFO: renamed from: o */
    public boolean f8013o;

    /* JADX INFO: renamed from: p */
    public boolean f8014p;

    /* JADX INFO: renamed from: q */
    public boolean f8015q;

    /* JADX INFO: renamed from: t */
    public C1795B0 f8018t;

    /* JADX INFO: renamed from: u */
    public View f8019u;

    /* JADX INFO: renamed from: v */
    public AdapterView.OnItemClickListener f8020v;

    /* JADX INFO: renamed from: j */
    public final int f8008j = -2;

    /* JADX INFO: renamed from: k */
    public int f8009k = -2;

    /* JADX INFO: renamed from: n */
    public final int f8012n = 1002;

    /* JADX INFO: renamed from: r */
    public int f8016r = 0;

    /* JADX INFO: renamed from: s */
    public final int f8017s = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: w */
    public final RunnableC1793A0 f8021w = new RunnableC1793A0(this, 1);

    /* JADX INFO: renamed from: x */
    public final ViewOnTouchListenerC1799D0 f8022x = new ViewOnTouchListenerC1799D0(this);

    /* JADX INFO: renamed from: y */
    public final C1797C0 f8023y = new C1797C0(this);

    /* JADX INFO: renamed from: z */
    public final RunnableC1793A0 f8024z = new RunnableC1793A0(this, 0);

    /* JADX INFO: renamed from: B */
    public final Rect f8001B = new Rect();

    static {
        int i3 = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i3 <= 28) {
            try {
                f7997F = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f7999H = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f7998G = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public AbstractC1801E0(Context context, AttributeSet attributeSet, int i3) {
        int resourceId;
        this.f8005g = context;
        this.f8000A = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1376a.f6109o, i3, 0);
        this.f8010l = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f8011m = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f8013o = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C1905z c1905z = new C1905z(context, attributeSet, i3, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC1376a.f6113s, i3, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            AbstractC0664e.m1731Q(c1905z, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c1905z.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : AbstractC0610a.m1512n(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f8004E = c1905z;
        c1905z.setInputMethodMode(1);
    }

    /* JADX INFO: renamed from: a */
    public final void m4290a(int i3) {
        this.f8010l = i3;
    }

    @Override // p110j.InterfaceC1757C
    /* JADX INFO: renamed from: b */
    public final boolean mo4211b() {
        return this.f8004E.isShowing();
    }

    /* JADX INFO: renamed from: c */
    public final int m4291c() {
        return this.f8010l;
    }

    @Override // p110j.InterfaceC1757C
    public final void dismiss() {
        C1905z c1905z = this.f8004E;
        c1905z.dismiss();
        c1905z.setContentView(null);
        this.f8007i = null;
        this.f8000A.removeCallbacks(this.f8021w);
    }

    @Override // p110j.InterfaceC1757C
    /* JADX INFO: renamed from: f */
    public final void mo4212f() {
        int i3;
        int iM4418a;
        int iMakeMeasureSpec;
        int paddingBottom;
        C1890r0 c1890r0;
        C1890r0 c1890r1 = this.f8007i;
        C1905z c1905z = this.f8004E;
        Context context = this.f8005g;
        if (c1890r1 == null) {
            C1890r0 c1890r0Mo4297q = mo4297q(context, !this.f8003D);
            this.f8007i = c1890r0Mo4297q;
            c1890r0Mo4297q.setAdapter(this.f8006h);
            this.f8007i.setOnItemClickListener(this.f8020v);
            this.f8007i.setFocusable(true);
            this.f8007i.setFocusableInTouchMode(true);
            this.f8007i.setOnItemSelectedListener(new C1902x0(this));
            this.f8007i.setOnScrollListener(this.f8023y);
            c1905z.setContentView(this.f8007i);
        }
        Drawable background = c1905z.getBackground();
        Rect rect = this.f8001B;
        if (background != null) {
            background.getPadding(rect);
            int i4 = rect.top;
            i3 = rect.bottom + i4;
            if (!this.f8013o) {
                this.f8011m = -i4;
            }
        } else {
            rect.setEmpty();
            i3 = 0;
        }
        boolean z3 = c1905z.getInputMethodMode() == 2;
        View view = this.f8019u;
        int i5 = this.f8011m;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f7998G;
            if (method != null) {
                try {
                    iM4418a = ((Integer) method.invoke(c1905z, view, Integer.valueOf(i5), Boolean.valueOf(z3))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                    iM4418a = c1905z.getMaxAvailableHeight(view, i5);
                }
            } else {
                iM4418a = c1905z.getMaxAvailableHeight(view, i5);
            }
        } else {
            iM4418a = AbstractC1904y0.m4418a(c1905z, view, i5, z3);
        }
        int i6 = this.f8008j;
        if (i6 == -1) {
            paddingBottom = iM4418a + i3;
        } else {
            int i7 = this.f8009k;
            if (i7 != -2) {
                iMakeMeasureSpec = i7 != -1 ? View.MeasureSpec.makeMeasureSpec(i7, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iM4405a = this.f8007i.m4405a(iMakeMeasureSpec, iM4418a);
            paddingBottom = iM4405a + (iM4405a > 0 ? this.f8007i.getPaddingBottom() + this.f8007i.getPaddingTop() + i3 : 0);
        }
        boolean z4 = this.f8004E.getInputMethodMode() == 2;
        AbstractC0664e.m1732R(c1905z, this.f8012n);
        if (c1905z.isShowing()) {
            if (this.f8019u.isAttachedToWindow()) {
                int width = this.f8009k;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f8019u.getWidth();
                }
                if (i6 == -1) {
                    i6 = z4 ? paddingBottom : -1;
                    if (z4) {
                        c1905z.setWidth(this.f8009k == -1 ? -1 : 0);
                        c1905z.setHeight(0);
                    } else {
                        c1905z.setWidth(this.f8009k == -1 ? -1 : 0);
                        c1905z.setHeight(-1);
                    }
                } else if (i6 == -2) {
                    i6 = paddingBottom;
                }
                c1905z.setOutsideTouchable(true);
                int i8 = width;
                View view2 = this.f8019u;
                int i9 = this.f8010l;
                int i10 = this.f8011m;
                if (i8 < 0) {
                    i8 = -1;
                }
                c1905z.update(view2, i9, i10, i8, i6 < 0 ? -1 : i6);
                return;
            }
            return;
        }
        int width2 = this.f8009k;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f8019u.getWidth();
        }
        if (i6 == -1) {
            i6 = -1;
        } else if (i6 == -2) {
            i6 = paddingBottom;
        }
        c1905z.setWidth(width2);
        c1905z.setHeight(i6);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f7997F;
            if (method2 != null) {
                try {
                    method2.invoke(c1905z, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC1906z0.m4420b(c1905z, true);
        }
        c1905z.setOutsideTouchable(true);
        c1905z.setTouchInterceptor(this.f8022x);
        if (this.f8015q) {
            AbstractC0664e.m1731Q(c1905z, this.f8014p);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f7999H;
            if (method3 != null) {
                try {
                    method3.invoke(c1905z, this.f8002C);
                } catch (Exception e3) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e3);
                }
            }
        } else {
            AbstractC1906z0.m4419a(c1905z, this.f8002C);
        }
        c1905z.showAsDropDown(this.f8019u, this.f8010l, this.f8011m, this.f8016r);
        this.f8007i.setSelection(-1);
        if ((!this.f8003D || this.f8007i.isInTouchMode()) && (c1890r0 = this.f8007i) != null) {
            c1890r0.setListSelectionHidden(true);
            c1890r0.requestLayout();
        }
        if (this.f8003D) {
            return;
        }
        this.f8000A.post(this.f8024z);
    }

    /* JADX INFO: renamed from: g */
    public final int m4292g() {
        if (this.f8013o) {
            return this.f8011m;
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public final Drawable m4293h() {
        return this.f8004E.getBackground();
    }

    @Override // p110j.InterfaceC1757C
    /* JADX INFO: renamed from: j */
    public final C1890r0 mo4213j() {
        return this.f8007i;
    }

    /* JADX INFO: renamed from: m */
    public final void m4294m(Drawable drawable) {
        this.f8004E.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: renamed from: n */
    public final void m4295n(int i3) {
        this.f8011m = i3;
        this.f8013o = true;
    }

    /* JADX INFO: renamed from: o */
    public void mo4296o(ListAdapter listAdapter) {
        C1795B0 c1795b0 = this.f8018t;
        if (c1795b0 == null) {
            this.f8018t = new C1795B0(this);
        } else {
            ListAdapter listAdapter2 = this.f8006h;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c1795b0);
            }
        }
        this.f8006h = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f8018t);
        }
        C1890r0 c1890r0 = this.f8007i;
        if (c1890r0 != null) {
            c1890r0.setAdapter(this.f8006h);
        }
    }

    /* JADX INFO: renamed from: q */
    public C1890r0 mo4297q(Context context, boolean z3) {
        return new C1890r0(context, z3);
    }

    /* JADX INFO: renamed from: r */
    public final void m4298r(int i3) {
        Drawable background = this.f8004E.getBackground();
        if (background == null) {
            this.f8009k = i3;
            return;
        }
        Rect rect = this.f8001B;
        background.getPadding(rect);
        this.f8009k = rect.left + rect.right + i3;
    }
}

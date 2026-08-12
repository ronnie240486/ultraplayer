package p091e;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.zuxoplayer.app.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p000A.AbstractC0003D;
import p000A.AbstractC0005F;
import p000A.AbstractC0006G;
import p000A.AbstractC0016Q;
import p000A.AbstractC0040h0;
import p000A.C0032d0;
import p000A.C0036f0;
import p000A.C0038g0;
import p000A.C0054o0;
import p000A.C0056p0;
import p000A.InterfaceC0059s;
import p019G1.AbstractC0230e;
import p110j.InterfaceC1783x;
import p110j.MenuC1772m;
import p113k.AbstractC1875k1;
import p113k.AbstractC1878l1;
import p113k.InterfaceC1868i0;
import p148t.C2264c;

/* JADX INFO: renamed from: e.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1488s implements InterfaceC0059s, InterfaceC1868i0, InterfaceC1783x {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6631g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LayoutInflaterFactory2C1458C f6632h;

    public /* synthetic */ C1488s(LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C, int i3) {
        this.f6631g = i3;
        this.f6632h = layoutInflaterFactory2C1458C;
    }

    @Override // p110j.InterfaceC1783x
    /* JADX INFO: renamed from: a */
    public void mo3615a(MenuC1772m menuC1772m, boolean z3) {
        C1457B c1457b;
        switch (this.f6631g) {
            case 2:
                this.f6632h.m3666q(menuC1772m);
                break;
            default:
                MenuC1772m menuC1772mMo4231k = menuC1772m.mo4231k();
                int i3 = 0;
                boolean z4 = menuC1772mMo4231k != menuC1772m;
                if (z4) {
                    menuC1772m = menuC1772mMo4231k;
                }
                LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C = this.f6632h;
                C1457B[] c1457bArr = layoutInflaterFactory2C1458C.f6464S;
                int length = c1457bArr != null ? c1457bArr.length : 0;
                while (true) {
                    if (i3 >= length) {
                        c1457b = null;
                    } else {
                        c1457b = c1457bArr[i3];
                        if (c1457b == null || c1457b.f6434h != menuC1772m) {
                            i3++;
                        }
                    }
                }
                if (c1457b != null) {
                    if (!z4) {
                        layoutInflaterFactory2C1458C.m3667r(c1457b, z3);
                    } else {
                        layoutInflaterFactory2C1458C.m3665p(c1457b.f6427a, c1457b, menuC1772mMo4231k);
                        layoutInflaterFactory2C1458C.m3667r(c1457b, true);
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public C0056p0 m3719b(View view, C0056p0 c0056p0) {
        int i3;
        boolean z3;
        C0056p0 c0056p0Mo180b;
        AbstractC0040h0 c0036f0;
        boolean z4;
        boolean z5;
        C0054o0 c0054o0 = c0056p0.f81a;
        int i4 = c0054o0.mo218g().f9699b;
        LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C = this.f6632h;
        layoutInflaterFactory2C1458C.getClass();
        int i5 = c0054o0.mo218g().f9699b;
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C1458C.f6447B;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i3 = 0;
            z3 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C1458C.f6447B.getLayoutParams();
            if (layoutInflaterFactory2C1458C.f6447B.isShown()) {
                if (layoutInflaterFactory2C1458C.f6481j0 == null) {
                    layoutInflaterFactory2C1458C.f6481j0 = new Rect();
                    layoutInflaterFactory2C1458C.f6482k0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C1458C.f6481j0;
                Rect rect2 = layoutInflaterFactory2C1458C.f6482k0;
                boolean z6 = true;
                rect.set(c0054o0.mo218g().f9698a, c0054o0.mo218g().f9699b, c0054o0.mo218g().f9700c, c0054o0.mo218g().f9701d);
                ViewGroup viewGroup = layoutInflaterFactory2C1458C.f6453H;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z7 = AbstractC1878l1.f8219a;
                    AbstractC1875k1.m4395a(viewGroup, rect, rect2);
                } else {
                    if (!AbstractC1878l1.f8219a) {
                        AbstractC1878l1.f8219a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            AbstractC1878l1.f8220b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                AbstractC1878l1.f8220b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = AbstractC1878l1.f8220b;
                    if (method != null) {
                        try {
                            Object[] objArr = new Object[2];
                            objArr[0] = rect;
                            z6 = true;
                            try {
                                objArr[1] = rect2;
                                method.invoke(viewGroup, objArr);
                            } catch (Exception e3) {
                                e = e3;
                                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                            }
                        } catch (Exception e4) {
                            e = e4;
                            z6 = true;
                        }
                    } else {
                        z6 = true;
                    }
                }
                int i6 = rect.top;
                int i7 = rect.left;
                int i8 = rect.right;
                ViewGroup viewGroup2 = layoutInflaterFactory2C1458C.f6453H;
                WeakHashMap weakHashMap = AbstractC0016Q.f14a;
                C0056p0 c0056p0M34a = Build.VERSION.SDK_INT >= 23 ? AbstractC0006G.m34a(viewGroup2) : AbstractC0005F.m17j(viewGroup2);
                int i9 = c0056p0M34a == null ? 0 : c0056p0M34a.f81a.mo218g().f9698a;
                int i10 = c0056p0M34a == null ? 0 : c0056p0M34a.f81a.mo218g().f9700c;
                if (marginLayoutParams.topMargin == i6 && marginLayoutParams.leftMargin == i7 && marginLayoutParams.rightMargin == i8) {
                    z5 = false;
                } else {
                    marginLayoutParams.topMargin = i6;
                    marginLayoutParams.leftMargin = i7;
                    marginLayoutParams.rightMargin = i8;
                    z5 = true;
                }
                Context context = layoutInflaterFactory2C1458C.f6487q;
                if (i6 <= 0 || layoutInflaterFactory2C1458C.f6455J != null) {
                    View view2 = layoutInflaterFactory2C1458C.f6455J;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i11 = marginLayoutParams2.height;
                        int i12 = marginLayoutParams.topMargin;
                        if (i11 != i12 || marginLayoutParams2.leftMargin != i9 || marginLayoutParams2.rightMargin != i10) {
                            marginLayoutParams2.height = i12;
                            marginLayoutParams2.leftMargin = i9;
                            marginLayoutParams2.rightMargin = i10;
                            layoutInflaterFactory2C1458C.f6455J.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C1458C.f6455J = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i9;
                    layoutParams.rightMargin = i10;
                    layoutInflaterFactory2C1458C.f6453H.addView(layoutInflaterFactory2C1458C.f6455J, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C1458C.f6455J;
                if (view4 == null) {
                    z6 = false;
                }
                if (z6 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C1458C.f6455J;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? AbstractC0230e.m739q(context, R.color.abc_decor_view_status_guard_light) : AbstractC0230e.m739q(context, R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C1458C.f6460O && z6) {
                    i5 = 0;
                }
                z3 = z6;
                z4 = z5;
                i3 = 0;
            } else {
                z4 = true;
                i3 = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z3 = false;
                } else {
                    z3 = false;
                    z4 = false;
                }
            }
            if (z4) {
                layoutInflaterFactory2C1458C.f6447B.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C1458C.f6455J;
        if (view6 != null) {
            if (!z3) {
                i3 = 8;
            }
            view6.setVisibility(i3);
        }
        if (i4 != i5) {
            int i13 = c0054o0.mo218g().f9698a;
            int i14 = c0054o0.mo218g().f9700c;
            int i15 = c0054o0.mo218g().f9701d;
            int i16 = Build.VERSION.SDK_INT;
            if (i16 >= 30) {
                c0036f0 = new C0038g0(c0056p0);
            } else {
                c0036f0 = i16 >= 29 ? new C0036f0(c0056p0) : new C0032d0(c0056p0);
            }
            c0036f0.mo182d(C2264c.m4862a(i13, i5, i14, i15));
            c0056p0Mo180b = c0036f0.mo180b();
        } else {
            c0056p0Mo180b = c0056p0;
        }
        WeakHashMap weakHashMap2 = AbstractC0016Q.f14a;
        WindowInsets windowInsetsM317b = c0056p0Mo180b.m317b();
        if (windowInsetsM317b == null) {
            return c0056p0Mo180b;
        }
        WindowInsets windowInsetsM6b = AbstractC0003D.m6b(view, windowInsetsM317b);
        return !windowInsetsM6b.equals(windowInsetsM317b) ? C0056p0.m316c(windowInsetsM6b, view) : c0056p0Mo180b;
    }

    @Override // p110j.InterfaceC1783x
    /* JADX INFO: renamed from: c */
    public boolean mo3617c(MenuC1772m menuC1772m) {
        Window.Callback callback;
        switch (this.f6631g) {
            case 2:
                Window.Callback callback2 = this.f6632h.f6488r.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC1772m);
                }
                break;
            default:
                if (menuC1772m == menuC1772m.mo4231k()) {
                    LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C = this.f6632h;
                    if (layoutInflaterFactory2C1458C.f6458M && (callback = layoutInflaterFactory2C1458C.f6488r.getCallback()) != null && !layoutInflaterFactory2C1458C.f6469X) {
                        callback.onMenuOpened(108, menuC1772m);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}

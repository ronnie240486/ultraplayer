package p110j;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.zuxoplayer.app.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p089d1.C1447t;
import p113k.AbstractC1805G0;
import p113k.AbstractC1807H0;
import p113k.C1811J0;
import p113k.C1890r0;
import p113k.C1905z;

/* JADX INFO: renamed from: j.g */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC1766g extends AbstractC1780u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: B */
    public boolean f7856B;

    /* JADX INFO: renamed from: C */
    public InterfaceC1783x f7857C;

    /* JADX INFO: renamed from: D */
    public ViewTreeObserver f7858D;

    /* JADX INFO: renamed from: E */
    public C1781v f7859E;

    /* JADX INFO: renamed from: F */
    public boolean f7860F;

    /* JADX INFO: renamed from: h */
    public final Context f7861h;

    /* JADX INFO: renamed from: i */
    public final int f7862i;

    /* JADX INFO: renamed from: j */
    public final int f7863j;

    /* JADX INFO: renamed from: k */
    public final boolean f7864k;

    /* JADX INFO: renamed from: l */
    public final Handler f7865l;

    /* JADX INFO: renamed from: o */
    public final ViewTreeObserverOnGlobalLayoutListenerC1763d f7868o;

    /* JADX INFO: renamed from: p */
    public final ViewOnAttachStateChangeListenerC1764e f7869p;

    /* JADX INFO: renamed from: t */
    public View f7873t;

    /* JADX INFO: renamed from: u */
    public View f7874u;

    /* JADX INFO: renamed from: v */
    public int f7875v;

    /* JADX INFO: renamed from: w */
    public boolean f7876w;

    /* JADX INFO: renamed from: x */
    public boolean f7877x;

    /* JADX INFO: renamed from: y */
    public int f7878y;

    /* JADX INFO: renamed from: z */
    public int f7879z;

    /* JADX INFO: renamed from: m */
    public final ArrayList f7866m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public final ArrayList f7867n = new ArrayList();

    /* JADX INFO: renamed from: q */
    public final C1447t f7870q = new C1447t(12, this);

    /* JADX INFO: renamed from: r */
    public int f7871r = 0;

    /* JADX INFO: renamed from: s */
    public int f7872s = 0;

    /* JADX INFO: renamed from: A */
    public boolean f7855A = false;

    public ViewOnKeyListenerC1766g(Context context, View view, int i3, boolean z3) {
        int i4 = 0;
        this.f7868o = new ViewTreeObserverOnGlobalLayoutListenerC1763d(i4, this);
        this.f7869p = new ViewOnAttachStateChangeListenerC1764e(this, i4);
        this.f7861h = context;
        this.f7873t = view;
        this.f7863j = i3;
        this.f7864k = z3;
        this.f7875v = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f7862i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f7865l = new Handler();
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: a */
    public final void mo4214a(MenuC1772m menuC1772m, boolean z3) {
        ArrayList arrayList = this.f7867n;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (menuC1772m == ((C1765f) arrayList.get(i3)).f7853b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 < 0) {
            return;
        }
        int i4 = i3 + 1;
        if (i4 < arrayList.size()) {
            ((C1765f) arrayList.get(i4)).f7853b.m4253c(false);
        }
        C1765f c1765f = (C1765f) arrayList.remove(i3);
        c1765f.f7853b.m4260r(this);
        boolean z4 = this.f7860F;
        C1811J0 c1811j0 = c1765f.f7852a;
        if (z4) {
            if (Build.VERSION.SDK_INT >= 23) {
                AbstractC1805G0.m4302b(c1811j0.f8004E, null);
            }
            c1811j0.f8004E.setAnimationStyle(0);
        }
        c1811j0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f7875v = ((C1765f) arrayList.get(size2 - 1)).f7854c;
        } else {
            this.f7875v = this.f7873t.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z3) {
                ((C1765f) arrayList.get(0)).f7853b.m4253c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC1783x interfaceC1783x = this.f7857C;
        if (interfaceC1783x != null) {
            interfaceC1783x.mo3615a(menuC1772m, true);
        }
        ViewTreeObserver viewTreeObserver = this.f7858D;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f7858D.removeGlobalOnLayoutListener(this.f7868o);
            }
            this.f7858D = null;
        }
        this.f7874u.removeOnAttachStateChangeListener(this.f7869p);
        this.f7859E.onDismiss();
    }

    @Override // p110j.InterfaceC1757C
    /* JADX INFO: renamed from: b */
    public final boolean mo4211b() {
        ArrayList arrayList = this.f7867n;
        return arrayList.size() > 0 && ((C1765f) arrayList.get(0)).f7852a.f8004E.isShowing();
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: d */
    public final boolean mo4215d() {
        return false;
    }

    @Override // p110j.InterfaceC1757C
    public final void dismiss() {
        ArrayList arrayList = this.f7867n;
        int size = arrayList.size();
        if (size > 0) {
            C1765f[] c1765fArr = (C1765f[]) arrayList.toArray(new C1765f[size]);
            for (int i3 = size - 1; i3 >= 0; i3--) {
                C1765f c1765f = c1765fArr[i3];
                if (c1765f.f7852a.f8004E.isShowing()) {
                    c1765f.f7852a.dismiss();
                }
            }
        }
    }

    @Override // p110j.InterfaceC1757C
    /* JADX INFO: renamed from: f */
    public final void mo4212f() {
        if (mo4211b()) {
            return;
        }
        ArrayList arrayList = this.f7866m;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            m4243v((MenuC1772m) obj);
        }
        arrayList.clear();
        View view = this.f7873t;
        this.f7874u = view;
        if (view != null) {
            boolean z3 = this.f7858D == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f7858D = viewTreeObserver;
            if (z3) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f7868o);
            }
            this.f7874u.addOnAttachStateChangeListener(this.f7869p);
        }
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: g */
    public final void mo4216g() {
        ArrayList arrayList = this.f7867n;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ListAdapter adapter = ((C1765f) obj).f7852a.f8007i.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C1769j) adapter).notifyDataSetChanged();
        }
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: i */
    public final void mo4217i(InterfaceC1783x interfaceC1783x) {
        this.f7857C = interfaceC1783x;
    }

    @Override // p110j.InterfaceC1757C
    /* JADX INFO: renamed from: j */
    public final C1890r0 mo4213j() {
        ArrayList arrayList = this.f7867n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C1765f) arrayList.get(arrayList.size() - 1)).f7852a.f8007i;
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: k */
    public final boolean mo4218k(SubMenuC1759E subMenuC1759E) {
        ArrayList arrayList = this.f7867n;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            C1765f c1765f = (C1765f) obj;
            if (subMenuC1759E == c1765f.f7853b) {
                c1765f.f7852a.f8007i.requestFocus();
                return true;
            }
        }
        if (!subMenuC1759E.hasVisibleItems()) {
            return false;
        }
        mo4219l(subMenuC1759E);
        InterfaceC1783x interfaceC1783x = this.f7857C;
        if (interfaceC1783x != null) {
            interfaceC1783x.mo3617c(subMenuC1759E);
        }
        return true;
    }

    @Override // p110j.AbstractC1780u
    /* JADX INFO: renamed from: l */
    public final void mo4219l(MenuC1772m menuC1772m) {
        menuC1772m.m4252b(this, this.f7861h);
        if (mo4211b()) {
            m4243v(menuC1772m);
        } else {
            this.f7866m.add(menuC1772m);
        }
    }

    @Override // p110j.AbstractC1780u
    /* JADX INFO: renamed from: n */
    public final void mo4220n(View view) {
        if (this.f7873t != view) {
            this.f7873t = view;
            this.f7872s = Gravity.getAbsoluteGravity(this.f7871r, view.getLayoutDirection());
        }
    }

    @Override // p110j.AbstractC1780u
    /* JADX INFO: renamed from: o */
    public final void mo4221o(boolean z3) {
        this.f7855A = z3;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C1765f c1765f;
        ArrayList arrayList = this.f7867n;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                c1765f = null;
                break;
            }
            c1765f = (C1765f) arrayList.get(i3);
            if (!c1765f.f7852a.f8004E.isShowing()) {
                break;
            } else {
                i3++;
            }
        }
        if (c1765f != null) {
            c1765f.f7853b.m4253c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i3 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p110j.AbstractC1780u
    /* JADX INFO: renamed from: p */
    public final void mo4222p(int i3) {
        if (this.f7871r != i3) {
            this.f7871r = i3;
            this.f7872s = Gravity.getAbsoluteGravity(i3, this.f7873t.getLayoutDirection());
        }
    }

    @Override // p110j.AbstractC1780u
    /* JADX INFO: renamed from: q */
    public final void mo4223q(int i3) {
        this.f7876w = true;
        this.f7878y = i3;
    }

    @Override // p110j.AbstractC1780u
    /* JADX INFO: renamed from: r */
    public final void mo4224r(PopupWindow.OnDismissListener onDismissListener) {
        this.f7859E = (C1781v) onDismissListener;
    }

    @Override // p110j.AbstractC1780u
    /* JADX INFO: renamed from: s */
    public final void mo4225s(boolean z3) {
        this.f7856B = z3;
    }

    @Override // p110j.AbstractC1780u
    /* JADX INFO: renamed from: t */
    public final void mo4226t(int i3) {
        this.f7877x = true;
        this.f7879z = i3;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0151  */
    /* JADX WARN: Code duplicated, block: B:63:0x0154  */
    /* JADX INFO: renamed from: v */
    public final void m4243v(MenuC1772m menuC1772m) {
        char c;
        View childAt;
        C1765f c1765f;
        int i3;
        int i4;
        int i5;
        int width;
        MenuItem item;
        C1769j c1769j;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f7861h;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        C1769j c1769j2 = new C1769j(menuC1772m, layoutInflaterFrom, this.f7864k, R.layout.abc_cascading_menu_item_layout);
        if (!mo4211b() && this.f7855A) {
            c1769j2.f7890i = true;
        } else if (mo4211b()) {
            c1769j2.f7890i = AbstractC1780u.m4271u(menuC1772m);
        }
        int iM4270m = AbstractC1780u.m4270m(c1769j2, context, this.f7862i);
        C1811J0 c1811j0 = new C1811J0(context, null, this.f7863j);
        C1905z c1905z = c1811j0.f8004E;
        c1811j0.f8043I = this.f7870q;
        c1811j0.f8020v = this;
        c1905z.setOnDismissListener(this);
        c1811j0.f8019u = this.f7873t;
        c1811j0.f8016r = this.f7872s;
        c1811j0.f8003D = true;
        c1905z.setFocusable(true);
        c1905z.setInputMethodMode(2);
        c1811j0.mo4296o(c1769j2);
        c1811j0.m4298r(iM4270m);
        c1811j0.f8016r = this.f7872s;
        ArrayList arrayList = this.f7867n;
        if (arrayList.size() > 0) {
            c1765f = (C1765f) arrayList.get(arrayList.size() - 1);
            MenuC1772m menuC1772m2 = c1765f.f7853b;
            int size = menuC1772m2.f7900f.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    item = null;
                    break;
                }
                item = menuC1772m2.getItem(i6);
                if (item.hasSubMenu() && menuC1772m == item.getSubMenu()) {
                    break;
                } else {
                    i6++;
                }
            }
            if (item == null) {
                childAt = null;
                c = 0;
            } else {
                C1890r0 c1890r0 = c1765f.f7852a.f8007i;
                ListAdapter adapter = c1890r0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c1769j = (C1769j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c1769j = (C1769j) adapter;
                    headersCount = 0;
                }
                int count = c1769j.getCount();
                int i7 = 0;
                c = 0;
                while (true) {
                    if (i7 >= count) {
                        i7 = -1;
                        break;
                    } else if (item == c1769j.getItem(i7)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                childAt = (i7 != -1 && (firstVisiblePosition = (i7 + headersCount) - c1890r0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c1890r0.getChildCount()) ? c1890r0.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            c = 0;
            childAt = null;
            c1765f = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = C1811J0.f8042J;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[c] = Boolean.FALSE;
                        method.invoke(c1905z, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                AbstractC1807H0.m4303a(c1905z, false);
            }
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 23) {
                AbstractC1805G0.m4301a(c1905z, null);
            }
            C1890r0 c1890r1 = ((C1765f) arrayList.get(arrayList.size() - 1)).f7852a.f8007i;
            int[] iArr = new int[2];
            c1890r1.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.f7874u.getWindowVisibleDisplayFrame(rect);
            if (this.f7875v == 1) {
                if (c1890r1.getWidth() + iArr[0] + iM4270m > rect.right) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
            } else if (iArr[0] - iM4270m < 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            boolean z3 = i3 == 1;
            this.f7875v = i3;
            if (i8 >= 26) {
                c1811j0.f8019u = childAt;
                i4 = 0;
                i5 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.f7873t.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.f7872s & 7) == 5) {
                    iArr2[0] = this.f7873t.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                }
                int i9 = iArr3[0] - iArr2[0];
                i4 = iArr3[1] - iArr2[1];
                i5 = i9;
            }
            if ((this.f7872s & 5) == 5) {
                width = z3 ? i5 + iM4270m : i5 - childAt.getWidth();
            } else {
                width = z3 ? i5 + childAt.getWidth() : i5 - iM4270m;
            }
            c1811j0.f8010l = width;
            c1811j0.f8015q = true;
            c1811j0.f8014p = true;
            c1811j0.m4295n(i4);
        } else {
            if (this.f7876w) {
                c1811j0.f8010l = this.f7878y;
            }
            if (this.f7877x) {
                c1811j0.m4295n(this.f7879z);
            }
            Rect rect2 = this.f7961g;
            c1811j0.f8002C = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new C1765f(c1811j0, menuC1772m, this.f7875v));
        c1811j0.mo4212f();
        C1890r0 c1890r2 = c1811j0.f8007i;
        c1890r2.setOnKeyListener(this);
        if (c1765f == null && this.f7856B && menuC1772m.f7907m != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c1890r2, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC1772m.f7907m);
            c1890r2.addHeaderView(frameLayout, null, false);
            c1811j0.mo4212f();
        }
    }
}

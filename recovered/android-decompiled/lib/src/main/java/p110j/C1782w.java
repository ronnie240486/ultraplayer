package p110j;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.zuxoplayer.app.R;

/* JADX INFO: renamed from: j.w */
/* JADX INFO: loaded from: classes.dex */
public class C1782w {

    /* JADX INFO: renamed from: a */
    public final Context f7963a;

    /* JADX INFO: renamed from: b */
    public final MenuC1772m f7964b;

    /* JADX INFO: renamed from: c */
    public final boolean f7965c;

    /* JADX INFO: renamed from: d */
    public final int f7966d;

    /* JADX INFO: renamed from: e */
    public View f7967e;

    /* JADX INFO: renamed from: g */
    public boolean f7969g;

    /* JADX INFO: renamed from: h */
    public InterfaceC1783x f7970h;

    /* JADX INFO: renamed from: i */
    public AbstractC1780u f7971i;

    /* JADX INFO: renamed from: j */
    public C1781v f7972j;

    /* JADX INFO: renamed from: f */
    public int f7968f = 8388611;

    /* JADX INFO: renamed from: k */
    public final C1781v f7973k = new C1781v(this);

    public C1782w(int i3, Context context, View view, MenuC1772m menuC1772m, boolean z3) {
        this.f7963a = context;
        this.f7964b = menuC1772m;
        this.f7967e = view;
        this.f7965c = z3;
        this.f7966d = i3;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC1780u m4272a() {
        AbstractC1780u viewOnKeyListenerC1758D;
        if (this.f7971i == null) {
            Context context = this.f7963a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC1758D = new ViewOnKeyListenerC1766g(context, this.f7967e, this.f7966d, this.f7965c);
            } else {
                View view = this.f7967e;
                Context context2 = this.f7963a;
                boolean z3 = this.f7965c;
                viewOnKeyListenerC1758D = new ViewOnKeyListenerC1758D(this.f7966d, context2, view, this.f7964b, z3);
            }
            viewOnKeyListenerC1758D.mo4219l(this.f7964b);
            viewOnKeyListenerC1758D.mo4224r(this.f7973k);
            viewOnKeyListenerC1758D.mo4220n(this.f7967e);
            viewOnKeyListenerC1758D.mo4217i(this.f7970h);
            viewOnKeyListenerC1758D.mo4221o(this.f7969g);
            viewOnKeyListenerC1758D.mo4222p(this.f7968f);
            this.f7971i = viewOnKeyListenerC1758D;
        }
        return this.f7971i;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4273b() {
        AbstractC1780u abstractC1780u = this.f7971i;
        return abstractC1780u != null && abstractC1780u.mo4211b();
    }

    /* JADX INFO: renamed from: c */
    public void mo4274c() {
        this.f7971i = null;
        C1781v c1781v = this.f7972j;
        if (c1781v != null) {
            c1781v.onDismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4275d(int i3, int i4, boolean z3, boolean z4) {
        AbstractC1780u abstractC1780uM4272a = m4272a();
        abstractC1780uM4272a.mo4225s(z4);
        if (z3) {
            if ((Gravity.getAbsoluteGravity(this.f7968f, this.f7967e.getLayoutDirection()) & 7) == 5) {
                i3 -= this.f7967e.getWidth();
            }
            abstractC1780uM4272a.mo4223q(i3);
            abstractC1780uM4272a.mo4226t(i4);
            int i5 = (int) ((this.f7963a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC1780uM4272a.f7961g = new Rect(i3 - i5, i4 - i5, i3 + i5, i4 + i5);
        }
        abstractC1780uM4272a.mo4212f();
    }
}

package p113k;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p089d1.C1447t;
import p110j.C1774o;
import p110j.MenuC1772m;

/* JADX INFO: renamed from: k.J0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1811J0 extends AbstractC1801E0 implements InterfaceC1803F0 {

    /* JADX INFO: renamed from: J */
    public static final Method f8042J;

    /* JADX INFO: renamed from: I */
    public C1447t f8043I;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f8042J = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // p113k.InterfaceC1803F0
    /* JADX INFO: renamed from: d */
    public final void mo3618d(MenuC1772m menuC1772m, C1774o c1774o) {
        C1447t c1447t = this.f8043I;
        if (c1447t != null) {
            c1447t.mo3618d(menuC1772m, c1774o);
        }
    }

    @Override // p113k.InterfaceC1803F0
    /* JADX INFO: renamed from: l */
    public final void mo3624l(MenuC1772m menuC1772m, C1774o c1774o) {
        C1447t c1447t = this.f8043I;
        if (c1447t != null) {
            c1447t.mo3624l(menuC1772m, c1774o);
        }
    }

    @Override // p113k.AbstractC1801E0
    /* JADX INFO: renamed from: q */
    public final C1890r0 mo4297q(Context context, boolean z3) {
        C1809I0 c1809i0 = new C1809I0(context, z3);
        c1809i0.setHoverListener(this);
        return c1809i0;
    }
}

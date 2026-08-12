package p091e;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.android.gms.internal.cast.C1323r;
import java.util.WeakHashMap;
import p000A.AbstractC0003D;
import p000A.AbstractC0016Q;
import p060U1.AbstractC0610a;

/* JADX INFO: renamed from: e.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1489t extends AbstractC0610a {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f6633n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f6634o;

    public /* synthetic */ C1489t(int i3, Object obj) {
        this.f6633n = i3;
        this.f6634o = obj;
    }

    @Override // p000A.InterfaceC0028b0
    /* JADX INFO: renamed from: a */
    public final void mo118a() {
        Object obj = this.f6634o;
        switch (this.f6633n) {
            case 0:
                LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C = ((RunnableC1487r) obj).f6630h;
                layoutInflaterFactory2C1458C.f6447B.setAlpha(1.0f);
                layoutInflaterFactory2C1458C.f6450E.m107d(null);
                layoutInflaterFactory2C1458C.f6450E = null;
                break;
            case 1:
                LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C2 = (LayoutInflaterFactory2C1458C) obj;
                layoutInflaterFactory2C1458C2.f6447B.setAlpha(1.0f);
                layoutInflaterFactory2C1458C2.f6450E.m107d(null);
                layoutInflaterFactory2C1458C2.f6450E = null;
                break;
            default:
                C1323r c1323r = (C1323r) obj;
                ((LayoutInflaterFactory2C1458C) c1323r.f5962i).f6447B.setVisibility(8);
                LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C3 = (LayoutInflaterFactory2C1458C) c1323r.f5962i;
                PopupWindow popupWindow = layoutInflaterFactory2C1458C3.f6448C;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C1458C3.f6447B.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C1458C3.f6447B.getParent();
                    WeakHashMap weakHashMap = AbstractC0016Q.f14a;
                    AbstractC0003D.m7c(view);
                }
                layoutInflaterFactory2C1458C3.f6447B.m2324e();
                layoutInflaterFactory2C1458C3.f6450E.m107d(null);
                layoutInflaterFactory2C1458C3.f6450E = null;
                ViewGroup viewGroup = layoutInflaterFactory2C1458C3.f6453H;
                WeakHashMap weakHashMap2 = AbstractC0016Q.f14a;
                AbstractC0003D.m7c(viewGroup);
                break;
        }
    }

    @Override // p060U1.AbstractC0610a, p000A.InterfaceC0028b0
    /* JADX INFO: renamed from: c */
    public void mo120c() {
        Object obj = this.f6634o;
        switch (this.f6633n) {
            case 0:
                ((RunnableC1487r) obj).f6630h.f6447B.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C = (LayoutInflaterFactory2C1458C) obj;
                layoutInflaterFactory2C1458C.f6447B.setVisibility(0);
                if (layoutInflaterFactory2C1458C.f6447B.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C1458C.f6447B.getParent();
                    WeakHashMap weakHashMap = AbstractC0016Q.f14a;
                    AbstractC0003D.m7c(view);
                }
                break;
        }
    }
}

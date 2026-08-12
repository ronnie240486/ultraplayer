package p091e;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.gms.internal.cast.C1323r;
import java.util.WeakHashMap;
import p000A.AbstractC0003D;
import p000A.AbstractC0016Q;
import p060U1.AbstractC0610a;

/* JADX INFO: renamed from: e.L */
/* JADX INFO: loaded from: classes.dex */
public final class C1467L extends AbstractC0610a {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f6519n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ C1469N f6520o;

    public /* synthetic */ C1467L(C1469N c1469n, int i3) {
        this.f6519n = i3;
        this.f6520o = c1469n;
    }

    @Override // p000A.InterfaceC0028b0
    /* JADX INFO: renamed from: a */
    public final void mo118a() {
        View view;
        C1469N c1469n = this.f6520o;
        switch (this.f6519n) {
            case 0:
                if (c1469n.f6548w && (view = c1469n.f6540o) != null) {
                    view.setTranslationY(0.0f);
                    c1469n.f6537l.setTranslationY(0.0f);
                }
                c1469n.f6537l.setVisibility(8);
                c1469n.f6537l.setTransitioning(false);
                c1469n.f6528A = null;
                C1323r c1323r = c1469n.f6544s;
                if (c1323r != null) {
                    c1323r.m3359G(c1469n.f6543r);
                    c1469n.f6543r = null;
                    c1469n.f6544s = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = c1469n.f6536k;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = AbstractC0016Q.f14a;
                    AbstractC0003D.m7c(actionBarOverlayLayout);
                }
                break;
            default:
                c1469n.f6528A = null;
                c1469n.f6537l.requestLayout();
                break;
        }
    }
}

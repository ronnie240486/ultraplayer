package p104h1;

import android.support.v4.media.session.C0858A;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p000A.C0058r;
import p001A0.C0069c;

/* JADX INFO: renamed from: h1.B */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1618B {

    /* JADX INFO: renamed from: a */
    public C1666w f7338a;

    /* JADX INFO: renamed from: b */
    public ArrayList f7339b;

    /* JADX INFO: renamed from: c */
    public long f7340c;

    /* JADX INFO: renamed from: d */
    public long f7341d;

    /* JADX INFO: renamed from: e */
    public long f7342e;

    /* JADX INFO: renamed from: f */
    public long f7343f;

    /* JADX INFO: renamed from: b */
    public static void m3990b(AbstractC1635T abstractC1635T) {
        RecyclerView recyclerView;
        int i3 = abstractC1635T.f7414i;
        if (abstractC1635T.m4051e() || (i3 & 4) != 0 || (recyclerView = abstractC1635T.f7422q) == null) {
            return;
        }
        recyclerView.m2750D(abstractC1635T);
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo3991a(AbstractC1635T abstractC1635T, AbstractC1635T abstractC1635T2, C0058r c0058r, C0058r c0058r2);

    /* JADX INFO: renamed from: c */
    public final void m3992c(AbstractC1635T abstractC1635T) {
        C1666w c1666w = this.f7338a;
        if (c1666w != null) {
            boolean z3 = true;
            abstractC1635T.m4059m(true);
            if (abstractC1635T.f7412g != null && abstractC1635T.f7413h == null) {
                abstractC1635T.f7412g = null;
            }
            abstractC1635T.f7413h = null;
            if ((abstractC1635T.f7414i & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c1666w.f7586a;
            recyclerView.m2771Z();
            C0858A c0858a = recyclerView.f4754l;
            C1666w c1666w2 = (C1666w) c0858a.f3639h;
            RecyclerView recyclerView2 = c1666w2.f7586a;
            View view = abstractC1635T.f7406a;
            int iIndexOfChild = recyclerView2.indexOfChild(view);
            if (iIndexOfChild == -1) {
                c0858a.m2175X(view);
            } else {
                C0069c c0069c = (C0069c) c0858a.f3640i;
                if (c0069c.m350v(iIndexOfChild)) {
                    c0069c.m352x(iIndexOfChild);
                    c0858a.m2175X(view);
                    c1666w2.m4099h(iIndexOfChild);
                } else {
                    z3 = false;
                }
            }
            if (z3) {
                AbstractC1635T abstractC1635TM2741F = RecyclerView.m2741F(view);
                C1627K c1627k = recyclerView.f4748i;
                c1627k.m4042l(abstractC1635TM2741F);
                c1627k.m4039i(abstractC1635TM2741F);
            }
            recyclerView.m2772a0(!z3);
            if (z3 || !abstractC1635T.m4055i()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo3993d(AbstractC1635T abstractC1635T);

    /* JADX INFO: renamed from: e */
    public abstract void mo3994e();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo3995f();
}

package androidx.mediarouter.app;

import android.view.animation.Animation;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.mediarouter.app.n */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC1045n implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4589a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4590b;

    public /* synthetic */ AnimationAnimationListenerC1045n(int i3, Object obj) {
        this.f4589a = i3;
        this.f4590b = obj;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.f4589a) {
            case 0:
                break;
            case 1:
                ((DialogC1051t) this.f4590b).m2656l(true);
                break;
            default:
                DialogC1028O dialogC1028O = ((C1026M) this.f4590b).f4457l;
                dialogC1028O.f4475E = false;
                dialogC1028O.m2628p();
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i3 = this.f4589a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.f4589a) {
            case 0:
                DialogC1051t dialogC1051t = (DialogC1051t) this.f4590b;
                OverlayListView overlayListView = dialogC1051t.f4618K;
                ArrayList arrayList = overlayListView.f4511g;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    C1029P c1029p = (C1029P) obj;
                    if (!c1029p.f4521j) {
                        c1029p.f4520i = overlayListView.getDrawingTime();
                        c1029p.f4521j = true;
                    }
                }
                dialogC1051t.f4618K.postDelayed(dialogC1051t.f4663u0, dialogC1051t.f4649n0);
                break;
            case 1:
                break;
            default:
                ((C1026M) this.f4590b).f4457l.f4475E = true;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m2640a(Animation animation) {
    }

    /* JADX INFO: renamed from: b */
    private final void m2641b(Animation animation) {
    }

    /* JADX INFO: renamed from: c */
    private final void m2642c(Animation animation) {
    }

    /* JADX INFO: renamed from: d */
    private final void m2643d(Animation animation) {
    }

    /* JADX INFO: renamed from: e */
    private final void m2644e(Animation animation) {
    }
}

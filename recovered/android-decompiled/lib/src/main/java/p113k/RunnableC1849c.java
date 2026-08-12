package p113k;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: k.c */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1849c implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f8131g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ActionBarOverlayLayout f8132h;

    public /* synthetic */ RunnableC1849c(ActionBarOverlayLayout actionBarOverlayLayout, int i3) {
        this.f8131g = i3;
        this.f8132h = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8131g) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f8132h;
                actionBarOverlayLayout.m2328h();
                actionBarOverlayLayout.f3846C = actionBarOverlayLayout.f3855j.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f3847D);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f8132h;
                actionBarOverlayLayout2.m2328h();
                actionBarOverlayLayout2.f3846C = actionBarOverlayLayout2.f3855j.animate().translationY(-actionBarOverlayLayout2.f3855j.getHeight()).setListener(actionBarOverlayLayout2.f3847D);
                break;
        }
    }
}

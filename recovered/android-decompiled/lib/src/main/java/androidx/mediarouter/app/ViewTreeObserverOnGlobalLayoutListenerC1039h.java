package androidx.mediarouter.app;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import java.util.HashSet;
import p089d1.C1403C;

/* JADX INFO: renamed from: androidx.mediarouter.app.h */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1039h implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ DialogC1051t f4577g;

    public ViewTreeObserverOnGlobalLayoutListenerC1039h(DialogC1051t dialogC1051t) {
        this.f4577g = dialogC1051t;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        DialogC1051t dialogC1051t = this.f4577g;
        dialogC1051t.f4618K.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = dialogC1051t.f4621N;
        if (hashSet == null || hashSet.size() == 0) {
            dialogC1051t.m2656l(true);
            return;
        }
        AnimationAnimationListenerC1045n animationAnimationListenerC1045n = new AnimationAnimationListenerC1045n(1, dialogC1051t);
        int firstVisiblePosition = dialogC1051t.f4618K.getFirstVisiblePosition();
        boolean z3 = false;
        for (int i3 = 0; i3 < dialogC1051t.f4618K.getChildCount(); i3++) {
            View childAt = dialogC1051t.f4618K.getChildAt(i3);
            if (dialogC1051t.f4621N.contains((C1403C) dialogC1051t.f4619L.getItem(firstVisiblePosition + i3))) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(dialogC1051t.f4651o0);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                if (!z3) {
                    alphaAnimation.setAnimationListener(animationAnimationListenerC1045n);
                    z3 = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(alphaAnimation);
            }
        }
    }
}

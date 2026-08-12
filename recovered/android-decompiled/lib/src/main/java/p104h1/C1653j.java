package p104h1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: h1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1653j extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public boolean f7507a = false;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1655l f7508b;

    public C1653j(C1655l c1655l) {
        this.f7508b = c1655l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f7507a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f7507a) {
            this.f7507a = false;
            return;
        }
        C1655l c1655l = this.f7508b;
        if (((Float) c1655l.f7539z.getAnimatedValue()).floatValue() == 0.0f) {
            c1655l.f7512A = 0;
            c1655l.m4081d(0);
        } else {
            c1655l.f7512A = 2;
            c1655l.f7532s.invalidate();
        }
    }
}

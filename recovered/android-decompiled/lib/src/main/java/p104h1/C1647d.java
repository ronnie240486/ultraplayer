package p104h1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: h1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1647d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC1635T f7471a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f7472b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f7473c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f7474d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f7475e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1651h f7476f;

    public C1647d(C1651h c1651h, AbstractC1635T abstractC1635T, int i3, View view, int i4, ViewPropertyAnimator viewPropertyAnimator) {
        this.f7476f = c1651h;
        this.f7471a = abstractC1635T;
        this.f7472b = i3;
        this.f7473c = view;
        this.f7474d = i4;
        this.f7475e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i3 = this.f7472b;
        View view = this.f7473c;
        if (i3 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f7474d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7475e.setListener(null);
        C1651h c1651h = this.f7476f;
        AbstractC1635T abstractC1635T = this.f7471a;
        c1651h.m3992c(abstractC1635T);
        c1651h.f7503p.remove(abstractC1635T);
        c1651h.m4074i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f7476f.getClass();
    }
}

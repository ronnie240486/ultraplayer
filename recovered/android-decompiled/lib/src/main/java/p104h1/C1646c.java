package p104h1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: h1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1646c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7466a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC1635T f7467b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f7468c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ViewPropertyAnimator f7469d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1651h f7470e;

    public C1646c(C1651h c1651h, AbstractC1635T abstractC1635T, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f7470e = c1651h;
        this.f7467b = abstractC1635T;
        this.f7469d = viewPropertyAnimator;
        this.f7468c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f7466a) {
            case 1:
                this.f7468c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7466a) {
            case 0:
                this.f7469d.setListener(null);
                this.f7468c.setAlpha(1.0f);
                C1651h c1651h = this.f7470e;
                AbstractC1635T abstractC1635T = this.f7467b;
                c1651h.m3992c(abstractC1635T);
                c1651h.f7504q.remove(abstractC1635T);
                c1651h.m4074i();
                break;
            default:
                this.f7469d.setListener(null);
                C1651h c1651h2 = this.f7470e;
                AbstractC1635T abstractC1635T2 = this.f7467b;
                c1651h2.m3992c(abstractC1635T2);
                c1651h2.f7502o.remove(abstractC1635T2);
                c1651h2.m4074i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f7466a) {
            case 0:
                this.f7470e.getClass();
                break;
            default:
                this.f7470e.getClass();
                break;
        }
    }

    public C1646c(C1651h c1651h, AbstractC1635T abstractC1635T, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f7470e = c1651h;
        this.f7467b = abstractC1635T;
        this.f7468c = view;
        this.f7469d = viewPropertyAnimator;
    }
}

package p104h1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: h1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1648e extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7477a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1649f f7478b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f7479c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ View f7480d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1651h f7481e;

    public /* synthetic */ C1648e(C1651h c1651h, C1649f c1649f, ViewPropertyAnimator viewPropertyAnimator, View view, int i3) {
        this.f7477a = i3;
        this.f7481e = c1651h;
        this.f7478b = c1649f;
        this.f7479c = viewPropertyAnimator;
        this.f7480d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7477a) {
            case 0:
                this.f7479c.setListener(null);
                View view = this.f7480d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C1649f c1649f = this.f7478b;
                AbstractC1635T abstractC1635T = c1649f.f7482a;
                C1651h c1651h = this.f7481e;
                c1651h.m3992c(abstractC1635T);
                c1651h.f7505r.remove(c1649f.f7482a);
                c1651h.m4074i();
                break;
            default:
                this.f7479c.setListener(null);
                View view2 = this.f7480d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C1649f c1649f2 = this.f7478b;
                AbstractC1635T abstractC1635T2 = c1649f2.f7483b;
                C1651h c1651h2 = this.f7481e;
                c1651h2.m3992c(abstractC1635T2);
                c1651h2.f7505r.remove(c1649f2.f7483b);
                c1651h2.m4074i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f7477a) {
            case 0:
                AbstractC1635T abstractC1635T = this.f7478b.f7482a;
                this.f7481e.getClass();
                break;
            default:
                AbstractC1635T abstractC1635T2 = this.f7478b.f7483b;
                this.f7481e.getClass();
                break;
        }
    }
}

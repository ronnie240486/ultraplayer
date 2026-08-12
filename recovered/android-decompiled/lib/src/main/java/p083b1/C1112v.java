package p083b1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;

/* JADX INFO: renamed from: b1.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1112v extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5141a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5142b;

    public /* synthetic */ C1112v(int i3, Object obj) {
        this.f5141a = i3;
        this.f5142b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f5141a) {
            case 6:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f5142b;
                actionBarOverlayLayout.f3846C = null;
                actionBarOverlayLayout.f3861p = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f5141a) {
            case 0:
                C1114x c1114x = (C1114x) this.f5142b;
                View view = c1114x.f5150b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = c1114x.f5151c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = c1114x.f5153e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                }
                break;
            case 1:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                ((C1114x) this.f5142b).m2971i(0);
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                ((C1114x) this.f5142b).m2971i(0);
                break;
            case 4:
                ViewGroup viewGroup3 = ((C1114x) this.f5142b).f5154f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                }
                break;
            case 5:
                ViewGroup viewGroup4 = ((C1114x) this.f5142b).f5156h;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                }
                break;
            case 6:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f5142b;
                actionBarOverlayLayout.f3846C = null;
                actionBarOverlayLayout.f3861p = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Object obj = this.f5142b;
        switch (this.f5141a) {
            case 0:
                C1114x c1114x = (C1114x) obj;
                View view = c1114x.f5158j;
                if ((view instanceof C1095e) && !c1114x.f5146A) {
                    C1095e c1095e = (C1095e) view;
                    ValueAnimator valueAnimator = c1095e.f5000K;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(c1095e.f5001L, 0.0f);
                    valueAnimator.setDuration(250L);
                    valueAnimator.start();
                    break;
                }
                break;
            case 1:
                C1114x c1114x2 = (C1114x) obj;
                View view2 = c1114x2.f5150b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup = c1114x2.f5151c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = c1114x2.f5153e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(c1114x2.f5146A ? 0 : 4);
                }
                View view3 = c1114x2.f5158j;
                if ((view3 instanceof C1095e) && !c1114x2.f5146A) {
                    C1095e c1095e2 = (C1095e) view3;
                    ValueAnimator valueAnimator2 = c1095e2.f5000K;
                    if (valueAnimator2.isStarted()) {
                        valueAnimator2.cancel();
                    }
                    c1095e2.f5002M = false;
                    valueAnimator2.setFloatValues(c1095e2.f5001L, 1.0f);
                    valueAnimator2.setDuration(250L);
                    valueAnimator2.start();
                    break;
                }
                break;
            case 2:
                ((C1114x) obj).m2971i(4);
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                ((C1114x) obj).m2971i(4);
                break;
            case 4:
                C1114x c1114x3 = (C1114x) obj;
                ViewGroup viewGroup3 = c1114x3.f5156h;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                    ViewGroup viewGroup4 = c1114x3.f5156h;
                    viewGroup4.setTranslationX(viewGroup4.getWidth());
                    ViewGroup viewGroup5 = c1114x3.f5156h;
                    viewGroup5.scrollTo(viewGroup5.getWidth(), 0);
                }
                break;
            case 5:
                ViewGroup viewGroup6 = ((C1114x) obj).f5154f;
                if (viewGroup6 != null) {
                    viewGroup6.setVisibility(0);
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}

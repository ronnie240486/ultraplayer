package p104h1;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: h1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1654k implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1655l f7509a;

    public C1654k(C1655l c1655l) {
        this.f7509a = c1655l;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C1655l c1655l = this.f7509a;
        c1655l.f7516c.setAlpha(iFloatValue);
        c1655l.f7517d.setAlpha(iFloatValue);
        c1655l.f7532s.invalidate();
    }
}

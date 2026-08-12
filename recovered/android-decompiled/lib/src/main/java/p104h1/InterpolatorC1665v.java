package p104h1;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: h1.v */
/* JADX INFO: loaded from: classes.dex */
public final class InterpolatorC1665v implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f3 = f - 1.0f;
        return (f3 * f3 * f3 * f3 * f3) + 1.0f;
    }
}

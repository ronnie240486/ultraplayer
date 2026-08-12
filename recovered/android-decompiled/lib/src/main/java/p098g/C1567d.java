package p098g;

import android.animation.TimeInterpolator;

/* JADX INFO: renamed from: g.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1567d implements TimeInterpolator {

    /* JADX INFO: renamed from: a */
    public int[] f7116a;

    /* JADX INFO: renamed from: b */
    public int f7117b;

    /* JADX INFO: renamed from: c */
    public int f7118c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int i3 = (int) ((f * this.f7118c) + 0.5f);
        int i4 = this.f7117b;
        int[] iArr = this.f7116a;
        int i5 = 0;
        while (i5 < i4) {
            int i6 = iArr[i5];
            if (i3 < i6) {
                break;
            }
            i3 -= i6;
            i5++;
        }
        return (i5 / i4) + (i5 < i4 ? i3 / this.f7118c : 0.0f);
    }
}

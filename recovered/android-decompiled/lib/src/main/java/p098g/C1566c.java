package p098g;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import p066W1.AbstractC0664e;

/* JADX INFO: renamed from: g.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1566c extends AbstractC0664e {

    /* JADX INFO: renamed from: i */
    public final ObjectAnimator f7114i;

    /* JADX INFO: renamed from: j */
    public final boolean f7115j;

    public C1566c(AnimationDrawable animationDrawable, boolean z3, boolean z4) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i3 = z3 ? numberOfFrames - 1 : 0;
        int i4 = z3 ? 0 : numberOfFrames - 1;
        C1567d c1567d = new C1567d();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        c1567d.f7117b = numberOfFrames2;
        int[] iArr = c1567d.f7116a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            c1567d.f7116a = new int[numberOfFrames2];
        }
        int[] iArr2 = c1567d.f7116a;
        int i5 = 0;
        for (int i6 = 0; i6 < numberOfFrames2; i6++) {
            int duration = animationDrawable.getDuration(z3 ? (numberOfFrames2 - i6) - 1 : i6);
            iArr2[i6] = duration;
            i5 += duration;
        }
        c1567d.f7118c = i5;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i3, i4);
        objectAnimatorOfInt.setAutoCancel(true);
        objectAnimatorOfInt.setDuration(c1567d.f7118c);
        objectAnimatorOfInt.setInterpolator(c1567d);
        this.f7115j = z4;
        this.f7114i = objectAnimatorOfInt;
    }

    @Override // p066W1.AbstractC0664e
    /* JADX INFO: renamed from: P */
    public final void mo1763P() {
        this.f7114i.reverse();
    }

    @Override // p066W1.AbstractC0664e
    /* JADX INFO: renamed from: V */
    public final void mo1764V() {
        this.f7114i.start();
    }

    @Override // p066W1.AbstractC0664e
    /* JADX INFO: renamed from: W */
    public final void mo1765W() {
        this.f7114i.cancel();
    }

    @Override // p066W1.AbstractC0664e
    /* JADX INFO: renamed from: d */
    public final boolean mo1766d() {
        return this.f7115j;
    }
}

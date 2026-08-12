package p000A;

import android.view.VelocityTracker;

/* JADX INFO: renamed from: A.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0063w {
    /* JADX INFO: renamed from: a */
    public static float m322a(VelocityTracker velocityTracker, int i3) {
        return velocityTracker.getAxisVelocity(i3);
    }

    /* JADX INFO: renamed from: b */
    public static float m323b(VelocityTracker velocityTracker, int i3, int i4) {
        return velocityTracker.getAxisVelocity(i3, i4);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m324c(VelocityTracker velocityTracker, int i3) {
        return velocityTracker.isAxisSupported(i3);
    }
}

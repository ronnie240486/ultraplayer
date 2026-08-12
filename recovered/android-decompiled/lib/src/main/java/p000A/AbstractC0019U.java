package p000A;

import android.view.ViewConfiguration;

/* JADX INFO: renamed from: A.U */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0019U {
    /* JADX INFO: renamed from: a */
    public static int m92a(ViewConfiguration viewConfiguration, int i3, int i4, int i5) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i3, i4, i5);
    }

    /* JADX INFO: renamed from: b */
    public static int m93b(ViewConfiguration viewConfiguration, int i3, int i4, int i5) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i3, i4, i5);
    }
}

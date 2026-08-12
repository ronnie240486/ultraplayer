package p136q;

import android.app.Notification;

/* JADX INFO: renamed from: q.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2135r {
    /* JADX INFO: renamed from: a */
    public static Notification.Action.Builder m4708a(Notification.Action.Builder builder, boolean z3) {
        return builder.setAuthenticationRequired(z3);
    }

    /* JADX INFO: renamed from: b */
    public static Notification.Builder m4709b(Notification.Builder builder, int i3) {
        return builder.setForegroundServiceBehavior(i3);
    }
}

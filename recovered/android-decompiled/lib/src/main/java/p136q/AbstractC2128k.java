package p136q;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.os.Bundle;

/* JADX INFO: renamed from: q.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2128k {
    /* JADX INFO: renamed from: a */
    public static Notification.Builder m4671a(Notification.Builder builder, Notification.Action action) {
        return builder.addAction(action);
    }

    /* JADX INFO: renamed from: b */
    public static Notification.Action.Builder m4672b(Notification.Action.Builder builder, Bundle bundle) {
        return builder.addExtras(bundle);
    }

    /* JADX INFO: renamed from: c */
    public static Notification.Action.Builder m4673c(Notification.Action.Builder builder, RemoteInput remoteInput) {
        return builder.addRemoteInput(remoteInput);
    }

    /* JADX INFO: renamed from: d */
    public static Notification.Action m4674d(Notification.Action.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: e */
    public static Notification.Action.Builder m4675e(int i3, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(i3, charSequence, pendingIntent);
    }

    /* JADX INFO: renamed from: f */
    public static String m4676f(Notification notification) {
        return notification.getGroup();
    }

    /* JADX INFO: renamed from: g */
    public static Notification.Builder m4677g(Notification.Builder builder, String str) {
        return builder.setGroup(str);
    }

    /* JADX INFO: renamed from: h */
    public static Notification.Builder m4678h(Notification.Builder builder, boolean z3) {
        return builder.setGroupSummary(z3);
    }

    /* JADX INFO: renamed from: i */
    public static Notification.Builder m4679i(Notification.Builder builder, boolean z3) {
        return builder.setLocalOnly(z3);
    }

    /* JADX INFO: renamed from: j */
    public static Notification.Builder m4680j(Notification.Builder builder, String str) {
        return builder.setSortKey(str);
    }
}

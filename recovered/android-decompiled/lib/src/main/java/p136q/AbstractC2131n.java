package p136q;

import android.app.Notification;
import android.widget.RemoteViews;

/* JADX INFO: renamed from: q.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2131n {
    /* JADX INFO: renamed from: a */
    public static Notification.Action.Builder m4690a(Notification.Action.Builder builder, boolean z3) {
        return builder.setAllowGeneratedReplies(z3);
    }

    /* JADX INFO: renamed from: b */
    public static Notification.Builder m4691b(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomBigContentView(remoteViews);
    }

    /* JADX INFO: renamed from: c */
    public static Notification.Builder m4692c(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomContentView(remoteViews);
    }

    /* JADX INFO: renamed from: d */
    public static Notification.Builder m4693d(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomHeadsUpContentView(remoteViews);
    }

    /* JADX INFO: renamed from: e */
    public static Notification.Builder m4694e(Notification.Builder builder, CharSequence[] charSequenceArr) {
        return builder.setRemoteInputHistory(charSequenceArr);
    }
}

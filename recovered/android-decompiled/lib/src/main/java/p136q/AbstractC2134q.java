package p136q;

import android.app.Notification;
import android.content.LocusId;

/* JADX INFO: renamed from: q.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2134q {
    /* JADX INFO: renamed from: a */
    public static Notification.Builder m4704a(Notification.Builder builder, boolean z3) {
        return builder.setAllowSystemGeneratedContextualActions(z3);
    }

    /* JADX INFO: renamed from: b */
    public static Notification.Builder m4705b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
        return builder.setBubbleMetadata(bubbleMetadata);
    }

    /* JADX INFO: renamed from: c */
    public static Notification.Action.Builder m4706c(Notification.Action.Builder builder, boolean z3) {
        return builder.setContextual(z3);
    }

    /* JADX INFO: renamed from: d */
    public static Notification.Builder m4707d(Notification.Builder builder, Object obj) {
        return builder.setLocusId((LocusId) obj);
    }
}

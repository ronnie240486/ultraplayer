package p136q;

import android.app.Notification;
import android.content.Context;

/* JADX INFO: renamed from: q.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2132o {
    /* JADX INFO: renamed from: a */
    public static Notification.Builder m4695a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    /* JADX INFO: renamed from: b */
    public static Notification.Builder m4696b(Notification.Builder builder, int i3) {
        return builder.setBadgeIconType(i3);
    }

    /* JADX INFO: renamed from: c */
    public static Notification.Builder m4697c(Notification.Builder builder, boolean z3) {
        return builder.setColorized(z3);
    }

    /* JADX INFO: renamed from: d */
    public static Notification.Builder m4698d(Notification.Builder builder, int i3) {
        return builder.setGroupAlertBehavior(i3);
    }

    /* JADX INFO: renamed from: e */
    public static Notification.Builder m4699e(Notification.Builder builder, CharSequence charSequence) {
        return builder.setSettingsText(charSequence);
    }

    /* JADX INFO: renamed from: f */
    public static Notification.Builder m4700f(Notification.Builder builder, String str) {
        return builder.setShortcutId(str);
    }

    /* JADX INFO: renamed from: g */
    public static Notification.Builder m4701g(Notification.Builder builder, long j3) {
        return builder.setTimeoutAfter(j3);
    }
}

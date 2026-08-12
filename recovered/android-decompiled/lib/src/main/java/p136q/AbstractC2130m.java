package p136q;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;

/* JADX INFO: renamed from: q.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2130m {
    /* JADX INFO: renamed from: a */
    public static Notification.Action.Builder m4687a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(icon, charSequence, pendingIntent);
    }

    /* JADX INFO: renamed from: b */
    public static Notification.Builder m4688b(Notification.Builder builder, Icon icon) {
        return builder.setLargeIcon(icon);
    }

    /* JADX INFO: renamed from: c */
    public static Notification.Builder m4689c(Notification.Builder builder, Object obj) {
        return builder.setSmallIcon((Icon) obj);
    }
}

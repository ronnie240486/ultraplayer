package p047Q;

import android.app.Notification;
import android.app.PendingIntent;

/* JADX INFO: renamed from: Q.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0500b {
    /* JADX INFO: renamed from: a */
    public static Notification.MediaStyle m1223a(Notification.MediaStyle mediaStyle, CharSequence charSequence, int i3, PendingIntent pendingIntent, Boolean bool) {
        if (bool.booleanValue()) {
            mediaStyle.setRemotePlaybackInfo(charSequence, i3, pendingIntent);
        }
        return mediaStyle;
    }
}

package p136q;

import android.app.Notification;
import android.media.AudioAttributes;
import android.net.Uri;

/* JADX INFO: renamed from: q.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2129l {
    /* JADX INFO: renamed from: a */
    public static Notification.Builder m4681a(Notification.Builder builder, String str) {
        return builder.addPerson(str);
    }

    /* JADX INFO: renamed from: b */
    public static Notification.Builder m4682b(Notification.Builder builder, String str) {
        return builder.setCategory(str);
    }

    /* JADX INFO: renamed from: c */
    public static Notification.Builder m4683c(Notification.Builder builder, int i3) {
        return builder.setColor(i3);
    }

    /* JADX INFO: renamed from: d */
    public static Notification.Builder m4684d(Notification.Builder builder, Notification notification) {
        return builder.setPublicVersion(notification);
    }

    /* JADX INFO: renamed from: e */
    public static Notification.Builder m4685e(Notification.Builder builder, Uri uri, Object obj) {
        return builder.setSound(uri, (AudioAttributes) obj);
    }

    /* JADX INFO: renamed from: f */
    public static Notification.Builder m4686f(Notification.Builder builder, int i3) {
        return builder.setVisibility(i3);
    }
}

package p047Q;

import android.app.Notification;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* JADX INFO: renamed from: Q.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0499a {
    /* JADX INFO: renamed from: a */
    public static Notification.MediaStyle m1218a() {
        return new Notification.MediaStyle();
    }

    /* JADX INFO: renamed from: b */
    public static Notification.MediaStyle m1219b(Notification.MediaStyle mediaStyle, int[] iArr, MediaSessionCompat$Token mediaSessionCompat$Token) {
        if (iArr != null) {
            m1222e(mediaStyle, iArr);
        }
        if (mediaSessionCompat$Token != null) {
            m1220c(mediaStyle, (MediaSession.Token) mediaSessionCompat$Token.f3654h);
        }
        return mediaStyle;
    }

    /* JADX INFO: renamed from: c */
    public static void m1220c(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
        mediaStyle.setMediaSession(token);
    }

    /* JADX INFO: renamed from: d */
    public static void m1221d(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
        builder.setStyle(mediaStyle);
    }

    /* JADX INFO: renamed from: e */
    public static void m1222e(Notification.MediaStyle mediaStyle, int... iArr) {
        mediaStyle.setShowActionsInCompactView(iArr);
    }
}

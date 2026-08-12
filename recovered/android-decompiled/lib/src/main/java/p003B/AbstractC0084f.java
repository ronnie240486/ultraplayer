package p003B;

import android.app.NotificationChannel;
import android.app.PictureInPictureParams;
import android.media.AudioFocusRequest;

/* JADX INFO: renamed from: B.f */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0084f {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ NotificationChannel m439A(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m440B() {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ NotificationChannel m444d(String str) {
        return new NotificationChannel("cast_media_notification", str, 2);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ PictureInPictureParams.Builder m445e() {
        return new PictureInPictureParams.Builder();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ AudioFocusRequest.Builder m449i(int i3) {
        return new AudioFocusRequest.Builder(i3);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ AudioFocusRequest.Builder m453m(AudioFocusRequest audioFocusRequest) {
        return new AudioFocusRequest.Builder(audioFocusRequest);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m458r() {
    }
}

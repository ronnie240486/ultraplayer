package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;

/* JADX INFO: renamed from: android.support.v4.media.session.D */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0861D {
    /* JADX INFO: renamed from: a */
    public static Bundle m2211a(PlaybackState playbackState) {
        return playbackState.getExtras();
    }

    /* JADX INFO: renamed from: b */
    public static void m2212b(PlaybackState.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }
}

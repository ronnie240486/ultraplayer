package p082b0;

import android.media.AudioProfile;
import android.media.MediaDrm;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;

/* JADX INFO: renamed from: b0.i */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1068i {
    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ AudioProfile m2879c(Object obj) {
        return (AudioProfile) obj;
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ MediaDrm.PlaybackComponent m2881e(Object obj) {
        return (MediaDrm.PlaybackComponent) obj;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ PlaybackMetrics.Builder m2882f() {
        return new PlaybackMetrics.Builder();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ PlaybackStateEvent.Builder m2883g() {
        return new PlaybackStateEvent.Builder();
    }
}

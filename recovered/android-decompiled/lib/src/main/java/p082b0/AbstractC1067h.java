package p082b0;

import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.TrackChangeEvent;

/* JADX INFO: renamed from: b0.h */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1067h {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ NetworkEvent.Builder m2852b() {
        return new NetworkEvent.Builder();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ PlaybackErrorEvent.Builder m2853c() {
        return new PlaybackErrorEvent.Builder();
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder m2859i(Object obj) {
        return (PlaybackMetrics.Builder) obj;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ TrackChangeEvent.Builder m2864n(int i3) {
        return new TrackChangeEvent.Builder(i3);
    }
}

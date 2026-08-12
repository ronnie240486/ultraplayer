package p000A;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.session.MediaSession;
import android.view.SurfaceControl;
import android.view.WindowInsets;

/* JADX INFO: renamed from: A.e0 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0034e0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint m187a() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint m188b(int i3, int i4, int i5) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i3, i4, i5);
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint m189c(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ MediaSession m190d(Context context) {
        return new MediaSession(context, "CastMediaSession", null);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ SurfaceControl.Transaction m191e() {
        return new SurfaceControl.Transaction();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ WindowInsets.Builder m192f() {
        return new WindowInsets.Builder();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ WindowInsets.Builder m193g(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m198l() {
    }
}

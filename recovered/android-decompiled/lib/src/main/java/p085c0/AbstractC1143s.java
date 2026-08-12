package p085c0;

import android.media.AudioTrack;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: renamed from: c0.s */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1143s {
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ AudioTrack.Builder m3023d() {
        return new AudioTrack.Builder();
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ ThemedSpinnerAdapter m3031l(SpinnerAdapter spinnerAdapter) {
        return (ThemedSpinnerAdapter) spinnerAdapter;
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ boolean m3040u(SpinnerAdapter spinnerAdapter) {
        return spinnerAdapter instanceof ThemedSpinnerAdapter;
    }
}

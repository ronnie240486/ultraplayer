package p003B;

import android.media.AudioDeviceInfo;
import android.media.MediaDrmResetException;
import android.media.PlaybackParams;

/* JADX INFO: renamed from: B.c */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0081c {
    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ AudioDeviceInfo m399g(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ PlaybackParams m400h() {
        return new PlaybackParams();
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ boolean m411s(Throwable th) {
        return th instanceof MediaDrmResetException;
    }
}

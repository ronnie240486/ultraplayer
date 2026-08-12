package p103h0;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.os.Bundle;
import android.support.v4.media.session.C0858A;

/* JADX INFO: renamed from: h0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1600i implements LoudnessCodecController.OnLoudnessCodecUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0858A f7248a;

    public C1600i(C0858A c0858a) {
        this.f7248a = c0858a;
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        ((C1601j) this.f7248a.f3640i).getClass();
        return bundle;
    }
}

package p085c0;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: c0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1127c extends AudioDeviceCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1129e f5229a;

    public C1127c(C1129e c1129e) {
        this.f5229a = c1129e;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C1129e c1129e = this.f5229a;
        c1129e.m3009a(C1126b.m3005b(c1129e.f5233a, c1129e.f5241i, c1129e.f5240h));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (AbstractC0632A.m1592k(audioDeviceInfoArr, this.f5229a.f5240h)) {
            this.f5229a.f5240h = null;
        }
        C1129e c1129e = this.f5229a;
        c1129e.m3009a(C1126b.m3005b(c1129e.f5233a, c1129e.f5241i, c1129e.f5240h));
    }
}

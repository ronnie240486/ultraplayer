package p077a0;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: renamed from: a0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0823e implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final Handler f3456a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0825f f3457b;

    public C0823e(C0825f c0825f, Handler handler) {
        this.f3457b = c0825f;
        this.f3456a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i3) {
        this.f3456a.post(new RunnableC0821d(this, i3));
    }
}

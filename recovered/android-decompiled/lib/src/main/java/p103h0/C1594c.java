package p103h0;

import android.os.HandlerThread;
import p101g2.InterfaceC1587h;

/* JADX INFO: renamed from: h0.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1594c implements InterfaceC1587h {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7209g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f7210h;

    public /* synthetic */ C1594c(int i3, int i4) {
        this.f7209g = i4;
        this.f7210h = i3;
    }

    @Override // p101g2.InterfaceC1587h
    public final Object get() {
        switch (this.f7209g) {
            case 0:
                return new HandlerThread(C1595d.m3925l(this.f7210h, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(C1595d.m3925l(this.f7210h, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}

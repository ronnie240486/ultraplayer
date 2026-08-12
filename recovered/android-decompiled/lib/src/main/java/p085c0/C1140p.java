package p085c0;

import android.media.AudioTrack;

/* JADX INFO: renamed from: c0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1140p {

    /* JADX INFO: renamed from: a */
    public final C1139o f5273a;

    /* JADX INFO: renamed from: b */
    public int f5274b;

    /* JADX INFO: renamed from: c */
    public long f5275c;

    /* JADX INFO: renamed from: d */
    public long f5276d;

    /* JADX INFO: renamed from: e */
    public long f5277e;

    /* JADX INFO: renamed from: f */
    public long f5278f;

    public C1140p(AudioTrack audioTrack) {
        this.f5273a = new C1139o(audioTrack);
        m3014a();
    }

    /* JADX INFO: renamed from: a */
    public final void m3014a() {
        if (this.f5273a != null) {
            m3015b(0);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3015b(int i3) {
        this.f5274b = i3;
        if (i3 == 0) {
            this.f5277e = 0L;
            this.f5278f = -1L;
            this.f5275c = System.nanoTime() / 1000;
            this.f5276d = 10000L;
            return;
        }
        if (i3 == 1) {
            this.f5276d = 10000L;
            return;
        }
        if (i3 == 2 || i3 == 3) {
            this.f5276d = 10000000L;
        } else {
            if (i3 != 4) {
                throw new IllegalStateException();
            }
            this.f5276d = 500000L;
        }
    }
}

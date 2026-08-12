package p077a0;

import android.media.AudioTrack;
import android.os.Handler;
import android.util.Pair;
import p000A.C0031d;
import p064W.RunnableC0647o;
import p082b0.C1064e;
import p085c0.C1134j;
import p085c0.C1150z;
import p114k0.C1907A;
import p114k0.C1958r;
import p114k0.C1963w;

/* JADX INFO: renamed from: a0.V */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0810V implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3391g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f3392h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f3393i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f3394j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f3395k;

    public /* synthetic */ RunnableC0810V(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f3391g = i3;
        this.f3392h = obj;
        this.f3393i = obj2;
        this.f3394j = obj3;
        this.f3395k = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3391g) {
            case 0:
                C1064e c1064e = ((C0812X) this.f3392h).f3403h.f3422h;
                Pair pair = (Pair) this.f3393i;
                c1064e.mo2035G(((Integer) pair.first).intValue(), (C1907A) pair.second, (C1958r) this.f3394j, (C1963w) this.f3395k);
                return;
            case 1:
                C1064e c1064e2 = ((C0812X) this.f3392h).f3403h.f3422h;
                Pair pair2 = (Pair) this.f3393i;
                c1064e2.mo2043s(((Integer) pair2.first).intValue(), (C1907A) pair2.second, (C1958r) this.f3394j, (C1963w) this.f3395k);
                return;
            case 2:
                C1064e c1064e3 = ((C0812X) this.f3392h).f3403h.f3422h;
                Pair pair3 = (Pair) this.f3393i;
                c1064e3.mo2041n(((Integer) pair3.first).intValue(), (C1907A) pair3.second, (C1958r) this.f3394j, (C1963w) this.f3395k);
                return;
            default:
                AudioTrack audioTrack = (AudioTrack) this.f3392h;
                C0031d c0031d = (C0031d) this.f3393i;
                Handler handler = (Handler) this.f3394j;
                C1134j c1134j = (C1134j) this.f3395k;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (c0031d != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new RunnableC0647o(c0031d, 5, c1134j));
                    }
                    synchronized (C1150z.f5339j0) {
                        try {
                            int i3 = C1150z.f5341l0 - 1;
                            C1150z.f5341l0 = i3;
                            if (i3 == 0) {
                                C1150z.f5340k0.shutdown();
                                C1150z.f5340k0 = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return;
                } catch (Throwable th2) {
                    if (c0031d != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new RunnableC0647o(c0031d, 5, c1134j));
                    }
                    synchronized (C1150z.f5339j0) {
                        try {
                            int i4 = C1150z.f5341l0 - 1;
                            C1150z.f5341l0 = i4;
                            if (i4 == 0) {
                                C1150z.f5340k0.shutdown();
                                C1150z.f5340k0 = null;
                            }
                            throw th2;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
        }
    }
}

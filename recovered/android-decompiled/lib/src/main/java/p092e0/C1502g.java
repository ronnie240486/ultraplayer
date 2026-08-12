package p092e0;

import android.os.SystemClock;
import java.util.List;
import p117l0.InterfaceC1974c;
import p125n0.AbstractC2026c;

/* JADX INFO: renamed from: e0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1502g extends AbstractC2026c {

    /* JADX INFO: renamed from: g */
    public int f6665g;

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: c */
    public final void mo3746c(long j3, long j4, long j5, List list, InterfaceC1974c[] interfaceC1974cArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (mo4427f(this.f6665g, jElapsedRealtime)) {
            for (int i3 = this.f8814b - 1; i3 >= 0; i3--) {
                if (!mo4427f(i3, jElapsedRealtime)) {
                    this.f6665g = i3;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: g */
    public final int mo3747g() {
        return 0;
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: h */
    public final int mo3748h() {
        return this.f6665g;
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: n */
    public final Object mo3749n() {
        return null;
    }
}

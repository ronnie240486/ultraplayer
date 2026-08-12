package p085c0;

import p045P0.AbstractC0462h;
import p055T.C0583o;

/* JADX INFO: renamed from: c0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1138n extends Exception {

    /* JADX INFO: renamed from: g */
    public final int f5263g;

    /* JADX INFO: renamed from: h */
    public final boolean f5264h;

    /* JADX INFO: renamed from: i */
    public final C0583o f5265i;

    public C1138n(int i3, C0583o c0583o, boolean z3) {
        super(AbstractC0462h.m1165e(i3, "AudioTrack write failed: "));
        this.f5264h = z3;
        this.f5263g = i3;
        this.f5265i = c0583o;
    }
}

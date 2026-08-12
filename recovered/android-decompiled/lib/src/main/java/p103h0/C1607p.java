package p103h0;

import p055T.C0583o;

/* JADX INFO: renamed from: h0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1607p extends Exception {

    /* JADX INFO: renamed from: g */
    public final String f7261g;

    /* JADX INFO: renamed from: h */
    public final boolean f7262h;

    /* JADX INFO: renamed from: i */
    public final C1606o f7263i;

    /* JADX INFO: renamed from: j */
    public final String f7264j;

    public C1607p(C0583o c0583o, C1613v c1613v, boolean z3, int i3) {
        this("Decoder init failed: [" + i3 + "], " + c0583o, c1613v, c0583o.f2154n, z3, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i3 < 0 ? "neg_" : "") + Math.abs(i3));
    }

    public C1607p(String str, Throwable th, String str2, boolean z3, C1606o c1606o, String str3) {
        super(str, th);
        this.f7261g = str2;
        this.f7262h = z3;
        this.f7263i = c1606o;
        this.f7264j = str3;
    }
}

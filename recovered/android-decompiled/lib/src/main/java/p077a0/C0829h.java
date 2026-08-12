package p077a0;

import java.util.Locale;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: a0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0829h {

    /* JADX INFO: renamed from: a */
    public int f3504a;

    /* JADX INFO: renamed from: b */
    public int f3505b;

    /* JADX INFO: renamed from: c */
    public int f3506c;

    /* JADX INFO: renamed from: d */
    public int f3507d;

    /* JADX INFO: renamed from: e */
    public int f3508e;

    /* JADX INFO: renamed from: f */
    public int f3509f;

    /* JADX INFO: renamed from: g */
    public int f3510g;

    /* JADX INFO: renamed from: h */
    public int f3511h;

    /* JADX INFO: renamed from: i */
    public int f3512i;

    /* JADX INFO: renamed from: j */
    public int f3513j;

    /* JADX INFO: renamed from: k */
    public long f3514k;

    /* JADX INFO: renamed from: l */
    public int f3515l;

    public final String toString() {
        int i3 = this.f3504a;
        int i4 = this.f3505b;
        int i5 = this.f3506c;
        int i6 = this.f3507d;
        int i7 = this.f3508e;
        int i8 = this.f3509f;
        int i9 = this.f3510g;
        int i10 = this.f3511h;
        int i11 = this.f3512i;
        int i12 = this.f3513j;
        long j3 = this.f3514k;
        int i13 = this.f3515l;
        int i14 = AbstractC0632A.f2454a;
        Locale locale = Locale.US;
        return "DecoderCounters {\n decoderInits=" + i3 + ",\n decoderReleases=" + i4 + "\n queuedInputBuffers=" + i5 + "\n skippedInputBuffers=" + i6 + "\n renderedOutputBuffers=" + i7 + "\n skippedOutputBuffers=" + i8 + "\n droppedBuffers=" + i9 + "\n droppedInputBuffers=" + i10 + "\n maxConsecutiveDroppedBuffers=" + i11 + "\n droppedToKeyframeEvents=" + i12 + "\n totalVideoFrameProcessingOffsetUs=" + j3 + "\n videoFrameProcessingOffsetCount=" + i13 + "\n}";
    }
}

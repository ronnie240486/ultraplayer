package p103h0;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import p073Z.C0767b;
import p089d1.C1447t;
import p137q0.C2143d;

/* JADX INFO: renamed from: h0.l */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1603l {
    /* JADX INFO: renamed from: a */
    void mo3367a();

    /* JADX INFO: renamed from: b */
    void mo3368b(int i3, C0767b c0767b, long j3, int i4);

    /* JADX INFO: renamed from: c */
    void mo3369c(Bundle bundle);

    /* JADX INFO: renamed from: d */
    void mo3370d(int i3, int i4, long j3, int i5);

    /* JADX INFO: renamed from: e */
    int mo3371e(MediaCodec.BufferInfo bufferInfo);

    /* JADX INFO: renamed from: f */
    void mo3372f();

    void flush();

    /* JADX INFO: renamed from: g */
    ByteBuffer mo3373g(int i3);

    /* JADX INFO: renamed from: h */
    void mo3374h(Surface surface);

    /* JADX INFO: renamed from: j */
    void mo3376j(int i3);

    /* JADX INFO: renamed from: k */
    ByteBuffer mo3377k(int i3);

    /* JADX INFO: renamed from: m */
    void mo3379m(int i3, long j3);

    /* JADX INFO: renamed from: n */
    int mo3380n();

    /* JADX INFO: renamed from: o */
    void mo3381o(int i3);

    /* JADX INFO: renamed from: p */
    void mo3382p(C2143d c2143d, Handler handler);

    /* JADX INFO: renamed from: q */
    boolean mo3383q(C1447t c1447t);

    /* JADX INFO: renamed from: s */
    MediaFormat mo3385s();
}

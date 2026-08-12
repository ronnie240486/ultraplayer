package p103h0;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.support.v4.media.session.C0858A;
import android.view.Surface;
import androidx.activity.RunnableC0892b;
import java.nio.ByteBuffer;
import java.util.HashSet;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p073Z.C0767b;
import p089d1.C1447t;
import p104h1.C1656m;
import p137q0.C2143d;

/* JADX INFO: renamed from: h0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1595d implements InterfaceC1603l {

    /* JADX INFO: renamed from: g */
    public final MediaCodec f7211g;

    /* JADX INFO: renamed from: h */
    public final C1598g f7212h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC1604m f7213i;

    /* JADX INFO: renamed from: j */
    public final C0858A f7214j;

    /* JADX INFO: renamed from: k */
    public boolean f7215k;

    /* JADX INFO: renamed from: l */
    public int f7216l = 0;

    public C1595d(MediaCodec mediaCodec, HandlerThread handlerThread, InterfaceC1604m interfaceC1604m, C0858A c0858a) {
        this.f7211g = mediaCodec;
        this.f7212h = new C1598g(handlerThread);
        this.f7213i = interfaceC1604m;
        this.f7214j = c0858a;
    }

    /* JADX INFO: renamed from: i */
    public static void m3924i(C1595d c1595d, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i3) {
        C0858A c0858a;
        LoudnessCodecController loudnessCodecController;
        C1598g c1598g = c1595d.f7212h;
        AbstractC0646n.m1630h(c1598g.f7232c == null);
        HandlerThread handlerThread = c1598g.f7231b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = c1595d.f7211g;
        mediaCodec.setCallback(c1598g, handler);
        c1598g.f7232c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i3);
        Trace.endSection();
        c1595d.f7213i.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (AbstractC0632A.f2454a >= 35 && (c0858a = c1595d.f7214j) != null && ((loudnessCodecController = (LoudnessCodecController) c0858a.f3641j) == null || loudnessCodecController.addMediaCodec(mediaCodec))) {
            AbstractC0646n.m1630h(((HashSet) c0858a.f3639h).add(mediaCodec));
        }
        c1595d.f7216l = 1;
    }

    /* JADX INFO: renamed from: l */
    public static String m3925l(int i3, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i3 == 1) {
            sb.append("Audio");
        } else if (i3 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i3);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: a */
    public final void mo3367a() {
        C0858A c0858a;
        C0858A c0858a2;
        try {
            if (this.f7216l == 1) {
                this.f7213i.shutdown();
                C1598g c1598g = this.f7212h;
                synchronized (c1598g.f7230a) {
                    c1598g.f7242m = true;
                    c1598g.f7231b.quit();
                    c1598g.m3932a();
                }
            }
            this.f7216l = 2;
            if (this.f7215k) {
                return;
            }
            try {
                int i3 = AbstractC0632A.f2454a;
                if (i3 >= 30 && i3 < 33) {
                    this.f7211g.stop();
                }
            } finally {
                if (AbstractC0632A.f2454a >= 35 && (c0858a2 = this.f7214j) != null) {
                    c0858a2.m2171T(this.f7211g);
                }
                this.f7211g.release();
                this.f7215k = true;
            }
        } catch (Throwable th) {
            if (!this.f7215k) {
                try {
                    int i4 = AbstractC0632A.f2454a;
                    if (i4 >= 30 && i4 < 33) {
                        this.f7211g.stop();
                    }
                } finally {
                    if (AbstractC0632A.f2454a >= 35 && (c0858a = this.f7214j) != null) {
                        c0858a.m2171T(this.f7211g);
                    }
                    this.f7211g.release();
                    this.f7215k = true;
                }
            }
            throw th;
        }
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: b */
    public final void mo3368b(int i3, C0767b c0767b, long j3, int i4) {
        this.f7213i.mo3929b(i3, c0767b, j3, i4);
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: c */
    public final void mo3369c(Bundle bundle) {
        this.f7213i.mo3930c(bundle);
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: d */
    public final void mo3370d(int i3, int i4, long j3, int i5) {
        this.f7213i.mo3931d(i3, i4, j3, i5);
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: e */
    public final int mo3371e(MediaCodec.BufferInfo bufferInfo) {
        this.f7213i.mo3928a();
        C1598g c1598g = this.f7212h;
        synchronized (c1598g.f7230a) {
            try {
                IllegalStateException illegalStateException = c1598g.f7243n;
                if (illegalStateException != null) {
                    c1598g.f7243n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = c1598g.f7239j;
                if (codecException != null) {
                    c1598g.f7239j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = c1598g.f7240k;
                if (cryptoException != null) {
                    c1598g.f7240k = null;
                    throw cryptoException;
                }
                if (c1598g.f7241l > 0 || c1598g.f7242m) {
                    return -1;
                }
                C1656m c1656m = c1598g.f7234e;
                int i3 = c1656m.f7541b;
                int i4 = c1656m.f7542c;
                if (i3 == i4) {
                    return -1;
                }
                if (i3 == i4) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i5 = ((int[]) c1656m.f7540a)[i3];
                c1656m.f7541b = (i3 + 1) & c1656m.f7543d;
                if (i5 >= 0) {
                    AbstractC0646n.m1631i(c1598g.f7237h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) c1598g.f7235f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i5 == -2) {
                    c1598g.f7237h = (MediaFormat) c1598g.f7236g.remove();
                }
                return i5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: f */
    public final void mo3372f() {
        this.f7211g.detachOutputSurface();
    }

    @Override // p103h0.InterfaceC1603l
    public final void flush() {
        this.f7213i.flush();
        this.f7211g.flush();
        C1598g c1598g = this.f7212h;
        synchronized (c1598g.f7230a) {
            c1598g.f7241l++;
            Handler handler = c1598g.f7232c;
            int i3 = AbstractC0632A.f2454a;
            handler.post(new RunnableC0892b(17, c1598g));
        }
        this.f7211g.start();
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: g */
    public final ByteBuffer mo3373g(int i3) {
        return this.f7211g.getInputBuffer(i3);
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: h */
    public final void mo3374h(Surface surface) {
        this.f7211g.setOutputSurface(surface);
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: j */
    public final void mo3376j(int i3) {
        this.f7211g.releaseOutputBuffer(i3, false);
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: k */
    public final ByteBuffer mo3377k(int i3) {
        return this.f7211g.getOutputBuffer(i3);
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: m */
    public final void mo3379m(int i3, long j3) {
        this.f7211g.releaseOutputBuffer(i3, j3);
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: n */
    public final int mo3380n() {
        this.f7213i.mo3928a();
        C1598g c1598g = this.f7212h;
        synchronized (c1598g.f7230a) {
            try {
                IllegalStateException illegalStateException = c1598g.f7243n;
                if (illegalStateException != null) {
                    c1598g.f7243n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = c1598g.f7239j;
                if (codecException != null) {
                    c1598g.f7239j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = c1598g.f7240k;
                if (cryptoException != null) {
                    c1598g.f7240k = null;
                    throw cryptoException;
                }
                int i3 = -1;
                if (c1598g.f7241l > 0 || c1598g.f7242m) {
                    return -1;
                }
                C1656m c1656m = c1598g.f7233d;
                int i4 = c1656m.f7541b;
                int i5 = c1656m.f7542c;
                if (!(i4 == i5)) {
                    if (i4 == i5) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i3 = ((int[]) c1656m.f7540a)[i4];
                    c1656m.f7541b = (i4 + 1) & c1656m.f7543d;
                }
                return i3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: o */
    public final void mo3381o(int i3) {
        this.f7211g.setVideoScalingMode(i3);
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: p */
    public final void mo3382p(C2143d c2143d, Handler handler) {
        this.f7211g.setOnFrameRenderedListener(new C1593b(this, c2143d, 0), handler);
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: q */
    public final boolean mo3383q(C1447t c1447t) {
        C1598g c1598g = this.f7212h;
        synchronized (c1598g.f7230a) {
            c1598g.f7244o = c1447t;
        }
        return true;
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: s */
    public final MediaFormat mo3385s() {
        MediaFormat mediaFormat;
        C1598g c1598g = this.f7212h;
        synchronized (c1598g.f7230a) {
            try {
                mediaFormat = c1598g.f7237h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }
}

package p103h0;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import p077a0.C0793D;
import p089d1.C1447t;
import p104h1.C1656m;

/* JADX INFO: renamed from: h0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1598g extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b */
    public final HandlerThread f7231b;

    /* JADX INFO: renamed from: c */
    public Handler f7232c;

    /* JADX INFO: renamed from: h */
    public MediaFormat f7237h;

    /* JADX INFO: renamed from: i */
    public MediaFormat f7238i;

    /* JADX INFO: renamed from: j */
    public MediaCodec.CodecException f7239j;

    /* JADX INFO: renamed from: k */
    public MediaCodec.CryptoException f7240k;

    /* JADX INFO: renamed from: l */
    public long f7241l;

    /* JADX INFO: renamed from: m */
    public boolean f7242m;

    /* JADX INFO: renamed from: n */
    public IllegalStateException f7243n;

    /* JADX INFO: renamed from: o */
    public C1447t f7244o;

    /* JADX INFO: renamed from: a */
    public final Object f7230a = new Object();

    /* JADX INFO: renamed from: d */
    public final C1656m f7233d = new C1656m();

    /* JADX INFO: renamed from: e */
    public final C1656m f7234e = new C1656m();

    /* JADX INFO: renamed from: f */
    public final ArrayDeque f7235f = new ArrayDeque();

    /* JADX INFO: renamed from: g */
    public final ArrayDeque f7236g = new ArrayDeque();

    public C1598g(HandlerThread handlerThread) {
        this.f7231b = handlerThread;
    }

    /* JADX INFO: renamed from: a */
    public final void m3932a() {
        ArrayDeque arrayDeque = this.f7236g;
        if (!arrayDeque.isEmpty()) {
            this.f7238i = (MediaFormat) arrayDeque.getLast();
        }
        C1656m c1656m = this.f7233d;
        c1656m.f7542c = c1656m.f7541b;
        C1656m c1656m2 = this.f7234e;
        c1656m2.f7542c = c1656m2.f7541b;
        this.f7235f.clear();
        arrayDeque.clear();
    }

    /* JADX INFO: renamed from: b */
    public final void m3933b(IllegalStateException illegalStateException) {
        synchronized (this.f7230a) {
            this.f7243n = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f7230a) {
            this.f7240k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f7230a) {
            this.f7239j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i3) {
        C0793D c0793d;
        synchronized (this.f7230a) {
            this.f7233d.m4083a(i3);
            C1447t c1447t = this.f7244o;
            if (c1447t != null && (c0793d = ((AbstractC1609r) c1447t.f6406h).f7289L) != null) {
                c0793d.m1932a();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i3, MediaCodec.BufferInfo bufferInfo) {
        C0793D c0793d;
        synchronized (this.f7230a) {
            try {
                MediaFormat mediaFormat = this.f7238i;
                if (mediaFormat != null) {
                    this.f7234e.m4083a(-2);
                    this.f7236g.add(mediaFormat);
                    this.f7238i = null;
                }
                this.f7234e.m4083a(i3);
                this.f7235f.add(bufferInfo);
                C1447t c1447t = this.f7244o;
                if (c1447t != null && (c0793d = ((AbstractC1609r) c1447t.f6406h).f7289L) != null) {
                    c0793d.m1932a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f7230a) {
            this.f7234e.m4083a(-2);
            this.f7236g.add(mediaFormat);
            this.f7238i = null;
        }
    }
}

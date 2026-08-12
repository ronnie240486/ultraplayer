package p103h0;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import android.support.v4.media.session.HandlerC0881q;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p003B.AbstractC0080b;
import p064W.AbstractC0632A;
import p064W.C0635c;
import p073Z.C0767b;

/* JADX INFO: renamed from: h0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1597f implements InterfaceC1604m {

    /* JADX INFO: renamed from: g */
    public static final ArrayDeque f7222g = new ArrayDeque();

    /* JADX INFO: renamed from: h */
    public static final Object f7223h = new Object();

    /* JADX INFO: renamed from: a */
    public final MediaCodec f7224a;

    /* JADX INFO: renamed from: b */
    public final HandlerThread f7225b;

    /* JADX INFO: renamed from: c */
    public HandlerC0881q f7226c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference f7227d;

    /* JADX INFO: renamed from: e */
    public final C0635c f7228e;

    /* JADX INFO: renamed from: f */
    public boolean f7229f;

    public C1597f(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C0635c c0635c = new C0635c();
        this.f7224a = mediaCodec;
        this.f7225b = handlerThread;
        this.f7228e = c0635c;
        this.f7227d = new AtomicReference();
    }

    /* JADX INFO: renamed from: e */
    public static C1596e m3926e() {
        ArrayDeque arrayDeque = f7222g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new C1596e();
                }
                return (C1596e) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m3927f(C1596e c1596e) {
        ArrayDeque arrayDeque = f7222g;
        synchronized (arrayDeque) {
            arrayDeque.add(c1596e);
        }
    }

    @Override // p103h0.InterfaceC1604m
    /* JADX INFO: renamed from: a */
    public final void mo3928a() {
        RuntimeException runtimeException = (RuntimeException) this.f7227d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // p103h0.InterfaceC1604m
    /* JADX INFO: renamed from: b */
    public final void mo3929b(int i3, C0767b c0767b, long j3, int i4) {
        mo3928a();
        C1596e c1596eM3926e = m3926e();
        c1596eM3926e.f7217a = i3;
        c1596eM3926e.f7218b = 0;
        c1596eM3926e.f7220d = j3;
        c1596eM3926e.f7221e = i4;
        int i5 = c0767b.f3137f;
        MediaCodec.CryptoInfo cryptoInfo = c1596eM3926e.f7219c;
        cryptoInfo.numSubSamples = i5;
        int[] iArr = c0767b.f3135d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = c0767b.f3136e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = c0767b.f3133b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = c0767b.f3132a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = c0767b.f3134c;
        if (AbstractC0632A.f2454a >= 24) {
            AbstractC0080b.m378p();
            cryptoInfo.setPattern(AbstractC0080b.m367e(c0767b.f3138g, c0767b.f3139h));
        }
        this.f7226c.obtainMessage(2, c1596eM3926e).sendToTarget();
    }

    @Override // p103h0.InterfaceC1604m
    /* JADX INFO: renamed from: c */
    public final void mo3930c(Bundle bundle) {
        mo3928a();
        HandlerC0881q handlerC0881q = this.f7226c;
        int i3 = AbstractC0632A.f2454a;
        handlerC0881q.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // p103h0.InterfaceC1604m
    /* JADX INFO: renamed from: d */
    public final void mo3931d(int i3, int i4, long j3, int i5) {
        mo3928a();
        C1596e c1596eM3926e = m3926e();
        c1596eM3926e.f7217a = i3;
        c1596eM3926e.f7218b = i4;
        c1596eM3926e.f7220d = j3;
        c1596eM3926e.f7221e = i5;
        HandlerC0881q handlerC0881q = this.f7226c;
        int i6 = AbstractC0632A.f2454a;
        handlerC0881q.obtainMessage(1, c1596eM3926e).sendToTarget();
    }

    @Override // p103h0.InterfaceC1604m
    public final void flush() {
        if (this.f7229f) {
            try {
                HandlerC0881q handlerC0881q = this.f7226c;
                handlerC0881q.getClass();
                handlerC0881q.removeCallbacksAndMessages(null);
                C0635c c0635c = this.f7228e;
                synchronized (c0635c) {
                    c0635c.f2475a = false;
                }
                HandlerC0881q handlerC0881q2 = this.f7226c;
                handlerC0881q2.getClass();
                handlerC0881q2.obtainMessage(3).sendToTarget();
                c0635c.m1611a();
            } catch (InterruptedException e3) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e3);
            }
        }
    }

    @Override // p103h0.InterfaceC1604m
    public final void shutdown() {
        if (this.f7229f) {
            flush();
            this.f7225b.quit();
        }
        this.f7229f = false;
    }

    @Override // p103h0.InterfaceC1604m
    public final void start() {
        if (this.f7229f) {
            return;
        }
        HandlerThread handlerThread = this.f7225b;
        handlerThread.start();
        this.f7226c = new HandlerC0881q(this, handlerThread.getLooper(), 8);
        this.f7229f = true;
    }
}

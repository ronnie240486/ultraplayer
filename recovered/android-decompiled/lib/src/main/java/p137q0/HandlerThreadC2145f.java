package p137q0;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Locale;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0639g;
import p064W.RunnableC0638f;

/* JADX INFO: renamed from: q0.f */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerThreadC2145f extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: g */
    public RunnableC0638f f9258g;

    /* JADX INFO: renamed from: h */
    public Handler f9259h;

    /* JADX INFO: renamed from: i */
    public Error f9260i;

    /* JADX INFO: renamed from: j */
    public RuntimeException f9261j;

    /* JADX INFO: renamed from: k */
    public C2146g f9262k;

    /* JADX INFO: renamed from: a */
    public final void m4728a(int i3) throws C0639g {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        this.f9258g.getClass();
        RunnableC0638f runnableC0638f = this.f9258g;
        runnableC0638f.getClass();
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        AbstractC0646n.m1627e("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
        int[] iArr = new int[2];
        AbstractC0646n.m1627e("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1));
        runnableC0638f.f2483i = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, RunnableC0638f.f2480m, 0, eGLConfigArr, 0, 1, iArr2, 0);
        boolean z3 = zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
        int i4 = AbstractC0632A.f2454a;
        AbstractC0646n.m1627e(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z3);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(runnableC0638f.f2483i, eGLConfig, EGL14.EGL_NO_CONTEXT, i3 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        AbstractC0646n.m1627e("eglCreateContext failed", eGLContextEglCreateContext != null);
        runnableC0638f.f2484j = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = runnableC0638f.f2483i;
        if (i3 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i3 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            AbstractC0646n.m1627e("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
        }
        AbstractC0646n.m1627e("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
        runnableC0638f.f2485k = eGLSurfaceEglCreatePbufferSurface;
        int[] iArr3 = runnableC0638f.f2482h;
        GLES20.glGenTextures(1, iArr3, 0);
        AbstractC0646n.m1626d();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        runnableC0638f.f2486l = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(runnableC0638f);
        SurfaceTexture surfaceTexture2 = this.f9258g.f2486l;
        surfaceTexture2.getClass();
        this.f9262k = new C2146g(this, surfaceTexture2, i3 != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final void m4729b() {
        this.f9258g.getClass();
        RunnableC0638f runnableC0638f = this.f9258g;
        runnableC0638f.f2481g.removeCallbacks(runnableC0638f);
        try {
            SurfaceTexture surfaceTexture = runnableC0638f.f2486l;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, runnableC0638f.f2482h, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = runnableC0638f.f2483i;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = runnableC0638f.f2483i;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = runnableC0638f.f2485k;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(runnableC0638f.f2483i, runnableC0638f.f2485k);
            }
            EGLContext eGLContext = runnableC0638f.f2484j;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(runnableC0638f.f2483i, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = runnableC0638f.f2483i;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(runnableC0638f.f2483i);
            }
            runnableC0638f.f2483i = null;
            runnableC0638f.f2484j = null;
            runnableC0638f.f2485k = null;
            runnableC0638f.f2486l = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i3 = message.what;
        try {
            if (i3 == 1) {
                try {
                    m4728a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (C0639g e3) {
                    AbstractC0646n.m1636n("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.f9261j = new IllegalStateException(e3);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e4) {
                    AbstractC0646n.m1636n("PlaceholderSurface", "Failed to initialize placeholder surface", e4);
                    this.f9260i = e4;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e5) {
                    AbstractC0646n.m1636n("PlaceholderSurface", "Failed to initialize placeholder surface", e5);
                    this.f9261j = e5;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i3 == 2) {
                try {
                    m4729b();
                    quit();
                    return true;
                } catch (Throwable th) {
                    try {
                        AbstractC0646n.m1636n("PlaceholderSurface", "Failed to release placeholder surface", th);
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}

package p064W;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* JADX INFO: renamed from: W.f */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0638f implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: m */
    public static final int[] f2480m = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: g */
    public final Handler f2481g;

    /* JADX INFO: renamed from: h */
    public final int[] f2482h = new int[1];

    /* JADX INFO: renamed from: i */
    public EGLDisplay f2483i;

    /* JADX INFO: renamed from: j */
    public EGLContext f2484j;

    /* JADX INFO: renamed from: k */
    public EGLSurface f2485k;

    /* JADX INFO: renamed from: l */
    public SurfaceTexture f2486l;

    public RunnableC0638f(Handler handler) {
        this.f2481g = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f2481g.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f2486l;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}

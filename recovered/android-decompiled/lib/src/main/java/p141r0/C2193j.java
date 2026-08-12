package p141r0;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p064W.RunnableC0647o;

/* JADX INFO: renamed from: r0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2193j implements GLSurfaceView.Renderer, InterfaceC2186c {

    /* JADX INFO: renamed from: g */
    public final C2192i f9449g;

    /* JADX INFO: renamed from: j */
    public final float[] f9452j;

    /* JADX INFO: renamed from: k */
    public final float[] f9453k;

    /* JADX INFO: renamed from: l */
    public final float[] f9454l;

    /* JADX INFO: renamed from: m */
    public float f9455m;

    /* JADX INFO: renamed from: n */
    public float f9456n;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C2194k f9459q;

    /* JADX INFO: renamed from: h */
    public final float[] f9450h = new float[16];

    /* JADX INFO: renamed from: i */
    public final float[] f9451i = new float[16];

    /* JADX INFO: renamed from: o */
    public final float[] f9457o = new float[16];

    /* JADX INFO: renamed from: p */
    public final float[] f9458p = new float[16];

    public C2193j(C2194k c2194k, C2192i c2192i) {
        this.f9459q = c2194k;
        float[] fArr = new float[16];
        this.f9452j = fArr;
        float[] fArr2 = new float[16];
        this.f9453k = fArr2;
        float[] fArr3 = new float[16];
        this.f9454l = fArr3;
        this.f9449g = c2192i;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.f9456n = 3.1415927f;
    }

    @Override // p141r0.InterfaceC2186c
    /* JADX INFO: renamed from: a */
    public final synchronized void mo4771a(float[] fArr, float f) {
        float[] fArr2 = this.f9452j;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f3 = -f;
        this.f9456n = f3;
        Matrix.setRotateM(this.f9453k, 0, -this.f9455m, (float) Math.cos(f3), (float) Math.sin(this.f9456n), 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            Matrix.multiplyMM(this.f9458p, 0, this.f9452j, 0, this.f9454l, 0);
            Matrix.multiplyMM(this.f9457o, 0, this.f9453k, 0, this.f9458p, 0);
        }
        Matrix.multiplyMM(this.f9451i, 0, this.f9450h, 0, this.f9457o, 0);
        this.f9449g.m4774c(this.f9451i);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i3, int i4) {
        GLES20.glViewport(0, 0, i3, i4);
        float f = i3 / i4;
        Matrix.perspectiveM(this.f9450h, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        C2194k c2194k = this.f9459q;
        c2194k.f9464k.post(new RunnableC0647o(c2194k, 16, this.f9449g.m4775e()));
    }
}

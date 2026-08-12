package p137q0;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: q0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2146g extends Surface {

    /* JADX INFO: renamed from: j */
    public static int f9263j;

    /* JADX INFO: renamed from: k */
    public static boolean f9264k;

    /* JADX INFO: renamed from: g */
    public final boolean f9265g;

    /* JADX INFO: renamed from: h */
    public final HandlerThreadC2145f f9266h;

    /* JADX INFO: renamed from: i */
    public boolean f9267i;

    public C2146g(HandlerThreadC2145f handlerThreadC2145f, SurfaceTexture surfaceTexture, boolean z3) {
        super(surfaceTexture);
        this.f9266h = handlerThreadC2145f;
        this.f9265g = z3;
    }

    /* JADX INFO: renamed from: d */
    public static synchronized boolean m4730d(Context context) {
        String strEglQueryString;
        int i3;
        try {
            if (!f9264k) {
                int i4 = AbstractC0632A.f2454a;
                if (i4 >= 24 && ((i4 >= 26 || !("samsung".equals(AbstractC0632A.f2456c) || "XT1650".equals(AbstractC0632A.f2457d))) && ((i4 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
                    String strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    i3 = strEglQueryString2 != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
                } else {
                    i3 = 0;
                }
                f9263j = i3;
                f9264k = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f9263j != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f9266h) {
            try {
                if (!this.f9267i) {
                    HandlerThreadC2145f handlerThreadC2145f = this.f9266h;
                    handlerThreadC2145f.f9259h.getClass();
                    handlerThreadC2145f.f9259h.sendEmptyMessage(2);
                    this.f9267i = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

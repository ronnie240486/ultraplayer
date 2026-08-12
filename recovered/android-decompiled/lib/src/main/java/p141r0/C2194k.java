package p141r0;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import androidx.activity.RunnableC0892b;
import java.util.concurrent.CopyOnWriteArrayList;
import p137q0.InterfaceC2154o;

/* JADX INFO: renamed from: r0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2194k extends GLSurfaceView {

    /* JADX INFO: renamed from: g */
    public final CopyOnWriteArrayList f9460g;

    /* JADX INFO: renamed from: h */
    public final SensorManager f9461h;

    /* JADX INFO: renamed from: i */
    public final Sensor f9462i;

    /* JADX INFO: renamed from: j */
    public final C2187d f9463j;

    /* JADX INFO: renamed from: k */
    public final Handler f9464k;

    /* JADX INFO: renamed from: l */
    public final C2192i f9465l;

    /* JADX INFO: renamed from: m */
    public SurfaceTexture f9466m;

    /* JADX INFO: renamed from: n */
    public Surface f9467n;

    /* JADX INFO: renamed from: o */
    public boolean f9468o;

    /* JADX INFO: renamed from: p */
    public boolean f9469p;

    /* JADX INFO: renamed from: q */
    public boolean f9470q;

    public C2194k(Context context) {
        super(context, null);
        this.f9460g = new CopyOnWriteArrayList();
        this.f9464k = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f9461h = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f9462i = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        C2192i c2192i = new C2192i();
        this.f9465l = c2192i;
        C2193j c2193j = new C2193j(this, c2192i);
        View.OnTouchListener viewOnTouchListenerC2195l = new ViewOnTouchListenerC2195l(context, c2193j);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f9463j = new C2187d(windowManager.getDefaultDisplay(), viewOnTouchListenerC2195l, c2193j);
        this.f9468o = true;
        setEGLContextClientVersion(2);
        setRenderer(c2193j);
        setOnTouchListener(viewOnTouchListenerC2195l);
    }

    /* JADX INFO: renamed from: a */
    public final void m4776a() {
        boolean z3 = this.f9468o && this.f9469p;
        Sensor sensor = this.f9462i;
        if (sensor == null || z3 == this.f9470q) {
            return;
        }
        C2187d c2187d = this.f9463j;
        SensorManager sensorManager = this.f9461h;
        if (z3) {
            sensorManager.registerListener(c2187d, sensor, 0);
        } else {
            sensorManager.unregisterListener(c2187d);
        }
        this.f9470q = z3;
    }

    public InterfaceC2184a getCameraMotionListener() {
        return this.f9465l;
    }

    public InterfaceC2154o getVideoFrameMetadataListener() {
        return this.f9465l;
    }

    public Surface getVideoSurface() {
        return this.f9467n;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9464k.post(new RunnableC0892b(20, this));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f9469p = false;
        m4776a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f9469p = true;
        m4776a();
    }

    public void setDefaultStereoMode(int i3) {
        this.f9465l.f9446q = i3;
    }

    public void setUseSensorRotation(boolean z3) {
        this.f9468o = z3;
        m4776a();
    }
}

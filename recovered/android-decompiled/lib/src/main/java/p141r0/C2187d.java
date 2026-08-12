package p141r0;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import p125n0.C2035l;

/* JADX INFO: renamed from: r0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2187d implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public final float[] f9412a = new float[16];

    /* JADX INFO: renamed from: b */
    public final float[] f9413b = new float[16];

    /* JADX INFO: renamed from: c */
    public final float[] f9414c = new float[16];

    /* JADX INFO: renamed from: d */
    public final float[] f9415d = new float[3];

    /* JADX INFO: renamed from: e */
    public final Display f9416e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2186c[] f9417f;

    /* JADX INFO: renamed from: g */
    public boolean f9418g;

    public C2187d(Display display, InterfaceC2186c... interfaceC2186cArr) {
        this.f9416e = display;
        this.f9417f = interfaceC2186cArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i3;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f9412a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f9416e.getRotation();
        float[] fArr3 = this.f9413b;
        if (rotation != 0) {
            int i4 = 129;
            if (rotation != 1) {
                i3 = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i4 = 130;
                    i3 = 1;
                }
            } else {
                i4 = 2;
                i3 = 129;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i4, i3, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.f9415d;
        SensorManager.getOrientation(fArr3, fArr4);
        float f = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        boolean z3 = this.f9418g;
        float[] fArr5 = this.f9414c;
        if (!z3) {
            C2035l.m4604b(fArr5, fArr2);
            this.f9418g = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        InterfaceC2186c[] interfaceC2186cArr = this.f9417f;
        for (int i5 = 0; i5 < 2; i5++) {
            interfaceC2186cArr[i5].mo4771a(fArr2, f);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i3) {
    }
}

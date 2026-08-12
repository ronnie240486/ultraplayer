package p141r0;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import p036M0.C0368e;
import p055T.C0583o;
import p064W.AbstractC0646n;
import p064W.C0639g;
import p064W.C0651s;
import p066W1.AbstractC0664e;
import p125n0.C2035l;
import p137q0.InterfaceC2154o;

/* JADX INFO: renamed from: r0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2192i implements InterfaceC2154o, InterfaceC2184a {

    /* JADX INFO: renamed from: o */
    public int f9444o;

    /* JADX INFO: renamed from: p */
    public SurfaceTexture f9445p;

    /* JADX INFO: renamed from: s */
    public byte[] f9448s;

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f9436g = new AtomicBoolean();

    /* JADX INFO: renamed from: h */
    public final AtomicBoolean f9437h = new AtomicBoolean(true);

    /* JADX INFO: renamed from: i */
    public final C2190g f9438i = new C2190g();

    /* JADX INFO: renamed from: j */
    public final C2035l f9439j = new C2035l();

    /* JADX INFO: renamed from: k */
    public final C0368e f9440k = new C0368e();

    /* JADX INFO: renamed from: l */
    public final C0368e f9441l = new C0368e();

    /* JADX INFO: renamed from: m */
    public final float[] f9442m = new float[16];

    /* JADX INFO: renamed from: n */
    public final float[] f9443n = new float[16];

    /* JADX INFO: renamed from: q */
    public volatile int f9446q = 0;

    /* JADX INFO: renamed from: r */
    public int f9447r = -1;

    @Override // p141r0.InterfaceC2184a
    /* JADX INFO: renamed from: a */
    public final void mo1901a() {
        this.f9440k.m1011c();
        C2035l c2035l = this.f9439j;
        ((C0368e) c2035l.f8871d).m1011c();
        c2035l.f8868a = false;
        this.f9437h.set(true);
    }

    @Override // p141r0.InterfaceC2184a
    /* JADX INFO: renamed from: b */
    public final void mo1902b(long j3, float[] fArr) {
        ((C0368e) this.f9439j.f8871d).m1009a(j3, fArr);
    }

    /* JADX INFO: renamed from: c */
    public final void m4774c(float[] fArr) {
        float[] fArr2;
        Object objM1014f;
        GLES20.glClear(16384);
        try {
            AbstractC0646n.m1626d();
        } catch (C0639g e3) {
            AbstractC0646n.m1636n("SceneRenderer", "Failed to draw a frame", e3);
        }
        if (this.f9436g.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.f9445p;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                AbstractC0646n.m1626d();
            } catch (C0639g e4) {
                AbstractC0646n.m1636n("SceneRenderer", "Failed to draw a frame", e4);
            }
            if (this.f9437h.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f9442m, 0);
            }
            long timestamp = this.f9445p.getTimestamp();
            C0368e c0368e = this.f9440k;
            synchronized (c0368e) {
                objM1014f = c0368e.m1014f(timestamp, false);
            }
            Long l3 = (Long) objM1014f;
            if (l3 != null) {
                C2035l c2035l = this.f9439j;
                float[] fArr3 = this.f9442m;
                float[] fArr4 = (float[]) ((C0368e) c2035l.f8871d).m1016h(l3.longValue());
                if (fArr4 != null) {
                    float f = fArr4[0];
                    float f3 = -fArr4[1];
                    float f4 = -fArr4[2];
                    float length = Matrix.length(f, f3, f4);
                    float[] fArr5 = (float[]) c2035l.f8870c;
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f / length, f3 / length, f4 / length);
                    } else {
                        Matrix.setIdentityM(fArr5, 0);
                    }
                    if (!c2035l.f8868a) {
                        C2035l.m4604b((float[]) c2035l.f8869b, (float[]) c2035l.f8870c);
                        c2035l.f8868a = true;
                    }
                    Matrix.multiplyMM(fArr3, 0, (float[]) c2035l.f8869b, 0, (float[]) c2035l.f8870c, 0);
                }
            }
            C2189f c2189f = (C2189f) this.f9441l.m1016h(timestamp);
            if (c2189f != null) {
                C2190g c2190g = this.f9438i;
                c2190g.getClass();
                if (C2190g.m4772b(c2189f)) {
                    c2190g.f9427a = c2189f.f9422c;
                    c2190g.f9428b = new C0368e(c2189f.f9420a.f9419a[0]);
                    if (!c2189f.f9423d) {
                        new C0368e(c2189f.f9421b.f9419a[0]);
                    }
                }
            }
        }
        Matrix.multiplyMM(this.f9443n, 0, fArr, 0, this.f9442m, 0);
        C2190g c2190g2 = this.f9438i;
        int i3 = this.f9444o;
        float[] fArr6 = this.f9443n;
        C0368e c0368e2 = c2190g2.f9428b;
        if (c0368e2 == null) {
            return;
        }
        int i4 = c2190g2.f9427a;
        if (i4 == 1) {
            fArr2 = C2190g.f9425j;
        } else {
            fArr2 = i4 == 2 ? C2190g.f9426k : C2190g.f9424i;
        }
        GLES20.glUniformMatrix3fv(c2190g2.f9431e, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(c2190g2.f9430d, 1, false, fArr6, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i3);
        GLES20.glUniform1i(c2190g2.f9434h, 0);
        try {
            AbstractC0646n.m1626d();
        } catch (C0639g e5) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e5);
        }
        GLES20.glVertexAttribPointer(c2190g2.f9432f, 3, 5126, false, 12, (Buffer) c0368e2.f1180c);
        try {
            AbstractC0646n.m1626d();
        } catch (C0639g e6) {
            Log.e("ProjectionRenderer", "Failed to load position data", e6);
        }
        GLES20.glVertexAttribPointer(c2190g2.f9433g, 2, 5126, false, 8, (Buffer) c0368e2.f1181d);
        try {
            AbstractC0646n.m1626d();
        } catch (C0639g e7) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e7);
        }
        GLES20.glDrawArrays(c0368e2.f1179b, 0, c0368e2.f1178a);
        try {
            AbstractC0646n.m1626d();
        } catch (C0639g e8) {
            Log.e("ProjectionRenderer", "Failed to render", e8);
        }
    }

    @Override // p137q0.InterfaceC2154o
    /* JADX INFO: renamed from: d */
    public final void mo1904d(long j3, long j4, C0583o c0583o, MediaFormat mediaFormat) {
        int i3;
        int i4;
        ArrayList arrayListM1722E;
        int i5 = 0;
        this.f9440k.m1009a(j4, Long.valueOf(j3));
        byte[] bArr = c0583o.f2166z;
        int i6 = c0583o.f2128A;
        byte[] bArr2 = this.f9448s;
        int i7 = this.f9447r;
        this.f9448s = bArr;
        if (i6 == -1) {
            i6 = this.f9446q;
        }
        this.f9447r = i6;
        if (i7 == i6 && Arrays.equals(bArr2, this.f9448s)) {
            return;
        }
        byte[] bArr3 = this.f9448s;
        C2189f c2189f = null;
        if (bArr3 != null) {
            int i8 = this.f9447r;
            C0651s c0651s = new C0651s(bArr3);
            try {
                c0651s.m1666H(4);
                int iM1673g = c0651s.m1673g();
                c0651s.m1665G(0);
                if (iM1673g == 1886547818) {
                    c0651s.m1666H(8);
                    int i9 = c0651s.f2521b;
                    int i10 = c0651s.f2522c;
                    while (true) {
                        if (i9 < i10) {
                            int iM1673g2 = c0651s.m1673g() + i9;
                            if (iM1673g2 > i9 && iM1673g2 <= i10) {
                                int iM1673g3 = c0651s.m1673g();
                                if (iM1673g3 != 2037673328 && iM1673g3 != 1836279920) {
                                    c0651s.m1665G(iM1673g2);
                                    i9 = iM1673g2;
                                }
                                c0651s.m1664F(iM1673g2);
                                arrayListM1722E = AbstractC0664e.m1722E(c0651s);
                            }
                        }
                        arrayListM1722E = null;
                    }
                } else {
                    arrayListM1722E = AbstractC0664e.m1722E(c0651s);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (arrayListM1722E != null) {
                int size = arrayListM1722E.size();
                if (size == 1) {
                    C2188e c2188e = (C2188e) arrayListM1722E.get(0);
                    c2189f = new C2189f(c2188e, c2188e, i8);
                } else if (size == 2) {
                    c2189f = new C2189f((C2188e) arrayListM1722E.get(0), (C2188e) arrayListM1722E.get(1), i8);
                }
            }
        }
        if (c2189f == null || !C2190g.m4772b(c2189f)) {
            int i11 = this.f9447r;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f = radians / 36;
            float f3 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 36; i5 < i14; i14 = 36) {
                float f4 = radians / 2.0f;
                float f5 = (i5 * f) - f4;
                int i15 = i5 + 1;
                float f6 = (i15 * f) - f4;
                int i16 = 0;
                while (i16 < 73) {
                    int i17 = i15;
                    int i18 = i5;
                    float f7 = f6;
                    int i19 = i12;
                    int i20 = i13;
                    int i21 = 0;
                    while (i21 < 2) {
                        float f8 = radians;
                        float f9 = i16 * f3;
                        float f10 = (f9 + 3.1415927f) - (radians2 / 2.0f);
                        float f11 = radians2;
                        float f12 = f5;
                        double d3 = 50.0f;
                        double d4 = f10;
                        double d5 = i21 == 0 ? f5 : f7;
                        fArr[i19] = -((float) (Math.cos(d5) * Math.sin(d4) * d3));
                        fArr[i19 + 1] = (float) (Math.sin(d5) * d3);
                        int i22 = i19 + 3;
                        fArr[i19 + 2] = (float) (Math.cos(d5) * Math.cos(d4) * d3);
                        fArr2[i20] = f9 / f11;
                        int i23 = i20 + 2;
                        fArr2[i20 + 1] = ((i18 + i21) * f) / f8;
                        if (i16 == 0 && i21 == 0) {
                            i3 = 1;
                            i4 = 3;
                        } else {
                            i3 = 1;
                            if (i16 == 72) {
                                i4 = 3;
                                if (i21 == 1) {
                                }
                                i21 += i3;
                                radians = f8;
                                radians2 = f11;
                                f5 = f12;
                            }
                            i19 = i22;
                            i20 = i23;
                            i21 += i3;
                            radians = f8;
                            radians2 = f11;
                            f5 = f12;
                        }
                        System.arraycopy(fArr, i19, fArr, i22, i4);
                        i19 += 6;
                        System.arraycopy(fArr2, i20, fArr2, i23, 2);
                        i20 += 4;
                        i21 += i3;
                        radians = f8;
                        radians2 = f11;
                        f5 = f12;
                    }
                    i16++;
                    i13 = i20;
                    i12 = i19;
                    i5 = i18;
                    f6 = f7;
                    radians = radians;
                    f5 = f5;
                    i15 = i17;
                }
                i5 = i15;
            }
            C2188e c2188e2 = new C2188e(new C0368e(0, fArr, fArr2, 1));
            c2189f = new C2189f(c2188e2, c2188e2, i11);
        }
        this.f9441l.m1009a(j4, c2189f);
    }

    /* JADX INFO: renamed from: e */
    public final SurfaceTexture m4775e() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            AbstractC0646n.m1626d();
            this.f9438i.m4773a();
            AbstractC0646n.m1626d();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            AbstractC0646n.m1626d();
            int i3 = iArr[0];
            GLES20.glBindTexture(36197, i3);
            AbstractC0646n.m1626d();
            GLES20.glTexParameteri(36197, 10240, 9729);
            AbstractC0646n.m1626d();
            GLES20.glTexParameteri(36197, 10241, 9729);
            AbstractC0646n.m1626d();
            GLES20.glTexParameteri(36197, 10242, 33071);
            AbstractC0646n.m1626d();
            GLES20.glTexParameteri(36197, 10243, 33071);
            AbstractC0646n.m1626d();
            this.f9444o = i3;
        } catch (C0639g e3) {
            AbstractC0646n.m1636n("SceneRenderer", "Failed to initialize the renderer", e3);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f9444o);
        this.f9445p = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: r0.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f9435g.f9436g.set(true);
            }
        });
        return this.f9445p;
    }
}

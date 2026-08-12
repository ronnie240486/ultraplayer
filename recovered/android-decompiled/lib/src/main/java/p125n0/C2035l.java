package p125n0;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.opengl.Matrix;
import java.util.Objects;
import p036M0.C0368e;
import p055T.C0567c;
import p055T.C0583o;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: n0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2035l {

    /* JADX INFO: renamed from: a */
    public boolean f8868a;

    /* JADX INFO: renamed from: b */
    public final Object f8869b;

    /* JADX INFO: renamed from: c */
    public Object f8870c;

    /* JADX INFO: renamed from: d */
    public Object f8871d;

    public C2035l() {
        this.f8869b = new float[16];
        this.f8870c = new float[16];
        this.f8871d = new C0368e();
    }

    /* JADX INFO: renamed from: b */
    public static void m4604b(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f3 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f3 * f3) + (f * f));
        float f4 = fArr2[10] / fSqrt;
        fArr[0] = f4;
        float f5 = fArr2[8];
        fArr[2] = f5 / fSqrt;
        fArr[8] = (-f5) / fSqrt;
        fArr[10] = f4;
    }

    /* JADX INFO: renamed from: a */
    public boolean m4605a(C0567c c0567c, C0583o c0583o) {
        boolean zEquals = Objects.equals(c0583o.f2154n, "audio/eac3-joc");
        int i3 = c0583o.f2130C;
        if (!zEquals) {
            String str = c0583o.f2154n;
            if (Objects.equals(str, "audio/iamf")) {
                if (i3 == -1) {
                    i3 = 6;
                }
            } else if (Objects.equals(str, "audio/ac4") && (i3 == 18 || i3 == 21)) {
                i3 = 24;
            }
        } else if (i3 == 16) {
            i3 = 12;
        }
        int iM1598q = AbstractC0632A.m1598q(i3);
        if (iM1598q == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iM1598q);
        int i4 = c0583o.f2131D;
        if (i4 != -1) {
            channelMask.setSampleRate(i4);
        }
        return ((Spatializer) this.f8869b).canBeSpatialized((AudioAttributes) c0567c.m1433a().f38h, channelMask.build());
    }

    public C2035l(Spatializer spatializer) {
        this.f8869b = spatializer;
        this.f8868a = spatializer.getImmersiveAudioLevel() != 0;
    }
}

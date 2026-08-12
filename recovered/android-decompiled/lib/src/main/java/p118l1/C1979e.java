package p118l1;

import android.animation.TypeEvaluator;
import p060U1.AbstractC0610a;
import p148t.C2267f;

/* JADX INFO: renamed from: l1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1979e implements TypeEvaluator {

    /* JADX INFO: renamed from: a */
    public C2267f[] f8631a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        C2267f[] c2267fArr = (C2267f[]) obj;
        C2267f[] c2267fArr2 = (C2267f[]) obj2;
        if (!AbstractC0610a.m1502d(c2267fArr, c2267fArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!AbstractC0610a.m1502d(this.f8631a, c2267fArr)) {
            this.f8631a = AbstractC0610a.m1508j(c2267fArr);
        }
        for (int i3 = 0; i3 < c2267fArr.length; i3++) {
            C2267f c2267f = this.f8631a[i3];
            C2267f c2267f2 = c2267fArr[i3];
            C2267f c2267f3 = c2267fArr2[i3];
            c2267f.getClass();
            c2267f.f9703a = c2267f2.f9703a;
            int i4 = 0;
            while (true) {
                float[] fArr = c2267f2.f9704b;
                if (i4 < fArr.length) {
                    c2267f.f9704b[i4] = (c2267f3.f9704b[i4] * f) + ((1.0f - f) * fArr[i4]);
                    i4++;
                }
            }
        }
        return this.f8631a;
    }
}

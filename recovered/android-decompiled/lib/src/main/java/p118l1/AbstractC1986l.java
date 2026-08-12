package p118l1;

import p060U1.AbstractC0610a;
import p148t.C2267f;

/* JADX INFO: renamed from: l1.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1986l extends AbstractC1985k {

    /* JADX INFO: renamed from: a */
    public C2267f[] f8656a;

    /* JADX INFO: renamed from: b */
    public String f8657b;

    /* JADX INFO: renamed from: c */
    public int f8658c;

    public AbstractC1986l() {
        this.f8656a = null;
        this.f8658c = 0;
    }

    public C2267f[] getPathData() {
        return this.f8656a;
    }

    public String getPathName() {
        return this.f8657b;
    }

    public void setPathData(C2267f[] c2267fArr) {
        if (!AbstractC0610a.m1502d(this.f8656a, c2267fArr)) {
            this.f8656a = AbstractC0610a.m1508j(c2267fArr);
            return;
        }
        C2267f[] c2267fArr2 = this.f8656a;
        for (int i3 = 0; i3 < c2267fArr.length; i3++) {
            c2267fArr2[i3].f9703a = c2267fArr[i3].f9703a;
            int i4 = 0;
            while (true) {
                float[] fArr = c2267fArr[i3].f9704b;
                if (i4 < fArr.length) {
                    c2267fArr2[i3].f9704b[i4] = fArr[i4];
                    i4++;
                }
            }
        }
    }

    public AbstractC1986l(AbstractC1986l abstractC1986l) {
        this.f8656a = null;
        this.f8658c = 0;
        this.f8657b = abstractC1986l.f8657b;
        this.f8656a = AbstractC0610a.m1508j(abstractC1986l.f8656a);
    }
}

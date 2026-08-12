package p118l1;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import p036M0.C0380q;

/* JADX INFO: renamed from: l1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1983i extends AbstractC1986l {

    /* JADX INFO: renamed from: d */
    public C0380q f8634d;

    /* JADX INFO: renamed from: e */
    public float f8635e;

    /* JADX INFO: renamed from: f */
    public C0380q f8636f;

    /* JADX INFO: renamed from: g */
    public float f8637g;

    /* JADX INFO: renamed from: h */
    public float f8638h;

    /* JADX INFO: renamed from: i */
    public float f8639i;

    /* JADX INFO: renamed from: j */
    public float f8640j;

    /* JADX INFO: renamed from: k */
    public float f8641k;

    /* JADX INFO: renamed from: l */
    public Paint.Cap f8642l;

    /* JADX INFO: renamed from: m */
    public Paint.Join f8643m;

    /* JADX INFO: renamed from: n */
    public float f8644n;

    @Override // p118l1.AbstractC1985k
    /* JADX INFO: renamed from: a */
    public final boolean mo4517a() {
        return this.f8636f.m1046g() || this.f8634d.m1046g();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // p118l1.AbstractC1985k
    /* JADX INFO: renamed from: b */
    public final boolean mo4518b(int[] iArr) {
        boolean z3;
        C0380q c0380q = this.f8636f;
        boolean z4 = false;
        if (c0380q.m1046g()) {
            ColorStateList colorStateList = (ColorStateList) c0380q.f1293j;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != c0380q.f1291h) {
                c0380q.f1291h = colorForState;
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        C0380q c0380q2 = this.f8634d;
        if (c0380q2.m1046g()) {
            ColorStateList colorStateList2 = (ColorStateList) c0380q2.f1293j;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != c0380q2.f1291h) {
                c0380q2.f1291h = colorForState2;
                z4 = true;
            }
        }
        return z3 | z4;
    }

    public float getFillAlpha() {
        return this.f8638h;
    }

    public int getFillColor() {
        return this.f8636f.f1291h;
    }

    public float getStrokeAlpha() {
        return this.f8637g;
    }

    public int getStrokeColor() {
        return this.f8634d.f1291h;
    }

    public float getStrokeWidth() {
        return this.f8635e;
    }

    public float getTrimPathEnd() {
        return this.f8640j;
    }

    public float getTrimPathOffset() {
        return this.f8641k;
    }

    public float getTrimPathStart() {
        return this.f8639i;
    }

    public void setFillAlpha(float f) {
        this.f8638h = f;
    }

    public void setFillColor(int i3) {
        this.f8636f.f1291h = i3;
    }

    public void setStrokeAlpha(float f) {
        this.f8637g = f;
    }

    public void setStrokeColor(int i3) {
        this.f8634d.f1291h = i3;
    }

    public void setStrokeWidth(float f) {
        this.f8635e = f;
    }

    public void setTrimPathEnd(float f) {
        this.f8640j = f;
    }

    public void setTrimPathOffset(float f) {
        this.f8641k = f;
    }

    public void setTrimPathStart(float f) {
        this.f8639i = f;
    }
}

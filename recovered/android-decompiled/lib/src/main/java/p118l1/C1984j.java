package p118l1;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import p124n.C2018e;

/* JADX INFO: renamed from: l1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1984j extends AbstractC1985k {

    /* JADX INFO: renamed from: a */
    public final Matrix f8645a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f8646b;

    /* JADX INFO: renamed from: c */
    public float f8647c;

    /* JADX INFO: renamed from: d */
    public float f8648d;

    /* JADX INFO: renamed from: e */
    public float f8649e;

    /* JADX INFO: renamed from: f */
    public float f8650f;

    /* JADX INFO: renamed from: g */
    public float f8651g;

    /* JADX INFO: renamed from: h */
    public float f8652h;

    /* JADX INFO: renamed from: i */
    public float f8653i;

    /* JADX INFO: renamed from: j */
    public final Matrix f8654j;

    /* JADX INFO: renamed from: k */
    public String f8655k;

    public C1984j() {
        this.f8645a = new Matrix();
        this.f8646b = new ArrayList();
        this.f8647c = 0.0f;
        this.f8648d = 0.0f;
        this.f8649e = 0.0f;
        this.f8650f = 1.0f;
        this.f8651g = 1.0f;
        this.f8652h = 0.0f;
        this.f8653i = 0.0f;
        this.f8654j = new Matrix();
        this.f8655k = null;
    }

    @Override // p118l1.AbstractC1985k
    /* JADX INFO: renamed from: a */
    public final boolean mo4517a() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f8646b;
            if (i3 >= arrayList.size()) {
                return false;
            }
            if (((AbstractC1985k) arrayList.get(i3)).mo4517a()) {
                return true;
            }
            i3++;
        }
    }

    @Override // p118l1.AbstractC1985k
    /* JADX INFO: renamed from: b */
    public final boolean mo4518b(int[] iArr) {
        int i3 = 0;
        boolean zMo4518b = false;
        while (true) {
            ArrayList arrayList = this.f8646b;
            if (i3 >= arrayList.size()) {
                return zMo4518b;
            }
            zMo4518b |= ((AbstractC1985k) arrayList.get(i3)).mo4518b(iArr);
            i3++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4519c() {
        Matrix matrix = this.f8654j;
        matrix.reset();
        matrix.postTranslate(-this.f8648d, -this.f8649e);
        matrix.postScale(this.f8650f, this.f8651g);
        matrix.postRotate(this.f8647c, 0.0f, 0.0f);
        matrix.postTranslate(this.f8652h + this.f8648d, this.f8653i + this.f8649e);
    }

    public String getGroupName() {
        return this.f8655k;
    }

    public Matrix getLocalMatrix() {
        return this.f8654j;
    }

    public float getPivotX() {
        return this.f8648d;
    }

    public float getPivotY() {
        return this.f8649e;
    }

    public float getRotation() {
        return this.f8647c;
    }

    public float getScaleX() {
        return this.f8650f;
    }

    public float getScaleY() {
        return this.f8651g;
    }

    public float getTranslateX() {
        return this.f8652h;
    }

    public float getTranslateY() {
        return this.f8653i;
    }

    public void setPivotX(float f) {
        if (f != this.f8648d) {
            this.f8648d = f;
            m4519c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f8649e) {
            this.f8649e = f;
            m4519c();
        }
    }

    public void setRotation(float f) {
        if (f != this.f8647c) {
            this.f8647c = f;
            m4519c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f8650f) {
            this.f8650f = f;
            m4519c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f8651g) {
            this.f8651g = f;
            m4519c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f8652h) {
            this.f8652h = f;
            m4519c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.f8653i) {
            this.f8653i = f;
            m4519c();
        }
    }

    public C1984j(C1984j c1984j, C2018e c2018e) {
        AbstractC1986l c1982h;
        this.f8645a = new Matrix();
        this.f8646b = new ArrayList();
        this.f8647c = 0.0f;
        this.f8648d = 0.0f;
        this.f8649e = 0.0f;
        this.f8650f = 1.0f;
        this.f8651g = 1.0f;
        this.f8652h = 0.0f;
        this.f8653i = 0.0f;
        Matrix matrix = new Matrix();
        this.f8654j = matrix;
        this.f8655k = null;
        this.f8647c = c1984j.f8647c;
        this.f8648d = c1984j.f8648d;
        this.f8649e = c1984j.f8649e;
        this.f8650f = c1984j.f8650f;
        this.f8651g = c1984j.f8651g;
        this.f8652h = c1984j.f8652h;
        this.f8653i = c1984j.f8653i;
        String str = c1984j.f8655k;
        this.f8655k = str;
        if (str != null) {
            c2018e.put(str, this);
        }
        matrix.set(c1984j.f8654j);
        ArrayList arrayList = c1984j.f8646b;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Object obj = arrayList.get(i3);
            if (obj instanceof C1984j) {
                this.f8646b.add(new C1984j((C1984j) obj, c2018e));
            } else {
                if (obj instanceof C1983i) {
                    C1983i c1983i = (C1983i) obj;
                    C1983i c1983i2 = new C1983i(c1983i);
                    c1983i2.f8635e = 0.0f;
                    c1983i2.f8637g = 1.0f;
                    c1983i2.f8638h = 1.0f;
                    c1983i2.f8639i = 0.0f;
                    c1983i2.f8640j = 1.0f;
                    c1983i2.f8641k = 0.0f;
                    c1983i2.f8642l = Paint.Cap.BUTT;
                    c1983i2.f8643m = Paint.Join.MITER;
                    c1983i2.f8644n = 4.0f;
                    c1983i2.f8634d = c1983i.f8634d;
                    c1983i2.f8635e = c1983i.f8635e;
                    c1983i2.f8637g = c1983i.f8637g;
                    c1983i2.f8636f = c1983i.f8636f;
                    c1983i2.f8658c = c1983i.f8658c;
                    c1983i2.f8638h = c1983i.f8638h;
                    c1983i2.f8639i = c1983i.f8639i;
                    c1983i2.f8640j = c1983i.f8640j;
                    c1983i2.f8641k = c1983i.f8641k;
                    c1983i2.f8642l = c1983i.f8642l;
                    c1983i2.f8643m = c1983i.f8643m;
                    c1983i2.f8644n = c1983i.f8644n;
                    c1982h = c1983i2;
                } else if (obj instanceof C1982h) {
                    c1982h = new C1982h((C1982h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f8646b.add(c1982h);
                Object obj2 = c1982h.f8657b;
                if (obj2 != null) {
                    c2018e.put(obj2, c1982h);
                }
            }
        }
    }
}

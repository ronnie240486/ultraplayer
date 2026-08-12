package p093e1;

import android.graphics.Color;
import java.util.Arrays;
import p148t.AbstractC2262a;

/* JADX INFO: renamed from: e1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1520e {

    /* JADX INFO: renamed from: a */
    public final int f6853a;

    /* JADX INFO: renamed from: b */
    public final int f6854b;

    /* JADX INFO: renamed from: c */
    public final int f6855c;

    /* JADX INFO: renamed from: d */
    public final int f6856d;

    /* JADX INFO: renamed from: e */
    public final int f6857e;

    /* JADX INFO: renamed from: f */
    public boolean f6858f;

    /* JADX INFO: renamed from: g */
    public int f6859g;

    /* JADX INFO: renamed from: h */
    public int f6860h;

    /* JADX INFO: renamed from: i */
    public float[] f6861i;

    public C1520e(int i3, int i4) {
        this.f6853a = Color.red(i3);
        this.f6854b = Color.green(i3);
        this.f6855c = Color.blue(i3);
        this.f6856d = i3;
        this.f6857e = i4;
    }

    /* JADX INFO: renamed from: a */
    public final void m3815a() {
        if (this.f6858f) {
            return;
        }
        int i3 = this.f6856d;
        int iM4857e = AbstractC2262a.m4857e(4.5f, -1, i3);
        int iM4857e2 = AbstractC2262a.m4857e(3.0f, -1, i3);
        if (iM4857e != -1 && iM4857e2 != -1) {
            this.f6860h = AbstractC2262a.m4860h(-1, iM4857e);
            this.f6859g = AbstractC2262a.m4860h(-1, iM4857e2);
            this.f6858f = true;
            return;
        }
        int iM4857e3 = AbstractC2262a.m4857e(4.5f, -16777216, i3);
        int iM4857e4 = AbstractC2262a.m4857e(3.0f, -16777216, i3);
        if (iM4857e3 == -1 || iM4857e4 == -1) {
            this.f6860h = iM4857e != -1 ? AbstractC2262a.m4860h(-1, iM4857e) : AbstractC2262a.m4860h(-16777216, iM4857e3);
            this.f6859g = iM4857e2 != -1 ? AbstractC2262a.m4860h(-1, iM4857e2) : AbstractC2262a.m4860h(-16777216, iM4857e4);
            this.f6858f = true;
        } else {
            this.f6860h = AbstractC2262a.m4860h(-16777216, iM4857e3);
            this.f6859g = AbstractC2262a.m4860h(-16777216, iM4857e4);
            this.f6858f = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public final float[] m3816b() {
        if (this.f6861i == null) {
            this.f6861i = new float[3];
        }
        AbstractC2262a.m4853a(this.f6853a, this.f6854b, this.f6855c, this.f6861i);
        return this.f6861i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1520e.class == obj.getClass()) {
            C1520e c1520e = (C1520e) obj;
            if (this.f6857e == c1520e.f6857e && this.f6856d == c1520e.f6856d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f6856d * 31) + this.f6857e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C1520e.class.getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.f6856d));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(m3816b()));
        sb.append("] [Population: ");
        sb.append(this.f6857e);
        sb.append("] [Title Text: #");
        m3815a();
        sb.append(Integer.toHexString(this.f6859g));
        sb.append("] [Body Text: #");
        m3815a();
        sb.append(Integer.toHexString(this.f6860h));
        sb.append(']');
        return sb.toString();
    }
}

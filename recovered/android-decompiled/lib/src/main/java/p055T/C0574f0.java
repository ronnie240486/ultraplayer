package p055T;

import p064W.AbstractC0632A;

/* JADX INFO: renamed from: T.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0574f0 {

    /* JADX INFO: renamed from: d */
    public static final C0574f0 f2070d = new C0574f0(1.0f, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f2071a;

    /* JADX INFO: renamed from: b */
    public final int f2072b;

    /* JADX INFO: renamed from: c */
    public final float f2073c;

    static {
        AbstractC0632A.m1566G(0);
        AbstractC0632A.m1566G(1);
        AbstractC0632A.m1566G(3);
    }

    public C0574f0(float f, int i3, int i4) {
        this.f2071a = i3;
        this.f2072b = i4;
        this.f2073c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0574f0) {
            C0574f0 c0574f0 = (C0574f0) obj;
            if (this.f2071a == c0574f0.f2071a && this.f2072b == c0574f0.f2072b && this.f2073c == c0574f0.f2073c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f2073c) + ((((217 + this.f2071a) * 31) + this.f2072b) * 31);
    }
}

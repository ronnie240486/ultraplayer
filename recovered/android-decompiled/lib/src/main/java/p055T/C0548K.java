package p055T;

import java.util.Locale;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: T.K */
/* JADX INFO: loaded from: classes.dex */
public final class C0548K {

    /* JADX INFO: renamed from: d */
    public static final C0548K f1948d = new C0548K(1.0f);

    /* JADX INFO: renamed from: a */
    public final float f1949a;

    /* JADX INFO: renamed from: b */
    public final float f1950b;

    /* JADX INFO: renamed from: c */
    public final int f1951c;

    static {
        AbstractC0632A.m1566G(0);
        AbstractC0632A.m1566G(1);
    }

    public C0548K(float f) {
        this(f, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0548K.class == obj.getClass()) {
            C0548K c0548k = (C0548K) obj;
            if (this.f1949a == c0548k.f1949a && this.f1950b == c0548k.f1950b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f1950b) + ((Float.floatToRawIntBits(this.f1949a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f1949a), Float.valueOf(this.f1950b)};
        int i3 = AbstractC0632A.f2454a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public C0548K(float f, float f3) {
        AbstractC0646n.m1625c(f > 0.0f);
        AbstractC0646n.m1625c(f3 > 0.0f);
        this.f1949a = f;
        this.f1950b = f3;
        this.f1951c = Math.round(f * 1000.0f);
    }
}

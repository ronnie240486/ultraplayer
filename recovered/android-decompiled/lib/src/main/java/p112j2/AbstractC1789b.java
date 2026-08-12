package p112j2;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.math.RoundingMode;
import p060U1.AbstractC0610a;

/* JADX INFO: renamed from: j2.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1789b {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f7980a = 0;

    static {
        Math.log(2.0d);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4279a(double d3) {
        if (AbstractC0610a.m1518u(d3)) {
            return d3 == 0.0d || 52 - Long.numberOfTrailingZeros(AbstractC0610a.m1514q(d3)) <= Math.getExponent(d3);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4280b(double d3) {
        if (d3 > 0.0d && AbstractC0610a.m1518u(d3)) {
            long jM1514q = AbstractC0610a.m1514q(d3);
            if ((jM1514q & (jM1514q - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static int m4281c(double d3) {
        boolean zM4280b;
        RoundingMode roundingMode = RoundingMode.CEILING;
        boolean z3 = false;
        if (!(d3 > 0.0d && AbstractC0610a.m1518u(d3))) {
            throw new IllegalArgumentException("x must be positive and finite");
        }
        int exponent = Math.getExponent(d3);
        if (Math.getExponent(d3) < -1022) {
            return m4281c(d3 * 4.503599627370496E15d) - 52;
        }
        switch (AbstractC1788a.f7979a[roundingMode.ordinal()]) {
            case 1:
                if (!m4280b(d3)) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
                if (z3) {
                    return exponent + 1;
                }
                return exponent;
            case 2:
                if (z3) {
                    return exponent + 1;
                }
                return exponent;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                z3 = !m4280b(d3);
                if (z3) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                z3 = exponent < 0;
                zM4280b = m4280b(d3);
                z3 &= !zM4280b;
                if (z3) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                z3 = exponent >= 0;
                zM4280b = m4280b(d3);
                z3 &= !zM4280b;
                if (z3) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double dLongBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d3) & 4503599627370495L) | 4607182418800017408L);
                if (dLongBitsToDouble * dLongBitsToDouble > 2.0d) {
                    z3 = true;
                }
                if (z3) {
                    return exponent + 1;
                }
                return exponent;
            default:
                throw new AssertionError();
        }
    }
}

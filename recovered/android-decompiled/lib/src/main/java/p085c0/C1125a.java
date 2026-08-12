package p085c0;

import java.util.Objects;
import java.util.Set;
import p064W.AbstractC0632A;
import p105h2.AbstractC1679J;
import p105h2.AbstractC1718l0;
import p105h2.C1678I;

/* JADX INFO: renamed from: c0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1125a {

    /* JADX INFO: renamed from: d */
    public static final C1125a f5220d;

    /* JADX INFO: renamed from: a */
    public final int f5221a;

    /* JADX INFO: renamed from: b */
    public final int f5222b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1679J f5223c;

    static {
        C1125a c1125a;
        if (AbstractC0632A.f2454a >= 33) {
            C1678I c1678i = new C1678I(4);
            for (int i3 = 1; i3 <= 10; i3++) {
                c1678i.m4102a(Integer.valueOf(AbstractC0632A.m1598q(i3)));
            }
            c1125a = new C1125a(2, c1678i.m4125f());
        } else {
            c1125a = new C1125a(2, 10);
        }
        f5220d = c1125a;
    }

    public C1125a(int i3, Set set) {
        this.f5221a = i3;
        AbstractC1679J abstractC1679JM4128n = AbstractC1679J.m4128n(set);
        this.f5223c = abstractC1679JM4128n;
        AbstractC1718l0 it = abstractC1679JM4128n.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f5222b = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1125a)) {
            return false;
        }
        C1125a c1125a = (C1125a) obj;
        if (this.f5221a == c1125a.f5221a && this.f5222b == c1125a.f5222b) {
            int i3 = AbstractC0632A.f2454a;
            if (Objects.equals(this.f5223c, c1125a.f5223c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = ((this.f5221a * 31) + this.f5222b) * 31;
        AbstractC1679J abstractC1679J = this.f5223c;
        return i3 + (abstractC1679J == null ? 0 : abstractC1679J.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f5221a + ", maxChannelCount=" + this.f5222b + ", channelMasks=" + this.f5223c + "]";
    }

    public C1125a(int i3, int i4) {
        this.f5221a = i3;
        this.f5222b = i4;
        this.f5223c = null;
    }
}

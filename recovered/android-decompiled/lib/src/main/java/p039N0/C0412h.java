package p039N0;

import java.util.ArrayList;
import java.util.Arrays;
import p009D0.C0106b;
import p055T.AbstractC0545H;
import p055T.C0544G;
import p055T.C0582n;
import p055T.C0583o;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p105h2.AbstractC1676G;
import p145s0.AbstractC2229b;

/* JADX INFO: renamed from: N0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0412h extends AbstractC0413i {

    /* JADX INFO: renamed from: o */
    public static final byte[] f1391o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p */
    public static final byte[] f1392p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n */
    public boolean f1393n;

    /* JADX INFO: renamed from: e */
    public static boolean m1108e(C0651s c0651s, byte[] bArr) {
        if (c0651s.m1667a() < bArr.length) {
            return false;
        }
        int i3 = c0651s.f2521b;
        byte[] bArr2 = new byte[bArr.length];
        c0651s.m1671e(bArr2, 0, bArr.length);
        c0651s.m1665G(i3);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // p039N0.AbstractC0413i
    /* JADX INFO: renamed from: b */
    public final long mo1100b(C0651s c0651s) {
        byte[] bArr = c0651s.f2520a;
        return (((long) this.f1402i) * AbstractC2229b.m4815j(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // p039N0.AbstractC0413i
    /* JADX INFO: renamed from: c */
    public final boolean mo1101c(C0651s c0651s, long j3, C0106b c0106b) {
        if (m1108e(c0651s, f1391o)) {
            byte[] bArrCopyOf = Arrays.copyOf(c0651s.f2520a, c0651s.f2522c);
            int i3 = bArrCopyOf[9] & 255;
            ArrayList arrayListM4806a = AbstractC2229b.m4806a(bArrCopyOf);
            if (((C0583o) c0106b.f140h) == null) {
                C0582n c0582n = new C0582n();
                c0582n.f2114m = AbstractC0545H.m1364l("audio/opus");
                c0582n.f2092B = i3;
                c0582n.f2093C = 48000;
                c0582n.f2117p = arrayListM4806a;
                c0106b.f140h = new C0583o(c0582n);
                return true;
            }
        } else {
            if (!m1108e(c0651s, f1392p)) {
                AbstractC0646n.m1631i((C0583o) c0106b.f140h);
                return false;
            }
            AbstractC0646n.m1631i((C0583o) c0106b.f140h);
            if (!this.f1393n) {
                this.f1393n = true;
                c0651s.m1666H(8);
                C0544G c0544gM4823r = AbstractC2229b.m4823r(AbstractC1676G.m4118o(AbstractC2229b.m4826u(c0651s, false, false).f837h));
                if (c0544gM4823r != null) {
                    C0582n c0582nM1447a = ((C0583o) c0106b.f140h).m1447a();
                    c0582nM1447a.f2112k = c0544gM4823r.m1352e(((C0583o) c0106b.f140h).f2152l);
                    c0106b.f140h = new C0583o(c0582nM1447a);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // p039N0.AbstractC0413i
    /* JADX INFO: renamed from: d */
    public final void mo1102d(boolean z3) {
        super.mo1102d(z3);
        if (z3) {
            this.f1393n = false;
        }
    }
}

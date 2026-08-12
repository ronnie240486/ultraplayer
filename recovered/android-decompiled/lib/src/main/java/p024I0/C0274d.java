package p024I0;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p004B0.C0098a;
import p048Q0.C0508g;
import p055T.C0544G;
import p055T.InterfaceC0543F;
import p064W.C0651s;
import p064W.C0656x;
import p122m1.AbstractC2003a;

/* JADX INFO: renamed from: I0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0274d extends AbstractC2003a {

    /* JADX INFO: renamed from: f */
    public final C0651s f730f = new C0651s();

    /* JADX INFO: renamed from: g */
    public final C0508g f731g = new C0508g();

    /* JADX INFO: renamed from: h */
    public C0656x f732h;

    @Override // p122m1.AbstractC2003a
    /* JADX INFO: renamed from: i */
    public final C0544G mo501i(C0098a c0098a, ByteBuffer byteBuffer) {
        InterfaceC0543F c0277g;
        long j3;
        int i3;
        long j4;
        long j5;
        boolean z3;
        boolean z4;
        boolean z5;
        int iM1659A;
        int iM1687u;
        int iM1687u2;
        long jM1689w;
        boolean z6;
        List list;
        long j6;
        long j7;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i4;
        int i5;
        int iM1687u3;
        long j8;
        char c;
        boolean z11;
        C0656x c0656x = this.f732h;
        if (c0656x == null || c0098a.f124p != c0656x.m1705e()) {
            C0656x c0656x2 = new C0656x(c0098a.f3146m);
            this.f732h = c0656x2;
            c0656x2.m1701a(c0098a.f3146m - c0098a.f124p);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C0651s c0651s = this.f730f;
        c0651s.m1663E(bArrArray, iLimit);
        C0508g c0508g = this.f731g;
        c0508g.m1259p(bArrArray, iLimit);
        c0508g.m1263t(39);
        long jM1252i = (((long) c0508g.m1252i(1)) << 32) | ((long) c0508g.m1252i(32));
        c0508g.m1263t(20);
        int iM1252i = c0508g.m1252i(12);
        int iM1252i2 = c0508g.m1252i(8);
        c0651s.m1666H(14);
        if (iM1252i2 == 0) {
            c0277g = new C0277g();
        } else if (iM1252i2 != 255) {
            long j9 = 1;
            long jM1689w2 = -9223372036854775807L;
            if (iM1252i2 == 4) {
                int iM1687u4 = c0651s.m1687u();
                ArrayList arrayList = new ArrayList(iM1687u4);
                int i6 = 0;
                while (i6 < iM1687u4) {
                    long jM1689w3 = c0651s.m1689w();
                    boolean z12 = (c0651s.m1687u() & 128) != 0;
                    ArrayList arrayList2 = new ArrayList();
                    if (z12) {
                        j3 = j9;
                        i3 = i6;
                        j4 = -9223372036854775807L;
                        j5 = -9223372036854775807L;
                        z3 = false;
                        z4 = false;
                        z5 = false;
                        iM1659A = 0;
                        iM1687u = 0;
                        iM1687u2 = 0;
                    } else {
                        int iM1687u5 = c0651s.m1687u();
                        boolean z13 = (iM1687u5 & 128) != 0;
                        boolean z14 = (iM1687u5 & 64) != 0;
                        boolean z15 = (iM1687u5 & 32) != 0;
                        long jM1689w4 = z14 ? c0651s.m1689w() : -9223372036854775807L;
                        if (!z14) {
                            int iM1687u6 = c0651s.m1687u();
                            ArrayList arrayList3 = new ArrayList(iM1687u6);
                            int i7 = 0;
                            while (i7 < iM1687u6) {
                                arrayList3.add(new C0278h(c0651s.m1687u(), c0651s.m1689w()));
                                i7++;
                                i6 = i6;
                                j9 = j9;
                            }
                            arrayList2 = arrayList3;
                        }
                        j3 = j9;
                        i3 = i6;
                        if (z15) {
                            long jM1687u = c0651s.m1687u();
                            z6 = (jM1687u & 128) != 0;
                            jM1689w = ((((jM1687u & j3) << 32) | c0651s.m1689w()) * 1000) / 90;
                        } else {
                            jM1689w = -9223372036854775807L;
                            z6 = false;
                        }
                        z5 = z6;
                        j5 = jM1689w;
                        iM1659A = c0651s.m1659A();
                        z3 = z13;
                        z4 = z14;
                        j4 = jM1689w4;
                        iM1687u = c0651s.m1687u();
                        iM1687u2 = c0651s.m1687u();
                    }
                    arrayList.add(new C0279i(jM1689w3, z12, z3, z4, arrayList2, j4, z5, j5, iM1659A, iM1687u, iM1687u2));
                    i6 = i3 + 1;
                    j9 = j3;
                }
                c0277g = new C0280j(arrayList);
            } else if (iM1252i2 == 5) {
                C0656x c0656x3 = this.f732h;
                long jM1689w5 = c0651s.m1689w();
                boolean z16 = (c0651s.m1687u() & 128) != 0;
                List list2 = Collections.EMPTY_LIST;
                if (z16) {
                    list = list2;
                    j6 = -9223372036854775807L;
                    j7 = -9223372036854775807L;
                    z7 = false;
                    z8 = false;
                    z9 = false;
                    z10 = false;
                    i4 = 0;
                    i5 = 0;
                    iM1687u3 = 0;
                } else {
                    int iM1687u7 = c0651s.m1687u();
                    boolean z17 = (iM1687u7 & 128) != 0;
                    boolean z18 = (iM1687u7 & 64) != 0;
                    boolean z19 = (iM1687u7 & 32) != 0;
                    boolean z20 = (iM1687u7 & 16) != 0;
                    long jM817d = (!z18 || z20) ? -9223372036854775807L : C0281k.m817d(jM1252i, c0651s);
                    if (z18) {
                        j8 = 90;
                        c = ' ';
                    } else {
                        int iM1687u8 = c0651s.m1687u();
                        c = ' ';
                        ArrayList arrayList4 = new ArrayList(iM1687u8);
                        j8 = 90;
                        for (int i8 = 0; i8 < iM1687u8; i8++) {
                            int iM1687u9 = c0651s.m1687u();
                            long jM817d2 = !z20 ? C0281k.m817d(jM1252i, c0651s) : -9223372036854775807L;
                            arrayList4.add(new C0275e(iM1687u9, jM817d2, c0656x3.m1702b(jM817d2)));
                        }
                        list2 = arrayList4;
                    }
                    if (z19) {
                        long jM1687u2 = c0651s.m1687u();
                        z11 = (jM1687u2 & 128) != 0;
                        jM1689w2 = ((((jM1687u2 & 1) << c) | c0651s.m1689w()) * 1000) / j8;
                    } else {
                        z11 = false;
                    }
                    int iM1659A2 = c0651s.m1659A();
                    int iM1687u10 = c0651s.m1687u();
                    z10 = z11;
                    list = list2;
                    iM1687u3 = c0651s.m1687u();
                    i4 = iM1659A2;
                    i5 = iM1687u10;
                    z7 = z17;
                    j7 = jM1689w2;
                    j6 = jM817d;
                    z9 = z20;
                    z8 = z18;
                }
                c0277g = new C0276f(jM1689w5, z16, z7, z8, z9, j6, c0656x3.m1702b(j6), list, z10, j7, i4, i5, iM1687u3);
            } else if (iM1252i2 != 6) {
                c0277g = null;
            } else {
                C0656x c0656x4 = this.f732h;
                long jM817d3 = C0281k.m817d(jM1252i, c0651s);
                c0277g = new C0281k(jM817d3, c0656x4.m1702b(jM817d3));
            }
        } else {
            long jM1689w6 = c0651s.m1689w();
            int i9 = iM1252i - 4;
            byte[] bArr = new byte[i9];
            c0651s.m1671e(bArr, 0, i9);
            c0277g = new C0272b(jM1689w6, bArr, jM1252i);
        }
        return c0277g == null ? new C0544G(new InterfaceC0543F[0]) : new C0544G(c0277g);
    }
}

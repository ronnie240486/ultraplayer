package p165y0;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p045P0.AbstractC0462h;
import p048Q0.C0508g;
import p055T.AbstractC0545H;
import p055T.C0546I;
import p055T.C0582n;
import p055T.C0583o;
import p055T.C0587s;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1692X;
import p114k0.C1947h0;
import p145s0.AbstractC2229b;
import p145s0.C2228a;
import p145s0.C2230c;
import p145s0.C2237j;
import p145s0.C2239l;
import p145s0.C2244q;
import p145s0.C2249v;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2240m;
import p145s0.InterfaceC2241n;
import p145s0.InterfaceC2242o;

/* JADX INFO: renamed from: y0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2373b implements InterfaceC2240m {

    /* JADX INFO: renamed from: a */
    public final C0651s f9931a = new C0651s(4);

    /* JADX INFO: renamed from: b */
    public final C0651s f9932b = new C0651s(9);

    /* JADX INFO: renamed from: c */
    public final C0651s f9933c = new C0651s(11);

    /* JADX INFO: renamed from: d */
    public final C0651s f9934d = new C0651s();

    /* JADX INFO: renamed from: e */
    public final C2374c f9935e;

    /* JADX INFO: renamed from: f */
    public InterfaceC2242o f9936f;

    /* JADX INFO: renamed from: g */
    public int f9937g;

    /* JADX INFO: renamed from: h */
    public boolean f9938h;

    /* JADX INFO: renamed from: i */
    public long f9939i;

    /* JADX INFO: renamed from: j */
    public int f9940j;

    /* JADX INFO: renamed from: k */
    public int f9941k;

    /* JADX INFO: renamed from: l */
    public int f9942l;

    /* JADX INFO: renamed from: m */
    public long f9943m;

    /* JADX INFO: renamed from: n */
    public boolean f9944n;

    /* JADX INFO: renamed from: o */
    public C2372a f9945o;

    /* JADX INFO: renamed from: p */
    public C2375d f9946p;

    public C2373b() {
        C2374c c2374c = new C2374c(new C2239l());
        c2374c.f9947b = -9223372036854775807L;
        c2374c.f9948c = new long[0];
        c2374c.f9949d = new long[0];
        this.f9935e = c2374c;
        this.f9937g = 1;
    }

    /* JADX INFO: renamed from: b */
    public final C0651s m4963b(C2237j c2237j) {
        int i3 = this.f9942l;
        C0651s c0651s = this.f9934d;
        byte[] bArr = c0651s.f2520a;
        if (i3 > bArr.length) {
            c0651s.m1663E(new byte[Math.max(bArr.length * 2, i3)], 0);
        } else {
            c0651s.m1665G(0);
        }
        c0651s.m1664F(this.f9942l);
        c2237j.mo336f(c0651s.f2520a, 0, this.f9942l, false);
        return c0651s;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: c */
    public final InterfaceC2240m mo327c() {
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:141:0x0386  */
    /* JADX WARN: Code duplicated, block: B:144:0x0395 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:147:0x039f  */
    /* JADX WARN: Code duplicated, block: B:148:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:186:0x03ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x016f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0171  */
    /* JADX WARN: Code duplicated, block: B:96:0x028a  */
    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: e */
    public final int mo328e(InterfaceC2241n interfaceC2241n, C0587s c0587s) throws C0546I {
        long j3;
        long j4;
        int i3;
        long j5;
        boolean z3;
        boolean z4;
        long j6;
        AbstractC0646n.m1631i(this.f9936f);
        while (true) {
            int i4 = this.f9937g;
            if (i4 == 1) {
                C0651s c0651s = this.f9932b;
                if (!((C2237j) interfaceC2241n).mo336f(c0651s.f2520a, 0, 9, true)) {
                    return -1;
                }
                c0651s.m1665G(0);
                c0651s.m1666H(4);
                int iM1687u = c0651s.m1687u();
                boolean z5 = (iM1687u & 4) != 0;
                boolean z6 = (iM1687u & 1) != 0;
                if (z5 && this.f9945o == null) {
                    this.f9945o = new C2372a(this.f9936f.mo344p(8, 1));
                }
                if (z6 && this.f9946p == null) {
                    this.f9946p = new C2375d(this.f9936f.mo344p(9, 2));
                }
                this.f9936f.mo341l();
                this.f9940j = c0651s.m1673g() - 5;
                this.f9937g = 2;
            } else if (i4 == 2) {
                ((C2237j) interfaceC2241n).mo335d(this.f9940j);
                this.f9940j = 0;
                this.f9937g = 3;
            } else if (i4 == 3) {
                C0651s c0651s2 = this.f9933c;
                if (!((C2237j) interfaceC2241n).mo336f(c0651s2.f2520a, 0, 11, true)) {
                    return -1;
                }
                c0651s2.m1665G(0);
                this.f9941k = c0651s2.m1687u();
                this.f9942l = c0651s2.m1690x();
                this.f9943m = c0651s2.m1690x();
                this.f9943m = (((long) (c0651s2.m1687u() << 24)) | this.f9943m) * 1000;
                c0651s2.m1666H(3);
                this.f9937g = 4;
            } else {
                if (i4 != 4) {
                    throw new IllegalStateException();
                }
                boolean z7 = this.f9938h;
                C2374c c2374c = this.f9935e;
                if (z7) {
                    j3 = this.f9939i + this.f9943m;
                } else {
                    if (c2374c.f9947b == -9223372036854775807L) {
                        j4 = 0;
                    } else {
                        j3 = this.f9943m;
                    }
                    i3 = this.f9941k;
                    if (i3 == 8 || this.f9945o == null) {
                        if (i3 == 9 || this.f9946p == null) {
                            j5 = -9223372036854775807L;
                            if (i3 == 18 || this.f9944n) {
                                ((C2237j) interfaceC2241n).mo335d(this.f9942l);
                                z3 = false;
                            } else {
                                C0651s c0651sM4963b = m4963b((C2237j) interfaceC2241n);
                                c2374c.getClass();
                                c2374c.getClass();
                                if (c0651sM4963b.m1687u() == 2 && "onMetaData".equals(C2374c.m4966d0(c0651sM4963b)) && c0651sM4963b.m1667a() != 0 && c0651sM4963b.m1687u() == 8) {
                                    HashMap mapM4965c0 = C2374c.m4965c0(c0651sM4963b);
                                    Object obj = mapM4965c0.get("duration");
                                    double d3 = 1000000.0d;
                                    if (obj instanceof Double) {
                                        double dDoubleValue = ((Double) obj).doubleValue();
                                        if (dDoubleValue > 0.0d) {
                                            c2374c.f9947b = (long) (dDoubleValue * 1000000.0d);
                                        }
                                    }
                                    Object obj2 = mapM4965c0.get("keyframes");
                                    if (obj2 instanceof Map) {
                                        Map map = (Map) obj2;
                                        Object obj3 = map.get("filepositions");
                                        Object obj4 = map.get("times");
                                        if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                            List list = (List) obj3;
                                            List list2 = (List) obj4;
                                            int size = list2.size();
                                            c2374c.f9948c = new long[size];
                                            c2374c.f9949d = new long[size];
                                            int i5 = 0;
                                            while (i5 < size) {
                                                Object obj5 = list.get(i5);
                                                Object obj6 = list2.get(i5);
                                                if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                    c2374c.f9948c = new long[0];
                                                    c2374c.f9949d = new long[0];
                                                    break;
                                                }
                                                double d4 = d3;
                                                c2374c.f9948c[i5] = (long) (((Double) obj6).doubleValue() * d4);
                                                c2374c.f9949d[i5] = ((Double) obj5).longValue();
                                                i5++;
                                                d3 = d4;
                                            }
                                        }
                                    }
                                }
                                long j7 = c2374c.f9947b;
                                if (j7 != -9223372036854775807L) {
                                    this.f9936f.mo333b(new C2249v(j7, c2374c.f9949d, c2374c.f9948c));
                                    this.f9944n = true;
                                }
                                z3 = true;
                            }
                            z4 = false;
                        } else {
                            if (!this.f9944n) {
                                this.f9936f.mo333b(new C2244q(-9223372036854775807L));
                                this.f9944n = true;
                            }
                            C2375d c2375d = this.f9946p;
                            C0651s c0651sM4963b2 = m4963b((C2237j) interfaceC2241n);
                            c2375d.getClass();
                            int iM1687u2 = c0651sM4963b2.m1687u();
                            int i6 = (iM1687u2 >> 4) & 15;
                            int i7 = iM1687u2 & 15;
                            if (i7 != 7) {
                                throw new C1947h0(AbstractC0462h.m1165e(i7, "Video format not supported: "));
                            }
                            c2375d.f9955g = i6;
                            if (i6 != 5) {
                                int iM1687u3 = c0651sM4963b2.m1687u();
                                byte[] bArr = c0651sM4963b2.f2520a;
                                int i8 = c0651sM4963b2.f2521b;
                                int i9 = i8 + 1;
                                c0651sM4963b2.f2521b = i9;
                                int i10 = ((bArr[i8] & 255) << 24) >> 8;
                                j5 = -9223372036854775807L;
                                int i11 = i8 + 2;
                                c0651sM4963b2.f2521b = i11;
                                int i12 = ((bArr[i9] & 255) << 8) | i10;
                                c0651sM4963b2.f2521b = i8 + 3;
                                long j8 = (((long) ((bArr[i11] & 255) | i12)) * 1000) + j4;
                                boolean z8 = true;
                                InterfaceC2226E interfaceC2226E = (InterfaceC2226E) c2375d.f1360a;
                                if (iM1687u3 != 0 || c2375d.f9953e) {
                                    if (iM1687u3 == 1 && c2375d.f9953e) {
                                        int i13 = c2375d.f9955g == 1 ? 1 : 0;
                                        if (c2375d.f9954f || i13 != 0) {
                                            C0651s c0651s3 = c2375d.f9951c;
                                            byte[] bArr2 = c0651s3.f2520a;
                                            bArr2[0] = 0;
                                            bArr2[1] = 0;
                                            bArr2[2] = 0;
                                            int i14 = 4 - c2375d.f9952d;
                                            int i15 = 0;
                                            while (c0651sM4963b2.m1667a() > 0) {
                                                c0651sM4963b2.m1671e(c0651s3.f2520a, i14, c2375d.f9952d);
                                                c0651s3.m1665G(0);
                                                int iM1691y = c0651s3.m1691y();
                                                C0651s c0651s4 = c2375d.f9950b;
                                                c0651s4.m1665G(0);
                                                interfaceC2226E.mo1173b(4, c0651s4);
                                                interfaceC2226E.mo1173b(iM1691y, c0651sM4963b2);
                                                i15 = i15 + 4 + iM1691y;
                                            }
                                            ((InterfaceC2226E) c2375d.f1360a).mo1172a(j8, i13, i15, 0, null);
                                            c2375d.f9954f = true;
                                        }
                                    }
                                    if (z8) {
                                        z4 = true;
                                    }
                                } else {
                                    byte[] bArr3 = new byte[c0651sM4963b2.m1667a()];
                                    C0651s c0651s5 = new C0651s(bArr3);
                                    c0651sM4963b2.m1671e(bArr3, 0, c0651sM4963b2.m1667a());
                                    C2230c c2230cM4829a = C2230c.m4829a(c0651s5);
                                    c2375d.f9952d = c2230cM4829a.f9591b;
                                    C0582n c0582n = new C0582n();
                                    c0582n.f2114m = AbstractC0545H.m1364l("video/avc");
                                    c0582n.f2111j = c2230cM4829a.f9601l;
                                    c0582n.f2121t = c2230cM4829a.f9592c;
                                    c0582n.f2122u = c2230cM4829a.f9593d;
                                    c0582n.f2125x = c2230cM4829a.f9600k;
                                    c0582n.f2117p = c2230cM4829a.f9590a;
                                    interfaceC2226E.mo1176e(new C0583o(c0582n));
                                    c2375d.f9953e = true;
                                }
                                z8 = false;
                                if (z8) {
                                    z4 = true;
                                }
                            } else {
                                j5 = -9223372036854775807L;
                            }
                            z4 = false;
                        }
                        if (!this.f9938h && z4) {
                            this.f9938h = true;
                            if (c2374c.f9947b == j5) {
                                j6 = -this.f9943m;
                            } else {
                                j6 = 0;
                            }
                            this.f9939i = j6;
                        }
                        this.f9940j = 4;
                        this.f9937g = 2;
                        if (z3) {
                            return 0;
                        }
                    } else {
                        if (!this.f9944n) {
                            this.f9936f.mo333b(new C2244q(-9223372036854775807L));
                            this.f9944n = true;
                        }
                        C2372a c2372a = this.f9945o;
                        C0651s c0651sM4963b3 = m4963b((C2237j) interfaceC2241n);
                        if (c2372a.f9928b) {
                            c0651sM4963b3.m1666H(1);
                        } else {
                            int iM1687u4 = c0651sM4963b3.m1687u();
                            int i16 = (iM1687u4 >> 4) & 15;
                            c2372a.f9930d = i16;
                            InterfaceC2226E interfaceC2226E2 = (InterfaceC2226E) c2372a.f1360a;
                            if (i16 == 2) {
                                int i17 = C2372a.f9927e[(iM1687u4 >> 2) & 3];
                                C0582n c0582n2 = new C0582n();
                                c0582n2.f2114m = AbstractC0545H.m1364l("audio/mpeg");
                                c0582n2.f2092B = 1;
                                c0582n2.f2093C = i17;
                                interfaceC2226E2.mo1176e(new C0583o(c0582n2));
                                c2372a.f9929c = true;
                            } else if (i16 == 7 || i16 == 8) {
                                String str = i16 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                C0582n c0582n3 = new C0582n();
                                c0582n3.f2114m = AbstractC0545H.m1364l(str);
                                c0582n3.f2092B = 1;
                                c0582n3.f2093C = 8000;
                                interfaceC2226E2.mo1176e(new C0583o(c0582n3));
                                c2372a.f9929c = true;
                            } else if (i16 != 10) {
                                throw new C1947h0("Audio format not supported: " + c2372a.f9930d);
                            }
                            c2372a.f9928b = true;
                        }
                        int i18 = c2372a.f9930d;
                        InterfaceC2226E interfaceC2226E3 = (InterfaceC2226E) c2372a.f1360a;
                        z4 = true;
                        if (i18 == 2) {
                            int iM1667a = c0651sM4963b3.m1667a();
                            interfaceC2226E3.mo1173b(iM1667a, c0651sM4963b3);
                            ((InterfaceC2226E) c2372a.f1360a).mo1172a(j4, 1, iM1667a, 0, null);
                        } else {
                            int iM1687u5 = c0651sM4963b3.m1687u();
                            if (iM1687u5 == 0 && !c2372a.f9929c) {
                                int iM1667a2 = c0651sM4963b3.m1667a();
                                byte[] bArr4 = new byte[iM1667a2];
                                c0651sM4963b3.m1671e(bArr4, 0, iM1667a2);
                                C2228a c2228aM4819n = AbstractC2229b.m4819n(new C0508g(bArr4, iM1667a2), false);
                                C0582n c0582n4 = new C0582n();
                                c0582n4.f2114m = AbstractC0545H.m1364l("audio/mp4a-latm");
                                c0582n4.f2111j = c2228aM4819n.f9562a;
                                c0582n4.f2092B = c2228aM4819n.f9564c;
                                c0582n4.f2093C = c2228aM4819n.f9563b;
                                c0582n4.f2117p = Collections.singletonList(bArr4);
                                interfaceC2226E3.mo1176e(new C0583o(c0582n4));
                                c2372a.f9929c = true;
                            } else if (c2372a.f9930d != 10 || iM1687u5 == 1) {
                                int iM1667a3 = c0651sM4963b3.m1667a();
                                interfaceC2226E3.mo1173b(iM1667a3, c0651sM4963b3);
                                ((InterfaceC2226E) c2372a.f1360a).mo1172a(j4, 1, iM1667a3, 0, null);
                            }
                            z4 = false;
                        }
                        j5 = -9223372036854775807L;
                    }
                    z3 = true;
                    if (!this.f9938h) {
                        this.f9938h = true;
                        if (c2374c.f9947b == j5) {
                            j6 = -this.f9943m;
                        } else {
                            j6 = 0;
                        }
                        this.f9939i = j6;
                    }
                    this.f9940j = 4;
                    this.f9937g = 2;
                    if (z3) {
                        return 0;
                    }
                }
                j4 = j3;
                i3 = this.f9941k;
                if (i3 == 8) {
                    if (i3 == 9) {
                    }
                    j5 = -9223372036854775807L;
                    if (i3 == 18) {
                        ((C2237j) interfaceC2241n).mo335d(this.f9942l);
                        z3 = false;
                    } else {
                        ((C2237j) interfaceC2241n).mo335d(this.f9942l);
                        z3 = false;
                    }
                    z4 = false;
                } else {
                    if (i3 == 9) {
                    }
                    j5 = -9223372036854775807L;
                    if (i3 == 18) {
                        ((C2237j) interfaceC2241n).mo335d(this.f9942l);
                        z3 = false;
                    } else {
                        ((C2237j) interfaceC2241n).mo335d(this.f9942l);
                        z3 = false;
                    }
                    z4 = false;
                }
                if (!this.f9938h) {
                    this.f9938h = true;
                    if (c2374c.f9947b == j5) {
                        j6 = -this.f9943m;
                    } else {
                        j6 = 0;
                    }
                    this.f9939i = j6;
                }
                this.f9940j = 4;
                this.f9937g = 2;
                if (z3) {
                    return 0;
                }
            }
        }
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: f */
    public final boolean mo329f(InterfaceC2241n interfaceC2241n) throws EOFException, InterruptedIOException {
        C0651s c0651s = this.f9931a;
        C2237j c2237j = (C2237j) interfaceC2241n;
        c2237j.mo338i(c0651s.f2520a, 0, 3, false);
        c0651s.m1665G(0);
        if (c0651s.m1690x() == 4607062) {
            c2237j.mo338i(c0651s.f2520a, 0, 2, false);
            c0651s.m1665G(0);
            if ((c0651s.m1659A() & 250) == 0) {
                c2237j.mo338i(c0651s.f2520a, 0, 4, false);
                c0651s.m1665G(0);
                int iM1673g = c0651s.m1673g();
                c2237j.f9631l = 0;
                c2237j.m4831b(iM1673g, false);
                c2237j.mo338i(c0651s.f2520a, 0, 4, false);
                c0651s.m1665G(0);
                if (c0651s.m1673g() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: h */
    public final void mo330h(InterfaceC2242o interfaceC2242o) {
        this.f9936f = interfaceC2242o;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: j */
    public final void mo331j(long j3, long j4) {
        if (j3 == 0) {
            this.f9937g = 1;
            this.f9938h = false;
        } else {
            this.f9937g = 3;
        }
        this.f9940j = 0;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: m */
    public final List mo332m() {
        C1674E c1674e = AbstractC1676G.f7601h;
        return C1692X.f7629k;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: a */
    public final void mo325a() {
    }
}

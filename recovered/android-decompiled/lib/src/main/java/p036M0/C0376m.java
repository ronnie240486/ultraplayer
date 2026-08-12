package p036M0;

import android.support.v4.media.session.C0858A;
import android.util.Pair;
import android.util.SparseArray;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p009D0.C0106b;
import p045P0.AbstractC0462h;
import p045P0.InterfaceC0463i;
import p055T.AbstractC0545H;
import p055T.C0546I;
import p055T.C0578j;
import p055T.C0579k;
import p055T.C0582n;
import p055T.C0583o;
import p055T.C0587s;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p064W.C0656x;
import p067X.AbstractC0684p;
import p067X.C0670b;
import p067X.C0671c;
import p067X.C0687s;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1692X;
import p145s0.AbstractC2229b;
import p145s0.C2236i;
import p145s0.C2237j;
import p145s0.C2244q;
import p145s0.C2247t;
import p145s0.InterfaceC2224C;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2240m;
import p145s0.InterfaceC2241n;
import p145s0.InterfaceC2242o;
import p145s0.InterfaceC2252y;

/* JADX INFO: renamed from: M0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0376m implements InterfaceC2240m {

    /* JADX INFO: renamed from: K */
    public static final byte[] f1212K = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: L */
    public static final C0583o f1213L;

    /* JADX INFO: renamed from: A */
    public C0375l f1214A;

    /* JADX INFO: renamed from: B */
    public int f1215B;

    /* JADX INFO: renamed from: C */
    public int f1216C;

    /* JADX INFO: renamed from: D */
    public int f1217D;

    /* JADX INFO: renamed from: E */
    public boolean f1218E;

    /* JADX INFO: renamed from: F */
    public boolean f1219F;

    /* JADX INFO: renamed from: G */
    public InterfaceC2242o f1220G;

    /* JADX INFO: renamed from: H */
    public InterfaceC2226E[] f1221H;

    /* JADX INFO: renamed from: I */
    public InterfaceC2226E[] f1222I;

    /* JADX INFO: renamed from: J */
    public boolean f1223J;

    /* JADX INFO: renamed from: a */
    public final InterfaceC0463i f1224a;

    /* JADX INFO: renamed from: b */
    public final int f1225b;

    /* JADX INFO: renamed from: c */
    public final List f1226c;

    /* JADX INFO: renamed from: h */
    public final byte[] f1231h;

    /* JADX INFO: renamed from: i */
    public final C0651s f1232i;

    /* JADX INFO: renamed from: j */
    public final C0656x f1233j;

    /* JADX INFO: renamed from: o */
    public final C0687s f1238o;

    /* JADX INFO: renamed from: p */
    public C1692X f1239p;

    /* JADX INFO: renamed from: q */
    public int f1240q;

    /* JADX INFO: renamed from: r */
    public int f1241r;

    /* JADX INFO: renamed from: s */
    public long f1242s;

    /* JADX INFO: renamed from: t */
    public int f1243t;

    /* JADX INFO: renamed from: u */
    public C0651s f1244u;

    /* JADX INFO: renamed from: v */
    public long f1245v;

    /* JADX INFO: renamed from: w */
    public int f1246w;

    /* JADX INFO: renamed from: x */
    public long f1247x;

    /* JADX INFO: renamed from: y */
    public long f1248y;

    /* JADX INFO: renamed from: z */
    public long f1249z;

    /* JADX INFO: renamed from: k */
    public final C0106b f1234k = new C0106b(0);

    /* JADX INFO: renamed from: l */
    public final C0651s f1235l = new C0651s(16);

    /* JADX INFO: renamed from: e */
    public final C0651s f1228e = new C0651s(AbstractC0684p.f2629a);

    /* JADX INFO: renamed from: f */
    public final C0651s f1229f = new C0651s(5);

    /* JADX INFO: renamed from: g */
    public final C0651s f1230g = new C0651s();

    /* JADX INFO: renamed from: m */
    public final ArrayDeque f1236m = new ArrayDeque();

    /* JADX INFO: renamed from: n */
    public final ArrayDeque f1237n = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    public final SparseArray f1227d = new SparseArray();

    static {
        C0582n c0582n = new C0582n();
        c0582n.f2114m = AbstractC0545H.m1364l("application/x-emsg");
        f1213L = new C0583o(c0582n);
    }

    public C0376m(InterfaceC0463i interfaceC0463i, int i3, C0656x c0656x, List list) {
        this.f1224a = interfaceC0463i;
        this.f1225b = i3;
        this.f1233j = c0656x;
        this.f1226c = Collections.unmodifiableList(list);
        byte[] bArr = new byte[16];
        this.f1231h = bArr;
        this.f1232i = new C0651s(bArr);
        C1674E c1674e = AbstractC1676G.f7601h;
        this.f1239p = C1692X.f7629k;
        this.f1248y = -9223372036854775807L;
        this.f1247x = -9223372036854775807L;
        this.f1249z = -9223372036854775807L;
        this.f1220G = InterfaceC2242o.f9641f;
        this.f1221H = new InterfaceC2226E[0];
        this.f1222I = new InterfaceC2226E[0];
        this.f1238o = new C0687s(new C0373j(this));
    }

    /* JADX INFO: renamed from: b */
    public static C0579k m1036b(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i3 = 0; i3 < size; i3++) {
            C0671c c0671c = (C0671c) arrayList.get(i3);
            if (c0671c.f2573h == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = c0671c.f2571i.f2520a;
                C0380q c0380qM1061i = AbstractC0383t.m1061i(bArr);
                UUID uuid = c0380qM1061i == null ? null : (UUID) c0380qM1061i.f1292i;
                if (uuid == null) {
                    AbstractC0646n.m1647y("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new C0578j(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new C0579k(null, false, (C0578j[]) arrayList2.toArray(new C0578j[0]));
    }

    /* JADX INFO: renamed from: d */
    public static void m1037d(C0651s c0651s, int i3, C0386w c0386w) throws C0546I {
        c0651s.m1665G(i3 + 8);
        int iM1673g = c0651s.m1673g();
        byte[] bArr = AbstractC0371h.f1191a;
        if ((iM1673g & 1) != 0) {
            throw C0546I.m1367c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z3 = (iM1673g & 2) != 0;
        int iM1691y = c0651s.m1691y();
        if (iM1691y == 0) {
            Arrays.fill(c0386w.f1330l, 0, c0386w.f1323e, false);
            return;
        }
        if (iM1691y != c0386w.f1323e) {
            throw C0546I.m1365a(null, "Senc sample count " + iM1691y + " is different from fragment sample count" + c0386w.f1323e);
        }
        Arrays.fill(c0386w.f1330l, 0, iM1691y, z3);
        int iM1667a = c0651s.m1667a();
        C0651s c0651s2 = c0386w.f1332n;
        c0651s2.m1662D(iM1667a);
        c0386w.f1329k = true;
        c0386w.f1333o = true;
        c0651s.m1671e(c0651s2.f2520a, 0, c0651s2.f2522c);
        c0651s2.m1665G(0);
        c0386w.f1333o = false;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: c */
    public final InterfaceC2240m mo327c() {
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0259  */
    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: e */
    public final int mo328e(InterfaceC2241n interfaceC2241n, C0587s c0587s) throws C0546I {
        int i3;
        ArrayDeque arrayDeque;
        SparseArray sparseArray;
        C0687s c0687s;
        ArrayDeque arrayDeque2;
        C0656x c0656x;
        C0375l c0375l;
        char c;
        C0375l c0375l2;
        C0656x c0656x2;
        byte[] bArr;
        int i4;
        C0375l c0375l3;
        int iMo1174c;
        String strM1682p;
        String strM1682p2;
        long jM1577R;
        long jM1689w;
        long j3;
        long jM1701a;
        long j4;
        long jM1692z;
        long jM1692z2;
        InterfaceC2241n interfaceC2241n2 = interfaceC2241n;
        while (true) {
            int i5 = 1;
            while (true) {
                i3 = this.f1240q;
                arrayDeque = this.f1236m;
                sparseArray = this.f1227d;
                c0687s = this.f1238o;
                if (i3 != 0) {
                    break;
                }
                int i6 = this.f1243t;
                C0651s c0651s = this.f1235l;
                if (i6 == 0) {
                    if (!((C2237j) interfaceC2241n).mo336f(c0651s.f2520a, 0, 8, true)) {
                        c0687s.m1801c(0);
                        return -1;
                    }
                    this.f1243t = 8;
                    c0651s.m1665G(0);
                    this.f1242s = c0651s.m1689w();
                    this.f1241r = c0651s.m1673g();
                }
                long j5 = this.f1242s;
                if (j5 == 1) {
                    ((C2237j) interfaceC2241n).mo336f(c0651s.f2520a, 8, 8, false);
                    this.f1243t += 8;
                    this.f1242s = c0651s.m1692z();
                } else if (j5 == 0) {
                    long j6 = ((C2237j) interfaceC2241n).f9628i;
                    if (j6 == -1 && !arrayDeque.isEmpty()) {
                        j6 = ((C0670b) arrayDeque.peek()).f2568i;
                    }
                    if (j6 != -1) {
                        this.f1242s = (j6 - ((C2237j) interfaceC2241n).f9629j) + ((long) this.f1243t);
                    }
                }
                long j7 = this.f1242s;
                int i7 = this.f1243t;
                if (j7 < i7) {
                    throw C0546I.m1367c("Atom size less than header length (unsupported).");
                }
                long j8 = ((C2237j) interfaceC2241n).f9629j - ((long) i7);
                int i8 = this.f1241r;
                if ((i8 == 1836019558 || i8 == 1835295092) && !this.f1223J) {
                    this.f1220G.mo333b(new C2244q(this.f1248y, j8));
                    this.f1223J = true;
                }
                if (this.f1241r == 1836019558) {
                    int size = sparseArray.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        C0386w c0386w = ((C0375l) sparseArray.valueAt(i9)).f1201b;
                        c0386w.getClass();
                        c0386w.f1321c = j8;
                        c0386w.f1320b = j8;
                    }
                }
                int i10 = this.f1241r;
                if (i10 == 1835295092) {
                    this.f1214A = null;
                    this.f1245v = j8 + this.f1242s;
                    this.f1240q = 2;
                    i5 = 1;
                } else if (i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227) {
                    i5 = 1;
                    long j9 = (((C2237j) interfaceC2241n).f9629j + this.f1242s) - 8;
                    arrayDeque.push(new C0670b(i10, j9));
                    if (this.f1242s == this.f1243t) {
                        m1038g(j9);
                    } else {
                        this.f1240q = 0;
                        this.f1243t = 0;
                    }
                } else if (i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783) {
                    if (this.f1243t != 8) {
                        throw C0546I.m1367c("Leaf atom defines extended atom size (unsupported).");
                    }
                    if (this.f1242s > 2147483647L) {
                        throw C0546I.m1367c("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    C0651s c0651s2 = new C0651s((int) this.f1242s);
                    System.arraycopy(c0651s.f2520a, 0, c0651s2.f2520a, 0, 8);
                    this.f1244u = c0651s2;
                    i5 = 1;
                    this.f1240q = 1;
                } else {
                    if (this.f1242s > 2147483647L) {
                        throw C0546I.m1367c("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.f1244u = null;
                    i5 = 1;
                    this.f1240q = 1;
                }
                interfaceC2241n2 = interfaceC2241n;
            }
            arrayDeque2 = this.f1237n;
            c0656x = this.f1233j;
            if (i3 != i5) {
                long j10 = Long.MAX_VALUE;
                if (i3 != 2) {
                    c0375l = this.f1214A;
                    if (c0375l != null) {
                        c = 2;
                        break;
                    }
                    int size2 = sparseArray.size();
                    C0375l c0375l4 = null;
                    c = 2;
                    for (int i11 = 0; i11 < size2; i11++) {
                        C0375l c0375l5 = (C0375l) sparseArray.valueAt(i11);
                        boolean z3 = c0375l5.f1211l;
                        if (z3 || c0375l5.f1205f != c0375l5.f1203d.f1337b) {
                            C0386w c0386w2 = c0375l5.f1201b;
                            if (!z3 || c0375l5.f1207h != c0386w2.f1322d) {
                                long j11 = !z3 ? c0375l5.f1203d.f1338c[c0375l5.f1205f] : c0386w2.f1324f[c0375l5.f1207h];
                                if (j11 < j10) {
                                    c0375l4 = c0375l5;
                                    j10 = j11;
                                }
                            }
                        }
                    }
                    if (c0375l4 != null) {
                        int i12 = (int) ((!c0375l4.f1211l ? c0375l4.f1203d.f1338c[c0375l4.f1205f] : c0375l4.f1201b.f1324f[c0375l4.f1207h]) - ((C2237j) interfaceC2241n2).f9629j);
                        if (i12 < 0) {
                            AbstractC0646n.m1647y("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            i12 = 0;
                        }
                        ((C2237j) interfaceC2241n2).mo335d(i12);
                        this.f1214A = c0375l4;
                        c0375l = c0375l4;
                        break;
                    }
                    int i13 = (int) (this.f1245v - ((C2237j) interfaceC2241n2).f9629j);
                    if (i13 < 0) {
                        throw C0546I.m1365a(null, "Offset to end of mdat was negative.");
                    }
                    ((C2237j) interfaceC2241n2).mo335d(i13);
                    this.f1240q = 0;
                    this.f1243t = 0;
                } else {
                    int size3 = sparseArray.size();
                    C0375l c0375l6 = null;
                    for (int i14 = 0; i14 < size3; i14++) {
                        C0386w c0386w3 = ((C0375l) sparseArray.valueAt(i14)).f1201b;
                        if (c0386w3.f1333o) {
                            long j12 = c0386w3.f1321c;
                            if (j12 < j10) {
                                c0375l6 = (C0375l) sparseArray.valueAt(i14);
                                j10 = j12;
                            }
                        }
                    }
                    if (c0375l6 == null) {
                        this.f1240q = 3;
                    } else {
                        int i15 = (int) (j10 - ((C2237j) interfaceC2241n2).f9629j);
                        if (i15 < 0) {
                            throw C0546I.m1365a(null, "Offset to encryption data was negative.");
                        }
                        C2237j c2237j = (C2237j) interfaceC2241n2;
                        c2237j.mo335d(i15);
                        C0386w c0386w4 = c0375l6.f1201b;
                        C0651s c0651s3 = c0386w4.f1332n;
                        c2237j.mo336f(c0651s3.f2520a, 0, c0651s3.f2522c, false);
                        c0651s3.m1665G(0);
                        c0386w4.f1333o = false;
                    }
                }
            } else {
                int i16 = ((int) this.f1242s) - this.f1243t;
                C0651s c0651s4 = this.f1244u;
                if (c0651s4 != null) {
                    ((C2237j) interfaceC2241n2).mo336f(c0651s4.f2520a, 8, i16, false);
                    int i17 = this.f1241r;
                    C0671c c0671c = new C0671c(i17, c0651s4);
                    long j13 = ((C2237j) interfaceC2241n2).f9629j;
                    if (!arrayDeque.isEmpty()) {
                        ((C0670b) arrayDeque.peek()).f2569j.add(c0671c);
                    } else if (i17 == 1936286840) {
                        c0651s4.m1665G(8);
                        int iM1025c = AbstractC0371h.m1025c(c0651s4.m1673g());
                        c0651s4.m1666H(4);
                        long jM1689w2 = c0651s4.m1689w();
                        if (iM1025c == 0) {
                            jM1692z = c0651s4.m1689w();
                            jM1692z2 = c0651s4.m1689w();
                        } else {
                            jM1692z = c0651s4.m1692z();
                            jM1692z2 = c0651s4.m1692z();
                        }
                        long j14 = jM1692z2 + j13;
                        long j15 = jM1692z;
                        int i18 = AbstractC0632A.f2454a;
                        long jM1577R2 = AbstractC0632A.m1577R(j15, 1000000L, jM1689w2, RoundingMode.DOWN);
                        c0651s4.m1666H(2);
                        int iM1659A = c0651s4.m1659A();
                        int[] iArr = new int[iM1659A];
                        long[] jArr = new long[iM1659A];
                        long[] jArr2 = new long[iM1659A];
                        long[] jArr3 = new long[iM1659A];
                        long jM1577R3 = jM1577R2;
                        long j16 = j14;
                        int i19 = 0;
                        while (i19 < iM1659A) {
                            int iM1673g = c0651s4.m1673g();
                            if ((Integer.MIN_VALUE & iM1673g) != 0) {
                                throw C0546I.m1365a(null, "Unhandled indirect reference");
                            }
                            long jM1689w3 = c0651s4.m1689w();
                            iArr[i19] = iM1673g & Integer.MAX_VALUE;
                            jArr[i19] = j16;
                            jArr3[i19] = jM1577R3;
                            j15 += jM1689w3;
                            long[] jArr4 = jArr3;
                            jM1577R3 = AbstractC0632A.m1577R(j15, 1000000L, jM1689w2, RoundingMode.DOWN);
                            jArr2[i19] = jM1577R3 - jArr4[i19];
                            c0651s4.m1666H(4);
                            j16 += (long) iArr[i19];
                            i19++;
                            jArr3 = jArr4;
                        }
                        Pair pairCreate = Pair.create(Long.valueOf(jM1577R2), new C2236i(iArr, jArr, jArr2, jArr3));
                        this.f1249z = ((Long) pairCreate.first).longValue();
                        this.f1220G.mo333b((InterfaceC2252y) pairCreate.second);
                        this.f1223J = true;
                    } else if (i17 == 1701671783 && this.f1221H.length != 0) {
                        c0651s4.m1665G(8);
                        int iM1025c2 = AbstractC0371h.m1025c(c0651s4.m1673g());
                        if (iM1025c2 == 0) {
                            strM1682p = c0651s4.m1682p();
                            strM1682p.getClass();
                            strM1682p2 = c0651s4.m1682p();
                            strM1682p2.getClass();
                            long jM1689w4 = c0651s4.m1689w();
                            long jM1689w5 = c0651s4.m1689w();
                            RoundingMode roundingMode = RoundingMode.DOWN;
                            long jM1577R4 = AbstractC0632A.m1577R(jM1689w5, 1000000L, jM1689w4, roundingMode);
                            long j17 = this.f1249z;
                            long j18 = j17 != -9223372036854775807L ? j17 + jM1577R4 : -9223372036854775807L;
                            jM1577R = AbstractC0632A.m1577R(c0651s4.m1689w(), 1000L, jM1689w4, roundingMode);
                            jM1689w = c0651s4.m1689w();
                            long j19 = j18;
                            j3 = jM1577R4;
                            jM1701a = j19;
                            j4 = -9223372036854775807L;
                        } else if (iM1025c2 != 1) {
                            AbstractC0462h.m1170j("Skipping unsupported emsg version: ", "FragmentedMp4Extractor", iM1025c2);
                        } else {
                            long jM1689w6 = c0651s4.m1689w();
                            long jM1692z3 = c0651s4.m1692z();
                            RoundingMode roundingMode2 = RoundingMode.DOWN;
                            jM1701a = AbstractC0632A.m1577R(jM1692z3, 1000000L, jM1689w6, roundingMode2);
                            long jM1577R5 = AbstractC0632A.m1577R(c0651s4.m1689w(), 1000L, jM1689w6, roundingMode2);
                            long jM1689w7 = c0651s4.m1689w();
                            strM1682p = c0651s4.m1682p();
                            strM1682p.getClass();
                            strM1682p2 = c0651s4.m1682p();
                            strM1682p2.getClass();
                            j4 = -9223372036854775807L;
                            jM1689w = jM1689w7;
                            jM1577R = jM1577R5;
                            j3 = -9223372036854775807L;
                        }
                        byte[] bArr2 = new byte[c0651s4.m1667a()];
                        c0651s4.m1671e(bArr2, 0, c0651s4.m1667a());
                        C0106b c0106b = this.f1234k;
                        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) c0106b.f140h;
                        byteArrayOutputStream.reset();
                        DataOutputStream dataOutputStream = (DataOutputStream) c0106b.f141i;
                        try {
                            dataOutputStream.writeBytes(strM1682p);
                            dataOutputStream.writeByte(0);
                            dataOutputStream.writeBytes(strM1682p2);
                            dataOutputStream.writeByte(0);
                            dataOutputStream.writeLong(jM1577R);
                            dataOutputStream.writeLong(jM1689w);
                            dataOutputStream.write(bArr2);
                            dataOutputStream.flush();
                            C0651s c0651s5 = new C0651s(byteArrayOutputStream.toByteArray());
                            int iM1667a = c0651s5.m1667a();
                            for (InterfaceC2226E interfaceC2226E : this.f1221H) {
                                c0651s5.m1665G(0);
                                interfaceC2226E.mo1173b(iM1667a, c0651s5);
                            }
                            if (jM1701a == j4) {
                                arrayDeque2.addLast(new C0374k(iM1667a, j3, true));
                                this.f1246w += iM1667a;
                            } else if (!arrayDeque2.isEmpty()) {
                                arrayDeque2.addLast(new C0374k(iM1667a, jM1701a, false));
                                this.f1246w += iM1667a;
                            } else if (c0656x == null || c0656x.m1706f()) {
                                if (c0656x != null) {
                                    jM1701a = c0656x.m1701a(jM1701a);
                                }
                                long j20 = jM1701a;
                                for (InterfaceC2226E interfaceC2226E2 : this.f1221H) {
                                    interfaceC2226E2.mo1172a(j20, 1, iM1667a, 0, null);
                                }
                            } else {
                                arrayDeque2.addLast(new C0374k(iM1667a, jM1701a, false));
                                this.f1246w += iM1667a;
                            }
                        } catch (IOException e3) {
                            throw new RuntimeException(e3);
                        }
                    }
                } else {
                    ((C2237j) interfaceC2241n).mo335d(i16);
                }
                m1038g(((C2237j) interfaceC2241n).f9629j);
                interfaceC2241n2 = interfaceC2241n;
            }
        }
        int i20 = this.f1240q;
        int i21 = this.f1225b;
        C0386w c0386w5 = c0375l.f1201b;
        if (i20 == 3) {
            this.f1215B = !c0375l.f1211l ? c0375l.f1203d.f1339d[c0375l.f1205f] : c0386w5.f1326h[c0375l.f1205f];
            this.f1218E = (i21 & 64) == 0 || !Objects.equals(c0375l.f1203d.f1336a.f1308g.f2154n, "video/avc");
            if (c0375l.f1205f < c0375l.f1208i) {
                ((C2237j) interfaceC2241n2).mo335d(this.f1215B);
                C0385v c0385vM1032b = c0375l.m1032b();
                if (c0385vM1032b != null) {
                    C0651s c0651s6 = c0386w5.f1332n;
                    int i22 = c0385vM1032b.f1317d;
                    if (i22 != 0) {
                        c0651s6.m1666H(i22);
                    }
                    int i23 = c0375l.f1205f;
                    if (c0386w5.f1329k && c0386w5.f1330l[i23]) {
                        c0651s6.m1666H(c0651s6.m1659A() * 6);
                    }
                }
                if (!c0375l.m1033c()) {
                    this.f1214A = null;
                }
                this.f1240q = 3;
                return 0;
            }
            if (c0375l.f1203d.f1336a.f1309h == 1) {
                this.f1215B -= 8;
                ((C2237j) interfaceC2241n2).mo335d(8);
            }
            if ("audio/ac4".equals(c0375l.f1203d.f1336a.f1308g.f2154n)) {
                this.f1216C = c0375l.m1034d(this.f1215B, 7);
                int i24 = this.f1215B;
                C0651s c0651s7 = this.f1232i;
                AbstractC2229b.m4812g(i24, c0651s7);
                c0375l.f1200a.mo1173b(7, c0651s7);
                this.f1216C += 7;
            } else {
                this.f1216C = c0375l.m1034d(this.f1215B, 0);
            }
            this.f1215B += this.f1216C;
            this.f1240q = 4;
            this.f1217D = 0;
        }
        C0387x c0387x = c0375l.f1203d;
        long jM1701a2 = c0375l.f1211l ? c0386w5.f1327i[c0375l.f1205f] : c0387x.f1341f[c0375l.f1205f];
        if (c0656x != null) {
            jM1701a2 = c0656x.m1701a(jM1701a2);
        }
        C0384u c0384u = c0387x.f1336a;
        int i25 = c0384u.f1312k;
        InterfaceC2226E interfaceC2226E3 = c0375l.f1200a;
        if (i25 == 0) {
            c0375l2 = c0375l;
            arrayDeque2 = arrayDeque2;
            c0656x2 = c0656x;
            while (true) {
                int i26 = this.f1216C;
                int i27 = this.f1215B;
                if (i26 >= i27) {
                    break;
                }
                this.f1216C += interfaceC2226E3.mo1174c(interfaceC2241n2, i27 - i26, false);
            }
        } else {
            C0651s c0651s8 = this.f1229f;
            byte[] bArr3 = c0651s8.f2520a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[c] = 0;
            int i28 = i25 + 1;
            int i29 = 4 - i25;
            while (true) {
                arrayDeque2 = arrayDeque2;
                if (this.f1216C >= this.f1215B) {
                    c0375l2 = c0375l;
                    c0656x2 = c0656x;
                    break;
                }
                int i30 = this.f1217D;
                c0656x = c0656x;
                C0583o c0583o = c0384u.f1308g;
                if (i30 == 0) {
                    C0384u c0384u2 = c0384u;
                    ((C2237j) interfaceC2241n2).mo336f(bArr3, i29, i28, false);
                    c0651s8.m1665G(0);
                    int iM1673g2 = c0651s8.m1673g();
                    if (iM1673g2 < 1) {
                        throw C0546I.m1365a(null, "Invalid NAL length");
                    }
                    this.f1217D = iM1673g2 - 1;
                    C0651s c0651s9 = this.f1228e;
                    c0651s9.m1665G(0);
                    interfaceC2226E3.mo1173b(4, c0651s9);
                    interfaceC2226E3.mo1173b(1, c0651s8);
                    if (this.f1222I.length > 0) {
                        byte b3 = bArr3[4];
                        boolean zEquals = Objects.equals(c0583o.f2154n, "video/avc");
                        String str = c0583o.f2151k;
                        if (zEquals || AbstractC0545H.m1353a(str, "video/avc") != null) {
                            bArr = bArr3;
                            i4 = i28;
                            if ((b3 & 31) != 6) {
                            }
                            this.f1219F = z;
                            this.f1216C += 5;
                            this.f1215B += i29;
                            if (!this.f1218E && Objects.equals(c0375l.f1203d.f1336a.f1308g.f2154n, "video/avc") && AbstractC0684p.m1790c(bArr[4])) {
                                this.f1218E = true;
                            }
                            i28 = i4;
                            c0384u = c0384u2;
                            bArr3 = bArr;
                        } else {
                            bArr = bArr3;
                            i4 = i28;
                        }
                        boolean z4 = (Objects.equals(c0583o.f2154n, "video/hevc") || AbstractC0545H.m1353a(str, "video/hevc") != null) && ((b3 & 126) >> 1) == 39;
                        this.f1219F = z4;
                        this.f1216C += 5;
                        this.f1215B += i29;
                        if (!this.f1218E) {
                            this.f1218E = true;
                        }
                        i28 = i4;
                        c0384u = c0384u2;
                        bArr3 = bArr;
                    } else {
                        bArr = bArr3;
                        i4 = i28;
                    }
                    this.f1219F = z4;
                    this.f1216C += 5;
                    this.f1215B += i29;
                    if (!this.f1218E) {
                        this.f1218E = true;
                    }
                    i28 = i4;
                    c0384u = c0384u2;
                    bArr3 = bArr;
                } else {
                    C0384u c0384u3 = c0384u;
                    byte[] bArr4 = bArr3;
                    int i31 = i28;
                    if (this.f1219F) {
                        C0651s c0651s10 = this.f1230g;
                        c0651s10.m1662D(i30);
                        c0375l3 = c0375l;
                        ((C2237j) interfaceC2241n2).mo336f(c0651s10.f2520a, 0, this.f1217D, false);
                        interfaceC2226E3.mo1173b(this.f1217D, c0651s10);
                        iMo1174c = this.f1217D;
                        int iM1798k = AbstractC0684p.m1798k(c0651s10.f2520a, c0651s10.f2522c);
                        c0651s10.m1665G((Objects.equals(c0583o.f2154n, "video/hevc") || AbstractC0545H.m1353a(c0583o.f2151k, "video/hevc") != null) ? 1 : 0);
                        c0651s10.m1664F(iM1798k);
                        int i32 = c0583o.f2156p;
                        if (i32 == -1) {
                            if (c0687s.f2635a != 0) {
                                c0687s.f2635a = 0;
                                c0687s.m1801c(0);
                            }
                        } else if (c0687s.f2635a != i32) {
                            AbstractC0646n.m1630h(i32 >= 0);
                            c0687s.f2635a = i32;
                            c0687s.m1801c(i32);
                        }
                        c0687s.m1799a(jM1701a2, c0651s10);
                        if ((c0375l3.m1031a() & 4) != 0) {
                            c0687s.m1801c(0);
                        }
                    } else {
                        c0375l3 = c0375l;
                        iMo1174c = interfaceC2226E3.mo1174c(interfaceC2241n2, i30, false);
                    }
                    this.f1216C += iMo1174c;
                    this.f1217D -= iMo1174c;
                    i28 = i31;
                    c0384u = c0384u3;
                    bArr3 = bArr4;
                    c0375l = c0375l3;
                }
            }
        }
        int iM1031a = c0375l2.m1031a();
        if ((i21 & 64) != 0 && !this.f1218E) {
            iM1031a |= 67108864;
        }
        int i33 = iM1031a;
        C0385v c0385vM1032b2 = c0375l2.m1032b();
        long j21 = jM1701a2;
        interfaceC2226E3.mo1172a(j21, i33, this.f1215B, 0, c0385vM1032b2 != null ? c0385vM1032b2.f1316c : null);
        while (!arrayDeque2.isEmpty()) {
            C0374k c0374k = (C0374k) arrayDeque2.removeFirst();
            this.f1246w -= c0374k.f1199c;
            boolean z5 = c0374k.f1198b;
            long jM1701a3 = c0374k.f1197a;
            if (z5) {
                jM1701a3 += j21;
            }
            C0656x c0656x3 = c0656x2;
            if (c0656x2 != null) {
                jM1701a3 = c0656x3.m1701a(jM1701a3);
            }
            long j22 = jM1701a3;
            for (InterfaceC2226E interfaceC2226E4 : this.f1221H) {
                interfaceC2226E4.mo1172a(j22, 1, c0374k.f1199c, this.f1246w, null);
            }
            c0656x2 = c0656x3;
        }
        if (!c0375l2.m1033c()) {
            this.f1214A = null;
        }
        this.f1240q = 3;
        return 0;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: f */
    public final boolean mo329f(InterfaceC2241n interfaceC2241n) {
        C1692X c1692xM4120r;
        InterfaceC2224C interfaceC2224CM1064l = AbstractC0383t.m1064l(interfaceC2241n, true, false);
        if (interfaceC2224CM1064l != null) {
            c1692xM4120r = AbstractC1676G.m4120r(interfaceC2224CM1064l);
        } else {
            C1674E c1674e = AbstractC1676G.f7601h;
            c1692xM4120r = C1692X.f7629k;
        }
        this.f1239p = c1692xM4120r;
        return interfaceC2224CM1064l == null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02b8  */
    /* JADX INFO: renamed from: g */
    public final void m1038g(long j3) throws C0546I {
        C0372i c0372i;
        C0372i c0372i2;
        ArrayList arrayList;
        int i3;
        int i4;
        ArrayList arrayList2;
        int i5;
        int i6;
        boolean z3;
        boolean z4;
        long[] jArr;
        while (true) {
            ArrayDeque arrayDeque = this.f1236m;
            if (arrayDeque.isEmpty() || ((C0670b) arrayDeque.peek()).f2568i != j3) {
                break;
            }
            C0670b c0670b = (C0670b) arrayDeque.pop();
            int i7 = c0670b.f2573h;
            SparseArray sparseArray = this.f1227d;
            ArrayList arrayList3 = c0670b.f2569j;
            int i8 = this.f1225b;
            int i9 = 12;
            if (i7 == 1836019574) {
                C0579k c0579kM1036b = m1036b(arrayList3);
                C0670b c0670bM1783e = c0670b.m1783e(1836475768);
                c0670bM1783e.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList4 = c0670bM1783e.f2569j;
                int size = arrayList4.size();
                long jM1689w = -9223372036854775807L;
                int i10 = 0;
                while (i10 < size) {
                    C0671c c0671c = (C0671c) arrayList4.get(i10);
                    int i11 = c0671c.f2573h;
                    C0651s c0651s = c0671c.f2571i;
                    if (i11 == 1953654136) {
                        c0651s.m1665G(i9);
                        Pair pairCreate = Pair.create(Integer.valueOf(c0651s.m1673g()), new C0372i(c0651s.m1673g() - 1, c0651s.m1673g(), c0651s.m1673g(), c0651s.m1673g()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (C0372i) pairCreate.second);
                    } else {
                        if (i11 == 1835362404) {
                            c0651s.m1665G(8);
                            jM1689w = AbstractC0371h.m1025c(c0651s.m1673g()) == 0 ? c0651s.m1689w() : c0651s.m1692z();
                        }
                        i10++;
                        i9 = 12;
                    }
                    jM1689w = jM1689w;
                    i10++;
                    i9 = 12;
                }
                ArrayList arrayListM1029g = AbstractC0371h.m1029g(c0670b, new C2247t(), jM1689w, c0579kM1036b, (i8 & 16) != 0, false, new C0373j(this));
                int size2 = arrayListM1029g.size();
                if (sparseArray.size() == 0) {
                    for (int i12 = 0; i12 < size2; i12++) {
                        C0387x c0387x = (C0387x) arrayListM1029g.get(i12);
                        C0384u c0384u = c0387x.f1336a;
                        InterfaceC2226E interfaceC2226EMo344p = this.f1220G.mo344p(i12, c0384u.f1303b);
                        int size3 = sparseArray2.size();
                        int i13 = c0384u.f1302a;
                        if (size3 == 1) {
                            c0372i2 = (C0372i) sparseArray2.valueAt(0);
                        } else {
                            c0372i2 = (C0372i) sparseArray2.get(i13);
                            c0372i2.getClass();
                        }
                        sparseArray.put(i13, new C0375l(interfaceC2226EMo344p, c0387x, c0372i2));
                        this.f1248y = Math.max(this.f1248y, c0384u.f1306e);
                    }
                    this.f1220G.mo341l();
                } else {
                    AbstractC0646n.m1630h(sparseArray.size() == size2);
                    for (int i14 = 0; i14 < size2; i14++) {
                        C0387x c0387x2 = (C0387x) arrayListM1029g.get(i14);
                        C0384u c0384u2 = c0387x2.f1336a;
                        C0375l c0375l = (C0375l) sparseArray.get(c0384u2.f1302a);
                        if (sparseArray2.size() == 1) {
                            c0372i = (C0372i) sparseArray2.valueAt(0);
                        } else {
                            c0372i = (C0372i) sparseArray2.get(c0384u2.f1302a);
                            c0372i.getClass();
                        }
                        c0375l.f1203d = c0387x2;
                        c0375l.f1204e = c0372i;
                        c0375l.f1200a.mo1176e(c0387x2.f1336a.f1308g);
                        c0375l.m1035e();
                    }
                }
            } else if (i7 == 1836019558) {
                ArrayList arrayList5 = c0670b.f2570k;
                int size4 = arrayList5.size();
                int i15 = 0;
                while (i15 < size4) {
                    C0670b c0670b2 = (C0670b) arrayList5.get(i15);
                    if (c0670b2.f2573h == 1953653094) {
                        C0671c c0671cM1784f = c0670b2.m1784f(1952868452);
                        c0671cM1784f.getClass();
                        C0651s c0651s2 = c0671cM1784f.f2571i;
                        c0651s2.m1665G(8);
                        int iM1673g = c0651s2.m1673g();
                        byte[] bArr = AbstractC0371h.f1191a;
                        C0375l c0375l2 = (C0375l) sparseArray.get(c0651s2.m1673g());
                        if (c0375l2 == null) {
                            c0375l2 = null;
                        } else {
                            int i16 = iM1673g & 1;
                            C0386w c0386w = c0375l2.f1201b;
                            if (i16 != 0) {
                                long jM1692z = c0651s2.m1692z();
                                c0386w.f1320b = jM1692z;
                                c0386w.f1321c = jM1692z;
                            }
                            C0372i c0372i3 = c0375l2.f1204e;
                            c0386w.f1319a = new C0372i((iM1673g & 2) != 0 ? c0651s2.m1673g() - 1 : c0372i3.f1192a, (iM1673g & 8) != 0 ? c0651s2.m1673g() : c0372i3.f1193b, (iM1673g & 16) != 0 ? c0651s2.m1673g() : c0372i3.f1194c, (iM1673g & 32) != 0 ? c0651s2.m1673g() : c0372i3.f1195d);
                        }
                        if (c0375l2 != null) {
                            C0386w c0386w2 = c0375l2.f1201b;
                            long j4 = c0386w2.f1334p;
                            boolean z5 = c0386w2.f1335q;
                            c0375l2.m1035e();
                            c0375l2.f1211l = true;
                            C0671c c0671cM1784f2 = c0670b2.m1784f(1952867444);
                            if (c0671cM1784f2 == null || (i8 & 2) != 0) {
                                c0386w2.f1334p = j4;
                                c0386w2.f1335q = z5;
                            } else {
                                C0651s c0651s3 = c0671cM1784f2.f2571i;
                                c0651s3.m1665G(8);
                                c0386w2.f1334p = AbstractC0371h.m1025c(c0651s3.m1673g()) == 1 ? c0651s3.m1692z() : c0651s3.m1689w();
                                c0386w2.f1335q = true;
                            }
                            ArrayList arrayList6 = c0670b2.f2569j;
                            int size5 = arrayList6.size();
                            int i17 = 0;
                            int i18 = 0;
                            int i19 = 0;
                            while (true) {
                                i5 = 1953658222;
                                if (i17 >= size5) {
                                    break;
                                }
                                ArrayList arrayList7 = arrayList5;
                                C0671c c0671c2 = (C0671c) arrayList6.get(i17);
                                int i20 = size4;
                                if (c0671c2.f2573h == 1953658222) {
                                    C0651s c0651s4 = c0671c2.f2571i;
                                    c0651s4.m1665G(12);
                                    int iM1691y = c0651s4.m1691y();
                                    if (iM1691y > 0) {
                                        i19 += iM1691y;
                                        i18++;
                                    }
                                }
                                i17++;
                                size4 = i20;
                                arrayList5 = arrayList7;
                            }
                            arrayList = arrayList5;
                            i3 = size4;
                            c0375l2.f1207h = 0;
                            c0375l2.f1206g = 0;
                            c0375l2.f1205f = 0;
                            c0386w2.f1322d = i18;
                            c0386w2.f1323e = i19;
                            if (c0386w2.f1325g.length < i18) {
                                c0386w2.f1324f = new long[i18];
                                c0386w2.f1325g = new int[i18];
                            }
                            if (c0386w2.f1326h.length < i19) {
                                int i21 = (i19 * 125) / 100;
                                c0386w2.f1326h = new int[i21];
                                c0386w2.f1327i = new long[i21];
                                c0386w2.f1328j = new boolean[i21];
                                c0386w2.f1330l = new boolean[i21];
                            }
                            int i22 = 0;
                            int i23 = 0;
                            int i24 = 0;
                            while (true) {
                                long j5 = 0;
                                if (i22 >= size5) {
                                    i4 = i15;
                                    arrayList2 = arrayList3;
                                    C0387x c0387x3 = c0375l2.f1203d;
                                    C0372i c0372i4 = c0386w2.f1319a;
                                    c0372i4.getClass();
                                    C0385v c0385v = c0387x3.f1336a.f1313l[c0372i4.f1192a];
                                    C0671c c0671cM1784f3 = c0670b2.m1784f(1935763834);
                                    if (c0671cM1784f3 != null) {
                                        c0385v.getClass();
                                        C0651s c0651s5 = c0671cM1784f3.f2571i;
                                        c0651s5.m1665G(8);
                                        int iM1673g2 = c0651s5.m1673g();
                                        byte[] bArr2 = AbstractC0371h.f1191a;
                                        if ((iM1673g2 & 1) == 1) {
                                            c0651s5.m1666H(8);
                                        }
                                        int iM1687u = c0651s5.m1687u();
                                        int iM1691y2 = c0651s5.m1691y();
                                        if (iM1691y2 > c0386w2.f1323e) {
                                            throw C0546I.m1365a(null, "Saiz sample count " + iM1691y2 + " is greater than fragment sample count" + c0386w2.f1323e);
                                        }
                                        int i25 = c0385v.f1317d;
                                        if (iM1687u == 0) {
                                            boolean[] zArr = c0386w2.f1330l;
                                            i6 = 0;
                                            for (int i26 = 0; i26 < iM1691y2; i26++) {
                                                int iM1687u2 = c0651s5.m1687u();
                                                i6 += iM1687u2;
                                                zArr[i26] = iM1687u2 > i25;
                                            }
                                            z3 = false;
                                        } else {
                                            i6 = iM1687u * iM1691y2;
                                            z3 = false;
                                            Arrays.fill(c0386w2.f1330l, 0, iM1691y2, iM1687u > i25);
                                        }
                                        Arrays.fill(c0386w2.f1330l, iM1691y2, c0386w2.f1323e, z3);
                                        if (i6 > 0) {
                                            c0386w2.f1332n.m1662D(i6);
                                            c0386w2.f1329k = true;
                                            c0386w2.f1333o = true;
                                        }
                                    }
                                    C0671c c0671cM1784f4 = c0670b2.m1784f(1935763823);
                                    if (c0671cM1784f4 != null) {
                                        C0651s c0651s6 = c0671cM1784f4.f2571i;
                                        c0651s6.m1665G(8);
                                        int iM1673g3 = c0651s6.m1673g();
                                        byte[] bArr3 = AbstractC0371h.f1191a;
                                        if ((iM1673g3 & 1) == 1) {
                                            c0651s6.m1666H(8);
                                        }
                                        int iM1691y3 = c0651s6.m1691y();
                                        if (iM1691y3 != 1) {
                                            throw C0546I.m1365a(null, "Unexpected saio entry count: " + iM1691y3);
                                        }
                                        c0386w2.f1321c += AbstractC0371h.m1025c(iM1673g3) == 0 ? c0651s6.m1689w() : c0651s6.m1692z();
                                    }
                                    byte[] bArr4 = null;
                                    C0671c c0671cM1784f5 = c0670b2.m1784f(1936027235);
                                    if (c0671cM1784f5 != null) {
                                        m1037d(c0671cM1784f5.f2571i, 0, c0386w2);
                                    }
                                    String str = c0385v != null ? c0385v.f1315b : null;
                                    C0651s c0651s7 = null;
                                    C0651s c0651s8 = null;
                                    for (int i27 = 0; i27 < arrayList6.size(); i27++) {
                                        C0671c c0671c3 = (C0671c) arrayList6.get(i27);
                                        C0651s c0651s9 = c0671c3.f2571i;
                                        int i28 = c0671c3.f2573h;
                                        if (i28 == 1935828848) {
                                            c0651s9.m1665G(12);
                                            if (c0651s9.m1673g() == 1936025959) {
                                                c0651s7 = c0651s9;
                                            }
                                        } else if (i28 == 1936158820) {
                                            c0651s9.m1665G(12);
                                            if (c0651s9.m1673g() == 1936025959) {
                                                c0651s8 = c0651s9;
                                            }
                                        }
                                    }
                                    if (c0651s7 != null && c0651s8 != null) {
                                        c0651s7.m1665G(8);
                                        int iM1025c = AbstractC0371h.m1025c(c0651s7.m1673g());
                                        c0651s7.m1666H(4);
                                        if (iM1025c == 1) {
                                            c0651s7.m1666H(4);
                                        }
                                        if (c0651s7.m1673g() != 1) {
                                            throw C0546I.m1367c("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        c0651s8.m1665G(8);
                                        int iM1025c2 = AbstractC0371h.m1025c(c0651s8.m1673g());
                                        c0651s8.m1666H(4);
                                        if (iM1025c2 == 1) {
                                            if (c0651s8.m1689w() == 0) {
                                                throw C0546I.m1367c("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (iM1025c2 >= 2) {
                                            c0651s8.m1666H(4);
                                        }
                                        if (c0651s8.m1689w() != 1) {
                                            throw C0546I.m1367c("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        c0651s8.m1666H(1);
                                        int iM1687u3 = c0651s8.m1687u();
                                        int i29 = (iM1687u3 & 240) >> 4;
                                        int i30 = iM1687u3 & 15;
                                        boolean z6 = c0651s8.m1687u() == 1;
                                        if (z6) {
                                            int iM1687u4 = c0651s8.m1687u();
                                            byte[] bArr5 = new byte[16];
                                            c0651s8.m1671e(bArr5, 0, 16);
                                            if (iM1687u4 == 0) {
                                                int iM1687u5 = c0651s8.m1687u();
                                                bArr4 = new byte[iM1687u5];
                                                c0651s8.m1671e(bArr4, 0, iM1687u5);
                                            }
                                            c0386w2.f1329k = true;
                                            c0386w2.f1331m = new C0385v(z6, str, iM1687u4, bArr5, i29, i30, bArr4);
                                        }
                                    }
                                    int size6 = arrayList6.size();
                                    for (int i31 = 0; i31 < size6; i31++) {
                                        C0671c c0671c4 = (C0671c) arrayList6.get(i31);
                                        if (c0671c4.f2573h == 1970628964) {
                                            C0651s c0651s10 = c0671c4.f2571i;
                                            c0651s10.m1665G(8);
                                            byte[] bArr6 = this.f1231h;
                                            c0651s10.m1671e(bArr6, 0, 16);
                                            if (Arrays.equals(bArr6, f1212K)) {
                                                m1037d(c0651s10, 16, c0386w2);
                                            }
                                        }
                                    }
                                    break;
                                }
                                C0671c c0671c5 = (C0671c) arrayList6.get(i22);
                                if (c0671c5.f2573h == i5) {
                                    int i32 = i23 + 1;
                                    C0651s c0651s11 = c0671c5.f2571i;
                                    c0651s11.m1665G(8);
                                    int iM1673g4 = c0651s11.m1673g();
                                    byte[] bArr7 = AbstractC0371h.f1191a;
                                    C0387x c0387x4 = c0375l2.f1203d;
                                    int i33 = i23;
                                    C0372i c0372i5 = c0386w2.f1319a;
                                    int i34 = AbstractC0632A.f2454a;
                                    c0386w2.f1325g[i33] = c0651s11.m1691y();
                                    long[] jArr2 = c0386w2.f1324f;
                                    int i35 = i24;
                                    long j6 = c0386w2.f1320b;
                                    jArr2[i33] = j6;
                                    if ((iM1673g4 & 1) != 0) {
                                        jArr2[i33] = j6 + ((long) c0651s11.m1673g());
                                    }
                                    boolean z7 = (iM1673g4 & 4) != 0;
                                    int iM1673g5 = c0372i5.f1195d;
                                    if (z7) {
                                        iM1673g5 = c0651s11.m1673g();
                                    }
                                    boolean z8 = (iM1673g4 & 256) != 0;
                                    boolean z9 = z7;
                                    boolean z10 = (iM1673g4 & 512) != 0;
                                    boolean z11 = (iM1673g4 & 1024) != 0;
                                    boolean z12 = (iM1673g4 & 2048) != 0;
                                    C0384u c0384u3 = c0387x4.f1336a;
                                    boolean z13 = z11;
                                    long[] jArr3 = c0384u3.f1310i;
                                    int i36 = iM1673g5;
                                    if (jArr3 == null || jArr3.length != 1 || (jArr = c0384u3.f1311j) == null) {
                                        z4 = z8;
                                    } else {
                                        long j7 = jArr3[0];
                                        if (j7 == 0) {
                                            z4 = z8;
                                        } else {
                                            RoundingMode roundingMode = RoundingMode.DOWN;
                                            z4 = z8;
                                            if (AbstractC0632A.m1577R(j7, 1000000L, c0384u3.f1305d, roundingMode) + AbstractC0632A.m1577R(jArr[0], 1000000L, c0384u3.f1304c, roundingMode) >= c0384u3.f1306e) {
                                            }
                                        }
                                        j5 = jArr[0];
                                    }
                                    int[] iArr = c0386w2.f1326h;
                                    long[] jArr4 = c0386w2.f1327i;
                                    boolean[] zArr2 = c0386w2.f1328j;
                                    boolean z14 = c0384u3.f1303b == 2 && (i8 & 1) != 0;
                                    int i37 = i35 + c0386w2.f1325g[i33];
                                    long j8 = c0386w2.f1334p;
                                    int i38 = i35;
                                    while (i38 < i37) {
                                        int iM1673g6 = z4 ? c0651s11.m1673g() : c0372i5.f1193b;
                                        int i39 = i37;
                                        if (iM1673g6 < 0) {
                                            throw C0546I.m1365a(null, "Unexpected negative value: " + iM1673g6);
                                        }
                                        int iM1673g7 = z10 ? c0651s11.m1673g() : c0372i5.f1194c;
                                        if (iM1673g7 < 0) {
                                            throw C0546I.m1365a(null, "Unexpected negative value: " + iM1673g7);
                                        }
                                        int iM1673g8 = z13 ? c0651s11.m1673g() : (i38 == 0 && z9) ? i36 : c0372i5.f1195d;
                                        int i40 = i32;
                                        boolean z15 = z12;
                                        long jM1577R = AbstractC0632A.m1577R((((long) (z12 ? c0651s11.m1673g() : 0)) + j8) - j5, 1000000L, c0384u3.f1304c, RoundingMode.DOWN);
                                        jArr4[i38] = jM1577R;
                                        if (!c0386w2.f1335q) {
                                            jArr4[i38] = jM1577R + c0375l2.f1203d.f1343h;
                                        }
                                        iArr[i38] = iM1673g7;
                                        zArr2[i38] = ((iM1673g8 >> 16) & 1) == 0 && (!z14 || i38 == 0);
                                        j8 += (long) iM1673g6;
                                        i38++;
                                        i37 = i39;
                                        z14 = z14;
                                        c0372i5 = c0372i5;
                                        i32 = i40;
                                        z12 = z15;
                                    }
                                    c0386w2.f1334p = j8;
                                    i24 = i37;
                                    i23 = i32;
                                }
                                i22++;
                                size5 = size5;
                                i15 = i15;
                                arrayList3 = arrayList3;
                                i5 = 1953658222;
                            }
                        } else {
                            arrayList = arrayList5;
                            i3 = size4;
                            i4 = i15;
                            arrayList2 = arrayList3;
                        }
                    } else {
                        arrayList = arrayList5;
                        i3 = size4;
                        i4 = i15;
                        arrayList2 = arrayList3;
                    }
                    i15 = i4 + 1;
                    size4 = i3;
                    arrayList5 = arrayList;
                    arrayList3 = arrayList2;
                }
                C0579k c0579kM1036b2 = m1036b(arrayList3);
                if (c0579kM1036b2 != null) {
                    int size7 = sparseArray.size();
                    for (int i41 = 0; i41 < size7; i41++) {
                        C0375l c0375l3 = (C0375l) sparseArray.valueAt(i41);
                        C0387x c0387x5 = c0375l3.f1203d;
                        C0372i c0372i6 = c0375l3.f1201b.f1319a;
                        int i42 = AbstractC0632A.f2454a;
                        C0385v c0385v2 = c0387x5.f1336a.f1313l[c0372i6.f1192a];
                        C0579k c0579kM1444d = c0579kM1036b2.m1444d(c0385v2 != null ? c0385v2.f1315b : null);
                        C0582n c0582nM1447a = c0375l3.f1203d.f1336a.f1308g.m1447a();
                        c0582nM1447a.f2118q = c0579kM1444d;
                        c0375l3.f1200a.mo1176e(new C0583o(c0582nM1447a));
                    }
                }
                if (this.f1247x != -9223372036854775807L) {
                    int size8 = sparseArray.size();
                    for (int i43 = 0; i43 < size8; i43++) {
                        C0375l c0375l4 = (C0375l) sparseArray.valueAt(i43);
                        long j9 = this.f1247x;
                        int i44 = c0375l4.f1205f;
                        while (true) {
                            C0386w c0386w3 = c0375l4.f1201b;
                            if (i44 >= c0386w3.f1323e || c0386w3.f1327i[i44] > j9) {
                                break;
                            }
                            if (c0386w3.f1328j[i44]) {
                                c0375l4.f1208i = i44;
                            }
                            i44++;
                        }
                    }
                    this.f1247x = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((C0670b) arrayDeque.peek()).f2570k.add(c0670b);
            }
        }
        this.f1240q = 0;
        this.f1243t = 0;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: h */
    public final void mo330h(InterfaceC2242o interfaceC2242o) {
        int i3;
        int i4 = this.f1225b;
        if ((i4 & 32) == 0) {
            interfaceC2242o = new C0858A(interfaceC2242o, this.f1224a);
        }
        this.f1220G = interfaceC2242o;
        int i5 = 0;
        this.f1240q = 0;
        this.f1243t = 0;
        InterfaceC2226E[] interfaceC2226EArr = new InterfaceC2226E[2];
        this.f1221H = interfaceC2226EArr;
        int i6 = 100;
        if ((i4 & 4) != 0) {
            interfaceC2226EArr[0] = interfaceC2242o.mo344p(100, 5);
            i3 = 1;
            i6 = 101;
        } else {
            i3 = 0;
        }
        InterfaceC2226E[] interfaceC2226EArr2 = (InterfaceC2226E[]) AbstractC0632A.m1573N(i3, this.f1221H);
        this.f1221H = interfaceC2226EArr2;
        for (InterfaceC2226E interfaceC2226E : interfaceC2226EArr2) {
            interfaceC2226E.mo1176e(f1213L);
        }
        List list = this.f1226c;
        this.f1222I = new InterfaceC2226E[list.size()];
        while (i5 < this.f1222I.length) {
            InterfaceC2226E interfaceC2226EMo344p = this.f1220G.mo344p(i6, 3);
            interfaceC2226EMo344p.mo1176e((C0583o) list.get(i5));
            this.f1222I[i5] = interfaceC2226EMo344p;
            i5++;
            i6++;
        }
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: j */
    public final void mo331j(long j3, long j4) {
        SparseArray sparseArray = this.f1227d;
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C0375l) sparseArray.valueAt(i3)).m1035e();
        }
        this.f1237n.clear();
        this.f1246w = 0;
        this.f1238o.m1801c(0);
        this.f1247x = j4;
        this.f1236m.clear();
        this.f1240q = 0;
        this.f1243t = 0;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: m */
    public final List mo332m() {
        return this.f1239p;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: a */
    public final void mo325a() {
    }
}

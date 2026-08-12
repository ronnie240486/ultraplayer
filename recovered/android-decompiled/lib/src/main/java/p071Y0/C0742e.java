package p071Y0;

import java.util.Arrays;
import java.util.Collections;
import p048Q0.C0508g;
import p055T.AbstractC0545H;
import p055T.C0546I;
import p055T.C0582n;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p145s0.AbstractC2229b;
import p145s0.C2228a;
import p145s0.C2239l;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2242o;

/* JADX INFO: renamed from: Y0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0742e implements InterfaceC0745h {

    /* JADX INFO: renamed from: w */
    public static final byte[] f2866w = {73, 68, 51};

    /* JADX INFO: renamed from: a */
    public final boolean f2867a;

    /* JADX INFO: renamed from: d */
    public final String f2870d;

    /* JADX INFO: renamed from: e */
    public final int f2871e;

    /* JADX INFO: renamed from: f */
    public String f2872f;

    /* JADX INFO: renamed from: g */
    public InterfaceC2226E f2873g;

    /* JADX INFO: renamed from: h */
    public InterfaceC2226E f2874h;

    /* JADX INFO: renamed from: l */
    public boolean f2878l;

    /* JADX INFO: renamed from: m */
    public boolean f2879m;

    /* JADX INFO: renamed from: p */
    public int f2882p;

    /* JADX INFO: renamed from: q */
    public boolean f2883q;

    /* JADX INFO: renamed from: s */
    public int f2885s;

    /* JADX INFO: renamed from: u */
    public InterfaceC2226E f2887u;

    /* JADX INFO: renamed from: v */
    public long f2888v;

    /* JADX INFO: renamed from: b */
    public final C0508g f2868b = new C0508g(new byte[7], 7);

    /* JADX INFO: renamed from: c */
    public final C0651s f2869c = new C0651s(Arrays.copyOf(f2866w, 10));

    /* JADX INFO: renamed from: i */
    public int f2875i = 0;

    /* JADX INFO: renamed from: j */
    public int f2876j = 0;

    /* JADX INFO: renamed from: k */
    public int f2877k = 256;

    /* JADX INFO: renamed from: n */
    public int f2880n = -1;

    /* JADX INFO: renamed from: o */
    public int f2881o = -1;

    /* JADX INFO: renamed from: r */
    public long f2884r = -9223372036854775807L;

    /* JADX INFO: renamed from: t */
    public long f2886t = -9223372036854775807L;

    public C0742e(String str, boolean z3, int i3) {
        this.f2867a = z3;
        this.f2870d = str;
        this.f2871e = i3;
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: b */
    public final void mo1852b() {
        this.f2886t = -9223372036854775807L;
        this.f2879m = false;
        this.f2875i = 0;
        this.f2876j = 0;
        this.f2877k = 256;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:116:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:119:0x02be  */
    /* JADX WARN: Code duplicated, block: B:120:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:122:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:125:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:127:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:129:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:131:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:134:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:136:0x0306  */
    /* JADX WARN: Code duplicated, block: B:137:0x0310  */
    /* JADX WARN: Code duplicated, block: B:138:0x031a  */
    /* JADX WARN: Code duplicated, block: B:172:0x02f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0205  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [W.s] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [Q0.g] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: c */
    public final void mo1853c(C0651s c0651s) throws C0546I {
        int i3;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        boolean z4 = false;
        int i8 = -1;
        int i9 = 2;
        boolean z5 = true;
        this.f2873g.getClass();
        int i10 = AbstractC0632A.f2454a;
        while (c0651s.m1667a() > 0) {
            int i11 = this.f2875i;
            ?? r8 = this.f2868b;
            int i12 = 4;
            C0651s c0651s2 = this.f2869c;
            if (i11 == 0) {
                byte[] bArr = c0651s.f2520a;
                int i13 = c0651s.f2521b;
                int i14 = c0651s.f2522c;
                ?? r3 = z4;
                ?? r6 = z5;
                while (true) {
                    if (i13 < i14) {
                        int i15 = i13 + 1;
                        byte b3 = bArr[i13];
                        int i16 = b3 & 255;
                        if (this.f2877k == 512 && ((65280 | (((byte) i16) & 255)) & 65526) == 65520) {
                            if (!this.f2879m) {
                                int i17 = i13 - 1;
                                c0651s.m1665G(i13);
                                byte[] bArr2 = r8.f1731b;
                                if (c0651s.m1667a() >= r6) {
                                    c0651s.m1671e(bArr2, r3, r6);
                                    r8.m1260q(i12);
                                    int iM1252i = r8.m1252i(r6);
                                    int i18 = this.f2880n;
                                    if (i18 == -1 || iM1252i == i18) {
                                        if (this.f2881o != -1) {
                                            byte[] bArr3 = r8.f1731b;
                                            if (c0651s.m1667a() >= r6) {
                                                c0651s.m1671e(bArr3, r3, r6);
                                                r8.m1260q(2);
                                                i5 = 4;
                                                if (r8.m1252i(4) == this.f2881o) {
                                                    c0651s.m1665G(i15);
                                                }
                                            }
                                        } else {
                                            i5 = 4;
                                        }
                                        byte[] bArr4 = r8.f1731b;
                                        if (c0651s.m1667a() >= i5) {
                                            c0651s.m1671e(bArr4, r3, i5);
                                            r8.m1260q(14);
                                            int iM1252i2 = r8.m1252i(13);
                                            if (iM1252i2 >= 7) {
                                                byte[] bArr5 = c0651s.f2520a;
                                                int i19 = c0651s.f2522c;
                                                int i20 = i17 + iM1252i2;
                                                if (i20 < i19) {
                                                    byte b4 = bArr5[i20];
                                                    if (b4 == -1) {
                                                        int i21 = i20 + 1;
                                                        if (i21 != i19) {
                                                            byte b5 = bArr5[i21];
                                                            if (((65280 | (b5 & 255)) & 65526) != 65520 || ((b5 & 8) >> 3) != iM1252i) {
                                                            }
                                                        }
                                                    } else if (b4 == 73 && ((i6 = i20 + 1) == i19 || (bArr5[i6] == 68 && ((i7 = i20 + 2) == i19 || bArr5[i7] == 51)))) {
                                                    }
                                                }
                                                this.f2882p = (b3 & 8) >> 3;
                                                if ((b3 & 1) == 0) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                this.f2878l = z3;
                                                if (this.f2879m) {
                                                    this.f2875i = 3;
                                                    this.f2876j = 0;
                                                } else {
                                                    this.f2875i = 1;
                                                    this.f2876j = 0;
                                                }
                                                c0651s.m1665G(i15);
                                                i9 = 2;
                                            }
                                        }
                                        this.f2882p = (b3 & 8) >> 3;
                                        if ((b3 & 1) == 0) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        this.f2878l = z3;
                                        if (this.f2879m) {
                                            this.f2875i = 1;
                                            this.f2876j = 0;
                                        } else {
                                            this.f2875i = 3;
                                            this.f2876j = 0;
                                        }
                                        c0651s.m1665G(i15);
                                        i9 = 2;
                                    }
                                }
                                i3 = this.f2877k;
                                i4 = i3 | i16;
                                if (i4 != 329) {
                                    i9 = 2;
                                    this.f2877k = 768;
                                } else if (i4 != 511) {
                                    i9 = 2;
                                    this.f2877k = 512;
                                } else if (i4 != 836) {
                                    i9 = 2;
                                    this.f2877k = 1024;
                                } else if (i4 != 1075) {
                                    if (i3 != 256) {
                                        this.f2877k = 256;
                                        i9 = 2;
                                    } else {
                                        i9 = 2;
                                    }
                                    r3 = 0;
                                    r6 = 1;
                                    i12 = 4;
                                } else {
                                    i9 = 2;
                                    this.f2875i = 2;
                                    this.f2876j = 3;
                                    this.f2885s = 0;
                                    c0651s2.m1665G(0);
                                    c0651s.m1665G(i15);
                                }
                                i13 = i15;
                                r3 = 0;
                                r6 = 1;
                                i12 = 4;
                            }
                            this.f2882p = (b3 & 8) >> 3;
                            if ((b3 & 1) == 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            this.f2878l = z3;
                            if (this.f2879m) {
                                this.f2875i = 1;
                                this.f2876j = 0;
                            } else {
                                this.f2875i = 3;
                                this.f2876j = 0;
                            }
                            c0651s.m1665G(i15);
                            i9 = 2;
                        } else {
                            i3 = this.f2877k;
                            i4 = i3 | i16;
                            if (i4 != 329) {
                                i9 = 2;
                                this.f2877k = 768;
                            } else if (i4 != 511) {
                                i9 = 2;
                                this.f2877k = 512;
                            } else if (i4 != 836) {
                                i9 = 2;
                                this.f2877k = 1024;
                            } else if (i4 != 1075) {
                                if (i3 != 256) {
                                    this.f2877k = 256;
                                    i9 = 2;
                                } else {
                                    i9 = 2;
                                }
                                r3 = 0;
                                r6 = 1;
                                i12 = 4;
                            } else {
                                i9 = 2;
                                this.f2875i = 2;
                                this.f2876j = 3;
                                this.f2885s = 0;
                                c0651s2.m1665G(0);
                                c0651s.m1665G(i15);
                            }
                            i13 = i15;
                            r3 = 0;
                            r6 = 1;
                            i12 = 4;
                        }
                    } else {
                        c0651s.m1665G(i13);
                    }
                    z4 = false;
                    i8 = -1;
                    z5 = true;
                }
            } else if (i11 != z5) {
                if (i11 == i9) {
                    byte[] bArr6 = c0651s2.f2520a;
                    int iMin = Math.min(c0651s.m1667a(), 10 - this.f2876j);
                    c0651s.m1671e(bArr6, this.f2876j, iMin);
                    int i22 = this.f2876j + iMin;
                    this.f2876j = i22;
                    if (i22 == 10) {
                        this.f2874h.mo1173b(10, c0651s2);
                        c0651s2.m1665G(6);
                        InterfaceC2226E interfaceC2226E = this.f2874h;
                        int iM1686t = c0651s2.m1686t() + 10;
                        this.f2875i = 4;
                        this.f2876j = 10;
                        this.f2887u = interfaceC2226E;
                        this.f2888v = 0L;
                        this.f2885s = iM1686t;
                    }
                } else if (i11 == 3) {
                    int i23 = this.f2878l ? 7 : 5;
                    byte[] bArr7 = r8.f1731b;
                    int iMin2 = Math.min(c0651s.m1667a(), i23 - this.f2876j);
                    c0651s.m1671e(bArr7, this.f2876j, iMin2);
                    int i24 = this.f2876j + iMin2;
                    this.f2876j = i24;
                    if (i24 == i23) {
                        r8.m1260q(z4 ? 1 : 0);
                        if (this.f2883q) {
                            r8.m1263t(10);
                        } else {
                            int iM1252i3 = r8.m1252i(i9) + (z5 ? 1 : 0);
                            if (iM1252i3 != i9) {
                                AbstractC0646n.m1647y("AdtsReader", "Detected audio object type: " + iM1252i3 + ", but assuming AAC LC.");
                                iM1252i3 = 2;
                            }
                            r8.m1263t(5);
                            int iM1252i4 = r8.m1252i(3);
                            int i25 = this.f2881o;
                            byte b6 = (byte) (((iM1252i3 << 3) & 248) | ((i25 >> 1) & 7));
                            byte b7 = (byte) (((iM1252i4 << 3) & 120) | ((i25 << 7) & 128));
                            byte[] bArr8 = new byte[i9];
                            bArr8[z4 ? 1 : 0] = b6;
                            bArr8[z5 ? 1 : 0] = b7;
                            C2228a c2228aM4819n = AbstractC2229b.m4819n(new C0508g(bArr8, i9), z4);
                            C0582n c0582n = new C0582n();
                            c0582n.f2102a = this.f2872f;
                            c0582n.f2114m = AbstractC0545H.m1364l("audio/mp4a-latm");
                            c0582n.f2111j = c2228aM4819n.f9562a;
                            c0582n.f2092B = c2228aM4819n.f9564c;
                            c0582n.f2093C = c2228aM4819n.f9563b;
                            c0582n.f2117p = Collections.singletonList(bArr8);
                            c0582n.f2105d = this.f2870d;
                            c0582n.f2107f = this.f2871e;
                            C0583o c0583o = new C0583o(c0582n);
                            this.f2884r = 1024000000 / ((long) c0583o.f2131D);
                            this.f2873g.mo1176e(c0583o);
                            this.f2883q = z5;
                        }
                        r8.m1263t(4);
                        int iM1252i5 = r8.m1252i(13);
                        int i26 = iM1252i5 - 7;
                        if (this.f2878l) {
                            i26 = iM1252i5 - 9;
                        }
                        InterfaceC2226E interfaceC2226E2 = this.f2873g;
                        long j3 = this.f2884r;
                        this.f2875i = 4;
                        this.f2876j = z4 ? 1 : 0;
                        this.f2887u = interfaceC2226E2;
                        this.f2888v = j3;
                        this.f2885s = i26;
                    }
                } else {
                    if (i11 != 4) {
                        throw new IllegalStateException();
                    }
                    int iMin3 = Math.min(c0651s.m1667a(), this.f2885s - this.f2876j);
                    this.f2887u.mo1173b(iMin3, c0651s);
                    int i27 = this.f2876j + iMin3;
                    this.f2876j = i27;
                    if (i27 == this.f2885s) {
                        AbstractC0646n.m1630h(this.f2886t != -9223372036854775807L);
                        this.f2887u.mo1172a(this.f2886t, 1, this.f2885s, 0, null);
                        this.f2886t += this.f2888v;
                        this.f2875i = z4 ? 1 : 0;
                        this.f2876j = z4 ? 1 : 0;
                        this.f2877k = 256;
                    }
                }
            } else if (c0651s.m1667a() != 0) {
                r8.f1731b[z4 ? 1 : 0] = c0651s.f2520a[c0651s.f2521b];
                r8.m1260q(i9);
                int iM1252i6 = r8.m1252i(4);
                int i28 = this.f2881o;
                if (i28 == i8 || iM1252i6 == i28) {
                    if (!this.f2879m) {
                        this.f2879m = z5;
                        this.f2880n = this.f2882p;
                        this.f2881o = iM1252i6;
                    }
                    this.f2875i = 3;
                    this.f2876j = z4 ? 1 : 0;
                } else {
                    this.f2879m = z4;
                    this.f2875i = z4 ? 1 : 0;
                    this.f2876j = z4 ? 1 : 0;
                    this.f2877k = 256;
                }
            }
        }
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: e */
    public final void mo1855e(InterfaceC2242o interfaceC2242o, C0736G c0736g) {
        c0736g.m1848a();
        c0736g.m1849b();
        this.f2872f = c0736g.f2836e;
        c0736g.m1849b();
        InterfaceC2226E interfaceC2226EMo344p = interfaceC2242o.mo344p(c0736g.f2835d, 1);
        this.f2873g = interfaceC2226EMo344p;
        this.f2887u = interfaceC2226EMo344p;
        if (!this.f2867a) {
            this.f2874h = new C2239l();
            return;
        }
        c0736g.m1848a();
        c0736g.m1849b();
        InterfaceC2226E interfaceC2226EMo344p2 = interfaceC2242o.mo344p(c0736g.f2835d, 5);
        this.f2874h = interfaceC2226EMo344p2;
        C0582n c0582n = new C0582n();
        c0736g.m1849b();
        c0582n.f2102a = c0736g.f2836e;
        c0582n.f2114m = AbstractC0545H.m1364l("application/id3");
        interfaceC2226EMo344p2.mo1176e(new C0583o(c0582n));
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: f */
    public final void mo1856f(int i3, long j3) {
        this.f2886t = j3;
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: d */
    public final void mo1854d(boolean z3) {
    }
}

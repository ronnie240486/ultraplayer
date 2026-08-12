package p071Y0;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import p009D0.C0106b;
import p055T.AbstractC0545H;
import p055T.C0582n;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p067X.AbstractC0684p;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2242o;

/* JADX INFO: renamed from: Y0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0747j implements InterfaceC0745h {

    /* JADX INFO: renamed from: q */
    public static final double[] f2917q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a */
    public String f2918a;

    /* JADX INFO: renamed from: b */
    public InterfaceC2226E f2919b;

    /* JADX INFO: renamed from: c */
    public final C0106b f2920c;

    /* JADX INFO: renamed from: d */
    public final C0651s f2921d;

    /* JADX INFO: renamed from: e */
    public final C0760w f2922e;

    /* JADX INFO: renamed from: f */
    public final boolean[] f2923f = new boolean[4];

    /* JADX INFO: renamed from: g */
    public final C0746i f2924g;

    /* JADX INFO: renamed from: h */
    public long f2925h;

    /* JADX INFO: renamed from: i */
    public boolean f2926i;

    /* JADX INFO: renamed from: j */
    public boolean f2927j;

    /* JADX INFO: renamed from: k */
    public long f2928k;

    /* JADX INFO: renamed from: l */
    public long f2929l;

    /* JADX INFO: renamed from: m */
    public long f2930m;

    /* JADX INFO: renamed from: n */
    public long f2931n;

    /* JADX INFO: renamed from: o */
    public boolean f2932o;

    /* JADX INFO: renamed from: p */
    public boolean f2933p;

    public C0747j(C0106b c0106b) {
        this.f2920c = c0106b;
        C0746i c0746i = new C0746i();
        c0746i.f2916d = new byte[128];
        this.f2924g = c0746i;
        if (c0106b != null) {
            this.f2922e = new C0760w(178);
            this.f2921d = new C0651s();
        } else {
            this.f2922e = null;
            this.f2921d = null;
        }
        this.f2929l = -9223372036854775807L;
        this.f2931n = -9223372036854775807L;
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: b */
    public final void mo1852b() {
        AbstractC0684p.m1788a(this.f2923f);
        C0746i c0746i = this.f2924g;
        c0746i.f2913a = false;
        c0746i.f2914b = 0;
        c0746i.f2915c = 0;
        C0760w c0760w = this.f2922e;
        if (c0760w != null) {
            c0760w.m1873g();
        }
        this.f2925h = 0L;
        this.f2926i = false;
        this.f2929l = -9223372036854775807L;
        this.f2931n = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0198  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
    public final void mo1853c(C0651s c0651s) {
        C0746i c0746i;
        C0760w c0760w;
        boolean z3;
        boolean z4;
        int i3;
        float f;
        long j3;
        float f3;
        int i4;
        AbstractC0646n.m1631i(this.f2919b);
        int i5 = c0651s.f2521b;
        int i6 = c0651s.f2522c;
        byte[] bArr = c0651s.f2520a;
        this.f2925h += (long) c0651s.m1667a();
        this.f2919b.mo1173b(c0651s.m1667a(), c0651s);
        while (true) {
            int iM1789b = AbstractC0684p.m1789b(bArr, i5, i6, this.f2923f);
            c0746i = this.f2924g;
            c0760w = this.f2922e;
            if (iM1789b == i6) {
                break;
            }
            int i7 = iM1789b + 3;
            int i8 = c0651s.f2520a[i7] & 255;
            int i9 = iM1789b - i5;
            if (!this.f2927j) {
                if (i9 > 0) {
                    c0746i.m1859a(bArr, i5, iM1789b);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                if (c0746i.f2913a) {
                    int i11 = c0746i.f2914b - i10;
                    c0746i.f2914b = i11;
                    if (c0746i.f2915c == 0 && i8 == 181) {
                        c0746i.f2915c = i11;
                    } else {
                        c0746i.f2913a = false;
                        String str = this.f2918a;
                        str.getClass();
                        byte[] bArrCopyOf = Arrays.copyOf(c0746i.f2916d, c0746i.f2914b);
                        int i12 = bArrCopyOf[4] & 255;
                        byte b3 = bArrCopyOf[5];
                        int i13 = (i12 << 4) | ((b3 & 255) >> 4);
                        int i14 = ((b3 & 15) << 8) | (bArrCopyOf[6] & 255);
                        int i15 = (bArrCopyOf[7] & 240) >> 4;
                        if (i15 != 2) {
                            if (i15 == 3) {
                                f3 = i14 * 16;
                                i4 = i13 * 9;
                            } else if (i15 != 4) {
                                f = 1.0f;
                            } else {
                                f3 = i14 * 121;
                                i4 = i13 * 100;
                            }
                            f = f3 / i4;
                        } else {
                            f = (i14 * 4) / (i13 * 3);
                        }
                        C0582n c0582n = new C0582n();
                        c0582n.f2102a = str;
                        c0582n.f2114m = AbstractC0545H.m1364l("video/mpeg2");
                        c0582n.f2121t = i13;
                        c0582n.f2122u = i14;
                        c0582n.f2125x = f;
                        c0582n.f2117p = Collections.singletonList(bArrCopyOf);
                        C0583o c0583o = new C0583o(c0582n);
                        int i16 = (bArrCopyOf[7] & 15) - 1;
                        if (i16 < 0 || i16 >= 8) {
                            j3 = 0;
                        } else {
                            double d3 = f2917q[i16];
                            byte b4 = bArrCopyOf[c0746i.f2915c + 9];
                            int i17 = (b4 & 96) >> 5;
                            int i18 = b4 & 31;
                            if (i17 != i18) {
                                d3 = ((((double) i17) + 1.0d) / ((double) (i18 + 1))) * d3;
                            }
                            j3 = (long) (1000000.0d / d3);
                        }
                        Pair pairCreate = Pair.create(c0583o, Long.valueOf(j3));
                        this.f2919b.mo1176e((C0583o) pairCreate.first);
                        this.f2928k = ((Long) pairCreate.second).longValue();
                        this.f2927j = true;
                    }
                } else if (i8 == 179) {
                    c0746i.f2913a = true;
                }
                c0746i.m1859a(C0746i.f2912e, 0, 3);
            }
            if (c0760w == null) {
                z3 = true;
            } else {
                if (i9 > 0) {
                    c0760w.m1867a(bArr, i5, iM1789b);
                    i3 = 0;
                } else {
                    i3 = -i9;
                }
                if (c0760w.m1871e(i3)) {
                    int iM1798k = AbstractC0684p.m1798k((byte[]) c0760w.f3101f, c0760w.f3100e);
                    int i19 = AbstractC0632A.f2454a;
                    byte[] bArr2 = (byte[]) c0760w.f3101f;
                    C0651s c0651s2 = this.f2921d;
                    c0651s2.m1663E(bArr2, iM1798k);
                    this.f2920c.m527o(this.f2931n, c0651s2);
                }
                if (i8 == 178) {
                    z3 = true;
                    if (c0651s.f2520a[iM1789b + 2] == 1) {
                        c0760w.m1874h(i8);
                    }
                } else {
                    z3 = true;
                }
            }
            if (i8 == 0 || i8 == 179) {
                int i20 = i6 - iM1789b;
                if (this.f2933p && this.f2927j) {
                    long j4 = this.f2931n;
                    if (j4 != -9223372036854775807L) {
                        this.f2919b.mo1172a(j4, this.f2932o ? 1 : 0, ((int) (this.f2925h - this.f2930m)) - i20, i20, null);
                    }
                }
                if (!this.f2926i || this.f2933p) {
                    this.f2930m = this.f2925h - ((long) i20);
                    long j5 = this.f2929l;
                    if (j5 == -9223372036854775807L) {
                        long j6 = this.f2931n;
                        j5 = j6 != -9223372036854775807L ? j6 + this.f2928k : -9223372036854775807L;
                    }
                    this.f2931n = j5;
                    z4 = false;
                    this.f2932o = false;
                    this.f2929l = -9223372036854775807L;
                    this.f2926i = true;
                } else {
                    z4 = false;
                }
                if (i8 == 0) {
                    z4 = true;
                }
                this.f2933p = z4;
            } else if (i8 == 184) {
                this.f2932o = z3;
            }
            i5 = i7;
        }
        if (!this.f2927j) {
            c0746i.m1859a(bArr, i5, i6);
        }
        if (c0760w != null) {
            c0760w.m1867a(bArr, i5, i6);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: d */
    public final void mo1854d(boolean z3) {
        AbstractC0646n.m1631i(this.f2919b);
        if (z3) {
            boolean z4 = this.f2932o;
            this.f2919b.mo1172a(this.f2931n, z4 ? 1 : 0, (int) (this.f2925h - this.f2930m), 0, null);
        }
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: e */
    public final void mo1855e(InterfaceC2242o interfaceC2242o, C0736G c0736g) {
        c0736g.m1848a();
        c0736g.m1849b();
        this.f2918a = c0736g.f2836e;
        c0736g.m1849b();
        this.f2919b = interfaceC2242o.mo344p(c0736g.f2835d, 2);
        C0106b c0106b = this.f2920c;
        if (c0106b != null) {
            c0106b.m528p(interfaceC2242o, c0736g);
        }
    }

    @Override // p071Y0.InterfaceC0745h
    /* JADX INFO: renamed from: f */
    public final void mo1856f(int i3, long j3) {
        this.f2929l = j3;
    }
}

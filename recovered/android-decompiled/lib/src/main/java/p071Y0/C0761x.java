package p071Y0;

import p045P0.AbstractC0462h;
import p048Q0.C0508g;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p064W.C0656x;
import p145s0.InterfaceC2242o;

/* JADX INFO: renamed from: Y0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0761x implements InterfaceC0737H {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0745h f3102a;

    /* JADX INFO: renamed from: b */
    public final C0508g f3103b = new C0508g(new byte[10], 10);

    /* JADX INFO: renamed from: c */
    public int f3104c = 0;

    /* JADX INFO: renamed from: d */
    public int f3105d;

    /* JADX INFO: renamed from: e */
    public C0656x f3106e;

    /* JADX INFO: renamed from: f */
    public boolean f3107f;

    /* JADX INFO: renamed from: g */
    public boolean f3108g;

    /* JADX INFO: renamed from: h */
    public boolean f3109h;

    /* JADX INFO: renamed from: i */
    public int f3110i;

    /* JADX INFO: renamed from: j */
    public int f3111j;

    /* JADX INFO: renamed from: k */
    public boolean f3112k;

    /* JADX INFO: renamed from: l */
    public long f3113l;

    public C0761x(InterfaceC0745h interfaceC0745h) {
        this.f3102a = interfaceC0745h;
    }

    @Override // p071Y0.InterfaceC0737H
    /* JADX INFO: renamed from: a */
    public final void mo1845a(C0656x c0656x, InterfaceC2242o interfaceC2242o, C0736G c0736g) {
        this.f3106e = c0656x;
        this.f3102a.mo1855e(interfaceC2242o, c0736g);
    }

    @Override // p071Y0.InterfaceC0737H
    /* JADX INFO: renamed from: b */
    public final void mo1846b() {
        this.f3104c = 0;
        this.f3105d = 0;
        this.f3109h = false;
        this.f3102a.mo1852b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v3 */
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
    @Override // p071Y0.InterfaceC0737H
    /* JADX INFO: renamed from: c */
    public final void mo1847c(int i3, C0651s c0651s) {
        int i4;
        AbstractC0646n.m1631i(this.f3106e);
        int i5 = i3 & 1;
        InterfaceC0745h interfaceC0745h = this.f3102a;
        int i6 = 2;
        ?? r9 = 0;
        if (i5 != 0) {
            int i7 = this.f3104c;
            if (i7 != 0 && i7 != 1) {
                if (i7 == 2) {
                    AbstractC0646n.m1647y("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i7 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f3111j != -1) {
                        AbstractC0646n.m1647y("PesReader", "Unexpected start indicator: expected " + this.f3111j + " more bytes");
                    }
                    interfaceC0745h.mo1854d(c0651s.f2522c == 0);
                }
            }
            this.f3104c = 1;
            this.f3105d = 0;
        }
        int i8 = i3;
        while (c0651s.m1667a() > 0) {
            int i9 = this.f3104c;
            if (i9 != 0) {
                C0508g c0508g = this.f3103b;
                if (i9 != 1) {
                    if (i9 == i6) {
                        if (m1875d(c0651s, c0508g.f1731b, Math.min(10, this.f3110i)) && m1875d(c0651s, null, this.f3110i)) {
                            c0508g.m1260q(r9);
                            this.f3113l = -9223372036854775807L;
                            if (this.f3107f) {
                                c0508g.m1263t(4);
                                long jM1252i = ((long) c0508g.m1252i(3)) << 30;
                                c0508g.m1263t(1);
                                long jM1252i2 = ((long) (c0508g.m1252i(15) << 15)) | jM1252i;
                                c0508g.m1263t(1);
                                long jM1252i3 = jM1252i2 | ((long) c0508g.m1252i(15));
                                c0508g.m1263t(1);
                                if (!this.f3109h && this.f3108g) {
                                    c0508g.m1263t(4);
                                    long jM1252i4 = ((long) c0508g.m1252i(3)) << 30;
                                    c0508g.m1263t(1);
                                    long jM1252i5 = jM1252i4 | ((long) (c0508g.m1252i(15) << 15));
                                    c0508g.m1263t(1);
                                    long jM1252i6 = jM1252i5 | ((long) c0508g.m1252i(15));
                                    c0508g.m1263t(1);
                                    this.f3106e.m1702b(jM1252i6);
                                    this.f3109h = true;
                                }
                                this.f3113l = this.f3106e.m1702b(jM1252i3);
                            }
                            i8 |= this.f3112k ? 4 : 0;
                            interfaceC0745h.mo1856f(i8, this.f3113l);
                            this.f3104c = 3;
                            this.f3105d = 0;
                        }
                    } else {
                        if (i9 != 3) {
                            throw new IllegalStateException();
                        }
                        int iM1667a = c0651s.m1667a();
                        int i10 = this.f3111j;
                        int i11 = i10 == -1 ? 0 : iM1667a - i10;
                        if (i11 > 0) {
                            iM1667a -= i11;
                            c0651s.m1664F(c0651s.f2521b + iM1667a);
                        }
                        interfaceC0745h.mo1853c(c0651s);
                        int i12 = this.f3111j;
                        if (i12 != -1) {
                            int i13 = i12 - iM1667a;
                            this.f3111j = i13;
                            if (i13 == 0) {
                                interfaceC0745h.mo1854d(r9);
                                this.f3104c = 1;
                                this.f3105d = r9;
                            }
                        }
                    }
                } else if (m1875d(c0651s, c0508g.f1731b, 9)) {
                    c0508g.m1260q(0);
                    int iM1252i = c0508g.m1252i(24);
                    if (iM1252i != 1) {
                        AbstractC0462h.m1170j("Unexpected start code prefix: ", "PesReader", iM1252i);
                        this.f3111j = -1;
                        i4 = 0;
                    } else {
                        c0508g.m1263t(8);
                        int iM1252i2 = c0508g.m1252i(16);
                        c0508g.m1263t(5);
                        this.f3112k = c0508g.m1251h();
                        c0508g.m1263t(2);
                        this.f3107f = c0508g.m1251h();
                        this.f3108g = c0508g.m1251h();
                        c0508g.m1263t(6);
                        int iM1252i3 = c0508g.m1252i(8);
                        this.f3110i = iM1252i3;
                        if (iM1252i2 == 0) {
                            this.f3111j = -1;
                        } else {
                            int i14 = (iM1252i2 - 3) - iM1252i3;
                            this.f3111j = i14;
                            if (i14 < 0) {
                                AbstractC0646n.m1647y("PesReader", "Found negative packet payload size: " + this.f3111j);
                                this.f3111j = -1;
                            }
                        }
                        i4 = 2;
                    }
                    this.f3104c = i4;
                    this.f3105d = 0;
                }
            } else {
                c0651s.m1666H(c0651s.m1667a());
            }
            i6 = 2;
            r9 = 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1875d(C0651s c0651s, byte[] bArr, int i3) {
        int iMin = Math.min(c0651s.m1667a(), i3 - this.f3105d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c0651s.m1666H(iMin);
        } else {
            c0651s.m1671e(bArr, this.f3105d, iMin);
        }
        int i4 = this.f3105d + iMin;
        this.f3105d = i4;
        return i4 == i3;
    }
}

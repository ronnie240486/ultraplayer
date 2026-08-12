package p071Y0;

import p064W.AbstractC0646n;
import p145s0.InterfaceC2226E;

/* JADX INFO: renamed from: Y0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0749l {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2226E f2940a;

    /* JADX INFO: renamed from: b */
    public boolean f2941b;

    /* JADX INFO: renamed from: c */
    public boolean f2942c;

    /* JADX INFO: renamed from: d */
    public boolean f2943d;

    /* JADX INFO: renamed from: e */
    public int f2944e;

    /* JADX INFO: renamed from: f */
    public int f2945f;

    /* JADX INFO: renamed from: g */
    public long f2946g;

    /* JADX INFO: renamed from: h */
    public long f2947h;

    public C0749l(InterfaceC2226E interfaceC2226E) {
        this.f2940a = interfaceC2226E;
    }

    /* JADX INFO: renamed from: a */
    public final void m1861a(byte[] bArr, int i3, int i4) {
        if (this.f2942c) {
            int i5 = this.f2945f;
            int i6 = (i3 + 1) - i5;
            if (i6 >= i4) {
                this.f2945f = (i4 - i3) + i5;
            } else {
                this.f2943d = ((bArr[i6] & 192) >> 6) == 0;
                this.f2942c = false;
            }
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
    /* JADX INFO: renamed from: b */
    public final void m1862b(int i3, long j3, boolean z3) {
        AbstractC0646n.m1630h(this.f2947h != -9223372036854775807L);
        if (this.f2944e == 182 && z3 && this.f2941b) {
            this.f2940a.mo1172a(this.f2947h, this.f2943d ? 1 : 0, (int) (j3 - this.f2946g), i3, null);
        }
        if (this.f2944e != 179) {
            this.f2946g = j3;
        }
    }
}

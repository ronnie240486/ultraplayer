package p071Y0;

import p145s0.InterfaceC2226E;

/* JADX INFO: renamed from: Y0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0754q {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2226E f3010a;

    /* JADX INFO: renamed from: b */
    public long f3011b;

    /* JADX INFO: renamed from: c */
    public boolean f3012c;

    /* JADX INFO: renamed from: d */
    public int f3013d;

    /* JADX INFO: renamed from: e */
    public long f3014e;

    /* JADX INFO: renamed from: f */
    public boolean f3015f;

    /* JADX INFO: renamed from: g */
    public boolean f3016g;

    /* JADX INFO: renamed from: h */
    public boolean f3017h;

    /* JADX INFO: renamed from: i */
    public boolean f3018i;

    /* JADX INFO: renamed from: j */
    public boolean f3019j;

    /* JADX INFO: renamed from: k */
    public long f3020k;

    /* JADX INFO: renamed from: l */
    public long f3021l;

    /* JADX INFO: renamed from: m */
    public boolean f3022m;

    public C0754q(InterfaceC2226E interfaceC2226E) {
        this.f3010a = interfaceC2226E;
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
    /* JADX INFO: renamed from: a */
    public final void m1865a(int i3) {
        long j3 = this.f3021l;
        if (j3 == -9223372036854775807L) {
            return;
        }
        boolean z3 = this.f3022m;
        this.f3010a.mo1172a(j3, z3 ? 1 : 0, (int) (this.f3011b - this.f3020k), i3, null);
    }
}

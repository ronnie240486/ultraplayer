package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1352y0 extends AbstractC1282g2 {
    private static final C1352y0 zzb;
    private int zzd;
    private C1194K0 zze;
    private long zzf;
    private int zzg;
    private InterfaceC1302l2 zzh;
    private InterfaceC1302l2 zzi;
    private InterfaceC1302l2 zzj;
    private InterfaceC1302l2 zzk;

    static {
        C1352y0 c1352y0 = new C1352y0();
        zzb = c1352y0;
        AbstractC1282g2.m3259e(C1352y0.class, c1352y0);
    }

    public C1352y0() {
        C1180G2 c1180g2 = C1180G2.f5631j;
        this.zzh = c1180g2;
        this.zzi = c1180g2;
        this.zzj = c1180g2;
        this.zzk = c1180g2;
    }

    /* JADX INFO: renamed from: l */
    public static C1348x0 m3431l() {
        return (C1348x0) zzb.m3265j();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m3432m(C1352y0 c1352y0, C1194K0 c1194k0) {
        c1352y0.zze = c1194k0;
        c1352y0.zzd |= 1;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m3433n(C1352y0 c1352y0, long j3) {
        c1352y0.zzd |= 2;
        c1352y0.zzf = j3;
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
    /* JADX INFO: renamed from: o */
    public static void m3434o(C1352y0 c1352y0, ArrayList arrayList) {
        InterfaceC1302l2 interfaceC1302l2 = c1352y0.zzh;
        if (!((AbstractC1234U1) interfaceC1302l2).f5713g) {
            c1352y0.zzh = AbstractC1282g2.m3257b(interfaceC1302l2);
        }
        List list = c1352y0.zzh;
        Charset charset = AbstractC1306m2.f5927a;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
        }
        int size = list.size();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj = arrayList.get(i3);
            i3++;
            if (obj == null) {
                String str = "Element at index " + (list.size() - size) + " is null.";
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(str);
                    }
                    list.remove(size3);
                }
            } else {
                list.add(obj);
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
    /* JADX INFO: renamed from: p */
    public static void m3435p(C1352y0 c1352y0, ArrayList arrayList) {
        InterfaceC1302l2 interfaceC1302l2 = c1352y0.zzi;
        if (!((AbstractC1234U1) interfaceC1302l2).f5713g) {
            c1352y0.zzi = AbstractC1282g2.m3257b(interfaceC1302l2);
        }
        List list = c1352y0.zzi;
        Charset charset = AbstractC1306m2.f5927a;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
        }
        int size = list.size();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj = arrayList.get(i3);
            i3++;
            if (obj == null) {
                String str = "Element at index " + (list.size() - size) + " is null.";
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(str);
                    }
                    list.remove(size3);
                }
            } else {
                list.add(obj);
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
    /* JADX INFO: renamed from: q */
    public static void m3436q(C1352y0 c1352y0, ArrayList arrayList) {
        InterfaceC1302l2 interfaceC1302l2 = c1352y0.zzj;
        if (!((AbstractC1234U1) interfaceC1302l2).f5713g) {
            c1352y0.zzj = AbstractC1282g2.m3257b(interfaceC1302l2);
        }
        List list = c1352y0.zzj;
        Charset charset = AbstractC1306m2.f5927a;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
        }
        int size = list.size();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj = arrayList.get(i3);
            i3++;
            if (obj == null) {
                String str = "Element at index " + (list.size() - size) + " is null.";
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(str);
                    }
                    list.remove(size3);
                }
            } else {
                list.add(obj);
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
    /* JADX INFO: renamed from: r */
    public static void m3437r(C1352y0 c1352y0, ArrayList arrayList) {
        InterfaceC1302l2 interfaceC1302l2 = c1352y0.zzk;
        if (!((AbstractC1234U1) interfaceC1302l2).f5713g) {
            c1352y0.zzk = AbstractC1282g2.m3257b(interfaceC1302l2);
        }
        List list = c1352y0.zzk;
        Charset charset = AbstractC1306m2.f5927a;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
        }
        int size = list.size();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj = arrayList.get(i3);
            i3++;
            if (obj == null) {
                String str = "Element at index " + (list.size() - size) + " is null.";
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(str);
                    }
                    list.remove(size3);
                }
            } else {
                list.add(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1282g2
    /* JADX INFO: renamed from: h */
    public final Object mo3096h(int i3, AbstractC1282g2 abstractC1282g2) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1184H2(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001ဉ\u0000\u0002စ\u0001\u0003᠌\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", C1256a0.f5786u, "zzh", C1344w0.class, "zzi", C1336u0.class, "zzj", C1162C0.class, "zzk", C1154A0.class});
        }
        if (i4 == 3) {
            return new C1352y0();
        }
        if (i4 == 4) {
            return new C1348x0(zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}

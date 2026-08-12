package p119l2;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l2.a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1991a implements Executor {

    /* JADX INFO: renamed from: g */
    public static final EnumC1991a f8697g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ EnumC1991a[] f8698h;

    static {
        EnumC1991a enumC1991a = new EnumC1991a("INSTANCE", 0);
        f8697g = enumC1991a;
        f8698h = new EnumC1991a[]{enumC1991a};
    }

    public static EnumC1991a valueOf(String str) {
        return (EnumC1991a) Enum.valueOf(EnumC1991a.class, str);
    }

    public static EnumC1991a[] values() {
        return (EnumC1991a[]) f8698h.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}

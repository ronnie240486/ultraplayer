package p151t2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: t2.a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2278a {

    /* JADX INFO: renamed from: g */
    public static final EnumC2278a f9747g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ EnumC2278a[] f9748h;

    static {
        EnumC2278a enumC2278a = new EnumC2278a("COROUTINE_SUSPENDED", 0);
        f9747g = enumC2278a;
        f9748h = new EnumC2278a[]{enumC2278a, new EnumC2278a("UNDECIDED", 1), new EnumC2278a("RESUMED", 2)};
    }

    public static EnumC2278a valueOf(String str) {
        return (EnumC2278a) Enum.valueOf(EnumC2278a.class, str);
    }

    public static EnumC2278a[] values() {
        return (EnumC2278a[]) f9748h.clone();
    }
}

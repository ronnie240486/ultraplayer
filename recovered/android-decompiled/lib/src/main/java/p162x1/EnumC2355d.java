package p162x1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: x1.d */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2355d {

    /* JADX INFO: renamed from: g */
    public static final EnumC2355d f9888g;

    /* JADX INFO: renamed from: h */
    public static final EnumC2355d f9889h;

    /* JADX INFO: renamed from: i */
    public static final EnumC2355d f9890i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC2355d[] f9891j;

    static {
        EnumC2355d enumC2355d = new EnumC2355d("NETWORK_UNMETERED", 0);
        f9888g = enumC2355d;
        EnumC2355d enumC2355d2 = new EnumC2355d("DEVICE_IDLE", 1);
        f9889h = enumC2355d2;
        EnumC2355d enumC2355d3 = new EnumC2355d("DEVICE_CHARGING", 2);
        f9890i = enumC2355d3;
        f9891j = new EnumC2355d[]{enumC2355d, enumC2355d2, enumC2355d3};
    }

    public static EnumC2355d valueOf(String str) {
        return (EnumC2355d) Enum.valueOf(EnumC2355d.class, str);
    }

    public static EnumC2355d[] values() {
        return (EnumC2355d[]) f9891j.clone();
    }
}

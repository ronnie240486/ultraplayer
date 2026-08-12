package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.m */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1000m {

    /* JADX INFO: renamed from: g */
    public static final EnumC1000m f4313g;

    /* JADX INFO: renamed from: h */
    public static final EnumC1000m f4314h;

    /* JADX INFO: renamed from: i */
    public static final EnumC1000m f4315i;

    /* JADX INFO: renamed from: j */
    public static final EnumC1000m f4316j;

    /* JADX INFO: renamed from: k */
    public static final EnumC1000m f4317k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ EnumC1000m[] f4318l;

    static {
        EnumC1000m enumC1000m = new EnumC1000m("DESTROYED", 0);
        f4313g = enumC1000m;
        EnumC1000m enumC1000m2 = new EnumC1000m("INITIALIZED", 1);
        f4314h = enumC1000m2;
        EnumC1000m enumC1000m3 = new EnumC1000m("CREATED", 2);
        f4315i = enumC1000m3;
        EnumC1000m enumC1000m4 = new EnumC1000m("STARTED", 3);
        f4316j = enumC1000m4;
        EnumC1000m enumC1000m5 = new EnumC1000m("RESUMED", 4);
        f4317k = enumC1000m5;
        f4318l = new EnumC1000m[]{enumC1000m, enumC1000m2, enumC1000m3, enumC1000m4, enumC1000m5};
    }

    public static EnumC1000m valueOf(String str) {
        return (EnumC1000m) Enum.valueOf(EnumC1000m.class, str);
    }

    public static EnumC1000m[] values() {
        return (EnumC1000m[]) f4318l.clone();
    }
}

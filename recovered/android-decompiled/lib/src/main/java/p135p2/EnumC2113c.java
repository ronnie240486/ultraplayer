package p135p2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: p2.c */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2113c {

    /* JADX INFO: renamed from: g */
    public static final EnumC2113c f9143g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ EnumC2113c[] f9144h;

    static {
        EnumC2113c enumC2113c = new EnumC2113c("DEFAULT", 0);
        f9143g = enumC2113c;
        f9144h = new EnumC2113c[]{enumC2113c, new EnumC2113c("SIGNED", 1), new EnumC2113c("FIXED", 2)};
    }

    public static EnumC2113c valueOf(String str) {
        return (EnumC2113c) Enum.valueOf(EnumC2113c.class, str);
    }

    public static EnumC2113c[] values() {
        return (EnumC2113c[]) f9144h.clone();
    }
}

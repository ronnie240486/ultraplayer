package p134p1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: p1.p */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2103p {

    /* JADX INFO: renamed from: g */
    public static final EnumC2103p f9133g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ EnumC2103p[] f9134h;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2103p EF2;

    static {
        EnumC2103p enumC2103p = new EnumC2103p("UNKNOWN", 0);
        EnumC2103p enumC2103p2 = new EnumC2103p("ANDROID_FIREBASE", 1);
        f9133g = enumC2103p2;
        f9134h = new EnumC2103p[]{enumC2103p, enumC2103p2};
    }

    public static EnumC2103p valueOf(String str) {
        return (EnumC2103p) Enum.valueOf(EnumC2103p.class, str);
    }

    public static EnumC2103p[] values() {
        return (EnumC2103p[]) f9134h.clone();
    }
}

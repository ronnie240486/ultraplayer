package p035M;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: M.b */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0361b {

    /* JADX INFO: renamed from: g */
    public static final EnumC0361b f1156g;

    /* JADX INFO: renamed from: h */
    public static final EnumC0361b f1157h;

    /* JADX INFO: renamed from: i */
    public static final EnumC0361b f1158i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC0361b[] f1159j;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0361b EF8;

    static {
        EnumC0361b enumC0361b = new EnumC0361b("PENALTY_LOG", 0);
        EnumC0361b enumC0361b2 = new EnumC0361b("PENALTY_DEATH", 1);
        EnumC0361b enumC0361b3 = new EnumC0361b("DETECT_FRAGMENT_REUSE", 2);
        f1156g = enumC0361b3;
        EnumC0361b enumC0361b4 = new EnumC0361b("DETECT_FRAGMENT_TAG_USAGE", 3);
        f1157h = enumC0361b4;
        EnumC0361b enumC0361b5 = new EnumC0361b("DETECT_RETAIN_INSTANCE_USAGE", 4);
        EnumC0361b enumC0361b6 = new EnumC0361b("DETECT_SET_USER_VISIBLE_HINT", 5);
        EnumC0361b enumC0361b7 = new EnumC0361b("DETECT_TARGET_FRAGMENT_USAGE", 6);
        EnumC0361b enumC0361b8 = new EnumC0361b("DETECT_WRONG_FRAGMENT_CONTAINER", 7);
        f1158i = enumC0361b8;
        f1159j = new EnumC0361b[]{enumC0361b, enumC0361b2, enumC0361b3, enumC0361b4, enumC0361b5, enumC0361b6, enumC0361b7, enumC0361b8};
    }

    public static EnumC0361b valueOf(String str) {
        return (EnumC0361b) Enum.valueOf(EnumC0361b.class, str);
    }

    public static EnumC0361b[] values() {
        return (EnumC0361b[]) f1159j.clone();
    }
}

package p126n1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: n1.c */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2048c {

    /* JADX INFO: renamed from: g */
    public static final EnumC2048c f8921g;

    /* JADX INFO: renamed from: h */
    public static final EnumC2048c f8922h;

    /* JADX INFO: renamed from: i */
    public static final EnumC2048c f8923i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC2048c[] f8924j;

    static {
        EnumC2048c enumC2048c = new EnumC2048c("DEFAULT", 0);
        f8921g = enumC2048c;
        EnumC2048c enumC2048c2 = new EnumC2048c("VERY_LOW", 1);
        f8922h = enumC2048c2;
        EnumC2048c enumC2048c3 = new EnumC2048c("HIGHEST", 2);
        f8923i = enumC2048c3;
        f8924j = new EnumC2048c[]{enumC2048c, enumC2048c2, enumC2048c3};
    }

    public static EnumC2048c valueOf(String str) {
        return (EnumC2048c) Enum.valueOf(EnumC2048c.class, str);
    }

    public static EnumC2048c[] values() {
        return (EnumC2048c[]) f8924j.clone();
    }
}

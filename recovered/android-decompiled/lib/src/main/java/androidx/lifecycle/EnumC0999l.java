package androidx.lifecycle;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.l */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0999l {
    private static final /* synthetic */ EnumC0999l[] $VALUES;
    public static final C0997j Companion;
    public static final EnumC0999l ON_ANY;
    public static final EnumC0999l ON_CREATE;
    public static final EnumC0999l ON_DESTROY;
    public static final EnumC0999l ON_PAUSE;
    public static final EnumC0999l ON_RESUME;
    public static final EnumC0999l ON_START;
    public static final EnumC0999l ON_STOP;

    static {
        EnumC0999l enumC0999l = new EnumC0999l("ON_CREATE", 0);
        ON_CREATE = enumC0999l;
        EnumC0999l enumC0999l2 = new EnumC0999l("ON_START", 1);
        ON_START = enumC0999l2;
        EnumC0999l enumC0999l3 = new EnumC0999l("ON_RESUME", 2);
        ON_RESUME = enumC0999l3;
        EnumC0999l enumC0999l4 = new EnumC0999l("ON_PAUSE", 3);
        ON_PAUSE = enumC0999l4;
        EnumC0999l enumC0999l5 = new EnumC0999l("ON_STOP", 4);
        ON_STOP = enumC0999l5;
        EnumC0999l enumC0999l6 = new EnumC0999l("ON_DESTROY", 5);
        ON_DESTROY = enumC0999l6;
        EnumC0999l enumC0999l7 = new EnumC0999l("ON_ANY", 6);
        ON_ANY = enumC0999l7;
        $VALUES = new EnumC0999l[]{enumC0999l, enumC0999l2, enumC0999l3, enumC0999l4, enumC0999l5, enumC0999l6, enumC0999l7};
        Companion = new C0997j();
    }

    public static EnumC0999l valueOf(String str) {
        return (EnumC0999l) Enum.valueOf(EnumC0999l.class, str);
    }

    public static EnumC0999l[] values() {
        return (EnumC0999l[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: a */
    public final EnumC1000m m2563a() {
        switch (AbstractC0998k.f4312a[ordinal()]) {
            case 1:
            case 2:
                return EnumC1000m.f4315i;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
            case 4:
                return EnumC1000m.f4316j;
            case 5:
                return EnumC1000m.f4317k;
            case 6:
                return EnumC1000m.f4313g;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}

package p134p1;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: p1.w */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2110w {

    /* JADX INFO: renamed from: g */
    public static final EnumC2110w f9139g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ EnumC2110w[] f9140h;

    static {
        EnumC2110w enumC2110w = new EnumC2110w("DEFAULT", 0);
        f9139g = enumC2110w;
        EnumC2110w enumC2110w2 = new EnumC2110w("UNMETERED_ONLY", 1);
        EnumC2110w enumC2110w3 = new EnumC2110w("UNMETERED_OR_DAILY", 2);
        EnumC2110w enumC2110w4 = new EnumC2110w("FAST_IF_RADIO_AWAKE", 3);
        EnumC2110w enumC2110w5 = new EnumC2110w("NEVER", 4);
        EnumC2110w enumC2110w6 = new EnumC2110w("UNRECOGNIZED", 5);
        f9140h = new EnumC2110w[]{enumC2110w, enumC2110w2, enumC2110w3, enumC2110w4, enumC2110w5, enumC2110w6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, enumC2110w);
        sparseArray.put(1, enumC2110w2);
        sparseArray.put(2, enumC2110w3);
        sparseArray.put(3, enumC2110w4);
        sparseArray.put(4, enumC2110w5);
        sparseArray.put(-1, enumC2110w6);
    }

    public static EnumC2110w valueOf(String str) {
        return (EnumC2110w) Enum.valueOf(EnumC2110w.class, str);
    }

    public static EnumC2110w[] values() {
        return (EnumC2110w[]) f9140h.clone();
    }
}

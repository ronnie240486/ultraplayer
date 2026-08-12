package p134p1;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: p1.t */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2107t {

    /* JADX INFO: renamed from: g */
    public static final SparseArray f9135g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ EnumC2107t[] f9136h;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2107t EF5;

    static {
        EnumC2107t enumC2107t = new EnumC2107t("UNKNOWN_MOBILE_SUBTYPE", 0);
        EnumC2107t enumC2107t2 = new EnumC2107t("GPRS", 1);
        EnumC2107t enumC2107t3 = new EnumC2107t("EDGE", 2);
        EnumC2107t enumC2107t4 = new EnumC2107t("UMTS", 3);
        EnumC2107t enumC2107t5 = new EnumC2107t("CDMA", 4);
        EnumC2107t enumC2107t6 = new EnumC2107t("EVDO_0", 5);
        EnumC2107t enumC2107t7 = new EnumC2107t("EVDO_A", 6);
        EnumC2107t enumC2107t8 = new EnumC2107t("RTT", 7);
        EnumC2107t enumC2107t9 = new EnumC2107t("HSDPA", 8);
        EnumC2107t enumC2107t10 = new EnumC2107t("HSUPA", 9);
        EnumC2107t enumC2107t11 = new EnumC2107t("HSPA", 10);
        EnumC2107t enumC2107t12 = new EnumC2107t("IDEN", 11);
        EnumC2107t enumC2107t13 = new EnumC2107t("EVDO_B", 12);
        EnumC2107t enumC2107t14 = new EnumC2107t("LTE", 13);
        EnumC2107t enumC2107t15 = new EnumC2107t("EHRPD", 14);
        EnumC2107t enumC2107t16 = new EnumC2107t("HSPAP", 15);
        EnumC2107t enumC2107t17 = new EnumC2107t("GSM", 16);
        EnumC2107t enumC2107t18 = new EnumC2107t("TD_SCDMA", 17);
        EnumC2107t enumC2107t19 = new EnumC2107t("IWLAN", 18);
        EnumC2107t enumC2107t20 = new EnumC2107t("LTE_CA", 19);
        f9136h = new EnumC2107t[]{enumC2107t, enumC2107t2, enumC2107t3, enumC2107t4, enumC2107t5, enumC2107t6, enumC2107t7, enumC2107t8, enumC2107t9, enumC2107t10, enumC2107t11, enumC2107t12, enumC2107t13, enumC2107t14, enumC2107t15, enumC2107t16, enumC2107t17, enumC2107t18, enumC2107t19, enumC2107t20, new EnumC2107t("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        f9135g = sparseArray;
        sparseArray.put(0, enumC2107t);
        sparseArray.put(1, enumC2107t2);
        sparseArray.put(2, enumC2107t3);
        sparseArray.put(3, enumC2107t4);
        sparseArray.put(4, enumC2107t5);
        sparseArray.put(5, enumC2107t6);
        sparseArray.put(6, enumC2107t7);
        sparseArray.put(7, enumC2107t8);
        sparseArray.put(8, enumC2107t9);
        sparseArray.put(9, enumC2107t10);
        sparseArray.put(10, enumC2107t11);
        sparseArray.put(11, enumC2107t12);
        sparseArray.put(12, enumC2107t13);
        sparseArray.put(13, enumC2107t14);
        sparseArray.put(14, enumC2107t15);
        sparseArray.put(15, enumC2107t16);
        sparseArray.put(16, enumC2107t17);
        sparseArray.put(17, enumC2107t18);
        sparseArray.put(18, enumC2107t19);
        sparseArray.put(19, enumC2107t20);
    }

    public static EnumC2107t valueOf(String str) {
        return (EnumC2107t) Enum.valueOf(EnumC2107t.class, str);
    }

    public static EnumC2107t[] values() {
        return (EnumC2107t[]) f9136h.clone();
    }
}

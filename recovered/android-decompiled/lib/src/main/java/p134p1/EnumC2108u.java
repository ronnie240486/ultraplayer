package p134p1;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: p1.u */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2108u {

    /* JADX INFO: renamed from: g */
    public static final SparseArray f9137g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ EnumC2108u[] f9138h;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2108u EF3;

    static {
        EnumC2108u enumC2108u = new EnumC2108u("MOBILE", 0);
        EnumC2108u enumC2108u2 = new EnumC2108u("WIFI", 1);
        EnumC2108u enumC2108u3 = new EnumC2108u("MOBILE_MMS", 2);
        EnumC2108u enumC2108u4 = new EnumC2108u("MOBILE_SUPL", 3);
        EnumC2108u enumC2108u5 = new EnumC2108u("MOBILE_DUN", 4);
        EnumC2108u enumC2108u6 = new EnumC2108u("MOBILE_HIPRI", 5);
        EnumC2108u enumC2108u7 = new EnumC2108u("WIMAX", 6);
        EnumC2108u enumC2108u8 = new EnumC2108u("BLUETOOTH", 7);
        EnumC2108u enumC2108u9 = new EnumC2108u("DUMMY", 8);
        EnumC2108u enumC2108u10 = new EnumC2108u("ETHERNET", 9);
        EnumC2108u enumC2108u11 = new EnumC2108u("MOBILE_FOTA", 10);
        EnumC2108u enumC2108u12 = new EnumC2108u("MOBILE_IMS", 11);
        EnumC2108u enumC2108u13 = new EnumC2108u("MOBILE_CBS", 12);
        EnumC2108u enumC2108u14 = new EnumC2108u("WIFI_P2P", 13);
        EnumC2108u enumC2108u15 = new EnumC2108u("MOBILE_IA", 14);
        EnumC2108u enumC2108u16 = new EnumC2108u("MOBILE_EMERGENCY", 15);
        EnumC2108u enumC2108u17 = new EnumC2108u("PROXY", 16);
        EnumC2108u enumC2108u18 = new EnumC2108u("VPN", 17);
        EnumC2108u enumC2108u19 = new EnumC2108u("NONE", 18);
        f9138h = new EnumC2108u[]{enumC2108u, enumC2108u2, enumC2108u3, enumC2108u4, enumC2108u5, enumC2108u6, enumC2108u7, enumC2108u8, enumC2108u9, enumC2108u10, enumC2108u11, enumC2108u12, enumC2108u13, enumC2108u14, enumC2108u15, enumC2108u16, enumC2108u17, enumC2108u18, enumC2108u19};
        SparseArray sparseArray = new SparseArray();
        f9137g = sparseArray;
        sparseArray.put(0, enumC2108u);
        sparseArray.put(1, enumC2108u2);
        sparseArray.put(2, enumC2108u3);
        sparseArray.put(3, enumC2108u4);
        sparseArray.put(4, enumC2108u5);
        sparseArray.put(5, enumC2108u6);
        sparseArray.put(6, enumC2108u7);
        sparseArray.put(7, enumC2108u8);
        sparseArray.put(8, enumC2108u9);
        sparseArray.put(9, enumC2108u10);
        sparseArray.put(10, enumC2108u11);
        sparseArray.put(11, enumC2108u12);
        sparseArray.put(12, enumC2108u13);
        sparseArray.put(13, enumC2108u14);
        sparseArray.put(14, enumC2108u15);
        sparseArray.put(15, enumC2108u16);
        sparseArray.put(16, enumC2108u17);
        sparseArray.put(17, enumC2108u18);
        sparseArray.put(-1, enumC2108u19);
    }

    public static EnumC2108u valueOf(String str) {
        return (EnumC2108u) Enum.valueOf(EnumC2108u.class, str);
    }

    public static EnumC2108u[] values() {
        return (EnumC2108u[]) f9138h.clone();
    }
}

package p013E1;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import p009D0.C0106b;
import p034L1.C0348c;
import p045P0.AbstractC0462h;

/* JADX INFO: renamed from: E1.y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0150y {

    /* JADX INFO: renamed from: a */
    public static final C0348c f352a;

    /* JADX INFO: renamed from: b */
    public static final C0348c f353b;

    /* JADX INFO: renamed from: c */
    public static final C0348c f354c;

    /* JADX INFO: renamed from: d */
    public static final C0348c f355d;

    /* JADX INFO: renamed from: e */
    public static final C0348c[] f356e;

    static {
        C0348c c0348c = new C0348c("client_side_logging");
        C0348c c0348c2 = new C0348c("cxless_client_minimal");
        f352a = c0348c2;
        C0348c c0348c3 = new C0348c("cxless_caf_control");
        C0348c c0348c4 = new C0348c("module_flag_control");
        f353b = c0348c4;
        C0348c c0348c5 = new C0348c("discovery_hint_supply");
        C0348c c0348c6 = new C0348c("relay_casting_set_active_account");
        C0348c c0348c7 = new C0348c("analytics_proto_enum_translation");
        f354c = c0348c7;
        C0348c c0348c8 = new C0348c("integer_to_integer_map");
        f355d = c0348c8;
        f356e = new C0348c[]{c0348c, c0348c2, c0348c3, c0348c4, c0348c5, c0348c6, c0348c7, c0348c8, new C0348c("relay_casting_set_remote_casting_mode"), new C0348c("get_relay_access_token"), new C0348c("get_cast_settings"), new C0348c("set_bundle_setting"), new C0348c("get_client_updated_info")};
    }

    /* JADX INFO: renamed from: a */
    public static String m606a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("applicationId cannot be null");
        }
        return C0106b.m502K(new C0106b(str, 1, null));
    }

    /* JADX INFO: renamed from: b */
    public static String m607b(int i3) {
        switch (i3) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return AbstractC0462h.m1165e(i3, "unknown status code: ");
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }
}

package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Looper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.util.HashSet;
import java.util.Iterator;
import p028J1.C0296b;
import p075Z1.HandlerC0784e;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.D0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1166D0 {

    /* JADX INFO: renamed from: i */
    public static final C0296b f5593i = new C0296b("FeatureUsageAnalytics", null);

    /* JADX INFO: renamed from: j */
    public static final String f5594j = "21.4.0";

    /* JADX INFO: renamed from: k */
    public static C1166D0 f5595k;

    /* JADX INFO: renamed from: a */
    public final C1209O f5596a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f5597b;

    /* JADX INFO: renamed from: c */
    public final String f5598c;

    /* JADX INFO: renamed from: h */
    public long f5603h;

    /* JADX INFO: renamed from: f */
    public final HashSet f5601f = new HashSet();

    /* JADX INFO: renamed from: g */
    public final HashSet f5602g = new HashSet();

    /* JADX INFO: renamed from: e */
    public final HandlerC0784e f5600e = new HandlerC0784e(Looper.getMainLooper(), 3);

    /* JADX INFO: renamed from: d */
    public final RunnableC1347x f5599d = new RunnableC1347x(2, this);

    public C1166D0(SharedPreferences sharedPreferences, C1209O c1209o, String str) {
        this.f5597b = sharedPreferences;
        this.f5596a = c1209o;
        this.f5598c = str;
    }

    /* JADX INFO: renamed from: a */
    public static void m3123a(EnumC1272e0 enumC1272e0) {
        C1166D0 c1166d0;
        if (!C1209O.f5668j || (c1166d0 = f5595k) == null) {
            return;
        }
        String string = Integer.toString(enumC1272e0.f5898g);
        SharedPreferences sharedPreferences = c1166d0.f5597b;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        String str = "feature_usage_timestamp_reported_feature_" + string;
        if (!sharedPreferences.contains(str)) {
            str = "feature_usage_timestamp_detected_feature_" + string;
        }
        editorEdit.putLong(str, System.currentTimeMillis()).apply();
        c1166d0.f5601f.add(enumC1272e0);
        c1166d0.f5600e.post(c1166d0.f5599d);
    }

    /* JADX INFO: renamed from: b */
    public static EnumC1272e0 m3124b(String str) {
        EnumC1272e0 enumC1272e0 = EnumC1272e0.DEVELOPER_FEATURE_FLAG_UNKNOWN;
        try {
            switch (Integer.parseInt(str)) {
                case 0:
                    return enumC1272e0;
                case 1:
                    return EnumC1272e0.CAF_CAST_BUTTON;
                case 2:
                    return EnumC1272e0.CAF_EXPANDED_CONTROLLER;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    return EnumC1272e0.CAF_MINI_CONTROLLER;
                case 4:
                    return EnumC1272e0.CAF_CONTAINER_CONTROLLER;
                case 5:
                    return EnumC1272e0.CAST_CONTEXT;
                case 6:
                    return EnumC1272e0.IMAGE_CACHE;
                case 7:
                    return EnumC1272e0.IMAGE_PICKER;
                case 8:
                    return EnumC1272e0.AD_BREAK_PARSER;
                case 9:
                    return EnumC1272e0.UI_STYLE;
                case 10:
                    return EnumC1272e0.HARDWARE_VOLUME_BUTTON;
                case 11:
                    return EnumC1272e0.NON_CAST_DEVICE_PROVIDER;
                case 12:
                    return EnumC1272e0.PAUSE_CONTROLLER;
                case 13:
                    return EnumC1272e0.SEEK_CONTROLLER;
                case 14:
                    return EnumC1272e0.STREAM_VOLUME;
                case 15:
                    return EnumC1272e0.UI_MEDIA_CONTROLLER;
                case 16:
                    return EnumC1272e0.PLAYBACK_RATE_CONTROLLER;
                case 17:
                    return EnumC1272e0.PRECACHE;
                case 18:
                    return EnumC1272e0.INSTRUCTIONS_VIEW;
                case 19:
                    return EnumC1272e0.OPTION_SUSPEND_SESSIONS_WHEN_BACKGROUNDED;
                case 20:
                    return EnumC1272e0.OPTION_STOP_RECEIVER_APPLICATION_WHEN_ENDING_SESSION;
                case 21:
                    return EnumC1272e0.OPTION_DISABLE_DISCOVERY_AUTOSTART;
                case 22:
                    return EnumC1272e0.OPTION_DISABLE_ANALYTICS_LOGGING;
                case 23:
                    return EnumC1272e0.OPTION_PHYSICAL_VOLUME_BUTTONS_WILL_CONTROL_DEVICE_VOLUME;
                case 24:
                    return EnumC1272e0.CAF_EXPANDED_CONTROLLER_HIDE_STREAM_POSITION_CONTROLS_FOR_LIVE_CONTENT;
                case 25:
                    return EnumC1272e0.CAF_EXPANDED_CONTROLLER_WITH_LIVE_CONTENT;
                case 26:
                    return EnumC1272e0.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_OPTIONS;
                case 27:
                    return EnumC1272e0.REMOTE_MEDIA_CLIENT_QUEUE_LOAD_ITEMS_WITH_OPTIONS;
                case 28:
                    return EnumC1272e0.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_LOAD_REQUEST_DATA;
                case 29:
                    return EnumC1272e0.LAUNCH_OPTION_ANDROID_RECEIVER_COMPATIBLE;
                case 30:
                    return EnumC1272e0.CAST_CONTEXT_SET_LAUNCH_CREDENTIALS_DATA;
                case 31:
                    return EnumC1272e0.START_DISCOVERY_AFTER_FIRST_TAP_ON_CAST_BUTTON;
                case 32:
                    return EnumC1272e0.CAST_UNAVAILABLE_BUTTON_VISIBLE;
                case 33:
                    return EnumC1272e0.CAST_DEFAULT_MEDIA_ROUTER_DIALOG;
                case 34:
                    return EnumC1272e0.CAST_CUSTOM_MEDIA_ROUTER_DIALOG;
                case 35:
                    return EnumC1272e0.CAST_OUTPUT_SWITCHER_ENABLED;
                case 36:
                    return EnumC1272e0.CAST_TRANSFER_TO_LOCAL_ENABLED;
                case 37:
                    return EnumC1272e0.CAST_BUTTON_IS_TRIGGERED_DEFAULT_CAST_DIALOG_FALSE;
                case 38:
                    return EnumC1272e0.CAST_BUTTON_DELEGATE;
                case 39:
                    return EnumC1272e0.CAST_BUTTON_DELEGATE_PRESENT_LNA_PERMISSION_CUSTOM_DIALOG;
                case 40:
                    return EnumC1272e0.CAST_BUTTON_DELEGATE_PRESENT_CAST_STATE_CUSTOM_DIALOG;
                case 41:
                    return EnumC1272e0.CAST_TRANSFER_TO_LOCAL_USED;
                case 42:
                    return EnumC1272e0.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
                case 43:
                    return EnumC1272e0.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
                case 44:
                    return EnumC1272e0.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
                case 45:
                    return EnumC1272e0.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
                case 46:
                    return EnumC1272e0.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_TO_STRING;
                case 47:
                    return EnumC1272e0.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_STRING_TO_ENUM;
                case 48:
                    return EnumC1272e0.CAST_SLIDER_SET_AD_BLOCK_POSITIONS;
                case 49:
                    return EnumC1272e0.CAF_NOTIFICATION_SERVICE;
                case 50:
                    return EnumC1272e0.HARDWARE_VOLUME_BUTTON_PRESS;
                case 51:
                    return EnumC1272e0.CAST_SDK_DEFAULT_DEVICE_DIALOG;
                case 52:
                    return EnumC1272e0.CAST_SDK_CUSTOM_DEVICE_DIALOG;
                case 53:
                    return EnumC1272e0.PERSISTENT_CAST_BUTTON_DISCOVERY_DISABLED_WITH_CONFLICT_TYPES;
                case 54:
                    return EnumC1272e0.CAST_DEVICE_DIALOG_FACTORY_INSTANTIATED;
                case 55:
                    return EnumC1272e0.CAF_MEDIA_NOTIFICATION_PROXY;
                default:
                    return null;
            }
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3125c(HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f5597b.edit();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        editorEdit.apply();
    }
}

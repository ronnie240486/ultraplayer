package com.google.android.gms.cast.framework.media.internal;

import com.zuxoplayer.app.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p045P0.AbstractC0462h;

/* JADX INFO: loaded from: classes.dex */
public final class ResourceProvider {

    /* JADX INFO: renamed from: a */
    public static final Map f5479a;

    static {
        HashMap map = new HashMap();
        AbstractC0462h.m1168h(R.drawable.cast_ic_notification_small_icon, map, "smallIconDrawableResId", R.drawable.cast_ic_notification_stop_live_stream, "stopLiveStreamDrawableResId");
        AbstractC0462h.m1168h(R.drawable.cast_ic_notification_pause, map, "pauseDrawableResId", R.drawable.cast_ic_notification_play, "playDrawableResId");
        AbstractC0462h.m1168h(R.drawable.cast_ic_notification_skip_next, map, "skipNextDrawableResId", R.drawable.cast_ic_notification_skip_prev, "skipPrevDrawableResId");
        AbstractC0462h.m1168h(R.drawable.cast_ic_notification_forward, map, "forwardDrawableResId", R.drawable.cast_ic_notification_forward10, "forward10DrawableResId");
        AbstractC0462h.m1168h(R.drawable.cast_ic_notification_forward30, map, "forward30DrawableResId", R.drawable.cast_ic_notification_rewind, "rewindDrawableResId");
        AbstractC0462h.m1168h(R.drawable.cast_ic_notification_rewind10, map, "rewind10DrawableResId", R.drawable.cast_ic_notification_rewind30, "rewind30DrawableResId");
        AbstractC0462h.m1168h(R.drawable.cast_ic_notification_disconnect, map, "disconnectDrawableResId", R.dimen.cast_notification_image_size, "notificationImageSizeDimenResId");
        AbstractC0462h.m1168h(R.string.cast_casting_to_device, map, "castingToDeviceStringResId", R.string.cast_stop_live_stream, "stopLiveStreamStringResId");
        AbstractC0462h.m1168h(R.string.cast_pause, map, "pauseStringResId", R.string.cast_play, "playStringResId");
        AbstractC0462h.m1168h(R.string.cast_skip_next, map, "skipNextStringResId", R.string.cast_skip_prev, "skipPrevStringResId");
        AbstractC0462h.m1168h(R.string.cast_forward, map, "forwardStringResId", R.string.cast_forward_10, "forward10StringResId");
        AbstractC0462h.m1168h(R.string.cast_forward_30, map, "forward30StringResId", R.string.cast_rewind, "rewindStringResId");
        AbstractC0462h.m1168h(R.string.cast_rewind_10, map, "rewind10StringResId", R.string.cast_rewind_30, "rewind30StringResId");
        map.put("disconnectStringResId", Integer.valueOf(R.string.cast_disconnect));
        f5479a = Collections.unmodifiableMap(map);
    }

    public static Integer findResourceByName(String str) {
        if (str == null) {
            return null;
        }
        return (Integer) f5479a.get(str);
    }
}

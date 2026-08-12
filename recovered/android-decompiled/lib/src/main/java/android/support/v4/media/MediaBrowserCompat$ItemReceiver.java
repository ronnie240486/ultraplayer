package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C0858A;
import p076a.C0789e;

/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends C0789e {
    @Override // p076a.C0789e
    /* JADX INFO: renamed from: d */
    public final void mo1900d(int i3, Bundle bundle) {
        if (bundle != null) {
            bundle = C0858A.m2149Y(bundle);
        }
        if (i3 != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}

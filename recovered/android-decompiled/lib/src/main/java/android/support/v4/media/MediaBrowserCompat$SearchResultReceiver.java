package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C0858A;
import java.util.ArrayList;
import p076a.C0789e;

/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends C0789e {
    @Override // p076a.C0789e
    /* JADX INFO: renamed from: d */
    public final void mo1900d(int i3, Bundle bundle) {
        if (bundle != null) {
            bundle = C0858A.m2149Y(bundle);
        }
        if (i3 != 0 || bundle == null || !bundle.containsKey("search_results")) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        parcelableArray.getClass();
        ArrayList arrayList = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
        }
        throw null;
    }
}

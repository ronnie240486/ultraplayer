package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import androidx.mediarouter.app.C1048q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p124n.C2018e;

/* JADX INFO: renamed from: android.support.v4.media.session.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0869e extends MediaController.Callback {

    /* JADX INFO: renamed from: a */
    public final WeakReference f3681a;

    public C0869e(C1048q c1048q) {
        this.f3681a = new WeakReference(c1048q);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        if (((C1048q) this.f3681a.get()) != null) {
            playbackInfo.getPlaybackType();
            playbackInfo.getAudioAttributes();
            if (Build.VERSION.SDK_INT >= 26) {
            }
            playbackInfo.getVolumeControl();
            playbackInfo.getMaxVolume();
            playbackInfo.getCurrentVolume();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onExtrasChanged(Bundle bundle) {
        C0858A.m2152x(bundle);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel;
        C1048q c1048q = (C1048q) this.f3681a.get();
        if (c1048q != null) {
            C2018e c2018e = MediaMetadataCompat.f3627j;
            if (mediaMetadata != null) {
                Parcel parcelObtain = Parcel.obtain();
                mediaMetadata.writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                mediaMetadataCompatCreateFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain);
                parcelObtain.recycle();
                mediaMetadataCompatCreateFromParcel.f3632h = mediaMetadata;
            } else {
                mediaMetadataCompatCreateFromParcel = null;
            }
            c1048q.m2646a(mediaMetadataCompatCreateFromParcel);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        C1048q c1048q = (C1048q) this.f3681a.get();
        if (c1048q == null || c1048q.f4600c != null) {
            return;
        }
        c1048q.m2647b(PlaybackStateCompat.m2217d(playbackState));
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(List list) {
        MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem;
        if (((C1048q) this.f3681a.get()) == null || list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            if (obj != null) {
                MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
                mediaSessionCompat$QueueItem = new MediaSessionCompat$QueueItem(MediaDescriptionCompat.m2117d(AbstractC0889y.m2286b(queueItem)), AbstractC0889y.m2287c(queueItem));
            } else {
                mediaSessionCompat$QueueItem = null;
            }
            arrayList.add(mediaSessionCompat$QueueItem);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueTitleChanged(CharSequence charSequence) {
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionDestroyed() {
        C1048q c1048q = (C1048q) this.f3681a.get();
        if (c1048q != null) {
            c1048q.m2649d();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionEvent(String str, Bundle bundle) {
        C0858A.m2152x(bundle);
    }
}

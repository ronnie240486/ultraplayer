package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;

/* JADX INFO: renamed from: android.support.v4.media.session.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0890z implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3711a;

    public /* synthetic */ C0890z(int i3) {
        this.f3711a = i3;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f3711a) {
            case 0:
                MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
                mediaSessionCompat$ResultReceiverWrapper.f3652g = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return mediaSessionCompat$ResultReceiverWrapper;
            case 1:
                return new MediaSessionCompat$QueueItem(parcel);
            case 2:
                return new MediaSessionCompat$Token(parcel.readParcelable(null), null);
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.f3657g = parcel.readInt();
                parcelableVolumeInfo.f3659i = parcel.readInt();
                parcelableVolumeInfo.f3660j = parcel.readInt();
                parcelableVolumeInfo.f3661k = parcel.readInt();
                parcelableVolumeInfo.f3658h = parcel.readInt();
                return parcelableVolumeInfo;
            default:
                return new PlaybackStateCompat(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f3711a) {
            case 0:
                return new MediaSessionCompat$ResultReceiverWrapper[i3];
            case 1:
                return new MediaSessionCompat$QueueItem[i3];
            case 2:
                return new MediaSessionCompat$Token[i3];
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new ParcelableVolumeInfo[i3];
            default:
                return new PlaybackStateCompat[i3];
        }
    }
}

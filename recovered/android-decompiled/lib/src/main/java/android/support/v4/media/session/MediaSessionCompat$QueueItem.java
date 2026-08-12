package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

/* JADX INFO: loaded from: classes.dex */
public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new C0890z(1);

    /* JADX INFO: renamed from: g */
    public final MediaDescriptionCompat f3650g;

    /* JADX INFO: renamed from: h */
    public final long f3651h;

    public MediaSessionCompat$QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j3) {
        if (mediaDescriptionCompat == null) {
            throw new IllegalArgumentException("Description cannot be null");
        }
        if (j3 == -1) {
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }
        this.f3650g = mediaDescriptionCompat;
        this.f3651h = j3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaSession.QueueItem {Description=" + this.f3650g + ", Id=" + this.f3651h + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        this.f3650g.writeToParcel(parcel, i3);
        parcel.writeLong(this.f3651h);
    }

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.f3650g = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.f3651h = parcel.readLong();
    }
}

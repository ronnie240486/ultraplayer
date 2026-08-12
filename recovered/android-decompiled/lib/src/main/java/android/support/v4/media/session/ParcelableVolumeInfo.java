package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0890z(3);

    /* JADX INFO: renamed from: g */
    public int f3657g;

    /* JADX INFO: renamed from: h */
    public int f3658h;

    /* JADX INFO: renamed from: i */
    public int f3659i;

    /* JADX INFO: renamed from: j */
    public int f3660j;

    /* JADX INFO: renamed from: k */
    public int f3661k;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f3657g);
        parcel.writeInt(this.f3659i);
        parcel.writeInt(this.f3660j);
        parcel.writeInt(this.f3661k);
        parcel.writeInt(this.f3658h);
    }
}

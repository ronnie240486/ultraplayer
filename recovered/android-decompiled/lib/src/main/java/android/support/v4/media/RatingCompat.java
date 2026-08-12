package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import p076a.C0787c;

/* JADX INFO: loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0787c(4);

    /* JADX INFO: renamed from: g */
    public final int f3634g;

    /* JADX INFO: renamed from: h */
    public final float f3635h;

    public RatingCompat(int i3, float f) {
        this.f3634g = i3;
        this.f3635h = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f3634g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f3634g);
        sb.append(" rating=");
        float f = this.f3635h;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f3634g);
        parcel.writeFloat(this.f3635h);
    }
}

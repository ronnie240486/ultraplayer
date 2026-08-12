package p104h1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p076a.C0787c;

/* JADX INFO: renamed from: h1.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C1640Y implements Parcelable {
    public static final Parcelable.Creator<C1640Y> CREATOR = new C0787c(17);

    /* JADX INFO: renamed from: g */
    public int f7436g;

    /* JADX INFO: renamed from: h */
    public int f7437h;

    /* JADX INFO: renamed from: i */
    public int[] f7438i;

    /* JADX INFO: renamed from: j */
    public boolean f7439j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f7436g + ", mGapDir=" + this.f7437h + ", mHasUnwantedGapAfter=" + this.f7439j + ", mGapPerSpan=" + Arrays.toString(this.f7438i) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f7436g);
        parcel.writeInt(this.f7437h);
        parcel.writeInt(this.f7439j ? 1 : 0);
        int[] iArr = this.f7438i;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f7438i);
        }
    }
}

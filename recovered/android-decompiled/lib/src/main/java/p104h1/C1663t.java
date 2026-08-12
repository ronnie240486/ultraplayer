package p104h1;

import android.os.Parcel;
import android.os.Parcelable;
import p076a.C0787c;

/* JADX INFO: renamed from: h1.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1663t implements Parcelable {
    public static final Parcelable.Creator<C1663t> CREATOR = new C0787c(16);

    /* JADX INFO: renamed from: g */
    public int f7582g;

    /* JADX INFO: renamed from: h */
    public int f7583h;

    /* JADX INFO: renamed from: i */
    public boolean f7584i;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f7582g);
        parcel.writeInt(this.f7583h);
        parcel.writeInt(this.f7584i ? 1 : 0);
    }
}

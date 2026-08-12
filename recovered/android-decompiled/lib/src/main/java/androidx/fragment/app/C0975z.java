package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import p076a.C0787c;

/* JADX INFO: renamed from: androidx.fragment.app.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0975z implements Parcelable {
    public static final Parcelable.Creator<C0975z> CREATOR = new C0787c(8);

    /* JADX INFO: renamed from: g */
    public String f4271g;

    /* JADX INFO: renamed from: h */
    public int f4272h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f4271g);
        parcel.writeInt(this.f4272h);
    }
}

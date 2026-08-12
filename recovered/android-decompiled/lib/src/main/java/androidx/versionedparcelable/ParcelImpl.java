package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import p076a.C0787c;
import p122m1.C2005c;
import p122m1.InterfaceC2006d;

/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0787c(20);

    /* JADX INFO: renamed from: g */
    public final InterfaceC2006d f4807g;

    public ParcelImpl(InterfaceC2006d interfaceC2006d) {
        this.f4807g = interfaceC2006d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        new C2005c(parcel).m4564l(this.f4807g);
    }

    public ParcelImpl(Parcel parcel) {
        this.f4807g = new C2005c(parcel).m4560h();
    }
}

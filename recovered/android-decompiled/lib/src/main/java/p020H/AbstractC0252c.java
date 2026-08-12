package p020H;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: H.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0252c implements Parcelable {

    /* JADX INFO: renamed from: g */
    public final Parcelable f650g;

    /* JADX INFO: renamed from: h */
    public static final C0250a f649h = new C0250a();
    public static final Parcelable.Creator<AbstractC0252c> CREATOR = new C0251b(0);

    public AbstractC0252c() {
        this.f650g = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f650g, i3);
    }

    public AbstractC0252c(Parcelable parcelable) {
        if (parcelable != null) {
            this.f650g = parcelable == f649h ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC0252c(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f650g = parcelable == null ? f649h : parcelable;
    }
}

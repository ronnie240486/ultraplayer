package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p076a.C0787c;

/* JADX INFO: renamed from: androidx.fragment.app.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0952c implements Parcelable {
    public static final Parcelable.Creator<C0952c> CREATOR = new C0787c(7);

    /* JADX INFO: renamed from: g */
    public final ArrayList f4166g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f4167h;

    public C0952c(Parcel parcel) {
        this.f4166g = parcel.createStringArrayList();
        this.f4167h = parcel.createTypedArrayList(C0951b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeStringList(this.f4166g);
        parcel.writeTypedList(this.f4167h);
    }
}

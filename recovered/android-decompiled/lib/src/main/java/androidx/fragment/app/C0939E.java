package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p076a.C0787c;

/* JADX INFO: renamed from: androidx.fragment.app.E */
/* JADX INFO: loaded from: classes.dex */
public final class C0939E implements Parcelable {
    public static final Parcelable.Creator<C0939E> CREATOR = new C0787c(9);

    /* JADX INFO: renamed from: g */
    public ArrayList f4090g;

    /* JADX INFO: renamed from: h */
    public ArrayList f4091h;

    /* JADX INFO: renamed from: i */
    public C0951b[] f4092i;

    /* JADX INFO: renamed from: j */
    public int f4093j;

    /* JADX INFO: renamed from: k */
    public String f4094k;

    /* JADX INFO: renamed from: l */
    public ArrayList f4095l;

    /* JADX INFO: renamed from: m */
    public ArrayList f4096m;

    /* JADX INFO: renamed from: n */
    public ArrayList f4097n;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeStringList(this.f4090g);
        parcel.writeStringList(this.f4091h);
        parcel.writeTypedArray(this.f4092i, i3);
        parcel.writeInt(this.f4093j);
        parcel.writeString(this.f4094k);
        parcel.writeStringList(this.f4095l);
        parcel.writeTypedList(this.f4096m);
        parcel.writeTypedList(this.f4097n);
    }
}

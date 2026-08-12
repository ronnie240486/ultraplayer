package p104h1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p076a.C0787c;

/* JADX INFO: renamed from: h1.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C1641Z implements Parcelable {
    public static final Parcelable.Creator<C1641Z> CREATOR = new C0787c(18);

    /* JADX INFO: renamed from: g */
    public int f7440g;

    /* JADX INFO: renamed from: h */
    public int f7441h;

    /* JADX INFO: renamed from: i */
    public int f7442i;

    /* JADX INFO: renamed from: j */
    public int[] f7443j;

    /* JADX INFO: renamed from: k */
    public int f7444k;

    /* JADX INFO: renamed from: l */
    public int[] f7445l;

    /* JADX INFO: renamed from: m */
    public ArrayList f7446m;

    /* JADX INFO: renamed from: n */
    public boolean f7447n;

    /* JADX INFO: renamed from: o */
    public boolean f7448o;

    /* JADX INFO: renamed from: p */
    public boolean f7449p;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f7440g);
        parcel.writeInt(this.f7441h);
        parcel.writeInt(this.f7442i);
        if (this.f7442i > 0) {
            parcel.writeIntArray(this.f7443j);
        }
        parcel.writeInt(this.f7444k);
        if (this.f7444k > 0) {
            parcel.writeIntArray(this.f7445l);
        }
        parcel.writeInt(this.f7447n ? 1 : 0);
        parcel.writeInt(this.f7448o ? 1 : 0);
        parcel.writeInt(this.f7449p ? 1 : 0);
        parcel.writeList(this.f7446m);
    }
}

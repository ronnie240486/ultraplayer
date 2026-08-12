package p092e0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p076a.C0787c;

/* JADX INFO: renamed from: e0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1513r implements Parcelable {
    public static final Parcelable.Creator<C1513r> CREATOR = new C0787c(12);

    /* JADX INFO: renamed from: g */
    public final int f6817g;

    /* JADX INFO: renamed from: h */
    public final int f6818h;

    /* JADX INFO: renamed from: i */
    public final String f6819i;

    /* JADX INFO: renamed from: j */
    public final String f6820j;

    /* JADX INFO: renamed from: k */
    public final String f6821k;

    /* JADX INFO: renamed from: l */
    public final String f6822l;

    public C1513r(int i3, int i4, String str, String str2, String str3, String str4) {
        this.f6817g = i3;
        this.f6818h = i4;
        this.f6819i = str;
        this.f6820j = str2;
        this.f6821k = str3;
        this.f6822l = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1513r.class == obj.getClass()) {
            C1513r c1513r = (C1513r) obj;
            if (this.f6817g == c1513r.f6817g && this.f6818h == c1513r.f6818h && TextUtils.equals(this.f6819i, c1513r.f6819i) && TextUtils.equals(this.f6820j, c1513r.f6820j) && TextUtils.equals(this.f6821k, c1513r.f6821k) && TextUtils.equals(this.f6822l, c1513r.f6822l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = ((this.f6817g * 31) + this.f6818h) * 31;
        String str = this.f6819i;
        int iHashCode = (i3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6820j;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6821k;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f6822l;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f6817g);
        parcel.writeInt(this.f6818h);
        parcel.writeString(this.f6819i);
        parcel.writeString(this.f6820j);
        parcel.writeString(this.f6821k);
        parcel.writeString(this.f6822l);
    }

    public C1513r(Parcel parcel) {
        this.f6817g = parcel.readInt();
        this.f6818h = parcel.readInt();
        this.f6819i = parcel.readString();
        this.f6820j = parcel.readString();
        this.f6821k = parcel.readString();
        this.f6822l = parcel.readString();
    }
}

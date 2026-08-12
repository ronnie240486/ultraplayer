package p055T;

import android.os.Parcel;
import android.os.Parcelable;
import p024I0.C0271a;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: T.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C0554Q implements Comparable, Parcelable {
    public static final Parcelable.Creator<C0554Q> CREATOR = new C0271a(26);

    /* JADX INFO: renamed from: g */
    public final int f1963g;

    /* JADX INFO: renamed from: h */
    public final int f1964h;

    /* JADX INFO: renamed from: i */
    public final int f1965i;

    static {
        AbstractC0632A.m1566G(0);
        AbstractC0632A.m1566G(1);
        AbstractC0632A.m1566G(2);
    }

    public C0554Q(Parcel parcel) {
        this.f1963g = parcel.readInt();
        this.f1964h = parcel.readInt();
        this.f1965i = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0554Q c0554q = (C0554Q) obj;
        int i3 = this.f1963g - c0554q.f1963g;
        if (i3 != 0) {
            return i3;
        }
        int i4 = this.f1964h - c0554q.f1964h;
        return i4 == 0 ? this.f1965i - c0554q.f1965i : i4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0554Q.class == obj.getClass()) {
            C0554Q c0554q = (C0554Q) obj;
            if (this.f1963g == c0554q.f1963g && this.f1964h == c0554q.f1964h && this.f1965i == c0554q.f1965i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f1963g * 31) + this.f1964h) * 31) + this.f1965i;
    }

    public final String toString() {
        return this.f1963g + "." + this.f1964h + "." + this.f1965i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f1963g);
        parcel.writeInt(this.f1964h);
        parcel.writeInt(this.f1965i);
    }
}

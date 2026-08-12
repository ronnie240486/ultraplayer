package p018G0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import p007C0.C0101a;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: G0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0215e extends AbstractC0219i {
    public static final Parcelable.Creator<C0215e> CREATOR = new C0101a(15);

    /* JADX INFO: renamed from: h */
    public final String f497h;

    /* JADX INFO: renamed from: i */
    public final String f498i;

    /* JADX INFO: renamed from: j */
    public final String f499j;

    public C0215e(String str, String str2, String str3) {
        super("COMM");
        this.f497h = str;
        this.f498i = str2;
        this.f499j = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0215e.class == obj.getClass()) {
            C0215e c0215e = (C0215e) obj;
            int i3 = AbstractC0632A.f2454a;
            if (Objects.equals(this.f498i, c0215e.f498i) && Objects.equals(this.f497h, c0215e.f497h) && Objects.equals(this.f499j, c0215e.f499j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f497h;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f498i;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f499j;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p018G0.AbstractC0219i
    public final String toString() {
        return this.f509g + ": language=" + this.f497h + ", description=" + this.f498i + ", text=" + this.f499j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f509g);
        parcel.writeString(this.f497h);
        parcel.writeString(this.f499j);
    }

    public C0215e(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i3 = AbstractC0632A.f2454a;
        this.f497h = string;
        this.f498i = parcel.readString();
        this.f499j = parcel.readString();
    }
}

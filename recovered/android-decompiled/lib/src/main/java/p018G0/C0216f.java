package p018G0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import p007C0.C0101a;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: G0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0216f extends AbstractC0219i {
    public static final Parcelable.Creator<C0216f> CREATOR = new C0101a(16);

    /* JADX INFO: renamed from: h */
    public final String f500h;

    /* JADX INFO: renamed from: i */
    public final String f501i;

    /* JADX INFO: renamed from: j */
    public final String f502j;

    /* JADX INFO: renamed from: k */
    public final byte[] f503k;

    public C0216f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f500h = str;
        this.f501i = str2;
        this.f502j = str3;
        this.f503k = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0216f.class == obj.getClass()) {
            C0216f c0216f = (C0216f) obj;
            int i3 = AbstractC0632A.f2454a;
            if (Objects.equals(this.f500h, c0216f.f500h) && Objects.equals(this.f501i, c0216f.f501i) && Objects.equals(this.f502j, c0216f.f502j) && Arrays.equals(this.f503k, c0216f.f503k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f500h;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f501i;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f502j;
        return Arrays.hashCode(this.f503k) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // p018G0.AbstractC0219i
    public final String toString() {
        return this.f509g + ": mimeType=" + this.f500h + ", filename=" + this.f501i + ", description=" + this.f502j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f500h);
        parcel.writeString(this.f501i);
        parcel.writeString(this.f502j);
        parcel.writeByteArray(this.f503k);
    }

    public C0216f(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i3 = AbstractC0632A.f2454a;
        this.f500h = string;
        this.f501i = parcel.readString();
        this.f502j = parcel.readString();
        this.f503k = parcel.createByteArray();
    }
}

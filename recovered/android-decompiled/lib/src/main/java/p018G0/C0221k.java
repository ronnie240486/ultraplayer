package p018G0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import p007C0.C0101a;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: G0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0221k extends AbstractC0219i {
    public static final Parcelable.Creator<C0221k> CREATOR = new C0101a(17);

    /* JADX INFO: renamed from: h */
    public final String f511h;

    /* JADX INFO: renamed from: i */
    public final String f512i;

    /* JADX INFO: renamed from: j */
    public final String f513j;

    public C0221k(String str, String str2, String str3) {
        super("----");
        this.f511h = str;
        this.f512i = str2;
        this.f513j = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0221k.class == obj.getClass()) {
            C0221k c0221k = (C0221k) obj;
            int i3 = AbstractC0632A.f2454a;
            if (Objects.equals(this.f512i, c0221k.f512i) && Objects.equals(this.f511h, c0221k.f511h) && Objects.equals(this.f513j, c0221k.f513j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f511h;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f512i;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f513j;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p018G0.AbstractC0219i
    public final String toString() {
        return this.f509g + ": domain=" + this.f511h + ", description=" + this.f512i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f509g);
        parcel.writeString(this.f511h);
        parcel.writeString(this.f513j);
    }

    public C0221k(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i3 = AbstractC0632A.f2454a;
        this.f511h = string;
        this.f512i = parcel.readString();
        this.f513j = parcel.readString();
    }
}

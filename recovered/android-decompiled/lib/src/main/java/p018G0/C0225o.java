package p018G0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import p007C0.C0101a;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: G0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0225o extends AbstractC0219i {
    public static final Parcelable.Creator<C0225o> CREATOR = new C0101a(21);

    /* JADX INFO: renamed from: h */
    public final String f523h;

    /* JADX INFO: renamed from: i */
    public final String f524i;

    public C0225o(String str, String str2, String str3) {
        super(str);
        this.f523h = str2;
        this.f524i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0225o.class == obj.getClass()) {
            C0225o c0225o = (C0225o) obj;
            if (this.f509g.equals(c0225o.f509g)) {
                int i3 = AbstractC0632A.f2454a;
                if (Objects.equals(this.f523h, c0225o.f523h) && Objects.equals(this.f524i, c0225o.f524i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f509g.hashCode() + 527) * 31;
        String str = this.f523h;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f524i;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // p018G0.AbstractC0219i
    public final String toString() {
        return this.f509g + ": url=" + this.f524i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f509g);
        parcel.writeString(this.f523h);
        parcel.writeString(this.f524i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0225o(Parcel parcel) {
        String string = parcel.readString();
        int i3 = AbstractC0632A.f2454a;
        super(string);
        this.f523h = parcel.readString();
        this.f524i = parcel.readString();
    }
}

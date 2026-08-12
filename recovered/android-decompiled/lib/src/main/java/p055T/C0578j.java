package p055T;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
import p024I0.C0271a;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: T.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0578j implements Parcelable {
    public static final Parcelable.Creator<C0578j> CREATOR = new C0271a(24);

    /* JADX INFO: renamed from: g */
    public int f2081g;

    /* JADX INFO: renamed from: h */
    public final UUID f2082h;

    /* JADX INFO: renamed from: i */
    public final String f2083i;

    /* JADX INFO: renamed from: j */
    public final String f2084j;

    /* JADX INFO: renamed from: k */
    public final byte[] f2085k;

    public C0578j(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f2082h = uuid;
        this.f2083i = str;
        str2.getClass();
        this.f2084j = AbstractC0545H.m1364l(str2);
        this.f2085k = bArr;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1443d(UUID uuid) {
        UUID uuid2 = AbstractC0571e.f2057a;
        UUID uuid3 = this.f2082h;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0578j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0578j c0578j = (C0578j) obj;
        String str = c0578j.f2083i;
        int i3 = AbstractC0632A.f2454a;
        return Objects.equals(this.f2083i, str) && Objects.equals(this.f2084j, c0578j.f2084j) && Objects.equals(this.f2082h, c0578j.f2082h) && Arrays.equals(this.f2085k, c0578j.f2085k);
    }

    public final int hashCode() {
        if (this.f2081g == 0) {
            int iHashCode = this.f2082h.hashCode() * 31;
            String str = this.f2083i;
            this.f2081g = Arrays.hashCode(this.f2085k) + ((this.f2084j.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }
        return this.f2081g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        UUID uuid = this.f2082h;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f2083i);
        parcel.writeString(this.f2084j);
        parcel.writeByteArray(this.f2085k);
    }

    public C0578j(Parcel parcel) {
        this.f2082h = new UUID(parcel.readLong(), parcel.readLong());
        this.f2083i = parcel.readString();
        String string = parcel.readString();
        int i3 = AbstractC0632A.f2454a;
        this.f2084j = string;
        this.f2085k = parcel.createByteArray();
    }
}

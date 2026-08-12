package p018G0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import p007C0.C0101a;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: G0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0223m extends AbstractC0219i {
    public static final Parcelable.Creator<C0223m> CREATOR = new C0101a(19);

    /* JADX INFO: renamed from: h */
    public final String f519h;

    /* JADX INFO: renamed from: i */
    public final byte[] f520i;

    public C0223m(String str, byte[] bArr) {
        super("PRIV");
        this.f519h = str;
        this.f520i = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0223m.class == obj.getClass()) {
            C0223m c0223m = (C0223m) obj;
            int i3 = AbstractC0632A.f2454a;
            if (Objects.equals(this.f519h, c0223m.f519h) && Arrays.equals(this.f520i, c0223m.f520i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f519h;
        return Arrays.hashCode(this.f520i) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // p018G0.AbstractC0219i
    public final String toString() {
        return this.f509g + ": owner=" + this.f519h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f519h);
        parcel.writeByteArray(this.f520i);
    }

    public C0223m(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i3 = AbstractC0632A.f2454a;
        this.f519h = string;
        this.f520i = parcel.createByteArray();
    }
}

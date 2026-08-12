package p018G0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import p007C0.C0101a;
import p055T.C0541D;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: G0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0211a extends AbstractC0219i {
    public static final Parcelable.Creator<C0211a> CREATOR = new C0101a(11);

    /* JADX INFO: renamed from: h */
    public final String f481h;

    /* JADX INFO: renamed from: i */
    public final String f482i;

    /* JADX INFO: renamed from: j */
    public final int f483j;

    /* JADX INFO: renamed from: k */
    public final byte[] f484k;

    public C0211a(String str, String str2, int i3, byte[] bArr) {
        super("APIC");
        this.f481h = str;
        this.f482i = str2;
        this.f483j = i3;
        this.f484k = bArr;
    }

    @Override // p018G0.AbstractC0219i, p055T.InterfaceC0543F
    /* JADX INFO: renamed from: c */
    public final void mo499c(C0541D c0541d) {
        c0541d.m1349a(this.f484k, this.f483j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0211a.class == obj.getClass()) {
            C0211a c0211a = (C0211a) obj;
            if (this.f483j == c0211a.f483j) {
                int i3 = AbstractC0632A.f2454a;
                if (Objects.equals(this.f481h, c0211a.f481h) && Objects.equals(this.f482i, c0211a.f482i) && Arrays.equals(this.f484k, c0211a.f484k)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = (527 + this.f483j) * 31;
        String str = this.f481h;
        int iHashCode = (i3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f482i;
        return Arrays.hashCode(this.f484k) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // p018G0.AbstractC0219i
    public final String toString() {
        return this.f509g + ": mimeType=" + this.f481h + ", description=" + this.f482i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f481h);
        parcel.writeString(this.f482i);
        parcel.writeInt(this.f483j);
        parcel.writeByteArray(this.f484k);
    }

    public C0211a(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i3 = AbstractC0632A.f2454a;
        this.f481h = string;
        this.f482i = parcel.readString();
        this.f483j = parcel.readInt();
        this.f484k = parcel.createByteArray();
    }
}

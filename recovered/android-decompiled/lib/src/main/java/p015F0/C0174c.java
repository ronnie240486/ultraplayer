package p015F0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p007C0.C0101a;
import p055T.C0541D;
import p055T.C0583o;
import p055T.InterfaceC0543F;

/* JADX INFO: renamed from: F0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0174c implements InterfaceC0543F {
    public static final Parcelable.Creator<C0174c> CREATOR = new C0101a(7);

    /* JADX INFO: renamed from: g */
    public final byte[] f405g;

    /* JADX INFO: renamed from: h */
    public final String f406h;

    /* JADX INFO: renamed from: i */
    public final String f407i;

    public C0174c(String str, String str2, byte[] bArr) {
        this.f405g = bArr;
        this.f406h = str;
        this.f407i = str2;
    }

    @Override // p055T.InterfaceC0543F
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte[] mo497a() {
        return null;
    }

    @Override // p055T.InterfaceC0543F
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0583o mo498b() {
        return null;
    }

    @Override // p055T.InterfaceC0543F
    /* JADX INFO: renamed from: c */
    public final void mo499c(C0541D c0541d) {
        String str = this.f406h;
        if (str != null) {
            c0541d.f1884a = str;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0174c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f405g, ((C0174c) obj).f405g);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f405g);
    }

    public final String toString() {
        return "ICY: title=\"" + this.f406h + "\", url=\"" + this.f407i + "\", rawMetadata.length=\"" + this.f405g.length + "\"";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeByteArray(this.f405g);
        parcel.writeString(this.f406h);
        parcel.writeString(this.f407i);
    }

    public C0174c(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        bArrCreateByteArray.getClass();
        this.f405g = bArrCreateByteArray;
        this.f406h = parcel.readString();
        this.f407i = parcel.readString();
    }
}

package p018G0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p007C0.C0101a;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: G0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0222l extends AbstractC0219i {
    public static final Parcelable.Creator<C0222l> CREATOR = new C0101a(18);

    /* JADX INFO: renamed from: h */
    public final int f514h;

    /* JADX INFO: renamed from: i */
    public final int f515i;

    /* JADX INFO: renamed from: j */
    public final int f516j;

    /* JADX INFO: renamed from: k */
    public final int[] f517k;

    /* JADX INFO: renamed from: l */
    public final int[] f518l;

    public C0222l(int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f514h = i3;
        this.f515i = i4;
        this.f516j = i5;
        this.f517k = iArr;
        this.f518l = iArr2;
    }

    @Override // p018G0.AbstractC0219i, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0222l.class == obj.getClass()) {
            C0222l c0222l = (C0222l) obj;
            if (this.f514h == c0222l.f514h && this.f515i == c0222l.f515i && this.f516j == c0222l.f516j && Arrays.equals(this.f517k, c0222l.f517k) && Arrays.equals(this.f518l, c0222l.f518l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f518l) + ((Arrays.hashCode(this.f517k) + ((((((527 + this.f514h) * 31) + this.f515i) * 31) + this.f516j) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f514h);
        parcel.writeInt(this.f515i);
        parcel.writeInt(this.f516j);
        parcel.writeIntArray(this.f517k);
        parcel.writeIntArray(this.f518l);
    }

    public C0222l(Parcel parcel) {
        super("MLLT");
        this.f514h = parcel.readInt();
        this.f515i = parcel.readInt();
        this.f516j = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i3 = AbstractC0632A.f2454a;
        this.f517k = iArrCreateIntArray;
        this.f518l = parcel.createIntArray();
    }
}

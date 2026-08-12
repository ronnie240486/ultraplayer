package p024I0;

import android.os.Parcel;
import android.os.Parcelable;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: I0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0272b extends AbstractC0273c {
    public static final Parcelable.Creator<C0272b> CREATOR = new C0271a(0);

    /* JADX INFO: renamed from: g */
    public final long f727g;

    /* JADX INFO: renamed from: h */
    public final long f728h;

    /* JADX INFO: renamed from: i */
    public final byte[] f729i;

    public C0272b(long j3, byte[] bArr, long j4) {
        this.f727g = j4;
        this.f728h = j3;
        this.f729i = bArr;
    }

    @Override // p024I0.AbstractC0273c
    public final String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f727g + ", identifier= " + this.f728h + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeLong(this.f727g);
        parcel.writeLong(this.f728h);
        parcel.writeByteArray(this.f729i);
    }

    public C0272b(Parcel parcel) {
        this.f727g = parcel.readLong();
        this.f728h = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i3 = AbstractC0632A.f2454a;
        this.f729i = bArrCreateByteArray;
    }
}

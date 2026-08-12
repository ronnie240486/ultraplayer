package p021H0;

import android.os.Parcel;
import android.os.Parcelable;
import p007C0.C0101a;
import p055T.C0541D;
import p055T.C0583o;
import p055T.InterfaceC0543F;
import p122m1.AbstractC2003a;

/* JADX INFO: renamed from: H0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0253a implements InterfaceC0543F {
    public static final Parcelable.Creator<C0253a> CREATOR = new C0101a(26);

    /* JADX INFO: renamed from: g */
    public final long f651g;

    /* JADX INFO: renamed from: h */
    public final long f652h;

    /* JADX INFO: renamed from: i */
    public final long f653i;

    /* JADX INFO: renamed from: j */
    public final long f654j;

    /* JADX INFO: renamed from: k */
    public final long f655k;

    public C0253a(long j3, long j4, long j5, long j6, long j7) {
        this.f651g = j3;
        this.f652h = j4;
        this.f653i = j5;
        this.f654j = j6;
        this.f655k = j7;
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
    public final /* synthetic */ void mo499c(C0541D c0541d) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0253a.class == obj.getClass()) {
            C0253a c0253a = (C0253a) obj;
            if (this.f651g == c0253a.f651g && this.f652h == c0253a.f652h && this.f653i == c0253a.f653i && this.f654j == c0253a.f654j && this.f655k == c0253a.f655k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC2003a.m4542o(this.f655k) + ((AbstractC2003a.m4542o(this.f654j) + ((AbstractC2003a.m4542o(this.f653i) + ((AbstractC2003a.m4542o(this.f652h) + ((AbstractC2003a.m4542o(this.f651g) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f651g + ", photoSize=" + this.f652h + ", photoPresentationTimestampUs=" + this.f653i + ", videoStartPosition=" + this.f654j + ", videoSize=" + this.f655k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeLong(this.f651g);
        parcel.writeLong(this.f652h);
        parcel.writeLong(this.f653i);
        parcel.writeLong(this.f654j);
        parcel.writeLong(this.f655k);
    }

    public C0253a(Parcel parcel) {
        this.f651g = parcel.readLong();
        this.f652h = parcel.readLong();
        this.f653i = parcel.readLong();
        this.f654j = parcel.readLong();
        this.f655k = parcel.readLong();
    }
}

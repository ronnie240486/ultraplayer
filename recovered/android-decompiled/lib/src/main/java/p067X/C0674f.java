package p067X;

import android.os.Parcel;
import android.os.Parcelable;
import p024I0.C0271a;
import p055T.C0541D;
import p055T.C0583o;
import p055T.InterfaceC0543F;
import p122m1.AbstractC2003a;

/* JADX INFO: renamed from: X.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0674f implements InterfaceC0543F {
    public static final Parcelable.Creator<C0674f> CREATOR = new C0271a(29);

    /* JADX INFO: renamed from: g */
    public final long f2576g;

    /* JADX INFO: renamed from: h */
    public final long f2577h;

    /* JADX INFO: renamed from: i */
    public final long f2578i;

    public C0674f(long j3, long j4, long j5) {
        this.f2576g = j3;
        this.f2577h = j4;
        this.f2578i = j5;
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
        if (!(obj instanceof C0674f)) {
            return false;
        }
        C0674f c0674f = (C0674f) obj;
        return this.f2576g == c0674f.f2576g && this.f2577h == c0674f.f2577h && this.f2578i == c0674f.f2578i;
    }

    public final int hashCode() {
        return AbstractC2003a.m4542o(this.f2578i) + ((AbstractC2003a.m4542o(this.f2577h) + ((AbstractC2003a.m4542o(this.f2576g) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f2576g + ", modification time=" + this.f2577h + ", timescale=" + this.f2578i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeLong(this.f2576g);
        parcel.writeLong(this.f2577h);
        parcel.writeLong(this.f2578i);
    }

    public C0674f(Parcel parcel) {
        this.f2576g = parcel.readLong();
        this.f2577h = parcel.readLong();
        this.f2578i = parcel.readLong();
    }
}

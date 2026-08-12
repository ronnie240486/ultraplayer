package p067X;

import android.os.Parcel;
import android.os.Parcelable;
import p024I0.C0271a;
import p055T.C0541D;
import p055T.C0583o;
import p055T.InterfaceC0543F;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: X.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0673e implements InterfaceC0543F {
    public static final Parcelable.Creator<C0673e> CREATOR = new C0271a(28);

    /* JADX INFO: renamed from: g */
    public final float f2574g;

    /* JADX INFO: renamed from: h */
    public final float f2575h;

    public C0673e(float f, float f3) {
        AbstractC0646n.m1624b("Invalid latitude or longitude", f >= -90.0f && f <= 90.0f && f3 >= -180.0f && f3 <= 180.0f);
        this.f2574g = f;
        this.f2575h = f3;
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
        if (obj != null && C0673e.class == obj.getClass()) {
            C0673e c0673e = (C0673e) obj;
            if (this.f2574g == c0673e.f2574g && this.f2575h == c0673e.f2575h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f2575h).hashCode() + ((Float.valueOf(this.f2574g).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f2574g + ", longitude=" + this.f2575h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeFloat(this.f2574g);
        parcel.writeFloat(this.f2575h);
    }

    public C0673e(Parcel parcel) {
        this.f2574g = parcel.readFloat();
        this.f2575h = parcel.readFloat();
    }
}

package p021H0;

import android.os.Parcel;
import android.os.Parcelable;
import p007C0.C0101a;
import p055T.C0541D;
import p055T.C0583o;
import p055T.InterfaceC0543F;

/* JADX INFO: renamed from: H0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0256d implements InterfaceC0543F {
    public static final Parcelable.Creator<C0256d> CREATOR = new C0101a(29);

    /* JADX INFO: renamed from: g */
    public final float f660g;

    /* JADX INFO: renamed from: h */
    public final int f661h;

    public C0256d(int i3, float f) {
        this.f660g = f;
        this.f661h = i3;
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
        if (obj != null && C0256d.class == obj.getClass()) {
            C0256d c0256d = (C0256d) obj;
            if (this.f660g == c0256d.f660g && this.f661h == c0256d.f661h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f660g).hashCode() + 527) * 31) + this.f661h;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f660g + ", svcTemporalLayerCount=" + this.f661h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeFloat(this.f660g);
        parcel.writeInt(this.f661h);
    }

    public C0256d(Parcel parcel) {
        this.f660g = parcel.readFloat();
        this.f661h = parcel.readInt();
    }
}

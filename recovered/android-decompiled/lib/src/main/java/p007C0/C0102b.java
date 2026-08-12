package p007C0;

import android.os.Parcel;
import android.os.Parcelable;
import p055T.C0541D;
import p055T.C0583o;
import p055T.InterfaceC0543F;

/* JADX INFO: renamed from: C0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0102b implements InterfaceC0543F {
    public static final Parcelable.Creator<C0102b> CREATOR = new C0101a(0);

    /* JADX INFO: renamed from: g */
    public final int f128g;

    /* JADX INFO: renamed from: h */
    public final String f129h;

    public C0102b(int i3, String str) {
        this.f128g = i3;
        this.f129h = str;
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

    public final String toString() {
        return "Ait(controlCode=" + this.f128g + ",url=" + this.f129h + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f129h);
        parcel.writeInt(this.f128g);
    }
}

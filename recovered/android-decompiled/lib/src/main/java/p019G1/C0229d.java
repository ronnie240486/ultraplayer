package p019G1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import p007C0.C0101a;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: G1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0229d extends AbstractC0512a {
    public static final Parcelable.Creator<C0229d> CREATOR = new C0101a(25);

    /* JADX INFO: renamed from: g */
    public final String f548g;

    /* JADX INFO: renamed from: h */
    public final int f549h;

    /* JADX INFO: renamed from: i */
    public final String f550i;

    public C0229d(String str, String str2, int i3) {
        this.f548g = str;
        this.f549h = i3;
        this.f550i = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3299V(parcel, 2, this.f548g);
        AbstractC1303m.m3311d0(parcel, 3, 4);
        parcel.writeInt(this.f549h);
        AbstractC1303m.m3299V(parcel, 4, this.f550i);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}

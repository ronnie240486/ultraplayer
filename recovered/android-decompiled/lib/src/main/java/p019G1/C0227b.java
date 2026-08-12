package p019G1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import p007C0.C0101a;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: G1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0227b extends AbstractC0512a {
    public static final Parcelable.Creator<C0227b> CREATOR = new C0101a(24);

    /* JADX INFO: renamed from: g */
    public final int f532g;

    /* JADX INFO: renamed from: h */
    public final int f533h;

    /* JADX INFO: renamed from: i */
    public final int f534i;

    public C0227b(int i3, int i4, int i5) {
        this.f532g = i3;
        this.f533h = i4;
        this.f534i = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3311d0(parcel, 2, 4);
        parcel.writeInt(this.f532g);
        AbstractC1303m.m3311d0(parcel, 3, 4);
        parcel.writeInt(this.f533h);
        AbstractC1303m.m3311d0(parcel, 4, 4);
        parcel.writeInt(this.f534i);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}

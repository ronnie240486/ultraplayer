package p046P1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import p024I0.C0271a;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: P1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0481i extends AbstractC0512a {
    public static final Parcelable.Creator<C0481i> CREATOR = new C0271a(18);

    /* JADX INFO: renamed from: g */
    public final int f1608g;

    /* JADX INFO: renamed from: h */
    public final boolean f1609h;

    /* JADX INFO: renamed from: i */
    public final boolean f1610i;

    /* JADX INFO: renamed from: j */
    public final int f1611j;

    /* JADX INFO: renamed from: k */
    public final int f1612k;

    public C0481i(int i3, boolean z3, boolean z4, int i4, int i5) {
        this.f1608g = i3;
        this.f1609h = z3;
        this.f1610i = z4;
        this.f1611j = i4;
        this.f1612k = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3311d0(parcel, 1, 4);
        parcel.writeInt(this.f1608g);
        AbstractC1303m.m3311d0(parcel, 2, 4);
        parcel.writeInt(this.f1609h ? 1 : 0);
        AbstractC1303m.m3311d0(parcel, 3, 4);
        parcel.writeInt(this.f1610i ? 1 : 0);
        AbstractC1303m.m3311d0(parcel, 4, 4);
        parcel.writeInt(this.f1611j);
        AbstractC1303m.m3311d0(parcel, 5, 4);
        parcel.writeInt(this.f1612k);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}

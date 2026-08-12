package p046P1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import p024I0.C0271a;
import p034L1.C0348c;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: P1.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0497y extends AbstractC0512a {
    public static final Parcelable.Creator<C0497y> CREATOR = new C0271a(20);

    /* JADX INFO: renamed from: g */
    public Bundle f1648g;

    /* JADX INFO: renamed from: h */
    public C0348c[] f1649h;

    /* JADX INFO: renamed from: i */
    public int f1650i;

    /* JADX INFO: renamed from: j */
    public C0476d f1651j;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3294Q(parcel, 1, this.f1648g);
        AbstractC1303m.m3301X(parcel, 2, this.f1649h, i3);
        AbstractC1303m.m3311d0(parcel, 3, 4);
        parcel.writeInt(this.f1650i);
        AbstractC1303m.m3298U(parcel, 4, this.f1651j, i3);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}

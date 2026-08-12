package p046P1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import p024I0.C0271a;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: P1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0479g extends AbstractC0512a {
    public static final Parcelable.Creator<C0479g> CREATOR = new C0271a(15);

    /* JADX INFO: renamed from: g */
    public final int f1596g;

    /* JADX INFO: renamed from: h */
    public final int f1597h;

    /* JADX INFO: renamed from: i */
    public final int f1598i;

    /* JADX INFO: renamed from: j */
    public final long f1599j;

    /* JADX INFO: renamed from: k */
    public final long f1600k;

    /* JADX INFO: renamed from: l */
    public final String f1601l;

    /* JADX INFO: renamed from: m */
    public final String f1602m;

    /* JADX INFO: renamed from: n */
    public final int f1603n;

    /* JADX INFO: renamed from: o */
    public final int f1604o;

    public C0479g(int i3, int i4, int i5, long j3, long j4, String str, String str2, int i6, int i7) {
        this.f1596g = i3;
        this.f1597h = i4;
        this.f1598i = i5;
        this.f1599j = j3;
        this.f1600k = j4;
        this.f1601l = str;
        this.f1602m = str2;
        this.f1603n = i6;
        this.f1604o = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3311d0(parcel, 1, 4);
        parcel.writeInt(this.f1596g);
        AbstractC1303m.m3311d0(parcel, 2, 4);
        parcel.writeInt(this.f1597h);
        AbstractC1303m.m3311d0(parcel, 3, 4);
        parcel.writeInt(this.f1598i);
        AbstractC1303m.m3311d0(parcel, 4, 8);
        parcel.writeLong(this.f1599j);
        AbstractC1303m.m3311d0(parcel, 5, 8);
        parcel.writeLong(this.f1600k);
        AbstractC1303m.m3299V(parcel, 6, this.f1601l);
        AbstractC1303m.m3299V(parcel, 7, this.f1602m);
        AbstractC1303m.m3311d0(parcel, 8, 4);
        parcel.writeInt(this.f1603n);
        AbstractC1303m.m3311d0(parcel, 9, 4);
        parcel.writeInt(this.f1604o);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}

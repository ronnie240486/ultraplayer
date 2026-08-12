package p046P1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import p024I0.C0271a;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: P1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0476d extends AbstractC0512a {
    public static final Parcelable.Creator<C0476d> CREATOR = new C0271a(21);

    /* JADX INFO: renamed from: g */
    public final C0481i f1574g;

    /* JADX INFO: renamed from: h */
    public final boolean f1575h;

    /* JADX INFO: renamed from: i */
    public final boolean f1576i;

    /* JADX INFO: renamed from: j */
    public final int[] f1577j;

    /* JADX INFO: renamed from: k */
    public final int f1578k;

    /* JADX INFO: renamed from: l */
    public final int[] f1579l;

    public C0476d(C0481i c0481i, boolean z3, boolean z4, int[] iArr, int i3, int[] iArr2) {
        this.f1574g = c0481i;
        this.f1575h = z3;
        this.f1576i = z4;
        this.f1577j = iArr;
        this.f1578k = i3;
        this.f1579l = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3298U(parcel, 1, this.f1574g, i3);
        AbstractC1303m.m3311d0(parcel, 2, 4);
        parcel.writeInt(this.f1575h ? 1 : 0);
        AbstractC1303m.m3311d0(parcel, 3, 4);
        parcel.writeInt(this.f1576i ? 1 : 0);
        AbstractC1303m.m3296S(parcel, 4, this.f1577j);
        AbstractC1303m.m3311d0(parcel, 5, 4);
        parcel.writeInt(this.f1578k);
        AbstractC1303m.m3296S(parcel, 6, this.f1579l);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}

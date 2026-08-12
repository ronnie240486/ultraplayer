package p094e2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import p034L1.C0346a;
import p046P1.C0487o;
import p049Q1.AbstractC0512a;
import p076a.C0787c;

/* JADX INFO: renamed from: e2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1527e extends AbstractC0512a {
    public static final Parcelable.Creator<C1527e> CREATOR = new C0787c(15);

    /* JADX INFO: renamed from: g */
    public final int f6885g;

    /* JADX INFO: renamed from: h */
    public final C0346a f6886h;

    /* JADX INFO: renamed from: i */
    public final C0487o f6887i;

    public C1527e(int i3, C0346a c0346a, C0487o c0487o) {
        this.f6885g = i3;
        this.f6886h = c0346a;
        this.f6887i = c0487o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3311d0(parcel, 1, 4);
        parcel.writeInt(this.f6885g);
        AbstractC1303m.m3298U(parcel, 2, this.f6886h, i3);
        AbstractC1303m.m3298U(parcel, 3, this.f6887i, i3);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}

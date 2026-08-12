package p016F1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import p007C0.C0101a;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: F1.E */
/* JADX INFO: loaded from: classes.dex */
public final class C0179E extends AbstractC0512a {
    public static final Parcelable.Creator<C0179E> CREATOR = new C0101a(8);

    /* JADX INFO: renamed from: g */
    public final boolean f414g;

    public C0179E(boolean z3) {
        this.f414g = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3311d0(parcel, 2, 4);
        parcel.writeInt(this.f414g ? 1 : 0);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}

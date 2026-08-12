package p046P1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.List;
import p024I0.C0271a;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: P1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0482j extends AbstractC0512a {
    public static final Parcelable.Creator<C0482j> CREATOR = new C0271a(14);

    /* JADX INFO: renamed from: g */
    public final int f1613g;

    /* JADX INFO: renamed from: h */
    public List f1614h;

    public C0482j(int i3, List list) {
        this.f1613g = i3;
        this.f1614h = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3311d0(parcel, 1, 4);
        parcel.writeInt(this.f1613g);
        AbstractC1303m.m3302Y(parcel, 2, this.f1614h);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}

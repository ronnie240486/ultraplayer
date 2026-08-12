package p046P1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import p024I0.C0271a;
import p034L1.C0346a;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: P1.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0487o extends AbstractC0512a {
    public static final Parcelable.Creator<C0487o> CREATOR = new C0271a(17);

    /* JADX INFO: renamed from: g */
    public final int f1625g;

    /* JADX INFO: renamed from: h */
    public final IBinder f1626h;

    /* JADX INFO: renamed from: i */
    public final C0346a f1627i;

    /* JADX INFO: renamed from: j */
    public final boolean f1628j;

    /* JADX INFO: renamed from: k */
    public final boolean f1629k;

    public C0487o(int i3, IBinder iBinder, C0346a c0346a, boolean z3, boolean z4) {
        this.f1625g = i3;
        this.f1626h = iBinder;
        this.f1627i = c0346a;
        this.f1628j = z3;
        this.f1629k = z4;
    }

    public final boolean equals(Object obj) {
        Object c0472e;
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof C0487o)) {
                return false;
            }
            C0487o c0487o = (C0487o) obj;
            if (!this.f1627i.equals(c0487o.f1627i)) {
                return false;
            }
            Object c0472e2 = null;
            IBinder iBinder = this.f1626h;
            if (iBinder == null) {
                c0472e = null;
            } else {
                int i3 = AbstractBinderC0473a.f1567c;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                c0472e = iInterfaceQueryLocalInterface instanceof InterfaceC0478f ? (InterfaceC0478f) iInterfaceQueryLocalInterface : new C0472E(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            IBinder iBinder2 = c0487o.f1626h;
            if (iBinder2 != null) {
                int i4 = AbstractBinderC0473a.f1567c;
                IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                c0472e2 = iInterfaceQueryLocalInterface2 instanceof InterfaceC0478f ? (InterfaceC0478f) iInterfaceQueryLocalInterface2 : new C0472E(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            if (!AbstractC0491s.m1216h(c0472e, c0472e2)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3311d0(parcel, 1, 4);
        parcel.writeInt(this.f1625g);
        AbstractC1303m.m3295R(parcel, 2, this.f1626h);
        AbstractC1303m.m3298U(parcel, 3, this.f1627i, i3);
        AbstractC1303m.m3311d0(parcel, 4, 4);
        parcel.writeInt(this.f1628j ? 1 : 0);
        AbstractC1303m.m3311d0(parcel, 5, 4);
        parcel.writeInt(this.f1629k ? 1 : 0);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}

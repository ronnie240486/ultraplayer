package p019G1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.AbstractC1303m;
import p007C0.C0101a;
import p028J1.C0296b;
import p049Q1.AbstractC0512a;
import p063V1.BinderC0630b;
import p063V1.InterfaceC0629a;

/* JADX INFO: renamed from: G1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0226a extends AbstractC0512a {

    /* JADX INFO: renamed from: g */
    public final String f526g;

    /* JADX INFO: renamed from: h */
    public final String f527h;

    /* JADX INFO: renamed from: i */
    public final C0240o f528i;

    /* JADX INFO: renamed from: j */
    public final C0231f f529j;

    /* JADX INFO: renamed from: k */
    public final boolean f530k;

    /* JADX INFO: renamed from: l */
    public final boolean f531l;

    /* JADX INFO: renamed from: m */
    public static final C0296b f525m = new C0296b("CastMediaOptions", null);
    public static final Parcelable.Creator<C0226a> CREATOR = new C0101a(22);

    public C0226a(String str, String str2, IBinder iBinder, C0231f c0231f, boolean z3, boolean z4) {
        C0240o c0240o;
        this.f526g = str;
        this.f527h = str2;
        if (iBinder == null) {
            c0240o = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            c0240o = iInterfaceQueryLocalInterface instanceof C0240o ? (C0240o) iInterfaceQueryLocalInterface : new C0240o(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker", 2);
        }
        this.f528i = c0240o;
        this.f529j = c0231f;
        this.f530k = z3;
        this.f531l = z4;
    }

    /* JADX INFO: renamed from: e */
    public final void m715e() {
        C0240o c0240o = this.f528i;
        if (c0240o != null) {
            try {
                Parcel parcelM1895q0 = c0240o.m1895q0(c0240o.m1894e0(), 2);
                InterfaceC0629a interfaceC0629aM1558v0 = BinderC0630b.m1558v0(parcelM1895q0.readStrongBinder());
                parcelM1895q0.recycle();
                if (BinderC0630b.m1559w0(interfaceC0629aM1558v0) == null) {
                } else {
                    throw new ClassCastException();
                }
            } catch (RemoteException e3) {
                f525m.m830a(e3, "Unable to call %s on %s.", "getWrappedClientObject", C0240o.class.getSimpleName());
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3299V(parcel, 2, this.f526g);
        AbstractC1303m.m3299V(parcel, 3, this.f527h);
        C0240o c0240o = this.f528i;
        AbstractC1303m.m3295R(parcel, 4, c0240o == null ? null : c0240o.f3189c);
        AbstractC1303m.m3298U(parcel, 5, this.f529j, i3);
        AbstractC1303m.m3311d0(parcel, 6, 4);
        parcel.writeInt(this.f530k ? 1 : 0);
        AbstractC1303m.m3311d0(parcel, 7, 4);
        parcel.writeInt(this.f531l ? 1 : 0);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}

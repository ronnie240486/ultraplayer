package p076a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: a.d */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0788d extends Binder implements InterfaceC0786b {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f3198c = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0789e f3199b;

    public BinderC0788d(C0789e c0789e) {
        this.f3199b = c0789e;
        attachInterface(this, InterfaceC0786b.f3196a);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i4) {
        String str = InterfaceC0786b.f3196a;
        if (i3 >= 1 && i3 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i3 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i3 != 1) {
            return super.onTransact(i3, parcel, parcel2, i4);
        }
        this.f3199b.mo1900d(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}

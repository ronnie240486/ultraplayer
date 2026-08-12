package p079a2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import p013E1.RunnableC0121D;
import p040N1.BinderC0416A;
import p075Z1.AbstractC0781b;
import p094e2.C1527e;

/* JADX INFO: renamed from: a2.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0852a extends Binder implements IInterface {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3614b;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i3 = this.f3614b;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i4) {
        switch (this.f3614b) {
            case 0:
                if (i3 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i3, parcel, parcel2, i4)) {
                    return true;
                }
                return mo648u0(i3, parcel, parcel2);
            case 1:
                if (i3 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i3, parcel, parcel2, i4)) {
                    return true;
                }
                return mo648u0(i3, parcel, parcel2);
            default:
                if (i3 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i3, parcel, parcel2, i4)) {
                    return true;
                }
                switch (i3) {
                    case ModuleDescriptor.MODULE_VERSION /* 3 */:
                        AbstractC0781b.m1899b(parcel);
                        break;
                    case 4:
                        AbstractC0781b.m1899b(parcel);
                        break;
                    case 5:
                    default:
                        return false;
                    case 6:
                        AbstractC0781b.m1899b(parcel);
                        break;
                    case 7:
                        AbstractC0781b.m1899b(parcel);
                        break;
                    case 8:
                        C1527e c1527e = (C1527e) AbstractC0781b.m1898a(parcel, C1527e.CREATOR);
                        AbstractC0781b.m1899b(parcel);
                        BinderC0416A binderC0416A = (BinderC0416A) this;
                        binderC0416A.f1419d.post(new RunnableC0121D(binderC0416A, c1527e, 5, false));
                        break;
                    case 9:
                        AbstractC0781b.m1899b(parcel);
                        break;
                }
                parcel2.writeNoException();
                return true;
        }
    }

    /* JADX INFO: renamed from: u0 */
    public boolean mo648u0(int i3, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public AbstractBinderC0852a(int i3, String str) {
        this.f3614b = i3;
        switch (i3) {
            case 1:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }
}

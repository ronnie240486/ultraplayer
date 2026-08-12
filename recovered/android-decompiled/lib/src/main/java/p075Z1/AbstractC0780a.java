package p075Z1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: Z1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0780a implements IInterface {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3188b;

    /* JADX INFO: renamed from: c */
    public final IBinder f3189c;

    /* JADX INFO: renamed from: d */
    public final String f3190d;

    public /* synthetic */ AbstractC0780a(IBinder iBinder, String str, int i3) {
        this.f3188b = i3;
        this.f3189c = iBinder;
        this.f3190d = str;
    }

    /* JADX INFO: renamed from: P */
    public Parcel m1893P(Parcel parcel, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f3189c.transact(i3, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e3) {
                parcelObtain.recycle();
                throw e3;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f3188b) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f3189c;
    }

    /* JADX INFO: renamed from: e0 */
    public Parcel m1894e0() {
        switch (this.f3188b) {
            case 1:
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(this.f3190d);
                return parcelObtain;
            default:
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(this.f3190d);
                return parcelObtain2;
        }
    }

    /* JADX INFO: renamed from: q0 */
    public Parcel m1895q0(Parcel parcel, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f3189c.transact(i3, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e3) {
                parcelObtain.recycle();
                throw e3;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m1896u0(Parcel parcel, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f3189c.transact(i3, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m1897v0(Parcel parcel, int i3) {
        try {
            this.f3189c.transact(i3, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}

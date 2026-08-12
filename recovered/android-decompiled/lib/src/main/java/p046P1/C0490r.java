package p046P1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p024I0.C0271a;

/* JADX INFO: renamed from: P1.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0490r implements IInterface {

    /* JADX INFO: renamed from: b */
    public final IBinder f1636b;

    public C0490r(IBinder iBinder) {
        this.f1636b = iBinder;
    }

    /* JADX INFO: renamed from: P */
    public final void m1208P(BinderC0493u binderC0493u, C0477e c0477e) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(binderC0493u);
            parcelObtain.writeInt(1);
            C0271a.m816a(c0477e, parcelObtain, 0);
            this.f1636b.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f1636b;
    }
}

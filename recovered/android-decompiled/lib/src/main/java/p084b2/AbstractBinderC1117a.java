package p084b2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p063V1.BinderC0630b;
import p069X1.AbstractBinderC0699b;

/* JADX INFO: renamed from: b2.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC1117a extends Binder implements IInterface {
    @Override // android.os.Binder
    public boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i4) {
        if (i3 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i3, parcel, parcel2, i4)) {
            return true;
        }
        AbstractBinderC0699b abstractBinderC0699b = (AbstractBinderC0699b) this;
        if (i3 == 1) {
            abstractBinderC0699b.init(BinderC0630b.m1558v0(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
        if (i3 == 2) {
            String string = parcel.readString();
            int i5 = AbstractC1118b.f5176a;
            boolean booleanFlagValue = abstractBinderC0699b.getBooleanFlagValue(string, parcel.readInt() != 0, parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(booleanFlagValue ? 1 : 0);
            return true;
        }
        if (i3 == 3) {
            int intFlagValue = abstractBinderC0699b.getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(intFlagValue);
            return true;
        }
        if (i3 == 4) {
            long longFlagValue = abstractBinderC0699b.getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeLong(longFlagValue);
            return true;
        }
        if (i3 != 5) {
            return false;
        }
        String stringFlagValue = abstractBinderC0699b.getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
        parcel2.writeNoException();
        parcel2.writeString(stringFlagValue);
        return true;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}

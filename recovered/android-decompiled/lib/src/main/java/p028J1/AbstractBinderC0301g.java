package p028J1;

import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.cast.AbstractC1339v;
import p013E1.C0129d;
import p079a2.AbstractBinderC0852a;

/* JADX INFO: renamed from: J1.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0301g extends AbstractBinderC0852a implements InterfaceC0302h {
    public AbstractBinderC0301g() {
        super(1, "com.google.android.gms.cast.internal.ICastDeviceControllerListener");
    }

    @Override // p079a2.AbstractBinderC0852a
    /* JADX INFO: renamed from: u0 */
    public final boolean mo648u0(int i3, Parcel parcel, Parcel parcel2) {
        switch (i3) {
            case 1:
                int i4 = parcel.readInt();
                AbstractC1339v.m3420b(parcel);
                mo566F(i4);
                return true;
            case 2:
                C0129d c0129d = (C0129d) AbstractC1339v.m3419a(parcel, C0129d.CREATOR);
                String string = parcel.readString();
                String string2 = parcel.readString();
                boolean z3 = parcel.readInt() != 0;
                AbstractC1339v.m3420b(parcel);
                mo570a0(c0129d, string, string2, z3);
                return true;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                int i5 = parcel.readInt();
                AbstractC1339v.m3420b(parcel);
                mo569X(i5);
                return true;
            case 4:
                parcel.readString();
                parcel.readDouble();
                int i6 = AbstractC1339v.f5981a;
                parcel.readInt();
                AbstractC1339v.m3420b(parcel);
                mo575i();
                return true;
            case 5:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                AbstractC1339v.m3420b(parcel);
                mo567K(string3, string4);
                return true;
            case 6:
                String string5 = parcel.readString();
                byte[] bArrCreateByteArray = parcel.createByteArray();
                AbstractC1339v.m3420b(parcel);
                mo572d0(string5, bArrCreateByteArray);
                return true;
            case 7:
                int i7 = parcel.readInt();
                AbstractC1339v.m3420b(parcel);
                mo571d(i7);
                return true;
            case 8:
                int i8 = parcel.readInt();
                AbstractC1339v.m3420b(parcel);
                mo573f(i8);
                return true;
            case 9:
                int i9 = parcel.readInt();
                AbstractC1339v.m3420b(parcel);
                mo577k(i9);
                return true;
            case 10:
                parcel.readString();
                long j3 = parcel.readLong();
                int i10 = parcel.readInt();
                AbstractC1339v.m3420b(parcel);
                mo568S(i10, j3);
                return true;
            case 11:
                parcel.readString();
                long j4 = parcel.readLong();
                AbstractC1339v.m3420b(parcel);
                mo576j0(j4);
                return true;
            case 12:
                C0297c c0297c = (C0297c) AbstractC1339v.m3419a(parcel, C0297c.CREATOR);
                AbstractC1339v.m3420b(parcel);
                mo574h0(c0297c);
                return true;
            case 13:
                C0298d c0298d = (C0298d) AbstractC1339v.m3419a(parcel, C0298d.CREATOR);
                AbstractC1339v.m3420b(parcel);
                mo578m(c0298d);
                return true;
            case 14:
                int i11 = parcel.readInt();
                AbstractC1339v.m3420b(parcel);
                mo565D(i11);
                return true;
            case 15:
                int i12 = parcel.readInt();
                AbstractC1339v.m3420b(parcel);
                mo579y(i12);
                return true;
            default:
                return false;
        }
    }
}
